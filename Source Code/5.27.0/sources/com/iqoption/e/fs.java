package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.g;

/* compiled from: DialogCommisionInfoBinding */
public abstract class fs extends ViewDataBinding {
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final FrameLayout caT;
    @NonNull
    public final TextView caU;
    @Bindable
    protected g caV;

    public abstract void a(@Nullable g gVar);

    protected fs(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView) {
        super(obj, view, i);
        this.bYN = frameLayout;
        this.caT = frameLayout2;
        this.caU = textView;
    }
}
