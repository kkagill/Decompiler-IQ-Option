package com.iqoption.alerts.ui.list;

import com.iqoption.alerts.ui.list.e.d.AnonymousClass1;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "", "Lcom/iqoption/alerts/ui/list/AlertAdapterItem;", "<anonymous parameter 1>", "invoke", "com/iqoption/alerts/ui/list/AlertsListFragment$onCreateView$1$1$1$onChanged$2"})
/* compiled from: AlertsListFragment.kt */
final class AlertsListFragment$onCreateView$$inlined$apply$lambda$2$1$1 extends Lambda implements m<List<? extends a>, List<? extends a>, l> {
    final /* synthetic */ IntRef $indexToScroll;
    final /* synthetic */ IntRef $offset;
    final /* synthetic */ AnonymousClass1 this$0;

    AlertsListFragment$onCreateView$$inlined$apply$lambda$2$1$1(AnonymousClass1 anonymousClass1, IntRef intRef, IntRef intRef2) {
        this.this$0 = anonymousClass1;
        this.$indexToScroll = intRef;
        this.$offset = intRef2;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        b((List) obj, (List) obj2);
        return l.eVB;
    }

    public final void b(List<? extends a> list, List<? extends a> list2) {
        kotlin.jvm.internal.i.f(list, "<anonymous parameter 0>");
        kotlin.jvm.internal.i.f(list2, "<anonymous parameter 1>");
        if (this.$indexToScroll.element != -1) {
            this.this$0.Bl().scrollToPositionWithOffset(this.$indexToScroll.element, this.$offset.element);
        }
    }
}
