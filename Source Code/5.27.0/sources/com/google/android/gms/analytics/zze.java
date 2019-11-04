package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;

@VisibleForTesting
public final class zze implements zzo {
    private static final Uri zzrh;
    private final LogPrinter zzsb = new LogPrinter(4, "GA/LogCatTransport");

    public final Uri zzae() {
        return zzrh;
    }

    public final void zzb(zzg zzg) {
        ArrayList arrayList = new ArrayList(zzg.zzaj());
        Collections.sort(arrayList, new zzf(this));
        StringBuilder stringBuilder = new StringBuilder();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String obj2 = ((zzi) obj).toString();
            if (!TextUtils.isEmpty(obj2)) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(obj2);
            }
        }
        this.zzsb.println(stringBuilder.toString());
    }

    static {
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority(ImagesContract.LOCAL);
        zzrh = builder.build();
    }
}
