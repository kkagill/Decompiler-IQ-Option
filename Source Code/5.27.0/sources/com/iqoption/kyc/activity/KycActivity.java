package com.iqoption.kyc.activity;

import android.app.TaskStackBuilder;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.p;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import com.iqoption.core.microservices.kyc.response.questionnaire.KycControlElement;
import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.core.util.LocalizationUtil;
import com.iqoption.dto.entity.iqbus.Country;
import com.iqoption.dto.entity.result.KycQuestionsResult.Question;
import com.iqoption.dto.entity.result.KycState;
import com.iqoption.fragment.MenuFragment;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment;
import com.iqoption.mobbtech.connect.response.MobbErrorException;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.util.t;
import com.iqoption.util.v;
import com.iqoption.util.y;
import com.iqoption.x.R;
import com.jumio.MobileSDK;
import com.jumio.analytics.MobileEvents;
import com.jumio.core.exceptions.MissingPermissionException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class KycActivity extends com.iqoption.core.ui.a.a implements com.iqoption.kyc.fragment.a.a, com.iqoption.kyc.fragment.a.a.a, com.iqoption.kyc.fragment.b.a, com.iqoption.kyc.fragment.b.b.a, com.iqoption.kyc.fragment.b.c.a, com.iqoption.kyc.fragment.b.e.a, com.iqoption.kyc.fragment.b.f.a, com.iqoption.kyc.fragment.b.g.a, com.iqoption.kyc.fragment.b.h.a, com.iqoption.kyc.fragment.b.i.a, com.iqoption.kyc.fragment.c.a.b, com.iqoption.kyc.fragment.c.b.a, com.iqoption.kyc.fragment.c.c.b, com.iqoption.kyc.fragment.d.a.a, com.iqoption.kyc.fragment.d.b.a, com.iqoption.kyc.fragment.d.c.b, com.iqoption.kyc.fragment.d.d.a, com.iqoption.kyc.fragment.d.e.a, com.iqoption.kyc.fragment.d.f.a, com.iqoption.kyc.fragment.f.a.a.a, com.iqoption.kyc.fragment.f.a.b.a, com.iqoption.kyc.fragment.f.a.c.b, com.iqoption.kyc.fragment.f.a.d.a, com.iqoption.kyc.fragment.f.a.e.a, com.iqoption.kyc.fragment.g.a.a, com.iqoption.kyc.fragment.g.b.a, com.iqoption.kyc.fragment.gdpr.a.b, com.iqoption.kyc.k, com.iqoption.view.b {
    private static final String TAG = "com.iqoption.kyc.activity.KycActivity";
    private boolean aiU;
    private View cwx;
    private boolean drT = false;
    private String drU = "";
    private h dtk = new h();
    private c dtl = new c(this, null);
    @Nullable
    private com.iqoption.kyc.g dtm;
    @Nullable
    private com.iqoption.kyc.i dtn;
    @Nullable
    private MobileSDK dto;
    private boolean dtp;
    private final com.iqoption.view.c dtq = new com.iqoption.view.c();

    private static class h implements Parcelable {
        public static final Creator<h> CREATOR = new Creator<h>() {
            /* renamed from: ad */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            /* renamed from: gl */
            public h[] newArray(int i) {
                return new h[i];
            }
        };
        private boolean drX;
        @Nullable
        private KycState dsf;
        private com.iqoption.kyc.profile.a dtB = new com.iqoption.kyc.profile.a();
        @Nullable
        com.iqoption.microservice.b.a.b dtC;
        @Nullable
        private List<Integer> dtD;
        @Nullable
        private com.iqoption.core.microservices.kyc.response.document.f dtE;
        private boolean dtF;
        private boolean dtG;
        private boolean dtH;
        private boolean dtI;
        private boolean dtJ;
        @Nullable
        private HashMap<Integer, Question> questionMap;

        public int describeContents() {
            return 0;
        }

        h() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.dtB, i);
            HashMap hashMap = this.questionMap;
            parcel.writeLong(hashMap == null ? 0 : (long) hashMap.size());
            hashMap = this.questionMap;
            if (hashMap != null) {
                for (Entry entry : hashMap.entrySet()) {
                    parcel.writeValue(entry.getKey());
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
            parcel.writeList(this.dtD);
            if (this.dtC == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeParcelable(this.dtC, 0);
            }
            parcel.writeParcelable(this.dtE, i);
            parcel.writeParcelable(this.dsf, i);
            parcel.writeByte(this.dtF);
            parcel.writeByte(this.dtG);
            parcel.writeByte(this.dtH);
            parcel.writeByte(this.dtI);
            parcel.writeByte(this.drX);
            parcel.writeByte(this.dtJ);
        }

        protected h(Parcel parcel) {
            this.dtB = (com.iqoption.kyc.profile.a) parcel.readParcelable(com.iqoption.kyc.profile.a.class.getClassLoader());
            this.questionMap = new HashMap();
            long readLong = parcel.readLong();
            for (long j = 0; j < readLong; j++) {
                this.questionMap.put((Integer) parcel.readValue(Integer.class.getClassLoader()), parcel.readParcelable(Question.class.getClassLoader()));
            }
            this.dtD = new ArrayList();
            parcel.readList(this.dtD, Integer.class.getClassLoader());
            if (parcel.readInt() != 0) {
                this.dtC = (com.iqoption.microservice.b.a.b) parcel.readParcelable(com.iqoption.microservice.b.a.b.class.getClassLoader());
            }
            this.dtE = (com.iqoption.core.microservices.kyc.response.document.f) parcel.readParcelable(com.iqoption.core.microservices.kyc.response.document.f.class.getClassLoader());
            this.dsf = (KycState) parcel.readParcelable(KycState.class.getClassLoader());
            boolean z = true;
            this.dtF = parcel.readByte() != (byte) 0;
            this.dtG = parcel.readByte() != (byte) 0;
            this.dtH = parcel.readByte() != (byte) 0;
            this.dtI = parcel.readByte() != (byte) 0;
            this.drX = parcel.readByte() != (byte) 0;
            if (parcel.readByte() == (byte) 0) {
                z = false;
            }
            this.dtJ = z;
        }
    }

    private class c extends com.iqoption.system.a.d {
        private c() {
        }

        /* synthetic */ c(KycActivity kycActivity, AnonymousClass1 anonymousClass1) {
            this();
        }

        @com.google.common.b.e
        public void onAccountActivated(com.iqoption.app.b.b.a aVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    if (KycActivity.this.aiU) {
                        KycActivity.this.aJB();
                    }
                }
            });
        }
    }

    private static class a extends com.iqoption.system.c.b<KycActivity, com.iqoption.core.microservices.kyc.response.a> {
        public a(KycActivity kycActivity) {
            super(kycActivity);
        }

        /* renamed from: a */
        public void v(KycActivity kycActivity, com.iqoption.core.microservices.kyc.response.a aVar) {
            super.v(kycActivity, aVar);
            kycActivity.d(com.iqoption.kyc.fragment.c.b.e(kycActivity.dtk.dsf), com.iqoption.kyc.fragment.c.b.TAG);
        }

        /* renamed from: d */
        public void c(KycActivity kycActivity, Throwable th) {
            super.c(kycActivity, th);
            String K = com.iqoption.service.websocket.a.K(th);
            if (TextUtils.isEmpty(K)) {
                MobbErrorException.R(th);
            } else {
                com.iqoption.app.a.b.dZ(K);
            }
        }
    }

    private static class b extends com.iqoption.system.c.b<KycActivity, com.iqoption.core.microservices.kyc.response.document.e> {
        public b(KycActivity kycActivity) {
            super(kycActivity);
        }

        /* renamed from: a */
        public void v(KycActivity kycActivity, com.iqoption.core.microservices.kyc.response.document.e eVar) {
            super.v(kycActivity, eVar);
            boolean z = kycActivity.dtm == null || kycActivity.dtm.Er();
            kycActivity.d(com.iqoption.kyc.fragment.b.f.a(eVar, com.iqoption.app.managers.feature.c.Iw().ej("close-kyc-docs"), z), com.iqoption.kyc.fragment.b.f.TAG);
        }

        /* renamed from: d */
        public void c(KycActivity kycActivity, Throwable th) {
            super.c(kycActivity, th);
            MobbErrorException.R(th);
        }
    }

    private static class d extends com.iqoption.system.c.b<KycActivity, KycState> {
        public d(KycActivity kycActivity, String str) {
            super(kycActivity);
        }

        /* renamed from: a */
        public void v(KycActivity kycActivity, KycState kycState) {
            super.v(kycActivity, kycState);
            kycActivity.dtm.b(kycState);
            kycActivity.aJJ();
        }

        /* renamed from: d */
        public void c(KycActivity kycActivity, Throwable th) {
            super.c(kycActivity, th);
            kycActivity.aJJ();
        }
    }

    private static class e extends com.iqoption.system.c.b<KycActivity, com.iqoption.core.microservices.kyc.response.document.e> {
        public e(KycActivity kycActivity) {
            super(kycActivity);
        }

        /* renamed from: a */
        public void v(KycActivity kycActivity, com.iqoption.core.microservices.kyc.response.document.e eVar) {
            super.v(kycActivity, eVar);
            Fragment c = kycActivity.aKi();
            if (c instanceof com.iqoption.kyc.fragment.b.f) {
                com.iqoption.core.c.a.biN.postDelayed(new -$$Lambda$KycActivity$e$5fJpGmyWRBM1szN8BmL2vxDoGrk(c, eVar), 200);
            }
        }

        /* renamed from: d */
        public void c(KycActivity kycActivity, Throwable th) {
            super.c(kycActivity, th);
            final Fragment c = kycActivity.aKi();
            if (c instanceof com.iqoption.kyc.fragment.b.f) {
                com.iqoption.core.c.a.biN.postDelayed(new Runnable() {
                    public void run() {
                        ((com.iqoption.kyc.fragment.b.f) c).ev(false);
                    }
                }, 200);
            }
            MobbErrorException.R(th);
        }
    }

    private static class f extends com.iqoption.system.c.b<KycActivity, com.iqoption.core.microservices.c> {
        private final long dtA;
        private final boolean dtz;

        public f(KycActivity kycActivity, long j, boolean z) {
            super(kycActivity);
            this.dtz = z;
            this.dtA = j;
        }

        /* renamed from: a */
        public void v(KycActivity kycActivity, com.iqoption.core.microservices.c cVar) {
            super.v(kycActivity, cVar);
            if (kycActivity.dtm != null) {
                kycActivity.dtm.aG(this.dtA);
            }
            if (this.dtz) {
                kycActivity.d(com.iqoption.kyc.fragment.c.a.d(kycActivity.dtk.dsf), com.iqoption.kyc.fragment.c.a.TAG);
            }
        }

        /* renamed from: d */
        public void c(KycActivity kycActivity, Throwable th) {
            super.c(kycActivity, th);
            MobbErrorException.R(th);
        }
    }

    private static class g extends com.iqoption.system.c.b<KycActivity, Object> {
        public g(KycActivity kycActivity) {
            super(kycActivity, Object.class);
        }

        /* renamed from: b */
        public void v(@NonNull KycActivity kycActivity, @NonNull Object obj) {
            super.v(kycActivity, obj);
            kycActivity.ev(false);
        }

        /* renamed from: d */
        public void c(@NonNull KycActivity kycActivity, Throwable th) {
            super.c(kycActivity, th);
            kycActivity.ev(false);
            kycActivity.aJz();
        }
    }

    private static class i extends com.iqoption.system.c.b<KycActivity, Object> {
        private final Runnable dtK;

        public i(KycActivity kycActivity, Runnable runnable) {
            super(kycActivity, Object.class);
            this.dtK = runnable;
        }

        /* renamed from: b */
        public void v(KycActivity kycActivity, Object obj) {
            super.v(kycActivity, obj);
            if (kycActivity.dtm != null) {
                com.iqoption.kyc.a.a.b(true, null, kycActivity.dtm.Er());
            }
            this.dtK.run();
        }

        /* renamed from: d */
        public void c(KycActivity kycActivity, Throwable th) {
            super.c(kycActivity, th);
            String K = com.iqoption.service.websocket.a.K(th);
            if (K != null) {
                com.iqoption.app.a.b.dZ(K);
            } else {
                MobbErrorException.R(th);
            }
            if (kycActivity.dtm != null) {
                com.iqoption.kyc.a.a.b(false, K, kycActivity.dtm.Er());
            }
        }
    }

    private static class j extends com.iqoption.system.c.b<KycActivity, com.iqoption.core.microservices.kyc.response.document.e> {
        public j(KycActivity kycActivity) {
            super(kycActivity);
        }

        /* renamed from: a */
        public void v(KycActivity kycActivity, com.iqoption.core.microservices.kyc.response.document.e eVar) {
            super.v(kycActivity, eVar);
            boolean z = false;
            kycActivity.ev(false);
            boolean ej = com.iqoption.app.managers.feature.c.Iw().ej("close-kyc-docs");
            if (kycActivity.dtm == null || kycActivity.dtm.Er()) {
                z = true;
            }
            kycActivity.d(com.iqoption.kyc.fragment.b.f.a(eVar, ej, z), com.iqoption.kyc.fragment.b.f.TAG);
        }

        /* renamed from: d */
        public void c(KycActivity kycActivity, Throwable th) {
            super.c(kycActivity, th);
            MobbErrorException.R(th);
            kycActivity.aJz();
        }
    }

    private static class k extends com.iqoption.system.c.b<KycActivity, KycState> {
        public k(KycActivity kycActivity) {
            super(kycActivity);
        }

        /* renamed from: a */
        public void v(KycActivity kycActivity, KycState kycState) {
            super.v(kycActivity, kycState);
            kycActivity.dtk.dsf = kycState;
            kycActivity.aJH();
        }

        /* renamed from: d */
        public void c(KycActivity kycActivity, Throwable th) {
            super.c(kycActivity, th);
            kycActivity.aJH();
        }
    }

    private static class l extends com.iqoption.system.c.b<KycActivity, KycState> {
        public l(KycActivity kycActivity) {
            super(kycActivity);
        }

        /* renamed from: a */
        public void v(KycActivity kycActivity, KycState kycState) {
            super.v(kycActivity, kycState);
            com.iqoption.app.b.aK(kycActivity).a(kycState);
            kycActivity.aJz();
        }

        /* renamed from: d */
        public void c(KycActivity kycActivity, Throwable th) {
            super.c(kycActivity, th);
            kycActivity.aJz();
        }
    }

    private void aJB() {
    }

    private boolean aJC() {
        return false;
    }

    public void aJP() {
    }

    public void a(@NonNull com.iqoption.view.b.a aVar) {
        this.dtq.a(aVar);
    }

    public void b(@NonNull com.iqoption.view.b.a aVar) {
        this.dtq.b(aVar);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        setContentView((int) R.layout.activity_kyc);
        String str = "";
        setTitle(str);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.drU = extras.getString("ARG_KYC_START_SCREEN_TAG", str);
            this.drT = extras.getBoolean("ARG_KYC_SKIP_CYSEC");
            this.dtp = extras.getBoolean("ARG_SHOW_DEPOSIT_AFTER_FINISH");
            this.dtk.dsf = (KycState) extras.getParcelable("ARG_KYC_STATE");
            this.dtk.dtI = extras.getBoolean("ARG_IS_HIDE_INTRO_SKIP");
            this.dtk.drX = extras.getBoolean("ARG_RETURN_TO_PARENT");
            this.dtk.dtJ = ((KycStepType) extras.getSerializable("ARG_ONLY_SCREEN")) == KycStepType.PHONE;
        }
        FragmentManager.enableDebugLogging(false);
        this.dtm = new com.iqoption.kyc.g(this, this.dtk.dsf);
        this.dtn = new com.iqoption.kyc.i(this);
        this.cwx = findViewById(R.id.progress);
        if (bundle == null) {
            aJw();
            return;
        }
        str = "KEY_KYC_RESTORED_VALUES";
        if (bundle.containsKey(str)) {
            this.dtk = (h) bundle.getParcelable(str);
        }
    }

    /* JADX WARNING: Missing block: B:14:0x0079, code skipped:
            if ("enabled-without-skip".equals(r1.getStatus()) != false) goto L_0x007d;
     */
    private void aJw() {
        /*
        r7 = this;
        r0 = r7.getSupportFragmentManager();
        r0 = r0.beginTransaction();
        r1 = com.iqoption.kyc.fragment.b.f.TAG;
        r2 = r7.drU;
        r1 = r1.equals(r2);
        r2 = 1;
        if (r1 == 0) goto L_0x0027;
    L_0x0013:
        r7.ev(r2);
        r0 = r7.dtn;
        r1 = 0;
        r0 = r0.i(r1);
        r1 = new com.iqoption.kyc.activity.KycActivity$j;
        r1.<init>(r7);
        com.iqoption.util.v.a(r0, r1);
        goto L_0x00da;
    L_0x0027:
        r1 = com.iqoption.kyc.fragment.b.e.TAG;
        r3 = r7.drU;
        r1 = r1.equals(r3);
        r3 = 2131363072; // 0x7f0a0500 float:1.8345942E38 double:1.0530332727E-314;
        if (r1 == 0) goto L_0x0043;
    L_0x0034:
        r1 = com.iqoption.kyc.fragment.b.e.aLl();
        r2 = com.iqoption.kyc.fragment.b.e.TAG;
        r0 = r0.replace(r3, r1, r2);
        r0.commit();
        goto L_0x00da;
    L_0x0043:
        r1 = com.iqoption.kyc.fragment.a.TAG;
        r4 = r7.drU;
        r1 = r1.equals(r4);
        r4 = 0;
        if (r1 == 0) goto L_0x0094;
    L_0x004e:
        r1 = r7.dtk;
        r1.dtF = r2;
        r1 = r7.dtm;
        r1 = r1.aIW();
        if (r1 != 0) goto L_0x0061;
    L_0x005b:
        r1 = r7.dtk;
        r1.dtG = r2;
        goto L_0x0080;
    L_0x0061:
        r1 = com.iqoption.app.managers.feature.c.Iw();
        r5 = "kyc-show-after-registration";
        r1 = r1.ei(r5);
        r5 = r7.dtk;
        if (r1 == 0) goto L_0x007c;
    L_0x006f:
        r1 = r1.getStatus();
        r6 = "enabled-without-skip";
        r1 = r6.equals(r1);
        if (r1 == 0) goto L_0x007c;
    L_0x007b:
        goto L_0x007d;
    L_0x007c:
        r2 = 0;
    L_0x007d:
        r5.dtG = r2;
    L_0x0080:
        r1 = r7.dtk;
        r1 = r1.dtG;
        r1 = com.iqoption.kyc.fragment.a.eH(r1);
        r2 = com.iqoption.kyc.fragment.a.TAG;
        r0 = r0.replace(r3, r1, r2);
        r0.commit();
        goto L_0x00da;
    L_0x0094:
        r1 = com.iqoption.kyc.fragment.c.c.TAG;
        r2 = r7.drU;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x00bb;
    L_0x009e:
        r1 = r7.dtk;
        r1 = r1.dtJ;
        if (r1 == 0) goto L_0x00a7;
    L_0x00a6:
        goto L_0x00bb;
    L_0x00a7:
        r1 = r7.dtk;
        r1 = r1.dtI;
        r1 = com.iqoption.kyc.fragment.b.eI(r1);
        r2 = com.iqoption.kyc.fragment.b.TAG;
        r0 = r0.replace(r3, r1, r2);
        r0.commit();
        goto L_0x00da;
    L_0x00bb:
        r0 = r7.ew(r4);
        r1 = r0.first;
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x00d0;
    L_0x00c9:
        r0 = r0.second;
        r0 = (java.lang.String) r0;
        r7.drU = r0;
        goto L_0x00da;
    L_0x00d0:
        r0 = com.iqoption.core.c.a.biN;
        r1 = new com.iqoption.kyc.activity.-$$Lambda$KycActivity$-ZDnyZgOR2bGPsQ8kc-O5YZmj5Q;
        r1.<init>(r7);
        r0.post(r1);
    L_0x00da:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.activity.KycActivity.aJw():void");
    }

    private /* synthetic */ void aKl() {
        aJz();
    }

    private void ev(boolean z) {
        this.cwx.setVisibility(z ? 0 : 8);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("KEY_KYC_RESTORED_VALUES", this.dtk);
        super.onSaveInstanceState(bundle);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        aJx();
        return true;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void aJx() {
        aJA();
        y.j(this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (t.a(supportFragmentManager, this.drU)) {
            aJz();
        } else if (supportFragmentManager.getBackStackEntryCount() > 0) {
            supportFragmentManager.popBackStackImmediate();
            a.l(getSupportFragmentManager());
        } else {
            this.dtp = false;
            aJz();
        }
    }

    public void aJy() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        int backStackEntryCount = supportFragmentManager.getBackStackEntryCount();
        for (int i = 0; i < backStackEntryCount; i++) {
            supportFragmentManager.popBackStackImmediate();
        }
    }

    private void aJz() {
        Fragment n = t.n(getSupportFragmentManager());
        if (!(n == null || !(n instanceof com.iqoption.kyc.a.b) || this.dtm == null)) {
            com.iqoption.kyc.a.b bVar = (com.iqoption.kyc.a.b) n;
            com.iqoption.kyc.a.a.j(bVar.aKn(), bVar.aKo(), this.dtm.Er());
        }
        if (this.dtk.drX) {
            Intent parentActivityIntent = NavUtils.getParentActivityIntent(this);
            Bundle extras = parentActivityIntent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putBoolean("START_FROM_ACTIVITY", true);
            extras.putBoolean("SHOW_DEPOSIT_PAGE", this.dtp);
            parentActivityIntent.putExtras(extras);
            if (NavUtils.shouldUpRecreateTask(this, parentActivityIntent) || isTaskRoot()) {
                com.iqoption.util.a.i(this);
                TaskStackBuilder.create(this).addNextIntentWithParentStack(parentActivityIntent).startActivities();
            } else {
                parentActivityIntent.setFlags(67108864);
                NavUtils.navigateUpTo(this, parentActivityIntent);
            }
            return;
        }
        finish();
    }

    public void onResume() {
        super.onResume();
        this.aiU = true;
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        ev(true);
        v.a(WebSocketHandler.aTn().cj(TAG), new g(this));
        this.dtl.register();
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        super.onStop();
        WebSocketHandler.aTn().n(TAG, 30000);
        PasscodeFragment.bv(this);
        this.dtl.unregister();
        this.aiU = false;
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        FragmentManager.enableDebugLogging(false);
        super.onDestroy();
    }

    public void onBackPressed() {
        y.j(this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (!this.dtq.onBackPressed()) {
            if (!((this.dtk.dtG && t.a(supportFragmentManager, com.iqoption.kyc.fragment.a.TAG)) || t.a(supportFragmentManager, com.iqoption.kyc.fragment.f.a.d.TAG) || t.a(supportFragmentManager, com.iqoption.kyc.fragment.f.a.a.TAG) || t.a(supportFragmentManager, com.iqoption.kyc.fragment.f.a.b.TAG) || t.a(supportFragmentManager, com.iqoption.kyc.fragment.e.a.TAG) || t.a(supportFragmentManager, com.iqoption.kyc.fragment.f.a.e.TAG))) {
                aJA();
                if (t.a(supportFragmentManager, this.drU)) {
                    this.dtp = false;
                    aJz();
                } else if (supportFragmentManager.getBackStackEntryCount() > 0) {
                    supportFragmentManager.popBackStackImmediate();
                } else {
                    this.dtp = false;
                    aJz();
                }
            }
        }
    }

    private void d(Fragment fragment, String str) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment n = t.n(supportFragmentManager);
        if (n != null && (n instanceof com.iqoption.kyc.a.b) && (fragment instanceof com.iqoption.kyc.a.b)) {
            com.iqoption.kyc.a.b bVar = (com.iqoption.kyc.a.b) n;
            if (bVar.aKp()) {
                com.iqoption.kyc.a.a.g(bVar.aKn(), bVar.aKo(), ((com.iqoption.kyc.a.b) fragment).aKo(), this.dtm.Er());
            }
        }
        y.j(this);
        supportFragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in_right_short, R.anim.alpha_out_short, R.anim.alpha_in_short, R.anim.slide_out_right_short).replace(R.id.kycFrame, fragment, str).addToBackStack(str).commitAllowingStateLoss();
    }

    private void aJA() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment n = t.n(supportFragmentManager);
        Fragment o = t.o(supportFragmentManager);
        if (n instanceof com.iqoption.kyc.a.b) {
            String aKo = o instanceof com.iqoption.kyc.a.b ? ((com.iqoption.kyc.a.b) o).aKo() : o == null ? "Traderoom" : "";
            com.iqoption.kyc.a.b bVar = (com.iqoption.kyc.a.b) n;
            com.iqoption.kyc.a.a.f(bVar.aKn(), bVar.aKo(), aKo, this.dtm.Er());
        }
    }

    private Pair<Boolean, String> ew(boolean z) {
        Boolean valueOf = Boolean.valueOf(false);
        if (z && this.dtm.aIN()) {
            return Pair.create(valueOf, null);
        }
        if (this.dtm.Eo() || (this.dtk.dtF && !this.dtk.dtJ)) {
            return Pair.create(valueOf, null);
        }
        Object obj;
        if (this.dtm.aIR()) {
            obj = com.iqoption.kyc.fragment.c.c.TAG;
            d(com.iqoption.kyc.fragment.c.c.f(this.dtk.dsf), com.iqoption.kyc.fragment.c.c.TAG);
        } else {
            obj = com.iqoption.kyc.fragment.c.a.TAG;
            d(com.iqoption.kyc.fragment.c.a.d(this.dtk.dsf), com.iqoption.kyc.fragment.c.a.TAG);
        }
        return Pair.create(Boolean.valueOf(true), obj);
    }

    private boolean aJD() {
        if (this.dtm.aIV()) {
            return false;
        }
        d(com.iqoption.kyc.fragment.d.e.d(this.dtk.dsf, this.dtk.dtB), com.iqoption.kyc.fragment.d.e.TAG);
        return true;
    }

    private boolean aJE() {
        boolean Er = this.dtm.Er();
        if ((Er && this.dtk.dtF) || this.dtk.dtJ) {
            return false;
        }
        if (this.dtm.aIU()) {
            d(com.iqoption.kyc.fragment.b.f.a(null, com.iqoption.app.managers.feature.c.Iw().ej("close-kyc-docs"), Er), com.iqoption.kyc.fragment.b.f.TAG);
            v.a(this.dtn.i(null), new e(this));
        } else {
            d(com.iqoption.kyc.fragment.b.e.aLl(), com.iqoption.kyc.fragment.b.e.TAG);
        }
        return true;
    }

    private boolean aJF() {
        if (!this.dtm.Er() || this.dtm.aIV()) {
            return false;
        }
        ev(true);
        v.a(v.a(v.a(com.iqoption.microservice.b.a.a.dGF.aOe(), -$$Lambda$KycActivity$UJVNulfHpZVh8v3DMeDq4e4ihTA.INSTANCE), -$$Lambda$KycActivity$QpZaSFVNCpT3kI34xKYWvAy96dc.INSTANCE), (Object) this, -$$Lambda$KycActivity$s4d6cbJSpNYtNkC7Q-K73X5hBA0.INSTANCE, -$$Lambda$KycActivity$lPF8DajmBVScnSnkUGnTYB0vjQo.INSTANCE, com.iqoption.core.c.a.biN);
        return true;
    }

    private static /* synthetic */ com.google.common.util.concurrent.t bd(List list) {
        com.google.common.collect.i b = com.google.common.collect.i.b((Iterable) list).b(Predicates.a(-$$Lambda$KycActivity$mfcdILJu4-B77zZhWZsSSwTg4Ks.INSTANCE, -$$Lambda$KycActivity$zj1jlTSVIyRWNyIiXl4C6NGrlfY.INSTANCE)).a(-$$Lambda$4iyOYQzM21RSWx4-RyZrlfoujWs.INSTANCE).b(Predicates.qb());
        com.iqoption.microservice.b.a.a aVar = com.iqoption.microservice.b.a.a.dGF;
        aVar.getClass();
        return p.B(b.a(new -$$Lambda$nyBiP1gEpUHfH0agBhHNadt9iOM(aVar)).sC());
    }

    private static /* synthetic */ com.google.common.util.concurrent.t bc(List list) {
        List<com.iqoption.core.microservices.kyc.response.questionnaire.d> sortedCopy = com.iqoption.core.microservices.kyc.response.questionnaire.c.bvh.aeZ().sortedCopy(list);
        for (com.iqoption.core.microservices.kyc.response.questionnaire.d afd : sortedCopy) {
            for (com.iqoption.core.microservices.kyc.response.questionnaire.f afk : afd.afd()) {
                Collections.sort(afk.afk(), com.iqoption.core.microservices.kyc.response.questionnaire.c.bvh.afb());
            }
        }
        return p.bo(sortedCopy);
    }

    private static /* synthetic */ void c(KycActivity kycActivity, Throwable th) {
        kycActivity.ev(false);
        MobbErrorException.R(th);
    }

    private void aJG() {
        com.iqoption.microservice.b.a.b bVar = this.dtk.dtC;
        if (bVar.aMF()) {
            a(bVar.aMH(), bVar.aMD());
            return;
        }
        com.google.common.util.concurrent.t aOf = com.iqoption.microservice.b.a.a.dGF.aOf();
        ev(true);
        v.a(aOf, (Object) this, new -$$Lambda$KycActivity$u5lLRq1SKKKeSaFBIXCVg7VTFNA(this), -$$Lambda$KycActivity$rfHvUIWnp5S6yTQDMbJGf1h30K0.INSTANCE, com.iqoption.core.c.a.biN);
    }

    public void a(QuestionnaireType questionnaireType, com.iqoption.core.microservices.kyc.response.questionnaire.f fVar, List<Integer> list, @Nullable String str) {
        com.google.common.base.i.checkNotNull(this.dtk.dtC);
        com.iqoption.microservice.b.a.b bVar = this.dtk.dtC;
        bVar.b(questionnaireType, fVar, list, str);
        if (bVar.aOg()) {
            com.google.common.util.concurrent.t b = com.iqoption.microservice.b.a.a.dGF.b(questionnaireType, com.google.common.collect.i.b(bVar.aMG().entrySet()).a(-$$Lambda$KycActivity$W_LXpSzliZvODQpu0lrWf1BQ-rQ.INSTANCE).sC());
            ev(true);
            v.a(b, (Object) this, -$$Lambda$KycActivity$mByrVyirAw7r4iA6GigZIkYrf7Q.INSTANCE, -$$Lambda$KycActivity$I4HGbKGdFCL6eozJXuWTv1Mg1JQ.INSTANCE, com.iqoption.core.c.a.biN);
            return;
        }
        aJG();
    }

    @NonNull
    private com.google.common.util.concurrent.t<? extends com.iqoption.core.microservices.c> a(int i, long j, boolean z) {
        com.iqoption.kyc.i iVar = this.dtn;
        if (iVar == null) {
            return p.vF();
        }
        Pair a = iVar.a(i, j, this.dtk.dsf);
        p.a((com.google.common.util.concurrent.t) a.first, new f(this, ((Long) a.second).longValue(), z), com.iqoption.core.c.a.biN);
        return (com.google.common.util.concurrent.t) a.first;
    }

    private com.google.common.util.concurrent.t<List<Object>> j(VerificationType verificationType) {
        com.google.common.util.concurrent.t aPv = com.iqoption.mobbtech.connect.request.api.d.aPv();
        com.google.common.util.concurrent.t bQ = com.iqoption.mobbtech.connect.request.api.c.bQ(this.dtm.d(this.dtk.dtB));
        com.google.common.util.concurrent.t[] tVarArr = new com.google.common.util.concurrent.t[]{aPv, bQ};
        return p.a(v.a(p.a(tVarArr), new -$$Lambda$KycActivity$pbixURoco4CWs5ZG5-JcklyzN9c(this, verificationType)), bQ);
    }

    private void aJH() {
        if (this.dtm != null && !aJC() && !aJD() && !((Boolean) ew(this.dtk.dtJ ^ 1).first).booleanValue() && !aJE()) {
            aJJ();
        }
    }

    private int aJI() {
        if (this.dtk.dtH) {
            return 1;
        }
        return this.dtp ? 2 : 0;
    }

    private void aJJ() {
        if (this.dtm.Er() && !Boolean.TRUE.equals(com.iqoption.app.b.aK(this).Ed().abv()) && com.iqoption.gdpr.a.bz(this)) {
            d(com.iqoption.kyc.fragment.gdpr.a.aLg(), com.iqoption.kyc.fragment.gdpr.a.TAG);
        } else {
            aJK();
        }
    }

    public void aJK() {
        d(com.iqoption.kyc.fragment.a.a.m(aJI(), this.dtm.Er()), com.iqoption.kyc.fragment.a.a.TAG);
    }

    public com.google.common.util.concurrent.t<? extends com.iqoption.core.microservices.c> w(int i, long j) {
        return a(i, j, true);
    }

    public com.google.common.util.concurrent.t<? extends com.iqoption.core.microservices.c> aJL() {
        com.iqoption.kyc.g gVar = this.dtm;
        PhoneNumber aIO = gVar != null ? gVar.aIO() : null;
        if (aIO == null) {
            return p.vF();
        }
        return a(aIO.xK(), aIO.yj(), false);
    }

    public com.google.common.util.concurrent.t<com.iqoption.core.microservices.kyc.response.a> iJ(String str) {
        com.iqoption.kyc.i iVar = this.dtn;
        if (iVar == null) {
            return p.vF();
        }
        com.google.common.util.concurrent.t iH = iVar.iH(str);
        p.a(iH, new a(this), com.iqoption.core.c.a.biN);
        return iH;
    }

    public void aJM() {
        this.dtp = false;
        this.dtn.aJa();
        if (!aJE()) {
            aJJ();
        }
    }

    public void aJN() {
        if (!aJE()) {
            aJJ();
        }
    }

    public void aw(String str, String str2) {
        this.dtk.dtB.setFirstName(str);
        this.dtk.dtB.setLastName(str2);
        d(com.iqoption.kyc.fragment.d.f.j(this.dtk.dtB), com.iqoption.kyc.fragment.d.f.TAG);
    }

    public void ex(boolean z) {
        this.dtk.dtB.u(Boolean.valueOf(z));
        if (getFragmentManager().findFragmentByTag(com.iqoption.kyc.fragment.d.d.TAG) == null) {
            d(com.iqoption.kyc.fragment.d.d.c(this.dtk.dsf, this.dtk.dtB), com.iqoption.kyc.fragment.d.d.TAG);
        }
    }

    public void iK(String str) {
        boolean z;
        this.dtk.dtB.iQ(str);
        if (com.iqoption.kyc.c.aIF()) {
            z = false;
        } else {
            this.dtk.dtB.t(Long.valueOf(com.iqoption.app.b.DG().El()));
            z = true;
        }
        d(com.iqoption.kyc.fragment.d.c.a(this.dtk.dsf, this.dtk.dtB, z), com.iqoption.kyc.fragment.d.c.eK(z));
    }

    public void a(Country country, boolean z) {
        if (z) {
            this.dtk.dtB.t(country.id);
            this.dtk.dtB.u(country.id);
            this.dtk.dtB.dz(country.name);
            d(com.iqoption.kyc.fragment.d.b.b(this.dtk.dsf, this.dtk.dtB), com.iqoption.kyc.fragment.d.b.TAG);
            return;
        }
        this.dtk.dtB.t(country.id);
        d(com.iqoption.kyc.fragment.d.c.a(this.dtk.dsf, this.dtk.dtB, true), com.iqoption.kyc.fragment.d.c.eK(true));
    }

    public void b(Country country) {
        this.dtk.dtB.u(country.id);
        this.dtk.dtB.dz(country.name);
        d(com.iqoption.kyc.fragment.d.b.b(this.dtk.dsf, this.dtk.dtB), com.iqoption.kyc.fragment.d.b.TAG);
    }

    public void ax(String str, String str2) {
        this.dtk.dtB.setCity(str);
        this.dtk.dtB.iR(str2);
        d(com.iqoption.kyc.fragment.d.a.a(this.dtk.dsf, this.dtk.dtB), com.iqoption.kyc.fragment.d.a.TAG);
    }

    public com.google.common.util.concurrent.t<? extends com.iqoption.core.microservices.c> ay(String str, String str2) {
        com.iqoption.kyc.profile.a g = this.dtk.dtB;
        if (!TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str = str2;
            } else {
                str = Joiner.on(", ").join(str, str2, new Object[0]);
            }
        }
        g.setAddress(str);
        d(com.iqoption.kyc.fragment.g.b.k(this.dtk.dtB), com.iqoption.kyc.fragment.g.b.TAG);
        return p.bo(null);
    }

    public com.google.common.util.concurrent.t<?> ey(boolean z) {
        if (z) {
            d(com.iqoption.kyc.fragment.g.a.eM(false), com.iqoption.kyc.fragment.g.a.TAG);
            return p.bo(null);
        }
        com.google.common.util.concurrent.t i = this.dtn.i(this.dtk.dtB);
        p.a(v.a(v.a(i, new -$$Lambda$KycActivity$KkQN3VVhTs7rPO2uBXBH5JnRdKI(this)), new -$$Lambda$KycActivity$XvJw7YEN6FuUgbxqVbKbW3OqsRU(this)), new i(this, new -$$Lambda$KycActivity$AIXaVIzlF_NwePH88Zbn9reeO90(this)), com.iqoption.core.c.a.biN);
        return i;
    }

    private /* synthetic */ void aKk() {
        com.iqoption.kyc.g gVar = this.dtm;
        if (gVar != null) {
            boolean Er = gVar.Er();
        }
        if (!aJF() && !((Boolean) ew(true).first).booleanValue() && !aJE()) {
            aJJ();
        }
    }

    public void aJO() {
        d(MenuFragment.axU(), MenuFragment.TAG);
    }

    private void a(com.iqoption.core.microservices.kyc.response.questionnaire.f fVar, QuestionnaireType questionnaireType) {
        if (fVar.afn() == KycControlElement.TEXT_INPUT) {
            d(com.iqoption.kyc.fragment.f.a.c.c(questionnaireType, fVar), com.iqoption.kyc.fragment.f.a.c.TAG);
        } else if (!fVar.afl() && fVar.afk() != null && fVar.afk().size() == 2) {
            com.iqoption.core.microservices.kyc.response.questionnaire.b bVar = (com.iqoption.core.microservices.kyc.response.questionnaire.b) fVar.afk().get(1);
            String hr = LocalizationUtil.hr(((com.iqoption.core.microservices.kyc.response.questionnaire.b) fVar.afk().get(0)).aeY());
            String hr2 = LocalizationUtil.hr(bVar.aeY());
            if (!TextUtils.isEmpty(hr) && !TextUtils.isEmpty(hr2)) {
                if (hr.length() > 15 || hr2.length() > 15) {
                    d(com.iqoption.kyc.fragment.f.a.b.b(questionnaireType, fVar), com.iqoption.kyc.fragment.f.a.b.TAG);
                } else {
                    d(com.iqoption.kyc.fragment.f.a.d.d(questionnaireType, fVar), com.iqoption.kyc.fragment.f.a.d.TAG);
                }
            }
        } else if (fVar.afl()) {
            d(com.iqoption.kyc.fragment.f.a.a.a(questionnaireType, fVar), com.iqoption.kyc.fragment.f.a.a.TAG);
        } else {
            d(com.iqoption.kyc.fragment.f.a.b.b(questionnaireType, fVar), com.iqoption.kyc.fragment.f.a.b.TAG);
        }
    }

    public void a(QuestionnaireType questionnaireType, com.iqoption.core.microservices.kyc.response.questionnaire.f fVar, int i, com.iqoption.kyc.a.b bVar) {
        a(questionnaireType, fVar, ImmutableList.aJ(Integer.valueOf(i)), null);
    }

    public void b(QuestionnaireType questionnaireType, com.iqoption.core.microservices.kyc.response.questionnaire.f fVar, int i, com.iqoption.kyc.a.b bVar) {
        a(questionnaireType, fVar, ImmutableList.aJ(Integer.valueOf(i)), null);
    }

    public void a(QuestionnaireType questionnaireType, com.iqoption.core.microservices.kyc.response.questionnaire.f fVar, List<Integer> list, com.iqoption.kyc.a.b bVar) {
        a(questionnaireType, fVar, (List) list, null);
    }

    public void a(@NonNull QuestionnaireType questionnaireType, @NonNull com.iqoption.core.microservices.kyc.response.questionnaire.f fVar, @NonNull String str, @NonNull com.iqoption.kyc.a.b bVar) {
        a(questionnaireType, fVar, Collections.emptyList(), str);
    }

    public com.google.common.util.concurrent.t<? extends com.iqoption.core.microservices.c> iL(@Nullable String str) {
        com.google.common.util.concurrent.t h = com.iqoption.microservice.b.a.a.dGF.h(true, str);
        p.a(h, new i(this, new -$$Lambda$KycActivity$_uPommJvgppXNvTwpiAhcek3_CI(this)), com.iqoption.core.c.a.biN);
        return v.a(h, new -$$Lambda$KycActivity$TXoYVE7ds7sOvvQzT4R05fNhAHo(this));
    }

    private /* synthetic */ void aKj() {
        aJy();
        if (!((Boolean) ew(true).first).booleanValue() && !aJE()) {
            aJJ();
        }
    }

    private /* synthetic */ com.iqoption.core.microservices.c cb(Object obj) {
        return new com.iqoption.core.microservices.c() {
            public String getMessage() {
                return "";
            }

            public boolean isSuccessful() {
                return true;
            }
        };
    }

    public void aJQ() {
        d(com.iqoption.kyc.fragment.e.a.g(this.dtk.dsf), com.iqoption.kyc.fragment.e.a.TAG);
    }

    public void aJR() {
        aJK();
    }

    public com.google.common.util.concurrent.t<?> aJS() {
        com.google.common.util.concurrent.t aIZ = this.dtn.aIZ();
        v.b(aIZ, new l(this));
        return aIZ;
    }

    public com.google.common.util.concurrent.t<?> aJT() {
        com.google.common.util.concurrent.t i = this.dtn.i(null);
        p.a(i, new b(this), com.iqoption.core.c.a.biN);
        return i;
    }

    public com.google.common.util.concurrent.t<?> aJU() {
        com.google.common.util.concurrent.t a = v.a(this.dtn.aJb(), new -$$Lambda$KycActivity$65mxqNS-imn3lI-sHF6BRlTekbU(this));
        p.a(a, new d(this, com.iqoption.kyc.fragment.b.e.TAG), com.iqoption.core.c.a.biN);
        return a;
    }

    public com.google.common.util.concurrent.t<?> aJV() {
        com.google.common.util.concurrent.t j = j(VerificationType.POI);
        p.a(j, new com.iqoption.system.c.b<KycActivity, List<Object>>(this) {
            /* renamed from: b */
            public void v(KycActivity kycActivity, List<Object> list) {
                super.v(kycActivity, list);
                com.iqoption.core.microservices.kyc.response.i iVar = (com.iqoption.core.microservices.kyc.response.i) list.get(0);
                com.iqoption.core.microservices.kyc.response.document.g a = com.iqoption.core.microservices.kyc.response.document.h.a(KycActivity.this.dtk.dtE);
                if (a != null) {
                    KycActivity.this.d(com.iqoption.kyc.fragment.b.i.a(a.getToken(), a.abd(), a.aeV(), iVar.getMerchantScanReference(), Long.valueOf(KycActivity.this.dtm.getUserId())), com.iqoption.kyc.fragment.b.i.TAG);
                } else {
                    c(kycActivity, new NullPointerException("Config is null"));
                }
            }

            /* renamed from: d */
            public void c(KycActivity kycActivity, Throwable th) {
                super.c(kycActivity, th);
                MobbErrorException.R(th);
            }
        }, com.iqoption.core.c.a.biN);
        return j;
    }

    public com.google.common.util.concurrent.t<?> aJW() {
        d(com.iqoption.kyc.fragment.b.c.aLi(), com.iqoption.kyc.fragment.b.c.TAG);
        return p.bo(null);
    }

    public com.google.common.util.concurrent.t<?> aJX() {
        com.google.common.util.concurrent.t i = this.dtn.i(null);
        p.a(i, new com.iqoption.system.c.b<KycActivity, com.iqoption.core.microservices.kyc.response.document.e>(this) {
            /* renamed from: a */
            public void v(KycActivity kycActivity, com.iqoption.core.microservices.kyc.response.document.e eVar) {
                super.v(kycActivity, eVar);
                KycActivity.this.d(com.iqoption.kyc.fragment.b.g.e(eVar), com.iqoption.kyc.fragment.b.g.TAG);
            }

            /* renamed from: d */
            public void c(KycActivity kycActivity, Throwable th) {
                super.c(kycActivity, th);
                MobbErrorException.R(th);
            }
        }, com.iqoption.core.c.a.biN);
        return i;
    }

    public com.google.common.util.concurrent.t<?> aJY() {
        com.google.common.util.concurrent.t i = this.dtn.i(null);
        p.a(i, new com.iqoption.system.c.b<KycActivity, com.iqoption.core.microservices.kyc.response.document.e>(this) {
            /* renamed from: a */
            public void v(KycActivity kycActivity, com.iqoption.core.microservices.kyc.response.document.e eVar) {
                super.v(kycActivity, eVar);
                KycActivity.this.d(com.iqoption.kyc.fragment.b.b.c(eVar), com.iqoption.kyc.fragment.b.b.TAG);
            }

            /* renamed from: d */
            public void c(KycActivity kycActivity, Throwable th) {
                super.c(kycActivity, th);
                MobbErrorException.R(th);
            }
        }, com.iqoption.core.c.a.biN);
        return i;
    }

    public com.google.common.util.concurrent.t<?> aJZ() {
        return aJU();
    }

    public com.google.common.util.concurrent.t<?> aKa() {
        com.google.common.util.concurrent.t a = v.a(this.dtn.aJb(), new -$$Lambda$KycActivity$XXPDJOhoj-YwctyiWH5faMLsV2c(this));
        p.a(a, new d(this, com.iqoption.kyc.fragment.b.f.TAG), com.iqoption.core.c.a.biN);
        return a;
    }

    public void aKb() {
        d(com.iqoption.kyc.fragment.b.a.eJ(this.dtm.Er()), com.iqoption.kyc.fragment.b.a.TAG);
    }

    public com.google.common.util.concurrent.t<?> iM(final String str) {
        com.google.common.util.concurrent.t j = j(VerificationType.POA);
        p.a(j, new com.iqoption.system.c.b<KycActivity, List<Object>>(this) {
            /* renamed from: b */
            public void v(KycActivity kycActivity, List<Object> list) {
                super.v(kycActivity, list);
                try {
                    com.iqoption.core.microservices.kyc.response.i iVar = (com.iqoption.core.microservices.kyc.response.i) list.get(0);
                    String str = ((Country) list.get(1)).nameIso;
                    com.iqoption.core.microservices.kyc.response.document.g a = com.iqoption.core.microservices.kyc.response.document.h.a(KycActivity.this.dtk.dtE);
                    if (a != null) {
                        KycActivity.this.d(com.iqoption.kyc.fragment.b.h.a(a.getToken(), a.abd(), a.aeV(), str, str, iVar.getMerchantScanReference(), Long.valueOf(KycActivity.this.dtm.getUserId())), com.iqoption.kyc.fragment.b.h.TAG);
                    }
                } catch (Exception unused) {
                }
            }

            /* renamed from: d */
            public void c(KycActivity kycActivity, Throwable th) {
                super.c(kycActivity, th);
                MobbErrorException.R(th);
            }
        }, com.iqoption.core.c.a.biN);
        return j;
    }

    public void a(String str, String str2, boolean z, int i) {
        a(str, str2, z, i, true);
    }

    private void a(String str, String str2, boolean z, int i, final boolean z2) {
        getSupportFragmentManager().popBackStackImmediate(com.iqoption.kyc.fragment.b.f.TAG, 0);
        final Fragment aKi = aKi();
        if (aKi instanceof com.iqoption.kyc.fragment.b.f) {
            com.iqoption.core.c.a.biN.postDelayed(new Runnable() {
                public void run() {
                    ((com.iqoption.kyc.fragment.b.f) aKi).d(true, z2);
                }
            }, 200);
        }
        p.a(v.a(v.a(com.iqoption.mobbtech.connect.request.api.d.c(str, str2, z, i), new -$$Lambda$KycActivity$kRTu-_4q2290sr_oGyC4Akr6VY4(z)), new -$$Lambda$KycActivity$7LpR_Y2mPtWN6nVEeHZ2VjBnsJY(this)), new com.iqoption.system.c.b<KycActivity, com.iqoption.core.microservices.kyc.response.document.e>(this) {
            /* renamed from: a */
            public void v(KycActivity kycActivity, final com.iqoption.core.microservices.kyc.response.document.e eVar) {
                super.v(kycActivity, eVar);
                final Fragment c = KycActivity.this.aKi();
                if (c instanceof com.iqoption.kyc.fragment.b.f) {
                    com.iqoption.core.c.a.biN.postDelayed(new Runnable() {
                        public void run() {
                            com.iqoption.kyc.fragment.b.f fVar = (com.iqoption.kyc.fragment.b.f) c;
                            fVar.d(false, z2);
                            fVar.d(eVar);
                        }
                    }, 200);
                    boolean Er = com.iqoption.app.b.DG().Er();
                    h a = KycActivity.this.dtk;
                    Er = (eVar.d(VerificationType.POI) || eVar.e(VerificationType.POI)) && (!Er || eVar.d(VerificationType.POA) || eVar.e(VerificationType.POA));
                    a.dtH = Er;
                    if (KycActivity.this.dtk.dtH) {
                        KycActivity.this.aJJ();
                    }
                }
            }

            /* renamed from: d */
            public void c(KycActivity kycActivity, Throwable th) {
                super.c(kycActivity, th);
                MobbErrorException.R(th);
                final Fragment c = KycActivity.this.aKi();
                if (c instanceof com.iqoption.kyc.fragment.b.f) {
                    com.iqoption.core.c.a.biN.postDelayed(new Runnable() {
                        public void run() {
                            ((com.iqoption.kyc.fragment.b.f) c).d(false, z2);
                        }
                    }, 200);
                }
            }
        }, com.iqoption.core.c.a.biN);
    }

    public void b(String str, String str2, boolean z, int i) {
        a(str, str2, z, i, false);
    }

    public com.google.common.util.concurrent.t<?> aKc() {
        return aJV();
    }

    public com.google.common.util.concurrent.t<?> aKd() {
        return aJW();
    }

    public com.google.common.util.concurrent.t<?> aKe() {
        com.google.common.util.concurrent.t aIZ = this.dtn.aIZ();
        v.a(aIZ, new k(this));
        return aIZ;
    }

    public void aKf() {
        this.dtp = false;
        aJz();
    }

    public com.google.common.util.concurrent.t<?> aKg() {
        com.google.common.util.concurrent.t aIZ = this.dtn.aIZ();
        v.a(aIZ, new k(this));
        return aIZ;
    }

    public void aKh() {
        this.dtp = false;
        aJz();
    }

    public void a(MobileSDK mobileSDK, int i) {
        if (MobileSDK.hasAllRequiredPermissions(this)) {
            a(mobileSDK);
            return;
        }
        this.dto = mobileSDK;
        ActivityCompat.requestPermissions(this, MobileSDK.getMissingPermissions(this), i);
    }

    private void a(MobileSDK mobileSDK) {
        try {
            com.iqoption.kyc.a.a.eA(true);
            mobileSDK.start();
        } catch (MissingPermissionException e) {
            com.iqoption.app.a.b.b(e.getMessage(), this);
            com.iqoption.kyc.a.a.a(false, e.getMessage(), true);
            com.iqoption.kyc.a.a.w(e.getMessage(), true);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment aKi = aKi();
        if (aKi instanceof com.iqoption.core.ui.fragment.b) {
            ((com.iqoption.core.ui.fragment.b) aKi).a(new com.iqoption.core.ui.fragment.a(i, i2, intent));
        }
    }

    @Nullable
    private Fragment aKi() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        return supportFragmentManager.getBackStackEntryCount() > 0 ? supportFragmentManager.findFragmentByTag(supportFragmentManager.getBackStackEntryAt(supportFragmentManager.getBackStackEntryCount() - 1).getName()) : null;
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == MobileEvents.EVENTTYPE_ANDROID_LIFECYCLE || i == MobileEvents.EVENTTYPE_USERACTION) {
            if (iArr.length > 0) {
                for (int i2 : iArr) {
                    if (i2 != 0) {
                        com.iqoption.app.a.b.aQ(this);
                        return;
                    }
                }
                MobileSDK mobileSDK = this.dto;
                if (mobileSDK != null) {
                    a(mobileSDK);
                    this.dto = null;
                }
            } else {
                com.iqoption.app.a.b.aQ(this);
            }
        }
    }
}
