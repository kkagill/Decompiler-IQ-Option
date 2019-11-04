package com.iqoption.c;

import android.text.TextUtils;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.microservice.authorization.AuthException;
import com.iqoption.microservice.authorization.a.a;
import com.iqoption.util.v;

/* compiled from: IqAccountAuthenticator */
public class b {
    public static t<a> Kd() {
        return v.a(Kg(), -$$Lambda$b$PNSxU7lnYGKEljniEws0cyI2NVI.INSTANCE);
    }

    private static /* synthetic */ t eu(String str) {
        t d = a.Ka().d(Long.valueOf(com.iqoption.app.b.DG().getUserId()).longValue(), str);
        v.b(d, new o<a>() {
            /* renamed from: a */
            public void onSuccess(a aVar) {
            }

            public void l(Throwable th) {
                com.iqoption.app.b.DG().Ei();
            }
        });
        return d;
    }

    public static boolean Ke() {
        return com.iqoption.app.b.DG().DR();
    }

    public static t<Object> Kf() {
        return v.a(com.iqoption.microservice.authorization.a.Kf(), -$$Lambda$b$T8004F8ywDmWjjdFzwsRP96rmCU.INSTANCE);
    }

    private static t<String> Kg() {
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        if (!DG.DR()) {
            return p.m(new AuthException(202));
        }
        String Eh = DG.Eh();
        if (TextUtils.isEmpty(Eh)) {
            return p.m(new AuthException(8));
        }
        return p.bo(Eh);
    }
}
