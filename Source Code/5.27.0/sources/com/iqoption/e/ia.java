package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.iqoption.fragment.j;

/* compiled from: DigitalExpirationFragmentBinding */
public abstract class ia extends ViewDataBinding {
    @NonNull
    public final FrameLayout aoG;
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final SwitchCompat cei;
    @NonNull
    public final TextView cej;
    @NonNull
    public final RecyclerView cek;
    @NonNull
    public final LinearLayout cel;
    @NonNull
    public final TextView cem;
    @NonNull
    public final TextView cen;
    @NonNull
    public final TabLayout ceo;
    @NonNull
    public final TextView cep;
    @NonNull
    public final RecyclerView ceq;
    @NonNull
    public final TextView cer;
    @Bindable
    protected j ces;

    public abstract void a(@Nullable j jVar);

    protected ia(Object obj, View view, int i, SwitchCompat switchCompat, FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView2, TextView textView3, TabLayout tabLayout, TextView textView4, RecyclerView recyclerView2, TextView textView5) {
        super(obj, view, i);
        this.cei = switchCompat;
        this.bYN = frameLayout;
        this.aoG = frameLayout2;
        this.cej = textView;
        this.cek = recyclerView;
        this.cel = linearLayout;
        this.cem = textView2;
        this.cen = textView3;
        this.ceo = tabLayout;
        this.cep = textView4;
        this.ceq = recyclerView2;
        this.cer = textView5;
    }
}
