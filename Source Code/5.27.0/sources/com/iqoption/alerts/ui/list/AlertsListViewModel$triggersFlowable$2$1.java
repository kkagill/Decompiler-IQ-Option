package com.iqoption.alerts.ui.list;

import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger;", "list", "", "invoke"})
/* compiled from: AlertsListViewModel.kt */
final class AlertsListViewModel$triggersFlowable$2$1 extends Lambda implements b<List<? extends com.iqoption.core.microservices.useralerts.response.b>, List<com.iqoption.core.microservices.useralerts.response.b>> {
    final /* synthetic */ com.iqoption.core.microservices.useralerts.response.b $new;

    AlertsListViewModel$triggersFlowable$2$1(com.iqoption.core.microservices.useralerts.response.b bVar) {
        this.$new = bVar;
        super(1);
    }

    /* renamed from: t */
    public final List<com.iqoption.core.microservices.useralerts.response.b> invoke(List<com.iqoption.core.microservices.useralerts.response.b> list) {
        kotlin.jvm.internal.i.f(list, "list");
        List I = u.I(list);
        com.iqoption.core.microservices.useralerts.response.b bVar = this.$new;
        kotlin.jvm.internal.i.e(bVar, "new");
        I.add(bVar);
        if (I.size() > 50) {
            I.remove(0);
        }
        return I;
    }
}
