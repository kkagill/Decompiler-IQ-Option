package com.iqoption.cardsverification.list;

import androidx.recyclerview.widget.DiffUtil.Callback;
import com.iqoption.core.microservices.billing.verification.response.c;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/cardsverification/list/DiffUtilCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldItems", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "newItems", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "cardsverification_release"})
/* compiled from: VarifyCardsAdapter.kt */
final class a extends Callback {
    private final List<c> aBk;
    private final List<c> aBl;

    public a(List<c> list, List<c> list2) {
        kotlin.jvm.internal.i.f(list, "oldItems");
        kotlin.jvm.internal.i.f(list2, "newItems");
        this.aBk = list;
        this.aBl = list2;
    }

    public int getOldListSize() {
        return this.aBk.size();
    }

    public int getNewListSize() {
        return this.aBl.size();
    }

    public boolean areItemsTheSame(int i, int i2) {
        return ((c) this.aBk.get(i)).getId() == ((c) this.aBl.get(i2)).getId();
    }

    public boolean areContentsTheSame(int i, int i2) {
        return kotlin.jvm.internal.i.y((c) this.aBk.get(i), (c) this.aBl.get(i2));
    }
}
