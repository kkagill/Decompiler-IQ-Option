package com.iqoption.portfolio.component.viewholder;

import android.view.ViewGroup;
import com.iqoption.core.d.c;
import com.iqoption.core.ext.a;
import com.iqoption.e.vd;
import com.iqoption.x.R;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, bng = {"Lcom/iqoption/portfolio/component/viewholder/MacroFilterViewHolder;", "Lcom/iqoption/portfolio/component/viewholder/FilterViewHolders;", "Lcom/iqoption/databinding/PortfolioMacroFilterItemBinding;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "<set-?>", "Lcom/iqoption/portfolio/component/data/FilterItem;", "bound", "getBound", "()Lcom/iqoption/portfolio/component/data/FilterItem;", "setBound", "(Lcom/iqoption/portfolio/component/data/FilterItem;)V", "bound$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_optionXRelease"})
/* compiled from: FilterViewHolders.kt */
public final class n extends m<vd> {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(n.class), "bound", "getBound()Lcom/iqoption/portfolio/component/data/FilterItem;"))};
    private final d bHX = c.j(new MacroFilterViewHolder$$special$$inlined$bindable$1(getBinding(), this));

    public void a(com.iqoption.portfolio.component.b.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "<set-?>");
        this.bHX.a(this, anY[0], dVar);
    }

    public com.iqoption.portfolio.component.b.d aRV() {
        return (com.iqoption.portfolio.component.b.d) this.bHX.b(this, anY[0]);
    }

    public n(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(a.a(viewGroup, (int) R.layout.portfolio_macro_filter_item, null, false, 6, null));
    }
}
