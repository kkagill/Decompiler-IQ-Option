package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.fragment.account.security.sms.a;

/* compiled from: AccountSecurityConfirmPhone2stepAuthFragmentBinding */
public abstract class e extends ViewDataBinding {
    @NonNull
    public final ConfirmButtonView bSF;
    @Bindable
    protected a bSG;
    @NonNull
    public final TextView bSq;

    public abstract void a(@Nullable a aVar);

    protected e(Object obj, View view, int i, ConfirmButtonView confirmButtonView, TextView textView) {
        super(obj, view, i);
        this.bSF = confirmButtonView;
        this.bSq = textView;
    }
}
