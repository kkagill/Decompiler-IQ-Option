package com.iqoption.withdraw.fields;

import com.iqoption.core.util.j;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Ljava/text/DecimalFormat;", "invoke"})
/* compiled from: WithdrawFieldsFragment.kt */
final class WithdrawFieldsFragment$decimalFormat$2 extends Lambda implements a<DecimalFormat> {
    public static final WithdrawFieldsFragment$decimalFormat$2 erE = new WithdrawFieldsFragment$decimalFormat$2();

    WithdrawFieldsFragment$decimalFormat$2() {
        super(0);
    }

    /* renamed from: bct */
    public final DecimalFormat invoke() {
        DecimalFormat I = j.I(j.bQB.ank(), 2);
        I.setRoundingMode(RoundingMode.DOWN);
        return I;
    }
}
