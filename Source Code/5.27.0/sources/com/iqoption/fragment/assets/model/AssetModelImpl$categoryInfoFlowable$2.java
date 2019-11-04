package com.iqoption.fragment.assets.model;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ext.h;
import io.reactivex.b.c;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.a.m;
import kotlin.jvm.a.u;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/fragment/assets/model/AssetCategoryInfo;", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: AssetsModelImpl.kt */
final class AssetModelImpl$categoryInfoFlowable$2 extends Lambda implements kotlin.jvm.a.a<e<f>> {
    final /* synthetic */ l this$0;

    @i(bne = {1, 1, 15}, bnf = {"\u0000i\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0001J'\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0002\u0010\"RÃ\u0002\u0010\u0007\u001a³\u0002\u0012/\u0012-\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t0\tj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012)\u0012'\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0013j\u0002`\u0015¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0016\u0012+\u0012)\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\t0\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0018\u0012+\u0012)\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\t0\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0019\u0012+\u0012)\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001a0\t0\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u001b\u0012%\u0012#\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c0\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u001d\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, bng = {"com/iqoption/fragment/assets/model/AssetModelImpl$categoryInfoFlowable$2$combine$1", "Lio/reactivex/functions/Function;", "", "", "Lkotlin/Function1;", "", "Lcom/iqoption/fragment/assets/model/AssetCategoryInfo;", "combiner", "Lkotlin/Function7;", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;", "Lcom/iqoption/fragment/assets/model/Markups;", "Lkotlin/ParameterName;", "name", "markups", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "category", "Lkotlin/Function2;", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "Lcom/iqoption/fragment/assets/model/MaxLeverageSupplier;", "maxLeverageSupplier", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "assetsMap", "leverageInfoMap", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "spreadDataMap", "", "favoritesMap", "getCombiner", "()Lkotlin/jvm/functions/Function7;", "apply", "results", "([Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "app_optionXRelease"})
    /* compiled from: AssetsModelImpl.kt */
    public static final class a implements g<Object[], b<? super CharSequence, ? extends f>> {
        private final u<Map<InstrumentType, ? extends Map<Integer, com.iqoption.core.microservices.risks.response.markup.a>>, e, m<? super com.iqoption.core.microservices.tradingengine.response.b.a, ? super InstrumentType, Integer>, Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>>, Map<InstrumentType, ? extends Map<Integer, com.iqoption.core.microservices.tradingengine.response.b.a>>, Map<InstrumentType, ? extends Map<Integer, com.iqoption.core.microservices.f.a.a.a>>, Map<InstrumentType, ? extends Set<Integer>>, b<CharSequence, f>> dcx;
        final /* synthetic */ AssetModelImpl$categoryInfoFlowable$2 dcy;

        a(AssetModelImpl$categoryInfoFlowable$2 assetModelImpl$categoryInfoFlowable$2) {
            this.dcy = assetModelImpl$categoryInfoFlowable$2;
            this.dcx = assetModelImpl$categoryInfoFlowable$2.this$0.aBh();
        }

        /* renamed from: r */
        public b<CharSequence, f> apply(Object[] objArr) {
            kotlin.jvm.internal.i.f(objArr, "results");
            u uVar = this.dcx;
            Object obj = objArr[0];
            if (obj != null) {
                Map map = (Map) obj;
                obj = objArr[1];
                if (obj != null) {
                    e eVar = (e) obj;
                    Object obj2 = objArr[2];
                    if (obj2 != null) {
                        m mVar = (m) o.q(obj2, 2);
                        obj = objArr[3];
                        if (obj != null) {
                            Map map2 = (Map) obj;
                            obj = objArr[4];
                            if (obj != null) {
                                Map map3 = (Map) obj;
                                obj = objArr[5];
                                if (obj != null) {
                                    Map map4 = (Map) obj;
                                    Object obj3 = objArr[6];
                                    if (obj3 != null) {
                                        return (b) uVar.a(map, eVar, mVar, map2, map3, map4, (Map) obj3);
                                    }
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<com.iqoption.core.data.model.InstrumentType, kotlin.collections.Set<kotlin.Int>>");
                                }
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<com.iqoption.core.data.model.InstrumentType, kotlin.collections.Map<kotlin.Int, com.iqoption.core.microservices.topassets.response.spread.SpreadData>>");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<com.iqoption.core.data.model.InstrumentType, kotlin.collections.Map<kotlin.Int, com.iqoption.core.microservices.tradingengine.response.leverage.LeverageInfo>>");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<com.iqoption.core.data.model.InstrumentType, kotlin.collections.Map<kotlin.Int, com.iqoption.core.microservices.tradingengine.response.active.Active>>");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.assets.model.MaxLeverageSupplier /* = (com.iqoption.core.microservices.tradingengine.response.leverage.LeverageInfo, com.iqoption.core.data.model.InstrumentType) -> kotlin.Int */");
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.assets.model.AssetCategory");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.assets.model.Markups /* = kotlin.collections.Map<com.iqoption.core.data.model.InstrumentType, kotlin.collections.Map<kotlin.Int, com.iqoption.core.microservices.risks.response.markup.ActiveMarkups>> */");
        }
    }

    AssetModelImpl$categoryInfoFlowable$2(l lVar) {
        this.this$0 = lVar;
        super(0);
    }

    /* renamed from: abK */
    public final e<f> invoke() {
        e bkT = e.a((org.a.b) e.a((org.a.b[]) new e[]{this.this$0.aBn(), this.this$0.aBo(), this.this$0.aBi(), this.this$0.aBk(), this.this$0.aBl(), this.this$0.aBm(), this.this$0.JZ()}, (g) new a(this)), (org.a.b) this.this$0.aBf(), (c) AnonymousClass1.dcw).c(com.iqoption.core.rx.i.aki()).bkT();
        kotlin.jvm.internal.i.e(bkT, "Flowable\n               …  .distinctUntilChanged()");
        return h.d(bkT);
    }
}
