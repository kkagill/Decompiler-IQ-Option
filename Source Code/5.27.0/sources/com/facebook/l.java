package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.internal.aa;
import com.facebook.internal.z;
import com.facebook.internal.z.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Profile */
public final class l implements Parcelable {
    public static final Creator<l> CREATOR = new Creator<l>() {
        /* renamed from: r */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel, null);
        }

        /* renamed from: V */
        public l[] newArray(int i) {
            return new l[i];
        }
    };
    private static final String TAG = "l";
    @Nullable
    private final String firstName;
    @Nullable
    private final String id;
    @Nullable
    private final String lastName;
    @Nullable
    private final String middleName;
    @Nullable
    private final String name;
    @Nullable
    private final Uri uA;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ l(Parcel parcel, AnonymousClass1 anonymousClass1) {
        this(parcel);
    }

    public static l hJ() {
        return n.hN().hJ();
    }

    public static void a(@Nullable l lVar) {
        n.hN().a(lVar);
    }

    public static void hK() {
        a ge = a.ge();
        if (a.gf()) {
            z.a(ge.getToken(), new a() {
                public void e(JSONObject jSONObject) {
                    String optString = jSONObject.optString("id");
                    if (optString != null) {
                        String optString2 = jSONObject.optString("link");
                        l.a(new l(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString(ConditionalUserProperty.NAME), optString2 != null ? Uri.parse(optString2) : null));
                    }
                }

                public void c(FacebookException facebookException) {
                    String hL = l.TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Got unexpected exception: ");
                    stringBuilder.append(facebookException);
                    Log.e(hL, stringBuilder.toString());
                }
            });
        } else {
            a(null);
        }
    }

    public l(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Uri uri) {
        aa.H(str, "id");
        this.id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.name = str5;
        this.uA = uri;
    }

    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r5.firstName == null) goto L_0x0075;
     */
    /* JADX WARNING: Missing block: B:18:0x0031, code skipped:
            if (r5.middleName == null) goto L_0x0075;
     */
    /* JADX WARNING: Missing block: B:24:0x0044, code skipped:
            if (r5.lastName == null) goto L_0x0075;
     */
    /* JADX WARNING: Missing block: B:30:0x0057, code skipped:
            if (r5.name == null) goto L_0x0075;
     */
    /* JADX WARNING: Missing block: B:36:0x006a, code skipped:
            if (r5.uA == null) goto L_0x0075;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.facebook.l;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r5 = (com.facebook.l) r5;
        r1 = r4.id;
        r3 = r5.id;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0021;
    L_0x0016:
        r1 = r4.firstName;
        if (r1 != 0) goto L_0x0021;
    L_0x001a:
        r5 = r5.firstName;
        if (r5 != 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0075;
    L_0x001f:
        r0 = 0;
        goto L_0x0075;
    L_0x0021:
        r1 = r4.firstName;
        r3 = r5.firstName;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0034;
    L_0x002b:
        r1 = r4.middleName;
        if (r1 != 0) goto L_0x0034;
    L_0x002f:
        r5 = r5.middleName;
        if (r5 != 0) goto L_0x001f;
    L_0x0033:
        goto L_0x0075;
    L_0x0034:
        r1 = r4.middleName;
        r3 = r5.middleName;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0047;
    L_0x003e:
        r1 = r4.lastName;
        if (r1 != 0) goto L_0x0047;
    L_0x0042:
        r5 = r5.lastName;
        if (r5 != 0) goto L_0x001f;
    L_0x0046:
        goto L_0x0075;
    L_0x0047:
        r1 = r4.lastName;
        r3 = r5.lastName;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x005a;
    L_0x0051:
        r1 = r4.name;
        if (r1 != 0) goto L_0x005a;
    L_0x0055:
        r5 = r5.name;
        if (r5 != 0) goto L_0x001f;
    L_0x0059:
        goto L_0x0075;
    L_0x005a:
        r1 = r4.name;
        r3 = r5.name;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x006d;
    L_0x0064:
        r1 = r4.uA;
        if (r1 != 0) goto L_0x006d;
    L_0x0068:
        r5 = r5.uA;
        if (r5 != 0) goto L_0x001f;
    L_0x006c:
        goto L_0x0075;
    L_0x006d:
        r0 = r4.uA;
        r5 = r5.uA;
        r0 = r0.equals(r5);
    L_0x0075:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.l.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = 527 + this.id.hashCode();
        String str = this.firstName;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        str = this.middleName;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        str = this.lastName;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        str = this.name;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        Uri uri = this.uA;
        return uri != null ? (hashCode * 31) + uri.hashCode() : hashCode;
    }

    /* Access modifiers changed, original: 0000 */
    public JSONObject gq() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put("first_name", this.firstName);
            jSONObject.put("middle_name", this.middleName);
            jSONObject.put("last_name", this.lastName);
            jSONObject.put(ConditionalUserProperty.NAME, this.name);
            if (this.uA == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", this.uA.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    l(JSONObject jSONObject) {
        Uri uri = null;
        this.id = jSONObject.optString("id", null);
        this.firstName = jSONObject.optString("first_name", null);
        this.middleName = jSONObject.optString("middle_name", null);
        this.lastName = jSONObject.optString("last_name", null);
        this.name = jSONObject.optString(ConditionalUserProperty.NAME, null);
        String optString = jSONObject.optString("link_uri", null);
        if (optString != null) {
            uri = Uri.parse(optString);
        }
        this.uA = uri;
    }

    private l(Parcel parcel) {
        Uri uri;
        this.id = parcel.readString();
        this.firstName = parcel.readString();
        this.middleName = parcel.readString();
        this.lastName = parcel.readString();
        this.name = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.uA = uri;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.firstName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.name);
        Uri uri = this.uA;
        parcel.writeString(uri == null ? null : uri.toString());
    }
}
