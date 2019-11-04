package com.iqoption.cardsverification.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.iqoption.cardsverification.a.k;
import com.iqoption.cardsverification.g.e;
import com.iqoption.core.microservices.billing.verification.response.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fJ\u0014\u0010\u001f\u001a\u00020\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, bng = {"Lcom/iqoption/cardsverification/list/VerifyCardsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqoption/cardsverification/list/VerifyCardViewHolder;", "context", "Landroid/content/Context;", "defaultColor", "", "selectedColor", "verifyCardListener", "Landroid/view/View$OnClickListener;", "(Landroid/content/Context;IILandroid/view/View$OnClickListener;)V", "getContext", "()Landroid/content/Context;", "items", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "getItemCount", "item", "position", "onBindViewHolder", "", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClickedCard", "clickedCard", "setData", "cards", "cardsverification_release"})
/* compiled from: VarifyCardsAdapter.kt */
public final class d extends Adapter<b> {
    private final int aBn;
    private final int aBo;
    private final OnClickListener aBr;
    private final Context context;
    private List<c> iA = m.emptyList();

    public d(Context context, int i, int i2, OnClickListener onClickListener) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(onClickListener, "verifyCardListener");
        this.context = context;
        this.aBn = i;
        this.aBo = i2;
        this.aBr = onClickListener;
    }

    public int getItemCount() {
        return this.iA.size();
    }

    private final c ek(int i) {
        return (c) this.iA.get(i);
    }

    /* renamed from: h */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        k kVar = (k) DataBindingUtil.inflate(LayoutInflater.from(this.context), e.verify_card_item, viewGroup, false);
        kotlin.jvm.internal.i.e(kVar, "binding");
        return new b(kVar, this.aBn, this.aBo, this.aBr);
    }

    /* renamed from: a */
    public void onBindViewHolder(b bVar, int i, List<Object> list) {
        kotlin.jvm.internal.i.f(bVar, "holder");
        kotlin.jvm.internal.i.f(list, "payloads");
        bVar.c(ek(i));
        if (!list.isEmpty() && list.get(0) == ItemState.CLICKED) {
            bVar.Ld();
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(b bVar, int i) {
        kotlin.jvm.internal.i.f(bVar, "holder");
        onBindViewHolder(bVar, i, new ArrayList());
    }

    public final void L(List<c> list) {
        kotlin.jvm.internal.i.f(list, "cards");
        List list2 = this.iA;
        this.iA = list;
        DiffResult calculateDiff = DiffUtil.calculateDiff(new a(list2, list));
        kotlin.jvm.internal.i.e(calculateDiff, "DiffUtil.calculateDiff(callback)");
        calculateDiff.dispatchUpdatesTo((Adapter) this);
    }

    public final void f(c cVar) {
        int i = u.i(this.iA, (Object) cVar);
        if (i >= 0) {
            notifyItemChanged(i, ItemState.CLICKED);
        }
    }
}
