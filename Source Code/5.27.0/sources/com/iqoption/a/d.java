package com.iqoption.a;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* compiled from: ItemBindingViewHolder */
public class d<T extends ViewDataBinding> extends ViewHolder {
    protected final T amm;
    protected int type;

    d(T t) {
        this(t, -1);
    }

    d(T t, int i) {
        super(t.getRoot());
        this.amm = t;
        this.type = i;
    }
}
