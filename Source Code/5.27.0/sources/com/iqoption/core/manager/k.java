package com.iqoption.core.manager;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/manager/AuthRecovery;", "Lcom/iqoption/core/manager/AuthResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "core_release"})
/* compiled from: AuthResult.kt */
public final class k extends l {
    private final String message;

    public k(String str) {
        kotlin.jvm.internal.i.f(str, "message");
        super();
        this.message = str;
    }

    public final String getMessage() {
        return this.message;
    }
}
