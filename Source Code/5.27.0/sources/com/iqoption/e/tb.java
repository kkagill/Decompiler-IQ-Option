package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.ViewDataBinding;

/* compiled from: NewsAndUpdatesItemBinding */
public abstract class tb extends ViewDataBinding {
    @NonNull
    public final TextView coA;
    @NonNull
    public final TextView coy;
    @NonNull
    public final SwitchCompat coz;

    protected tb(Object obj, View view, int i, TextView textView, SwitchCompat switchCompat, TextView textView2) {
        super(obj, view, i);
        this.coy = textView;
        this.coz = switchCompat;
        this.coA = textView2;
    }
}
