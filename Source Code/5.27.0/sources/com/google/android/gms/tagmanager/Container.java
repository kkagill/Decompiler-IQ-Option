package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzj;
import com.google.android.gms.internal.gtm.zzk;
import com.google.android.gms.internal.gtm.zzl;
import com.google.android.gms.internal.gtm.zzor;
import com.google.android.gms.internal.gtm.zzov;
import com.google.android.gms.internal.gtm.zzoz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
public class Container {
    private final String zzaec;
    private final DataLayer zzaed;
    private zzfb zzaee;
    private Map<String, FunctionCallMacroCallback> zzaef = new HashMap();
    private Map<String, FunctionCallTagCallback> zzaeg = new HashMap();
    private volatile long zzaeh;
    private volatile String zzaei = "";
    private final Context zzrm;

    public interface FunctionCallMacroCallback {
        Object getValue(String str, Map<String, Object> map);
    }

    public interface FunctionCallTagCallback {
        void execute(String str, Map<String, Object> map);
    }

    class zza implements zzan {
        private zza() {
        }

        public final Object zza(String str, Map<String, Object> map) {
            FunctionCallMacroCallback zzal = Container.this.zzal(str);
            if (zzal == null) {
                return null;
            }
            return zzal.getValue(str, map);
        }

        /* synthetic */ zza(Container container, zzu zzu) {
            this();
        }
    }

    class zzb implements zzan {
        private zzb() {
        }

        public final Object zza(String str, Map<String, Object> map) {
            FunctionCallTagCallback zzam = Container.this.zzam(str);
            if (zzam != null) {
                zzam.execute(str, map);
            }
            return zzgj.zzkb();
        }

        /* synthetic */ zzb(Container container, zzu zzu) {
            this();
        }
    }

    Container(Context context, DataLayer dataLayer, String str, long j, zzov zzov) {
        this.zzrm = context;
        this.zzaed = dataLayer;
        this.zzaec = str;
        this.zzaeh = 0;
        zza(zzov);
    }

    Container(Context context, DataLayer dataLayer, String str, long j, zzk zzk) {
        this.zzrm = context;
        this.zzaed = dataLayer;
        this.zzaec = str;
        this.zzaeh = j;
        Object obj = zzk.zzqk;
        if (obj != null) {
            try {
                obj = zzor.zza(obj);
                zza((zzov) obj);
            } catch (zzoz e) {
                String valueOf = String.valueOf(obj);
                String zzoz = e.toString();
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(zzoz).length());
                stringBuilder.append("Not loading resource: ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" because it is invalid: ");
                stringBuilder.append(zzoz);
                zzdi.zzav(stringBuilder.toString());
            }
            if (zzk.zzqj != null) {
                zzj[] zzjArr = zzk.zzqj;
                ArrayList arrayList = new ArrayList();
                for (Object add : zzjArr) {
                    arrayList.add(add);
                }
                zzhb().zze(arrayList);
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    public String getContainerId() {
        return this.zzaec;
    }

    public boolean getBoolean(String str) {
        zzfb zzhb = zzhb();
        if (zzhb == null) {
            zzdi.zzav("getBoolean called for closed container.");
            return zzgj.zzjz().booleanValue();
        }
        try {
            return zzgj.zzg((zzl) zzhb.zzbj(str).getObject()).booleanValue();
        } catch (Exception e) {
            str = e.getMessage();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 66);
            stringBuilder.append("Calling getBoolean() threw an exception: ");
            stringBuilder.append(str);
            stringBuilder.append(" Returning default value.");
            zzdi.zzav(stringBuilder.toString());
            return zzgj.zzjz().booleanValue();
        }
    }

    public double getDouble(String str) {
        zzfb zzhb = zzhb();
        if (zzhb == null) {
            zzdi.zzav("getDouble called for closed container.");
            return zzgj.zzjy().doubleValue();
        }
        try {
            return zzgj.zzf((zzl) zzhb.zzbj(str).getObject()).doubleValue();
        } catch (Exception e) {
            str = e.getMessage();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 65);
            stringBuilder.append("Calling getDouble() threw an exception: ");
            stringBuilder.append(str);
            stringBuilder.append(" Returning default value.");
            zzdi.zzav(stringBuilder.toString());
            return zzgj.zzjy().doubleValue();
        }
    }

    public long getLong(String str) {
        zzfb zzhb = zzhb();
        if (zzhb == null) {
            zzdi.zzav("getLong called for closed container.");
            return zzgj.zzjx().longValue();
        }
        try {
            return zzgj.zze((zzl) zzhb.zzbj(str).getObject()).longValue();
        } catch (Exception e) {
            str = e.getMessage();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 63);
            stringBuilder.append("Calling getLong() threw an exception: ");
            stringBuilder.append(str);
            stringBuilder.append(" Returning default value.");
            zzdi.zzav(stringBuilder.toString());
            return zzgj.zzjx().longValue();
        }
    }

