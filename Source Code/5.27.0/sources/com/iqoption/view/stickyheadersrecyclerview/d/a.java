package com.iqoption.view.stickyheadersrecyclerview.d;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;

/* compiled from: LinearLayoutOrientationProvider */
public class a implements b {
    public int c(RecyclerView recyclerView) {
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        a(layoutManager);
        return ((LinearLayoutManager) layoutManager).getOrientation();
    }

    public boolean p(RecyclerView recyclerView) {
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        a(layoutManager);
        return ((LinearLayoutManager) layoutManager).getReverseLayout();
    }

    private void a(LayoutManager layoutManager) {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new IllegalStateException("StickyListHeadersDecoration can only be used with a LinearLayoutManager.");
        }
    }
}
