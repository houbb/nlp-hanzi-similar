package com.github.houbb.nlp.hanzi.similar.bs;

import com.github.houbb.heaven.support.instance.impl.Instances;
import com.github.houbb.heaven.util.common.ArgUtil;
import com.github.houbb.nlp.hanzi.similar.api.IHanziData;
import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilar;
import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilarContext;
import com.github.houbb.nlp.hanzi.similar.constant.HanziSimilarRateConst;
import com.github.houbb.nlp.hanzi.similar.core.HanziSimilar;
import com.github.houbb.nlp.hanzi.similar.support.data.HanziSimilarDatas;
import com.github.houbb.nlp.hanzi.similar.support.similar.HanziSimilarContext;
import com.github.houbb.nlp.hanzi.similar.support.similar.HanziSimilars;

/**
 * 引导类
 *
 * @author binbin.hou
 * @since 1.0.0
 */
public final class HanziSimilarBs {

    private HanziSimilarBs(){}

    public static HanziSimilarBs newInstance() {
        return new HanziSimilarBs();
    }

    /**
     * 笔画数占比
     */
    private double bihuashuRate = HanziSimilarRateConst.BIAHUASHU;

    /**
     * 笔画数数据
     */
    private IHanziData<Integer> bihuashuData = HanziSimilarDatas.bihuashu();

    /**
     * 笔画数相似度实现
     */
    private IHanziSimilar bihuashuSimilar = HanziSimilars.bihuashu();

    /**
     * 结构占比
     */
    private double jiegouRate = HanziSimilarRateConst.JIEGOU;

    /**
     * 结构数据
     */
    private IHanziData<String> jiegouData = HanziSimilarDatas.jiegou();

    /**
     * 结构相似度实现
     */
    private IHanziSimilar jiegouSimilar = HanziSimilars.jiegou();

    /**
     * 部首占比
     */
    private double bushouRate = HanziSimilarRateConst.BUSHOU;

    /**
     * 部首数据
     */
    private IHanziData<String> bushouData = HanziSimilarDatas.bushou();

    /**
     * 部首相似度实现
     */
    private IHanziSimilar bushouSimilar = HanziSimilars.bushou();

    /**
     * 四角编码占比
     */
    private double sijiaoRate = HanziSimilarRateConst.SIJIAO;

    /**
     * 四角编码数据
     */
    private IHanziData<String> sijiaoData = HanziSimilarDatas.sijiao();

    /**
     * 四角编码相似度实现
     */
    private IHanziSimilar sijiaoSimilar = HanziSimilars.sijiao();

    /**
     * 拼音占比
     */
    private double pinyinRate = HanziSimilarRateConst.PINYIN;

    /**
     * 拼音相似度实现
     */
    private IHanziSimilar pinyinSimilar = HanziSimilars.pinyin();

    /**
     * 核心实现
     */
    private IHanziSimilar hanziSimilar = Instances.singleton(HanziSimilar.class);

    /**
     * 用户自定义的数据
     */
    private IHanziData<Double> userDefineData = HanziSimilarDatas.userDefine();

    public HanziSimilarBs bihuashuRate(double bihuashuRate) {
        ArgUtil.notNegative(bihuashuRate, "bihuashuRate");
        this.bihuashuRate = bihuashuRate;
        return this;
    }

    public HanziSimilarBs bihuashuData(IHanziData<Integer> bihuashuData) {
        this.bihuashuData = bihuashuData;
        return this;
    }

    public HanziSimilarBs bihuashuSimilar(IHanziSimilar bihuashuSimilar) {
        this.bihuashuSimilar = bihuashuSimilar;
        return this;
    }

    public HanziSimilarBs jiegouRate(double jiegouRate) {
        ArgUtil.notNegative(jiegouRate, "jiegouRate");
        this.jiegouRate = jiegouRate;
        return this;
    }

    public HanziSimilarBs jiegouData(IHanziData<String> jiegouData) {
        this.jiegouData = jiegouData;
        return this;
    }

    public HanziSimilarBs jiegouSimilar(IHanziSimilar jiegouSimilar) {
        this.jiegouSimilar = jiegouSimilar;
        return this;
    }

    public HanziSimilarBs bushouRate(double bushouRate) {
        ArgUtil.notNegative(bushouRate, "bushouRate");

        this.bushouRate = bushouRate;
        return this;
    }

    public HanziSimilarBs bushouData(IHanziData<String> bushouData) {
        this.bushouData = bushouData;
        return this;
    }

    public HanziSimilarBs bushouSimilar(IHanziSimilar bushouSimilar) {
        this.bushouSimilar = bushouSimilar;
        return this;
    }

    public HanziSimilarBs sijiaoRate(double sijiaoRate) {
        ArgUtil.notNegative(sijiaoRate, "sijiaoRate");

        this.sijiaoRate = sijiaoRate;
        return this;
    }

    public HanziSimilarBs sijiaoData(IHanziData<String> sijiaoData) {
        this.sijiaoData = sijiaoData;
        return this;
    }

    public HanziSimilarBs sijiaoSimilar(IHanziSimilar sijiaoSimilar) {
        this.sijiaoSimilar = sijiaoSimilar;
        return this;
    }

    public HanziSimilarBs pinyinRate(double pinyinRate) {
        ArgUtil.notNegative(pinyinRate, "pinyinRate");

        this.pinyinRate = pinyinRate;
        return this;
    }

    public HanziSimilarBs pinyinSimilar(IHanziSimilar pinyinSimilar) {
        this.pinyinSimilar = pinyinSimilar;
        return this;
    }

    public HanziSimilarBs hanziSimilar(IHanziSimilar hanziSimilar) {
        this.hanziSimilar = hanziSimilar;
        return this;
    }

    public HanziSimilarBs userDefineData(IHanziData<Double> userDefineData) {
        this.userDefineData = userDefineData;
        return this;
    }

    /**
     * 相似度
     * @param one 第一个
     * @param two 第二个
     * @return 结果
     */
    public double similar(char one, char two) {
        IHanziSimilarContext context = buildContext(one, two);
        return hanziSimilar.similar(context);
    }

    private IHanziSimilarContext buildContext(char one, char two) {
        HanziSimilarContext context = new HanziSimilarContext();
        context.charOne(one+"")
                .charTwo(two+"")
                .userDefineData(userDefineData)
                .bihuashuData(bihuashuData)
                .bihuashuSimilar(bihuashuSimilar)
                .bihuashuRate(bihuashuRate)
                .jiegouData(jiegouData)
                .jiegouRate(jiegouRate)
                .jiegouSimilar(jiegouSimilar)
                .bushouData(bushouData)
                .bushouSimilar(bushouSimilar)
                .bushouRate(bushouRate)
                .sijiaoData(sijiaoData)
                .sijiaoRate(sijiaoRate)
                .sijiaoSimilar(sijiaoSimilar)
                .pinyinRate(pinyinRate)
                .pinyinSimilar(pinyinSimilar);

        return context;
    }

}
