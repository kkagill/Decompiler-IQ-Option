package com.iqoption.deposit.c.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0016HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\bX\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, bng = {"Lcom/iqoption/deposit/menu/method/MethodAdapterItem;", "Lcom/iqoption/deposit/menu/method/BaseMethodAdapterItem;", "cashboxItem", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "isSelected", "", "isLocked", "description", "", "(Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;ZZLjava/lang/String;)V", "getCashboxItem", "()Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "getDescription", "()Ljava/lang/String;", "id", "id$annotations", "()V", "getId", "()Z", "setSelected", "(Z)V", "viewType", "", "getViewType", "()I", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "deposit_release"})
/* compiled from: MethodAdapterItem.kt */
public final class b implements a {
    public static final Creator CREATOR = new a();
    private final boolean cGi;
    private final com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a cxs;
    private final String description;
    private final String id = this.cxs.ZK();
    private boolean isSelected;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) parcel.readParcelable(b.class.getClassLoader());
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new b(aVar, z2, z, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public int asd() {
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.y(this.cxs, bVar.cxs)) {
                    if ((this.isSelected == bVar.isSelected ? 1 : null) != null) {
                        if ((this.cGi == bVar.cGi ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.description, bVar.description)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar = this.cxs;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        int i2 = this.isSelected;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.cGi;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        String str = this.description;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MethodAdapterItem(cashboxItem=");
        stringBuilder.append(this.cxs);
        stringBuilder.append(", isSelected=");
        stringBuilder.append(this.isSelected);
        stringBuilder.append(", isLocked=");
        stringBuilder.append(this.cGi);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeParcelable(this.cxs, i);
        parcel.writeInt(this.isSelected);
        parcel.writeInt(this.cGi);
        parcel.writeString(this.description);
    }

    public b(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar, boolean z, boolean z2, String str) {
        kotlin.jvm.internal.i.f(aVar, "cashboxItem");
        this.cxs = aVar;
        this.isSelected = z;
        this.cGi = z2;
        this.description = str;
    }

    public final com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aoU() {
        return this.cxs;
    }

    public final boolean isLocked() {
        return this.cGi;
    }

    public final String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }
}
