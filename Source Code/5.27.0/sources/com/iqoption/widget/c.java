package com.iqoption.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;

/* compiled from: SpacingItemDecoration */
public class c extends ItemDecoration {
    private int bLD;
    private boolean eoO;
    private boolean eoP;

    public c(int i, boolean z, boolean z2) {
        this.bLD = i;
        this.eoO = z;
        this.eoP = z2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.bLD > 0) {
            if (this.eoO && recyclerView.getChildLayoutPosition(view) == 0) {
                if (c(recyclerView) == 1) {
                    rect.top = this.bLD;
                } else {
                    rect.left = this.bLD;
                }
            }
            if (this.eoP && recyclerView.getChildAdapterPosition(view) == q(recyclerView) - 1) {
                if (c(recyclerView) == 1) {
                    rect.bottom = this.bLD;
                } else {
                    rect.right = this.bLD;
                }
            }
        }
    }

    private int q(RecyclerView recyclerView) {
        return recyclerView.getAdapter().getItemCount();
    }

    private int c(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation();
        }
        throw new IllegalStateException("SpacingItemDecoration can only be used with a LinearLayoutManager.");
    }
}
