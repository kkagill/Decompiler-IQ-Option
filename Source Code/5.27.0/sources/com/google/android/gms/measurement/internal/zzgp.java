package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

public final class zzgp extends zzg {
    @VisibleForTesting
    protected zzhj zzpu;
    private zzgk zzpv;
    private final Set<zzgn> zzpw = new CopyOnWriteArraySet();
    private boolean zzpx;
    private final AtomicReference<String> zzpy = new AtomicReference();
    @VisibleForTesting
    protected boolean zzpz = true;

    protected zzgp(zzfj zzfj) {
        super(zzfj);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzbk() {
        return false;
    }

    public final void zzif() {
        if (getContext().getApplicationContext() instanceof Application) {
            ((Application) getContext().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zzpu);
        }
    }

    public final Boolean zzig() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzaa().zza(atomicReference, 15000, "boolean test flag value", new zzgo(this, atomicReference));
    }

    public final String zzih() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzaa().zza(atomicReference, 15000, "String test flag value", new zzgy(this, atomicReference));
    }

    public final Long zzii() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzaa().zza(atomicReference, 15000, "long test flag value", new zzha(this, atomicReference));
    }

    public final Integer zzij() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzaa().zza(atomicReference, 15000, "int test flag value", new zzhd(this, atomicReference));
    }

    public final Double zzik() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzaa().zza(atomicReference, 15000, "double test flag value", new zzhc(this, atomicReference));
    }

    public final void setMeasurementEnabled(boolean z) {
        zzbi();
        zzm();
        zzaa().zza(new zzhf(this, z));
    }

    public final void zza(boolean z) {
        zzbi();
        zzm();
        zzaa().zza(new zzhe(this, z));
    }

    @WorkerThread
    private final void zzg(boolean z) {
        zzo();
        zzm();
        zzbi();
        zzab().zzgr().zza("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        zzac().setMeasurementEnabled(z);
        zzil();
    }

    @WorkerThread
    private final void zzil() {
        if (zzad().zze(zzr().zzag(), zzak.zzik)) {
            zzo();
            String zzho = zzac().zzlx.zzho();
            if (zzho != null) {
                if ("unset".equals(zzho)) {
                    zza("app", "_npa", null, zzx().currentTimeMillis());
                } else {
                    zza("app", "_npa", Long.valueOf("true".equals(zzho) ? 1 : 0), zzx().currentTimeMillis());
                }
            }
        }
        if (this.zzj.isEnabled() && this.zzpz) {
            zzab().zzgr().zzao("Recording app launch after enabling measurement for the first time (FE)");
            zzim();
            return;
        }
        zzab().zzgr().zzao("Updating Scion state (FE)");
        zzs().zzip();
    }

    public final void setMinimumSessionDuration(long j) {
        zzm();
        zzaa().zza(new zzhh(this, j));
    }

    public final void setSessionTimeoutDuration(long j) {
        zzm();
        zzaa().zza(new zzhg(this, j));
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z) {
        logEvent(str, str2, bundle, false, true, zzx().currentTimeMillis());
    }

    public final void logEvent(String str, String str2, Bundle bundle) {
        logEvent(str, str2, bundle, true, true, zzx().currentTimeMillis());
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zza(String str, String str2, Bundle bundle) {
        zzm();
        zzo();
        zza(str, str2, zzx().currentTimeMillis(), bundle);
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zza(String str, String str2, long j, Bundle bundle) {
        zzm();
        zzo();
        boolean z = this.zzpv == null || zzjs.zzbq(str2);
        zza(str, str2, j, bundle, true, z, false, null);
    }

    @WorkerThread
    private final void zza(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        String str4 = str;
        String str5 = str2;
        long j2 = j;
        Bundle bundle2 = bundle;
        String str6 = str3;
        Preconditions.checkNotEmpty(str);
        if (!zzad().zze(str6, zzak.zzip)) {
            Preconditions.checkNotEmpty(str2);
        }
        Preconditions.checkNotNull(bundle);
        zzo();
        zzbi();
        if (this.zzj.isEnabled()) {
            String str7;
            String str8;
            int i;
            if (zzad().zze(zzr().zzag(), zzak.zzix)) {
                List zzbh = zzr().zzbh();
                if (!(zzbh == null || zzbh.contains(str5))) {
                    zzab().zzgr().zza("Dropping non-safelisted event. event name, origin", str5, str4);
                    return;
                }
            }
            int i2 = 0;
            if (!this.zzpx) {
                this.zzpx = true;
                try {
                    Class cls;
                    String str9 = "com.google.android.gms.tagmanager.TagManagerService";
                    if (this.zzj.zzia()) {
                        cls = Class.forName(str9);
                    } else {
                        cls = Class.forName(str9, true, getContext().getClassLoader());
                    }
                    try {
                        cls.getDeclaredMethod("initialize", new Class[]{Context.class}).invoke(null, new Object[]{getContext()});
                    } catch (Exception e) {
                        zzab().zzgn().zza("Failed to invoke Tag Manager's initialize() method", e);
                    }
                } catch (ClassNotFoundException unused) {
                    zzab().zzgq().zzao("Tag Manager is not found and thus will not be used");
                }
            }
            if (zzad().zze(zzr().zzag(), zzak.zzje) && "_cmp".equals(str5)) {
                str7 = "gclid";
                if (bundle2.containsKey(str7)) {
                    zza("auto", "_lgclid", bundle2.getString(str7), zzx().currentTimeMillis());
                }
            }
            if (z3) {
                zzae();
                if (!"_iap".equals(str5)) {
                    zzjs zzz = this.zzj.zzz();
                    str8 = "event";
                    i = 2;
                    if (zzz.zzp(str8, str5)) {
                        if (!zzz.zza(str8, zzgj.zzpn, str5)) {
                            i = 13;
                        } else if (zzz.zza(str8, 40, str5)) {
                            i = 0;
                        }
                    }
                    if (i != 0) {
                        zzab().zzgm().zza("Invalid public event name. Event will not be logged (FE)", zzy().zzaj(str5));
                        this.zzj.zzz();
                        this.zzj.zzz().zza(i, "_ev", zzjs.zza(str5, 40, true), str5 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            zzae();
            zzhr zzin = zzt().zzin();
            str8 = "_sc";
            if (!(zzin == null || bundle2.containsKey(str8))) {
                zzin.zzqx = true;
            }
            boolean z4 = z && z3;
            zzhq.zza(zzin, bundle2, z4);
            boolean equals = "am".equals(str4);
            z4 = zzjs.zzbq(str2);
            if (z && this.zzpv != null && !z4 && !equals) {
                zzab().zzgr().zza("Passing event to registered event handler (FE)", zzy().zzaj(str5), zzy().zzc(bundle2));
                this.zzpv.interceptEvent(str, str2, bundle, j);
                return;
            } else if (this.zzj.zzie()) {
                int zzbl = zzz().zzbl(str5);
                if (zzbl != 0) {
                    zzab().zzgm().zza("Invalid event name. Event will not be logged (FE)", zzy().zzaj(str5));
                    zzz();
                    str7 = zzjs.zza(str5, 40, true);
                    if (str5 != null) {
                        i2 = str2.length();
                    }
                    this.zzj.zzz().zza(str3, zzbl, "_ev", str7, i2);
                    return;
                }
                String str10;
                long j3;
                String str11;
                String str12;
                long j4;
                String str13;
                Bundle bundle3;
                str7 = "_sn";
                String str14 = "_o";
                String str15 = "_si";
                List listOf = CollectionUtils.listOf(str14, str7, str8, str15);
                Object obj = null;
                String str16 = str6;
                str4 = str5;
                Bundle zza = zzz().zza(str3, str2, bundle, listOf, z3, true);
                zzhr zzhr = (zza != null && zza.containsKey(str8) && zza.containsKey(str15)) ? new zzhr(zza.getString(str7), zza.getString(str8), Long.valueOf(zza.getLong(str15)).longValue()) : null;
                zzhr zzhr2 = zzhr == null ? zzin : zzhr;
                String str17 = "_ae";
                if (zzad().zzz(str16)) {
                    zzae();
                    if (zzt().zzin() != null && str17.equals(str4)) {
                        long zzjb = zzv().zzjb();
                        if (zzjb > 0) {
                            zzz().zzb(zza, zzjb);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(zza);
                long nextLong = zzz().zzjw().nextLong();
                if (zzad().zze(zzr().zzag(), zzak.zzid) && zzac().zzma.get() > 0 && zzac().zzx(j) && zzac().zzmd.get()) {
                    zzab().zzgs().zzao("Current session is expired, remove the session number and Id");
                    if (zzad().zze(zzr().zzag(), zzak.zzhz)) {
                        str10 = str14;
                        zza("auto", "_sid", null, zzx().currentTimeMillis());
                    } else {
                        str10 = str14;
                    }
                    if (zzad().zze(zzr().zzag(), zzak.zzia)) {
                        zza("auto", "_sno", null, zzx().currentTimeMillis());
                    }
                } else {
                    str10 = str14;
                }
                if (zzad().zzy(zzr().zzag()) && zza.getLong("extend_session", 0) == 1) {
                    zzab().zzgs().zzao("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.zzj.zzv().zza(j, true);
                } else {
                    j3 = j;
                }
                String[] strArr = (String[]) zza.keySet().toArray(new String[bundle.size()]);
                Arrays.sort(strArr);
                int length = strArr.length;
                zzbl = 0;
                int i3 = 0;
                while (true) {
                    str11 = "_eid";
                    if (zzbl >= length) {
                        break;
                    }
                    int i4;
                    int i5;
                    ArrayList arrayList2;
                    zzhr zzhr3;
                    str16 = strArr[zzbl];
                    Object obj2 = zza.get(str16);
                    zzz();
                    String[] strArr2 = strArr;
                    Bundle[] zzb = zzjs.zzb(obj2);
                    if (zzb != null) {
                        i4 = length;
                        zza.putInt(str16, zzb.length);
                        length = 0;
                        while (length < zzb.length) {
                            Bundle bundle4 = zzb[length];
                            zzhq.zza(zzhr2, bundle4, true);
                            str12 = str11;
                            int i6 = i3;
                            int i7 = length;
                            i5 = zzbl;
                            j4 = nextLong;
                            bundle2 = bundle4;
                            arrayList2 = arrayList;
                            zzhr3 = zzhr2;
                            str13 = str17;
                            bundle3 = zza;
                            Bundle zza2 = zzz().zza(str3, "_ep", bundle2, listOf, z3, false);
                            zza2.putString("_en", str4);
                            zza2.putLong(str12, j4);
                            zza2.putString("_gn", str16);
                            zza2.putInt("_ll", zzb.length);
                            int i8 = i7;
                            zza2.putInt("_i", i8);
                            arrayList2.add(zza2);
                            int i9 = i8 + 1;
                            zza = bundle3;
                            nextLong = j4;
                            arrayList = arrayList2;
                            length = i9;
                            zzbl = i5;
                            zzhr2 = zzhr3;
                            i3 = i6;
                            str17 = str13;
                            str11 = str12;
                        }
                        zzhr3 = zzhr2;
                        i5 = zzbl;
                        j4 = nextLong;
                        arrayList2 = arrayList;
                        str13 = str17;
                        bundle3 = zza;
                        i3 += zzb.length;
                    } else {
                        zzhr3 = zzhr2;
                        i4 = length;
                        i5 = zzbl;
                        i = i3;
                        j4 = nextLong;
                        arrayList2 = arrayList;
                        str13 = str17;
                        bundle3 = zza;
                    }
                    zza = bundle3;
                    nextLong = j4;
                    arrayList = arrayList2;
                    length = i4;
                    zzhr2 = zzhr3;
                    str17 = str13;
                    j3 = j;
                    zzbl = i5 + 1;
                    strArr = strArr2;
                }
                str12 = str11;
                i = i3;
                j4 = nextLong;
                List list = arrayList;
                str13 = str17;
                bundle3 = zza;
                if (i != 0) {
                    bundle3.putLong(str12, j4);
                    bundle3.putInt("_epc", i);
                }
                int i10 = 0;
                while (i10 < list.size()) {
                    Bundle bundle5 = (Bundle) list.get(i10);
                    if ((i10 != 0 ? 1 : null) != null) {
                        str8 = "_ep";
                        str11 = str4;
                    } else {
                        str8 = str4;
                        str11 = str8;
                    }
                    String str18 = str10;
                    bundle5.putString(str18, str);
                    if (z2) {
                        bundle5 = zzz().zzg(bundle5);
                    }
                    Bundle bundle6 = bundle5;
                    zzab().zzgr().zza("Logging event (FE)", zzy().zzaj(str11), zzy().zzc(bundle6));
                    List list2 = list;
                    zzs().zzc(new zzai(str8, new zzah(bundle6), str, j), str3);
                    if (!equals) {
                        for (zzgn onEvent : this.zzpw) {
                            onEvent.onEvent(str, str2, new Bundle(bundle6), j);
                        }
                    }
                    i10++;
                    str4 = str11;
                    str10 = str18;
                    list = list2;
                }
                str11 = str4;
                zzae();
                if (zzt().zzin() != null && str13.equals(str11)) {
                    zzv().zza(true, true);
                }
                return;
            } else {
                return;
            }
        }
        zzab().zzgr().zzao("Event not sent since app measurement is disabled");
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        boolean z3;
        zzm();
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!z2) {
        } else if (!(this.zzpv == null || zzjs.zzbq(str2))) {
            z3 = false;
            zzb(str3, str2, j, bundle2, z2, z3, z ^ 1, null);
        }
        z3 = true;
        zzb(str3, str2, j, bundle2, z2, z3, z ^ 1, null);
    }

    private final void zzb(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzaa().zza(new zzgr(this, str, str2, j, zzjs.zzh(bundle), z, z2, z3, str3));
    }

    public final void zzb(String str, String str2, Object obj, boolean z) {
        zza(str, str2, obj, z, zzx().currentTimeMillis());
    }

    public final void zza(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = zzz().zzbm(str2);
        } else {
            zzjs zzz = zzz();
            String str4 = "user property";
            if (zzz.zzp(str4, str2)) {
                if (!zzz.zza(str4, zzgl.zzpp, str2)) {
                    i = 15;
                } else if (zzz.zza(str4, 24, str2)) {
                    i = 0;
                }
            }
        }
        String str5 = "_ev";
        if (i != 0) {
            zzz();
            String zza = zzjs.zza(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.zzj.zzz().zza(i, str5, zza, i2);
        } else if (obj != null) {
            i = zzz().zzc(str2, obj);
            if (i != 0) {
                zzz();
                str2 = zzjs.zza(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.zzj.zzz().zza(i, str5, str2, i2);
                return;
            }
            Object zzd = zzz().zzd(str2, obj);
            if (zzd != null) {
                zza(str3, str2, j, zzd);
            }
        } else {
            zza(str3, str2, j, null);
        }
    }

    private final void zza(String str, String str2, long j, Object obj) {
        zzaa().zza(new zzgq(this, str, str2, obj, j));
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    @androidx.annotation.WorkerThread
    public final void zza(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
        r8 = this;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10);
        r8.zzo();
        r8.zzm();
        r8.zzbi();
        r0 = r8.zzad();
        r1 = r8.zzr();
        r1 = r1.zzag();
        r2 = com.google.android.gms.measurement.internal.zzak.zzik;
        r0 = r0.zze(r1, r2);
        r1 = "_npa";
        if (r0 == 0) goto L_0x007c;
    L_0x0025:
        r0 = "allow_personalized_ads";
        r0 = r0.equals(r10);
        if (r0 == 0) goto L_0x007c;
    L_0x002d:
        r0 = r11 instanceof java.lang.String;
        if (r0 == 0) goto L_0x006b;
    L_0x0031:
        r0 = r11;
        r0 = (java.lang.String) r0;
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x006b;
    L_0x003a:
        r10 = java.util.Locale.ENGLISH;
        r10 = r0.toLowerCase(r10);
        r11 = "false";
        r10 = r11.equals(r10);
        r2 = 1;
        if (r10 == 0) goto L_0x004c;
    L_0x004a:
        r4 = r2;
        goto L_0x004e;
    L_0x004c:
        r4 = 0;
    L_0x004e:
        r10 = java.lang.Long.valueOf(r4);
        r0 = r8.zzac();
        r0 = r0.zzlx;
        r4 = r10;
        r4 = (java.lang.Long) r4;
        r4 = r4.longValue();
        r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r6 != 0) goto L_0x0066;
    L_0x0063:
        r11 = "true";
    L_0x0066:
        r0.zzau(r11);
        r6 = r10;
        goto L_0x007a;
    L_0x006b:
        if (r11 != 0) goto L_0x007c;
    L_0x006d:
        r10 = r8.zzac();
        r10 = r10.zzlx;
        r0 = "unset";
        r10.zzau(r0);
        r6 = r11;
    L_0x007a:
        r3 = r1;
        goto L_0x007e;
    L_0x007c:
        r3 = r10;
        r6 = r11;
    L_0x007e:
        r10 = r8.zzj;
        r10 = r10.isEnabled();
        if (r10 != 0) goto L_0x0094;
    L_0x0086:
        r9 = r8.zzab();
        r9 = r9.zzgr();
        r10 = "User property not set since app measurement is disabled";
        r9.zzao(r10);
        return;
    L_0x0094:
        r10 = r8.zzj;
        r10 = r10.zzie();
        if (r10 != 0) goto L_0x009d;
    L_0x009c:
        return;
    L_0x009d:
        r10 = r8.zzab();
        r10 = r10.zzgr();
        r11 = r8.zzy();
        r11 = r11.zzaj(r3);
        r0 = "Setting user property (FE)";
        r10.zza(r0, r11, r6);
        r10 = new com.google.android.gms.measurement.internal.zzjn;
        r2 = r10;
        r4 = r12;
        r7 = r9;
        r2.<init>(r3, r4, r6, r7);
        r9 = r8.zzs();
        r9.zzb(r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgp.zza(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final List<zzjn> zzh(boolean z) {
        zzm();
        zzbi();
        zzab().zzgr().zzao("Fetching user attributes (FE)");
        if (zzaa().zzhp()) {
            zzab().zzgk().zzao("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (zzr.isMainThread()) {
            zzab().zzgk().zzao("Cannot get all user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.zzj.zzaa().zza(new zzgt(this, atomicReference, z));
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    zzab().zzgn().zza("Interrupted waiting for get user properties", e);
                }
            }
            List<zzjn> list = (List) atomicReference.get();
            if (list == null) {
                zzab().zzgn().zzao("Timed out waiting for get user properties");
                list = Collections.emptyList();
            }
            return list;
        }
    }

    @Nullable
    public final String zzi() {
        zzm();
        return (String) this.zzpy.get();
    }

    @Nullable
    public final String zzy(long j) {
        if (zzaa().zzhp()) {
            zzab().zzgk().zzao("Cannot retrieve app instance id from analytics worker thread");
            return null;
        } else if (zzr.isMainThread()) {
            zzab().zzgk().zzao("Cannot retrieve app instance id from main thread");
            return null;
        } else {
            j = zzx().elapsedRealtime();
            String zzz = zzz(120000);
            long elapsedRealtime = zzx().elapsedRealtime() - j;
            if (zzz == null && elapsedRealtime < 120000) {
                zzz = zzz(120000 - elapsedRealtime);
            }
            return zzz;
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzbg(@Nullable String str) {
        this.zzpy.set(str);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|12|13) */
    /* JADX WARNING: Missing block: B:11:?, code skipped:
            zzab().zzgn().zzao("Interrupted waiting for app instance id");
     */
    /* JADX WARNING: Missing block: B:13:0x002c, code skipped:
            return null;
     */
    @androidx.annotation.Nullable
    private final java.lang.String zzz(long r4) {
        /*
        r3 = this;
        r0 = new java.util.concurrent.atomic.AtomicReference;
        r0.<init>();
        monitor-enter(r0);
        r1 = r3.zzaa();	 Catch:{ all -> 0x002d }
        r2 = new com.google.android.gms.measurement.internal.zzgs;	 Catch:{ all -> 0x002d }
        r2.<init>(r3, r0);	 Catch:{ all -> 0x002d }
        r1.zza(r2);	 Catch:{ all -> 0x002d }
        r0.wait(r4);	 Catch:{ InterruptedException -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x002d }
        r4 = r0.get();
        r4 = (java.lang.String) r4;
        return r4;
    L_0x001d:
        r4 = r3.zzab();	 Catch:{ all -> 0x002d }
        r4 = r4.zzgn();	 Catch:{ all -> 0x002d }
        r5 = "Interrupted waiting for app instance id";
        r4.zzao(r5);	 Catch:{ all -> 0x002d }
        r4 = 0;
        monitor-exit(r0);	 Catch:{ all -> 0x002d }
        return r4;
    L_0x002d:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002d }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgp.zzz(long):java.lang.String");
    }

    public final void resetAnalyticsData(long j) {
        zzbg(null);
        zzaa().zza(new zzgv(this, j));
    }

    @WorkerThread
    public final void zzim() {
        zzo();
        zzm();
        zzbi();
        if (this.zzj.zzie()) {
            zzs().zzim();
            this.zzpz = false;
            String zzhh = zzac().zzhh();
            if (!TextUtils.isEmpty(zzhh)) {
                zzw().zzbi();
                if (!zzhh.equals(VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", zzhh);
                    logEvent("auto", "_ou", bundle);
                }
            }
        }
    }

    @WorkerThread
    public final void zza(zzgk zzgk) {
        zzo();
        zzm();
        zzbi();
        if (zzgk != null) {
            zzgk zzgk2 = this.zzpv;
            if (zzgk != zzgk2) {
                Preconditions.checkState(zzgk2 == null, "EventInterceptor already set.");
            }
        }
        this.zzpv = zzgk;
    }

    public final void zza(zzgn zzgn) {
        zzm();
        zzbi();
        Preconditions.checkNotNull(zzgn);
        if (!this.zzpw.add(zzgn)) {
            zzab().zzgn().zzao("OnEventListener already registered");
        }
    }

    public final void zzb(zzgn zzgn) {
        zzm();
        zzbi();
        Preconditions.checkNotNull(zzgn);
        if (!this.zzpw.remove(zzgn)) {
            zzab().zzgn().zzao("OnEventListener had not been registered");
        }
    }

    public final void setConditionalUserProperty(Bundle bundle) {
        setConditionalUserProperty(bundle, zzx().currentTimeMillis());
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        zzm();
        Bundle bundle2 = new Bundle(bundle);
        String str = "app_id";
        if (!TextUtils.isEmpty(bundle2.getString(str))) {
            zzab().zzgn().zzao("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(str);
        zza(bundle2, j);
    }

    public final void zzd(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString("app_id"));
        zzl();
        zza(new Bundle(bundle), zzx().currentTimeMillis());
    }

    private final void zza(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        zzgg.zza(bundle, "app_id", String.class, null);
        String str = ConditionalUserProperty.ORIGIN;
        zzgg.zza(bundle, str, String.class, null);
        String str2 = ConditionalUserProperty.NAME;
        zzgg.zza(bundle, str2, String.class, null);
        String str3 = ConditionalUserProperty.VALUE;
        zzgg.zza(bundle, str3, Object.class, null);
        String str4 = ConditionalUserProperty.TRIGGER_EVENT_NAME;
        zzgg.zza(bundle, str4, String.class, null);
        Long valueOf = Long.valueOf(0);
        String str5 = ConditionalUserProperty.TRIGGER_TIMEOUT;
        zzgg.zza(bundle, str5, Long.class, valueOf);
        zzgg.zza(bundle, ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgg.zza(bundle, ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgg.zza(bundle, ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgg.zza(bundle, ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        String str6 = ConditionalUserProperty.TIME_TO_LIVE;
        zzgg.zza(bundle, str6, Long.class, valueOf);
        zzgg.zza(bundle, ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgg.zza(bundle, ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle.getString(str2));
        Preconditions.checkNotEmpty(bundle.getString(str));
        Preconditions.checkNotNull(bundle.get(str3));
        bundle.putLong(ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle.getString(str2);
        Object obj = bundle.get(str3);
        if (zzz().zzbm(string) != 0) {
            zzab().zzgk().zza("Invalid conditional user property name", zzy().zzal(string));
        } else if (zzz().zzc(string, obj) != 0) {
            zzab().zzgk().zza("Invalid conditional user property value", zzy().zzal(string), obj);
        } else {
            Object zzd = zzz().zzd(string, obj);
            if (zzd == null) {
                zzab().zzgk().zza("Unable to normalize conditional user property value", zzy().zzal(string), obj);
                return;
            }
            zzgg.zza(bundle, zzd);
            long j2 = bundle.getLong(str5);
            if (TextUtils.isEmpty(bundle.getString(str4)) || (j2 <= 15552000000L && j2 >= 1)) {
                j2 = bundle.getLong(str6);
                if (j2 > 15552000000L || j2 < 1) {
                    zzab().zzgk().zza("Invalid conditional user property time to live", zzy().zzal(string), Long.valueOf(j2));
                    return;
                }
                zzaa().zza(new zzgx(this, bundle));
                return;
            }
            zzab().zzgk().zza("Invalid conditional user property timeout", zzy().zzal(string), Long.valueOf(j2));
        }
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzm();
        zza(null, str, str2, bundle);
    }

    public final void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotEmpty(str);
        zzl();
        zza(str, str2, str3, bundle);
    }

    private final void zza(String str, String str2, String str3, Bundle bundle) {
        long currentTimeMillis = zzx().currentTimeMillis();
        Preconditions.checkNotEmpty(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString(ConditionalUserProperty.NAME, str2);
        bundle2.putLong(ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str3 != null) {
            bundle2.putString(ConditionalUserProperty.EXPIRED_EVENT_NAME, str3);
            bundle2.putBundle(ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzaa().zza(new zzgw(this, bundle2));
    }

    @WorkerThread
    private final void zze(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = "app_id";
        zzo();
        zzbi();
        Preconditions.checkNotNull(bundle);
        String str2 = ConditionalUserProperty.NAME;
        Preconditions.checkNotEmpty(bundle2.getString(str2));
        String str3 = ConditionalUserProperty.ORIGIN;
        Preconditions.checkNotEmpty(bundle2.getString(str3));
        String str4 = ConditionalUserProperty.VALUE;
        Preconditions.checkNotNull(bundle2.get(str4));
        if (this.zzj.isEnabled()) {
            zzjn zzjn = new zzjn(bundle2.getString(str2), bundle2.getLong(ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle2.get(str4), bundle2.getString(str3));
            try {
                zzai zza = zzz().zza(bundle2.getString(str), bundle2.getString(ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle2.getBundle(ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), bundle2.getString(str3), 0, true, false);
                zzs().zzd(new zzq(bundle2.getString(str), bundle2.getString(str3), zzjn, bundle2.getLong(ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle2.getString(ConditionalUserProperty.TRIGGER_EVENT_NAME), zzz().zza(bundle2.getString(str), bundle2.getString(ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle2.getBundle(ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), bundle2.getString(str3), 0, true, false), bundle2.getLong(ConditionalUserProperty.TRIGGER_TIMEOUT), zza, bundle2.getLong(ConditionalUserProperty.TIME_TO_LIVE), zzz().zza(bundle2.getString(str), bundle2.getString(ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle2.getBundle(ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle2.getString(str3), 0, true, false)));
            } catch (IllegalArgumentException unused) {
            }
            return;
        }
        zzab().zzgr().zzao("Conditional property not sent since collection is disabled");
    }

    @WorkerThread
    private final void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = ConditionalUserProperty.CREATION_TIMESTAMP;
        String str2 = ConditionalUserProperty.ORIGIN;
        String str3 = "app_id";
        zzo();
        zzbi();
        Preconditions.checkNotNull(bundle);
        String str4 = ConditionalUserProperty.NAME;
        Preconditions.checkNotEmpty(bundle2.getString(str4));
        if (this.zzj.isEnabled()) {
            zzjn zzjn = new zzjn(bundle2.getString(str4), 0, null, null);
            try {
                zzai zza = zzz().zza(bundle2.getString(str3), bundle2.getString(ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle2.getBundle(ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle2.getString(str2), bundle2.getLong(str), true, false);
                zzjn zzjn2 = zzjn;
                zzs().zzd(new zzq(bundle2.getString(str3), bundle2.getString(str2), zzjn2, bundle2.getLong(str), bundle2.getBoolean(ConditionalUserProperty.ACTIVE), bundle2.getString(ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle2.getLong(ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle2.getLong(ConditionalUserProperty.TIME_TO_LIVE), zza));
            } catch (IllegalArgumentException unused) {
            }
            return;
        }
        zzab().zzgr().zzao("Conditional property not cleared since collection is disabled");
    }

    public final ArrayList<Bundle> zzn(String str, String str2) {
        zzm();
        return zze(null, str, str2);
    }

    public final ArrayList<Bundle> zzd(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzl();
        return zze(str, str2, str3);
    }

    @VisibleForTesting
    private final ArrayList<Bundle> zze(String str, String str2, String str3) {
        if (zzaa().zzhp()) {
            zzab().zzgk().zzao("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        } else if (zzr.isMainThread()) {
            zzab().zzgk().zzao("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.zzj.zzaa().zza(new zzgz(this, atomicReference, str, str2, str3));
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    zzab().zzgn().zza("Interrupted waiting for get conditional user properties", str, e);
                }
            }
            List list = (List) atomicReference.get();
            if (list != null) {
                return zzjs.zzd(list);
            }
            zzab().zzgn().zza("Timed out waiting for get conditional user properties", str);
            return new ArrayList();
        }
    }

    public final Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        zzm();
        return zzb(null, str, str2, z);
    }

    public final Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        Preconditions.checkNotEmpty(str);
        zzl();
        return zzb(str, str2, str3, z);
    }

    @VisibleForTesting
    private final Map<String, Object> zzb(String str, String str2, String str3, boolean z) {
        if (zzaa().zzhp()) {
            zzab().zzgk().zzao("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (zzr.isMainThread()) {
            zzab().zzgk().zzao("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.zzj.zzaa().zza(new zzhb(this, atomicReference, str, str2, str3, z));
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    zzab().zzgn().zza("Interrupted waiting for get user properties", e);
                }
            }
            List<zzjn> list = (List) atomicReference.get();
            if (list == null) {
                zzab().zzgn().zzao("Timed out waiting for get user properties");
                return Collections.emptyMap();
            }
            ArrayMap arrayMap = new ArrayMap(list.size());
            for (zzjn zzjn : list) {
                arrayMap.put(zzjn.name, zzjn.getValue());
            }
            return arrayMap;
        }
    }

    @Nullable
    public final String getCurrentScreenName() {
        zzhr zzio = this.zzj.zzt().zzio();
        return zzio != null ? zzio.zzqu : null;
    }

    @Nullable
    public final String getCurrentScreenClass() {
        zzhr zzio = this.zzj.zzt().zzio();
        return zzio != null ? zzio.zzqv : null;
    }

    @Nullable
    public final String getGmpAppId() {
        if (this.zzj.zzhx() != null) {
            return this.zzj.zzhx();
        }
        try {
            return GoogleServices.getGoogleAppId();
        } catch (IllegalStateException e) {
            this.zzj.zzab().zzgk().zza("getGoogleAppId failed with exception", e);
            return null;
        }
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

    public final /* bridge */ /* synthetic */ zza zzp() {
        return super.zzp();
    }

    public final /* bridge */ /* synthetic */ zzgp zzq() {
        return super.zzq();
    }

    public final /* bridge */ /* synthetic */ zzdy zzr() {
        return super.zzr();
    }

    public final /* bridge */ /* synthetic */ zzhv zzs() {
        return super.zzs();
    }

    public final /* bridge */ /* synthetic */ zzhq zzt() {
        return super.zzt();
    }

    public final /* bridge */ /* synthetic */ zzeb zzu() {
        return super.zzu();
    }

    public final /* bridge */ /* synthetic */ zziw zzv() {
        return super.zzv();
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
