package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.account.security.sms.b;
import com.iqoption.view.ProgressSwitchView;

/* compiled from: AccountSecurityTurnOn2stepAuthFragmentBinding */
public abstract class s extends ViewDataBinding {
    @NonNull
    public final TextView bTc;
    @NonNull
    public final ProgressSwitchView bTd;
    @NonNull
    public final TextView bTe;
    @NonNull
    public final TextView bTf;
    @Bindable
    protected b bTg;

    public abstract void a(@Nullable b bVar);

    protected s(Object obj, View view, int i, TextView textView, ProgressSwitchView progressSwitchView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.bTc = textView;
        this.bTd = progressSwitchView;
        this.bTe = textView2;
        this.bTf = textView3;
    }
}
