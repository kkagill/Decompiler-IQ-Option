package com.iqoption.cardsverification.repository;

import com.google.gson.reflect.TypeToken;
import com.iqoption.core.data.d.e;
import com.iqoption.core.ext.d;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/cardsverification/repository/VerifyLocalStatusesRepository;", "", "()V", "STATUS_LIST_TYPE", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "getVerifyStatuses", "Lio/reactivex/Single;", "", "Lcom/iqoption/cardsverification/repository/VerifyStatus;", "setVerifyStatuses", "Lio/reactivex/Completable;", "statuses", "cardsverification_release"})
/* compiled from: VerifyLocalStatusesRepository.kt */
public final class b {
    private static final Type aBN = new a().getType();
    public static final b aBO = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "Lcom/iqoption/cardsverification/repository/VerifyStatus;", "call"})
    /* compiled from: VerifyLocalStatusesRepository.kt */
    static final class b<V> implements Callable<T> {
        public static final b aBP = new b();

        b() {
        }

        public final List<c> call() {
            String WL = e.bdq.WL();
            if (WL != null) {
                Type a = b.aBN;
                kotlin.jvm.internal.i.e(a, "STATUS_LIST_TYPE");
                List<c> list = (List) d.a(WL, a, null, 2, null);
                if (list != null) {
                    return list;
                }
            }
            return m.emptyList();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, bng = {"com/iqoption/cardsverification/repository/VerifyLocalStatusesRepository$STATUS_LIST_TYPE$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/iqoption/cardsverification/repository/VerifyStatus;", "cardsverification_release"})
    /* compiled from: VerifyLocalStatusesRepository.kt */
    public static final class a extends TypeToken<List<? extends c>> {
        a() {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: VerifyLocalStatusesRepository.kt */
    static final class c implements io.reactivex.b.a {
        final /* synthetic */ List aBQ;

        c(List list) {
            this.aBQ = list;
        }

        public final void run() {
            e.bdq.fM(d.a(this.aBQ, null, 1, null));
        }
    }

    private b() {
    }

    public final io.reactivex.a O(List<c> list) {
        kotlin.jvm.internal.i.f(list, "statuses");
        io.reactivex.a b = io.reactivex.a.b((io.reactivex.b.a) new c(list));
        kotlin.jvm.internal.i.e(b, "Completable.fromAction {…atuses.toJson()\n        }");
        return b;
    }

    public final p<List<c>> Lp() {
        p j = p.j(b.aBP);
        kotlin.jvm.internal.i.e(j, "Single.fromCallable {\n  … ?: emptyList()\n        }");
        return j;
    }
}
