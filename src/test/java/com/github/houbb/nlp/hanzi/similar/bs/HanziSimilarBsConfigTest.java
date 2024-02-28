package com.github.houbb.nlp.hanzi.similar.bs;

import com.github.houbb.nlp.hanzi.similar.constant.HanziSimilarRateConst;
import com.github.houbb.nlp.hanzi.similar.support.data.HanziSimilarDatas;
import com.github.houbb.nlp.hanzi.similar.support.similar.HanziSimilars;
import org.junit.Test;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public class HanziSimilarBsConfigTest {

    @Test
    public void simpleTest() {
        double rate = HanziSimilarBs.newInstance()
                // 笔画数数据
                .bihuashuData(HanziSimilarDatas.bihuashu())
                // 笔画数相似算法
                .bihuashuSimilar(HanziSimilars.bihuashu())
                // 笔画数权重
                .bihuashuRate(HanziSimilarRateConst.BIAHUASHU)

                // 结构数据
                .jiegouData(HanziSimilarDatas.jiegou())
                // 结构相似算法
                .jiegouSimilar(HanziSimilars.jiegou())
                // 结构权重
                .jiegouRate(HanziSimilarRateConst.JIEGOU)

                // 部首数据
                .bushouData(HanziSimilarDatas.bushou())
                // 部首相似算法
                .bushouSimilar(HanziSimilars.bushou())
                // 部首权重
                .bushouRate(HanziSimilarRateConst.BUSHOU)

                // 四角数据
                .sijiaoData(HanziSimilarDatas.sijiao())
                // 四角相似算法
                .sijiaoSimilar(HanziSimilars.sijiao())
                // 四角权重
                .sijiaoRate(HanziSimilarRateConst.SIJIAO)

                // 拼音权重
                .pinyinRate(HanziSimilarRateConst.PINYIN)
                // 拼音相似算法
                .pinyinSimilar(HanziSimilars.pinyin())

                // 拆字权重
                .chaiziRate(HanziSimilarRateConst.CHAIZI)
                // 拆字相似算法
                .chaiziSimilar(HanziSimilars.chaizi())
                // 初始化
                .init()

                .similar('末', '未');

        System.out.println(rate);
    }

}
