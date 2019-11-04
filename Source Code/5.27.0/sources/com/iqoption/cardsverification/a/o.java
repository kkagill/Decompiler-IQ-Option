package com.iqoption.cardsverification.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.cardsverification.g.e;

/* compiled from: VerifySideItemBinding */
public abstract class o extends ViewDataBinding {
    @NonNull
    public final LinearLayout aBb;
    @NonNull
    public final Barrier aBc;
    @NonNull
    public final TextView aBd;
    @NonNull
    public final ImageView aBe;
    @NonNull
    public final TextView aBf;
    @NonNull
    public final LinearLayout aBg;

    protected o(Object obj, View view, int i, Barrier barrier, TextView textView, ImageView imageView, LinearLayout linearLayout, TextView textView2, LinearLayout linearLayout2) {
        super(obj, view, i);
        this.aBc = barrier;
        this.aBd = textView;
        this.aBe = imageView;
        this.aBb = linearLayout;
        this.aBf = textView2;
        this.aBg = linearLayout2;
    }

    @NonNull
    public static o b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return b(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static o b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (o) ViewDataBinding.inflateInternal(layoutInflater, e.verify_side_item, viewGroup, z, obj);
    }
}
