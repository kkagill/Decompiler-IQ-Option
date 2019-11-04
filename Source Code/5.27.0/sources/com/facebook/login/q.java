package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.ab;
import com.facebook.internal.e;
import com.facebook.internal.z;
import com.facebook.login.LoginClient.c;

/* compiled from: WebViewLoginMethodHandler */
class q extends p {
    public static final Creator<q> CREATOR = new Creator<q>() {
        /* renamed from: C */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        /* renamed from: ak */
        public q[] newArray(int i) {
            return new q[i];
        }
    };
    private String CJ;
    private ab CP;

    /* compiled from: WebViewLoginMethodHandler */
    static class a extends com.facebook.internal.ab.a {
        private String CJ;
        private String CS = "fbconnect://success";
        private String Cf;

        public a(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        public a bD(String str) {
            this.CJ = str;
            return this;
        }

        public a M(boolean z) {
            this.CS = z ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public a bE(String str) {
            this.Cf = str;
            return this;
        }

        public ab ld() {
            Bundle parameters = getParameters();
            parameters.putString("redirect_uri", this.CS);
            parameters.putString("client_id", go());
            parameters.putString("e2e", this.CJ);
            parameters.putString("response_type", "token,signed_request");
            parameters.putString("return_scopes", "true");
            parameters.putString("auth_type", this.Cf);
            return ab.a(getContext(), "oauth", parameters, getTheme(), le());
        }
    }

    public int describeContents() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public String lg() {
        return "web_view";
    }

    /* Access modifiers changed, original: 0000 */
    public boolean mb() {
        return true;
    }

    q(LoginClient loginClient) {
        super(loginClient);
    }

    /* Access modifiers changed, original: 0000 */
    public AccessTokenSource lh() {
        return AccessTokenSource.WEB_VIEW;
    }

    /* Access modifiers changed, original: 0000 */
    public void cancel() {
        ab abVar = this.CP;
        if (abVar != null) {
            abVar.cancel();
            this.CP = null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(final c cVar) {
        Bundle i = i(cVar);
        AnonymousClass1 anonymousClass1 = new ab.c() {
            public void b(Bundle bundle, FacebookException facebookException) {
                q.this.b(cVar, bundle, facebookException);
            }
        };
        this.CJ = LoginClient.lJ();
        b("e2e", this.CJ);
        FragmentActivity activity = this.Cm.getActivity();
        this.CP = new a(activity, cVar.go(), i).bD(this.CJ).M(z.ag(activity)).bE(cVar.lS()).b(anonymousClass1).ld();
        e eVar = new e();
        eVar.setRetainInstance(true);
        eVar.a(this.CP);
        eVar.show(activity.getSupportFragmentManager(), "FacebookDialogFragment");
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void b(c cVar, Bundle bundle, FacebookException facebookException) {
        super.a(cVar, bundle, facebookException);
    }

    q(Parcel parcel) {
        super(parcel);
        this.CJ = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.CJ);
    }
}
