package com.iqoption.kyc.profile.steps.gdpr;

import com.iqoption.kyc.o.f;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/util/link/Link;", "invoke"})
/* compiled from: KycGdprFragment.kt */
final class KycGdprFragment$gdprLink$2 extends Lambda implements a<com.iqoption.core.util.b.a> {
    final /* synthetic */ a this$0;

    KycGdprFragment$gdprLink$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: aLh */
    public final com.iqoption.core.util.b.a invoke() {
        String string = this.this$0.getString(f.privacy_policy);
        kotlin.jvm.internal.i.e(string, "getString(R.string.privacy_policy)");
        return new com.iqoption.core.util.b.a(string, com.iqoption.core.util.b.f.br(com.iqoption.core.ext.a.q(this.this$0)));
    }
}
