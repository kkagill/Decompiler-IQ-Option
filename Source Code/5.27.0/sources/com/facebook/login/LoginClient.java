package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.common.a.d;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.aa;
import com.facebook.internal.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class LoginClient implements Parcelable {
    public static final Creator<LoginClient> CREATOR = new Creator<LoginClient>() {
        /* renamed from: z */
        public LoginClient createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }

        /* renamed from: ah */
        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    };
    boolean BC;
    c BK;
    Map<String, String> BP;
    Map<String, String> BU;
    private i BX;
    k[] Bw;
    int Bx = -1;
    b By;
    a Bz;
    Fragment fragment;

    public static class Result implements Parcelable {
        public static final Creator<Result> CREATOR = new Creator<Result>() {
            /* renamed from: B */
            public Result createFromParcel(Parcel parcel) {
                return new Result(parcel, null);
            }

            /* renamed from: aj */
            public Result[] newArray(int i) {
                return new Result[i];
            }
        };
        public Map<String, String> BP;
        public Map<String, String> BU;
        final Code Ch;
        final com.facebook.a Ci;
        final String Cj;
        final c Ck;
        final String errorMessage;

        enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            
            private final String loggingValue;

            private Code(String str) {
                this.loggingValue = str;
            }

            /* Access modifiers changed, original: 0000 */
            public String getLoggingValue() {
                return this.loggingValue;
            }
        }

        public int describeContents() {
            return 0;
        }

        /* synthetic */ Result(Parcel parcel, AnonymousClass1 anonymousClass1) {
            this(parcel);
        }

        Result(c cVar, Code code, com.facebook.a aVar, String str, String str2) {
            aa.b((Object) code, "code");
            this.Ck = cVar;
            this.Ci = aVar;
            this.errorMessage = str;
            this.Ch = code;
            this.Cj = str2;
        }

        static Result a(c cVar, com.facebook.a aVar) {
            return new Result(cVar, Code.SUCCESS, aVar, null, null);
        }

        static Result a(c cVar, String str) {
            return new Result(cVar, Code.CANCEL, null, str, null);
        }

        static Result a(c cVar, String str, String str2) {
            return a(cVar, str, str2, null);
        }

        static Result a(c cVar, String str, String str2, String str3) {
            Object[] objArr = new String[]{str, str2};
            return new Result(cVar, Code.ERROR, null, TextUtils.join(": ", z.c(objArr)), str3);
        }

        private Result(Parcel parcel) {
            this.Ch = Code.valueOf(parcel.readString());
            this.Ci = (com.facebook.a) parcel.readParcelable(com.facebook.a.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.Cj = parcel.readString();
            this.Ck = (c) parcel.readParcelable(c.class.getClassLoader());
            this.BP = z.s(parcel);
            this.BU = z.s(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.Ch.name());
            parcel.writeParcelable(this.Ci, i);
            parcel.writeString(this.errorMessage);
            parcel.writeString(this.Cj);
            parcel.writeParcelable(this.Ck, i);
            z.a(parcel, this.BP);
            z.a(parcel, this.BU);
        }
    }

    interface a {
        void lK();

        void lL();
    }

    public interface b {
        void e(Result result);
    }

    public static class c implements Parcelable {
        public static final Creator<c> CREATOR = new Creator<c>() {
            /* renamed from: A */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            /* renamed from: ai */
            public c[] newArray(int i) {
                return new c[i];
            }
        };
        private final LoginBehavior Ca;
        private final DefaultAudience Cb;
        private final String Cc;
        private boolean Cd;
        private String Ce;
        private String Cf;
        private String Cg;
        private final String applicationId;
        private Set<String> st;

        public int describeContents() {
            return 0;
        }

        /* synthetic */ c(Parcel parcel, AnonymousClass1 anonymousClass1) {
            this(parcel);
        }

        c(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3) {
            Set set2;
            this.Cd = false;
            this.Ca = loginBehavior;
            if (set2 == null) {
                set2 = new HashSet();
            }
            this.st = set2;
            this.Cb = defaultAudience;
            this.Cf = str;
            this.applicationId = str2;
            this.Cc = str3;
        }

        /* Access modifiers changed, original: 0000 */
        public Set<String> gj() {
            return this.st;
        }

        /* Access modifiers changed, original: 0000 */
        public void setPermissions(Set<String> set) {
            aa.b((Object) set, "permissions");
            this.st = set;
        }

        /* Access modifiers changed, original: 0000 */
        public LoginBehavior lM() {
            return this.Ca;
        }

        /* Access modifiers changed, original: 0000 */
        public DefaultAudience lN() {
            return this.Cb;
        }

        /* Access modifiers changed, original: 0000 */
        public String go() {
            return this.applicationId;
        }

        /* Access modifiers changed, original: 0000 */
        public String lO() {
            return this.Cc;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean lP() {
            return this.Cd;
        }

        /* Access modifiers changed, original: 0000 */
        public void K(boolean z) {
            this.Cd = z;
        }

        /* Access modifiers changed, original: 0000 */
        public String lQ() {
            return this.Ce;
        }

        /* Access modifiers changed, original: 0000 */
        public String lR() {
            return this.Cg;
        }

        /* Access modifiers changed, original: 0000 */
        public String lS() {
            return this.Cf;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean lT() {
            for (String by : this.st) {
                if (j.by(by)) {
                    return true;
                }
            }
            return false;
        }

        private c(Parcel parcel) {
            boolean z = false;
            this.Cd = false;
            String readString = parcel.readString();
            DefaultAudience defaultAudience = null;
            this.Ca = readString != null ? LoginBehavior.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.st = new HashSet(arrayList);
            readString = parcel.readString();
            if (readString != null) {
                defaultAudience = DefaultAudience.valueOf(readString);
            }
            this.Cb = defaultAudience;
            this.applicationId = parcel.readString();
            this.Cc = parcel.readString();
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.Cd = z;
            this.Ce = parcel.readString();
            this.Cf = parcel.readString();
            this.Cg = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            LoginBehavior loginBehavior = this.Ca;
            String str = null;
            parcel.writeString(loginBehavior != null ? loginBehavior.name() : null);
            parcel.writeStringList(new ArrayList(this.st));
            DefaultAudience defaultAudience = this.Cb;
            if (defaultAudience != null) {
                str = defaultAudience.name();
            }
            parcel.writeString(str);
            parcel.writeString(this.applicationId);
            parcel.writeString(this.Cc);
            parcel.writeByte((byte) this.Cd);
            parcel.writeString(this.Ce);
            parcel.writeString(this.Cf);
            parcel.writeString(this.Cg);
        }
    }

    public int describeContents() {
        return 0;
    }

    public LoginClient(Fragment fragment) {
        this.fragment = fragment;
    }

    public Fragment gH() {
        return this.fragment;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(Fragment fragment) {
        if (this.fragment == null) {
            this.fragment = fragment;
            return;
        }
        throw new FacebookException("Can't set fragment once it is already set.");
    }

    /* Access modifiers changed, original: 0000 */
    public FragmentActivity getActivity() {
        return this.fragment.getActivity();
    }

    public c lx() {
        return this.BK;
    }

    public static int ly() {
        return RequestCodeOffset.Login.toRequestCode();
    }

    /* Access modifiers changed, original: 0000 */
    public void d(c cVar) {
        if (!lz()) {
            e(cVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void e(c cVar) {
        if (cVar != null) {
            if (this.BK != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            } else if (!com.facebook.a.gf() || lC()) {
                this.BK = cVar;
                this.Bw = f(cVar);
                lD();
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean lz() {
        return this.BK != null && this.Bx >= 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void lA() {
        if (this.Bx >= 0) {
            lB().cancel();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public k lB() {
        int i = this.Bx;
        return i >= 0 ? this.Bw[i] : null;
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        return this.BK != null ? lB().onActivityResult(i, i2, intent) : false;
    }

    /* Access modifiers changed, original: protected */
    public k[] f(c cVar) {
        ArrayList arrayList = new ArrayList();
        LoginBehavior lM = cVar.lM();
        if (lM.allowsGetTokenAuth()) {
            arrayList.add(new f(this));
        }
        if (lM.allowsKatanaAuth()) {
            arrayList.add(new g(this));
        }
        if (lM.allowsFacebookLiteAuth()) {
            arrayList.add(new d(this));
        }
        if (lM.allowsCustomTabAuth()) {
            arrayList.add(new a(this));
        }
        if (lM.allowsWebViewAuth()) {
            arrayList.add(new q(this));
        }
        if (lM.allowsDeviceAuth()) {
            arrayList.add(new c(this));
        }
        k[] kVarArr = new k[arrayList.size()];
        arrayList.toArray(kVarArr);
        return kVarArr;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean lC() {
        if (this.BC) {
            return true;
        }
        if (bw("android.permission.INTERNET") != 0) {
            FragmentActivity activity = getActivity();
            b(Result.a(this.BK, activity.getString(d.com_facebook_internet_permission_error_title), activity.getString(d.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.BC = true;
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void lD() {
        if (this.Bx >= 0) {
            a(lB().lg(), "skipped", null, null, lB().Cx);
        }
        do {
            k[] kVarArr = this.Bw;
            if (kVarArr != null) {
                int i = this.Bx;
                if (i < kVarArr.length - 1) {
                    this.Bx = i + 1;
                }
            }
            if (this.BK != null) {
                lE();
            }
            return;
        } while (!lF());
    }

    private void lE() {
        b(Result.a(this.BK, "Login attempt failed.", null));
    }

    private void b(String str, String str2, boolean z) {
        Object str22;
        if (this.BP == null) {
            this.BP = new HashMap();
        }
        if (this.BP.containsKey(str) && z) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String) this.BP.get(str));
            stringBuilder.append(",");
            stringBuilder.append(str22);
            str22 = stringBuilder.toString();
        }
        this.BP.put(str, str22);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean lF() {
        k lB = lB();
        if (!lB.mb() || lC()) {
            boolean a = lB.a(this.BK);
            if (a) {
                lG().I(this.BK.lO(), lB.lg());
            } else {
                lG().J(this.BK.lO(), lB.lg());
                b("not_tried", lB.lg(), true);
            }
            return a;
        }
        b("no_internet_permission", "1", false);
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(Result result) {
        if (result.Ci == null || !com.facebook.a.gf()) {
            b(result);
        } else {
            c(result);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void b(Result result) {
        k lB = lB();
        if (lB != null) {
            a(lB.lg(), result, lB.Cx);
        }
        Map map = this.BP;
        if (map != null) {
            result.BP = map;
        }
        map = this.BU;
        if (map != null) {
            result.BU = map;
        }
        this.Bw = null;
        this.Bx = -1;
        this.BK = null;
        this.BP = null;
        d(result);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(b bVar) {
        this.By = bVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(a aVar) {
        this.Bz = aVar;
    }

    /* Access modifiers changed, original: 0000 */
    public int bw(String str) {
        return getActivity().checkCallingOrSelfPermission(str);
    }

    /* Access modifiers changed, original: 0000 */
    public void c(Result result) {
        if (result.Ci != null) {
            com.facebook.a ge = com.facebook.a.ge();
            com.facebook.a aVar = result.Ci;
            if (!(ge == null || aVar == null)) {
                try {
                    if (ge.gp().equals(aVar.gp())) {
                        result = Result.a(this.BK, result.Ci);
                        b(result);
                        return;
                    }
                } catch (Exception e) {
                    b(Result.a(this.BK, "Caught exception", e.getMessage()));
                    return;
                }
            }
            result = Result.a(this.BK, "User logged in as different Facebook user.", null);
            b(result);
            return;
        }
        throw new FacebookException("Can't validate without a token");
    }

    private i lG() {
        i iVar = this.BX;
        if (iVar == null || !iVar.go().equals(this.BK.go())) {
            this.BX = new i(getActivity(), this.BK.go());
        }
        return this.BX;
    }

    private void d(Result result) {
        b bVar = this.By;
        if (bVar != null) {
            bVar.e(result);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void lH() {
        a aVar = this.Bz;
        if (aVar != null) {
            aVar.lK();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void lI() {
        a aVar = this.Bz;
        if (aVar != null) {
            aVar.lL();
        }
    }

    private void a(String str, Result result, Map<String, String> map) {
        a(str, result.Ch.getLoggingValue(), result.errorMessage, result.Cj, map);
    }

    private void a(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.BK == null) {
            lG().d("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            lG().a(this.BK.lO(), str, str2, str3, str4, map);
        }
    }

    static String lJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(k.class.getClassLoader());
        this.Bw = new k[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            k[] kVarArr = this.Bw;
            kVarArr[i] = (k) readParcelableArray[i];
            kVarArr[i].a(this);
        }
        this.Bx = parcel.readInt();
        this.BK = (c) parcel.readParcelable(c.class.getClassLoader());
        this.BP = z.s(parcel);
        this.BU = z.s(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.Bw, i);
        parcel.writeInt(this.Bx);
        parcel.writeParcelable(this.BK, i);
        z.a(parcel, this.BP);
        z.a(parcel, this.BU);
    }
}
