package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.r;

/* compiled from: DialogPortfolioInvestInfoBinding */
public abstract class go extends ViewDataBinding {
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final FrameLayout caT;
    @NonNull
    public final TextView ccr;
    @Bindable
    protected r ccs;

    public abstract void a(@Nullable r rVar);

    protected go(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.ccr = textView;
        this.bYN = frameLayout;
        this.caT = frameLayout2;
    }
}
