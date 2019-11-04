package com.iqoption.welcome;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.iqoption.core.manager.aa;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, bng = {"Lcom/iqoption/welcome/RegistrationSocialScreen;", "Lcom/iqoption/welcome/WelcomeScreen;", "authInfo", "Lcom/iqoption/core/manager/SocialAuthInfo;", "(Lcom/iqoption/core/manager/SocialAuthInfo;)V", "getAuthInfo", "()Lcom/iqoption/core/manager/SocialAuthInfo;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "welcome_release"})
/* compiled from: WelcomeScreen.kt */
public final class i extends n {
    public static final Creator CREATOR = new a();
    private final aa eki;

    @kotlin.i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new i((aa) parcel.readParcelable(i.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new i[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeParcelable(this.eki, i);
    }

    public i(aa aaVar) {
        kotlin.jvm.internal.i.f(aaVar, "authInfo");
        super();
        this.eki = aaVar;
    }

    public final aa aZt() {
        return this.eki;
    }
}
