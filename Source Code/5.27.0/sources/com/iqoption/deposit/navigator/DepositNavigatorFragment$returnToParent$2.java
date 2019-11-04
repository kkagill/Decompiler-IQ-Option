package com.iqoption.deposit.navigator;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: DepositNavigatorFragment.kt */
final class DepositNavigatorFragment$returnToParent$2 extends Lambda implements a<Boolean> {
    final /* synthetic */ b this$0;

    DepositNavigatorFragment$returnToParent$2(b bVar) {
        this.this$0 = bVar;
        super(0);
    }

    public final boolean invoke() {
        return com.iqoption.core.ext.a.s(this.this$0).getBoolean("ARG_RETURN_TO_PARENT");
    }
}
