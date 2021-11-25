package com.github.houbb.nlp.hanzi.similar.bs;

import org.junit.Test;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public class HanziSimilarBsTest {

    @Test
    public void simpleTest() {
        double rate = HanziSimilarBs.newInstance()
                .jiegouRate(10)
                .sijiaoRate(8)
                .bushouRate(6)
                .bihuashuRate(2)
                .pinyinRate(1)
                .chaiziRate(8)
                .similar('末', '未');

        System.out.println(rate);
    }

}
