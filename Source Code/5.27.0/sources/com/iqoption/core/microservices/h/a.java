package com.iqoption.core.microservices.h;

import com.iqoption.core.d;
import io.reactivex.b.g;
import io.reactivex.p;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\u0010\t\u001a\u00020\n\"\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/useronline/UserOnlineRequests;", "", "()V", "CMD_GET_USERS_AVAILABILITY", "", "getUsersAvailability", "Lio/reactivex/Single;", "", "Lcom/iqoption/core/microservices/useronline/response/UserAvailability;", "ids", "", "", "core_release"})
/* compiled from: UserOnlineRequests.kt */
public final class a {
    public static final a bDf = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/useronline/response/UserAvailability;", "it", "Lcom/iqoption/core/microservices/useronline/UserStatusesResponse;", "apply"})
    /* compiled from: UserOnlineRequests.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a bDg = new a();

        a() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.h.a.a> apply(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return bVar.ajg();
        }
    }

    private a() {
    }

    public final p<List<com.iqoption.core.microservices.h.a.a>> a(long... jArr) {
        kotlin.jvm.internal.i.f(jArr, "ids");
        if ((jArr.length == 0 ? 1 : null) == null) {
            p t = d.EV().a("get-users-availability", b.class).k("user_ids", jArr).UB().t(a.bDg);
            kotlin.jvm.internal.i.e(t, "requestBuilderFactory\n  …     .map { it.statuses }");
            return t;
        }
        throw new IllegalArgumentException("User ids must not be empty");
    }
}
