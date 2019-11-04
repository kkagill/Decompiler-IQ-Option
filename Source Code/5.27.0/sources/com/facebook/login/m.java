package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.x;
import com.facebook.internal.z;
import com.facebook.login.LoginClient.Result;
import com.facebook.login.LoginClient.c;

/* compiled from: NativeAppLoginMethodHandler */
abstract class m extends k {
    public abstract boolean a(c cVar);

    m(LoginClient loginClient) {
        super(loginClient);
    }

    m(Parcel parcel) {
        super(parcel);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean onActivityResult(int i, int i2, Intent intent) {
        Result a;
        c lx = this.Cm.lx();
        if (intent == null) {
            a = Result.a(lx, "Operation canceled");
        } else if (i2 == 0) {
            a = b(lx, intent);
        } else if (i2 != -1) {
            a = Result.a(lx, "Unexpected resultCode from authorization.", null);
        } else {
            a = a(lx, intent);
        }
        if (a != null) {
            this.Cm.a(a);
        } else {
            this.Cm.lD();
        }
        return true;
    }

    private Result a(c cVar, Intent intent) {
        Bundle extras = intent.getExtras();
        String r = r(extras);
        String str = "error_code";
        str = extras.get(str) != null ? extras.get(str).toString() : null;
        String s = s(extras);
        String string = extras.getString("e2e");
        if (!z.aB(string)) {
            bA(string);
        }
        if (r == null && str == null && s == null) {
            try {
                cVar = Result.a(cVar, k.a(cVar.gj(), extras, AccessTokenSource.FACEBOOK_APPLICATION_WEB, cVar.go()));
                return cVar;
            } catch (FacebookException e) {
                return Result.a(cVar, null, e.getMessage());
            }
        } else if (x.zH.contains(r)) {
            return null;
        } else {
            if (x.zI.contains(r)) {
                return Result.a(cVar, null);
            }
            return Result.a(cVar, r, s, str);
        }
    }

    private Result b(c cVar, Intent intent) {
        Bundle extras = intent.getExtras();
        String r = r(extras);
        String str = "error_code";
        Object obj = extras.get(str) != null ? extras.get(str).toString() : null;
        if ("CONNECTION_FAILURE".equals(obj)) {
            return Result.a(cVar, r, s(extras), obj);
        }
        return Result.a(cVar, r);
    }

    private String r(Bundle bundle) {
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    private String s(Bundle bundle) {
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString("error_description") : string;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.Cm.gH().startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
