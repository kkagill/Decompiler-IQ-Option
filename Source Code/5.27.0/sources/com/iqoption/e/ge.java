package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.w;

/* compiled from: DialogMultiplierConfirmBinding */
public abstract class ge extends ViewDataBinding {
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final FrameLayout caT;
    @NonNull
    public final TextView cbI;
    @Bindable
    protected w cbJ;

    public abstract void a(@Nullable w wVar);

    protected ge(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.cbI = textView;
        this.bYN = frameLayout;
        this.caT = frameLayout2;
    }
}
