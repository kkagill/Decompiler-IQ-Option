package com.crashlytics.android.core;

import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/* compiled from: Sha1FileIdStrategy */
class as implements a {
    as() {
    }

    public String d(File file) {
        return aK(file.getPath());
    }

    private static String aK(String str) {
        Throwable th;
        Closeable closeable = null;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            try {
                str = CommonUtils.j(bufferedInputStream);
                CommonUtils.closeQuietly(bufferedInputStream);
                return str;
            } catch (Throwable th2) {
                th = th2;
                closeable = bufferedInputStream;
                CommonUtils.closeQuietly(closeable);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.closeQuietly(closeable);
            throw th;
        }
    }
}
