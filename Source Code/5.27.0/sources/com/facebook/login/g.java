package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.u;
import com.facebook.login.LoginClient.c;

/* compiled from: KatanaProxyLoginMethodHandler */
class g extends m {
    public static final Creator<g> CREATOR = new Creator<g>() {
        /* renamed from: y */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        /* renamed from: ag */
        public g[] newArray(int i) {
            return new g[i];
        }
    };

    public int describeContents() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public String lg() {
        return "katana_proxy_auth";
    }

    g(LoginClient loginClient) {
        super(loginClient);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(c cVar) {
        String lJ = LoginClient.lJ();
        Intent b = u.b(this.Cm.getActivity(), cVar.go(), cVar.gj(), lJ, cVar.lP(), cVar.lT(), cVar.lN(), bz(cVar.lO()), cVar.lS());
        b("e2e", lJ);
        return a(b, LoginClient.ly());
    }

    g(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
