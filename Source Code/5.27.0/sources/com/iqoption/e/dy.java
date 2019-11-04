package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;

/* compiled from: BuyNewDialogViewBinding */
public abstract class dy extends ViewDataBinding {
    @NonNull
    public final RobotoTextView bYJ;
    @NonNull
    public final TextView bYK;

    protected dy(Object obj, View view, int i, RobotoTextView robotoTextView, TextView textView) {
        super(obj, view, i);
        this.bYJ = robotoTextView;
        this.bYK = textView;
    }
}
