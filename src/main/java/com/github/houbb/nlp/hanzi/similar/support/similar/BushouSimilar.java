package com.github.houbb.nlp.hanzi.similar.support.similar;

import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilar;
import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilarContext;

/**
 * 部首相似度
 *
 * @author binbin.hou
 * @since 1.0.0
 */
public class BushouSimilar implements IHanziSimilar {

    @Override
    public double similar(IHanziSimilarContext similarContext) {
        String charOne = similarContext.charOne();
        String charTwo = similarContext.charTwo();

        String bushouOne = similarContext.bushouData().dataMap().get(charOne);
        String bushouTwo = similarContext.bushouData().dataMap().get(charTwo);
        if(bushouOne != null && bushouTwo != null) {
            if(bushouOne.equals(bushouTwo)) {
                return 1.0 * similarContext.bushouRate();
            }
        }
        return 0;
    }

}