    public String getString(String str) {
        zzfb zzhb = zzhb();
        if (zzhb == null) {
            zzdi.zzav("getString called for closed container.");
            return zzgj.zzkb();
        }
        try {
            return zzgj.zzc((zzl) zzhb.zzbj(str).getObject());
        } catch (Exception e) {
            str = e.getMessage();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 65);
            stringBuilder.append("Calling getString() threw an exception: ");
            stringBuilder.append(str);
            stringBuilder.append(" Returning default value.");
            zzdi.zzav(stringBuilder.toString());
            return zzgj.zzkb();
        }
    }

    public long getLastRefreshTime() {
        return this.zzaeh;
    }

    public boolean isDefault() {
        return getLastRefreshTime() == 0;
    }

    public void registerFunctionCallMacroCallback(String str, FunctionCallMacroCallback functionCallMacroCallback) {
        if (functionCallMacroCallback != null) {
            synchronized (this.zzaef) {
                this.zzaef.put(str, functionCallMacroCallback);
            }
            return;
        }
        throw new NullPointerException("Macro handler must be non-null");
    }

    public void unregisterFunctionCallMacroCallback(String str) {
        synchronized (this.zzaef) {
            this.zzaef.remove(str);
        }
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final FunctionCallMacroCallback zzal(String str) {
        FunctionCallMacroCallback functionCallMacroCallback;
        synchronized (this.zzaef) {
            functionCallMacroCallback = (FunctionCallMacroCallback) this.zzaef.get(str);
        }
        return functionCallMacroCallback;
    }

    public void registerFunctionCallTagCallback(String str, FunctionCallTagCallback functionCallTagCallback) {
        if (functionCallTagCallback != null) {
            synchronized (this.zzaeg) {
                this.zzaeg.put(str, functionCallTagCallback);
            }
            return;
        }
        throw new NullPointerException("Tag callback must be non-null");
    }

    public void unregisterFunctionCallTagCallback(String str) {
        synchronized (this.zzaeg) {
            this.zzaeg.remove(str);
        }
    }

    @VisibleForTesting
    public final FunctionCallTagCallback zzam(String str) {
        FunctionCallTagCallback functionCallTagCallback;
        synchronized (this.zzaeg) {
            functionCallTagCallback = (FunctionCallTagCallback) this.zzaeg.get(str);
        }
        return functionCallTagCallback;
    }

    @VisibleForTesting
    public final void zzan(String str) {
        zzhb().zzan(str);
    }

    @VisibleForTesting
    public final String zzha() {
        return this.zzaei;
    }

    private final void zza(zzov zzov) {
        this.zzaei = zzov.getVersion();
        String str = this.zzaei;
        zzeh.zziy().zziz().equals(zza.CONTAINER_DEBUG);
        zzov zzov2 = zzov;
        zza(new zzfb(this.zzrm, zzov2, this.zzaed, new zza(this, null), new zzb(this, null), new zzdq()));
        if (getBoolean("_gtm.loadEventEnabled")) {
            String str2 = "gtm.load";
            this.zzaed.pushEvent(str2, DataLayer.mapOf("gtm.id", this.zzaec));
        }
    }

    private final synchronized void zza(zzfb zzfb) {
        this.zzaee = zzfb;
    }

    private final synchronized zzfb zzhb() {
        return this.zzaee;
    }

    /* Access modifiers changed, original: final */
    public final void release() {
        this.zzaee = null;
    }
}
