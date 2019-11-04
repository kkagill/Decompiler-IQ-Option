package com.iqoption.videoeducation;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import com.google.common.primitives.Longs;
import io.reactivex.p;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0003\u0004\u0007\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001-B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f2\u0006\u0010 \u001a\u00020!H\u0007J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00162\u0006\u0010$\u001a\u00020!J\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u001d2\u0006\u0010$\u001a\u00020!J\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0'0\u0016J\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0'0\u001dJ\u0014\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0'0\u0016H\u0007J\u0014\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0'0\u001dH\u0007J\u0010\u0010+\u001a\u00020,2\u0006\u0010 \u001a\u00020!H\u0007R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\bR2\u0010\t\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000e0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00140\u00140\u0013X\u0004¢\u0006\u0002\n\u0000R?\u0010\u0015\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00170\u0017 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00170\u0017\u0018\u00010\u00160\u00168BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, bng = {"Lcom/iqoption/videoeducation/VideoEducationManager;", "", "()V", "CREATE_TIME_ORDERING", "com/iqoption/videoeducation/VideoEducationManager$CREATE_TIME_ORDERING$1", "Lcom/iqoption/videoeducation/VideoEducationManager$CREATE_TIME_ORDERING$1;", "NEW_FLAG_ORDERING", "com/iqoption/videoeducation/VideoEducationManager$NEW_FLAG_ORDERING$1", "Lcom/iqoption/videoeducation/VideoEducationManager$NEW_FLAG_ORDERING$1;", "ORDERING", "Lcom/google/common/collect/Ordering;", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "kotlin.jvm.PlatformType", "TAG", "", "WEIGHT_ORDERING", "com/iqoption/videoeducation/VideoEducationManager$WEIGHT_ORDERING$1", "Lcom/iqoption/videoeducation/VideoEducationManager$WEIGHT_ORDERING$1;", "eventsProcessor", "Lio/reactivex/processors/PublishProcessor;", "Lcom/iqoption/videoeducation/VideoEducationEvent;", "helperStream", "Lio/reactivex/Single;", "Lcom/iqoption/videoeducation/VideoEducationManager$Helper;", "getHelperStream", "()Lio/reactivex/Single;", "helperStream$delegate", "Lkotlin/Lazy;", "getEvents", "Lio/reactivex/Flowable;", "getVideo", "Lio/reactivex/Maybe;", "videoId", "", "getVideoCatalog", "Lcom/iqoption/videoeducation/model/VideoCatalog;", "categoryId", "getVideoCatalogStream", "getVideoCatalogs", "", "getVideoCatalogsStream", "getVideos", "getVideosStream", "watchVideo", "Lio/reactivex/Completable;", "Helper", "videoeducation_release"})
/* compiled from: VideoEducationManager.kt */
public final class i {
    private static final Ordering<com.iqoption.core.microservices.videoeducation.response.g> ORDERING = ecv.compound((Comparator) ecu).compound((Comparator) ect);
    private static final String TAG = i.class.getSimpleName();
    private static final kotlin.d aCO = g.c(VideoEducationManager$helperStream$2.ecF);
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(i.class), "helperStream", "getHelperStream()Lio/reactivex/Single;"))};
    private static final a ect = new a();
    private static final d ecu = new d();
    private static final c ecv = new c();
    private static final PublishProcessor<h> ecw;
    public static final i ecx = new i();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u0010R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u000e¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, bng = {"Lcom/iqoption/videoeducation/VideoEducationManager$Helper;", "", "categories", "", "Lcom/iqoption/core/microservices/videoeducation/response/Category;", "videos", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "(Ljava/util/List;Ljava/util/List;)V", "catalogs", "Lcom/iqoption/videoeducation/model/VideoCatalog;", "getVideos", "()Ljava/util/List;", "setVideos", "(Ljava/util/List;)V", "getVideoCatalog", "categoryId", "", "getVideoCatalogs", "watchVideo", "videoId", "videoeducation_release"})
    /* compiled from: VideoEducationManager.kt */
    private static final class b {
        private List<com.iqoption.videoeducation.c.a> ecs;
        private List<com.iqoption.core.microservices.videoeducation.response.g> ecy;

        public b(List<com.iqoption.core.microservices.videoeducation.response.a> list, List<com.iqoption.core.microservices.videoeducation.response.g> list2) {
            kotlin.jvm.internal.i.f(list, "categories");
            kotlin.jvm.internal.i.f(list2, "videos");
            Iterable iterable = list2;
            Ordering a = i.ORDERING;
            kotlin.jvm.internal.i.e(a, "ORDERING");
            this.ecy = u.a(iterable, (Comparator) a);
            Iterable<com.iqoption.core.microservices.videoeducation.response.a> iterable2 = list;
            Collection arrayList = new ArrayList(n.e(iterable2, 10));
            for (com.iqoption.core.microservices.videoeducation.response.a aVar : iterable2) {
                ArrayList newArrayList = Lists.newArrayList();
                HashSet uw = Sets.uw();
                for (com.iqoption.core.microservices.videoeducation.response.g gVar : list2) {
                    if (aVar.a(gVar)) {
                        newArrayList.add(gVar);
                        uw.addAll(gVar.ajs());
                    }
                }
                kotlin.jvm.internal.i.e(newArrayList, "categoryVideos");
                List list3 = newArrayList;
                ArrayList t = Lists.t(uw);
                kotlin.jvm.internal.i.e(t, "Lists.newArrayList(categoryTags)");
                arrayList.add(new com.iqoption.videoeducation.c.a(aVar, list3, t));
            }
            this.ecs = (List) arrayList;
        }

        public final List<com.iqoption.core.microservices.videoeducation.response.g> aXm() {
            return this.ecy;
        }

        public final synchronized List<com.iqoption.videoeducation.c.a> aXn() {
            return this.ecs;
        }

        public final synchronized com.iqoption.videoeducation.c.a cu(long j) {
            Object obj;
            for (Object obj2 : this.ecs) {
                Object obj3;
                if (((com.iqoption.videoeducation.c.a) obj2).aXE().getId() == j) {
                    obj3 = 1;
                    continue;
                } else {
                    obj3 = null;
                    continue;
                }
                if (obj3 != null) {
                    break;
                }
            }
            obj2 = null;
            return (com.iqoption.videoeducation.c.a) obj2;
        }

        public final synchronized com.iqoption.core.microservices.videoeducation.response.g cv(long j) {
            com.iqoption.core.microservices.videoeducation.response.g gVar;
            synchronized (this) {
                com.iqoption.core.microservices.videoeducation.response.g a;
                int i = 0;
                for (com.iqoption.core.microservices.videoeducation.response.g a2 : this.ecy) {
                    if ((a2.getId() == j ? 1 : null) != null) {
                        break;
                    }
                    i++;
                }
                i = -1;
                gVar = null;
                if (i != -1) {
                    a2 = com.iqoption.core.microservices.videoeducation.response.g.a((com.iqoption.core.microservices.videoeducation.response.g) this.ecy.get(i), 0, null, false, true, null, 0, null, null, null, null, null, 2035, null);
                    this.ecy = com.iqoption.core.ext.c.a(this.ecy, i, (Object) a2);
                    List list = (List) null;
                    for (com.iqoption.core.microservices.videoeducation.response.a aVar : a2.Mk()) {
                        com.iqoption.videoeducation.c.a aVar2;
                        int i2 = 0;
                        for (com.iqoption.videoeducation.c.a aVar22 : this.ecs) {
                            if ((aVar22.aXE().getId() == aVar.getId() ? 1 : null) != null) {
                                break;
                            }
                            i2++;
                        }
                        i2 = -1;
                        if (i2 != -1) {
                            aVar22 = (com.iqoption.videoeducation.c.a) this.ecs.get(i2);
                            int i3 = 0;
                            for (com.iqoption.core.microservices.videoeducation.response.g id : aVar22.aXm()) {
                                if ((id.getId() == j ? 1 : null) != null) {
                                    break;
                                }
                                i3++;
                            }
                            i3 = -1;
                            if (i3 != -1) {
                                if (list == null) {
                                    list = u.I(this.ecs);
                                }
                                list.set(i2, com.iqoption.videoeducation.c.a.a(aVar22, null, com.iqoption.core.ext.c.a(aVar22.aXm(), i3, (Object) a2), null, 5, null));
                            }
                        }
                    }
                    if (list != null) {
                        this.ecs = list;
                    }
                    gVar = a2;
                }
            }
            return gVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/videoeducation/VideoEducationManager$CREATE_TIME_ORDERING$1", "Lcom/google/common/collect/Ordering;", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "compare", "", "left", "right", "videoeducation_release"})
    /* compiled from: VideoEducationManager.kt */
    public static final class a extends Ordering<com.iqoption.core.microservices.videoeducation.response.g> {
        a() {
        }

        /* renamed from: a */
        public int compare(com.iqoption.core.microservices.videoeducation.response.g gVar, com.iqoption.core.microservices.videoeducation.response.g gVar2) {
            long j = 0;
            long ZU = gVar2 != null ? gVar2.ZU() : 0;
            if (gVar != null) {
                j = gVar.ZU();
            }
            return Longs.compare(ZU, j);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/videoeducation/VideoEducationManager$NEW_FLAG_ORDERING$1", "Lcom/google/common/collect/Ordering;", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "compare", "", "left", "right", "videoeducation_release"})
    /* compiled from: VideoEducationManager.kt */
    public static final class c extends Ordering<com.iqoption.core.microservices.videoeducation.response.g> {
        c() {
        }

        /* renamed from: a */
        public int compare(com.iqoption.core.microservices.videoeducation.response.g gVar, com.iqoption.core.microservices.videoeducation.response.g gVar2) {
            Boolean bool = null;
            Boolean valueOf = gVar != null ? Boolean.valueOf(gVar.ajq()) : null;
            if (gVar2 != null) {
                bool = Boolean.valueOf(gVar2.ajq());
            }
            if (valueOf == bool) {
                return 0;
            }
            if (gVar == null || !gVar.ajq()) {
                return 1;
            }
            return -1;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/videoeducation/VideoEducationManager$WEIGHT_ORDERING$1", "Lcom/google/common/collect/Ordering;", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "compare", "", "left", "right", "videoeducation_release"})
    /* compiled from: VideoEducationManager.kt */
    public static final class d extends Ordering<com.iqoption.core.microservices.videoeducation.response.g> {
        d() {
        }

        /* renamed from: a */
        public int compare(com.iqoption.core.microservices.videoeducation.response.g gVar, com.iqoption.core.microservices.videoeducation.response.g gVar2) {
            int i = 0;
            int weight = gVar2 != null ? gVar2.getWeight() : 0;
            if (gVar != null) {
                i = gVar.getWeight();
            }
            return Integer.compare(weight, i);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "kotlin.jvm.PlatformType", "it", "Lcom/iqoption/videoeducation/VideoEducationManager$Helper;", "apply"})
    /* compiled from: VideoEducationManager.kt */
    static final class e<T, R> implements io.reactivex.b.g<T, io.reactivex.k<? extends R>> {
        final /* synthetic */ long ecz;

        e(long j) {
            this.ecz = j;
        }

        /* renamed from: a */
        public final io.reactivex.i<com.iqoption.core.microservices.videoeducation.response.g> apply(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            for (Object next : bVar.aXm()) {
                Object obj;
                if (((com.iqoption.core.microservices.videoeducation.response.g) next).getId() == this.ecz) {
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
            com.iqoption.core.microservices.videoeducation.response.g gVar = (com.iqoption.core.microservices.videoeducation.response.g) next2;
            if (gVar != null) {
                return io.reactivex.i.cH(gVar);
            }
            return io.reactivex.i.bld();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/videoeducation/model/VideoCatalog;", "it", "Lcom/iqoption/videoeducation/VideoEducationManager$Helper;", "apply"})
    /* compiled from: VideoEducationManager.kt */
    static final class f<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ long ecA;

        f(long j) {
            this.ecA = j;
        }

        /* renamed from: b */
        public final com.iqoption.videoeducation.c.a apply(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            com.iqoption.videoeducation.c.a cu = bVar.cu(this.ecA);
            if (cu != null) {
                return cu;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Catalog with category ID: ");
            stringBuilder.append(this.ecA);
            stringBuilder.append(" is not found");
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/videoeducation/model/VideoCatalog;", "it", "Lcom/iqoption/videoeducation/VideoEducationManager$Helper;", "apply"})
    /* compiled from: VideoEducationManager.kt */
    static final class g<T, R> implements io.reactivex.b.g<T, R> {
        public static final g ecB = new g();

        g() {
        }

        /* renamed from: c */
        public final List<com.iqoption.videoeducation.c.a> apply(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return bVar.aXn();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/videoeducation/model/VideoCatalog;", "it", "Lcom/iqoption/videoeducation/VideoEducationEvent;", "apply"})
    /* compiled from: VideoEducationManager.kt */
    static final class h<T, R> implements io.reactivex.b.g<T, R> {
        public static final h ecC = new h();

        h() {
        }

        /* renamed from: a */
        public final List<com.iqoption.videoeducation.c.a> apply(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "it");
            return hVar.aXi();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "it", "Lcom/iqoption/videoeducation/VideoEducationManager$Helper;", "apply"})
    /* compiled from: VideoEducationManager.kt */
    static final class i<T, R> implements io.reactivex.b.g<T, R> {
        public static final i ecD = new i();

        i() {
        }

        /* renamed from: c */
        public final List<com.iqoption.core.microservices.videoeducation.response.g> apply(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return bVar.aXm();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "kotlin.jvm.PlatformType", "it", "Lcom/iqoption/videoeducation/VideoEducationEvent;", "apply"})
    /* compiled from: VideoEducationManager.kt */
    static final class j<T, R> implements io.reactivex.b.g<T, org.a.b<? extends R>> {
        final /* synthetic */ io.reactivex.e ecE;

        j(io.reactivex.e eVar) {
            this.ecE = eVar;
        }

        /* renamed from: b */
        public final io.reactivex.e<List<com.iqoption.core.microservices.videoeducation.response.g>> apply(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "it");
            return this.ecE;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "video", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "apply"})
    /* compiled from: VideoEducationManager.kt */
    static final class k<T, R> implements io.reactivex.b.g<com.iqoption.core.microservices.videoeducation.response.g, io.reactivex.c> {
        final /* synthetic */ long ecz;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/videoeducation/VideoEducationManager$Helper;", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: VideoEducationManager.kt */
        /* renamed from: com.iqoption.videoeducation.i$k$1 */
        static final class AnonymousClass1<T> implements io.reactivex.b.f<b> {
            final /* synthetic */ k ecH;

            AnonymousClass1(k kVar) {
                this.ecH = kVar;
            }

            /* renamed from: d */
            public final void accept(b bVar) {
                com.iqoption.core.microservices.videoeducation.response.g cv = bVar.cv(this.ecH.ecz);
                if (cv != null) {
                    i.ecw.onNext(new k(cv, bVar.aXn()));
                }
            }
        }

        k(long j) {
            this.ecz = j;
        }

        /* renamed from: e */
        public final io.reactivex.c apply(com.iqoption.core.microservices.videoeducation.response.g gVar) {
            kotlin.jvm.internal.i.f(gVar, "video");
            if (gVar.ajq()) {
                return com.iqoption.core.microservices.videoeducation.a.be(this.ecz).a((t) i.ecx.Ma()).h((io.reactivex.b.f) new AnonymousClass1(this)).blf();
            }
            return io.reactivex.a.bkL();
        }
    }

    private final p<b> Ma() {
        kotlin.d dVar = aCO;
        kotlin.reflect.j jVar = anY[0];
        return (p) dVar.getValue();
    }

    static {
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<VideoEducationEvent>()");
        ecw = bmK;
    }

    private i() {
    }

    public final io.reactivex.e<h> aTz() {
        return ecw;
    }

    public final p<List<com.iqoption.videoeducation.c.a>> aXj() {
        p t = Ma().t(g.ecB);
        kotlin.jvm.internal.i.e(t, "helperStream.map { it.getVideoCatalogs() }");
        return t;
    }

    public final io.reactivex.e<List<com.iqoption.videoeducation.c.a>> aXk() {
        io.reactivex.e c = aXj().bkO().c((org.a.b) aTz().g(h.ecC));
        kotlin.jvm.internal.i.e(c, "getVideoCatalogs()\n     …ts().map { it.catalogs })");
        return c;
    }

    public final p<com.iqoption.videoeducation.c.a> cr(long j) {
        p t = Ma().t(new f(j));
        kotlin.jvm.internal.i.e(t, "helperStream.map {\n     … is not found\")\n        }");
        return t;
    }

    public static final p<List<com.iqoption.core.microservices.videoeducation.response.g>> ajk() {
        p t = ecx.Ma().t(i.ecD);
        kotlin.jvm.internal.i.e(t, "helperStream.map { it.videos }");
        return t;
    }

    public static final io.reactivex.e<List<com.iqoption.core.microservices.videoeducation.response.g>> aXl() {
        io.reactivex.e bkO = ajk().bkO();
        bkO = bkO.c((org.a.b) ecx.aTz().d((io.reactivex.b.g) new j(bkO)));
        kotlin.jvm.internal.i.e(bkO, "stream.concatWith(getEvents().flatMap { stream })");
        return bkO;
    }

    public static final io.reactivex.i<com.iqoption.core.microservices.videoeducation.response.g> cs(long j) {
        io.reactivex.i r = ecx.Ma().r(new e(j));
        kotlin.jvm.internal.i.e(r, "helperStream.flatMapMayb…)\n            }\n        }");
        return r;
    }

    public static final io.reactivex.a ct(long j) {
        io.reactivex.a o = cs(j).o(new k(j));
        kotlin.jvm.internal.i.e(o, "getVideo(videoId)\n      …      }\n                }");
        return o;
    }
}
