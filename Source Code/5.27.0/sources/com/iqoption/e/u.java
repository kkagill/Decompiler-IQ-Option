package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.account.security.touchId.c;
import com.iqoption.view.ProgressSwitchView;

/* compiled from: AccountSecurityTurnOnTouchIdFragmentBinding */
public abstract class u extends ViewDataBinding {
    @NonNull
    public final ProgressSwitchView bTd;
    @NonNull
    public final TextView bTe;
    @NonNull
    public final TextView bTh;
    @Bindable
    protected c bTi;

    public abstract void a(@Nullable c cVar);

    protected u(Object obj, View view, int i, TextView textView, ProgressSwitchView progressSwitchView, TextView textView2) {
        super(obj, view, i);
        this.bTh = textView;
        this.bTd = progressSwitchView;
        this.bTe = textView2;
    }
}
