package com.iqoption.deposit.light.a;

import android.text.Editable;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import com.iqoption.core.util.ah;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/deposit/light/card/ValidateTextWatcher;", "Lcom/iqoption/core/util/TextWatcherAdapter;", "editText", "Landroid/widget/EditText;", "(Landroid/widget/EditText;)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "deposit_release"})
/* compiled from: CardPaymentLightFragment.kt */
public class b extends ah {
    private final EditText Pv;

    public b(EditText editText) {
        kotlin.jvm.internal.i.f(editText, "editText");
        this.Pv = editText;
    }

    @CallSuper
    public void afterTextChanged(Editable editable) {
        kotlin.jvm.internal.i.f(editable, "s");
        super.afterTextChanged(editable);
        com.iqoption.deposit.light.b.b(this.Pv, null);
    }
}
