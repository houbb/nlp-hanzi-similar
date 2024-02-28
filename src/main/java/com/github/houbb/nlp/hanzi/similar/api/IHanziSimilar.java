package com.github.houbb.nlp.hanzi.similar.api;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public interface IHanziSimilar {

    /**
     * 相似度
     * @param similarContext 上下文
     * @return 结果
     * @since 1.0.0
     */
    double similar(final IHanziSimilarContext similarContext, String charOne, String charTwo);

}
