package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

public interface zzk extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void endAdUnitExposure(String str, long j);

    void generateEventId(zzp zzp);

    void getAppInstanceId(zzp zzp);

    void getCachedAppInstanceId(zzp zzp);

    void getConditionalUserProperties(String str, String str2, zzp zzp);

    void getCurrentScreenClass(zzp zzp);

    void getCurrentScreenName(zzp zzp);

    void getDeepLink(zzp zzp);

    void getGmpAppId(zzp zzp);

    void getMaxUserProperties(String str, zzp zzp);

    void getTestFlag(zzp zzp, int i);

    void getUserProperties(String str, String str2, boolean z, zzp zzp);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, zzx zzx, long j);

    void isDataCollectionEnabled(zzp zzp);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzp zzp, long j);

    void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzp zzp, long j);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j);

    void performAction(Bundle bundle, zzp zzp, long j);

    void registerOnMeasurementEventListener(zzq zzq);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setEventInterceptor(zzq zzq);

    void setInstanceIdProvider(zzv zzv);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j);

    void unregisterOnMeasurementEventListener(zzq zzq);
}
