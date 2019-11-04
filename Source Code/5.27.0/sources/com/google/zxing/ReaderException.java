package com.google.zxing;

public abstract class ReaderException extends Exception {
    protected static final boolean agj = (System.getProperty("surefire.test.class.path") != null);
    protected static final StackTraceElement[] agk = new StackTraceElement[0];

    ReaderException() {
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
