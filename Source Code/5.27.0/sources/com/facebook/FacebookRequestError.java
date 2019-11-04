package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.f;
import com.facebook.internal.j;
import com.facebook.internal.z;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError implements Parcelable {
    public static final Creator<FacebookRequestError> CREATOR = new Creator<FacebookRequestError>() {
        /* renamed from: p */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            return new FacebookRequestError(parcel, null);
        }

        /* renamed from: R */
        public FacebookRequestError[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    };
    static final a ti = new a(200, 299, null);
    private final int errorCode;
    private final String errorMessage;
    private final Category tj;
    private final int tk;
    private final int tl;
    private final String tm;
    private final String tn;
    private final String tp;
    private final String tq;
    private final JSONObject tr;
    private final JSONObject ts;
    private final Object tt;
    private final HttpURLConnection tu;
    private final FacebookException tv;

    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    private static class a {
        private final int end;
        private final int start;

        /* synthetic */ a(int i, int i2, AnonymousClass1 anonymousClass1) {
            this(i, i2);
        }

        private a(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean contains(int i) {
            return this.start <= i && i <= this.end;
        }
    }

    public int describeContents() {
        return 0;
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        Object obj2;
        Category category;
        this.tk = i;
        this.errorCode = i2;
        this.tl = i3;
        this.tm = str;
        this.errorMessage = str2;
        this.ts = jSONObject;
        this.tr = jSONObject2;
        this.tt = obj;
        this.tu = httpURLConnection;
        this.tn = str3;
        this.tp = str4;
        if (facebookException != null) {
            this.tv = facebookException;
            obj2 = 1;
        } else {
            this.tv = new FacebookServiceException(this, str2);
            obj2 = null;
        }
        f gP = gP();
        if (obj2 != null) {
            category = Category.OTHER;
        } else {
            category = gP.a(i2, i3, z);
        }
        this.tj = category;
        this.tq = gP.a(this.tj);
    }

    FacebookRequestError(HttpURLConnection httpURLConnection, Exception exception) {
        Throwable th = exception;
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpURLConnection, th instanceof FacebookException ? (FacebookException) th : new FacebookException(th));
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, false, null, null, null, null, null);
    }

    public int gL() {
        return this.tk;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int gM() {
        return this.tl;
    }

    public String gN() {
        return this.tm;
    }

    public String getErrorMessage() {
        String str = this.errorMessage;
        if (str != null) {
            return str;
        }
        return this.tv.getLocalizedMessage();
    }

    public FacebookException gO() {
        return this.tv;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{HttpStatus: ");
        stringBuilder.append(this.tk);
        stringBuilder.append(", errorCode: ");
        stringBuilder.append(this.errorCode);
        stringBuilder.append(", subErrorCode: ");
        stringBuilder.append(this.tl);
        stringBuilder.append(", errorType: ");
        stringBuilder.append(this.tm);
        stringBuilder.append(", errorMessage: ");
        stringBuilder.append(getErrorMessage());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static FacebookRequestError a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        JSONObject jSONObject2 = jSONObject;
        String str = "error_code";
        String str2 = "error";
        String str3 = "FACEBOOK_NON_JSON_RESULT";
        String str4 = "body";
        String str5 = "code";
        try {
            if (jSONObject2.has(str5)) {
                int i = jSONObject2.getInt(str5);
                Object b = z.b(jSONObject2, str4, str3);
                if (b != null && (b instanceof JSONObject)) {
                    int optInt;
                    String optString;
                    String optString2;
                    boolean optBoolean;
                    String str6;
                    int i2;
                    JSONObject jSONObject3 = (JSONObject) b;
                    Object obj2 = 1;
                    String str7 = "error_subcode";
                    String optString3;
                    if (jSONObject3.has(str2)) {
                        JSONObject jSONObject4 = (JSONObject) z.b(jSONObject3, str2, null);
                        str2 = jSONObject4.optString("type", null);
                        optString3 = jSONObject4.optString("message", null);
                        optInt = jSONObject4.optInt(str5, -1);
                        int optInt2 = jSONObject4.optInt(str7, -1);
                        optString = jSONObject4.optString("error_user_msg", null);
                        optString2 = jSONObject4.optString("error_user_title", null);
                        optBoolean = jSONObject4.optBoolean("is_transient", false);
                        str6 = optString3;
                        i2 = optInt2;
                        str7 = str2;
                    } else {
                        str5 = "error_msg";
                        optString3 = "error_reason";
                        if (!jSONObject3.has(str)) {
                            if (!jSONObject3.has(str5)) {
                                if (!jSONObject3.has(optString3)) {
                                    str7 = null;
                                    str6 = str7;
                                    optString = str6;
                                    optString2 = optString;
                                    optInt = -1;
                                    i2 = -1;
                                    obj2 = null;
                                    optBoolean = false;
                                }
                            }
                        }
                        str2 = jSONObject3.optString(optString3, null);
                        str5 = jSONObject3.optString(str5, null);
                        int optInt3 = jSONObject3.optInt(str, -1);
                        i2 = jSONObject3.optInt(str7, -1);
                        str7 = str2;
                        str6 = str5;
                        optString = null;
                        optString2 = optString;
                        optBoolean = false;
                        optInt = optInt3;
                    }
                    if (obj2 != null) {
                        return new FacebookRequestError(i, optInt, i2, str7, str6, optString2, optString, optBoolean, jSONObject3, jSONObject, obj, httpURLConnection, null);
                    }
                }
                if (!ti.contains(i)) {
                    return new FacebookRequestError(i, -1, -1, null, null, null, null, false, jSONObject2.has(str4) ? (JSONObject) z.b(jSONObject2, str4, str3) : null, jSONObject, obj, httpURLConnection, null);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    static synchronized f gP() {
        synchronized (FacebookRequestError.class) {
            j bg = FetchedAppSettingsManager.bg(f.go());
            f jI;
            if (bg == null) {
                jI = f.jI();
                return jI;
            }
            jI = bg.gP();
            return jI;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.tk);
        parcel.writeInt(this.errorCode);
        parcel.writeInt(this.tl);
        parcel.writeString(this.tm);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.tn);
        parcel.writeString(this.tp);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
    }
}
