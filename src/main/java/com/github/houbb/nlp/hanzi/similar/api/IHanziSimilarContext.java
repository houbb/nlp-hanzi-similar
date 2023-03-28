package com.github.houbb.nlp.hanzi.similar.api;

import java.util.Map;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public interface IHanziSimilarContext {

    /**
     * 第一个汉字
     * @return 汉字
     */
    String charOne();

    /**
     * 第二个汉字
     * @return 汉字
     */
    String charTwo();

    /**
     * 笔画相似度
     * @return 相似度
     */
    IHanziSimilar bihuashuSimilar();

    /**
     * 笔画数占比权重
     * @return 权重
     */
    double bihuashuRate();

    /**
     * 汉字结构相似度
     * @return 相似度
     */
    IHanziSimilar jiegouSimilar();

    /**
     * 结构占比权重
     * @return 权重
     */
    double jiegouRate();

    /**
     * 汉字部首相似度
     * @return 相似度
     */
    IHanziSimilar bushouSimilar();

    /**
     * 部首占比权重
     * @return 权重
     */
    double bushouRate();

    /**
     * 汉字四角编码相似度
     * @return 相似度
     */
    IHanziSimilar sijiaoSimilar();

    /**
     * 四角编码占比权重
     * @return 权重
     */
    double sijiaoRate();

    /**
     * 汉字拼音相似度
     * @return 相似度
     */
    IHanziSimilar pinyinSimilar();

    /**
     * 拼音占比权重
     * @return 权重
     */
    double pinyinRate();

    /**
     * 拆字相似度计算
     * @return 相似度计算
     */
    IHanziSimilar chaiziSimiar();

    /**
     * 拆字比例
     * @return 比例
     */
    double chaiziRate();

    /**
     * 用户自定义 数据
     * @return 数据
     */
    IHanziData<Double> userDefineData();

    /**
     * 笔画数 数据
     * @return 数据
     */
    IHanziData<Integer> bihuashuData();

    /**
     * 结构 数据
     * @return 数据
     */
    IHanziData<String> jiegouData();

    /**
     * 部首 数据
     * @return 数据
     */
    IHanziData<String> bushouData();

    /**
     * 四角编码 数据
     * @return 数据
     */
    IHanziData<String> sijiaoData();

    /**
     * 汉字相似度列表
     * @return 列表
     * @since 1.3.0
     */
    IHanziSimilarListData hanziSimilarListData();

}
