package com.iqoption.core.microservices.billing.response.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000  2\u00020\u0001:\u0001 B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006!"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/ProcessingTime;", "Landroid/os/Parcelable;", "min", "", "max", "timeScale", "Lcom/iqoption/core/microservices/billing/response/deposit/TimeScale;", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/iqoption/core/microservices/billing/response/deposit/TimeScale;)V", "getMax", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMin", "getTimeScale", "()Lcom/iqoption/core/microservices/billing/response/deposit/TimeScale;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/iqoption/core/microservices/billing/response/deposit/TimeScale;)Lcom/iqoption/core/microservices/billing/response/deposit/ProcessingTime;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "core_release"})
/* compiled from: ProcessingTime.kt */
public final class g implements Parcelable {
    public static final Creator CREATOR = new b();
    private static final g bnO = new g(null, null, TimeScale.INSTANT);
    public static final a bnP = new a();
    @SerializedName("max")
    private final Integer bnM;
    @SerializedName("time_scale")
    private final TimeScale bnN;
    @SerializedName("min")
    private final Integer min;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/billing/response/deposit/ProcessingTime$Companion;", "", "()V", "PROCESSING_INSTANT", "Lcom/iqoption/core/microservices/billing/response/deposit/ProcessingTime;", "getPROCESSING_INSTANT", "()Lcom/iqoption/core/microservices/billing/response/deposit/ProcessingTime;", "core_release"})
    /* compiled from: ProcessingTime.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final g aaA() {
            return g.bnO;
        }
    }

    @i(bne = {1, 1, 15})
    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            TimeScale timeScale = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                timeScale = (TimeScale) Enum.valueOf(TimeScale.class, parcel.readString());
            }
            return new g(valueOf, valueOf2, timeScale);
        }

        public final Object[] newArray(int i) {
            return new g[i];
        }
    }

    public g() {
        this(null, null, null, 7, null);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bnN, r3.bnN) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.billing.response.deposit.g;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.billing.response.deposit.g) r3;
        r0 = r2.min;
        r1 = r3.min;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.bnM;
        r1 = r3.bnM;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.bnN;
        r3 = r3.bnN;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.billing.response.deposit.g.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Integer num = this.min;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.bnM;
        hashCode = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        TimeScale timeScale = this.bnN;
        if (timeScale != null) {
            i = timeScale.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProcessingTime(min=");
        stringBuilder.append(this.min);
        stringBuilder.append(", max=");
        stringBuilder.append(this.bnM);
        stringBuilder.append(", timeScale=");
        stringBuilder.append(this.bnN);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        Integer num = this.min;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        num = this.bnM;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        TimeScale timeScale = this.bnN;
        if (timeScale != null) {
            parcel.writeInt(1);
            parcel.writeString(timeScale.name());
            return;
        }
        parcel.writeInt(0);
    }

    public g(Integer num, Integer num2, TimeScale timeScale) {
        this.min = num;
        this.bnM = num2;
        this.bnN = timeScale;
    }

    public /* synthetic */ g(Integer num, Integer num2, TimeScale timeScale, int i, f fVar) {
        if ((i & 1) != 0) {
            num = (Integer) null;
        }
        if ((i & 2) != 0) {
            num2 = (Integer) null;
        }
        if ((i & 4) != 0) {
            timeScale = (TimeScale) null;
        }
        this(num, num2, timeScale);
    }

    public final Integer getMin() {
        return this.min;
    }

    public final Integer aax() {
        return this.bnM;
    }

    public final TimeScale aay() {
        return this.bnN;
    }
}
