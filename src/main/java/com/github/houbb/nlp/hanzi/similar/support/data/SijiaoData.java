package com.github.houbb.nlp.hanzi.similar.support.data;

import com.github.houbb.heaven.util.io.StreamUtil;
import com.github.houbb.heaven.util.lang.StringUtil;
import com.github.houbb.nlp.hanzi.similar.api.IHanziData;
import com.github.houbb.nlp.hanzi.similar.constant.HanziSimilarDataConst;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 偏旁部首 数据
 * @author binbin.hou
 * @since 1.0.0
 */
public class SijiaoData implements IHanziData<String> {

    private static final Map<String, String> MAP;

    static {
        List<String> lines = StreamUtil.readAllLines(HanziSimilarDataConst.SIJIAO);
        MAP = new HashMap<>(lines.size());

        for(String line : lines) {
            String[] strings = line.split(StringUtil.BLANK);
            MAP.put(strings[0], strings[1]);
        }
    }

    @Override
    public Map<String, String> dataMap() {
        return MAP;
    }

}
