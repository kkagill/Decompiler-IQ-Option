package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzef extends zzge {
    private char zzkg = 0;
    @GuardedBy("this")
    private String zzkh;
    private final zzeh zzki = new zzeh(this, 6, false, false);
    private final zzeh zzkj = new zzeh(this, 6, true, false);
    private final zzeh zzkk = new zzeh(this, 6, false, true);
    private final zzeh zzkl = new zzeh(this, 5, false, false);
    private final zzeh zzkm = new zzeh(this, 5, true, false);
    private final zzeh zzkn = new zzeh(this, 5, false, true);
    private final zzeh zzko = new zzeh(this, 4, false, false);
    private final zzeh zzkp = new zzeh(this, 3, false, false);
    private final zzeh zzkq = new zzeh(this, 2, false, false);
    private long zzr = -1;

    zzef(zzfj zzfj) {
        super(zzfj);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzbk() {
        return false;
    }

    public final zzeh zzgk() {
        return this.zzki;
    }

    public final zzeh zzgl() {
        return this.zzkj;
    }

    public final zzeh zzgm() {
        return this.zzkk;
    }

    public final zzeh zzgn() {
        return this.zzkl;
    }

    public final zzeh zzgo() {
        return this.zzkm;
    }

    public final zzeh zzgp() {
        return this.zzkn;
    }

    public final zzeh zzgq() {
        return this.zzko;
    }

    public final zzeh zzgr() {
        return this.zzkp;
    }

    public final zzeh zzgs() {
        return this.zzkq;
    }

    protected static Object zzam(String str) {
        return str == null ? null : new zzeg(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && isLoggable(i)) {
            zza(i, zza(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            Preconditions.checkNotNull(str);
            zzfc zzhu = this.zzj.zzhu();
            if (zzhu == null) {
                zza(6, "Scheduler not set. Not logging error/warn");
            } else if (zzhu.isInitialized()) {
                if (i < 0) {
                    i = 0;
                }
                zzhu.zza(new zzee(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
            } else {
                zza(6, "Scheduler not initialized. Not logging error/warn");
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    @VisibleForTesting
    public final boolean isLoggable(int i) {
        return Log.isLoggable(zzgt(), i);
    }

    /* Access modifiers changed, original: protected|final */
    @VisibleForTesting
    public final void zza(int i, String str) {
        Log.println(i, zzgt(), str);
    }

    @VisibleForTesting
    private final String zzgt() {
        String str;
        synchronized (this) {
            if (this.zzkh == null) {
                if (this.zzj.zzhz() != null) {
                    this.zzkh = this.zzj.zzhz();
                } else {
                    this.zzkh = zzs.zzbm();
                }
            }
            str = this.zzkh;
        }
        return str;
    }

    static String zza(boolean z, String str, Object obj, Object obj2, Object obj3) {
        CharSequence str2;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        String zza = zza(z, obj);
        String zza2 = zza(z, obj2);
        String zza3 = zza(z, obj3);
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            stringBuilder.append(str2);
            str3 = ": ";
        }
        String str4 = ", ";
        if (!TextUtils.isEmpty(zza)) {
            stringBuilder.append(str3);
            stringBuilder.append(zza);
            str3 = str4;
        }
        if (!TextUtils.isEmpty(zza2)) {
            stringBuilder.append(str3);
            stringBuilder.append(zza2);
            str3 = str4;
        }
        if (!TextUtils.isEmpty(zza3)) {
            stringBuilder.append(str3);
            stringBuilder.append(zza3);
        }
        return stringBuilder.toString();
    }

    @VisibleForTesting
    private static String zza(boolean z, Object obj) {
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str2 = "-";
        int i = 0;
        String valueOf;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = str2;
            }
            valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder stringBuilder = new StringBuilder((str.length() + 43) + str.length());
            stringBuilder.append(str);
            stringBuilder.append(round);
            stringBuilder.append("...");
            stringBuilder.append(str);
            stringBuilder.append(round2);
            return stringBuilder.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder stringBuilder2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                valueOf = zzan(zzfj.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (i < length) {
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null && zzan(className).equals(valueOf)) {
                            stringBuilder2.append(": ");
                            stringBuilder2.append(stackTraceElement);
                            break;
                        }
                    }
                    i++;
                }
                return stringBuilder2.toString();
            } else if (obj instanceof zzeg) {
                return ((zzeg) obj).zzkr;
            } else {
                if (z) {
                    return str2;
                }
                return String.valueOf(obj);
            }
        }
    }

    private static String zzan(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    public final String zzgu() {
        Pair zzhl = zzac().zzli.zzhl();
        if (zzhl == null || zzhl == zzeo.zzlg) {
            return null;
        }
        String valueOf = String.valueOf(zzhl.second);
        String str = (String) zzhl.first;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(":");
        stringBuilder.append(str);
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
