package com.iqoption.withdraw.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView2;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.withdraw.d.e;

/* compiled from: WithdrawMethodCardLayoutBinding */
public abstract class ai extends ViewDataBinding {
    @NonNull
    public final CardView2 eqn;
    @NonNull
    public final ImageView ere;
    @NonNull
    public final TextView erf;
    @NonNull
    public final TextView erg;

    protected ai(Object obj, View view, int i, CardView2 cardView2, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.eqn = cardView2;
        this.ere = imageView;
        this.erf = textView;
        this.erg = textView2;
    }

    @NonNull
    public static ai ah(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return ah(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ai ah(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ai) ViewDataBinding.inflateInternal(layoutInflater, e.withdraw_method_card_layout, viewGroup, z, obj);
    }
}
