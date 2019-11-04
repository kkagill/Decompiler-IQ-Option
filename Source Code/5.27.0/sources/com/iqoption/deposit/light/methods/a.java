package com.iqoption.deposit.light.methods;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000eHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, bng = {"Lcom/iqoption/deposit/light/methods/ExpandCryptoDepositsAdapterItem;", "Lcom/iqoption/deposit/menu/method/BaseMethodAdapterItem;", "item", "Lcom/iqoption/deposit/light/methods/ExpandCryptoDepositsItem;", "(Lcom/iqoption/deposit/light/methods/ExpandCryptoDepositsItem;)V", "id", "", "id$annotations", "()V", "getId", "()Ljava/lang/String;", "getItem", "()Lcom/iqoption/deposit/light/methods/ExpandCryptoDepositsItem;", "viewType", "", "getViewType", "()I", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "deposit_release"})
/* compiled from: ExpandCryptoDepositsAdapterItem.kt */
public final class a implements com.iqoption.deposit.c.b.a {
    public static final Creator CREATOR = new a();
    private final b cFj;
    private final String id = this.cFj.ZK();

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new a(parcel.readInt() != 0 ? b.cFk : null);
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public int asd() {
        return 2;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.cFj, ((com.iqoption.deposit.light.methods.a) r2).cFj) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.deposit.light.methods.a;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.deposit.light.methods.a) r2;
        r0 = r1.cFj;
        r2 = r2.cFj;
        r2 = kotlin.jvm.internal.i.y(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.light.methods.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        b bVar = this.cFj;
        return bVar != null ? bVar.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExpandCryptoDepositsAdapterItem(item=");
        stringBuilder.append(this.cFj);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeInt(this.cFj != null ? 1 : 0);
    }

    public a(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "item");
        this.cFj = bVar;
    }

    public String getId() {
        return this.id;
    }
}
