package com.iqoption.portfolio.component;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.portfolio.component.b.d;
import com.iqoption.portfolio.component.viewholder.m;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0002\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001d\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0006\u0010\u001c\u001a\u00020\u000bR\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/portfolio/component/PortfolioFilterAdapter;", "Holder", "Lcom/iqoption/portfolio/component/viewholder/FilterViewHolders;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "items", "", "Lcom/iqoption/portfolio/component/data/FilterItem;", "holderFactory", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "onUpdateValue", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "view", "Landroidx/recyclerview/widget/RecyclerView;", "getItemCount", "", "onAttachedToRecyclerView", "recyclerView", "onBindViewHolder", "holder", "position", "(Lcom/iqoption/portfolio/component/viewholder/FilterViewHolders;I)V", "onCreateViewHolder", "parent", "viewType", "(Landroid/view/ViewGroup;I)Lcom/iqoption/portfolio/component/viewholder/FilterViewHolders;", "onDetachedFromRecyclerView", "updateValue", "app_optionXRelease"})
/* compiled from: PortfolioFilterAdapter.kt */
public final class j<Holder extends m<?>> extends Adapter<Holder> {
    private final b<ViewGroup, Holder> dLX;
    private final b<Holder, l> dLY;
    private final List<d> iA;
    private RecyclerView view;

    public j(List<d> list, b<? super ViewGroup, ? extends Holder> bVar, b<? super Holder, l> bVar2) {
        kotlin.jvm.internal.i.f(list, "items");
        kotlin.jvm.internal.i.f(bVar, "holderFactory");
        this.iA = list;
        this.dLX = bVar;
        this.dLY = bVar2;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.view = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.view = (RecyclerView) null;
    }

    public int getItemCount() {
        return this.iA.size();
    }

    /* renamed from: R */
    public Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        return (m) this.dLX.invoke(viewGroup);
    }

    /* renamed from: a */
    public void onBindViewHolder(Holder holder, int i) {
        kotlin.jvm.internal.i.f(holder, "holder");
        holder.a((d) this.iA.get(i));
        aRk();
    }

    public final void aRk() {
        b bVar = this.dLY;
        if (bVar != null) {
            RecyclerView recyclerView = this.view;
            if (recyclerView != null) {
                ViewGroup viewGroup = recyclerView;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        ViewHolder findContainingViewHolder = recyclerView.findContainingViewHolder(childAt);
                        if (!(findContainingViewHolder instanceof m)) {
                            findContainingViewHolder = null;
                        }
                        m mVar = (m) findContainingViewHolder;
                        if (mVar != null && mVar.isInitialized()) {
                            bVar.invoke(mVar);
                        }
                    }
                }
            }
        }
    }
}
