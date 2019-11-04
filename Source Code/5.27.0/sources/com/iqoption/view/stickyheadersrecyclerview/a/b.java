package com.iqoption.view.stickyheadersrecyclerview.a;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.view.stickyheadersrecyclerview.c;

/* compiled from: HeaderViewCache */
public class b implements a {
    private final c ehU;
    private final com.iqoption.view.stickyheadersrecyclerview.d.b ehV;
    private final LongSparseArray<View> eic = new LongSparseArray();

    public b(c cVar, com.iqoption.view.stickyheadersrecyclerview.d.b bVar) {
        this.ehU = cVar;
        this.ehV = bVar;
    }

    public View e(RecyclerView recyclerView, int i) {
        long dx = this.ehU.dx(i);
        View view = (View) this.eic.get(dx);
        if (view == null) {
            int makeMeasureSpec;
            ViewHolder f = this.ehU.f(recyclerView);
            this.ehU.a(f, i);
            view = f.itemView;
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            if (this.ehV.c(recyclerView) == 1) {
                i = MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824);
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0);
            } else {
                i = MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 0);
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824);
            }
            view.measure(ViewGroup.getChildMeasureSpec(i, recyclerView.getPaddingLeft() + recyclerView.getPaddingRight(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(makeMeasureSpec, recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), view.getLayoutParams().height));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            this.eic.put(dx, view);
        }
        return view;
    }
}
