package com.iqoption.welcome.changepassword;

import com.iqoption.core.manager.af;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lcom/iqoption/core/manager/VerifyInfo;", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: ChangePasswordFragment.kt */
final class ChangePasswordFragment$verifyInfo$2 extends Lambda implements a<af> {
    final /* synthetic */ b this$0;

    ChangePasswordFragment$verifyInfo$2(b bVar) {
        this.this$0 = bVar;
        super(0);
    }

    /* renamed from: aZN */
    public final af invoke() {
        return (af) com.iqoption.core.ext.a.s(this.this$0).getParcelable("ARG_VERIFY_INFO");
    }
}
