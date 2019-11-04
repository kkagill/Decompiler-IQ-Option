package com.iqoption.asset.mediators;

import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import java.util.Comparator;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000e\u0018\u00002\u00020\u0001B]\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0002\u0010\u0010B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0002\u0010\u0012Bs\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0002\u0010\u0016R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, bng = {"Lcom/iqoption/asset/mediators/AssetStreamParams;", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "activeType", "Lcom/iqoption/core/data/model/ActiveType;", "defaultComparator", "Ljava/util/Comparator;", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "Lkotlin/Comparator;", "limit", "", "filter", "Lkotlin/Function1;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "", "(Lcom/iqoption/core/data/model/InstrumentType;Lcom/iqoption/core/data/model/ActiveType;Ljava/util/Comparator;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "isSpreadNeeded", "(Lcom/iqoption/core/data/model/InstrumentType;Lcom/iqoption/core/data/model/ActiveType;Z)V", "instrumentTypes", "", "activeTypes", "(Ljava/util/List;Ljava/util/List;ZLjava/util/Comparator;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "getActiveTypes", "()Ljava/util/List;", "getDefaultComparator", "()Ljava/util/Comparator;", "getFilter", "()Lkotlin/jvm/functions/Function1;", "getInstrumentTypes", "()Z", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "asset_release"})
/* compiled from: AssetStreamParams.kt */
public final class c {
    private final List<InstrumentType> axW;
    private final List<ActiveType> axX;
    private final boolean axY;
    private final Comparator<a> axZ;
    private final Integer aya;
    private final b<a, Boolean> filter;

    public c() {
        this(null, null, false, null, null, null, 63, null);
    }

    public c(List<? extends InstrumentType> list, List<? extends ActiveType> list2, boolean z, Comparator<a> comparator, Integer num, b<? super a, Boolean> bVar) {
        kotlin.jvm.internal.i.f(list, "instrumentTypes");
        this.axW = list;
        this.axX = list2;
        this.axY = z;
        this.axZ = comparator;
        this.aya = num;
        this.filter = bVar;
    }

    public /* synthetic */ c(List list, List list2, boolean z, Comparator comparator, Integer num, b bVar, int i, f fVar) {
        if ((i & 1) != 0) {
            list = InstrumentType.Companion.getKnownValues();
        }
        if ((i & 2) != 0) {
            list2 = (List) null;
        }
        List list3 = list2;
        boolean z2 = (i & 4) != 0 ? true : z;
        if ((i & 8) != 0) {
            comparator = (Comparator) null;
        }
        Comparator comparator2 = comparator;
        if ((i & 16) != 0) {
            num = (Integer) null;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            bVar = (b) null;
        }
        this(list, list3, z2, comparator2, num2, bVar);
    }

    public final List<InstrumentType> JU() {
        return this.axW;
    }

    public final List<ActiveType> JV() {
        return this.axX;
    }

    public final boolean JW() {
        return this.axY;
    }

    public final Comparator<a> JX() {
        return this.axZ;
    }

    public final Integer JY() {
        return this.aya;
    }

    public final b<a, Boolean> getFilter() {
        return this.filter;
    }

    public /* synthetic */ c(InstrumentType instrumentType, ActiveType activeType, boolean z, int i, f fVar) {
        if ((i & 2) != 0) {
            activeType = (ActiveType) null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        this(instrumentType, activeType, z);
    }

    public c(InstrumentType instrumentType, ActiveType activeType, boolean z) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        this(l.listOf(instrumentType), activeType != null ? l.listOf(activeType) : null, z, null, null, null, 56, null);
    }
}
