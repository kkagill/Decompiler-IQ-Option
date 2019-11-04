package com.iqoption.core.ui.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;

/* compiled from: SpacingItemDecoration2 */
public class e extends ItemDecoration {
    private int bLD;
    private int orientation = Integer.MAX_VALUE;

    public e(int i) {
        this.bLD = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.bLD > 0 && recyclerView.getChildLayoutPosition(view) != 0) {
            if (this.orientation == Integer.MAX_VALUE) {
                this.orientation = c(recyclerView);
            }
            if (this.orientation == 1) {
                rect.top = this.bLD;
            } else {
                rect.left = this.bLD;
            }
        }
    }

    private int c(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation();
        }
        throw new IllegalStateException("SpacingItemDecoration can only be used with a LinearLayoutManager.");
    }
}
