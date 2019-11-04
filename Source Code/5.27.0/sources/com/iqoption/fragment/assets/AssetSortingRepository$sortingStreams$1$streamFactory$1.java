package com.iqoption.fragment.assets;

import com.iqoption.core.e;
import com.iqoption.fragment.assets.model.AssetCategoryType;
import com.iqoption.fragment.assets.model.p;
import io.reactivex.b.g;
import io.reactivex.processors.BehaviorProcessor;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "kotlin.jvm.PlatformType", "account", "Lcom/iqoption/core/IQAccount;", "invoke"})
/* compiled from: AssetSortingRepository.kt */
final class AssetSortingRepository$sortingStreams$1$streamFactory$1 extends Lambda implements b<e, io.reactivex.e<p>> {
    final /* synthetic */ AssetCategoryType $categoryType;
    final /* synthetic */ BehaviorProcessor $reloader;
    final /* synthetic */ AssetSortingRepository$sortingStreams$1 this$0;

    AssetSortingRepository$sortingStreams$1$streamFactory$1(AssetSortingRepository$sortingStreams$1 assetSortingRepository$sortingStreams$1, BehaviorProcessor behaviorProcessor, AssetCategoryType assetCategoryType) {
        this.this$0 = assetSortingRepository$sortingStreams$1;
        this.$reloader = behaviorProcessor;
        this.$categoryType = assetCategoryType;
        super(1);
    }

    /* renamed from: a */
    public final io.reactivex.e<p> invoke(final e eVar) {
        kotlin.jvm.internal.i.f(eVar, "account");
        return this.$reloader.c(com.iqoption.core.rx.i.aki()).g(new g<T, R>(this) {
            final /* synthetic */ AssetSortingRepository$sortingStreams$1$streamFactory$1 daJ;

            /* renamed from: p */
            public final p apply(Boolean bool) {
                kotlin.jvm.internal.i.f(bool, "it");
                return this.daJ.this$0.this$0.bF(eVar.getUserId()).d(this.daJ.$categoryType);
            }
        });
    }
}
