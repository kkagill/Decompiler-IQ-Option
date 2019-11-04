package com.iqoption.app.managers;

import android.util.Pair;
import com.google.common.base.d;
import com.iqoption.dto.entity.result.BuybackResult;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$c$b$8sGx4m_0teZKwmJqNEHvXtXPgkQ implements d {
    public static final /* synthetic */ -$$Lambda$c$b$8sGx4m_0teZKwmJqNEHvXtXPgkQ INSTANCE = new -$$Lambda$c$b$8sGx4m_0teZKwmJqNEHvXtXPgkQ();

    private /* synthetic */ -$$Lambda$c$b$8sGx4m_0teZKwmJqNEHvXtXPgkQ() {
    }

    public final Object apply(Object obj) {
        return Pair.create((BuybackResult) obj, new com.iqoption.mobbtech.connect.response.options.d(((BuybackResult) obj).expired, ((BuybackResult) obj).activeId, ((BuybackResult) obj).typeName.toInstrumentType()));
    }
}
