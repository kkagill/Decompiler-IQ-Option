package com.iqoption.core.microservices.billing.response.deposit.cashboxitem;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.billing.response.deposit.MethodCategory;
import com.iqoption.core.microservices.billing.response.deposit.g;
import com.iqoption.core.microservices.billing.response.extraparams.e;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001TB¿\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001aJ\n\u0010-\u001a\u0004\u0018\u00010\tH\u0016J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000fHÂ\u0003¢\u0006\u0002\u00100J\u0010\u00101\u001a\u0004\u0018\u00010\u000fHÂ\u0003¢\u0006\u0002\u00100J\u000b\u00102\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÂ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\tHÂ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010>\u001a\u00020\u0005HÂ\u0003JÐ\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010@J\t\u0010A\u001a\u00020BHÖ\u0001J\u0013\u0010C\u001a\u00020\u000f2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\b\u0010F\u001a\u00020\u0005H\u0016J\b\u0010G\u001a\u00020\u0005H\u0016J\b\u0010H\u001a\u00020\u0003H\u0016J\b\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u00020\u0005H\u0016J\t\u0010L\u001a\u00020BHÖ\u0001J\b\u0010M\u001a\u00020\u000fH\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\t\u0010N\u001a\u00020\u0005HÖ\u0001J\u0019\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020BHÖ\u0001R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u0012\u0010\f\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0010\u0010\r\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0018\u001a\u00020\u000f8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010'R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0004\n\u0002\u0010\u001bR$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006U"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PaymentMethod;", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PayMethod;", "id", "", "_name", "", "cashboxCssClass", "paySystem", "_category", "Lcom/iqoption/core/microservices/billing/response/deposit/MethodCategory;", "cardId", "cardNumber", "cardIcon", "iconUrl", "kycRestricted", "", "canProcessCardApi", "extraParams", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParams;", "limits", "Ljava/util/HashMap;", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PaymentMethod$Limit;", "processingTime", "Lcom/iqoption/core/microservices/billing/response/deposit/ProcessingTime;", "isDisabled", "disabledReason", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/billing/response/deposit/MethodCategory;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParams;Ljava/util/HashMap;Lcom/iqoption/core/microservices/billing/response/deposit/ProcessingTime;ZLjava/lang/String;)V", "Ljava/lang/Boolean;", "getCardId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCardNumber", "()Ljava/lang/String;", "getCashboxCssClass", "getDisabledReason", "getExtraParams", "()Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParams;", "getId", "()J", "()Z", "getLimits", "()Ljava/util/HashMap;", "getPaySystem", "getProcessingTime", "()Lcom/iqoption/core/microservices/billing/response/deposit/ProcessingTime;", "category", "component1", "component10", "()Ljava/lang/Boolean;", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/billing/response/deposit/MethodCategory;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParams;Ljava/util/HashMap;Lcom/iqoption/core/microservices/billing/response/deposit/ProcessingTime;ZLjava/lang/String;)Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PaymentMethod;", "describeContents", "", "equals", "other", "", "getImageUrl", "getName", "getPayMethodId", "getType", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItemType;", "getUniqueId", "hashCode", "isKycRestricted", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Limit", "core_release"})
/* compiled from: PaymentMethod.kt */
public final class d implements c {
    public static final Creator CREATOR = new a();
    @SerializedName("icon_url")
    private final String aIF;
    @SerializedName("cashbox_css_class")
    private final String bmR;
    @SerializedName("name")
    private final String bnS;
    @SerializedName("pay_system")
    private final String bnT;
    @SerializedName("category")
    private final MethodCategory bnU;
    @SerializedName("card_id")
    private final Long bnV;
    @SerializedName("card_icon")
    private final String bnW;
    @SerializedName("kyc_restricted")
    private final Boolean bnX;
    @SerializedName("can_process_card_api")
    private final Boolean bnY;
    @SerializedName("extra_params")
    private final e bnZ;
    @SerializedName("limits")
    private final HashMap<String, b> boa;
    @SerializedName("processing_time")
    private final g bob;
    @SerializedName("is_temporary_disabled")
    private final boolean boc;
    @SerializedName("disabled_reason")
    private final String bod;
    @SerializedName("card_number")
    private final String cardNumber;
    @SerializedName("id")
    private final long id;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            HashMap hashMap;
            Parcel parcel2 = parcel;
            kotlin.jvm.internal.i.f(parcel2, "in");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            MethodCategory methodCategory = parcel.readInt() != 0 ? (MethodCategory) Enum.valueOf(MethodCategory.class, parcel.readString()) : null;
            Long valueOf3 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                valueOf = null;
            }
            if (parcel.readInt() != 0) {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                valueOf2 = null;
            }
            e eVar = parcel.readInt() != 0 ? (e) e.CREATOR.createFromParcel(parcel2) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                HashMap hashMap2 = new HashMap(readInt);
                while (readInt != 0) {
                    hashMap2.put(parcel.readString(), (b) b.CREATOR.createFromParcel(parcel2));
                    readInt--;
                }
                hashMap = hashMap2;
            } else {
                hashMap = null;
            }
            return new d(readLong, readString, readString2, readString3, methodCategory, valueOf3, readString4, readString5, readString6, valueOf, valueOf2, eVar, hashMap, parcel.readInt() != 0 ? (g) g.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new d[i];
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012HÖ\u0001R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u001f"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PaymentMethod$Limit;", "Landroid/os/Parcelable;", "min", "", "max", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getMax", "()Ljava/lang/Double;", "setMax", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getMin", "setMin", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/PaymentMethod$Limit;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
    /* compiled from: PaymentMethod.kt */
    public static final class b implements Parcelable {
        public static final Creator CREATOR = new a();
        @SerializedName("min")
        private Double aJW;
        @SerializedName("max")
        private Double aJX;

        @i(bne = {1, 1, 15})
        public static class a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.f(parcel, "in");
                Double d = null;
                Double valueOf = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
                if (parcel.readInt() != 0) {
                    d = Double.valueOf(parcel.readDouble());
                }
                return new b(valueOf, d);
            }

            public final Object[] newArray(int i) {
                return new b[i];
            }
        }

        public b() {
            this(null, null, 3, null);
        }

        public int describeContents() {
            return 0;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.aJX, r3.aJX) != false) goto L_0x001f;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d.b;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d.b) r3;
            r0 = r2.aJW;
            r1 = r3.aJW;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.aJX;
            r3 = r3.aJX;
            r3 = kotlin.jvm.internal.i.y(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d$b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Double d = this.aJW;
            int i = 0;
            int hashCode = (d != null ? d.hashCode() : 0) * 31;
            Double d2 = this.aJX;
            if (d2 != null) {
                i = d2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Limit(min=");
            stringBuilder.append(this.aJW);
            stringBuilder.append(", max=");
            stringBuilder.append(this.aJX);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            kotlin.jvm.internal.i.f(parcel, "parcel");
            Double d = this.aJW;
            if (d != null) {
                parcel.writeInt(1);
                parcel.writeDouble(d.doubleValue());
            } else {
                parcel.writeInt(0);
            }
            d = this.aJX;
            if (d != null) {
                parcel.writeInt(1);
                parcel.writeDouble(d.doubleValue());
                return;
            }
            parcel.writeInt(0);
        }

        public b(Double d, Double d2) {
            this.aJW = d;
            this.aJX = d2;
        }

        public /* synthetic */ b(Double d, Double d2, int i, f fVar) {
            if ((i & 1) != 0) {
                d = (Double) null;
            }
            if ((i & 2) != 0) {
                d2 = (Double) null;
            }
            this(d, d2);
        }

        public final Double OL() {
            return this.aJW;
        }

        public final Double OM() {
            return this.aJX;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if ((this.id == dVar.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bnS, dVar.bnS) && kotlin.jvm.internal.i.y(this.bmR, dVar.bmR) && kotlin.jvm.internal.i.y(this.bnT, dVar.bnT) && kotlin.jvm.internal.i.y(this.bnU, dVar.bnU) && kotlin.jvm.internal.i.y(this.bnV, dVar.bnV) && kotlin.jvm.internal.i.y(this.cardNumber, dVar.cardNumber) && kotlin.jvm.internal.i.y(this.bnW, dVar.bnW) && kotlin.jvm.internal.i.y(this.aIF, dVar.aIF) && kotlin.jvm.internal.i.y(this.bnX, dVar.bnX) && kotlin.jvm.internal.i.y(this.bnY, dVar.bnY) && kotlin.jvm.internal.i.y(this.bnZ, dVar.bnZ) && kotlin.jvm.internal.i.y(this.boa, dVar.boa) && kotlin.jvm.internal.i.y(this.bob, dVar.bob)) {
                    if ((ZY() == dVar.ZY() ? 1 : null) == null || !kotlin.jvm.internal.i.y(ZZ(), dVar.ZZ())) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.bnS;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bmR;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bnT;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        MethodCategory methodCategory = this.bnU;
        i = (i + (methodCategory != null ? methodCategory.hashCode() : 0)) * 31;
        Long l = this.bnV;
        i = (i + (l != null ? l.hashCode() : 0)) * 31;
        str = this.cardNumber;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bnW;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.aIF;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.bnX;
        i = (i + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.bnY;
        i = (i + (bool != null ? bool.hashCode() : 0)) * 31;
        e eVar = this.bnZ;
        i = (i + (eVar != null ? eVar.hashCode() : 0)) * 31;
        HashMap hashMap = this.boa;
        i = (i + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        g gVar = this.bob;
        i = (i + (gVar != null ? gVar.hashCode() : 0)) * 31;
        int ZY = ZY();
        if (ZY != 0) {
            ZY = 1;
        }
        i = (i + ZY) * 31;
        str = ZZ();
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PaymentMethod(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", _name=");
        stringBuilder.append(this.bnS);
        stringBuilder.append(", cashboxCssClass=");
        stringBuilder.append(this.bmR);
        stringBuilder.append(", paySystem=");
        stringBuilder.append(this.bnT);
        stringBuilder.append(", _category=");
        stringBuilder.append(this.bnU);
        stringBuilder.append(", cardId=");
        stringBuilder.append(this.bnV);
        stringBuilder.append(", cardNumber=");
        stringBuilder.append(this.cardNumber);
        stringBuilder.append(", cardIcon=");
        stringBuilder.append(this.bnW);
        stringBuilder.append(", iconUrl=");
        stringBuilder.append(this.aIF);
        stringBuilder.append(", kycRestricted=");
        stringBuilder.append(this.bnX);
        stringBuilder.append(", canProcessCardApi=");
        stringBuilder.append(this.bnY);
        stringBuilder.append(", extraParams=");
        stringBuilder.append(this.bnZ);
        stringBuilder.append(", limits=");
        stringBuilder.append(this.boa);
        stringBuilder.append(", processingTime=");
        stringBuilder.append(this.bob);
        stringBuilder.append(", isDisabled=");
        stringBuilder.append(ZY());
        stringBuilder.append(", disabledReason=");
        stringBuilder.append(ZZ());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.bnS);
        parcel.writeString(this.bmR);
        parcel.writeString(this.bnT);
        MethodCategory methodCategory = this.bnU;
        if (methodCategory != null) {
            parcel.writeInt(1);
            parcel.writeString(methodCategory.name());
        } else {
            parcel.writeInt(0);
        }
        Long l = this.bnV;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.cardNumber);
        parcel.writeString(this.bnW);
        parcel.writeString(this.aIF);
        Boolean bool = this.bnX;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue());
        } else {
            parcel.writeInt(0);
        }
        bool = this.bnY;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue());
        } else {
            parcel.writeInt(0);
        }
        e eVar = this.bnZ;
        if (eVar != null) {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        HashMap hashMap = this.boa;
        if (hashMap != null) {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            for (Object next : hashMap.entrySet()) {
                parcel.writeString((String) next.getKey());
                ((b) next.getValue()).writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        g gVar = this.bob;
        if (gVar != null) {
            parcel.writeInt(1);
            gVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.boc);
        parcel.writeString(this.bod);
    }

    public d(long j, String str, String str2, String str3, MethodCategory methodCategory, Long l, String str4, String str5, String str6, Boolean bool, Boolean bool2, e eVar, HashMap<String, b> hashMap, g gVar, boolean z, String str7) {
        String str8 = str;
        String str9 = str2;
        String str10 = str6;
        kotlin.jvm.internal.i.f(str, "_name");
        kotlin.jvm.internal.i.f(str2, "cashboxCssClass");
        kotlin.jvm.internal.i.f(str10, "iconUrl");
        this.id = j;
        this.bnS = str8;
        this.bmR = str9;
        this.bnT = str3;
        this.bnU = methodCategory;
        this.bnV = l;
        this.cardNumber = str4;
        this.bnW = str5;
        this.aIF = str10;
        this.bnX = bool;
        this.bnY = bool2;
        this.bnZ = eVar;
        this.boa = hashMap;
        this.bob = gVar;
        this.boc = z;
        this.bod = str7;
    }

    public final long getId() {
        return this.id;
    }

    public final String ZW() {
        return this.bmR;
    }

    public final String aaG() {
        return this.bnT;
    }

    public final e aaH() {
        return this.bnZ;
    }

    public final HashMap<String, b> aaI() {
        return this.boa;
    }

    public boolean ZY() {
        return this.boc;
    }

    public String ZZ() {
        return this.bod;
    }

    public String ZK() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("method-");
        stringBuilder.append(this.id);
        return stringBuilder.toString();
    }

    public String getName() {
        return this.bnS;
    }

    public long aaD() {
        return this.id;
    }

    public CashboxItemType ZL() {
        return CashboxItemType.PAYMENT_METHOD;
    }

    public boolean aaE() {
        Boolean bool = this.bnX;
        return bool != null && bool.booleanValue();
    }

    public g aaF() {
        return this.bob;
    }
}
