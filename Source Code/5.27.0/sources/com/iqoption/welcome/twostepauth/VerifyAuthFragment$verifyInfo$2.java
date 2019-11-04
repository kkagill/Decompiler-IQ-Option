package com.iqoption.welcome.twostepauth;

import com.iqoption.core.manager.af;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/VerifyInfo;", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: VerifyAuthFragment.kt */
final class VerifyAuthFragment$verifyInfo$2 extends Lambda implements a<af> {
    final /* synthetic */ a this$0;

    VerifyAuthFragment$verifyInfo$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: aZN */
    public final af invoke() {
        return (af) com.iqoption.core.ext.a.s(this.this$0).getParcelable("ARG_VERIFY_INFO");
    }
}
