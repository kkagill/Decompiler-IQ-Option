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
import com.iqoption.fragment.rightpanel.BinaryRightPanelDelegate.c;
import com.iqoption.view.BuyNewDialogView;
import com.iqoption.view.ConfirmDialogView;
import com.iqoption.view.RobotoTextView;

/* compiled from: RightPanelDelegateTurboBinaryBinding */
public abstract class yj extends ViewDataBinding {
    @NonNull
    public final BuyNewDialogView crC;
    @NonNull
    public final TextView crZ;
    @NonNull
    public final TextView crs;
    @NonNull
    public final FrameLayout crt;
    @NonNull
    public final ImageView cru;
    @NonNull
    public final LinearLayout csA;
    @NonNull
    public final TextView csa;
    @NonNull
    public final RobotoTextView csb;
    @NonNull
    public final ConfirmDialogView csu;
    @NonNull
    public final TextView csv;
    @NonNull
    public final ImageView csx;
    @NonNull
    public final FrameLayout csz;
    @NonNull
    public final FrameLayout ctg;
    @NonNull
    public final RobotoTextView ctx;
    @Bindable
    protected c cty;

    public abstract void a(@Nullable c cVar);

    protected yj(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, TextView textView2, ImageView imageView, TextView textView3, RobotoTextView robotoTextView, BuyNewDialogView buyNewDialogView, ConfirmDialogView confirmDialogView, TextView textView4, FrameLayout frameLayout2, ImageView imageView2, RobotoTextView robotoTextView2, FrameLayout frameLayout3, LinearLayout linearLayout) {
        super(obj, view, i);
        this.crs = textView;
        this.crt = frameLayout;
        this.crZ = textView2;
        this.cru = imageView;
        this.csa = textView3;
        this.csb = robotoTextView;
        this.crC = buyNewDialogView;
        this.csu = confirmDialogView;
        this.csv = textView4;
        this.ctg = frameLayout2;
        this.csx = imageView2;
        this.ctx = robotoTextView2;
        this.csz = frameLayout3;
        this.csA = linearLayout;
    }
}
