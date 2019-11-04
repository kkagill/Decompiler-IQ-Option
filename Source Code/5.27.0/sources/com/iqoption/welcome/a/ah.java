package com.iqoption.welcome.a;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PopupWindowCurrencySelectionBinding */
public abstract class ah extends ViewDataBinding {
    @NonNull
    public final CardView elw;
    @NonNull
    public final RecyclerView elx;

    protected ah(Object obj, View view, int i, CardView cardView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.elw = cardView;
        this.elx = recyclerView;
    }
}
