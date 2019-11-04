package com.iqoption.mobbtech.connect.request.api;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.t;
import com.iqoption.core.microservices.kyc.a;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import com.iqoption.core.microservices.kyc.response.document.f;
import com.iqoption.core.microservices.kyc.response.i;
import com.iqoption.core.rx.g;

/* compiled from: IQBusJumioRequests */
public final class d {
    public static t<f> aPv() {
        return g.c(a.aev());
    }

    public static t<i> o(VerificationType verificationType) {
        return g.c(a.b(verificationType));
    }

    public static t<com.iqoption.core.microservices.kyc.response.document.a> c(String str, @Nullable String str2, boolean z, int i) {
        return g.c(a.a(str, str2, z, Integer.valueOf(i)));
    }
}
