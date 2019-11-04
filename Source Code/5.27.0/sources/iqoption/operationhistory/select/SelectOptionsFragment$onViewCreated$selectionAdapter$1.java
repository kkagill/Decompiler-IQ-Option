package iqoption.operationhistory.select;

import iqoption.operationhistory.OperationViewModel.FilterType;
import iqoption.operationhistory.OperationViewModel.c;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "filterItem", "Liqoption/operationhistory/OperationViewModel$FilterItem;", "invoke"})
/* compiled from: SelectOptionsFragment.kt */
final class SelectOptionsFragment$onViewCreated$selectionAdapter$1 extends Lambda implements b<c, l> {
    final /* synthetic */ FilterType $filterType;
    final /* synthetic */ b this$0;

    SelectOptionsFragment$onViewCreated$selectionAdapter$1(b bVar, FilterType filterType) {
        this.this$0 = bVar;
        this.$filterType = filterType;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        c((c) obj);
        return l.eVB;
    }

    public final void c(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "filterItem");
        b.a(this.this$0).a(cVar, this.$filterType);
    }
}
