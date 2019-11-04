package com.iqoption.signals;

import com.iqoption.signals.d.c;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "C", "it", "invoke", "(Ljava/lang/Object;)V", "com/iqoption/core/kotlin/DelegatesKt$bindable$1"})
/* compiled from: Delegates.kt */
public final class SignalItemViewHolder$$special$$inlined$bindable$1 extends Lambda implements b<f, l> {
    final /* synthetic */ Object $context;
    final /* synthetic */ h this$0;

    public SignalItemViewHolder$$special$$inlined$bindable$1(Object obj, h hVar) {
        this.$context = obj;
        this.this$0 = hVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        bU(obj);
        return l.eVB;
    }

    public final void bU(f fVar) {
        fVar = fVar;
        g gVar = (g) this.$context;
        gVar.awF().setImageResource(fVar.aUc() ? c.ic_bull_white_24dp : c.ic_bear_white_24dp);
        gVar.aUg().setText(fVar.getType());
        gVar.awG().setText(fVar.getTime());
        gVar.aUf().setText(fVar.ahP());
        gVar.aUe().setText(fVar.getValue());
        this.this$0.dTi.fk(fVar.getLevel());
        if (fVar.aUc()) {
            gVar.aUe().setTextColor(this.this$0.dTg);
            this.this$0.dTi.setColor(this.this$0.dTg);
            return;
        }
        gVar.aUe().setTextColor(this.this$0.dTh);
        this.this$0.dTi.setColor(this.this$0.dTh);
    }
}
