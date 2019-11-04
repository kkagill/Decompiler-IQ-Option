package com.iqoption.c;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.analytics.HitBuilders.EventBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.common.base.Predicates;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.a.b;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.microservice.authorization.AuthException;
import com.iqoption.util.v;
import java.util.HashMap;

/* compiled from: AuthManager */
public class a {
    private static final String TAG = "com.iqoption.c.a";
    private static final n<a> ayt = Suppliers.a(-$$Lambda$a$oRa1iJ8Xm1MKxYnlEoakO7gnlrI.INSTANCE);

    private a() {
    }

    public static a Ka() {
        return (a) ayt.get();
    }

    public static void Kb() {
        d(Event.Builder(Event.CATEGORY_SYSTEM, "login_request"));
    }

    private static void d(Builder builder) {
        aT(IQApp.Eu());
        EventManager.BS().a(builder.setValue(Double.valueOf(1.0d)).calcDuration().setTechnicalLogs(Boolean.valueOf(true)).build());
    }

    public t<com.iqoption.microservice.authorization.a.a> d(long j, String str) {
        if (j == -1) {
            return p.m(new RuntimeException("invalid user id"));
        }
        final Builder Builder = Event.Builder(Event.CATEGORY_SYSTEM, "login_request");
        t a = v.a(new -$$Lambda$a$wSEDQwtKDk6YcrHf1NOW9f8O7fE(j, str), Predicates.pZ(), com.iqoption.core.c.a.biM, 3, -1, "api/v1.0/login/token");
        v.b(a, new o<com.iqoption.microservice.authorization.a.a>() {
            /* renamed from: a */
            public void onSuccess(com.iqoption.microservice.authorization.a.a aVar) {
                a.d(Builder);
                a.this.Kc();
            }

            public void l(Throwable th) {
                a.this.a(th, Builder);
            }
        });
        return a;
    }

    private void a(Throwable th, Builder builder) {
        EventManager.BS().a(builder.setValue(Double.valueOf(0.0d)).calcDuration().setTechnicalLogs(Boolean.valueOf(true)).build());
        HashMap hashMap = new HashMap();
        int i = -1;
        String str = "error";
        if (th instanceof AuthException) {
            AuthException authException = (AuthException) th;
            if (TextUtils.isEmpty(authException.errorMessage)) {
                b.aQ(IQApp.Eu());
            } else {
                b.dZ(authException.errorMessage);
            }
            if (authException.status >= 0) {
                i = authException.status;
            } else if (TextUtils.isEmpty(authException.errorMessage)) {
                i = -100;
            }
            hashMap.put(str, Integer.valueOf(i));
            return;
        }
        b.aQ(IQApp.Eu());
        hashMap.put(str, Integer.valueOf(-1));
    }

    public t<Boolean> Kc() {
        return v.a(com.iqoption.microservice.authorization.a.bB(IQApp.Eu()), -$$Lambda$a$bfl5rfthd0junLxV70DYczyYGHo.INSTANCE);
    }

    private static /* synthetic */ Boolean a(com.iqoption.microservice.authorization.a.b bVar) {
        if (bVar.dGB == null || bVar.dGB.sw == null) {
            return Boolean.valueOf(false);
        }
        Context Eu = IQApp.Eu();
        com.iqoption.app.b aK = com.iqoption.app.b.aK(Eu);
        aK.dD(bVar.dGB.sw);
        aK.aM(Eu);
        return Boolean.valueOf(true);
    }

    private static void aT(Context context) {
        Tracker aO = IQApp.aO(context);
        aO.send(((EventBuilder) ((EventBuilder) new EventBuilder().setCustomMetric(1, (float) com.iqoption.app.b.aK(context).getUserId())).setCategory("Android").setAction("Login").setLabel("Form").setCustomDimension(2, aO.get("&cid"))).build());
    }
}
