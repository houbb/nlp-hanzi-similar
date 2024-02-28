package com.github.houbb.nlp.hanzi.similar.support.similar;

import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilar;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public final class HanziSimilars {

    private HanziSimilars(){}

    /**
     * 笔画数
     * @return 实现
     */
    public static IHanziSimilar bihuashu() {
        return new BihuashuSimilar();
    }

    /**
     * 部首
     * @return 实现
     */
    public static IHanziSimilar bushou() {
        return new BushouSimilar();
    }

    /**
     * 结构
     * @return 实现
     */
    public static IHanziSimilar jiegou() {
        return new JiegouSimilar();
    }

    /**
     * 拼音
     * @return 实现
     */
    public static IHanziSimilar pinyin() {
        return new PinyinSimilar();
    }

    /**
     * 四角
     * @return 实现
     */
    public static IHanziSimilar sijiao() {
        return new SijiaoSimilar();
    }

    /**
     * 拆字
     * @return 实现
     * @since 1.1.0
     */
    public static IHanziSimilar chaizi() {
        return new ChaiziSimilar();
    }

}
