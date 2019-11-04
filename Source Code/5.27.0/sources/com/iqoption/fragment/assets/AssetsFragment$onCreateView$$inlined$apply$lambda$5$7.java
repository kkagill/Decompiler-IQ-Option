package com.iqoption.fragment.assets;

import com.iqoption.fragment.assets.b.h;
import com.iqoption.fragment.assets.model.a;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "", "Lcom/iqoption/fragment/assets/model/AssetAdapterItem;", "<anonymous parameter 1>", "invoke", "com/iqoption/fragment/assets/AssetsFragment$onCreateView$1$5$onChanged$2"})
/* compiled from: AssetsFragment.kt */
final class AssetsFragment$onCreateView$$inlined$apply$lambda$5$7 extends Lambda implements m<List<? extends a>, List<? extends a>, l> {
    final /* synthetic */ Integer $beforeTopPosition;
    final /* synthetic */ boolean $scheduleLayoutAnimation;
    final /* synthetic */ boolean $shouldScrollToStart;
    final /* synthetic */ h this$0;

    AssetsFragment$onCreateView$$inlined$apply$lambda$5$7(h hVar, Integer num, boolean z, boolean z2) {
        this.this$0 = hVar;
        this.$beforeTopPosition = num;
        this.$shouldScrollToStart = z;
        this.$scheduleLayoutAnimation = z2;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        b((List) obj, (List) obj2);
        return l.eVB;
    }

    public final void b(List<? extends a> list, List<? extends a> list2) {
        kotlin.jvm.internal.i.f(list, "<anonymous parameter 0>");
        kotlin.jvm.internal.i.f(list2, "<anonymous parameter 1>");
        Integer a = this.this$0.aAq();
        Integer num = this.$beforeTopPosition;
        if (num != null && a != null && (kotlin.jvm.internal.i.y(num, a) ^ 1) != 0) {
            this.this$0.apt.scrollToPositionWithOffset(this.$beforeTopPosition.intValue(), 0);
        } else if (this.$shouldScrollToStart) {
            this.this$0.apt.scrollToPositionWithOffset(0, 0);
        }
        if (this.$scheduleLayoutAnimation) {
            this.this$0.daT.cfy.scheduleLayoutAnimation();
        }
    }
}
