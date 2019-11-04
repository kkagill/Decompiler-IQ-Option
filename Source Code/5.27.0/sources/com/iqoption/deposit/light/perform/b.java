package com.iqoption.deposit.light.perform;

import android.text.Editable;
import com.iqoption.core.util.ah;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/deposit/light/perform/AmountWatcher;", "Lcom/iqoption/core/util/TextWatcherAdapter;", "()V", "allowCycledUpdate", "", "getAllowCycledUpdate", "()Z", "setAllowCycledUpdate", "(Z)V", "prevText", "", "afterTextChanged", "", "text", "Landroid/text/Editable;", "cycledUpdate", "onTextChanged", "deposit_release"})
/* compiled from: DepositPerformLightFragment.kt */
abstract class b extends ah {
    private boolean cFA = true;
    private String cFz;

    public abstract void a(Editable editable);

    public abstract void b(Editable editable);

    public final void cP(boolean z) {
        this.cFA = z;
    }

    public void afterTextChanged(Editable editable) {
        kotlin.jvm.internal.i.f(editable, "text");
        super.afterTextChanged(editable);
        String obj = editable.toString();
        if (!kotlin.jvm.internal.i.y(this.cFz, obj)) {
            this.cFz = obj;
            a(editable);
            if (this.cFA) {
                b(editable);
            }
        }
    }
}
