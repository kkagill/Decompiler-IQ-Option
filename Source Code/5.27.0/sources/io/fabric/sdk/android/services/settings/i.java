package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.services.c.b;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* compiled from: DefaultCachedSettingsIo */
class i implements g {
    private final h nP;

    public i(h hVar) {
        this.nP = hVar;
    }

    public JSONObject bkB() {
        Throwable e;
        Throwable th;
        String str = "Error while closing settings cache file.";
        String str2 = "Fabric";
        c.biX().d(str2, "Reading cached settings...");
        Closeable closeable = null;
        Closeable fileInputStream;
        try {
            JSONObject jSONObject;
            File file = new File(new b(this.nP).getFilesDir(), "com.crashlytics.settings.json");
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(CommonUtils.i(fileInputStream));
                    closeable = fileInputStream;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        c.biX().e(str2, "Failed to fetch cached settings", e);
                        CommonUtils.a(fileInputStream, str);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = fileInputStream;
                        CommonUtils.a(closeable, str);
                        throw th;
                    }
                }
            }
            c.biX().d(str2, "No cached settings found.");
            jSONObject = null;
            CommonUtils.a(closeable, str);
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            c.biX().e(str2, "Failed to fetch cached settings", e);
            CommonUtils.a(fileInputStream, str);
            return null;
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.a(closeable, str);
            throw th;
        }
    }

    public void a(long j, JSONObject jSONObject) {
        Throwable e;
        String str = "Failed to close settings writer.";
        String str2 = "Fabric";
        c.biX().d(str2, "Writing settings to cache file...");
        if (jSONObject != null) {
            Closeable closeable = null;
            try {
                jSONObject.put("expires_at", j);
                Closeable fileWriter = new FileWriter(new File(new b(this.nP).getFilesDir(), "com.crashlytics.settings.json"));
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                    CommonUtils.a(fileWriter, str);
                } catch (Exception e2) {
                    e = e2;
                    closeable = fileWriter;
                    try {
                        c.biX().e(str2, "Failed to cache settings", e);
                        CommonUtils.a(closeable, str);
                    } catch (Throwable th) {
                        e = th;
                        CommonUtils.a(closeable, str);
                        throw e;
                    }
                } catch (Throwable th2) {
                    e = th2;
                    closeable = fileWriter;
                    CommonUtils.a(closeable, str);
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
                c.biX().e(str2, "Failed to cache settings", e);
                CommonUtils.a(closeable, str);
            }
        }
    }
}
