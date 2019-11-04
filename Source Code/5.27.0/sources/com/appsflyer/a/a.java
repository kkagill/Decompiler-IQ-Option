package com.appsflyer.a;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class a {
    private static a mt = new a();

    public static a dH() {
        return mt;
    }

    private a() {
    }

    public List<b> A(Context context) {
        String str = "AppsFlyer_4.9.0";
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(context.getFilesDir(), "AFRequestCache");
            if (file.exists()) {
                for (File file2 : file.listFiles()) {
                    StringBuilder stringBuilder = new StringBuilder("Found cached request");
                    stringBuilder.append(file2.getName());
                    Log.i(str, stringBuilder.toString());
                    arrayList.add(a(file2));
                }
            } else {
                file.mkdir();
            }
        } catch (Exception unused) {
            Log.i(str, "Could not cache request");
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002d A:{SYNTHETIC, Splitter:B:21:0x002d} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026 A:{SYNTHETIC, Splitter:B:13:0x0026} */
    private static com.appsflyer.a.b a(java.io.File r4) {
        /*
        r0 = 0;
        r1 = new java.io.FileReader;	 Catch:{ Exception -> 0x002a, all -> 0x0022 }
        r1.<init>(r4);	 Catch:{ Exception -> 0x002a, all -> 0x0022 }
        r2 = r4.length();	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r3 = (int) r2;	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r2 = new char[r3];	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r1.read(r2);	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r3 = new com.appsflyer.a.b;	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r3.<init>(r2);	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r4 = r4.getName();	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r3.ad(r4);	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r1.close();	 Catch:{ IOException -> 0x001f }
    L_0x001f:
        return r3;
    L_0x0020:
        r4 = move-exception;
        goto L_0x0024;
    L_0x0022:
        r4 = move-exception;
        r1 = r0;
    L_0x0024:
        if (r1 == 0) goto L_0x0029;
    L_0x0026:
        r1.close();	 Catch:{ IOException -> 0x0029 }
    L_0x0029:
        throw r4;
    L_0x002a:
        r1 = r0;
    L_0x002b:
        if (r1 == 0) goto L_0x0030;
    L_0x002d:
        r1.close();	 Catch:{ IOException -> 0x0030 }
    L_0x0030:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.a.a.a(java.io.File):com.appsflyer.a.b");
    }

    public void init(Context context) {
        String str = "AFRequestCache";
        try {
            if (!new File(context.getFilesDir(), str).exists()) {
                new File(context.getFilesDir(), str).mkdir();
            }
        } catch (Exception unused) {
            Log.i("AppsFlyer_4.9.0", "Could not create cache directory");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3 A:{SYNTHETIC, Splitter:B:32:0x00a3} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c A:{SYNTHETIC, Splitter:B:27:0x009c} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0095 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:22|21|24|25|(2:27|28)|29) */
    /* JADX WARNING: Missing block: B:23:0x0093, code skipped:
            r8 = th;
     */
    /* JADX WARNING: Missing block: B:33:?, code skipped:
            r2.close();
     */
    public void a(com.appsflyer.a.b r8, android.content.Context r9) {
        /*
        r7 = this;
        r0 = "AFRequestCache";
        r1 = "AppsFlyer_4.9.0";
        r2 = 0;
        r3 = new java.io.File;	 Catch:{ Exception -> 0x0095 }
        r4 = r9.getFilesDir();	 Catch:{ Exception -> 0x0095 }
        r3.<init>(r4, r0);	 Catch:{ Exception -> 0x0095 }
        r4 = r3.exists();	 Catch:{ Exception -> 0x0095 }
        if (r4 != 0) goto L_0x0018;
    L_0x0014:
        r3.mkdir();	 Catch:{ Exception -> 0x0095 }
        return;
    L_0x0018:
        r3 = r3.listFiles();	 Catch:{ Exception -> 0x0095 }
        if (r3 == 0) goto L_0x0029;
    L_0x001e:
        r3 = r3.length;	 Catch:{ Exception -> 0x0095 }
        r4 = 40;
        if (r3 <= r4) goto L_0x0029;
    L_0x0023:
        r8 = "reached cache limit, not caching request";
        android.util.Log.i(r1, r8);	 Catch:{ Exception -> 0x0095 }
        return;
    L_0x0029:
        r3 = "caching request...";
        android.util.Log.i(r1, r3);	 Catch:{ Exception -> 0x0095 }
        r3 = new java.io.File;	 Catch:{ Exception -> 0x0095 }
        r4 = new java.io.File;	 Catch:{ Exception -> 0x0095 }
        r9 = r9.getFilesDir();	 Catch:{ Exception -> 0x0095 }
        r4.<init>(r9, r0);	 Catch:{ Exception -> 0x0095 }
        r5 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0095 }
        r9 = java.lang.Long.toString(r5);	 Catch:{ Exception -> 0x0095 }
        r3.<init>(r4, r9);	 Catch:{ Exception -> 0x0095 }
        r3.createNewFile();	 Catch:{ Exception -> 0x0095 }
        r9 = new java.io.OutputStreamWriter;	 Catch:{ Exception -> 0x0095 }
        r0 = new java.io.FileOutputStream;	 Catch:{ Exception -> 0x0095 }
        r3 = r3.getPath();	 Catch:{ Exception -> 0x0095 }
        r4 = 1;
        r0.<init>(r3, r4);	 Catch:{ Exception -> 0x0095 }
        r9.<init>(r0);	 Catch:{ Exception -> 0x0095 }
        r0 = "version=";
        r9.write(r0);	 Catch:{ Exception -> 0x0091, all -> 0x008e }
        r0 = r8.getVersion();	 Catch:{ Exception -> 0x0091, all -> 0x008e }
        r9.write(r0);	 Catch:{ Exception -> 0x0091, all -> 0x008e }
        r0 = 10;
        r9.write(r0);	 Catch:{ Exception -> 0x0091, all -> 0x008e }
        r2 = "url=";
        r9.write(r2);	 Catch:{ Exception -> 0x0091, all -> 0x008e }
        r2 = r8.dJ();	 Catch:{ Exception -> 0x0091, all -> 0x008e }
        r9.write(r2);	 Catch:{ Exception -> 0x0091, all -> 0x008e }
        r9.write(r0);	 Catch:{ Exception -> 0x0091, all -> 0x008e }
        r2 = "data=";
        r9.write(r2);	 Catch:{ Exception -> 0x0091, all -> 0x008e }
        r8 = r8.dI();	 Catch:{ Exception -> 0x0091, all -> 0x008e }
        r9.write(r8);	 Catch:{ Exception -> 0x0091, all -> 0x008e }
        r9.write(r0);	 Catch:{ Exception -> 0x0091, all -> 0x008e }
        r9.flush();	 Catch:{ Exception -> 0x0091, all -> 0x008e }
        r9.close();	 Catch:{ IOException -> 0x008d }
    L_0x008d:
        return;
    L_0x008e:
        r8 = move-exception;
        r2 = r9;
        goto L_0x00a1;
    L_0x0091:
        r2 = r9;
        goto L_0x0095;
    L_0x0093:
        r8 = move-exception;
        goto L_0x00a1;
    L_0x0095:
        r8 = "Could not cache request";
        android.util.Log.i(r1, r8);	 Catch:{ all -> 0x0093 }
        if (r2 == 0) goto L_0x00a0;
    L_0x009c:
        r2.close();	 Catch:{ IOException -> 0x00a0 }
    L_0x00a0:
        return;
    L_0x00a1:
        if (r2 == 0) goto L_0x00a6;
    L_0x00a3:
        r2.close();	 Catch:{ IOException -> 0x00a6 }
    L_0x00a6:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.a.a.a(com.appsflyer.a.b, android.content.Context):void");
    }

    public void a(String str, Context context) {
        File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
        StringBuilder stringBuilder = new StringBuilder("Deleting ");
        stringBuilder.append(str);
        String str2 = " from cache";
        stringBuilder.append(str2);
        String str3 = "AppsFlyer_4.9.0";
        Log.i(str3, stringBuilder.toString());
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                stringBuilder = new StringBuilder("Could not delete ");
                stringBuilder.append(str);
                stringBuilder.append(str2);
                Log.i(str3, stringBuilder.toString(), e);
            }
        }
    }
}
