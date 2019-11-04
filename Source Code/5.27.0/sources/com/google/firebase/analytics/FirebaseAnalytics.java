package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzz;
import com.google.android.gms.measurement.internal.zzfj;
import com.google.android.gms.measurement.internal.zzhi;
import com.google.android.gms.measurement.internal.zzr;
import com.google.firebase.iid.FirebaseInstanceId;

public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics abw;
    private final zzz abx;
    private final Object aby;
    private final zzfj zzj;
    private final boolean zzl;

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (abw == null) {
            synchronized (FirebaseAnalytics.class) {
                if (abw == null) {
                    if (zzz.zzf(context)) {
                        abw = new FirebaseAnalytics(zzz.zza(context));
                    } else {
                        abw = new FirebaseAnalytics(zzfj.zza(context, null));
                    }
                }
            }
        }
        return abw;
    }

    @MainThread
    @Keep
    public final void setCurrentScreen(@NonNull Activity activity, @Size(max = 36, min = 1) @Nullable String str, @Size(max = 36, min = 1) @Nullable String str2) {
        if (this.zzl) {
            this.abx.setCurrentScreen(activity, str, str2);
        } else if (zzr.isMainThread()) {
            this.zzj.zzt().setCurrentScreen(activity, str, str2);
        } else {
            this.zzj.zzab().zzgn().zzao("setCurrentScreen must be called from the main thread");
        }
    }

    private FirebaseAnalytics(zzfj zzfj) {
        Preconditions.checkNotNull(zzfj);
        this.zzj = zzfj;
        this.abx = null;
        this.zzl = false;
        this.aby = new Object();
    }

    private FirebaseAnalytics(zzz zzz) {
        Preconditions.checkNotNull(zzz);
        this.zzj = null;
        this.abx = zzz;
        this.zzl = true;
        this.aby = new Object();
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.getInstance().getId();
    }

    @Keep
    public static zzhi getScionFrontendApiImplementation(Context context, Bundle bundle) {
        if (!zzz.zzf(context)) {
            return null;
        }
        zzz zza = zzz.zza(context, null, null, null, bundle);
        if (zza == null) {
            return null;
        }
        return new a(zza);
    }
}
