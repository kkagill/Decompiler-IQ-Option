package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ext.a;
import com.iqoption.e.vd;
import com.iqoption.portfolio.component.b.d;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "C", "it", "invoke", "(Ljava/lang/Object;)V", "com/iqoption/core/kotlin/DelegatesKt$bindable$1"})
/* compiled from: Delegates.kt */
public final class MacroFilterViewHolder$$special$$inlined$bindable$1 extends Lambda implements b<d, l> {
    final /* synthetic */ Object $context;
    final /* synthetic */ n this$0;

    public MacroFilterViewHolder$$special$$inlined$bindable$1(Object obj, n nVar) {
        this.$context = obj;
        this.this$0 = nVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        bU(obj);
        return l.eVB;
    }

    public final void bU(d dVar) {
        dVar = dVar;
        vd vdVar = (vd) this.$context;
        this.this$0.bB(true);
        vdVar.aRh.setImageDrawable(dVar.getIcon() != 0 ? a.e((ViewDataBinding) vdVar, dVar.getIcon()) : null);
        vdVar.alH.setText(dVar.getText());
        vdVar.alH.setTextColor(a.a((ViewDataBinding) vdVar, dVar.getColor()));
        View root = vdVar.getRoot();
        kotlin.jvm.internal.i.e(root, "root");
        View view = this.this$0.itemView;
        kotlin.jvm.internal.i.e(view, "itemView");
        root.setTag(view.getResources().getString(dVar.aRp()));
    }
}
