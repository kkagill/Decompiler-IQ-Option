package com.iqoption.activity;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.DownloadManager;
import android.app.DownloadManager.Query;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.HitBuilders.EventBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.common.base.Functions;
import com.google.common.base.n;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.core.manager.LogoutClearList;
import com.iqoption.core.microservices.core.register.SocialTypeId;
import com.iqoption.core.util.u;
import com.iqoption.deposit.g;
import com.iqoption.deposit.l;
import com.iqoption.dto.Event;
import com.iqoption.dto.entity.BackCall;
import com.iqoption.dto.entity.Version;
import com.iqoption.dto.entity.Version.Data;
import com.iqoption.fragment.MenuFragment;
import com.iqoption.fragment.MenuFragment.MenuItem;
import com.iqoption.fragment.account.security.AccountSecurityFragment;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment;
import com.iqoption.fragment.ah;
import com.iqoption.fragment.assets.model.AssetCategoryType;
import com.iqoption.fragment.k;
import com.iqoption.fragment.leftmenu.LeftMenuFragment;
import com.iqoption.fragment.leftmenu.f;
import com.iqoption.fragment.leftpanel.LeftPanelSection;
import com.iqoption.marketanalysis.e;
import com.iqoption.microservice.regulators.response.StatusType;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.protrader.web.ProTraderWebActivity;
import com.iqoption.protrader.web.ProTraderWebType;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.system.IQFirebaseMessagingService;
import com.iqoption.util.Network;
import com.iqoption.util.aj;
import com.iqoption.util.i;
import com.iqoption.util.o;
import com.iqoption.util.v;
import com.iqoption.util.z;
import com.iqoption.welcome.m;
import com.iqoption.withdrawal.common.WithdrawActivity;
import com.iqoption.x.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class TradeRoomActivity extends b implements com.iqoption.fragment.assets.d.a, com.iqoption.fragment.leftmenu.LeftMenuFragment.b, com.iqoption.vip.c.b {
    private static final String TAG = "com.iqoption.activity.TradeRoomActivity";
    private com.iqoption.chat.viewmodel.c ajA;
    private boolean ajB = false;
    private f ajC;
    private com.iqoption.dialog.f ajD;
    private final BroadcastReceiver ajE = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            TradeRoomActivity.this.zN();
            DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
            Query query = new Query();
            query.setFilterById(new long[]{intent.getExtras().getLong("extra_download_id")});
            Cursor query2 = downloadManager.query(query);
            if (query2.moveToFirst() && query2.getInt(query2.getColumnIndex(NotificationCompat.CATEGORY_STATUS)) == 8) {
                try {
                    intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setDataAndType(FileProvider.getUriForFile(context, "com.iqoption.x.provider", new File(context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "update.apk")), "application/vnd.android.package-archive");
                    intent.addFlags(1);
                    context.startActivity(intent);
                } catch (Exception e) {
                    i.d(e);
                }
            }
        }
    };
    private ah ajj;
    private boolean ajk;
    private boolean ajl;
    private boolean ajm;
    public LeftMenuFragment ajn;
    private com.iqoption.core.splash.d ajo;
    private ViewGroup ajp;
    private ViewGroup ajq;
    private View ajr;
    private View ajs;
    private boolean ajt;
    private com.iqoption.popup.c aju;
    @NonNull
    private com.iqoption.o.d ajv;
    private com.iqoption.fragment.assets.d ajw;
    private io.reactivex.disposables.b ajx;
    @Nullable
    private e ajy;
    private com.iqoption.marketanalysis.a ajz = new com.iqoption.marketanalysis.a() {
        public void b(Intent intent, int i) {
            TradeRoomActivity.this.startActivityForResult(intent, i);
        }

        public void e(int i, Intent intent) {
            TradeRoomActivity.this.setResult(i, intent);
        }

        public void Av() {
            TradeRoomActivity.this.finish();
        }
    };

    private static class a extends AnimatorListenerAdapter {
        private static final Property<a, Float> ajH = new Property<a, Float>(Float.class, NotificationCompat.CATEGORY_PROGRESS) {
            /* renamed from: a */
            public void set(a aVar, Float f) {
                aVar.di = f.floatValue();
            }

            /* renamed from: c */
            public Float get(a aVar) {
                return Float.valueOf(aVar.di);
            }
        };
        @NonNull
        private final View ajI;
        @NonNull
        private final n<Animator> ajJ;
        @NonNull
        private final n<Animator> ajK;
        @NonNull
        private final AnimatorListener ajL = new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                a.this.ajI.setVisibility(0);
            }

            public void onAnimationEnd(Animator animator) {
                animator.removeAllListeners();
            }
        };
        @NonNull
        private final AnimatorListener ajM = new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                animator.removeAllListeners();
                a.this.ajI.setVisibility(8);
            }
        };
        @Nullable
        private Animator ajN;
        private boolean ajO;
        private float di;

        a(@NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull LeftMenuFragment leftMenuFragment) {
            this.ajI = view3;
            this.ajJ = new -$$Lambda$TradeRoomActivity$a$MA4QoEGaWMomHO-W4mfgHylP6EA(this, view, view2, leftMenuFragment);
            this.ajK = new -$$Lambda$TradeRoomActivity$a$onkOs7ZHW_dxnXEwy1zaEerD9po(this, view, view2, leftMenuFragment);
        }

        private /* synthetic */ Animator b(View view, View view2, LeftMenuFragment leftMenuFragment) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ajH, new float[]{1.0f});
            Animator d = com.iqoption.activity.a.a.d(view, view2);
            Animator a = com.iqoption.fragment.leftmenu.c.a(leftMenuFragment, view.getHeight());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, d, a});
            animatorSet.setInterpolator(j.XJ());
            return animatorSet;
        }

        private /* synthetic */ Animator a(View view, View view2, LeftMenuFragment leftMenuFragment) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ajH, new float[]{0.0f});
            Animator e = com.iqoption.activity.a.a.e(view, view2);
            Animator b = com.iqoption.fragment.leftmenu.c.b(leftMenuFragment, view.getHeight());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, e, b});
            animatorSet.setInterpolator(j.XJ());
            return animatorSet;
        }

        private long Aw() {
            return (long) Math.round((1.0f - this.di) * 700.0f);
        }

        private long Ax() {
            return (long) Math.round(this.di * 500.0f);
        }

        /* Access modifiers changed, original: 0000 */
        public void aw(boolean z) {
            if (this.ajO != z) {
                Animator animator;
                Animator animator2 = this.ajN;
                if (animator2 != null) {
                    animator2.cancel();
                }
                this.ajO = z;
                if (z) {
                    animator = (Animator) this.ajJ.get();
                    animator.cancel();
                    animator.setDuration(Aw());
                    animator.addListener(this.ajL);
                } else {
                    animator = (Animator) this.ajK.get();
                    animator.cancel();
                    animator.setDuration(Ax());
                    animator.addListener(this.ajM);
                }
                this.ajN = animator;
                animator.start();
            }
        }

        public void onAnimationEnd(Animator animator) {
            animator.removeAllListeners();
        }
    }

    public static class b {
        public boolean ajQ;
        public boolean ajm;

        public b(boolean z, boolean z2) {
            this.ajQ = z;
            this.ajm = z2;
        }
    }

    private class c extends com.iqoption.system.c.b<TradeRoomActivity, Version> {
        private final boolean ajR;

        public c(TradeRoomActivity tradeRoomActivity, boolean z) {
            super(tradeRoomActivity, Version.class);
            this.ajR = z;
        }

        /* renamed from: a */
        public void v(@NonNull TradeRoomActivity tradeRoomActivity, @NonNull Version version) {
            super.v(tradeRoomActivity, version);
            Data data = version.getData();
            if (data != null) {
                try {
                    boolean z = false;
                    int i = tradeRoomActivity.getPackageManager().getPackageInfo(tradeRoomActivity.getPackageName(), 0).versionCode;
                    if (i < data.getMin().intValue()) {
                        z = true;
                    }
                    if (i < data.getCurrent().intValue()) {
                        o.a(tradeRoomActivity, z, data.getPath());
                    } else if (this.ajR) {
                        o.c(tradeRoomActivity, data.getPath());
                    }
                } catch (NameNotFoundException unused) {
                }
            }
        }
    }

    private static class d extends com.iqoption.system.c.b<TradeRoomActivity, Object> {
        public d(TradeRoomActivity tradeRoomActivity) {
            super(tradeRoomActivity, Object.class);
        }

        /* renamed from: a */
        public void v(@NonNull TradeRoomActivity tradeRoomActivity, @NonNull Object obj) {
            com.iqoption.app.b aK = com.iqoption.app.b.aK(tradeRoomActivity);
            if (aK.Ek()) {
                aK.aN((Context) tradeRoomActivity);
                tradeRoomActivity.zZ();
                return;
            }
            tradeRoomActivity.Ae();
            com.iqoption.feed.e.cOv.avi();
        }

        /* renamed from: a */
        public void c(TradeRoomActivity tradeRoomActivity, Throwable th) {
            com.iqoption.util.a.l(tradeRoomActivity);
        }
    }

    private static Bundle F(Bundle bundle) {
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        return bundle;
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(F(bundle));
        this.ajA = com.iqoption.chat.viewmodel.c.aWI.g(this);
        this.ajA.Tk();
        if (!Ac()) {
            setContentView((int) R.layout.main);
            FragmentManager.enableDebugLogging(false);
            if (bundle != null) {
                this.ajj = null;
            }
            zW();
            zU();
            zV();
            An();
            zY();
            av(false);
            this.aju = com.iqoption.popup.c.A(this);
            this.ajv = com.iqoption.o.d.F(this);
            this.ajw = com.iqoption.fragment.assets.d.o(this);
            this.ajw.aAv().observe(this, new Observer<Boolean>() {
                private boolean ajG;

                /* renamed from: f */
                public void onChanged(@Nullable Boolean bool) {
                    if (bool != null && bool.booleanValue() != this.ajG) {
                        this.ajG = bool.booleanValue();
                        IQApp.Ex().bd(new b(bool.booleanValue(), TradeRoomActivity.this.ajm));
                    }
                }
            });
            this.ajw.a(this);
            this.ajy = new e(this, this.ajz) {
                public void a(com.iqoption.core.microservices.tradingengine.response.active.f fVar) {
                    TradeRoomActivity.this.ajv.b(fVar.getInstrumentType(), fVar.getActiveId());
                }
            };
        }
    }

    @Nullable
    public ah getTradeFragment() {
        if (this.ajj == null) {
            ah ahVar = (ah) getSupportFragmentManager().findFragmentByTag(ah.TAG);
            if (ahVar != null) {
                this.ajj = ahVar;
            }
        }
        return this.ajj;
    }

    private void zU() {
        this.ajo = com.iqoption.core.splash.d.a(getSupportFragmentManager(), R.id.splashContainer, true);
        this.ajo.setProgress(com.iqoption.core.splash.d.a((Bundle) getIntent().getParcelableExtra("EXTRA_SHARED_STATE")));
        this.ajo.ha("-=Traderoom=-");
    }

    private void av(boolean z) {
        com.iqoption.app.d aP = com.iqoption.app.d.aP(this);
        String version = aP.getVersion();
        String str = "5.27.0";
        if (TextUtils.isEmpty(version)) {
            aP.bh(true);
        } else {
            aP.bh(false);
            if (version.equals(str)) {
                aP.bg(false);
            } else {
                aP.bg(true);
            }
        }
        aP.dK(str);
        String Va = IQApp.Ev().Va();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Va);
        Va = "api/getversion";
        stringBuilder.append(Va);
        v.a(new com.iqoption.mobbtech.connect.request.a.a.b(Version.class, RequestManager.a(stringBuilder.toString(), null, (Context) this), Va).aPF(), new c(this, z));
    }

    private void zV() {
        this.ajp = (ViewGroup) findViewById(R.id.leftMenuFrame);
        this.ajn = (LeftMenuFragment) getSupportFragmentManager().findFragmentById(R.id.leftSlide);
        a aVar = new a(this.ajq, this.ajr, this.ajp, this.ajn);
        this.ajC = f.q(this);
        z.a(this.ajC.aEm(), (LifecycleOwner) this, new -$$Lambda$TradeRoomActivity$uqwkR_wd2QJR3XU_8ABmdKr7aCY(this, aVar));
    }

    private void zW() {
        this.ajq = (ViewGroup) findViewById(R.id.fragmentRootFrame);
        this.ajr = this.ajq.findViewById(R.id.tradeRoomVeil);
        this.ajr.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                TradeRoomActivity.this.ajC.close();
            }
        });
        this.ajs = this.ajq.findViewById(R.id.other_fragment);
    }

    private void zX() {
        com.iqoption.m.a aTn = WebSocketHandler.aTn();
        if (!aTn.DR()) {
            this.ajo.show();
        }
        p.a(aTn.cj(TAG), new d(this), com.iqoption.core.c.a.biN);
    }

    private void zY() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("type");
            Bundle extras = intent.getExtras();
            boolean z = (extras == null || TextUtils.isEmpty(stringExtra)) ? false : true;
            this.ajl = z;
            if (this.ajl) {
                JsonObject jsonObject = new JsonObject();
                for (String str : extras.keySet()) {
                    Object obj = extras.get(str);
                    if (obj instanceof String) {
                        jsonObject.add(str, new JsonPrimitive((String) obj));
                    }
                }
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.add("parameters", jsonObject);
                jsonObject2.add("push_type", new JsonPrimitive(stringExtra));
                EventManager.BS().a(Event.Builder(Event.CATEGORY_SYSTEM, "app-opened-by-push").setParameters(jsonObject2).build());
            }
            this.ajk = getIntent().getBooleanExtra("SHOW_DEPOSIT_PAGE", false);
            Uri h = com.iqoption.b.a.h(this, getIntent());
            if (h != null) {
                com.iqoption.app.d aP = com.iqoption.app.d.aP(this);
                String queryParameter = h.getQueryParameter("retrack");
                if (!TextUtils.isEmpty(queryParameter)) {
                    aP.dO(queryParameter);
                    aP.Y(System.currentTimeMillis());
                }
                if (h.getHost() != null) {
                    queryParameter = h.getHost();
                    int i = -1;
                    int hashCode = queryParameter.hashCode();
                    String str2 = "fbretargeting";
                    String str3 = "openasset";
                    String str4 = "newsfeed";
                    String str5 = "education";
                    if (hashCode != -290756696) {
                        if (hashCode != 0) {
                            if (hashCode != 1395379953) {
                                if (hashCode != 1548165862) {
                                    if (hashCode == 2020250018 && queryParameter.equals(str2)) {
                                        i = 0;
                                    }
                                } else if (queryParameter.equals(str3)) {
                                    i = 3;
                                }
                            } else if (queryParameter.equals(str4)) {
                                i = 2;
                            }
                        } else if (queryParameter.equals("")) {
                            i = 4;
                        }
                    } else if (queryParameter.equals(str5)) {
                        i = 1;
                    }
                    if (i == 0) {
                        queryParameter = h.getQueryParameter("text");
                        String queryParameter2 = h.getQueryParameter("promocode");
                        if (!(TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2))) {
                            aP.dI(queryParameter2);
                            aP.dJ(queryParameter);
                        }
                    } else if (i == 1) {
                        Al();
                        str2 = str5;
                    } else if (i != 2) {
                        str2 = i != 3 ? i != 4 ? "other" : "empty" : str3;
                    } else {
                        com.iqoption.fragment.leftpanel.i.r(this).c(LeftPanelSection.MARKET_ANALYSIS);
                        str2 = str4;
                    }
                    Tracker aO = IQApp.aO(this);
                    aO.send(((EventBuilder) ((EventBuilder) new EventBuilder().setCustomMetric(1, (float) com.iqoption.app.b.aK(this).getUserId())).setCategory("Android").setAction("AppLinks").setLabel(str2).setCustomDimension(2, aO.get("&cid"))).build());
                }
            }
            this.ajB = getIntent().getBooleanExtra("wasLaunchedAfterCrash", false);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        if (i != 82) {
            return onKeyDown;
        }
        if (!this.aju.isShowing()) {
            this.ajC.toggle();
        }
        return true;
    }

    public void zZ() {
        logout();
    }

    private void logout() {
        IQFirebaseMessagingService.bK(this);
        SocialTypeId DS = com.iqoption.app.b.aK(this).DS();
        if (DS == SocialTypeId.FACEBOOK) {
            com.iqoption.welcome.d.b.bbz();
        } else if (DS == SocialTypeId.GOOGLE_PLUS) {
            com.iqoption.welcome.m.a aVar = m.ekn;
            com.iqoption.welcome.m.a.eko.M(this).logout();
        }
        WeakReference weakReference = new WeakReference(this);
        v.a(v.a(p.a(com.iqoption.microservice.authorization.a.Kf(), Aa()), Functions.ah(null)), new -$$Lambda$TradeRoomActivity$xLn5wtF5fHXHFnO9uLBzcXi--Ww(weakReference), new -$$Lambda$TradeRoomActivity$9x7zXSR7hZPVq5h1excasJ0Meh8(weakReference));
    }

    private t<?> Aa() {
        return com.iqoption.core.c.a.biL.d(new -$$Lambda$TradeRoomActivity$3UlP4zBWOOPsDMsYASXI-enyOAU(this));
    }

    private static /* synthetic */ void aI(Context context) {
        com.iqoption.gl.c.aIy().clearBets();
        com.iqoption.gl.c.aIy().clearPositions();
        com.iqoption.gl.c.aIy().clearOrders();
        com.iqoption.gl.c.aIy().clearVisibleUnits();
        com.iqoption.app.b.aK(context).aL(context);
        com.iqoption.app.d.aP(context).dH("user");
        RequestManager.aOR().aOZ();
        RequestManager.aOR().aOY();
        WebSocketHandler.aTn().azk();
        com.iqoption.app.managers.a.GM().clear();
        com.iqoption.app.managers.c.GS().clear();
        LogoutClearList.clear();
        com.iqoption.asset.b.a.awZ.u(null);
        com.iqoption.asset.c.b.axz.u(null);
    }

    private void Ab() {
        com.iqoption.util.t.p(getSupportFragmentManager());
        startActivity(Intent.makeRestartActivityTask(getPackageManager().getLaunchIntentForPackage(getPackageName()).getComponent()));
        aj.aWY();
    }

    public void onStart() {
        super.onStart();
        registerReceiver(this.ajE, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        if (!Ac()) {
            zX();
        }
    }

    public void onStop() {
        super.onStop();
        io.reactivex.disposables.b bVar = this.ajx;
        if (bVar != null) {
            bVar.dispose();
            this.ajx = null;
        }
        WebSocketHandler.aTn().n(TAG, 30000);
        unregisterReceiver(this.ajE);
        com.iqoption.feed.e.cOv.avj();
    }

    public boolean Ac() {
        if (Network.ebO.aWS()) {
            return false;
        }
        OfflineActivity.h(this);
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        if (Ah() && !this.ajt) {
            PasscodeFragment.bv(this);
        }
        com.iqoption.app.d.aP(this).ad(System.currentTimeMillis());
    }

    /* Access modifiers changed, original: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        zY();
        ah ahVar = this.ajj;
        if (ahVar != null) {
            ahVar.onNewIntent(intent);
        }
        if (this.ajl) {
            this.ajl = false;
            Ae();
        }
    }

    public void onResume() {
        super.onResume();
        long FY = com.iqoption.app.d.aP(this).FY();
        if (FY > 0) {
            com.iqoption.app.d.aP(this).ae(System.currentTimeMillis() - FY);
        }
        if (!(Ac() || !Ah() || Ai())) {
            Ag();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        e eVar = this.ajy;
        if (eVar != null) {
            eVar.b(i, i2, intent);
        }
    }

    public void finish() {
        e eVar = this.ajy;
        if (eVar != null) {
            eVar.aNN();
        }
        super.finish();
    }

    public void onDestroy() {
        com.iqoption.core.c.a.biN.removeCallbacksAndMessages(null);
        IQApp.Ev().release();
        com.iqoption.core.splash.d dVar = this.ajo;
        if (dVar != null) {
            dVar.hide();
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        io.reactivex.disposables.b bVar = this.ajx;
        if (bVar != null) {
            bVar.dispose();
            this.ajx = null;
        }
        if (configuration.orientation == 1) {
            this.ajx = com.iqoption.core.rx.i.aki().c(new -$$Lambda$TradeRoomActivity$TdPkNRSu1Y8M4d8E0gTo_kMFuOg(this), 0, 1000, TimeUnit.MILLISECONDS);
        }
    }

    private /* synthetic */ void Au() {
        Ad();
    }

    private boolean Ad() {
        if (!zP()) {
            return false;
        }
        com.iqoption.core.rx.i.akj().m(new -$$Lambda$TradeRoomActivity$WDsvEIh9BVknFkR3C0qi7YQEeqg(this));
        return true;
    }

    private /* synthetic */ void At() {
        setRequestedOrientation(6);
    }

    public void Ae() {
        if (this.ajk) {
            this.ajk = false;
            if (!(getIntent() == null || getIntent().getExtras() == null)) {
                getIntent().getExtras().putBoolean("SHOW_DEPOSIT_PAGE", false);
            }
            a(null, false);
        }
        if (!Ah() || Ai()) {
            Af();
        } else {
            Ag();
        }
    }

    public void Af() {
        if (!Ah() || Ai()) {
            ah ahVar = this.ajj;
            if (ahVar == null || !ahVar.isAdded()) {
                this.ajo.show();
                this.ajj = ah.ayt();
                try {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment, this.ajj, ah.TAG).commitNowAllowingStateLoss();
                    return;
                } catch (Exception unused) {
                    return;
                }
            } else if (!this.ajj.ayx()) {
                return;
            } else {
                if (this.ajj.ayI()) {
                    com.iqoption.core.c.a.biN.postDelayed(new -$$Lambda$TradeRoomActivity$9Jw55e9h4Ieet3Ygi58Qqvw85qk(this), 1000);
                    return;
                } else {
                    this.ajo.hide();
                    return;
                }
            }
        }
        Ag();
    }

    private /* synthetic */ void As() {
        this.ajo.hide();
    }

    private void Ag() {
        this.ajt = true;
        CheckPasscodeActivity.aG(this);
        finish();
    }

    private boolean Ah() {
        return com.iqoption.app.d.aP(getApplicationContext()).FM() >= 0;
    }

    private boolean Ai() {
        com.iqoption.app.d aP = com.iqoption.app.d.aP(getApplicationContext());
        boolean z = false;
        if (aP.FM() < 0) {
            return false;
        }
        long FN = aP.FN() - System.currentTimeMillis();
        if (FN > 0 && FN <= ((long) PasscodeFragment.cZU)) {
            z = true;
        }
        return z;
    }

    public void Aj() {
        AccountSecurityFragment.f(getSupportFragmentManager());
        this.ajC.close();
    }

    public void a(@NonNull StatusType statusType) {
        if (statusType == StatusType.DECLINED) {
            ProTraderWebActivity.a(this, ProTraderWebType.APPLY);
        } else {
            com.iqoption.protrader.dialog.a.C(this);
        }
    }

    public void Ak() {
        WithdrawActivity.start(this);
    }

    public void Al() {
        k.a(this, getSupportFragmentManager(), R.id.other_fragment);
    }

    public void a(MenuItem menuItem) {
        a(menuItem, new HashMap());
    }

    public void a(MenuItem menuItem, HashMap<String, Object> hashMap) {
        MenuFragment menuFragment = (MenuFragment) getSupportFragmentManager().findFragmentByTag(MenuFragment.TAG);
        if (menuFragment == null) {
            menuFragment = new MenuFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("item", menuItem);
            bundle.putSerializable("params", hashMap);
            menuFragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().replace(R.id.other_fragment, menuFragment, MenuFragment.TAG).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(MenuFragment.TAG).commit();
            getSupportFragmentManager().executePendingTransactions();
        } else {
            menuFragment.b(menuItem);
        }
        this.ajC.close();
    }

    public void onBackPressed() {
        if (Boolean.TRUE.equals(this.ajC.aEm().getValue())) {
            this.ajC.close();
        } else {
            super.onBackPressed();
        }
    }

    public void Am() {
        if (com.iqoption.app.b.aK(IQApp.Eu()).DR()) {
            if (this.ajD == null) {
                this.ajD = new com.iqoption.dialog.f(this);
            }
            this.ajD.show();
        }
    }

    public void b(long j, int i) {
        MenuFragment menuFragment = (MenuFragment) getSupportFragmentManager().findFragmentByTag(MenuFragment.TAG);
        if (menuFragment != null) {
            menuFragment.b(j, i);
        }
    }

    private void An() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.mainParent);
        View findViewById = findViewById(R.id.fragment);
        if (viewGroup != null && findViewById != null) {
            viewGroup.requestTransparentRegion(findViewById);
        }
    }

    public void cZ(String str) {
        g.a(this, true);
    }

    public void Ao() {
        a(null, true);
    }

    public void a(Long l, boolean z) {
        g.a(this, z, false, l.p(l));
    }

    public void a(com.iqoption.fragment.leftmenu.content.a aVar) {
        com.iqoption.fragment.leftmenu.a.a(aVar, this);
    }

    @Nullable
    public BackCall Ap() {
        return com.iqoption.app.managers.a.GM().GN();
    }

    public void Aq() {
        com.iqoption.core.splash.d dVar = this.ajo;
        if (dVar != null) {
            dVar.show();
        }
    }

    public void Ar() {
        com.iqoption.core.splash.d dVar = this.ajo;
        if (dVar != null) {
            dVar.hide();
        }
    }

    public void da(String str) {
        com.iqoption.core.splash.d dVar = this.ajo;
        if (dVar != null) {
            dVar.ag(str);
        }
    }

    public void a(int i, @Nullable AssetCategoryType assetCategoryType, boolean z) {
        this.ajm = z;
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, com.iqoption.fragment.assets.b.a(i, assetCategoryType), com.iqoption.fragment.assets.b.TAG).addToBackStack(com.iqoption.fragment.assets.b.TAG).commitAllowingStateLoss();
    }

    public void a(long j, com.iqoption.vip.k kVar) {
        for (com.iqoption.vip.c.b a : com.iqoption.util.t.a(getSupportFragmentManager(), com.iqoption.vip.c.b.class)) {
            a.a(j, kVar);
        }
    }

    /* Access modifiers changed, original: protected */
    public void zQ() {
        com.iqoption.gdpr.removal.a.p(this);
    }

    public void a(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        String str = "instrument_type";
        if (this.ajm) {
            TabHelper.IM().b(new TabHelper.i(aVar), false);
            EventManager.BS().a(Event.Builder(Event.CATEGORY_POPUP_SERVED, "traderoom_new-tab-plus").setValue(Double.valueOf((double) TabHelper.IM().getTabsCount())).setParameters(u.anp().o(str, aVar.instrumentType).anr()).build());
            return;
        }
        TabHelper.i Jh = TabHelper.IM().Jh();
        if (!(Jh == null || (Jh.getActiveId() == aVar.getActiveId() && Jh.getInstrumentType().equals(aVar.getInstrumentType())))) {
            TabHelper.IM().t(aVar);
        }
        com.iqoption.app.managers.k.j(IQApp.Eu(), 256);
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "change-asset_choose-asset").setValue(Double.valueOf((double) aVar.getActiveId())).setParameters(u.anp().o(str, aVar.getInstrumentType()).o("user_balance_type", Integer.valueOf(com.iqoption.app.b.DG().DJ())).anr()).setValue(Double.valueOf((double) aVar.getActiveId())).build());
    }

    public void b(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        int activeId = aVar.getActiveId();
        TabHelper.i Jh = TabHelper.IM().Jh();
        if (!(Jh == null || (Jh.getActiveId() == activeId && Jh.getInstrumentType().equals(aVar.instrumentType)))) {
            TabHelper.IM().t(aVar);
        }
        com.iqoption.fragment.leftpanel.i.r(this).c(LeftPanelSection.ASSET_INFO);
        double d = (double) activeId;
        String str = "instrument_type";
        str = "balance_type";
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "change-asset_info").setValue(Double.valueOf(d)).setParameters(u.anp().o("asset_id", Integer.valueOf(activeId)).o(str, aVar.instrumentType).o(str, Integer.valueOf(com.iqoption.app.b.DG().DJ())).anr()).setValue(Double.valueOf(d)).build());
    }

    public void c(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        com.iqoption.fragment.rightpanel.n.s(this).X(aVar);
    }

    public void a(com.iqoption.fragment.assets.model.e eVar) {
        String id = eVar.getId();
        if ("more".equalsIgnoreCase(id)) {
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "more-opportunities_button-click").build());
            com.iqoption.fragment.dialog.f.d(this, getSupportFragmentManager());
        } else if (AssetCategoryType.BINARY.name().equalsIgnoreCase(id)) {
            db("WHATS_NEW_DIALOG_TYPE_BINARY");
        } else if (AssetCategoryType.DIGITAL.name().equalsIgnoreCase(id)) {
            db("WHATS_NEW_DIALOG_TYPE_DIGITAL");
        } else if (AssetCategoryType.FOREX_CLASSIC.name().equalsIgnoreCase(id)) {
            db("WHATS_NEW_DIALOG_TYPE_FOREX");
        }
    }

    private void db(String str) {
        if (com.iqoption.fragment.dialog.popup.whatsnew.a.E(this, str)) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager != null) {
                com.iqoption.fragment.dialog.popup.whatsnew.a.a((FragmentActivity) this, supportFragmentManager, str);
            }
        }
    }
}
