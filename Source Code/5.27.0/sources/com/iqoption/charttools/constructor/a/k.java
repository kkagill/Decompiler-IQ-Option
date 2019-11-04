package com.iqoption.charttools.constructor.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.charttools.b.u;
import com.iqoption.charttools.constructor.o;
import com.iqoption.charttools.n.h;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/InputHostViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/charttools/databinding/IndicatorConstructorInputSelectBinding;", "Lcom/iqoption/charttools/constructor/InputHost;", "callback", "Lcom/iqoption/charttools/constructor/viewholder/InputHostViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/charttools/constructor/viewholder/InputHostViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "Callback", "techtools_release"})
/* compiled from: InputHostViewHolder.kt */
public final class k extends e<u, o> {
    private final a aGr;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/InputHostViewHolder$Callback;", "", "onItemHostRequest", "", "item", "Lcom/iqoption/charttools/constructor/InputHost;", "techtools_release"})
    /* compiled from: InputHostViewHolder.kt */
    public interface a {
        void a(o oVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/charttools/constructor/viewholder/InputHostViewHolder$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "techtools_release"})
    /* compiled from: InputHostViewHolder.kt */
    /* renamed from: com.iqoption.charttools.constructor.a.k$1 */
    public static final class AnonymousClass1 extends g {
        final /* synthetic */ k aGs;

        AnonymousClass1(k kVar) {
            this.aGs = kVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            o oVar = (o) this.aGs.and();
            if (oVar != null) {
                this.aGs.aGr.a(oVar);
            }
        }
    }

    public k(a aVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "data");
        super(h.indicator_constructor_input_select, viewGroup, aVar2);
        this.aGr = aVar;
        ((u) getBinding()).aGo.setOnClickListener(new AnonymousClass1(this));
    }

    public void a(u uVar, o oVar) {
        kotlin.jvm.internal.i.f(uVar, "$this$bind");
        kotlin.jvm.internal.i.f(oVar, "item");
        TextView textView = uVar.aoo;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CALL_TO_ACTION_LABEL);
        textView.setText(oVar.getLabel());
        textView = uVar.aIy;
        kotlin.jvm.internal.i.e(textView, "input");
        textView.setText(oVar.Ni()[oVar.Nd()].getTitle());
        LinearLayout linearLayout = uVar.aGo;
        kotlin.jvm.internal.i.e(linearLayout, "content");
        boolean z = false;
        if (oVar.isEnabled()) {
            if (((oVar.Ni().length == 0 ? 1 : 0) ^ 1) != 0) {
                z = true;
            }
        }
        linearLayout.setEnabled(z);
    }
}
