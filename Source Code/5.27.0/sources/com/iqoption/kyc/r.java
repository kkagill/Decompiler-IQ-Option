package com.iqoption.kyc;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.i;
import kotlin.text.Regex;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0010"}, bng = {"Lcom/iqoption/kyc/TextFieldUtils;", "", "()V", "isValidByRegex", "", "value", "", "regexp", "required", "setTextWithoutAnimation", "", "input", "Lcom/google/android/material/textfield/TextInputLayout;", "editText", "Landroid/widget/EditText;", "text", "kyc_release"})
/* compiled from: TextFieldUtils.kt */
public final class r {
    public static final r dth = new r();

    private r() {
    }

    public final void a(TextInputLayout textInputLayout, EditText editText, String str) {
        kotlin.jvm.internal.i.f(textInputLayout, "input");
        kotlin.jvm.internal.i.f(editText, "editText");
        textInputLayout.setHintAnimationEnabled(false);
        editText.setText(str);
        editText.setSelection(editText.getText().length());
        textInputLayout.setHintAnimationEnabled(true);
    }

    public final boolean g(String str, String str2, boolean z) {
        CharSequence charSequence = str;
        boolean z2 = false;
        Object obj = (charSequence == null || u.Y(charSequence)) ? 1 : null;
        if (obj != null) {
            return false;
        }
        charSequence = str2;
        if (charSequence == null || u.Y(charSequence)) {
            z2 = true;
        }
        if (z2) {
            return z ^ 1;
        }
        try {
            return new Regex(str2).L(str);
        } catch (Exception unused) {
            return z ^ 1;
        }
    }
}
