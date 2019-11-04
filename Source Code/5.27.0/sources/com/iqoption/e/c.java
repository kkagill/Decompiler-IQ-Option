package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.fragment.account.security.phone.b;
import com.iqoption.view.text.SoftKeyboardEditText;
import com.iqoption.widget.CountDownProgressBar;

/* compiled from: AccountSecurityConfirmCodeFragmentBinding */
public abstract class c extends ViewDataBinding {
    @NonNull
    public final ConfirmButtonView bSA;
    @Bindable
    protected b bSB;
    @NonNull
    public final TextView bSq;
    @NonNull
    public final ConfirmButtonView bSv;
    @NonNull
    public final ConfirmButtonView bSw;
    @NonNull
    public final SoftKeyboardEditText bSx;
    @NonNull
    public final TextView bSy;
    @NonNull
    public final CountDownProgressBar bSz;

    public abstract void a(@Nullable b bVar);

    protected c(Object obj, View view, int i, ConfirmButtonView confirmButtonView, ConfirmButtonView confirmButtonView2, SoftKeyboardEditText softKeyboardEditText, TextView textView, TextView textView2, CountDownProgressBar countDownProgressBar, ConfirmButtonView confirmButtonView3) {
        super(obj, view, i);
        this.bSv = confirmButtonView;
        this.bSw = confirmButtonView2;
        this.bSx = softKeyboardEditText;
        this.bSy = textView;
        this.bSq = textView2;
        this.bSz = countDownProgressBar;
        this.bSA = confirmButtonView3;
    }
}
