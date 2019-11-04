package com.iqoption.dialogs.b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.MaxSizeCardViewLayout;
import com.iqoption.dialogs.d.e;

/* compiled from: FragmentDarkDialogBinding */
public abstract class u extends ViewDataBinding {
    @NonNull
    public final FrameLayout aHP;
    @NonNull
    public final MaxSizeCardViewLayout aQN;
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView ani;
    @NonNull
    public final TextView cMD;
    @NonNull
    public final TextView cME;

    protected u(Object obj, View view, int i, TextView textView, TextView textView2, MaxSizeCardViewLayout maxSizeCardViewLayout, FrameLayout frameLayout, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cMD = textView;
        this.cME = textView2;
        this.aQN = maxSizeCardViewLayout;
        this.aHP = frameLayout;
        this.ani = textView3;
        this.alH = textView4;
    }

    @NonNull
    public static u ae(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return ae(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static u ae(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (u) ViewDataBinding.inflateInternal(layoutInflater, e.fragment_dark_dialog, viewGroup, z, obj);
    }
}
