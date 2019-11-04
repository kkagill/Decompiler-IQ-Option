package com.iqoption.deposit.navigator;

import com.iqoption.deposit.l;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lcom/iqoption/deposit/InitSelectOption;", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: DepositNavigatorFragment.kt */
final class DepositNavigatorFragment$initSelection$2 extends Lambda implements a<l> {
    final /* synthetic */ b this$0;

    DepositNavigatorFragment$initSelection$2(b bVar) {
        this.this$0 = bVar;
        super(0);
    }

    /* renamed from: ata */
    public final l invoke() {
        return (l) com.iqoption.core.ext.a.s(this.this$0).getParcelable("ARG_INIT_SELECTION");
    }
}
