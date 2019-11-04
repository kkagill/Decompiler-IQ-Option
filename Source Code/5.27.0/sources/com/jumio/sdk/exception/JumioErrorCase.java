package com.jumio.sdk.exception;

public interface JumioErrorCase {
    String code();

    int message();

    boolean retry();
}
