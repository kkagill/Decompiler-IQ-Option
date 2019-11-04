package com.iqoption.core.ui.widget;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.material.a.b;
import com.google.android.material.textfield.c;
import java.lang.reflect.Field;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\f"}, bng = {"Lcom/iqoption/core/ui/widget/IQTextInputEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getHint", "", "getSuperHintHack", "core_release"})
/* compiled from: IQTextInputEditText.kt */
public final class IQTextInputEditText extends c {
    public IQTextInputEditText(Context context) {
        this(context, null, 0, 6, null);
    }

    public IQTextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ IQTextInputEditText(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = (AttributeSet) null;
        }
        if ((i2 & 4) != 0) {
            i = b.editTextStyle;
        }
        this(context, attributeSet, i);
    }

    public IQTextInputEditText(Context context, AttributeSet attributeSet, int i) {
        kotlin.jvm.internal.i.f(context, "context");
        super(context, attributeSet, i);
    }

    public CharSequence getHint() {
        String str = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(str, "Build.MANUFACTURER");
        if (str != null) {
            str = str.toUpperCase();
            kotlin.jvm.internal.i.e(str, "(this as java.lang.String).toUpperCase()");
            if (!v.b((CharSequence) str, (CharSequence) "MEIZU", false, 2, null) || VERSION.SDK_INT >= 28) {
                return super.getHint();
            }
            try {
                return getSuperHintHack();
            } catch (Exception unused) {
                return super.getHint();
            }
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    private final CharSequence getSuperHintHack() {
        Field declaredField = TextView.class.getDeclaredField("mHint");
        kotlin.jvm.internal.i.e(declaredField, "hintField");
        declaredField.setAccessible(true);
        return (CharSequence) declaredField.get(this);
    }
}
