package com.wmeimob.tools;

import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiangzhao on 2016/8/10.
 */
public class SpringRedisUtil {

    @SuppressWarnings("unchecked")
    private static RedisTemplate<Serializable, Serializable> redisTemplate =
            (RedisTemplate<Serializable, Serializable>) SpringHelper
                    .getBean("redisTemplate");

    public static void save(final String key, Object value, Long timeout) {
        final byte[] vbytes = SerializeUtil.serialize(value);
        if (timeout != null)
            redisTemplate.opsForValue().set(key, vbytes, timeout, TimeUnit.MILLISECONDS);//毫秒数
        else
            redisTemplate.opsForValue().set(key, vbytes);
    }

    public static <T> T get(final String key) {
        byte[] bytes = (byte[]) redisTemplate.opsForValue().get(key);
        if(bytes==null)return null;
        Object object = SerializeUtil.unserialize(bytes);
//        return (T) redisTemplate.getDefaultSerializer().deserialize(object);
        return (T) object;
    }

    public static void delete(String key) {
        redisTemplate.delete(key);
    }

    public static long getExpire(String key) {
        return redisTemplate.getExpire(key);
    }

    public static  <T> T deleteAndGet(final String key){
        T t = get(key);
        delete(key);
        return t;
    }
}
