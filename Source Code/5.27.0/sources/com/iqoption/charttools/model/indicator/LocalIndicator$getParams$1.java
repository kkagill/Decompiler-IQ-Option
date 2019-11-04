package com.iqoption.charttools.model.indicator;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"})
/* compiled from: MetaIndicator.kt */
final class LocalIndicator$getParams$1 extends Lambda implements b<Integer, String> {
    final /* synthetic */ JsonArray $values;

    LocalIndicator$getParams$1(JsonArray jsonArray) {
        this.$values = jsonArray;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return ep(((Number) obj).intValue());
    }

    public final String ep(int i) {
        JsonElement jsonElement = this.$values.get(i);
        kotlin.jvm.internal.i.e(jsonElement, "values[it]");
        String asString = jsonElement.getAsString();
        kotlin.jvm.internal.i.e(asString, "values[it].asString");
        return asString;
    }
}
