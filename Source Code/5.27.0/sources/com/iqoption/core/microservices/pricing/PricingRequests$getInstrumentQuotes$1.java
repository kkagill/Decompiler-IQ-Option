package com.iqoption.core.microservices.pricing;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.pricing.b.a;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/pricing/response/InstrumentQuote;", "invoke"})
/* compiled from: PricingRequests.kt */
final class PricingRequests$getInstrumentQuotes$1 extends Lambda implements b<a, Boolean> {
    final /* synthetic */ int $activeId;
    final /* synthetic */ long $expirationPeriod;
    final /* synthetic */ long $expirationTime;
    final /* synthetic */ TimeUnit $expirationUnit;
    final /* synthetic */ InstrumentType $instrumentType;
    final /* synthetic */ String $underlying;

    PricingRequests$getInstrumentQuotes$1(int i, String str, InstrumentType instrumentType, long j, long j2, TimeUnit timeUnit) {
        this.$activeId = i;
        this.$underlying = str;
        this.$instrumentType = instrumentType;
        this.$expirationTime = j;
        this.$expirationPeriod = j2;
        this.$expirationUnit = timeUnit;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((a) obj));
    }

    public final boolean a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "it");
        return aVar.getActiveId() == this.$activeId && kotlin.jvm.internal.i.y(aVar.agB(), this.$underlying) && aVar.getInstrumentType() == this.$instrumentType && ((this.$expirationTime == 0 || aVar.agA().getTimestamp() == this.$expirationUnit.toMillis(this.$expirationTime)) && (this.$expirationPeriod == 0 || aVar.agA().agF() == ((int) this.$expirationUnit.toSeconds(this.$expirationPeriod))));
    }
}
