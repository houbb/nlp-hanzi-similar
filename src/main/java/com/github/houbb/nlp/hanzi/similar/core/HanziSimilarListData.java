package com.github.houbb.nlp.hanzi.similar.core;

import com.github.houbb.heaven.util.guava.Guavas;
import com.github.houbb.heaven.util.io.StreamUtil;
import com.github.houbb.heaven.util.lang.StringUtil;
import com.github.houbb.heaven.util.util.MapUtil;
import com.github.houbb.nlp.hanzi.similar.api.IHanziSimilarListData;

import java.util.List;
import java.util.Map;

/**
 * 实现
 *
 * @since 1.3.0
 */
public class HanziSimilarListData implements IHanziSimilarListData {

    private static volatile Map<String, List<String>> map = Guavas.newHashMap();


    @Override
    public List<String> similarList(String word) {
        if(MapUtil.isEmpty(map)) {
            initDataMap();
        }

        return map.get(word);
    }

    private void initDataMap() {
        if(MapUtil.isNotEmpty(map)) {
            return;
        }

        synchronized (map) {
            if(MapUtil.isEmpty(map)) {
                List<String> lines = StreamUtil.readAllLines("/hanzi_similar_list.txt");

                for(String line : lines) {
                    String[] words = line.split(" ");
                    // 后面的100个相近词
                    List<String> list = StringUtil.toCharStringList(words[1]);
                    map.put(words[0], list);
                }
            }
        }
    }

}
