package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzfj;
import com.google.android.gms.measurement.internal.zzgg;
import com.google.android.gms.measurement.internal.zzgi;
import com.google.android.gms.measurement.internal.zzgj;
import com.google.android.gms.measurement.internal.zzgk;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzhi;
import com.google.android.gms.measurement.internal.zzho;
import com.google.android.gms.measurement.internal.zzjn;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ShowFirstParty
@Deprecated
public class AppMeasurement {
    @ShowFirstParty
    @KeepForSdk
    public static final String CRASH_ORIGIN = "crash";
    @ShowFirstParty
    @KeepForSdk
    public static final String FCM_ORIGIN = "fcm";
    @ShowFirstParty
    @KeepForSdk
    public static final String FIAM_ORIGIN = "fiam";
    private static volatile AppMeasurement zzi;
    private final zzfj zzj;
    private final zzhi zzk;
    private final boolean zzl;

    @ShowFirstParty
    @KeepForSdk
    public static class ConditionalUserProperty {
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public boolean mActive;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mAppId;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mName;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mOrigin;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mTriggerEventName;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggeredTimestamp;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            Preconditions.checkNotNull(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                this.mValue = zzho.zza(obj);
                if (this.mValue == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            Bundle bundle = conditionalUserProperty.mTimedOutEventParams;
            if (bundle != null) {
                this.mTimedOutEventParams = new Bundle(bundle);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            bundle = conditionalUserProperty.mTriggeredEventParams;
            if (bundle != null) {
                this.mTriggeredEventParams = new Bundle(bundle);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            Bundle bundle2 = conditionalUserProperty.mExpiredEventParams;
            if (bundle2 != null) {
                this.mExpiredEventParams = new Bundle(bundle2);
            }
        }

        private ConditionalUserProperty(@NonNull Bundle bundle) {
            Preconditions.checkNotNull(bundle);
            this.mAppId = (String) zzgg.zza(bundle, "app_id", String.class, null);
            this.mOrigin = (String) zzgg.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null);
            this.mName = (String) zzgg.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null);
            this.mValue = zzgg.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
            this.mTriggerEventName = (String) zzgg.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            Long valueOf = Long.valueOf(0);
            this.mTriggerTimeout = ((Long) zzgg.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, valueOf)).longValue();
            this.mTimedOutEventName = (String) zzgg.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            this.mTimedOutEventParams = (Bundle) zzgg.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            this.mTriggeredEventName = (String) zzgg.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            this.mTriggeredEventParams = (Bundle) zzgg.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            this.mTimeToLive = ((Long) zzgg.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, valueOf)).longValue();
            this.mExpiredEventName = (String) zzgg.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            this.mExpiredEventParams = (Bundle) zzgg.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        }

