package com.iqoption.j.a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentOperationHistoryBinding */
public abstract class a extends ViewDataBinding {
    @NonNull
    public final LinearLayout dJR;
    @NonNull
    public final TextView dJS;
    @NonNull
    public final ScrollView dJT;
    @NonNull
    public final LinearLayout dJU;
    @NonNull
    public final TextView dJV;
    @NonNull
    public final i dJW;
    @NonNull
    public final LinearLayout dJX;
    @NonNull
    public final TextView dJY;

    protected a(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, ScrollView scrollView, LinearLayout linearLayout2, TextView textView2, i iVar, LinearLayout linearLayout3, TextView textView3) {
        super(obj, view, i);
        this.dJR = linearLayout;
        this.dJS = textView;
        this.dJT = scrollView;
        this.dJU = linearLayout2;
        this.dJV = textView2;
        this.dJW = iVar;
        setContainedBinding(this.dJW);
        this.dJX = linearLayout3;
        this.dJY = textView3;
    }
}
