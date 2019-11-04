package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.TradersMoodBar;

/* compiled from: AssetInfoTradersPulseItemBinding */
public abstract class bl extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView bWU;
    @NonNull
    public final TextView bWV;
    @NonNull
    public final TradersMoodBar bWW;

    protected bl(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TradersMoodBar tradersMoodBar) {
        super(obj, view, i);
        this.bWU = textView;
        this.bWV = textView2;
        this.alH = textView3;
        this.bWW = tradersMoodBar;
    }
}
