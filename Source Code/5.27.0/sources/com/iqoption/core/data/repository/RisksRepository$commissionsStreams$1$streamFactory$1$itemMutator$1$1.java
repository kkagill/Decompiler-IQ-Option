package com.iqoption.core.data.repository;

import com.iqoption.core.microservices.risks.response.a.a;
import com.iqoption.core.microservices.risks.response.a.c;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/risks/response/commission/CommissionsResult;", "result", "invoke"})
/* compiled from: RisksRepository.kt */
final class RisksRepository$commissionsStreams$1$streamFactory$1$itemMutator$1$1 extends Lambda implements b<c, c> {
    final /* synthetic */ com.iqoption.core.microservices.risks.response.a.b $update;

    RisksRepository$commissionsStreams$1$streamFactory$1$itemMutator$1$1(com.iqoption.core.microservices.risks.response.a.b bVar) {
        this.$update = bVar;
        super(1);
    }

    /* renamed from: b */
    public final c invoke(c cVar) {
        List i;
        kotlin.jvm.internal.i.f(cVar, "result");
        Object ahe = this.$update.ahe();
        int i2 = 0;
        for (a activeId : cVar.agZ()) {
            if ((activeId.getActiveId() == this.$update.getActiveId() ? 1 : null) != null) {
                break;
            }
            i2++;
        }
        i2 = -1;
        if (i2 == -1) {
            i = u.i((Collection) cVar.agZ(), ahe);
        } else {
            i = com.iqoption.core.ext.c.a(cVar.agZ(), i2, ahe);
        }
        return c.a(cVar, null, 0, i, 3, null);
    }
}
