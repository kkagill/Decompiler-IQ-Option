package com.iqoption.deposit.light.perform;

import java.util.ArrayList;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/iqoption/core/features/limit/CurrencyValue;", "invoke"})
/* compiled from: DepositPerformLightFragment.kt */
final class DepositPerformLightFragment$defaultPreset$2 extends Lambda implements a<ArrayList<com.iqoption.core.features.c.a>> {
    final /* synthetic */ c this$0;

    DepositPerformLightFragment$defaultPreset$2(c cVar) {
        this.this$0 = cVar;
        super(0);
    }

    /* renamed from: asK */
    public final ArrayList<com.iqoption.core.features.c.a> invoke() {
        return com.iqoption.core.ext.a.s(this.this$0).getParcelableArrayList("ARG_DEFAULT_PRESET");
    }
}
