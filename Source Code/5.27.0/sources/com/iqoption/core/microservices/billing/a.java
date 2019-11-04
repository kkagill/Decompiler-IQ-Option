package com.iqoption.core.microservices.billing;

import androidx.core.app.NotificationCompat;
import com.google.gson.reflect.TypeToken;
import com.iqoption.core.connect.k;
import com.iqoption.core.microservices.billing.response.PaymentStatusType;
import com.iqoption.core.microservices.billing.response.crypto.h;
import com.iqoption.core.microservices.billing.response.d;
import com.iqoption.dto.event.OtnEmissionExecuted;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.internal.n;
import okhttp3.FormBody;
import okhttp3.FormBody.Builder;
import okhttp3.Request;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00172\u0006\u0010!\u001a\u00020\"J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$J\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0\u0017J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0017J$\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00172\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004J\f\u00100\u001a\b\u0012\u0004\u0012\u0002010$J\u001c\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00172\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0004J-\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060'0\u00172\b\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:¢\u0006\u0002\u0010;J\u001a\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010=2\u0006\u0010>\u001a\u00020\"J:\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010=2\u0006\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u00020:2\u0006\u0010D\u001a\u00020\u0004Jq\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u00172\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\"2\u0006\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u00042\u0014\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010=2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010J2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010OR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, bng = {"Lcom/iqoption/core/microservices/billing/CashBoxRequests;", "", "()V", "CMD_CASHBOX_COUNTING", "", "CMD_CASHBOX_PAY", "CMD_CREATE_SESSION", "CMD_GET_CRYPTO_DEPOSITS", "CMD_GET_CRYPTO_DEPOSIT_REQUISITES", "CMD_GET_CRYPTO_TO_FIAT_SETTINGS", "CMD_GET_CURRENCY_RATE", "CMD_GET_PAYMENT_STATUS", "CMD_GET_USER_INVOICES", "CRYPTO_TO_FIAT", "EVENT_CRYPTO_DEPOSIT_STATUS_UPDATED", "EVENT_DEPOSIT_COMPLETED", "SESSION_ID", "SUPPORT_GOOGLE_PAY", "TEMP_DISABLED", "TYPE_CRYPTO_DEPOSITS", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "createSession", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/billing/response/CreateSessionResult;", "getCashBoxCounting", "Lcom/iqoption/core/microservices/billing/response/CashboxResult;", "sessionHost", "sessionId", "tempDisabled", "", "getCryptoDepositRequisites", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositRequisites;", "billingId", "", "getCryptoDepositStatusUpdates", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositStatusUpdate;", "getCryptoDeposits", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "getCryptoToFiatSettings", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoToFiatSettingsResult;", "getCurrencyRate", "Lcom/iqoption/core/microservices/billing/response/crypto/CurrencyRateResponse;", "methodId", "from", "to", "getDepositCompletedUpdates", "Lcom/iqoption/core/microservices/billing/response/DepositCompleted;", "getPaymentStatus", "Lcom/iqoption/core/microservices/billing/response/failure/PaymentStatusResponse;", "lang", "getUserInvoices", "Lcom/iqoption/core/microservices/billing/response/invoice/Invoice;", "status", "Lcom/iqoption/core/microservices/billing/response/PaymentStatusType;", "count", "", "(Lcom/iqoption/core/microservices/billing/response/PaymentStatusType;Ljava/lang/Integer;)Lio/reactivex/Single;", "mapLinkedCardParams", "", "cardId", "mapNewCardFields", "cardNumber", "cardHolderName", "cardExpMonth", "cardExpYear", "cardCvv", "pay", "Lcom/iqoption/core/microservices/billing/response/PayResponse;", "paymentMethodId", "currency", "amount", "Ljava/math/BigDecimal;", "bonusCode", "extraParams", "cryptoAmount", "isCryptoBased", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/Map;Ljava/math/BigDecimal;Ljava/lang/Boolean;)Lio/reactivex/Single;", "core_release"})
/* compiled from: CashBoxRequests.kt */
public final class a {
    private static final Type bmh = new a().getType();
    public static final a bmi = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, bng = {"com/iqoption/core/microservices/billing/CashBoxRequests$TYPE_CRYPTO_DEPOSITS$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "core_release"})
    /* compiled from: CashBoxRequests.kt */
    public static final class a extends TypeToken<List<? extends com.iqoption.core.microservices.billing.response.crypto.a>> {
        a() {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/billing/response/CreateSessionResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: CashBoxRequests.kt */
    static final class b<T> implements f<d> {
        public static final b bmj = new b();

        b() {
        }

        /* renamed from: b */
        public final void accept(d dVar) {
            CharSequence Zx = dVar.ZA().Zx();
            Object obj = (Zx == null || Zx.length() == 0) ? 1 : null;
            if (obj != null) {
                throw new IllegalStateException("Session is empty");
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/billing/response/invoice/Invoice;", "it", "Lcom/iqoption/core/microservices/billing/response/invoice/UserInvoicesResponse;", "apply"})
    /* compiled from: CashBoxRequests.kt */
    static final class c<T, R> implements g<T, R> {
        public static final c bmk = new c();

        c() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.billing.response.a.a> apply(com.iqoption.core.microservices.billing.response.a.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return bVar.aaX();
        }
    }

    private a() {
    }

    public final p<d> Zr() {
        FormBody build = new Builder().build();
        Request.Builder a = com.iqoption.core.connect.http.c.a(com.iqoption.core.connect.http.c.baF, new Request.Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.iqoption.core.d.Um().EE().Vb());
        stringBuilder.append("api/new-billing/create-session");
        Request.Builder post = a.url(stringBuilder.toString()).post(build);
        k EV = com.iqoption.core.d.EV();
        Request build2 = post.build();
        kotlin.jvm.internal.i.e(build2, "builder.build()");
        p h = EV.a(build2, d.class).UB().h((f) b.bmj);
        kotlin.jvm.internal.i.e(h, "requestBuilderFactory.cr…      }\n                }");
        return h;
    }

    public static /* synthetic */ p a(a aVar, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return aVar.d(str, str2, z);
    }

    public final p<com.iqoption.core.microservices.billing.response.c> d(String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(str, "sessionHost");
        kotlin.jvm.internal.i.f(str2, "sessionId");
        if (u.Y(str2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Session must not be empty: ");
            stringBuilder.append(str2);
            p ab = p.ab(new IllegalArgumentException(stringBuilder.toString()));
            kotlin.jvm.internal.i.e(ab, "Single.error(IllegalArgu…t be empty: $sessionId\"))");
            return ab;
        }
        Pair[] pairArr = new Pair[1];
        pairArr[0] = j.x("temp_disabled", Boolean.valueOf(z));
        Map b = af.b(pairArr);
        if ((kotlin.jvm.internal.i.y(str2, "EMPTY_SESSION") ^ 1) != 0) {
            b.put("sess_id", str2);
        }
        if (com.iqoption.core.d.EH().ej("crypto-to-fiat")) {
            b.put("crypto_to_fiat", Boolean.valueOf(true));
        }
        if (b.bmm.Zw()) {
            b.put("support_google_pay", Boolean.valueOf(true));
        }
        Request.Builder a = com.iqoption.core.connect.http.c.baF.a(new Request.Builder(), str, "/external/cashbox/counting", b);
        k EV = com.iqoption.core.d.EV();
        Request build = a.build();
        kotlin.jvm.internal.i.e(build, "builder.build()");
        return EV.a(build, com.iqoption.core.microservices.billing.response.c.class).UB();
    }

    public final p<com.iqoption.core.microservices.billing.response.f> a(String str, String str2, long j, String str3, BigDecimal bigDecimal, String str4, Map<String, ? extends Object> map, BigDecimal bigDecimal2, Boolean bool) {
        kotlin.jvm.internal.i.f(str, "sessionHost");
        kotlin.jvm.internal.i.f(str2, "sessionId");
        String str5 = "currency";
        kotlin.jvm.internal.i.f(str3, str5);
        String str6 = "amount";
        kotlin.jvm.internal.i.f(bigDecimal, str6);
        Builder add = new Builder().add("payment_method", String.valueOf(j)).add(str5, str3).add(str6, bigDecimal.toPlainString()).add("hold_support", String.valueOf(true));
        if ((kotlin.jvm.internal.i.y(str2, "EMPTY_SESSION") ^ 1) != 0) {
            add.add("sess_id", str2);
        }
        if (str4 != null) {
            if ((((CharSequence) str4).length() > 0 ? 1 : null) != null) {
                add.add("bonuscode", str4);
            }
        }
        if (bigDecimal2 != null) {
            add.add("crypto_amount", bigDecimal2.toPlainString());
        }
        if (bool != null) {
            add.add("is_crypto_based", bool.booleanValue() ? "1" : "0");
        }
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                str4 = (String) entry.getKey();
                Object value = entry.getValue();
                n nVar = n.eWf;
                Locale locale = Locale.US;
                kotlin.jvm.internal.i.e(locale, "Locale.US");
                Object[] objArr = new Object[]{str4};
                str4 = String.format(locale, "extra_params[%s]", Arrays.copyOf(objArr, objArr.length));
                kotlin.jvm.internal.i.e(str4, "java.lang.String.format(locale, format, *args)");
                add.add(str4, value.toString());
            }
        }
        Request.Builder a = com.iqoption.core.connect.http.c.a(com.iqoption.core.connect.http.c.baF, new Request.Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("/external/cashbox/pay");
        Request.Builder post = a.url(stringBuilder.toString()).post(add.build());
        com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return cVar.b(post, CashBoxRequests$pay$1.bml, com.iqoption.core.connect.http.b.bau, com.iqoption.core.connect.http.c.UJ());
    }

    public final p<com.iqoption.core.microservices.billing.response.failure.a> ak(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "sessionId");
        String str3 = "lang";
        kotlin.jvm.internal.i.f(str2, str3);
        return com.iqoption.core.d.EV().a("get-payment-status", com.iqoption.core.microservices.billing.response.failure.a.class).k("sess_id", str).k(str3, str2).fp("2.0").UB();
    }

    public final Map<String, Object> a(String str, String str2, int i, int i2, String str3) {
        kotlin.jvm.internal.i.f(str, "cardNumber");
        kotlin.jvm.internal.i.f(str2, "cardHolderName");
        kotlin.jvm.internal.i.f(str3, "cardCvv");
        Pair[] pairArr = new Pair[6];
        pairArr[0] = j.x("card_number", str);
        pairArr[1] = j.x("card_holder", str2);
        n nVar = n.eWf;
        Locale locale = Locale.US;
        kotlin.jvm.internal.i.e(locale, "Locale.US");
        Object[] objArr = new Object[]{Integer.valueOf(i)};
        str = String.format(locale, "%02d", Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(str, "java.lang.String.format(locale, format, *args)");
        pairArr[2] = j.x("card_exp_month", str);
        pairArr[3] = j.x("card_exp_year", Integer.valueOf(i2));
        pairArr[4] = j.x("card_cvv", str3);
        pairArr[5] = j.x("link_card_agree", Boolean.valueOf(true));
        return af.a(pairArr);
    }

    public final Map<String, Object> aR(long j) {
        return ae.m(j.x("card_id", Long.valueOf(j)));
    }

    public final p<List<com.iqoption.core.microservices.billing.response.a.a>> a(PaymentStatusType paymentStatusType, Integer num) {
        p t = com.iqoption.core.d.EV().a("get-user-invoices", com.iqoption.core.microservices.billing.response.a.b.class).k(OtnEmissionExecuted.COUNT, num).k(NotificationCompat.CATEGORY_STATUS, paymentStatusType != null ? paymentStatusType.getServerValue() : null).fp("1.0").UB().t(c.bmk);
        kotlin.jvm.internal.i.e(t, "requestBuilderFactory.cr…     .map { it.invoices }");
        return t;
    }

    public final e<com.iqoption.core.microservices.billing.response.e> Zs() {
        return com.iqoption.core.d.EW().b("deposit-completed", com.iqoption.core.microservices.billing.response.e.class).HQ();
    }

    public final p<com.iqoption.core.microservices.billing.response.crypto.f> Zt() {
        return com.iqoption.core.d.EV().a("get-crypto-to-fiat-settings", com.iqoption.core.microservices.billing.response.crypto.f.class).fp("1.0").UB();
    }

    public final p<h> b(long j, String str, String str2) {
        kotlin.jvm.internal.i.f(str, "from");
        kotlin.jvm.internal.i.f(str2, "to");
        return com.iqoption.core.d.EV().a("get-currency-rate", h.class).fp("1.0").k("method_id", Long.valueOf(j)).k("from_currency", str).k("to_currency", str2).UB();
    }

    public final p<com.iqoption.core.microservices.billing.response.crypto.c> aS(long j) {
        return com.iqoption.core.d.EV().a("get-crypto-deposit-requisites", com.iqoption.core.microservices.billing.response.crypto.c.class).fp("1.0").k("billing_id", Long.valueOf(j)).UB();
    }

    public final p<List<com.iqoption.core.microservices.billing.response.crypto.a>> Zu() {
        k EV = com.iqoption.core.d.EV();
        Type type = bmh;
        kotlin.jvm.internal.i.e(type, "TYPE_CRYPTO_DEPOSITS");
        return EV.a("get-crypto-deposits", type).fp("1.0").UB();
    }

    public final e<com.iqoption.core.microservices.billing.response.crypto.d> Zv() {
        return com.iqoption.core.d.EW().b("crypto-deposit-status-updated", com.iqoption.core.microservices.billing.response.crypto.d.class).ec("1.0").HQ();
    }
}
