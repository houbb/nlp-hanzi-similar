package com.github.houbb.nlp.hanzi.similar.support.similar;

import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilar;
import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilarContext;
import com.github.houbb.pinyin.util.PinyinHelper;

/**
 * 拼音相似度
 *
 * @author binbin.hou
 * @since 1.0.0
 */
public class PinyinSimilar implements IHanziSimilar {

    @Override
    public double similar(IHanziSimilarContext similarContext, String charOne, String charTwo) {
        String pinyinOne = PinyinHelper.toPinyin(charOne);
        String pinyinTwo = PinyinHelper.toPinyin(charTwo);

        if(pinyinOne.equals(pinyinTwo)) {
            // 后续可以进行近似读音优化
            return 1.0 * similarContext.pinyinRate();
        }
        return 0;
    }

}
