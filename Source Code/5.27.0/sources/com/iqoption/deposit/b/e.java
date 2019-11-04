package com.iqoption.deposit.b;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;

/* compiled from: FragmentCardPaymentLightBinding */
public abstract class e extends ViewDataBinding {
    @NonNull
    public final EditText cAK;
    @NonNull
    public final LinearLayout cAL;
    @NonNull
    public final EditText cAM;
    @NonNull
    public final EditText cAN;
    @NonNull
    public final EditText cAO;
    @NonNull
    public final ImageView cAP;
    @NonNull
    public final ViewStubProxy cAQ;
    @NonNull
    public final ToggleButton cAR;
    @NonNull
    public final ImageView cAS;
    @NonNull
    public final TextView cAT;

    protected e(Object obj, View view, int i, EditText editText, LinearLayout linearLayout, EditText editText2, EditText editText3, EditText editText4, ImageView imageView, ViewStubProxy viewStubProxy, ToggleButton toggleButton, ImageView imageView2, TextView textView) {
        super(obj, view, i);
        this.cAK = editText;
        this.cAL = linearLayout;
        this.cAM = editText2;
        this.cAN = editText3;
        this.cAO = editText4;
        this.cAP = imageView;
        this.cAQ = viewStubProxy;
        this.cAR = toggleButton;
        this.cAS = imageView2;
        this.cAT = textView;
    }
}
