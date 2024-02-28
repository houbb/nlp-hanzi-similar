package com.github.houbb.nlp.hanzi.similar.support.similar;

import com.github.houbb.nlp.hanzi.similar.api.IHanziData;
import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilar;
import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilarContext;
import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilarListData;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public class HanziSimilarContext implements IHanziSimilarContext {

    /**
     * 字符 1
     */
    @Deprecated
    private String charOne;

    /**
     * 字符 2
     */
    @Deprecated
    private String charTwo;

    /**
     * 用户自定义的数据
     */
    private IHanziData<Double> userDefineData;

    /**
     * 笔画数占比
     */
    private double bihuashuRate;

    /**
     * 笔画数数据
     */
    private IHanziData<Integer> bihuashuData;

    /**
     * 笔画数相似度实现
     */
    private IHanziSimilar bihuashuSimilar;

    /**
     * 结构占比
     */
    private double jiegouRate;

    /**
     * 结构数据
     */
    private IHanziData<String> jiegouData;

    /**
     * 结构相似度实现
     */
    private IHanziSimilar jiegouSimilar;

    /**
     * 部首占比
     */
    private double bushouRate;

    /**
     * 部首数据
     */
    private IHanziData<String> bushouData;

    /**
     * 部首相似度实现
     */
    private IHanziSimilar bushouSimilar;

    /**
     * 四角编码占比
     */
    private double sijiaoRate;

    /**
     * 四角编码数据
     */
    private IHanziData<String> sijiaoData;

    /**
     * 四角编码相似度实现
     */
    private IHanziSimilar sijiaoSimilar;

    /**
     * 拼音占比
     */
    private double pinyinRate;

    /**
     * 拼音相似度实现
     */
    private IHanziSimilar pinyinSimilar;

    /**
     * 拆字相似度计算
     */
    private IHanziSimilar chaiziSimiar;

    /**
     * 拆字比例
     */
    private double chaiziRate;

    /**
     * 相似度列表
     * @since 1.3.0
     */
    private IHanziSimilarListData hanziSimilarListData;

    @Override
    public IHanziSimilarListData hanziSimilarListData() {
        return hanziSimilarListData;
    }

    public HanziSimilarContext hanziSimilarListData(IHanziSimilarListData hanziSimilarListData) {
        this.hanziSimilarListData = hanziSimilarListData;
        return this;
    }

    @Override
    public String charOne() {
        return charOne;
    }

    public HanziSimilarContext charOne(String charOne) {
        this.charOne = charOne;
        return this;
    }

    @Override
    public String charTwo() {
        return charTwo;
    }

    public HanziSimilarContext charTwo(String charTwo) {
        this.charTwo = charTwo;
        return this;
    }

    @Override
    public IHanziData<Double> userDefineData() {
        return userDefineData;
    }

    public HanziSimilarContext userDefineData(IHanziData<Double> userDefineData) {
        this.userDefineData = userDefineData;
        return this;
    }

    @Override
    public double bihuashuRate() {
        return bihuashuRate;
    }

    public HanziSimilarContext bihuashuRate(double bihuashuRate) {
        this.bihuashuRate = bihuashuRate;
        return this;
    }

    @Override
    public IHanziData<Integer> bihuashuData() {
        return bihuashuData;
    }

    public HanziSimilarContext bihuashuData(IHanziData<Integer> bihuashuData) {
        this.bihuashuData = bihuashuData;
        return this;
    }

    @Override
    public IHanziSimilar bihuashuSimilar() {
        return bihuashuSimilar;
    }

    public HanziSimilarContext bihuashuSimilar(IHanziSimilar bihuashuSimilar) {
        this.bihuashuSimilar = bihuashuSimilar;
        return this;
    }

    @Override
    public double jiegouRate() {
        return jiegouRate;
    }

    public HanziSimilarContext jiegouRate(double jiegouRate) {
        this.jiegouRate = jiegouRate;
        return this;
    }

    @Override
    public IHanziData<String> jiegouData() {
        return jiegouData;
    }

    public HanziSimilarContext jiegouData(IHanziData<String> jiegouData) {
        this.jiegouData = jiegouData;
        return this;
    }

    @Override
    public IHanziSimilar jiegouSimilar() {
        return jiegouSimilar;
    }

    public HanziSimilarContext jiegouSimilar(IHanziSimilar jiegouSimilar) {
        this.jiegouSimilar = jiegouSimilar;
        return this;
    }

    @Override
    public double bushouRate() {
        return bushouRate;
    }

    public HanziSimilarContext bushouRate(double bushouRate) {
        this.bushouRate = bushouRate;
        return this;
    }

    @Override
    public IHanziData<String> bushouData() {
        return bushouData;
    }

    public HanziSimilarContext bushouData(IHanziData<String> bushouData) {
        this.bushouData = bushouData;
        return this;
    }

    @Override
    public IHanziSimilar bushouSimilar() {
        return bushouSimilar;
    }

    public HanziSimilarContext bushouSimilar(IHanziSimilar bushouSimilar) {
        this.bushouSimilar = bushouSimilar;
        return this;
    }

    @Override
    public double sijiaoRate() {
        return sijiaoRate;
    }

    public HanziSimilarContext sijiaoRate(double sijiaoRate) {
        this.sijiaoRate = sijiaoRate;
        return this;
    }

    @Override
    public IHanziData<String> sijiaoData() {
        return sijiaoData;
    }

    public HanziSimilarContext sijiaoData(IHanziData<String> sijiaoData) {
        this.sijiaoData = sijiaoData;
        return this;
    }

    @Override
    public IHanziSimilar sijiaoSimilar() {
        return sijiaoSimilar;
    }

    public HanziSimilarContext sijiaoSimilar(IHanziSimilar sijiaoSimilar) {
        this.sijiaoSimilar = sijiaoSimilar;
        return this;
    }

    @Override
    public double pinyinRate() {
        return pinyinRate;
    }

    public HanziSimilarContext pinyinRate(double pinyinRate) {
        this.pinyinRate = pinyinRate;
        return this;
    }

    @Override
    public IHanziSimilar pinyinSimilar() {
        return pinyinSimilar;
    }

    public HanziSimilarContext pinyinSimilar(IHanziSimilar pinyinSimilar) {
        this.pinyinSimilar = pinyinSimilar;
        return this;
    }

    @Override
    public IHanziSimilar chaiziSimiar() {
        return chaiziSimiar;
    }

    public HanziSimilarContext chaiziSimiar(IHanziSimilar chaiziSimiar) {
        this.chaiziSimiar = chaiziSimiar;
        return this;
    }

    @Override
    public double chaiziRate() {
        return chaiziRate;
    }

    public HanziSimilarContext chaiziRate(double chaiziRate) {
        this.chaiziRate = chaiziRate;
        return this;
    }
}
