package com.iqoption.launcher;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.j;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.activity.OfflineActivity;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.app.IQApp;
import com.iqoption.core.splash.SplashLogHelper;
import com.iqoption.core.splash.d;
import com.iqoption.microservice.authorization.AuthException;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.system.a.e;
import com.iqoption.system.a.g;
import com.iqoption.util.MusicUtil;
import com.iqoption.util.Network;
import com.iqoption.util.v;
import com.iqoption.welcome.WelcomeScreenFeature;
import com.iqoption.welcomeonboarding.WelcomeOnboardingActivity;
import com.iqoption.x.R;
import java.util.Arrays;
import java.util.List;

public class LauncherActivity extends com.iqoption.activity.b {
    private static final String TAG = "com.iqoption.launcher.LauncherActivity";
    private static final List<String> dEB = Arrays.asList(new String[]{"https", "iqoption"});
    private d ajo;
    private final a dEC = new a(this);
    private final c dED = new c(this);
    private a dEE;

    public static class a extends e<LauncherActivity> {
        public a(LauncherActivity launcherActivity) {
            super(launcherActivity);
        }

        @com.google.common.b.e
        public void onApiConfigErrorEvent(com.iqoption.microservice.a.a aVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    LauncherActivity launcherActivity = (LauncherActivity) a.this.dUo.get();
                    if (launcherActivity != null) {
                        launcherActivity.clear("api-config-error");
                    }
                }
            });
        }
    }

    private static class c extends g<LauncherActivity> {
        public c(LauncherActivity launcherActivity) {
            super(launcherActivity);
        }

        @com.google.common.b.e
        public void onShowRelogin(com.iqoption.service.e.g gVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$LauncherActivity$c$NrD4ETCyskyb89glZYXIfVEKzeQ(this, gVar));
        }

        private /* synthetic */ void a(com.iqoption.service.e.g gVar) {
            LauncherActivity launcherActivity = (LauncherActivity) this.dUo.get();
            if (launcherActivity != null && !launcherActivity.isDestroyed()) {
                launcherActivity.clear(gVar.bvZ);
                launcherActivity.aNs();
            }
        }
    }

    private static class b extends com.iqoption.system.c.b<LauncherActivity, com.iqoption.b.b.a> {
        public b(LauncherActivity launcherActivity) {
            super(launcherActivity, com.iqoption.b.b.a.class);
        }

        /* renamed from: a */
        public void v(@NonNull LauncherActivity launcherActivity, com.iqoption.b.b.a aVar) {
            super.v(launcherActivity, aVar);
            launcherActivity.aNn();
        }

        /* renamed from: a */
        public void c(@NonNull LauncherActivity launcherActivity, Throwable th) {
            super.c(launcherActivity, th);
            launcherActivity.aNn();
        }
    }

    /* Access modifiers changed, original: protected */
    public void zQ() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dEE = a.y(this);
        setContentView((int) R.layout.activity_launcher);
        this.ajo = d.a(getSupportFragmentManager(), R.id.splashContainer, true);
        SplashLogHelper.bGE.bf(this);
        MusicUtil.n(this);
        this.dEC.register();
        this.dED.register();
        v.a(((com.iqoption.b.a) IQApp.Eu().asx.get()).JK(), new b(this));
    }

    private boolean t(Intent intent) {
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        String string = extras.getString("type");
        if (!TextUtils.isEmpty(string) && "39".equals(string)) {
            String string2 = extras.getString("link");
            if (!TextUtils.isEmpty(string2)) {
                return com.iqoption.core.util.b.d.a((Context) this, string2, null, null);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    private void aNl() {
        /*
        r7 = this;
        r0 = r7.getIntent();
        r0 = r0.getData();
        if (r0 == 0) goto L_0x008c;
    L_0x000a:
        r1 = dEB;
        r2 = r0.getScheme();
        r1 = r1.contains(r2);
        if (r1 != 0) goto L_0x0018;
    L_0x0016:
        goto L_0x008c;
    L_0x0018:
        r1 = r0.getPath();
        r2 = r1.hashCode();
        r3 = -2044725737; // 0xffffffff861ff617 float:-3.0085375E-35 double:NaN;
        r4 = -1;
        r5 = 1;
        r6 = 0;
        if (r2 == r3) goto L_0x0038;
    L_0x0028:
        r3 = 1905526730; // 0x719407ca float:1.4660223E30 double:9.414552945E-315;
        if (r2 == r3) goto L_0x002e;
    L_0x002d:
        goto L_0x0042;
    L_0x002e:
        r2 = "/verification";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0042;
    L_0x0036:
        r1 = 0;
        goto L_0x0043;
    L_0x0038:
        r2 = "/verify-bank-cards";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0042;
    L_0x0040:
        r1 = 1;
        goto L_0x0043;
    L_0x0042:
        r1 = -1;
    L_0x0043:
        if (r1 == 0) goto L_0x0089;
    L_0x0045:
        if (r1 == r5) goto L_0x0079;
    L_0x0047:
        r1 = r0.getHost();
        r2 = r1.hashCode();
        r3 = 1554454174; // 0x5ca7169e float:3.76249512E17 double:7.680024054E-315;
        if (r2 == r3) goto L_0x0055;
    L_0x0054:
        goto L_0x005e;
    L_0x0055:
        r2 = "deposit";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x005e;
    L_0x005d:
        r4 = 0;
    L_0x005e:
        if (r4 == 0) goto L_0x0061;
    L_0x0060:
        return;
    L_0x0061:
        r1 = "id";
        r0 = r0.getQueryParameter(r1);
        r1 = 0;
        r2 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0070 }
        r1 = java.lang.Long.valueOf(r2);	 Catch:{ NumberFormatException -> 0x0070 }
    L_0x0070:
        r0 = new com.iqoption.deposit.l;
        r0.<init>(r1, r6);
        com.iqoption.deposit.g.a(r7, r5, r6, r0);
        return;
    L_0x0079:
        r0 = com.iqoption.core.d.EH();
        r1 = "jumio-card-verification";
        r0 = r0.ej(r1);
        if (r0 == 0) goto L_0x0088;
    L_0x0085:
        com.iqoption.verify.VerifyCardsActivity.bA(r7);
    L_0x0088:
        return;
    L_0x0089:
        r7.aNm();
    L_0x008c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.launcher.LauncherActivity.aNl():void");
    }

    private void aNm() {
        this.dEE.aNu().observe(this, new -$$Lambda$LauncherActivity$75Beoo-FjZfeKoTZslFQAMgYlaU(this));
    }

    private /* synthetic */ void x(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            com.iqoption.kyc.e eVar = new com.iqoption.kyc.e();
            eVar.aIK();
            eVar.bA(this);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        super.onStop();
        WebSocketHandler.aTn().n(TAG, 30000);
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        this.dEC.unregister();
        this.dED.unregister();
        super.onDestroy();
    }

    private void aNn() {
        if (Network.ebO.aWS()) {
            if (com.iqoption.c.b.Ke()) {
                p.a(aNq(), new com.iqoption.system.c.b<LauncherActivity, Void>(this, Void.class) {
                    /* renamed from: a */
                    public void v(@NonNull LauncherActivity launcherActivity, @NonNull Void voidR) {
                        super.v(launcherActivity, voidR);
                        if (!LauncherActivity.this.aNo()) {
                            launcherActivity.aNt();
                            launcherActivity.aNl();
                        }
                    }

                    /* renamed from: a */
                    public void c(@NonNull LauncherActivity launcherActivity, Throwable th) {
                        super.c(launcherActivity, th);
                        if (!LauncherActivity.this.aNo()) {
                            if (th instanceof AuthException) {
                                AuthException authException = (AuthException) th;
                                if (authException.status == 100 || authException.status == 101) {
                                    LauncherActivity.this.clear("two-step-auth");
                                    launcherActivity.aNs();
                                    return;
                                }
                            }
                            LauncherActivity launcherActivity2 = LauncherActivity.this;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("platform-initialize-error ");
                            stringBuilder.append(th.getMessage());
                            launcherActivity2.clear(stringBuilder.toString());
                            launcherActivity.aNs();
                        }
                    }
                }, com.iqoption.core.c.a.biN);
            } else {
                p.a(aNp(), new com.iqoption.system.c.b<LauncherActivity, Boolean>(this, Boolean.class) {
                    /* renamed from: a */
                    public void v(@NonNull LauncherActivity launcherActivity, @NonNull Boolean bool) {
                        super.v(launcherActivity, bool);
                        f(launcherActivity);
                    }

                    /* renamed from: a */
                    public void c(@NonNull LauncherActivity launcherActivity, Throwable th) {
                        super.c(launcherActivity, th);
                        f(launcherActivity);
                    }

                    private void f(@NonNull LauncherActivity launcherActivity) {
                        if (!LauncherActivity.this.aNo()) {
                            launcherActivity.aNs();
                        }
                    }
                }, com.iqoption.core.c.a.biN);
            }
            return;
        }
        OfflineActivity.h(this);
        finish();
    }

    private boolean aNo() {
        j.dq().b((Activity) this);
        if (!t(getIntent())) {
            return false;
        }
        finish();
        return true;
    }

    @NonNull
    private static t<Boolean> aNp() {
        return v.a(v.a(v.a(aNr(), -$$Lambda$LauncherActivity$XBCVYRNsmgqBBgxHwbMYpQmhgzQ.INSTANCE), -$$Lambda$LauncherActivity$McWw2ZC2FpRrWdlVWbpqwXyJzwU.INSTANCE), -$$Lambda$LauncherActivity$CdLLUkKbJQmH9PXTrJZl2y2wTBI.INSTANCE);
    }

    @NonNull
    public static t<Void> aNq() {
        return v.a(v.a(v.a(v.a(v.a(v.a(aNr(), -$$Lambda$LauncherActivity$0v41d0C7WURW4kPYFzhfPGXq5Ik.INSTANCE), -$$Lambda$LauncherActivity$oV4Eg7kdQgOyBlMBkuNh45N4J0s.INSTANCE), -$$Lambda$LauncherActivity$q93l819gEfRO6J_fBBqDHHzTYiU.INSTANCE), -$$Lambda$LauncherActivity$guGlbyM3jVL_PWHvi1oIRAycyiI.INSTANCE), -$$Lambda$LauncherActivity$0NRN8WBtfi1xL9a6wsB6QeYe0Uw.INSTANCE), -$$Lambda$LauncherActivity$_pmBO4TrRcoOhs8CVsJOh1_OgAA.INSTANCE);
    }

    private static t<?> aNr() {
        return com.iqoption.core.rx.g.a(IQApp.Ev().UZ());
    }

    private void aNs() {
        setRequestedOrientation(4);
        Intent bQ = WelcomeOnboardingActivity.bQ(this);
        com.iqoption.app.d.Fa().dV(WelcomeScreenFeature.getWelcomeScreenFeature(com.iqoption.core.d.EH().ei("new-welcome-screen")).name());
        bQ.addFlags(67174400);
        bQ.putExtra("EXTRA_SHARED_STATE", this.ajo.akF());
        u(bQ);
        startActivity(bQ);
        com.iqoption.util.a.i(this);
        overridePendingTransition(0, 0);
    }

    public void onResume() {
        super.onResume();
        this.ajo.show();
        com.iqoption.app.managers.feature.c.Iw().Ix();
    }

    public void onPause() {
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1001) {
            ((com.iqoption.b.a) IQApp.Eu().asx.get()).b(getApplication());
            if (iArr.length <= 0 || iArr[0] != 0) {
                IQApp.a("IMEI permission denied", null);
            } else {
                IQApp.a("IMEI permission granted", null);
            }
            v.a(((com.iqoption.b.a) IQApp.Eu().asx.get()).JK(), new b(this));
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    private void u(Intent intent) {
        Intent intent2 = getIntent();
        if (intent2 != null) {
            if (intent2.getExtras() != null) {
                intent.putExtras(intent2.getExtras());
            }
            if (intent2.getData() != null) {
                intent.setData(intent2.getData());
            }
        }
    }

    private void aNt() {
        com.iqoption.app.d.setLong("a63e971afa3e", System.currentTimeMillis());
        Intent intent = new Intent(this, TradeRoomActivity.class);
        intent.addFlags(65536);
        intent.putExtra("EXTRA_SHARED_STATE", this.ajo.akF());
        u(intent);
        startActivity(intent);
        finish();
        overridePendingTransition(0, 0);
    }

    private void clear(String str) {
        com.iqoption.core.c.a.Yc();
        com.iqoption.gl.c.aIy().removeAllSmallDeals();
        com.iqoption.app.b.aK(this).aL(this);
        RequestManager.aOR().aOZ();
        RequestManager.aOR().aOY();
        IQApp.Ev().release();
        com.iqoption.fragment.d.b.aIa().onStop();
        com.iqoption.app.d.aP(this).dH(str);
    }
}
