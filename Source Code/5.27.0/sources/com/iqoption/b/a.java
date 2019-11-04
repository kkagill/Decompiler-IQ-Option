package com.iqoption.b;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.j;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.aa;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.d;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.mobbtech.connect.response.f;
import com.iqoption.mobbtech.connect.response.g;
import com.iqoption.util.v;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: AppsFlyerHelper */
public class a {
    @Nullable
    static volatile Uri awL;
    private t<com.iqoption.b.b.a> awM;
    private Runnable awN = new Runnable() {
        private int count = 1;

        public void run() {
            if (this.count < 30) {
                IQApp Eu = IQApp.Eu();
                d aP = d.aP(Eu);
                if (aP.Fs() > 1) {
                    this.count = 30;
                }
                if (!aP.Fy()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("apps_flyer_device_id", j.dq().q(Eu));
                    String Vb = IQApp.Ev().Vb();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(Vb);
                    Vb = "api/appsflyer/link";
                    stringBuilder.append(Vb);
                    new com.iqoption.mobbtech.connect.request.a.a.a(RequestManager.b(stringBuilder.toString(), hashMap, Eu), new com.iqoption.mobbtech.connect.a.a() {
                        /* renamed from: a */
                        public void onSuccess(g gVar) {
                            d.Fa().aZ(true);
                        }

                        public void a(f fVar) {
                            a.this.as(120000);
                        }
                    }, Vb).aPG();
                }
                this.count++;
            }
        }
    };

    public t<com.iqoption.b.b.a> b(Application application) {
        t tVar = this.awM;
        if (tVar != null) {
            return tVar;
        }
        j dq = j.dq();
        aa vM = aa.vM();
        dq.a("fJrvgkPBeNgQNPv2DApof7", new b(vM), (Context) application);
        dq.N(application.getString(R.string.appsflyer_sender_id));
        dq.u(com.iqoption.core.d.Un().Ds());
        dq.a(application, application.getString(R.string.appsflyer_dev_key));
        com.iqoption.analytics.d.BZ().a((t) vM, "appsflyer-initialization", 0, false, "");
        v.b(vM, new o<com.iqoption.b.b.a>() {
            public void l(@NonNull Throwable th) {
            }

            /* renamed from: a */
            public void onSuccess(@NonNull com.iqoption.b.b.a aVar) {
                try {
                    EventManager.BS().a(aVar.awU);
                } catch (Exception unused) {
                }
            }
        });
        if (d.Fa().DB() != null) {
            this.awM = p.bo(null);
        } else {
            this.awM = vM;
        }
        return this.awM;
    }

    public t<com.iqoption.b.b.a> JJ() {
        t tVar = this.awM;
        if (tVar != null) {
            return tVar;
        }
        return p.b(new RuntimeException("appsflyer was not initialized"));
    }

    public t<com.iqoption.b.b.a> JK() {
        return p.a(((a) IQApp.Eu().asx.get()).JJ(), 20000, TimeUnit.MILLISECONDS, com.iqoption.core.c.a.biL);
    }

    public io.reactivex.p<Optional<com.iqoption.b.b.a>> JL() {
        return io.reactivex.p.j(new -$$Lambda$a$3VnsHSzt1nQzyYf4nBZ0Glsyi4g(this));
    }

    private /* synthetic */ Optional JM() {
        try {
            return Optional.an(JK().get());
        } catch (Exception unused) {
            return Optional.pW();
        }
    }

    public void as(long j) {
        com.iqoption.core.c.a.biL.a(this.awN, j, TimeUnit.MILLISECONDS);
    }

    @Nullable
    public static Uri h(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return null;
        }
        Uri a = a.a.a(context, intent);
        if (a != null) {
            return a;
        }
        a = intent.getData();
        if (a != null) {
            return a;
        }
        a = awL;
        if (a == null) {
            return null;
        }
        awL = null;
        intent.setData(a);
        return a;
    }

    public void c(Application application, String str) {
        j.dq().i(application, str);
    }
}
