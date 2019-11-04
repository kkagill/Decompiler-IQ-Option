package com.iqoption.view.stickyheadersrecyclerview;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.view.stickyheadersrecyclerview.d.b;

/* compiled from: HeaderPositionCalculator */
public class a {
    private final c ehU;
    private final b ehV;
    private final com.iqoption.view.stickyheadersrecyclerview.a.a ehW;
    private final com.iqoption.view.stickyheadersrecyclerview.b.a ehX;
    private final Rect mTempRect1 = new Rect();
    private final Rect mTempRect2 = new Rect();

    public a(c cVar, com.iqoption.view.stickyheadersrecyclerview.a.a aVar, b bVar, com.iqoption.view.stickyheadersrecyclerview.b.a aVar2) {
        this.ehU = cVar;
        this.ehW = aVar;
        this.ehV = bVar;
        this.ehX = aVar2;
    }

    public boolean g(View view, int i, int i2) {
        int top;
        this.ehX.a(this.mTempRect1, view);
        if (i == 1) {
            top = view.getTop();
            i = this.mTempRect1.top;
        } else {
            top = view.getLeft();
            i = this.mTempRect1.left;
        }
        if (top > i || this.ehU.dx(i2) < 0) {
            return false;
        }
        return true;
    }

    public boolean v(int i, boolean z) {
        if (hO(i)) {
            return false;
        }
        long dx = this.ehU.dx(i);
        if (dx < 0) {
            return false;
        }
        long j = -1;
        boolean z2 = true;
        int i2 = (z ? 1 : -1) + i;
        if (!hO(i2)) {
            j = this.ehU.dx(i2);
        }
        if (i != (z ? this.ehU.getItemCount() - 1 : 0) && dx == j) {
            z2 = false;
        }
        return z2;
    }

    private boolean hO(int i) {
        return i < 0 || i >= this.ehU.getItemCount();
    }

    public void a(Rect rect, RecyclerView recyclerView, View view, View view2, boolean z) {
        a(rect, recyclerView, view, view2, this.ehV.c(recyclerView));
        if (z && e(recyclerView, view)) {
            View f = f(recyclerView, view);
            RecyclerView recyclerView2 = recyclerView;
            a(recyclerView2, this.ehV.c(recyclerView), rect, view, f, this.ehW.e(recyclerView, recyclerView.getChildAdapterPosition(f)));
        }
    }

    private void a(Rect rect, RecyclerView recyclerView, View view, View view2, int i) {
        int i2;
        int i3;
        this.ehX.a(this.mTempRect1, view);
        LayoutParams layoutParams = view2.getLayoutParams();
        int i4 = 0;
        if (layoutParams instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            i4 = marginLayoutParams.leftMargin;
            i2 = marginLayoutParams.topMargin;
        } else {
            i2 = 0;
        }
        if (i == 1) {
            int left = (view2.getLeft() - i4) + this.mTempRect1.left;
            i = Math.max(((view2.getTop() - i2) - view.getHeight()) - this.mTempRect1.bottom, n(recyclerView) + this.mTempRect1.top);
            i3 = left;
        } else {
            i = (view2.getTop() - i2) + this.mTempRect1.top;
            i3 = Math.max(((view2.getLeft() - i4) - view.getWidth()) - this.mTempRect1.right, o(recyclerView) + this.mTempRect1.left);
        }
        rect.set(i3, i, view.getWidth() + i3, view.getHeight() + i);
    }

    private boolean e(RecyclerView recyclerView, View view) {
        View f = f(recyclerView, view);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(f);
        if (childAdapterPosition == -1) {
            return false;
        }
        boolean p = this.ehV.p(recyclerView);
        if (childAdapterPosition > 0 && v(childAdapterPosition, p)) {
            View e = this.ehW.e(recyclerView, childAdapterPosition);
            this.ehX.a(this.mTempRect1, e);
            this.ehX.a(this.mTempRect2, view);
            if (this.ehV.c(recyclerView) == 1) {
                if (((f.getTop() - this.mTempRect1.bottom) - e.getHeight()) - this.mTempRect1.top < ((recyclerView.getPaddingTop() + view.getBottom()) + this.mTempRect2.top) + this.mTempRect2.bottom) {
                    return true;
                }
            } else if (((f.getLeft() - this.mTempRect1.right) - e.getWidth()) - this.mTempRect1.left < ((recyclerView.getPaddingLeft() + view.getRight()) + this.mTempRect2.left) + this.mTempRect2.right) {
                return true;
            }
        }
        return false;
    }

    private void a(RecyclerView recyclerView, int i, Rect rect, View view, View view2, View view3) {
        this.ehX.a(this.mTempRect1, view3);
        this.ehX.a(this.mTempRect2, view);
        int n;
        if (i == 1) {
            n = (n(recyclerView) + this.mTempRect2.top) + this.mTempRect2.bottom;
            i = ((((view2.getTop() - view3.getHeight()) - this.mTempRect1.bottom) - this.mTempRect1.top) - view.getHeight()) - n;
            if (i < n) {
                rect.top += i;
                return;
            }
            return;
        }
        n = (o(recyclerView) + this.mTempRect2.left) + this.mTempRect2.right;
        i = ((((view2.getLeft() - view3.getWidth()) - this.mTempRect1.right) - this.mTempRect1.left) - view.getWidth()) - n;
        if (i < n) {
            rect.left += i;
        }
    }

    private View f(RecyclerView recyclerView, View view) {
        boolean p = this.ehV.p(recyclerView);
        int i = p ? -1 : 1;
        int childCount = p ? recyclerView.getChildCount() - 1 : 0;
        while (childCount >= 0 && childCount <= recyclerView.getChildCount() - 1) {
            View childAt = recyclerView.getChildAt(childCount);
            if (!a(recyclerView, childAt, view, this.ehV.c(recyclerView))) {
                return childAt;
            }
            childCount += i;
        }
        return null;
    }

    private boolean a(RecyclerView recyclerView, View view, View view2, int i) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.ehX.a(this.mTempRect1, view2);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1 || this.ehW.e(recyclerView, childAdapterPosition) != view2) {
            return false;
        }
        if (i == 1) {
            if (view.getTop() - layoutParams.topMargin >= ((n(recyclerView) + view2.getBottom()) + this.mTempRect1.bottom) + this.mTempRect1.top) {
                return false;
            }
        } else if (view.getLeft() - layoutParams.leftMargin >= ((o(recyclerView) + view2.getRight()) + this.mTempRect1.right) + this.mTempRect1.left) {
            return false;
        }
        return true;
    }

    private int n(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager().getClipToPadding()) {
            return recyclerView.getPaddingTop();
        }
        return this.ehU.aJ(recyclerView.getContext());
    }

    private int o(RecyclerView recyclerView) {
        return recyclerView.getLayoutManager().getClipToPadding() ? recyclerView.getPaddingLeft() : 0;
    }
}
