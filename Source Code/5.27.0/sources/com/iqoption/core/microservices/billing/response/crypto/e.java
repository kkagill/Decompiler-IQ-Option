package com.iqoption.core.microservices.billing.response.crypto;

import com.iqoption.core.manager.ad;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/billing/response/crypto/CryptoExpiryUtils;", "", "()V", "getExpiryTimeLeft", "", "expiryTime", "current", "core_release"})
/* compiled from: CryptoExpiryUtils.kt */
public final class e {
    public static final e bmZ = new e();

    private e() {
    }

    public static /* synthetic */ long a(e eVar, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = ad.bkC.If();
        }
        return eVar.p(j, j2);
    }

    public final long p(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        kotlin.jvm.internal.i.e(instance, "Calendar.getInstance()");
        TimeZone timeZone = instance.getTimeZone();
        j *= (long) 1000;
        kotlin.jvm.internal.i.e(timeZone, "timeZone");
        return j - (j2 + ((long) timeZone.getRawOffset()));
    }
}
