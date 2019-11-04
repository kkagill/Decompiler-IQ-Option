package com.iqoption.core.manager;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/manager/Auth2FACodeError;", "Lcom/iqoption/core/manager/AuthResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "core_release"})
/* compiled from: AuthResult.kt */
public final class a extends l {
    private final String message;

    public a() {
        this(null, 1, null);
    }

    public a(String str) {
        super();
        this.message = str;
    }

    public /* synthetic */ a(String str, int i, f fVar) {
        if ((i & 1) != 0) {
            str = (String) null;
        }
        this(str);
    }

    public final String getMessage() {
        return this.message;
    }
}
