package com.iqoption.withdraw.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.PlaceholderedField;

/* compiled from: ItemPayoutRegularFieldBinding */
public abstract class q extends ViewDataBinding {
    @NonNull
    public final TextView eqA;
    @NonNull
    public final PlaceholderedField eqy;
    @NonNull
    public final FrameLayout eqz;

    protected q(Object obj, View view, int i, PlaceholderedField placeholderedField, FrameLayout frameLayout, TextView textView) {
        super(obj, view, i);
        this.eqy = placeholderedField;
        this.eqz = frameLayout;
        this.eqA = textView;
    }
}
