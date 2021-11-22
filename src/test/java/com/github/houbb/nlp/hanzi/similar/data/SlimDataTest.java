package com.github.houbb.nlp.hanzi.similar.data;

import com.github.houbb.heaven.util.io.FileUtil;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public class SlimDataTest {

    @Test
    @Ignore
    public void sijiaobianmaDataTest() {
        List<String> lines = FileUtil.readAllLines("D:\\github\\nlp-hanzi-similar\\src\\main\\resources\\nlp\\bihuashu_2w.txt");

        Map<String,String> sijiaoMap = FileUtil.readToMap("D:\\github\\nlp-hanzi-similar\\src\\main\\resources\\nlp\\四角编码字典_7w.txt");

        String targetP = "D:\\github\\nlp-hanzi-similar\\src\\main\\resources\\nlp\\sijiaobianma_2w.txt";

        for(String bihuaLine : lines) {
            String word = bihuaLine.split(" ")[0];
            String code = sijiaoMap.get(word);

            String line = word + " " + code;
            System.out.println(line);
            FileUtil.append(targetP, line);
        }
    }

}
