package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzz;
import com.google.android.gms.measurement.internal.zzgk;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzhi;
import java.util.List;
import java.util.Map;

final class a implements zzhi {
    private final /* synthetic */ zzz abL;

    a(zzz zzz) {
        this.abL = zzz;
    }

    public final void logEventInternal(String str, String str2, Bundle bundle) {
        this.abL.logEventInternal(str, str2, bundle);
    }

    public final void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j) {
        this.abL.logEventInternalNoInterceptor(str, str2, bundle, j);
    }

    public final void setUserPropertyInternal(String str, String str2, Object obj) {
        this.abL.setUserPropertyInternal(str, str2, obj);
    }

    public final void setMeasurementEnabled(boolean z) {
        this.abL.setMeasurementEnabled(z);
    }

    public final void setDataCollectionEnabled(boolean z) {
        this.abL.setDataCollectionEnabled(z);
    }

    public final Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.abL.getUserProperties(str, str2, z);
    }

    public final void zza(zzgk zzgk) {
        this.abL.zza(zzgk);
    }

    public final void zza(zzgn zzgn) {
        this.abL.zza(zzgn);
    }

    public final void zzb(zzgn zzgn) {
        this.abL.zzb(zzgn);
    }

    public final String getCurrentScreenName() {
        return this.abL.getCurrentScreenName();
    }

    public final String getCurrentScreenClass() {
        return this.abL.getCurrentScreenClass();
    }

    public final String zzi() {
        return this.abL.zzi();
    }

    public final String getGmpAppId() {
        return this.abL.getGmpAppId();
    }

    public final long generateEventId() {
        return this.abL.generateEventId();
    }

    public final void beginAdUnitExposure(String str) {
        this.abL.beginAdUnitExposure(str);
    }

    public final void endAdUnitExposure(String str) {
        this.abL.endAdUnitExposure(str);
    }

    public final void setConditionalUserProperty(Bundle bundle) {
        this.abL.setConditionalUserProperty(bundle);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.abL.clearConditionalUserProperty(str, str2, bundle);
    }

    public final List<Bundle> getConditionalUserProperties(String str, String str2) {
        return this.abL.getConditionalUserProperties(str, str2);
    }

    public final int getMaxUserProperties(String str) {
        return this.abL.getMaxUserProperties(str);
    }

    public final Object zzb(int i) {
        return this.abL.zzb(i);
    }
}
