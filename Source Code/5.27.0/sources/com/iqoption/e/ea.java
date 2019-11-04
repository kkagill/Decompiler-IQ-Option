package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.fragment.d;

/* compiled from: CfdExpirationFragmentBinding */
public abstract class ea extends ViewDataBinding {
    @NonNull
    public final FrameLayout aoG;
    @NonNull
    public final RecyclerView bYM;
    @NonNull
    public final FrameLayout bYN;
    @Bindable
    protected d bYO;

    public abstract void a(@Nullable d dVar);

    protected ea(Object obj, View view, int i, RecyclerView recyclerView, FrameLayout frameLayout, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.bYM = recyclerView;
        this.bYN = frameLayout;
        this.aoG = frameLayout2;
    }
}
