package com.iqoption.asset.repository;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.e;
import io.reactivex.b.g;
import java.util.Set;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "", "kotlin.jvm.PlatformType", "account", "Lcom/iqoption/core/IQAccount;", "invoke"})
/* compiled from: AssetFavoritesRepository.kt */
final class AssetFavoritesRepository$favoritesStreams$1$streamFactory$1 extends Lambda implements b<e, io.reactivex.e<Set<? extends Integer>>> {
    final /* synthetic */ InstrumentType $instrumentType;

    AssetFavoritesRepository$favoritesStreams$1$streamFactory$1(InstrumentType instrumentType) {
        this.$instrumentType = instrumentType;
        super(1);
    }

    /* renamed from: a */
    public final io.reactivex.e<Set<Integer>> invoke(final e eVar) {
        kotlin.jvm.internal.i.f(eVar, "account");
        return a.ayc.c(com.iqoption.core.rx.i.aki()).g(new g<T, R>(this) {
            final /* synthetic */ AssetFavoritesRepository$favoritesStreams$1$streamFactory$1 ayh;

            /* renamed from: i */
            public final Set<Integer> apply(Boolean bool) {
                kotlin.jvm.internal.i.f(bool, "it");
                return a.aye.at(eVar.getUserId()).z(this.ayh.$instrumentType);
            }
        });
    }
}
