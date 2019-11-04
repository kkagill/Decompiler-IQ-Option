package com.iqoption.core.microservices.core;

import com.iqoption.core.d;
import com.iqoption.core.microservices.core.response.f;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/core/response/MyCountryResponse;", "it", "", "invoke"})
/* compiled from: CoreRequests.kt */
final class CoreRequests$getMyCountry$1 extends Lambda implements b<String, f> {
    public static final CoreRequests$getMyCountry$1 brQ = new CoreRequests$getMyCountry$1();

    CoreRequests$getMyCountry$1() {
        super(1);
    }

    /* renamed from: gA */
    public final f invoke(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        return (f) d.Um().Ez().fromJson(str, f.class);
    }
}
