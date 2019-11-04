package com.iqoption.deposit.c.b;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.e;
import com.iqoption.deposit.o.b;
import com.iqoption.deposit.o.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, bng = {"getDescription", "", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "context", "Landroid/content/Context;", "short", "", "withSpan", "deposit_release"})
/* compiled from: MethodAdapterItem.kt */
public final class c {
    public static /* synthetic */ CharSequence a(a aVar, Context context, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        return a(aVar, context, z, z2);
    }

    public static final CharSequence a(a aVar, Context context, boolean z, boolean z2) {
        kotlin.jvm.internal.i.f(aVar, "$this$getDescription");
        kotlin.jvm.internal.i.f(context, "context");
        if (com.iqoption.core.microservices.billing.response.deposit.c.a(aVar)) {
            String name = aVar.getName();
            if (z) {
                return name;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(g.new_credit_card_n1, new Object[]{name}));
            if (z2) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(com.iqoption.core.ext.a.k(context, b.grey_blue_70)), spannableStringBuilder.length() - name.length(), spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        } else if (aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) {
            return com.iqoption.core.util.c.bQl.hn(((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.b) aVar).getCardNumber());
        } else {
            if (aVar instanceof com.iqoption.core.microservices.billing.response.crypto.a) {
                return aVar.getName();
            }
            if (aVar instanceof e) {
                return com.iqoption.core.util.c.bQl.hn(((e) aVar).getCardNumber());
            }
            if (aVar instanceof d) {
                return aVar.getName();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected case: ");
            stringBuilder.append(aVar);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
