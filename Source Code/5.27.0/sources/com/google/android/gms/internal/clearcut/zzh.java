package com.google.android.gms.internal.clearcut;

import android.util.Log;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

final class zzh extends ApiMethodImpl<Status, zzj> {
    private final zze zzao;

    zzh(zze zze, GoogleApiClient googleApiClient) {
        super(ClearcutLogger.API, googleApiClient);
        this.zzao = zze;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void doExecute(AnyClient anyClient) {
        zzj zzj = (zzj) anyClient;
        zzi zzi = new zzi(this);
        try {
            zze zze = this.zzao;
            if (zze.zzt != null && zze.zzaa.zzbjp.length == 0) {
                zze.zzaa.zzbjp = zze.zzt.zza();
            }
            if (zze.zzan != null && zze.zzaa.zzbjw.length == 0) {
                zze.zzaa.zzbjw = zze.zzan.zza();
            }
            zzha zzha = zze.zzaa;
            byte[] bArr = new byte[zzha.zzas()];
            zzfz.zza(zzha, bArr, 0, bArr.length);
            zze.zzah = bArr;
            ((zzn) zzj.getService()).zza(zzi, this.zzao);
        } catch (RuntimeException e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            setFailedResult(new Status(10, "MessageProducer"));
        }
    }
}
