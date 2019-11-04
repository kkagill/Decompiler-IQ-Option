package com.iqoption.asset.b;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.n;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0014\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J*\u0010\t\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b0\u000bj\u0002`\r0\nH\u0016J*\u0010\u000e\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b0\u000bj\u0002`\r0\nH\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00170\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0014\u0010\u001d\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u001f"}, bng = {"Lcom/iqoption/asset/manager/AssetManager;", "", "addToFavorites", "", "activeId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "coolDown", "getAllAssetsMap", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "Lcom/iqoption/asset/AssetsMap;", "getAllEnabledAssetsMap", "getAssetDisplayDataList", "", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "getAssetsList", "getAssetsMap", "getCommissions", "Lcom/iqoption/core/microservices/risks/response/commission/CommissionData;", "getFavorites", "", "getLeverages", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "getTopAssets", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "removeFromFavorites", "warmUp", "Companion", "asset_release"})
/* compiled from: AssetManager.kt */
public interface a {
    public static final a awZ = a.axe;

    @i(bne = {1, 1, 15})
    /* compiled from: AssetManager.kt */
    public static final class b {

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a@\u0012<\u0012:\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00020\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\n¢\u0006\u0002\b\n"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "kotlin.jvm.PlatformType", "instruments", "", "apply"})
        /* compiled from: AssetManager.kt */
        static final class a<T, R> implements g<T, org.a.b<? extends R>> {
            public static final a axp = new a();

            a() {
            }

            /* renamed from: H */
            public final e<Map<InstrumentType, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>>> apply(final List<? extends InstrumentType> list) {
                kotlin.jvm.internal.i.f(list, "instruments");
                return a.awZ.JP().g(new g<T, R>() {
                    /* renamed from: x */
                    public final Map<InstrumentType, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>> apply(Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>> map) {
                        kotlin.jvm.internal.i.f(map, "assetsMap");
                        Map linkedHashMap = new LinkedHashMap();
                        for (InstrumentType instrumentType : list) {
                            Map map2 = (Map) map.get(instrumentType);
                            if (map2 != null) {
                                Map map3 = (Map) linkedHashMap.put(instrumentType, map2);
                            }
                        }
                        return linkedHashMap;
                    }
                });
            }
        }

        public static e<Map<InstrumentType, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>>> a(a aVar) {
            List knownValues = InstrumentType.Companion.getKnownValues();
            Iterable<InstrumentType> iterable = knownValues;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (InstrumentType n : iterable) {
                arrayList.add(aVar.n(n));
            }
            return com.iqoption.core.rx.g.i(knownValues, (List) arrayList);
        }

