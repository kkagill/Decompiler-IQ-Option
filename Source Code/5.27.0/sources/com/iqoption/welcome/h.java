package com.iqoption.welcome;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\r"}, bng = {"Lcom/iqoption/welcome/RegistrationScreen;", "Lcom/iqoption/welcome/WelcomeScreen;", "isTrialUser", "", "(Z)V", "()Z", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "welcome_release"})
/* compiled from: WelcomeScreen.kt */
public final class h extends n {
    public static final Creator CREATOR = new a();
    private final boolean ekh;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new h(parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new h[i];
        }
    }

    public h() {
        this(false, 1, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeInt(this.ekh);
    }

    public h(boolean z) {
        super();
        this.ekh = z;
    }

    public /* synthetic */ h(boolean z, int i, f fVar) {
        if ((i & 1) != 0) {
            z = false;
        }
        this(z);
    }

    public final boolean aZs() {
        return this.ekh;
    }
}
