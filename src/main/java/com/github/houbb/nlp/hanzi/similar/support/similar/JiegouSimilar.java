package com.github.houbb.nlp.hanzi.similar.support.similar;

import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilar;
import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilarContext;

/**
 * 结构相似度
 *
 * @author binbin.hou
 * @since 1.0.0
 */
public class JiegouSimilar implements IHanziSimilar {

    @Override
    public double similar(IHanziSimilarContext similarContext, String charOne, String charTwo) {
        String jiegouOne = similarContext.jiegouData().dataMap().get(charOne);
        String jiegouTwo = similarContext.jiegouData().dataMap().get(charTwo);
        if(jiegouOne != null && jiegouTwo != null) {
            // 结构也可以考虑近似度，不过意义不大
            if(jiegouOne.equals(jiegouTwo)) {
                return 1.0 * similarContext.jiegouRate();
            }
        }
        return 0;
    }

}
