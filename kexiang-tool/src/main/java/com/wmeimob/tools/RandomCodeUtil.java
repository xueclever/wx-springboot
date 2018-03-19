package com.wmeimob.tools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Shinez on 2016/10/17.
 */
public class RandomCodeUtil {

    private static Logger logger = LoggerFactory.getLogger(RandomCodeUtil.class);

    private final static int UUID_MAX_VALUE = 0xF;

    private static int reBuildCount = 0;

    private final static String RAND_STR="23456789ABCDEFGH23456789JKLMNPQR23456789STUVWXYZ";
    private final static String RAND_NUM="0123456789";

    public static void main(String[] args) {
        System.out.println(randCode(20));
    }

    public static String randCode(int length) {
        for (String set : randCode(length, 1)) {
            return set;
        }
        return null;
    }

    public static String randCodeNum(int length) {
        for (String set : randCodeNum(length, 1)) {
            return set;
        }
        return null;
    }

    public static Set<String> randCode(int length, int srcCount) {
        return randCode(length, srcCount, srcCount, null);
    }

    public static Set<String> randCodeNum(int length, int srcCount){
        return randCodeNum(length, srcCount, srcCount, null);
    }


    //32 + 24 = 56
    //                   0123456789......16............ 31.....................55

    private static Set<String> randCode(int length, int srcCount, int count, Set<String> srcSet) {
        return randCode(RAND_STR,length,  srcCount,  count, srcSet);
    }

    private static Set<String> randCodeNum(int length, int srcCount, int count, Set<String> srcSet){
        return randCode(RAND_NUM,length,  srcCount,  count, srcSet);
    }

    private static Set<String> randCode(final String randStr,final int length, final int srcCount, final int count, Set<String> srcSet) {

        String[] randArr = randStr.split("");
        if (length > 32 || length < 1) {
            logger.error("密文长度最大值为32，最小值为1");
            System.exit(0);
        }
        if (Math.pow(randArr.length, length) < srcCount) {
            logger.error("当前位数最多只能生成" + (int) Math.pow(randArr.length, length) + "个,请修改。");
            System.exit(0);
        } else if (srcCount == count) {
            logger.debug("准备生成...\n总个数：" + srcCount + "\n命中率：" + (srcCount / Math.pow(randArr.length, length)));
            if ((srcCount / Math.pow(randArr.length, length)) > 0.0001 && srcCount != 1)
                logger.debug("警告：当前命中率大于1/10000>>>>");
        }

        logger.debug("开始生成...");
        logger.debug("0%>>>");
        if (srcSet == null)
            srcSet = new HashSet<>();
        int c = 1;
        while (c <= count) {
            int uuidCount = 0;
            //下标数组
            int[] indexArray = new int[length];
            //根据密码字典长度构建下标数组
            while (uuidCount < randArr.length / UUID_MAX_VALUE + 1) {
                String uuid = UUID.randomUUID().toString().replace("-", "");
                String[] uuidArr = uuid.split("");
                int i = 0;
                while (i < indexArray.length) {
                    indexArray[i] = indexArray[i] + Integer.parseUnsignedInt(uuidArr[i], 16);//单个迭代范围 0-15
                    indexArray[i] %= randArr.length;
                    ++i;
                }
                ++uuidCount;
            }
            StringBuilder sb = new StringBuilder("");
            int j = 0;
            while (j < length) {
                sb.append(randArr[indexArray[j]]);
                ++j;
            }

            logger.debug(c + ">>" + sb.toString());
            srcSet.add(sb.toString());

            double per = ((double) c / count);
            if ((per * 100) % 8 == 0.0) {
                logger.debug(+(int) (per * 100) + "%>>>");
            }
            ++c;
        }
        logger.debug("100%.");
        if (srcSet.size() < srcCount) {
            ++reBuildCount;
            logger.debug(">>>第" + reBuildCount + "轮重新生成：");
            logger.debug("开始" + (srcCount - srcSet.size()) + "个重新生成");
            randCode(length, srcCount, (srcCount - srcSet.size()), srcSet);
            logger.debug("<<<<");
        } else {
            logger.debug("生成完毕!");
        }
        return srcSet;
    }

    public static String addRegex(String srcStr, String regex, int length) {
        String[] charArr = srcStr.split("");
        StringBuilder sb = new StringBuilder("");
        int i = 1;
        while (i <= charArr.length) {
            sb.append(charArr[i - 1]);
            if (i > 0 && i % length == 0) {
                sb.append(regex);
            }
            ++i;
        }
        char lastChar = sb.charAt(sb.length()-1);
        int lastIndex=sb.length();
        if (regex.length()>0&&regex.charAt(0)==lastChar){
            lastIndex=  sb.length()-1;
        }
        return sb.toString().substring(0, lastIndex);
    }

}
