package com.iqoption.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, bng = {"Lcom/iqoption/deposit/InitSelectOption;", "Landroid/os/Parcelable;", "methodId", "", "firstHoldPayment", "", "(Ljava/lang/Long;Z)V", "getFirstHoldPayment", "()Z", "getMethodId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/Long;Z)Lcom/iqoption/deposit/InitSelectOption;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "deposit_release"})
/* compiled from: InitSelectOption.kt */
public final class l implements Parcelable {
    public static final Creator CREATOR = new b();
    public static final a cxq = new a();
    private final Long cxo;
    private final boolean cxp;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, bng = {"Lcom/iqoption/deposit/InitSelectOption$Companion;", "", "()V", "createForHold", "Lcom/iqoption/deposit/InitSelectOption;", "createForMethod", "methodId", "", "(Ljava/lang/Long;)Lcom/iqoption/deposit/InitSelectOption;", "deposit_release"})
    /* compiled from: InitSelectOption.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final l p(Long l) {
            return l != null ? new l(Long.valueOf(l.longValue()), false) : null;
        }

        public final l aoQ() {
            return new l(null, true);
        }
    }

    @i(bne = {1, 1, 15})
    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new l(parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new l[i];
        }
    }

    public static final l aoQ() {
        return cxq.aoQ();
    }

    public static final l p(Long l) {
        return cxq.p(l);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (kotlin.jvm.internal.i.y(this.cxo, lVar.cxo)) {
                    if ((this.cxp == lVar.cxp ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Long l = this.cxo;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        int i = this.cxp;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InitSelectOption(methodId=");
        stringBuilder.append(this.cxo);
        stringBuilder.append(", firstHoldPayment=");
        stringBuilder.append(this.cxp);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        Long l = this.cxo;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.cxp);
    }

    public l(Long l, boolean z) {
        this.cxo = l;
        this.cxp = z;
        if (this.cxo != null && this.cxp) {
            throw new IllegalStateException("Both options are selected");
        }
    }

    public final Long aoO() {
        return this.cxo;
    }

    public final boolean aoP() {
        return this.cxp;
    }
}
