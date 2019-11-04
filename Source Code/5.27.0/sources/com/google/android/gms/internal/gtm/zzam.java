package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

public class zzam {
    private final zzap zzwc;

    protected zzam(zzap zzap) {
        Preconditions.checkNotNull(zzap);
        this.zzwc = zzap;
    }

    public final zzap zzcm() {
        return this.zzwc;
    }

    /* Access modifiers changed, original: protected|final */
    public final Clock zzcn() {
        return this.zzwc.zzcn();
    }

    /* Access modifiers changed, original: protected|final */
    public final Context getContext() {
        return this.zzwc.getContext();
    }

    /* Access modifiers changed, original: protected|final */
    public final zzci zzco() {
        return this.zzwc.zzco();
    }

    /* Access modifiers changed, original: protected|final */
    public final zzbq zzcp() {
        return this.zzwc.zzcp();
    }

    /* Access modifiers changed, original: protected|final */
    public final zzk zzcq() {
        return this.zzwc.zzcq();
    }

    public final GoogleAnalytics zzcr() {
        return this.zzwc.zzde();
    }

    /* Access modifiers changed, original: protected|final */
    public final zzae zzcs() {
        return this.zzwc.zzcs();
    }

    /* Access modifiers changed, original: protected|final */
    public final zzbv zzct() {
        return this.zzwc.zzct();
    }

    /* Access modifiers changed, original: protected|final */
    public final zzda zzcu() {
        return this.zzwc.zzcu();
    }

    /* Access modifiers changed, original: protected|final */
    public final zzcm zzcv() {
        return this.zzwc.zzcv();
    }

    /* Access modifiers changed, original: protected|final */
    public final zzbh zzcw() {
        return this.zzwc.zzdh();
    }

    /* Access modifiers changed, original: protected|final */
    public final zzad zzcx() {
        return this.zzwc.zzdg();
    }

    /* Access modifiers changed, original: protected|final */
    public final zzba zzcy() {
        return this.zzwc.zzcy();
    }

    /* Access modifiers changed, original: protected|final */
    public final zzbu zzcz() {
        return this.zzwc.zzcz();
    }

    public final void zzq(String str) {
        zza(2, str, null, null, null);
    }

    public final void zza(String str, Object obj) {
        zza(2, str, obj, null, null);
    }

    public final void zza(String str, Object obj, Object obj2) {
        zza(2, str, obj, obj2, null);
    }

    public final void zzr(String str) {
        zza(3, str, null, null, null);
    }

    public final void zzb(String str, Object obj) {
        zza(3, str, obj, null, null);
    }

    public final void zzb(String str, Object obj, Object obj2) {
        zza(3, str, obj, obj2, null);
    }

    public final void zza(String str, Object obj, Object obj2, Object obj3) {
        zza(3, str, obj, obj2, obj3);
    }

    public final void zzs(String str) {
        zza(4, str, null, null, null);
    }

    public final void zzc(String str, Object obj) {
        zza(4, str, obj, null, null);
    }

    public final void zzt(String str) {
        zza(5, str, null, null, null);
    }

    public final void zzd(String str, Object obj) {
        zza(5, str, obj, null, null);
    }

    public final void zzc(String str, Object obj, Object obj2) {
        zza(5, str, obj, obj2, null);
    }

    public final void zzb(String str, Object obj, Object obj2, Object obj3) {
        zza(5, str, obj, obj2, obj3);
    }

    public final void zzu(String str) {
        zza(6, str, null, null, null);
    }

    public final void zze(String str, Object obj) {
        zza(6, str, obj, null, null);
    }

    public final void zzd(String str, Object obj, Object obj2) {
        zza(6, str, obj, obj2, null);
    }

    public static boolean zzda() {
        return Log.isLoggable((String) zzby.zzzb.get(), 2);
    }

    private final void zza(int i, String str, Object obj, Object obj2, Object obj3) {
        zzap zzap = this.zzwc;
        zzci zzdd = zzap != null ? zzap.zzdd() : null;
        String str2;
        if (zzdd != null) {
            str2 = (String) zzby.zzzb.get();
            if (Log.isLoggable(str2, i)) {
                Log.println(i, str2, zzc(str, obj, obj2, obj3));
            }
            if (i >= 5) {
                zzdd.zzb(i, str, obj, obj2, obj3);
            }
            return;
        }
        str2 = (String) zzby.zzzb.get();
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, zzc(str, obj, obj2, obj3));
        }
    }

    protected static String zzc(String str, Object obj, Object obj2, Object obj3) {
        CharSequence str2;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        String zzb = zzb(obj);
        String zzb2 = zzb(obj2);
        String zzb3 = zzb(obj3);
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            stringBuilder.append(str2);
            str3 = ": ";
        }
        String str4 = ", ";
        if (!TextUtils.isEmpty(zzb)) {
            stringBuilder.append(str3);
            stringBuilder.append(zzb);
            str3 = str4;
        }
        if (!TextUtils.isEmpty(zzb2)) {
            stringBuilder.append(str3);
            stringBuilder.append(zzb2);
            str3 = str4;
        }
        if (!TextUtils.isEmpty(zzb3)) {
            stringBuilder.append(str3);
            stringBuilder.append(zzb3);
        }
        return stringBuilder.toString();
    }

    private static String zzb(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return obj == Boolean.TRUE ? "true" : "false";
        } else {
            if (obj instanceof Throwable) {
                return ((Throwable) obj).toString();
            }
            return obj.toString();
        }
    }
}
