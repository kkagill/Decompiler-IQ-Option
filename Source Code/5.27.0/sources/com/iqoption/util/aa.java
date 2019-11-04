package com.iqoption.util;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, bng = {"unexpectedCase", "", "value", "", "app_optionXRelease"})
/* compiled from: MatchingUtils.kt */
public final class aa {
    public static final Void cq(Object obj) {
        kotlin.jvm.internal.i.f(obj, ConditionalUserProperty.VALUE);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected case: ");
        stringBuilder.append(obj);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
