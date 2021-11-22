package com.github.houbb.nlp.hanzi.similar.core;

import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilar;
import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilarContext;

import java.util.Map;

/**
 * 汉字相似度算法核心实现
 * @author binbin.hou
 * @since 1.0.0
 */
public class HanziSimilar implements IHanziSimilar {

    /**
     * 相似度
     *
     * @param context 上下文
     * @return 结果
     * @since 1.0.0
     */
    @Override
    public double similar(final IHanziSimilarContext context) {
        final String charOne = context.charOne();
        final String charTwo = context.charTwo();

        //1. 是否相同
        if(charOne.equals(charTwo)) {
            return 1.0;
        }

        //2. 是否用户自定义
        Map<String, Double> defineMap = context.userDefineData().dataMap();
        String defineKey = charOne+charTwo;
        if(defineMap.containsKey(defineKey)) {
            return defineMap.get(defineKey);
        }

        //3. 通过权重计算获取
        //3.1 四角编码
        IHanziSimilar sijiaoSimilar = context.sijiaoSimilar();
        double sijiaoScore = sijiaoSimilar.similar(context);

        //3.2 结构
        IHanziSimilar jiegouSimilar = context.jiegouSimilar();
        double jiegouScore = jiegouSimilar.similar(context);

        //3.3 部首
        IHanziSimilar bushouSimilar = context.bushouSimilar();
        double bushouScore = bushouSimilar.similar(context);

        //3.4 笔画
        IHanziSimilar biahuashuSimilar = context.bihuashuSimilar();
        double bihuashuScore = biahuashuSimilar.similar(context);

        //3.5 拼音
        IHanziSimilar pinyinSimilar = context.pinyinSimilar();
        double pinyinScore = pinyinSimilar.similar(context);

        //4. 计算总分
        double totalScore = sijiaoScore + jiegouScore + bushouScore + bihuashuScore + pinyinScore;
        //4.1 避免浮点数比较问题
        if(totalScore <= 0) {
            return 0;
        }

        //4.2 正则化
        double limitScore = context.sijiaoRate() + context.jiegouRate()
                + context.bushouRate() + context.bihuashuRate() + context.pinyinRate();

        return totalScore / limitScore;
    }

}
