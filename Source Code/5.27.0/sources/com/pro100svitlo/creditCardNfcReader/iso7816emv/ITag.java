package com.pro100svitlo.creditCardNfcReader.iso7816emv;

public interface ITag {

    public enum Class {
        UNIVERSAL,
        APPLICATION,
        CONTEXT_SPECIFIC,
        PRIVATE
    }

    boolean bgw();

    byte[] bgx();
}
