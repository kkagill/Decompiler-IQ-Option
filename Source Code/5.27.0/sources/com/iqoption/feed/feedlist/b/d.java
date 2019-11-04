package com.iqoption.feed.feedlist.b;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;

/* compiled from: MicroItemDecoration */
public class d extends ItemDecoration {
    private final int bLD;
    private final Rect bounds = new Rect();
    private final Drawable cJu;

    public d(Drawable drawable, int i) {
        this.cJu = drawable;
        this.bLD = i;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, State state) {
        if (recyclerView.getLayoutManager() != null && this.cJu != null) {
            drawVertical(canvas, recyclerView);
        }
    }

    private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft;
        int width;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (recyclerView.getChildAdapterPosition(childAt) >= 0) {
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.bounds);
                int round = this.bounds.bottom + Math.round(childAt.getTranslationY());
                this.cJu.setBounds(paddingLeft, round - this.cJu.getIntrinsicHeight(), width, round);
                this.cJu.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int i = this.bLD;
        if (i > 0 && childLayoutPosition != 0) {
            rect.top = i;
        }
    }
}
