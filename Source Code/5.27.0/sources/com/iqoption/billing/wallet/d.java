package com.iqoption.billing.wallet;

import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentDataRequest.Builder;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.TransactionInfo;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Pair;
import kotlin.i;
import kotlin.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\b\u0010\u0010\u001a\u0004\u0018\u00010\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/billing/wallet/WalletPaymentsUtil;", "", "()V", "allowedCardAuthMethods", "", "", "", "allowedCardNetworks", "baseRequest", "Lorg/json/JSONObject;", "baseCardPaymentMethod", "createPaymentDataRequest", "Lcom/google/android/gms/wallet/PaymentDataRequest;", "amount", "Ljava/math/BigDecimal;", "currency", "isReadyToPayRequest", "billing_release"})
/* compiled from: WalletPaymentsUtil.kt */
public final class d {
    private static final JSONObject azJ;
    private static final Map<Integer, String> azK;
    private static final Map<Integer, String> azL;
    public static final d azM = new d();

    static {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("apiVersion", 2);
        jSONObject.put("apiVersionMinor", 0);
        azJ = jSONObject;
        r0 = new Pair[2];
        r0[0] = j.x(Integer.valueOf(1), "PAN_ONLY");
        r0[1] = j.x(Integer.valueOf(2), "CRYPTOGRAM_3DS");
        azK = af.a(r0);
        azL = af.a(j.x(r4, "AMEX"), j.x(Integer.valueOf(5), "VISA"), j.x(Integer.valueOf(4), "MASTERCARD"));
    }

    private d() {
    }

    private final JSONObject KL() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedAuthMethods", new JSONArray(azK.values()));
        jSONObject2.put("allowedCardNetworks", new JSONArray(azL.values()));
        jSONObject2.put("billingAddressRequired", true);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("format", "FULL");
        jSONObject2.put("billingAddressParameters", jSONObject3);
        jSONObject.put("type", "CARD");
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    public final JSONObject KM() {
        try {
            JSONObject jSONObject = new JSONObject(azJ.toString());
            jSONObject.put("allowedPaymentMethods", new JSONArray().put(KL()));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final PaymentDataRequest a(BigDecimal bigDecimal, String str) {
        kotlin.jvm.internal.i.f(bigDecimal, "amount");
        kotlin.jvm.internal.i.f(str, "currency");
        Builder cardRequirements = PaymentDataRequest.newBuilder().setTransactionInfo(TransactionInfo.newBuilder().setTotalPriceStatus(3).setTotalPrice(e.a(bigDecimal)).setCurrencyCode(str).build()).addAllowedPaymentMethods(azK.keySet()).setCardRequirements(CardRequirements.newBuilder().addAllowedCardNetworks(azL.keySet()).build());
        cardRequirements.setPaymentMethodTokenizationParameters(PaymentMethodTokenizationParameters.newBuilder().setPaymentMethodTokenizationType(1).addParameter("gateway", "worldpay").addParameter("gatewayMerchantId", a.azB.KE()).build());
        PaymentDataRequest build = cardRequirements.build();
        kotlin.jvm.internal.i.e(build, "request.build()");
        return build;
    }
}
