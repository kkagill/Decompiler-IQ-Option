package com.iqoption.core.ui.widget.recyclerview;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* compiled from: VerticalSpacingItemDecoration */
public class d extends ItemDecoration {
    private int bLD;

    public d(int i) {
        this.bLD = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.bLD > 0 && recyclerView.getChildAdapterPosition(view) != 0) {
            if (recyclerView.getChildAdapterPosition(view) == -1) {
                ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
                if (childViewHolder != null && childViewHolder.getOldPosition() == 0) {
                    return;
                }
            }
            rect.top = this.bLD;
        }
    }
}
