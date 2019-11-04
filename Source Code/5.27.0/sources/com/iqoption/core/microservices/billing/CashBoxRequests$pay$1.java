package com.iqoption.core.microservices.billing;

import com.iqoption.core.ext.d;
import com.iqoption.core.microservices.billing.response.f;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/billing/response/PayResponse;", "it", "", "invoke"})
/* compiled from: CashBoxRequests.kt */
final class CashBoxRequests$pay$1 extends Lambda implements b<String, f> {
    public static final CashBoxRequests$pay$1 bml = new CashBoxRequests$pay$1();

    CashBoxRequests$pay$1() {
        super(1);
    }

    /* renamed from: gg */
    public final f invoke(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        return (f) d.b(str, f.class, null, 2, null);
    }
}
