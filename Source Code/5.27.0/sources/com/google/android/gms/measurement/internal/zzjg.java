package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzbs.zzc;
import com.google.android.gms.internal.measurement.zzbs.zze;
import com.google.android.gms.internal.measurement.zzbs.zzg;
import com.google.android.gms.internal.measurement.zzbs.zzk;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzey;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzjg implements zzgh {
    private static volatile zzjg zzsn;
    private boolean zzdh;
    private final zzfj zzj;
    private zzfd zzso;
    private zzej zzsp;
    private zzx zzsq;
    private zzem zzsr;
    private zzjc zzss;
    private zzp zzst;
    private final zzjo zzsu;
    private zzhp zzsv;
    private boolean zzsw;
    private boolean zzsx;
    @VisibleForTesting
    private long zzsy;
    private List<Runnable> zzsz;
    private int zzta;
    private int zztb;
    private boolean zztc;
    private boolean zztd;
    private boolean zzte;
    private FileLock zztf;
    private FileChannel zztg;
    private List<Long> zzth;
    private List<Long> zzti;
    private long zztj;

    class zza implements zzz {
        zzg zztn;
        List<Long> zzto;
        List<zzc> zztp;
        private long zztq;

        private zza() {
        }

        public final void zzb(zzg zzg) {
            Preconditions.checkNotNull(zzg);
            this.zztn = zzg;
        }

        public final boolean zza(long j, zzc zzc) {
            Preconditions.checkNotNull(zzc);
            if (this.zztp == null) {
                this.zztp = new ArrayList();
            }
            if (this.zzto == null) {
                this.zzto = new ArrayList();
            }
            if (this.zztp.size() > 0 && zza((zzc) this.zztp.get(0)) != zza(zzc)) {
                return false;
            }
            long zzuk = this.zztq + ((long) zzc.zzuk());
            if (zzuk >= ((long) Math.max(0, ((Integer) zzak.zzgn.get(null)).intValue()))) {
                return false;
            }
            this.zztq = zzuk;
            this.zztp.add(zzc);
            this.zzto.add(Long.valueOf(j));
            if (this.zztp.size() >= Math.max(1, ((Integer) zzak.zzgo.get(null)).intValue())) {
                return false;
            }
            return true;
        }

        private static long zza(zzc zzc) {
            return ((zzc.getTimestampMillis() / 1000) / 60) / 60;
        }

        /* synthetic */ zza(zzjg zzjg, zzjj zzjj) {
            this();
        }
    }

    public static zzjg zzm(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzsn == null) {
            synchronized (zzjg.class) {
                if (zzsn == null) {
                    zzsn = new zzjg(new zzjm(context));
                }
            }
        }
        return zzsn;
    }

    private zzjg(zzjm zzjm) {
        this(zzjm, null);
    }

    private zzjg(zzjm zzjm, zzfj zzfj) {
        this.zzdh = false;
        Preconditions.checkNotNull(zzjm);
        this.zzj = zzfj.zza(zzjm.zzob, null);
        this.zztj = -1;
        zzjo zzjo = new zzjo(this);
        zzjo.initialize();
        this.zzsu = zzjo;
        zzej zzej = new zzej(this);
        zzej.initialize();
        this.zzsp = zzej;
        zzfd zzfd = new zzfd(this);
        zzfd.initialize();
        this.zzso = zzfd;
        this.zzj.zzaa().zza(new zzjj(this, zzjm));
    }

    @WorkerThread
    private final void zza(zzjm zzjm) {
        this.zzj.zzaa().zzo();
        zzx zzx = new zzx(this);
        zzx.initialize();
        this.zzsq = zzx;
        this.zzj.zzad().zza(this.zzso);
        zzp zzp = new zzp(this);
        zzp.initialize();
        this.zzst = zzp;
        zzhp zzhp = new zzhp(this);
        zzhp.initialize();
        this.zzsv = zzhp;
        zzjc zzjc = new zzjc(this);
        zzjc.initialize();
        this.zzss = zzjc;
        this.zzsr = new zzem(this);
        if (this.zzta != this.zztb) {
            this.zzj.zzab().zzgk().zza("Not all upload components initialized", Integer.valueOf(this.zzta), Integer.valueOf(this.zztb));
        }
        this.zzdh = true;
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void start() {
        this.zzj.zzaa().zzo();
        zzgy().zzca();
        if (this.zzj.zzac().zzlj.get() == 0) {
            this.zzj.zzac().zzlj.set(this.zzj.zzx().currentTimeMillis());
        }
        zzjn();
    }

    public final zzr zzae() {
        return this.zzj.zzae();
    }

    public final zzs zzad() {
        return this.zzj.zzad();
    }

    public final zzef zzab() {
        return this.zzj.zzab();
    }

    public final zzfc zzaa() {
        return this.zzj.zzaa();
    }

    public final zzfd zzgz() {
        zza(this.zzso);
        return this.zzso;
    }

    public final zzej zzjf() {
        zza(this.zzsp);
        return this.zzsp;
    }

    public final zzx zzgy() {
        zza(this.zzsq);
        return this.zzsq;
    }

    private final zzem zzjg() {
        zzem zzem = this.zzsr;
        if (zzem != null) {
            return zzem;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zzjc zzjh() {
        zza(this.zzss);
        return this.zzss;
    }

    public final zzp zzgx() {
        zza(this.zzst);
        return this.zzst;
    }

    public final zzhp zzji() {
        zza(this.zzsv);
        return this.zzsv;
    }

    public final zzjo zzgw() {
        zza(this.zzsu);
        return this.zzsu;
    }

    public final zzed zzy() {
        return this.zzj.zzy();
    }

    public final Context getContext() {
        return this.zzj.getContext();
    }

    public final Clock zzx() {
        return this.zzj.zzx();
    }

    public final zzjs zzz() {
        return this.zzj.zzz();
    }

    @WorkerThread
    private final void zzo() {
        this.zzj.zzaa().zzo();
    }

    /* Access modifiers changed, original: final */
    public final void zzjj() {
        if (!this.zzdh) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    private static void zza(zzjh zzjh) {
        if (zzjh == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!zzjh.isInitialized()) {
            String valueOf = String.valueOf(zzjh.getClass());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
            stringBuilder.append("Component not initialized: ");
            stringBuilder.append(valueOf);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void zze(zzn zzn) {
        zzo();
        zzjj();
        Preconditions.checkNotEmpty(zzn.packageName);
        zzg(zzn);
    }

    private final long zzjk() {
        long currentTimeMillis = this.zzj.zzx().currentTimeMillis();
        zzeo zzac = this.zzj.zzac();
        zzac.zzbi();
        zzac.zzo();
        long j = zzac.zzln.get();
        if (j == 0) {
            j = 1 + ((long) zzac.zzz().zzjw().nextInt(86400000));
            zzac.zzln.set(j);
        }
        return ((((currentTimeMillis + j) / 1000) / 60) / 60) / 24;
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzd(zzai zzai, String str) {
        zzai zzai2 = zzai;
        String str2 = str;
        zzf zzab = zzgy().zzab(str2);
        if (zzab == null || TextUtils.isEmpty(zzab.zzal())) {
            this.zzj.zzab().zzgr().zza("No app data available; dropping event", str2);
            return;
        }
        Boolean zzc = zzc(zzab);
        if (zzc == null) {
            if (!"_ui".equals(zzai2.name)) {
                this.zzj.zzab().zzgn().zza("Could not find package. appId", zzef.zzam(str));
            }
        } else if (!zzc.booleanValue()) {
            this.zzj.zzab().zzgk().zza("App version does not match; dropping event. appId", zzef.zzam(str));
            return;
        }
        zzn zzn = r2;
        zzf zzf = zzab;
        zzn zzn2 = new zzn(str, zzab.getGmpAppId(), zzab.zzal(), zzab.zzam(), zzab.zzan(), zzab.zzao(), zzab.zzap(), null, zzab.isMeasurementEnabled(), false, zzf.getFirebaseInstanceId(), zzf.zzbd(), 0, 0, zzf.zzbe(), zzf.zzbf(), false, zzf.zzah(), zzf.zzbg(), zzf.zzaq(), zzf.zzbh());
        zzc(zzai2, zzn);
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzc(zzai zzai, zzn zzn) {
        zzai zzai2 = zzai;
        zzn zzn2 = zzn;
        Preconditions.checkNotNull(zzn);
        Preconditions.checkNotEmpty(zzn2.packageName);
        zzo();
        zzjj();
        String str = zzn2.packageName;
        long j = zzai2.zzfu;
        if (!zzgw().zze(zzai2, zzn2)) {
            return;
        }
        if (zzn2.zzcq) {
            if (this.zzj.zzad().zze(str, zzak.zzix) && zzn2.zzcw != null) {
                if (zzn2.zzcw.contains(zzai2.name)) {
                    Bundle zzcv = zzai2.zzfq.zzcv();
                    zzcv.putLong("ga_safelisted", 1);
                    zzai2 = new zzai(zzai2.name, new zzah(zzcv), zzai2.origin, zzai2.zzfu);
                } else {
                    this.zzj.zzab().zzgr().zza("Dropping non-safelisted event. appId, event name, origin", str, zzai2.name, zzai2.origin);
                    return;
                }
            }
            zzgy().beginTransaction();
            try {
                List emptyList;
                zzx zzgy = zzgy();
                Preconditions.checkNotEmpty(str);
                zzgy.zzo();
                zzgy.zzbi();
                if (j < 0) {
                    zzgy.zzab().zzgn().zza("Invalid time querying timed out conditional properties", zzef.zzam(str), Long.valueOf(j));
                    emptyList = Collections.emptyList();
                } else {
                    emptyList = zzgy.zzb("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzq zzq : emptyList) {
                    if (zzq != null) {
                        this.zzj.zzab().zzgr().zza("User property timed out", zzq.packageName, this.zzj.zzy().zzal(zzq.zzdw.name), zzq.zzdw.getValue());
                        if (zzq.zzdx != null) {
                            zzd(new zzai(zzq.zzdx, j), zzn2);
                        }
                        zzgy().zzg(str, zzq.zzdw.name);
                    }
                }
                zzgy = zzgy();
                Preconditions.checkNotEmpty(str);
                zzgy.zzo();
                zzgy.zzbi();
                if (j < 0) {
                    zzgy.zzab().zzgn().zza("Invalid time querying expired conditional properties", zzef.zzam(str), Long.valueOf(j));
                    emptyList = Collections.emptyList();
                } else {
                    emptyList = zzgy.zzb("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(r4.size());
                for (zzq zzq2 : r4) {
                    if (zzq2 != null) {
                        this.zzj.zzab().zzgr().zza("User property expired", zzq2.packageName, this.zzj.zzy().zzal(zzq2.zzdw.name), zzq2.zzdw.getValue());
                        zzgy().zzd(str, zzq2.zzdw.name);
                        if (zzq2.zzdz != null) {
                            arrayList.add(zzq2.zzdz);
                        }
                        zzgy().zzg(str, zzq2.zzdw.name);
                    }
                }
                arrayList = arrayList;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zzd(new zzai((zzai) obj, j), zzn2);
                }
                zzgy = zzgy();
                String str2 = zzai2.name;
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotEmpty(str2);
                zzgy.zzo();
                zzgy.zzbi();
                List emptyList2;
                if (j < 0) {
                    zzgy.zzab().zzgn().zza("Invalid time querying triggered conditional properties", zzef.zzam(str), zzgy.zzy().zzaj(str2), Long.valueOf(j));
                    emptyList2 = Collections.emptyList();
                } else {
                    emptyList2 = zzgy.zzb("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(emptyList2.size());
                for (zzq zzq3 : emptyList2) {
                    if (zzq3 != null) {
                        zzjn zzjn = zzq3.zzdw;
                        zzjp zzjp = r4;
                        zzjp zzjp2 = new zzjp(zzq3.packageName, zzq3.origin, zzjn.name, j, zzjn.getValue());
                        if (zzgy().zza(zzjp)) {
                            this.zzj.zzab().zzgr().zza("User property triggered", zzq3.packageName, this.zzj.zzy().zzal(zzjp.name), zzjp.value);
                        } else {
                            this.zzj.zzab().zzgk().zza("Too many active user properties, ignoring", zzef.zzam(zzq3.packageName), this.zzj.zzy().zzal(zzjp.name), zzjp.value);
                        }
                        if (zzq3.zzdy != null) {
                            arrayList2.add(zzq3.zzdy);
                        }
                        zzq3.zzdw = new zzjn(zzjp);
                        zzq3.active = true;
                        zzgy().zza(zzq3);
                    }
                }
                zzd(zzai2, zzn2);
                arrayList2 = arrayList2;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    zzd(new zzai((zzai) obj2, j), zzn2);
                }
                zzgy().setTransactionSuccessful();
            } finally {
                zzgy().endTransaction();
            }
        } else {
            zzg(zzn2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:249:0x0854 A:{Catch:{ SQLiteException -> 0x023b, all -> 0x08c9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0884 A:{Catch:{ SQLiteException -> 0x023b, all -> 0x08c9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02f8 A:{Catch:{ SQLiteException -> 0x023b, all -> 0x08c9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02aa A:{Catch:{ SQLiteException -> 0x023b, all -> 0x08c9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02f8 A:{Catch:{ SQLiteException -> 0x023b, all -> 0x08c9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0273 A:{Catch:{ SQLiteException -> 0x023b, all -> 0x08c9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02aa A:{Catch:{ SQLiteException -> 0x023b, all -> 0x08c9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02f8 A:{Catch:{ SQLiteException -> 0x023b, all -> 0x08c9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02aa A:{Catch:{ SQLiteException -> 0x023b, all -> 0x08c9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02f8 A:{Catch:{ SQLiteException -> 0x023b, all -> 0x08c9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0325  */
    @androidx.annotation.WorkerThread
    private final void zzd(com.google.android.gms.measurement.internal.zzai r28, com.google.android.gms.measurement.internal.zzn r29) {
        /*
        r27 = this;
        r1 = r27;
        r2 = r28;
        r3 = r29;
        r4 = "_s";
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r29);
        r5 = r3.packageName;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5);
        r5 = java.lang.System.nanoTime();
        r27.zzo();
        r27.zzjj();
        r15 = r3.packageName;
        r7 = r27.zzgw();
        r7 = r7.zze(r2, r3);
        if (r7 != 0) goto L_0x0027;
    L_0x0026:
        return;
    L_0x0027:
        r7 = r3.zzcq;
        if (r7 != 0) goto L_0x002f;
    L_0x002b:
        r1.zzg(r3);
        return;
    L_0x002f:
        r7 = r27.zzgz();
        r8 = r2.name;
        r7 = r7.zzk(r15, r8);
        r14 = "_err";
        r13 = 0;
        r12 = 1;
        if (r7 == 0) goto L_0x00db;
    L_0x003f:
        r3 = r1.zzj;
        r3 = r3.zzab();
        r3 = r3.zzgn();
        r4 = com.google.android.gms.measurement.internal.zzef.zzam(r15);
        r5 = r1.zzj;
        r5 = r5.zzy();
        r6 = r2.name;
        r5 = r5.zzaj(r6);
        r6 = "Dropping blacklisted event. appId";
        r3.zza(r6, r4, r5);
        r3 = r27.zzgz();
        r3 = r3.zzbc(r15);
        if (r3 != 0) goto L_0x0075;
    L_0x0068:
        r3 = r27.zzgz();
        r3 = r3.zzbd(r15);
        if (r3 == 0) goto L_0x0073;
    L_0x0072:
        goto L_0x0075;
    L_0x0073:
        r3 = 0;
        goto L_0x0076;
    L_0x0075:
        r3 = 1;
    L_0x0076:
        if (r3 != 0) goto L_0x0091;
    L_0x0078:
        r4 = r2.name;
        r4 = r14.equals(r4);
        if (r4 != 0) goto L_0x0091;
    L_0x0080:
        r4 = r1.zzj;
        r7 = r4.zzz();
        r9 = 11;
        r11 = r2.name;
        r12 = 0;
        r10 = "_ev";
        r8 = r15;
        r7.zza(r8, r9, r10, r11, r12);
    L_0x0091:
        if (r3 == 0) goto L_0x00da;
    L_0x0093:
        r2 = r27.zzgy();
        r2 = r2.zzab(r15);
        if (r2 == 0) goto L_0x00da;
    L_0x009d:
        r3 = r2.zzat();
        r5 = r2.zzas();
        r3 = java.lang.Math.max(r3, r5);
        r5 = r1.zzj;
        r5 = r5.zzx();
        r5 = r5.currentTimeMillis();
        r5 = r5 - r3;
        r3 = java.lang.Math.abs(r5);
        r5 = com.google.android.gms.measurement.internal.zzak.zzhe;
        r5 = r5.get(r13);
        r5 = (java.lang.Long) r5;
        r5 = r5.longValue();
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x00da;
    L_0x00c8:
        r3 = r1.zzj;
        r3 = r3.zzab();
        r3 = r3.zzgr();
        r4 = "Fetching config for blacklisted app";
        r3.zzao(r4);
        r1.zzb(r2);
    L_0x00da:
        return;
    L_0x00db:
        r7 = r1.zzj;
        r7 = r7.zzab();
        r10 = 2;
        r7 = r7.isLoggable(r10);
        if (r7 == 0) goto L_0x0101;
    L_0x00e8:
        r7 = r1.zzj;
        r7 = r7.zzab();
        r7 = r7.zzgs();
        r8 = r1.zzj;
        r8 = r8.zzy();
        r8 = r8.zzb(r2);
        r9 = "Logging event";
        r7.zza(r9, r8);
    L_0x0101:
        r7 = r27.zzgy();
        r7.beginTransaction();
        r1.zzg(r3);	 Catch:{ all -> 0x08c9 }
        r7 = "_iap";
        r8 = r2.name;	 Catch:{ all -> 0x08c9 }
        r7 = r7.equals(r8);	 Catch:{ all -> 0x08c9 }
        r8 = "ecommerce_purchase";
        if (r7 != 0) goto L_0x0125;
    L_0x0117:
        r7 = r2.name;	 Catch:{ all -> 0x08c9 }
        r7 = r8.equals(r7);	 Catch:{ all -> 0x08c9 }
        if (r7 == 0) goto L_0x0120;
    L_0x011f:
        goto L_0x0125;
    L_0x0120:
        r23 = r5;
        r6 = 0;
        goto L_0x02b9;
    L_0x0125:
        r7 = r2.zzfq;	 Catch:{ all -> 0x08c9 }
        r9 = "currency";
        r7 = r7.getString(r9);	 Catch:{ all -> 0x08c9 }
        r9 = r2.name;	 Catch:{ all -> 0x08c9 }
        r8 = r8.equals(r9);	 Catch:{ all -> 0x08c9 }
        r9 = "value";
        if (r8 == 0) goto L_0x018d;
    L_0x0138:
        r8 = r2.zzfq;	 Catch:{ all -> 0x08c9 }
        r8 = r8.zzah(r9);	 Catch:{ all -> 0x08c9 }
        r16 = r8.doubleValue();	 Catch:{ all -> 0x08c9 }
        r18 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r16 = r16 * r18;
        r20 = 0;
        r8 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1));
        if (r8 != 0) goto L_0x015f;
    L_0x014f:
        r8 = r2.zzfq;	 Catch:{ all -> 0x08c9 }
        r8 = r8.getLong(r9);	 Catch:{ all -> 0x08c9 }
        r8 = r8.longValue();	 Catch:{ all -> 0x08c9 }
        r8 = (double) r8;
        java.lang.Double.isNaN(r8);
        r16 = r8 * r18;
    L_0x015f:
        r8 = 4890909195324358656; // 0x43e0000000000000 float:0.0 double:9.223372036854776E18;
        r18 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1));
        if (r18 > 0) goto L_0x0170;
    L_0x0165:
        r8 = -4332462841530417152; // 0xc3e0000000000000 float:0.0 double:-9.223372036854776E18;
        r18 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1));
        if (r18 < 0) goto L_0x0170;
    L_0x016b:
        r8 = java.lang.Math.round(r16);	 Catch:{ all -> 0x08c9 }
        goto L_0x0197;
    L_0x0170:
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzab();	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzgn();	 Catch:{ all -> 0x08c9 }
        r8 = "Data lost. Currency value is too big. appId";
        r9 = com.google.android.gms.measurement.internal.zzef.zzam(r15);	 Catch:{ all -> 0x08c9 }
        r10 = java.lang.Double.valueOf(r16);	 Catch:{ all -> 0x08c9 }
        r7.zza(r8, r9, r10);	 Catch:{ all -> 0x08c9 }
        r23 = r5;
        r6 = 0;
        r11 = 0;
        goto L_0x02a8;
    L_0x018d:
        r8 = r2.zzfq;	 Catch:{ all -> 0x08c9 }
        r8 = r8.getLong(r9);	 Catch:{ all -> 0x08c9 }
        r8 = r8.longValue();	 Catch:{ all -> 0x08c9 }
    L_0x0197:
        r10 = android.text.TextUtils.isEmpty(r7);	 Catch:{ all -> 0x08c9 }
        if (r10 != 0) goto L_0x02a4;
    L_0x019d:
        r10 = java.util.Locale.US;	 Catch:{ all -> 0x08c9 }
        r7 = r7.toUpperCase(r10);	 Catch:{ all -> 0x08c9 }
        r10 = "[A-Z]{3}";
        r10 = r7.matches(r10);	 Catch:{ all -> 0x08c9 }
        if (r10 == 0) goto L_0x02a4;
    L_0x01ab:
        r10 = "_ltv_";
        r7 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x08c9 }
        r16 = r7.length();	 Catch:{ all -> 0x08c9 }
        if (r16 == 0) goto L_0x01bc;
    L_0x01b7:
        r7 = r10.concat(r7);	 Catch:{ all -> 0x08c9 }
        goto L_0x01c1;
    L_0x01bc:
        r7 = new java.lang.String;	 Catch:{ all -> 0x08c9 }
        r7.<init>(r10);	 Catch:{ all -> 0x08c9 }
    L_0x01c1:
        r10 = r7;
        r7 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r7 = r7.zze(r15, r10);	 Catch:{ all -> 0x08c9 }
        if (r7 == 0) goto L_0x0202;
    L_0x01cc:
        r11 = r7.value;	 Catch:{ all -> 0x08c9 }
        r11 = r11 instanceof java.lang.Long;	 Catch:{ all -> 0x08c9 }
        if (r11 != 0) goto L_0x01d3;
    L_0x01d2:
        goto L_0x0202;
    L_0x01d3:
        r7 = r7.value;	 Catch:{ all -> 0x08c9 }
        r7 = (java.lang.Long) r7;	 Catch:{ all -> 0x08c9 }
        r19 = r7.longValue();	 Catch:{ all -> 0x08c9 }
        r17 = new com.google.android.gms.measurement.internal.zzjp;	 Catch:{ all -> 0x08c9 }
        r11 = r2.origin;	 Catch:{ all -> 0x08c9 }
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzx();	 Catch:{ all -> 0x08c9 }
        r21 = r7.currentTimeMillis();	 Catch:{ all -> 0x08c9 }
        r19 = r19 + r8;
        r19 = java.lang.Long.valueOf(r19);	 Catch:{ all -> 0x08c9 }
        r7 = r17;
        r8 = r15;
        r9 = r11;
        r11 = 2;
        r23 = r5;
        r5 = 1;
        r6 = 0;
        r11 = r21;
        r13 = r19;
        r7.<init>(r8, r9, r10, r11, r13);	 Catch:{ all -> 0x08c9 }
        r5 = r17;
        goto L_0x0269;
    L_0x0202:
        r23 = r5;
        r5 = 1;
        r6 = 0;
        r7 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r11 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r11 = r11.zzad();	 Catch:{ all -> 0x08c9 }
        r12 = com.google.android.gms.measurement.internal.zzak.zzhj;	 Catch:{ all -> 0x08c9 }
        r11 = r11.zzb(r15, r12);	 Catch:{ all -> 0x08c9 }
        r11 = r11 - r5;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15);	 Catch:{ all -> 0x08c9 }
        r7.zzo();	 Catch:{ all -> 0x08c9 }
        r7.zzbi();	 Catch:{ all -> 0x08c9 }
        r12 = r7.getWritableDatabase();	 Catch:{ SQLiteException -> 0x023b }
        r13 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);";
        r5 = 3;
        r5 = new java.lang.String[r5];	 Catch:{ SQLiteException -> 0x023b }
        r5[r6] = r15;	 Catch:{ SQLiteException -> 0x023b }
        r16 = 1;
        r5[r16] = r15;	 Catch:{ SQLiteException -> 0x023b }
        r11 = java.lang.String.valueOf(r11);	 Catch:{ SQLiteException -> 0x023b }
        r16 = 2;
        r5[r16] = r11;	 Catch:{ SQLiteException -> 0x023b }
        r12.execSQL(r13, r5);	 Catch:{ SQLiteException -> 0x023b }
        goto L_0x024e;
    L_0x023b:
        r0 = move-exception;
        r5 = r0;
        r7 = r7.zzab();	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzgk();	 Catch:{ all -> 0x08c9 }
        r11 = "Error pruning currencies. appId";
        r12 = com.google.android.gms.measurement.internal.zzef.zzam(r15);	 Catch:{ all -> 0x08c9 }
        r7.zza(r11, r12, r5);	 Catch:{ all -> 0x08c9 }
    L_0x024e:
        r5 = new com.google.android.gms.measurement.internal.zzjp;	 Catch:{ all -> 0x08c9 }
        r11 = r2.origin;	 Catch:{ all -> 0x08c9 }
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzx();	 Catch:{ all -> 0x08c9 }
        r12 = r7.currentTimeMillis();	 Catch:{ all -> 0x08c9 }
        r16 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x08c9 }
        r7 = r5;
        r8 = r15;
        r9 = r11;
        r11 = r12;
        r13 = r16;
        r7.<init>(r8, r9, r10, r11, r13);	 Catch:{ all -> 0x08c9 }
    L_0x0269:
        r7 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r7 = r7.zza(r5);	 Catch:{ all -> 0x08c9 }
        if (r7 != 0) goto L_0x02a7;
    L_0x0273:
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzab();	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzgk();	 Catch:{ all -> 0x08c9 }
        r8 = "Too many unique user properties are set. Ignoring user property. appId";
        r9 = com.google.android.gms.measurement.internal.zzef.zzam(r15);	 Catch:{ all -> 0x08c9 }
        r10 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r10 = r10.zzy();	 Catch:{ all -> 0x08c9 }
        r11 = r5.name;	 Catch:{ all -> 0x08c9 }
        r10 = r10.zzal(r11);	 Catch:{ all -> 0x08c9 }
        r5 = r5.value;	 Catch:{ all -> 0x08c9 }
        r7.zza(r8, r9, r10, r5);	 Catch:{ all -> 0x08c9 }
        r5 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r5.zzz();	 Catch:{ all -> 0x08c9 }
        r9 = 9;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r8 = r15;
        r7.zza(r8, r9, r10, r11, r12);	 Catch:{ all -> 0x08c9 }
        goto L_0x02a7;
    L_0x02a4:
        r23 = r5;
        r6 = 0;
    L_0x02a7:
        r11 = 1;
    L_0x02a8:
        if (r11 != 0) goto L_0x02b9;
    L_0x02aa:
        r2 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r2.setTransactionSuccessful();	 Catch:{ all -> 0x08c9 }
        r2 = r27.zzgy();
        r2.endTransaction();
        return;
    L_0x02b9:
        r5 = r2.name;	 Catch:{ all -> 0x08c9 }
        r5 = com.google.android.gms.measurement.internal.zzjs.zzbk(r5);	 Catch:{ all -> 0x08c9 }
        r7 = r2.name;	 Catch:{ all -> 0x08c9 }
        r16 = r14.equals(r7);	 Catch:{ all -> 0x08c9 }
        r7 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r8 = r27.zzjk();	 Catch:{ all -> 0x08c9 }
        r11 = 1;
        r13 = 0;
        r17 = 0;
        r10 = r15;
        r12 = r5;
        r14 = r16;
        r18 = r15;
        r15 = r17;
        r7 = r7.zza(r8, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x08c9 }
        r8 = r7.zzeg;	 Catch:{ all -> 0x08c9 }
        r10 = com.google.android.gms.measurement.internal.zzak.zzgp;	 Catch:{ all -> 0x08c9 }
        r14 = 0;
        r10 = r10.get(r14);	 Catch:{ all -> 0x08c9 }
        r10 = (java.lang.Integer) r10;	 Catch:{ all -> 0x08c9 }
        r10 = r10.intValue();	 Catch:{ all -> 0x08c9 }
        r10 = (long) r10;	 Catch:{ all -> 0x08c9 }
        r8 = r8 - r10;
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r12 = 1;
        r14 = 0;
        r17 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));
        if (r17 <= 0) goto L_0x0325;
    L_0x02f8:
        r8 = r8 % r10;
        r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r2 != 0) goto L_0x0316;
    L_0x02fd:
        r2 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r2 = r2.zzab();	 Catch:{ all -> 0x08c9 }
        r2 = r2.zzgk();	 Catch:{ all -> 0x08c9 }
        r3 = "Data loss. Too many events logged. appId, count";
        r4 = com.google.android.gms.measurement.internal.zzef.zzam(r18);	 Catch:{ all -> 0x08c9 }
        r5 = r7.zzeg;	 Catch:{ all -> 0x08c9 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x08c9 }
        r2.zza(r3, r4, r5);	 Catch:{ all -> 0x08c9 }
    L_0x0316:
        r2 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r2.setTransactionSuccessful();	 Catch:{ all -> 0x08c9 }
        r2 = r27.zzgy();
        r2.endTransaction();
        return;
    L_0x0325:
        if (r5 == 0) goto L_0x037d;
    L_0x0327:
        r8 = r7.zzef;	 Catch:{ all -> 0x08c9 }
        r6 = com.google.android.gms.measurement.internal.zzak.zzgr;	 Catch:{ all -> 0x08c9 }
        r12 = 0;
        r6 = r6.get(r12);	 Catch:{ all -> 0x08c9 }
        r6 = (java.lang.Integer) r6;	 Catch:{ all -> 0x08c9 }
        r6 = r6.intValue();	 Catch:{ all -> 0x08c9 }
        r12 = (long) r6;	 Catch:{ all -> 0x08c9 }
        r8 = r8 - r12;
        r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));
        if (r6 <= 0) goto L_0x037d;
    L_0x033c:
        r8 = r8 % r10;
        r3 = 1;
        r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r5 != 0) goto L_0x035c;
    L_0x0343:
        r3 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r3 = r3.zzab();	 Catch:{ all -> 0x08c9 }
        r3 = r3.zzgk();	 Catch:{ all -> 0x08c9 }
        r4 = "Data loss. Too many public events logged. appId, count";
        r5 = com.google.android.gms.measurement.internal.zzef.zzam(r18);	 Catch:{ all -> 0x08c9 }
        r6 = r7.zzef;	 Catch:{ all -> 0x08c9 }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x08c9 }
        r3.zza(r4, r5, r6);	 Catch:{ all -> 0x08c9 }
    L_0x035c:
        r3 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r3.zzz();	 Catch:{ all -> 0x08c9 }
        r9 = 16;
        r10 = "_ev";
        r11 = r2.name;	 Catch:{ all -> 0x08c9 }
        r12 = 0;
        r8 = r18;
        r7.zza(r8, r9, r10, r11, r12);	 Catch:{ all -> 0x08c9 }
        r2 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r2.setTransactionSuccessful();	 Catch:{ all -> 0x08c9 }
        r2 = r27.zzgy();
        r2.endTransaction();
        return;
    L_0x037d:
        if (r16 == 0) goto L_0x03cf;
    L_0x037f:
        r8 = r7.zzei;	 Catch:{ all -> 0x08c9 }
        r6 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzad();	 Catch:{ all -> 0x08c9 }
        r10 = r3.packageName;	 Catch:{ all -> 0x08c9 }
        r11 = com.google.android.gms.measurement.internal.zzak.zzgq;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzb(r10, r11);	 Catch:{ all -> 0x08c9 }
        r10 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r6 = java.lang.Math.min(r10, r6);	 Catch:{ all -> 0x08c9 }
        r12 = 0;
        r6 = java.lang.Math.max(r12, r6);	 Catch:{ all -> 0x08c9 }
        r10 = (long) r6;	 Catch:{ all -> 0x08c9 }
        r8 = r8 - r10;
        r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));
        if (r6 <= 0) goto L_0x03d0;
    L_0x03a1:
        r10 = 1;
        r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r2 != 0) goto L_0x03c0;
    L_0x03a7:
        r2 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r2 = r2.zzab();	 Catch:{ all -> 0x08c9 }
        r2 = r2.zzgk();	 Catch:{ all -> 0x08c9 }
        r3 = "Too many error events logged. appId, count";
        r4 = com.google.android.gms.measurement.internal.zzef.zzam(r18);	 Catch:{ all -> 0x08c9 }
        r5 = r7.zzei;	 Catch:{ all -> 0x08c9 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x08c9 }
        r2.zza(r3, r4, r5);	 Catch:{ all -> 0x08c9 }
    L_0x03c0:
        r2 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r2.setTransactionSuccessful();	 Catch:{ all -> 0x08c9 }
        r2 = r27.zzgy();
        r2.endTransaction();
        return;
    L_0x03cf:
        r12 = 0;
    L_0x03d0:
        r6 = r2.zzfq;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzcv();	 Catch:{ all -> 0x08c9 }
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzz();	 Catch:{ all -> 0x08c9 }
        r8 = "_o";
        r9 = r2.origin;	 Catch:{ all -> 0x08c9 }
        r7.zza(r6, r8, r9);	 Catch:{ all -> 0x08c9 }
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzz();	 Catch:{ all -> 0x08c9 }
        r13 = r18;
        r7 = r7.zzbr(r13);	 Catch:{ all -> 0x08c9 }
        r11 = "_r";
        if (r7 == 0) goto L_0x0411;
    L_0x03f3:
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzz();	 Catch:{ all -> 0x08c9 }
        r8 = "_dbg";
        r9 = 1;
        r12 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x08c9 }
        r7.zza(r6, r8, r12);	 Catch:{ all -> 0x08c9 }
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzz();	 Catch:{ all -> 0x08c9 }
        r8 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x08c9 }
        r7.zza(r6, r11, r8);	 Catch:{ all -> 0x08c9 }
    L_0x0411:
        r7 = r2.name;	 Catch:{ all -> 0x08c9 }
        r7 = r4.equals(r7);	 Catch:{ all -> 0x08c9 }
        r8 = "_sno";
        if (r7 == 0) goto L_0x0446;
    L_0x041b:
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzad();	 Catch:{ all -> 0x08c9 }
        r9 = r3.packageName;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzw(r9);	 Catch:{ all -> 0x08c9 }
        if (r7 == 0) goto L_0x0446;
    L_0x0429:
        r7 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r9 = r3.packageName;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zze(r9, r8);	 Catch:{ all -> 0x08c9 }
        if (r7 == 0) goto L_0x0446;
    L_0x0435:
        r9 = r7.value;	 Catch:{ all -> 0x08c9 }
        r9 = r9 instanceof java.lang.Long;	 Catch:{ all -> 0x08c9 }
        if (r9 == 0) goto L_0x0446;
    L_0x043b:
        r9 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r9 = r9.zzz();	 Catch:{ all -> 0x08c9 }
        r7 = r7.value;	 Catch:{ all -> 0x08c9 }
        r9.zza(r6, r8, r7);	 Catch:{ all -> 0x08c9 }
    L_0x0446:
        r7 = r2.name;	 Catch:{ all -> 0x08c9 }
        r4 = r4.equals(r7);	 Catch:{ all -> 0x08c9 }
        if (r4 == 0) goto L_0x0476;
    L_0x044e:
        r4 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r4 = r4.zzad();	 Catch:{ all -> 0x08c9 }
        r7 = r3.packageName;	 Catch:{ all -> 0x08c9 }
        r9 = com.google.android.gms.measurement.internal.zzak.zzif;	 Catch:{ all -> 0x08c9 }
        r4 = r4.zze(r7, r9);	 Catch:{ all -> 0x08c9 }
        if (r4 == 0) goto L_0x0476;
    L_0x045e:
        r4 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r4 = r4.zzad();	 Catch:{ all -> 0x08c9 }
        r7 = r3.packageName;	 Catch:{ all -> 0x08c9 }
        r4 = r4.zzw(r7);	 Catch:{ all -> 0x08c9 }
        if (r4 != 0) goto L_0x0476;
    L_0x046c:
        r4 = new com.google.android.gms.measurement.internal.zzjn;	 Catch:{ all -> 0x08c9 }
        r12 = 0;
        r4.<init>(r8, r14, r12);	 Catch:{ all -> 0x08c9 }
        r1.zzc(r4, r3);	 Catch:{ all -> 0x08c9 }
        goto L_0x0477;
    L_0x0476:
        r12 = 0;
    L_0x0477:
        r4 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r7 = r4.zzac(r13);	 Catch:{ all -> 0x08c9 }
        r4 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1));
        if (r4 <= 0) goto L_0x049a;
    L_0x0483:
        r4 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r4 = r4.zzab();	 Catch:{ all -> 0x08c9 }
        r4 = r4.zzgn();	 Catch:{ all -> 0x08c9 }
        r9 = "Data lost. Too many events stored on disk, deleted. appId";
        r10 = com.google.android.gms.measurement.internal.zzef.zzam(r13);	 Catch:{ all -> 0x08c9 }
        r7 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x08c9 }
        r4.zza(r9, r10, r7);	 Catch:{ all -> 0x08c9 }
    L_0x049a:
        r4 = new com.google.android.gms.measurement.internal.zzaf;	 Catch:{ all -> 0x08c9 }
        r8 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r9 = r2.origin;	 Catch:{ all -> 0x08c9 }
        r10 = r2.name;	 Catch:{ all -> 0x08c9 }
        r14 = r2.zzfu;	 Catch:{ all -> 0x08c9 }
        r19 = 0;
        r7 = r4;
        r2 = r10;
        r10 = r13;
        r26 = r11;
        r11 = r2;
        r16 = r12;
        r2 = r13;
        r25 = 0;
        r12 = r14;
        r28 = r16;
        r14 = r19;
        r16 = r6;
        r7.<init>(r8, r9, r10, r11, r12, r14, r16);	 Catch:{ all -> 0x08c9 }
        r6 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r7 = r4.name;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzc(r2, r7);	 Catch:{ all -> 0x08c9 }
        if (r6 != 0) goto L_0x052d;
    L_0x04c7:
        r6 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzag(r2);	 Catch:{ all -> 0x08c9 }
        r8 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r10 < 0) goto L_0x0513;
    L_0x04d5:
        if (r5 == 0) goto L_0x0513;
    L_0x04d7:
        r3 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r3 = r3.zzab();	 Catch:{ all -> 0x08c9 }
        r3 = r3.zzgk();	 Catch:{ all -> 0x08c9 }
        r5 = "Too many event names used, ignoring event. appId, name, supported count";
        r6 = com.google.android.gms.measurement.internal.zzef.zzam(r2);	 Catch:{ all -> 0x08c9 }
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzy();	 Catch:{ all -> 0x08c9 }
        r4 = r4.name;	 Catch:{ all -> 0x08c9 }
        r4 = r7.zzaj(r4);	 Catch:{ all -> 0x08c9 }
        r7 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x08c9 }
        r3.zza(r5, r6, r4, r7);	 Catch:{ all -> 0x08c9 }
        r3 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r3.zzz();	 Catch:{ all -> 0x08c9 }
        r9 = 8;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r8 = r2;
        r7.zza(r8, r9, r10, r11, r12);	 Catch:{ all -> 0x08c9 }
        r2 = r27.zzgy();
        r2.endTransaction();
        return;
    L_0x0513:
        r5 = new com.google.android.gms.measurement.internal.zzae;	 Catch:{ all -> 0x08c9 }
        r9 = r4.name;	 Catch:{ all -> 0x08c9 }
        r10 = 0;
        r12 = 0;
        r14 = r4.timestamp;	 Catch:{ all -> 0x08c9 }
        r16 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 0;
        r21 = 0;
        r7 = r5;
        r8 = r2;
        r7.<init>(r8, r9, r10, r12, r14, r16, r18, r19, r20, r21);	 Catch:{ all -> 0x08c9 }
        goto L_0x053b;
    L_0x052d:
        r2 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r6.zzfj;	 Catch:{ all -> 0x08c9 }
        r4 = r4.zza(r2, r7);	 Catch:{ all -> 0x08c9 }
        r7 = r4.timestamp;	 Catch:{ all -> 0x08c9 }
        r5 = r6.zzw(r7);	 Catch:{ all -> 0x08c9 }
    L_0x053b:
        r2 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r2.zza(r5);	 Catch:{ all -> 0x08c9 }
        r27.zzo();	 Catch:{ all -> 0x08c9 }
        r27.zzjj();	 Catch:{ all -> 0x08c9 }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r4);	 Catch:{ all -> 0x08c9 }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r29);	 Catch:{ all -> 0x08c9 }
        r2 = r4.zzce;	 Catch:{ all -> 0x08c9 }
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2);	 Catch:{ all -> 0x08c9 }
        r2 = r4.zzce;	 Catch:{ all -> 0x08c9 }
        r5 = r3.packageName;	 Catch:{ all -> 0x08c9 }
        r2 = r2.equals(r5);	 Catch:{ all -> 0x08c9 }
        com.google.android.gms.common.internal.Preconditions.checkArgument(r2);	 Catch:{ all -> 0x08c9 }
        r2 = com.google.android.gms.internal.measurement.zzbs.zzg.zzpr();	 Catch:{ all -> 0x08c9 }
        r5 = 1;
        r2 = r2.zzp(r5);	 Catch:{ all -> 0x08c9 }
        r6 = "android";
        r2 = r2.zzcc(r6);	 Catch:{ all -> 0x08c9 }
        r6 = r3.packageName;	 Catch:{ all -> 0x08c9 }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x08c9 }
        if (r6 != 0) goto L_0x057a;
    L_0x0575:
        r6 = r3.packageName;	 Catch:{ all -> 0x08c9 }
        r2.zzch(r6);	 Catch:{ all -> 0x08c9 }
    L_0x057a:
        r6 = r3.zzco;	 Catch:{ all -> 0x08c9 }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x08c9 }
        if (r6 != 0) goto L_0x0587;
    L_0x0582:
        r6 = r3.zzco;	 Catch:{ all -> 0x08c9 }
        r2.zzcg(r6);	 Catch:{ all -> 0x08c9 }
    L_0x0587:
        r6 = r3.zzcm;	 Catch:{ all -> 0x08c9 }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x08c9 }
        if (r6 != 0) goto L_0x0594;
    L_0x058f:
        r6 = r3.zzcm;	 Catch:{ all -> 0x08c9 }
        r2.zzci(r6);	 Catch:{ all -> 0x08c9 }
    L_0x0594:
        r6 = r3.zzcn;	 Catch:{ all -> 0x08c9 }
        r8 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r10 == 0) goto L_0x05a3;
    L_0x059d:
        r6 = r3.zzcn;	 Catch:{ all -> 0x08c9 }
        r7 = (int) r6;	 Catch:{ all -> 0x08c9 }
        r2.zzv(r7);	 Catch:{ all -> 0x08c9 }
    L_0x05a3:
        r6 = r3.zzr;	 Catch:{ all -> 0x08c9 }
        r2.zzas(r6);	 Catch:{ all -> 0x08c9 }
        r6 = r3.zzcg;	 Catch:{ all -> 0x08c9 }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x08c9 }
        if (r6 != 0) goto L_0x05b5;
    L_0x05b0:
        r6 = r3.zzcg;	 Catch:{ all -> 0x08c9 }
        r2.zzcm(r6);	 Catch:{ all -> 0x08c9 }
    L_0x05b5:
        r6 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzad();	 Catch:{ all -> 0x08c9 }
        r7 = com.google.android.gms.measurement.internal.zzak.zzit;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zza(r7);	 Catch:{ all -> 0x08c9 }
        if (r6 == 0) goto L_0x05db;
    L_0x05c3:
        r6 = r2.getGmpAppId();	 Catch:{ all -> 0x08c9 }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x08c9 }
        if (r6 == 0) goto L_0x05e8;
    L_0x05cd:
        r6 = r3.zzcu;	 Catch:{ all -> 0x08c9 }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x08c9 }
        if (r6 != 0) goto L_0x05e8;
    L_0x05d5:
        r6 = r3.zzcu;	 Catch:{ all -> 0x08c9 }
        r2.zzcq(r6);	 Catch:{ all -> 0x08c9 }
        goto L_0x05e8;
    L_0x05db:
        r6 = r3.zzcu;	 Catch:{ all -> 0x08c9 }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x08c9 }
        if (r6 != 0) goto L_0x05e8;
    L_0x05e3:
        r6 = r3.zzcu;	 Catch:{ all -> 0x08c9 }
        r2.zzcq(r6);	 Catch:{ all -> 0x08c9 }
    L_0x05e8:
        r6 = r3.zzcp;	 Catch:{ all -> 0x08c9 }
        r8 = 0;
        r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r10 == 0) goto L_0x05f5;
    L_0x05f0:
        r6 = r3.zzcp;	 Catch:{ all -> 0x08c9 }
        r2.zzau(r6);	 Catch:{ all -> 0x08c9 }
    L_0x05f5:
        r6 = r3.zzs;	 Catch:{ all -> 0x08c9 }
        r2.zzax(r6);	 Catch:{ all -> 0x08c9 }
        r6 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzad();	 Catch:{ all -> 0x08c9 }
        r7 = r3.packageName;	 Catch:{ all -> 0x08c9 }
        r10 = com.google.android.gms.measurement.internal.zzak.zzin;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zze(r7, r10);	 Catch:{ all -> 0x08c9 }
        if (r6 == 0) goto L_0x0617;
    L_0x060a:
        r6 = r27.zzgw();	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzju();	 Catch:{ all -> 0x08c9 }
        if (r6 == 0) goto L_0x0617;
    L_0x0614:
        r2.zzd(r6);	 Catch:{ all -> 0x08c9 }
    L_0x0617:
        r6 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzac();	 Catch:{ all -> 0x08c9 }
        r7 = r3.packageName;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzap(r7);	 Catch:{ all -> 0x08c9 }
        if (r6 == 0) goto L_0x064a;
    L_0x0625:
        r7 = r6.first;	 Catch:{ all -> 0x08c9 }
        r7 = (java.lang.CharSequence) r7;	 Catch:{ all -> 0x08c9 }
        r7 = android.text.TextUtils.isEmpty(r7);	 Catch:{ all -> 0x08c9 }
        if (r7 != 0) goto L_0x064a;
    L_0x062f:
        r7 = r3.zzcs;	 Catch:{ all -> 0x08c9 }
        if (r7 == 0) goto L_0x06ac;
    L_0x0633:
        r7 = r6.first;	 Catch:{ all -> 0x08c9 }
        r7 = (java.lang.String) r7;	 Catch:{ all -> 0x08c9 }
        r2.zzcj(r7);	 Catch:{ all -> 0x08c9 }
        r7 = r6.second;	 Catch:{ all -> 0x08c9 }
        if (r7 == 0) goto L_0x06ac;
    L_0x063e:
        r6 = r6.second;	 Catch:{ all -> 0x08c9 }
        r6 = (java.lang.Boolean) r6;	 Catch:{ all -> 0x08c9 }
        r6 = r6.booleanValue();	 Catch:{ all -> 0x08c9 }
        r2.zzm(r6);	 Catch:{ all -> 0x08c9 }
        goto L_0x06ac;
    L_0x064a:
        r6 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzw();	 Catch:{ all -> 0x08c9 }
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.getContext();	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzj(r7);	 Catch:{ all -> 0x08c9 }
        if (r6 != 0) goto L_0x06ac;
    L_0x065c:
        r6 = r3.zzct;	 Catch:{ all -> 0x08c9 }
        if (r6 == 0) goto L_0x06ac;
    L_0x0660:
        r6 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r6 = r6.getContext();	 Catch:{ all -> 0x08c9 }
        r6 = r6.getContentResolver();	 Catch:{ all -> 0x08c9 }
        r7 = "android_id";
        r6 = android.provider.Settings.Secure.getString(r6, r7);	 Catch:{ all -> 0x08c9 }
        if (r6 != 0) goto L_0x068c;
    L_0x0672:
        r6 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzab();	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzgn();	 Catch:{ all -> 0x08c9 }
        r7 = "null secure ID. appId";
        r10 = r2.zzag();	 Catch:{ all -> 0x08c9 }
        r10 = com.google.android.gms.measurement.internal.zzef.zzam(r10);	 Catch:{ all -> 0x08c9 }
        r6.zza(r7, r10);	 Catch:{ all -> 0x08c9 }
        r6 = "null";
        goto L_0x06a9;
    L_0x068c:
        r7 = r6.isEmpty();	 Catch:{ all -> 0x08c9 }
        if (r7 == 0) goto L_0x06a9;
    L_0x0692:
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzab();	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzgn();	 Catch:{ all -> 0x08c9 }
        r10 = "empty secure ID. appId";
        r11 = r2.zzag();	 Catch:{ all -> 0x08c9 }
        r11 = com.google.android.gms.measurement.internal.zzef.zzam(r11);	 Catch:{ all -> 0x08c9 }
        r7.zza(r10, r11);	 Catch:{ all -> 0x08c9 }
    L_0x06a9:
        r2.zzco(r6);	 Catch:{ all -> 0x08c9 }
    L_0x06ac:
        r6 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzw();	 Catch:{ all -> 0x08c9 }
        r6.zzbi();	 Catch:{ all -> 0x08c9 }
        r6 = android.os.Build.MODEL;	 Catch:{ all -> 0x08c9 }
        r6 = r2.zzce(r6);	 Catch:{ all -> 0x08c9 }
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzw();	 Catch:{ all -> 0x08c9 }
        r7.zzbi();	 Catch:{ all -> 0x08c9 }
        r7 = android.os.Build.VERSION.RELEASE;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzcd(r7);	 Catch:{ all -> 0x08c9 }
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzw();	 Catch:{ all -> 0x08c9 }
        r10 = r7.zzcq();	 Catch:{ all -> 0x08c9 }
        r7 = (int) r10;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzt(r7);	 Catch:{ all -> 0x08c9 }
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzw();	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzcr();	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzcf(r7);	 Catch:{ all -> 0x08c9 }
        r10 = r3.zzcr;	 Catch:{ all -> 0x08c9 }
        r6.zzaw(r10);	 Catch:{ all -> 0x08c9 }
        r6 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r6 = r6.isEnabled();	 Catch:{ all -> 0x08c9 }
        if (r6 == 0) goto L_0x0708;
    L_0x06f4:
        r6 = com.google.android.gms.measurement.internal.zzs.zzbv();	 Catch:{ all -> 0x08c9 }
        if (r6 == 0) goto L_0x0708;
    L_0x06fa:
        r2.zzag();	 Catch:{ all -> 0x08c9 }
        r6 = android.text.TextUtils.isEmpty(r28);	 Catch:{ all -> 0x08c9 }
        if (r6 != 0) goto L_0x0708;
    L_0x0703:
        r6 = r28;
        r2.zzcp(r6);	 Catch:{ all -> 0x08c9 }
    L_0x0708:
        r6 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r7 = r3.packageName;	 Catch:{ all -> 0x08c9 }
        r6 = r6.zzab(r7);	 Catch:{ all -> 0x08c9 }
        if (r6 != 0) goto L_0x077b;
    L_0x0714:
        r6 = new com.google.android.gms.measurement.internal.zzf;	 Catch:{ all -> 0x08c9 }
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r10 = r3.packageName;	 Catch:{ all -> 0x08c9 }
        r6.<init>(r7, r10);	 Catch:{ all -> 0x08c9 }
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzz();	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzjy();	 Catch:{ all -> 0x08c9 }
        r6.zza(r7);	 Catch:{ all -> 0x08c9 }
        r7 = r3.zzci;	 Catch:{ all -> 0x08c9 }
        r6.zze(r7);	 Catch:{ all -> 0x08c9 }
        r7 = r3.zzcg;	 Catch:{ all -> 0x08c9 }
        r6.zzb(r7);	 Catch:{ all -> 0x08c9 }
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzac();	 Catch:{ all -> 0x08c9 }
        r10 = r3.packageName;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzaq(r10);	 Catch:{ all -> 0x08c9 }
        r6.zzd(r7);	 Catch:{ all -> 0x08c9 }
        r6.zzk(r8);	 Catch:{ all -> 0x08c9 }
        r6.zze(r8);	 Catch:{ all -> 0x08c9 }
        r6.zzf(r8);	 Catch:{ all -> 0x08c9 }
        r7 = r3.zzcm;	 Catch:{ all -> 0x08c9 }
        r6.zzf(r7);	 Catch:{ all -> 0x08c9 }
        r10 = r3.zzcn;	 Catch:{ all -> 0x08c9 }
        r6.zzg(r10);	 Catch:{ all -> 0x08c9 }
        r7 = r3.zzco;	 Catch:{ all -> 0x08c9 }
        r6.zzg(r7);	 Catch:{ all -> 0x08c9 }
        r10 = r3.zzr;	 Catch:{ all -> 0x08c9 }
        r6.zzh(r10);	 Catch:{ all -> 0x08c9 }
        r10 = r3.zzcp;	 Catch:{ all -> 0x08c9 }
        r6.zzi(r10);	 Catch:{ all -> 0x08c9 }
        r7 = r3.zzcq;	 Catch:{ all -> 0x08c9 }
        r6.setMeasurementEnabled(r7);	 Catch:{ all -> 0x08c9 }
        r10 = r3.zzcr;	 Catch:{ all -> 0x08c9 }
        r6.zzt(r10);	 Catch:{ all -> 0x08c9 }
        r10 = r3.zzs;	 Catch:{ all -> 0x08c9 }
        r6.zzj(r10);	 Catch:{ all -> 0x08c9 }
        r7 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r7.zza(r6);	 Catch:{ all -> 0x08c9 }
    L_0x077b:
        r7 = r6.getAppInstanceId();	 Catch:{ all -> 0x08c9 }
        r7 = android.text.TextUtils.isEmpty(r7);	 Catch:{ all -> 0x08c9 }
        if (r7 != 0) goto L_0x078c;
    L_0x0785:
        r7 = r6.getAppInstanceId();	 Catch:{ all -> 0x08c9 }
        r2.zzck(r7);	 Catch:{ all -> 0x08c9 }
    L_0x078c:
        r7 = r6.getFirebaseInstanceId();	 Catch:{ all -> 0x08c9 }
        r7 = android.text.TextUtils.isEmpty(r7);	 Catch:{ all -> 0x08c9 }
        if (r7 != 0) goto L_0x079d;
    L_0x0796:
        r6 = r6.getFirebaseInstanceId();	 Catch:{ all -> 0x08c9 }
        r2.zzcn(r6);	 Catch:{ all -> 0x08c9 }
    L_0x079d:
        r6 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r3 = r3.packageName;	 Catch:{ all -> 0x08c9 }
        r3 = r6.zzaa(r3);	 Catch:{ all -> 0x08c9 }
        r6 = 0;
    L_0x07a8:
        r7 = r3.size();	 Catch:{ all -> 0x08c9 }
        if (r6 >= r7) goto L_0x07df;
    L_0x07ae:
        r7 = com.google.android.gms.internal.measurement.zzbs.zzk.zzqu();	 Catch:{ all -> 0x08c9 }
        r10 = r3.get(r6);	 Catch:{ all -> 0x08c9 }
        r10 = (com.google.android.gms.measurement.internal.zzjp) r10;	 Catch:{ all -> 0x08c9 }
        r10 = r10.name;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzdb(r10);	 Catch:{ all -> 0x08c9 }
        r10 = r3.get(r6);	 Catch:{ all -> 0x08c9 }
        r10 = (com.google.android.gms.measurement.internal.zzjp) r10;	 Catch:{ all -> 0x08c9 }
        r10 = r10.zztr;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzbk(r10);	 Catch:{ all -> 0x08c9 }
        r10 = r27.zzgw();	 Catch:{ all -> 0x08c9 }
        r11 = r3.get(r6);	 Catch:{ all -> 0x08c9 }
        r11 = (com.google.android.gms.measurement.internal.zzjp) r11;	 Catch:{ all -> 0x08c9 }
        r11 = r11.value;	 Catch:{ all -> 0x08c9 }
        r10.zza(r7, r11);	 Catch:{ all -> 0x08c9 }
        r2.zza(r7);	 Catch:{ all -> 0x08c9 }
        r6 = r6 + 1;
        goto L_0x07a8;
    L_0x07df:
        r3 = r27.zzgy();	 Catch:{ IOException -> 0x0857 }
        r6 = r2.zzug();	 Catch:{ IOException -> 0x0857 }
        r6 = (com.google.android.gms.internal.measurement.zzey) r6;	 Catch:{ IOException -> 0x0857 }
        r6 = (com.google.android.gms.internal.measurement.zzbs.zzg) r6;	 Catch:{ IOException -> 0x0857 }
        r2 = r3.zza(r6);	 Catch:{ IOException -> 0x0857 }
        r6 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r7 = r4.zzfq;	 Catch:{ all -> 0x08c9 }
        if (r7 == 0) goto L_0x084d;
    L_0x07f7:
        r7 = r4.zzfq;	 Catch:{ all -> 0x08c9 }
        r7 = r7.iterator();	 Catch:{ all -> 0x08c9 }
    L_0x07fd:
        r10 = r7.hasNext();	 Catch:{ all -> 0x08c9 }
        if (r10 == 0) goto L_0x0815;
    L_0x0803:
        r10 = r7.next();	 Catch:{ all -> 0x08c9 }
        r10 = (java.lang.String) r10;	 Catch:{ all -> 0x08c9 }
        r11 = r26;
        r10 = r11.equals(r10);	 Catch:{ all -> 0x08c9 }
        if (r10 == 0) goto L_0x0812;
    L_0x0811:
        goto L_0x084e;
    L_0x0812:
        r26 = r11;
        goto L_0x07fd;
    L_0x0815:
        r7 = r27.zzgz();	 Catch:{ all -> 0x08c9 }
        r10 = r4.zzce;	 Catch:{ all -> 0x08c9 }
        r11 = r4.name;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzl(r10, r11);	 Catch:{ all -> 0x08c9 }
        r10 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r11 = r27.zzjk();	 Catch:{ all -> 0x08c9 }
        r13 = r4.zzce;	 Catch:{ all -> 0x08c9 }
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r10 = r10.zza(r11, r13, r14, r15, r16, r17, r18);	 Catch:{ all -> 0x08c9 }
        if (r7 == 0) goto L_0x084d;
    L_0x0839:
        r10 = r10.zzej;	 Catch:{ all -> 0x08c9 }
        r7 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzad();	 Catch:{ all -> 0x08c9 }
        r12 = r4.zzce;	 Catch:{ all -> 0x08c9 }
        r7 = r7.zzi(r12);	 Catch:{ all -> 0x08c9 }
        r12 = (long) r7;	 Catch:{ all -> 0x08c9 }
        r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r7 >= 0) goto L_0x084d;
    L_0x084c:
        goto L_0x084e;
    L_0x084d:
        r5 = 0;
    L_0x084e:
        r2 = r6.zza(r4, r2, r5);	 Catch:{ all -> 0x08c9 }
        if (r2 == 0) goto L_0x0870;
    L_0x0854:
        r1.zzsy = r8;	 Catch:{ all -> 0x08c9 }
        goto L_0x0870;
    L_0x0857:
        r0 = move-exception;
        r3 = r0;
        r5 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r5 = r5.zzab();	 Catch:{ all -> 0x08c9 }
        r5 = r5.zzgk();	 Catch:{ all -> 0x08c9 }
        r6 = "Data loss. Failed to insert raw event metadata. appId";
        r2 = r2.zzag();	 Catch:{ all -> 0x08c9 }
        r2 = com.google.android.gms.measurement.internal.zzef.zzam(r2);	 Catch:{ all -> 0x08c9 }
        r5.zza(r6, r2, r3);	 Catch:{ all -> 0x08c9 }
    L_0x0870:
        r2 = r27.zzgy();	 Catch:{ all -> 0x08c9 }
        r2.setTransactionSuccessful();	 Catch:{ all -> 0x08c9 }
        r2 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r2 = r2.zzab();	 Catch:{ all -> 0x08c9 }
        r3 = 2;
        r2 = r2.isLoggable(r3);	 Catch:{ all -> 0x08c9 }
        if (r2 == 0) goto L_0x089d;
    L_0x0884:
        r2 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r2 = r2.zzab();	 Catch:{ all -> 0x08c9 }
        r2 = r2.zzgs();	 Catch:{ all -> 0x08c9 }
        r3 = "Event recorded";
        r5 = r1.zzj;	 Catch:{ all -> 0x08c9 }
        r5 = r5.zzy();	 Catch:{ all -> 0x08c9 }
        r4 = r5.zza(r4);	 Catch:{ all -> 0x08c9 }
        r2.zza(r3, r4);	 Catch:{ all -> 0x08c9 }
    L_0x089d:
        r2 = r27.zzgy();
        r2.endTransaction();
        r27.zzjn();
        r2 = r1.zzj;
        r2 = r2.zzab();
        r2 = r2.zzgs();
        r3 = java.lang.System.nanoTime();
        r3 = r3 - r23;
        r5 = 500000; // 0x7a120 float:7.00649E-40 double:2.47033E-318;
        r3 = r3 + r5;
        r5 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r3 = r3 / r5;
        r3 = java.lang.Long.valueOf(r3);
        r4 = "Background event processing time, ms";
        r2.zza(r4, r3);
        return;
    L_0x08c9:
        r0 = move-exception;
        r2 = r0;
        r3 = r27.zzgy();
        r3.endTransaction();
        goto L_0x08d4;
    L_0x08d3:
        throw r2;
    L_0x08d4:
        goto L_0x08d3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjg.zzd(com.google.android.gms.measurement.internal.zzai, com.google.android.gms.measurement.internal.zzn):void");
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x02c6 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:94|95) */
    /* JADX WARNING: Missing block: B:95:?, code skipped:
            r1.zzj.zzab().zzgk().zza("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.zzef.zzam(r5), r9);
     */
    @androidx.annotation.WorkerThread
    public final void zzjl() {
        /*
        r17 = this;
        r1 = r17;
        r17.zzo();
        r17.zzjj();
        r0 = 1;
        r1.zzte = r0;
        r2 = 0;
        r3 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r3.zzae();	 Catch:{ all -> 0x0302 }
        r3 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r3 = r3.zzs();	 Catch:{ all -> 0x0302 }
        r3 = r3.zzit();	 Catch:{ all -> 0x0302 }
        if (r3 != 0) goto L_0x0032;
    L_0x001d:
        r0 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r0 = r0.zzab();	 Catch:{ all -> 0x0302 }
        r0 = r0.zzgn();	 Catch:{ all -> 0x0302 }
        r3 = "Upload data called on the client side before use of service was decided";
        r0.zzao(r3);	 Catch:{ all -> 0x0302 }
        r1.zzte = r2;
        r17.zzjo();
        return;
    L_0x0032:
        r3 = r3.booleanValue();	 Catch:{ all -> 0x0302 }
        if (r3 == 0) goto L_0x004d;
    L_0x0038:
        r0 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r0 = r0.zzab();	 Catch:{ all -> 0x0302 }
        r0 = r0.zzgk();	 Catch:{ all -> 0x0302 }
        r3 = "Upload called in the client side when service should be used";
        r0.zzao(r3);	 Catch:{ all -> 0x0302 }
        r1.zzte = r2;
        r17.zzjo();
        return;
    L_0x004d:
        r3 = r1.zzsy;	 Catch:{ all -> 0x0302 }
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x005e;
    L_0x0055:
        r17.zzjn();	 Catch:{ all -> 0x0302 }
        r1.zzte = r2;
        r17.zzjo();
        return;
    L_0x005e:
        r17.zzo();	 Catch:{ all -> 0x0302 }
        r3 = r1.zzth;	 Catch:{ all -> 0x0302 }
        if (r3 == 0) goto L_0x0067;
    L_0x0065:
        r3 = 1;
        goto L_0x0068;
    L_0x0067:
        r3 = 0;
    L_0x0068:
        if (r3 == 0) goto L_0x007f;
    L_0x006a:
        r0 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r0 = r0.zzab();	 Catch:{ all -> 0x0302 }
        r0 = r0.zzgs();	 Catch:{ all -> 0x0302 }
        r3 = "Uploading requested multiple times";
        r0.zzao(r3);	 Catch:{ all -> 0x0302 }
        r1.zzte = r2;
        r17.zzjo();
        return;
    L_0x007f:
        r3 = r17.zzjf();	 Catch:{ all -> 0x0302 }
        r3 = r3.zzgv();	 Catch:{ all -> 0x0302 }
        if (r3 != 0) goto L_0x00a1;
    L_0x0089:
        r0 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r0 = r0.zzab();	 Catch:{ all -> 0x0302 }
        r0 = r0.zzgs();	 Catch:{ all -> 0x0302 }
        r3 = "Network not connected, ignoring upload request";
        r0.zzao(r3);	 Catch:{ all -> 0x0302 }
        r17.zzjn();	 Catch:{ all -> 0x0302 }
        r1.zzte = r2;
        r17.zzjo();
        return;
    L_0x00a1:
        r3 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r3 = r3.zzx();	 Catch:{ all -> 0x0302 }
        r3 = r3.currentTimeMillis();	 Catch:{ all -> 0x0302 }
        r7 = com.google.android.gms.measurement.internal.zzs.zzbt();	 Catch:{ all -> 0x0302 }
        r7 = r3 - r7;
        r9 = 0;
        r1.zzd(r9, r7);	 Catch:{ all -> 0x0302 }
        r7 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r7 = r7.zzac();	 Catch:{ all -> 0x0302 }
        r7 = r7.zzlj;	 Catch:{ all -> 0x0302 }
        r7 = r7.get();	 Catch:{ all -> 0x0302 }
        r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r10 == 0) goto L_0x00de;
    L_0x00c5:
        r5 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r5 = r5.zzab();	 Catch:{ all -> 0x0302 }
        r5 = r5.zzgr();	 Catch:{ all -> 0x0302 }
        r6 = "Uploading events. Elapsed time since last upload attempt (ms)";
        r7 = r3 - r7;
        r7 = java.lang.Math.abs(r7);	 Catch:{ all -> 0x0302 }
        r7 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x0302 }
        r5.zza(r6, r7);	 Catch:{ all -> 0x0302 }
    L_0x00de:
        r5 = r17.zzgy();	 Catch:{ all -> 0x0302 }
        r5 = r5.zzby();	 Catch:{ all -> 0x0302 }
        r6 = android.text.TextUtils.isEmpty(r5);	 Catch:{ all -> 0x0302 }
        r7 = -1;
        if (r6 != 0) goto L_0x02da;
    L_0x00ee:
        r10 = r1.zztj;	 Catch:{ all -> 0x0302 }
        r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1));
        if (r6 != 0) goto L_0x00fe;
    L_0x00f4:
        r6 = r17.zzgy();	 Catch:{ all -> 0x0302 }
        r6 = r6.zzcf();	 Catch:{ all -> 0x0302 }
        r1.zztj = r6;	 Catch:{ all -> 0x0302 }
    L_0x00fe:
        r6 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r6 = r6.zzad();	 Catch:{ all -> 0x0302 }
        r7 = com.google.android.gms.measurement.internal.zzak.zzgl;	 Catch:{ all -> 0x0302 }
        r6 = r6.zzb(r5, r7);	 Catch:{ all -> 0x0302 }
        r7 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r7 = r7.zzad();	 Catch:{ all -> 0x0302 }
        r8 = com.google.android.gms.measurement.internal.zzak.zzgm;	 Catch:{ all -> 0x0302 }
        r7 = r7.zzb(r5, r8);	 Catch:{ all -> 0x0302 }
        r7 = java.lang.Math.max(r2, r7);	 Catch:{ all -> 0x0302 }
        r8 = r17.zzgy();	 Catch:{ all -> 0x0302 }
        r6 = r8.zza(r5, r6, r7);	 Catch:{ all -> 0x0302 }
        r7 = r6.isEmpty();	 Catch:{ all -> 0x0302 }
        if (r7 != 0) goto L_0x02fc;
    L_0x0128:
        r7 = r6.iterator();	 Catch:{ all -> 0x0302 }
    L_0x012c:
        r8 = r7.hasNext();	 Catch:{ all -> 0x0302 }
        if (r8 == 0) goto L_0x014b;
    L_0x0132:
        r8 = r7.next();	 Catch:{ all -> 0x0302 }
        r8 = (android.util.Pair) r8;	 Catch:{ all -> 0x0302 }
        r8 = r8.first;	 Catch:{ all -> 0x0302 }
        r8 = (com.google.android.gms.internal.measurement.zzbs.zzg) r8;	 Catch:{ all -> 0x0302 }
        r10 = r8.zzot();	 Catch:{ all -> 0x0302 }
        r10 = android.text.TextUtils.isEmpty(r10);	 Catch:{ all -> 0x0302 }
        if (r10 != 0) goto L_0x012c;
    L_0x0146:
        r7 = r8.zzot();	 Catch:{ all -> 0x0302 }
        goto L_0x014c;
    L_0x014b:
        r7 = r9;
    L_0x014c:
        if (r7 == 0) goto L_0x017b;
    L_0x014e:
        r8 = 0;
    L_0x014f:
        r10 = r6.size();	 Catch:{ all -> 0x0302 }
        if (r8 >= r10) goto L_0x017b;
    L_0x0155:
        r10 = r6.get(r8);	 Catch:{ all -> 0x0302 }
        r10 = (android.util.Pair) r10;	 Catch:{ all -> 0x0302 }
        r10 = r10.first;	 Catch:{ all -> 0x0302 }
        r10 = (com.google.android.gms.internal.measurement.zzbs.zzg) r10;	 Catch:{ all -> 0x0302 }
        r11 = r10.zzot();	 Catch:{ all -> 0x0302 }
        r11 = android.text.TextUtils.isEmpty(r11);	 Catch:{ all -> 0x0302 }
        if (r11 != 0) goto L_0x0178;
    L_0x0169:
        r10 = r10.zzot();	 Catch:{ all -> 0x0302 }
        r10 = r10.equals(r7);	 Catch:{ all -> 0x0302 }
        if (r10 != 0) goto L_0x0178;
    L_0x0173:
        r6 = r6.subList(r2, r8);	 Catch:{ all -> 0x0302 }
        goto L_0x017b;
    L_0x0178:
        r8 = r8 + 1;
        goto L_0x014f;
    L_0x017b:
        r7 = com.google.android.gms.internal.measurement.zzbs.zzf.zznj();	 Catch:{ all -> 0x0302 }
        r8 = r6.size();	 Catch:{ all -> 0x0302 }
        r10 = new java.util.ArrayList;	 Catch:{ all -> 0x0302 }
        r11 = r6.size();	 Catch:{ all -> 0x0302 }
        r10.<init>(r11);	 Catch:{ all -> 0x0302 }
        r11 = com.google.android.gms.measurement.internal.zzs.zzbv();	 Catch:{ all -> 0x0302 }
        if (r11 == 0) goto L_0x01a0;
    L_0x0192:
        r11 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r11 = r11.zzad();	 Catch:{ all -> 0x0302 }
        r11 = r11.zzl(r5);	 Catch:{ all -> 0x0302 }
        if (r11 == 0) goto L_0x01a0;
    L_0x019e:
        r11 = 1;
        goto L_0x01a1;
    L_0x01a0:
        r11 = 0;
    L_0x01a1:
        r12 = 0;
    L_0x01a2:
        if (r12 >= r8) goto L_0x020d;
    L_0x01a4:
        r13 = r6.get(r12);	 Catch:{ all -> 0x0302 }
        r13 = (android.util.Pair) r13;	 Catch:{ all -> 0x0302 }
        r13 = r13.first;	 Catch:{ all -> 0x0302 }
        r13 = (com.google.android.gms.internal.measurement.zzbs.zzg) r13;	 Catch:{ all -> 0x0302 }
        r13 = r13.zzuj();	 Catch:{ all -> 0x0302 }
        r13 = (com.google.android.gms.internal.measurement.zzey.zza) r13;	 Catch:{ all -> 0x0302 }
        r13 = (com.google.android.gms.internal.measurement.zzbs.zzg.zza) r13;	 Catch:{ all -> 0x0302 }
        r14 = r6.get(r12);	 Catch:{ all -> 0x0302 }
        r14 = (android.util.Pair) r14;	 Catch:{ all -> 0x0302 }
        r14 = r14.second;	 Catch:{ all -> 0x0302 }
        r14 = (java.lang.Long) r14;	 Catch:{ all -> 0x0302 }
        r10.add(r14);	 Catch:{ all -> 0x0302 }
        r14 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r14 = r14.zzad();	 Catch:{ all -> 0x0302 }
        r14 = r14.zzao();	 Catch:{ all -> 0x0302 }
        r14 = r13.zzat(r14);	 Catch:{ all -> 0x0302 }
        r14 = r14.zzan(r3);	 Catch:{ all -> 0x0302 }
        r15 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r15.zzae();	 Catch:{ all -> 0x0302 }
        r14.zzn(r2);	 Catch:{ all -> 0x0302 }
        if (r11 != 0) goto L_0x01e2;
    L_0x01df:
        r13.zznw();	 Catch:{ all -> 0x0302 }
    L_0x01e2:
        r14 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r14 = r14.zzad();	 Catch:{ all -> 0x0302 }
        r15 = com.google.android.gms.measurement.internal.zzak.zzis;	 Catch:{ all -> 0x0302 }
        r14 = r14.zze(r5, r15);	 Catch:{ all -> 0x0302 }
        if (r14 == 0) goto L_0x0207;
    L_0x01f0:
        r14 = r13.zzug();	 Catch:{ all -> 0x0302 }
        r14 = (com.google.android.gms.internal.measurement.zzey) r14;	 Catch:{ all -> 0x0302 }
        r14 = (com.google.android.gms.internal.measurement.zzbs.zzg) r14;	 Catch:{ all -> 0x0302 }
        r14 = r14.toByteArray();	 Catch:{ all -> 0x0302 }
        r15 = r17.zzgw();	 Catch:{ all -> 0x0302 }
        r14 = r15.zza(r14);	 Catch:{ all -> 0x0302 }
        r13.zzay(r14);	 Catch:{ all -> 0x0302 }
    L_0x0207:
        r7.zza(r13);	 Catch:{ all -> 0x0302 }
        r12 = r12 + 1;
        goto L_0x01a2;
    L_0x020d:
        r6 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r6 = r6.zzab();	 Catch:{ all -> 0x0302 }
        r11 = 2;
        r6 = r6.isLoggable(r11);	 Catch:{ all -> 0x0302 }
        if (r6 == 0) goto L_0x022b;
    L_0x021a:
        r6 = r17.zzgw();	 Catch:{ all -> 0x0302 }
        r11 = r7.zzug();	 Catch:{ all -> 0x0302 }
        r11 = (com.google.android.gms.internal.measurement.zzey) r11;	 Catch:{ all -> 0x0302 }
        r11 = (com.google.android.gms.internal.measurement.zzbs.zzf) r11;	 Catch:{ all -> 0x0302 }
        r6 = r6.zza(r11);	 Catch:{ all -> 0x0302 }
        goto L_0x022c;
    L_0x022b:
        r6 = r9;
    L_0x022c:
        r17.zzgw();	 Catch:{ all -> 0x0302 }
        r11 = r7.zzug();	 Catch:{ all -> 0x0302 }
        r11 = (com.google.android.gms.internal.measurement.zzey) r11;	 Catch:{ all -> 0x0302 }
        r11 = (com.google.android.gms.internal.measurement.zzbs.zzf) r11;	 Catch:{ all -> 0x0302 }
        r14 = r11.toByteArray();	 Catch:{ all -> 0x0302 }
        r11 = com.google.android.gms.measurement.internal.zzak.zzgv;	 Catch:{ all -> 0x0302 }
        r9 = r11.get(r9);	 Catch:{ all -> 0x0302 }
        r9 = (java.lang.String) r9;	 Catch:{ all -> 0x0302 }
        r13 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x02c6 }
        r13.<init>(r9);	 Catch:{ MalformedURLException -> 0x02c6 }
        r11 = r10.isEmpty();	 Catch:{ MalformedURLException -> 0x02c6 }
        if (r11 != 0) goto L_0x0250;
    L_0x024e:
        r11 = 1;
        goto L_0x0251;
    L_0x0250:
        r11 = 0;
    L_0x0251:
        com.google.android.gms.common.internal.Preconditions.checkArgument(r11);	 Catch:{ MalformedURLException -> 0x02c6 }
        r11 = r1.zzth;	 Catch:{ MalformedURLException -> 0x02c6 }
        if (r11 == 0) goto L_0x0268;
    L_0x0258:
        r10 = r1.zzj;	 Catch:{ MalformedURLException -> 0x02c6 }
        r10 = r10.zzab();	 Catch:{ MalformedURLException -> 0x02c6 }
        r10 = r10.zzgk();	 Catch:{ MalformedURLException -> 0x02c6 }
        r11 = "Set uploading progress before finishing the previous upload";
        r10.zzao(r11);	 Catch:{ MalformedURLException -> 0x02c6 }
        goto L_0x026f;
    L_0x0268:
        r11 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x02c6 }
        r11.<init>(r10);	 Catch:{ MalformedURLException -> 0x02c6 }
        r1.zzth = r11;	 Catch:{ MalformedURLException -> 0x02c6 }
    L_0x026f:
        r10 = r1.zzj;	 Catch:{ MalformedURLException -> 0x02c6 }
        r10 = r10.zzac();	 Catch:{ MalformedURLException -> 0x02c6 }
        r10 = r10.zzlk;	 Catch:{ MalformedURLException -> 0x02c6 }
        r10.set(r3);	 Catch:{ MalformedURLException -> 0x02c6 }
        r3 = "?";
        if (r8 <= 0) goto L_0x0286;
    L_0x027e:
        r3 = r7.zzo(r2);	 Catch:{ MalformedURLException -> 0x02c6 }
        r3 = r3.zzag();	 Catch:{ MalformedURLException -> 0x02c6 }
    L_0x0286:
        r4 = r1.zzj;	 Catch:{ MalformedURLException -> 0x02c6 }
        r4 = r4.zzab();	 Catch:{ MalformedURLException -> 0x02c6 }
        r4 = r4.zzgs();	 Catch:{ MalformedURLException -> 0x02c6 }
        r7 = "Uploading data. app, uncompressed size, data";
        r8 = r14.length;	 Catch:{ MalformedURLException -> 0x02c6 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ MalformedURLException -> 0x02c6 }
        r4.zza(r7, r3, r8, r6);	 Catch:{ MalformedURLException -> 0x02c6 }
        r1.zztd = r0;	 Catch:{ MalformedURLException -> 0x02c6 }
        r11 = r17.zzjf();	 Catch:{ MalformedURLException -> 0x02c6 }
        r0 = new com.google.android.gms.measurement.internal.zzji;	 Catch:{ MalformedURLException -> 0x02c6 }
        r0.<init>(r1, r5);	 Catch:{ MalformedURLException -> 0x02c6 }
        r11.zzo();	 Catch:{ MalformedURLException -> 0x02c6 }
        r11.zzbi();	 Catch:{ MalformedURLException -> 0x02c6 }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r13);	 Catch:{ MalformedURLException -> 0x02c6 }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r14);	 Catch:{ MalformedURLException -> 0x02c6 }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r0);	 Catch:{ MalformedURLException -> 0x02c6 }
        r3 = r11.zzaa();	 Catch:{ MalformedURLException -> 0x02c6 }
        r4 = new com.google.android.gms.measurement.internal.zzen;	 Catch:{ MalformedURLException -> 0x02c6 }
        r15 = 0;
        r10 = r4;
        r12 = r5;
        r16 = r0;
        r10.<init>(r11, r12, r13, r14, r15, r16);	 Catch:{ MalformedURLException -> 0x02c6 }
        r3.zzb(r4);	 Catch:{ MalformedURLException -> 0x02c6 }
        goto L_0x02fc;
    L_0x02c6:
        r0 = r1.zzj;	 Catch:{ all -> 0x0302 }
        r0 = r0.zzab();	 Catch:{ all -> 0x0302 }
        r0 = r0.zzgk();	 Catch:{ all -> 0x0302 }
        r3 = "Failed to parse upload URL. Not uploading. appId";
        r4 = com.google.android.gms.measurement.internal.zzef.zzam(r5);	 Catch:{ all -> 0x0302 }
        r0.zza(r3, r4, r9);	 Catch:{ all -> 0x0302 }
        goto L_0x02fc;
    L_0x02da:
        r1.zztj = r7;	 Catch:{ all -> 0x0302 }
        r0 = r17.zzgy();	 Catch:{ all -> 0x0302 }
        r5 = com.google.android.gms.measurement.internal.zzs.zzbt();	 Catch:{ all -> 0x0302 }
        r3 = r3 - r5;
        r0 = r0.zzu(r3);	 Catch:{ all -> 0x0302 }
        r3 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x0302 }
        if (r3 != 0) goto L_0x02fc;
    L_0x02ef:
        r3 = r17.zzgy();	 Catch:{ all -> 0x0302 }
        r0 = r3.zzab(r0);	 Catch:{ all -> 0x0302 }
        if (r0 == 0) goto L_0x02fc;
    L_0x02f9:
        r1.zzb(r0);	 Catch:{ all -> 0x0302 }
    L_0x02fc:
        r1.zzte = r2;
        r17.zzjo();
        return;
    L_0x0302:
        r0 = move-exception;
        r1.zzte = r2;
        r17.zzjo();
        goto L_0x030a;
    L_0x0309:
        throw r0;
    L_0x030a:
        goto L_0x0309;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjg.zzjl():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:325:0x076e A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x06c6 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x079e A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0784 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x06c6 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x076e A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0784 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x079e A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03e7 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03e6 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03db A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03e6 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03e7 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03db A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03e7 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03e6 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x05fb A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0629 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x076e A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x06c6 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x079e A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0784 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x0cd6 A:{Catch:{ all -> 0x0f05 }} */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0c8e A:{Catch:{ all -> 0x0f05 }} */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0bbb A:{Catch:{ all -> 0x0f05 }} */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0bb9 A:{Catch:{ all -> 0x0f05 }} */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0bf1 A:{SYNTHETIC, Splitter:B:481:0x0bf1} */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x0bc3 A:{SYNTHETIC, Splitter:B:470:0x0bc3} */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0adf A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0acc A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0b09 A:{SYNTHETIC, Splitter:B:451:0x0b09} */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0ae2 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0f09  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02a5 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0297 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02a5 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0f09  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0297 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0f09  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02a5 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0297 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02a5 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0f09  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0297 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0f09  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02a5 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0297 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02a5 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0f09  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0297 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0f09  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02a5 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0290 A:{SYNTHETIC, Splitter:B:153:0x0290} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0297 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02a5 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0f09  */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x0f21 A:{SYNTHETIC, Splitter:B:603:0x0f21} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0290 A:{SYNTHETIC, Splitter:B:153:0x0290} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0297 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0f09  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02a5 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x0f21 A:{SYNTHETIC, Splitter:B:603:0x0f21} */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x0f21 A:{SYNTHETIC, Splitter:B:603:0x0f21} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0290 A:{SYNTHETIC, Splitter:B:153:0x0290} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0297 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02a5 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0f09  */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x0f21 A:{SYNTHETIC, Splitter:B:603:0x0f21} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0290 A:{SYNTHETIC, Splitter:B:153:0x0290} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0297 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0f09  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02a5 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x0f21 A:{SYNTHETIC, Splitter:B:603:0x0f21} */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A:{ExcHandler: all (th java.lang.Throwable), PHI: r3 , Splitter:B:9:0x0031} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0290 A:{SYNTHETIC, Splitter:B:153:0x0290} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0297 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02a5 A:{Catch:{ IOException -> 0x0238, all -> 0x0f27 }} */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0f09  */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x0f21 A:{SYNTHETIC, Splitter:B:603:0x0f21} */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x0f21 A:{SYNTHETIC, Splitter:B:603:0x0f21} */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A:{ExcHandler: all (th java.lang.Throwable), PHI: r3 , Splitter:B:9:0x0031} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:11:0x0040, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:12:0x0041, code skipped:
            r6 = r1;
            r22 = r3;
     */
    /* JADX WARNING: Missing block: B:13:0x0046, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:14:0x0047, code skipped:
            r5 = null;
            r7 = r5;
     */
    /* JADX WARNING: Missing block: B:36:0x009a, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:37:0x009b, code skipped:
            r5 = r3;
     */
    /* JADX WARNING: Missing block: B:502:0x0c70, code skipped:
            if (r26 != r14) goto L_0x0c72;
     */
    @androidx.annotation.WorkerThread
    private final boolean zzd(java.lang.String r63, long r64) {
        /*
        r62 = this;
        r1 = r62;
        r2 = r62.zzgy();
        r2.beginTransaction();
        r2 = new com.google.android.gms.measurement.internal.zzjg$zza;	 Catch:{ all -> 0x0f27 }
        r3 = 0;
        r2.<init>(r1, r3);	 Catch:{ all -> 0x0f27 }
        r4 = r62.zzgy();	 Catch:{ all -> 0x0f27 }
        r5 = r1.zztj;	 Catch:{ all -> 0x0f27 }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r2);	 Catch:{ all -> 0x0f27 }
        r4.zzo();	 Catch:{ all -> 0x0f27 }
        r4.zzbi();	 Catch:{ all -> 0x0f27 }
        r8 = -1;
        r10 = 2;
        r11 = 0;
        r12 = 1;
        r15 = r4.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r13 = android.text.TextUtils.isEmpty(r3);	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        if (r13 == 0) goto L_0x009d;
    L_0x002d:
        r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r13 == 0) goto L_0x004c;
    L_0x0031:
        r13 = new java.lang.String[r10];	 Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
        r14 = java.lang.String.valueOf(r5);	 Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
        r13[r11] = r14;	 Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
        r14 = java.lang.String.valueOf(r64);	 Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
        r13[r12] = r14;	 Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
        goto L_0x0054;
    L_0x0040:
        r0 = move-exception;
        r6 = r1;
        r22 = r3;
        goto L_0x0276;
    L_0x0046:
        r0 = move-exception;
        r5 = r3;
        r7 = r5;
    L_0x0049:
        r3 = r0;
        goto L_0x027d;
    L_0x004c:
        r13 = new java.lang.String[r12];	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r14 = java.lang.String.valueOf(r64);	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r13[r11] = r14;	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
    L_0x0054:
        r14 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r14 == 0) goto L_0x005b;
    L_0x0058:
        r14 = "rowid <= ? and ";
        goto L_0x005d;
    L_0x005b:
        r14 = "";
    L_0x005d:
        r7 = r14.length();	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r7 = r7 + 148;
        r3 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r3.<init>(r7);	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r7 = "select app_id, metadata_fingerprint from raw_events where ";
        r3.append(r7);	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r3.append(r14);	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r7 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;";
        r3.append(r7);	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r3 = r3.toString();	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r3 = r15.rawQuery(r3, r13);	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r7 = r3.moveToFirst();	 Catch:{ SQLiteException -> 0x026d, all -> 0x0040 }
        if (r7 != 0) goto L_0x008a;
    L_0x0083:
        if (r3 == 0) goto L_0x0293;
    L_0x0085:
        r3.close();	 Catch:{ all -> 0x0f27 }
        goto L_0x0293;
    L_0x008a:
        r7 = r3.getString(r11);	 Catch:{ SQLiteException -> 0x026d, all -> 0x0040 }
        r13 = r3.getString(r12);	 Catch:{ SQLiteException -> 0x009a, all -> 0x0040 }
        r3.close();	 Catch:{ SQLiteException -> 0x009a, all -> 0x0040 }
        r23 = r3;
        r3 = r7;
        r7 = r13;
        goto L_0x00f4;
    L_0x009a:
        r0 = move-exception;
        r5 = r3;
        goto L_0x0049;
    L_0x009d:
        r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r3 == 0) goto L_0x00ad;
    L_0x00a1:
        r3 = new java.lang.String[r10];	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r7 = 0;
        r3[r11] = r7;	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r7 = java.lang.String.valueOf(r5);	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r3[r12] = r7;	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        goto L_0x00b3;
    L_0x00ad:
        r3 = 0;
        r7 = new java.lang.String[]{r3};	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r3 = r7;
    L_0x00b3:
        r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r7 == 0) goto L_0x00ba;
    L_0x00b7:
        r7 = " and rowid <= ?";
        goto L_0x00bc;
    L_0x00ba:
        r7 = "";
    L_0x00bc:
        r13 = r7.length();	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r13 = r13 + 84;
        r14 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r14.<init>(r13);	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r13 = "select metadata_fingerprint from raw_events where app_id = ?";
        r14.append(r13);	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r14.append(r7);	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r7 = " order by rowid limit 1;";
        r14.append(r7);	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r7 = r14.toString();	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r3 = r15.rawQuery(r7, r3);	 Catch:{ SQLiteException -> 0x0279, all -> 0x0272 }
        r7 = r3.moveToFirst();	 Catch:{ SQLiteException -> 0x026d, all -> 0x0040 }
        if (r7 != 0) goto L_0x00e9;
    L_0x00e2:
        if (r3 == 0) goto L_0x0293;
    L_0x00e4:
        r3.close();	 Catch:{ all -> 0x0f27 }
        goto L_0x0293;
    L_0x00e9:
        r13 = r3.getString(r11);	 Catch:{ SQLiteException -> 0x026d, all -> 0x0040 }
        r3.close();	 Catch:{ SQLiteException -> 0x026d, all -> 0x0040 }
        r23 = r3;
        r7 = r13;
        r3 = 0;
    L_0x00f4:
        r14 = "raw_events_metadata";
        r13 = "metadata";
        r16 = new java.lang.String[]{r13};	 Catch:{ SQLiteException -> 0x0267, all -> 0x0262 }
        r17 = "app_id = ? and metadata_fingerprint = ?";
        r13 = new java.lang.String[r10];	 Catch:{ SQLiteException -> 0x0267, all -> 0x0262 }
        r13[r11] = r3;	 Catch:{ SQLiteException -> 0x0267, all -> 0x0262 }
        r13[r12] = r7;	 Catch:{ SQLiteException -> 0x0267, all -> 0x0262 }
        r18 = 0;
        r19 = 0;
        r20 = "rowid";
        r21 = "2";
        r24 = r13;
        r13 = r15;
        r25 = r15;
        r15 = r16;
        r16 = r17;
        r17 = r24;
        r15 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21);	 Catch:{ SQLiteException -> 0x0267, all -> 0x0262 }
        r13 = r15.moveToFirst();	 Catch:{ SQLiteException -> 0x025c, all -> 0x0256 }
        if (r13 != 0) goto L_0x0144;
    L_0x0121:
        r5 = r4.zzab();	 Catch:{ SQLiteException -> 0x013f, all -> 0x0139 }
        r5 = r5.zzgk();	 Catch:{ SQLiteException -> 0x013f, all -> 0x0139 }
        r6 = "Raw event metadata record is missing. appId";
        r7 = com.google.android.gms.measurement.internal.zzef.zzam(r3);	 Catch:{ SQLiteException -> 0x013f, all -> 0x0139 }
        r5.zza(r6, r7);	 Catch:{ SQLiteException -> 0x013f, all -> 0x0139 }
        if (r15 == 0) goto L_0x0293;
    L_0x0134:
        r15.close();	 Catch:{ all -> 0x0f27 }
        goto L_0x0293;
    L_0x0139:
        r0 = move-exception;
        r6 = r1;
        r22 = r15;
        goto L_0x0276;
    L_0x013f:
        r0 = move-exception;
        r7 = r3;
        r5 = r15;
        goto L_0x0049;
    L_0x0144:
        r13 = r15.getBlob(r11);	 Catch:{ SQLiteException -> 0x025c, all -> 0x0256 }
        r14 = com.google.android.gms.internal.measurement.zzel.zztq();	 Catch:{ IOException -> 0x0238 }
        r13 = com.google.android.gms.internal.measurement.zzbs.zzg.zzd(r13, r14);	 Catch:{ IOException -> 0x0238 }
        r14 = r15.moveToNext();	 Catch:{ SQLiteException -> 0x025c, all -> 0x0256 }
        if (r14 == 0) goto L_0x0167;
    L_0x0156:
        r14 = r4.zzab();	 Catch:{ SQLiteException -> 0x013f, all -> 0x0139 }
        r14 = r14.zzgn();	 Catch:{ SQLiteException -> 0x013f, all -> 0x0139 }
        r10 = "Get multiple raw event metadata records, expected one. appId";
        r12 = com.google.android.gms.measurement.internal.zzef.zzam(r3);	 Catch:{ SQLiteException -> 0x013f, all -> 0x0139 }
        r14.zza(r10, r12);	 Catch:{ SQLiteException -> 0x013f, all -> 0x0139 }
    L_0x0167:
        r15.close();	 Catch:{ SQLiteException -> 0x025c, all -> 0x0256 }
        r2.zzb(r13);	 Catch:{ SQLiteException -> 0x025c, all -> 0x0256 }
        r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r10 == 0) goto L_0x0187;
    L_0x0171:
        r10 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
        r12 = 3;
        r13 = new java.lang.String[r12];	 Catch:{ SQLiteException -> 0x013f, all -> 0x0139 }
        r13[r11] = r3;	 Catch:{ SQLiteException -> 0x013f, all -> 0x0139 }
        r12 = 1;
        r13[r12] = r7;	 Catch:{ SQLiteException -> 0x013f, all -> 0x0139 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ SQLiteException -> 0x013f, all -> 0x0139 }
        r6 = 2;
        r13[r6] = r5;	 Catch:{ SQLiteException -> 0x013f, all -> 0x0139 }
        r16 = r10;
        r17 = r13;
        goto L_0x0195;
    L_0x0187:
        r5 = "app_id = ? and metadata_fingerprint = ?";
        r6 = 2;
        r10 = new java.lang.String[r6];	 Catch:{ SQLiteException -> 0x025c, all -> 0x0256 }
        r10[r11] = r3;	 Catch:{ SQLiteException -> 0x025c, all -> 0x0256 }
        r6 = 1;
        r10[r6] = r7;	 Catch:{ SQLiteException -> 0x025c, all -> 0x0256 }
        r16 = r5;
        r17 = r10;
    L_0x0195:
        r14 = "raw_events";
        r5 = "rowid";
        r6 = "name";
        r7 = "timestamp";
        r10 = "data";
        r5 = new java.lang.String[]{r5, r6, r7, r10};	 Catch:{ SQLiteException -> 0x025c, all -> 0x0256 }
        r18 = 0;
        r19 = 0;
        r20 = "rowid";
        r21 = 0;
        r13 = r25;
        r6 = r15;
        r15 = r5;
        r5 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21);	 Catch:{ SQLiteException -> 0x0254, all -> 0x0252 }
        r6 = r5.moveToFirst();	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        if (r6 != 0) goto L_0x01d2;
    L_0x01ba:
        r6 = r4.zzab();	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r6 = r6.zzgn();	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r7 = "Raw event data disappeared while in transaction. appId";
        r10 = com.google.android.gms.measurement.internal.zzef.zzam(r3);	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r6.zza(r7, r10);	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        if (r5 == 0) goto L_0x0293;
    L_0x01cd:
        r5.close();	 Catch:{ all -> 0x0f27 }
        goto L_0x0293;
    L_0x01d2:
        r6 = r5.getLong(r11);	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r10 = 3;
        r12 = r5.getBlob(r10);	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r10 = com.google.android.gms.internal.measurement.zzbs.zzc.zzmq();	 Catch:{ IOException -> 0x020f }
        r13 = com.google.android.gms.internal.measurement.zzel.zztq();	 Catch:{ IOException -> 0x020f }
        r10 = r10.zzf(r12, r13);	 Catch:{ IOException -> 0x020f }
        r10 = (com.google.android.gms.internal.measurement.zzbs.zzc.zza) r10;	 Catch:{ IOException -> 0x020f }
        r12 = 1;
        r13 = r5.getString(r12);	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r12 = r10.zzbx(r13);	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r13 = 2;
        r14 = r5.getLong(r13);	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r12.zzag(r14);	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r10 = r10.zzug();	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r10 = (com.google.android.gms.internal.measurement.zzey) r10;	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r10 = (com.google.android.gms.internal.measurement.zzbs.zzc) r10;	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r6 = r2.zza(r6, r10);	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        if (r6 != 0) goto L_0x0222;
    L_0x0208:
        if (r5 == 0) goto L_0x0293;
    L_0x020a:
        r5.close();	 Catch:{ all -> 0x0f27 }
        goto L_0x0293;
    L_0x020f:
        r0 = move-exception;
        r6 = r0;
        r7 = r4.zzab();	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r7 = r7.zzgk();	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r10 = "Data loss. Failed to merge raw event. appId";
        r12 = com.google.android.gms.measurement.internal.zzef.zzam(r3);	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        r7.zza(r10, r12, r6);	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
    L_0x0222:
        r6 = r5.moveToNext();	 Catch:{ SQLiteException -> 0x0234, all -> 0x022f }
        if (r6 != 0) goto L_0x01d2;
    L_0x0228:
        if (r5 == 0) goto L_0x0293;
    L_0x022a:
        r5.close();	 Catch:{ all -> 0x0f27 }
        goto L_0x0293;
    L_0x022f:
        r0 = move-exception;
        r6 = r1;
        r22 = r5;
        goto L_0x0276;
    L_0x0234:
        r0 = move-exception;
        r7 = r3;
        goto L_0x0049;
    L_0x0238:
        r0 = move-exception;
        r6 = r15;
        r5 = r0;
        r7 = r4.zzab();	 Catch:{ SQLiteException -> 0x0254, all -> 0x0252 }
        r7 = r7.zzgk();	 Catch:{ SQLiteException -> 0x0254, all -> 0x0252 }
        r10 = "Data loss. Failed to merge raw event metadata. appId";
        r12 = com.google.android.gms.measurement.internal.zzef.zzam(r3);	 Catch:{ SQLiteException -> 0x0254, all -> 0x0252 }
        r7.zza(r10, r12, r5);	 Catch:{ SQLiteException -> 0x0254, all -> 0x0252 }
        if (r6 == 0) goto L_0x0293;
    L_0x024e:
        r6.close();	 Catch:{ all -> 0x0f27 }
        goto L_0x0293;
    L_0x0252:
        r0 = move-exception;
        goto L_0x0258;
    L_0x0254:
        r0 = move-exception;
        goto L_0x025e;
    L_0x0256:
        r0 = move-exception;
        r6 = r15;
    L_0x0258:
        r22 = r6;
        r6 = r1;
        goto L_0x0276;
    L_0x025c:
        r0 = move-exception;
        r6 = r15;
    L_0x025e:
        r7 = r3;
        r5 = r6;
        goto L_0x0049;
    L_0x0262:
        r0 = move-exception;
        r6 = r1;
        r22 = r23;
        goto L_0x0276;
    L_0x0267:
        r0 = move-exception;
        r7 = r3;
        r5 = r23;
        goto L_0x0049;
    L_0x026d:
        r0 = move-exception;
        r5 = r3;
        r7 = 0;
        goto L_0x0049;
    L_0x0272:
        r0 = move-exception;
        r6 = r1;
        r22 = 0;
    L_0x0276:
        r1 = r0;
        goto L_0x0f1f;
    L_0x0279:
        r0 = move-exception;
        r3 = r0;
        r5 = 0;
        r7 = 0;
    L_0x027d:
        r4 = r4.zzab();	 Catch:{ all -> 0x0f1a }
        r4 = r4.zzgk();	 Catch:{ all -> 0x0f1a }
        r6 = "Data loss. Error selecting raw event. appId";
        r7 = com.google.android.gms.measurement.internal.zzef.zzam(r7);	 Catch:{ all -> 0x0f1a }
        r4.zza(r6, r7, r3);	 Catch:{ all -> 0x0f1a }
        if (r5 == 0) goto L_0x0293;
    L_0x0290:
        r5.close();	 Catch:{ all -> 0x0f27 }
    L_0x0293:
        r3 = r2.zztp;	 Catch:{ all -> 0x0f27 }
        if (r3 == 0) goto L_0x02a2;
    L_0x0297:
        r3 = r2.zztp;	 Catch:{ all -> 0x0f27 }
        r3 = r3.isEmpty();	 Catch:{ all -> 0x0f27 }
        if (r3 == 0) goto L_0x02a0;
    L_0x029f:
        goto L_0x02a2;
    L_0x02a0:
        r3 = 0;
        goto L_0x02a3;
    L_0x02a2:
        r3 = 1;
    L_0x02a3:
        if (r3 != 0) goto L_0x0f09;
    L_0x02a5:
        r3 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r3 = r3.zzuj();	 Catch:{ all -> 0x0f27 }
        r3 = (com.google.android.gms.internal.measurement.zzey.zza) r3;	 Catch:{ all -> 0x0f27 }
        r3 = (com.google.android.gms.internal.measurement.zzbs.zzg.zza) r3;	 Catch:{ all -> 0x0f27 }
        r3 = r3.zznn();	 Catch:{ all -> 0x0f27 }
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzad();	 Catch:{ all -> 0x0f27 }
        r5 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r5 = r5.zzag();	 Catch:{ all -> 0x0f27 }
        r6 = com.google.android.gms.measurement.internal.zzak.zzii;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zze(r5, r6);	 Catch:{ all -> 0x0f27 }
        r7 = 0;
        r8 = -1;
        r9 = -1;
        r12 = 0;
        r13 = 0;
        r15 = 0;
        r18 = 0;
        r19 = 0;
    L_0x02d0:
        r11 = r2.zztp;	 Catch:{ all -> 0x0f27 }
        r11 = r11.size();	 Catch:{ all -> 0x0f27 }
        r5 = "_et";
        r6 = "_e";
        r21 = r12;
        r26 = r13;
        if (r7 >= r11) goto L_0x07f2;
    L_0x02e0:
        r11 = r2.zztp;	 Catch:{ all -> 0x0f27 }
        r11 = r11.get(r7);	 Catch:{ all -> 0x0f27 }
        r11 = (com.google.android.gms.internal.measurement.zzbs.zzc) r11;	 Catch:{ all -> 0x0f27 }
        r11 = r11.zzuj();	 Catch:{ all -> 0x0f27 }
        r11 = (com.google.android.gms.internal.measurement.zzey.zza) r11;	 Catch:{ all -> 0x0f27 }
        r11 = (com.google.android.gms.internal.measurement.zzbs.zzc.zza) r11;	 Catch:{ all -> 0x0f27 }
        r14 = r62.zzgz();	 Catch:{ all -> 0x0f27 }
        r10 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r10 = r10.zzag();	 Catch:{ all -> 0x0f27 }
        r12 = r11.getName();	 Catch:{ all -> 0x0f27 }
        r10 = r14.zzk(r10, r12);	 Catch:{ all -> 0x0f27 }
        r12 = "_err";
        if (r10 == 0) goto L_0x0382;
    L_0x0306:
        r5 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r5 = r5.zzab();	 Catch:{ all -> 0x0f27 }
        r5 = r5.zzgn();	 Catch:{ all -> 0x0f27 }
        r6 = "Dropping blacklisted raw event. appId";
        r10 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r10 = r10.zzag();	 Catch:{ all -> 0x0f27 }
        r10 = com.google.android.gms.measurement.internal.zzef.zzam(r10);	 Catch:{ all -> 0x0f27 }
        r13 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r13 = r13.zzy();	 Catch:{ all -> 0x0f27 }
        r14 = r11.getName();	 Catch:{ all -> 0x0f27 }
        r13 = r13.zzaj(r14);	 Catch:{ all -> 0x0f27 }
        r5.zza(r6, r10, r13);	 Catch:{ all -> 0x0f27 }
        r5 = r62.zzgz();	 Catch:{ all -> 0x0f27 }
        r6 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r6 = r6.zzag();	 Catch:{ all -> 0x0f27 }
        r5 = r5.zzbc(r6);	 Catch:{ all -> 0x0f27 }
        if (r5 != 0) goto L_0x0350;
    L_0x033d:
        r5 = r62.zzgz();	 Catch:{ all -> 0x0f27 }
        r6 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r6 = r6.zzag();	 Catch:{ all -> 0x0f27 }
        r5 = r5.zzbd(r6);	 Catch:{ all -> 0x0f27 }
        if (r5 == 0) goto L_0x034e;
    L_0x034d:
        goto L_0x0350;
    L_0x034e:
        r5 = 0;
        goto L_0x0351;
    L_0x0350:
        r5 = 1;
    L_0x0351:
        if (r5 != 0) goto L_0x0376;
    L_0x0353:
        r5 = r11.getName();	 Catch:{ all -> 0x0f27 }
        r5 = r12.equals(r5);	 Catch:{ all -> 0x0f27 }
        if (r5 != 0) goto L_0x0376;
    L_0x035d:
        r5 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r28 = r5.zzz();	 Catch:{ all -> 0x0f27 }
        r5 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r29 = r5.zzag();	 Catch:{ all -> 0x0f27 }
        r30 = 11;
        r31 = "_ev";
        r32 = r11.getName();	 Catch:{ all -> 0x0f27 }
        r33 = 0;
        r28.zza(r29, r30, r31, r32, r33);	 Catch:{ all -> 0x0f27 }
    L_0x0376:
        r31 = r4;
        r6 = r9;
        r12 = r21;
        r13 = r26;
        r5 = -1;
        r10 = 3;
        r9 = r7;
        goto L_0x07eb;
    L_0x0382:
        r10 = r62.zzgz();	 Catch:{ all -> 0x0f27 }
        r13 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r13 = r13.zzag();	 Catch:{ all -> 0x0f27 }
        r14 = r11.getName();	 Catch:{ all -> 0x0f27 }
        r10 = r10.zzl(r13, r14);	 Catch:{ all -> 0x0f27 }
        r13 = "_c";
        if (r10 != 0) goto L_0x03f1;
    L_0x0398:
        r62.zzgw();	 Catch:{ all -> 0x0f27 }
        r14 = r11.getName();	 Catch:{ all -> 0x0f27 }
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14);	 Catch:{ all -> 0x0f27 }
        r25 = r15;
        r15 = r14.hashCode();	 Catch:{ all -> 0x0f27 }
        r30 = r7;
        r7 = 94660; // 0x171c4 float:1.32647E-40 double:4.67683E-319;
        if (r15 == r7) goto L_0x03ce;
    L_0x03af:
        r7 = 95025; // 0x17331 float:1.33158E-40 double:4.69486E-319;
        if (r15 == r7) goto L_0x03c4;
    L_0x03b4:
        r7 = 95027; // 0x17333 float:1.33161E-40 double:4.69496E-319;
        if (r15 == r7) goto L_0x03ba;
    L_0x03b9:
        goto L_0x03d8;
    L_0x03ba:
        r7 = "_ui";
        r7 = r14.equals(r7);	 Catch:{ all -> 0x0f27 }
        if (r7 == 0) goto L_0x03d8;
    L_0x03c2:
        r7 = 1;
        goto L_0x03d9;
    L_0x03c4:
        r7 = "_ug";
        r7 = r14.equals(r7);	 Catch:{ all -> 0x0f27 }
        if (r7 == 0) goto L_0x03d8;
    L_0x03cc:
        r7 = 2;
        goto L_0x03d9;
    L_0x03ce:
        r7 = "_in";
        r7 = r14.equals(r7);	 Catch:{ all -> 0x0f27 }
        if (r7 == 0) goto L_0x03d8;
    L_0x03d6:
        r7 = 0;
        goto L_0x03d9;
    L_0x03d8:
        r7 = -1;
    L_0x03d9:
        if (r7 == 0) goto L_0x03e3;
    L_0x03db:
        r14 = 1;
        if (r7 == r14) goto L_0x03e3;
    L_0x03de:
        r14 = 2;
        if (r7 == r14) goto L_0x03e3;
    L_0x03e1:
        r7 = 0;
        goto L_0x03e4;
    L_0x03e3:
        r7 = 1;
    L_0x03e4:
        if (r7 == 0) goto L_0x03e7;
    L_0x03e6:
        goto L_0x03f5;
    L_0x03e7:
        r31 = r4;
        r7 = r5;
        r32 = r8;
        r33 = r9;
        r9 = r6;
        goto L_0x05d5;
    L_0x03f1:
        r30 = r7;
        r25 = r15;
    L_0x03f5:
        r31 = r4;
        r7 = 0;
        r14 = 0;
        r15 = 0;
    L_0x03fa:
        r4 = r11.zzmk();	 Catch:{ all -> 0x0f27 }
        r32 = r8;
        r8 = "_r";
        if (r7 >= r4) goto L_0x0468;
    L_0x0404:
        r4 = r11.zzl(r7);	 Catch:{ all -> 0x0f27 }
        r4 = r4.getName();	 Catch:{ all -> 0x0f27 }
        r4 = r13.equals(r4);	 Catch:{ all -> 0x0f27 }
        if (r4 == 0) goto L_0x0433;
    L_0x0412:
        r4 = r11.zzl(r7);	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzuj();	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzey.zza) r4;	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzbs.zze.zza) r4;	 Catch:{ all -> 0x0f27 }
        r33 = r9;
        r8 = 1;
        r4 = r4.zzam(r8);	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzug();	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzey) r4;	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzbs.zze) r4;	 Catch:{ all -> 0x0f27 }
        r11.zza(r7, r4);	 Catch:{ all -> 0x0f27 }
        r14 = 1;
        goto L_0x0461;
    L_0x0433:
        r33 = r9;
        r4 = r11.zzl(r7);	 Catch:{ all -> 0x0f27 }
        r4 = r4.getName();	 Catch:{ all -> 0x0f27 }
        r4 = r8.equals(r4);	 Catch:{ all -> 0x0f27 }
        if (r4 == 0) goto L_0x0461;
    L_0x0443:
        r4 = r11.zzl(r7);	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzuj();	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzey.zza) r4;	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzbs.zze.zza) r4;	 Catch:{ all -> 0x0f27 }
        r8 = 1;
        r4 = r4.zzam(r8);	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzug();	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzey) r4;	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzbs.zze) r4;	 Catch:{ all -> 0x0f27 }
        r11.zza(r7, r4);	 Catch:{ all -> 0x0f27 }
        r15 = 1;
    L_0x0461:
        r7 = r7 + 1;
        r8 = r32;
        r9 = r33;
        goto L_0x03fa;
    L_0x0468:
        r33 = r9;
        if (r14 != 0) goto L_0x049f;
    L_0x046c:
        if (r10 == 0) goto L_0x049f;
    L_0x046e:
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzab();	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzgs();	 Catch:{ all -> 0x0f27 }
        r7 = "Marking event as conversion";
        r9 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r9 = r9.zzy();	 Catch:{ all -> 0x0f27 }
        r14 = r11.getName();	 Catch:{ all -> 0x0f27 }
        r9 = r9.zzaj(r14);	 Catch:{ all -> 0x0f27 }
        r4.zza(r7, r9);	 Catch:{ all -> 0x0f27 }
        r4 = com.google.android.gms.internal.measurement.zzbs.zze.zzng();	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzbz(r13);	 Catch:{ all -> 0x0f27 }
        r7 = r5;
        r9 = r6;
        r5 = 1;
        r4 = r4.zzam(r5);	 Catch:{ all -> 0x0f27 }
        r11.zza(r4);	 Catch:{ all -> 0x0f27 }
        goto L_0x04a1;
    L_0x049f:
        r7 = r5;
        r9 = r6;
    L_0x04a1:
        if (r15 != 0) goto L_0x04d1;
    L_0x04a3:
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzab();	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzgs();	 Catch:{ all -> 0x0f27 }
        r5 = "Marking event as real-time";
        r6 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r6 = r6.zzy();	 Catch:{ all -> 0x0f27 }
        r14 = r11.getName();	 Catch:{ all -> 0x0f27 }
        r6 = r6.zzaj(r14);	 Catch:{ all -> 0x0f27 }
        r4.zza(r5, r6);	 Catch:{ all -> 0x0f27 }
        r4 = com.google.android.gms.internal.measurement.zzbs.zze.zzng();	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzbz(r8);	 Catch:{ all -> 0x0f27 }
        r5 = 1;
        r4 = r4.zzam(r5);	 Catch:{ all -> 0x0f27 }
        r11.zza(r4);	 Catch:{ all -> 0x0f27 }
    L_0x04d1:
        r34 = r62.zzgy();	 Catch:{ all -> 0x0f27 }
        r35 = r62.zzjk();	 Catch:{ all -> 0x0f27 }
        r4 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r37 = r4.zzag();	 Catch:{ all -> 0x0f27 }
        r38 = 0;
        r39 = 0;
        r40 = 0;
        r41 = 0;
        r42 = 1;
        r4 = r34.zza(r35, r37, r38, r39, r40, r41, r42);	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzej;	 Catch:{ all -> 0x0f27 }
        r6 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r6 = r6.zzad();	 Catch:{ all -> 0x0f27 }
        r14 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r14 = r14.zzag();	 Catch:{ all -> 0x0f27 }
        r6 = r6.zzi(r14);	 Catch:{ all -> 0x0f27 }
        r14 = (long) r6;	 Catch:{ all -> 0x0f27 }
        r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1));
        if (r6 <= 0) goto L_0x0508;
    L_0x0504:
        zza(r11, r8);	 Catch:{ all -> 0x0f27 }
        goto L_0x050a;
    L_0x0508:
        r21 = 1;
    L_0x050a:
        r4 = r11.getName();	 Catch:{ all -> 0x0f27 }
        r4 = com.google.android.gms.measurement.internal.zzjs.zzbk(r4);	 Catch:{ all -> 0x0f27 }
        if (r4 == 0) goto L_0x05d5;
    L_0x0514:
        if (r10 == 0) goto L_0x05d5;
    L_0x0516:
        r34 = r62.zzgy();	 Catch:{ all -> 0x0f27 }
        r35 = r62.zzjk();	 Catch:{ all -> 0x0f27 }
        r4 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r37 = r4.zzag();	 Catch:{ all -> 0x0f27 }
        r38 = 0;
        r39 = 0;
        r40 = 1;
        r41 = 0;
        r42 = 0;
        r4 = r34.zza(r35, r37, r38, r39, r40, r41, r42);	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzeh;	 Catch:{ all -> 0x0f27 }
        r6 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r6 = r6.zzad();	 Catch:{ all -> 0x0f27 }
        r8 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r8 = r8.zzag();	 Catch:{ all -> 0x0f27 }
        r14 = com.google.android.gms.measurement.internal.zzak.zzgs;	 Catch:{ all -> 0x0f27 }
        r6 = r6.zzb(r8, r14);	 Catch:{ all -> 0x0f27 }
        r14 = (long) r6;	 Catch:{ all -> 0x0f27 }
        r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1));
        if (r6 <= 0) goto L_0x05d5;
    L_0x054b:
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzab();	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzgn();	 Catch:{ all -> 0x0f27 }
        r5 = "Too many conversions. Not logging as conversion. appId";
        r6 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r6 = r6.zzag();	 Catch:{ all -> 0x0f27 }
        r6 = com.google.android.gms.measurement.internal.zzef.zzam(r6);	 Catch:{ all -> 0x0f27 }
        r4.zza(r5, r6);	 Catch:{ all -> 0x0f27 }
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r8 = -1;
    L_0x0568:
        r14 = r11.zzmk();	 Catch:{ all -> 0x0f27 }
        if (r4 >= r14) goto L_0x0594;
    L_0x056e:
        r14 = r11.zzl(r4);	 Catch:{ all -> 0x0f27 }
        r15 = r14.getName();	 Catch:{ all -> 0x0f27 }
        r15 = r13.equals(r15);	 Catch:{ all -> 0x0f27 }
        if (r15 == 0) goto L_0x0586;
    L_0x057c:
        r6 = r14.zzuj();	 Catch:{ all -> 0x0f27 }
        r6 = (com.google.android.gms.internal.measurement.zzey.zza) r6;	 Catch:{ all -> 0x0f27 }
        r6 = (com.google.android.gms.internal.measurement.zzbs.zze.zza) r6;	 Catch:{ all -> 0x0f27 }
        r8 = r4;
        goto L_0x0591;
    L_0x0586:
        r14 = r14.getName();	 Catch:{ all -> 0x0f27 }
        r14 = r12.equals(r14);	 Catch:{ all -> 0x0f27 }
        if (r14 == 0) goto L_0x0591;
    L_0x0590:
        r5 = 1;
    L_0x0591:
        r4 = r4 + 1;
        goto L_0x0568;
    L_0x0594:
        if (r5 == 0) goto L_0x059c;
    L_0x0596:
        if (r6 == 0) goto L_0x059c;
    L_0x0598:
        r11.zzm(r8);	 Catch:{ all -> 0x0f27 }
        goto L_0x05d5;
    L_0x059c:
        if (r6 == 0) goto L_0x05bc;
    L_0x059e:
        r4 = r6.clone();	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzey.zza) r4;	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzbs.zze.zza) r4;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzbz(r12);	 Catch:{ all -> 0x0f27 }
        r5 = 10;
        r4 = r4.zzam(r5);	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzug();	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzey) r4;	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzbs.zze) r4;	 Catch:{ all -> 0x0f27 }
        r11.zza(r8, r4);	 Catch:{ all -> 0x0f27 }
        goto L_0x05d5;
    L_0x05bc:
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzab();	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzgk();	 Catch:{ all -> 0x0f27 }
        r5 = "Did not find conversion parameter. appId";
        r6 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r6 = r6.zzag();	 Catch:{ all -> 0x0f27 }
        r6 = com.google.android.gms.measurement.internal.zzef.zzam(r6);	 Catch:{ all -> 0x0f27 }
        r4.zza(r5, r6);	 Catch:{ all -> 0x0f27 }
    L_0x05d5:
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzad();	 Catch:{ all -> 0x0f27 }
        r5 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r5 = r5.zzag();	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzs(r5);	 Catch:{ all -> 0x0f27 }
        if (r4 == 0) goto L_0x06b0;
    L_0x05e7:
        if (r10 == 0) goto L_0x06b0;
    L_0x05e9:
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0f27 }
        r5 = r11.zzmj();	 Catch:{ all -> 0x0f27 }
        r4.<init>(r5);	 Catch:{ all -> 0x0f27 }
        r5 = 0;
        r6 = -1;
        r8 = -1;
    L_0x05f5:
        r10 = r4.size();	 Catch:{ all -> 0x0f27 }
        if (r5 >= r10) goto L_0x0626;
    L_0x05fb:
        r10 = "value";
        r12 = r4.get(r5);	 Catch:{ all -> 0x0f27 }
        r12 = (com.google.android.gms.internal.measurement.zzbs.zze) r12;	 Catch:{ all -> 0x0f27 }
        r12 = r12.getName();	 Catch:{ all -> 0x0f27 }
        r10 = r10.equals(r12);	 Catch:{ all -> 0x0f27 }
        if (r10 == 0) goto L_0x0610;
    L_0x060e:
        r6 = r5;
        goto L_0x0623;
    L_0x0610:
        r10 = "currency";
        r12 = r4.get(r5);	 Catch:{ all -> 0x0f27 }
        r12 = (com.google.android.gms.internal.measurement.zzbs.zze) r12;	 Catch:{ all -> 0x0f27 }
        r12 = r12.getName();	 Catch:{ all -> 0x0f27 }
        r10 = r10.equals(r12);	 Catch:{ all -> 0x0f27 }
        if (r10 == 0) goto L_0x0623;
    L_0x0622:
        r8 = r5;
    L_0x0623:
        r5 = r5 + 1;
        goto L_0x05f5;
    L_0x0626:
        r5 = -1;
        if (r6 == r5) goto L_0x06b1;
    L_0x0629:
        r5 = r4.get(r6);	 Catch:{ all -> 0x0f27 }
        r5 = (com.google.android.gms.internal.measurement.zzbs.zze) r5;	 Catch:{ all -> 0x0f27 }
        r5 = r5.zzna();	 Catch:{ all -> 0x0f27 }
        if (r5 != 0) goto L_0x065f;
    L_0x0635:
        r5 = r4.get(r6);	 Catch:{ all -> 0x0f27 }
        r5 = (com.google.android.gms.internal.measurement.zzbs.zze) r5;	 Catch:{ all -> 0x0f27 }
        r5 = r5.zznd();	 Catch:{ all -> 0x0f27 }
        if (r5 != 0) goto L_0x065f;
    L_0x0641:
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzab();	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzgp();	 Catch:{ all -> 0x0f27 }
        r5 = "Value must be specified with a numeric type.";
        r4.zzao(r5);	 Catch:{ all -> 0x0f27 }
        r11.zzm(r6);	 Catch:{ all -> 0x0f27 }
        zza(r11, r13);	 Catch:{ all -> 0x0f27 }
        r4 = 18;
        r5 = "value";
        zza(r11, r4, r5);	 Catch:{ all -> 0x0f27 }
        goto L_0x06b0;
    L_0x065f:
        r5 = -1;
        if (r8 != r5) goto L_0x0665;
    L_0x0662:
        r4 = 1;
        r10 = 3;
        goto L_0x0691;
    L_0x0665:
        r4 = r4.get(r8);	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzbs.zze) r4;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzmy();	 Catch:{ all -> 0x0f27 }
        r8 = r4.length();	 Catch:{ all -> 0x0f27 }
        r10 = 3;
        if (r8 == r10) goto L_0x0678;
    L_0x0676:
        r4 = 1;
        goto L_0x0691;
    L_0x0678:
        r8 = 0;
    L_0x0679:
        r12 = r4.length();	 Catch:{ all -> 0x0f27 }
        if (r8 >= r12) goto L_0x0690;
    L_0x067f:
        r12 = r4.codePointAt(r8);	 Catch:{ all -> 0x0f27 }
        r14 = java.lang.Character.isLetter(r12);	 Catch:{ all -> 0x0f27 }
        if (r14 != 0) goto L_0x068a;
    L_0x0689:
        goto L_0x0676;
    L_0x068a:
        r12 = java.lang.Character.charCount(r12);	 Catch:{ all -> 0x0f27 }
        r8 = r8 + r12;
        goto L_0x0679;
    L_0x0690:
        r4 = 0;
    L_0x0691:
        if (r4 == 0) goto L_0x06b2;
    L_0x0693:
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzab();	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzgp();	 Catch:{ all -> 0x0f27 }
        r8 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.";
        r4.zzao(r8);	 Catch:{ all -> 0x0f27 }
        r11.zzm(r6);	 Catch:{ all -> 0x0f27 }
        zza(r11, r13);	 Catch:{ all -> 0x0f27 }
        r4 = 19;
        r6 = "currency";
        zza(r11, r4, r6);	 Catch:{ all -> 0x0f27 }
        goto L_0x06b2;
    L_0x06b0:
        r5 = -1;
    L_0x06b1:
        r10 = 3;
    L_0x06b2:
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzad();	 Catch:{ all -> 0x0f27 }
        r6 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r6 = r6.zzag();	 Catch:{ all -> 0x0f27 }
        r8 = com.google.android.gms.measurement.internal.zzak.zzih;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zze(r6, r8);	 Catch:{ all -> 0x0f27 }
        if (r4 == 0) goto L_0x076e;
    L_0x06c6:
        r4 = r11.getName();	 Catch:{ all -> 0x0f27 }
        r4 = r9.equals(r4);	 Catch:{ all -> 0x0f27 }
        if (r4 == 0) goto L_0x071c;
    L_0x06d0:
        r62.zzgw();	 Catch:{ all -> 0x0f27 }
        r4 = r11.zzug();	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzey) r4;	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzbs.zzc) r4;	 Catch:{ all -> 0x0f27 }
        r6 = "_fr";
        r4 = com.google.android.gms.measurement.internal.zzjo.zza(r4, r6);	 Catch:{ all -> 0x0f27 }
        if (r4 != 0) goto L_0x0719;
    L_0x06e3:
        if (r19 == 0) goto L_0x0712;
    L_0x06e5:
        r12 = r19.getTimestampMillis();	 Catch:{ all -> 0x0f27 }
        r14 = r11.getTimestampMillis();	 Catch:{ all -> 0x0f27 }
        r12 = r12 - r14;
        r12 = java.lang.Math.abs(r12);	 Catch:{ all -> 0x0f27 }
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r4 > 0) goto L_0x0712;
    L_0x06f8:
        r4 = r19.clone();	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzey.zza) r4;	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzbs.zzc.zza) r4;	 Catch:{ all -> 0x0f27 }
        r6 = r1.zza(r11, r4);	 Catch:{ all -> 0x0f27 }
        if (r6 == 0) goto L_0x0712;
    L_0x0706:
        r6 = r33;
        r3.zza(r6, r4);	 Catch:{ all -> 0x0f27 }
        r8 = r32;
    L_0x070d:
        r18 = 0;
        r19 = 0;
        goto L_0x0772;
    L_0x0712:
        r6 = r33;
        r18 = r11;
        r8 = r25;
        goto L_0x0772;
    L_0x0719:
        r6 = r33;
        goto L_0x076b;
    L_0x071c:
        r6 = r33;
        r4 = "_vs";
        r8 = r11.getName();	 Catch:{ all -> 0x0f27 }
        r4 = r4.equals(r8);	 Catch:{ all -> 0x0f27 }
        if (r4 == 0) goto L_0x076b;
    L_0x072a:
        r62.zzgw();	 Catch:{ all -> 0x0f27 }
        r4 = r11.zzug();	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzey) r4;	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzbs.zzc) r4;	 Catch:{ all -> 0x0f27 }
        r4 = com.google.android.gms.measurement.internal.zzjo.zza(r4, r7);	 Catch:{ all -> 0x0f27 }
        if (r4 != 0) goto L_0x076b;
    L_0x073b:
        if (r18 == 0) goto L_0x0764;
    L_0x073d:
        r12 = r18.getTimestampMillis();	 Catch:{ all -> 0x0f27 }
        r14 = r11.getTimestampMillis();	 Catch:{ all -> 0x0f27 }
        r12 = r12 - r14;
        r12 = java.lang.Math.abs(r12);	 Catch:{ all -> 0x0f27 }
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r4 > 0) goto L_0x0764;
    L_0x0750:
        r4 = r18.clone();	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzey.zza) r4;	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzbs.zzc.zza) r4;	 Catch:{ all -> 0x0f27 }
        r8 = r1.zza(r4, r11);	 Catch:{ all -> 0x0f27 }
        if (r8 == 0) goto L_0x0764;
    L_0x075e:
        r8 = r32;
        r3.zza(r8, r4);	 Catch:{ all -> 0x0f27 }
        goto L_0x070d;
    L_0x0764:
        r8 = r32;
        r19 = r11;
        r6 = r25;
        goto L_0x0772;
    L_0x076b:
        r8 = r32;
        goto L_0x0772;
    L_0x076e:
        r8 = r32;
        r6 = r33;
    L_0x0772:
        if (r31 != 0) goto L_0x07d2;
    L_0x0774:
        r4 = r11.getName();	 Catch:{ all -> 0x0f27 }
        r4 = r9.equals(r4);	 Catch:{ all -> 0x0f27 }
        if (r4 == 0) goto L_0x07d2;
    L_0x077e:
        r4 = r11.zzmk();	 Catch:{ all -> 0x0f27 }
        if (r4 != 0) goto L_0x079e;
    L_0x0784:
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzab();	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzgn();	 Catch:{ all -> 0x0f27 }
        r7 = "Engagement event does not contain any parameters. appId";
        r9 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r9 = r9.zzag();	 Catch:{ all -> 0x0f27 }
        r9 = com.google.android.gms.measurement.internal.zzef.zzam(r9);	 Catch:{ all -> 0x0f27 }
        r4.zza(r7, r9);	 Catch:{ all -> 0x0f27 }
        goto L_0x07d2;
    L_0x079e:
        r62.zzgw();	 Catch:{ all -> 0x0f27 }
        r4 = r11.zzug();	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzey) r4;	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzbs.zzc) r4;	 Catch:{ all -> 0x0f27 }
        r4 = com.google.android.gms.measurement.internal.zzjo.zzb(r4, r7);	 Catch:{ all -> 0x0f27 }
        r4 = (java.lang.Long) r4;	 Catch:{ all -> 0x0f27 }
        if (r4 != 0) goto L_0x07cb;
    L_0x07b1:
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzab();	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzgn();	 Catch:{ all -> 0x0f27 }
        r7 = "Engagement event does not include duration. appId";
        r9 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r9 = r9.zzag();	 Catch:{ all -> 0x0f27 }
        r9 = com.google.android.gms.measurement.internal.zzef.zzam(r9);	 Catch:{ all -> 0x0f27 }
        r4.zza(r7, r9);	 Catch:{ all -> 0x0f27 }
        goto L_0x07d2;
    L_0x07cb:
        r12 = r4.longValue();	 Catch:{ all -> 0x0f27 }
        r12 = r26 + r12;
        goto L_0x07d4;
    L_0x07d2:
        r12 = r26;
    L_0x07d4:
        r4 = r2.zztp;	 Catch:{ all -> 0x0f27 }
        r7 = r11.zzug();	 Catch:{ all -> 0x0f27 }
        r7 = (com.google.android.gms.internal.measurement.zzey) r7;	 Catch:{ all -> 0x0f27 }
        r7 = (com.google.android.gms.internal.measurement.zzbs.zzc) r7;	 Catch:{ all -> 0x0f27 }
        r9 = r30;
        r4.set(r9, r7);	 Catch:{ all -> 0x0f27 }
        r15 = r25 + 1;
        r3.zza(r11);	 Catch:{ all -> 0x0f27 }
        r13 = r12;
        r12 = r21;
    L_0x07eb:
        r7 = r9 + 1;
        r9 = r6;
        r4 = r31;
        goto L_0x02d0;
    L_0x07f2:
        r31 = r4;
        r7 = r5;
        r9 = r6;
        r25 = r15;
        if (r31 == 0) goto L_0x084f;
    L_0x07fa:
        r5 = r25;
        r13 = r26;
        r4 = 0;
    L_0x07ff:
        if (r4 >= r5) goto L_0x0851;
    L_0x0801:
        r6 = r3.zzq(r4);	 Catch:{ all -> 0x0f27 }
        r8 = r6.getName();	 Catch:{ all -> 0x0f27 }
        r8 = r9.equals(r8);	 Catch:{ all -> 0x0f27 }
        if (r8 == 0) goto L_0x0822;
    L_0x080f:
        r62.zzgw();	 Catch:{ all -> 0x0f27 }
        r8 = "_fr";
        r8 = com.google.android.gms.measurement.internal.zzjo.zza(r6, r8);	 Catch:{ all -> 0x0f27 }
        if (r8 == 0) goto L_0x0822;
    L_0x081a:
        r3.zzr(r4);	 Catch:{ all -> 0x0f27 }
        r5 = r5 + -1;
        r4 = r4 + -1;
        goto L_0x084c;
    L_0x0822:
        r62.zzgw();	 Catch:{ all -> 0x0f27 }
        r6 = com.google.android.gms.measurement.internal.zzjo.zza(r6, r7);	 Catch:{ all -> 0x0f27 }
        if (r6 == 0) goto L_0x084c;
    L_0x082b:
        r8 = r6.zzna();	 Catch:{ all -> 0x0f27 }
        if (r8 == 0) goto L_0x083a;
    L_0x0831:
        r10 = r6.zznb();	 Catch:{ all -> 0x0f27 }
        r6 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x0f27 }
        goto L_0x083b;
    L_0x083a:
        r6 = 0;
    L_0x083b:
        if (r6 == 0) goto L_0x084c;
    L_0x083d:
        r10 = r6.longValue();	 Catch:{ all -> 0x0f27 }
        r18 = 0;
        r8 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1));
        if (r8 <= 0) goto L_0x084c;
    L_0x0847:
        r10 = r6.longValue();	 Catch:{ all -> 0x0f27 }
        r13 = r13 + r10;
    L_0x084c:
        r6 = 1;
        r4 = r4 + r6;
        goto L_0x07ff;
    L_0x084f:
        r13 = r26;
    L_0x0851:
        r4 = 0;
        r1.zza(r3, r13, r4);	 Catch:{ all -> 0x0f27 }
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzad();	 Catch:{ all -> 0x0f27 }
        r5 = r3.zzag();	 Catch:{ all -> 0x0f27 }
        r6 = com.google.android.gms.measurement.internal.zzak.zzja;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zze(r5, r6);	 Catch:{ all -> 0x0f27 }
        if (r4 == 0) goto L_0x089e;
    L_0x0867:
        r4 = r3.zznl();	 Catch:{ all -> 0x0f27 }
        r4 = r4.iterator();	 Catch:{ all -> 0x0f27 }
    L_0x086f:
        r5 = r4.hasNext();	 Catch:{ all -> 0x0f27 }
        if (r5 == 0) goto L_0x0889;
    L_0x0875:
        r5 = r4.next();	 Catch:{ all -> 0x0f27 }
        r5 = (com.google.android.gms.internal.measurement.zzbs.zzc) r5;	 Catch:{ all -> 0x0f27 }
        r6 = "_s";
        r5 = r5.getName();	 Catch:{ all -> 0x0f27 }
        r5 = r6.equals(r5);	 Catch:{ all -> 0x0f27 }
        if (r5 == 0) goto L_0x086f;
    L_0x0887:
        r4 = 1;
        goto L_0x088a;
    L_0x0889:
        r4 = 0;
    L_0x088a:
        if (r4 == 0) goto L_0x0899;
    L_0x088c:
        r4 = r62.zzgy();	 Catch:{ all -> 0x0f27 }
        r5 = r3.zzag();	 Catch:{ all -> 0x0f27 }
        r6 = "_se";
        r4.zzd(r5, r6);	 Catch:{ all -> 0x0f27 }
    L_0x0899:
        r4 = 1;
        r1.zza(r3, r13, r4);	 Catch:{ all -> 0x0f27 }
        goto L_0x08bd;
    L_0x089e:
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzad();	 Catch:{ all -> 0x0f27 }
        r5 = r3.zzag();	 Catch:{ all -> 0x0f27 }
        r6 = com.google.android.gms.measurement.internal.zzak.zzjb;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zze(r5, r6);	 Catch:{ all -> 0x0f27 }
        if (r4 == 0) goto L_0x08bd;
    L_0x08b0:
        r4 = r62.zzgy();	 Catch:{ all -> 0x0f27 }
        r5 = r3.zzag();	 Catch:{ all -> 0x0f27 }
        r6 = "_se";
        r4.zzd(r5, r6);	 Catch:{ all -> 0x0f27 }
    L_0x08bd:
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzad();	 Catch:{ all -> 0x0f27 }
        r5 = r3.zzag();	 Catch:{ all -> 0x0f27 }
        r6 = com.google.android.gms.measurement.internal.zzak.zzij;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zze(r5, r6);	 Catch:{ all -> 0x0f27 }
        if (r4 == 0) goto L_0x0962;
    L_0x08cf:
        r4 = r62.zzgw();	 Catch:{ all -> 0x0f27 }
        r5 = r4.zzab();	 Catch:{ all -> 0x0f27 }
        r5 = r5.zzgs();	 Catch:{ all -> 0x0f27 }
        r6 = "Checking account type status for ad personalization signals";
        r5.zzao(r6);	 Catch:{ all -> 0x0f27 }
        r5 = r4.zzgz();	 Catch:{ all -> 0x0f27 }
        r6 = r3.zzag();	 Catch:{ all -> 0x0f27 }
        r5 = r5.zzba(r6);	 Catch:{ all -> 0x0f27 }
        if (r5 == 0) goto L_0x0962;
    L_0x08ee:
        r5 = r4.zzgy();	 Catch:{ all -> 0x0f27 }
        r6 = r3.zzag();	 Catch:{ all -> 0x0f27 }
        r5 = r5.zzab(r6);	 Catch:{ all -> 0x0f27 }
        if (r5 == 0) goto L_0x0962;
    L_0x08fc:
        r5 = r5.zzbe();	 Catch:{ all -> 0x0f27 }
        if (r5 == 0) goto L_0x0962;
    L_0x0902:
        r5 = r4.zzw();	 Catch:{ all -> 0x0f27 }
        r5 = r5.zzcu();	 Catch:{ all -> 0x0f27 }
        if (r5 == 0) goto L_0x0962;
    L_0x090c:
        r5 = r4.zzab();	 Catch:{ all -> 0x0f27 }
        r5 = r5.zzgr();	 Catch:{ all -> 0x0f27 }
        r6 = "Turning off ad personalization due to account type";
        r5.zzao(r6);	 Catch:{ all -> 0x0f27 }
        r5 = com.google.android.gms.internal.measurement.zzbs.zzk.zzqu();	 Catch:{ all -> 0x0f27 }
        r6 = "_npa";
        r5 = r5.zzdb(r6);	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzw();	 Catch:{ all -> 0x0f27 }
        r6 = r4.zzcs();	 Catch:{ all -> 0x0f27 }
        r4 = r5.zzbk(r6);	 Catch:{ all -> 0x0f27 }
        r5 = 1;
        r4 = r4.zzbl(r5);	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzug();	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzey) r4;	 Catch:{ all -> 0x0f27 }
        r4 = (com.google.android.gms.internal.measurement.zzbs.zzk) r4;	 Catch:{ all -> 0x0f27 }
        r5 = 0;
    L_0x093e:
        r6 = r3.zznp();	 Catch:{ all -> 0x0f27 }
        if (r5 >= r6) goto L_0x095c;
    L_0x0944:
        r6 = "_npa";
        r7 = r3.zzs(r5);	 Catch:{ all -> 0x0f27 }
        r7 = r7.getName();	 Catch:{ all -> 0x0f27 }
        r6 = r6.equals(r7);	 Catch:{ all -> 0x0f27 }
        if (r6 == 0) goto L_0x0959;
    L_0x0954:
        r3.zza(r5, r4);	 Catch:{ all -> 0x0f27 }
        r5 = 1;
        goto L_0x095d;
    L_0x0959:
        r5 = r5 + 1;
        goto L_0x093e;
    L_0x095c:
        r5 = 0;
    L_0x095d:
        if (r5 != 0) goto L_0x0962;
    L_0x095f:
        r3.zza(r4);	 Catch:{ all -> 0x0f27 }
    L_0x0962:
        r4 = r3.zznv();	 Catch:{ all -> 0x0f27 }
        r5 = r3.zzag();	 Catch:{ all -> 0x0f27 }
        r6 = r3.zzno();	 Catch:{ all -> 0x0f27 }
        r7 = r3.zznl();	 Catch:{ all -> 0x0f27 }
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5);	 Catch:{ all -> 0x0f27 }
        r8 = r62.zzgx();	 Catch:{ all -> 0x0f27 }
        r5 = r8.zza(r5, r7, r6);	 Catch:{ all -> 0x0f27 }
        r4.zzc(r5);	 Catch:{ all -> 0x0f27 }
        r4 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzad();	 Catch:{ all -> 0x0f27 }
        r5 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r5 = r5.zzag();	 Catch:{ all -> 0x0f27 }
        r4 = r4.zzm(r5);	 Catch:{ all -> 0x0f27 }
        if (r4 == 0) goto L_0x0d31;
    L_0x0992:
        r4 = new java.util.HashMap;	 Catch:{ all -> 0x0f05 }
        r4.<init>();	 Catch:{ all -> 0x0f05 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0f05 }
        r5.<init>();	 Catch:{ all -> 0x0f05 }
        r6 = r1.zzj;	 Catch:{ all -> 0x0f05 }
        r6 = r6.zzz();	 Catch:{ all -> 0x0f05 }
        r6 = r6.zzjw();	 Catch:{ all -> 0x0f05 }
        r7 = 0;
    L_0x09a7:
        r8 = r3.zznm();	 Catch:{ all -> 0x0f05 }
        if (r7 >= r8) goto L_0x0cfc;
    L_0x09ad:
        r8 = r3.zzq(r7);	 Catch:{ all -> 0x0f05 }
        r8 = r8.zzuj();	 Catch:{ all -> 0x0f05 }
        r8 = (com.google.android.gms.internal.measurement.zzey.zza) r8;	 Catch:{ all -> 0x0f05 }
        r8 = (com.google.android.gms.internal.measurement.zzbs.zzc.zza) r8;	 Catch:{ all -> 0x0f05 }
        r9 = r8.getName();	 Catch:{ all -> 0x0f05 }
        r10 = "_ep";
        r9 = r9.equals(r10);	 Catch:{ all -> 0x0f05 }
        r10 = "_sr";
        if (r9 == 0) goto L_0x0a3c;
    L_0x09c7:
        r62.zzgw();	 Catch:{ all -> 0x0f27 }
        r9 = r8.zzug();	 Catch:{ all -> 0x0f27 }
        r9 = (com.google.android.gms.internal.measurement.zzey) r9;	 Catch:{ all -> 0x0f27 }
        r9 = (com.google.android.gms.internal.measurement.zzbs.zzc) r9;	 Catch:{ all -> 0x0f27 }
        r11 = "_en";
        r9 = com.google.android.gms.measurement.internal.zzjo.zzb(r9, r11);	 Catch:{ all -> 0x0f27 }
        r9 = (java.lang.String) r9;	 Catch:{ all -> 0x0f27 }
        r11 = r4.get(r9);	 Catch:{ all -> 0x0f27 }
        r11 = (com.google.android.gms.measurement.internal.zzae) r11;	 Catch:{ all -> 0x0f27 }
        if (r11 != 0) goto L_0x09f3;
    L_0x09e2:
        r11 = r62.zzgy();	 Catch:{ all -> 0x0f27 }
        r12 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r12 = r12.zzag();	 Catch:{ all -> 0x0f27 }
        r11 = r11.zzc(r12, r9);	 Catch:{ all -> 0x0f27 }
        r4.put(r9, r11);	 Catch:{ all -> 0x0f27 }
    L_0x09f3:
        r9 = r11.zzfm;	 Catch:{ all -> 0x0f27 }
        if (r9 != 0) goto L_0x0a30;
    L_0x09f7:
        r9 = r11.zzfn;	 Catch:{ all -> 0x0f27 }
        r12 = r9.longValue();	 Catch:{ all -> 0x0f27 }
        r14 = 1;
        r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r9 <= 0) goto L_0x0a0b;
    L_0x0a03:
        r62.zzgw();	 Catch:{ all -> 0x0f27 }
        r9 = r11.zzfn;	 Catch:{ all -> 0x0f27 }
        com.google.android.gms.measurement.internal.zzjo.zza(r8, r10, r9);	 Catch:{ all -> 0x0f27 }
    L_0x0a0b:
        r9 = r11.zzfo;	 Catch:{ all -> 0x0f27 }
        if (r9 == 0) goto L_0x0a25;
    L_0x0a0f:
        r9 = r11.zzfo;	 Catch:{ all -> 0x0f27 }
        r9 = r9.booleanValue();	 Catch:{ all -> 0x0f27 }
        if (r9 == 0) goto L_0x0a25;
    L_0x0a17:
        r62.zzgw();	 Catch:{ all -> 0x0f27 }
        r9 = "_efs";
        r10 = 1;
        r12 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x0f27 }
        com.google.android.gms.measurement.internal.zzjo.zza(r8, r9, r12);	 Catch:{ all -> 0x0f27 }
    L_0x0a25:
        r9 = r8.zzug();	 Catch:{ all -> 0x0f27 }
        r9 = (com.google.android.gms.internal.measurement.zzey) r9;	 Catch:{ all -> 0x0f27 }
        r9 = (com.google.android.gms.internal.measurement.zzbs.zzc) r9;	 Catch:{ all -> 0x0f27 }
        r5.add(r9);	 Catch:{ all -> 0x0f27 }
    L_0x0a30:
        r3.zza(r7, r8);	 Catch:{ all -> 0x0f27 }
    L_0x0a33:
        r1 = r3;
        r63 = r6;
        r3 = r2;
        r2 = r7;
        r6 = 1;
        goto L_0x0cf1;
    L_0x0a3c:
        r9 = r62.zzgz();	 Catch:{ all -> 0x0f05 }
        r11 = r2.zztn;	 Catch:{ all -> 0x0f05 }
        r11 = r11.zzag();	 Catch:{ all -> 0x0f05 }
        r11 = r9.zzbb(r11);	 Catch:{ all -> 0x0f05 }
        r9 = r1.zzj;	 Catch:{ all -> 0x0f05 }
        r9.zzz();	 Catch:{ all -> 0x0f05 }
        r13 = r8.getTimestampMillis();	 Catch:{ all -> 0x0f05 }
        r13 = com.google.android.gms.measurement.internal.zzjs.zzc(r13, r11);	 Catch:{ all -> 0x0f05 }
        r9 = r8.zzug();	 Catch:{ all -> 0x0f05 }
        r9 = (com.google.android.gms.internal.measurement.zzey) r9;	 Catch:{ all -> 0x0f05 }
        r9 = (com.google.android.gms.internal.measurement.zzbs.zzc) r9;	 Catch:{ all -> 0x0f05 }
        r15 = "_dbg";
        r26 = r11;
        r18 = 1;
        r11 = java.lang.Long.valueOf(r18);	 Catch:{ all -> 0x0f05 }
        r12 = android.text.TextUtils.isEmpty(r15);	 Catch:{ all -> 0x0f05 }
        if (r12 != 0) goto L_0x0ac9;
    L_0x0a6f:
        if (r11 != 0) goto L_0x0a72;
    L_0x0a71:
        goto L_0x0ac9;
    L_0x0a72:
        r9 = r9.zzmj();	 Catch:{ all -> 0x0f27 }
        r9 = r9.iterator();	 Catch:{ all -> 0x0f27 }
    L_0x0a7a:
        r12 = r9.hasNext();	 Catch:{ all -> 0x0f27 }
        if (r12 == 0) goto L_0x0ac9;
    L_0x0a80:
        r12 = r9.next();	 Catch:{ all -> 0x0f27 }
        r12 = (com.google.android.gms.internal.measurement.zzbs.zze) r12;	 Catch:{ all -> 0x0f27 }
        r63 = r9;
        r9 = r12.getName();	 Catch:{ all -> 0x0f27 }
        r9 = r15.equals(r9);	 Catch:{ all -> 0x0f27 }
        if (r9 == 0) goto L_0x0ac6;
    L_0x0a92:
        r9 = r11 instanceof java.lang.Long;	 Catch:{ all -> 0x0f27 }
        if (r9 == 0) goto L_0x0aa4;
    L_0x0a96:
        r18 = r12.zznb();	 Catch:{ all -> 0x0f27 }
        r9 = java.lang.Long.valueOf(r18);	 Catch:{ all -> 0x0f27 }
        r9 = r11.equals(r9);	 Catch:{ all -> 0x0f27 }
        if (r9 != 0) goto L_0x0ac4;
    L_0x0aa4:
        r9 = r11 instanceof java.lang.String;	 Catch:{ all -> 0x0f27 }
        if (r9 == 0) goto L_0x0ab2;
    L_0x0aa8:
        r9 = r12.zzmy();	 Catch:{ all -> 0x0f27 }
        r9 = r11.equals(r9);	 Catch:{ all -> 0x0f27 }
        if (r9 != 0) goto L_0x0ac4;
    L_0x0ab2:
        r9 = r11 instanceof java.lang.Double;	 Catch:{ all -> 0x0f27 }
        if (r9 == 0) goto L_0x0ac9;
    L_0x0ab6:
        r18 = r12.zzne();	 Catch:{ all -> 0x0f27 }
        r9 = java.lang.Double.valueOf(r18);	 Catch:{ all -> 0x0f27 }
        r9 = r11.equals(r9);	 Catch:{ all -> 0x0f27 }
        if (r9 == 0) goto L_0x0ac9;
    L_0x0ac4:
        r9 = 1;
        goto L_0x0aca;
    L_0x0ac6:
        r9 = r63;
        goto L_0x0a7a;
    L_0x0ac9:
        r9 = 0;
    L_0x0aca:
        if (r9 != 0) goto L_0x0adf;
    L_0x0acc:
        r9 = r62.zzgz();	 Catch:{ all -> 0x0f27 }
        r11 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r11 = r11.zzag();	 Catch:{ all -> 0x0f27 }
        r12 = r8.getName();	 Catch:{ all -> 0x0f27 }
        r12 = r9.zzm(r11, r12);	 Catch:{ all -> 0x0f27 }
        goto L_0x0ae0;
    L_0x0adf:
        r12 = 1;
    L_0x0ae0:
        if (r12 > 0) goto L_0x0b09;
    L_0x0ae2:
        r9 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r9 = r9.zzab();	 Catch:{ all -> 0x0f27 }
        r9 = r9.zzgn();	 Catch:{ all -> 0x0f27 }
        r10 = "Sample rate must be positive. event, rate";
        r11 = r8.getName();	 Catch:{ all -> 0x0f27 }
        r12 = java.lang.Integer.valueOf(r12);	 Catch:{ all -> 0x0f27 }
        r9.zza(r10, r11, r12);	 Catch:{ all -> 0x0f27 }
        r9 = r8.zzug();	 Catch:{ all -> 0x0f27 }
        r9 = (com.google.android.gms.internal.measurement.zzey) r9;	 Catch:{ all -> 0x0f27 }
        r9 = (com.google.android.gms.internal.measurement.zzbs.zzc) r9;	 Catch:{ all -> 0x0f27 }
        r5.add(r9);	 Catch:{ all -> 0x0f27 }
        r3.zza(r7, r8);	 Catch:{ all -> 0x0f27 }
        goto L_0x0a33;
    L_0x0b09:
        r9 = r8.getName();	 Catch:{ all -> 0x0f05 }
        r9 = r4.get(r9);	 Catch:{ all -> 0x0f05 }
        r9 = (com.google.android.gms.measurement.internal.zzae) r9;	 Catch:{ all -> 0x0f05 }
        if (r9 != 0) goto L_0x0ba2;
    L_0x0b15:
        r9 = r62.zzgy();	 Catch:{ all -> 0x0f27 }
        r11 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r11 = r11.zzag();	 Catch:{ all -> 0x0f27 }
        r15 = r8.getName();	 Catch:{ all -> 0x0f27 }
        r9 = r9.zzc(r11, r15);	 Catch:{ all -> 0x0f27 }
        if (r9 != 0) goto L_0x0ba2;
    L_0x0b29:
        r9 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r9 = r9.zzab();	 Catch:{ all -> 0x0f27 }
        r9 = r9.zzgn();	 Catch:{ all -> 0x0f27 }
        r11 = "Event being bundled has no eventAggregate. appId, eventName";
        r15 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r15 = r15.zzag();	 Catch:{ all -> 0x0f27 }
        r18 = r13;
        r13 = r8.getName();	 Catch:{ all -> 0x0f27 }
        r9.zza(r11, r15, r13);	 Catch:{ all -> 0x0f27 }
        r9 = r1.zzj;	 Catch:{ all -> 0x0f27 }
        r9 = r9.zzad();	 Catch:{ all -> 0x0f27 }
        r11 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r11 = r11.zzag();	 Catch:{ all -> 0x0f27 }
        r13 = com.google.android.gms.measurement.internal.zzak.zziz;	 Catch:{ all -> 0x0f27 }
        r9 = r9.zze(r11, r13);	 Catch:{ all -> 0x0f27 }
        if (r9 == 0) goto L_0x0b7e;
    L_0x0b58:
        r9 = new com.google.android.gms.measurement.internal.zzae;	 Catch:{ all -> 0x0f27 }
        r11 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r31 = r11.zzag();	 Catch:{ all -> 0x0f27 }
        r32 = r8.getName();	 Catch:{ all -> 0x0f27 }
        r33 = 1;
        r35 = 1;
        r37 = 1;
        r39 = r8.getTimestampMillis();	 Catch:{ all -> 0x0f27 }
        r41 = 0;
        r43 = 0;
        r44 = 0;
        r45 = 0;
        r46 = 0;
        r30 = r9;
        r30.<init>(r31, r32, r33, r35, r37, r39, r41, r43, r44, r45, r46);	 Catch:{ all -> 0x0f27 }
        goto L_0x0ba4;
    L_0x0b7e:
        r9 = new com.google.android.gms.measurement.internal.zzae;	 Catch:{ all -> 0x0f27 }
        r11 = r2.zztn;	 Catch:{ all -> 0x0f27 }
        r48 = r11.zzag();	 Catch:{ all -> 0x0f27 }
        r49 = r8.getName();	 Catch:{ all -> 0x0f27 }
        r50 = 1;
        r52 = 1;
        r54 = r8.getTimestampMillis();	 Catch:{ all -> 0x0f27 }
        r56 = 0;
        r58 = 0;
        r59 = 0;
        r60 = 0;
        r61 = 0;
        r47 = r9;
        r47.<init>(r48, r49, r50, r52, r54, r56, r58, r59, r60, r61);	 Catch:{ all -> 0x0f27 }
        goto L_0x0ba4;
    L_0x0ba2:
        r18 = r13;
    L_0x0ba4:
        r62.zzgw();	 Catch:{ all -> 0x0f05 }
        r11 = r8.zzug();	 Catch:{ all -> 0x0f05 }
        r11 = (com.google.android.gms.internal.measurement.zzey) r11;	 Catch:{ all -> 0x0f05 }
        r11 = (com.google.android.gms.internal.measurement.zzbs.zzc) r11;	 Catch:{ all -> 0x0f05 }
        r13 = "_eid";
        r11 = com.google.android.gms.measurement.internal.zzjo.zzb(r11, r13);	 Catch:{ all -> 0x0f05 }
        r11 = (java.lang.Long) r11;	 Catch:{ all -> 0x0f05 }
        if (r11 == 0) goto L_0x0bbb;
    L_0x0bb9:
        r13 = 1;
        goto L_0x0bbc;
    L_0x0bbb:
        r13 = 0;
    L_0x0bbc:
        r13 = java.lang.Boolean.valueOf(r13);	 Catch:{ all -> 0x0f05 }
        r14 = 1;
        if (r12 != r14) goto L_0x0bf1;
    L_0x0bc3:
        r10 = r8.zzug();	 Catch:{ all -> 0x0f27 }
        r10 = (com.google.android.gms.internal.measurement.zzey) r10;	 Catch:{ all -> 0x0f27 }
        r10 = (com.google.android.gms.internal.measurement.zzbs.zzc) r10;	 Catch:{ all -> 0x0f27 }
        r5.add(r10);	 Catch:{ all -> 0x0f27 }
        r10 = r13.booleanValue();	 Catch:{ all -> 0x0f27 }
        if (r10 == 0) goto L_0x0bec;
    L_0x0bd4:
        r10 = r9.zzfm;	 Catch:{ all -> 0x0f27 }
        if (r10 != 0) goto L_0x0be0;
    L_0x0bd8:
        r10 = r9.zzfn;	 Catch:{ all -> 0x0f27 }
        if (r10 != 0) goto L_0x0be0;
    L_0x0bdc:
        r10 = r9.zzfo;	 Catch:{ all -> 0x0f27 }
        if (r10 == 0) goto L_0x0bec;
    L_0x0be0:
        r10 = 0;
        r9 = r9.zza(r10, r10, r10);	 Catch:{ all -> 0x0f27 }
        r10 = r8.getName();	 Catch:{ all -> 0x0f27 }
        r4.put(r10, r9);	 Catch:{ all -> 0x0f27 }
    L_0x0bec:
        r3.zza(r7, r8);	 Catch:{ all -> 0x0f27 }
        goto L_0x0a33;
    L_0x0bf1:
        r14 = r6.nextInt(r12);	 Catch:{ all -> 0x0f05 }
        if (r14 != 0) goto L_0x0c36;
    L_0x0bf7:
        r62.zzgw();	 Catch:{ all -> 0x0f27 }
        r11 = (long) r12;	 Catch:{ all -> 0x0f27 }
        r14 = java.lang.Long.valueOf(r11);	 Catch:{ all -> 0x0f27 }
        com.google.android.gms.measurement.internal.zzjo.zza(r8, r10, r14);	 Catch:{ all -> 0x0f27 }
        r10 = r8.zzug();	 Catch:{ all -> 0x0f27 }
        r10 = (com.google.android.gms.internal.measurement.zzey) r10;	 Catch:{ all -> 0x0f27 }
        r10 = (com.google.android.gms.internal.measurement.zzbs.zzc) r10;	 Catch:{ all -> 0x0f27 }
        r5.add(r10);	 Catch:{ all -> 0x0f27 }
        r10 = r13.booleanValue();	 Catch:{ all -> 0x0f27 }
        if (r10 == 0) goto L_0x0c1c;
    L_0x0c13:
        r10 = java.lang.Long.valueOf(r11);	 Catch:{ all -> 0x0f27 }
        r11 = 0;
        r9 = r9.zza(r11, r10, r11);	 Catch:{ all -> 0x0f27 }
    L_0x0c1c:
        r10 = r8.getName();	 Catch:{ all -> 0x0f27 }
        r11 = r8.getTimestampMillis();	 Catch:{ all -> 0x0f27 }
        r14 = r18;
        r9 = r9.zza(r11, r14);	 Catch:{ all -> 0x0f27 }
        r4.put(r10, r9);	 Catch:{ all -> 0x0f27 }
        r1 = r3;
        r63 = r6;
        r3 = r2;
        r2 = r7;
        r6 = 1;
        goto L_0x0cee;
    L_0x0c36:
        r63 = r6;
        r14 = r18;
        r6 = r1.zzj;	 Catch:{ all -> 0x0f05 }
        r6 = r6.zzad();	 Catch:{ all -> 0x0f05 }
        r18 = r3;
        r3 = r2.zztn;	 Catch:{ all -> 0x0f05 }
        r3 = r3.zzag();	 Catch:{ all -> 0x0f05 }
        r3 = r6.zzu(r3);	 Catch:{ all -> 0x0f05 }
        if (r3 == 0) goto L_0x0c76;
    L_0x0c4e:
        r3 = r9.zzfl;	 Catch:{ all -> 0x0f05 }
        if (r3 == 0) goto L_0x0c5c;
    L_0x0c52:
        r3 = r9.zzfl;	 Catch:{ all -> 0x0f27 }
        r26 = r3.longValue();	 Catch:{ all -> 0x0f27 }
        r3 = r2;
        r19 = r7;
        goto L_0x0c6e;
    L_0x0c5c:
        r3 = r1.zzj;	 Catch:{ all -> 0x0f05 }
        r3.zzz();	 Catch:{ all -> 0x0f05 }
        r3 = r2;
        r1 = r8.zzmm();	 Catch:{ all -> 0x0f05 }
        r19 = r7;
        r6 = r26;
        r26 = com.google.android.gms.measurement.internal.zzjs.zzc(r1, r6);	 Catch:{ all -> 0x0f05 }
    L_0x0c6e:
        r1 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1));
        if (r1 == 0) goto L_0x0c74;
    L_0x0c72:
        r1 = 1;
        goto L_0x0c8c;
    L_0x0c74:
        r1 = 0;
        goto L_0x0c8c;
    L_0x0c76:
        r3 = r2;
        r19 = r7;
        r1 = r9.zzfk;	 Catch:{ all -> 0x0f05 }
        r6 = r8.getTimestampMillis();	 Catch:{ all -> 0x0f05 }
        r6 = r6 - r1;
        r1 = java.lang.Math.abs(r6);	 Catch:{ all -> 0x0f05 }
        r6 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r23 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r23 < 0) goto L_0x0c74;
    L_0x0c8b:
        goto L_0x0c72;
    L_0x0c8c:
        if (r1 == 0) goto L_0x0cd6;
    L_0x0c8e:
        r62.zzgw();	 Catch:{ all -> 0x0f05 }
        r1 = "_efs";
        r6 = 1;
        r2 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0f05 }
        com.google.android.gms.measurement.internal.zzjo.zza(r8, r1, r2);	 Catch:{ all -> 0x0f05 }
        r62.zzgw();	 Catch:{ all -> 0x0f05 }
        r1 = (long) r12;	 Catch:{ all -> 0x0f05 }
        r11 = java.lang.Long.valueOf(r1);	 Catch:{ all -> 0x0f05 }
        com.google.android.gms.measurement.internal.zzjo.zza(r8, r10, r11);	 Catch:{ all -> 0x0f05 }
        r10 = r8.zzug();	 Catch:{ all -> 0x0f05 }
        r10 = (com.google.android.gms.internal.measurement.zzey) r10;	 Catch:{ all -> 0x0f05 }
        r10 = (com.google.android.gms.internal.measurement.zzbs.zzc) r10;	 Catch:{ all -> 0x0f05 }
        r5.add(r10);	 Catch:{ all -> 0x0f05 }
        r10 = r13.booleanValue();	 Catch:{ all -> 0x0f05 }
        if (r10 == 0) goto L_0x0cc6;
    L_0x0cb8:
        r1 = java.lang.Long.valueOf(r1);	 Catch:{ all -> 0x0f05 }
        r2 = 1;
        r10 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x0f05 }
        r2 = 0;
        r9 = r9.zza(r2, r1, r10);	 Catch:{ all -> 0x0f05 }
    L_0x0cc6:
        r1 = r8.getName();	 Catch:{ all -> 0x0f05 }
        r10 = r8.getTimestampMillis();	 Catch:{ all -> 0x0f05 }
        r2 = r9.zza(r10, r14);	 Catch:{ all -> 0x0f05 }
        r4.put(r1, r2);	 Catch:{ all -> 0x0f05 }
        goto L_0x0cea;
    L_0x0cd6:
        r6 = 1;
        r1 = r13.booleanValue();	 Catch:{ all -> 0x0f05 }
        if (r1 == 0) goto L_0x0cea;
    L_0x0cde:
        r1 = r8.getName();	 Catch:{ all -> 0x0f05 }
        r2 = 0;
        r9 = r9.zza(r11, r2, r2);	 Catch:{ all -> 0x0f05 }
        r4.put(r1, r9);	 Catch:{ all -> 0x0f05 }
    L_0x0cea:
        r1 = r18;
        r2 = r19;
    L_0x0cee:
        r1.zza(r2, r8);	 Catch:{ all -> 0x0f05 }
    L_0x0cf1:
        r2 = r2 + 1;
        r6 = r63;
        r7 = r2;
        r2 = r3;
        r3 = r1;
        r1 = r62;
        goto L_0x09a7;
    L_0x0cfc:
        r1 = r3;
        r3 = r2;
        r2 = r5.size();	 Catch:{ all -> 0x0f05 }
        r6 = r1.zznm();	 Catch:{ all -> 0x0f05 }
        if (r2 >= r6) goto L_0x0d0f;
    L_0x0d08:
        r2 = r1.zznn();	 Catch:{ all -> 0x0f05 }
        r2.zza(r5);	 Catch:{ all -> 0x0f05 }
    L_0x0d0f:
        r2 = r4.entrySet();	 Catch:{ all -> 0x0f05 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0f05 }
    L_0x0d17:
        r4 = r2.hasNext();	 Catch:{ all -> 0x0f05 }
        if (r4 == 0) goto L_0x0d33;
    L_0x0d1d:
        r4 = r2.next();	 Catch:{ all -> 0x0f05 }
        r4 = (java.util.Map.Entry) r4;	 Catch:{ all -> 0x0f05 }
        r5 = r62.zzgy();	 Catch:{ all -> 0x0f05 }
        r4 = r4.getValue();	 Catch:{ all -> 0x0f05 }
        r4 = (com.google.android.gms.measurement.internal.zzae) r4;	 Catch:{ all -> 0x0f05 }
        r5.zza(r4);	 Catch:{ all -> 0x0f05 }
        goto L_0x0d17;
    L_0x0d31:
        r1 = r3;
        r3 = r2;
    L_0x0d33:
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r2 = r1.zzao(r4);	 Catch:{ all -> 0x0f05 }
        r4 = -9223372036854775808;
        r2.zzap(r4);	 Catch:{ all -> 0x0f05 }
        r2 = 0;
    L_0x0d42:
        r4 = r1.zznm();	 Catch:{ all -> 0x0f05 }
        if (r2 >= r4) goto L_0x0d75;
    L_0x0d48:
        r4 = r1.zzq(r2);	 Catch:{ all -> 0x0f05 }
        r5 = r4.getTimestampMillis();	 Catch:{ all -> 0x0f05 }
        r7 = r1.zznq();	 Catch:{ all -> 0x0f05 }
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 >= 0) goto L_0x0d5f;
    L_0x0d58:
        r5 = r4.getTimestampMillis();	 Catch:{ all -> 0x0f05 }
        r1.zzao(r5);	 Catch:{ all -> 0x0f05 }
    L_0x0d5f:
        r5 = r4.getTimestampMillis();	 Catch:{ all -> 0x0f05 }
        r7 = r1.zznr();	 Catch:{ all -> 0x0f05 }
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 <= 0) goto L_0x0d72;
    L_0x0d6b:
        r4 = r4.getTimestampMillis();	 Catch:{ all -> 0x0f05 }
        r1.zzap(r4);	 Catch:{ all -> 0x0f05 }
    L_0x0d72:
        r2 = r2 + 1;
        goto L_0x0d42;
    L_0x0d75:
        r2 = r3.zztn;	 Catch:{ all -> 0x0f05 }
        r2 = r2.zzag();	 Catch:{ all -> 0x0f05 }
        r4 = r62.zzgy();	 Catch:{ all -> 0x0f05 }
        r4 = r4.zzab(r2);	 Catch:{ all -> 0x0f05 }
        if (r4 != 0) goto L_0x0da1;
    L_0x0d85:
        r6 = r62;
        r4 = r6.zzj;	 Catch:{ all -> 0x0f25 }
        r4 = r4.zzab();	 Catch:{ all -> 0x0f25 }
        r4 = r4.zzgk();	 Catch:{ all -> 0x0f25 }
        r5 = "Bundling raw events w/o app info. appId";
        r7 = r3.zztn;	 Catch:{ all -> 0x0f25 }
        r7 = r7.zzag();	 Catch:{ all -> 0x0f25 }
        r7 = com.google.android.gms.measurement.internal.zzef.zzam(r7);	 Catch:{ all -> 0x0f25 }
        r4.zza(r5, r7);	 Catch:{ all -> 0x0f25 }
        goto L_0x0dfe;
    L_0x0da1:
        r6 = r62;
        r5 = r1.zznm();	 Catch:{ all -> 0x0f25 }
        if (r5 <= 0) goto L_0x0dfe;
    L_0x0da9:
        r7 = r4.zzak();	 Catch:{ all -> 0x0f25 }
        r9 = 0;
        r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r5 == 0) goto L_0x0db7;
    L_0x0db3:
        r1.zzar(r7);	 Catch:{ all -> 0x0f25 }
        goto L_0x0dba;
    L_0x0db7:
        r1.zznt();	 Catch:{ all -> 0x0f25 }
    L_0x0dba:
        r9 = r4.zzaj();	 Catch:{ all -> 0x0f25 }
        r11 = 0;
        r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r5 != 0) goto L_0x0dc5;
    L_0x0dc4:
        goto L_0x0dc6;
    L_0x0dc5:
        r7 = r9;
    L_0x0dc6:
        r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
        if (r5 == 0) goto L_0x0dce;
    L_0x0dca:
        r1.zzaq(r7);	 Catch:{ all -> 0x0f25 }
        goto L_0x0dd1;
    L_0x0dce:
        r1.zzns();	 Catch:{ all -> 0x0f25 }
    L_0x0dd1:
        r4.zzau();	 Catch:{ all -> 0x0f25 }
        r7 = r4.zzar();	 Catch:{ all -> 0x0f25 }
        r5 = (int) r7;	 Catch:{ all -> 0x0f25 }
        r1.zzu(r5);	 Catch:{ all -> 0x0f25 }
        r7 = r1.zznq();	 Catch:{ all -> 0x0f25 }
        r4.zze(r7);	 Catch:{ all -> 0x0f25 }
        r7 = r1.zznr();	 Catch:{ all -> 0x0f25 }
        r4.zzf(r7);	 Catch:{ all -> 0x0f25 }
        r5 = r4.zzbc();	 Catch:{ all -> 0x0f25 }
        if (r5 == 0) goto L_0x0df4;
    L_0x0df0:
        r1.zzcl(r5);	 Catch:{ all -> 0x0f25 }
        goto L_0x0df7;
    L_0x0df4:
        r1.zznu();	 Catch:{ all -> 0x0f25 }
    L_0x0df7:
        r5 = r62.zzgy();	 Catch:{ all -> 0x0f25 }
        r5.zza(r4);	 Catch:{ all -> 0x0f25 }
    L_0x0dfe:
        r4 = r1.zznm();	 Catch:{ all -> 0x0f25 }
        if (r4 <= 0) goto L_0x0e64;
    L_0x0e04:
        r4 = r6.zzj;	 Catch:{ all -> 0x0f25 }
        r4.zzae();	 Catch:{ all -> 0x0f25 }
        r4 = r62.zzgz();	 Catch:{ all -> 0x0f25 }
        r5 = r3.zztn;	 Catch:{ all -> 0x0f25 }
        r5 = r5.zzag();	 Catch:{ all -> 0x0f25 }
        r4 = r4.zzaw(r5);	 Catch:{ all -> 0x0f25 }
        if (r4 == 0) goto L_0x0e28;
    L_0x0e19:
        r5 = r4.zzzk;	 Catch:{ all -> 0x0f25 }
        if (r5 != 0) goto L_0x0e1e;
    L_0x0e1d:
        goto L_0x0e28;
    L_0x0e1e:
        r4 = r4.zzzk;	 Catch:{ all -> 0x0f25 }
        r4 = r4.longValue();	 Catch:{ all -> 0x0f25 }
        r1.zzav(r4);	 Catch:{ all -> 0x0f25 }
        goto L_0x0e53;
    L_0x0e28:
        r4 = r3.zztn;	 Catch:{ all -> 0x0f25 }
        r4 = r4.getGmpAppId();	 Catch:{ all -> 0x0f25 }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0f25 }
        if (r4 == 0) goto L_0x0e3a;
    L_0x0e34:
        r4 = -1;
        r1.zzav(r4);	 Catch:{ all -> 0x0f25 }
        goto L_0x0e53;
    L_0x0e3a:
        r4 = r6.zzj;	 Catch:{ all -> 0x0f25 }
        r4 = r4.zzab();	 Catch:{ all -> 0x0f25 }
        r4 = r4.zzgn();	 Catch:{ all -> 0x0f25 }
        r5 = "Did not find measurement config or missing version info. appId";
        r7 = r3.zztn;	 Catch:{ all -> 0x0f25 }
        r7 = r7.zzag();	 Catch:{ all -> 0x0f25 }
        r7 = com.google.android.gms.measurement.internal.zzef.zzam(r7);	 Catch:{ all -> 0x0f25 }
        r4.zza(r5, r7);	 Catch:{ all -> 0x0f25 }
    L_0x0e53:
        r4 = r62.zzgy();	 Catch:{ all -> 0x0f25 }
        r1 = r1.zzug();	 Catch:{ all -> 0x0f25 }
        r1 = (com.google.android.gms.internal.measurement.zzey) r1;	 Catch:{ all -> 0x0f25 }
        r1 = (com.google.android.gms.internal.measurement.zzbs.zzg) r1;	 Catch:{ all -> 0x0f25 }
        r12 = r21;
        r4.zza(r1, r12);	 Catch:{ all -> 0x0f25 }
    L_0x0e64:
        r1 = r62.zzgy();	 Catch:{ all -> 0x0f25 }
        r3 = r3.zzto;	 Catch:{ all -> 0x0f25 }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);	 Catch:{ all -> 0x0f25 }
        r1.zzo();	 Catch:{ all -> 0x0f25 }
        r1.zzbi();	 Catch:{ all -> 0x0f25 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0f25 }
        r5 = "rowid in (";
        r4.<init>(r5);	 Catch:{ all -> 0x0f25 }
        r5 = 0;
    L_0x0e7b:
        r7 = r3.size();	 Catch:{ all -> 0x0f25 }
        if (r5 >= r7) goto L_0x0e98;
    L_0x0e81:
        if (r5 == 0) goto L_0x0e88;
    L_0x0e83:
        r7 = ",";
        r4.append(r7);	 Catch:{ all -> 0x0f25 }
    L_0x0e88:
        r7 = r3.get(r5);	 Catch:{ all -> 0x0f25 }
        r7 = (java.lang.Long) r7;	 Catch:{ all -> 0x0f25 }
        r7 = r7.longValue();	 Catch:{ all -> 0x0f25 }
        r4.append(r7);	 Catch:{ all -> 0x0f25 }
        r5 = r5 + 1;
        goto L_0x0e7b;
    L_0x0e98:
        r5 = ")";
        r4.append(r5);	 Catch:{ all -> 0x0f25 }
        r5 = r1.getWritableDatabase();	 Catch:{ all -> 0x0f25 }
        r7 = "raw_events";
        r4 = r4.toString();	 Catch:{ all -> 0x0f25 }
        r8 = 0;
        r4 = r5.delete(r7, r4, r8);	 Catch:{ all -> 0x0f25 }
        r5 = r3.size();	 Catch:{ all -> 0x0f25 }
        if (r4 == r5) goto L_0x0ecb;
    L_0x0eb2:
        r1 = r1.zzab();	 Catch:{ all -> 0x0f25 }
        r1 = r1.zzgk();	 Catch:{ all -> 0x0f25 }
        r5 = "Deleted fewer rows from raw events table than expected";
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0f25 }
        r3 = r3.size();	 Catch:{ all -> 0x0f25 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x0f25 }
        r1.zza(r5, r4, r3);	 Catch:{ all -> 0x0f25 }
    L_0x0ecb:
        r1 = r62.zzgy();	 Catch:{ all -> 0x0f25 }
        r3 = r1.getWritableDatabase();	 Catch:{ all -> 0x0f25 }
        r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)";
        r5 = 2;
        r5 = new java.lang.String[r5];	 Catch:{ SQLiteException -> 0x0ee2 }
        r7 = 0;
        r5[r7] = r2;	 Catch:{ SQLiteException -> 0x0ee2 }
        r7 = 1;
        r5[r7] = r2;	 Catch:{ SQLiteException -> 0x0ee2 }
        r3.execSQL(r4, r5);	 Catch:{ SQLiteException -> 0x0ee2 }
        goto L_0x0ef5;
    L_0x0ee2:
        r0 = move-exception;
        r3 = r0;
        r1 = r1.zzab();	 Catch:{ all -> 0x0f25 }
        r1 = r1.zzgk();	 Catch:{ all -> 0x0f25 }
        r4 = "Failed to remove unused event metadata. appId";
        r2 = com.google.android.gms.measurement.internal.zzef.zzam(r2);	 Catch:{ all -> 0x0f25 }
        r1.zza(r4, r2, r3);	 Catch:{ all -> 0x0f25 }
    L_0x0ef5:
        r1 = r62.zzgy();	 Catch:{ all -> 0x0f25 }
        r1.setTransactionSuccessful();	 Catch:{ all -> 0x0f25 }
        r1 = r62.zzgy();
        r1.endTransaction();
        r1 = 1;
        return r1;
    L_0x0f05:
        r0 = move-exception;
        r6 = r62;
        goto L_0x0f29;
    L_0x0f09:
        r6 = r1;
        r1 = r62.zzgy();	 Catch:{ all -> 0x0f25 }
        r1.setTransactionSuccessful();	 Catch:{ all -> 0x0f25 }
        r1 = r62.zzgy();
        r1.endTransaction();
        r1 = 0;
        return r1;
    L_0x0f1a:
        r0 = move-exception;
        r6 = r1;
        r1 = r0;
        r22 = r5;
    L_0x0f1f:
        if (r22 == 0) goto L_0x0f24;
    L_0x0f21:
        r22.close();	 Catch:{ all -> 0x0f25 }
    L_0x0f24:
        throw r1;	 Catch:{ all -> 0x0f25 }
    L_0x0f25:
        r0 = move-exception;
        goto L_0x0f29;
    L_0x0f27:
        r0 = move-exception;
        r6 = r1;
    L_0x0f29:
        r1 = r0;
        r2 = r62.zzgy();
        r2.endTransaction();
        goto L_0x0f33;
    L_0x0f32:
        throw r1;
    L_0x0f33:
        goto L_0x0f32;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjg.zzd(java.lang.String, long):boolean");
    }

    @VisibleForTesting
    private final void zza(com.google.android.gms.internal.measurement.zzbs.zzg.zza zza, long j, boolean z) {
        String str = z ? "_se" : "_lte";
        zzjp zze = zzgy().zze(zza.zzag(), str);
        if (zze == null || zze.value == null) {
            zze = new zzjp(zza.zzag(), "auto", str, this.zzj.zzx().currentTimeMillis(), Long.valueOf(j));
        } else {
            zze = new zzjp(zza.zzag(), "auto", str, this.zzj.zzx().currentTimeMillis(), Long.valueOf(((Long) zze.value).longValue() + j));
        }
        zzk zzk = (zzk) ((zzey) zzk.zzqu().zzdb(str).zzbk(this.zzj.zzx().currentTimeMillis()).zzbl(((Long) r8.value).longValue()).zzug());
        Object obj = null;
        for (int i = 0; i < zza.zznp(); i++) {
            if (str.equals(zza.zzs(i).getName())) {
                zza.zza(i, zzk);
                obj = 1;
                break;
            }
        }
        if (obj == null) {
            zza.zza(zzk);
        }
        if (j > 0) {
            zzgy().zza(r8);
            this.zzj.zzab().zzgr().zza("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", r8.value);
        }
    }

    private final boolean zza(com.google.android.gms.internal.measurement.zzbs.zzc.zza zza, com.google.android.gms.internal.measurement.zzbs.zzc.zza zza2) {
        Preconditions.checkArgument("_e".equals(zza.getName()));
        zzgw();
        zze zza3 = zzjo.zza((zzc) ((zzey) zza.zzug()), "_sc");
        String str = null;
        Object obj;
        if (zza3 == null) {
            obj = null;
        } else {
            obj = zza3.zzmy();
        }
        zzgw();
        zze zza4 = zzjo.zza((zzc) ((zzey) zza2.zzug()), "_pc");
        if (zza4 != null) {
            str = zza4.zzmy();
        }
        if (str == null || !str.equals(obj)) {
            return false;
        }
        zzgw();
        str = "_et";
        zza3 = zzjo.zza((zzc) ((zzey) zza.zzug()), str);
        if (zza3.zzna() && zza3.zznb() > 0) {
            long zznb = zza3.zznb();
            zzgw();
            zza3 = zzjo.zza((zzc) ((zzey) zza2.zzug()), str);
            if (zza3 != null && zza3.zznb() > 0) {
                zznb += zza3.zznb();
            }
            zzgw();
            zzjo.zza(zza2, str, Long.valueOf(zznb));
            zzgw();
            zzjo.zza(zza, "_fr", Long.valueOf(1));
        }
        return true;
    }

    @VisibleForTesting
    private static void zza(com.google.android.gms.internal.measurement.zzbs.zzc.zza zza, @NonNull String str) {
        List zzmj = zza.zzmj();
        for (int i = 0; i < zzmj.size(); i++) {
            if (str.equals(((zze) zzmj.get(i)).getName())) {
                zza.zzm(i);
                return;
            }
        }
    }

    @VisibleForTesting
    private static void zza(com.google.android.gms.internal.measurement.zzbs.zzc.zza zza, int i, String str) {
        List zzmj = zza.zzmj();
        int i2 = 0;
        while (true) {
            String str2 = "_err";
            if (i2 >= zzmj.size()) {
                zze zze = (zze) ((zzey) zze.zzng().zzbz("_ev").zzca(str).zzug());
                zza.zza((zze) ((zzey) zze.zzng().zzbz(str2).zzam(Long.valueOf((long) i).longValue()).zzug())).zza(zze);
                return;
            } else if (!str2.equals(((zze) zzmj.get(i2)).getName())) {
                i2++;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    @VisibleForTesting
    public final void zza(int i, Throwable th, byte[] bArr, String str) {
        zzo();
        zzjj();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zztd = false;
                zzjo();
            }
        }
        List<Long> list = this.zzth;
        this.zzth = null;
        int i2 = 1;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.zzj.zzac().zzlj.set(this.zzj.zzx().currentTimeMillis());
                this.zzj.zzac().zzlk.set(0);
                zzjn();
                this.zzj.zzab().zzgs().zza("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzgy().beginTransaction();
                try {
                    for (Long l : list) {
                        zzx zzgy;
                        try {
                            zzgy = zzgy();
                            long longValue = l.longValue();
                            zzgy.zzo();
                            zzgy.zzbi();
                            if (zzgy.getWritableDatabase().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            zzgy.zzab().zzgk().zza("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.zzti == null || !this.zzti.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    zzgy().setTransactionSuccessful();
                    this.zzti = null;
                    if (zzjf().zzgv() && zzjm()) {
                        zzjl();
                    } else {
                        this.zztj = -1;
                        zzjn();
                    }
                    this.zzsy = 0;
                } finally {
                    zzgy().endTransaction();
                }
            } catch (SQLiteException e3) {
                this.zzj.zzab().zzgk().zza("Database error while trying to delete uploaded bundles", e3);
                this.zzsy = this.zzj.zzx().elapsedRealtime();
                this.zzj.zzab().zzgs().zza("Disable upload, time", Long.valueOf(this.zzsy));
            }
        } else {
            this.zzj.zzab().zzgs().zza("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzj.zzac().zzlk.set(this.zzj.zzx().currentTimeMillis());
            if (i != 503) {
                if (i != 429) {
                    i2 = 0;
                }
            }
            if (i2 != 0) {
                this.zzj.zzac().zzll.set(this.zzj.zzx().currentTimeMillis());
            }
            zzgy().zzb(list);
            zzjn();
        }
        this.zztd = false;
        zzjo();
    }

    private final boolean zzjm() {
        zzo();
        zzjj();
        return zzgy().zzcd() || !TextUtils.isEmpty(zzgy().zzby());
    }

    @WorkerThread
    private final void zzb(zzf zzf) {
        zzo();
        if (!TextUtils.isEmpty(zzf.getGmpAppId()) || (zzs.zzbx() && !TextUtils.isEmpty(zzf.zzah()))) {
            zzs zzad = this.zzj.zzad();
            Builder builder = new Builder();
            Object gmpAppId = zzf.getGmpAppId();
            if (TextUtils.isEmpty(gmpAppId) && zzs.zzbx()) {
                gmpAppId = zzf.zzah();
            }
            Map map = null;
            Builder encodedAuthority = builder.scheme((String) zzak.zzgj.get(null)).encodedAuthority((String) zzak.zzgk.get(null));
            String str = "config/app/";
            String valueOf = String.valueOf(gmpAppId);
            encodedAuthority.path(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).appendQueryParameter("app_instance_id", zzf.getAppInstanceId()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(zzad.zzao()));
            String uri = builder.build().toString();
            try {
                URL url = new URL(uri);
                this.zzj.zzab().zzgs().zza("Fetching remote configuration", zzf.zzag());
                zzbw zzaw = zzgz().zzaw(zzf.zzag());
                valueOf = zzgz().zzax(zzf.zzag());
                if (!(zzaw == null || TextUtils.isEmpty(valueOf))) {
                    map = new ArrayMap();
                    map.put("If-Modified-Since", valueOf);
                }
                Map map2 = map;
                this.zztc = true;
                zzej zzjf = zzjf();
                String zzag = zzf.zzag();
                zzjl zzjl = new zzjl(this);
                zzjf.zzo();
                zzjf.zzbi();
                Preconditions.checkNotNull(url);
                Preconditions.checkNotNull(zzjl);
                zzjf.zzaa().zzb(new zzen(zzjf, zzag, url, null, map2, zzjl));
                return;
            } catch (MalformedURLException unused) {
                this.zzj.zzab().zzgk().zza("Failed to parse config URL. Not fetching. appId", zzef.zzam(zzf.zzag()), uri);
                return;
            }
        }
        zzb(zzf.zzag(), 204, null, null, null);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a A:{Catch:{ all -> 0x018d, all -> 0x0196 }} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a A:{Catch:{ all -> 0x018d, all -> 0x0196 }} */
    @androidx.annotation.WorkerThread
    @com.google.android.gms.common.util.VisibleForTesting
    public final void zzb(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
        r6 = this;
        r6.zzo();
        r6.zzjj();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7);
        r0 = 0;
        if (r10 != 0) goto L_0x000e;
    L_0x000c:
        r10 = new byte[r0];	 Catch:{ all -> 0x0196 }
    L_0x000e:
        r1 = r6.zzj;	 Catch:{ all -> 0x0196 }
        r1 = r1.zzab();	 Catch:{ all -> 0x0196 }
        r1 = r1.zzgs();	 Catch:{ all -> 0x0196 }
        r2 = "onConfigFetched. Response size";
        r3 = r10.length;	 Catch:{ all -> 0x0196 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x0196 }
        r1.zza(r2, r3);	 Catch:{ all -> 0x0196 }
        r1 = r6.zzgy();	 Catch:{ all -> 0x0196 }
        r1.beginTransaction();	 Catch:{ all -> 0x0196 }
        r1 = r6.zzgy();	 Catch:{ all -> 0x018d }
        r1 = r1.zzab(r7);	 Catch:{ all -> 0x018d }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r3 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r4 = 1;
        if (r8 == r2) goto L_0x003e;
    L_0x0038:
        r2 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        if (r8 == r2) goto L_0x003e;
    L_0x003c:
        if (r8 != r3) goto L_0x0042;
    L_0x003e:
        if (r9 != 0) goto L_0x0042;
    L_0x0040:
        r2 = 1;
        goto L_0x0043;
    L_0x0042:
        r2 = 0;
    L_0x0043:
        if (r1 != 0) goto L_0x005a;
    L_0x0045:
        r8 = r6.zzj;	 Catch:{ all -> 0x018d }
        r8 = r8.zzab();	 Catch:{ all -> 0x018d }
        r8 = r8.zzgn();	 Catch:{ all -> 0x018d }
        r9 = "App does not exist in onConfigFetched. appId";
        r7 = com.google.android.gms.measurement.internal.zzef.zzam(r7);	 Catch:{ all -> 0x018d }
        r8.zza(r9, r7);	 Catch:{ all -> 0x018d }
        goto L_0x0179;
    L_0x005a:
        r5 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        if (r2 != 0) goto L_0x00ca;
    L_0x005e:
        if (r8 != r5) goto L_0x0061;
    L_0x0060:
        goto L_0x00ca;
    L_0x0061:
        r10 = r6.zzj;	 Catch:{ all -> 0x018d }
        r10 = r10.zzx();	 Catch:{ all -> 0x018d }
        r10 = r10.currentTimeMillis();	 Catch:{ all -> 0x018d }
        r1.zzm(r10);	 Catch:{ all -> 0x018d }
        r10 = r6.zzgy();	 Catch:{ all -> 0x018d }
        r10.zza(r1);	 Catch:{ all -> 0x018d }
        r10 = r6.zzj;	 Catch:{ all -> 0x018d }
        r10 = r10.zzab();	 Catch:{ all -> 0x018d }
        r10 = r10.zzgs();	 Catch:{ all -> 0x018d }
        r11 = "Fetching config failed. code, error";
        r1 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x018d }
        r10.zza(r11, r1, r9);	 Catch:{ all -> 0x018d }
        r9 = r6.zzgz();	 Catch:{ all -> 0x018d }
        r9.zzay(r7);	 Catch:{ all -> 0x018d }
        r7 = r6.zzj;	 Catch:{ all -> 0x018d }
        r7 = r7.zzac();	 Catch:{ all -> 0x018d }
        r7 = r7.zzlk;	 Catch:{ all -> 0x018d }
        r9 = r6.zzj;	 Catch:{ all -> 0x018d }
        r9 = r9.zzx();	 Catch:{ all -> 0x018d }
        r9 = r9.currentTimeMillis();	 Catch:{ all -> 0x018d }
        r7.set(r9);	 Catch:{ all -> 0x018d }
        r7 = 503; // 0x1f7 float:7.05E-43 double:2.485E-321;
        if (r8 == r7) goto L_0x00ae;
    L_0x00a8:
        r7 = 429; // 0x1ad float:6.01E-43 double:2.12E-321;
        if (r8 != r7) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00ae;
    L_0x00ad:
        r4 = 0;
    L_0x00ae:
        if (r4 == 0) goto L_0x00c5;
    L_0x00b0:
        r7 = r6.zzj;	 Catch:{ all -> 0x018d }
        r7 = r7.zzac();	 Catch:{ all -> 0x018d }
        r7 = r7.zzll;	 Catch:{ all -> 0x018d }
        r8 = r6.zzj;	 Catch:{ all -> 0x018d }
        r8 = r8.zzx();	 Catch:{ all -> 0x018d }
        r8 = r8.currentTimeMillis();	 Catch:{ all -> 0x018d }
        r7.set(r8);	 Catch:{ all -> 0x018d }
    L_0x00c5:
        r6.zzjn();	 Catch:{ all -> 0x018d }
        goto L_0x0179;
    L_0x00ca:
        r9 = 0;
        if (r11 == 0) goto L_0x00d6;
    L_0x00cd:
        r2 = "Last-Modified";
        r11 = r11.get(r2);	 Catch:{ all -> 0x018d }
        r11 = (java.util.List) r11;	 Catch:{ all -> 0x018d }
        goto L_0x00d7;
    L_0x00d6:
        r11 = r9;
    L_0x00d7:
        if (r11 == 0) goto L_0x00e6;
    L_0x00d9:
        r2 = r11.size();	 Catch:{ all -> 0x018d }
        if (r2 <= 0) goto L_0x00e6;
    L_0x00df:
        r11 = r11.get(r0);	 Catch:{ all -> 0x018d }
        r11 = (java.lang.String) r11;	 Catch:{ all -> 0x018d }
        goto L_0x00e7;
    L_0x00e6:
        r11 = r9;
    L_0x00e7:
        if (r8 == r5) goto L_0x0103;
    L_0x00e9:
        if (r8 != r3) goto L_0x00ec;
    L_0x00eb:
        goto L_0x0103;
    L_0x00ec:
        r9 = r6.zzgz();	 Catch:{ all -> 0x018d }
        r9 = r9.zza(r7, r10, r11);	 Catch:{ all -> 0x018d }
        if (r9 != 0) goto L_0x0124;
    L_0x00f6:
        r7 = r6.zzgy();	 Catch:{ all -> 0x0196 }
        r7.endTransaction();	 Catch:{ all -> 0x0196 }
        r6.zztc = r0;
        r6.zzjo();
        return;
    L_0x0103:
        r11 = r6.zzgz();	 Catch:{ all -> 0x018d }
        r11 = r11.zzaw(r7);	 Catch:{ all -> 0x018d }
        if (r11 != 0) goto L_0x0124;
    L_0x010d:
        r11 = r6.zzgz();	 Catch:{ all -> 0x018d }
        r9 = r11.zza(r7, r9, r9);	 Catch:{ all -> 0x018d }
        if (r9 != 0) goto L_0x0124;
    L_0x0117:
        r7 = r6.zzgy();	 Catch:{ all -> 0x0196 }
        r7.endTransaction();	 Catch:{ all -> 0x0196 }
        r6.zztc = r0;
        r6.zzjo();
        return;
    L_0x0124:
        r9 = r6.zzj;	 Catch:{ all -> 0x018d }
        r9 = r9.zzx();	 Catch:{ all -> 0x018d }
        r2 = r9.currentTimeMillis();	 Catch:{ all -> 0x018d }
        r1.zzl(r2);	 Catch:{ all -> 0x018d }
        r9 = r6.zzgy();	 Catch:{ all -> 0x018d }
        r9.zza(r1);	 Catch:{ all -> 0x018d }
        if (r8 != r5) goto L_0x014a;
    L_0x013a:
        r8 = r6.zzj;	 Catch:{ all -> 0x018d }
        r8 = r8.zzab();	 Catch:{ all -> 0x018d }
        r8 = r8.zzgp();	 Catch:{ all -> 0x018d }
        r9 = "Config not found. Using empty config. appId";
        r8.zza(r9, r7);	 Catch:{ all -> 0x018d }
        goto L_0x0162;
    L_0x014a:
        r7 = r6.zzj;	 Catch:{ all -> 0x018d }
        r7 = r7.zzab();	 Catch:{ all -> 0x018d }
        r7 = r7.zzgs();	 Catch:{ all -> 0x018d }
        r9 = "Successfully fetched config. Got network response. code, size";
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x018d }
        r10 = r10.length;	 Catch:{ all -> 0x018d }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ all -> 0x018d }
        r7.zza(r9, r8, r10);	 Catch:{ all -> 0x018d }
    L_0x0162:
        r7 = r6.zzjf();	 Catch:{ all -> 0x018d }
        r7 = r7.zzgv();	 Catch:{ all -> 0x018d }
        if (r7 == 0) goto L_0x0176;
    L_0x016c:
        r7 = r6.zzjm();	 Catch:{ all -> 0x018d }
        if (r7 == 0) goto L_0x0176;
    L_0x0172:
        r6.zzjl();	 Catch:{ all -> 0x018d }
        goto L_0x0179;
    L_0x0176:
        r6.zzjn();	 Catch:{ all -> 0x018d }
    L_0x0179:
        r7 = r6.zzgy();	 Catch:{ all -> 0x018d }
        r7.setTransactionSuccessful();	 Catch:{ all -> 0x018d }
        r7 = r6.zzgy();	 Catch:{ all -> 0x0196 }
        r7.endTransaction();	 Catch:{ all -> 0x0196 }
        r6.zztc = r0;
        r6.zzjo();
        return;
    L_0x018d:
        r7 = move-exception;
        r8 = r6.zzgy();	 Catch:{ all -> 0x0196 }
        r8.endTransaction();	 Catch:{ all -> 0x0196 }
        throw r7;	 Catch:{ all -> 0x0196 }
    L_0x0196:
        r7 = move-exception;
        r6.zztc = r0;
        r6.zzjo();
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjg.zzb(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a2  */
    @androidx.annotation.WorkerThread
    private final void zzjn() {
        /*
        r21 = this;
        r0 = r21;
        r21.zzo();
        r21.zzjj();
        r1 = r21.zzjr();
        if (r1 != 0) goto L_0x001d;
    L_0x000e:
        r1 = r0.zzj;
        r1 = r1.zzad();
        r2 = com.google.android.gms.measurement.internal.zzak.zzim;
        r1 = r1.zza(r2);
        if (r1 != 0) goto L_0x001d;
    L_0x001c:
        return;
    L_0x001d:
        r1 = r0.zzsy;
        r3 = 0;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 <= 0) goto L_0x0062;
    L_0x0025:
        r1 = r0.zzj;
        r1 = r1.zzx();
        r1 = r1.elapsedRealtime();
        r5 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
        r7 = r0.zzsy;
        r1 = r1 - r7;
        r1 = java.lang.Math.abs(r1);
        r5 = r5 - r1;
        r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r1 <= 0) goto L_0x0060;
    L_0x003e:
        r1 = r0.zzj;
        r1 = r1.zzab();
        r1 = r1.zzgs();
        r2 = java.lang.Long.valueOf(r5);
        r3 = "Upload has been suspended. Will update scheduling later in approximately ms";
        r1.zza(r3, r2);
        r1 = r21.zzjg();
        r1.unregister();
        r1 = r21.zzjh();
        r1.cancel();
        return;
    L_0x0060:
        r0.zzsy = r3;
    L_0x0062:
        r1 = r0.zzj;
        r1 = r1.zzie();
        if (r1 == 0) goto L_0x026b;
    L_0x006a:
        r1 = r21.zzjm();
        if (r1 != 0) goto L_0x0072;
    L_0x0070:
        goto L_0x026b;
    L_0x0072:
        r1 = r0.zzj;
        r1 = r1.zzx();
        r1 = r1.currentTimeMillis();
        r5 = com.google.android.gms.measurement.internal.zzak.zzhf;
        r6 = 0;
        r5 = r5.get(r6);
        r5 = (java.lang.Long) r5;
        r7 = r5.longValue();
        r7 = java.lang.Math.max(r3, r7);
        r5 = r21.zzgy();
        r5 = r5.zzce();
        if (r5 != 0) goto L_0x00a4;
    L_0x0097:
        r5 = r21.zzgy();
        r5 = r5.zzbz();
        if (r5 == 0) goto L_0x00a2;
    L_0x00a1:
        goto L_0x00a4;
    L_0x00a2:
        r5 = 0;
        goto L_0x00a5;
    L_0x00a4:
        r5 = 1;
    L_0x00a5:
        if (r5 == 0) goto L_0x00e1;
    L_0x00a7:
        r10 = r0.zzj;
        r10 = r10.zzad();
        r10 = r10.zzbu();
        r11 = android.text.TextUtils.isEmpty(r10);
        if (r11 != 0) goto L_0x00d0;
    L_0x00b7:
        r11 = ".none.";
        r10 = r11.equals(r10);
        if (r10 != 0) goto L_0x00d0;
    L_0x00bf:
        r10 = com.google.android.gms.measurement.internal.zzak.zzha;
        r10 = r10.get(r6);
        r10 = (java.lang.Long) r10;
        r10 = r10.longValue();
        r10 = java.lang.Math.max(r3, r10);
        goto L_0x00f1;
    L_0x00d0:
        r10 = com.google.android.gms.measurement.internal.zzak.zzgz;
        r10 = r10.get(r6);
        r10 = (java.lang.Long) r10;
        r10 = r10.longValue();
        r10 = java.lang.Math.max(r3, r10);
        goto L_0x00f1;
    L_0x00e1:
        r10 = com.google.android.gms.measurement.internal.zzak.zzgy;
        r10 = r10.get(r6);
        r10 = (java.lang.Long) r10;
        r10 = r10.longValue();
        r10 = java.lang.Math.max(r3, r10);
    L_0x00f1:
        r12 = r0.zzj;
        r12 = r12.zzac();
        r12 = r12.zzlj;
        r12 = r12.get();
        r14 = r0.zzj;
        r14 = r14.zzac();
        r14 = r14.zzlk;
        r14 = r14.get();
        r16 = r21.zzgy();
        r17 = r10;
        r9 = r16.zzcb();
        r11 = r21.zzgy();
        r19 = r7;
        r6 = r11.zzcc();
        r6 = java.lang.Math.max(r9, r6);
        r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));
        if (r8 != 0) goto L_0x0128;
    L_0x0125:
        r8 = r3;
        goto L_0x019e;
    L_0x0128:
        r6 = r6 - r1;
        r6 = java.lang.Math.abs(r6);
        r6 = r1 - r6;
        r12 = r12 - r1;
        r8 = java.lang.Math.abs(r12);
        r8 = r1 - r8;
        r14 = r14 - r1;
        r10 = java.lang.Math.abs(r14);
        r1 = r1 - r10;
        r8 = java.lang.Math.max(r8, r1);
        r10 = r6 + r19;
        if (r5 == 0) goto L_0x014e;
    L_0x0144:
        r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r5 <= 0) goto L_0x014e;
    L_0x0148:
        r10 = java.lang.Math.min(r6, r8);
        r10 = r10 + r17;
    L_0x014e:
        r5 = r21.zzgw();
        r12 = r17;
        r5 = r5.zzb(r8, r12);
        if (r5 != 0) goto L_0x015c;
    L_0x015a:
        r8 = r8 + r12;
        goto L_0x015d;
    L_0x015c:
        r8 = r10;
    L_0x015d:
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 == 0) goto L_0x019e;
    L_0x0161:
        r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r5 < 0) goto L_0x019e;
    L_0x0165:
        r5 = 0;
    L_0x0166:
        r6 = 20;
        r7 = com.google.android.gms.measurement.internal.zzak.zzhh;
        r10 = 0;
        r7 = r7.get(r10);
        r7 = (java.lang.Integer) r7;
        r7 = r7.intValue();
        r11 = 0;
        r7 = java.lang.Math.max(r11, r7);
        r6 = java.lang.Math.min(r6, r7);
        if (r5 >= r6) goto L_0x0125;
    L_0x0180:
        r6 = 1;
        r6 = r6 << r5;
        r12 = com.google.android.gms.measurement.internal.zzak.zzhg;
        r12 = r12.get(r10);
        r12 = (java.lang.Long) r12;
        r12 = r12.longValue();
        r12 = java.lang.Math.max(r3, r12);
        r12 = r12 * r6;
        r8 = r8 + r12;
        r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1));
        if (r6 <= 0) goto L_0x019b;
    L_0x019a:
        goto L_0x019e;
    L_0x019b:
        r5 = r5 + 1;
        goto L_0x0166;
    L_0x019e:
        r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r1 != 0) goto L_0x01c0;
    L_0x01a2:
        r1 = r0.zzj;
        r1 = r1.zzab();
        r1 = r1.zzgs();
        r2 = "Next upload time is 0";
        r1.zzao(r2);
        r1 = r21.zzjg();
        r1.unregister();
        r1 = r21.zzjh();
        r1.cancel();
        return;
    L_0x01c0:
        r1 = r21.zzjf();
        r1 = r1.zzgv();
        if (r1 != 0) goto L_0x01e8;
    L_0x01ca:
        r1 = r0.zzj;
        r1 = r1.zzab();
        r1 = r1.zzgs();
        r2 = "No network";
        r1.zzao(r2);
        r1 = r21.zzjg();
        r1.zzha();
        r1 = r21.zzjh();
        r1.cancel();
        return;
    L_0x01e8:
        r1 = r0.zzj;
        r1 = r1.zzac();
        r1 = r1.zzll;
        r1 = r1.get();
        r5 = com.google.android.gms.measurement.internal.zzak.zzgw;
        r6 = 0;
        r5 = r5.get(r6);
        r5 = (java.lang.Long) r5;
        r5 = r5.longValue();
        r5 = java.lang.Math.max(r3, r5);
        r7 = r21.zzgw();
        r7 = r7.zzb(r1, r5);
        if (r7 != 0) goto L_0x0214;
    L_0x020f:
        r1 = r1 + r5;
        r8 = java.lang.Math.max(r8, r1);
    L_0x0214:
        r1 = r21.zzjg();
        r1.unregister();
        r1 = r0.zzj;
        r1 = r1.zzx();
        r1 = r1.currentTimeMillis();
        r8 = r8 - r1;
        r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r1 > 0) goto L_0x0250;
    L_0x022a:
        r1 = com.google.android.gms.measurement.internal.zzak.zzhb;
        r2 = 0;
        r1 = r1.get(r2);
        r1 = (java.lang.Long) r1;
        r1 = r1.longValue();
        r8 = java.lang.Math.max(r3, r1);
        r1 = r0.zzj;
        r1 = r1.zzac();
        r1 = r1.zzlj;
        r2 = r0.zzj;
        r2 = r2.zzx();
        r2 = r2.currentTimeMillis();
        r1.set(r2);
    L_0x0250:
        r1 = r0.zzj;
        r1 = r1.zzab();
        r1 = r1.zzgs();
        r2 = java.lang.Long.valueOf(r8);
        r3 = "Upload scheduled in approximately ms";
        r1.zza(r3, r2);
        r1 = r21.zzjh();
        r1.zzv(r8);
        return;
    L_0x026b:
        r1 = r0.zzj;
        r1 = r1.zzab();
        r1 = r1.zzgs();
        r2 = "Nothing to upload or uploading impossible";
        r1.zzao(r2);
        r1 = r21.zzjg();
        r1.unregister();
        r1 = r21.zzjh();
        r1.cancel();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjg.zzjn():void");
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzf(Runnable runnable) {
        zzo();
        if (this.zzsz == null) {
            this.zzsz = new ArrayList();
        }
        this.zzsz.add(runnable);
    }

    @WorkerThread
    private final void zzjo() {
        zzo();
        if (this.zztc || this.zztd || this.zzte) {
            this.zzj.zzab().zzgs().zza("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zztc), Boolean.valueOf(this.zztd), Boolean.valueOf(this.zzte));
            return;
        }
        this.zzj.zzab().zzgs().zzao("Stopping uploading service(s)");
        List<Runnable> list = this.zzsz;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.zzsz.clear();
        }
    }

    @WorkerThread
    private final Boolean zzc(zzf zzf) {
        try {
            if (zzf.zzam() != -2147483648L) {
                if (zzf.zzam() == ((long) Wrappers.packageManager(this.zzj.getContext()).getPackageInfo(zzf.zzag(), 0).versionCode)) {
                    return Boolean.valueOf(true);
                }
            }
            String str = Wrappers.packageManager(this.zzj.getContext()).getPackageInfo(zzf.zzag(), 0).versionName;
            if (zzf.zzal() != null && zzf.zzal().equals(str)) {
                return Boolean.valueOf(true);
            }
            return Boolean.valueOf(false);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    @VisibleForTesting
    private final boolean zzjp() {
        zzo();
        String str = "Storage concurrent access okay";
        if (this.zzj.zzad().zza(zzak.zzjh)) {
            FileLock fileLock = this.zztf;
            if (fileLock != null && fileLock.isValid()) {
                this.zzj.zzab().zzgs().zzao(str);
                return true;
            }
        }
        try {
            this.zztg = new RandomAccessFile(new File(this.zzj.getContext().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zztf = this.zztg.tryLock();
            if (this.zztf != null) {
                this.zzj.zzab().zzgs().zzao(str);
                return true;
            }
            this.zzj.zzab().zzgk().zzao("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            this.zzj.zzab().zzgk().zza("Failed to acquire storage lock", e);
        } catch (IOException e2) {
            this.zzj.zzab().zzgk().zza("Failed to access storage lock file", e2);
        } catch (OverlappingFileLockException e3) {
            this.zzj.zzab().zzgn().zza("Storage lock already acquired", e3);
        }
    }

    @WorkerThread
    @VisibleForTesting
    private final int zza(FileChannel fileChannel) {
        zzo();
        int i = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzj.zzab().zzgk().zzao("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.zzj.zzab().zzgn().zza("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            i = allocate.getInt();
            return i;
        } catch (IOException e) {
            this.zzj.zzab().zzgk().zza("Failed to read from channel", e);
        }
    }

    @WorkerThread
    @VisibleForTesting
    private final boolean zza(int i, FileChannel fileChannel) {
        zzo();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzj.zzab().zzgk().zzao("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.zzj.zzab().zzgk().zza("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.zzj.zzab().zzgk().zza("Failed to write to channel", e);
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzjq() {
        zzo();
        zzjj();
        if (!this.zzsx) {
            this.zzsx = true;
            zzo();
            zzjj();
            if ((this.zzj.zzad().zza(zzak.zzim) || zzjr()) && zzjp()) {
                int zza = zza(this.zztg);
                int zzgf = this.zzj.zzr().zzgf();
                zzo();
                if (zza > zzgf) {
                    this.zzj.zzab().zzgk().zza("Panic: can't downgrade version. Previous, current version", Integer.valueOf(zza), Integer.valueOf(zzgf));
                } else if (zza < zzgf) {
                    if (zza(zzgf, this.zztg)) {
                        this.zzj.zzab().zzgs().zza("Storage version upgraded. Previous, current version", Integer.valueOf(zza), Integer.valueOf(zzgf));
                    } else {
                        this.zzj.zzab().zzgk().zza("Storage version upgrade failed. Previous, current version", Integer.valueOf(zza), Integer.valueOf(zzgf));
                    }
                }
            }
        }
        if (!this.zzsw && !this.zzj.zzad().zza(zzak.zzim)) {
            this.zzj.zzab().zzgq().zzao("This instance being marked as an uploader");
            this.zzsw = true;
            zzjn();
        }
    }

    @WorkerThread
    private final boolean zzjr() {
        zzo();
        zzjj();
        return this.zzsw;
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    @VisibleForTesting
    public final void zzd(zzn zzn) {
        String str = "app_id=?";
        if (this.zzth != null) {
            this.zzti = new ArrayList();
            this.zzti.addAll(this.zzth);
        }
        zzx zzgy = zzgy();
        String str2 = zzn.packageName;
        Preconditions.checkNotEmpty(str2);
        zzgy.zzo();
        zzgy.zzbi();
        try {
            SQLiteDatabase writableDatabase = zzgy.getWritableDatabase();
            String[] strArr = new String[]{str2};
            int delete = ((((((((writableDatabase.delete("apps", str, strArr) + 0) + writableDatabase.delete("events", str, strArr)) + writableDatabase.delete("user_attributes", str, strArr)) + writableDatabase.delete("conditional_properties", str, strArr)) + writableDatabase.delete("raw_events", str, strArr)) + writableDatabase.delete("raw_events_metadata", str, strArr)) + writableDatabase.delete("queue", str, strArr)) + writableDatabase.delete("audience_filter_values", str, strArr)) + writableDatabase.delete("main_event_params", str, strArr);
            if (delete > 0) {
                zzgy.zzab().zzgs().zza("Reset analytics data. app, records", str2, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzgy.zzab().zzgk().zza("Error resetting analytics data. appId, error", zzef.zzam(str2), e);
        }
        zzn zza = zza(this.zzj.getContext(), zzn.packageName, zzn.zzcg, zzn.zzcq, zzn.zzcs, zzn.zzct, zzn.zzdr, zzn.zzcu);
        if (zzn.zzcq) {
            zzf(zza);
        }
    }

    private final zzn zza(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3) {
        String str4 = str;
        String str5 = "Unknown";
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.zzj.zzab().zzgk().zzao("PackageManager is null, can not log app install information");
            return null;
        }
        String installerPackageName;
        try {
            installerPackageName = packageManager.getInstallerPackageName(str4);
        } catch (IllegalArgumentException unused) {
            this.zzj.zzab().zzgk().zza("Error retrieving installer package name. appId", zzef.zzam(str));
            installerPackageName = str5;
        }
        if (installerPackageName == null) {
            installerPackageName = "manual_install";
        } else if ("com.android.vending".equals(installerPackageName)) {
            installerPackageName = "";
        }
        String str6 = installerPackageName;
        try {
            int i;
            String str7;
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str4, 0);
            if (packageInfo != null) {
                CharSequence applicationLabel = Wrappers.packageManager(context).getApplicationLabel(str4);
                if (!TextUtils.isEmpty(applicationLabel)) {
                    str5 = applicationLabel.toString();
                }
                String str8 = packageInfo.versionName;
                i = packageInfo.versionCode;
                str7 = str8;
            } else {
                i = Integer.MIN_VALUE;
                str7 = str5;
            }
            this.zzj.zzae();
            return new zzn(str, str2, str7, (long) i, str6, this.zzj.zzad().zzao(), this.zzj.zzz().zzc(context, str4), null, z, false, "", 0, this.zzj.zzad().zzr(str4) ? j : 0, 0, z2, z3, false, str3, null, 0, null);
        } catch (NameNotFoundException unused2) {
            this.zzj.zzab().zzgk().zza("Error retrieving newly installed package info. appId, appName", zzef.zzam(str), str5);
            return null;
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzb(zzjn zzjn, zzn zzn) {
        zzo();
        zzjj();
        if (!TextUtils.isEmpty(zzn.zzcg) || !TextUtils.isEmpty(zzn.zzcu)) {
            if (zzn.zzcq) {
                int zzbm = this.zzj.zzz().zzbm(zzjn.name);
                if (zzbm != 0) {
                    this.zzj.zzz();
                    this.zzj.zzz().zza(zzn.packageName, zzbm, "_ev", zzjs.zza(zzjn.name, 24, true), zzjn.name != null ? zzjn.name.length() : 0);
                    return;
                }
                int zzc = this.zzj.zzz().zzc(zzjn.name, zzjn.getValue());
                if (zzc != 0) {
                    this.zzj.zzz();
                    String zza = zzjs.zza(zzjn.name, 24, true);
                    Object value = zzjn.getValue();
                    int length = (value == null || !((value instanceof String) || (value instanceof CharSequence))) ? 0 : String.valueOf(value).length();
                    this.zzj.zzz().zza(zzn.packageName, zzc, "_ev", zza, length);
                    return;
                }
                Object zzd = this.zzj.zzz().zzd(zzjn.name, zzjn.getValue());
                if (zzd != null) {
                    zzjp zze;
                    if ("_sid".equals(zzjn.name) && this.zzj.zzad().zzw(zzn.packageName)) {
                        long j = zzjn.zztr;
                        String str = zzjn.origin;
                        long j2 = 0;
                        zze = zzgy().zze(zzn.packageName, "_sno");
                        if (zze == null || !(zze.value instanceof Long)) {
                            if (zze != null) {
                                this.zzj.zzab().zzgn().zza("Retrieved last session number from database does not contain a valid (long) value", zze.value);
                            }
                            if (this.zzj.zzad().zze(zzn.packageName, zzak.zzie)) {
                                zzae zzc2 = zzgy().zzc(zzn.packageName, "_s");
                                if (zzc2 != null) {
                                    j2 = zzc2.zzfg;
                                    this.zzj.zzab().zzgs().zza("Backfill the session number. Last used session number", Long.valueOf(j2));
                                }
                            }
                        } else {
                            j2 = ((Long) zze.value).longValue();
                        }
                        zzb(new zzjn("_sno", j, Long.valueOf(j2 + 1), str), zzn);
                    }
                    zze = new zzjp(zzn.packageName, zzjn.origin, zzjn.name, zzjn.zztr, zzd);
                    this.zzj.zzab().zzgr().zza("Setting user property", this.zzj.zzy().zzal(zze.name), zzd);
                    zzgy().beginTransaction();
                    try {
                        zzg(zzn);
                        boolean zza2 = zzgy().zza(zze);
                        zzgy().setTransactionSuccessful();
                        if (zza2) {
                            this.zzj.zzab().zzgr().zza("User property set", this.zzj.zzy().zzal(zze.name), zze.value);
                        } else {
                            this.zzj.zzab().zzgk().zza("Too many unique user properties are set. Ignoring user property", this.zzj.zzy().zzal(zze.name), zze.value);
                            this.zzj.zzz().zza(zzn.packageName, 9, null, null, 0);
                        }
                        zzgy().endTransaction();
                        return;
                    } catch (Throwable th) {
                        zzgy().endTransaction();
                    }
                } else {
                    return;
                }
            }
            zzg(zzn);
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzc(zzjn zzjn, zzn zzn) {
        zzo();
        zzjj();
        if (!TextUtils.isEmpty(zzn.zzcg) || !TextUtils.isEmpty(zzn.zzcu)) {
            if (zzn.zzcq) {
                String str = "User property removed";
                String str2 = "Removing user property";
                if (this.zzj.zzad().zze(zzn.packageName, zzak.zzij)) {
                    if (!"_npa".equals(zzjn.name) || zzn.zzcv == null) {
                        this.zzj.zzab().zzgr().zza(str2, this.zzj.zzy().zzal(zzjn.name));
                        zzgy().beginTransaction();
                        try {
                            zzg(zzn);
                            zzgy().zzd(zzn.packageName, zzjn.name);
                            zzgy().setTransactionSuccessful();
                            this.zzj.zzab().zzgr().zza(str, this.zzj.zzy().zzal(zzjn.name));
                            return;
                        } finally {
                            zzgy().endTransaction();
                        }
                    } else {
                        this.zzj.zzab().zzgr().zzao("Falling back to manifest metadata value for ad personalization");
                        zzb(new zzjn("_npa", this.zzj.zzx().currentTimeMillis(), Long.valueOf(zzn.zzcv.booleanValue() ? 1 : 0), "auto"), zzn);
                        return;
                    }
                }
                this.zzj.zzab().zzgr().zza(str2, this.zzj.zzy().zzal(zzjn.name));
                zzgy().beginTransaction();
                try {
                    zzg(zzn);
                    zzgy().zzd(zzn.packageName, zzjn.name);
                    zzgy().setTransactionSuccessful();
                    this.zzj.zzab().zzgr().zza(str, this.zzj.zzy().zzal(zzjn.name));
                } finally {
                    zzgy().endTransaction();
                }
            } else {
                zzg(zzn);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzb(zzjh zzjh) {
        this.zzta++;
    }

    /* Access modifiers changed, original: final */
    public final void zzjs() {
        this.zztb++;
    }

    /* Access modifiers changed, original: final */
    public final zzfj zzjt() {
        return this.zzj;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0274 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0267 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04a8 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0286 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f6 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0267 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0274 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0286 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04a8 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0140 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f6 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0274 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0267 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04a8 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0286 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f6 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0267 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0274 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0286 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04a8 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f6 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0274 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0267 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04a8 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0286 A:{Catch:{ NameNotFoundException -> 0x0348, all -> 0x04d3 }} */
    @androidx.annotation.WorkerThread
    public final void zzf(com.google.android.gms.measurement.internal.zzn r22) {
        /*
        r21 = this;
        r1 = r21;
        r2 = r22;
        r3 = "_sys";
        r4 = "_pfo";
        r5 = "_uwa";
        r0 = "app_id=?";
        r21.zzo();
        r21.zzjj();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r22);
        r6 = r2.packageName;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6);
        r6 = r2.zzcg;
        r6 = android.text.TextUtils.isEmpty(r6);
        if (r6 == 0) goto L_0x002b;
    L_0x0022:
        r6 = r2.zzcu;
        r6 = android.text.TextUtils.isEmpty(r6);
        if (r6 == 0) goto L_0x002b;
    L_0x002a:
        return;
    L_0x002b:
        r6 = r21.zzgy();
        r7 = r2.packageName;
        r6 = r6.zzab(r7);
        r7 = 0;
        if (r6 == 0) goto L_0x005e;
    L_0x0039:
        r9 = r6.getGmpAppId();
        r9 = android.text.TextUtils.isEmpty(r9);
        if (r9 == 0) goto L_0x005e;
    L_0x0043:
        r9 = r2.zzcg;
        r9 = android.text.TextUtils.isEmpty(r9);
        if (r9 != 0) goto L_0x005e;
    L_0x004b:
        r6.zzl(r7);
        r9 = r21.zzgy();
        r9.zza(r6);
        r6 = r21.zzgz();
        r9 = r2.packageName;
        r6.zzaz(r9);
    L_0x005e:
        r6 = r2.zzcq;
        if (r6 != 0) goto L_0x0066;
    L_0x0062:
        r21.zzg(r22);
        return;
    L_0x0066:
        r9 = r2.zzdr;
        r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r6 != 0) goto L_0x0076;
    L_0x006c:
        r6 = r1.zzj;
        r6 = r6.zzx();
        r9 = r6.currentTimeMillis();
    L_0x0076:
        r6 = r1.zzj;
        r6 = r6.zzad();
        r11 = r2.packageName;
        r12 = com.google.android.gms.measurement.internal.zzak.zzij;
        r6 = r6.zze(r11, r12);
        if (r6 == 0) goto L_0x008f;
    L_0x0086:
        r6 = r1.zzj;
        r6 = r6.zzw();
        r6.zzct();
    L_0x008f:
        r6 = r2.zzds;
        r15 = 0;
        r13 = 1;
        if (r6 == 0) goto L_0x00b1;
    L_0x0095:
        if (r6 == r13) goto L_0x00b1;
    L_0x0097:
        r11 = r1.zzj;
        r11 = r11.zzab();
        r11 = r11.zzgn();
        r12 = r2.packageName;
        r12 = com.google.android.gms.measurement.internal.zzef.zzam(r12);
        r6 = java.lang.Integer.valueOf(r6);
        r14 = "Incorrect app type, assuming installed app. appId, appType";
        r11.zza(r14, r12, r6);
        r6 = 0;
    L_0x00b1:
        r11 = r21.zzgy();
        r11.beginTransaction();
        r11 = r1.zzj;	 Catch:{ all -> 0x04d3 }
        r11 = r11.zzad();	 Catch:{ all -> 0x04d3 }
        r12 = r2.packageName;	 Catch:{ all -> 0x04d3 }
        r14 = com.google.android.gms.measurement.internal.zzak.zzij;	 Catch:{ all -> 0x04d3 }
        r11 = r11.zze(r12, r14);	 Catch:{ all -> 0x04d3 }
        if (r11 == 0) goto L_0x0131;
    L_0x00c8:
        r11 = r21.zzgy();	 Catch:{ all -> 0x04d3 }
        r12 = r2.packageName;	 Catch:{ all -> 0x04d3 }
        r14 = "_npa";
        r14 = r11.zze(r12, r14);	 Catch:{ all -> 0x04d3 }
        if (r14 == 0) goto L_0x00e0;
    L_0x00d6:
        r11 = "auto";
        r12 = r14.origin;	 Catch:{ all -> 0x04d3 }
        r11 = r11.equals(r12);	 Catch:{ all -> 0x04d3 }
        if (r11 == 0) goto L_0x0131;
    L_0x00e0:
        r11 = r2.zzcv;	 Catch:{ all -> 0x04d3 }
        if (r11 == 0) goto L_0x011b;
    L_0x00e4:
        r12 = new com.google.android.gms.measurement.internal.zzjn;	 Catch:{ all -> 0x04d3 }
        r16 = "_npa";
        r11 = r2.zzcv;	 Catch:{ all -> 0x04d3 }
        r11 = r11.booleanValue();	 Catch:{ all -> 0x04d3 }
        if (r11 == 0) goto L_0x00f3;
    L_0x00f0:
        r17 = 1;
        goto L_0x00f5;
    L_0x00f3:
        r17 = 0;
    L_0x00f5:
        r17 = java.lang.Long.valueOf(r17);	 Catch:{ all -> 0x04d3 }
        r18 = "auto";
        r11 = r12;
        r7 = r12;
        r12 = r16;
        r19 = r3;
        r8 = r14;
        r3 = 1;
        r13 = r9;
        r15 = r17;
        r16 = r18;
        r11.<init>(r12, r13, r15, r16);	 Catch:{ all -> 0x04d3 }
        if (r8 == 0) goto L_0x0117;
    L_0x010d:
        r8 = r8.value;	 Catch:{ all -> 0x04d3 }
        r11 = r7.zzts;	 Catch:{ all -> 0x04d3 }
        r8 = r8.equals(r11);	 Catch:{ all -> 0x04d3 }
        if (r8 != 0) goto L_0x0134;
    L_0x0117:
        r1.zzb(r7, r2);	 Catch:{ all -> 0x04d3 }
        goto L_0x0134;
    L_0x011b:
        r19 = r3;
        r8 = r14;
        r3 = 1;
        if (r8 == 0) goto L_0x0134;
    L_0x0121:
        r7 = new com.google.android.gms.measurement.internal.zzjn;	 Catch:{ all -> 0x04d3 }
        r12 = "_npa";
        r15 = 0;
        r16 = "auto";
        r11 = r7;
        r13 = r9;
        r11.<init>(r12, r13, r15, r16);	 Catch:{ all -> 0x04d3 }
        r1.zzc(r7, r2);	 Catch:{ all -> 0x04d3 }
        goto L_0x0134;
    L_0x0131:
        r19 = r3;
        r3 = 1;
    L_0x0134:
        r7 = r21.zzgy();	 Catch:{ all -> 0x04d3 }
        r8 = r2.packageName;	 Catch:{ all -> 0x04d3 }
        r7 = r7.zzab(r8);	 Catch:{ all -> 0x04d3 }
        if (r7 == 0) goto L_0x01f3;
    L_0x0140:
        r11 = r1.zzj;	 Catch:{ all -> 0x04d3 }
        r11.zzz();	 Catch:{ all -> 0x04d3 }
        r11 = r2.zzcg;	 Catch:{ all -> 0x04d3 }
        r12 = r7.getGmpAppId();	 Catch:{ all -> 0x04d3 }
        r13 = r2.zzcu;	 Catch:{ all -> 0x04d3 }
        r14 = r7.zzah();	 Catch:{ all -> 0x04d3 }
        r11 = com.google.android.gms.measurement.internal.zzjs.zza(r11, r12, r13, r14);	 Catch:{ all -> 0x04d3 }
        if (r11 == 0) goto L_0x01f3;
    L_0x0157:
        r11 = r1.zzj;	 Catch:{ all -> 0x04d3 }
        r11 = r11.zzab();	 Catch:{ all -> 0x04d3 }
        r11 = r11.zzgn();	 Catch:{ all -> 0x04d3 }
        r12 = "New GMP App Id passed in. Removing cached database data. appId";
        r13 = r7.zzag();	 Catch:{ all -> 0x04d3 }
        r13 = com.google.android.gms.measurement.internal.zzef.zzam(r13);	 Catch:{ all -> 0x04d3 }
        r11.zza(r12, r13);	 Catch:{ all -> 0x04d3 }
        r11 = r21.zzgy();	 Catch:{ all -> 0x04d3 }
        r7 = r7.zzag();	 Catch:{ all -> 0x04d3 }
        r11.zzbi();	 Catch:{ all -> 0x04d3 }
        r11.zzo();	 Catch:{ all -> 0x04d3 }
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7);	 Catch:{ all -> 0x04d3 }
        r12 = r11.getWritableDatabase();	 Catch:{ SQLiteException -> 0x01de }
        r13 = new java.lang.String[r3];	 Catch:{ SQLiteException -> 0x01de }
        r15 = 0;
        r13[r15] = r7;	 Catch:{ SQLiteException -> 0x01dc }
        r14 = "events";
        r14 = r12.delete(r14, r0, r13);	 Catch:{ SQLiteException -> 0x01dc }
        r14 = r14 + r15;
        r8 = "user_attributes";
        r8 = r12.delete(r8, r0, r13);	 Catch:{ SQLiteException -> 0x01dc }
        r14 = r14 + r8;
        r8 = "conditional_properties";
        r8 = r12.delete(r8, r0, r13);	 Catch:{ SQLiteException -> 0x01dc }
        r14 = r14 + r8;
        r8 = "apps";
        r8 = r12.delete(r8, r0, r13);	 Catch:{ SQLiteException -> 0x01dc }
        r14 = r14 + r8;
        r8 = "raw_events";
        r8 = r12.delete(r8, r0, r13);	 Catch:{ SQLiteException -> 0x01dc }
        r14 = r14 + r8;
        r8 = "raw_events_metadata";
        r8 = r12.delete(r8, r0, r13);	 Catch:{ SQLiteException -> 0x01dc }
        r14 = r14 + r8;
        r8 = "event_filters";
        r8 = r12.delete(r8, r0, r13);	 Catch:{ SQLiteException -> 0x01dc }
        r14 = r14 + r8;
        r8 = "property_filters";
        r8 = r12.delete(r8, r0, r13);	 Catch:{ SQLiteException -> 0x01dc }
        r14 = r14 + r8;
        r8 = "audience_filter_values";
        r0 = r12.delete(r8, r0, r13);	 Catch:{ SQLiteException -> 0x01dc }
        r14 = r14 + r0;
        if (r14 <= 0) goto L_0x01f1;
    L_0x01ca:
        r0 = r11.zzab();	 Catch:{ SQLiteException -> 0x01dc }
        r0 = r0.zzgs();	 Catch:{ SQLiteException -> 0x01dc }
        r8 = "Deleted application data. app, records";
        r12 = java.lang.Integer.valueOf(r14);	 Catch:{ SQLiteException -> 0x01dc }
        r0.zza(r8, r7, r12);	 Catch:{ SQLiteException -> 0x01dc }
        goto L_0x01f1;
    L_0x01dc:
        r0 = move-exception;
        goto L_0x01e0;
    L_0x01de:
        r0 = move-exception;
        r15 = 0;
    L_0x01e0:
        r8 = r11.zzab();	 Catch:{ all -> 0x04d3 }
        r8 = r8.zzgk();	 Catch:{ all -> 0x04d3 }
        r11 = "Error deleting application data. appId, error";
        r7 = com.google.android.gms.measurement.internal.zzef.zzam(r7);	 Catch:{ all -> 0x04d3 }
        r8.zza(r11, r7, r0);	 Catch:{ all -> 0x04d3 }
    L_0x01f1:
        r7 = 0;
        goto L_0x01f4;
    L_0x01f3:
        r15 = 0;
    L_0x01f4:
        if (r7 == 0) goto L_0x0261;
    L_0x01f6:
        r11 = r7.zzam();	 Catch:{ all -> 0x04d3 }
        r13 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0 = "_pv";
        r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r8 == 0) goto L_0x022e;
    L_0x0203:
        r11 = r7.zzam();	 Catch:{ all -> 0x04d3 }
        r13 = r2.zzcn;	 Catch:{ all -> 0x04d3 }
        r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r8 == 0) goto L_0x0261;
    L_0x020d:
        r8 = new android.os.Bundle;	 Catch:{ all -> 0x04d3 }
        r8.<init>();	 Catch:{ all -> 0x04d3 }
        r7 = r7.zzal();	 Catch:{ all -> 0x04d3 }
        r8.putString(r0, r7);	 Catch:{ all -> 0x04d3 }
        r0 = new com.google.android.gms.measurement.internal.zzai;	 Catch:{ all -> 0x04d3 }
        r12 = "_au";
        r13 = new com.google.android.gms.measurement.internal.zzah;	 Catch:{ all -> 0x04d3 }
        r13.<init>(r8);	 Catch:{ all -> 0x04d3 }
        r14 = "auto";
        r11 = r0;
        r8 = 0;
        r15 = r9;
        r11.<init>(r12, r13, r14, r15);	 Catch:{ all -> 0x04d3 }
        r1.zzc(r0, r2);	 Catch:{ all -> 0x04d3 }
        goto L_0x0262;
    L_0x022e:
        r8 = 0;
        r11 = r7.zzal();	 Catch:{ all -> 0x04d3 }
        if (r11 == 0) goto L_0x0262;
    L_0x0235:
        r11 = r7.zzal();	 Catch:{ all -> 0x04d3 }
        r12 = r2.zzcm;	 Catch:{ all -> 0x04d3 }
        r11 = r11.equals(r12);	 Catch:{ all -> 0x04d3 }
        if (r11 != 0) goto L_0x0262;
    L_0x0241:
        r11 = new android.os.Bundle;	 Catch:{ all -> 0x04d3 }
        r11.<init>();	 Catch:{ all -> 0x04d3 }
        r7 = r7.zzal();	 Catch:{ all -> 0x04d3 }
        r11.putString(r0, r7);	 Catch:{ all -> 0x04d3 }
        r0 = new com.google.android.gms.measurement.internal.zzai;	 Catch:{ all -> 0x04d3 }
        r12 = "_au";
        r13 = new com.google.android.gms.measurement.internal.zzah;	 Catch:{ all -> 0x04d3 }
        r13.<init>(r11);	 Catch:{ all -> 0x04d3 }
        r14 = "auto";
        r11 = r0;
        r15 = r9;
        r11.<init>(r12, r13, r14, r15);	 Catch:{ all -> 0x04d3 }
        r1.zzc(r0, r2);	 Catch:{ all -> 0x04d3 }
        goto L_0x0262;
    L_0x0261:
        r8 = 0;
    L_0x0262:
        r21.zzg(r22);	 Catch:{ all -> 0x04d3 }
        if (r6 != 0) goto L_0x0274;
    L_0x0267:
        r0 = r21.zzgy();	 Catch:{ all -> 0x04d3 }
        r7 = r2.packageName;	 Catch:{ all -> 0x04d3 }
        r11 = "_f";
        r0 = r0.zzc(r7, r11);	 Catch:{ all -> 0x04d3 }
        goto L_0x0284;
    L_0x0274:
        if (r6 != r3) goto L_0x0283;
    L_0x0276:
        r0 = r21.zzgy();	 Catch:{ all -> 0x04d3 }
        r7 = r2.packageName;	 Catch:{ all -> 0x04d3 }
        r11 = "_v";
        r0 = r0.zzc(r7, r11);	 Catch:{ all -> 0x04d3 }
        goto L_0x0284;
    L_0x0283:
        r0 = 0;
    L_0x0284:
        if (r0 != 0) goto L_0x04a8;
    L_0x0286:
        r11 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
        r13 = r9 / r11;
        r15 = 1;
        r13 = r13 + r15;
        r13 = r13 * r11;
        r0 = "_dac";
        r7 = "_r";
        r15 = "_c";
        r12 = "_et";
        if (r6 != 0) goto L_0x040b;
    L_0x029a:
        r6 = new com.google.android.gms.measurement.internal.zzjn;	 Catch:{ all -> 0x04d3 }
        r16 = "_fot";
        r18 = java.lang.Long.valueOf(r13);	 Catch:{ all -> 0x04d3 }
        r20 = "auto";
        r11 = r6;
        r13 = r12;
        r12 = r16;
        r3 = r13;
        r13 = r9;
        r8 = r15;
        r15 = r18;
        r16 = r20;
        r11.<init>(r12, r13, r15, r16);	 Catch:{ all -> 0x04d3 }
        r1.zzb(r6, r2);	 Catch:{ all -> 0x04d3 }
        r6 = r1.zzj;	 Catch:{ all -> 0x04d3 }
        r6 = r6.zzad();	 Catch:{ all -> 0x04d3 }
        r11 = r2.zzcg;	 Catch:{ all -> 0x04d3 }
        r6 = r6.zzt(r11);	 Catch:{ all -> 0x04d3 }
        if (r6 == 0) goto L_0x02d1;
    L_0x02c3:
        r21.zzo();	 Catch:{ all -> 0x04d3 }
        r6 = r1.zzj;	 Catch:{ all -> 0x04d3 }
        r6 = r6.zzht();	 Catch:{ all -> 0x04d3 }
        r11 = r2.packageName;	 Catch:{ all -> 0x04d3 }
        r6.zzat(r11);	 Catch:{ all -> 0x04d3 }
    L_0x02d1:
        r21.zzo();	 Catch:{ all -> 0x04d3 }
        r21.zzjj();	 Catch:{ all -> 0x04d3 }
        r6 = new android.os.Bundle;	 Catch:{ all -> 0x04d3 }
        r6.<init>();	 Catch:{ all -> 0x04d3 }
        r11 = 1;
        r6.putLong(r8, r11);	 Catch:{ all -> 0x04d3 }
        r6.putLong(r7, r11);	 Catch:{ all -> 0x04d3 }
        r7 = 0;
        r6.putLong(r5, r7);	 Catch:{ all -> 0x04d3 }
        r6.putLong(r4, r7);	 Catch:{ all -> 0x04d3 }
        r15 = r19;
        r6.putLong(r15, r7);	 Catch:{ all -> 0x04d3 }
        r11 = "_sysu";
        r6.putLong(r11, r7);	 Catch:{ all -> 0x04d3 }
        r7 = r1.zzj;	 Catch:{ all -> 0x04d3 }
        r7 = r7.zzad();	 Catch:{ all -> 0x04d3 }
        r8 = r2.packageName;	 Catch:{ all -> 0x04d3 }
        r7 = r7.zzz(r8);	 Catch:{ all -> 0x04d3 }
        if (r7 == 0) goto L_0x030a;
    L_0x0304:
        r7 = 1;
        r6.putLong(r3, r7);	 Catch:{ all -> 0x04d3 }
        goto L_0x030c;
    L_0x030a:
        r7 = 1;
    L_0x030c:
        r11 = r2.zzdt;	 Catch:{ all -> 0x04d3 }
        if (r11 == 0) goto L_0x0313;
    L_0x0310:
        r6.putLong(r0, r7);	 Catch:{ all -> 0x04d3 }
    L_0x0313:
        r0 = r1.zzj;	 Catch:{ all -> 0x04d3 }
        r0 = r0.getContext();	 Catch:{ all -> 0x04d3 }
        r0 = r0.getPackageManager();	 Catch:{ all -> 0x04d3 }
        if (r0 != 0) goto L_0x0336;
    L_0x031f:
        r0 = r1.zzj;	 Catch:{ all -> 0x04d3 }
        r0 = r0.zzab();	 Catch:{ all -> 0x04d3 }
        r0 = r0.zzgk();	 Catch:{ all -> 0x04d3 }
        r5 = "PackageManager is null, first open report might be inaccurate. appId";
        r7 = r2.packageName;	 Catch:{ all -> 0x04d3 }
        r7 = com.google.android.gms.measurement.internal.zzef.zzam(r7);	 Catch:{ all -> 0x04d3 }
        r0.zza(r5, r7);	 Catch:{ all -> 0x04d3 }
        goto L_0x03d9;
    L_0x0336:
        r0 = r1.zzj;	 Catch:{ NameNotFoundException -> 0x0348 }
        r0 = r0.getContext();	 Catch:{ NameNotFoundException -> 0x0348 }
        r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0);	 Catch:{ NameNotFoundException -> 0x0348 }
        r7 = r2.packageName;	 Catch:{ NameNotFoundException -> 0x0348 }
        r8 = 0;
        r0 = r0.getPackageInfo(r7, r8);	 Catch:{ NameNotFoundException -> 0x0348 }
        goto L_0x035f;
    L_0x0348:
        r0 = move-exception;
        r7 = r1.zzj;	 Catch:{ all -> 0x04d3 }
        r7 = r7.zzab();	 Catch:{ all -> 0x04d3 }
        r7 = r7.zzgk();	 Catch:{ all -> 0x04d3 }
        r8 = "Package info is null, first open report might be inaccurate. appId";
        r11 = r2.packageName;	 Catch:{ all -> 0x04d3 }
        r11 = com.google.android.gms.measurement.internal.zzef.zzam(r11);	 Catch:{ all -> 0x04d3 }
        r7.zza(r8, r11, r0);	 Catch:{ all -> 0x04d3 }
        r0 = 0;
    L_0x035f:
        if (r0 == 0) goto L_0x0395;
    L_0x0361:
        r7 = r0.firstInstallTime;	 Catch:{ all -> 0x04d3 }
        r11 = 0;
        r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
        if (r13 == 0) goto L_0x0395;
    L_0x0369:
        r7 = r0.firstInstallTime;	 Catch:{ all -> 0x04d3 }
        r11 = r0.lastUpdateTime;	 Catch:{ all -> 0x04d3 }
        r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
        if (r0 == 0) goto L_0x0378;
    L_0x0371:
        r7 = 1;
        r6.putLong(r5, r7);	 Catch:{ all -> 0x04d3 }
        r0 = 0;
        goto L_0x0379;
    L_0x0378:
        r0 = 1;
    L_0x0379:
        r5 = new com.google.android.gms.measurement.internal.zzjn;	 Catch:{ all -> 0x04d3 }
        r12 = "_fi";
        if (r0 == 0) goto L_0x0382;
    L_0x037f:
        r7 = 1;
        goto L_0x0384;
    L_0x0382:
        r7 = 0;
    L_0x0384:
        r0 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x04d3 }
        r16 = "auto";
        r11 = r5;
        r13 = r9;
        r7 = r15;
        r15 = r0;
        r11.<init>(r12, r13, r15, r16);	 Catch:{ all -> 0x04d3 }
        r1.zzb(r5, r2);	 Catch:{ all -> 0x04d3 }
        goto L_0x0396;
    L_0x0395:
        r7 = r15;
    L_0x0396:
        r0 = r1.zzj;	 Catch:{ NameNotFoundException -> 0x03a8 }
        r0 = r0.getContext();	 Catch:{ NameNotFoundException -> 0x03a8 }
        r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0);	 Catch:{ NameNotFoundException -> 0x03a8 }
        r5 = r2.packageName;	 Catch:{ NameNotFoundException -> 0x03a8 }
        r8 = 0;
        r8 = r0.getApplicationInfo(r5, r8);	 Catch:{ NameNotFoundException -> 0x03a8 }
        goto L_0x03bf;
    L_0x03a8:
        r0 = move-exception;
        r5 = r1.zzj;	 Catch:{ all -> 0x04d3 }
        r5 = r5.zzab();	 Catch:{ all -> 0x04d3 }
        r5 = r5.zzgk();	 Catch:{ all -> 0x04d3 }
        r8 = "Application info is null, first open report might be inaccurate. appId";
        r11 = r2.packageName;	 Catch:{ all -> 0x04d3 }
        r11 = com.google.android.gms.measurement.internal.zzef.zzam(r11);	 Catch:{ all -> 0x04d3 }
        r5.zza(r8, r11, r0);	 Catch:{ all -> 0x04d3 }
        r8 = 0;
    L_0x03bf:
        if (r8 == 0) goto L_0x03d9;
    L_0x03c1:
        r0 = r8.flags;	 Catch:{ all -> 0x04d3 }
        r5 = 1;
        r0 = r0 & r5;
        if (r0 == 0) goto L_0x03cc;
    L_0x03c7:
        r11 = 1;
        r6.putLong(r7, r11);	 Catch:{ all -> 0x04d3 }
    L_0x03cc:
        r0 = r8.flags;	 Catch:{ all -> 0x04d3 }
        r0 = r0 & 128;
        if (r0 == 0) goto L_0x03d9;
    L_0x03d2:
        r0 = "_sysu";
        r7 = 1;
        r6.putLong(r0, r7);	 Catch:{ all -> 0x04d3 }
    L_0x03d9:
        r0 = r21.zzgy();	 Catch:{ all -> 0x04d3 }
        r5 = r2.packageName;	 Catch:{ all -> 0x04d3 }
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5);	 Catch:{ all -> 0x04d3 }
        r0.zzo();	 Catch:{ all -> 0x04d3 }
        r0.zzbi();	 Catch:{ all -> 0x04d3 }
        r7 = "first_open_count";
        r7 = r0.zzj(r5, r7);	 Catch:{ all -> 0x04d3 }
        r11 = 0;
        r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
        if (r0 < 0) goto L_0x03f7;
    L_0x03f4:
        r6.putLong(r4, r7);	 Catch:{ all -> 0x04d3 }
    L_0x03f7:
        r0 = new com.google.android.gms.measurement.internal.zzai;	 Catch:{ all -> 0x04d3 }
        r12 = "_f";
        r13 = new com.google.android.gms.measurement.internal.zzah;	 Catch:{ all -> 0x04d3 }
        r13.<init>(r6);	 Catch:{ all -> 0x04d3 }
        r14 = "auto";
        r11 = r0;
        r15 = r9;
        r11.<init>(r12, r13, r14, r15);	 Catch:{ all -> 0x04d3 }
        r1.zzc(r0, r2);	 Catch:{ all -> 0x04d3 }
        goto L_0x0465;
    L_0x040b:
        r3 = r12;
        r8 = r15;
        r4 = 1;
        if (r6 != r4) goto L_0x0465;
    L_0x0410:
        r4 = new com.google.android.gms.measurement.internal.zzjn;	 Catch:{ all -> 0x04d3 }
        r12 = "_fvt";
        r15 = java.lang.Long.valueOf(r13);	 Catch:{ all -> 0x04d3 }
        r16 = "auto";
        r11 = r4;
        r13 = r9;
        r11.<init>(r12, r13, r15, r16);	 Catch:{ all -> 0x04d3 }
        r1.zzb(r4, r2);	 Catch:{ all -> 0x04d3 }
        r21.zzo();	 Catch:{ all -> 0x04d3 }
        r21.zzjj();	 Catch:{ all -> 0x04d3 }
        r4 = new android.os.Bundle;	 Catch:{ all -> 0x04d3 }
        r4.<init>();	 Catch:{ all -> 0x04d3 }
        r5 = 1;
        r4.putLong(r8, r5);	 Catch:{ all -> 0x04d3 }
        r4.putLong(r7, r5);	 Catch:{ all -> 0x04d3 }
        r5 = r1.zzj;	 Catch:{ all -> 0x04d3 }
        r5 = r5.zzad();	 Catch:{ all -> 0x04d3 }
        r6 = r2.packageName;	 Catch:{ all -> 0x04d3 }
        r5 = r5.zzz(r6);	 Catch:{ all -> 0x04d3 }
        if (r5 == 0) goto L_0x0449;
    L_0x0443:
        r5 = 1;
        r4.putLong(r3, r5);	 Catch:{ all -> 0x04d3 }
        goto L_0x044b;
    L_0x0449:
        r5 = 1;
    L_0x044b:
        r7 = r2.zzdt;	 Catch:{ all -> 0x04d3 }
        if (r7 == 0) goto L_0x0452;
    L_0x044f:
        r4.putLong(r0, r5);	 Catch:{ all -> 0x04d3 }
    L_0x0452:
        r0 = new com.google.android.gms.measurement.internal.zzai;	 Catch:{ all -> 0x04d3 }
        r12 = "_v";
        r13 = new com.google.android.gms.measurement.internal.zzah;	 Catch:{ all -> 0x04d3 }
        r13.<init>(r4);	 Catch:{ all -> 0x04d3 }
        r14 = "auto";
        r11 = r0;
        r15 = r9;
        r11.<init>(r12, r13, r14, r15);	 Catch:{ all -> 0x04d3 }
        r1.zzc(r0, r2);	 Catch:{ all -> 0x04d3 }
    L_0x0465:
        r0 = r1.zzj;	 Catch:{ all -> 0x04d3 }
        r0 = r0.zzad();	 Catch:{ all -> 0x04d3 }
        r4 = r2.packageName;	 Catch:{ all -> 0x04d3 }
        r5 = com.google.android.gms.measurement.internal.zzak.zzii;	 Catch:{ all -> 0x04d3 }
        r0 = r0.zze(r4, r5);	 Catch:{ all -> 0x04d3 }
        if (r0 != 0) goto L_0x04c4;
    L_0x0475:
        r0 = new android.os.Bundle;	 Catch:{ all -> 0x04d3 }
        r0.<init>();	 Catch:{ all -> 0x04d3 }
        r4 = 1;
        r0.putLong(r3, r4);	 Catch:{ all -> 0x04d3 }
        r3 = r1.zzj;	 Catch:{ all -> 0x04d3 }
        r3 = r3.zzad();	 Catch:{ all -> 0x04d3 }
        r4 = r2.packageName;	 Catch:{ all -> 0x04d3 }
        r3 = r3.zzz(r4);	 Catch:{ all -> 0x04d3 }
        if (r3 == 0) goto L_0x0494;
    L_0x048d:
        r3 = "_fr";
        r4 = 1;
        r0.putLong(r3, r4);	 Catch:{ all -> 0x04d3 }
    L_0x0494:
        r3 = new com.google.android.gms.measurement.internal.zzai;	 Catch:{ all -> 0x04d3 }
        r12 = "_e";
        r13 = new com.google.android.gms.measurement.internal.zzah;	 Catch:{ all -> 0x04d3 }
        r13.<init>(r0);	 Catch:{ all -> 0x04d3 }
        r14 = "auto";
        r11 = r3;
        r15 = r9;
        r11.<init>(r12, r13, r14, r15);	 Catch:{ all -> 0x04d3 }
        r1.zzc(r3, r2);	 Catch:{ all -> 0x04d3 }
        goto L_0x04c4;
    L_0x04a8:
        r0 = r2.zzdq;	 Catch:{ all -> 0x04d3 }
        if (r0 == 0) goto L_0x04c4;
    L_0x04ac:
        r0 = new android.os.Bundle;	 Catch:{ all -> 0x04d3 }
        r0.<init>();	 Catch:{ all -> 0x04d3 }
        r3 = new com.google.android.gms.measurement.internal.zzai;	 Catch:{ all -> 0x04d3 }
        r12 = "_cd";
        r13 = new com.google.android.gms.measurement.internal.zzah;	 Catch:{ all -> 0x04d3 }
        r13.<init>(r0);	 Catch:{ all -> 0x04d3 }
        r14 = "auto";
        r11 = r3;
        r15 = r9;
        r11.<init>(r12, r13, r14, r15);	 Catch:{ all -> 0x04d3 }
        r1.zzc(r3, r2);	 Catch:{ all -> 0x04d3 }
    L_0x04c4:
        r0 = r21.zzgy();	 Catch:{ all -> 0x04d3 }
        r0.setTransactionSuccessful();	 Catch:{ all -> 0x04d3 }
        r0 = r21.zzgy();
        r0.endTransaction();
        return;
    L_0x04d3:
        r0 = move-exception;
        r2 = r21.zzgy();
        r2.endTransaction();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjg.zzf(com.google.android.gms.measurement.internal.zzn):void");
    }

    @WorkerThread
    private final zzn zzbi(String str) {
        String str2 = str;
        zzf zzab = zzgy().zzab(str2);
        if (zzab == null || TextUtils.isEmpty(zzab.zzal())) {
            this.zzj.zzab().zzgr().zza("No app data available; dropping", str2);
            return null;
        }
        Boolean zzc = zzc(zzab);
        if (zzc == null || zzc.booleanValue()) {
            zzf zzf = zzab;
            return new zzn(str, zzab.getGmpAppId(), zzab.zzal(), zzab.zzam(), zzab.zzan(), zzab.zzao(), zzab.zzap(), null, zzab.isMeasurementEnabled(), false, zzab.getFirebaseInstanceId(), zzf.zzbd(), 0, 0, zzf.zzbe(), zzf.zzbf(), false, zzf.zzah(), zzf.zzbg(), zzf.zzaq(), zzf.zzbh());
        }
        this.zzj.zzab().zzgk().zza("App version does not match; dropping. appId", zzef.zzam(str));
        return null;
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zze(zzq zzq) {
        zzn zzbi = zzbi(zzq.packageName);
        if (zzbi != null) {
            zzb(zzq, zzbi);
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzb(zzq zzq, zzn zzn) {
        Preconditions.checkNotNull(zzq);
        Preconditions.checkNotEmpty(zzq.packageName);
        Preconditions.checkNotNull(zzq.origin);
        Preconditions.checkNotNull(zzq.zzdw);
        Preconditions.checkNotEmpty(zzq.zzdw.name);
        zzo();
        zzjj();
        if (!TextUtils.isEmpty(zzn.zzcg) || !TextUtils.isEmpty(zzn.zzcu)) {
            if (zzn.zzcq) {
                zzq zzq2 = new zzq(zzq);
                boolean z = false;
                zzq2.active = false;
                zzgy().beginTransaction();
                try {
                    zzq zzf = zzgy().zzf(zzq2.packageName, zzq2.zzdw.name);
                    if (!(zzf == null || zzf.origin.equals(zzq2.origin))) {
                        this.zzj.zzab().zzgn().zza("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzj.zzy().zzal(zzq2.zzdw.name), zzq2.origin, zzf.origin);
                    }
                    if (zzf != null && zzf.active) {
                        zzq2.origin = zzf.origin;
                        zzq2.creationTimestamp = zzf.creationTimestamp;
                        zzq2.triggerTimeout = zzf.triggerTimeout;
                        zzq2.triggerEventName = zzf.triggerEventName;
                        zzq2.zzdy = zzf.zzdy;
                        zzq2.active = zzf.active;
                        zzq2.zzdw = new zzjn(zzq2.zzdw.name, zzf.zzdw.zztr, zzq2.zzdw.getValue(), zzf.zzdw.origin);
                    } else if (TextUtils.isEmpty(zzq2.triggerEventName)) {
                        zzq2.zzdw = new zzjn(zzq2.zzdw.name, zzq2.creationTimestamp, zzq2.zzdw.getValue(), zzq2.zzdw.origin);
                        zzq2.active = true;
                        z = true;
                    }
                    if (zzq2.active) {
                        zzjn zzjn = zzq2.zzdw;
                        zzjp zzjp = new zzjp(zzq2.packageName, zzq2.origin, zzjn.name, zzjn.zztr, zzjn.getValue());
                        if (zzgy().zza(zzjp)) {
                            this.zzj.zzab().zzgr().zza("User property updated immediately", zzq2.packageName, this.zzj.zzy().zzal(zzjp.name), zzjp.value);
                        } else {
                            this.zzj.zzab().zzgk().zza("(2)Too many active user properties, ignoring", zzef.zzam(zzq2.packageName), this.zzj.zzy().zzal(zzjp.name), zzjp.value);
                        }
                        if (z && zzq2.zzdy != null) {
                            zzd(new zzai(zzq2.zzdy, zzq2.creationTimestamp), zzn);
                        }
                    }
                    if (zzgy().zza(zzq2)) {
                        this.zzj.zzab().zzgr().zza("Conditional property added", zzq2.packageName, this.zzj.zzy().zzal(zzq2.zzdw.name), zzq2.zzdw.getValue());
                    } else {
                        this.zzj.zzab().zzgk().zza("Too many conditional properties, ignoring", zzef.zzam(zzq2.packageName), this.zzj.zzy().zzal(zzq2.zzdw.name), zzq2.zzdw.getValue());
                    }
                    zzgy().setTransactionSuccessful();
                } finally {
                    zzgy().endTransaction();
                }
            } else {
                zzg(zzn);
            }
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzf(zzq zzq) {
        zzn zzbi = zzbi(zzq.packageName);
        if (zzbi != null) {
            zzc(zzq, zzbi);
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zzc(zzq zzq, zzn zzn) {
        Preconditions.checkNotNull(zzq);
        Preconditions.checkNotEmpty(zzq.packageName);
        Preconditions.checkNotNull(zzq.zzdw);
        Preconditions.checkNotEmpty(zzq.zzdw.name);
        zzo();
        zzjj();
        if (!TextUtils.isEmpty(zzn.zzcg) || !TextUtils.isEmpty(zzn.zzcu)) {
            if (zzn.zzcq) {
                zzgy().beginTransaction();
                try {
                    zzg(zzn);
                    zzq zzf = zzgy().zzf(zzq.packageName, zzq.zzdw.name);
                    if (zzf != null) {
                        this.zzj.zzab().zzgr().zza("Removing conditional user property", zzq.packageName, this.zzj.zzy().zzal(zzq.zzdw.name));
                        zzgy().zzg(zzq.packageName, zzq.zzdw.name);
                        if (zzf.active) {
                            zzgy().zzd(zzq.packageName, zzq.zzdw.name);
                        }
                        if (zzq.zzdz != null) {
                            Bundle bundle = null;
                            if (zzq.zzdz.zzfq != null) {
                                bundle = zzq.zzdz.zzfq.zzcv();
                            }
                            Bundle bundle2 = bundle;
                            zzd(this.zzj.zzz().zza(zzq.packageName, zzq.zzdz.name, bundle2, zzf.origin, zzq.zzdz.zzfu, true, false), zzn);
                        }
                    } else {
                        this.zzj.zzab().zzgn().zza("Conditional user property doesn't exist", zzef.zzam(zzq.packageName), this.zzj.zzy().zzal(zzq.zzdw.name));
                    }
                    zzgy().setTransactionSuccessful();
                } finally {
                    zzgy().endTransaction();
                }
            } else {
                zzg(zzn);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018e  */
    @androidx.annotation.WorkerThread
    private final com.google.android.gms.measurement.internal.zzf zzg(com.google.android.gms.measurement.internal.zzn r11) {
        /*
        r10 = this;
        r10.zzo();
        r10.zzjj();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r11);
        r0 = r11.packageName;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0);
        r0 = r10.zzgy();
        r1 = r11.packageName;
        r0 = r0.zzab(r1);
        r1 = r10.zzj;
        r1 = r1.zzac();
        r2 = r11.packageName;
        r1 = r1.zzaq(r2);
        r2 = 1;
        if (r0 != 0) goto L_0x0042;
    L_0x0027:
        r0 = new com.google.android.gms.measurement.internal.zzf;
        r3 = r10.zzj;
        r4 = r11.packageName;
        r0.<init>(r3, r4);
        r3 = r10.zzj;
        r3 = r3.zzz();
        r3 = r3.zzjy();
        r0.zza(r3);
        r0.zzd(r1);
    L_0x0040:
        r1 = 1;
        goto L_0x005e;
    L_0x0042:
        r3 = r0.zzai();
        r3 = r1.equals(r3);
        if (r3 != 0) goto L_0x005d;
    L_0x004c:
        r0.zzd(r1);
        r1 = r10.zzj;
        r1 = r1.zzz();
        r1 = r1.zzjy();
        r0.zza(r1);
        goto L_0x0040;
    L_0x005d:
        r1 = 0;
    L_0x005e:
        r3 = r11.zzcg;
        r4 = r0.getGmpAppId();
        r3 = android.text.TextUtils.equals(r3, r4);
        if (r3 != 0) goto L_0x0070;
    L_0x006a:
        r1 = r11.zzcg;
        r0.zzb(r1);
        r1 = 1;
    L_0x0070:
        r3 = r11.zzcu;
        r4 = r0.zzah();
        r3 = android.text.TextUtils.equals(r3, r4);
        if (r3 != 0) goto L_0x0082;
    L_0x007c:
        r1 = r11.zzcu;
        r0.zzc(r1);
        r1 = 1;
    L_0x0082:
        r3 = r11.zzci;
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x009c;
    L_0x008a:
        r3 = r11.zzci;
        r4 = r0.getFirebaseInstanceId();
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x009c;
    L_0x0096:
        r1 = r11.zzci;
        r0.zze(r1);
        r1 = 1;
    L_0x009c:
        r3 = r11.zzr;
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x00b4;
    L_0x00a4:
        r3 = r11.zzr;
        r7 = r0.zzao();
        r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r9 == 0) goto L_0x00b4;
    L_0x00ae:
        r3 = r11.zzr;
        r0.zzh(r3);
        r1 = 1;
    L_0x00b4:
        r3 = r11.zzcm;
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x00ce;
    L_0x00bc:
        r3 = r11.zzcm;
        r4 = r0.zzal();
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x00ce;
    L_0x00c8:
        r1 = r11.zzcm;
        r0.zzf(r1);
        r1 = 1;
    L_0x00ce:
        r3 = r11.zzcn;
        r7 = r0.zzam();
        r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r9 == 0) goto L_0x00de;
    L_0x00d8:
        r3 = r11.zzcn;
        r0.zzg(r3);
        r1 = 1;
    L_0x00de:
        r3 = r11.zzco;
        if (r3 == 0) goto L_0x00f4;
    L_0x00e2:
        r3 = r11.zzco;
        r4 = r0.zzan();
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x00f4;
    L_0x00ee:
        r1 = r11.zzco;
        r0.zzg(r1);
        r1 = 1;
    L_0x00f4:
        r3 = r11.zzcp;
        r7 = r0.zzap();
        r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r9 == 0) goto L_0x0104;
    L_0x00fe:
        r3 = r11.zzcp;
        r0.zzi(r3);
        r1 = 1;
    L_0x0104:
        r3 = r11.zzcq;
        r4 = r0.isMeasurementEnabled();
        if (r3 == r4) goto L_0x0112;
    L_0x010c:
        r1 = r11.zzcq;
        r0.setMeasurementEnabled(r1);
        r1 = 1;
    L_0x0112:
        r3 = r11.zzdp;
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x012c;
    L_0x011a:
        r3 = r11.zzdp;
        r4 = r0.zzbb();
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x012c;
    L_0x0126:
        r1 = r11.zzdp;
        r0.zzh(r1);
        r1 = 1;
    L_0x012c:
        r3 = r11.zzcr;
        r7 = r0.zzbd();
        r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r9 == 0) goto L_0x013c;
    L_0x0136:
        r3 = r11.zzcr;
        r0.zzt(r3);
        r1 = 1;
    L_0x013c:
        r3 = r11.zzcs;
        r4 = r0.zzbe();
        if (r3 == r4) goto L_0x014a;
    L_0x0144:
        r1 = r11.zzcs;
        r0.zzb(r1);
        r1 = 1;
    L_0x014a:
        r3 = r11.zzct;
        r4 = r0.zzbf();
        if (r3 == r4) goto L_0x0158;
    L_0x0152:
        r1 = r11.zzct;
        r0.zzc(r1);
        r1 = 1;
    L_0x0158:
        r3 = r10.zzj;
        r3 = r3.zzad();
        r4 = r11.packageName;
        r7 = com.google.android.gms.measurement.internal.zzak.zzij;
        r3 = r3.zze(r4, r7);
        if (r3 == 0) goto L_0x0176;
    L_0x0168:
        r3 = r11.zzcv;
        r4 = r0.zzbg();
        if (r3 == r4) goto L_0x0176;
    L_0x0170:
        r1 = r11.zzcv;
        r0.zza(r1);
        r1 = 1;
    L_0x0176:
        r3 = r11.zzs;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x018c;
    L_0x017c:
        r3 = r11.zzs;
        r5 = r0.zzaq();
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x018c;
    L_0x0186:
        r3 = r11.zzs;
        r0.zzj(r3);
        r1 = 1;
    L_0x018c:
        if (r1 == 0) goto L_0x0195;
    L_0x018e:
        r11 = r10.zzgy();
        r11.zza(r0);
    L_0x0195:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjg.zzg(com.google.android.gms.measurement.internal.zzn):com.google.android.gms.measurement.internal.zzf");
    }

    /* Access modifiers changed, original: final */
    public final String zzh(zzn zzn) {
        try {
            return (String) this.zzj.zzaa().zza(new zzjk(this, zzn)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.zzj.zzab().zzgk().zza("Failed to get app instance id. appId", zzef.zzam(zzn.packageName), e);
            return null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzj(boolean z) {
        zzjn();
    }
}
