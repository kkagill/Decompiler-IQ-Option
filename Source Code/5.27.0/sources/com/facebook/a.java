package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.internal.aa;
import com.facebook.internal.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AccessToken */
public final class a implements Parcelable {
    public static final Creator<a> CREATOR = new Creator() {
        /* renamed from: o */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: Q */
        public a[] newArray(int i) {
            return new a[i];
        }
    };
    private static final Date MAX_DATE = new Date(Long.MAX_VALUE);
    private static final Date sq = MAX_DATE;
    private static final Date sr = new Date();
    private static final AccessTokenSource ss = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    private final String applicationId;
    private final Date expires;
    private final Set<String> st;
    private final Set<String> su;
    private final Set<String> sv;
    private final String sw;
    private final AccessTokenSource sx;
    private final Date sy;
    private final Date sz;
    private final String userId;

    /* compiled from: AccessToken */
    public interface a {
        void a(FacebookException facebookException);

        void c(a aVar);
    }

    public int describeContents() {
        return 0;
    }

    public a(String str, String str2, String str3, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable AccessTokenSource accessTokenSource, @Nullable Date date, @Nullable Date date2, @Nullable Date date3) {
        aa.H(str, "accessToken");
        aa.H(str2, "applicationId");
        aa.H(str3, "userId");
        if (date == null) {
            date = sq;
        }
        this.expires = date;
        this.st = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        this.su = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        this.sv = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        this.sw = str;
        if (accessTokenSource == null) {
            accessTokenSource = ss;
        }
        this.sx = accessTokenSource;
        if (date2 == null) {
            date2 = sr;
        }
        this.sy = date2;
        this.applicationId = str2;
        this.userId = str3;
        if (date3 == null || date3.getTime() == 0) {
            date3 = sq;
        }
        this.sz = date3;
    }

    public static a ge() {
        return c.gz().ge();
    }

    public static boolean gf() {
        a ge = c.gz().ge();
        return (ge == null || ge.isExpired()) ? false : true;
    }

    static void gg() {
        a ge = c.gz().ge();
        if (ge != null) {
            a(b(ge));
        }
    }

    public static void a(a aVar) {
        c.gz().a(aVar);
    }

    public String getToken() {
        return this.sw;
    }

    public Date gh() {
        return this.expires;
    }

    public Date gi() {
        return this.sz;
    }

    public Set<String> gj() {
        return this.st;
    }

    public Set<String> gk() {
        return this.su;
    }

    public Set<String> gl() {
        return this.sv;
    }

    public AccessTokenSource gm() {
        return this.sx;
    }

    public Date gn() {
        return this.sy;
    }

    public String go() {
        return this.applicationId;
    }

