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
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.ui.widget.NumberAnimateTextView;
import com.iqoption.fragment.rightpanel.MultiRightPanelDelegate.c;
import com.iqoption.view.ConfirmDialogView;
import com.iqoption.view.RobotoTextView;

/* compiled from: RightPanelDelegateMultiBinding */
public abstract class yb extends ViewDataBinding {
    @NonNull
    public final TextView bYK;
    @NonNull
    public final RobotoTextView caj;
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
    public final ConfirmDialogView csu;
    @NonNull
    public final TextView csv;
    @NonNull
    public final ImageView csx;
    @NonNull
    public final LinearLayout ctb;
    @NonNull
    public final yd ctc;
    @NonNull
    public final TextView ctd;
    @NonNull
    public final NumberAnimateTextView cte;
    @NonNull
    public final LinearLayout ctf;
    @NonNull
    public final FrameLayout ctg;
    @NonNull
    public final LinearLayout cth;
    @NonNull
    public final TextView cti;
    @NonNull
    public final RecyclerView ctj;
    @NonNull
    public final TextView ctk;
    @NonNull
    public final TextView ctl;
    @Bindable
    protected c ctm;

    public abstract void a(@Nullable c cVar);

    protected yb(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, ImageView imageView, TextView textView2, LinearLayout linearLayout, yd ydVar, ConfirmDialogView confirmDialogView, TextView textView3, NumberAnimateTextView numberAnimateTextView, LinearLayout linearLayout2, TextView textView4, FrameLayout frameLayout2, ImageView imageView2, RobotoTextView robotoTextView, LinearLayout linearLayout3, TextView textView5, RecyclerView recyclerView, TextView textView6, TextView textView7, LinearLayout linearLayout4, TextView textView8) {
        super(obj, view, i);
        this.crs = textView;
        this.crt = frameLayout;
        this.cru = imageView;
        this.crv = textView2;
        this.ctb = linearLayout;
        this.ctc = ydVar;
        setContainedBinding(this.ctc);
        this.csu = confirmDialogView;
        this.ctd = textView3;
        this.cte = numberAnimateTextView;
        this.ctf = linearLayout2;
        this.csv = textView4;
        this.ctg = frameLayout2;
        this.csx = imageView2;
        this.caj = robotoTextView;
        this.cth = linearLayout3;
        this.cti = textView5;
        this.ctj = recyclerView;
        this.ctk = textView6;
        this.ctl = textView7;
        this.csA = linearLayout4;
        this.bYK = textView8;
    }
}
