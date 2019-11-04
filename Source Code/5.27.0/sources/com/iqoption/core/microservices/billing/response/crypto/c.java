package com.iqoption.core.microservices.billing.response.crypto;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00109\u001a\u00020\u000eHÆ\u0003Jy\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u000eHÖ\u0001J\t\u0010?\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001e\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010&R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010\u0015¨\u0006@"}, bng = {"Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositRequisites;", "", "billingId", "", "amountCrypto", "", "amountFiat", "", "fiatCurrency", "cryptoCurrency", "sessionWallet", "expiryTime", "recommendedCommission", "confirmsCap", "", "cryptoRateFixInterval", "refundWallet", "(JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;IILjava/lang/String;)V", "getAmountCrypto", "()Ljava/lang/String;", "setAmountCrypto", "(Ljava/lang/String;)V", "getAmountFiat", "()D", "setAmountFiat", "(D)V", "getBillingId", "()J", "getConfirmsCap", "()I", "setConfirmsCap", "(I)V", "getCryptoCurrency", "setCryptoCurrency", "getCryptoRateFixInterval", "setCryptoRateFixInterval", "getExpiryTime", "setExpiryTime", "(J)V", "getFiatCurrency", "setFiatCurrency", "getRecommendedCommission", "setRecommendedCommission", "getRefundWallet", "setRefundWallet", "getSessionWallet", "setSessionWallet", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "core_release"})
@o
/* compiled from: CryptoDepositRequisites.kt */
public final class c {
    @SerializedName("billing_id")
    private final long bmA;
    @SerializedName("amount_crypto")
    private String bmE;
    @SerializedName("amount_fiat")
    private double bmF;
    @SerializedName("fiat_currency")
    private String bmG;
    @SerializedName("crypto_currency")
    private String bmI;
    @SerializedName("confirms_cap")
    private int bmL;
    @SerializedName("expiry_time")
    private long bmS;
    @SerializedName("session_wallet")
    private String bmT;
    @SerializedName("recommended_commission")
    private String bmU;
    @SerializedName("crypto_rate_fix_interval")
    private int bmV;
    @SerializedName("refund_wallet")
    private String bmW;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if ((this.bmA == cVar.bmA ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bmE, cVar.bmE) && Double.compare(this.bmF, cVar.bmF) == 0 && kotlin.jvm.internal.i.y(this.bmG, cVar.bmG) && kotlin.jvm.internal.i.y(this.bmI, cVar.bmI) && kotlin.jvm.internal.i.y(this.bmT, cVar.bmT)) {
                    if ((this.bmS == cVar.bmS ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bmU, cVar.bmU)) {
                        if ((this.bmL == cVar.bmL ? 1 : null) != null) {
                            if ((this.bmV == cVar.bmV ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bmW, cVar.bmW)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.bmA;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.bmE;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.bmF);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        str = this.bmG;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bmI;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bmT;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        doubleToLongBits = this.bmS;
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        str = this.bmU;
        i = (((((i + (str != null ? str.hashCode() : 0)) * 31) + this.bmL) * 31) + this.bmV) * 31;
        str = this.bmW;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CryptoDepositRequisites(billingId=");
        stringBuilder.append(this.bmA);
        stringBuilder.append(", amountCrypto=");
        stringBuilder.append(this.bmE);
        stringBuilder.append(", amountFiat=");
        stringBuilder.append(this.bmF);
        stringBuilder.append(", fiatCurrency=");
        stringBuilder.append(this.bmG);
        stringBuilder.append(", cryptoCurrency=");
        stringBuilder.append(this.bmI);
        stringBuilder.append(", sessionWallet=");
        stringBuilder.append(this.bmT);
        stringBuilder.append(", expiryTime=");
        stringBuilder.append(this.bmS);
        stringBuilder.append(", recommendedCommission=");
        stringBuilder.append(this.bmU);
        stringBuilder.append(", confirmsCap=");
        stringBuilder.append(this.bmL);
        stringBuilder.append(", cryptoRateFixInterval=");
        stringBuilder.append(this.bmV);
        stringBuilder.append(", refundWallet=");
        stringBuilder.append(this.bmW);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final String ZM() {
        return this.bmE;
    }

    public final double ZN() {
        return this.bmF;
    }

    public final String ZO() {
        return this.bmG;
    }

    public final String ZQ() {
        return this.bmI;
    }

    public final String aaa() {
        return this.bmT;
    }

    public final long aab() {
        return this.bmS;
    }

    public final String aac() {
        return this.bmU;
    }

    public final int aad() {
        return this.bmV;
    }

    public final String aae() {
        return this.bmW;
    }
}
