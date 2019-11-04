package com.iqoption.charttools.constructor.a;

import android.view.ViewGroup;
import com.iqoption.charttools.b.s;
import com.iqoption.charttools.constructor.t;
import com.iqoption.charttools.constructor.widget.WidthPicker;
import com.iqoption.charttools.constructor.widget.WidthPicker.a;
import com.iqoption.charttools.n.h;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/charttools/constructor/viewholder/InputLineWidthViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/charttools/databinding/IndicatorConstructorInputLineWidthBinding;", "Lcom/iqoption/charttools/constructor/InputLineWidth;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "techtools_release"})
/* compiled from: InputLineWidthViewHolder.kt */
public final class l extends e<s, t> {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "", "onChange"})
    /* compiled from: InputLineWidthViewHolder.kt */
    /* renamed from: com.iqoption.charttools.constructor.a.l$1 */
    static final class AnonymousClass1 implements a {
        final /* synthetic */ l aGt;

        AnonymousClass1(l lVar) {
            this.aGt = lVar;
        }

        public final void em(int i) {
            t tVar = (t) this.aGt.and();
            if (tVar != null) {
                tVar.setSelected(i);
            }
        }
    }

    public l(ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(h.indicator_constructor_input_line_width, viewGroup, aVar);
        ((s) getBinding()).aIx.setOnWidthChangeListener(new AnonymousClass1(this));
    }

    public void a(s sVar, t tVar) {
        kotlin.jvm.internal.i.f(sVar, "$this$bind");
        kotlin.jvm.internal.i.f(tVar, "item");
        sVar.aIx.setTitle(tVar.getLabel());
        WidthPicker widthPicker = sVar.aIx;
        kotlin.jvm.internal.i.e(widthPicker, "content");
        widthPicker.setSelectedWidth(tVar.Nd());
    }
}
