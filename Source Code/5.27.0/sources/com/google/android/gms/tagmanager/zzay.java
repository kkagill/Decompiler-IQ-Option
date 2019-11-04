package com.google.android.gms.tagmanager;

import java.util.Arrays;

final class zzay {
    final String zzagg;
    final byte[] zzagh;

    zzay(String str, byte[] bArr) {
        this.zzagg = str;
        this.zzagh = bArr;
    }

    public final String toString() {
        String str = this.zzagg;
        int hashCode = Arrays.hashCode(this.zzagh);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 54);
        stringBuilder.append("KeyAndSerialized: key = ");
        stringBuilder.append(str);
        stringBuilder.append(" serialized hash = ");
        stringBuilder.append(hashCode);
        return stringBuilder.toString();
    }
}
