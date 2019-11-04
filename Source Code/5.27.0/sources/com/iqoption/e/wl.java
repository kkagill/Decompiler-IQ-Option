package com.iqoption.e;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: PriceMovementsHighFrequencyLayoutBinding */
public abstract class wl extends ViewDataBinding {
    @NonNull
    public final FormattedTextView cqm;
    @NonNull
    public final RecyclerView cqn;

    protected wl(Object obj, View view, int i, FormattedTextView formattedTextView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.cqm = formattedTextView;
        this.cqn = recyclerView;
    }
}
