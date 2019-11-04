package com.iqoption.view.drumview.recyclerviewpager;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.State;

public class ScrolledToPositionInZoneLinearLayoutManager extends LinearLayoutManager {
    private final LinearSmoothScroller ehn;

    public ScrolledToPositionInZoneLinearLayoutManager(Context context, int i) {
        super(context, i, false);
        this.ehn = new LinearSmoothScroller(context) {
            public PointF computeScrollVectorForPosition(int i) {
                return ScrolledToPositionInZoneLinearLayoutManager.this.computeScrollVectorForPosition(i);
            }

            /* Access modifiers changed, original: protected */
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 200.0f / ((float) displayMetrics.densityDpi);
            }

            public int calculateDxToMakeVisible(View view, int i) {
                LayoutManager layoutManager = getLayoutManager();
                if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
                    return 0;
                }
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return calculateDtToFit(layoutManager.getDecoratedLeft(view) - layoutParams.leftMargin, layoutManager.getDecoratedRight(view) + layoutParams.rightMargin, ((layoutManager.getWidth() / 2) - (view.getWidth() / 2)) - 1, ((layoutManager.getWidth() / 2) + (view.getWidth() / 2)) + 1, i);
            }

            public int calculateDyToMakeVisible(View view, int i) {
                LayoutManager layoutManager = getLayoutManager();
                if (layoutManager == null || !layoutManager.canScrollVertically()) {
                    return 0;
                }
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return calculateDtToFit(view.getTop() - layoutParams.topMargin, view.getBottom() + layoutParams.bottomMargin, ((layoutManager.getHeight() / 2) - (view.getHeight() / 2)) - 1, ((layoutManager.getHeight() / 2) + (view.getHeight() / 2)) + 1, i);
            }
        };
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
        this.ehn.setTargetPosition(i);
        startSmoothScroll(this.ehn);
    }
}
