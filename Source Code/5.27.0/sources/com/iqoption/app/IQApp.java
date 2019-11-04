package com.iqoption.app;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.common.b.e;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.u;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.analytics.sla.Sla;
import com.iqoption.app.b.c;
import com.iqoption.app.b.d;
import com.iqoption.charttools.e.p;
import com.iqoption.core.connect.k;
import com.iqoption.core.data.config.ApiConfig;
import com.iqoption.core.data.config.ApiConfig.Type;
import com.iqoption.core.data.config.h;
import com.iqoption.core.data.config.j;
import com.iqoption.core.f;
import com.iqoption.core.gl.ChartLibrary;
import com.iqoption.core.l;
import com.iqoption.core.manager.ae;
import com.iqoption.core.util.ag;
import com.iqoption.core.util.q;
import com.iqoption.dto.Event;
import com.iqoption.feed.fetching.FeedFetcher;
import com.iqoption.gl.NativeHandler;
import com.iqoption.portfolio.g;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.util.Network;
import com.iqoption.util.w;
import com.iqoption.x.R;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;

public class IQApp extends com.iqoption.app.a.b implements com.iqoption.core.b {
    private static final String TAG = "com.iqoption.app.IQApp";
    private static final String asF;
    private static Tracker ast;
    private static volatile IQApp asu;
    private final n<ApiConfig> asA = Suppliers.a(-$$Lambda$IQApp$62x-WeaBQbwwrMhnnlP7bIsjMmo.INSTANCE);
    private volatile boolean asB;
    private final BroadcastReceiver asC = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            IQApp.this.asB = Network.ebO.aWS();
            IQApp.Ex().bd(new d(IQApp.this.asB));
        }
    };
    private final com.iqoption.n.a asD = new com.iqoption.n.b();
    private final n<f> asE = Suppliers.a(new -$$Lambda$IQApp$a-4teLrhGCp7MtCCbBtWHrub67U(this));
    private volatile boolean ass;
    private final n<c> asv = Suppliers.a(-$$Lambda$IQApp$zQNfMHp884YBcaFTK3DrRnVo-Cw.INSTANCE);
    private final n<c> asw = Suppliers.a(-$$Lambda$IQApp$mQDbYAuiXmMaYwriuAQUgaTB_JU.INSTANCE);
    public final n<com.iqoption.b.a> asx = Suppliers.a(-$$Lambda$MT_JnOnt8C8tc49FtrJVT3Xo4fw.INSTANCE);
    private final a asy = new a();
    private final Runnable asz = -$$Lambda$IQApp$LAHCvHhSoWIw2NeFMUcJ-3sMivY.INSTANCE;

    /* renamed from: com.iqoption.app.IQApp$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] asK = new int[Type.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.iqoption.core.data.config.ApiConfig.Type.values();
            r0 = r0.length;
            r0 = new int[r0];
            asK = r0;
            r0 = asK;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.core.data.config.ApiConfig.Type.INT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = asK;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.core.data.config.ApiConfig.Type.PROD;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = asK;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.core.data.config.ApiConfig.Type.SANDBOX;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.IQApp$AnonymousClass3.<clinit>():void");
        }
    }

    private class b implements ActivityLifecycleCallbacks {
        private u<?> asM;

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }

        private b() {
        }

        /* synthetic */ b(IQApp iQApp, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void onActivityStarted(Activity activity) {
            if (!IQApp.this.ass) {
                IQApp.this.ass = true;
                IQApp.this.asB = Network.ebO.aWS();
                IQApp iQApp = IQApp.this;
                iQApp.registerReceiver(iQApp.asC, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                IQApp.Ex().bd(new com.iqoption.app.b.a(true));
            }
            u uVar = this.asM;
            if (uVar != null) {
                uVar.cancel(true);
            }
        }

        public void onActivityResumed(Activity activity) {
            if (!IQApp.this.ass) {
                IQApp.this.ass = true;
                IQApp.this.asB = Network.ebO.aWS();
                IQApp iQApp = IQApp.this;
                iQApp.registerReceiver(iQApp.asC, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                IQApp.Ex().bd(new com.iqoption.app.b.a(true));
            }
            u uVar = this.asM;
            if (uVar != null) {
                uVar.cancel(true);
            }
        }

        public void onActivityPaused(Activity activity) {
            if (IQApp.this.ass) {
                IQApp.this.ass = false;
                IQApp iQApp = IQApp.this;
                ag.a(iQApp, iQApp.asC);
            }
            this.asM = com.iqoption.core.c.a.biL.a(IQApp.this.asz, 1000, TimeUnit.MILLISECONDS);
        }
    }

    private static class a extends com.iqoption.system.a.d {
        private a() {
        }

        /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        @e
        public void onDeadEvent(com.google.common.b.b bVar) {
            if ((bVar.uG() instanceof com.iqoption.service.websocket.a.b) && ((com.iqoption.service.websocket.a.b) bVar.uG()).dSy != null) {
                ((com.iqoption.service.websocket.a.b) bVar.uG()).dSy.setException(new RuntimeException("Not found subscribers"));
            }
        }

        @e
        public void onMicroPortfolioClose(com.iqoption.portfolio.g.a aVar) {
            EZ();
        }

        @e
        public void onPortfolioClose(g.c cVar) {
            EZ();
        }

        private void EZ() {
            com.iqoption.core.c.a.biL.b(new Runnable() {
                private int counter;

                public void run() {
                    if (IQApp.Eu().isStarted()) {
                        int i = this.counter;
                        this.counter = i + 1;
                        if (i >= 10) {
                            throw new CancellationException();
                        }
                        return;
                    }
                    d.i("portfolio_opened", true);
                    throw new CancellationException();
                }
            }, 500, 500, TimeUnit.MILLISECONDS);
        }
    }

    public int EJ() {
        return R.mipmap.ic_launcher;
    }

    public Context getContext() {
        return this;
    }

    public static synchronized IQApp Eu() {
        IQApp iQApp;
        synchronized (IQApp.class) {
            iQApp = asu;
        }
        return iQApp;
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append('.');
        stringBuilder.append("IQLifecycleCallbacks");
        asF = stringBuilder.toString();
    }

    private static /* synthetic */ void ER() {
        d.setLong("finish_time", System.currentTimeMillis());
        d.i("portfolio_check_background_time_on_start", true);
        Ex().bd(new com.iqoption.app.b.a(false));
    }

    private static /* synthetic */ ApiConfig EQ() {
        if (!com.iqoption.debugmenu.debugmenu.a.isAvailable()) {
            return com.iqoption.core.data.config.f.VC();
        }
        CharSequence host = com.iqoption.core.data.d.a.bdi.getHost();
        com.iqoption.core.data.config.a aVar = null;
        if (TextUtils.isEmpty(host)) {
            host = null;
        }
        int i = AnonymousClass3.asK[com.iqoption.core.data.d.a.bdi.Wi().ordinal()];
        if (i == 1) {
            aVar = com.iqoption.core.data.config.g.bcr;
        } else if (i == 2) {
            aVar = h.bcs;
        } else if (i == 3) {
            if (TextUtils.isEmpty(host)) {
                aVar = h.bcs;
            } else {
                aVar = new j(host);
            }
        }
        return com.iqoption.core.data.config.f.a(host, aVar);
    }

    public static ApiConfig Ev() {
        return (ApiConfig) Eu().asA.get();
    }

    public void onCreate() {
        super.onCreate();
        asu = this;
        ChartLibrary.requireInit();
        io.reactivex.c.a.k(com.iqoption.core.rx.h.bFh);
        com.a.b.a.c(this);
        com.iqoption.config.a.aZl.a(a.arv);
        com.iqoption.core.b.aZo.a(this);
        com.iqoption.chat.b.a.aVN.a(com.iqoption.chat.a.aNW);
        com.iqoption.charttools.d.a.aKh.a(com.iqoption.charttools.tools.a.aLy);
        this.asD.init(this);
        q.bj(this);
        Network.ebO.initialize(this);
        ((com.iqoption.b.a) this.asx.get()).b(this);
        this.asy.register();
        com.iqoption.app.managers.feature.c.Iw().Ix();
        com.iqoption.core.c.a.biL.execute(new -$$Lambda$IQApp$1uw1-Hiff2rHn86UkXdEwpHXln8(this));
        com.iqoption.core.c.a.biL.execute(-$$Lambda$S3EzkClvlNWIs7lcuwu48Xnoqts.INSTANCE);
        com.iqoption.core.c.a.biM.execute(-$$Lambda$IQApp$g7_8wgEUWgkxHw3AK4cm3wDLIs0.INSTANCE);
        com.facebook.f.L(getApplicationContext());
        d.aP(this).Fu();
        com.iqoption.util.h.init();
        NativeHandler.instance().onStart();
        com.iqoption.app.managers.e.Hv().initialize();
        com.iqoption.view.drawable.d.init();
        com.iqoption.app.managers.c.GS().initialize();
        com.iqoption.core.ui.animation.transitions.c.a aVar = com.iqoption.core.ui.animation.transitions.c.bHB;
        aVar.getClass();
        com.iqoption.core.ui.fragment.d.l(new -$$Lambda$G4EqjksHvDyeFOH2dT2taHocro4(aVar));
        Lifecycle lifecycle = ProcessLifecycleOwner.get().getLifecycle();
        lifecycle.addObserver(FeedFetcher.cSh);
        lifecycle.addObserver(Sla.CV());
        lifecycle.addObserver(EventManager.BS());
        registerActivityLifecycleCallbacks(new b(this, null));
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("os_version", VERSION.RELEASE);
        jsonObject.addProperty("build_number", Integer.valueOf(VERSION.SDK_INT));
        jsonObject.add("device_name", ag.anI());
        EventManager.BS().a(Event.Builder(Event.CATEGORY_SYSTEM, "app_launch").setValue(Double.valueOf(d.aP(this).Fs() == 1 ? 1.0d : 0.0d)).setParameters(jsonObject).build());
        p.aLn = -$$Lambda$IQApp$2SJ8lsCvv1QhDHI7a2u3tdeIZgw.INSTANCE;
        com.iqoption.welcomeonboarding.b.bbK();
        com.iqoption.marketanalysis.d.aNM();
        com.iqoption.kyc.pro.a.init();
        com.iqoption.cardsverification.d.init();
        ae.bkV.YM();
    }

    private /* synthetic */ void EP() {
        b.initialize(this);
    }

    private static /* synthetic */ void EO() {
        try {
            com.iqoption.system.d.a.aUF().initialize();
        } catch (Exception unused) {
        }
    }

    private static /* synthetic */ SparseArray EN() {
        ImmutableList<com.iqoption.core.microservices.tradingengine.response.active.a> Gx = com.iqoption.app.helpers.a.Gs().Gx();
        SparseArray sparseArray = new SparseArray(Gx.size());
        for (com.iqoption.core.microservices.tradingengine.response.active.a aVar : Gx) {
            sparseArray.put(aVar.getActiveId(), aVar);
        }
        return sparseArray;
    }

    public static synchronized Tracker aO(Context context) {
        Tracker tracker;
        synchronized (IQApp.class) {
            if (ast == null) {
                ast = GoogleAnalytics.getInstance(context).newTracker((int) R.xml.global_tracker);
                ast.enableAdvertisingIdCollection(true);
            }
            tracker = ast;
        }
        return tracker;
    }

    public static com.google.common.b.d Ew() {
        return (com.google.common.b.d) asu.asw.get();
    }

    public static void br(Object obj) {
        try {
            ((c) asu.asw.get()).bc(obj);
        } catch (IllegalArgumentException unused) {
        }
    }

    public static c Ex() {
        return (c) asu.asv.get();
    }

    public static void bs(Object obj) {
        try {
            ((c) asu.asv.get()).bc(obj);
        } catch (IllegalArgumentException unused) {
        }
    }

    public static void a(String str, Map<String, Object> map) {
        com.appsflyer.j.dq().a(Eu().getApplicationContext(), str, (Map) map);
    }

    public boolean isStarted() {
        return this.ass;
    }

    public boolean Ey() {
        return this.asB;
    }

    public Gson Ez() {
        return w.aWL();
    }

    public com.iqoption.core.e EA() {
        return b.DG();
    }

    public l EB() {
        return com.iqoption.app.managers.l.HZ();
    }

    public com.iqoption.core.analytics.d EC() {
        return com.iqoption.analytics.d.BZ();
    }

    private /* synthetic */ f EL() {
        return new f() {
            private final n asH = Suppliers.a(new -$$Lambda$IQApp$2$6NKcP_m6h-BzV_vaQ_LvtWH7ksI(this));
            private final n asI = Suppliers.a(new -$$Lambda$IQApp$2$wb4il6o036zHk_pttwwNAoKalGg(this));

            public com.iqoption.core.connect.f EU() {
                return WebSocketHandler.aTn();
            }

            private /* synthetic */ k EY() {
                return new k() {
                    public <T> com.iqoption.core.connect.j<T> a(String str, java.lang.reflect.Type type) {
                        return com.iqoption.mobbtech.connect.request.a.a.b.a(type, str);
                    }

                    public <T> com.iqoption.core.connect.j<T> a(String str, Class<T> cls) {
                        return com.iqoption.mobbtech.connect.request.a.a.b.c(cls, str);
                    }

                    public <T> com.iqoption.core.connect.j<T> a(String str, kotlin.jvm.a.b<? super JsonReader, ? extends T> bVar) {
                        return com.iqoption.mobbtech.connect.request.a.a.b.a((kotlin.jvm.a.b) bVar, str);
                    }

                    public <T> com.iqoption.core.connect.j<T> a(Request request, Class<T> cls) {
                        return com.iqoption.mobbtech.connect.request.a.a.b.b(request, (Class) cls);
                    }
                };
            }

            private /* synthetic */ com.iqoption.core.connect.d EX() {
                return new com.iqoption.core.connect.d() {
                    public <T> com.iqoption.core.connect.c<T> b(String str, Class<T> cls) {
                        return com.iqoption.app.managers.j.HX().b(str, cls);
                    }
                };
            }

            public k EV() {
                return (k) this.asH.get();
            }

            public com.iqoption.core.connect.d EW() {
                return (com.iqoption.core.connect.d) this.asI.get();
            }
        };
    }

    public f ED() {
        return (f) this.asE.get();
    }

    public ApiConfig EE() {
        return Ev();
    }

    public Builder EF() {
        return this.asD.a(new Builder());
    }

    public com.iqoption.core.analytics.a.a EG() {
        return Sla.CV();
    }

    public com.iqoption.core.features.a EH() {
        return com.iqoption.app.managers.feature.b.avH;
    }

    @NonNull
    public io.reactivex.e<com.iqoption.core.b.d> EI() {
        return com.iqoption.debugmenu.b.cve.EI();
    }

    public Class<?> EK() {
        return TradeRoomActivity.class;
    }
}
