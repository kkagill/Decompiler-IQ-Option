package com.iqoption.core.e;

import android.text.Editable;
import com.iqoption.core.util.ah;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/phone/AddPlusSignTextWatcher;", "Lcom/iqoption/core/util/TextWatcherAdapter;", "()V", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "core_release"})
/* compiled from: AddPlusSignTextWatcher.kt */
public final class a extends ah {
    public void afterTextChanged(Editable editable) {
        kotlin.jvm.internal.i.f(editable, "editable");
        if (editable.length() == 1 && editable.charAt(0) != '+' && Character.isDigit(editable.charAt(0))) {
            editable.insert(0, "+");
        }
    }
}
