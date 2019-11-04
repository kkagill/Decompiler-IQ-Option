package com.iqoption.withdraw.fields.a;

import android.widget.EditText;
import com.iqoption.core.microservices.withdraw.response.h;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, bng = {"Lcom/iqoption/withdraw/fields/holder/PayoutFieldHolder;", "", "field", "Lcom/iqoption/core/microservices/withdraw/response/PayoutField;", "getField", "()Lcom/iqoption/core/microservices/withdraw/response/PayoutField;", "value", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "editText", "Landroid/widget/EditText;", "setError", "", "error", "setHint", "hint", "setPlaceholder", "placeholder", "withdraw_release"})
/* compiled from: PayoutFieldHolder.kt */
public interface b {
    EditText aqn();

    h bcy();

    String getValue();

    void hI(String str);

    void kn(String str);

    void setPlaceholder(String str);

    void setValue(String str);
}
