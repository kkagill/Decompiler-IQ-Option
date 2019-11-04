package com.iqoption.e;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.fragment.account.security.phone.c;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: AccountSecurityConfirmPhoneFragmentBinding */
public abstract class g extends ViewDataBinding {
    @NonNull
    public final ConfirmButtonView bSI;
    @NonNull
    public final FormattedTextView bSJ;
    @Bindable
    protected c bSK;
    @NonNull
    public final ConfirmButtonView bSw;

    public abstract void a(@Nullable c cVar);

    protected g(Object obj, View view, int i, ConfirmButtonView confirmButtonView, ConfirmButtonView confirmButtonView2, FormattedTextView formattedTextView) {
        super(obj, view, i);
        this.bSw = confirmButtonView;
        this.bSI = confirmButtonView2;
        this.bSJ = formattedTextView;
    }
}
