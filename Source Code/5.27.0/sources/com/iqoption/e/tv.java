package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;

/* compiled from: OvernightFeeItemBinding */
public abstract class tv extends ViewDataBinding {
    @NonNull
    public final TextView aoh;
    @NonNull
    public final RobotoTextView bYx;
    @NonNull
    public final TextView ceE;
    @NonNull
    public final TextView ceF;

    protected tv(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, RobotoTextView robotoTextView) {
        super(obj, view, i);
        this.aoh = textView;
        this.ceE = textView2;
        this.ceF = textView3;
        this.bYx = robotoTextView;
    }
}
