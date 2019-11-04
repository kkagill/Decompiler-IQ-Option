package com.iqoption.asset.repository;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.manager.ac;
import com.iqoption.core.rx.a.a;
import com.iqoption.core.util.z;
import java.util.Set;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a0\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "invoke"})
/* compiled from: AssetFavoritesRepository.kt */
final class AssetFavoritesRepository$favoritesStreams$1 extends Lambda implements b<InstrumentType, a<z<Set<? extends Integer>>, Set<? extends Integer>>> {
    public static final AssetFavoritesRepository$favoritesStreams$1 ayg = new AssetFavoritesRepository$favoritesStreams$1();

    AssetFavoritesRepository$favoritesStreams$1() {
        super(1);
    }

    /* renamed from: A */
    public final a<z<Set<Integer>>, Set<Integer>> invoke(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        b assetFavoritesRepository$favoritesStreams$1$streamFactory$1 = new AssetFavoritesRepository$favoritesStreams$1$streamFactory$1(instrumentType);
        ac acVar = ac.bkp;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Favorites: ");
        stringBuilder.append(instrumentType);
        return ac.a(acVar, stringBuilder.toString(), assetFavoritesRepository$favoritesStreams$1$streamFactory$1, com.iqoption.core.manager.i.bjd.Yr(), com.iqoption.core.manager.i.bjd.Yh(), 0, null, 48, null);
    }
}
