package com.jumio.sdk.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import java.io.File;
import java.util.HashMap;

public final class RootCheck {
    private static final String[] dangerousAppPackages = new String[]{"com.koushikdutta.rommanager", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine"};
    private static final String[] rootAppPackages = new String[]{"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su"};

    public static boolean isRooted(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", "1");
        hashMap.put("ro.secure", "0");
        int i = 0;
        int checkPackages = checkPackages(context, dangerousAppPackages) | (checkPackages(context, rootAppPackages) | 0);
        String str = "su";
        int i2 = (checkBinaryExists(str) || checkWhichBinary(str)) ? 1 : 0;
        checkPackages |= i2;
        str = "busybox";
        i2 = (checkBinaryExists(str) || checkWhichBinary(str)) ? 1 : 0;
        checkPackages = (checkPackages | i2) | checkProps(hashMap);
        if (Build.TAGS != null && Build.TAGS.contains("test-keys")) {
            i = 1;
        }
        return checkPackages | i;
    }

    private static boolean checkBinaryExists(String str) {
        int i = 0;
        for (String str2 : System.getenv("PATH").split(":")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(File.separator);
            stringBuilder.append(str);
            i |= new File(stringBuilder.toString()).exists();
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0056 A:{SYNTHETIC, Splitter:B:39:0x0056} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x005b A:{Catch:{ Exception -> 0x005e }} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004a A:{SYNTHETIC, Splitter:B:29:0x004a} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004f A:{Catch:{ Exception -> 0x0052 }} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0056 A:{SYNTHETIC, Splitter:B:39:0x0056} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x005b A:{Catch:{ Exception -> 0x005e }} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004a A:{SYNTHETIC, Splitter:B:29:0x004a} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004f A:{Catch:{ Exception -> 0x0052 }} */
    private static boolean checkWhichBinary(java.lang.String r7) {
        /*
        r0 = 0;
        r1 = 0;
        r2 = java.lang.Runtime.getRuntime();	 Catch:{ Throwable -> 0x0053, all -> 0x0046 }
        r3 = 2;
        r3 = new java.lang.String[r3];	 Catch:{ Throwable -> 0x0053, all -> 0x0046 }
        r4 = "which";
        r3[r1] = r4;	 Catch:{ Throwable -> 0x0053, all -> 0x0046 }
        r4 = 1;
        r3[r4] = r7;	 Catch:{ Throwable -> 0x0053, all -> 0x0046 }
        r7 = r2.exec(r3);	 Catch:{ Throwable -> 0x0053, all -> 0x0046 }
        r2 = new java.io.BufferedReader;	 Catch:{ Throwable -> 0x0054, all -> 0x0041 }
        r3 = new java.io.InputStreamReader;	 Catch:{ Throwable -> 0x0054, all -> 0x0041 }
        r5 = r7.getInputStream();	 Catch:{ Throwable -> 0x0054, all -> 0x0041 }
        r3.<init>(r5);	 Catch:{ Throwable -> 0x0054, all -> 0x0041 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0054, all -> 0x0041 }
        r0 = r2.readLine();	 Catch:{ Throwable -> 0x003f, all -> 0x003a }
        if (r0 == 0) goto L_0x0031;
    L_0x0028:
        if (r7 == 0) goto L_0x002d;
    L_0x002a:
        r7.destroy();	 Catch:{ Exception -> 0x0030 }
    L_0x002d:
        r2.close();	 Catch:{ Exception -> 0x0030 }
    L_0x0030:
        return r4;
    L_0x0031:
        if (r7 == 0) goto L_0x0036;
    L_0x0033:
        r7.destroy();	 Catch:{ Exception -> 0x0039 }
    L_0x0036:
        r2.close();	 Catch:{ Exception -> 0x0039 }
    L_0x0039:
        return r1;
    L_0x003a:
        r0 = move-exception;
        r6 = r0;
        r0 = r7;
        r7 = r6;
        goto L_0x0048;
    L_0x003f:
        r0 = r2;
        goto L_0x0054;
    L_0x0041:
        r1 = move-exception;
        r2 = r0;
        r0 = r7;
        r7 = r1;
        goto L_0x0048;
    L_0x0046:
        r7 = move-exception;
        r2 = r0;
    L_0x0048:
        if (r0 == 0) goto L_0x004d;
    L_0x004a:
        r0.destroy();	 Catch:{ Exception -> 0x0052 }
    L_0x004d:
        if (r2 == 0) goto L_0x0052;
    L_0x004f:
        r2.close();	 Catch:{ Exception -> 0x0052 }
    L_0x0052:
        throw r7;
    L_0x0053:
        r7 = r0;
    L_0x0054:
        if (r7 == 0) goto L_0x0059;
    L_0x0056:
        r7.destroy();	 Catch:{ Exception -> 0x005e }
    L_0x0059:
        if (r0 == 0) goto L_0x005e;
    L_0x005b:
        r0.close();	 Catch:{ Exception -> 0x005e }
    L_0x005e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.sdk.util.RootCheck.checkWhichBinary(java.lang.String):boolean");
    }

    private static boolean checkPackages(Context context, String[] strArr) {
        PackageManager packageManager = context.getPackageManager();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                packageManager.getPackageInfo(strArr[i], 0);
                return true;
            } catch (NameNotFoundException unused) {
                i++;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x009d A:{SYNTHETIC, Splitter:B:39:0x009d} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a2 A:{Catch:{ Exception -> 0x00a5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091 A:{SYNTHETIC, Splitter:B:29:0x0091} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A:{Catch:{ Exception -> 0x0099 }} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009d A:{SYNTHETIC, Splitter:B:39:0x009d} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a2 A:{Catch:{ Exception -> 0x00a5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091 A:{SYNTHETIC, Splitter:B:29:0x0091} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A:{Catch:{ Exception -> 0x0099 }} */
    private static boolean checkProps(java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "\\[(";
        r0.append(r1);
        r1 = r8.keySet();
        r1 = r1.iterator();
    L_0x0012:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0027;
    L_0x0018:
        r2 = r1.next();
        r2 = (java.lang.String) r2;
        r0.append(r2);
        r2 = "|";
        r0.append(r2);
        goto L_0x0012;
    L_0x0027:
        r1 = r0.length();
        r2 = 1;
        r1 = r1 - r2;
        r0.deleteCharAt(r1);
        r1 = ")\\]: \\[(.*)\\]";
        r0.append(r1);
        r0 = r0.toString();
        r0 = java.util.regex.Pattern.compile(r0);
        r1 = 0;
        r3 = 0;
        r4 = java.lang.Runtime.getRuntime();	 Catch:{ Exception -> 0x009a, all -> 0x008d }
        r5 = "getprop";
        r4 = r4.exec(r5);	 Catch:{ Exception -> 0x009a, all -> 0x008d }
        r5 = new java.io.BufferedReader;	 Catch:{ Exception -> 0x009b, all -> 0x008b }
        r6 = new java.io.InputStreamReader;	 Catch:{ Exception -> 0x009b, all -> 0x008b }
        r7 = r4.getInputStream();	 Catch:{ Exception -> 0x009b, all -> 0x008b }
        r6.<init>(r7);	 Catch:{ Exception -> 0x009b, all -> 0x008b }
        r5.<init>(r6);	 Catch:{ Exception -> 0x009b, all -> 0x008b }
    L_0x0057:
        r3 = r5.readLine();	 Catch:{ Exception -> 0x0089, all -> 0x0086 }
        if (r3 == 0) goto L_0x007d;
    L_0x005d:
        r3 = r0.matcher(r3);	 Catch:{ Exception -> 0x0089, all -> 0x0086 }
        r6 = r3.find();	 Catch:{ Exception -> 0x0089, all -> 0x0086 }
        if (r6 == 0) goto L_0x0057;
    L_0x0067:
        r6 = r3.group(r2);	 Catch:{ Exception -> 0x0089, all -> 0x0086 }
        r6 = r8.get(r6);	 Catch:{ Exception -> 0x0089, all -> 0x0086 }
        r6 = (java.lang.String) r6;	 Catch:{ Exception -> 0x0089, all -> 0x0086 }
        r7 = 2;
        r3 = r3.group(r7);	 Catch:{ Exception -> 0x0089, all -> 0x0086 }
        r3 = r6.equals(r3);	 Catch:{ Exception -> 0x0089, all -> 0x0086 }
        if (r3 == 0) goto L_0x0057;
    L_0x007c:
        r1 = 1;
    L_0x007d:
        if (r4 == 0) goto L_0x0082;
    L_0x007f:
        r4.destroy();	 Catch:{ Exception -> 0x00a5 }
    L_0x0082:
        r5.close();	 Catch:{ Exception -> 0x00a5 }
        goto L_0x00a5;
    L_0x0086:
        r8 = move-exception;
        r3 = r5;
        goto L_0x008f;
    L_0x0089:
        r3 = r5;
        goto L_0x009b;
    L_0x008b:
        r8 = move-exception;
        goto L_0x008f;
    L_0x008d:
        r8 = move-exception;
        r4 = r3;
    L_0x008f:
        if (r4 == 0) goto L_0x0094;
    L_0x0091:
        r4.destroy();	 Catch:{ Exception -> 0x0099 }
    L_0x0094:
        if (r3 == 0) goto L_0x0099;
    L_0x0096:
        r3.close();	 Catch:{ Exception -> 0x0099 }
    L_0x0099:
        throw r8;
    L_0x009a:
        r4 = r3;
    L_0x009b:
        if (r4 == 0) goto L_0x00a0;
    L_0x009d:
        r4.destroy();	 Catch:{ Exception -> 0x00a5 }
    L_0x00a0:
        if (r3 == 0) goto L_0x00a5;
    L_0x00a2:
        r3.close();	 Catch:{ Exception -> 0x00a5 }
    L_0x00a5:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.sdk.util.RootCheck.checkProps(java.util.Map):boolean");
    }
}
