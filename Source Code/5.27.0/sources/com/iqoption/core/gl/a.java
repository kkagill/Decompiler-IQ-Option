package com.iqoption.core.gl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/core/gl/ActiveIdResolver;", "", "activesProvider", "Lcom/iqoption/core/gl/ActiveIdResolver$ActivesProvider;", "(Lcom/iqoption/core/gl/ActiveIdResolver$ActivesProvider;)V", "activeIdsCache", "", "", "", "get", "ticker", "ActivesProvider", "core_release"})
/* compiled from: ActiveIdResolver.kt */
public final class a {
    private final Map<String, Integer> bhy = new LinkedHashMap();
    private final a bhz;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/gl/ActiveIdResolver$ActivesProvider;", "", "getActives", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "core_release"})
    /* compiled from: ActiveIdResolver.kt */
    public interface a {
        List<com.iqoption.core.microservices.tradingengine.response.active.a> getActives();
    }

    public a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "activesProvider");
        this.bhz = aVar;
    }

    public final int fV(String str) {
        String str2 = str;
        kotlin.jvm.internal.i.f(str2, "ticker");
        Integer num = (Integer) this.bhy.get(str2);
        if (num != null) {
            return num.intValue();
        }
        List<com.iqoption.core.microservices.tradingengine.response.active.a> actives = this.bhz.getActives();
        CharSequence charSequence = str2;
        int a = v.a(charSequence, ':', 0, false, 6, null);
        for (com.iqoption.core.microservices.tradingengine.response.active.a aVar : actives) {
            int activeId;
            if (kotlin.jvm.internal.i.y(aVar.adZ(), str2)) {
                activeId = aVar.getActiveId();
                this.bhy.put(str2, Integer.valueOf(activeId));
                return activeId;
            } else if (a == -1) {
                String adZ = aVar.adZ();
                int a2 = adZ != null ? v.a((CharSequence) adZ, ':', 0, false, 6, null) : -1;
                String r = kotlin.jvm.internal.i.r(aVar.ahN(), aVar.ahO());
                if (a2 != -1) {
                    String substring = str2.substring(0, a2);
                    kotlin.jvm.internal.i.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (kotlin.jvm.internal.i.y(substring, aVar.adZ())) {
                        activeId = aVar.getActiveId();
                        this.bhy.put(str2, Integer.valueOf(activeId));
                        return activeId;
                    }
                }
                if (!(kotlin.jvm.internal.i.y(r, str2) || v.b((CharSequence) aVar.ahP(), charSequence, false, 2, null))) {
                }
                activeId = aVar.getActiveId();
                this.bhy.put(str2, Integer.valueOf(activeId));
                return activeId;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(aVar.ahN());
                stringBuilder.append(':');
                stringBuilder.append(aVar.ahO());
                if (kotlin.jvm.internal.i.y(stringBuilder.toString(), str2) || v.b((CharSequence) aVar.ahP(), charSequence, false, 2, null)) {
                    activeId = aVar.getActiveId();
                    this.bhy.put(str2, Integer.valueOf(activeId));
                    return activeId;
                }
            }
        }
        this.bhy.put(str2, Integer.valueOf(-1));
        return -1;
    }
}
