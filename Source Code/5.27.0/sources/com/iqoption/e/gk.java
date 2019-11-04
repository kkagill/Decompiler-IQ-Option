package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.z;

/* compiled from: DialogOtnRewardInfoBinding */
public abstract class gk extends ViewDataBinding {
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final FrameLayout caT;
    @NonNull
    public final TextView caU;
    @Bindable
    protected z ccl;

    public abstract void a(@Nullable z zVar);

    protected gk(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView) {
        super(obj, view, i);
        this.bYN = frameLayout;
        this.caT = frameLayout2;
        this.caU = textView;
    }
}
