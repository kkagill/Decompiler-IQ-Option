package com.iqoption.core.manager;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/manager/Auth2FASendCodeLimitExceeded;", "Lcom/iqoption/core/manager/AuthResult;", "ttl", "", "token", "", "(JLjava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getTtl", "()J", "core_release"})
/* compiled from: AuthResult.kt */
public final class c extends l {
    private final long biT;
    private final String sw;

    public c(long j, String str) {
        kotlin.jvm.internal.i.f(str, "token");
        super();
        this.biT = j;
        this.sw = str;
    }

    public /* synthetic */ c(long j, String str, int i, f fVar) {
        if ((i & 2) != 0) {
            str = "";
        }
        this(j, str);
    }
}
