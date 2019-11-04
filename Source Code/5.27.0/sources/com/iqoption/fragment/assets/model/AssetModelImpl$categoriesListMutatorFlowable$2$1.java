package com.iqoption.fragment.assets.model;

import java.util.List;
import java.util.Map;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lcom/iqoption/fragment/assets/model/AssetModelImpl$CategoriesState;", "state", "invoke"})
/* compiled from: AssetsModelImpl.kt */
final class AssetModelImpl$categoriesListMutatorFlowable$2$1 extends Lambda implements b<a, a> {
    final /* synthetic */ a $initial;
    final /* synthetic */ Map $sortings;

    AssetModelImpl$categoriesListMutatorFlowable$2$1(a aVar, Map map) {
        this.$initial = aVar;
        this.$sortings = map;
        super(1);
    }

    /* renamed from: a */
    public final a invoke(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "state");
        String str = "sortings";
        if (aVar.isEmpty()) {
            a aVar2 = this.$initial;
            List aBs = aVar2.aBs();
            Map map = this.$sortings;
            kotlin.jvm.internal.i.e(map, str);
            aBs = q.b(aBs, map);
            if (aBs == null) {
                aBs = this.$initial.aBs();
            }
            return a.a(aVar2, aBs, null, null, 6, null);
        }
        List aBs2 = this.$initial.aBs();
        Map map2 = this.$sortings;
        kotlin.jvm.internal.i.e(map2, str);
        aBs2 = q.b(aBs2, map2);
        if (aBs2 == null) {
            aBs2 = this.$initial.aBs();
        }
        return a.a(aVar, aBs2, null, null, 6, null);
    }
}
