package com.iqoption.signals;

import com.iqoption.core.ext.a;
import com.iqoption.fragment.leftpanel.LeftPanelSection;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/signals/SignalItem;", "invoke", "com/iqoption/signals/SignalsFragment$onCreateView$1$adapter$1"})
/* compiled from: SignalsFragment.kt */
final class SignalsFragment$onCreateView$$inlined$apply$lambda$1 extends Lambda implements b<f, l> {
    final /* synthetic */ q $fragment$inlined;
    final /* synthetic */ q this$0;

    SignalsFragment$onCreateView$$inlined$apply$lambda$1(q qVar, q qVar2) {
        this.this$0 = qVar;
        this.$fragment$inlined = qVar2;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        c((f) obj);
        return l.eVB;
    }

    public final void c(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "it");
        q.dTF.b(fVar);
        com.iqoption.fragment.leftpanel.i.dkm.r(a.r(this.this$0)).b(LeftPanelSection.PRICE_MOVEMENTS);
    }
}
