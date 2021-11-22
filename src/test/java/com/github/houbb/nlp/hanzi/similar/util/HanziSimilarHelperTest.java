package com.github.houbb.nlp.hanzi.similar.util;

import org.junit.Test;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public class HanziSimilarHelperTest {

    @Test
    public void similarTest() {
        double rate1 = HanziSimilarHelper.similar('末', '未');
        double rate2 = HanziSimilarHelper.similar('末', '木');
        double rate3 = HanziSimilarHelper.similar('末', '来');
        double rate4 = HanziSimilarHelper.similar('米', '来');

        System.out.println(rate1);
        System.out.println(rate2);
        System.out.println(rate3);
        System.out.println(rate4);
    }

    @Test
    public void userDefineTest() {
        double rate = HanziSimilarHelper.similar('人', '入');
        System.out.println(rate);
    }

}