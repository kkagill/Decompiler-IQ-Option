package com.iqoption.core.rx;

import com.google.common.util.concurrent.aa;
import com.google.common.util.concurrent.t;
import io.reactivex.b.j;
import io.reactivex.b.l;
import io.reactivex.o;
import io.reactivex.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a¢\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u000e\"\u0004\b\u0003\u0010\u000f\"\u0004\b\u0004\u0010\u0010\"\u0004\b\u0005\u0010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2*\u0010\u0016\u001a&\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u000b0\u0017\u001a\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u000e\"\u0004\b\u0003\u0010\u000f\"\u0004\b\u0004\u0010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\n2$\u0010\u0016\u001a \u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u000b0\u0018\u001an\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u000e\"\u0004\b\u0003\u0010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000b0\u0019\u001aT\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\n2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000b0\u001a\u001aD\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u001b0\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u001d2\u0016\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\u0004\u0012\u0002H\u001b0\u0001\u001a2\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u001d0\n\"\u0004\b\u0000\u0010\u000b2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u001d0\n0\u001d\u001aF\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u0002H\u000b0!0\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\"0\u001d2\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u001d\u001a\u001e\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u001b0\u0001\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u001b\u001a\u0012\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0006\"\u0004\b\u0000\u0010\u000b\u001a2\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u001d0\n\"\u0004\b\u0000\u0010\u000b2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u001d0\n0\u001d\u001aF\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u0002H\u000b0!0\n\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u000b2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\"0\u001d2\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u001d\u001a(\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u000b0)0\n\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\n\u001a\\\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u000b0)0\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0\n2)\b\u0004\u0010+\u001a#\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u000b0,H\b\u001a\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u000201*\u0002022\b\b\u0002\u00103\u001a\u000204H\u0007\u001a(\u00100\u001a\b\u0012\u0004\u0012\u0002H\u000b01\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b052\b\b\u0002\u00103\u001a\u000204H\u0007\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u00066"}, bng = {"RX_IDENTITY_MAPPER", "Lio/reactivex/functions/Function;", "", "getRX_IDENTITY_MAPPER", "()Lio/reactivex/functions/Function;", "RX_TRUE_PREDICATE", "Lio/reactivex/functions/Predicate;", "getRX_TRUE_PREDICATE", "()Lio/reactivex/functions/Predicate;", "combineFlowables", "Lio/reactivex/Flowable;", "T", "T1", "T2", "T3", "T4", "T5", "s1", "s2", "s3", "s4", "s5", "combiner", "Lio/reactivex/functions/Function5;", "Lio/reactivex/functions/Function4;", "Lio/reactivex/functions/Function3;", "Lio/reactivex/functions/BiFunction;", "R", "list", "", "", "combineToList", "combineToMap", "", "K", "keys", "identityMapper", "truePredicate", "zipToList", "zipToMap", "asIsMutator", "Lkotlin/Function1;", "mapMutator", "mutator", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "toHotGuavaFuture", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lio/reactivex/Completable;", "scheduler", "Lio/reactivex/Scheduler;", "Lio/reactivex/Single;", "core_release"})
/* compiled from: RxCommon.kt */
public final class g {
    private static final io.reactivex.b.g<Object, Object> bFa = a.bFc;
    private static final l<Object> bFb = b.bFd;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "it", "apply"})
    /* compiled from: RxCommon.kt */
    static final class a<T, R> implements io.reactivex.b.g<Object, Object> {
        public static final a bFc = new a();

        a() {
        }

        public final Object apply(Object obj) {
            kotlin.jvm.internal.i.f(obj, "it");
            return obj;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "", "test"})
    /* compiled from: RxCommon.kt */
    static final class b<T> implements l<Object> {
        public static final b bFd = new b();

        b() {
        }

        public final boolean test(Object obj) {
            kotlin.jvm.internal.i.f(obj, "it");
            return true;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "Lkotlin/Function1;", "T", "R", "result", "apply", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "com/iqoption/core/rx/RxCommonKt$mapMutator$1"})
    /* compiled from: RxCommon.kt */
    public static final class c<T, R> implements io.reactivex.b.g<T, R> {
        /* renamed from: bx */
        public final kotlin.jvm.a.b<T, T> apply(R r) {
            return new RxCommonKt$asIsMutator$$inlined$mapMutator$1$1(this, r);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022*\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, bng = {"<anonymous>", "", "T", "results", "", "", "kotlin.jvm.PlatformType", "apply", "([Ljava/lang/Object;)Ljava/util/List;"})
    /* compiled from: RxCommon.kt */
    static final class d<T, R> implements io.reactivex.b.g<Object[], R> {
        public static final d bFe = new d();

        d() {
        }

        /* renamed from: o */
        public final List<T> apply(Object[] objArr) {
            kotlin.jvm.internal.i.f(objArr, "results");
            List arrayList = new ArrayList();
            for (Object obj : objArr) {
                Object obj2;
                if (!(obj2 instanceof List)) {
                    obj2 = null;
                }
                List list = (List) obj2;
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
            return arrayList;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00022*\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, bng = {"<anonymous>", "", "K", "T", "results", "", "", "kotlin.jvm.PlatformType", "apply", "([Ljava/lang/Object;)Ljava/util/Map;"})
    /* compiled from: RxCommon.kt */
    static final class e<T, R> implements io.reactivex.b.g<Object[], R> {
        final /* synthetic */ List bFf;

        e(List list) {
            this.bFf = list;
        }

        /* renamed from: p */
        public final Map<K, T> apply(Object[] objArr) {
            kotlin.jvm.internal.i.f(objArr, "results");
            Map linkedHashMap = new LinkedHashMap();
            int i = 0;
            for (Object next : this.bFf) {
                int i2 = i + 1;
                if (i < 0) {
                    m.bno();
                }
                Object e = i.e(objArr, i);
                if (!(e instanceof Object)) {
                    e = null;
                }
                if (e != null) {
                    linkedHashMap.put(next, e);
                }
                i = i2;
            }
            return linkedHashMap;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "T", "value", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Object;)V"})
    /* compiled from: RxCommon.kt */
    static final class f<T> implements io.reactivex.b.f<T> {
        final /* synthetic */ aa bFg;

        f(aa aaVar) {
            this.bFg = aaVar;
        }

        public final void accept(T t) {
            this.bFg.set(t);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "T", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RxCommon.kt */
    static final class g<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ aa bFg;

        g(aa aaVar) {
            this.bFg = aaVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.bFg.setException(th);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: RxCommon.kt */
    static final class h implements io.reactivex.b.a {
        final /* synthetic */ aa bFg;

        h(aa aaVar) {
            this.bFg = aaVar;
        }

        public final void run() {
            this.bFg.set(Boolean.valueOf(true));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RxCommon.kt */
    static final class i<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ aa bFg;

        i(aa aaVar) {
            this.bFg = aaVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.bFg.setException(th);
        }
    }

    public static final t<Object> a(io.reactivex.a aVar) {
        return a(aVar, null, 1, null);
    }

    public static final <T> t<T> c(p<T> pVar) {
        return a((p) pVar, null, 1, null);
    }

    public static final <T, R> io.reactivex.b.g<T, R> akf() {
        io.reactivex.b.g gVar = bFa;
        if (gVar != null) {
            return gVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.functions.Function<T, R>");
    }

    public static final <T> l<T> akg() {
        l lVar = bFb;
        if (lVar != null) {
            return lVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.functions.Predicate<T>");
    }

    public static final <T1, T2, T> io.reactivex.e<T> a(io.reactivex.e<T1> eVar, io.reactivex.e<T2> eVar2, io.reactivex.b.c<T1, T2, T> cVar) {
        kotlin.jvm.internal.i.f(eVar, "s1");
        kotlin.jvm.internal.i.f(eVar2, "s2");
        kotlin.jvm.internal.i.f(cVar, "combiner");
        io.reactivex.e a = io.reactivex.e.a((org.a.b) eVar, (org.a.b) eVar2, (io.reactivex.b.c) cVar);
        kotlin.jvm.internal.i.e(a, "Flowable.combineLatest<T… T2, T>(s1, s2, combiner)");
        return a;
    }

    public static final <T1, T2, T3, T> io.reactivex.e<T> a(io.reactivex.e<T1> eVar, io.reactivex.e<T2> eVar2, io.reactivex.e<T3> eVar3, io.reactivex.b.h<T1, T2, T3, T> hVar) {
        kotlin.jvm.internal.i.f(eVar, "s1");
        kotlin.jvm.internal.i.f(eVar2, "s2");
        kotlin.jvm.internal.i.f(eVar3, "s3");
        kotlin.jvm.internal.i.f(hVar, "combiner");
        io.reactivex.e a = io.reactivex.e.a((org.a.b) eVar, (org.a.b) eVar2, (org.a.b) eVar3, (io.reactivex.b.h) hVar);
        kotlin.jvm.internal.i.e(a, "Flowable.combineLatest<T… T>(s1, s2, s3, combiner)");
        return a;
    }

    public static final <T1, T2, T3, T4, T> io.reactivex.e<T> a(io.reactivex.e<T1> eVar, io.reactivex.e<T2> eVar2, io.reactivex.e<T3> eVar3, io.reactivex.e<T4> eVar4, io.reactivex.b.i<T1, T2, T3, T4, T> iVar) {
        kotlin.jvm.internal.i.f(eVar, "s1");
        kotlin.jvm.internal.i.f(eVar2, "s2");
        kotlin.jvm.internal.i.f(eVar3, "s3");
        kotlin.jvm.internal.i.f(eVar4, "s4");
        kotlin.jvm.internal.i.f(iVar, "combiner");
        io.reactivex.e a = io.reactivex.e.a(eVar, eVar2, eVar3, eVar4, iVar);
        kotlin.jvm.internal.i.e(a, "Flowable.combineLatest<T…s1, s2, s3, s4, combiner)");
        return a;
    }

    public static final <T1, T2, T3, T4, T5, T> io.reactivex.e<T> a(io.reactivex.e<T1> eVar, io.reactivex.e<T2> eVar2, io.reactivex.e<T3> eVar3, io.reactivex.e<T4> eVar4, io.reactivex.e<T5> eVar5, j<T1, T2, T3, T4, T5, T> jVar) {
        kotlin.jvm.internal.i.f(eVar, "s1");
        kotlin.jvm.internal.i.f(eVar2, "s2");
        kotlin.jvm.internal.i.f(eVar3, "s3");
        kotlin.jvm.internal.i.f(eVar4, "s4");
        kotlin.jvm.internal.i.f(eVar5, "s5");
        kotlin.jvm.internal.i.f(jVar, "combiner");
        io.reactivex.e a = io.reactivex.e.a((org.a.b) eVar, (org.a.b) eVar2, (org.a.b) eVar3, (org.a.b) eVar4, (org.a.b) eVar5, (j) jVar);
        kotlin.jvm.internal.i.e(a, "Flowable.combineLatest<T…s2, s3, s4, s5, combiner)");
        return a;
    }

    public static final <T, K> io.reactivex.e<Map<K, T>> i(List<? extends K> list, List<? extends io.reactivex.e<T>> list2) {
        kotlin.jvm.internal.i.f(list, "keys");
        kotlin.jvm.internal.i.f(list2, "list");
        io.reactivex.e a = io.reactivex.e.a((Iterable) list2, (io.reactivex.b.g) new e(list));
        kotlin.jvm.internal.i.e(a, "Flowable.combineLatest(l…        }\n        }\n    }");
        return a;
    }

    public static final <T> io.reactivex.e<List<T>> aF(List<? extends io.reactivex.e<List<T>>> list) {
        kotlin.jvm.internal.i.f(list, "list");
        io.reactivex.e a = io.reactivex.e.a((Iterable) list, (io.reactivex.b.g) d.bFe);
        kotlin.jvm.internal.i.e(a, "Flowable.combineLatest(l…        }\n        }\n    }");
        return a;
    }

    public static final <T> t<T> a(p<T> pVar, o oVar) {
        kotlin.jvm.internal.i.f(pVar, "$this$toHotGuavaFuture");
        kotlin.jvm.internal.i.f(oVar, "scheduler");
        aa vM = aa.vM();
        pVar.h(oVar).a((io.reactivex.b.f) new f(vM), (io.reactivex.b.f) new g(vM));
        kotlin.jvm.internal.i.e(vM, "SettableFuture.create<T>…        }\n        )\n    }");
        return vM;
    }

    public static final t<Object> a(io.reactivex.a aVar, o oVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$toHotGuavaFuture");
        kotlin.jvm.internal.i.f(oVar, "scheduler");
        aa vM = aa.vM();
        aVar.b(oVar).a(new h(vM), new i(vM));
        kotlin.jvm.internal.i.e(vM, "SettableFuture.create<An…        }\n        )\n    }");
        return vM;
    }

    public static final <T> io.reactivex.e<kotlin.jvm.a.b<T, T>> f(io.reactivex.e<T> eVar) {
        kotlin.jvm.internal.i.f(eVar, "$this$asIsMutator");
        io.reactivex.e g = eVar.g(new c());
        kotlin.jvm.internal.i.e(g, "map { result ->\n        …, result)\n        }\n    }");
        return g;
    }
}
