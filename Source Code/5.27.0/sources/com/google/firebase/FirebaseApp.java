package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.firebase.components.f;
import com.google.firebase.components.i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public class FirebaseApp {
    static final Map<String, FirebaseApp> INSTANCES = new ArrayMap();
    private static final List<String> abc = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});
    private static final List<String> abd = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    private static final List<String> abe = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});
    private static final List<String> abf = Arrays.asList(new String[0]);
    private static final Set<String> abg = Collections.emptySet();
    private static final Executor abh = new c();
    private static final Object tH = new Object();
    private final b abi;
    private final i abj;
    private final com.google.firebase.a.c abk;
    private final AtomicBoolean abl = new AtomicBoolean(false);
    private final AtomicBoolean abm = new AtomicBoolean();
    private final AtomicBoolean abn;
    private final List<a> abo = new CopyOnWriteArrayList();
    private final List<Object> abp = new CopyOnWriteArrayList();
    private final String name;
    private final SharedPreferences sA;
    private final Context tF;

    @KeepForSdk
    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    public interface a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    private static class c implements Executor {
        private static final Handler HANDLER = new Handler(Looper.getMainLooper());

        private c() {
        }

        public void execute(@NonNull Runnable runnable) {
            HANDLER.post(runnable);
        }
    }

    @TargetApi(24)
    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    private static class d extends BroadcastReceiver {
        private static AtomicReference<d> abq = new AtomicReference();
        private final Context tF;

        public d(Context context) {
            this.tF = context;
        }

        private static void ax(Context context) {
            if (abq.get() == null) {
                d dVar = new d(context);
                if (abq.compareAndSet(null, dVar)) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.tH) {
                for (FirebaseApp a : FirebaseApp.INSTANCES.values()) {
                    a.vS();
                }
            }
            unregister();
        }

        public void unregister() {
            this.tF.unregisterReceiver(this);
        }
    }

    @TargetApi(14)
    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    private static class b implements BackgroundStateChangeListener {
        private static AtomicReference<b> abq = new AtomicReference();

        private b() {
        }

        private static void av(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (abq.get() == null) {
                    b bVar = new b();
                    if (abq.compareAndSet(null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
                    }
                }
            }
        }

        public void onBackgroundStateChanged(boolean z) {
            synchronized (FirebaseApp.tH) {
                Iterator it = new ArrayList(FirebaseApp.INSTANCES.values()).iterator();
                while (it.hasNext()) {
                    FirebaseApp firebaseApp = (FirebaseApp) it.next();
                    if (firebaseApp.abl.get()) {
                        firebaseApp.al(z);
                    }
                }
            }
        }
    }

    @NonNull
    public Context getApplicationContext() {
        vQ();
        return this.tF;
    }

    @NonNull
    public String getName() {
        vQ();
        return this.name;
    }

    @NonNull
    public b vO() {
        vQ();
        return this.abi;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FirebaseApp) {
            return this.name.equals(((FirebaseApp) obj).getName());
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return Objects.toStringHelper(this).add(ConditionalUserProperty.NAME, this.name).add("options", this.abi).toString();
    }

    @NonNull
    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (tH) {
            firebaseApp = (FirebaseApp) INSTANCES.get("[DEFAULT]");
            if (firebaseApp != null) {
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Default FirebaseApp is not initialized in this process ");
                stringBuilder.append(ProcessUtils.getMyProcessName());
                stringBuilder.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return firebaseApp;
    }

    @Nullable
    public static FirebaseApp au(@NonNull Context context) {
        synchronized (tH) {
            FirebaseApp instance;
            if (INSTANCES.containsKey("[DEFAULT]")) {
                instance = getInstance();
                return instance;
            }
            b az = b.az(context);
            if (az == null) {
                Log.d("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            instance = a(context, az);
            return instance;
        }
    }

    @NonNull
    public static FirebaseApp a(@NonNull Context context, @NonNull b bVar) {
        return a(context, bVar, "[DEFAULT]");
    }

    @NonNull
    public static FirebaseApp a(@NonNull Context context, @NonNull b bVar, @NonNull String str) {
        Object context2;
        FirebaseApp firebaseApp;
        b.av(context2);
        str = bZ(str);
        if (context2.getApplicationContext() != null) {
            context2 = context2.getApplicationContext();
        }
        synchronized (tH) {
            boolean z = !INSTANCES.containsKey(str);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FirebaseApp name ");
            stringBuilder.append(str);
            stringBuilder.append(" already exists!");
            Preconditions.checkState(z, stringBuilder.toString());
            Preconditions.checkNotNull(context2, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context2, str, bVar);
            INSTANCES.put(str, firebaseApp);
        }
        firebaseApp.vS();
        return firebaseApp;
    }

    @KeepForSdk
    public <T> T get(Class<T> cls) {
        vQ();
        return this.abj.get(cls);
    }

    @KeepForSdk
    public boolean isDataCollectionDefaultEnabled() {
        vQ();
        return this.abn.get();
    }

    protected FirebaseApp(Context context, String str, b bVar) {
        this.tF = (Context) Preconditions.checkNotNull(context);
        this.name = Preconditions.checkNotEmpty(str);
        this.abi = (b) Preconditions.checkNotNull(bVar);
        this.sA = context.getSharedPreferences(bY(str), 0);
        this.abn = new AtomicBoolean(vP());
        List wg = f.aA(context).wg();
        this.abj = new i(abh, wg, com.google.firebase.components.b.a(context, Context.class, new Class[0]), com.google.firebase.components.b.a(this, FirebaseApp.class, new Class[0]), com.google.firebase.components.b.a(bVar, b.class, new Class[0]), com.google.firebase.c.f.S("fire-android", ""), com.google.firebase.c.f.S("fire-core", "17.0.0"), com.google.firebase.c.b.xb());
        this.abk = (com.google.firebase.a.c) this.abj.get(com.google.firebase.a.c.class);
    }

    private static String bY(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.google.firebase.common.prefs:");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    private boolean vP() {
        String str = "firebase_data_collection_default_enabled";
        if (this.sA.contains(str)) {
            return this.sA.getBoolean(str, true);
        }
        try {
            PackageManager packageManager = this.tF.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.tF.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                    return applicationInfo.metaData.getBoolean(str);
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return true;
    }

    private void vQ() {
        Preconditions.checkState(this.abm.get() ^ 1, "FirebaseApp was deleted");
    }

    @VisibleForTesting
    @KeepForSdk
    public boolean vR() {
        return "[DEFAULT]".equals(getName());
    }

    private void al(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (a onBackgroundStateChanged : this.abo) {
            onBackgroundStateChanged.onBackgroundStateChanged(z);
        }
    }

    private void vS() {
        boolean isDeviceProtectedStorage = ContextCompat.isDeviceProtectedStorage(this.tF);
        if (isDeviceProtectedStorage) {
            d.ax(this.tF);
        } else {
            this.abj.am(vR());
        }
        a(FirebaseApp.class, this, abc, isDeviceProtectedStorage);
        if (vR()) {
            a(FirebaseApp.class, this, abd, isDeviceProtectedStorage);
            a(Context.class, this.tF, abe, isDeviceProtectedStorage);
        }
    }

    private static String bZ(@NonNull String str) {
        return str.trim();
    }

    private <T> void a(Class<T> cls, T t, Iterable<String> iterable, boolean z) {
        StringBuilder stringBuilder;
        for (String str : iterable) {
            String str2 = "FirebaseApp";
            if (z) {
                try {
                    if (!abf.contains(str)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (abg.contains(str)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(" is missing, but is required. Check if it has been removed by Proguard.");
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str);
                    stringBuilder2.append(" is not linked. Skipping initialization.");
                    Log.d(str2, stringBuilder2.toString());
                } catch (NoSuchMethodException unused2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append("#getInstance has been removed by Proguard. Add keep rule to prevent it.");
                    throw new IllegalStateException(stringBuilder.toString());
                } catch (InvocationTargetException e) {
                    Log.wtf(str2, "Firebase API initialization failure.", e);
                } catch (IllegalAccessException e2) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Failed to initialize ");
                    stringBuilder3.append(str);
                    Log.wtf(str2, stringBuilder3.toString(), e2);
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, new Object[]{t});
            }
        }
    }
}
