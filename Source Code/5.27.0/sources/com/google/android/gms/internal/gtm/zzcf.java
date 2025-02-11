package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

public final class zzcf extends zzm implements zzce {
    zzcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    public final void zza(Map map, long j, String str, List<zzbk> list) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeMap(map);
        obtainAndWriteInterfaceToken.writeLong(j);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeTypedList(list);
        zza(1, obtainAndWriteInterfaceToken);
    }

    public final void zzch() {
        zza(2, obtainAndWriteInterfaceToken());
    }
}
