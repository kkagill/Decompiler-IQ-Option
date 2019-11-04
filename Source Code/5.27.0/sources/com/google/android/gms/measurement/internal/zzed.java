package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

public final class zzed extends zzge {
    private static final AtomicReference<String[]> zzjx = new AtomicReference();
    private static final AtomicReference<String[]> zzjy = new AtomicReference();
    private static final AtomicReference<String[]> zzjz = new AtomicReference();

    zzed(zzfj zzfj) {
        super(zzfj);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzbk() {
        return false;
    }

    private final boolean zzgj() {
        zzae();
        return this.zzj.zzhw() && this.zzj.zzab().isLoggable(3);
    }

    /* Access modifiers changed, original: protected|final */
    @Nullable
    public final String zzaj(String str) {
        if (str == null) {
            return null;
        }
        if (zzgj()) {
            return zza(str, zzgj.zzpo, zzgj.zzpn, zzjx);
        }
        return str;
    }

    /* Access modifiers changed, original: protected|final */
    @Nullable
    public final String zzak(String str) {
        if (str == null) {
            return null;
        }
        if (zzgj()) {
            return zza(str, zzgi.zzpm, zzgi.zzpl, zzjy);
        }
        return str;
    }

    /* Access modifiers changed, original: protected|final */
    @Nullable
    public final String zzal(String str) {
        if (str == null) {
            return null;
        }
        if (!zzgj()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return zza(str, zzgl.zzpq, zzgl.zzpp, zzjz);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("experiment_id");
        stringBuilder.append("(");
        stringBuilder.append(str);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @Nullable
    private static String zza(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (zzjs.zzs(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(strArr2[i]);
                        stringBuilder.append("(");
                        stringBuilder.append(strArr[i]);
                        stringBuilder.append(")");
                        strArr3[i] = stringBuilder.toString();
                    }
                    str = strArr3[i];
                }
                return str;
            }
        }
        return str;
    }

    /* Access modifiers changed, original: protected|final */
    @Nullable
    public final String zzb(zzai zzai) {
        if (zzai == null) {
            return null;
        }
        if (!zzgj()) {
            return zzai.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("origin=");
        stringBuilder.append(zzai.origin);
        stringBuilder.append(",name=");
        stringBuilder.append(zzaj(zzai.name));
        stringBuilder.append(",params=");
        stringBuilder.append(zzb(zzai.zzfq));
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected|final */
    @Nullable
    public final String zza(zzaf zzaf) {
        if (zzaf == null) {
            return null;
        }
        if (!zzgj()) {
            return zzaf.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Event{appId='");
        stringBuilder.append(zzaf.zzce);
        stringBuilder.append("', name='");
        stringBuilder.append(zzaj(zzaf.name));
        stringBuilder.append("', params=");
        stringBuilder.append(zzb(zzaf.zzfq));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Nullable
    private final String zzb(zzah zzah) {
        if (zzah == null) {
            return null;
        }
        if (zzgj()) {
            return zzc(zzah.zzcv());
        }
        return zzah.toString();
    }

    /* Access modifiers changed, original: protected|final */
    @Nullable
    public final String zzc(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!zzgj()) {
            return bundle.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(", ");
            } else {
                stringBuilder.append("Bundle[{");
            }
            stringBuilder.append(zzak(str));
            stringBuilder.append("=");
            stringBuilder.append(bundle.get(str));
        }
        stringBuilder.append("}]");
        return stringBuilder.toString();
    }

    public final /* bridge */ /* synthetic */ void zzl() {
        super.zzl();
    }

    public final /* bridge */ /* synthetic */ void zzm() {
        super.zzm();
    }

    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    public final /* bridge */ /* synthetic */ zzac zzw() {
        return super.zzw();
    }

    public final /* bridge */ /* synthetic */ Clock zzx() {
        return super.zzx();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final /* bridge */ /* synthetic */ zzed zzy() {
        return super.zzy();
    }

    public final /* bridge */ /* synthetic */ zzjs zzz() {
        return super.zzz();
    }

    public final /* bridge */ /* synthetic */ zzfc zzaa() {
        return super.zzaa();
    }

    public final /* bridge */ /* synthetic */ zzef zzab() {
        return super.zzab();
    }

    public final /* bridge */ /* synthetic */ zzeo zzac() {
        return super.zzac();
    }

    public final /* bridge */ /* synthetic */ zzs zzad() {
        return super.zzad();
    }

    public final /* bridge */ /* synthetic */ zzr zzae() {
        return super.zzae();
    }
}
