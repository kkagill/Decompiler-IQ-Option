package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.a.b;
import com.google.firebase.a.d;
import com.google.firebase.c.g;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseInstanceId {
    private static final long acx = TimeUnit.HOURS.toSeconds(8);
    private static w acy;
    @VisibleForTesting
    private static ScheduledExecutorService acz;
    private final Executor acA;
    private final FirebaseApp acB;
    private final o acC;
    private b acD;
    private final r acE;
    private final aa acF;
    private final a acG;
    private boolean zzaz;

    private class a {
        private final boolean acH = zzu();
        private final d acI;
        @Nullable
        private b<com.google.firebase.a> acJ;
        @Nullable
        private Boolean acK = wx();

        a(d dVar) {
            this.acI = dVar;
            if (this.acK == null && this.acH) {
                this.acJ = new ar(this);
                dVar.a(com.google.firebase.a.class, this.acJ);
            }
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized boolean isEnabled() {
            if (this.acK == null) {
                return this.acH && FirebaseInstanceId.this.acB.isDataCollectionDefaultEnabled();
            } else {
                return this.acK.booleanValue();
            }
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized void setEnabled(boolean z) {
            if (this.acJ != null) {
                this.acI.b(com.google.firebase.a.class, this.acJ);
                this.acJ = null;
            }
            Editor edit = FirebaseInstanceId.this.acB.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseInstanceId.this.zzh();
            }
            this.acK = Boolean.valueOf(z);
        }

        @Nullable
        private final Boolean wx() {
            String str = "firebase_messaging_auto_init_enabled";
            Context applicationContext = FirebaseInstanceId.this.acB.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            String str2 = "auto_init";
            if (sharedPreferences.contains(str2)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
            return null;
        }

        private final boolean zzu() {
            try {
                Class.forName("com.google.firebase.messaging.a");
                return true;
            } catch (ClassNotFoundException unused) {
                Context applicationContext = FirebaseInstanceId.this.acB.getApplicationContext();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(applicationContext.getPackageName());
                ResolveInfo resolveService = applicationContext.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }
    }

    public static FirebaseInstanceId getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    @Keep
    public static FirebaseInstanceId getInstance(@NonNull FirebaseApp firebaseApp) {
        return (FirebaseInstanceId) firebaseApp.get(FirebaseInstanceId.class);
    }

    FirebaseInstanceId(FirebaseApp firebaseApp, d dVar, g gVar) {
        this(firebaseApp, new o(firebaseApp.getApplicationContext()), ai.wP(), ai.wP(), dVar, gVar);
    }

    private FirebaseInstanceId(FirebaseApp firebaseApp, o oVar, Executor executor, Executor executor2, d dVar, g gVar) {
        this.zzaz = false;
        if (o.c(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (acy == null) {
                    acy = new w(firebaseApp.getApplicationContext());
                }
            }
            this.acB = firebaseApp;
            this.acC = oVar;
            if (this.acD == null) {
                b bVar = (b) firebaseApp.get(b.class);
                if (bVar == null || !bVar.isAvailable()) {
                    this.acD = new at(firebaseApp, oVar, executor, gVar);
                } else {
                    this.acD = bVar;
                }
            }
            this.acD = this.acD;
            this.acA = executor2;
            this.acF = new aa(acy);
            this.acG = new a(dVar);
            this.acE = new r(executor);
            if (this.acG.isEnabled()) {
                zzh();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    private final void zzh() {
        z wu = wu();
        if (zzr() || a(wu) || this.acF.wL()) {
            startSync();
        }
    }

    /* Access modifiers changed, original: final */
    public final FirebaseApp wt() {
        return this.acB;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void zza(boolean z) {
        this.zzaz = z;
    }

    private final synchronized void startSync() {
        if (!this.zzaz) {
            zza(0);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void zza(long j) {
        a(new y(this, this.acC, this.acF, Math.min(Math.max(30, j << 1), acx)), j);
        this.zzaz = true;
    }

    static void a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (acz == null) {
                acz = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
            }
            acz.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    @WorkerThread
    public String getId() {
        zzh();
        return zzj();
    }

    private static String zzj() {
        return o.a(acy.ce("").getKeyPair());
    }

    public long getCreationTime() {
        return acy.ce("").getCreationTime();
    }

    @NonNull
    public Task<a> getInstanceId() {
        return O(o.c(this.acB), "*");
    }

    private final Task<a> O(String str, String str2) {
        return Tasks.forResult(null).continueWithTask(this.acA, new ap(this, str, cb(str2)));
    }

    @WorkerThread
    public void deleteInstanceId() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            a(this.acD.cc(zzj()));
            zzn();
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    @Deprecated
    @Nullable
    public String getToken() {
        z wu = wu();
        if (this.acD.wy() || a(wu)) {
            startSync();
        }
        return z.b(wu);
    }

    @WorkerThread
    public String getToken(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((a) a(O(str, str2))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* Access modifiers changed, original: final */
    @Nullable
    public final z wu() {
        return P(o.c(this.acB), "*");
    }

    @Nullable
    @VisibleForTesting
    private static z P(String str, String str2) {
        return acy.h("", str, str2);
    }

    /* Access modifiers changed, original: final */
    public final String wv() {
        return getToken(o.c(this.acB), "*");
    }

    private final <T> T a(Task<T> task) {
        try {
            return Tasks.await(task, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    zzn();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @WorkerThread
    public void deleteToken(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            str2 = cb(str2);
            a(this.acD.f(zzj(), z.b(P(str, str2)), str, str2));
            acy.i("", str, str2);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public final synchronized Task<Void> zza(String str) {
        Task zza;
        zza = this.acF.zza(str);
        startSync();
        return zza;
    }

    /* Access modifiers changed, original: final */
    public final void zzb(String str) {
        z wu = wu();
        if (a(wu)) {
            throw new IOException("token not available");
        }
        a(this.acD.e(zzj(), wu.zzbv, str));
    }

    /* Access modifiers changed, original: final */
    public final void zzc(String str) {
        z wu = wu();
        if (a(wu)) {
            throw new IOException("token not available");
        }
        a(this.acD.f(zzj(), wu.zzbv, str));
    }

    static boolean zzm() {
        String str = "FirebaseInstanceId";
        return Log.isLoggable(str, 3) || (VERSION.SDK_INT == 23 && Log.isLoggable(str, 3));
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void zzn() {
        acy.wI();
        if (this.acG.isEnabled()) {
            startSync();
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean ww() {
        return this.acD.isAvailable();
    }

    /* Access modifiers changed, original: final */
    public final void zzp() {
        acy.zzh("");
        startSync();
    }

    @VisibleForTesting
    public final boolean zzq() {
        return this.acG.isEnabled();
    }

    @VisibleForTesting
    public final void zzb(boolean z) {
        this.acG.setEnabled(z);
    }

    private static String cb(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(@Nullable z zVar) {
        return zVar == null || zVar.cg(this.acC.wF());
    }

    /* Access modifiers changed, original: final */
    public final boolean zzr() {
        return this.acD.wy();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Task a(String str, String str2, Task task) {
        String zzj = zzj();
        z P = P(str, str2);
        if (!this.acD.wy() && !a(P)) {
            return Tasks.forResult(new ay(zzj, P.zzbv));
        }
        return this.acE.a(str, str2, new ao(this, zzj, z.b(P), str, str2));
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Task c(String str, String str2, String str3, String str4) {
        return this.acD.e(str, str2, str3, str4).onSuccessTask(this.acA, new aq(this, str3, str4, str));
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Task d(String str, String str2, String str3, String str4) {
        acy.a("", str, str2, str4, this.acC.wF());
        return Tasks.forResult(new ay(str3, str4));
    }
}
