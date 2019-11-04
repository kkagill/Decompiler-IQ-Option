package com.iqoption.gl;

import com.iqoption.analytics.sla.Sla;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: ChartController.kt */
final class ChartController$enableDrawingCommand$3 extends Lambda implements a<l> {
    final /* synthetic */ b this$0;

    ChartController$enableDrawingCommand$3(b bVar) {
        this.this$0 = bVar;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        MY();
        return l.eVB;
    }

    public final void MY() {
        Sla.CV().CZ();
        this.this$0.aDk.commonSetDrawEnabled(0);
    }
}
