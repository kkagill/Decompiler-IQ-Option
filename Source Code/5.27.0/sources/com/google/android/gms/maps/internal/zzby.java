package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;

public final class zzby {
    private zzby() {
    }

    private static <T extends Parcelable> T zza(@Nullable Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(zzby.class.getClassLoader());
        bundle = bundle.getBundle("map_state");
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(zzby.class.getClassLoader());
        return bundle.getParcelable(str);
    }

    public static void zza(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            String str = "MapOptions";
            Parcelable zza = zza(bundle, str);
            if (zza != null) {
                zza(bundle2, str, zza);
            }
            str = "StreetViewPanoramaOptions";
            zza = zza(bundle, str);
            if (zza != null) {
                zza(bundle2, str, zza);
            }
            str = "camera";
            zza = zza(bundle, str);
            if (zza != null) {
                zza(bundle2, str, zza);
            }
            str = "position";
            if (bundle.containsKey(str)) {
                bundle2.putString(str, bundle.getString(str));
            }
            str = "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT";
            if (bundle.containsKey(str)) {
                bundle2.putBoolean(str, bundle.getBoolean(str, false));
            }
        }
    }

    public static void zza(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(zzby.class.getClassLoader());
        String str2 = "map_state";
        Bundle bundle2 = bundle.getBundle(str2);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(zzby.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle(str2, bundle2);
    }
}
