package com.iqoption.deposit.crypto.address;

import android.app.Application;
import android.content.Context;
import com.iqoption.deposit.o.b;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: DepositCryptoRequisitesViewModel.kt */
final class DepositCryptoRequisitesViewModel$warningColor$2 extends Lambda implements a<Integer> {
    final /* synthetic */ Application $app;

    DepositCryptoRequisitesViewModel$warningColor$2(Application application) {
        this.$app = application;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return Integer.valueOf(Lk());
    }

    public final int Lk() {
        return com.iqoption.core.ext.a.k((Context) this.$app, b.red);
    }
}
