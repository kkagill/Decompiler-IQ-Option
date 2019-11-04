package com.iqoption.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.State;

/* compiled from: SeparatorDecoration */
public class b extends ItemDecoration {
    private final Paint mPaint = new Paint();

    public b(@ColorInt int i, @FloatRange(from = 0.0d, fromInclusive = false) float f) {
        this.mPaint.setColor(i);
        this.mPaint.setStrokeWidth(f);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            rect.top = Math.round(this.mPaint.getStrokeWidth());
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
        float strokeWidth = this.mPaint.getStrokeWidth() / 2.0f;
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            if (((LayoutParams) childAt.getLayoutParams()).getViewAdapterPosition() < state.getItemCount()) {
                canvas.drawLine((float) childAt.getLeft(), ((float) childAt.getBottom()) + strokeWidth, (float) childAt.getRight(), ((float) childAt.getBottom()) + strokeWidth, this.mPaint);
            }
        }
    }
}
