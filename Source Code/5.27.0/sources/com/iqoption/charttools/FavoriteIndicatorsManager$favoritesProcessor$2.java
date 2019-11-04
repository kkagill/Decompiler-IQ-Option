package com.iqoption.charttools;

import com.iqoption.charttools.model.indicator.x;
import com.iqoption.core.rx.d;
import io.reactivex.b.f;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/IQBehaviorProcessor;", "", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "invoke"})
/* compiled from: FavoriteIndicatorsManager.kt */
final class FavoriteIndicatorsManager$favoritesProcessor$2 extends Lambda implements kotlin.jvm.a.a<d<List<? extends x>>> {
    public static final FavoriteIndicatorsManager$favoritesProcessor$2 aDu = new FavoriteIndicatorsManager$favoritesProcessor$2();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "library", "Lcom/iqoption/charttools/IndicatorsLibrary;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: FavoriteIndicatorsManager.kt */
    static final class a<T> implements f<j> {
        final /* synthetic */ d aDv;

        a(d dVar) {
            this.aDv = dVar;
        }

        /* JADX WARNING: Missing block: B:3:0x001c, code skipped:
            if (r5 != null) goto L_0x0023;
     */
        /* renamed from: b */
        public final void accept(com.iqoption.charttools.j r5) {
            /*
            r4 = this;
            r0 = com.iqoption.charttools.i.aDs;
            r0 = com.iqoption.charttools.i.ayf;
            r1 = 0;
            r2 = "uids";
            r3 = 2;
            r0 = com.iqoption.core.data.d.c.b.a(r0, r2, r1, r3, r1);
            if (r0 == 0) goto L_0x001f;
        L_0x0011:
            r1 = com.iqoption.charttools.i.aDs;
            r2 = "library";
            kotlin.jvm.internal.i.e(r5, r2);
            r5 = r1.a(r0, r5);
            if (r5 == 0) goto L_0x001f;
        L_0x001e:
            goto L_0x0023;
        L_0x001f:
            r5 = kotlin.collections.m.emptyList();
        L_0x0023:
            r0 = r4.aDv;
            r0.onNext(r5);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.charttools.FavoriteIndicatorsManager$favoritesProcessor$2$a.accept(com.iqoption.charttools.j):void");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: FavoriteIndicatorsManager.kt */
    static final class b<T> implements f<Throwable> {
        public static final b aDw = new b();

        b() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    FavoriteIndicatorsManager$favoritesProcessor$2() {
        super(0);
    }

    /* renamed from: Mj */
    public final d<List<x>> invoke() {
        d akd = d.bER.akd();
        k.aDB.Mn().h(com.iqoption.core.rx.i.aki()).a((f) new a(akd), (f) b.aDw);
        return akd;
    }
}
