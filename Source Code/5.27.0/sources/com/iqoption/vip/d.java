package com.iqoption.vip;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.app.IQApp;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, bng = {"Lcom/iqoption/vip/EducationItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "()V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "app_optionXRelease"})
/* compiled from: EducationItemDecoration.kt */
public final class d extends ItemDecoration {
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        kotlin.jvm.internal.i.f(rect, "outRect");
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        kotlin.jvm.internal.i.f(recyclerView, "parent");
        kotlin.jvm.internal.i.f(state, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(adapter, "parent.adapter!!");
        if (childAdapterPosition < adapter.getItemCount() - 1) {
            Adapter adapter2 = recyclerView.getAdapter();
            if (adapter2 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            if (adapter2.getItemViewType(childAdapterPosition + 1) == 1) {
                IQApp Eu = IQApp.Eu();
                kotlin.jvm.internal.i.e(Eu, "IQApp.instance()");
                rect.bottom = Eu.getResources().getDimensionPixelOffset(R.dimen.dp8);
            }
        }
    }
}
