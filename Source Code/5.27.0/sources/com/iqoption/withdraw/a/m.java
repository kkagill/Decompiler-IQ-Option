package com.iqoption.withdraw.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView2;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentWithdrawVerifyPageBinding */
public abstract class m extends ViewDataBinding {
    @NonNull
    public final CardView2 eqn;
    @NonNull
    public final ak eqo;
    @NonNull
    public final ak eqp;
    @NonNull
    public final ImageView eqq;
    @NonNull
    public final TextView eqr;
    @NonNull
    public final TextView eqs;

    protected m(Object obj, View view, int i, CardView2 cardView2, ak akVar, ak akVar2, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.eqn = cardView2;
        this.eqo = akVar;
        setContainedBinding(this.eqo);
        this.eqp = akVar2;
        setContainedBinding(this.eqp);
        this.eqq = imageView;
        this.eqr = textView;
        this.eqs = textView2;
    }
}
