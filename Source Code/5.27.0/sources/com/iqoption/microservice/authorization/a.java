package com.iqoption.microservice.authorization;

import android.content.Context;
import android.util.Base64;
import com.google.common.base.Joiner;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.core.manager.i;
import com.iqoption.core.rx.g;
import com.iqoption.microservice.authorization.a.b;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.mobbtech.connect.request.a.a.d;
import com.iqoption.util.v;
import java.nio.charset.Charset;
import java.util.HashMap;

/* compiled from: AuthorizationRequests */
public final class a {
    private static final String TAG = "com.iqoption.microservice.authorization.a";

    private a() {
    }

    public static t<Object> Kf() {
        return g.a(i.bjd.Yp());
    }

    public static t<b> bB(Context context) {
        String Vd = IQApp.Ev().Vd();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Vd);
        Vd = "api/v1.0/token";
        stringBuilder.append(Vd);
        t aPF = new d(b.class, RequestManager.b(stringBuilder.toString(), null, context), Vd).aPF();
        v.a(aPF, TAG, Vd);
        return aPF;
    }

    public static t<com.iqoption.microservice.authorization.a.a> n(long j, String str) {
        String Vd = IQApp.Ev().Vd();
        String encodeToString = Base64.encodeToString(Joiner.e('|').join(Long.valueOf(j), str, "http://iqoption.com/android").getBytes(Charset.forName("UTF-8")), 0);
        HashMap hashMap = new HashMap();
        hashMap.put("q", encodeToString);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Vd);
        str = "api/v1.0/login/token";
        stringBuilder.append(str);
        t a = v.a(new b(RequestManager.a(stringBuilder.toString(), hashMap, IQApp.Eu()), str).aPF(), -$$Lambda$a$6qvbfm6ZfzDfr6u_M3szwSsSevc.INSTANCE);
        v.a(a, TAG, str);
        return a;
    }

    private static /* synthetic */ t b(com.iqoption.microservice.authorization.a.a aVar) {
        if (aVar.dGA == 0 && aVar.body != null && aVar.body.contains("http://iqoption.com/android")) {
            return p.bo(aVar);
        }
        return p.m(new AuthException(aVar.dGA));
    }
}
