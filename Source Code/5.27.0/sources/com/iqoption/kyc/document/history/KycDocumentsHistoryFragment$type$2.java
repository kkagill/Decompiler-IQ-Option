package com.iqoption.kyc.document.history;

import com.iqoption.core.microservices.kyc.response.VerificationType;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/kyc/response/VerificationType;", "invoke"})
/* compiled from: KycDocumentsHistoryFragment.kt */
final class KycDocumentsHistoryFragment$type$2 extends Lambda implements a<VerificationType> {
    final /* synthetic */ c this$0;

    KycDocumentsHistoryFragment$type$2(c cVar) {
        this.this$0 = cVar;
        super(0);
    }

    /* renamed from: aKY */
    public final VerificationType invoke() {
        Serializable serializable = com.iqoption.core.ext.a.s(this.this$0).getSerializable("ARG_TYPE");
        if (serializable != null) {
            return (VerificationType) serializable;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.kyc.response.VerificationType");
    }
}
