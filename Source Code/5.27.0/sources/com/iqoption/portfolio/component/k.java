package com.iqoption.portfolio.component;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* compiled from: PortfolioItemDecoration */
public final class k extends ItemDecoration {
    private final int space;

    private static boolean gM(int i) {
        return (i == -1 || i == -2) ? false : true;
    }

    public k(int i) {
        this.space = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder != null && gM(childViewHolder.getItemViewType()) && a(view, recyclerView)) {
            rect.set(0, 0, 0, this.space);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    private static boolean a(View view, RecyclerView recyclerView) {
        return recyclerView.getChildAdapterPosition(view) != recyclerView.getAdapter().getItemCount() - 1;
    }
}
