package com.iqoption.kyc.b;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentKycCountryBinding */
public abstract class c extends ViewDataBinding {
    @NonNull
    public final ContentLoadingProgressBar duA;
    @NonNull
    public final TextView duB;
    @NonNull
    public final CheckBox duw;
    @NonNull
    public final LinearLayout dux;
    @NonNull
    public final TextView duy;
    @NonNull
    public final RecyclerView duz;

    protected c(Object obj, View view, int i, CheckBox checkBox, LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView2) {
        super(obj, view, i);
        this.duw = checkBox;
        this.dux = linearLayout;
        this.duy = textView;
        this.duz = recyclerView;
        this.duA = contentLoadingProgressBar;
        this.duB = textView2;
    }
}
