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
import com.iqoption.core.ui.widget.MaxSizeLinearLayout;
import com.iqoption.core.ui.widget.time.TimeTextView;
import com.iqoption.fragment.rightpanel.FxRightPanelDelegate.c;
import com.iqoption.view.BuyNewDialogView;
import com.iqoption.view.ConfirmDialogView;
import com.iqoption.view.RobotoTextView;

/* compiled from: RightPanelFxDelegateBinding */
public abstract class yn extends ViewDataBinding {
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
    public final TextView csB;
    @NonNull
    public final TextView csC;
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
    public final RobotoTextView ctD;
    @NonNull
    public final RobotoTextView ctE;
    @NonNull
    public final LinearLayout ctF;
    @NonNull
    public final TimeTextView ctJ;
    @NonNull
    public final MaxSizeLinearLayout ctK;
    @NonNull
    public final FrameLayout ctL;
    @Bindable
    protected c ctM;

    public abstract void a(@Nullable c cVar);

    protected yn(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, ImageView imageView, TextView textView2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, BuyNewDialogView buyNewDialogView, LinearLayout linearLayout, ConfirmDialogView confirmDialogView, TextView textView3, ConstraintLayout constraintLayout, ImageView imageView2, TimeTextView timeTextView, Guideline guideline, MaxSizeLinearLayout maxSizeLinearLayout, FrameLayout frameLayout2, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.crs = textView;
        this.crt = frameLayout;
        this.cru = imageView;
        this.crv = textView2;
        this.ctD = robotoTextView;
        this.ctE = robotoTextView2;
        this.crC = buyNewDialogView;
        this.ctF = linearLayout;
        this.csu = confirmDialogView;
        this.csv = textView3;
        this.csw = constraintLayout;
        this.csx = imageView2;
        this.ctJ = timeTextView;
        this.csy = guideline;
        this.ctK = maxSizeLinearLayout;
        this.ctL = frameLayout2;
        this.csB = textView4;
        this.csC = textView5;
    }
}
