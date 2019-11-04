package com.iqoption.cardsverification.a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.cardsverification.g.e;

/* compiled from: VerifySideHintBinding */
public abstract class m extends ViewDataBinding {
    @NonNull
    public final TextView aAX;
    @NonNull
    public final ImageView aAY;
    @NonNull
    public final TextView aAZ;
    @NonNull
    public final TextView aBa;
    @NonNull
    public final LinearLayout aBb;

    protected m(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, TextView textView3, LinearLayout linearLayout) {
        super(obj, view, i);
        this.aAX = textView;
        this.aAY = imageView;
        this.aAZ = textView2;
        this.aBa = textView3;
        this.aBb = linearLayout;
    }

    @NonNull
    public static m a(@NonNull LayoutInflater layoutInflater) {
        return a(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static m a(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (m) ViewDataBinding.inflateInternal(layoutInflater, e.verify_side_hint, null, false, obj);
    }
}
