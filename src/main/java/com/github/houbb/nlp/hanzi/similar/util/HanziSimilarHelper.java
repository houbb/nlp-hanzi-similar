package com.github.houbb.nlp.hanzi.similar.util;

import com.github.houbb.nlp.hanzi.similar.bs.HanziSimilarBs;

import java.util.List;

/**
 * 汉字相似度工具类
 *
 * @author binbin.hou
 * @since 1.0.0
 */
public final class HanziSimilarHelper {

    private HanziSimilarHelper(){}

    /**
     * 默认实例
     * @since 1.4.0
     */
    private static final HanziSimilarBs DEFAULT_INSTANCE = HanziSimilarBs.newInstance().init();

    /**
     * 相似度
     * @param hanziOne 汉字一
     * @param hanziTwo 汉字二
     * @return 结果
     */
    public static double similar(char hanziOne, char hanziTwo) {
        return DEFAULT_INSTANCE.similar(hanziOne, hanziTwo);
    }

    /**
     * 相似的列表
     * @param hanziOne 汉字一
     * @param limit 大小
     * @return 结果
     * @since 1.3.0
     */
    public static List<String> similarList(char hanziOne, int limit) {
        return DEFAULT_INSTANCE.similarList(hanziOne, limit);
    }

    /**
     * 相似的列表
     * @param hanziOne 汉字一
     * @return 结果
     * @since 1.3.0
     */
    public static List<String> similarList(char hanziOne) {
        return similarList(hanziOne, 10);
    }

}
