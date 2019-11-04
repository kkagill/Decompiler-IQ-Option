package com.iqoption.deposit.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;

/* compiled from: FragmentDepositHoldLightBinding */
public abstract class m extends ViewDataBinding {
    @NonNull
    public final TextView cBK;
    @NonNull
    public final TextView cBL;
    @NonNull
    public final TextView cBM;
    @NonNull
    public final ImageView cBN;
    @NonNull
    public final TextView cBO;
    @NonNull
    public final TextView cBP;
    @NonNull
    public final bb cBQ;
    @NonNull
    public final ViewStubProxy cBR;

    protected m(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, ImageView imageView, TextView textView4, TextView textView5, bb bbVar, ViewStubProxy viewStubProxy) {
        super(obj, view, i);
        this.cBK = textView;
        this.cBL = textView2;
        this.cBM = textView3;
        this.cBN = imageView;
        this.cBO = textView4;
        this.cBP = textView5;
        this.cBQ = bbVar;
        setContainedBinding(this.cBQ);
        this.cBR = viewStubProxy;
    }
}
