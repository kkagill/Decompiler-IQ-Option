package com.crashlytics.android.core;

import android.content.Context;
import android.util.Log;
import com.crashlytics.android.answers.j;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.services.c.d;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.g;
import io.fabric.sdk.android.services.common.m;
import io.fabric.sdk.android.services.common.p;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import io.fabric.sdk.android.services.concurrency.i;
import io.fabric.sdk.android.services.network.c;
import io.fabric.sdk.android.services.network.e;
import io.fabric.sdk.android.services.settings.q;
import io.fabric.sdk.android.services.settings.s;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@io.fabric.sdk.android.services.concurrency.b({p.class})
/* compiled from: CrashlyticsCore */
public class k extends h<Void> {
    private c om;
    private i pP;
    private final ConcurrentHashMap<String, String> qP;
    private l qQ;
    private l qR;
    private n qS;
    private j qT;
    private String qU;
    private float qV;
    private boolean qW;
    private final ai qX;
    private p qY;
    private final long startTime;
    private String userId;
    private String userName;

    /* compiled from: CrashlyticsCore */
    private static final class a implements Callable<Boolean> {
        private final l qR;

        public a(l lVar) {
            this.qR = lVar;
        }

        /* renamed from: eZ */
        public Boolean call() {
            if (!this.qR.isPresent()) {
                return Boolean.FALSE;
            }
            io.fabric.sdk.android.c.biX().d("CrashlyticsCore", "Found previous crash marker.");
            this.qR.ft();
            return Boolean.TRUE;
        }
    }

    /* compiled from: CrashlyticsCore */
    private static final class b implements n {
        public void fr() {
        }

        private b() {
        }

        /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    public String getVersion() {
        return "2.7.0.33";
    }

    public k() {
        this(1.0f, null, null, false);
    }

    k(float f, n nVar, ai aiVar, boolean z) {
        this(f, nVar, aiVar, z, m.lo("Crashlytics Exception Handler"));
    }

    k(float f, n nVar, ai aiVar, boolean z, ExecutorService executorService) {
        this.userId = null;
        this.qU = null;
        this.userName = null;
        this.qV = f;
        if (nVar == null) {
            nVar = new b();
        }
        this.qS = nVar;
        this.qX = aiVar;
        this.qW = z;
        this.pP = new i(executorService);
        this.qP = new ConcurrentHashMap();
        this.startTime = System.currentTimeMillis();
    }

    /* Access modifiers changed, original: protected */
    public boolean ee() {
        return K(super.getContext());
    }

