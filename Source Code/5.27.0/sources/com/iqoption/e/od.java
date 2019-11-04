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
import com.iqoption.fragment.n;

/* compiled from: FxExpirationFragmentBinding */
public abstract class od extends ViewDataBinding {
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
    public final RecyclerView ceq;
    @Bindable
    protected n ckX;

    public abstract void a(@Nullable n nVar);

    protected od(Object obj, View view, int i, SwitchCompat switchCompat, FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView, RecyclerView recyclerView, LinearLayout linearLayout, RecyclerView recyclerView2) {
        super(obj, view, i);
        this.cei = switchCompat;
        this.bYN = frameLayout;
        this.aoG = frameLayout2;
        this.cej = textView;
        this.cek = recyclerView;
        this.cel = linearLayout;
        this.ceq = recyclerView2;
    }
}
