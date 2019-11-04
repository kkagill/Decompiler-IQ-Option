package com.iqoption.charttools;

import com.iqoption.charttools.model.indicator.x;
import io.reactivex.b.f;
import io.reactivex.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R'\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, bng = {"Lcom/iqoption/charttools/FavoriteIndicatorsManager;", "", "()V", "PREF_KEY", "", "PREF_NAME", "TAG", "kotlin.jvm.PlatformType", "favoritesProcessor", "Lcom/iqoption/core/rx/IQBehaviorProcessor;", "", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "getFavoritesProcessor", "()Lcom/iqoption/core/rx/IQBehaviorProcessor;", "favoritesProcessor$delegate", "Lkotlin/Lazy;", "prefs", "Lcom/iqoption/core/data/prefs/SharedPrefs;", "add", "Lio/reactivex/Completable;", "meta", "getFavorites", "Lio/reactivex/Flowable;", "remove", "deserialize", "library", "Lcom/iqoption/charttools/IndicatorsLibrary;", "serialize", "techtools_release"})
/* compiled from: FavoriteIndicatorsManager.kt */
public final class i {
    private static final String TAG = i.class.getSimpleName();
    private static final d aDr = g.c(FavoriteIndicatorsManager$favoritesProcessor$2.aDu);
    public static final i aDs = new i();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(i.class), "favoritesProcessor", "getFavoritesProcessor()Lcom/iqoption/core/rx/IQBehaviorProcessor;"))};
    private static final com.iqoption.core.data.d.d ayf = new com.iqoption.core.data.d.d("favorite_indicators");

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "favorites", "", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: FavoriteIndicatorsManager.kt */
    static final class a<T> implements f<List<? extends x>> {
        final /* synthetic */ x aDt;

        a(x xVar) {
            this.aDt = xVar;
        }

        /* renamed from: v */
        public final void accept(List<? extends x> list) {
            if (!list.contains(this.aDt)) {
                kotlin.jvm.internal.i.e(list, "favorites");
                List i = u.i((Collection) list, (Object) this.aDt);
                i.aDs.Mi().onNext(i);
                i.ayf.put("uids", i.aDs.Q(i));
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "favorites", "", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: FavoriteIndicatorsManager.kt */
    static final class b<T> implements f<List<? extends x>> {
        final /* synthetic */ x aDt;

        b(x xVar) {
            this.aDt = xVar;
        }

        /* renamed from: v */
        public final void accept(List<? extends x> list) {
            if (list.contains(this.aDt)) {
                kotlin.jvm.internal.i.e(list, "favorites");
                List d = u.d((Iterable) list, (Object) this.aDt);
                i.aDs.Mi().onNext(d);
                i.ayf.put("uids", i.aDs.Q(d));
            }
        }
    }

    private final com.iqoption.core.rx.d<List<x>> Mi() {
        d dVar = aDr;
        j jVar = anY[0];
        return (com.iqoption.core.rx.d) dVar.getValue();
    }

    private i() {
    }

    private final String Q(List<? extends x> list) {
        return u.a(list, "|", null, null, 0, null, FavoriteIndicatorsManager$serialize$1.aDx, 30, null);
    }

    private final List<x> a(String str, j jVar) {
        Collection arrayList = new ArrayList();
        for (String str2 : v.b((CharSequence) str, new String[]{"|"}, false, 0, 6, null)) {
            for (Object next : jVar.LV()) {
                if (kotlin.jvm.internal.i.y(((x) next).Or(), str2)) {
                    break;
                }
            }
            Object next2 = null;
            x xVar = (x) next2;
            if (xVar != null) {
                arrayList.add(xVar);
            }
        }
        return (List) arrayList;
    }

    public final e<List<x>> JZ() {
        return Mi();
    }

    public final io.reactivex.a a(x xVar) {
        kotlin.jvm.internal.i.f(xVar, "meta");
        io.reactivex.a blf = Mi().bkV().h((f) new a(xVar)).blf();
        kotlin.jvm.internal.i.e(blf, "favoritesProcessor\n     …         .ignoreElement()");
        return blf;
    }

    public final io.reactivex.a b(x xVar) {
        kotlin.jvm.internal.i.f(xVar, "meta");
        io.reactivex.a blf = Mi().bkV().h((f) new b(xVar)).blf();
        kotlin.jvm.internal.i.e(blf, "favoritesProcessor\n     …         .ignoreElement()");
        return blf;
    }
}
