package com.iqoption.deposit.b;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutCryptoRatePopupBinding */
public abstract class at extends ViewDataBinding {
    @NonNull
    public final CardView cDk;
    @NonNull
    public final TextView cDl;

    protected at(Object obj, View view, int i, CardView cardView, TextView textView) {
        super(obj, view, i);
        this.cDk = cardView;
        this.cDl = textView;
    }
}
