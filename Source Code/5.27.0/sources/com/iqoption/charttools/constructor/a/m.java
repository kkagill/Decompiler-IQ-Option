package com.iqoption.charttools.constructor.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.charttools.b.u;
import com.iqoption.charttools.n.h;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/InputSelectViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/charttools/databinding/IndicatorConstructorInputSelectBinding;", "Lcom/iqoption/charttools/constructor/InputSelect;", "callback", "Lcom/iqoption/charttools/constructor/viewholder/InputSelectViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/charttools/constructor/viewholder/InputSelectViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "Callback", "techtools_release"})
/* compiled from: InputSelectViewHolder.kt */
public final class m extends e<u, com.iqoption.charttools.constructor.u> {
    private final a aGu;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/InputSelectViewHolder$Callback;", "", "onItemSelectRequest", "", "item", "Lcom/iqoption/charttools/constructor/InputSelect;", "techtools_release"})
    /* compiled from: InputSelectViewHolder.kt */
    public interface a {
        void a(com.iqoption.charttools.constructor.u uVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/charttools/constructor/viewholder/InputSelectViewHolder$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "techtools_release"})
    /* compiled from: InputSelectViewHolder.kt */
    /* renamed from: com.iqoption.charttools.constructor.a.m$1 */
    public static final class AnonymousClass1 extends g {
        final /* synthetic */ m aGv;

        AnonymousClass1(m mVar) {
            this.aGv = mVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.charttools.constructor.u uVar = (com.iqoption.charttools.constructor.u) this.aGv.and();
            if (uVar != null) {
                this.aGv.aGu.a(uVar);
            }
        }
    }

    public m(a aVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "data");
        super(h.indicator_constructor_input_select, viewGroup, aVar2);
        this.aGu = aVar;
        ((u) getBinding()).aGo.setOnClickListener(new AnonymousClass1(this));
    }

    public void a(u uVar, com.iqoption.charttools.constructor.u uVar2) {
        kotlin.jvm.internal.i.f(uVar, "$this$bind");
        kotlin.jvm.internal.i.f(uVar2, "item");
        TextView textView = uVar.aoo;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CALL_TO_ACTION_LABEL);
        textView.setText(uVar2.getLabel());
        TextView textView2 = uVar.aIy;
        kotlin.jvm.internal.i.e(textView2, "input");
        textView2.setText(uVar2.Nm()[uVar2.Nd()]);
    }
}
