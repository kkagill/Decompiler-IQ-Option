package com.iqoption.fragment.assets.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "Lcom/iqoption/fragment/assets/model/AssetCategory;", "invoke"})
/* compiled from: AssetsModelImpl.kt */
final class AssetModelImpl$CategoriesState$list$2 extends Lambda implements a<List<e>> {
    final /* synthetic */ a this$0;

    AssetModelImpl$CategoriesState$list$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<e> invoke() {
        List arrayList = new ArrayList();
        int size = this.this$0.aBs().size();
        for (int i = 0; i < size; i++) {
            a aVar = this.this$0;
            aVar.a(arrayList, (e) aVar.aBs().get(i));
        }
        return arrayList;
    }
}
