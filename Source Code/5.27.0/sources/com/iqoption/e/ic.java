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
import com.iqoption.fragment.l;
import com.iqoption.view.RobotoTextView;

/* compiled from: ExpirationFragmentBinding */
public abstract class ic extends ViewDataBinding {
    @NonNull
    public final FrameLayout aoG;
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final TextView ceA;
    @NonNull
    public final RobotoTextView ceB;
    @Bindable
    protected l ceC;
    @NonNull
    public final LinearLayout ceu;
    @NonNull
    public final RecyclerView cev;
    @NonNull
    public final TextView cew;
    @NonNull
    public final RobotoTextView cex;
    @NonNull
    public final LinearLayout cey;
    @NonNull
    public final RecyclerView cez;

    public abstract void a(@Nullable l lVar);

    protected ic(Object obj, View view, int i, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, RobotoTextView robotoTextView, FrameLayout frameLayout, FrameLayout frameLayout2, LinearLayout linearLayout2, RecyclerView recyclerView2, TextView textView2, RobotoTextView robotoTextView2) {
        super(obj, view, i);
        this.ceu = linearLayout;
        this.cev = recyclerView;
        this.cew = textView;
        this.cex = robotoTextView;
        this.bYN = frameLayout;
        this.aoG = frameLayout2;
        this.cey = linearLayout2;
        this.cez = recyclerView2;
        this.ceA = textView2;
        this.ceB = robotoTextView2;
    }
}
