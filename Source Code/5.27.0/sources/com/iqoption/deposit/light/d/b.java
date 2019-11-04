package com.iqoption.deposit.light.d;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.iqoption.core.ext.c;
import com.iqoption.core.microservices.billing.response.deposit.e;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, bng = {"Lcom/iqoption/deposit/light/presets/PresetItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "Landroid/os/Parcelable;", "deposit", "Lcom/iqoption/core/microservices/billing/response/deposit/Deposit;", "currency", "Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "selected", "", "(Lcom/iqoption/core/microservices/billing/response/deposit/Deposit;Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;Z)V", "getCurrency", "()Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "getDeposit", "()Lcom/iqoption/core/microservices/billing/response/deposit/Deposit;", "id", "getId", "()Ljava/lang/String;", "getSelected", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "deposit_release"})
/* compiled from: PresetItem.kt */
public final class b implements Parcelable, d<String> {
    public static final Creator CREATOR = new a();
    private final e cFV;
    private final boolean cFW;
    private final com.iqoption.core.microservices.billing.response.deposit.d cwM;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new b((e) parcel.readParcelable(b.class.getClassLoader()), (com.iqoption.core.microservices.billing.response.deposit.d) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public static /* synthetic */ b a(b bVar, e eVar, com.iqoption.core.microservices.billing.response.deposit.d dVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = bVar.cFV;
        }
        if ((i & 2) != 0) {
            dVar = bVar.cwM;
        }
        if ((i & 4) != 0) {
            z = bVar.cFW;
        }
        return bVar.a(eVar, dVar, z);
    }

    public final b a(e eVar, com.iqoption.core.microservices.billing.response.deposit.d dVar, boolean z) {
        kotlin.jvm.internal.i.f(eVar, "deposit");
        kotlin.jvm.internal.i.f(dVar, "currency");
        return new b(eVar, dVar, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.y(this.cFV, bVar.cFV) && kotlin.jvm.internal.i.y(this.cwM, bVar.cwM)) {
                    if ((this.cFW == bVar.cFW ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        e eVar = this.cFV;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        com.iqoption.core.microservices.billing.response.deposit.d dVar = this.cwM;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.cFW;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PresetItem(deposit=");
        stringBuilder.append(this.cFV);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.cwM);
        stringBuilder.append(", selected=");
        stringBuilder.append(this.cFW);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeParcelable(this.cFV, i);
        parcel.writeParcelable(this.cwM, i);
        parcel.writeInt(this.cFW);
    }

    public b(e eVar, com.iqoption.core.microservices.billing.response.deposit.d dVar, boolean z) {
        kotlin.jvm.internal.i.f(eVar, "deposit");
        kotlin.jvm.internal.i.f(dVar, "currency");
        this.cFV = eVar;
        this.cwM = dVar;
        this.cFW = z;
    }

    public final e asL() {
        return this.cFV;
    }

    public final com.iqoption.core.microservices.billing.response.deposit.d aoo() {
        return this.cwM;
    }

    public final boolean asM() {
        return this.cFW;
    }

    public String getId() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.cwM.getId());
        stringBuilder.append(' ');
        stringBuilder.append(c.d(this.cFV.ZC(), 2));
        return stringBuilder.toString();
    }
}
