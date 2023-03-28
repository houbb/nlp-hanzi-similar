package com.github.houbb.nlp.hanzi.similar.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public class HanziSimilarHelperTest {

    @Test
    public void helloTest() {
        double rate1 = HanziSimilarHelper.similar('末', '未');
        System.out.println(rate1);
    }

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

    @Test
    public void test() {
        //[月丷夫马言卂]
        System.out.println(ChaiziHelper.chai("腾讯的微信"));
    }

    @Test
    public void similarListTest() {
        List<String> list = HanziSimilarHelper.similarList('爱');
        Assert.assertEquals("[爰, 爯, 受, 爭, 妥, 憂, 李, 爳, 叐, 雙]", list.toString());
    }

}
