package com.google.android.gms.auth;

import android.os.IBinder;
import com.google.android.gms.internal.auth.zzf;
import java.util.List;

final class zzg implements zzj<List<AccountChangeEvent>> {
    private final /* synthetic */ String zzr;
    private final /* synthetic */ int zzs;

    zzg(String str, int i) {
        this.zzr = str;
        this.zzs = i;
    }

    public final /* synthetic */ Object zzb(IBinder iBinder) {
        return ((AccountChangeEventsResponse) zzd.zza(zzf.zza(iBinder).zza(new AccountChangeEventsRequest().setAccountName(this.zzr).setEventIndex(this.zzs)))).getEvents();
    }
}
