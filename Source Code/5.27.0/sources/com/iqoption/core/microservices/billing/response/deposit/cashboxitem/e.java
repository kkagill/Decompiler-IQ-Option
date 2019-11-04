package com.iqoption.core.microservices.billing.response.deposit.cashboxitem;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.base.j;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.billing.response.deposit.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 12\u00020\u0001:\u00011Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u001eJ\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020\nH\u0016J\u0006\u0010)\u001a\u00020\nJ\b\u0010*\u001a\u00020+H\u0016J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001eHÖ\u0001R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\t\u0010\u0015R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013¨\u00062"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/UserCard;", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PayMethod;", "paymentMethodId", "", "cardId", "cardNumber", "", "cardIcon", "iconUrl", "isDefault3ds", "", "kycRestricted", "paymentMethod3dsId", "_cardHolder", "expiryDate", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getCardIcon", "()Ljava/lang/String;", "getCardId", "()J", "getCardNumber", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPaymentMethod3dsId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPaymentMethodId", "category", "Lcom/iqoption/core/microservices/billing/response/deposit/MethodCategory;", "describeContents", "", "getCardHolder", "getExpiryMonth", "getExpiryYear", "getImageUrl", "getName", "getPayMethodId", "getType", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItemType;", "getUniqueId", "isKycRestricted", "isValidDate", "processingTime", "Lcom/iqoption/core/microservices/billing/response/deposit/ProcessingTime;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "core_release"})
/* compiled from: UserCard.kt */
public final class e implements c {
    public static final Creator CREATOR = new c();
    public static final j<e> boi = b.bok;
    public static final a boj = new a();
    @SerializedName("icon_url")
    private final String aIF;
    @SerializedName("card_id")
    private final long bnQ;
    @SerializedName("card_icon")
    private final String bnW;
    @SerializedName("kyc_restricted")
    private final Boolean bnX;
    @SerializedName("payment_method_id")
    private final long boe;
    @SerializedName("default_3ds")
    private final Boolean bof;
    @SerializedName("payment_method_3ds_id")
    private final Long bog;
    @SerializedName("card_holder")
    private final String boh;
    @SerializedName("card_number")
    private final String cardNumber;
    @SerializedName("expiry_date")
    private final String expiryDate;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/UserCard$Companion;", "", "()V", "hasPaymentMethod3dsId", "Lcom/google/common/base/Predicate;", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/UserCard;", "core_release"})
    /* compiled from: UserCard.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15})
    public static class c implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            kotlin.jvm.internal.i.f(parcel, "in");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 0) {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                valueOf = null;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                valueOf2 = Boolean.valueOf(z);
            } else {
                valueOf2 = null;
            }
            return new e(readLong, readLong2, readString, readString2, readString3, valueOf, valueOf2, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new e[i];
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "card", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/UserCard;", "apply"})
    /* compiled from: UserCard.kt */
    static final class b<T> implements j<e> {
        public static final b bok = new b();

        b() {
        }

        /* renamed from: a */
        public final boolean apply(e eVar) {
            if (eVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            Long aaJ = eVar.aaJ();
            return aaJ == null || aaJ.longValue() != -1;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.boe);
        parcel.writeLong(this.bnQ);
        parcel.writeString(this.cardNumber);
        parcel.writeString(this.bnW);
        parcel.writeString(this.aIF);
        Boolean bool = this.bof;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue());
        } else {
            parcel.writeInt(0);
        }
        bool = this.bnX;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue());
        } else {
            parcel.writeInt(0);
        }
        Long l = this.bog;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.boh);
        parcel.writeString(this.expiryDate);
    }

    public e(long j, long j2, String str, String str2, String str3, Boolean bool, Boolean bool2, Long l, String str4, String str5) {
        kotlin.jvm.internal.i.f(str, "cardNumber");
        kotlin.jvm.internal.i.f(str2, "cardIcon");
        kotlin.jvm.internal.i.f(str3, "iconUrl");
        this.boe = j;
        this.bnQ = j2;
        this.cardNumber = str;
        this.bnW = str2;
        this.aIF = str3;
        this.bof = bool;
        this.bnX = bool2;
        this.bog = l;
        this.boh = str4;
        this.expiryDate = str5;
    }

    public boolean ZY() {
        return com.iqoption.core.microservices.billing.response.deposit.cashboxitem.c.a.a(this);
    }

    public String ZZ() {
        return com.iqoption.core.microservices.billing.response.deposit.cashboxitem.c.a.b(this);
    }

    public final long aaB() {
        return this.bnQ;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final Long aaJ() {
        return this.bog;
    }

    public String ZK() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("card-");
        stringBuilder.append(this.bnQ);
        return stringBuilder.toString();
    }

    public long aaD() {
        return this.boe;
    }

    public String getName() {
        return this.cardNumber;
    }

    public CashboxItemType ZL() {
        return CashboxItemType.USER_CARD;
    }

    public boolean aaE() {
        Boolean bool = this.bnX;
        return bool != null && bool.booleanValue();
    }

    public g aaF() {
        return g.bnP.aaA();
    }
}
