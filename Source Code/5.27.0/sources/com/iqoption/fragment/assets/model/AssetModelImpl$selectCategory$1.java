package com.iqoption.fragment.assets.model;

import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lcom/iqoption/fragment/assets/model/AssetModelImpl$CategoriesState;", "state", "invoke"})
/* compiled from: AssetsModelImpl.kt */
final class AssetModelImpl$selectCategory$1 extends Lambda implements b<a, a> {
    final /* synthetic */ e $category;

    AssetModelImpl$selectCategory$1(e eVar) {
        this.$category = eVar;
        super(1);
    }

    /* renamed from: a */
    public final a invoke(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "state");
        if ((kotlin.jvm.internal.i.y(aVar.aqw(), this.$category.getId()) ^ 1) == 0) {
            return aVar;
        }
        return a.a(aVar, null, null, this.$category.getId(), 3, null);
    }
}
