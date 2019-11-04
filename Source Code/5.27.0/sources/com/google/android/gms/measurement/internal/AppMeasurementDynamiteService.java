package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzp;
import com.google.android.gms.internal.measurement.zzq;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.internal.measurement.zzx;
import java.util.Map;

@DynamiteApi
public class AppMeasurementDynamiteService extends zzn {
    private Map<Integer, zzgn> zzdk = new ArrayMap();
    @VisibleForTesting
    zzfj zzj = null;

    class zza implements zzgn {
        private zzq zzdo;

        zza(zzq zzq) {
            this.zzdo = zzq;
        }

        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.zzdo.onEvent(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.zzj.zzab().zzgn().zza("Event listener threw exception", e);
            }
        }
    }

    class zzb implements zzgk {
        private zzq zzdo;

        zzb(zzq zzq) {
            this.zzdo = zzq;
        }

        public final void interceptEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.zzdo.onEvent(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.zzj.zzab().zzgn().zza("Event interceptor threw exception", e);
            }
        }
    }

    private final void zzbi() {
        if (this.zzj == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void initialize(IObjectWrapper iObjectWrapper, zzx zzx, long j) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfj zzfj = this.zzj;
        if (zzfj == null) {
            this.zzj = zzfj.zza(context, zzx);
        } else {
            zzfj.zzab().zzgn().zzao("Attempting to initialize multiple times");
        }
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        zzbi();
        this.zzj.zzq().logEvent(str, str2, bundle, z, z2, j);
    }

    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) {
        zzbi();
        this.zzj.zzq().zza(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    public void setUserId(String str, long j) {
        zzbi();
        this.zzj.zzq().zza(null, "_id", str, true, j);
    }

    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) {
        zzbi();
        this.zzj.zzt().setCurrentScreen((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    public void setMeasurementEnabled(boolean z, long j) {
        zzbi();
        this.zzj.zzq().setMeasurementEnabled(z);
    }

    public void resetAnalyticsData(long j) {
        zzbi();
        this.zzj.zzq().resetAnalyticsData(j);
    }

    public void setMinimumSessionDuration(long j) {
        zzbi();
        this.zzj.zzq().setMinimumSessionDuration(j);
    }

    public void setSessionTimeoutDuration(long j) {
        zzbi();
        this.zzj.zzq().setSessionTimeoutDuration(j);
    }

    public void getMaxUserProperties(String str, zzp zzp) {
        zzbi();
        this.zzj.zzq();
        Preconditions.checkNotEmpty(str);
        this.zzj.zzz().zza(zzp, 25);
    }

    public void getCurrentScreenName(zzp zzp) {
        zzbi();
        zza(zzp, this.zzj.zzq().getCurrentScreenName());
    }

    public void getCurrentScreenClass(zzp zzp) {
        zzbi();
        zza(zzp, this.zzj.zzq().getCurrentScreenClass());
    }

    public void getCachedAppInstanceId(zzp zzp) {
        zzbi();
        zza(zzp, this.zzj.zzq().zzi());
    }

    public void getAppInstanceId(zzp zzp) {
        zzbi();
        this.zzj.zzaa().zza(new zzh(this, zzp));
    }

    public void getDeepLink(zzp zzp) {
        zzbi();
        zzgp zzq = this.zzj.zzq();
        zzq.zzo();
        String str = "";
        if (!zzq.zzad().zzd(null, zzak.zzjc)) {
            zzq.zzz().zzb(zzp, str);
        } else if (zzq.zzac().zzme.get() > 0) {
            zzq.zzz().zzb(zzp, str);
        } else {
            zzq.zzac().zzme.set(zzq.zzx().currentTimeMillis());
            zzq.zzj.zza(zzp);
        }
    }

    public void getGmpAppId(zzp zzp) {
        zzbi();
        zza(zzp, this.zzj.zzq().getGmpAppId());
    }

    public void generateEventId(zzp zzp) {
        zzbi();
        this.zzj.zzz().zza(zzp, this.zzj.zzz().zzjv());
    }

    public void beginAdUnitExposure(String str, long j) {
        zzbi();
        this.zzj.zzp().beginAdUnitExposure(str, j);
    }

    public void endAdUnitExposure(String str, long j) {
        zzbi();
        this.zzj.zzp().endAdUnitExposure(str, j);
    }

    public void initForTests(Map map) {
        zzbi();
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzp zzp, long j) {
        zzbi();
        Preconditions.checkNotEmpty(str2);
        String str3 = "app";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        this.zzj.zzaa().zza(new zzj(this, zzp, new zzai(str2, new zzah(bundle), str3, j), str));
    }

    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) {
        zzbi();
        zzhj zzhj = this.zzj.zzq().zzpu;
        if (zzhj != null) {
            this.zzj.zzq().zzif();
            zzhj.onActivityStarted((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) {
        zzbi();
        zzhj zzhj = this.zzj.zzq().zzpu;
        if (zzhj != null) {
            this.zzj.zzq().zzif();
            zzhj.onActivityStopped((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) {
        zzbi();
        zzhj zzhj = this.zzj.zzq().zzpu;
        if (zzhj != null) {
            this.zzj.zzq().zzif();
            zzhj.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) {
        zzbi();
        zzhj zzhj = this.zzj.zzq().zzpu;
        if (zzhj != null) {
            this.zzj.zzq().zzif();
            zzhj.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) {
        zzbi();
        zzhj zzhj = this.zzj.zzq().zzpu;
        if (zzhj != null) {
            this.zzj.zzq().zzif();
            zzhj.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) {
        zzbi();
        zzhj zzhj = this.zzj.zzq().zzpu;
        if (zzhj != null) {
            this.zzj.zzq().zzif();
            zzhj.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzp zzp, long j) {
        zzbi();
        zzhj zzhj = this.zzj.zzq().zzpu;
        Bundle bundle = new Bundle();
        if (zzhj != null) {
            this.zzj.zzq().zzif();
            zzhj.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzp.zzb(bundle);
        } catch (RemoteException e) {
            this.zzj.zzab().zzgn().zza("Error returning bundle value to wrapper", e);
        }
    }

    public void performAction(Bundle bundle, zzp zzp, long j) {
        zzbi();
        zzp.zzb(null);
    }

    public void getUserProperties(String str, String str2, boolean z, zzp zzp) {
        zzbi();
        this.zzj.zzaa().zza(new zzi(this, zzp, str, str2, z));
    }

    public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Object obj;
        Object obj2;
        zzbi();
        Object obj3 = null;
        if (iObjectWrapper == null) {
            obj = null;
        } else {
            obj = ObjectWrapper.unwrap(iObjectWrapper);
        }
        if (iObjectWrapper2 == null) {
            obj2 = null;
        } else {
            obj2 = ObjectWrapper.unwrap(iObjectWrapper2);
        }
        if (iObjectWrapper3 != null) {
            obj3 = ObjectWrapper.unwrap(iObjectWrapper3);
        }
        this.zzj.zzab().zza(i, true, false, str, obj, obj2, obj3);
    }

    public void setEventInterceptor(zzq zzq) {
        zzbi();
        zzgp zzq2 = this.zzj.zzq();
        zzb zzb = new zzb(zzq);
        zzq2.zzm();
        zzq2.zzbi();
        zzq2.zzaa().zza(new zzgu(zzq2, zzb));
    }

    public void registerOnMeasurementEventListener(zzq zzq) {
        zzbi();
        zzgn zzgn = (zzgn) this.zzdk.get(Integer.valueOf(zzq.id()));
        if (zzgn == null) {
            zzgn = new zza(zzq);
            this.zzdk.put(Integer.valueOf(zzq.id()), zzgn);
        }
        this.zzj.zzq().zza(zzgn);
    }

    public void unregisterOnMeasurementEventListener(zzq zzq) {
        zzbi();
        zzgn zzgn = (zzgn) this.zzdk.remove(Integer.valueOf(zzq.id()));
        if (zzgn == null) {
            zzgn = new zza(zzq);
        }
        this.zzj.zzq().zzb(zzgn);
    }

    public void setInstanceIdProvider(zzv zzv) {
        zzbi();
    }

    public void setConditionalUserProperty(Bundle bundle, long j) {
        zzbi();
        if (bundle == null) {
            this.zzj.zzab().zzgk().zzao("Conditional user property must not be null");
        } else {
            this.zzj.zzq().setConditionalUserProperty(bundle, j);
        }
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzbi();
        this.zzj.zzq().clearConditionalUserProperty(str, str2, bundle);
    }

    public void getConditionalUserProperties(String str, String str2, zzp zzp) {
        zzbi();
        this.zzj.zzaa().zza(new zzl(this, zzp, str, str2));
    }

    public void getTestFlag(zzp zzp, int i) {
        zzbi();
        if (i == 0) {
            this.zzj.zzz().zzb(zzp, this.zzj.zzq().zzih());
        } else if (i == 1) {
            this.zzj.zzz().zza(zzp, this.zzj.zzq().zzii().longValue());
        } else if (i == 2) {
            zzjs zzz = this.zzj.zzz();
            double doubleValue = this.zzj.zzq().zzik().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzp.zzb(bundle);
            } catch (RemoteException e) {
                zzz.zzj.zzab().zzgn().zza("Error returning double value to wrapper", e);
            }
        } else if (i != 3) {
            if (i == 4) {
                this.zzj.zzz().zza(zzp, this.zzj.zzq().zzig().booleanValue());
            }
        } else {
            this.zzj.zzz().zza(zzp, this.zzj.zzq().zzij().intValue());
        }
    }

    private final void zza(zzp zzp, String str) {
        this.zzj.zzz().zzb(zzp, str);
    }

    public void setDataCollectionEnabled(boolean z) {
        zzbi();
        this.zzj.zzq().zza(z);
    }

    public void isDataCollectionEnabled(zzp zzp) {
        zzbi();
        this.zzj.zzaa().zza(new zzk(this, zzp));
    }
}
