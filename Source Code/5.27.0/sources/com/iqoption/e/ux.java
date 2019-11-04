package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.timer.TimerView;
import com.iqoption.x.R;

/* compiled from: PortfolioExpMultiGroupItemBinding */
public abstract class ux extends ViewDataBinding {
    @NonNull
    public final TextView alU;
    @NonNull
    public final TextView anJ;
    @NonNull
    public final TextView aoq;
    @NonNull
    public final TimerView bXq;
    @NonNull
    public final TextView bZk;
    @NonNull
    public final TextView caN;
    @NonNull
    public final TextView caO;
    @NonNull
    public final TextView caP;
    @NonNull
    public final ConstraintLayout cnH;
    @NonNull
    public final FrameLayout cnK;
    @NonNull
    public final TextView cnL;
    @NonNull
    public final ProgressBar cnM;
    @NonNull
    public final LinearLayout cnP;
    @NonNull
    public final TextView cnX;
    @NonNull
    public final TextView cnY;
    @NonNull
    public final TextView cnZ;
    @NonNull
    public final ImageView cnb;
    @NonNull
    public final TextView cnp;
    @NonNull
    public final LinearLayout cnq;
    @NonNull
    public final LinearLayout coa;
    @NonNull
    public final LinearLayout cob;
    @NonNull
    public final LinearLayout coc;
    @NonNull
    public final LinearLayout cod;

    protected ux(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, FrameLayout frameLayout, TextView textView5, ProgressBar progressBar, ImageView imageView, ConstraintLayout constraintLayout, LinearLayout linearLayout4, TextView textView6, TextView textView7, LinearLayout linearLayout5, LinearLayout linearLayout6, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TimerView timerView, TextView textView12) {
        super(obj, view, i);
        this.anJ = textView;
        this.cnX = textView2;
        this.cnY = textView3;
        this.cnZ = textView4;
        this.coa = linearLayout;
        this.cob = linearLayout2;
        this.coc = linearLayout3;
        this.cnK = frameLayout;
        this.cnL = textView5;
        this.cnM = progressBar;
        this.cnb = imageView;
        this.cnH = constraintLayout;
        this.cnP = linearLayout4;
        this.bZk = textView6;
        this.cnp = textView7;
        this.cnq = linearLayout5;
        this.cod = linearLayout6;
        this.alU = textView8;
        this.caN = textView9;
        this.caO = textView10;
        this.caP = textView11;
        this.bXq = timerView;
        this.aoq = textView12;
    }

    @NonNull
    public static ux S(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return S(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ux S(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ux) ViewDataBinding.inflateInternal(layoutInflater, R.layout.portfolio_exp_multi_group_item, viewGroup, z, obj);
    }
}
