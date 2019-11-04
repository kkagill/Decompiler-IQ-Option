package com.google.android.gms.internal.phenotype;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class zzf {
    private static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri zzbe = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    private static final Pattern zzbf = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    private static final Pattern zzbg = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean zzbh = new AtomicBoolean();
    private static HashMap<String, String> zzbi;
    private static final HashMap<String, Boolean> zzbj = new HashMap();
    private static final HashMap<String, Integer> zzbk = new HashMap();
    private static final HashMap<String, Long> zzbl = new HashMap();
    private static final HashMap<String, Float> zzbm = new HashMap();
    private static Object zzbn;
    private static boolean zzbo;
    private static String[] zzbp = new String[0];

    /* JADX WARNING: Missing block: B:10:0x0012, code skipped:
            return r2;
     */
    private static <T> T zza(java.util.HashMap<java.lang.String, T> r2, java.lang.String r3, T r4) {
        /*
        r0 = com.google.android.gms.internal.phenotype.zzf.class;
        monitor-enter(r0);
        r1 = r2.containsKey(r3);	 Catch:{ all -> 0x0016 }
        if (r1 == 0) goto L_0x0013;
    L_0x0009:
        r2 = r2.get(r3);	 Catch:{ all -> 0x0016 }
        if (r2 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0011;
    L_0x0010:
        r2 = r4;
    L_0x0011:
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        return r2;
    L_0x0013:
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        r2 = 0;
        return r2;
    L_0x0016:
        r2 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.phenotype.zzf.zza(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Missing block: B:10:0x001e, code skipped:
            return r13;
     */
    /* JADX WARNING: Missing block: B:27:0x005d, code skipped:
            return r13;
     */
    /* JADX WARNING: Missing block: B:29:0x005f, code skipped:
            return null;
     */
    /* JADX WARNING: Missing block: B:32:0x0064, code skipped:
            r13 = r13.query(CONTENT_URI, null, null, new java.lang.String[]{r14}, null);
     */
    /* JADX WARNING: Missing block: B:33:0x0072, code skipped:
            if (r13 == null) goto L_0x0095;
     */
    /* JADX WARNING: Missing block: B:36:0x0078, code skipped:
            if (r13.moveToFirst() != false) goto L_0x007b;
     */
    /* JADX WARNING: Missing block: B:38:0x007b, code skipped:
            r15 = r13.getString(1);
     */
    /* JADX WARNING: Missing block: B:39:0x007f, code skipped:
            if (r15 == null) goto L_0x0088;
     */
    /* JADX WARNING: Missing block: B:41:0x0085, code skipped:
            if (r15.equals(null) == false) goto L_0x0088;
     */
    /* JADX WARNING: Missing block: B:42:0x0087, code skipped:
            r15 = null;
     */
    /* JADX WARNING: Missing block: B:43:0x0088, code skipped:
            zza(r0, r14, r15);
     */
    /* JADX WARNING: Missing block: B:44:0x008b, code skipped:
            if (r15 == null) goto L_0x008e;
     */
    /* JADX WARNING: Missing block: B:45:0x008e, code skipped:
            r15 = null;
     */
    /* JADX WARNING: Missing block: B:46:0x008f, code skipped:
            if (r13 == null) goto L_0x0094;
     */
    /* JADX WARNING: Missing block: B:47:0x0091, code skipped:
            r13.close();
     */
    /* JADX WARNING: Missing block: B:48:0x0094, code skipped:
            return r15;
     */
    /* JADX WARNING: Missing block: B:50:?, code skipped:
            zza(r0, r14, null);
     */
    /* JADX WARNING: Missing block: B:51:0x0098, code skipped:
            if (r13 == null) goto L_0x009d;
     */
    /* JADX WARNING: Missing block: B:52:0x009a, code skipped:
            r13.close();
     */
    /* JADX WARNING: Missing block: B:53:0x009d, code skipped:
            return null;
     */
    /* JADX WARNING: Missing block: B:55:0x009f, code skipped:
            if (r13 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Missing block: B:56:0x00a1, code skipped:
            r13.close();
     */
    public static java.lang.String zza(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
        r15 = com.google.android.gms.internal.phenotype.zzf.class;
        monitor-enter(r15);
        zza(r13);	 Catch:{ all -> 0x00a5 }
        r0 = zzbn;	 Catch:{ all -> 0x00a5 }
        r1 = zzbi;	 Catch:{ all -> 0x00a5 }
        r1 = r1.containsKey(r14);	 Catch:{ all -> 0x00a5 }
        r2 = 0;
        if (r1 == 0) goto L_0x001f;
    L_0x0011:
        r13 = zzbi;	 Catch:{ all -> 0x00a5 }
        r13 = r13.get(r14);	 Catch:{ all -> 0x00a5 }
        r13 = (java.lang.String) r13;	 Catch:{ all -> 0x00a5 }
        if (r13 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x001d;
    L_0x001c:
        r13 = r2;
    L_0x001d:
        monitor-exit(r15);	 Catch:{ all -> 0x00a5 }
        return r13;
    L_0x001f:
        r1 = zzbp;	 Catch:{ all -> 0x00a5 }
        r3 = r1.length;	 Catch:{ all -> 0x00a5 }
        r4 = 0;
        r5 = 0;
    L_0x0024:
        r6 = 1;
        if (r5 >= r3) goto L_0x0063;
    L_0x0027:
        r7 = r1[r5];	 Catch:{ all -> 0x00a5 }
        r7 = r14.startsWith(r7);	 Catch:{ all -> 0x00a5 }
        if (r7 == 0) goto L_0x0060;
    L_0x002f:
        r0 = zzbo;	 Catch:{ all -> 0x00a5 }
        if (r0 == 0) goto L_0x003b;
    L_0x0033:
        r0 = zzbi;	 Catch:{ all -> 0x00a5 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00a5 }
        if (r0 == 0) goto L_0x005e;
    L_0x003b:
        r0 = zzbp;	 Catch:{ all -> 0x00a5 }
        r1 = zzbi;	 Catch:{ all -> 0x00a5 }
        r13 = zza(r13, r0);	 Catch:{ all -> 0x00a5 }
        r1.putAll(r13);	 Catch:{ all -> 0x00a5 }
        zzbo = r6;	 Catch:{ all -> 0x00a5 }
        r13 = zzbi;	 Catch:{ all -> 0x00a5 }
        r13 = r13.containsKey(r14);	 Catch:{ all -> 0x00a5 }
        if (r13 == 0) goto L_0x005e;
    L_0x0050:
        r13 = zzbi;	 Catch:{ all -> 0x00a5 }
        r13 = r13.get(r14);	 Catch:{ all -> 0x00a5 }
        r13 = (java.lang.String) r13;	 Catch:{ all -> 0x00a5 }
        if (r13 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x005c;
    L_0x005b:
        r13 = r2;
    L_0x005c:
        monitor-exit(r15);	 Catch:{ all -> 0x00a5 }
        return r13;
    L_0x005e:
        monitor-exit(r15);	 Catch:{ all -> 0x00a5 }
        return r2;
    L_0x0060:
        r5 = r5 + 1;
        goto L_0x0024;
    L_0x0063:
        monitor-exit(r15);	 Catch:{ all -> 0x00a5 }
        r8 = CONTENT_URI;
        r9 = 0;
        r10 = 0;
        r11 = new java.lang.String[r6];
        r11[r4] = r14;
        r12 = 0;
        r7 = r13;
        r13 = r7.query(r8, r9, r10, r11, r12);
        if (r13 == 0) goto L_0x0095;
    L_0x0074:
        r15 = r13.moveToFirst();	 Catch:{ all -> 0x009e }
        if (r15 != 0) goto L_0x007b;
    L_0x007a:
        goto L_0x0095;
    L_0x007b:
        r15 = r13.getString(r6);	 Catch:{ all -> 0x009e }
        if (r15 == 0) goto L_0x0088;
    L_0x0081:
        r1 = r15.equals(r2);	 Catch:{ all -> 0x009e }
        if (r1 == 0) goto L_0x0088;
    L_0x0087:
        r15 = r2;
    L_0x0088:
        zza(r0, r14, r15);	 Catch:{ all -> 0x009e }
        if (r15 == 0) goto L_0x008e;
    L_0x008d:
        goto L_0x008f;
    L_0x008e:
        r15 = r2;
    L_0x008f:
        if (r13 == 0) goto L_0x0094;
    L_0x0091:
        r13.close();
    L_0x0094:
        return r15;
    L_0x0095:
        zza(r0, r14, r2);	 Catch:{ all -> 0x009e }
        if (r13 == 0) goto L_0x009d;
    L_0x009a:
        r13.close();
    L_0x009d:
        return r2;
    L_0x009e:
        r14 = move-exception;
        if (r13 == 0) goto L_0x00a4;
    L_0x00a1:
        r13.close();
    L_0x00a4:
        throw r14;
    L_0x00a5:
        r13 = move-exception;
        monitor-exit(r15);	 Catch:{ all -> 0x00a5 }
        goto L_0x00a9;
    L_0x00a8:
        throw r13;
    L_0x00a9:
        goto L_0x00a8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.phenotype.zzf.zza(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    private static Map<String, String> zza(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(zzbe, null, null, strArr, null);
        Map<String, String> treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void zza(ContentResolver contentResolver) {
        if (zzbi == null) {
            zzbh.set(false);
            zzbi = new HashMap();
            zzbn = new Object();
            zzbo = false;
            contentResolver.registerContentObserver(CONTENT_URI, true, new zzg(null));
            return;
        }
        if (zzbh.getAndSet(false)) {
            zzbi.clear();
            zzbj.clear();
            zzbk.clear();
            zzbl.clear();
            zzbm.clear();
            zzbn = new Object();
            zzbo = false;
        }
    }

    private static void zza(Object obj, String str, String str2) {
        synchronized (zzf.class) {
            if (obj == zzbn) {
                zzbi.put(str, str2);
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver, String str, boolean z) {
        Object zzb = zzb(contentResolver);
        Object obj = (Boolean) zza(zzbj, str, Boolean.valueOf(z));
        if (obj != null) {
            return obj.booleanValue();
        }
        String zza = zza(contentResolver, str, null);
        if (!(zza == null || zza.equals(""))) {
            if (zzbf.matcher(zza).matches()) {
                obj = Boolean.valueOf(true);
                z = true;
            } else if (zzbg.matcher(zza).matches()) {
                obj = Boolean.valueOf(false);
                z = false;
            } else {
                StringBuilder stringBuilder = new StringBuilder("attempt to read gservices key ");
                stringBuilder.append(str);
                stringBuilder.append(" (value \"");
                stringBuilder.append(zza);
                stringBuilder.append("\") as boolean");
                Log.w("Gservices", stringBuilder.toString());
            }
        }
        HashMap hashMap = zzbj;
        synchronized (zzf.class) {
            if (zzb == zzbn) {
                hashMap.put(str, obj);
                zzbi.remove(str);
            }
        }
        return z;
    }

    private static Object zzb(ContentResolver contentResolver) {
        Object obj;
        synchronized (zzf.class) {
            zza(contentResolver);
            obj = zzbn;
        }
        return obj;
    }
}
