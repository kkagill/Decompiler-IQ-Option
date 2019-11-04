package com.iqoption.core.manager;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/core/manager/AuthError;", "Lcom/iqoption/core/manager/AuthResult;", "message", "", "log", "(Ljava/lang/String;Ljava/lang/String;)V", "getLog", "()Ljava/lang/String;", "getMessage", "core_release"})
/* compiled from: AuthResult.kt */
public final class d extends l {
    private final String biU;
    private final String message;

    public d() {
        this(null, null, 3, null);
    }

    public d(String str, String str2) {
        super();
        this.message = str;
        this.biU = str2;
    }

    public /* synthetic */ d(String str, String str2, int i, f fVar) {
        if ((i & 1) != 0) {
            str = (String) null;
        }
        if ((i & 2) != 0) {
            str2 = (String) null;
        }
        this(str, str2);
    }

    public final String Yg() {
        return this.biU;
    }

    public final String getMessage() {
        return this.message;
    }
}
