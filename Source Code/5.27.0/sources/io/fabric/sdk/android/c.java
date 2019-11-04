package io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import io.fabric.sdk.android.a.b;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.k;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import io.fabric.sdk.android.services.concurrency.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Fabric */
public class c {
    static volatile c eMe;
    static final k eMf = new b();
    private final Context context;
    private final Map<Class<? extends h>, h> eMg;
    private final Handler eMh;
    private final f<c> eMi;
    private final f<?> eMj;
    private a eMk;
    private WeakReference<Activity> eMl;
    final k eMm;
    final boolean eMn;
    private final ExecutorService executorService;
    private final IdManager pj;
    private AtomicBoolean vI = new AtomicBoolean(false);

    /* compiled from: Fabric */
    public static class a {
        private final Context context;
        private f<c> eMi;
        private k eMm;
        private boolean eMn;
        private h[] eMr;
        private h eMs;
        private String eMt;
        private String eMu;
        private Handler handler;

        public a(Context context) {
            if (context != null) {
                this.context = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public a a(h... hVarArr) {
            if (this.eMr == null) {
                if (!k.cC(this.context).bjx()) {
                    ArrayList arrayList = new ArrayList();
                    Object obj = null;
                    for (h hVar : hVarArr) {
                        String identifier = hVar.getIdentifier();
                        int i = -1;
                        int hashCode = identifier.hashCode();
                        if (hashCode != 607220212) {
                            if (hashCode == 1830452504 && identifier.equals("com.crashlytics.sdk.android:crashlytics")) {
                                i = 0;
                            }
                        } else if (identifier.equals("com.crashlytics.sdk.android:answers")) {
                            i = 1;
                        }
                        if (i == 0 || i == 1) {
                            arrayList.add(hVar);
                        } else if (obj == null) {
                            c.biX().w("Fabric", "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.");
                            obj = 1;
                        }
                    }
                    hVarArr = (h[]) arrayList.toArray(new h[0]);
                }
                this.eMr = hVarArr;
                return this;
            }
            throw new IllegalStateException("Kits already set.");
        }

        public c biZ() {
            HashMap hashMap;
            if (this.eMs == null) {
                this.eMs = h.bjW();
            }
            if (this.handler == null) {
                this.handler = new Handler(Looper.getMainLooper());
            }
            if (this.eMm == null) {
                if (this.eMn) {
                    this.eMm = new b(3);
                } else {
                    this.eMm = new b();
                }
            }
            if (this.eMu == null) {
                this.eMu = this.context.getPackageName();
            }
            if (this.eMi == null) {
                this.eMi = f.eMy;
            }
            h[] hVarArr = this.eMr;
            if (hVarArr == null) {
                hashMap = new HashMap();
            } else {
                hashMap = c.C((Collection) Arrays.asList(hVarArr));
            }
            HashMap hashMap2 = hashMap;
            Context applicationContext = this.context.getApplicationContext();
            return new c(applicationContext, hashMap2, this.eMs, this.handler, this.eMm, this.eMn, this.eMi, new IdManager(applicationContext, this.eMu, this.eMt, hashMap2.values()), c.cd(this.context));
        }
    }

    public String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    public String getVersion() {
        return "1.4.8.32";
    }

    static c biV() {
        if (eMe != null) {
            return eMe;
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    c(Context context, Map<Class<? extends h>, h> map, h hVar, Handler handler, k kVar, boolean z, f fVar, IdManager idManager, Activity activity) {
        this.context = context;
        this.eMg = map;
        this.executorService = hVar;
        this.eMh = handler;
        this.eMm = kVar;
        this.eMn = z;
        this.eMi = fVar;
        this.eMj = jk(map.size());
        this.pj = idManager;
        r(activity);
    }

    public static c a(Context context, h... hVarArr) {
        if (eMe == null) {
            synchronized (c.class) {
                if (eMe == null) {
                    a(new a(context).a(hVarArr).biZ());
                }
            }
        }
        return eMe;
    }

    private static void a(c cVar) {
        eMe = cVar;
        cVar.init();
    }

    public c r(Activity activity) {
        this.eMl = new WeakReference(activity);
        return this;
    }

    public Activity getCurrentActivity() {
        WeakReference weakReference = this.eMl;
        return weakReference != null ? (Activity) weakReference.get() : null;
    }

    private void init() {
        this.eMk = new a(this.context);
        this.eMk.a(new b() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
                c.this.r(activity);
            }

            public void onActivityStarted(Activity activity) {
                c.this.r(activity);
            }

            public void onActivityResumed(Activity activity) {
                c.this.r(activity);
            }
        });
        cc(this.context);
    }

    /* Access modifiers changed, original: 0000 */
    public void cc(Context context) {
        StringBuilder stringBuilder;
        Future ce = ce(context);
        Collection dY = dY();
        l lVar = new l(ce, dY);
        ArrayList<h> arrayList = new ArrayList(dY);
        Collections.sort(arrayList);
        lVar.a(context, this, f.eMy, this.pj);
        for (h a : arrayList) {
            a.a(context, this, this.eMj, this.pj);
        }
        lVar.initialize();
        String str = "Fabric";
        String str2 = " [Version: ";
        if (biX().isLoggable(str, 3)) {
            stringBuilder = new StringBuilder("Initializing ");
            stringBuilder.append(getIdentifier());
            stringBuilder.append(str2);
            stringBuilder.append(getVersion());
            stringBuilder.append("], with the following kits:\n");
        } else {
            stringBuilder = null;
        }
        for (h hVar : arrayList) {
            hVar.eMA.a(lVar.eMA);
            a(this.eMg, hVar);
            hVar.initialize();
            if (stringBuilder != null) {
                stringBuilder.append(hVar.getIdentifier());
                stringBuilder.append(str2);
                stringBuilder.append(hVar.getVersion());
                stringBuilder.append("]\n");
            }
        }
        if (stringBuilder != null) {
            biX().d(str, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(Map<Class<? extends h>, h> map, h hVar) {
        io.fabric.sdk.android.services.concurrency.b bVar = hVar.eMB;
        if (bVar != null) {
            for (Class cls : bVar.value()) {
                if (cls.isInterface()) {
                    for (h hVar2 : map.values()) {
                        if (cls.isAssignableFrom(hVar2.getClass())) {
                            hVar.eMA.a(hVar2.eMA);
                        }
                    }
                } else if (((h) map.get(cls)) != null) {
                    hVar.eMA.a(((h) map.get(cls)).eMA);
                } else {
                    throw new UnmetDependencyException("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    private static Activity cd(Context context) {
        return context instanceof Activity ? (Activity) context : null;
    }

    public ExecutorService biW() {
        return this.executorService;
    }

    public Collection<h> dY() {
        return this.eMg.values();
    }

    public static <T extends h> T C(Class<T> cls) {
        return (h) biV().eMg.get(cls);
    }

    public static k biX() {
        if (eMe == null) {
            return eMf;
        }
        return eMe.eMm;
    }

    public static boolean biY() {
        if (eMe == null) {
            return false;
        }
        return eMe.eMn;
    }

    private static Map<Class<? extends h>, h> C(Collection<? extends h> collection) {
        Map hashMap = new HashMap(collection.size());
        a(hashMap, (Collection) collection);
        return hashMap;
    }

    private static void a(Map<Class<? extends h>, h> map, Collection<? extends h> collection) {
        for (h hVar : collection) {
            map.put(hVar.getClass(), hVar);
            if (hVar instanceof i) {
                a((Map) map, ((i) hVar).dY());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public f<?> jk(final int i) {
        return new f() {
            final CountDownLatch eMp = new CountDownLatch(i);

            public void cx(Object obj) {
                this.eMp.countDown();
                if (this.eMp.getCount() == 0) {
                    c.this.vI.set(true);
                    c.this.eMi.cx(c.this);
                }
            }

            public void f(Exception exception) {
                c.this.eMi.f(exception);
            }
        };
    }

    /* Access modifiers changed, original: 0000 */
    public Future<Map<String, j>> ce(Context context) {
        return biW().submit(new e(context.getPackageCodePath()));
    }
}
