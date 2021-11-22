package com.github.houbb.nlp.hanzi.similar.util;

import com.github.houbb.nlp.hanzi.similar.bs.HanziSimilarBs;

/**
 * 汉字相似度工具类
 *
 * @author binbin.hou
 * @since 1.0.0
 */
public final class HanziSimilarHelper {

    private HanziSimilarHelper(){}

    /**
     * 相似度
     * @param hanziOne 汉字一
     * @param hanziTwo 汉字二
     * @return 结果
     */
    public static double similar(char hanziOne, char hanziTwo) {
        return HanziSimilarBs.newInstance().similar(hanziOne, hanziTwo);
    }

}
