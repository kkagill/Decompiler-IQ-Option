package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.v.a;
import com.facebook.internal.z;
import com.facebook.login.LoginClient.Result;
import com.facebook.login.LoginClient.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GetTokenLoginMethodHandler */
class f extends k {
    public static final Creator<f> CREATOR = new Creator() {
        /* renamed from: x */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* renamed from: af */
        public f[] newArray(int i) {
            return new f[i];
        }
    };
    private e Bs;

    public int describeContents() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public String lg() {
        return "get_token";
    }

    f(LoginClient loginClient) {
        super(loginClient);
    }

    /* Access modifiers changed, original: 0000 */
    public void cancel() {
        e eVar = this.Bs;
        if (eVar != null) {
            eVar.cancel();
            this.Bs.a(null);
            this.Bs = null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(final c cVar) {
        this.Bs = new e(this.Cm.getActivity(), cVar.go());
        if (!this.Bs.start()) {
            return false;
        }
        this.Cm.lH();
        this.Bs.a(new a() {
            public void o(Bundle bundle) {
                f.this.a(cVar, bundle);
            }
        });
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(c cVar, Bundle bundle) {
        e eVar = this.Bs;
        if (eVar != null) {
            eVar.a(null);
        }
        this.Bs = null;
        this.Cm.lI();
        if (bundle != null) {
            ArrayList stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> gj = cVar.gj();
            if (stringArrayList == null || !(gj == null || stringArrayList.containsAll(gj))) {
                HashSet hashSet = new HashSet();
                for (String str : gj) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    b("new_permissions", TextUtils.join(",", hashSet));
                }
                cVar.setPermissions(hashSet);
            } else {
                c(cVar, bundle);
                return;
            }
        }
        this.Cm.lD();
    }

    /* Access modifiers changed, original: 0000 */
    public void b(c cVar, Bundle bundle) {
        this.Cm.a(Result.a(this.Cm.lx(), k.a(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, cVar.go())));
    }

    /* Access modifiers changed, original: 0000 */
    public void c(final c cVar, final Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.isEmpty()) {
            this.Cm.lH();
            z.a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new z.a() {
                public void e(JSONObject jSONObject) {
                    try {
                        bundle.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                        f.this.b(cVar, bundle);
                    } catch (JSONException e) {
                        f.this.Cm.b(Result.a(f.this.Cm.lx(), "Caught exception", e.getMessage()));
                    }
                }

                public void c(FacebookException facebookException) {
                    f.this.Cm.b(Result.a(f.this.Cm.lx(), "Caught exception", facebookException.getMessage()));
                }
            });
            return;
        }
        b(cVar, bundle);
    }

    f(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
