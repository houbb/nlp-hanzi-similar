package com.github.houbb.nlp.hanzi.similar.data;

public class SimilarListDataItem {

    private String word;
    private Double rate;


    public SimilarListDataItem(String word, Double rate) {
        this.word = word;
        this.rate = rate;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
