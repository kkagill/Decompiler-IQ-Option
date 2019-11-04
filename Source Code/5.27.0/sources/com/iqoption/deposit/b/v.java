package com.iqoption.deposit.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycWarningBinding */
public abstract class v extends ViewDataBinding {
    @NonNull
    public final ImageView cCx;
    @NonNull
    public final TextView cCy;
    @NonNull
    public final TextView cCz;
    @NonNull
    public final LinearLayout cod;

    protected v(Object obj, View view, int i, ImageView imageView, TextView textView, LinearLayout linearLayout, TextView textView2) {
        super(obj, view, i);
        this.cCx = imageView;
        this.cCy = textView;
        this.cod = linearLayout;
        this.cCz = textView2;
    }
}
