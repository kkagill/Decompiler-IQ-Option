package com.iqoption.charttools;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.JsonObject;
import com.iqoption.charttools.model.indicator.h;
import com.iqoption.core.util.z;
import io.reactivex.p;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.l;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u000201B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000eJ\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0004J\b\u0010&\u001a\u00020'H\u0002J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010%\u001a\u00020\u0004J\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0016J<\u0010*\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000eJ\u0016\u0010+\u001a\u00020\u000f*\u00020,2\b\b\u0002\u0010-\u001a\u00020'H\u0002J\f\u0010.\u001a\u00020/*\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\n0\n0\tX\u0004¢\u0006\u0002\n\u0000Rs\u0010\u000b\u001aZ\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0007*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000e0\r\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0007*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000e0\fj\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0007*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000e`\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00170\u00170\u001bX\u0004¢\u0006\u0002\n\u0000¨\u00062"}, bng = {"Lcom/iqoption/charttools/TemplateManager;", "", "()V", "DISPOSE_DELAY", "", "TAG", "", "kotlin.jvm.PlatformType", "onSuccessUpdate", "Lio/reactivex/functions/Consumer;", "Lcom/iqoption/charttools/TemplateUpdated;", "streamSupplier", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "Lcom/iqoption/charttools/model/template/ChartTemplate;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "getStreamSupplier", "()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "streamSupplier$delegate", "Lkotlin/Lazy;", "templateEvents", "Lio/reactivex/Flowable;", "Lcom/iqoption/charttools/TemplateEvent;", "getTemplateEvents", "()Lio/reactivex/Flowable;", "templateEventsProcessor", "Lio/reactivex/processors/PublishProcessor;", "addTemplate", "Lio/reactivex/Completable;", "name", "chartConfig", "Lcom/iqoption/charttools/model/chart/ChartConfig;", "indicators", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "figures", "deleteTemplate", "id", "getLibrary", "Lcom/iqoption/charttools/IndicatorsLibrary;", "getTemplate", "getTemplates", "updateTemplate", "map", "Lcom/iqoption/core/microservices/techinstruments/response/Template;", "library", "serialize", "Lcom/google/gson/JsonObject;", "TemplatesComplexUpdate", "TemplatesUpdate", "techtools_release"})
/* compiled from: TemplateManager.kt */
public final class q {
    private static final String TAG = q.class.getSimpleName();
    private static final PublishProcessor<p> aDZ;
    private static final io.reactivex.e<p> aEa = aDZ;
    private static final io.reactivex.b.f<s> aEb = f.aEo;
    private static final kotlin.d aEc = g.c(TemplateManager$streamSupplier$2.aEp);
    public static final q aEd = new q();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(q.class), "streamSupplier", "getStreamSupplier()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;"))};

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/charttools/TemplateManager$TemplatesComplexUpdate;", "", "changed", "", "Lcom/iqoption/charttools/model/template/ChartTemplate;", "removed", "", "(Ljava/util/List;[J)V", "getChanged", "()Ljava/util/List;", "getRemoved", "()[J", "techtools_release"})
    /* compiled from: TemplateManager.kt */
    public static final class a {
        private final List<com.iqoption.charttools.model.b.a> aEe;
        private final long[] aEf;

        public a() {
            this(null, null, 3, null);
        }

        public a(List<com.iqoption.charttools.model.b.a> list, long[] jArr) {
            kotlin.jvm.internal.i.f(list, "changed");
            kotlin.jvm.internal.i.f(jArr, "removed");
            this.aEe = list;
            this.aEf = jArr;
        }

        public /* synthetic */ a(List list, long[] jArr, int i, f fVar) {
            if ((i & 1) != 0) {
                list = m.emptyList();
            }
            if ((i & 2) != 0) {
                jArr = com.iqoption.core.ext.c.bgT;
            }
            this(list, jArr);
        }

        public final List<com.iqoption.charttools.model.b.a> Mx() {
            return this.aEe;
        }

        public final long[] My() {
            return this.aEf;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, bng = {"Lcom/iqoption/charttools/TemplateManager$TemplatesUpdate;", "", "list", "", "Lcom/iqoption/charttools/model/template/ChartTemplate;", "minus", "", "update", "complexUpdate", "Lcom/iqoption/charttools/TemplateManager$TemplatesComplexUpdate;", "(Ljava/util/List;Ljava/lang/Long;Lcom/iqoption/charttools/model/template/ChartTemplate;Lcom/iqoption/charttools/TemplateManager$TemplatesComplexUpdate;)V", "getComplexUpdate", "()Lcom/iqoption/charttools/TemplateManager$TemplatesComplexUpdate;", "current", "getCurrent", "()Ljava/util/List;", "getList", "getMinus", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUpdate", "()Lcom/iqoption/charttools/model/template/ChartTemplate;", "techtools_release"})
    /* compiled from: TemplateManager.kt */
    public static final class b {
        private final List<com.iqoption.charttools.model.b.a> aEg;
        private final Long aEh;
        private final com.iqoption.charttools.model.b.a aEi;
        private final a aEj;

        public b() {
            this(null, null, null, null, 15, null);
        }

        public b(List<com.iqoption.charttools.model.b.a> list, Long l, com.iqoption.charttools.model.b.a aVar, a aVar2) {
            this.aEg = list;
            this.aEh = l;
            this.aEi = aVar;
            this.aEj = aVar2;
        }

        public /* synthetic */ b(List list, Long l, com.iqoption.charttools.model.b.a aVar, a aVar2, int i, f fVar) {
            if ((i & 1) != 0) {
                list = (List) null;
            }
            if ((i & 2) != 0) {
                l = (Long) null;
            }
            if ((i & 4) != 0) {
                aVar = (com.iqoption.charttools.model.b.a) null;
            }
            if ((i & 8) != 0) {
                aVar2 = (a) null;
            }
            this(list, l, aVar, aVar2);
        }

        public final List<com.iqoption.charttools.model.b.a> Mz() {
            List<com.iqoption.charttools.model.b.a> list = this.aEg;
            if (list != null) {
                return list;
            }
            com.iqoption.charttools.model.b.a aVar = this.aEi;
            if (aVar != null) {
                return l.listOf(aVar);
            }
            a aVar2 = this.aEj;
            if ((aVar2 != null ? aVar2.Mx() : null) != null) {
                return this.aEj.Mx();
            }
            return m.emptyList();
        }

        public final b a(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "update");
            List<com.iqoption.charttools.model.b.a> I;
            int i;
            l lVar;
            List<com.iqoption.charttools.model.b.a> Mz;
            int i2;
            List Mz2;
            if (bVar.aEg != null) {
                I = u.I(Mz());
                for (com.iqoption.charttools.model.b.a aVar : bVar.aEg) {
                    i = 0;
                    for (com.iqoption.charttools.model.b.a id : I) {
                        if ((id.getId() == aVar.getId() ? 1 : null) != null) {
                            break;
                        }
                        i++;
                    }
                    i = -1;
                    if (i != -1) {
                        I.set(i, aVar);
                    } else {
                        I.add(aVar);
                    }
                }
                lVar = l.eVB;
                return new b(I, null, null, null, 14, null);
            } else if (bVar.aEh != null) {
                Mz2 = Mz();
                i2 = 0;
                for (com.iqoption.charttools.model.b.a id2 : Mz2) {
                    long id3 = id2.getId();
                    Long l = bVar.aEh;
                    Object obj = (l != null && id3 == l.longValue()) ? 1 : null;
                    if (obj != null) {
                        break;
                    }
                    i2++;
                }
                i2 = -1;
                if (i2 != -1) {
                    Mz2 = u.I(Mz2);
                    Mz2.remove(i2);
                    lVar = l.eVB;
                }
                return new b(Mz2, null, null, null, 14, null);
            } else if (bVar.aEi != null) {
                Mz2 = Mz();
                com.iqoption.charttools.model.b.a aVar2 = bVar.aEi;
                i2 = 0;
                for (com.iqoption.charttools.model.b.a id22 : Mz2) {
                    if ((id22.getId() == aVar2.getId() ? 1 : null) != null) {
                        break;
                    }
                    i2++;
                }
                i2 = -1;
                if (i2 != -1) {
                    Mz2 = u.I(Mz2);
                    Mz2.set(i2, aVar2);
                    lVar = l.eVB;
                } else {
                    Mz2 = u.I(Mz2);
                    Mz2.add(aVar2);
                    lVar = l.eVB;
                }
                return new b(Mz2, null, null, null, 14, null);
            } else if (bVar.aEj == null) {
                return this;
            } else {
                I = u.I(Mz());
                for (long j : bVar.aEj.My()) {
                    int i3 = 0;
                    for (com.iqoption.charttools.model.b.a id4 : I) {
                        if ((id4.getId() == j ? 1 : null) != null) {
                            break;
                        }
                        i3++;
                    }
                    i3 = -1;
                    if (i3 != -1) {
                        I.remove(i3);
                    }
                }
                for (com.iqoption.charttools.model.b.a aVar3 : bVar.aEj.Mx()) {
                    i = 0;
                    for (com.iqoption.charttools.model.b.a id5 : I) {
                        if ((id5.getId() == aVar3.getId() ? 1 : null) != null) {
                            break;
                        }
                        i++;
                    }
                    i = -1;
                    if (i != -1) {
                        I.set(i, aVar3);
                    } else {
                        I.add(aVar3);
                    }
                }
                lVar = l.eVB;
                return new b(I, null, null, null, 14, null);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/charttools/TemplateUpdated;", "kotlin.jvm.PlatformType", "library", "Lcom/iqoption/charttools/IndicatorsLibrary;", "apply"})
    /* compiled from: TemplateManager.kt */
    static final class c<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ String $name;
        final /* synthetic */ List aDf;
        final /* synthetic */ com.iqoption.charttools.model.a.a aEk;
        final /* synthetic */ List aEl;

        c(String str, com.iqoption.charttools.model.a.a aVar, List list, List list2) {
            this.$name = str;
            this.aEk = aVar;
            this.aDf = list;
            this.aEl = list2;
        }

        /* renamed from: c */
        public final p<s> apply(final j jVar) {
            kotlin.jvm.internal.i.f(jVar, "library");
            com.iqoption.core.microservices.techinstruments.a aVar = com.iqoption.core.microservices.techinstruments.a.byN;
            String str = this.$name;
            com.iqoption.charttools.model.a.a aVar2 = this.aEk;
            JsonObject NS = aVar2 != null ? aVar2.NS() : null;
            Iterable<h> iterable = this.aDf;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (h a : iterable) {
                arrayList.add(q.aEd.c(a));
            }
            List list = (List) arrayList;
            iterable = this.aEl;
            Collection arrayList2 = new ArrayList(n.e(iterable, 10));
            for (h a2 : iterable) {
                arrayList2.add(q.aEd.c(a2));
            }
            return aVar.a(str, NS, list, (List) arrayList2).t(new io.reactivex.b.g<T, R>() {
                /* renamed from: a */
                public final s apply(com.iqoption.core.microservices.techinstruments.a.e eVar) {
                    kotlin.jvm.internal.i.f(eVar, "it");
                    q qVar = q.aEd;
                    j jVar = jVar;
                    kotlin.jvm.internal.i.e(jVar, "library");
                    return new s(qVar.a(eVar, jVar));
                }
            });
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: TemplateManager.kt */
    static final class d implements io.reactivex.b.a {
        final /* synthetic */ long aCI;

        d(long j) {
            this.aCI = j;
        }

        public final void run() {
            q.aDZ.onNext(new r(this.aCI));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0004H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "T", "kotlin.jvm.PlatformType", "C", "", "it", "apply", "(Ljava/lang/Iterable;)Lio/reactivex/Flowable;", "com/iqoption/core/ext/RxExt$findOrEmpty$1"})
    /* compiled from: RxExtensions.kt */
    public static final class e<T, R> implements io.reactivex.b.g<T, org.a.b<? extends R>> {
        final /* synthetic */ long aEn;

        public e(long j) {
            this.aEn = j;
        }

        /* renamed from: F */
        public final io.reactivex.e<T> apply(List<? extends com.iqoption.charttools.model.b.a> list) {
            kotlin.jvm.internal.i.f(list, "it");
            for (Object next : list) {
                Object obj;
                if (((com.iqoption.charttools.model.b.a) next).getId() == this.aEn) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    break;
                }
            }
            Object next2 = null;
            if (next2 != null) {
                return io.reactivex.e.cD(next2);
            }
            return io.reactivex.e.bkQ();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "event", "Lcom/iqoption/charttools/TemplateUpdated;", "accept"})
    /* compiled from: TemplateManager.kt */
    static final class f<T> implements io.reactivex.b.f<s> {
        public static final f aEo = new f();

        f() {
        }

        /* renamed from: a */
        public final void accept(s sVar) {
            kotlin.jvm.internal.i.f(sVar, "event");
            q.aDZ.onNext(sVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/charttools/TemplateUpdated;", "kotlin.jvm.PlatformType", "library", "Lcom/iqoption/charttools/IndicatorsLibrary;", "apply"})
    /* compiled from: TemplateManager.kt */
    static final class g<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ String $name;
        final /* synthetic */ long aCI;
        final /* synthetic */ List aDf;
        final /* synthetic */ com.iqoption.charttools.model.a.a aEk;
        final /* synthetic */ List aEl;

        g(long j, String str, com.iqoption.charttools.model.a.a aVar, List list, List list2) {
            this.aCI = j;
            this.$name = str;
            this.aEk = aVar;
            this.aDf = list;
            this.aEl = list2;
        }

        /* JADX WARNING: Missing block: B:3:0x0013, code skipped:
            if (r0 != null) goto L_0x001a;
     */
        /* renamed from: c */
        public final io.reactivex.p<com.iqoption.charttools.s> apply(final com.iqoption.charttools.j r11) {
            /*
            r10 = this;
            r0 = "library";
            kotlin.jvm.internal.i.f(r11, r0);
            r1 = com.iqoption.core.microservices.techinstruments.a.byN;
            r2 = r10.aCI;
            r4 = r10.$name;
            r0 = r10.aEk;
            if (r0 == 0) goto L_0x0016;
        L_0x000f:
            r0 = r0.NS();
            if (r0 == 0) goto L_0x0016;
        L_0x0015:
            goto L_0x001a;
        L_0x0016:
            r0 = com.iqoption.core.ext.d.Xk();
        L_0x001a:
            r5 = r0;
            r0 = r10.aDf;
            r0 = (java.lang.Iterable) r0;
            r6 = new java.util.ArrayList;
            r7 = 10;
            r8 = kotlin.collections.n.e(r0, r7);
            r6.<init>(r8);
            r6 = (java.util.Collection) r6;
            r0 = r0.iterator();
        L_0x0030:
            r8 = r0.hasNext();
            if (r8 == 0) goto L_0x0046;
        L_0x0036:
            r8 = r0.next();
            r8 = (com.iqoption.charttools.model.indicator.h) r8;
            r9 = com.iqoption.charttools.q.aEd;
            r8 = r9.c(r8);
            r6.add(r8);
            goto L_0x0030;
        L_0x0046:
            r6 = (java.util.List) r6;
            r0 = r10.aEl;
            r0 = (java.lang.Iterable) r0;
            r8 = new java.util.ArrayList;
            r7 = kotlin.collections.n.e(r0, r7);
            r8.<init>(r7);
            r8 = (java.util.Collection) r8;
            r0 = r0.iterator();
        L_0x005b:
            r7 = r0.hasNext();
            if (r7 == 0) goto L_0x0071;
        L_0x0061:
            r7 = r0.next();
            r7 = (com.iqoption.charttools.model.indicator.h) r7;
            r9 = com.iqoption.charttools.q.aEd;
            r7 = r9.c(r7);
            r8.add(r7);
            goto L_0x005b;
        L_0x0071:
            r7 = r8;
            r7 = (java.util.List) r7;
            r0 = r1.a(r2, r4, r5, r6, r7);
            r1 = new com.iqoption.charttools.q$g$1;
            r1.<init>(r11);
            r1 = (io.reactivex.b.g) r1;
            r11 = r0.t(r1);
            return r11;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.charttools.q$g.apply(com.iqoption.charttools.j):io.reactivex.p");
        }
    }

    private final com.iqoption.core.rx.a.a<z<List<com.iqoption.charttools.model.b.a>>, List<com.iqoption.charttools.model.b.a>> Mv() {
        kotlin.d dVar = aEc;
        j jVar = anY[0];
        return (com.iqoption.core.rx.a.a) dVar.getValue();
    }

    static {
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<TemplateEvent>()");
        aDZ = bmK;
    }

    private q() {
    }

    public final io.reactivex.e<p> Mu() {
        return aEa;
    }

    public final io.reactivex.e<List<com.iqoption.charttools.model.b.a>> Mw() {
        return Mv().ako();
    }

    public final io.reactivex.e<com.iqoption.charttools.model.b.a> aw(long j) {
        io.reactivex.e d = Mw().d((io.reactivex.b.g) new e(j));
        kotlin.jvm.internal.i.e(d, "flatMap {\n        val fo…e.empty()\n        }\n    }");
        return d;
    }

    public final io.reactivex.a a(String str, com.iqoption.charttools.model.a.a aVar, List<h> list, List<h> list2) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(list, "indicators");
        kotlin.jvm.internal.i.f(list2, "figures");
        io.reactivex.a blf = k.aDB.Mn().q(new c(str, aVar, list, list2)).h(aEb).blf();
        kotlin.jvm.internal.i.e(blf, "IndicatorsLibraryManager…         .ignoreElement()");
        return blf;
    }

    public final io.reactivex.a a(long j, String str, com.iqoption.charttools.model.a.a aVar, List<h> list, List<h> list2) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(list, "indicators");
        kotlin.jvm.internal.i.f(list2, "figures");
        io.reactivex.a blf = k.aDB.Mn().q(new g(j, str, aVar, list, list2)).h(aEb).blf();
        kotlin.jvm.internal.i.e(blf, "IndicatorsLibraryManager…         .ignoreElement()");
        return blf;
    }

    public final io.reactivex.a ax(long j) {
        io.reactivex.a c = com.iqoption.core.microservices.techinstruments.a.byN.ax(j).c((io.reactivex.b.a) new d(j));
        kotlin.jvm.internal.i.e(c, "TechInstrumentsRequests\n…ed(id))\n                }");
        return c;
    }

    /* JADX WARNING: Missing block: B:3:0x001f, code skipped:
            if ((r1.isEmpty() ^ 1) != 0) goto L_0x0023;
     */
    private final com.iqoption.charttools.model.b.a a(com.iqoption.core.microservices.techinstruments.a.e r10, com.iqoption.charttools.j r11) {
        /*
        r9 = this;
        r0 = r10.ahv();
        r1 = r0.isJsonObject();
        r2 = 1;
        if (r1 == 0) goto L_0x0022;
    L_0x000b:
        r1 = r0.getAsJsonObject();
        r1 = r1.keySet();
        r3 = "it.asJsonObject.keySet()";
        kotlin.jvm.internal.i.e(r1, r3);
        r1 = (java.util.Collection) r1;
        r1 = r1.isEmpty();
        r1 = r1 ^ r2;
        if (r1 == 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0023;
    L_0x0022:
        r2 = 0;
    L_0x0023:
        r1 = 0;
        if (r2 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0028;
    L_0x0027:
        r0 = r1;
    L_0x0028:
        if (r0 == 0) goto L_0x002f;
    L_0x002a:
        r1 = new com.iqoption.charttools.model.a.a;
        r1.<init>(r0);
    L_0x002f:
        r6 = r1;
        r0 = r10.LV();
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
    L_0x0041:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0059;
    L_0x0047:
        r2 = r0.next();
        r2 = (com.google.gson.JsonObject) r2;
        r3 = com.iqoption.charttools.k.aDB;
        r2 = r3.a(r11, r2);
        if (r2 == 0) goto L_0x0041;
    L_0x0055:
        r1.add(r2);
        goto L_0x0041;
    L_0x0059:
        r7 = r1;
        r7 = (java.util.List) r7;
        r0 = r10.Ms();
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
    L_0x006d:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0085;
    L_0x0073:
        r2 = r0.next();
        r2 = (com.google.gson.JsonObject) r2;
        r3 = com.iqoption.charttools.k.aDB;
        r2 = r3.a(r11, r2);
        if (r2 == 0) goto L_0x006d;
    L_0x0081:
        r1.add(r2);
        goto L_0x006d;
    L_0x0085:
        r8 = r1;
        r8 = (java.util.List) r8;
        r11 = new com.iqoption.charttools.model.b.a;
        r3 = r10.getId();
        r5 = r10.getName();
        r2 = r11;
        r2.<init>(r3, r5, r6, r7, r8);
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.charttools.q.a(com.iqoption.core.microservices.techinstruments.a.e, com.iqoption.charttools.j):com.iqoption.charttools.model.b.a");
    }

    private final JsonObject c(h hVar) {
        JsonObject jsonObject = new JsonObject();
        k.aDB.a(jsonObject, hVar);
        return jsonObject;
    }
}
