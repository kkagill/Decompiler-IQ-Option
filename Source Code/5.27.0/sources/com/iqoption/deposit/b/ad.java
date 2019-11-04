package com.iqoption.deposit.b;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentRefundAddressBinding */
public abstract class ad extends ViewDataBinding {
    @NonNull
    public final bj cBc;
    @NonNull
    public final ax cCO;
    @NonNull
    public final LinearLayout cCP;
    @NonNull
    public final TextView cCQ;
    @NonNull
    public final EditText cCR;
    @NonNull
    public final ImageView cCS;
    @NonNull
    public final CardView cCT;
    @NonNull
    public final FrameLayout cCU;

    protected ad(Object obj, View view, int i, bj bjVar, ax axVar, LinearLayout linearLayout, TextView textView, EditText editText, ImageView imageView, CardView cardView, FrameLayout frameLayout) {
        super(obj, view, i);
        this.cBc = bjVar;
        setContainedBinding(this.cBc);
        this.cCO = axVar;
        setContainedBinding(this.cCO);
        this.cCP = linearLayout;
        this.cCQ = textView;
        this.cCR = editText;
        this.cCS = imageView;
        this.cCT = cardView;
        this.cCU = frameLayout;
    }
}
