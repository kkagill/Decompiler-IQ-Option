package com.iqoption.fragment.assets;

import com.iqoption.core.manager.ac;
import com.iqoption.core.rx.a.a;
import com.iqoption.core.util.z;
import com.iqoption.fragment.assets.model.AssetCategoryType;
import com.iqoption.fragment.assets.model.p;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "categoryType", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "invoke"})
/* compiled from: AssetSortingRepository.kt */
final class AssetSortingRepository$sortingStreams$1 extends Lambda implements b<AssetCategoryType, a<z<p>, p>> {
    final /* synthetic */ a this$0;

    AssetSortingRepository$sortingStreams$1(a aVar) {
        this.this$0 = aVar;
        super(1);
    }

    /* renamed from: e */
    public final a<z<p>, p> invoke(AssetCategoryType assetCategoryType) {
        kotlin.jvm.internal.i.f(assetCategoryType, "categoryType");
        b assetSortingRepository$sortingStreams$1$streamFactory$1 = new AssetSortingRepository$sortingStreams$1$streamFactory$1(this, this.this$0.a(assetCategoryType), assetCategoryType);
        ac acVar = ac.bkp;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sorting stream { categoryType=");
        stringBuilder.append(assetCategoryType);
        stringBuilder.append(" }");
        return ac.a(acVar, stringBuilder.toString(), assetSortingRepository$sortingStreams$1$streamFactory$1, com.iqoption.core.manager.i.bjd.Yr(), com.iqoption.core.manager.i.bjd.Yh(), 0, null, 48, null);
    }
}
