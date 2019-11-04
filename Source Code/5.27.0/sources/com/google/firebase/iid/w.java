package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.util.Map;

final class w {
    private final Context acP;
    private final SharedPreferences ads;
    private final ba adt;
    @GuardedBy("this")
    private final Map<String, az> adu;

    public w(Context context) {
        this(context, new ba());
    }

    private w(Context context, ba baVar) {
        String str = "FirebaseInstanceId";
        this.adu = new ArrayMap();
        this.acP = context;
        this.ads = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.adt = baVar;
        File file = new File(ContextCompat.getNoBackupFilesDir(this.acP), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !isEmpty()) {
                    Log.i(str, "App restored, clearing state");
                    wI();
                    FirebaseInstanceId.getInstance().zzn();
                }
            } catch (IOException e) {
                if (Log.isLoggable(str, 3)) {
                    String str2 = "Error creating file in no backup dir: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
    }

    public final synchronized String zzai() {
        return this.ads.getString("topic_operation_queue", "");
    }

    public final synchronized void zzf(String str) {
        this.ads.edit().putString("topic_operation_queue", str).apply();
    }

    private final synchronized boolean isEmpty() {
        return this.ads.getAll().isEmpty();
    }

    private static String g(String str, String str2, String str3) {
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str).length() + 4) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        stringBuilder.append("|T|");
        stringBuilder.append(str2);
        stringBuilder.append("|");
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }

    static String zzd(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("|S|");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public final synchronized void wI() {
        this.adu.clear();
        ba.zza(this.acP);
        this.ads.edit().clear().commit();
    }

    public final synchronized z h(String str, String str2, String str3) {
        return z.cf(this.ads.getString(g(str, str2, str3), null));
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        str4 = z.a(str4, str5, System.currentTimeMillis());
        if (str4 != null) {
            Editor edit = this.ads.edit();
            edit.putString(g(str, str2, str3), str4);
            edit.commit();
        }
    }

    public final synchronized void i(String str, String str2, String str3) {
        str = g(str, str2, str3);
        Editor edit = this.ads.edit();
        edit.remove(str);
        edit.commit();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|8|9|10|11|12) */
    public final synchronized com.google.firebase.iid.az ce(java.lang.String r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.adu;	 Catch:{ all -> 0x0033 }
        r0 = r0.get(r3);	 Catch:{ all -> 0x0033 }
        r0 = (com.google.firebase.iid.az) r0;	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r2);
        return r0;
    L_0x000d:
        r0 = r2.adt;	 Catch:{ zzaa -> 0x0016 }
        r1 = r2.acP;	 Catch:{ zzaa -> 0x0016 }
        r0 = r0.y(r1, r3);	 Catch:{ zzaa -> 0x0016 }
        goto L_0x002c;
    L_0x0016:
        r0 = "FirebaseInstanceId";
        r1 = "Stored data is corrupt, generating new identity";
        android.util.Log.w(r0, r1);	 Catch:{ all -> 0x0033 }
        r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance();	 Catch:{ all -> 0x0033 }
        r0.zzn();	 Catch:{ all -> 0x0033 }
        r0 = r2.adt;	 Catch:{ all -> 0x0033 }
        r1 = r2.acP;	 Catch:{ all -> 0x0033 }
        r0 = r0.z(r1, r3);	 Catch:{ all -> 0x0033 }
    L_0x002c:
        r1 = r2.adu;	 Catch:{ all -> 0x0033 }
        r1.put(r3, r0);	 Catch:{ all -> 0x0033 }
        monitor-exit(r2);
        return r0;
    L_0x0033:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.w.ce(java.lang.String):com.google.firebase.iid.az");
    }

    public final synchronized void zzh(String str) {
        str = String.valueOf(str).concat("|T|");
        Editor edit = this.ads.edit();
        for (String str2 : this.ads.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }
}
