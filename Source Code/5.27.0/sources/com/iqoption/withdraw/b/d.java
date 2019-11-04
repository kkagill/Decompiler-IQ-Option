package com.iqoption.withdraw.b;

import androidx.recyclerview.widget.DiffUtil.Callback;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/withdraw/history/DiffUtilCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldItems", "", "Lcom/iqoption/withdraw/history/WithdrawHistoryAdapterItem;", "newItems", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "withdraw_release"})
/* compiled from: WithdrawHistoryAdapter.kt */
final class d extends Callback {
    private final List<k> aBk;
    private final List<k> aBl;

    public d(List<? extends k> list, List<? extends k> list2) {
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
        k kVar = (k) this.aBk.get(i);
        k kVar2 = (k) this.aBl.get(i2);
        if (kVar.asd() != kVar2.asd()) {
            return false;
        }
        if (kVar instanceof h) {
            String text = ((h) kVar).getText();
            if (kVar2 != null) {
                return kotlin.jvm.internal.i.y(text, ((h) kVar2).getText());
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.withdraw.history.TitleItem");
        } else if (kVar instanceof e) {
            long id = ((e) kVar).bcO().getId();
            if (kVar2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.withdraw.history.PayoutItem");
            } else if (id == ((e) kVar2).bcO().getId()) {
                return true;
            } else {
                return false;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("old: ");
            stringBuilder.append(kVar);
            stringBuilder.append("; new: ");
            stringBuilder.append(kVar2);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public boolean areContentsTheSame(int i, int i2) {
        return kotlin.jvm.internal.i.y((k) this.aBk.get(i), (k) this.aBl.get(i2));
    }
}
