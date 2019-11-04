package com.iqoption.microservice.b;

import androidx.annotation.UiThread;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.b;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.util.v;
import java.util.concurrent.TimeUnit;

/* compiled from: KycBusRequests */
public final class a {
    private static b<Long, com.iqoption.microservice.b.b.a> dGC = CacheBuilder.qq().x(1).a(10, TimeUnit.SECONDS).qF();
    private static b<Long, com.iqoption.microservice.b.b.a> dGD = CacheBuilder.qq().x(1).a(10, TimeUnit.MINUTES).qF();

    public static void aOb() {
        com.iqoption.core.c.a.biN.execute(new Runnable() {
            public void run() {
                a.dGC.invalidateAll();
                a.dGD.invalidateAll();
            }
        });
    }

    @UiThread
    public static t<com.iqoption.microservice.b.b.a> eV(boolean z) {
        b bVar;
        if (z) {
            bVar = dGD;
        } else {
            bVar = dGC;
        }
        Long valueOf = Long.valueOf(com.iqoption.app.b.DG().getUserId());
        com.iqoption.microservice.b.b.a aVar = (com.iqoption.microservice.b.b.a) bVar.ar(valueOf);
        if (aVar != null) {
            return p.bo(aVar);
        }
        return w(valueOf);
    }

    private static t<com.iqoption.microservice.b.b.a> w(final Long l) {
        t UA = com.iqoption.mobbtech.connect.request.a.a.b.z(com.iqoption.microservice.b.b.a.class).fo("get-kyc-documents-status").ch(false).fp("2.0").UA();
        v.a(UA, new o<com.iqoption.microservice.b.b.a>() {
            public void l(Throwable th) {
            }

            /* renamed from: b */
            public void onSuccess(com.iqoption.microservice.b.b.a aVar) {
                a.dGC.put(l, aVar);
                a.dGD.put(l, aVar);
            }
        });
        return UA;
    }
}
