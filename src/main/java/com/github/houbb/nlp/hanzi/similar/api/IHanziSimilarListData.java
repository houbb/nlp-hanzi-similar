package com.github.houbb.nlp.hanzi.similar.api;

import java.util.List;
import java.util.Map;

/**
 * 数据接口-相似列表
 * @author binbin.hou
 * @since 1.3.0
 */
public interface IHanziSimilarListData {

    /**
     * 返回数据信息
     * @param word 单词
     * @return 结果
     */
    List<String> similarList(String word);

}
