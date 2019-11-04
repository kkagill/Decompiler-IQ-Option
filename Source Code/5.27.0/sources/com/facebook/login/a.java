package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.browser.customtabs.CustomTabsService;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.f;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.aa;
import com.facebook.internal.j;
import com.facebook.internal.z;
import com.facebook.login.LoginClient.c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CustomTabLoginMethodHandler */
public class a extends p {
    private static final String[] AC = new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    public static final Creator<a> CREATOR = new Creator() {
        /* renamed from: t */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: ab */
        public a[] newArray(int i) {
            return new a[i];
        }
    };
    private String AJ;
    private String AK;

    public int describeContents() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public String lg() {
        return "custom_tab";
    }

    /* Access modifiers changed, original: protected */
    public String li() {
        return "chrome_custom_tab";
    }

    a(LoginClient loginClient) {
        super(loginClient);
        this.AK = z.Y(20);
    }

    /* Access modifiers changed, original: 0000 */
    public AccessTokenSource lh() {
        return AccessTokenSource.CHROME_CUSTOM_TAB;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(c cVar) {
        if (!lj()) {
            return false;
        }
        Bundle a = a(i(cVar), cVar);
        Intent intent = new Intent(this.Cm.getActivity(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.sY, a);
        intent.putExtra(CustomTabMainActivity.sZ, ll());
        this.Cm.gH().startActivityForResult(intent, 1);
        return true;
    }

    private boolean lj() {
        return lk() && ll() != null && lm() && aa.ah(f.getApplicationContext());
    }

    private boolean lk() {
        j bg = FetchedAppSettingsManager.bg(z.Z(this.Cm.getActivity()));
        return bg != null && bg.jN();
    }

    private String ll() {
        String str = this.AJ;
        if (str != null) {
            return str;
        }
        FragmentActivity activity = this.Cm.getActivity();
        List<ResolveInfo> queryIntentServices = activity.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
        if (queryIntentServices != null) {
            HashSet hashSet = new HashSet(Arrays.asList(AC));
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    this.AJ = serviceInfo.packageName;
                    return this.AJ;
                }
            }
        }
        return null;
    }

    private boolean lm() {
        return !z.af(this.Cm.getActivity());
    }

    /* Access modifiers changed, original: 0000 */
    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            return super.onActivityResult(i, i2, intent);
        }
        c lx = this.Cm.lx();
        if (i2 == -1) {
            a(intent.getStringExtra(CustomTabMainActivity.ta), lx);
            return true;
        }
        super.a(lx, null, new FacebookOperationCanceledException());
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    private void a(java.lang.String r7, com.facebook.login.LoginClient.c r8) {
        /*
        r6 = this;
        if (r7 == 0) goto L_0x00b3;
    L_0x0002:
        r0 = com.facebook.CustomTabMainActivity.gG();
        r0 = r7.startsWith(r0);
        if (r0 == 0) goto L_0x00b3;
    L_0x000c:
        r7 = android.net.Uri.parse(r7);
        r0 = r7.getQuery();
        r0 = com.facebook.internal.z.bq(r0);
        r7 = r7.getFragment();
        r7 = com.facebook.internal.z.bq(r7);
        r0.putAll(r7);
        r7 = r6.q(r0);
        r1 = 0;
        if (r7 != 0) goto L_0x0035;
    L_0x002a:
        r7 = new com.facebook.FacebookException;
        r0 = "Invalid state parameter";
        r7.<init>(r0);
        super.a(r8, r1, r7);
        return;
    L_0x0035:
        r7 = "error";
        r7 = r0.getString(r7);
        if (r7 != 0) goto L_0x0043;
    L_0x003d:
        r7 = "error_type";
        r7 = r0.getString(r7);
    L_0x0043:
        r2 = "error_msg";
        r2 = r0.getString(r2);
        if (r2 != 0) goto L_0x0051;
    L_0x004b:
        r2 = "error_message";
        r2 = r0.getString(r2);
    L_0x0051:
        if (r2 != 0) goto L_0x0059;
    L_0x0053:
        r2 = "error_description";
        r2 = r0.getString(r2);
    L_0x0059:
        r3 = "error_code";
        r3 = r0.getString(r3);
        r4 = com.facebook.internal.z.aB(r3);
        r5 = -1;
        if (r4 != 0) goto L_0x006b;
    L_0x0066:
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x006b }
        goto L_0x006c;
    L_0x006b:
        r3 = -1;
    L_0x006c:
        r4 = com.facebook.internal.z.aB(r7);
        if (r4 == 0) goto L_0x007e;
    L_0x0072:
        r4 = com.facebook.internal.z.aB(r2);
        if (r4 == 0) goto L_0x007e;
    L_0x0078:
        if (r3 != r5) goto L_0x007e;
    L_0x007a:
        super.a(r8, r0, r1);
        goto L_0x00b3;
    L_0x007e:
        if (r7 == 0) goto L_0x0099;
    L_0x0080:
        r0 = "access_denied";
        r0 = r7.equals(r0);
        if (r0 != 0) goto L_0x0090;
    L_0x0088:
        r0 = "OAuthAccessDeniedException";
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0099;
    L_0x0090:
        r7 = new com.facebook.FacebookOperationCanceledException;
        r7.<init>();
        super.a(r8, r1, r7);
        goto L_0x00b3;
    L_0x0099:
        r0 = 4201; // 0x1069 float:5.887E-42 double:2.0756E-320;
        if (r3 != r0) goto L_0x00a6;
    L_0x009d:
        r7 = new com.facebook.FacebookOperationCanceledException;
        r7.<init>();
        super.a(r8, r1, r7);
        goto L_0x00b3;
    L_0x00a6:
        r0 = new com.facebook.FacebookRequestError;
        r0.<init>(r3, r7, r2);
        r7 = new com.facebook.FacebookServiceException;
        r7.<init>(r0, r2);
        super.a(r8, r1, r7);
    L_0x00b3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.a.a(java.lang.String, com.facebook.login.LoginClient$c):void");
    }

    /* Access modifiers changed, original: protected */
    public void l(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.AK);
    }

    private boolean q(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.AK);
        } catch (JSONException unused) {
            return false;
        }
    }

    a(Parcel parcel) {
        super(parcel);
        this.AK = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.AK);
    }
}
