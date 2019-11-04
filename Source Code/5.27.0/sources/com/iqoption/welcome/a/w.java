package com.iqoption.welcome.a;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;

/* compiled from: FragmentWelcomeSlidesBinding */
public abstract class w extends ViewDataBinding {
    @NonNull
    public final ViewPager Ol;
    @NonNull
    public final TextView elo;
    @NonNull
    public final TextView elp;
    @NonNull
    public final Button elq;
    @NonNull
    public final LinearLayout elr;

    protected w(Object obj, View view, int i, TextView textView, TextView textView2, Button button, LinearLayout linearLayout, ViewPager viewPager) {
        super(obj, view, i);
        this.elo = textView;
        this.elp = textView2;
        this.elq = button;
        this.elr = linearLayout;
        this.Ol = viewPager;
    }
}
