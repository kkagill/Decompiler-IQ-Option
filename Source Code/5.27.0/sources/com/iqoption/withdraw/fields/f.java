package com.iqoption.withdraw.fields;

import com.iqoption.core.microservices.withdraw.response.h;
import java.util.regex.Pattern;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"TEXT_MAX_LENGTH", "", "isAmountField", "", "field", "Lcom/iqoption/core/microservices/withdraw/response/PayoutField;", "isFieldRequired", "isValidByRegexp", "value", "", "withdraw_release"})
/* compiled from: WithdrawFieldsFragment.kt */
public final class f {
    private static final boolean a(h hVar) {
        return kotlin.jvm.internal.i.y(hVar.getName(), "amount");
    }

    private static final boolean a(h hVar, String str) {
        CharSequence charSequence = str;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        obj = (obj == null || b(hVar)) ? null : 1;
        if (obj != null || Pattern.matches(hVar.afo(), charSequence)) {
            return true;
        }
        return false;
    }

    private static final boolean b(h hVar) {
        return hVar.ajL() || a(hVar);
    }
}
