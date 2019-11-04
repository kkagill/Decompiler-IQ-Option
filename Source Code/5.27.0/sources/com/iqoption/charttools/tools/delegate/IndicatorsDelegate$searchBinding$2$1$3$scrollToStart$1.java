package com.iqoption.charttools.tools.delegate;

import com.iqoption.charttools.tools.data.h;
import com.iqoption.charttools.tools.delegate.IndicatorsDelegate.searchBinding.2.c;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "", "Lcom/iqoption/charttools/tools/data/IndicatorAdapterItem;", "<anonymous parameter 1>", "invoke"})
/* compiled from: IndicatorsDelegate.kt */
final class IndicatorsDelegate$searchBinding$2$1$3$scrollToStart$1 extends Lambda implements m<List<? extends h>, List<? extends h>, l> {
    final /* synthetic */ c this$0;

    IndicatorsDelegate$searchBinding$2$1$3$scrollToStart$1(c cVar) {
        this.this$0 = cVar;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        b((List) obj, (List) obj2);
        return l.eVB;
    }

    public final void b(List<? extends h> list, List<? extends h> list2) {
        kotlin.jvm.internal.i.f(list, "<anonymous parameter 0>");
        kotlin.jvm.internal.i.f(list2, "<anonymous parameter 1>");
        this.this$0.aNy.cuw.scrollToPosition(0);
    }
}
