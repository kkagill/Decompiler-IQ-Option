package com.iqoption.core.microservices.kyc;

import com.iqoption.core.ext.d;
import com.iqoption.core.microservices.kyc.response.g;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/kyc/response/TwoFactorResponse;", "it", "", "invoke"})
/* compiled from: PhoneRequests.kt */
final class PhoneRequests$twoFactorAuth$2 extends Lambda implements b<String, g> {
    public static final PhoneRequests$twoFactorAuth$2 buC = new PhoneRequests$twoFactorAuth$2();

    PhoneRequests$twoFactorAuth$2() {
        super(1);
    }

    /* renamed from: gK */
    public final g invoke(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        return (g) d.b(str, g.class, null, 2, null);
    }
}
