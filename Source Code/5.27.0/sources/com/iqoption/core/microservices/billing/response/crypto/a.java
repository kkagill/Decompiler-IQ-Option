package com.iqoption.core.microservices.billing.response.crypto;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.CashboxItemType;
import com.iqoption.core.util.o;
import java.util.Arrays;
import kotlin.i;
import kotlin.jvm.internal.n;

@i(bne = {1, 1, 15}, bnf = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0018J\b\u0010J\u001a\u00020KH\u0016J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0007HÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\fHÆ\u0003J\t\u0010[\u001a\u00020\u000eHÆ\u0003J\t\u0010\\\u001a\u00020\u000eHÆ\u0003Jµ\u0001\u0010]\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010^\u001a\u00020\u000eHÖ\u0001J\u0013\u0010_\u001a\u00020?2\b\u0010`\u001a\u0004\u0018\u00010aHÖ\u0003J\n\u0010b\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010c\u001a\u00020\u0005H\u0016J\b\u0010d\u001a\u00020eH\u0016J\b\u0010f\u001a\u00020\u0005H\u0016J\t\u0010g\u001a\u00020\u000eHÖ\u0001J\t\u0010h\u001a\u00020\u0005HÖ\u0001J\u0019\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020\u000eHÖ\u0001R\u001e\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010)R\u001e\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010$\"\u0004\b1\u0010)R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR\u001e\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010$\"\u0004\b5\u0010)R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u0010\u001cR\u001e\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010\u001cR \u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010\u001cR\u0017\u0010>\u001a\u00020?8F¢\u0006\f\u0012\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001a\"\u0004\bI\u0010\u001c¨\u0006n"}, bng = {"Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "billingId", "", "amountCrypto", "", "amountFiat", "", "fiatCurrency", "fiatCurrencyMask", "cryptoCurrency", "status", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositStatus;", "confirmsIn", "", "confirmsCap", "txHash", "createdAt", "refundedAmount", "actualCryptoAmount", "completedAt", "cashboxCssClass", "expiryTime", "sessionId", "(JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositStatus;IILjava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;)V", "getActualCryptoAmount", "()Ljava/lang/String;", "setActualCryptoAmount", "(Ljava/lang/String;)V", "getAmountCrypto", "setAmountCrypto", "getAmountFiat", "()D", "setAmountFiat", "(D)V", "getBillingId", "()J", "getCashboxCssClass", "setCashboxCssClass", "getCompletedAt", "setCompletedAt", "(J)V", "getConfirmsCap", "()I", "setConfirmsCap", "(I)V", "getConfirmsIn", "setConfirmsIn", "getCreatedAt", "setCreatedAt", "getCryptoCurrency", "setCryptoCurrency", "getExpiryTime", "setExpiryTime", "getFiatCurrency", "setFiatCurrency", "getFiatCurrencyMask", "setFiatCurrencyMask", "getRefundedAmount", "setRefundedAmount", "getSessionId", "setSessionId", "shouldShowDeposit", "", "shouldShowDeposit$annotations", "()V", "getShouldShowDeposit", "()Z", "getStatus", "()Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositStatus;", "setStatus", "(Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositStatus;)V", "getTxHash", "setTxHash", "category", "Lcom/iqoption/core/microservices/billing/response/deposit/MethodCategory;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "getImageUrl", "getName", "getType", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItemType;", "getUniqueId", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: CryptoDeposit.kt */
public final class a implements com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a {
    public static final Creator CREATOR = new a();
    @SerializedName("billing_id")
    private final long bmA;
    @SerializedName("amount_crypto")
    private String bmE;
    @SerializedName("amount_fiat")
    private double bmF;
    @SerializedName("fiat_currency")
    private String bmG;
    @SerializedName("fiat_currency_mask")
    private String bmH;
    @SerializedName("crypto_currency")
    private String bmI;
    @SerializedName("status")
    private CryptoDepositStatus bmJ;
    @SerializedName("confirms_in")
    private int bmK;
    @SerializedName("confirms_cap")
    private int bmL;
    @SerializedName("tx_hash")
    private String bmM;
    @SerializedName("created_at")
    private long bmN;
    @SerializedName("refunded_amount")
    private String bmO;
    @SerializedName("actual_crypto_amount")
    private String bmP;
    @SerializedName("completed_at")
    private long bmQ;
    @SerializedName("cashbox_css_class")
    private String bmR;
    @SerializedName("expiry_time")
    private long bmS;
    @SerializedName("sess_id")
    private String qO;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new a(parcel.readLong(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), (CryptoDepositStatus) Enum.valueOf(CryptoDepositStatus.class, parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public static /* synthetic */ a a(a aVar, long j, String str, double d, String str2, String str3, String str4, CryptoDepositStatus cryptoDepositStatus, int i, int i2, String str5, long j2, String str6, String str7, long j3, String str8, long j4, String str9, int i3, Object obj) {
        long j5;
        a aVar2 = aVar;
        int i4 = i3;
        long j6 = (i4 & 1) != 0 ? aVar2.bmA : j;
        String str10 = (i4 & 2) != 0 ? aVar2.bmE : str;
        double d2 = (i4 & 4) != 0 ? aVar2.bmF : d;
        String str11 = (i4 & 8) != 0 ? aVar2.bmG : str2;
        String str12 = (i4 & 16) != 0 ? aVar2.bmH : str3;
        String str13 = (i4 & 32) != 0 ? aVar2.bmI : str4;
        CryptoDepositStatus cryptoDepositStatus2 = (i4 & 64) != 0 ? aVar2.bmJ : cryptoDepositStatus;
        int i5 = (i4 & 128) != 0 ? aVar2.bmK : i;
        int i6 = (i4 & 256) != 0 ? aVar2.bmL : i2;
        String str14 = (i4 & 512) != 0 ? aVar2.bmM : str5;
        j2 = (i4 & 1024) != 0 ? aVar2.bmN : j2;
        String str15 = (i4 & 2048) != 0 ? aVar2.bmO : str6;
        str7 = (i4 & 4096) != 0 ? aVar2.bmP : str7;
        if ((i4 & 8192) != 0) {
            str6 = str15;
            j5 = aVar2.bmQ;
        } else {
            str6 = str15;
            j5 = j3;
        }
        j3 = j5;
        str15 = (i4 & 16384) != 0 ? aVar2.bmR : str8;
        if ((32768 & i4) != 0) {
            str8 = str15;
            j5 = aVar2.bmS;
        } else {
            str8 = str15;
            j5 = j4;
        }
        return aVar.a(j6, str10, d2, str11, str12, str13, cryptoDepositStatus2, i5, i6, str14, j2, str6, str7, j3, str8, j5, (i4 & 65536) != 0 ? aVar2.qO : str9);
    }

    public final a a(long j, String str, double d, String str2, String str3, String str4, CryptoDepositStatus cryptoDepositStatus, int i, int i2, String str5, long j2, String str6, String str7, long j3, String str8, long j4, String str9) {
        long j5 = j;
        String str10 = str;
        double d2 = d;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        CryptoDepositStatus cryptoDepositStatus2 = cryptoDepositStatus;
        int i3 = i;
        int i4 = i2;
        String str14 = str5;
        long j6 = j2;
        String str15 = str6;
        String str16 = str7;
        long j7 = j3;
        String str17 = str8;
        long j8 = j4;
        String str18 = str9;
        kotlin.jvm.internal.i.f(str, "amountCrypto");
        kotlin.jvm.internal.i.f(str2, "fiatCurrency");
        kotlin.jvm.internal.i.f(str3, "fiatCurrencyMask");
        kotlin.jvm.internal.i.f(str4, "cryptoCurrency");
        kotlin.jvm.internal.i.f(cryptoDepositStatus, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.i.f(str5, "txHash");
        kotlin.jvm.internal.i.f(str6, "refundedAmount");
        kotlin.jvm.internal.i.f(str7, "actualCryptoAmount");
        kotlin.jvm.internal.i.f(str8, "cashboxCssClass");
        return new a(j, str10, d2, str11, str12, str13, cryptoDepositStatus2, i3, i4, str14, j6, str15, str16, j7, str17, j8, str18);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if ((this.bmA == aVar.bmA ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bmE, aVar.bmE) && Double.compare(this.bmF, aVar.bmF) == 0 && kotlin.jvm.internal.i.y(this.bmG, aVar.bmG) && kotlin.jvm.internal.i.y(this.bmH, aVar.bmH) && kotlin.jvm.internal.i.y(this.bmI, aVar.bmI) && kotlin.jvm.internal.i.y(this.bmJ, aVar.bmJ)) {
                    if ((this.bmK == aVar.bmK ? 1 : null) != null) {
                        if ((this.bmL == aVar.bmL ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bmM, aVar.bmM)) {
                            if ((this.bmN == aVar.bmN ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bmO, aVar.bmO) && kotlin.jvm.internal.i.y(this.bmP, aVar.bmP)) {
                                if ((this.bmQ == aVar.bmQ ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bmR, aVar.bmR)) {
                                    if ((this.bmS == aVar.bmS ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.qO, aVar.qO)) {
                                        return false;
                                    }
                                }
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
        str = this.bmH;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bmI;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        CryptoDepositStatus cryptoDepositStatus = this.bmJ;
        i = (((((i + (cryptoDepositStatus != null ? cryptoDepositStatus.hashCode() : 0)) * 31) + this.bmK) * 31) + this.bmL) * 31;
        str = this.bmM;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        doubleToLongBits = this.bmN;
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        str = this.bmO;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bmP;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        doubleToLongBits = this.bmQ;
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        str = this.bmR;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        doubleToLongBits = this.bmS;
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        str = this.qO;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CryptoDeposit(billingId=");
        stringBuilder.append(this.bmA);
        stringBuilder.append(", amountCrypto=");
        stringBuilder.append(this.bmE);
        stringBuilder.append(", amountFiat=");
        stringBuilder.append(this.bmF);
        stringBuilder.append(", fiatCurrency=");
        stringBuilder.append(this.bmG);
        stringBuilder.append(", fiatCurrencyMask=");
        stringBuilder.append(this.bmH);
        stringBuilder.append(", cryptoCurrency=");
        stringBuilder.append(this.bmI);
        stringBuilder.append(", status=");
        stringBuilder.append(this.bmJ);
        stringBuilder.append(", confirmsIn=");
        stringBuilder.append(this.bmK);
        stringBuilder.append(", confirmsCap=");
        stringBuilder.append(this.bmL);
        stringBuilder.append(", txHash=");
        stringBuilder.append(this.bmM);
        stringBuilder.append(", createdAt=");
        stringBuilder.append(this.bmN);
        stringBuilder.append(", refundedAmount=");
        stringBuilder.append(this.bmO);
        stringBuilder.append(", actualCryptoAmount=");
        stringBuilder.append(this.bmP);
        stringBuilder.append(", completedAt=");
        stringBuilder.append(this.bmQ);
        stringBuilder.append(", cashboxCssClass=");
        stringBuilder.append(this.bmR);
        stringBuilder.append(", expiryTime=");
        stringBuilder.append(this.bmS);
        stringBuilder.append(", sessionId=");
        stringBuilder.append(this.qO);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.bmA);
        parcel.writeString(this.bmE);
        parcel.writeDouble(this.bmF);
        parcel.writeString(this.bmG);
        parcel.writeString(this.bmH);
        parcel.writeString(this.bmI);
        parcel.writeString(this.bmJ.name());
        parcel.writeInt(this.bmK);
        parcel.writeInt(this.bmL);
        parcel.writeString(this.bmM);
        parcel.writeLong(this.bmN);
        parcel.writeString(this.bmO);
        parcel.writeString(this.bmP);
        parcel.writeLong(this.bmQ);
        parcel.writeString(this.bmR);
        parcel.writeLong(this.bmS);
        parcel.writeString(this.qO);
    }

    public a(long j, String str, double d, String str2, String str3, String str4, CryptoDepositStatus cryptoDepositStatus, int i, int i2, String str5, long j2, String str6, String str7, long j3, String str8, long j4, String str9) {
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        CryptoDepositStatus cryptoDepositStatus2 = cryptoDepositStatus;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        kotlin.jvm.internal.i.f(str, "amountCrypto");
        kotlin.jvm.internal.i.f(str11, "fiatCurrency");
        kotlin.jvm.internal.i.f(str12, "fiatCurrencyMask");
        kotlin.jvm.internal.i.f(str13, "cryptoCurrency");
        kotlin.jvm.internal.i.f(cryptoDepositStatus2, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.i.f(str14, "txHash");
        kotlin.jvm.internal.i.f(str15, "refundedAmount");
        kotlin.jvm.internal.i.f(str16, "actualCryptoAmount");
        kotlin.jvm.internal.i.f(str17, "cashboxCssClass");
        this.bmA = j;
        this.bmE = str10;
        this.bmF = d;
        this.bmG = str11;
        this.bmH = str12;
        this.bmI = str13;
        this.bmJ = cryptoDepositStatus2;
        this.bmK = i;
        this.bmL = i2;
        this.bmM = str14;
        this.bmN = j2;
        this.bmO = str15;
        this.bmP = str16;
        this.bmQ = j3;
        this.bmR = str17;
        this.bmS = j4;
        this.qO = str9;
    }

    public boolean ZY() {
        return com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a.a.g(this);
    }

    public String ZZ() {
        return com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a.a.h(this);
    }

    public final long ZF() {
        return this.bmA;
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

    public final String ZP() {
        return this.bmH;
    }

    public final String ZQ() {
        return this.bmI;
    }

    public final CryptoDepositStatus ZR() {
        return this.bmJ;
    }

    public final int ZS() {
        return this.bmK;
    }

    public final int ZT() {
        return this.bmL;
    }

    public final long ZU() {
        return this.bmN;
    }

    public final String ZV() {
        return this.bmP;
    }

    public final String ZW() {
        return this.bmR;
    }

    public final String ZX() {
        return this.qO;
    }

    public final boolean ZJ() {
        int i = b.aob[this.bmJ.ordinal()];
        if (!(i == 1 || i == 2 || i == 3)) {
            if (i != 4) {
                if (i != 5 || this.bmL <= this.bmK) {
                    return false;
                }
            } else if (e.a(e.bmZ, this.bmS, 0, 2, null) <= 0) {
                return false;
            }
        }
        return true;
    }

    public String ZK() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("crypto-deposit-");
        stringBuilder.append(this.bmA);
        return stringBuilder.toString();
    }

    public String getName() {
        n nVar = n.eWf;
        Object[] objArr = new Object[]{Double.valueOf(this.bmF)};
        String format = String.format(this.bmH, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(format, "java.lang.String.format(format, *args)");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(format);
        stringBuilder.append(" (");
        stringBuilder.append(this.bmE);
        stringBuilder.append(' ');
        stringBuilder.append(this.bmI);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public CashboxItemType ZL() {
        return CashboxItemType.CRYPTO_DEPOSIT;
    }
}
