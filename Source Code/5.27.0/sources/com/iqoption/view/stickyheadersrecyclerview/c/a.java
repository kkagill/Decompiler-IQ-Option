package com.iqoption.view.stickyheadersrecyclerview.c;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.view.stickyheadersrecyclerview.d.b;

/* compiled from: HeaderRenderer */
public class a {
    private final b ehV;
    private final com.iqoption.view.stickyheadersrecyclerview.b.a ehX;
    private final Rect mTempRect;

    public a(b bVar) {
        this(bVar, new com.iqoption.view.stickyheadersrecyclerview.b.a());
    }

    private a(b bVar, com.iqoption.view.stickyheadersrecyclerview.b.a aVar) {
        this.mTempRect = new Rect();
        this.ehV = bVar;
        this.ehX = aVar;
    }

    public void a(RecyclerView recyclerView, Canvas canvas, View view, Rect rect) {
        canvas.save();
        if (recyclerView.getLayoutManager().getClipToPadding()) {
            a(this.mTempRect, recyclerView, view);
            canvas.clipRect(this.mTempRect);
        }
        canvas.translate((float) rect.left, (float) rect.top);
        view.draw(canvas);
        canvas.restore();
    }

    private void a(Rect rect, RecyclerView recyclerView, View view) {
        this.ehX.a(rect, view);
        if (this.ehV.c(recyclerView) == 1) {
            rect.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), (recyclerView.getWidth() - recyclerView.getPaddingRight()) - rect.right, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            rect.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - rect.bottom);
        }
    }
}