        private final Bundle zzd() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            str = this.mOrigin;
            if (str != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str);
            }
            str = this.mName;
            if (str != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, str);
            }
            Object obj = this.mValue;
            if (obj != null) {
                zzgg.zza(bundle, obj);
            }
            str = this.mTriggerEventName;
            if (str != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, this.mTriggerTimeout);
            str = this.mTimedOutEventName;
            if (str != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
            }
            str = this.mTriggeredEventName;
            if (str != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str);
            }
            bundle2 = this.mTriggeredEventParams;
            if (bundle2 != null) {
                bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle2);
            }
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, this.mTimeToLive);
            str = this.mExpiredEventName;
            if (str != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str);
            }
            bundle2 = this.mExpiredEventParams;
            if (bundle2 != null) {
                bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle2);
            }
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, this.mCreationTimestamp);
            bundle.putBoolean(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, this.mActive);
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, this.mTriggeredTimestamp);
            return bundle;
        }

        /* synthetic */ ConditionalUserProperty(Bundle bundle, zza zza) {
            this(bundle);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static final class Event extends zzgj {
        @ShowFirstParty
        @KeepForSdk
        public static final String AD_REWARD = "_ar";
        @ShowFirstParty
        @KeepForSdk
        public static final String APP_EXCEPTION = "_ae";

        private Event() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public interface EventInterceptor extends zzgk {
        @WorkerThread
        @ShowFirstParty
        @KeepForSdk
        void interceptEvent(String str, String str2, Bundle bundle, long j);
    }

    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends zzgn {
        @WorkerThread
        @ShowFirstParty
        @KeepForSdk
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    @ShowFirstParty
    @KeepForSdk
    public static final class Param extends zzgi {
        @ShowFirstParty
        @KeepForSdk
        public static final String FATAL = "fatal";
        @ShowFirstParty
        @KeepForSdk
        public static final String TIMESTAMP = "timestamp";
        @ShowFirstParty
        @KeepForSdk
        public static final String TYPE = "type";

        private Param() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static final class UserProperty extends zzgl {
        @ShowFirstParty
        @KeepForSdk
        public static final String FIREBASE_LAST_NOTIFICATION = "_ln";

        private UserProperty() {
        }
    }

    @ShowFirstParty
    @Keep
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return zza(context, null, null);
    }

    @VisibleForTesting
    private static AppMeasurement zza(Context context, String str, String str2) {
        if (zzi == null) {
            synchronized (AppMeasurement.class) {
                if (zzi == null) {
                    zzhi zzb = zzb(context, null);
                    if (zzb != null) {
                        zzi = new AppMeasurement(zzb);
                    } else {
                        zzi = new AppMeasurement(zzfj.zza(context, null, null, null));
                    }
                }
            }
        }
        return zzi;
    }

    public static AppMeasurement zza(Context context, Bundle bundle) {
        if (zzi == null) {
            synchronized (AppMeasurement.class) {
                if (zzi == null) {
                    zzhi zzb = zzb(context, bundle);
                    if (zzb != null) {
                        zzi = new AppMeasurement(zzb);
                    } else {
                        zzi = new AppMeasurement(zzfj.zza(context, null, null, bundle));
                    }
                }
            }
        }
        return zzi;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    private static com.google.android.gms.measurement.internal.zzhi zzb(android.content.Context r8, android.os.Bundle r9) {
        /*
        r0 = 0;
        r1 = "com.google.firebase.analytics.FirebaseAnalytics";
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0027 }
        r2 = "getScionFrontendApiImplementation";
        r3 = 2;
        r4 = new java.lang.Class[r3];	 Catch:{  }
        r5 = android.content.Context.class;
        r6 = 0;
        r4[r6] = r5;	 Catch:{  }
        r5 = android.os.Bundle.class;
        r7 = 1;
        r4[r7] = r5;	 Catch:{  }
        r1 = r1.getDeclaredMethod(r2, r4);	 Catch:{  }
        r2 = new java.lang.Object[r3];	 Catch:{  }
        r2[r6] = r8;	 Catch:{  }
        r2[r7] = r9;	 Catch:{  }
        r8 = r1.invoke(r0, r2);	 Catch:{  }
        r8 = (com.google.android.gms.measurement.internal.zzhi) r8;	 Catch:{  }
        return r8;
    L_0x0027:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.zzb(android.content.Context, android.os.Bundle):com.google.android.gms.measurement.internal.zzhi");
    }

    @KeepForSdk
    @Deprecated
    public void setMeasurementEnabled(boolean z) {
        if (this.zzl) {
            this.zzk.setMeasurementEnabled(z);
        } else {
            this.zzj.zzq().setMeasurementEnabled(z);
        }
    }

    public final void zza(boolean z) {
        if (this.zzl) {
            this.zzk.setDataCollectionEnabled(z);
        } else {
            this.zzj.zzq().zza(z);
        }
    }

    private AppMeasurement(zzfj zzfj) {
        Preconditions.checkNotNull(zzfj);
        this.zzj = zzfj;
        this.zzk = null;
        this.zzl = false;
    }

    private AppMeasurement(zzhi zzhi) {
        Preconditions.checkNotNull(zzhi);
        this.zzk = zzhi;
        this.zzj = null;
        this.zzl = true;
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.zzl) {
            this.zzk.logEventInternal(str, str2, bundle);
        } else {
            this.zzj.zzq().logEvent(str, str2, bundle);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j) {
        if (this.zzl) {
            this.zzk.logEventInternalNoInterceptor(str, str2, bundle, j);
        } else {
            this.zzj.zzq().logEvent(str, str2, bundle, true, false, j);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public void setUserPropertyInternal(String str, String str2, Object obj) {
        Preconditions.checkNotEmpty(str);
        if (this.zzl) {
            this.zzk.setUserPropertyInternal(str, str2, obj);
        } else {
            this.zzj.zzq().zzb(str, str2, obj, true);
        }
    }

    @WorkerThread
    @ShowFirstParty
    @KeepForSdk
    public Map<String, Object> getUserProperties(boolean z) {
        if (this.zzl) {
            return this.zzk.getUserProperties(null, null, z);
        }
        List<zzjn> zzh = this.zzj.zzq().zzh(z);
        ArrayMap arrayMap = new ArrayMap(zzh.size());
        for (zzjn zzjn : zzh) {
            arrayMap.put(zzjn.name, zzjn.getValue());
        }
        return arrayMap;
    }

    @WorkerThread
    @ShowFirstParty
    @KeepForSdk
    public void setEventInterceptor(EventInterceptor eventInterceptor) {
        if (this.zzl) {
            this.zzk.zza((zzgk) eventInterceptor);
        } else {
            this.zzj.zzq().zza((zzgk) eventInterceptor);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        if (this.zzl) {
            this.zzk.zza((zzgn) onEventListener);
        } else {
            this.zzj.zzq().zza((zzgn) onEventListener);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
        if (this.zzl) {
            this.zzk.zzb((zzgn) onEventListener);
        } else {
            this.zzj.zzq().zzb(onEventListener);
        }
    }

    @Keep
    @Nullable
    public String getCurrentScreenName() {
        if (this.zzl) {
            return this.zzk.getCurrentScreenName();
        }
        return this.zzj.zzq().getCurrentScreenName();
    }

    @Keep
    @Nullable
    public String getCurrentScreenClass() {
        if (this.zzl) {
            return this.zzk.getCurrentScreenClass();
        }
        return this.zzj.zzq().getCurrentScreenClass();
    }

    @Keep
    @Nullable
    public String getAppInstanceId() {
        if (this.zzl) {
            return this.zzk.zzi();
        }
        return this.zzj.zzq().zzi();
    }

    @Keep
    @Nullable
    public String getGmpAppId() {
        if (this.zzl) {
            return this.zzk.getGmpAppId();
        }
        return this.zzj.zzq().getGmpAppId();
    }

    @Keep
    public long generateEventId() {
        if (this.zzl) {
            return this.zzk.generateEventId();
        }
        return this.zzj.zzz().zzjv();
    }

    @Keep
    public void beginAdUnitExposure(@Size(min = 1) @NonNull String str) {
        if (this.zzl) {
            this.zzk.beginAdUnitExposure(str);
        } else {
            this.zzj.zzp().beginAdUnitExposure(str, this.zzj.zzx().elapsedRealtime());
        }
    }

    @Keep
    public void endAdUnitExposure(@Size(min = 1) @NonNull String str) {
        if (this.zzl) {
            this.zzk.endAdUnitExposure(str);
        } else {
            this.zzj.zzp().endAdUnitExposure(str, this.zzj.zzx().elapsedRealtime());
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        if (this.zzl) {
            this.zzk.setConditionalUserProperty(conditionalUserProperty.zzd());
        } else {
            this.zzj.zzq().setConditionalUserProperty(conditionalUserProperty.zzd());
        }
    }

    /* Access modifiers changed, original: protected */
    @Keep
    @VisibleForTesting
    public void setConditionalUserPropertyAs(@NonNull ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        if (this.zzl) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.zzj.zzq().zzd(conditionalUserProperty.zzd());
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void clearConditionalUserProperty(@Size(max = 24, min = 1) @NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        if (this.zzl) {
            this.zzk.clearConditionalUserProperty(str, str2, bundle);
        } else {
            this.zzj.zzq().clearConditionalUserProperty(str, str2, bundle);
        }
    }

    /* Access modifiers changed, original: protected */
    @Keep
    @VisibleForTesting
    public void clearConditionalUserPropertyAs(@Size(min = 1) @NonNull String str, @Size(max = 24, min = 1) @NonNull String str2, @Nullable String str3, @Nullable Bundle bundle) {
        if (this.zzl) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.zzj.zzq().clearConditionalUserPropertyAs(str, str2, str3, bundle);
    }

    /* Access modifiers changed, original: protected */
    @WorkerThread
    @Keep
    @VisibleForTesting
    public Map<String, Object> getUserProperties(@Nullable String str, @Size(max = 24, min = 1) @Nullable String str2, boolean z) {
        if (this.zzl) {
            return this.zzk.getUserProperties(str, str2, z);
        }
        return this.zzj.zzq().getUserProperties(str, str2, z);
    }

    /* Access modifiers changed, original: protected */
    @WorkerThread
    @Keep
    @VisibleForTesting
    public Map<String, Object> getUserPropertiesAs(@Size(min = 1) @NonNull String str, @Nullable String str2, @Size(max = 23, min = 1) @Nullable String str3, boolean z) {
        if (!this.zzl) {
            return this.zzj.zzq().getUserPropertiesAs(str, str2, str3, z);
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @WorkerThread
    @ShowFirstParty
    @Keep
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(@Nullable String str, @Size(max = 23, min = 1) @Nullable String str2) {
        int i;
        List conditionalUserProperties;
        if (this.zzl) {
            conditionalUserProperties = this.zzk.getConditionalUserProperties(str, str2);
        } else {
            conditionalUserProperties = this.zzj.zzq().zzn(str, str2);
        }
        if (conditionalUserProperties == null) {
            i = 0;
        } else {
            i = conditionalUserProperties.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : conditionalUserProperties) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty, null));
        }
        return arrayList;
    }

    /* Access modifiers changed, original: protected */
    @WorkerThread
    @Keep
    @VisibleForTesting
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(@Size(min = 1) @NonNull String str, @Nullable String str2, @Size(max = 23, min = 1) @Nullable String str3) {
        if (this.zzl) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        int i;
        ArrayList zzd = this.zzj.zzq().zzd(str, str2, str3);
        int i2 = 0;
        if (zzd == null) {
            i = 0;
        } else {
            i = zzd.size();
        }
        ArrayList arrayList = new ArrayList(i);
        zzd = zzd;
        i = zzd.size();
        while (i2 < i) {
            Object obj = zzd.get(i2);
            i2++;
            arrayList.add(new ConditionalUserProperty((Bundle) obj, null));
        }
        return arrayList;
    }

    @WorkerThread
    @ShowFirstParty
    @Keep
    @KeepForSdk
    public int getMaxUserProperties(@Size(min = 1) @NonNull String str) {
        if (this.zzl) {
            return this.zzk.getMaxUserProperties(str);
        }
        this.zzj.zzq();
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    @KeepForSdk
    public Boolean getBoolean() {
        if (this.zzl) {
            return (Boolean) this.zzk.zzb(4);
        }
        return this.zzj.zzq().zzig();
    }

    @KeepForSdk
    public String getString() {
        if (this.zzl) {
            return (String) this.zzk.zzb(0);
        }
        return this.zzj.zzq().zzih();
    }

    @KeepForSdk
    public Long getLong() {
        if (this.zzl) {
            return (Long) this.zzk.zzb(1);
        }
        return this.zzj.zzq().zzii();
    }

    @KeepForSdk
    public Integer getInteger() {
        if (this.zzl) {
            return (Integer) this.zzk.zzb(3);
        }
        return this.zzj.zzq().zzij();
    }

    @KeepForSdk
    public Double getDouble() {
        if (this.zzl) {
            return (Double) this.zzk.zzb(2);
        }
        return this.zzj.zzq().zzik();
    }
}
