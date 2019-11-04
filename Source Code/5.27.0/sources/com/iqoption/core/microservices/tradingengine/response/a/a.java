package com.iqoption.core.microservices.tradingengine.response.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.x;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001#B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016J\u0016\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u0012J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/commision/Commission;", "Landroid/os/Parcelable;", "activeId", "", "commissionData", "Lcom/iqoption/core/microservices/tradingengine/response/commision/Commission$CommissionData;", "(Ljava/lang/Integer;Lcom/iqoption/core/microservices/tradingengine/response/commision/Commission$CommissionData;)V", "getActiveId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCommissionData", "()Lcom/iqoption/core/microservices/tradingengine/response/commision/Commission$CommissionData;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/iqoption/core/microservices/tradingengine/response/commision/Commission$CommissionData;)Lcom/iqoption/core/microservices/tradingengine/response/commision/Commission;", "describeContents", "equals", "", "other", "", "getCommission", "", "amount", "rate", "getPercentCommission", "hashCode", "isValidData", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CommissionData", "core_release"})
/* compiled from: Commission.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new b();
    @SerializedName("active_id")
    private final Integer activeId;
    @SerializedName("commission")
    private final a bAC;

    @i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u001c"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/commision/Commission$CommissionData;", "Landroid/os/Parcelable;", "fix", "", "rateByAmount", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getFix", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRateByAmount", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/iqoption/core/microservices/tradingengine/response/commision/Commission$CommissionData;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
    /* compiled from: Commission.kt */
    public static final class a implements Parcelable {
        public static final Creator CREATOR = new a();
        @SerializedName("fix")
        private final Double bAD;
        @SerializedName("rate_by_amount")
        private final Double bAE;

        @i(bne = {1, 1, 15})
        public static class a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.f(parcel, "in");
                Double d = null;
                Double valueOf = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
                if (parcel.readInt() != 0) {
                    d = Double.valueOf(parcel.readDouble());
                }
                return new a(valueOf, d);
            }

            public final Object[] newArray(int i) {
                return new a[i];
            }
        }

        public a() {
            this(null, null, 3, null);
        }

        public int describeContents() {
            return 0;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bAE, r3.bAE) != false) goto L_0x001f;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.core.microservices.tradingengine.response.a.a.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (com.iqoption.core.microservices.tradingengine.response.a.a.a) r3;
            r0 = r2.bAD;
            r1 = r3.bAD;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.bAE;
            r3 = r3.bAE;
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
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.tradingengine.response.a.a$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Double d = this.bAD;
            int i = 0;
            int hashCode = (d != null ? d.hashCode() : 0) * 31;
            Double d2 = this.bAE;
            if (d2 != null) {
                i = d2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CommissionData(fix=");
            stringBuilder.append(this.bAD);
            stringBuilder.append(", rateByAmount=");
            stringBuilder.append(this.bAE);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            kotlin.jvm.internal.i.f(parcel, "parcel");
            Double d = this.bAD;
            if (d != null) {
                parcel.writeInt(1);
                parcel.writeDouble(d.doubleValue());
            } else {
                parcel.writeInt(0);
            }
            d = this.bAE;
            if (d != null) {
                parcel.writeInt(1);
                parcel.writeDouble(d.doubleValue());
                return;
            }
            parcel.writeInt(0);
        }

        public a(Double d, Double d2) {
            this.bAD = d;
            this.bAE = d2;
        }

        public /* synthetic */ a(Double d, Double d2, int i, f fVar) {
            if ((i & 1) != 0) {
                d = (Double) null;
            }
            if ((i & 2) != 0) {
                d2 = (Double) null;
            }
            this(d, d2);
        }

        public final Double ais() {
            return this.bAD;
        }

        public final Double ait() {
            return this.bAE;
        }
    }

    @i(bne = {1, 1, 15})
    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            a aVar = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                aVar = (a) a.CREATOR.createFromParcel(parcel);
            }
            return new a(valueOf, aVar);
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a() {
        this(null, null, 3, null);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bAC, r3.bAC) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.tradingengine.response.a.a;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.tradingengine.response.a.a) r3;
        r0 = r2.activeId;
        r1 = r3.activeId;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.bAC;
        r3 = r3.bAC;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.tradingengine.response.a.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Integer num = this.activeId;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        a aVar = this.bAC;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Commission(activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", commissionData=");
        stringBuilder.append(this.bAC);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        Integer num = this.activeId;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        a aVar = this.bAC;
        if (aVar != null) {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public a(Integer num, a aVar) {
        this.activeId = num;
        this.bAC = aVar;
    }

    public /* synthetic */ a(Integer num, a aVar, int i, f fVar) {
        if ((i & 1) != 0) {
            num = (Integer) null;
        }
        if ((i & 2) != 0) {
            aVar = (a) null;
        }
        this(num, aVar);
    }

    public final Integer aiq() {
        return this.activeId;
    }

    public final a air() {
        return this.bAC;
    }

    public final boolean aip() {
        a aVar = this.bAC;
        return (aVar == null || ((aVar.ait() == null || com.google.common.c.a.b(0.0d, this.bAC.ait().doubleValue(), 0.0d)) && (this.bAC.ais() == null || com.google.common.c.a.b(0.0d, this.bAC.ais().doubleValue(), 0.0d)))) ? false : true;
    }

    public final double c(double d, double d2) {
        a aVar = this.bAC;
        double d3 = 0.0d;
        if (aVar != null) {
            if (aVar.ais() != null) {
                d3 = 0.0d + (this.bAC.ais().doubleValue() / d2);
            }
            if (this.bAC.ait() != null) {
                d3 += d * this.bAC.ait().doubleValue();
            }
        }
        return x.bRe.g(d3, 2);
    }

    public final double d(double d, double d2) {
        return x.bRe.e(d, c(d, d2));
    }
}
