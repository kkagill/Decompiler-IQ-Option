package com.iqoption.core.microservices.kyc;

import com.iqoption.core.ext.d;
import com.iqoption.core.microservices.kyc.response.e;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/kyc/response/SendPhoneConfirmationResponse;", "it", "", "invoke"})
/* compiled from: PhoneRequests.kt */
final class PhoneRequests$sendPhoneConfirmation$1 extends Lambda implements b<String, e> {
    public static final PhoneRequests$sendPhoneConfirmation$1 buB = new PhoneRequests$sendPhoneConfirmation$1();

    PhoneRequests$sendPhoneConfirmation$1() {
        super(1);
    }

    /* renamed from: gJ */
    public final e invoke(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        return (e) d.b(str, e.class, null, 2, null);
    }
}
