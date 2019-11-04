package com.iqoption.fragment.rightpanel;

import com.google.gson.JsonElement;
import com.iqoption.core.d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "", "", "invoke"})
/* compiled from: PipsSpreadUtils.kt */
final class PipsSpreadUtils$spreadInPips$2 extends Lambda implements a<Map<String, Integer>> {
    public static final PipsSpreadUtils$spreadInPips$2 doD = new PipsSpreadUtils$spreadInPips$2();

    PipsSpreadUtils$spreadInPips$2() {
        super(0);
    }

    /* renamed from: aAU */
    public final Map<String, Integer> invoke() {
        com.iqoption.core.microservices.features.a.a ei = d.EH().ei("spread-in-pips");
        if (ei == null || ei.ZY()) {
            return null;
        }
        Map<String, Integer> linkedHashMap = new LinkedHashMap();
        JsonElement ady = ei.ady();
        if (!ady.isJsonObject()) {
            return linkedHashMap;
        }
        for (Entry entry : ady.getAsJsonObject().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlin.jvm.internal.i.e(value, "entry.value");
            int asInt = ((JsonElement) value).getAsInt();
            kotlin.jvm.internal.i.e(str, "key");
            linkedHashMap.put(str, Integer.valueOf(asInt));
        }
        return linkedHashMap;
    }
}
