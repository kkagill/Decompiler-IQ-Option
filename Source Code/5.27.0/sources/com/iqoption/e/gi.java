package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: DialogOtnExpectationBinding */
public abstract class gi extends ViewDataBinding {
    @NonNull
    public final LinearLayout aRl;
    @NonNull
    public final TextView aRu;
    @NonNull
    public final TextView alH;
    @NonNull
    public final ImageView bYq;
    @NonNull
    public final ImageView cbX;
    @NonNull
    public final ImageView cbY;
    @NonNull
    public final ImageView cbZ;
    @NonNull
    public final ImageView cca;
    @NonNull
    public final TextView ccb;
    @NonNull
    public final TextView ccc;
    @NonNull
    public final TextView ccd;
    @NonNull
    public final RobotoTextView cce;
    @NonNull
    public final TextView ccf;
    @NonNull
    public final TextView ccg;
    @NonNull
    public final TextView cch;
    @NonNull
    public final LinearLayout cci;
    @NonNull
    public final TextView ccj;
    @NonNull
    public final TextView cck;

    protected gi(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, RobotoTextView robotoTextView, TextView textView6, TextView textView7, TextView textView8, LinearLayout linearLayout2, TextView textView9, TextView textView10) {
        super(obj, view, i);
        this.cbX = imageView;
        this.cbY = imageView2;
        this.cbZ = imageView3;
        this.cca = imageView4;
        this.bYq = imageView5;
        this.aRl = linearLayout;
        this.aRu = textView;
        this.alH = textView2;
        this.ccb = textView3;
        this.ccc = textView4;
        this.ccd = textView5;
        this.cce = robotoTextView;
        this.ccf = textView6;
        this.ccg = textView7;
        this.cch = textView8;
        this.cci = linearLayout2;
        this.ccj = textView9;
        this.cck = textView10;
    }

    @NonNull
    public static gi n(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return n(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static gi n(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (gi) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_otn_expectation, viewGroup, z, obj);
    }
}
