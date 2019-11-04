package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.dialog.d;

/* compiled from: RateUsDialogBinding */
public abstract class wx extends ViewDataBinding {
    @NonNull
    public final LinearLayout aRl;
    @NonNull
    public final FrameLayout caT;
    @NonNull
    public final TextView ckI;
    @NonNull
    public final TextView cqH;
    @NonNull
    public final TextView cqI;
    @NonNull
    public final TextView cqJ;
    @NonNull
    public final TextView cqK;
    @NonNull
    public final ImageView cqL;
    @NonNull
    public final ImageView cqM;
    @NonNull
    public final ImageView cqN;
    @NonNull
    public final ImageView cqO;
    @NonNull
    public final ImageView cqP;
    @Bindable
    protected d cqQ;

    public abstract void a(@Nullable d dVar);

    protected wx(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5) {
        super(obj, view, i);
        this.ckI = textView;
        this.aRl = linearLayout;
        this.cqH = textView2;
        this.cqI = textView3;
        this.cqJ = textView4;
        this.cqK = textView5;
        this.caT = frameLayout;
        this.cqL = imageView;
        this.cqM = imageView2;
        this.cqN = imageView3;
        this.cqO = imageView4;
        this.cqP = imageView5;
    }
}
