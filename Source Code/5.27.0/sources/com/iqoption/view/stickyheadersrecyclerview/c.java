package com.iqoption.view.stickyheadersrecyclerview;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* compiled from: StickyRecyclerHeadersAdapter */
public interface c<VH extends ViewHolder> {
    void a(VH vh, int i);

    int aJ(Context context);

    long dx(int i);

    VH f(ViewGroup viewGroup);

    int getItemCount();
}
