package com.iqoption.e;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.fragment.account.security.a.a;
import com.iqoption.view.text.SoftKeyboardEditText;

/* compiled from: AccountSecurityEmailConfirmFragmentBinding */
public abstract class m extends ViewDataBinding {
    @NonNull
    public final ConfirmButtonView bSQ;
    @NonNull
    public final SoftKeyboardEditText bSR;
    @Bindable
    protected a bSS;

    public abstract void a(@Nullable a aVar);

    protected m(Object obj, View view, int i, ConfirmButtonView confirmButtonView, SoftKeyboardEditText softKeyboardEditText) {
        super(obj, view, i);
        this.bSQ = confirmButtonView;
        this.bSR = softKeyboardEditText;
    }
}
