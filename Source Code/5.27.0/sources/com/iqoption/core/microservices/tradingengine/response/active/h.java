package com.iqoption.core.microservices.tradingengine.response.active;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.data.model.InstrumentType;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0001H\u0016J\u0019\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000fHÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u0004XD¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007¨\u0006+"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/EmptyActive;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "()V", "currencyLeft", "", "currencyLeft$annotations", "getCurrencyLeft", "()Ljava/lang/String;", "currencyRight", "currencyRight$annotations", "getCurrencyRight", "image", "image$annotations", "getImage", "describeContents", "", "getActiveId", "getActiveName", "getCommission", "getGroupId", "()Ljava/lang/Integer;", "getNextSchedule", "", "timeSync", "getPrecision", "getSchedule", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Schedule;", "getStartTime", "getTicker", "isBuybackEnabled", "", "isEnabled", "isExpired", "isSuspended", "isTopTradersEnabled", "update", "", "value", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: EmptyActive.kt */
public final class h extends a {
    public static final Creator CREATOR = new a();
    private final String bzX;
    private final String bzY;
    private final String image = "";

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return parcel.readInt() != 0 ? new h() : null;
        }

        public final Object[] newArray(int i) {
            return new h[i];
        }
    }

    public boolean aX(long j) {
        return false;
    }

    public long aY(long j) {
        return 0;
    }

    public String adZ() {
        return null;
    }

    public String ahP() {
        return "";
    }

    public boolean ahQ() {
        return false;
    }

    public int ahR() {
        return 0;
    }

    public Integer ahS() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public int getActiveId() {
        return -1;
    }

    public int getPrecision() {
        return 0;
    }

    public long getStartTime() {
        return 0;
    }

    public boolean isExpired() {
        return false;
    }

    public boolean isSuspended() {
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeInt(1);
    }

    public void y(a aVar) {
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.VALUE);
    }

    public h() {
        M(InstrumentType.UNKNOWN);
    }

    public String getImage() {
        return this.image;
    }

    public String ahN() {
        return this.bzX;
    }

    public String ahO() {
        return this.bzY;
    }

    public List<m> ahT() {
        return m.emptyList();
    }
}
