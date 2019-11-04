package com.iqoption.fragment.assets.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.rx.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.a.m;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001#B\u001b\b\u0012\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\u0010\u0007R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006$"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "", "types", "", "Lcom/iqoption/core/data/model/InstrumentType;", "(Ljava/lang/String;I[Lcom/iqoption/core/data/model/InstrumentType;)V", "", "(Ljava/lang/String;ILjava/util/List;)V", "filter", "Lkotlin/Function1;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "", "getFilter", "()Lkotlin/jvm/functions/Function1;", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getSorting", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "getTypes", "()Ljava/util/List;", "UNKNOWN", "OPTIONS", "FOREX", "BINARY", "DIGITAL", "FX", "MULTI", "FOREX_CLASSIC", "FOREX_INTRADAY", "CRYPTO", "STOCKS", "ETF", "INDICES", "BONDS", "COMMODITIES", "Companion", "app_optionXRelease"})
/* compiled from: AssetCategoryType.kt */
public enum AssetCategoryType {
    UNKNOWN((String) new InstrumentType[]{InstrumentType.UNKNOWN}),
    OPTIONS((String) new InstrumentType[]{InstrumentType.UNKNOWN}),
    FOREX((String) new InstrumentType[]{InstrumentType.UNKNOWN});
    
    private static final p BY_NAME_SORTING = null;
    public static final a Companion = null;
    private final List<InstrumentType> types;

    @i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007JF\u0010\u000b\u001a,\u0012\u0004\u0012\u00020\b\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\r0\r\u0012\u0004\u0012\u00020\u000f0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u0011H\u0007JL\u0010\u0013\u001a2\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\r0\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r0\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u0011H\u0007J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryType$Companion;", "", "()V", "BY_NAME_SORTING", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getBY_NAME_SORTING", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "getByActive", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getCategoryAssetsCounter", "Lkotlin/Function2;", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "availabilityPredicate", "Lkotlin/Function1;", "", "getFullAssetsCounter", "getSortableTypes", "", "app_optionXRelease"})
    /* compiled from: AssetCategoryType.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final p aAT() {
            return AssetCategoryType.BY_NAME_SORTING;
        }

        public final AssetCategoryType getByActive(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.ACTIVE);
            Object instrumentType = aVar.getInstrumentType();
            if (instrumentType == InstrumentType.TURBO_INSTRUMENT) {
                instrumentType = InstrumentType.BINARY_INSTRUMENT;
            }
            for (AssetCategoryType assetCategoryType : AssetCategoryType.values()) {
                Object obj = (assetCategoryType.getTypes().contains(instrumentType) && ((Boolean) assetCategoryType.getFilter().invoke(aVar)).booleanValue()) ? 1 : null;
                if (obj != null) {
                    return assetCategoryType;
                }
            }
            return null;
        }

        public final List<AssetCategoryType> getSortableTypes() {
            AssetCategoryType[] values = AssetCategoryType.values();
            Collection arrayList = new ArrayList();
            for (AssetCategoryType assetCategoryType : values) {
                Object obj = (assetCategoryType == AssetCategoryType.UNKNOWN || assetCategoryType == AssetCategoryType.OPTIONS || assetCategoryType == AssetCategoryType.FOREX) ? null : 1;
                if (obj != null) {
                    arrayList.add(assetCategoryType);
                }
            }
            return (List) arrayList;
        }

        public final b<Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>>, Map<AssetCategoryType, Integer>> getFullAssetsCounter(b<? super com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> bVar) {
            kotlin.jvm.internal.i.f(bVar, "availabilityPredicate");
            return new AssetCategoryType$Companion$getFullAssetsCounter$1(getCategoryAssetsCounter(bVar));
        }

        public final m<AssetCategoryType, Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>>, Integer> getCategoryAssetsCounter(b<? super com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> bVar) {
            kotlin.jvm.internal.i.f(bVar, "availabilityPredicate");
            return new AssetCategoryType$Companion$getCategoryAssetsCounter$2(new AssetCategoryType$Companion$getCategoryAssetsCounter$1(new ThreadLocal()), bVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryType$BINARY;", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getSorting", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
    /* compiled from: AssetCategoryType.kt */
    static final class BINARY extends AssetCategoryType {
        private final p sorting;

