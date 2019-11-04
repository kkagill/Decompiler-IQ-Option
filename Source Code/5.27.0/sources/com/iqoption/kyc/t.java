package com.iqoption.kyc;

import android.text.Editable;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.util.ah;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/kyc/ValidateTextWatcher;", "Lcom/iqoption/core/util/TextWatcherAdapter;", "editText", "Landroid/widget/EditText;", "input", "Lcom/google/android/material/textfield/TextInputLayout;", "(Landroid/widget/EditText;Lcom/google/android/material/textfield/TextInputLayout;)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "kyc_release"})
/* compiled from: ValidateTextWatcher.kt */
public class t extends ah {
    private final EditText Pv;
    private final TextInputLayout dtj;

    public t(EditText editText, TextInputLayout textInputLayout) {
        kotlin.jvm.internal.i.f(editText, "editText");
        kotlin.jvm.internal.i.f(textInputLayout, "input");
        this.Pv = editText;
        this.dtj = textInputLayout;
    }

    @CallSuper
    public void afterTextChanged(Editable editable) {
        kotlin.jvm.internal.i.f(editable, "s");
        super.afterTextChanged(editable);
        this.Pv.setError((CharSequence) null);
        this.dtj.setErrorEnabled(false);
    }
}
