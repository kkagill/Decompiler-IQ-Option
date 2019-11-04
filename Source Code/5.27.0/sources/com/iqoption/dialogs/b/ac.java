package com.iqoption.dialogs.b;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutInfoPopupBinding */
public abstract class ac extends ViewDataBinding {
    @NonNull
    public final CardView cMG;
    @NonNull
    public final TextView cMH;

    protected ac(Object obj, View view, int i, CardView cardView, TextView textView) {
        super(obj, view, i);
        this.cMG = cardView;
        this.cMH = textView;
    }
}
