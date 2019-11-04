package com.iqoption.core.microservices.billing.verification;

import com.google.gson.reflect.TypeToken;
import com.iqoption.core.connect.k;
import com.iqoption.core.d;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.billing.verification.response.VerifyInitResult;
import com.iqoption.core.microservices.billing.verification.response.c;
import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0007J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00140\r2\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\r2\u0006\u0010\u0019\u001a\u00020\u0007J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/core/microservices/billing/verification/VerificationRequests;", "", "()V", "CARD_LIST_TYPE", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "CMD_GET_BIN_INFO", "", "CMD_GET_VERIFY_CARD_STATUS", "CMD_SET_VERIFY_CARD_UPLOADED", "CMD_VERIFY_INIT", "EVENT_VERIFY_CARD_STATUS_CHANGED", "getBinInfo", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/billing/verification/response/BinInfoResult;", "bin", "getVerifyCardStatusUpdates", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "requestVerifyCardStatus", "", "userId", "", "setVerifyCardUploaded", "Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;", "uuid", "verifyInit", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyInitResult;", "cardId", "core_release"})
/* compiled from: VerificationRequests.kt */
public final class a {
    private static final Type boI = new a().getType();
    public static final a boJ = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, bng = {"com/iqoption/core/microservices/billing/verification/VerificationRequests$CARD_LIST_TYPE$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "core_release"})
    /* compiled from: VerificationRequests.kt */
    public static final class a extends TypeToken<List<? extends c>> {
        a() {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;", "it", "Lcom/iqoption/core/microservices/billing/verification/response/SetVerifyCardUploadedResult;", "apply"})
    /* compiled from: VerificationRequests.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b boK = new b();

        b() {
        }

        /* renamed from: a */
        public final CardStatus apply(com.iqoption.core.microservices.billing.verification.response.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return bVar.Lq();
        }
    }

    private a() {
    }

    public final p<List<c>> aT(long j) {
        k EV = d.EV();
        Type type = boI;
        kotlin.jvm.internal.i.e(type, "CARD_LIST_TYPE");
        String str = "get-verify-card-status";
        return EV.a(str, type).fo(str).k("user_id", Long.valueOf(j)).fp("1.0").UB();
    }

    public final e<c> aaY() {
        return d.EW().b("verify-card-status-changed", c.class).HQ();
    }

    public final p<CardStatus> gh(String str) {
        String str2 = "uuid";
        kotlin.jvm.internal.i.f(str, str2);
        p t = d.EV().a("set-verify-card-uploaded", com.iqoption.core.microservices.billing.verification.response.b.class).k(str2, str).UB().t(b.boK);
        kotlin.jvm.internal.i.e(t, "requestBuilderFactory.cr…       .map { it.status }");
        return t;
    }

    public final p<com.iqoption.core.microservices.billing.verification.response.a> gi(String str) {
        String str2 = "bin";
        kotlin.jvm.internal.i.f(str, str2);
        return d.EV().a("get-bin-info", com.iqoption.core.microservices.billing.verification.response.a.class).k(str2, str).fp("1.0").UB();
    }

    public final p<VerifyInitResult> q(long j, long j2) {
        String str = "user_id";
        return d.EV().a("verify-init", VerifyInitResult.class).k(str, Long.valueOf(j)).k("card_id", Long.valueOf(j2)).fp("1.0").UB();
    }
}
