package com.iqoption.fragment.assets.model;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.w;
import com.iqoption.core.util.z;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.PublishProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.a.m;
import kotlin.jvm.a.u;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001JB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u001d\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e0\u001e0\u0006H\u0002Jº\u0002\u0010\"\u001a³\u0002\u0012/\u0012-\u0012\u0004\u0012\u00020\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020$0\u001e0\u001ej\u0002`%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110)¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(*\u0012)\u0012'\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0+j\u0002`-¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(.\u0012+\u0012)\u0012\u0004\u0012\u00020\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e0\u001e¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(/\u0012+\u0012)\u0012\u0004\u0012\u00020\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020,0\u001e0\u001e¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(0\u0012+\u0012)\u0012\u0004\u0012\u00020\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002010\u001e0\u001e¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(2\u0012%\u0012#\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 030\u001e¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(4\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u00070#H\u0002J\u0014\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)060\u0006H\u0016J \u00107\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 030\u001e0\u0006H\u0002J$\u00108\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0+j\u0002`-0\u0006H\u0002J&\u00109\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020,0\u001e0\u001e0\u0006H\u0002J*\u0010:\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020$0\u001e0\u001ej\u0002`%0\u0006H\u0002J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020)0\u0006H\u0002J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006H\u0016J\u001a\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020>0\u001e0\u0006H\u0002J&\u0010?\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002010\u001e0\u001e0\u0006H\u0002J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0019H\u0016J\u0010\u0010C\u001a\u00020A2\u0006\u0010*\u001a\u00020)H\u0016J\u0010\u0010D\u001a\u00020A2\u0006\u0010E\u001a\u00020>H\u0016J\u0010\u0010F\u001a\u00020A2\u0006\u0010*\u001a\u00020)H\u0016J\u0010\u0010G\u001a\u00020A2\u0006\u0010H\u001a\u00020IH\u0016R&\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR4\u0010\u000b\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b \r*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\fX\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR)\u0010\u0010\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\b0\b0\u00068BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\nR)\u0010\u0014\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00150\u00150\u00068BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u001b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00190\u00190\u001cX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetModelImpl;", "Lcom/iqoption/fragment/assets/model/AssetsModel;", "selectedCategoryType", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "(Lcom/iqoption/fragment/assets/model/AssetCategoryType;)V", "categoriesListMutatorFlowable", "Lio/reactivex/Flowable;", "Lkotlin/Function1;", "Lcom/iqoption/fragment/assets/model/AssetModelImpl$CategoriesState;", "getCategoriesListMutatorFlowable", "()Lio/reactivex/Flowable;", "categoriesMutatorProcessor", "Lio/reactivex/processors/PublishProcessor;", "kotlin.jvm.PlatformType", "categoriesOtherMutatorFlowable", "getCategoriesOtherMutatorFlowable", "categoriesStateFlowable", "getCategoriesStateFlowable", "categoriesStateFlowable$delegate", "Lkotlin/Lazy;", "categoryInfoFlowable", "Lcom/iqoption/fragment/assets/model/AssetCategoryInfo;", "getCategoryInfoFlowable", "categoryInfoFlowable$delegate", "searchConstraintFlowable", "", "getSearchConstraintFlowable", "searchConstraintProcessor", "Lio/reactivex/processors/BehaviorProcessor;", "getActivesMap", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getAssetsCombiner", "Lkotlin/Function7;", "Lcom/iqoption/core/microservices/risks/response/markup/ActiveMarkups;", "Lcom/iqoption/fragment/assets/model/Markups;", "Lkotlin/ParameterName;", "name", "markups", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "category", "Lkotlin/Function2;", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "Lcom/iqoption/fragment/assets/model/MaxLeverageSupplier;", "maxLeverageSupplier", "assetsMap", "leverageInfoMap", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "spreadDataMap", "", "favoritesMap", "getCategories", "", "getFavorites", "getLeverageSupplier", "getLeveragesMap", "getMarkups", "getSelectedCategory", "getSelectedInfo", "getSortings", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getTopAssetsMap", "searchAssets", "", "constraint", "selectCategory", "sortAssets", "sorting", "toggleCategory", "toggleFavorites", "item", "Lcom/iqoption/fragment/assets/model/AssetItem;", "CategoriesState", "app_optionXRelease"})
/* compiled from: AssetsModelImpl.kt */
public final class l {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(l.class), "categoriesStateFlowable", "getCategoriesStateFlowable()Lio/reactivex/Flowable;")), k.a(new PropertyReference1Impl(k.G(l.class), "categoryInfoFlowable", "getCategoryInfoFlowable()Lio/reactivex/Flowable;"))};
    private final BehaviorProcessor<CharSequence> aLY;
    private final PublishProcessor<kotlin.jvm.a.b<a, a>> dcl;
    private final kotlin.d dcm;
    private final kotlin.d dcn;
    private final AssetCategoryType dco;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0006\u0010 \u001a\u00020\u001cJ\t\u0010!\u001a\u00020\u0007HÖ\u0001J\u001a\u0010\"\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00040$2\u0006\u0010%\u001a\u00020\u0004H\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetModelImpl$CategoriesState;", "", "baseList", "", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "expandedIds", "", "", "selectedId", "(Ljava/util/List;Ljava/util/Set;Ljava/lang/String;)V", "getBaseList", "()Ljava/util/List;", "getExpandedIds", "()Ljava/util/Set;", "list", "getList", "list$delegate", "Lkotlin/Lazy;", "selected", "getSelected", "()Lcom/iqoption/fragment/assets/model/AssetCategory;", "getSelectedId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "isEmpty", "toString", "traversal", "", "", "item", "app_optionXRelease"})
    /* compiled from: AssetsModelImpl.kt */
    private static final class a {
        static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "list", "getList()Ljava/util/List;"))};
        private final String cyW;
        private final kotlin.d dcp;
        private final e dcq;
        private final List<e> dcr;
        private final Set<String> dcs;

        public a() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ a a(a aVar, List list, Set set, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.dcr;
            }
            if ((i & 2) != 0) {
                set = aVar.dcs;
            }
            if ((i & 4) != 0) {
                str = aVar.cyW;
            }
            return aVar.a(list, set, str);
        }

        public final a a(List<e> list, Set<String> set, String str) {
            kotlin.jvm.internal.i.f(list, "baseList");
            kotlin.jvm.internal.i.f(set, "expandedIds");
            return new a(list, set, str);
        }

        public final List<e> ava() {
            kotlin.d dVar = this.dcp;
            j jVar = anY[0];
            return (List) dVar.getValue();
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.cyW, r3.cyW) != false) goto L_0x0029;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.fragment.assets.model.l.a;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (com.iqoption.fragment.assets.model.l.a) r3;
            r0 = r2.dcr;
            r1 = r3.dcr;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.dcs;
            r1 = r3.dcs;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.cyW;
            r3 = r3.cyW;
            r3 = kotlin.jvm.internal.i.y(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.assets.model.l$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List list = this.dcr;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            Set set = this.dcs;
            hashCode = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
            String str = this.cyW;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CategoriesState(baseList=");
            stringBuilder.append(this.dcr);
            stringBuilder.append(", expandedIds=");
            stringBuilder.append(this.dcs);
            stringBuilder.append(", selectedId=");
            stringBuilder.append(this.cyW);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public a(List<e> list, Set<String> set, String str) {
            kotlin.jvm.internal.i.f(list, "baseList");
            kotlin.jvm.internal.i.f(set, "expandedIds");
            this.dcr = list;
            this.dcs = set;
            this.cyW = str;
            this.dcp = g.c(new AssetModelImpl$CategoriesState$list$2(this));
            this.dcq = q.d(this.dcr, this.cyW);
        }

        public /* synthetic */ a(List list, Set set, String str, int i, f fVar) {
            if ((i & 1) != 0) {
                list = m.emptyList();
            }
            if ((i & 2) != 0) {
                set = al.emptySet();
            }
            if ((i & 4) != 0) {
                str = (String) null;
            }
            this(list, set, str);
        }

        public final List<e> aBs() {
            return this.dcr;
        }

        public final Set<String> aBt() {
            return this.dcs;
        }

        public final String aqw() {
            return this.cyW;
        }

        public final e aBr() {
            return this.dcq;
        }

        private final void a(List<e> list, e eVar) {
            List<e> list2 = list;
            if (this.dcs.contains(eVar.getId())) {
                list2.add(e.a(eVar, null, null, null, 0, null, false, true, null, null, null, null, 1983, null));
                List aAP = eVar.aAP();
                int size = aAP.size();
                for (int i = 0; i < size; i++) {
                    a(list2, (e) aAP.get(i));
                }
            } else if (kotlin.jvm.internal.i.y(eVar.getId(), this.cyW)) {
                list2.add(e.a(eVar, null, null, null, 0, null, true, false, null, null, null, null, 2015, null));
            } else {
                list.add(eVar);
            }
        }

        public final boolean isEmpty() {
            return this.dcr.isEmpty() && this.dcs.isEmpty() && this.cyW == null;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/fragment/assets/model/AssetModelImpl$CategoriesState;", "counts", "", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "", "apply"})
    /* compiled from: AssetsModelImpl.kt */
    static final class b<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ l this$0;

        b(l lVar) {
            this.this$0 = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x010d  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0107  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0116  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0153  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x017f  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x01bb  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01c4  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x01c2  */
        /* renamed from: G */
        public final com.iqoption.fragment.assets.model.l.a apply(java.util.Map<com.iqoption.fragment.assets.model.AssetCategoryType, java.lang.Integer> r25) {
            /*
            r24 = this;
            r0 = r24;
            r8 = r25;
            r1 = "counts";
            kotlin.jvm.internal.i.f(r8, r1);
            r1 = new java.util.ArrayList;
            r1.<init>();
            r9 = r1;
            r9 = (java.util.List) r9;
            r1 = new java.util.ArrayList;
            r1.<init>();
            r10 = r1;
            r10 = (java.util.List) r10;
            r11 = com.iqoption.core.features.instrument.b.Xt();
            if (r11 == 0) goto L_0x002e;
        L_0x001f:
            r3 = com.iqoption.fragment.assets.model.AssetCategoryType.BINARY;
            r4 = 2131886339; // 0x7f120103 float:1.9407254E38 double:1.053291801E-314;
            r5 = 0;
            r6 = 8;
            r7 = 0;
            r1 = r10;
            r2 = r25;
            com.iqoption.fragment.assets.model.q.a(r1, r2, r3, r4, r5, r6, r7);
        L_0x002e:
            r1 = com.iqoption.core.features.instrument.b.Xr();
            if (r1 == 0) goto L_0x0043;
        L_0x0034:
            r3 = com.iqoption.fragment.assets.model.AssetCategoryType.DIGITAL;
            r4 = 2131886745; // 0x7f120299 float:1.9408078E38 double:1.0532920015E-314;
            r5 = 0;
            r6 = 8;
            r7 = 0;
            r1 = r10;
            r2 = r25;
            com.iqoption.fragment.assets.model.q.a(r1, r2, r3, r4, r5, r6, r7);
        L_0x0043:
            r1 = com.iqoption.core.features.instrument.b.Xs();
            if (r1 == 0) goto L_0x0058;
        L_0x0049:
            r3 = com.iqoption.fragment.assets.model.AssetCategoryType.FX;
            r4 = 2131886986; // 0x7f12038a float:1.9408566E38 double:1.0532921206E-314;
            r5 = 0;
            r6 = 8;
            r7 = 0;
            r1 = r10;
            r2 = r25;
            com.iqoption.fragment.assets.model.q.a(r1, r2, r3, r4, r5, r6, r7);
        L_0x0058:
            r1 = com.iqoption.core.features.instrument.b.Xq();
            if (r1 == 0) goto L_0x006d;
        L_0x005e:
            r3 = com.iqoption.fragment.assets.model.AssetCategoryType.MULTI;
            r4 = 2131887553; // 0x7f1205c1 float:1.9409716E38 double:1.0532924007E-314;
            r5 = 0;
            r6 = 8;
            r7 = 0;
            r1 = r10;
            r2 = r25;
            com.iqoption.fragment.assets.model.q.a(r1, r2, r3, r4, r5, r6, r7);
        L_0x006d:
            r1 = r10.size();
            if (r1 <= 0) goto L_0x0083;
        L_0x0073:
            r1 = new com.iqoption.fragment.assets.model.e;
            r2 = com.iqoption.fragment.assets.model.AssetCategoryType.OPTIONS;
            r3 = 2131887854; // 0x7f1206ee float:1.9410327E38 double:1.0532925494E-314;
            r4 = 2131231381; // 0x7f080295 float:1.8078841E38 double:1.0529682087E-314;
            r1.<init>(r2, r3, r4, r10);
            r9.add(r1);
        L_0x0083:
            r1 = com.iqoption.core.features.instrument.b.Xu();
            r2 = com.iqoption.core.features.instrument.b.Xv();
            r3 = com.iqoption.core.d.EH();
            r4 = "intraday-forex";
            r3 = r3.ej(r4);
            r4 = 0;
            if (r2 == 0) goto L_0x00aa;
        L_0x0098:
            r2 = com.iqoption.fragment.assets.model.AssetCategoryType.FOREX_CLASSIC;
            r2 = r8.get(r2);
            r2 = (java.lang.Integer) r2;
            if (r2 == 0) goto L_0x00a7;
        L_0x00a2:
            r2 = r2.intValue();
            goto L_0x00a8;
        L_0x00a7:
            r2 = 0;
        L_0x00a8:
            r14 = r2;
            goto L_0x00ab;
        L_0x00aa:
            r14 = 0;
        L_0x00ab:
            if (r1 == 0) goto L_0x00be;
        L_0x00ad:
            if (r3 == 0) goto L_0x00be;
        L_0x00af:
            r2 = com.iqoption.fragment.assets.model.AssetCategoryType.FOREX_INTRADAY;
            r2 = r8.get(r2);
            r2 = (java.lang.Integer) r2;
            if (r2 == 0) goto L_0x00be;
        L_0x00b9:
            r2 = r2.intValue();
            goto L_0x00bf;
        L_0x00be:
            r2 = 0;
        L_0x00bf:
            r3 = 2131231378; // 0x7f080292 float:1.8078835E38 double:1.052968207E-314;
            r5 = 2131886962; // 0x7f120372 float:1.9408518E38 double:1.0532921087E-314;
            if (r14 <= 0) goto L_0x0105;
        L_0x00c7:
            if (r2 <= 0) goto L_0x0105;
        L_0x00c9:
            r6 = new java.util.ArrayList;
            r6.<init>();
            r6 = (java.util.List) r6;
            r7 = new com.iqoption.fragment.assets.model.e;
            r13 = com.iqoption.fragment.assets.model.AssetCategoryType.FOREX_CLASSIC;
            r15 = 2131886483; // 0x7f120193 float:1.9407546E38 double:1.053291872E-314;
            r16 = 0;
            r17 = 8;
            r18 = 0;
            r12 = r7;
            r12.<init>(r13, r14, r15, r16, r17, r18);
            r6.add(r7);
            r7 = new com.iqoption.fragment.assets.model.e;
            r16 = com.iqoption.fragment.assets.model.AssetCategoryType.FOREX_INTRADAY;
            r18 = 2131887142; // 0x7f120426 float:1.9408883E38 double:1.0532921977E-314;
            r19 = 0;
            r20 = 8;
            r21 = 0;
            r15 = r7;
            r17 = r2;
            r15.<init>(r16, r17, r18, r19, r20, r21);
            r6.add(r7);
            r2 = new com.iqoption.fragment.assets.model.e;
            r7 = com.iqoption.fragment.assets.model.AssetCategoryType.FOREX;
            r2.<init>(r7, r5, r3, r6);
            r9.add(r2);
            goto L_0x0114;
        L_0x0105:
            if (r14 == 0) goto L_0x010d;
        L_0x0107:
            r2 = com.iqoption.fragment.assets.model.AssetCategoryType.FOREX_CLASSIC;
            com.iqoption.fragment.assets.model.q.a(r9, r14, r2, r5, r3);
            goto L_0x0114;
        L_0x010d:
            if (r2 == 0) goto L_0x0114;
        L_0x010f:
            r6 = com.iqoption.fragment.assets.model.AssetCategoryType.FOREX_INTRADAY;
            com.iqoption.fragment.assets.model.q.a(r9, r2, r6, r5, r3);
        L_0x0114:
            if (r1 == 0) goto L_0x014d;
        L_0x0116:
            r1 = com.iqoption.fragment.assets.model.AssetCategoryType.STOCKS;
            r2 = 2131888378; // 0x7f1208fa float:1.941139E38 double:1.0532928083E-314;
            r3 = 2131231382; // 0x7f080296 float:1.8078843E38 double:1.052968209E-314;
            com.iqoption.fragment.assets.model.q.a(r9, r8, r1, r2, r3);
            r1 = com.iqoption.fragment.assets.model.AssetCategoryType.ETF;
            r2 = 2131886870; // 0x7f120316 float:1.9408331E38 double:1.0532920633E-314;
            r3 = 2131231375; // 0x7f08028f float:1.807883E38 double:1.0529682057E-314;
            com.iqoption.fragment.assets.model.q.a(r9, r8, r1, r2, r3);
            r1 = com.iqoption.fragment.assets.model.AssetCategoryType.INDICES;
            r2 = 2131886083; // 0x7f120003 float:1.9406735E38 double:1.0532916745E-314;
            r3 = 2131231379; // 0x7f080293 float:1.8078837E38 double:1.0529682077E-314;
            com.iqoption.fragment.assets.model.q.a(r9, r8, r1, r2, r3);
            r1 = com.iqoption.fragment.assets.model.AssetCategoryType.BONDS;
            r2 = 2131886352; // 0x7f120110 float:1.940728E38 double:1.0532918074E-314;
            r3 = 2131231376; // 0x7f080290 float:1.8078831E38 double:1.052968206E-314;
            com.iqoption.fragment.assets.model.q.a(r9, r8, r1, r2, r3);
            r1 = com.iqoption.fragment.assets.model.AssetCategoryType.COMMODITIES;
            r2 = 2131886563; // 0x7f1201e3 float:1.9407708E38 double:1.0532919116E-314;
            r3 = 2131231377; // 0x7f080291 float:1.8078833E38 double:1.0529682067E-314;
            com.iqoption.fragment.assets.model.q.a(r9, r8, r1, r2, r3);
        L_0x014d:
            r1 = com.iqoption.core.features.instrument.b.Xw();
            if (r1 == 0) goto L_0x015e;
        L_0x0153:
            r1 = com.iqoption.fragment.assets.model.AssetCategoryType.CRYPTO;
            r2 = 2131886656; // 0x7f120240 float:1.9407897E38 double:1.0532919576E-314;
            r3 = 2131231383; // 0x7f080297 float:1.8078845E38 double:1.0529682097E-314;
            com.iqoption.fragment.assets.model.q.a(r9, r8, r1, r2, r3);
        L_0x015e:
            if (r11 != 0) goto L_0x01a6;
        L_0x0160:
            r1 = com.iqoption.core.d.EH();
            r2 = "more-trading-opportunities";
            r1 = r1.ej(r2);
            if (r1 == 0) goto L_0x01a6;
        L_0x016c:
            r1 = com.iqoption.core.d.EA();
            r2 = r1.Er();
            if (r2 == 0) goto L_0x017c;
        L_0x0176:
            r1 = r1.Ef();
            if (r1 == 0) goto L_0x017d;
        L_0x017c:
            r4 = 1;
        L_0x017d:
            if (r4 == 0) goto L_0x01a6;
        L_0x017f:
            r1 = new com.iqoption.fragment.assets.model.e;
            r12 = 0;
            r2 = 2131887539; // 0x7f1205b3 float:1.9409688E38 double:1.053292394E-314;
            r13 = com.iqoption.core.d.getString(r2);
            r14 = 2131231380; // 0x7f080294 float:1.807884E38 double:1.052968208E-314;
            r15 = 0;
            r16 = 0;
            r17 = 0;
            r18 = 0;
            r19 = 0;
            r20 = 0;
            r21 = 0;
            r22 = 2034; // 0x7f2 float:2.85E-42 double:1.005E-320;
            r23 = 0;
            r11 = "more";
            r10 = r1;
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
            r9.add(r1);
        L_0x01a6:
            r1 = new java.util.LinkedHashSet;
            r1.<init>();
            r1 = (java.util.Set) r1;
            r2 = r0.this$0;
            r2 = r2.dco;
            r3 = 0;
            if (r2 == 0) goto L_0x01bb;
        L_0x01b6:
            r2 = r2.name();
            goto L_0x01bc;
        L_0x01bb:
            r2 = r3;
        L_0x01bc:
            r2 = com.iqoption.fragment.assets.model.q.a(r9, r2, r1);
            if (r2 == 0) goto L_0x01c4;
        L_0x01c2:
            r3 = r2;
            goto L_0x01d0;
        L_0x01c4:
            r2 = r0.this$0;
            r2 = r2.dco;
            if (r2 == 0) goto L_0x01d0;
        L_0x01cc:
            r3 = com.iqoption.fragment.assets.model.q.a(r9, r3, r1);
        L_0x01d0:
            r2 = new com.iqoption.fragment.assets.model.l$a;
            r2.<init>(r9, r1, r3);
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.assets.model.l$b.apply(java.util.Map):com.iqoption.fragment.assets.model.l$a");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lkotlin/Function1;", "Lcom/iqoption/fragment/assets/model/AssetModelImpl$CategoriesState;", "initial", "sortings", "", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "apply"})
    /* compiled from: AssetsModelImpl.kt */
    static final class c<T1, T2, R> implements io.reactivex.b.c<a, Map<AssetCategoryType, ? extends p>, kotlin.jvm.a.b<? super a, ? extends a>> {
        public static final c dct = new c();

        c() {
        }

        /* renamed from: a */
        public final kotlin.jvm.a.b<a, a> apply(a aVar, Map<AssetCategoryType, p> map) {
            kotlin.jvm.internal.i.f(aVar, "initial");
            kotlin.jvm.internal.i.f(map, "sortings");
            return new AssetModelImpl$categoriesListMutatorFlowable$2$1(aVar, map);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a.\u0012\u0004\u0012\u00020\u0002\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00030\u000122\u0010\u0007\u001a.\u0012\u0004\u0012\u00020\u0002\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00030\u0003H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "kotlin.jvm.PlatformType", "assetsMap", "apply"})
    /* compiled from: AssetsModelImpl.kt */
    static final class d<T, R> implements io.reactivex.b.g<T, R> {
        public static final d dcz = new d();

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "kotlin.jvm.PlatformType", "oldValue", "newValue", "apply"})
        /* compiled from: AssetsModelImpl.kt */
        static final class a<A, B, C> implements com.iqoption.core.util.w.a<V, V, V> {
            final /* synthetic */ long $timeSync;

            a(long j) {
                this.$timeSync = j;
            }

            /* renamed from: c */
            public final com.iqoption.core.microservices.tradingengine.response.active.a apply(com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar2) {
                return ((!aVar2.aX(this.$timeSync) || aVar2.isSuspended()) && aVar.aX(this.$timeSync) && !aVar.isSuspended()) ? aVar : aVar2;
            }
        }

        d() {
        }

        /* renamed from: x */
        public final Map<InstrumentType, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>> apply(Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>> map) {
            kotlin.jvm.internal.i.f(map, "assetsMap");
            Map V = af.V(map);
            Map map2 = (Map) V.remove(InstrumentType.TURBO_INSTRUMENT);
            if (map2 != null) {
                Map map3 = (Map) V.get(InstrumentType.BINARY_INSTRUMENT);
                if (map3 != null) {
                    map2 = (Map) V.put(InstrumentType.BINARY_INSTRUMENT, w.a(af.V(map3), map2, new a(com.iqoption.core.d.EB().If())));
                }
            }
            return V;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "it", "Lcom/iqoption/fragment/assets/model/AssetModelImpl$CategoriesState;", "apply"})
    /* compiled from: AssetsModelImpl.kt */
    static final class e<T, R> implements io.reactivex.b.g<T, R> {
        public static final e dcB = new e();

        e() {
        }

        /* renamed from: c */
        public final List<e> apply(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.ava();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/features/deal/LeveragesLimitParams;", "result", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/features/response/Feature;", "apply"})
    /* compiled from: AssetsModelImpl.kt */
    static final class f<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ l this$0;

        f(l lVar) {
            this.this$0 = lVar;
        }

        /* renamed from: e */
        public final com.iqoption.core.features.a.b apply(z<com.iqoption.core.microservices.features.a.a> zVar) {
            kotlin.jvm.internal.i.f(zVar, "result");
            com.iqoption.core.microservices.features.a.a aVar = (com.iqoption.core.microservices.features.a.a) zVar.anw();
            l lVar = this.this$0;
            Object obj = (aVar == null || !aVar.isEnabled() || aVar.ady().isJsonNull()) ? null : 1;
            if (obj == null) {
                lVar = null;
            }
            if (lVar != null) {
                if (aVar == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                com.iqoption.core.features.a.b bVar = (com.iqoption.core.features.a.b) com.iqoption.core.ext.d.a(aVar.ady(), com.iqoption.core.features.a.b.class, null, 2, null);
                if (bVar != null) {
                    return bVar;
                }
            }
            return com.iqoption.core.features.a.b.bhp.Xp();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lkotlin/Function2;", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "Lcom/iqoption/core/data/model/InstrumentType;", "", "Lcom/iqoption/fragment/assets/model/MaxLeverageSupplier;", "leveragesLimitParams", "Lcom/iqoption/core/features/deal/LeveragesLimitParams;", "apply"})
    /* compiled from: AssetsModelImpl.kt */
    static final class g<T, R> implements io.reactivex.b.g<T, R> {
        public static final g dcC = new g();

        g() {
        }

        /* renamed from: a */
        public final m<com.iqoption.core.microservices.tradingengine.response.b.a, InstrumentType, Integer> apply(com.iqoption.core.features.a.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "leveragesLimitParams");
            return q.b(bVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/fragment/assets/model/AssetModelImpl$CategoriesState;", "test"})
    /* compiled from: AssetsModelImpl.kt */
    static final class h<T> implements io.reactivex.b.l<a> {
        public static final h dcD = new h();

        h() {
        }

        /* renamed from: b */
        public final boolean test(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.aBr() != null;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "it", "Lcom/iqoption/fragment/assets/model/AssetModelImpl$CategoriesState;", "apply"})
    /* compiled from: AssetsModelImpl.kt */
    static final class i<T, R> implements io.reactivex.b.g<T, R> {
        public static final i dcE = new i();

        i() {
        }

        /* renamed from: d */
        public final e apply(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            e aBr = aVar.aBr();
            if (aBr == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            return aBr;
        }
    }

    public l() {
        this(null, 1, null);
    }

    private final io.reactivex.e<a> aBe() {
        kotlin.d dVar = this.dcm;
        j jVar = anY[0];
        return (io.reactivex.e) dVar.getValue();
    }

    private final io.reactivex.e<f> aBg() {
        kotlin.d dVar = this.dcn;
        j jVar = anY[1];
        return (io.reactivex.e) dVar.getValue();
    }

    public l(AssetCategoryType assetCategoryType) {
        this.dco = assetCategoryType;
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<…te) -> CategoriesState>()");
        this.dcl = bmK;
        this.dcm = g.c(new AssetModelImpl$categoriesStateFlowable$2(this));
        BehaviorProcessor cX = BehaviorProcessor.cX("");
        kotlin.jvm.internal.i.e(cX, "BehaviorProcessor.createDefault<CharSequence>(\"\")");
        this.aLY = cX;
        this.dcn = g.c(new AssetModelImpl$categoryInfoFlowable$2(this));
    }

    public /* synthetic */ l(AssetCategoryType assetCategoryType, int i, f fVar) {
        if ((i & 1) != 0) {
            assetCategoryType = (AssetCategoryType) null;
        }
        this(assetCategoryType);
    }

    private final io.reactivex.e<kotlin.jvm.a.b<a, a>> aBc() {
        io.reactivex.e a = io.reactivex.e.a((org.a.b) aBk().g(new t()).bkT().g(new b(this)), (org.a.b) aBj(), (io.reactivex.b.c) c.dct);
        kotlin.jvm.internal.i.e(a, "Flowable.combineLatest(\n…              }\n        )");
        return a;
    }

    private final io.reactivex.e<kotlin.jvm.a.b<a, a>> aBd() {
        io.reactivex.e c = this.dcl.c(com.iqoption.core.rx.i.aki());
        kotlin.jvm.internal.i.e(c, "categoriesMutatorProcess…           .observeOn(bg)");
        return c;
    }

    private final io.reactivex.e<CharSequence> aBf() {
        io.reactivex.e i = this.aLY.c(com.iqoption.core.rx.i.aki()).i(250, TimeUnit.MILLISECONDS);
        kotlin.jvm.internal.i.e(i, "searchConstraintProcesso…0, TimeUnit.MILLISECONDS)");
        return i;
    }

    private final u<Map<InstrumentType, ? extends Map<Integer, com.iqoption.core.microservices.risks.response.markup.a>>, e, m<? super com.iqoption.core.microservices.tradingengine.response.b.a, ? super InstrumentType, Integer>, Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>>, Map<InstrumentType, ? extends Map<Integer, com.iqoption.core.microservices.tradingengine.response.b.a>>, Map<InstrumentType, ? extends Map<Integer, com.iqoption.core.microservices.f.a.a.a>>, Map<InstrumentType, ? extends Set<Integer>>, kotlin.jvm.a.b<CharSequence, f>> aBh() {
        return AssetModelImpl$getAssetsCombiner$1.dcA;
    }

    private final io.reactivex.e<m<com.iqoption.core.microservices.tradingengine.response.b.a, InstrumentType, Integer>> aBi() {
        io.reactivex.e g = com.iqoption.core.d.EH().el("hide-big-leverages").g(new f(this)).c(com.iqoption.core.rx.i.aki()).bkT().g(g.dcC);
        kotlin.jvm.internal.i.e(g, "features.observeFeature(…Params)\n                }");
        return g;
    }

    private final io.reactivex.e<Map<AssetCategoryType, p>> aBj() {
        return com.iqoption.fragment.assets.a.daH.aAg().aAf();
    }

    private final io.reactivex.e<Map<InstrumentType, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>>> aBk() {
        List knownValues = InstrumentType.Companion.getKnownValues();
        Iterable<InstrumentType> iterable = knownValues;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (InstrumentType n : iterable) {
            arrayList.add(com.iqoption.asset.b.a.awZ.n(n).cF(af.emptyMap()));
        }
        io.reactivex.e g = com.iqoption.core.rx.g.i(knownValues, (List) arrayList).g(d.dcz);
        kotlin.jvm.internal.i.e(g, "combineToMap(instrumentT…          }\n            }");
        kotlin.jvm.internal.i.e(g, "InstrumentType.getKnownV…}\n            }\n        }");
        return g;
    }

    private final io.reactivex.e<Map<InstrumentType, Map<Integer, com.iqoption.core.microservices.tradingengine.response.b.a>>> aBl() {
        List knownValues = InstrumentType.Companion.getKnownValues();
        Iterable<InstrumentType> iterable = knownValues;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (InstrumentType q : iterable) {
            arrayList.add(com.iqoption.asset.b.a.awZ.q(q));
        }
        return com.iqoption.core.rx.g.i(knownValues, (List) arrayList);
    }

    private final io.reactivex.e<Map<InstrumentType, Map<Integer, com.iqoption.core.microservices.f.a.a.a>>> aBm() {
        List knownValues = InstrumentType.Companion.getKnownValues();
        Iterable<InstrumentType> iterable = knownValues;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (InstrumentType p : iterable) {
            arrayList.add(com.iqoption.asset.b.a.awZ.p(p));
        }
        io.reactivex.e i = com.iqoption.core.rx.g.i(knownValues, (List) arrayList).i(100, TimeUnit.MILLISECONDS);
        kotlin.jvm.internal.i.e(i, "InstrumentType.getKnownV…0, TimeUnit.MILLISECONDS)");
        return i;
    }

    private final io.reactivex.e<Map<InstrumentType, Set<Integer>>> JZ() {
        List knownValues = InstrumentType.Companion.getKnownValues();
        Iterable<InstrumentType> iterable = knownValues;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (InstrumentType s : iterable) {
            arrayList.add(com.iqoption.asset.b.a.awZ.s(s));
        }
        return com.iqoption.core.rx.g.i(knownValues, (List) arrayList);
    }

    private final io.reactivex.e<Map<InstrumentType, Map<Integer, com.iqoption.core.microservices.risks.response.markup.a>>> aBn() {
        List knownValues = InstrumentType.Companion.getKnownValues();
        Iterable<InstrumentType> iterable = knownValues;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (InstrumentType x : iterable) {
            arrayList.add(com.iqoption.asset.c.b.axz.x(x));
        }
        return com.iqoption.core.rx.g.i(knownValues, (List) arrayList);
    }

    private final io.reactivex.e<e> aBo() {
        io.reactivex.e g = aBe().b((io.reactivex.b.l) h.dcD).g(i.dcE);
        kotlin.jvm.internal.i.e(g, "categoriesStateFlowable\n…   .map { it.selected!! }");
        return g;
    }

    public io.reactivex.e<List<e>> aBp() {
        io.reactivex.e bkT = aBe().g(e.dcB).c(com.iqoption.core.rx.i.aki()).bkT();
        kotlin.jvm.internal.i.e(bkT, "categoriesStateFlowable\n…  .distinctUntilChanged()");
        return bkT;
    }

    public io.reactivex.e<f> aBq() {
        return aBg();
    }

    public void d(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "category");
        this.dcl.onNext(new AssetModelImpl$toggleCategory$1(eVar));
    }

    public void e(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "category");
        this.dcl.onNext(new AssetModelImpl$selectCategory$1(eVar));
    }

    public void M(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "constraint");
        this.aLY.onNext(charSequence);
    }

    public void f(p pVar) {
        kotlin.jvm.internal.i.f(pVar, "sorting");
        com.iqoption.fragment.assets.a.daH.aAg().a(pVar);
    }

    public void i(k kVar) {
        kotlin.jvm.internal.i.f(kVar, "item");
        if (kVar.QE()) {
            com.iqoption.asset.b.a.awZ.c(kVar.Bs(), kVar.getInstrumentType());
        } else {
            com.iqoption.asset.b.a.awZ.b(kVar.Bs(), kVar.getInstrumentType());
        }
    }
}
