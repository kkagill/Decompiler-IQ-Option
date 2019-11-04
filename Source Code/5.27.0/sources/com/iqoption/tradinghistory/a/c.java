package com.iqoption.tradinghistory.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentDealDetailsMultiBinding */
public abstract class c extends ViewDataBinding {
    @NonNull
    public final TextView alW;
    @NonNull
    public final TextView ccI;
    @NonNull
    public final TextView cen;
    @NonNull
    public final LinearLayout cod;
    @NonNull
    public final ImageView dVP;
    @NonNull
    public final TextView dVQ;
    @NonNull
    public final ConstraintLayout dVR;
    @NonNull
    public final LinearLayout dVS;
    @NonNull
    public final ScrollView dVT;
    @NonNull
    public final y dVU;
    @NonNull
    public final TextView dVt;
    @NonNull
    public final TextView dVu;
    @NonNull
    public final TextView dVv;

    protected c(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout, LinearLayout linearLayout, ScrollView scrollView, y yVar, LinearLayout linearLayout2, TextView textView5, TextView textView6, ImageView imageView, TextView textView7) {
        super(obj, view, i);
        this.ccI = textView;
        this.dVt = textView2;
        this.dVu = textView3;
        this.dVv = textView4;
        this.dVR = constraintLayout;
        this.dVS = linearLayout;
        this.dVT = scrollView;
        this.dVU = yVar;
        setContainedBinding(this.dVU);
        this.cod = linearLayout2;
        this.alW = textView5;
        this.cen = textView6;
        this.dVP = imageView;
        this.dVQ = textView7;
    }
}
