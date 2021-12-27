package com.gf.dspn.math1;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.UniformRealDistribution;

/**
 * .
 *
 * @author : doublej
 * @Date : 2021-12-20 14:36
 */

public class NormalDistributioTest {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            // 平均值接近13，可以在10的基础上上下浮动
            double nomal = new NormalDistribution(10, 3).sample();
            // 在3和10之间随机生成
            double uniFormReal = new UniformRealDistribution(3, 10).sample();
            System.out.println("nomal:"+nomal+"-->uniFormReal:"+uniFormReal);
        }
    }
}
