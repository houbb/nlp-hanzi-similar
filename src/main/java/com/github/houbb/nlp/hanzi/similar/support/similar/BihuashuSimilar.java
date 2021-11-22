package com.github.houbb.nlp.hanzi.similar.support.similar;

import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilar;
import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilarContext;

/**
 * 笔画数相似度
 *
 * @author binbin.hou
 * @since 1.0.0
 */
public class BihuashuSimilar implements IHanziSimilar {

    @Override
    public double similar(IHanziSimilarContext similarContext) {
        String charOne = similarContext.charOne();
        String charTwo = similarContext.charTwo();

        Integer numberOne = similarContext.bihuashuData().dataMap().get(charOne);
        Integer numberTwo = similarContext.bihuashuData().dataMap().get(charTwo);
        if(numberOne != null && numberTwo != null) {
            // 笔画差的越多，则差异越大
            double weight = 1 - Math.abs((numberOne - numberTwo)*1.0 / Math.max(numberOne, numberTwo));

            return weight * similarContext.bihuashuRate();
        }
        return 0;
    }

}
