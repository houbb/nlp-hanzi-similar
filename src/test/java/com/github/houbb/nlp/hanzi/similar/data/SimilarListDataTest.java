package com.github.houbb.nlp.hanzi.similar.data;

import com.github.houbb.heaven.util.io.FileUtil;
import com.github.houbb.heaven.util.lang.StringUtil;
import com.github.houbb.nlp.hanzi.similar.util.HanziSimilarHelper;

import java.util.*;

public class SimilarListDataTest {

    public static void main(String[] args) {
        final String path = "D:\\code\\coin\\nlp-hanzi-similar\\src\\main\\resources\\hanzi_similar_list.txt";

        // 读取列表
        List<String> lines = FileUtil.readAllLines("D:\\code\\coin\\nlp-hanzi-similar\\src\\main\\resources\\nlp\\bihuashu_2w.txt");

        // 所有的单词
        Set<String> allWordSet = new HashSet<>();
        for(String line : lines) {
            String word = line.split(" ")[0];
            allWordSet.add(word);
        }

        // 循环对比
        for(String word : allWordSet) {
            List<String> list = getSimilarListData(word, allWordSet);

            String line = word +" " + StringUtil.join(list, "");
            FileUtil.append(path, line);
        }
    }

    private static List<String> getSimilarListData(String word, Set<String> wordSet) {
        PriorityQueue<SimilarListDataItem> items = new PriorityQueue<>(new Comparator<SimilarListDataItem>() {
            @Override
            public int compare(SimilarListDataItem o1, SimilarListDataItem o2) {
                // 相似度大的放在前面
                return -o1.getRate().compareTo(o2.getRate());
            }
        });

        for(String other : wordSet) {
            if(word.equals(other)) {
                continue;
            }

            // 对比
            double rate = HanziSimilarHelper.similar(word.charAt(0), other.charAt(0));

            SimilarListDataItem item = new SimilarListDataItem(other, rate);
            items.add(item);
        }

        final int limit = 100;
        List<String> wordList = new ArrayList<>();
        for(SimilarListDataItem item : items) {
            wordList.add(item.getWord());
            if(wordList.size() >= limit) {
                break;
            }
        }

        return wordList;
    }

}
