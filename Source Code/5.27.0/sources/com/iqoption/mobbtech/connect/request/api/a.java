package com.iqoption.mobbtech.connect.request.api;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.core.microservices.kyc.response.d;
import com.iqoption.core.rx.g;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.mobbtech.connect.request.a.a.e;
import com.iqoption.mobbtech.connect.response.j;
import com.iqoption.util.v;
import java.util.HashMap;

/* compiled from: AccountSecurityRequests */
public class a {
    private static final String TAG = "com.iqoption.mobbtech.connect.request.api.a";

    /* compiled from: AccountSecurityRequests */
    private static class a extends j {
        public boolean isSuccessful() {
            return true;
        }

        private a() {
        }
    }

    private a() {
    }

    public static t<j> G(Context context, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("email", str);
        str = IQApp.Ev().Vb();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        str = "api/profile/save-email";
        stringBuilder.append(str);
        return new e(j.class, RequestManager.b(stringBuilder.toString(), hashMap, context), str).aPG();
    }

    public static t<j> d(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("old_email", str);
        hashMap.put("new_email", str2);
        return v.a(RequestManager.a(IQApp.Ev().Vb(), "api/change-email", hashMap, context, j.class), new -$$Lambda$a$sgi3FRVV89JnOw4wgnl7op0Y5qo(context, str2));
    }

    public static t<j> c(Context context, String str, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("email", str);
        hashMap.put("id", Long.valueOf(j));
        return RequestManager.a(IQApp.Ev().Vb(), "api/register/reactivate", hashMap, context, j.class);
    }

    public static t<d> u(long j, long j2) {
        return g.c(com.iqoption.core.microservices.kyc.d.ao(String.valueOf(j), String.valueOf(j2)));
    }

    public static t<com.iqoption.core.microservices.kyc.response.e> aPs() {
        return g.c(com.iqoption.core.microservices.kyc.d.buw.aeG());
    }

    public static t<com.iqoption.core.microservices.kyc.response.a> iH(String str) {
        return g.c(com.iqoption.core.microservices.kyc.d.gH(str));
    }

    public static t<? extends j> a(Context context, boolean z, Optional<String> optional) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(z));
        String Vb = IQApp.Ev().Vb();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Vb);
        Vb = "api/profile/auth_two_factor";
        stringBuilder.append(Vb);
        String stringBuilder2 = stringBuilder.toString();
        if (!optional.isPresent()) {
            return new e(a.class, RequestManager.b(stringBuilder2, hashMap, context), Vb).aPG();
        }
        hashMap.put("auth_code", optional.get());
        return new e(j.class, RequestManager.b(stringBuilder2, hashMap, context), Vb).aPG();
    }
}
