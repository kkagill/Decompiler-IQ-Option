package com.iqoption.core.features.a;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.iqoption.core.d;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.features.c.b;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/core/features/deal/MinDealUtils;", "", "()V", "LIMIT_NOT_SET", "", "paramsCache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/iqoption/core/features/deal/DealLimitParams;", "getMinDeal", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "currencyName", "core_release"})
/* compiled from: MinDealUtils.kt */
public final class c {
    private static final ConcurrentHashMap<String, a> bhq = new ConcurrentHashMap();
    public static final c bhr = new c();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/features/deal/MinDealUtils$parseGson$$inlined$typeOf$1"})
    /* compiled from: GsonExtensions.kt */
    public static final class a extends TypeToken<a> {
    }

    private c() {
    }

    public static final double b(InstrumentType instrumentType, String str) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(str, "currencyName");
        com.iqoption.core.microservices.features.a.a ei = d.EH().ei("instruments-minimal-deal");
        double d = -1.0d;
        if (ei != null && ei.isEnabled()) {
            try {
                JsonElement ady = ei.ady();
                String jsonElement = ady.toString();
                kotlin.jvm.internal.i.e(jsonElement, "params.toString()");
                a aVar = (a) bhq.get(jsonElement);
                if (aVar == null) {
                    Gson Ez = d.Um().Ez();
                    Type type = new a().getType();
                    kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
                    aVar = (a) Ez.fromJson(ady, type);
                    bhq.put(jsonElement, aVar);
                }
                if (!aVar.Pe().contains(instrumentType.getServerValue())) {
                    return -1.0d;
                }
                for (Object next : aVar.Xm()) {
                    if (kotlin.jvm.internal.i.y(((b) next).Xz(), ei.getStatus())) {
                        break;
                    }
                }
                Object next2 = null;
                b bVar = (b) next2;
                if (bVar != null) {
                    for (Object next3 : bVar.XA()) {
                        if (kotlin.jvm.internal.i.y(((com.iqoption.core.features.c.a) next3).getName(), str)) {
                            break;
                        }
                    }
                    Object next32 = null;
                    com.iqoption.core.features.c.a aVar2 = (com.iqoption.core.features.c.a) next32;
                    if (aVar2 != null) {
                        BigDecimal Xy = aVar2.Xy();
                        if (Xy != null) {
                            d = Xy.doubleValue();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return d;
    }
}
