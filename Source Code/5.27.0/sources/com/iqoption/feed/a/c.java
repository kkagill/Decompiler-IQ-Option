package com.iqoption.feed.a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FeedOptionsBinding */
public abstract class c extends ViewDataBinding {
    @NonNull
    public final TextView cPN;
    @NonNull
    public final TextView cPO;
    @NonNull
    public final LinearLayout cPP;
    @NonNull
    public final TextView cPQ;

    protected c(Object obj, View view, int i, TextView textView, TextView textView2, LinearLayout linearLayout, TextView textView3) {
        super(obj, view, i);
        this.cPN = textView;
        this.cPO = textView2;
        this.cPP = linearLayout;
        this.cPQ = textView3;
    }
}
