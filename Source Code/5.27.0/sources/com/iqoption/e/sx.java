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
import com.iqoption.fragment.v;

/* compiled from: MultiExpirationFragmentBinding */
public abstract class sx extends ViewDataBinding {
    @NonNull
    public final LinearLayout aRl;
    @NonNull
    public final FrameLayout aoG;
    @NonNull
    public final TextView cej;
    @NonNull
    public final RecyclerView cek;
    @Bindable
    protected v cou;

    public abstract void a(@Nullable v vVar);

    protected sx(Object obj, View view, int i, LinearLayout linearLayout, FrameLayout frameLayout, TextView textView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.aRl = linearLayout;
        this.aoG = frameLayout;
        this.cej = textView;
        this.cek = recyclerView;
    }
}
