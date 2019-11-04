package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

public final class zzho {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A:{Catch:{ IOException | ClassNotFoundException -> 0x0040 }} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c A:{Catch:{ IOException | ClassNotFoundException -> 0x0040 }} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A:{Catch:{ IOException | ClassNotFoundException -> 0x0040 }} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c A:{Catch:{ IOException | ClassNotFoundException -> 0x0040 }} */
    public static java.lang.Object zza(java.lang.Object r4) {
        /*
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = new java.io.ByteArrayOutputStream;	 Catch:{ all -> 0x0032 }
        r1.<init>();	 Catch:{ all -> 0x0032 }
        r2 = new java.io.ObjectOutputStream;	 Catch:{ all -> 0x0032 }
        r2.<init>(r1);	 Catch:{ all -> 0x0032 }
        r2.writeObject(r4);	 Catch:{ all -> 0x002f }
        r2.flush();	 Catch:{ all -> 0x002f }
        r4 = new java.io.ObjectInputStream;	 Catch:{ all -> 0x002f }
        r3 = new java.io.ByteArrayInputStream;	 Catch:{ all -> 0x002f }
        r1 = r1.toByteArray();	 Catch:{ all -> 0x002f }
        r3.<init>(r1);	 Catch:{ all -> 0x002f }
        r4.<init>(r3);	 Catch:{ all -> 0x002f }
        r1 = r4.readObject();	 Catch:{ all -> 0x002d }
        r2.close();	 Catch:{ IOException | ClassNotFoundException -> 0x0040, IOException | ClassNotFoundException -> 0x0040 }
        r4.close();	 Catch:{ IOException | ClassNotFoundException -> 0x0040, IOException | ClassNotFoundException -> 0x0040 }
        return r1;
    L_0x002d:
        r1 = move-exception;
        goto L_0x0035;
    L_0x002f:
        r1 = move-exception;
        r4 = r0;
        goto L_0x0035;
    L_0x0032:
        r1 = move-exception;
        r4 = r0;
        r2 = r4;
    L_0x0035:
        if (r2 == 0) goto L_0x003a;
    L_0x0037:
        r2.close();	 Catch:{ IOException | ClassNotFoundException -> 0x0040, IOException | ClassNotFoundException -> 0x0040 }
    L_0x003a:
        if (r4 == 0) goto L_0x003f;
    L_0x003c:
        r4.close();	 Catch:{ IOException | ClassNotFoundException -> 0x0040, IOException | ClassNotFoundException -> 0x0040 }
    L_0x003f:
        throw r1;	 Catch:{ IOException | ClassNotFoundException -> 0x0040, IOException | ClassNotFoundException -> 0x0040 }
    L_0x0040:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzho.zza(java.lang.Object):java.lang.Object");
    }

    @Nullable
    public static String zza(String str, String[] strArr, String[] strArr2) {
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            Object obj = strArr[i];
            boolean equals = (str == null && obj == null) ? true : str == null ? false : str.equals(obj);
            if (equals) {
                return strArr2[i];
            }
        }
        return null;
    }
}