        public static e<Map<InstrumentType, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>>> b(a aVar) {
            e k = com.iqoption.core.features.instrument.b.bhs.Xx().k(a.axp);
            kotlin.jvm.internal.i.e(k, "InstrumentFeatureHelper.…}\n            }\n        }");
            return k;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0016J*\u0010\u001a\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b0\u000bj\u0002`\u000f0\nH\u0016J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\n2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110\n2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\"\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\"\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020 0\u000b0\n2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\"0\n2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\"\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0\u000b0\n2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\"\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020&0\u000b0\n2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\"\u0010'\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110(2\u0006\u0010\u0018\u001a\u00020\fH\u0002J(\u0010*\u001a\u001a\u0012\u0004\u0012\u00020)\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b0(2\u0006\u0010\u0018\u001a\u00020\fH\u0002J\u0018\u0010+\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u0012\u0010,\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0007H\u0002J\u0016\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00042\u0006\u0010/\u001a\u00020\u0007H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000R2\u0010\t\u001a&\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b0\u000bj\u0002`\u000f\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00140\u0013X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, bng = {"Lcom/iqoption/asset/manager/AssetManager$Companion;", "Lcom/iqoption/asset/manager/AssetManager;", "()V", "ANY_CONSUMER", "Lio/reactivex/functions/Consumer;", "", "TAG", "", "kotlin.jvm.PlatformType", "allAssetsSharedStream", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "Lcom/iqoption/asset/AssetsMap;", "leverageSupportingInstrumentTypes", "", "warmedUp", "Ljava/util/concurrent/ConcurrentHashMap;", "Lio/reactivex/disposables/Disposable;", "addToFavorites", "", "activeId", "instrumentType", "coolDown", "getAllAssetsMap", "getAssetDisplayDataList", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "getAssetsList", "getAssetsMap", "getCommissions", "Lcom/iqoption/core/microservices/risks/response/commission/CommissionData;", "getFavorites", "", "getLeverages", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "getTopAssets", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "getTurboBinaryListMapper", "Lio/reactivex/functions/Function;", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;", "getTurboBinaryMapMapper", "removeFromFavorites", "warmUp", "warmUpCompleteConsumer", "Lio/reactivex/functions/Action;", "msg", "warmUpErrorConsumer", "", "asset_release"})
    /* compiled from: AssetManager.kt */
    public static final class a implements a {
        private static final String TAG = a.class.getSimpleName();
        private static final io.reactivex.b.f<Object> axa = a.axf;
        private static final List<InstrumentType> axb = m.listOf(InstrumentType.CFD_INSTRUMENT, InstrumentType.FOREX_INSTRUMENT, InstrumentType.CRYPTO_INSTRUMENT);
        private static final ConcurrentHashMap<InstrumentType, io.reactivex.disposables.b> axc = new ConcurrentHashMap();
        private static io.reactivex.e<Map<InstrumentType, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>>> axd;
        static final /* synthetic */ a axe = new a();

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: AssetManager.kt */
        static final class a<T> implements io.reactivex.b.f<Object> {
            public static final a axf = new a();

            a() {
            }

            public final void accept(Object obj) {
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "it", "", "", "apply"})
        /* compiled from: AssetManager.kt */
        static final class b<T, R> implements io.reactivex.b.g<T, R> {
            public static final b axh = new b();

            b() {
            }

            /* renamed from: w */
            public final List<com.iqoption.core.microservices.tradingengine.response.active.a> apply(Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a> map) {
                kotlin.jvm.internal.i.f(map, "it");
                return u.T(map.values());
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "activesMap", "", "", "apply"})
        /* compiled from: AssetManager.kt */
        static final class c<T, R> implements io.reactivex.b.g<T, R> {
            public static final c axi = new c();

            c() {
            }

            /* renamed from: w */
            public final List<com.iqoption.core.microservices.tradingengine.response.active.a> apply(Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a> map) {
                kotlin.jvm.internal.i.f(map, "activesMap");
                return u.T(map.values());
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive;", "result", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;", "apply"})
        /* compiled from: AssetManager.kt */
        static final class d<T, R> implements io.reactivex.b.g<com.iqoption.core.microservices.tradingengine.response.active.g.a, List<? extends com.iqoption.core.microservices.tradingengine.response.active.a>> {
            public static final d axj = new d();

            d() {
            }

            /* renamed from: b */
            public final List<n> apply(com.iqoption.core.microservices.tradingengine.response.active.g.a aVar) {
                kotlin.jvm.internal.i.f(aVar, "result");
                HashMap ahZ = aVar.ahW().ahZ();
                if (ahZ != null) {
                    Collection values = ahZ.values();
                    if (values != null) {
                        List<n> T = u.T(values);
                        if (T != null) {
                            return T;
                        }
                    }
                }
                return m.emptyList();
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive;", "result", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;", "apply"})
        /* compiled from: AssetManager.kt */
        static final class e<T, R> implements io.reactivex.b.g<com.iqoption.core.microservices.tradingengine.response.active.g.a, List<? extends com.iqoption.core.microservices.tradingengine.response.active.a>> {
            public static final e axk = new e();

            e() {
            }

            /* renamed from: b */
            public final List<n> apply(com.iqoption.core.microservices.tradingengine.response.active.g.a aVar) {
                kotlin.jvm.internal.i.f(aVar, "result");
                HashMap ahZ = aVar.ahV().ahZ();
                if (ahZ != null) {
                    Collection values = ahZ.values();
                    if (values != null) {
                        List<n> T = u.T(values);
                        if (T != null) {
                            return T;
                        }
                    }
                }
                return m.emptyList();
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "result", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;", "apply"})
        /* compiled from: AssetManager.kt */
        static final class f<T, R> implements io.reactivex.b.g<com.iqoption.core.microservices.tradingengine.response.active.g.a, Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>> {
            public static final f axl = new f();

            f() {
            }

            /* renamed from: c */
            public final Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a> apply(com.iqoption.core.microservices.tradingengine.response.active.g.a aVar) {
                kotlin.jvm.internal.i.f(aVar, "result");
                HashMap ahZ = aVar.ahW().ahZ();
                return ahZ != null ? ahZ : af.emptyMap();
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "result", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveSettingResult$ActiveSetting;", "apply"})
        /* compiled from: AssetManager.kt */
        static final class g<T, R> implements io.reactivex.b.g<com.iqoption.core.microservices.tradingengine.response.active.g.a, Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>> {
            public static final g axm = new g();

            g() {
            }

            /* renamed from: c */
            public final Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a> apply(com.iqoption.core.microservices.tradingengine.response.active.g.a aVar) {
                kotlin.jvm.internal.i.f(aVar, "result");
                HashMap ahZ = aVar.ahV().ahZ();
                return ahZ != null ? ahZ : af.emptyMap();
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: AssetManager.kt */
        static final class h implements io.reactivex.b.a {
            public static final h axn = new h();

            h() {
            }

            public final void run() {
            }
        }

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: AssetManager.kt */
        static final class i<T> implements io.reactivex.b.f<Throwable> {
            public static final i axo = new i();

            i() {
            }

            /* renamed from: o */
            public final void accept(Throwable th) {
            }
        }

        private a() {
        }

        public io.reactivex.e<Map<InstrumentType, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>>> JQ() {
            return b.b(this);
        }

        private final io.reactivex.b.f<Throwable> es(String str) {
            return i.axo;
        }

        private final io.reactivex.b.a et(String str) {
            return h.axn;
        }

        public io.reactivex.e<List<com.iqoption.core.microservices.tradingengine.response.active.a>> o(InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            int i = b.aob[instrumentType.ordinal()];
            if (i == 1 || i == 2) {
                io.reactivex.e g = com.iqoption.core.data.repository.h.bet.Xc().g(v(instrumentType));
                kotlin.jvm.internal.i.e(g, "TradingEngineRepository.…stMapper(instrumentType))");
                return g;
            }
            String str = "TradingEngineRepository.…                        }";
            io.reactivex.e<List<com.iqoption.core.microservices.tradingengine.response.active.a>> g2;
            if (i == 3 || i == 4 || i == 5) {
                g2 = com.iqoption.core.data.repository.h.bet.G(instrumentType).g(b.axh);
                kotlin.jvm.internal.i.e(g2, str);
                return g2;
            }
            g2 = com.iqoption.core.data.repository.h.bet.H(instrumentType).g(c.axi);
            kotlin.jvm.internal.i.e(g2, str);
            return g2;
        }

        public io.reactivex.e<Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>> n(InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            int i = b.axg[instrumentType.ordinal()];
            if (i == 1 || i == 2) {
                io.reactivex.e g = com.iqoption.core.data.repository.h.bet.Xc().g(w(instrumentType));
                kotlin.jvm.internal.i.e(g, "TradingEngineRepository.…apMapper(instrumentType))");
                return g;
            } else if (i == 3 || i == 4 || i == 5) {
                return com.iqoption.core.data.repository.h.bet.G(instrumentType);
            } else {
                return com.iqoption.core.data.repository.h.bet.H(instrumentType);
            }
        }

        public io.reactivex.e<Map<Integer, com.iqoption.core.microservices.f.a.a.a>> p(InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            return com.iqoption.asset.repository.c.ayq.p(instrumentType);
        }

        public io.reactivex.e<Map<Integer, com.iqoption.core.microservices.tradingengine.response.b.a>> q(InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            if (axb.contains(instrumentType)) {
                return com.iqoption.core.data.repository.h.bet.q(instrumentType);
            }
            io.reactivex.e cD = io.reactivex.e.cD(af.emptyMap());
            kotlin.jvm.internal.i.e(cD, "Flowable.just(mapOf())");
            return cD;
        }

        public io.reactivex.e<Map<Integer, com.iqoption.core.microservices.risks.response.a.a>> r(InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            return com.iqoption.core.data.repository.f.bdW.r(instrumentType);
        }

        public io.reactivex.e<Set<Integer>> s(InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            return com.iqoption.asset.repository.a.aye.s(instrumentType);
        }

        public void b(int i, InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            com.iqoption.asset.repository.a.aye.b(i, instrumentType);
        }

        public void c(int i, InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            com.iqoption.asset.repository.a.aye.c(i, instrumentType);
        }

        public void t(InstrumentType instrumentType) {
            if (instrumentType != null) {
                ConcurrentMap concurrentMap = axc;
                if (concurrentMap.get(instrumentType) == null) {
                    io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
                    io.reactivex.e d = n(instrumentType).d(com.iqoption.core.rx.i.aki());
                    io.reactivex.b.f fVar = axa;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed warmed up assets map: ");
                    stringBuilder.append(instrumentType);
                    io.reactivex.b.f es = es(stringBuilder.toString());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Completed warmed up assets map: ");
                    stringBuilder2.append(instrumentType);
                    aVar.e(d.a(fVar, es, et(stringBuilder2.toString())));
                    d = p(instrumentType).d(com.iqoption.core.rx.i.aki());
                    fVar = axa;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed warmed up top assets: ");
                    stringBuilder.append(instrumentType);
                    es = es(stringBuilder.toString());
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Completed warmed up top assets: ");
                    stringBuilder2.append(instrumentType);
                    aVar.e(d.a(fVar, es, et(stringBuilder2.toString())));
                    d = q(instrumentType).d(com.iqoption.core.rx.i.aki());
                    fVar = axa;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed warmed up leverages: ");
                    stringBuilder.append(instrumentType);
                    es = es(stringBuilder.toString());
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Completed warmed up leverages: ");
                    stringBuilder2.append(instrumentType);
                    aVar.e(d.a(fVar, es, et(stringBuilder2.toString())));
                    d = r(instrumentType).d(com.iqoption.core.rx.i.aki());
                    fVar = axa;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed warmed up commissions: ");
                    stringBuilder.append(instrumentType);
                    es = es(stringBuilder.toString());
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Completed warmed up commissions: ");
                    stringBuilder2.append(instrumentType);
                    aVar.e(d.a(fVar, es, et(stringBuilder2.toString())));
                    Object putIfAbsent = concurrentMap.putIfAbsent(instrumentType, aVar);
                    return;
                }
                return;
            }
            for (InstrumentType t : InstrumentType.Companion.getKnownValues()) {
                t(t);
            }
        }

        public void u(InstrumentType instrumentType) {
            if (instrumentType != null) {
                io.reactivex.disposables.b bVar = (io.reactivex.disposables.b) axc.remove(instrumentType);
                if (bVar != null) {
                    bVar.dispose();
                    return;
                }
                return;
            }
            for (InstrumentType u : InstrumentType.Companion.getKnownValues()) {
                u(u);
            }
        }

        private final io.reactivex.b.g<com.iqoption.core.microservices.tradingengine.response.active.g.a, List<com.iqoption.core.microservices.tradingengine.response.active.a>> v(InstrumentType instrumentType) {
            if (instrumentType == InstrumentType.BINARY_INSTRUMENT) {
                return d.axj;
            }
            return e.axk;
        }

        private final io.reactivex.b.g<com.iqoption.core.microservices.tradingengine.response.active.g.a, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>> w(InstrumentType instrumentType) {
            if (instrumentType == InstrumentType.BINARY_INSTRUMENT) {
                return f.axl;
            }
            return g.axm;
        }

        public io.reactivex.e<Map<InstrumentType, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>>> JP() {
            io.reactivex.e<Map<InstrumentType, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>>> eVar = axd;
            if (eVar != null) {
                return eVar;
            }
            io.reactivex.e a = b.a(this);
            axd = com.iqoption.core.ext.h.d(a);
            return a;
        }
    }

    e<Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>> n(InstrumentType instrumentType);
}
