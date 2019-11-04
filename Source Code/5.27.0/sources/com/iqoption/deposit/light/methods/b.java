package com.iqoption.deposit.light.methods;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.iqoption.core.d;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.CashboxItemType;
import com.iqoption.deposit.o.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\n0\nH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0016R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/deposit/light/methods/ExpandCryptoDepositsItem;", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "category", "Lcom/iqoption/core/microservices/billing/response/deposit/MethodCategory;", "describeContents", "", "getImageUrl", "", "getName", "kotlin.jvm.PlatformType", "getType", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItemType;", "getUniqueId", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "deposit_release"})
/* compiled from: ExpandCryptoDepositsItem.kt */
public final class b implements com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a {
    public static final Creator<b> CREATOR = new a();
    public static final b cFk = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, bng = {"com/iqoption/deposit/light/methods/ExpandCryptoDepositsItem$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/iqoption/deposit/light/methods/ExpandCryptoDepositsItem;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/iqoption/deposit/light/methods/ExpandCryptoDepositsItem;", "deposit_release"})
    /* compiled from: ExpandCryptoDepositsItem.kt */
    public static final class a implements Creator<b> {
        a() {
        }

        /* renamed from: ac */
        public b createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "source");
            return b.cFk;
        }

        /* renamed from: fx */
        public b[] newArray(int i) {
            b[] bVarArr = new b[i];
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bVarArr[i2] = b.cFk;
            }
            return bVarArr;
        }
    }

    public String ZK() {
        return "expand-crypto-deposits";
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    private b() {
    }

    public boolean ZY() {
        return com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a.a.g(this);
    }

    public String ZZ() {
        return com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a.a.h(this);
    }

    public String getName() {
        return d.Uo().getString(g.see_more_payments);
    }

    public CashboxItemType ZL() {
        return CashboxItemType.EXPAND_CRYPTO_DEPOSIT;
    }
}
