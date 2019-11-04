package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* compiled from: MetaDataStore */
class ac {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final File rx;

    public ac(File file) {
        this.rx = file;
    }

    public void a(String str, aw awVar) {
        Throwable e;
        String str2 = "Failed to close user metadata file.";
        File aF = aF(str);
        Closeable closeable = null;
        try {
            String a = a(awVar);
            Closeable bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aF), UTF_8));
            try {
                bufferedWriter.write(a);
                bufferedWriter.flush();
                CommonUtils.a(bufferedWriter, str2);
            } catch (Exception e2) {
                e = e2;
                closeable = bufferedWriter;
                try {
                    c.biX().e("CrashlyticsCore", "Error serializing user metadata.", e);
                    CommonUtils.a(closeable, str2);
                } catch (Throwable th) {
                    e = th;
                    CommonUtils.a(closeable, str2);
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                closeable = bufferedWriter;
                CommonUtils.a(closeable, str2);
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            c.biX().e("CrashlyticsCore", "Error serializing user metadata.", e);
            CommonUtils.a(closeable, str2);
        }
    }

    public aw aE(String str) {
        Throwable e;
        String str2 = "Failed to close user metadata file.";
        File aF = aF(str);
        if (!aF.exists()) {
            return aw.sf;
        }
        Closeable closeable = null;
        try {
            Closeable fileInputStream = new FileInputStream(aF);
            try {
                aw aH = aH(CommonUtils.i(fileInputStream));
                CommonUtils.a(fileInputStream, str2);
                return aH;
            } catch (Exception e2) {
                e = e2;
                closeable = fileInputStream;
                try {
                    c.biX().e("CrashlyticsCore", "Error deserializing user metadata.", e);
                    CommonUtils.a(closeable, str2);
                    return aw.sf;
                } catch (Throwable th) {
                    e = th;
                    CommonUtils.a(closeable, str2);
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                closeable = fileInputStream;
                CommonUtils.a(closeable, str2);
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            c.biX().e("CrashlyticsCore", "Error deserializing user metadata.", e);
            CommonUtils.a(closeable, str2);
            return aw.sf;
        }
    }

    public File aF(String str) {
        File file = this.rx;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("user");
        stringBuilder.append(".meta");
        return new File(file, stringBuilder.toString());
    }

    public File aG(String str) {
        File file = this.rx;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("keys");
        stringBuilder.append(".meta");
        return new File(file, stringBuilder.toString());
    }

    private static aw aH(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new aw(a(jSONObject, "userId"), a(jSONObject, "userName"), a(jSONObject, "userEmail"));
    }

    private static String a(final aw awVar) {
        return new JSONObject() {
        }.toString();
    }

    private static String a(JSONObject jSONObject, String str) {
        return !jSONObject.isNull(str) ? jSONObject.optString(str, null) : null;
    }
}
