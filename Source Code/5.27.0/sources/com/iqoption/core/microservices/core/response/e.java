package com.iqoption.core.microservices.core.response;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/core/response/Meta;", "", "host", "", "(Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "core_release"})
/* compiled from: Meta.kt */
public final class e {
    private final String host;

    public e(String str) {
        kotlin.jvm.internal.i.f(str, "host");
        this.host = str;
    }

    public final String getHost() {
        return this.host;
    }
}
