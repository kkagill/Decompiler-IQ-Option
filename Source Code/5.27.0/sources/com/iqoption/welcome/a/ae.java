package com.iqoption.welcome.a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutWelcomeSocialBinding */
public abstract class ae extends ViewDataBinding {
    @NonNull
    public final View els;
    @NonNull
    public final View elt;
    @NonNull
    public final LinearLayout elu;
    @NonNull
    public final TextView elv;

    protected ae(Object obj, View view, int i, View view2, View view3, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.els = view2;
        this.elt = view3;
        this.elu = linearLayout;
        this.elv = textView;
    }
}
