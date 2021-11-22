package com.github.houbb.nlp.hanzi.similar.exception;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public class HanziSimilarException extends RuntimeException {

    public HanziSimilarException() {
    }

    public HanziSimilarException(String message) {
        super(message);
    }

    public HanziSimilarException(String message, Throwable cause) {
        super(message, cause);
    }

    public HanziSimilarException(Throwable cause) {
        super(cause);
    }

    public HanziSimilarException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
