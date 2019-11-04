package com.iqoption.view.c.a;

import androidx.recyclerview.widget.ItemTouchHelper.Callback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J \u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, bng = {"Lcom/iqoption/view/helper/draganddrop/DragAndDropItemTouchHelperCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "callback", "Lcom/iqoption/view/helper/draganddrop/DragAndDropItemTouchHelperCallback$Callback;", "(Lcom/iqoption/view/helper/draganddrop/DragAndDropItemTouchHelperCallback$Callback;)V", "getCallback", "()Lcom/iqoption/view/helper/draganddrop/DragAndDropItemTouchHelperCallback$Callback;", "getMovementFlags", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "isItemViewSwipeEnabled", "", "isLongPressDragEnabled", "onMove", "source", "target", "onSwiped", "", "i", "Callback", "app_optionXRelease"})
/* compiled from: DragAndDropItemTouchHelperCallback.kt */
public final class a extends Callback {
    private final a ehu;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, bng = {"Lcom/iqoption/view/helper/draganddrop/DragAndDropItemTouchHelperCallback$Callback;", "", "onItemMove", "", "fromPosition", "", "toPosition", "app_optionXRelease"})
    /* compiled from: DragAndDropItemTouchHelperCallback.kt */
    public interface a {
        void aA(int i, int i2);
    }

    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    public boolean isLongPressDragEnabled() {
        return false;
    }

    public void onSwiped(ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.i.f(viewHolder, "viewHolder");
    }

    public a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        this.ehu = aVar;
    }

    public int getMovementFlags(RecyclerView recyclerView, ViewHolder viewHolder) {
        kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
        kotlin.jvm.internal.i.f(viewHolder, "viewHolder");
        return Callback.makeMovementFlags(3, 0);
    }

    public boolean onMove(RecyclerView recyclerView, ViewHolder viewHolder, ViewHolder viewHolder2) {
        kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
        kotlin.jvm.internal.i.f(viewHolder, "source");
        kotlin.jvm.internal.i.f(viewHolder2, "target");
        this.ehu.aA(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        return true;
    }
}
