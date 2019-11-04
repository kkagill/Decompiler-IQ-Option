package com.iqoption.cardsverification.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.cardsverification.g.e;

/* compiled from: PerformVerifyFooterBinding */
public abstract class i extends ViewDataBinding {
    @NonNull
    public final LinearLayout aAT;
    @NonNull
    public final TextView aAU;
    @NonNull
    public final ContentLoadingProgressBar aAV;

    protected i(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, ContentLoadingProgressBar contentLoadingProgressBar) {
        super(obj, view, i);
        this.aAT = linearLayout;
        this.aAU = textView;
        this.aAV = contentLoadingProgressBar;
    }

    @NonNull
    public static i a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return a(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static i a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (i) ViewDataBinding.inflateInternal(layoutInflater, e.perform_verify_footer, viewGroup, z, obj);
    }
}
