package com.iqoption.app.managers.a;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.core.microservices.tradingengine.response.instrument.e;
import com.iqoption.dto.entity.expiration.Expiration;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ExpirationMultiHelper */
public class f extends c {
    /* Access modifiers changed, original: protected */
    public void a(a aVar, Expiration expiration, boolean z) {
        if (z) {
            super.a(aVar, expiration, true);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(InstrumentType instrumentType, String str, Long l, Long l2, boolean z) {
        if (z) {
            super.a(InstrumentType.DIGITAL_INSTRUMENT, str, l, l2, true);
        }
    }

    @Nullable
    public ConcurrentHashMap<String, e> b(InstrumentType instrumentType, String str, Long l, Long l2, boolean z) {
        if (!z) {
            return new ConcurrentHashMap();
        }
        return super.b(InstrumentType.DIGITAL_INSTRUMENT, str, l, l2, true);
    }

    public t<ConcurrentHashMap<String, e>> a(Integer num, InstrumentType instrumentType, String str, Long l, Long l2, boolean z) {
        if (!z) {
            return p.m(new IllegalStateException("Not support strike"));
        }
        return super.a(num, InstrumentType.DIGITAL_INSTRUMENT, str, l, l2, true);
    }

    @Nullable
    public e a(InstrumentType instrumentType, String str, Long l, String str2, Long l2, boolean z) {
        if (!z) {
            return null;
        }
        return super.a(InstrumentType.DIGITAL_INSTRUMENT, str, l, str2, l2, true);
    }
}
