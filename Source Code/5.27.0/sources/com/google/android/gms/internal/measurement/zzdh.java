package com.google.android.gms.internal.measurement;

import java.io.IOException;

public abstract class zzdh<MessageType extends zzdf<MessageType, BuilderType>, BuilderType extends zzdh<MessageType, BuilderType>> implements zzgh {
    public abstract BuilderType zza(MessageType messageType);

    public abstract BuilderType zza(zzeb zzeb, zzel zzel);

    /* renamed from: zzru */
    public abstract BuilderType clone();

    public final BuilderType zzf(byte[] bArr, zzel zzel) {
        return zza(bArr, 0, bArr.length, zzel);
    }

    public BuilderType zza(byte[] bArr, int i, int i2, zzel zzel) {
        try {
            zzeb zza = zzeb.zza(bArr, 0, i2, false);
            zza(zza, zzel);
            zza.zzat(0);
            return this;
        } catch (zzfi e) {
            throw e;
        } catch (IOException e2) {
            String str = "byte array";
            String name = getClass().getName();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 60) + str.length());
            stringBuilder.append("Reading ");
            stringBuilder.append(name);
            stringBuilder.append(" from a ");
            stringBuilder.append(str);
            stringBuilder.append(" threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), e2);
        }
    }
}
