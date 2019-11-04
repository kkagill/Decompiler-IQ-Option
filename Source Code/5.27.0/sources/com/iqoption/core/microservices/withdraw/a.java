package com.iqoption.core.microservices.withdraw;

import com.google.gson.reflect.TypeToken;
import com.iqoption.core.connect.http.c;
import com.iqoption.core.connect.j;
import com.iqoption.core.microservices.withdraw.response.d;
import com.iqoption.core.microservices.withdraw.response.e;
import com.iqoption.core.microservices.withdraw.response.l;
import com.iqoption.core.microservices.withdraw.response.n;
import com.iqoption.core.microservices.withdraw.response.o;
import com.iqoption.core.microservices.withdraw.response.q;
import com.iqoption.core.microservices.withdraw.response.r;
import com.iqoption.dto.entity.position.Order;
import io.reactivex.b.g;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.i;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import org.json.JSONObject;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018J8\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\"\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u001fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001` J\"\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u001a2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004J$\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u001aJ\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u001aJ/\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\"0\u001a2\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u000102¢\u0006\u0002\u00104J8\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u0002062\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000107R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u00068"}, bng = {"Lcom/iqoption/core/microservices/withdraw/WithdrawRequests;", "", "()V", "API_EXTERNAL_CARD", "", "API_EXTERNAL_PAYOUT_CANCEL", "API_EXTERNAL_WITHDRAWAL", "API_EXTERNAL_WITHDRAWAL_PAYOUT", "CARD_ID", "CARD_LIST_TYPE", "Ljava/lang/reflect/Type;", "CMD_CREATE_PAYOUT", "CMD_GET_CASHBOX_PAYOUT_METHODS", "CMD_GET_PAYOUT_COMMISSION", "CMD_GET_USER_PAYOUT_SETTINGS", "CMD_GET_WITHDRAWAL_PAYOUTS", "ID", "IQOPTION_PAYMENT_METHOD_ID", "PAYOUT_METHOD_ID", "cancel", "Lio/reactivex/Completable;", "host", "sessionId", "id", "", "createPayout", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawResponse;", "method", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethod;", "params", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getCards", "", "Lcom/iqoption/core/microservices/withdraw/response/Card;", "getPayoutCommission", "Lcom/iqoption/core/microservices/withdraw/response/PayoutCommission;", "methodId", "amount", "", "includeCommission", "", "getPayoutMethods", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethodsResponse;", "getUserPayoutSettings", "Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;", "payoutHistory", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawPayout;", "limit", "", "offset", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/Single;", "withdrawal", "Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "", "core_release"})
/* compiled from: WithdrawRequests.kt */
public final class a {
    public static final a bDL = new a();
    private static final Type boI;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001¨\u0006\u0005"}, bng = {"com/iqoption/core/microservices/withdraw/WithdrawRequests$CARD_LIST_TYPE$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/ArrayList;", "Lcom/iqoption/core/microservices/withdraw/response/Card;", "Lkotlin/collections/ArrayList;", "core_release"})
    /* compiled from: WithdrawRequests.kt */
    public static final class a extends TypeToken<ArrayList<d>> {
        a() {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawPayout;", "it", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawalPayoutResponse;", "apply"})
    /* compiled from: WithdrawRequests.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b bDN = new b();

        b() {
        }

        /* renamed from: a */
        public final List<o> apply(r rVar) {
            kotlin.jvm.internal.i.f(rVar, "it");
            return rVar.aaX();
        }
    }

    static {
        Type type = new a().getType();
        if (type == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        boI = type;
    }

    private a() {
    }

    public final p<List<d>> aq(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "host");
        kotlin.jvm.internal.i.f(str2, "sessionId");
        c cVar = c.baF;
        Builder url = c.a(c.baF, new Builder(), null, 1, null).url(com.iqoption.core.data.config.b.ad(str, "api/external/card"));
        kotlin.jvm.internal.i.e(url, "Request.Builder().accept…host, API_EXTERNAL_CARD))");
        Builder builder = cVar.c(url, str2).header("Content-Type", String.valueOf(c.baF.UF())).get();
        cVar = c.baF;
        kotlin.jvm.internal.i.e(builder, "builder");
        return c.b(cVar, builder, WithdrawRequests$getCards$1.bDM, null, null, 12, null);
    }

    public final p<q> a(String str, String str2, com.iqoption.core.microservices.withdraw.response.c cVar, Map<String, ? extends Object> map) {
        Object obj;
        kotlin.jvm.internal.i.f(str, "host");
        kotlin.jvm.internal.i.f(str2, "sessionId");
        kotlin.jvm.internal.i.f(cVar, "method");
        kotlin.jvm.internal.i.f(map, "params");
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        if (cVar instanceof e) {
            e eVar = (e) cVar;
            jSONObject.put("card_id", eVar.aaB());
            Long ajH = eVar.ajH();
            if (ajH != null) {
                jSONObject.put("iqoption_payment_method_id", ajH.longValue());
            }
            obj = 1;
        } else if (cVar instanceof l) {
            obj = null;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected method type: ");
            stringBuilder.append(cVar);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        jSONObject.put("payout_method_id", cVar.getId());
        String str3 = obj != null ? "api/external/withdrawal" : "api/external/withdrawal/payout";
        RequestBody create = RequestBody.create(c.baF.UF(), jSONObject.toString());
        c cVar2 = c.baF;
        Builder url = c.a(c.baF, new Builder(), null, 1, null).url(com.iqoption.core.data.config.b.ad(str, str3));
        kotlin.jvm.internal.i.e(url, "Request.Builder().accept…url(buildUrl(host, path))");
        Builder post = cVar2.c(url, str2).header("Content-Type", String.valueOf(c.baF.UF())).post(create);
        cVar2 = c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return c.b(cVar2, post, WithdrawRequests$withdrawal$2.bDO, null, null, 12, null);
    }

    public final p<q> a(l lVar, HashMap<String, Object> hashMap) {
        kotlin.jvm.internal.i.f(lVar, "method");
        kotlin.jvm.internal.i.f(hashMap, "params");
        return com.iqoption.core.d.EV().a("create-payout", q.class).b(hashMap).k("payout_method_id", Long.valueOf(lVar.getId())).fp("1.0").UB();
    }

    public static /* synthetic */ p a(a aVar, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = Integer.valueOf(50);
        }
        if ((i & 2) != 0) {
            num2 = Integer.valueOf(0);
        }
        return aVar.a(num, num2);
    }

    public final p<List<o>> a(Integer num, Integer num2) {
        p t = com.iqoption.core.d.EV().a("get-withdrawal-payouts", r.class).fp("1.0").k(Order.LIMIT, num).k("offset", num2).UB().t(b.bDN);
        kotlin.jvm.internal.i.e(t, "requestBuilderFactory.cr…     .map { it.invoices }");
        return t;
    }

    public final io.reactivex.a b(String str, String str2, long j) {
        kotlin.jvm.internal.i.f(str, "host");
        kotlin.jvm.internal.i.f(str2, "sessionId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", j);
        RequestBody create = RequestBody.create(c.baF.UF(), jSONObject.toString());
        c cVar = c.baF;
        Builder url = c.a(c.baF, new Builder(), null, 1, null).url(com.iqoption.core.data.config.b.ad(str, "api/external/payout/cancel"));
        kotlin.jvm.internal.i.e(url, "Request.Builder().accept…_EXTERNAL_PAYOUT_CANCEL))");
        Builder post = cVar.c(url, str2).header("Content-Type", String.valueOf(c.baF.UF())).post(create);
        c cVar2 = c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        io.reactivex.a blf = c.b(cVar2, post, com.iqoption.core.connect.a.Uw(), null, null, 12, null).blf();
        kotlin.jvm.internal.i.e(blf, "Http.executeSingle(build…R_STRING).ignoreElement()");
        return blf;
    }

    public final p<n> ajv() {
        return com.iqoption.core.d.EV().a("get-cashbox-payout-methods", n.class).fp("1.0").UB();
    }

    public final p<com.iqoption.core.microservices.withdraw.response.i> ajw() {
        return com.iqoption.core.d.EV().a("get-user-payout-settings", com.iqoption.core.microservices.withdraw.response.i.class).fp("1.0").UB();
    }

    public final p<com.iqoption.core.microservices.withdraw.response.g> a(long j, double d, boolean z) {
        String str = "payout_method_id";
        j k = com.iqoption.core.d.EV().a("get-payout-commission", com.iqoption.core.microservices.withdraw.response.g.class).fp("1.0").k(str, Long.valueOf(j));
        Double valueOf = Double.valueOf(d);
        return k.k("amount", valueOf).k("commission_included", Boolean.valueOf(z)).eG(5).UB();
    }
}
