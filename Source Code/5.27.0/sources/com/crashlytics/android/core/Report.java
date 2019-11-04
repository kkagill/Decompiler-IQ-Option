package com.crashlytics.android.core;

import java.io.File;
import java.util.Map;

interface Report {

    public enum Type {
        JAVA,
        NATIVE
    }

    File fI();

    File[] fJ();

    Map<String, String> fK();

    Type fL();

    String getFileName();

    String getIdentifier();

    void remove();
}
