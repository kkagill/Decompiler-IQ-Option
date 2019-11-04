package com.iqoption.portfolio.component.viewholder;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.portfolio.component.b.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@DX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, bng = {"Lcom/iqoption/portfolio/component/viewholder/FilterViewHolders;", "T", "Landroidx/databinding/ViewDataBinding;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "(Landroidx/databinding/ViewDataBinding;)V", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "Landroidx/databinding/ViewDataBinding;", "bound", "Lcom/iqoption/portfolio/component/data/FilterItem;", "getBound", "()Lcom/iqoption/portfolio/component/data/FilterItem;", "setBound", "(Lcom/iqoption/portfolio/component/data/FilterItem;)V", "<set-?>", "", "isInitialized", "()Z", "setInitialized", "(Z)V", "app_optionXRelease"})
/* compiled from: FilterViewHolders.kt */
public abstract class m<T extends ViewDataBinding> extends ViewHolder {
    private final T amm;
    private boolean awi;

    public abstract void a(d dVar);

    public m(T t) {
        kotlin.jvm.internal.i.f(t, "binding");
        super(t.getRoot());
        this.amm = t;
    }

    public final T getBinding() {
        return this.amm;
    }

    /* Access modifiers changed, original: protected|final */
    public final void bB(boolean z) {
        this.awi = z;
    }

    public final boolean isInitialized() {
        return this.awi;
    }
}
