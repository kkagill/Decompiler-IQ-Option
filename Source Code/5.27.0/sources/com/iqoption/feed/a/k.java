package com.iqoption.feed.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: MacroFeedOptionsBinding */
public abstract class k extends ViewDataBinding {
    @NonNull
    public final TextView cPN;
    @NonNull
    public final TextView cPO;
    @NonNull
    public final LinearLayout cPP;
    @NonNull
    public final TextView cPQ;
    @NonNull
    public final FrameLayout cQh;

    protected k(Object obj, View view, int i, TextView textView, TextView textView2, LinearLayout linearLayout, TextView textView3, FrameLayout frameLayout) {
        super(obj, view, i);
        this.cPN = textView;
        this.cPO = textView2;
        this.cPP = linearLayout;
        this.cPQ = textView3;
        this.cQh = frameLayout;
    }
}
