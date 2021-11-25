package com.github.houbb.nlp.hanzi.similar.support.similar;

import com.github.houbb.heaven.util.util.ArrayPrimitiveUtil;
import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilar;
import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilarContext;
import com.github.houbb.nlp.hanzi.similar.util.ChaiziHelper;

import java.util.List;
import java.util.Map;

/**
 * 拆字
 *
 * A = {A1, A2, ..., Am}
 * B = {B1, B2, ..., Bm}
 *
 * 每一个组成部分都有对应的笔画数（没有默认取1），所以有对应的权重。
 *
 * 得分应该如何计算呢？
 *
 * 长度：min(A, B) = m_AB
 * 然后遍历，遍历元素。比如以 A 为准。
 *
 * A1 和 B1 相同，score_1 = A1_n/A_n + B1_n/B_n;
 *
 * 如何归一化？
 *
 * @author binbin.hou
 * @since 1.0.0
 */
public class ChaiziSimilar implements IHanziSimilar {

    @Override
    public double similar(IHanziSimilarContext similarContext) {
        String hanziOne = similarContext.charOne();
        String hanziTwo = similarContext.charTwo();

        int numberOne = getNumber(hanziOne, similarContext);
        int numberTwo = getNumber(hanziTwo, similarContext);

        // 拆分
        char[] charsOne = getSplitChars(hanziOne);
        char[] charsTwo = getSplitChars(hanziTwo);

        int minLen = Math.min(charsOne.length, charsTwo.length);

        // 比较
        double totalScore = 0.0;
        for(int i = 0; i <  minLen; i++) {
            char iChar = charsOne[i];
            String textChar = iChar+"";
            if(ArrayPrimitiveUtil.contains(charsTwo, iChar)) {
                int textNumber = getNumber(textChar, similarContext);

                double scoreOne = textNumber*1.0 / numberOne * 1.0;
                double scoreTwo = textNumber*1.0 / numberTwo * 1.0;

                totalScore += (scoreOne + scoreTwo) / 2.0;
            }
        }

        return totalScore * similarContext.chaiziRate();
    }

    /**
     * 获取拆分后对应的拆分字符
     * @param charWord 字符
     * @return 结果
     */
    private char[] getSplitChars(String charWord) {
        List<String> stringList = ChaiziHelper.chai(charWord.charAt(0));

        // 这里应该选择哪一个是有讲究的。此处为了简单，默认选择第一个。
        String string = stringList.get(0);

        return string.toCharArray();
    }

    /**
     * 获取笔画数
     * @param text 文本
     * @param similarContext 上下文
     * @return 结果
     */
    private int getNumber(String text, IHanziSimilarContext similarContext) {
        Map<String, Integer> map = similarContext.bihuashuData().dataMap();

        Integer number = map.get(text);
        if(number == null) {
            return 1;
        }

        return number;
    }

}
