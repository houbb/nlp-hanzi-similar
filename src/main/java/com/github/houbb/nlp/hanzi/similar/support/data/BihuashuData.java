package com.github.houbb.nlp.hanzi.similar.support.data;

import com.github.houbb.heaven.util.io.StreamUtil;
import com.github.houbb.heaven.util.lang.StringUtil;
import com.github.houbb.nlp.hanzi.similar.api.IHanziData;
import com.github.houbb.nlp.hanzi.similar.constant.HanziSimilarDataConst;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 笔画数数据
 * @author binbin.hou
 * @since 1.0.0
 */
public class BihuashuData implements IHanziData<Integer> {

    private static final Map<String, Integer> MAP;

    static {
        List<String> lines = StreamUtil.readAllLines(HanziSimilarDataConst.BIAHUASHU);
        MAP = new HashMap<>(lines.size());

        for(String line : lines) {
            String[] strings = line.split(StringUtil.BLANK);
            MAP.put(strings[0], Integer.valueOf(strings[1]));
        }
    }

    @Override
    public Map<String, Integer> dataMap() {
        return MAP;
    }

}
