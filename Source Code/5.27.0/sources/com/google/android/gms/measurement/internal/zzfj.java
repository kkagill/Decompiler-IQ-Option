package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzp;
import com.google.android.gms.internal.measurement.zzx;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class zzfj implements zzgh {
    private static volatile zzfj zzoa;
    private final Clock zzac;
    private boolean zzdh = false;
    private final long zzdr;
    private final zzr zzfv;
    private final Context zzob;
    private final String zzoc;
    private final String zzod;
    private final zzs zzoe;
    private final zzeo zzof;
    private final zzef zzog;
    private final zzfc zzoh;
    private final zziw zzoi;
    private final zzjs zzoj;
    private final zzed zzok;
    private final zzhq zzol;
    private final zzgp zzom;
    private final zza zzon;
    private final zzhl zzoo;
    private zzeb zzop;
    private zzhv zzoq;
    private zzac zzor;
    private zzdy zzos;
    private zzeu zzot;
    private Boolean zzou;
    private long zzov;
    private volatile Boolean zzow;
    @VisibleForTesting
    private Boolean zzox;
    @VisibleForTesting
    private Boolean zzoy;
    private int zzoz;
    private AtomicInteger zzpa = new AtomicInteger(0);
    private final boolean zzt;
    private final String zzv;

    private zzfj(zzgm zzgm) {
        int i = 0;
        Preconditions.checkNotNull(zzgm);
        this.zzfv = new zzr(zzgm.zzob);
        zzak.zza(this.zzfv);
        this.zzob = zzgm.zzob;
        this.zzv = zzgm.zzv;
        this.zzoc = zzgm.zzoc;
        this.zzod = zzgm.zzod;
        this.zzt = zzgm.zzt;
        this.zzow = zzgm.zzow;
        zzx zzx = zzgm.zzpr;
        if (!(zzx == null || zzx.zzw == null)) {
            Object obj = zzx.zzw.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zzox = (Boolean) obj;
            }
            Object obj2 = zzx.zzw.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzoy = (Boolean) obj2;
            }
        }
        zzcm.zzr(this.zzob);
        this.zzac = DefaultClock.getInstance();
        this.zzdr = this.zzac.currentTimeMillis();
        this.zzoe = new zzs(this);
        zzeo zzeo = new zzeo(this);
        zzeo.initialize();
        this.zzof = zzeo;
        zzef zzef = new zzef(this);
        zzef.initialize();
        this.zzog = zzef;
        zzjs zzjs = new zzjs(this);
        zzjs.initialize();
        this.zzoj = zzjs;
        zzed zzed = new zzed(this);
        zzed.initialize();
        this.zzok = zzed;
        this.zzon = new zza(this);
        zzhq zzhq = new zzhq(this);
        zzhq.initialize();
        this.zzol = zzhq;
        zzgp zzgp = new zzgp(this);
        zzgp.initialize();
        this.zzom = zzgp;
        zziw zziw = new zziw(this);
        zziw.initialize();
        this.zzoi = zziw;
        zzhl zzhl = new zzhl(this);
        zzhl.initialize();
        this.zzoo = zzhl;
        zzfc zzfc = new zzfc(this);
        zzfc.initialize();
        this.zzoh = zzfc;
        if (!(zzgm.zzpr == null || zzgm.zzpr.zzs == 0)) {
            i = 1;
        }
        i ^= 1;
        zzr zzr = this.zzfv;
        if (this.zzob.getApplicationContext() instanceof Application) {
            zzgp = zzq();
            if (zzgp.getContext().getApplicationContext() instanceof Application) {
                Application application = (Application) zzgp.getContext().getApplicationContext();
                if (zzgp.zzpu == null) {
                    zzgp.zzpu = new zzhj(zzgp, null);
                }
                if (i != 0) {
                    application.unregisterActivityLifecycleCallbacks(zzgp.zzpu);
                    application.registerActivityLifecycleCallbacks(zzgp.zzpu);
                    zzgp.zzab().zzgs().zzao("Registered activity lifecycle callback");
                }
            }
        } else {
            zzab().zzgn().zzao("Application context is not an Application");
        }
        this.zzoh.zza(new zzfl(this, zzgm));
    }

    @WorkerThread
    private final void zza(zzgm zzgm) {
        zzaa().zzo();
        zzs.zzbm();
        zzac zzac = new zzac(this);
        zzac.initialize();
        this.zzor = zzac;
        zzdy zzdy = new zzdy(this, zzgm.zzs);
        zzdy.initialize();
        this.zzos = zzdy;
        zzeb zzeb = new zzeb(this);
        zzeb.initialize();
        this.zzop = zzeb;
        zzhv zzhv = new zzhv(this);
        zzhv.initialize();
        this.zzoq = zzhv;
        this.zzoj.zzbj();
        this.zzof.zzbj();
        this.zzot = new zzeu(this);
        this.zzos.zzbj();
        zzab().zzgq().zza("App measurement is starting up, version", Long.valueOf(this.zzoe.zzao()));
        zzr zzr = this.zzfv;
        zzab().zzgq().zzao("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        zzr = this.zzfv;
        String zzag = zzdy.zzag();
        if (TextUtils.isEmpty(this.zzv)) {
            zzeh zzgq;
            if (zzz().zzbr(zzag)) {
                zzgq = zzab().zzgq();
                zzag = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                zzgq = zzab().zzgq();
                String str = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
                zzag = String.valueOf(zzag);
                zzag = zzag.length() != 0 ? str.concat(zzag) : new String(str);
            }
            zzgq.zzao(zzag);
        }
        zzab().zzgr().zzao("Debug-level message logging enabled");
        if (this.zzoz != this.zzpa.get()) {
            zzab().zzgk().zza("Not all components initialized", Integer.valueOf(this.zzoz), Integer.valueOf(this.zzpa.get()));
        }
        this.zzdh = true;
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void start() {
        zzaa().zzo();
        if (zzac().zzlj.get() == 0) {
            zzac().zzlj.set(this.zzac.currentTimeMillis());
        }
        if (Long.valueOf(zzac().zzlo.get()).longValue() == 0) {
            zzab().zzgs().zza("Persisting first open", Long.valueOf(this.zzdr));
            zzac().zzlo.set(this.zzdr);
        }
        zzr zzr;
        if (zzie()) {
            zzr = this.zzfv;
            if (!(TextUtils.isEmpty(zzr().getGmpAppId()) && TextUtils.isEmpty(zzr().zzah()))) {
                zzz();
                if (zzjs.zza(zzr().getGmpAppId(), zzac().zzhc(), zzr().zzah(), zzac().zzhd())) {
                    zzab().zzgq().zzao("Rechecking which service to use due to a GMP App Id change");
                    zzac().zzhf();
                    zzu().resetAnalyticsData();
                    this.zzoq.disconnect();
                    this.zzoq.zzis();
                    zzac().zzlo.set(this.zzdr);
                    zzac().zzlq.zzau(null);
                }
                zzac().zzar(zzr().getGmpAppId());
                zzac().zzas(zzr().zzah());
            }
            zzq().zzbg(zzac().zzlq.zzho());
            zzr = this.zzfv;
            if (!(TextUtils.isEmpty(zzr().getGmpAppId()) && TextUtils.isEmpty(zzr().zzah()))) {
                boolean isEnabled = isEnabled();
                if (!(zzac().zzhj() || this.zzoe.zzbp())) {
                    zzac().zzf(isEnabled ^ 1);
                }
                if (isEnabled) {
                    zzq().zzim();
                }
                zzs().zza(new AtomicReference());
            }
        } else if (isEnabled()) {
            if (!zzz().zzbp("android.permission.INTERNET")) {
                zzab().zzgk().zzao("App is missing INTERNET permission");
            }
            if (!zzz().zzbp("android.permission.ACCESS_NETWORK_STATE")) {
                zzab().zzgk().zzao("App is missing ACCESS_NETWORK_STATE permission");
            }
            zzr = this.zzfv;
            if (!(Wrappers.packageManager(this.zzob).isCallerInstantApp() || this.zzoe.zzbw())) {
                if (!zzez.zzl(this.zzob)) {
                    zzab().zzgk().zzao("AppMeasurementReceiver not registered/enabled");
                }
                if (!zzjs.zzb(this.zzob, false)) {
                    zzab().zzgk().zzao("AppMeasurementService not registered/enabled");
                }
            }
            zzab().zzgk().zzao("Uploading is not possible. App measurement disabled");
        }
        zzac().zzly.set(this.zzoe.zza(zzak.zziu));
        zzac().zzlz.set(this.zzoe.zza(zzak.zziv));
    }

    public final zzr zzae() {
        return this.zzfv;
    }

    public final zzs zzad() {
        return this.zzoe;
    }

    public final zzeo zzac() {
        zza(this.zzof);
        return this.zzof;
    }

    public final zzef zzab() {
        zza(this.zzog);
        return this.zzog;
    }

    public final zzef zzhs() {
        zzef zzef = this.zzog;
        return (zzef == null || !zzef.isInitialized()) ? null : this.zzog;
    }

    public final zzfc zzaa() {
        zza(this.zzoh);
        return this.zzoh;
    }

    public final zziw zzv() {
        zza(this.zzoi);
        return this.zzoi;
    }

    public final zzeu zzht() {
        return this.zzot;
    }

    /* Access modifiers changed, original: final */
    public final zzfc zzhu() {
        return this.zzoh;
    }

    public final zzgp zzq() {
        zza(this.zzom);
        return this.zzom;
    }

    public final zzjs zzz() {
        zza(this.zzoj);
        return this.zzoj;
    }

    public final zzed zzy() {
        zza(this.zzok);
        return this.zzok;
    }

    public final zzeb zzu() {
        zza(this.zzop);
        return this.zzop;
    }

    private final zzhl zzhv() {
        zza(this.zzoo);
        return this.zzoo;
    }

    public final Context getContext() {
        return this.zzob;
    }

    public final boolean zzhw() {
        return TextUtils.isEmpty(this.zzv);
    }

    public final String zzhx() {
        return this.zzv;
    }

    public final String zzhy() {
        return this.zzoc;
    }

    public final String zzhz() {
        return this.zzod;
    }

    public final boolean zzia() {
        return this.zzt;
    }

    public final Clock zzx() {
        return this.zzac;
    }

    public final zzhq zzt() {
        zza(this.zzol);
        return this.zzol;
    }

    public final zzhv zzs() {
        zza(this.zzoq);
        return this.zzoq;
    }

    public final zzac zzw() {
        zza(this.zzor);
        return this.zzor;
    }

    public final zzdy zzr() {
        zza(this.zzos);
        return this.zzos;
    }

    public final zza zzp() {
        zza zza = this.zzon;
        if (zza != null) {
            return zza;
        }
        throw new IllegalStateException("Component not created");
    }

    @VisibleForTesting
    public static zzfj zza(Context context, String str, String str2, Bundle bundle) {
        return zza(context, new zzx(0, 0, true, null, null, null, bundle));
    }

    public static zzfj zza(Context context, zzx zzx) {
        if (zzx != null && (zzx.origin == null || zzx.zzv == null)) {
            zzx = new zzx(zzx.zzr, zzx.zzs, zzx.zzt, zzx.zzu, null, null, zzx.zzw);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzoa == null) {
            synchronized (zzfj.class) {
                if (zzoa == null) {
                    zzoa = new zzfj(new zzgm(context, zzx));
                }
            }
        } else if (!(zzx == null || zzx.zzw == null || !zzx.zzw.containsKey("dataCollectionDefaultEnabled"))) {
            zzoa.zza(zzx.zzw.getBoolean("dataCollectionDefaultEnabled"));
        }
        return zzoa;
    }

    private final void zzbi() {
        if (!this.zzdh) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    private static void zza(zzge zzge) {
        if (zzge == null) {
            throw new IllegalStateException("Component not created");
        } else if (!zzge.isInitialized()) {
            String valueOf = String.valueOf(zzge.getClass());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
            stringBuilder.append("Component not initialized: ");
            stringBuilder.append(valueOf);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private static void zza(zzg zzg) {
        if (zzg == null) {
            throw new IllegalStateException("Component not created");
        } else if (!zzg.isInitialized()) {
            String valueOf = String.valueOf(zzg.getClass());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
            stringBuilder.append("Component not initialized: ");
            stringBuilder.append(valueOf);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private static void zza(zzgf zzgf) {
        if (zzgf == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zza(boolean z) {
        this.zzow = Boolean.valueOf(z);
    }

    @WorkerThread
    public final boolean zzib() {
        return this.zzow != null && this.zzow.booleanValue();
    }

    @WorkerThread
    public final boolean isEnabled() {
        zzaa().zzo();
        zzbi();
        Boolean bool;
        if (this.zzoe.zza(zzak.zzil)) {
            if (this.zzoe.zzbp()) {
                return false;
            }
            bool = this.zzoy;
            if (bool != null && bool.booleanValue()) {
                return false;
            }
            bool = zzac().zzhg();
            if (bool != null) {
                return bool.booleanValue();
            }
            bool = this.zzoe.zzbq();
            if (bool != null) {
                return bool.booleanValue();
            }
            bool = this.zzox;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (GoogleServices.isMeasurementExplicitlyDisabled()) {
                return false;
            }
            if (!this.zzoe.zza(zzak.zzig) || this.zzow == null) {
                return true;
            }
            return this.zzow.booleanValue();
        } else if (this.zzoe.zzbp()) {
            return false;
        } else {
            boolean booleanValue;
            bool = this.zzoe.zzbq();
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                booleanValue = GoogleServices.isMeasurementExplicitlyDisabled() ^ true;
                if (booleanValue && this.zzow != null && ((Boolean) zzak.zzig.get(null)).booleanValue()) {
                    booleanValue = this.zzow.booleanValue();
                }
            }
            return zzac().zze(booleanValue);
        }
    }

    /* Access modifiers changed, original: final */
    public final long zzic() {
        Long valueOf = Long.valueOf(zzac().zzlo.get());
        if (valueOf.longValue() == 0) {
            return this.zzdr;
        }
        return Math.min(this.zzdr, valueOf.longValue());
    }

    /* Access modifiers changed, original: final */
    public final void zzm() {
        zzr zzr = this.zzfv;
    }

    /* Access modifiers changed, original: final */
    public final void zzl() {
        zzr zzr = this.zzfv;
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* Access modifiers changed, original: final */
    public final void zzb(zzge zzge) {
        this.zzoz++;
    }

    /* Access modifiers changed, original: final */
    public final void zzb(zzg zzg) {
        this.zzoz++;
    }

    /* Access modifiers changed, original: final */
    public final void zzid() {
        this.zzpa.incrementAndGet();
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final boolean zzie() {
        zzbi();
        zzaa().zzo();
        Boolean bool = this.zzou;
        if (bool == null || this.zzov == 0 || !(bool == null || bool.booleanValue() || Math.abs(this.zzac.elapsedRealtime() - this.zzov) <= 1000)) {
            this.zzov = this.zzac.elapsedRealtime();
            zzr zzr = this.zzfv;
            boolean z = true;
            boolean z2 = zzz().zzbp("android.permission.INTERNET") && zzz().zzbp("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzob).isCallerInstantApp() || this.zzoe.zzbw() || (zzez.zzl(this.zzob) && zzjs.zzb(this.zzob, false)));
            this.zzou = Boolean.valueOf(z2);
            if (this.zzou.booleanValue()) {
                if (!zzz().zzr(zzr().getGmpAppId(), zzr().zzah()) && TextUtils.isEmpty(zzr().zzah())) {
                    z = false;
                }
                this.zzou = Boolean.valueOf(z);
            }
        }
        return this.zzou.booleanValue();
    }

    @WorkerThread
    public final void zza(@NonNull zzp zzp) {
        zzaa().zzo();
        zza(zzhv());
        String zzag = zzr().zzag();
        Pair zzap = zzac().zzap(zzag);
        String str = "";
        if (!this.zzoe.zzbr().booleanValue() || ((Boolean) zzap.second).booleanValue()) {
            zzab().zzgr().zzao("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            zzz().zzb(zzp, str);
        } else if (zzhv().zzgv()) {
            URL zza = zzz().zza(zzr().zzad().zzao(), zzag, (String) zzap.first);
            zzhl zzhv = zzhv();
            zzfi zzfi = new zzfi(this, zzp);
            zzhv.zzo();
            zzhv.zzbi();
            Preconditions.checkNotNull(zza);
            Preconditions.checkNotNull(zzfi);
            zzhv.zzaa().zzb(new zzhn(zzhv, zzag, zza, null, null, zzfi));
        } else {
            zzab().zzgn().zzao("Network is not available for Deferred Deep Link request. Skipping");
            zzz().zzb(zzp, str);
        }
    }

    /* Access modifiers changed, original: final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096 A:{Catch:{ JSONException -> 0x00b2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081 A:{Catch:{ JSONException -> 0x00b2 }} */
    public final /* synthetic */ void zza(com.google.android.gms.internal.measurement.zzp r7, java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
        r6 = this;
        r8 = "gclid";
        r12 = "deeplink";
        r0 = 1;
        r1 = 0;
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r9 == r2) goto L_0x0012;
    L_0x000a:
        r2 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        if (r9 == r2) goto L_0x0012;
    L_0x000e:
        r2 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r9 != r2) goto L_0x0016;
    L_0x0012:
        if (r10 != 0) goto L_0x0016;
    L_0x0014:
        r2 = 1;
        goto L_0x0017;
    L_0x0016:
        r2 = 0;
    L_0x0017:
        r3 = "";
        if (r2 != 0) goto L_0x0034;
    L_0x001b:
        r8 = r6.zzab();
        r8 = r8.zzgn();
        r9 = java.lang.Integer.valueOf(r9);
        r11 = "Network Request for Deferred Deep Link failed. response, exception";
        r8.zza(r11, r9, r10);
        r8 = r6.zzz();
        r8.zzb(r7, r3);
        return;
    L_0x0034:
        r9 = r11.length;
        if (r9 != 0) goto L_0x003f;
    L_0x0037:
        r8 = r6.zzz();
        r8.zzb(r7, r3);
        return;
    L_0x003f:
        r9 = new java.lang.String;
        r9.<init>(r11);
        r10 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00b2 }
        r10.<init>(r9);	 Catch:{ JSONException -> 0x00b2 }
        r9 = r10.optString(r12, r3);	 Catch:{ JSONException -> 0x00b2 }
        r10 = r10.optString(r8, r3);	 Catch:{ JSONException -> 0x00b2 }
        r11 = r6.zzz();	 Catch:{ JSONException -> 0x00b2 }
        r11.zzm();	 Catch:{ JSONException -> 0x00b2 }
        r2 = android.text.TextUtils.isEmpty(r9);	 Catch:{ JSONException -> 0x00b2 }
        if (r2 != 0) goto L_0x007e;
    L_0x005e:
        r11 = r11.getContext();	 Catch:{ JSONException -> 0x00b2 }
        r11 = r11.getPackageManager();	 Catch:{ JSONException -> 0x00b2 }
        r2 = new android.content.Intent;	 Catch:{ JSONException -> 0x00b2 }
        r4 = "android.intent.action.VIEW";
        r5 = android.net.Uri.parse(r9);	 Catch:{ JSONException -> 0x00b2 }
        r2.<init>(r4, r5);	 Catch:{ JSONException -> 0x00b2 }
        r11 = r11.queryIntentActivities(r2, r1);	 Catch:{ JSONException -> 0x00b2 }
        if (r11 == 0) goto L_0x007e;
    L_0x0077:
        r11 = r11.isEmpty();	 Catch:{ JSONException -> 0x00b2 }
        if (r11 != 0) goto L_0x007e;
    L_0x007d:
        goto L_0x007f;
    L_0x007e:
        r0 = 0;
    L_0x007f:
        if (r0 != 0) goto L_0x0096;
    L_0x0081:
        r8 = r6.zzab();	 Catch:{ JSONException -> 0x00b2 }
        r8 = r8.zzgn();	 Catch:{ JSONException -> 0x00b2 }
        r11 = "Deferred Deep Link validation failed. gclid, deep link";
        r8.zza(r11, r10, r9);	 Catch:{ JSONException -> 0x00b2 }
        r8 = r6.zzz();	 Catch:{ JSONException -> 0x00b2 }
        r8.zzb(r7, r3);	 Catch:{ JSONException -> 0x00b2 }
        return;
    L_0x0096:
        r11 = new android.os.Bundle;	 Catch:{ JSONException -> 0x00b2 }
        r11.<init>();	 Catch:{ JSONException -> 0x00b2 }
        r11.putString(r12, r9);	 Catch:{ JSONException -> 0x00b2 }
        r11.putString(r8, r10);	 Catch:{ JSONException -> 0x00b2 }
        r8 = r6.zzom;	 Catch:{ JSONException -> 0x00b2 }
        r10 = "auto";
        r12 = "_cmp";
        r8.logEvent(r10, r12, r11);	 Catch:{ JSONException -> 0x00b2 }
        r8 = r6.zzz();	 Catch:{ JSONException -> 0x00b2 }
        r8.zzb(r7, r9);	 Catch:{ JSONException -> 0x00b2 }
        return;
    L_0x00b2:
        r8 = move-exception;
        r9 = r6.zzab();
        r9 = r9.zzgk();
        r10 = "Failed to parse the Deferred Deep Link response. exception";
        r9.zza(r10, r8);
        r8 = r6.zzz();
        r8.zzb(r7, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfj.zza(com.google.android.gms.internal.measurement.zzp, java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }
}
