package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;

/* compiled from: WhatsNewDepositItemBinding */
public abstract class aax extends ViewDataBinding {
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final LinearLayout bZU;
    @NonNull
    public final RobotoTextView chk;

    protected aax(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView, RobotoTextView robotoTextView) {
        super(obj, view, i);
        this.bZU = linearLayout;
        this.aRh = imageView;
        this.chk = robotoTextView;
    }
}
