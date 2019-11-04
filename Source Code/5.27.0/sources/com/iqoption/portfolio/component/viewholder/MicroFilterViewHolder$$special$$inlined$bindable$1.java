package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ext.a;
import com.iqoption.e.vf;
import com.iqoption.portfolio.component.b.d;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "C", "it", "invoke", "(Ljava/lang/Object;)V", "com/iqoption/core/kotlin/DelegatesKt$bindable$1"})
/* compiled from: Delegates.kt */
public final class MicroFilterViewHolder$$special$$inlined$bindable$1 extends Lambda implements b<d, l> {
    final /* synthetic */ Object $context;
    final /* synthetic */ w this$0;

    public MicroFilterViewHolder$$special$$inlined$bindable$1(Object obj, w wVar) {
        this.$context = obj;
        this.this$0 = wVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        bU(obj);
        return l.eVB;
    }

    public final void bU(d dVar) {
        dVar = dVar;
        vf vfVar = (vf) this.$context;
        this.this$0.bB(true);
        vfVar.aRh.setImageDrawable(dVar.getIcon() != 0 ? a.e((ViewDataBinding) vfVar, dVar.getIcon()) : null);
        vfVar.alH.setText(dVar.getText());
        vfVar.alH.setTextColor(a.a((ViewDataBinding) vfVar, dVar.getColor()));
        View root = vfVar.getRoot();
        kotlin.jvm.internal.i.e(root, "root");
        View view = this.this$0.itemView;
        kotlin.jvm.internal.i.e(view, "itemView");
        root.setTag(view.getResources().getString(dVar.aRp()));
    }
}
