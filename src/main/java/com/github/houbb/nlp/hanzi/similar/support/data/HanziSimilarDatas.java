package com.github.houbb.nlp.hanzi.similar.support.data;

import com.github.houbb.heaven.support.instance.impl.Instances;
import com.github.houbb.nlp.hanzi.similar.api.IHanziData;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public final class HanziSimilarDatas {

    private HanziSimilarDatas(){}

    /**
     * 笔画数
     * @return 实现
     */
    public static IHanziData<Integer> bihuashu() {
        return Instances.singleton(BihuashuData.class);
    }

    /**
     * 部首
     * @return 实现
     */
    public static IHanziData<String> bushou() {
        return Instances.singleton(BushouData.class);
    }

    /**
     * 结构
     * @return 实现
     */
    public static IHanziData<String> jiegou() {
        return Instances.singleton(JiegouData.class);
    }

    /**
     * 四角
     * @return 实现
     */
    public static IHanziData<String> sijiao() {
        return Instances.singleton(SijiaoData.class);
    }

    /**
     * 用户自定义
     * @return 实现
     */
    public static IHanziData<Double> userDefine() {
        return Instances.singleton(UserDefineData.class);
    }

}
