package com.iqoption.fragment.assets.model;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.b.a;
import java.util.Map;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<no name provided>", "", "leverageInfo", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "invoke"})
/* compiled from: AssetsModelImpl.kt */
final class AssetsModelImplKt$getMaxLeverageSupplier$1 extends Lambda implements m<a, InstrumentType, Integer> {
    final /* synthetic */ d $thresholds;
    final /* synthetic */ j $thresholds$metadata;

    AssetsModelImplKt$getMaxLeverageSupplier$1(d dVar, j jVar) {
        this.$thresholds = dVar;
        this.$thresholds$metadata = jVar;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        return Integer.valueOf(a((a) obj, (InstrumentType) obj2));
    }

    public final int a(a aVar, InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(aVar, "leverageInfo");
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        int[] aiI;
        if (com.iqoption.core.d.EA().Er()) {
            aiI = aVar.aiI();
        } else {
            aiI = aVar.aiH();
        }
        d dVar = this.$thresholds;
        j jVar = this.$thresholds$metadata;
        Integer num = (Integer) ((Map) dVar.getValue()).get(instrumentType.getServerValue());
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        int i = 1;
        for (int i2 : aiI) {
            if (i + 1 <= i2 && intValue > i2) {
                i = i2;
            }
        }
        return i;
    }
}
