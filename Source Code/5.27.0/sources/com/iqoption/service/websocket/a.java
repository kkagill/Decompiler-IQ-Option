package com.iqoption.service.websocket;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, bng = {"extractErrorMessage", "", "", "app_optionXRelease"})
/* compiled from: ThrowableExtensions.kt */
public final class a {
    public static final String K(Throwable th) {
        kotlin.jvm.internal.i.f(th, "$this$extractErrorMessage");
        while (th != null && !(th instanceof IQBusException)) {
            th = th.getCause();
        }
        if (!(th instanceof IQBusException)) {
            th = null;
        }
        IQBusException iQBusException = (IQBusException) th;
        return iQBusException != null ? iQBusException.getMessage() : null;
    }
}
