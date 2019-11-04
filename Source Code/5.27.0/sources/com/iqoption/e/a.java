package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;

/* compiled from: AccountSecurityConfirmCodeExpiredFragmentBinding */
public abstract class a extends ViewDataBinding {
    @NonNull
    public final TextView bSq;
    @NonNull
    public final TextView bSr;
    @NonNull
    public final ConfirmButtonView bSs;
    @Bindable
    protected com.iqoption.fragment.account.security.phone.a bSt;

    public abstract void a(@Nullable com.iqoption.fragment.account.security.phone.a aVar);

    protected a(Object obj, View view, int i, TextView textView, TextView textView2, ConfirmButtonView confirmButtonView) {
        super(obj, view, i);
        this.bSq = textView;
        this.bSr = textView2;
        this.bSs = confirmButtonView;
    }
}
