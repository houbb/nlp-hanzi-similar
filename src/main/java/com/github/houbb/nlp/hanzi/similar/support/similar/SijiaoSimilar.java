package com.github.houbb.nlp.hanzi.similar.support.similar;

import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilar;
import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilarContext;

/**
 * 四角编码 相似度
 *
 * @author binbin.hou
 * @since 1.0.0
 */
public class SijiaoSimilar implements IHanziSimilar {

    @Override
    public double similar(IHanziSimilarContext similarContext, String charOne, String charTwo) {
        String codeOne = similarContext.sijiaoData().dataMap().get(charOne);
        String codeTwo = similarContext.sijiaoData().dataMap().get(charTwo);
        if(codeOne != null && codeTwo != null) {
            double score = calcScore(codeOne, codeTwo);

            return score * similarContext.sijiaoRate();
        }
        return 0;
    }

    /**
     * 分数编码
     * @param codeOne 编码1
     * @param codeTwo 编码2
     * @return 结果
     */
    private double calcScore(String codeOne, String codeTwo) {
        if(codeOne.length() == codeTwo.length()) {
            int len = codeOne.length();
            if(len <= 0) {
               return 0;
            }

            int total = 0;
            for(int i = 0; i < len; i++) {
                if(codeOne.charAt(i) == codeTwo.charAt(i)) {
                    total++;
                }
            }

            // 结果正则化
            return (total*1.0) / (len * 1.0);
        }

        return 0;
    }

}
