package com.iqoption.deposit.crypto.kyc;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: KycWarningFragment.kt */
final class KycWarningFragment$currency$2 extends Lambda implements a<String> {
    final /* synthetic */ a this$0;

    KycWarningFragment$currency$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: Ot */
    public final String invoke() {
        return com.iqoption.core.ext.a.s(this.this$0).getString("ARG_CURRENCY");
    }
}
