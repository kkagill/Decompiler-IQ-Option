package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.FirebaseApp;
import com.google.firebase.a;
import com.google.firebase.a.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b implements a {
    private static volatile a abz;
    @VisibleForTesting
    private final AppMeasurement abA;
    @VisibleForTesting
    final Map<String, Object> abB = new ConcurrentHashMap();

    private b(AppMeasurement appMeasurement) {
        Preconditions.checkNotNull(appMeasurement);
        this.abA = appMeasurement;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    public static a a(FirebaseApp firebaseApp, Context context, d dVar) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (abz == null) {
            synchronized (b.class) {
                if (abz == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.vR()) {
                        dVar.a(a.class, d.abK, c.abJ);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    abz = new b(AppMeasurement.zza(context, bundle));
                }
            }
        }
        return abz;
    }

    @KeepForSdk
    public void logEvent(@NonNull String str, @NonNull String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.ca(str) && com.google.firebase.analytics.connector.internal.b.e(str2, bundle) && com.google.firebase.analytics.connector.internal.b.b(str, str2, bundle)) {
            this.abA.logEventInternal(str, str2, bundle);
        }
    }

    @KeepForSdk
    public void setUserProperty(@NonNull String str, @NonNull String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.ca(str) && com.google.firebase.analytics.connector.internal.b.N(str, str2)) {
            this.abA.setUserPropertyInternal(str, str2, obj);
        }
    }

    static final /* synthetic */ void a(com.google.firebase.a.a aVar) {
        boolean z = ((a) aVar.ws()).enabled;
        synchronized (b.class) {
            ((b) abz).abA.zza(z);
        }
    }
}
