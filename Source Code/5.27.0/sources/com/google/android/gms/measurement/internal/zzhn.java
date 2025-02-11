package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.List;
import java.util.Map;

@WorkerThread
final class zzhn implements Runnable {
    private final String packageName;
    private final URL url;
    private final byte[] zzlc = null;
    private final Map<String, String> zzle;
    private final zzhk zzqm;
    private final /* synthetic */ zzhl zzqn;

    public zzhn(zzhl zzhl, String str, URL url, byte[] bArr, Map<String, String> map, zzhk zzhk) {
        this.zzqn = zzhl;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzhk);
        this.url = url;
        this.zzqm = zzhk;
        this.packageName = str;
        this.zzle = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    public final void run() {
        /*
        r7 = this;
        r0 = r7.zzqn;
        r0.zzn();
        r0 = 0;
        r1 = 0;
        r2 = r7.zzqn;	 Catch:{ IOException -> 0x0077, all -> 0x006a }
        r3 = r7.url;	 Catch:{ IOException -> 0x0077, all -> 0x006a }
        r2 = r2.zza(r3);	 Catch:{ IOException -> 0x0077, all -> 0x006a }
        r3 = r7.zzle;	 Catch:{ IOException -> 0x0067, all -> 0x0064 }
        if (r3 == 0) goto L_0x0039;
    L_0x0013:
        r3 = r7.zzle;	 Catch:{ IOException -> 0x0067, all -> 0x0064 }
        r3 = r3.entrySet();	 Catch:{ IOException -> 0x0067, all -> 0x0064 }
        r3 = r3.iterator();	 Catch:{ IOException -> 0x0067, all -> 0x0064 }
    L_0x001d:
        r4 = r3.hasNext();	 Catch:{ IOException -> 0x0067, all -> 0x0064 }
        if (r4 == 0) goto L_0x0039;
    L_0x0023:
        r4 = r3.next();	 Catch:{ IOException -> 0x0067, all -> 0x0064 }
        r4 = (java.util.Map.Entry) r4;	 Catch:{ IOException -> 0x0067, all -> 0x0064 }
        r5 = r4.getKey();	 Catch:{ IOException -> 0x0067, all -> 0x0064 }
        r5 = (java.lang.String) r5;	 Catch:{ IOException -> 0x0067, all -> 0x0064 }
        r4 = r4.getValue();	 Catch:{ IOException -> 0x0067, all -> 0x0064 }
        r4 = (java.lang.String) r4;	 Catch:{ IOException -> 0x0067, all -> 0x0064 }
        r2.addRequestProperty(r5, r4);	 Catch:{ IOException -> 0x0067, all -> 0x0064 }
        goto L_0x001d;
    L_0x0039:
        r1 = r2.getResponseCode();	 Catch:{ IOException -> 0x0067, all -> 0x0064 }
        r3 = r2.getHeaderFields();	 Catch:{ IOException -> 0x0060, all -> 0x005c }
        r4 = r7.zzqn;	 Catch:{ IOException -> 0x0056, all -> 0x0050 }
        r4 = com.google.android.gms.measurement.internal.zzhl.zza(r2);	 Catch:{ IOException -> 0x0056, all -> 0x0050 }
        if (r2 == 0) goto L_0x004c;
    L_0x0049:
        r2.disconnect();
    L_0x004c:
        r7.zza(r1, r0, r4, r3);
        return;
    L_0x0050:
        r4 = move-exception;
        r6 = r4;
        r4 = r1;
        r1 = r3;
        r3 = r6;
        goto L_0x006e;
    L_0x0056:
        r4 = move-exception;
        r6 = r4;
        r4 = r1;
        r1 = r3;
        r3 = r6;
        goto L_0x007b;
    L_0x005c:
        r3 = move-exception;
        r4 = r1;
        r1 = r0;
        goto L_0x006e;
    L_0x0060:
        r3 = move-exception;
        r4 = r1;
        r1 = r0;
        goto L_0x007b;
    L_0x0064:
        r3 = move-exception;
        r1 = r0;
        goto L_0x006d;
    L_0x0067:
        r3 = move-exception;
        r1 = r0;
        goto L_0x007a;
    L_0x006a:
        r3 = move-exception;
        r1 = r0;
        r2 = r1;
    L_0x006d:
        r4 = 0;
    L_0x006e:
        if (r2 == 0) goto L_0x0073;
    L_0x0070:
        r2.disconnect();
    L_0x0073:
        r7.zza(r4, r0, r0, r1);
        throw r3;
    L_0x0077:
        r3 = move-exception;
        r1 = r0;
        r2 = r1;
    L_0x007a:
        r4 = 0;
    L_0x007b:
        if (r2 == 0) goto L_0x0080;
    L_0x007d:
        r2.disconnect();
    L_0x0080:
        r7.zza(r4, r3, r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhn.run():void");
    }

    private final void zza(int i, Exception exception, byte[] bArr, Map<String, List<String>> map) {
        this.zzqn.zzaa().zza(new zzhm(this, i, exception, bArr, map));
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzb(int i, Exception exception, byte[] bArr, Map map) {
        this.zzqm.zza(this.packageName, i, exception, bArr, map);
    }
}
