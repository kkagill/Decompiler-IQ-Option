package com.iqoption.alerts.data;

import com.iqoption.core.ext.c;
import com.iqoption.core.microservices.useralerts.response.AssetAlertChanged;
import com.iqoption.core.microservices.useralerts.response.a;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "list", "invoke"})
/* compiled from: AlertsRepository.kt */
final class AlertsRepository$alertsStreamSupplier$2$stream$2$1 extends Lambda implements b<List<? extends a>, List<? extends a>> {
    final /* synthetic */ AssetAlertChanged $event;

    AlertsRepository$alertsStreamSupplier$2$stream$2$1(AssetAlertChanged assetAlertChanged) {
        this.$event = assetAlertChanged;
        super(1);
    }

    /* renamed from: t */
    public final List<a> invoke(List<? extends a> list) {
        kotlin.jvm.internal.i.f(list, "list");
        int i = b.aob[this.$event.aje().ordinal()];
        String str = "event";
        if (i == 1) {
            Collection collection = list;
            AssetAlertChanged assetAlertChanged = this.$event;
            kotlin.jvm.internal.i.e(assetAlertChanged, str);
            return u.i(collection, (Object) assetAlertChanged);
        } else if (i == 2) {
            int i2 = 0;
            for (a id : list) {
                if ((id.getId() == this.$event.getId() ? 1 : null) != null) {
                    break;
                }
                i2++;
            }
            i2 = -1;
            if (i2 == -1) {
                return list;
            }
            Object obj = this.$event;
            kotlin.jvm.internal.i.e(obj, str);
            return c.a((List) list, i2, obj);
        } else if (i != 3) {
            return list;
        } else {
            int i3 = 0;
            for (a id2 : list) {
                if ((id2.getId() == this.$event.getId() ? 1 : null) != null) {
                    break;
                }
                i3++;
            }
            i3 = -1;
            if (i3 != -1) {
                return c.b((List) list, i3);
            }
            return list;
        }
    }
}
