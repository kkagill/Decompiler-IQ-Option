package com.iqoption.core.e;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/phone/ConfirmCodeHelper;", "", "()V", "CONFIRMATION_SKIP_TIMEOUT", "", "MAX_CONFIRMATION_TIMEOUT", "getConfirmTimeLeft", "", "timeRequest", "isConfirmationCodeExpired", "", "confirmTimeLeft", "isSkipAllowed", "requestTime", "core_release"})
/* compiled from: ConfirmCodeHelper.kt */
public final class b {
    public static final b bEq = new b();

    public static final boolean bg(long j) {
        return j <= 0 || j > ((long) 300000);
    }

    private b() {
    }

    public static final long bf(long j) {
        return j == 0 ? 0 : Math.max((j + ((long) 300000)) - System.currentTimeMillis(), 0);
    }

    public static final boolean bh(long j) {
        return j >= 0 && System.currentTimeMillis() - j >= 0;
    }
}
