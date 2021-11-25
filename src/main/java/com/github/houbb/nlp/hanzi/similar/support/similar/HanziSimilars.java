package com.github.houbb.nlp.hanzi.similar.support.similar;

import com.github.houbb.heaven.support.instance.impl.Instances;
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
        return Instances.singleton(BihuashuSimilar.class);
    }

    /**
     * 部首
     * @return 实现
     */
    public static IHanziSimilar bushou() {
        return Instances.singleton(BushouSimilar.class);
    }

    /**
     * 结构
     * @return 实现
     */
    public static IHanziSimilar jiegou() {
        return Instances.singleton(JiegouSimilar.class);
    }

    /**
     * 拼音
     * @return 实现
     */
    public static IHanziSimilar pinyin() {
        return Instances.singleton(PinyinSimilar.class);
    }

    /**
     * 四角
     * @return 实现
     */
    public static IHanziSimilar sijiao() {
        return Instances.singleton(SijiaoSimilar.class);
    }

    /**
     * 拆字
     * @return 实现
     * @since 1.1.0
     */
    public static IHanziSimilar chaizi() {
        return Instances.singleton(ChaiziSimilar.class);
    }

}
