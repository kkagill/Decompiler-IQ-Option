package com.iqoption.core.microservices.tradingengine.response.active;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Ljava/util/HashMap;", "", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "invoke"})
/* compiled from: InstrumentsResult.kt */
final class InstrumentsResult$instruments$2 extends Lambda implements a<HashMap<Integer, a>> {
    final /* synthetic */ l this$0;

    InstrumentsResult$instruments$2(l lVar) {
        this.this$0 = lVar;
        super(0);
    }

    /* renamed from: aig */
    public final HashMap<Integer, a> invoke() {
        HashMap ch = Maps.ch(c.T(this.this$0.aif()));
        for (j jVar : this.this$0.bAn) {
            kotlin.jvm.internal.i.e(ch, "activeHashMap");
            Map map = ch;
            Integer valueOf = Integer.valueOf(jVar.getActiveId());
            l lVar = this.this$0;
            map.put(valueOf, lVar.a(jVar, lVar.aif()));
        }
        return ch;
    }
}
