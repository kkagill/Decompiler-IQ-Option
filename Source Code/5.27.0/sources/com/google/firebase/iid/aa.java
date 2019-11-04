package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.iqoption.dto.entity.ActiveQuote;
import java.io.IOException;
import java.util.Map;

final class aa {
    @GuardedBy("itself")
    private final w acy;
    @GuardedBy("this")
    private int adF = 0;
    @GuardedBy("this")
    private final Map<Integer, TaskCompletionSource<Void>> adG = new ArrayMap();

    aa(w wVar) {
        this.acy = wVar;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized Task<Void> zza(String str) {
        TaskCompletionSource taskCompletionSource;
        String zzai;
        int i;
        synchronized (this.acy) {
            zzai = this.acy.zzai();
            w wVar = this.acy;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(zzai).length() + 1) + String.valueOf(str).length());
            stringBuilder.append(zzai);
            stringBuilder.append(",");
            stringBuilder.append(str);
            wVar.zzf(stringBuilder.toString());
        }
        taskCompletionSource = new TaskCompletionSource();
        Map map = this.adG;
        if (TextUtils.isEmpty(zzai)) {
            i = 0;
        } else {
            i = zzai.split(",").length - 1;
        }
        map.put(Integer.valueOf(this.adF + i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean wL() {
        return wM() != null;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:8:0x0017, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:11:0x001d, code skipped:
            if (a(r5, r0) != false) goto L_0x0021;
     */
    /* JADX WARNING: Missing block: B:13:0x0020, code skipped:
            return false;
     */
    /* JADX WARNING: Missing block: B:14:0x0021, code skipped:
            monitor-enter(r4);
     */
    /* JADX WARNING: Missing block: B:16:?, code skipped:
            r2 = (com.google.android.gms.tasks.TaskCompletionSource) r4.adG.remove(java.lang.Integer.valueOf(r4.adF));
            ch(r0);
            r4.adF++;
     */
    /* JADX WARNING: Missing block: B:17:0x0038, code skipped:
            monitor-exit(r4);
     */
    /* JADX WARNING: Missing block: B:18:0x0039, code skipped:
            if (r2 == null) goto L_0x0000;
     */
    /* JADX WARNING: Missing block: B:19:0x003b, code skipped:
            r2.setResult(null);
     */
    @androidx.annotation.WorkerThread
    public final boolean c(com.google.firebase.iid.FirebaseInstanceId r5) {
        /*
        r4 = this;
    L_0x0000:
        monitor-enter(r4);
        r0 = r4.wM();	 Catch:{ all -> 0x0043 }
        r1 = 1;
        if (r0 != 0) goto L_0x0018;
    L_0x0008:
        r5 = com.google.firebase.iid.FirebaseInstanceId.zzm();	 Catch:{ all -> 0x0043 }
        if (r5 == 0) goto L_0x0016;
    L_0x000e:
        r5 = "FirebaseInstanceId";
        r0 = "topic sync succeeded";
        android.util.Log.d(r5, r0);	 Catch:{ all -> 0x0043 }
    L_0x0016:
        monitor-exit(r4);	 Catch:{ all -> 0x0043 }
        return r1;
    L_0x0018:
        monitor-exit(r4);	 Catch:{ all -> 0x0043 }
        r2 = a(r5, r0);
        if (r2 != 0) goto L_0x0021;
    L_0x001f:
        r5 = 0;
        return r5;
    L_0x0021:
        monitor-enter(r4);
        r2 = r4.adG;	 Catch:{ all -> 0x0040 }
        r3 = r4.adF;	 Catch:{ all -> 0x0040 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x0040 }
        r2 = r2.remove(r3);	 Catch:{ all -> 0x0040 }
        r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2;	 Catch:{ all -> 0x0040 }
        r4.ch(r0);	 Catch:{ all -> 0x0040 }
        r0 = r4.adF;	 Catch:{ all -> 0x0040 }
        r0 = r0 + r1;
        r4.adF = r0;	 Catch:{ all -> 0x0040 }
        monitor-exit(r4);	 Catch:{ all -> 0x0040 }
        if (r2 == 0) goto L_0x0000;
    L_0x003b:
        r0 = 0;
        r2.setResult(r0);
        goto L_0x0000;
    L_0x0040:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0040 }
        throw r5;
    L_0x0043:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0043 }
        goto L_0x0047;
    L_0x0046:
        throw r5;
    L_0x0047:
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.aa.c(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }

    @GuardedBy("this")
    @Nullable
    private final String wM() {
        String zzai;
        synchronized (this.acy) {
            zzai = this.acy.zzai();
        }
        if (!TextUtils.isEmpty(zzai)) {
            String[] split = zzai.split(",");
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                return split[1];
            }
        }
        return null;
    }

    private final synchronized boolean ch(String str) {
        synchronized (this.acy) {
            String zzai = this.acy.zzai();
            String str2 = ",";
            String valueOf = String.valueOf(str);
            if (zzai.startsWith(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2))) {
                str2 = ",";
                str = String.valueOf(str);
                this.acy.zzf(zzai.substring((str.length() != 0 ? str2.concat(str) : new String(str2)).length()));
                return true;
            }
            return false;
        }
    }

    @WorkerThread
    private static boolean a(FirebaseInstanceId firebaseInstanceId, String str) {
        String str2 = "FirebaseInstanceId";
        String[] split = str.split("!");
        if (split.length == 2) {
            String str3 = split[0];
            str = split[1];
            Object obj = -1;
            try {
                int hashCode = str3.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (str3.equals(ActiveQuote.PHASE_UNKNOWN)) {
                            obj = 1;
                        }
                    }
                } else if (str3.equals("S")) {
                    obj = null;
                }
                if (obj == null) {
                    firebaseInstanceId.zzb(str);
                    if (FirebaseInstanceId.zzm()) {
                        Log.d(str2, "subscribe operation succeeded");
                    }
                } else if (obj == 1) {
                    firebaseInstanceId.zzc(str);
                    if (FirebaseInstanceId.zzm()) {
                        Log.d(str2, "unsubscribe operation succeeded");
                    }
                }
            } catch (IOException e) {
                str = "Topic sync failed: ";
                String valueOf = String.valueOf(e.getMessage());
                Log.e(str2, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                return false;
            }
        }
        return true;
    }
}
