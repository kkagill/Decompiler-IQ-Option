package com.iqoption.charttools;

import com.google.android.gms.common.internal.ImagesContract;
import com.iqoption.core.gl.ChartLibrary;
import com.iqoption.core.manager.ac;
import com.iqoption.core.microservices.techinstruments.a.d;
import com.iqoption.core.microservices.videoeducation.response.g;
import com.iqoption.core.util.z;
import io.reactivex.b.c;
import io.reactivex.b.f;
import io.reactivex.e;
import io.reactivex.p;
import io.reactivex.t;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import org.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a6\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001j\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003`\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/charttools/IndicatorsLibrary;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "invoke"})
/* compiled from: IndicatorsLibraryManager.kt */
final class IndicatorsLibraryManager$libraryStreamSupplier$2 extends Lambda implements kotlin.jvm.a.a<com.iqoption.core.rx.a.a<z<j>, j>> {
    public static final IndicatorsLibraryManager$libraryStreamSupplier$2 aDI = new IndicatorsLibraryManager$libraryStreamSupplier$2();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/charttools/MergedLibrary;", "remote", "Lcom/iqoption/charttools/RemoteLibrary;", "local", "Lcom/iqoption/charttools/LocalLibrary;", "apply"})
    /* compiled from: IndicatorsLibraryManager.kt */
    static final class a<T1, T2, R> implements c<o, l, j> {
        public static final a aDU = new a();

        a() {
        }

        /* renamed from: a */
        public final m apply(o oVar, l lVar) {
            kotlin.jvm.internal.i.f(oVar, "remote");
            kotlin.jvm.internal.i.f(lVar, ImagesContract.LOCAL);
            return new m(oVar, lVar);
        }
    }

    IndicatorsLibraryManager$libraryStreamSupplier$2() {
        super(0);
    }

    /* renamed from: AX */
    public final com.iqoption.core.rx.a.a<z<j>, j> invoke() {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.aDJ;
        AnonymousClass2 anonymousClass2 = AnonymousClass2.aDO;
        final long scriptedRuntimeVersion = ChartLibrary.getScriptedRuntimeVersion();
        AnonymousClass3 anonymousClass3 = new m<Long, Long, p<o>>() {
            public /* synthetic */ Object w(Object obj, Object obj2) {
                return l(((Number) obj).longValue(), ((Number) obj2).longValue());
            }

            public static /* synthetic */ p a(AnonymousClass3 anonymousClass3, long j, long j2, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = b.aDG.Mo();
                }
                if ((i & 2) != 0) {
                    j2 = scriptedRuntimeVersion;
                }
                return anonymousClass3.l(j, j2);
            }

            public final p<o> l(long j, final long j2) {
                p cJ = p.a(com.iqoption.core.microservices.techinstruments.a.byN.a(j, Long.valueOf(j2)), com.iqoption.videoeducation.i.ajk().cJ(m.emptyList()), new c<d, List<? extends g>, p<o>>(this) {
                    final /* synthetic */ AnonymousClass3 aDP;

                    /* renamed from: a */
                    public final p<o> apply(d dVar, List<g> list) {
                        kotlin.jvm.internal.i.f(dVar, "standardLibrary");
                        kotlin.jvm.internal.i.f(list, "videos");
                        long version = dVar.getVersion();
                        com.iqoption.core.microservices.techinstruments.a.d.a ahu = dVar.ahu();
                        if (ahu != null) {
                            return AnonymousClass1.aDJ.a(version, j2, ahu, list);
                        }
                        p b = AnonymousClass2.aDO.invoke(list).b((t) AnonymousClass3.a(this.aDP, 0, 0, 2, null));
                        kotlin.jvm.internal.i.e(b, "loadCachedRemoteLibrary(…pty(loadRemoteLibrary(0))");
                        return b;
                    }
                }).q(AnonymousClass2.aDR).i((f) AnonymousClass3.aDS).cJ(new o(m.emptyList(), m.emptyList()));
                kotlin.jvm.internal.i.e(cJ, "Single.zip(\n            …rary(listOf(), listOf()))");
                return cJ;
            }
        };
        AnonymousClass4 anonymousClass4 = AnonymousClass4.aDT;
        long Mp = b.aDG.Mp();
        Object obj = (Mp == 0 || Mp >= scriptedRuntimeVersion) ? null : 1;
        if (obj != null) {
            b.aDG.clear();
        }
        e c = p.a(AnonymousClass3.a(anonymousClass3, 0, 0, 3, null), anonymousClass4.invoke(), a.aDU).bkO().c((b) e.bkR());
        kotlin.jvm.internal.i.e(c, "Single.zip<RemoteLibrary…catWith(Flowable.never())");
        return ac.a(ac.bkp, "Indicators Library", c, 0, null, 12, null);
    }
}
