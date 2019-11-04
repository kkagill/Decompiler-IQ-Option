package com.iqoption.core.microservices.pricing;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.connect.c;
import com.iqoption.core.d;
import com.iqoption.core.data.model.InstrumentType;
import io.reactivex.e;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u000fJD\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/microservices/pricing/PricingRequests;", "", "()V", "EVENT_BUYBACK_QUOTE", "", "EVENT_INSTRUMENT_QUOTES", "INSTRUMENTS_QUOTES_FX_MICROSERVICE", "getBuyBackQuoteUpdates", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/pricing/response/SpotBuyBackQuote;", "activeId", "", "expiration", "", "expirationUnit", "Ljava/util/concurrent/TimeUnit;", "throttling", "throttlingUnit", "getInstrumentQuotes", "Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote;", "underlying", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "expirationTime", "expirationPeriod", "core_release"})
/* compiled from: PricingRequests.kt */
public final class a {
    public static final a bxn = new a();

    private a() {
    }

    public static /* synthetic */ e a(int i, String str, InstrumentType instrumentType, long j, long j2, TimeUnit timeUnit, int i2, Object obj) {
        return a(i, str, instrumentType, (i2 & 8) != 0 ? 0 : j, (i2 & 16) != 0 ? 0 : j2, (i2 & 32) != 0 ? TimeUnit.MILLISECONDS : timeUnit);
    }

    public static final e<com.iqoption.core.microservices.pricing.b.a> a(int i, String str, InstrumentType instrumentType, long j, long j2, TimeUnit timeUnit) {
        String str2 = str;
        InstrumentType instrumentType2 = instrumentType;
        long j3 = j;
        long j4 = j2;
        TimeUnit timeUnit2 = timeUnit;
        String str3 = "underlying";
        kotlin.jvm.internal.i.f(str2, str3);
        kotlin.jvm.internal.i.f(instrumentType2, "instrumentType");
        kotlin.jvm.internal.i.f(timeUnit2, "expirationUnit");
        c i2 = d.EW().b("instrument-quotes-generated", com.iqoption.core.microservices.pricing.b.a.class).b(new PricingRequests$getInstrumentQuotes$1(i, str, instrumentType, j, j2, timeUnit)).i(ConditionalUserProperty.ACTIVE, Integer.valueOf(i)).i(str3, str2).i("kind", instrumentType2);
        if (j3 != 0) {
            i2.i("expiration_timestamp", Long.valueOf(timeUnit2.toSeconds(j3)));
        }
        long j5 = j2;
        if (j5 != 0) {
            i2.i("expiration_period", Long.valueOf(timeUnit2.toSeconds(j5)));
        }
        return i2.HQ();
    }
}
