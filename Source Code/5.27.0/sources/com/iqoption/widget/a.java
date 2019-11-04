package com.iqoption.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* compiled from: GridSpacingItemDecoration */
public class a extends ItemDecoration {
    private boolean bPg;
    private int spacing;
    private int spanCount;

    public a(int i, int i2, boolean z) {
        this.spanCount = i;
        this.spacing = i2;
        this.bPg = z;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            ViewHolder findContainingViewHolder = recyclerView.findContainingViewHolder(view);
            if (findContainingViewHolder != null) {
                childAdapterPosition = findContainingViewHolder.getOldPosition();
            }
        }
        int i = this.spanCount;
        int i2 = childAdapterPosition % i;
        if (this.bPg) {
            int i3 = this.spacing;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (childAdapterPosition < i) {
                rect.top = i3;
            }
            rect.bottom = this.spacing;
            return;
        }
        childAdapterPosition = this.spacing;
        rect.left = (i2 * childAdapterPosition) / i;
        rect.right = childAdapterPosition - (((i2 + 1) * childAdapterPosition) / i);
        rect.top = childAdapterPosition;
    }
}