    /* Access modifiers changed, original: 0000 */
    public boolean K(Context context) {
        Context context2 = context;
        String str = "CrashlyticsCore";
        if (!io.fabric.sdk.android.services.common.k.cC(context).bjx()) {
            io.fabric.sdk.android.c.biX().d(str, "Crashlytics is disabled, because data collection is disabled by Firebase.");
            this.qW = true;
        }
        if (this.qW) {
            return false;
        }
        String cj = new g().cj(context2);
        if (cj == null) {
            return false;
        }
        String cz = CommonUtils.cz(context);
        if (e(cz, CommonUtils.a(context2, "com.crashlytics.RequireBuildId", true))) {
            try {
                io.fabric.sdk.android.k biX = io.fabric.sdk.android.c.biX();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Initializing Crashlytics Core ");
                stringBuilder.append(getVersion());
                biX.i(str, stringBuilder.toString());
                io.fabric.sdk.android.services.c.b bVar = new io.fabric.sdk.android.services.c.b(this);
                this.qR = new l("crash_marker", bVar);
                this.qQ = new l("initialization_marker", bVar);
                aj a = aj.a(new d(getContext(), "com.crashlytics.android.core.CrashlyticsCore"), this);
                e qVar = this.qX != null ? new q(this.qX) : null;
                this.om = new io.fabric.sdk.android.services.network.b(io.fabric.sdk.android.c.biX());
                this.om.a(qVar);
                IdManager bje = bje();
                a a2 = a.a(context2, bje, cj, cz);
                j jVar = r1;
                j jVar2 = new j(this, this.pP, this.om, bje, a, bVar, a2, new ap(context2, new ab(context2, a2.packageName)), new u(this), j.I(context));
                this.qT = jVar;
                boolean fm = fm();
                fo();
                this.qT.a(Thread.getDefaultUncaughtExceptionHandler(), new p().cE(context2));
                if (fm && CommonUtils.cB(context)) {
                    io.fabric.sdk.android.c.biX().d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    fj();
                    return false;
                }
                io.fabric.sdk.android.c.biX().d(str, "Exception handling initialization successful");
                return true;
            } catch (Exception e) {
                io.fabric.sdk.android.c.biX().e(str, "Crashlytics was not started due to an exception during initialization", e);
                this.qT = null;
                return false;
            }
        }
        throw new UnmetDependencyException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: dZ */
    public Void ec() {
        String str = "CrashlyticsCore";
        fk();
        this.qT.eQ();
        try {
            this.qT.eW();
            s bkH = q.bkG().bkH();
            if (bkH == null) {
                io.fabric.sdk.android.c.biX().w(str, "Received null settings, skipping report submission!");
                fl();
                return null;
            }
            this.qT.a(bkH);
            if (!bkH.ePX.ePB) {
                io.fabric.sdk.android.c.biX().d(str, "Collection of crash reports disabled in Crashlytics settings.");
                fl();
                return null;
            } else if (io.fabric.sdk.android.services.common.k.cC(getContext()).bjx()) {
                o fn = fn();
                if (!(fn == null || this.qT.a(fn))) {
                    io.fabric.sdk.android.c.biX().d(str, "Could not finalize previous NDK sessions.");
                }
                if (!this.qT.a(bkH.ePW)) {
                    io.fabric.sdk.android.c.biX().d(str, "Could not finalize previous sessions.");
                }
                this.qT.a(this.qV, bkH);
                fl();
                return null;
            } else {
                io.fabric.sdk.android.c.biX().d(str, "Automatic collection of crash reports disabled by Firebase settings.");
                fl();
                return null;
            }
        } catch (Exception e) {
            io.fabric.sdk.android.c.biX().e(str, "Crashlytics encountered a problem during asynchronous initialization.", e);
        } catch (Throwable th) {
            fl();
        }
    }

    public static k fg() {
        return (k) io.fabric.sdk.android.c.C(k.class);
    }

    public void d(Throwable th) {
        if (this.qW || !az("prior to logging exceptions.")) {
            return;
        }
        if (th == null) {
            io.fabric.sdk.android.c.biX().e(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.qT.a(Thread.currentThread(), th);
        }
    }

    public void ag(String str) {
        c(3, "CrashlyticsCore", str);
    }

    private void c(int i, String str, String str2) {
        if (!this.qW && az("prior to logging messages.")) {
            this.qT.b(System.currentTimeMillis() - this.startTime, d(i, str, str2));
        }
    }

    public void ah(String str) {
        if (!this.qW && az("prior to setting user data.")) {
            this.userId = aA(str);
            this.qT.a(this.userId, this.userName, this.qU);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(this.qP);
    }

    /* Access modifiers changed, original: 0000 */
    public String fh() {
        return bje().bjz() ? this.userId : null;
    }

    /* Access modifiers changed, original: 0000 */
    public String fi() {
        return bje().bjz() ? this.qU : null;
    }

    /* Access modifiers changed, original: 0000 */
    public String getUserName() {
        return bje().bjz() ? this.userName : null;
    }

    private void fj() {
        AnonymousClass1 anonymousClass1 = new io.fabric.sdk.android.services.concurrency.d<Void>() {
            public Void call() {
                return k.this.ec();
            }

            public Priority fq() {
                return Priority.IMMEDIATE;
            }
        };
        for (i a : bjh()) {
            anonymousClass1.cy(a);
        }
        Future submit = bjf().biW().submit(anonymousClass1);
        String str = "CrashlyticsCore";
        io.fabric.sdk.android.c.biX().d(str, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            io.fabric.sdk.android.c.biX().e(str, "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            io.fabric.sdk.android.c.biX().e(str, "Problem encountered during Crashlytics initialization.", e2);
        } catch (TimeoutException e22) {
            io.fabric.sdk.android.c.biX().e(str, "Crashlytics timed out during initialization.", e22);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void fk() {
        this.pP.b(new Callable<Void>() {
            public Void call() {
                k.this.qQ.fs();
                io.fabric.sdk.android.c.biX().d("CrashlyticsCore", "Initialization marker file created.");
                return null;
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void fl() {
        this.pP.submit(new Callable<Boolean>() {
            /* renamed from: eZ */
            public Boolean call() {
                String str = "CrashlyticsCore";
                try {
                    boolean ft = k.this.qQ.ft();
                    io.fabric.sdk.android.k biX = io.fabric.sdk.android.c.biX();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Initialization marker file removed: ");
                    stringBuilder.append(ft);
                    biX.d(str, stringBuilder.toString());
                    str = Boolean.valueOf(ft);
                    return str;
                } catch (Exception e) {
                    io.fabric.sdk.android.c.biX().e(str, "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.valueOf(false);
                }
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public boolean fm() {
        return this.qQ.isPresent();
    }

    /* Access modifiers changed, original: 0000 */
    public void a(p pVar) {
        this.qY = pVar;
    }

    /* Access modifiers changed, original: 0000 */
    public o fn() {
        p pVar = this.qY;
        return pVar != null ? pVar.fv() : null;
    }

    private void fo() {
        if (Boolean.TRUE.equals((Boolean) this.pP.b(new a(this.qR)))) {
            try {
                this.qS.fr();
            } catch (Exception e) {
                io.fabric.sdk.android.c.biX().e("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void fp() {
        this.qR.fs();
    }

    private static String d(int i, String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CommonUtils.jm(i));
        stringBuilder.append("/");
        stringBuilder.append(str);
        stringBuilder.append(" ");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    private static boolean az(String str) {
        k fg = fg();
        if (fg != null && fg.qT != null) {
            return true;
        }
        io.fabric.sdk.android.k biX = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Crashlytics must be initialized by calling Fabric.with(Context) ");
        stringBuilder.append(str);
        biX.e("CrashlyticsCore", stringBuilder.toString(), null);
        return false;
    }

    private static String aA(String str) {
        if (str == null) {
            return str;
        }
        str = str.trim();
        return str.length() > 1024 ? str.substring(0, 1024) : str;
    }

    static boolean e(String str, boolean z) {
        String str2 = "CrashlyticsCore";
        if (!z) {
            io.fabric.sdk.android.c.biX().d(str2, "Configured not to require a build ID.");
            return true;
        } else if (!CommonUtils.aB(str)) {
            return true;
        } else {
            str = ".";
            Log.e(str2, str);
            Log.e(str2, ".     |  | ");
            String str3 = ".     |  |";
            Log.e(str2, str3);
            Log.e(str2, str3);
            Log.e(str2, ".   \\ |  | /");
            Log.e(str2, ".    \\    /");
            Log.e(str2, ".     \\  /");
            Log.e(str2, ".      \\/");
            Log.e(str2, str);
            Log.e(str2, "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e(str2, str);
            Log.e(str2, ".      /\\");
            Log.e(str2, ".     /  \\");
            Log.e(str2, ".    /    \\");
            Log.e(str2, ".   / |  | \\");
            Log.e(str2, str3);
            Log.e(str2, str3);
            Log.e(str2, str3);
            Log.e(str2, str);
            return false;
        }
    }
}
