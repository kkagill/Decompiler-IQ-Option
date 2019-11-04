package com.iqoption.cardsverification.status;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.iqoption.core.microservices.billing.verification.response.VerifyInitResult;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, bng = {"Lcom/iqoption/cardsverification/status/VerifyState;", "Landroid/os/Parcelable;", "userId", "", "initResult", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyInitResult;", "countryNameIco", "", "completedSide", "Lcom/iqoption/cardsverification/status/CardSide;", "progressSide", "(JLcom/iqoption/core/microservices/billing/verification/response/VerifyInitResult;Ljava/lang/String;Lcom/iqoption/cardsverification/status/CardSide;Lcom/iqoption/cardsverification/status/CardSide;)V", "getCompletedSide", "()Lcom/iqoption/cardsverification/status/CardSide;", "setCompletedSide", "(Lcom/iqoption/cardsverification/status/CardSide;)V", "getCountryNameIco", "()Ljava/lang/String;", "getInitResult", "()Lcom/iqoption/core/microservices/billing/verification/response/VerifyInitResult;", "getProgressSide", "setProgressSide", "getUserId", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "cardsverification_release"})
/* compiled from: PerformVerifyFragment.kt */
public final class k implements Parcelable {
    public static final Creator CREATOR = new a();
    private final VerifyInitResult aCA;
    private final String aCB;
    private CardSide aCC;
    private CardSide aCD;
    private final long userId;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new k(parcel.readLong(), (VerifyInitResult) parcel.readParcelable(k.class.getClassLoader()), parcel.readString(), (CardSide) Enum.valueOf(CardSide.class, parcel.readString()), (CardSide) Enum.valueOf(CardSide.class, parcel.readString()));
        }

        public final Object[] newArray(int i) {
            return new k[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (!((this.userId == kVar.userId ? 1 : null) != null && kotlin.jvm.internal.i.y(this.aCA, kVar.aCA) && kotlin.jvm.internal.i.y(this.aCB, kVar.aCB) && kotlin.jvm.internal.i.y(this.aCC, kVar.aCC) && kotlin.jvm.internal.i.y(this.aCD, kVar.aCD))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.userId;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        VerifyInitResult verifyInitResult = this.aCA;
        int i2 = 0;
        i = (i + (verifyInitResult != null ? verifyInitResult.hashCode() : 0)) * 31;
        String str = this.aCB;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        CardSide cardSide = this.aCC;
        i = (i + (cardSide != null ? cardSide.hashCode() : 0)) * 31;
        cardSide = this.aCD;
        if (cardSide != null) {
            i2 = cardSide.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VerifyState(userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", initResult=");
        stringBuilder.append(this.aCA);
        stringBuilder.append(", countryNameIco=");
        stringBuilder.append(this.aCB);
        stringBuilder.append(", completedSide=");
        stringBuilder.append(this.aCC);
        stringBuilder.append(", progressSide=");
        stringBuilder.append(this.aCD);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.userId);
        parcel.writeParcelable(this.aCA, i);
        parcel.writeString(this.aCB);
        parcel.writeString(this.aCC.name());
        parcel.writeString(this.aCD.name());
    }

    public k(long j, VerifyInitResult verifyInitResult, String str, CardSide cardSide, CardSide cardSide2) {
        kotlin.jvm.internal.i.f(verifyInitResult, "initResult");
        kotlin.jvm.internal.i.f(str, "countryNameIco");
        kotlin.jvm.internal.i.f(cardSide, "completedSide");
        kotlin.jvm.internal.i.f(cardSide2, "progressSide");
        this.userId = j;
        this.aCA = verifyInitResult;
        this.aCB = str;
        this.aCC = cardSide;
        this.aCD = cardSide2;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final VerifyInitResult LO() {
        return this.aCA;
    }

    public final String LP() {
        return this.aCB;
    }

    public final CardSide LQ() {
        return this.aCC;
    }

    public final void c(CardSide cardSide) {
        kotlin.jvm.internal.i.f(cardSide, "<set-?>");
        this.aCC = cardSide;
    }

    public final CardSide LR() {
        return this.aCD;
    }

    public final void d(CardSide cardSide) {
        kotlin.jvm.internal.i.f(cardSide, "<set-?>");
        this.aCD = cardSide;
    }
}
