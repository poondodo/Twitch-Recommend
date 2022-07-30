package com.chunchun.twitchrecommend.service;

public class RecommendationException extends RuntimeException {
    public RecommendationException(String errorMessage) {
        super(errorMessage);
    }
}

