package com.github.houbb.nlp.hanzi.similar.api;

import java.util.Map;

/**
 * 数据接口
 * @author binbin.hou
 * @since 1.0.0
 * @param <T> 泛型
 */
public interface IHanziData<T> {

    /**
     * 返回数据信息
     * @return 结果
     */
    Map<String, T> dataMap();

}
