package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.UUID;

final class af {
    private static String lx;

    public static synchronized String e(WeakReference<Context> weakReference) {
        synchronized (af.class) {
            String str;
            if (weakReference.get() == null) {
                str = lx;
                return str;
            }
            if (lx == null) {
                String str2 = null;
                if (weakReference.get() != null) {
                    str2 = j.p((Context) weakReference.get()).getString("AF_INSTALLATION", null);
                }
                if (str2 != null) {
                    lx = str2;
                } else {
                    try {
                        String obj;
                        File file = new File(((Context) weakReference.get()).getFilesDir(), "AF_INSTALLATION");
                        if (file.exists()) {
                            lx = b(file);
                            file.delete();
                        } else {
                            if (VERSION.SDK_INT >= 9) {
                                long currentTimeMillis = System.currentTimeMillis();
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(currentTimeMillis);
                                stringBuilder.append("-");
                                stringBuilder.append(Math.abs(new SecureRandom().nextLong()));
                                obj = stringBuilder.toString();
                            } else {
                                obj = UUID.randomUUID().toString();
                            }
                            lx = obj;
                        }
                        obj = lx;
                        Editor edit = j.p((Context) weakReference.get()).edit();
                        edit.putString("AF_INSTALLATION", obj);
                        if (VERSION.SDK_INT >= 9) {
                            edit.apply();
                        } else {
                            edit.commit();
                        }
                    } catch (Exception e) {
                        AFLogger.c("Error getting AF unique ID", e);
                    }
                }
                if (lx != null) {
                    m.dw().set("uid", lx);
                }
            }
            str = lx;
            return str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033 A:{SYNTHETIC, Splitter:B:19:0x0033} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004a A:{SYNTHETIC, Splitter:B:30:0x004a} */
    private static java.lang.String b(java.io.File r6) {
        /*
        r0 = "Exception while trying to close the InstallationFile";
        r1 = 0;
        r2 = new java.io.RandomAccessFile;	 Catch:{ IOException -> 0x002a }
        r3 = "r";
        r2.<init>(r6, r3);	 Catch:{ IOException -> 0x002a }
        r3 = r2.length();	 Catch:{ IOException -> 0x0023, all -> 0x0020 }
        r6 = (int) r3;	 Catch:{ IOException -> 0x0023, all -> 0x0020 }
        r1 = new byte[r6];	 Catch:{ IOException -> 0x0023, all -> 0x0020 }
        r2.readFully(r1);	 Catch:{ IOException -> 0x0023, all -> 0x0020 }
        r2.close();	 Catch:{ IOException -> 0x0023, all -> 0x0020 }
        r2.close();	 Catch:{ IOException -> 0x001b }
        goto L_0x003c;
    L_0x001b:
        r6 = move-exception;
        com.appsflyer.AFLogger.c(r0, r6);
        goto L_0x003c;
    L_0x0020:
        r6 = move-exception;
        r1 = r2;
        goto L_0x0048;
    L_0x0023:
        r6 = move-exception;
        r5 = r2;
        r2 = r1;
        r1 = r5;
        goto L_0x002c;
    L_0x0028:
        r6 = move-exception;
        goto L_0x0048;
    L_0x002a:
        r6 = move-exception;
        r2 = r1;
    L_0x002c:
        r3 = "Exception while reading InstallationFile: ";
        com.appsflyer.AFLogger.c(r3, r6);	 Catch:{ all -> 0x0028 }
        if (r1 == 0) goto L_0x003b;
    L_0x0033:
        r1.close();	 Catch:{ IOException -> 0x0037 }
        goto L_0x003b;
    L_0x0037:
        r6 = move-exception;
        com.appsflyer.AFLogger.c(r0, r6);
    L_0x003b:
        r1 = r2;
    L_0x003c:
        r6 = new java.lang.String;
        if (r1 == 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0044;
    L_0x0041:
        r0 = 0;
        r1 = new byte[r0];
    L_0x0044:
        r6.<init>(r1);
        return r6;
    L_0x0048:
        if (r1 == 0) goto L_0x0052;
    L_0x004a:
        r1.close();	 Catch:{ IOException -> 0x004e }
        goto L_0x0052;
    L_0x004e:
        r1 = move-exception;
        com.appsflyer.AFLogger.c(r0, r1);
    L_0x0052:
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.af.b(java.io.File):java.lang.String");
    }
}
