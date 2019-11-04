package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.rightpanel.DigitalRightPanelDelegate.c;
import com.iqoption.view.BuyNewDialogView;
import com.iqoption.view.ConfirmDialogView;
import com.iqoption.view.RobotoTextView;

/* compiled from: RightPanelDelegateDigitalBinding */
public abstract class xx extends ViewDataBinding {
    @NonNull
    public final RobotoTextView caj;
    @NonNull
    public final BuyNewDialogView crC;
    @NonNull
    public final TextView crs;
    @NonNull
    public final FrameLayout crt;
    @NonNull
    public final ImageView cru;
    @NonNull
    public final TextView crv;
    @NonNull
    public final LinearLayout csA;
    @NonNull
    public final TextView csB;
    @NonNull
    public final TextView csC;
    @Bindable
    protected c csD;
    @NonNull
    public final ConfirmDialogView csu;
    @NonNull
    public final TextView csv;
    @NonNull
    public final ConstraintLayout csw;
    @NonNull
    public final ImageView csx;
    @NonNull
    public final Guideline csy;
    @NonNull
    public final FrameLayout csz;

    public abstract void a(@Nullable c cVar);

    protected xx(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, ImageView imageView, TextView textView2, BuyNewDialogView buyNewDialogView, ConfirmDialogView confirmDialogView, TextView textView3, ConstraintLayout constraintLayout, ImageView imageView2, RobotoTextView robotoTextView, Guideline guideline, FrameLayout frameLayout2, LinearLayout linearLayout, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.crs = textView;
        this.crt = frameLayout;
        this.cru = imageView;
        this.crv = textView2;
        this.crC = buyNewDialogView;
        this.csu = confirmDialogView;
        this.csv = textView3;
        this.csw = constraintLayout;
        this.csx = imageView2;
        this.caj = robotoTextView;
        this.csy = guideline;
        this.csz = frameLayout2;
        this.csA = linearLayout;
        this.csB = textView4;
        this.csC = textView5;
    }
}
