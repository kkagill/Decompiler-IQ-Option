package com.iqoption.kyc;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.iqoption.app.IQApp;
import com.iqoption.core.data.repository.d;
import com.iqoption.core.microservices.kyc.response.Gender;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import com.iqoption.core.microservices.kyc.response.e;
import com.iqoption.core.microservices.kyc.response.h;
import com.iqoption.core.rx.g;
import com.iqoption.dto.entity.iqbus.Country;
import com.iqoption.dto.entity.result.KycState;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.mobbtech.connect.request.api.c;
import com.iqoption.mobbtech.connect.response.j;
import com.iqoption.util.v;

/* compiled from: KycRequestsOld */
public class i {
    private static final String TAG = "com.iqoption.kyc.i";
    private final Context context;

    /* compiled from: KycRequestsOld */
    /* renamed from: com.iqoption.kyc.i$1 */
    class AnonymousClass1 implements o<j> {
        /* renamed from: a */
        public void onSuccess(j jVar) {
            if (jVar.isSuccessful()) {
                com.iqoption.app.b.aK(IQApp.Eu()).setActivated(true);
            }
        }

        public void l(Throwable th) {
            com.crashlytics.android.a.ag("confirm email error");
            com.iqoption.util.i.d(th);
        }
    }

    /* compiled from: KycRequestsOld */
    private static class a implements o<Object> {
        private final String ahc;

        public void onSuccess(Object obj) {
        }

        /* synthetic */ a(String str, AnonymousClass1 anonymousClass1) {
            this(str);
        }

        private a(String str) {
            this.ahc = str;
        }

        public void l(Throwable th) {
            com.crashlytics.android.a.ag(this.ahc);
            com.iqoption.util.i.d(th);
        }
    }

    /* compiled from: KycRequestsOld */
    private class b extends com.iqoption.system.c.b<Context, e> {
        public b(Context context) {
            super(context);
        }

        /* renamed from: a */
        public void v(Context context, e eVar) {
            super.v(context, eVar);
            com.iqoption.core.data.d.b.WB().aG(System.currentTimeMillis());
        }

        /* renamed from: a */
        public void c(Context context, Throwable th) {
            super.c(context, th);
            com.crashlytics.android.a.ag("request phone confirm code error");
            com.iqoption.util.i.d(th);
        }
    }

    public i(Context context) {
        this.context = context;
    }

    public t<j> iG(String str) {
        t G;
        com.iqoption.app.b aK = com.iqoption.app.b.aK(this.context);
        if (aK.isActivated()) {
            G = com.iqoption.mobbtech.connect.request.api.a.G(this.context, str);
        } else if (TextUtils.equals(aK.getEmail(), str)) {
            G = com.iqoption.mobbtech.connect.request.api.a.c(this.context, aK.getEmail(), aK.getUserId());
        } else {
            G = com.iqoption.mobbtech.connect.request.api.a.d(this.context, aK.getEmail(), str);
        }
        v.b(G, new a("change email error", null));
        return G;
    }

    public Pair<? extends t<e>, Long> a(int i, long j, KycState kycState) {
        Object a;
        g gVar = new g(this.context, kycState);
        PhoneNumber aIO = gVar.aIO();
        Object obj = (i == aIO.xK() && j == aIO.yj()) ? 1 : null;
        if (obj == null) {
            a = v.a(com.iqoption.mobbtech.connect.request.api.a.u((long) i, j), -$$Lambda$i$kPNKtBRZ703TWnFRPLXz4I0v_ig.INSTANCE);
            j = System.currentTimeMillis();
            v.b(a, new b(this.context));
        } else if (gVar.aIR()) {
            a = com.iqoption.mobbtech.connect.request.api.a.aPs();
            j = System.currentTimeMillis();
            v.b(a, new b(this.context));
        } else {
            e eVar = new e(true, "");
            j = gVar.Wz();
            a = p.bo(eVar);
        }
        return Pair.create(a, Long.valueOf(j));
    }

    public t<com.iqoption.core.microservices.kyc.response.a> iH(String str) {
        t iH = com.iqoption.mobbtech.connect.request.api.a.iH(str);
        v.b(iH, new o<com.iqoption.core.microservices.kyc.response.a>() {
            /* renamed from: b */
            public void onSuccess(com.iqoption.core.microservices.kyc.response.a aVar) {
                com.iqoption.app.b.aK(IQApp.Eu()).aQ(true);
            }

            public void l(Throwable th) {
                com.crashlytics.android.a.ag("confirm phone error");
                com.iqoption.util.i.d(th);
            }
        });
        return iH;
    }

    public t<Country> aIY() {
        return bQ(com.iqoption.app.b.aK(this.context).El());
    }

    public t<Country> bQ(long j) {
        t bQ = c.bQ(j);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("get country error, country id=");
        stringBuilder.append(j);
        v.b(bQ, new a(stringBuilder.toString(), null));
        return bQ;
    }

    public t<h> i(com.iqoption.kyc.profile.a aVar) {
        if (!aVar.aLP()) {
            return p.m(new RuntimeException("profile is not filled"));
        }
        t c = g.c(com.iqoption.core.microservices.kyc.c.a(aVar.getFirstName(), aVar.getLastName(), aVar.aLQ(), Gender.fromBoolean(aVar.aLR()), aVar.DX(), aVar.YC().longValue(), aVar.getCity(), aVar.getAddress(), aVar.DY(), null));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("save profile error, kycProfile=");
        stringBuilder.append(aVar);
        v.b(c, new a(stringBuilder.toString(), null));
        return c;
    }

    public t<KycState> aIZ() {
        String Vb = IQApp.Ev().Vb();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Vb);
        Vb = "api/profile/kyc";
        stringBuilder.append(Vb);
        return new com.iqoption.mobbtech.connect.request.a.a.e(KycState.class, RequestManager.a(stringBuilder.toString(), null, this.context), Vb).aPF();
    }

    public t<com.iqoption.core.microservices.kyc.response.document.e> i(@Nullable VerificationType verificationType) {
        return g.c(d.a(verificationType));
    }

    public t<? extends com.iqoption.core.microservices.c> aJa() {
        String Vb = IQApp.Ev().Vb();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Vb);
        Vb = "api/profile/skipphone";
        stringBuilder.append(Vb);
        t aPF = new com.iqoption.mobbtech.connect.request.a.a.e(j.class, RequestManager.a(stringBuilder.toString(), null, this.context), Vb).aPF();
        v.b(aPF, new a("profile skipphone error", null));
        return aPF;
    }

    public t<? extends com.iqoption.core.microservices.c> aJb() {
        String Vb = IQApp.Ev().Vb();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Vb);
        Vb = "api/profile/skipdocuments";
        stringBuilder.append(Vb);
        t aPF = new com.iqoption.mobbtech.connect.request.a.a.e(j.class, RequestManager.a(stringBuilder.toString(), null, this.context), Vb).aPF();
        v.b(aPF, new a("profile skipdocuments error", null));
        return aPF;
    }
}
