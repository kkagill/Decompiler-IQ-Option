package com.iqoption.kyc;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, bng = {"dismissErrorOnChange", "", "editText", "Landroid/widget/EditText;", "input", "Lcom/google/android/material/textfield/TextInputLayout;", "kyc_release"})
/* compiled from: ValidateTextWatcher.kt */
public final class u {
    public static final void a(EditText editText, TextInputLayout textInputLayout) {
        kotlin.jvm.internal.i.f(editText, "editText");
        kotlin.jvm.internal.i.f(textInputLayout, "input");
        editText.addTextChangedListener(new t(editText, textInputLayout));
    }
}
