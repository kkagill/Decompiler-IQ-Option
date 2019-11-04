package com.iqoption.core.ui.widget.recyclerview;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;

/* compiled from: HorizontalSpacingItemDecoration */
public class c extends ItemDecoration {
    private int bLD;

    public c(int i) {
        this.bLD = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.bLD > 0 && recyclerView.getChildAdapterPosition(view) > 0) {
            rect.left = this.bLD;
        }
    }
}
