package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.fragment.aa;

/* compiled from: DialogOvernightFeeInfoBinding */
public abstract class gm extends ViewDataBinding {
    @NonNull
    public final LinearLayout aRl;
    @NonNull
    public final FrameLayout caT;
    @NonNull
    public final RecyclerView ccn;
    @NonNull
    public final TextView cco;
    @Bindable
    protected aa ccp;

    public abstract void a(@Nullable aa aaVar);

    protected gm(Object obj, View view, int i, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, FrameLayout frameLayout) {
        super(obj, view, i);
        this.aRl = linearLayout;
        this.ccn = recyclerView;
        this.cco = textView;
        this.caT = frameLayout;
    }
}