        BINARY(String str, int i) {
            super(str, i, new InstrumentType[]{InstrumentType.TURBO_INSTRUMENT, InstrumentType.BINARY_INSTRUMENT}, null);
            this.sorting = new p((AssetCategoryType) this, AssetSortType.BY_PROFIT, false);
        }

        public p getSorting() {
            return this.sorting;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryType$BONDS;", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "filter", "Lkotlin/Function1;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "", "getFilter", "()Lkotlin/jvm/functions/Function1;", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getSorting", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
    /* compiled from: AssetCategoryType.kt */
    static final class BONDS extends AssetCategoryType {
        private final b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> filter;
        private final p sorting;

        BONDS(String str, int i) {
            super(str, i, new InstrumentType[]{InstrumentType.CFD_INSTRUMENT}, null);
            this.filter = AssetCategoryType$BONDS$filter$1.dbU;
            this.sorting = new p((AssetCategoryType) this, AssetSortType.BY_VOLUME, false);
        }

        public b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> getFilter() {
            return this.filter;
        }

        public p getSorting() {
            return this.sorting;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryType$COMMODITIES;", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "filter", "Lkotlin/Function1;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "", "getFilter", "()Lkotlin/jvm/functions/Function1;", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getSorting", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
    /* compiled from: AssetCategoryType.kt */
    static final class COMMODITIES extends AssetCategoryType {
        private final b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> filter;
        private final p sorting;

        COMMODITIES(String str, int i) {
            super(str, i, new InstrumentType[]{InstrumentType.CFD_INSTRUMENT}, null);
            this.filter = AssetCategoryType$COMMODITIES$filter$1.dbV;
            this.sorting = new p((AssetCategoryType) this, AssetSortType.BY_VOLUME, false);
        }

        public b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> getFilter() {
            return this.filter;
        }

        public p getSorting() {
            return this.sorting;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryType$CRYPTO;", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getSorting", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
    /* compiled from: AssetCategoryType.kt */
    static final class CRYPTO extends AssetCategoryType {
        private final p sorting;

        CRYPTO(String str, int i) {
            super(str, i, new InstrumentType[]{InstrumentType.CRYPTO_INSTRUMENT}, null);
            this.sorting = new p((AssetCategoryType) this, AssetSortType.BY_LEVERAGE, false);
        }

        public p getSorting() {
            return this.sorting;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryType$DIGITAL;", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getSorting", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
    /* compiled from: AssetCategoryType.kt */
    static final class DIGITAL extends AssetCategoryType {
        private final p sorting;

        DIGITAL(String str, int i) {
            super(str, i, new InstrumentType[]{InstrumentType.DIGITAL_INSTRUMENT}, null);
            this.sorting = new p((AssetCategoryType) this, AssetSortType.BY_SPOT_PROFIT, false);
        }

        public p getSorting() {
            return this.sorting;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryType$ETF;", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "filter", "Lkotlin/Function1;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "", "getFilter", "()Lkotlin/jvm/functions/Function1;", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getSorting", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
    /* compiled from: AssetCategoryType.kt */
    static final class ETF extends AssetCategoryType {
        private final b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> filter;
        private final p sorting;

        ETF(String str, int i) {
            super(str, i, new InstrumentType[]{InstrumentType.CFD_INSTRUMENT}, null);
            this.filter = AssetCategoryType$ETF$filter$1.dbW;
            this.sorting = new p((AssetCategoryType) this, AssetSortType.BY_VOLUME, false);
        }

        public b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> getFilter() {
            return this.filter;
        }

        public p getSorting() {
            return this.sorting;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryType$FOREX_CLASSIC;", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getSorting", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
    /* compiled from: AssetCategoryType.kt */
    static final class FOREX_CLASSIC extends AssetCategoryType {
        private final p sorting;

        FOREX_CLASSIC(String str, int i) {
            super(str, i, new InstrumentType[]{InstrumentType.FOREX_INSTRUMENT}, null);
            this.sorting = new p((AssetCategoryType) this, AssetSortType.BY_VOLUME, false);
        }

        public p getSorting() {
            return this.sorting;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryType$FOREX_INTRADAY;", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "filter", "Lkotlin/Function1;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "", "getFilter", "()Lkotlin/jvm/functions/Function1;", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getSorting", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
    /* compiled from: AssetCategoryType.kt */
    static final class FOREX_INTRADAY extends AssetCategoryType {
        private final b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> filter;
        private final p sorting;

        FOREX_INTRADAY(String str, int i) {
            super(str, i, new InstrumentType[]{InstrumentType.CFD_INSTRUMENT}, null);
            this.filter = AssetCategoryType$FOREX_INTRADAY$filter$1.dbX;
            this.sorting = new p((AssetCategoryType) this, AssetSortType.BY_VOLUME, false);
        }

        public b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> getFilter() {
            return this.filter;
        }

        public p getSorting() {
            return this.sorting;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryType$FX;", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getSorting", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
    /* compiled from: AssetCategoryType.kt */
    static final class FX extends AssetCategoryType {
        private final p sorting;

        FX(String str, int i) {
            super(str, i, new InstrumentType[]{InstrumentType.FX_INSTRUMENT}, null);
            this.sorting = new p((AssetCategoryType) this, AssetSortType.BY_EXPIRATION, true);
        }

        public p getSorting() {
            return this.sorting;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryType$INDICES;", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "filter", "Lkotlin/Function1;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "", "getFilter", "()Lkotlin/jvm/functions/Function1;", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getSorting", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
    /* compiled from: AssetCategoryType.kt */
    static final class INDICES extends AssetCategoryType {
        private final b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> filter;
        private final p sorting;

        INDICES(String str, int i) {
            super(str, i, new InstrumentType[]{InstrumentType.CFD_INSTRUMENT}, null);
            this.filter = AssetCategoryType$INDICES$filter$1.dbY;
            this.sorting = new p((AssetCategoryType) this, AssetSortType.BY_VOLUME, false);
        }

        public b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> getFilter() {
            return this.filter;
        }

        public p getSorting() {
            return this.sorting;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryType$MULTI;", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getSorting", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
    /* compiled from: AssetCategoryType.kt */
    static final class MULTI extends AssetCategoryType {
        private final p sorting;

        MULTI(String str, int i) {
            super(str, i, new InstrumentType[]{InstrumentType.MULTI_INSTRUMENT}, null);
            this.sorting = new p((AssetCategoryType) this, AssetSortType.BY_SPOT_PROFIT, false);
        }

        public p getSorting() {
            return this.sorting;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategoryType$STOCKS;", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "filter", "Lkotlin/Function1;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "", "getFilter", "()Lkotlin/jvm/functions/Function1;", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getSorting", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "app_optionXRelease"})
    /* compiled from: AssetCategoryType.kt */
    static final class STOCKS extends AssetCategoryType {
        private final b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> filter;
        private final p sorting;

        STOCKS(String str, int i) {
            super(str, i, new InstrumentType[]{InstrumentType.CFD_INSTRUMENT}, null);
            this.filter = AssetCategoryType$STOCKS$filter$1.dbZ;
            this.sorting = new p((AssetCategoryType) this, AssetSortType.BY_VOLUME, false);
        }

        public b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> getFilter() {
            return this.filter;
        }

        public p getSorting() {
            return this.sorting;
        }
    }

    public static final AssetCategoryType getByActive(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return Companion.getByActive(aVar);
    }

    public static final m<AssetCategoryType, Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>>, Integer> getCategoryAssetsCounter(b<? super com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> bVar) {
        return Companion.getCategoryAssetsCounter(bVar);
    }

    public static final b<Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>>, Map<AssetCategoryType, Integer>> getFullAssetsCounter(b<? super com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> bVar) {
        return Companion.getFullAssetsCounter(bVar);
    }

    public static final List<AssetCategoryType> getSortableTypes() {
        return Companion.getSortableTypes();
    }

    private AssetCategoryType(List<? extends InstrumentType> list) {
        this.types = list;
    }

    public final List<InstrumentType> getTypes() {
        return this.types;
    }

    static {
        Companion = new a();
        BY_NAME_SORTING = new p(UNKNOWN, AssetSortType.BY_NAME, true);
    }

    private AssetCategoryType(InstrumentType... instrumentTypeArr) {
        this(r2, r3, m.listOf((InstrumentType[]) Arrays.copyOf(instrumentTypeArr, instrumentTypeArr.length)));
    }

    public b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> getFilter() {
        return c.akb();
    }

    public p getSorting() {
        return BY_NAME_SORTING;
    }
}
