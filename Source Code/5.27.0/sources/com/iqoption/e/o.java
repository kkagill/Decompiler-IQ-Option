package com.iqoption.e;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.fragment.account.security.phone.e;
import com.iqoption.view.text.SoftKeyboardEditText;

/* compiled from: AccountSecurityPhoneNumberFragmentBinding */
public abstract class o extends ViewDataBinding {
    @NonNull
    public final SoftKeyboardEditText bSU;
    @NonNull
    public final ConfirmButtonView bSV;
    @Bindable
    protected e bSW;

    public abstract void a(@Nullable e eVar);

    protected o(Object obj, View view, int i, SoftKeyboardEditText softKeyboardEditText, ConfirmButtonView confirmButtonView) {
        super(obj, view, i);
        this.bSU = softKeyboardEditText;
        this.bSV = confirmButtonView;
    }
}
