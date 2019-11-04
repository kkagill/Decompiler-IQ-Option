package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.u;
import com.facebook.login.LoginClient.c;

/* compiled from: FacebookLiteLoginMethodHandler */
class d extends m {
    public static final Creator<d> CREATOR = new Creator<d>() {
        /* renamed from: w */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        /* renamed from: ae */
        public d[] newArray(int i) {
            return new d[i];
        }
    };

    public int describeContents() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public String lg() {
        return "fb_lite_login";
    }

    d(LoginClient loginClient) {
        super(loginClient);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(c cVar) {
        String lJ = LoginClient.lJ();
        Intent a = u.a(this.Cm.getActivity(), cVar.go(), cVar.gj(), lJ, cVar.lP(), cVar.lT(), cVar.lN(), bz(cVar.lO()), cVar.lS());
        b("e2e", lJ);
        return a(a, LoginClient.ly());
    }

    d(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
