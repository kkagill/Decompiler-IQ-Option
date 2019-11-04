package io.fabric.sdk.android;

import android.os.SystemClock;
import android.text.TextUtils;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: FabricKitsFinder */
class e implements Callable<Map<String, j>> {
    final String eMx;

    e(String str) {
        this.eMx = str;
    }

    /* renamed from: bja */
    public Map<String, j> call() {
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(bjb());
        hashMap.putAll(bjc());
        k biX = c.biX();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("finish scanning in ");
        stringBuilder.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        biX.v("Fabric", stringBuilder.toString());
        return hashMap;
    }

    private Map<String, j> bjb() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName("com.google.android.gms.ads.AdView");
            j jVar = new j("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put(jVar.getIdentifier(), jVar);
            c.biX().v("Fabric", "Found kit: com.google.firebase.firebase-ads");
        } catch (Exception unused) {
        }
        return hashMap;
    }

    private Map<String, j> bjc() {
        HashMap hashMap = new HashMap();
        ZipFile bjd = bjd();
        Enumeration entries = bjd.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.getName().startsWith("fabric/") && zipEntry.getName().length() > 7) {
                j a = a(zipEntry, bjd);
                if (a != null) {
                    hashMap.put(a.getIdentifier(), a);
                    c.biX().v("Fabric", String.format("Found kit:[%s] version:[%s]", new Object[]{a.getIdentifier(), a.getVersion()}));
                }
            }
        }
        if (bjd != null) {
            try {
                bjd.close();
            } catch (IOException unused) {
            }
        }
        return hashMap;
    }

    private j a(ZipEntry zipEntry, ZipFile zipFile) {
        Throwable e;
        StringBuilder stringBuilder;
        Throwable th;
        Closeable inputStream;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                String property = properties.getProperty("fabric-identifier");
                String property2 = properties.getProperty("fabric-version");
                String property3 = properties.getProperty("fabric-build-type");
                if (TextUtils.isEmpty(property) || TextUtils.isEmpty(property2)) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Invalid format of fabric file,");
                    stringBuilder2.append(zipEntry.getName());
                    throw new IllegalStateException(stringBuilder2.toString());
                }
                j jVar = new j(property, property2, property3);
                CommonUtils.closeQuietly(inputStream);
                return jVar;
            } catch (IOException e2) {
                e = e2;
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Error when parsing fabric properties ");
                    stringBuilder.append(zipEntry.getName());
                    c.biX().e("Fabric", stringBuilder.toString(), e);
                    CommonUtils.closeQuietly(inputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    CommonUtils.closeQuietly(inputStream);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error when parsing fabric properties ");
            stringBuilder.append(zipEntry.getName());
            c.biX().e("Fabric", stringBuilder.toString(), e);
            CommonUtils.closeQuietly(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            CommonUtils.closeQuietly(inputStream);
            throw th;
        }
    }

    /* Access modifiers changed, original: protected */
    public ZipFile bjd() {
        return new ZipFile(this.eMx);
    }
}
