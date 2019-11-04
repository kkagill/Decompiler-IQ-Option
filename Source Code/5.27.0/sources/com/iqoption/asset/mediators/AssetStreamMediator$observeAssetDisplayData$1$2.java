package com.iqoption.asset.mediators;

import androidx.collection.ArraySet;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ext.c;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import java.util.Map;
import java.util.Set;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "invoke"})
/* compiled from: AssetStreamMediator.kt */
final class AssetStreamMediator$observeAssetDisplayData$1$2 extends Lambda implements b<a, a> {
    final /* synthetic */ Map $boMap;
    final /* synthetic */ ArraySet $existedActiveIds;
    final /* synthetic */ Map $favorites;
    final /* synthetic */ Map $leverages;
    final /* synthetic */ Map $spreads;

    AssetStreamMediator$observeAssetDisplayData$1$2(Map map, Map map2, Map map3, ArraySet arraySet, Map map4) {
        this.$spreads = map;
        this.$leverages = map2;
        this.$favorites = map3;
        this.$existedActiveIds = arraySet;
        this.$boMap = map4;
        super(1);
    }

    /* renamed from: x */
    public final a invoke(a aVar) {
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.ACTIVE);
        int activeId = aVar.getActiveId();
        InstrumentType instrumentType = aVar.getInstrumentType();
        Map map = (Map) this.$spreads.get(instrumentType);
        Integer num = null;
        com.iqoption.core.microservices.f.a.a.a aVar2 = map != null ? (com.iqoption.core.microservices.f.a.a.a) map.get(Integer.valueOf(activeId)) : null;
        map = (Map) this.$leverages.get(instrumentType);
        com.iqoption.core.microservices.tradingengine.response.b.a aVar3 = map != null ? (com.iqoption.core.microservices.tradingengine.response.b.a) map.get(Integer.valueOf(activeId)) : null;
        Set set = (Set) this.$favorites.get(instrumentType);
        boolean contains = set != null ? set.contains(Integer.valueOf(activeId)) : false;
        this.$existedActiveIds.add(Integer.valueOf(activeId));
        Map map2 = (Map) this.$boMap.get(InstrumentType.TURBO_INSTRUMENT);
        a aVar4 = map2 != null ? (a) map2.get(Integer.valueOf(activeId)) : null;
        Map map3 = (Map) this.$boMap.get(InstrumentType.BINARY_INSTRUMENT);
        a aVar5 = map3 != null ? (a) map3.get(Integer.valueOf(activeId)) : null;
        if (c.b(aVar.getInstrumentType(), InstrumentType.TURBO_INSTRUMENT, InstrumentType.BINARY_INSTRUMENT)) {
            int i = 100;
            int ahR = aVar4 != null ? aVar4.ahR() : 100;
            if (aVar5 != null) {
                i = aVar5.ahR();
            }
            num = Integer.valueOf(Math.min(ahR, i));
        }
        return new a(aVar, aVar2, aVar3, contains, num);
    }
}
