package com.iqoption.core.microservices.tradingengine.response.active;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.g.c;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$OptionsMap;", "invoke"})
/* compiled from: ActiveSettingResult.kt */
final class ActiveSettingResult$ActiveSetting$binary$2 extends Lambda implements a<c> {
    final /* synthetic */ g.a this$0;

    ActiveSettingResult$ActiveSetting$binary$2(g.a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: ahY */
    public final c invoke() {
        g.a aVar = this.this$0;
        return aVar.a(aVar.bzU, InstrumentType.BINARY_INSTRUMENT);
    }
}
