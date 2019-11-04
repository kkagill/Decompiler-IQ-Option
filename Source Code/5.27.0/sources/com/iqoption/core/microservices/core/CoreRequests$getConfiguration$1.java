package com.iqoption.core.microservices.core;

import com.iqoption.core.d;
import com.iqoption.core.microservices.core.response.c;
import com.iqoption.core.microservices.core.response.e;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/core/response/Configuration;", "it", "", "invoke"})
/* compiled from: CoreRequests.kt */
final class CoreRequests$getConfiguration$1 extends Lambda implements b<String, com.iqoption.core.microservices.core.response.b> {
    final /* synthetic */ String $host;

    CoreRequests$getConfiguration$1(String str) {
        this.$host = str;
        super(1);
    }

    /* renamed from: gz */
    public final com.iqoption.core.microservices.core.response.b invoke(String str) {
        kotlin.jvm.internal.i.f(str, "it");
        c cVar = (c) d.Um().Ez().fromJson(str, c.class);
        if (cVar.isSuccessful()) {
            cVar.adf().a(new e(this.$host));
            return cVar.adf();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Response is not successful: ");
        stringBuilder.append(str);
        throw new RuntimeException(stringBuilder.toString());
    }
}
