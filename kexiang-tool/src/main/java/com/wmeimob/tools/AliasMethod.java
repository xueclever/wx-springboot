package com.wmeimob.tools;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public final class AliasMethod implements Runnable {
    /* The random number generator used to sample from the distribution. */
    private final Random random;

    /* The probability and alias tables. */
    private final int[] alias;
    private final double[] probability;

    /**
     * Constructs a new AliasMethod to sample from a discrete distribution and
     * hand back outcomes based on the probability distribution.
     * <p/>
     * Given as input a list of probabilities corresponding to outcomes 0, 1,
     * ..., n - 1, this constructor creates the probability and alias tables
     * needed to efficiently sample from this distribution.
     *
     * @param probabilities The list of probabilities.
     */
    public AliasMethod(List<Double> probabilities) {
        this(probabilities, new Random());
    }

    /**
     * Constructs a new AliasMethod to sample from a discrete distribution and
     * hand back outcomes based on the probability distribution.
     * <p/>
     * Given as input a list of probabilities corresponding to outcomes 0, 1,
     * ..., n - 1, along with the random number generator that should be used
     * as the underlying generator, this constructor creates the probability
     * and alias tables needed to efficiently sample from this distribution.
     *
     * @param probabilities The list of probabilities.
     * @param random        The random number generator
     */
    public AliasMethod(List<Double> probabilities, Random random) {
        /* Begin by doing basic structural checks on the inputs. */
        if (probabilities == null || random == null)
            throw new NullPointerException();
        if (probabilities.size() == 0)
            throw new IllegalArgumentException("Probability vector must be nonempty.");

        /* Allocate space for the probability and alias tables. */
        probability = new double[probabilities.size()];
        alias = new int[probabilities.size()];
 
        /* Store the underlying generator. */
        this.random = random;
 
        /* Compute the average probability and cache it for later use. */
        final double average = 1.0 / probabilities.size();
 
        /* Make a copy of the probabilities list, since we will be making
         * changes to it.
         */
        probabilities = new ArrayList<Double>(probabilities);
 
        /* Create two stacks to act as worklists as we populate the tables. */
        Deque<Integer> small = new ArrayDeque<Integer>();
        Deque<Integer> large = new ArrayDeque<Integer>();
 
        /* Populate the stacks with the input probabilities. */
        for (int i = 0; i < probabilities.size(); ++i) {
            /* If the probability is below the average probability, then we add
             * it to the small list; otherwise we add it to the large list.
             */
            if (probabilities.get(i) >= average)
                large.add(i);
            else
                small.add(i);
        }
 
        /* As a note: in the mathematical specification of the algorithm, we
         * will always exhaust the small list before the big list.  However,
         * due to floating point inaccuracies, this is not necessarily true.
         * Consequently, this inner loop (which tries to pair small and large
         * elements) will have to check that both lists aren't empty.
         */
        while (!small.isEmpty() && !large.isEmpty()) {
            /* Get the index of the small and the large probabilities. */
            int less = small.removeLast();
            int more = large.removeLast();
 
            /* These probabilities have not yet been scaled up to be such that
             * 1/n is given weight 1.0.  We do this here instead.
             */
            probability[less] = probabilities.get(less) * probabilities.size();
            alias[less] = more;
 
            /* Decrease the probability of the larger one by the appropriate
             * amount.
             */
            probabilities.set(more, (probabilities.get(more) + probabilities.get(less)) - average);
 
            /* If the new probability is less than the average, add it into the
             * small list; otherwise add it to the large list.
             */
            if (probabilities.get(more) >= 1.0 / probabilities.size())
                large.add(more);
            else
                small.add(more);
        }

        /* At this point, everything is in one list, which means that the
         * remaining probabilities should all be 1/n.  Based on this, set them
         * appropriately.  Due to numerical issues, we can't be sure which
         * stack will hold the entries, so we empty both.
         */
        while (!small.isEmpty())
            probability[small.removeLast()] = 1.0;
        while (!large.isEmpty())
            probability[large.removeLast()] = 1.0;
    }

    /**
     * Samples a value from the underlying distribution.
     *
     * @return A random value sampled from the underlying distribution.
     */
    public int next() {
        /* Generate a fair die roll to determine which column to inspect. */
        int column = random.nextInt(probability.length);
 
        /* Generate a biased coin toss to determine which option to pick. */
        boolean coinToss = random.nextDouble() < probability[column];
 
        /* Based on the outcome, return either the column or its alias. */
       /* Log.i("1234","column="+column);
        Log.i("1234","coinToss="+coinToss);
        Log.i("1234","alias[column]="+coinToss);*/
        return coinToss ? column : alias[column];
    }


    /**
     * 抽奖
     *
     * @param map 抽奖id，概率
     * @return key
     */
    public static Integer get(TreeMap<Integer, Double> map) {
        BigDecimal sum = new BigDecimal(0);
        TreeMap<Integer, Double> result = new TreeMap<>(map);
        for (Integer integer : map.keySet()) {
            BigDecimal prob = new BigDecimal(map.get(integer));
            prob = prob.setScale(12, BigDecimal.ROUND_HALF_DOWN);
            if (prob.doubleValue() == 0) {
                result.remove(integer);
            } else {
                sum = sum.add(prob);
            }
        }
        if (sum.doubleValue() != 1)
            System.out.println("warning==>> Probability sum is not 1");
//            throw new IllegalArgumentException("Probability sum is not 1");
        //初始化抽奖
        List<Double> list = new ArrayList<>(result.values());
        List<Integer> gifts = new ArrayList<>(result.keySet());
        AliasMethod aliasMethod = new AliasMethod(list);
        int index = aliasMethod.next();
        //获取奖品id
        Integer key = gifts.get(index);
        return key;
    }

    public static void main(String[] args) throws InterruptedException {

//        TreeMap<String, Double> map = new TreeMap<String, Double>();
//        map.put("台湾游", 0.0000006);
//        map.put("苹果产品 IPAD MINI4", 0.0000012);
//        map.put("迪士尼2日游门票", 0.0000044 );
//        map.put("永和微信红包", 0.4411737);
//        map.put("代金券",1-0.0000006-0.0000012-0.0000044-0.4411737);

        int count = 15000;
        Map<String, Double> map = new HashMap<>();
//        map.put("未来战士-伊泽瑞尔", 0.01);
//        map.put("哥特萝莉-安妮", 0.05);
//        map.put("五杀摇滚乐队-卡尔萨斯", 0.05);
//        map.put("女校长-菲奥娜", 0.1);
//        map.put("约德尔人的一大步-提莫",0.2);
//
//        map.put("蔷薇绅士-杰斯", 0.09);
//        map.put("未中奖", 0.5);
        map.put("未来战士-伊泽瑞尔", 0.1);
        map.put("哥特萝莉-安妮", 0.2);
        map.put("五杀摇滚乐队-卡尔萨斯", 0.3);
        map.put("女校长-菲奥娜", 0.4);


        List<Double> list = new ArrayList<Double>(map.values());
        gifts = new ArrayList<String>(map.keySet());
        method = new AliasMethod(list);
        for (int i = 0; i < count; ++i) {
//            Thread thread = new Thread(method);
//            thread.start();
            method.run();
        }

        System.out.println(count + "次实验结果");
        for (String key : resultMap.keySet()) {
            System.out.println(key + "：" + resultMap.get(key) + "次，预设概率：" + map.get(key) + "，实际概率：" + new BigDecimal(resultMap.get(key).doubleValue() / count));
        }
    }

    private static Map<String, AtomicInteger> resultMap = new HashMap<String, AtomicInteger>();
    private static AliasMethod method;
    private static List<String> gifts;


    @Override
    public void run() {
        int index = method.next();
        String key = gifts.get(index);
        if (!resultMap.containsKey(key)) {
            resultMap.put(key, new AtomicInteger());
        }
        resultMap.get(key).incrementAndGet();

    }
}