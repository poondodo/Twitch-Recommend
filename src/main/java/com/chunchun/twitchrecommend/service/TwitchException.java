package com.chunchun.twitchrecommend.service;

public class TwitchException extends RuntimeException{
    public TwitchException(String errorMessage) {
        super(errorMessage);
    }
}
