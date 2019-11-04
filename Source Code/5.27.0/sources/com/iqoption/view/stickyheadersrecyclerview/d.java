package com.iqoption.view.stickyheadersrecyclerview;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import com.iqoption.view.stickyheadersrecyclerview.a.a;
import com.iqoption.view.stickyheadersrecyclerview.d.b;

/* compiled from: StickyRecyclerHeadersDecoration */
public class d extends ItemDecoration {
    private final c ehU;
    private final b ehV;
    private final a ehW;
    private final com.iqoption.view.stickyheadersrecyclerview.b.a ehX;
    private final b ehY;
    private final SparseArray<Rect> ehZ;
    private final a eia;
    private final com.iqoption.view.stickyheadersrecyclerview.c.a eib;
    private final Rect mTempRect;

    public d(c cVar) {
        this(cVar, new com.iqoption.view.stickyheadersrecyclerview.d.a(), new com.iqoption.view.stickyheadersrecyclerview.b.a(), null);
    }

    private d(c cVar, b bVar, com.iqoption.view.stickyheadersrecyclerview.b.a aVar, b bVar2) {
        this(cVar, bVar, aVar, new com.iqoption.view.stickyheadersrecyclerview.c.a(bVar), new com.iqoption.view.stickyheadersrecyclerview.a.b(cVar, bVar), bVar2);
    }

    private d(c cVar, b bVar, com.iqoption.view.stickyheadersrecyclerview.b.a aVar, com.iqoption.view.stickyheadersrecyclerview.c.a aVar2, a aVar3, b bVar2) {
        this(cVar, aVar2, bVar, aVar, aVar3, new a(cVar, aVar3, bVar, aVar), bVar2);
    }

    private d(c cVar, com.iqoption.view.stickyheadersrecyclerview.c.a aVar, b bVar, com.iqoption.view.stickyheadersrecyclerview.b.a aVar2, a aVar3, a aVar4, b bVar2) {
        this.ehZ = new SparseArray();
        this.mTempRect = new Rect();
        this.ehU = cVar;
        this.ehW = aVar3;
        this.ehV = bVar;
        this.eib = aVar;
        this.ehX = aVar2;
        this.eia = aVar4;
        this.ehY = bVar2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && this.eia.v(childAdapterPosition, this.ehV.p(recyclerView))) {
            a(rect, d(recyclerView, childAdapterPosition), this.ehV.c(recyclerView));
        }
    }

    private void a(Rect rect, View view, int i) {
        this.ehX.a(this.mTempRect, view);
        if (i == 1) {
            rect.top = (view.getHeight() + this.mTempRect.top) + this.mTempRect.bottom;
        } else {
            rect.left = (view.getWidth() + this.mTempRect.left) + this.mTempRect.right;
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
        super.onDrawOver(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        if (childCount > 0 && this.ehU.getItemCount() > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1) {
                    boolean g = this.eia.g(childAt, this.ehV.c(recyclerView), childAdapterPosition);
                    if (g || this.eia.v(childAdapterPosition, this.ehV.p(recyclerView))) {
                        View e = this.ehW.e(recyclerView, childAdapterPosition);
                        Rect rect = (Rect) this.ehZ.get(childAdapterPosition);
                        if (rect == null) {
                            rect = new Rect();
                            this.ehZ.put(childAdapterPosition, rect);
                        }
                        Rect rect2 = rect;
                        this.eia.a(rect2, recyclerView, e, childAt, g);
                        this.eib.a(recyclerView, canvas, e, rect2);
                    }
                }
            }
        }
    }

    public View d(RecyclerView recyclerView, int i) {
        return this.ehW.e(recyclerView, i);
    }
}
