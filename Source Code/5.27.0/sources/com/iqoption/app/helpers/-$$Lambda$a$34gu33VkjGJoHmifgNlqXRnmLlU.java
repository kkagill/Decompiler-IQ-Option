package com.iqoption.app.helpers;

import com.google.common.base.j;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.microservices.tradingengine.response.active.a;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$a$34gu33VkjGJoHmifgNlqXRnmLlU implements j {
    private final /* synthetic */ ActiveType f$0;
    private final /* synthetic */ boolean f$1;

    public /* synthetic */ -$$Lambda$a$34gu33VkjGJoHmifgNlqXRnmLlU(ActiveType activeType, boolean z) {
        this.f$0 = activeType;
        this.f$1 = z;
    }

    public final boolean apply(Object obj) {
        return a.a(this.f$0, this.f$1, (a) obj);
    }
}
