package com.iqoption.deposit.light;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import com.iqoption.core.ext.a;
import com.iqoption.deposit.o.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, bng = {"setErrorCustom", "", "Landroid/widget/EditText;", "message", "", "deposit_release"})
/* compiled from: LightFieldExtensions.kt */
public final class b {
    public static final void b(EditText editText, String str) {
        int i;
        Context context;
        kotlin.jvm.internal.i.f(editText, "$this$setErrorCustom");
        String str2 = "context";
        if (str == null) {
            editText.setError((CharSequence) null);
            i = com.iqoption.deposit.o.b.black;
        } else {
            editText.requestFocus();
            context = editText.getContext();
            kotlin.jvm.internal.i.e(context, str2);
            Drawable n = a.n(context, d.ic_error_red);
            n.setBounds(0, 0, n.getIntrinsicWidth(), n.getIntrinsicHeight());
            editText.setError(str, n);
            i = com.iqoption.deposit.o.b.deposit_red;
        }
        context = editText.getContext();
        kotlin.jvm.internal.i.e(context, str2);
        editText.setTextColor(a.k(context, i));
    }
}
