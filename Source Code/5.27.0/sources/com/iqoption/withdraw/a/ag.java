package com.iqoption.withdraw.a;

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
import com.iqoption.withdraw.d.e;

/* compiled from: WithdrawLimitReasonDialogBinding */
public abstract class ag extends ViewDataBinding {
    @NonNull
    public final FrameLayout aHP;
    @NonNull
    public final TextView aQM;
    @NonNull
    public final MaxSizeCardViewLayout aQN;
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView ani;

    protected ag(Object obj, View view, int i, TextView textView, MaxSizeCardViewLayout maxSizeCardViewLayout, FrameLayout frameLayout, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.aQM = textView;
        this.aQN = maxSizeCardViewLayout;
        this.aHP = frameLayout;
        this.ani = textView2;
        this.alH = textView3;
    }

    @NonNull
    public static ag ag(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return ag(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ag ag(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ag) ViewDataBinding.inflateInternal(layoutInflater, e.withdraw_limit_reason_dialog, viewGroup, z, obj);
    }
}
