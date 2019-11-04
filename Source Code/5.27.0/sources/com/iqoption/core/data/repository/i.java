package com.iqoption.core.data.repository;

import androidx.collection.LruCache;
import com.iqoption.core.data.model.f;
import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.p;
import io.reactivex.t;
import java.util.List;
import kotlin.Pair;
import kotlin.j;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/core/data/repository/UserProfileRepository;", "", "()V", "cache", "Landroidx/collection/LruCache;", "", "Lcom/iqoption/core/data/model/UserProfile;", "getUserProfile", "Lio/reactivex/Single;", "id", "core_release"})
/* compiled from: UserProfileRepository.kt */
public final class i {
    public static final i bfa = new i();
    private static final LruCache<Long, f> hw = new LruCache(100);

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lcom/iqoption/core/data/model/UserProfile;", "availability", "Lcom/iqoption/core/microservices/useronline/response/UserAvailability;", "<name for destructuring parameter 1>", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/socialuserprofile/response/UserProfileClient;", "Lcom/iqoption/core/microservices/configuration/response/Country;", "apply"})
    /* compiled from: UserProfileRepository.kt */
    static final class a<T1, T2, R> implements io.reactivex.b.c<com.iqoption.core.microservices.h.a.a, Pair<? extends com.iqoption.core.microservices.e.a.a, ? extends com.iqoption.core.microservices.configuration.a.c>, f> {
        public static final a bfb = new a();

        a() {
        }

        /* renamed from: a */
        public final f apply(com.iqoption.core.microservices.h.a.a aVar, Pair<com.iqoption.core.microservices.e.a.a, com.iqoption.core.microservices.configuration.a.c> pair) {
            kotlin.jvm.internal.i.f(aVar, "availability");
            kotlin.jvm.internal.i.f(pair, "<name for destructuring parameter 1>");
            com.iqoption.core.microservices.e.a.a aVar2 = (com.iqoption.core.microservices.e.a.a) pair.bnj();
            return new f(aVar2.getUserId(), aVar2.getUserName(), (com.iqoption.core.microservices.configuration.a.c) pair.bnk(), aVar2.aga(), aVar2.Ui(), kotlin.jvm.internal.i.y(aVar.getStatus(), "online"), aVar2.Em());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/data/model/UserProfile;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: UserProfileRepository.kt */
    static final class b<T> implements io.reactivex.b.f<f> {
        final /* synthetic */ long aCI;

        b(long j) {
            this.aCI = j;
        }

        /* renamed from: a */
        public final void accept(f fVar) {
            i.hw.put(Long.valueOf(this.aCI), fVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/useronline/response/UserAvailability;", "it", "", "apply"})
    /* compiled from: UserProfileRepository.kt */
    static final class c<T, R> implements g<T, R> {
        public static final c bfc = new c();

        c() {
        }

        /* renamed from: ak */
        public final com.iqoption.core.microservices.h.a.a apply(List<com.iqoption.core.microservices.h.a.a> list) {
            kotlin.jvm.internal.i.f(list, "it");
            return (com.iqoption.core.microservices.h.a.a) u.bU(list);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a.\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/socialuserprofile/response/UserProfileClient;", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "userProfileClient", "apply"})
    /* compiled from: UserProfileRepository.kt */
    static final class d<T, R> implements g<T, t<? extends R>> {
        public static final d bfd = new d();

        d() {
        }

        /* renamed from: a */
        public final p<? extends Pair<com.iqoption.core.microservices.e.a.a, com.iqoption.core.microservices.configuration.a.c>> apply(final com.iqoption.core.microservices.e.a.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "userProfileClient");
            if (aVar.El() != -1) {
                p<? extends Pair<com.iqoption.core.microservices.e.a.a, com.iqoption.core.microservices.configuration.a.c>> b = c.bdy.aJ(aVar.El()).p(new g<T, R>() {
                    /* renamed from: a */
                    public final Pair<com.iqoption.core.microservices.e.a.a, com.iqoption.core.microservices.configuration.a.c> apply(com.iqoption.core.microservices.configuration.a.c cVar) {
                        kotlin.jvm.internal.i.f(cVar, "it");
                        return new Pair(aVar, cVar);
                    }
                }).b((t) p.cI(new Pair(aVar, null)));
                kotlin.jvm.internal.i.e(b, "GeneralRepository\n      …serProfileClient, null)))");
                return b;
            }
            p cI = p.cI(j.x(aVar, null));
            kotlin.jvm.internal.i.e(cI, "Single.just(userProfileClient to null)");
            return cI;
        }
    }

    private i() {
    }

    public final p<f> aO(long j) {
        f fVar = (f) hw.get(Long.valueOf(j));
        p cI;
        if (fVar != null) {
            cI = p.cI(fVar);
            kotlin.jvm.internal.i.e(cI, "Single.just(cached)");
            return cI;
        }
        e bkO = com.iqoption.core.microservices.h.a.bDf.a(j).t(c.bfc).bkO();
        e bkO2 = com.iqoption.core.microservices.e.a.byD.aO(j).q(d.bfd).bkO();
        kotlin.jvm.internal.i.e(bkO, "userAvailabilityStream");
        kotlin.jvm.internal.i.e(bkO2, "userProfileWithCountryStream");
        cI = com.iqoption.core.rx.g.a(bkO, bkO2, a.bfb).bkV().h((io.reactivex.b.f) new b(j));
        kotlin.jvm.internal.i.e(cI, "combineFlowables<UserAva…ess { cache.put(id, it) }");
        return cI;
    }
}
