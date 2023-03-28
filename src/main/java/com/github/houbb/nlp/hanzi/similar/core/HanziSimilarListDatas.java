package com.github.houbb.nlp.hanzi.similar.core;

import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilarListData;

/**
 * 汉字相似列表实现
 * @since 1.3.0
 */
public final class HanziSimilarListDatas {

    private HanziSimilarListDatas(){}

    /**
     * 默认策略
     * @return 实现
     * @since 1.3.0
     */
    public static IHanziSimilarListData defaults() {
        return new HanziSimilarListData();
    }

}
