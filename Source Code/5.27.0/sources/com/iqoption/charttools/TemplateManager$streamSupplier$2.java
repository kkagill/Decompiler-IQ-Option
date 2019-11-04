package com.iqoption.charttools;

import com.iqoption.core.manager.ac;
import com.iqoption.core.microservices.techinstruments.a.c;
import com.iqoption.core.util.z;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aZ\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0001j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003`\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "Lcom/iqoption/charttools/model/template/ChartTemplate;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "invoke"})
/* compiled from: TemplateManager.kt */
final class TemplateManager$streamSupplier$2 extends Lambda implements kotlin.jvm.a.a<com.iqoption.core.rx.a.a<z<List<? extends com.iqoption.charttools.model.b.a>>, List<? extends com.iqoption.charttools.model.b.a>>> {
    public static final TemplateManager$streamSupplier$2 aEp = new TemplateManager$streamSupplier$2();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/charttools/model/template/ChartTemplate;", "kotlin.jvm.PlatformType", "library", "Lcom/iqoption/charttools/IndicatorsLibrary;", "apply"})
    /* compiled from: TemplateManager.kt */
    static final class a<T, R> implements g<T, org.a.b<? extends R>> {
        public static final a aEr = new a();

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/charttools/TemplateManager$TemplatesUpdate;", "it", "Lcom/iqoption/core/microservices/techinstruments/response/ModifiedTemplates;", "apply"})
        /* compiled from: TemplateManager.kt */
        static final class a<T, R> implements g<T, R> {
            final /* synthetic */ j aEm;

            a(j jVar) {
                this.aEm = jVar;
            }

            /* renamed from: a */
            public final com.iqoption.charttools.q.b apply(c cVar) {
                kotlin.jvm.internal.i.f(cVar, "it");
                AnonymousClass1 anonymousClass1 = AnonymousClass1.aEq;
                j jVar = this.aEm;
                kotlin.jvm.internal.i.e(jVar, "library");
                return new com.iqoption.charttools.q.b(null, null, null, new com.iqoption.charttools.q.a(anonymousClass1.w(jVar, cVar.Mx()), cVar.My()), 7, null);
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/charttools/TemplateManager$TemplatesUpdate;", "it", "Lcom/iqoption/charttools/TemplateEvent;", "apply"})
        /* compiled from: TemplateManager.kt */
        static final class b<T, R> implements g<T, R> {
            public static final b aEu = new b();

            b() {
            }

            /* renamed from: a */
            public final com.iqoption.charttools.q.b apply(p pVar) {
                kotlin.jvm.internal.i.f(pVar, "it");
                return pVar.Mt();
            }
        }

        a() {
        }

        /* renamed from: d */
        public final e<List<com.iqoption.charttools.model.b.a>> apply(final j jVar) {
            kotlin.jvm.internal.i.f(jVar, "library");
            e d = com.iqoption.core.microservices.techinstruments.a.byN.ahq().g(new a(jVar)).d((org.a.b) q.aEd.Mu().g(b.aEu));
            kotlin.jvm.internal.i.e(d, "TechInstrumentsRequests.…ts.map { it.asUpdate() })");
            return com.iqoption.core.microservices.techinstruments.a.byN.ahp().t(new g<T, R>() {
                /* renamed from: S */
                public final com.iqoption.charttools.q.b apply(List<com.iqoption.core.microservices.techinstruments.a.e> list) {
                    kotlin.jvm.internal.i.f(list, "it");
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.aEq;
                    j jVar = jVar;
                    kotlin.jvm.internal.i.e(jVar, "library");
                    return new com.iqoption.charttools.q.b(anonymousClass1.w(jVar, list), null, null, null, 14, null);
                }
            }).bkO().c((org.a.b) d).a((io.reactivex.b.c) AnonymousClass2.aEs).g(AnonymousClass3.aEt);
        }
    }

    TemplateManager$streamSupplier$2() {
        super(0);
    }

    /* renamed from: AX */
    public final com.iqoption.core.rx.a.a<z<List<com.iqoption.charttools.model.b.a>>, List<com.iqoption.charttools.model.b.a>> invoke() {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.aEq;
        e s = k.aDB.Mn().s(a.aEr);
        kotlin.jvm.internal.i.e(s, "IndicatorsLibraryManager…rrent }\n                }");
        return ac.bkp.a("Templates", s, 10000, TimeUnit.MILLISECONDS);
    }
}