    public String gp() {
        return this.userId;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{AccessToken");
        stringBuilder.append(" token:");
        stringBuilder.append(gr());
        i(stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: Missing block: B:29:0x0071, code skipped:
            if (r4.sz.equals(r5.sz) != false) goto L_0x0075;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.facebook.a;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r5 = (com.facebook.a) r5;
        r1 = r4.expires;
        r3 = r5.expires;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x0016:
        r1 = r4.st;
        r3 = r5.st;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x0020:
        r1 = r4.su;
        r3 = r5.su;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x002a:
        r1 = r4.sv;
        r3 = r5.sv;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x0034:
        r1 = r4.sw;
        r3 = r5.sw;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x003e:
        r1 = r4.sx;
        r3 = r5.sx;
        if (r1 != r3) goto L_0x0074;
    L_0x0044:
        r1 = r4.sy;
        r3 = r5.sy;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x004e:
        r1 = r4.applicationId;
        if (r1 != 0) goto L_0x0057;
    L_0x0052:
        r1 = r5.applicationId;
        if (r1 != 0) goto L_0x0074;
    L_0x0056:
        goto L_0x005f;
    L_0x0057:
        r3 = r5.applicationId;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x005f:
        r1 = r4.userId;
        r3 = r5.userId;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x0069:
        r1 = r4.sz;
        r5 = r5.sz;
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0074;
    L_0x0073:
        goto L_0x0075;
    L_0x0074:
        r0 = 0;
    L_0x0075:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.expires.hashCode()) * 31) + this.st.hashCode()) * 31) + this.su.hashCode()) * 31) + this.sv.hashCode()) * 31) + this.sw.hashCode()) * 31) + this.sx.hashCode()) * 31) + this.sy.hashCode()) * 31;
        String str = this.applicationId;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.userId.hashCode()) * 31) + this.sz.hashCode();
    }

    static a b(a aVar) {
        return new a(aVar.sw, aVar.applicationId, aVar.gp(), aVar.gj(), aVar.gk(), aVar.gl(), aVar.sx, new Date(), new Date(), aVar.sz);
    }

    static a f(Bundle bundle) {
        List a = a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List a2 = a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        List a3 = a(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
        String j = k.j(bundle);
        if (z.aB(j)) {
            j = f.go();
        }
        String str = j;
        String h = k.h(bundle);
        try {
            return new a(h, str, z.br(h).getString("id"), a, a2, a3, k.i(bundle), k.b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), k.b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), null);
        } catch (JSONException unused) {
            return null;
        }
    }

    static List<String> a(Bundle bundle, String str) {
        ArrayList stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    public boolean isExpired() {
        return new Date().after(this.expires);
    }

    /* Access modifiers changed, original: 0000 */
    public JSONObject gq() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.sw);
        jSONObject.put("expires_at", this.expires.getTime());
        jSONObject.put("permissions", new JSONArray(this.st));
        jSONObject.put("declined_permissions", new JSONArray(this.su));
        jSONObject.put("expired_permissions", new JSONArray(this.sv));
        jSONObject.put("last_refresh", this.sy.getTime());
        jSONObject.put("source", this.sx.name());
        jSONObject.put("application_id", this.applicationId);
        jSONObject.put("user_id", this.userId);
        jSONObject.put("data_access_expiration_time", this.sz.getTime());
        return jSONObject;
    }

    static a c(JSONObject jSONObject) {
        if (jSONObject.getInt("version") <= 1) {
            ArrayList arrayList;
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            AccessTokenSource valueOf = AccessTokenSource.valueOf(jSONObject.getString("source"));
            String string2 = jSONObject.getString("application_id");
            String string3 = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
            List f = z.f(jSONArray);
            List f2 = z.f(jSONArray2);
            if (optJSONArray == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = z.f(optJSONArray);
            }
            return new a(string, string2, string3, f, f2, arrayList, valueOf, date, date2, date3);
        }
        throw new FacebookException("Unknown AccessToken serialization format.");
    }

    private String gr() {
        if (this.sw == null) {
            return "null";
        }
        return f.a(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.sw : "ACCESS_TOKEN_REMOVED";
    }

    private void i(StringBuilder stringBuilder) {
        stringBuilder.append(" permissions:");
        if (this.st == null) {
            stringBuilder.append("null");
            return;
        }
        stringBuilder.append("[");
        stringBuilder.append(TextUtils.join(", ", this.st));
        stringBuilder.append("]");
    }

    a(Parcel parcel) {
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.st = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.su = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.sv = Collections.unmodifiableSet(new HashSet(arrayList));
        this.sw = parcel.readString();
        this.sx = AccessTokenSource.valueOf(parcel.readString());
        this.sy = new Date(parcel.readLong());
        this.applicationId = parcel.readString();
        this.userId = parcel.readString();
        this.sz = new Date(parcel.readLong());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.expires.getTime());
        parcel.writeStringList(new ArrayList(this.st));
        parcel.writeStringList(new ArrayList(this.su));
        parcel.writeStringList(new ArrayList(this.sv));
        parcel.writeString(this.sw);
        parcel.writeString(this.sx.name());
        parcel.writeLong(this.sy.getTime());
        parcel.writeString(this.applicationId);
        parcel.writeString(this.userId);
        parcel.writeLong(this.sz.getTime());
    }
}
