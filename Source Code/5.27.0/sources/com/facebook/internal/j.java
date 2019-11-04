package com.facebook.internal;

import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FetchedAppSettings */
public final class j {
    private boolean xY;
    private String xZ;
    private boolean ya;
    private boolean yb;
    private int yc;
    private EnumSet<SmartLoginOption> yd;
    private Map<String, Map<String, a>> ye;
    private boolean yf;
    private f yg;
    private String yh;
    private String yi;
    private boolean yj;
    private boolean yk;
    private String yl;
    private JSONArray ym;
    private boolean yn;

    /* compiled from: FetchedAppSettings */
    public static class a {
        private String yo;
        private String yp;
        private Uri yq;
        private int[] yr;

        public static a i(JSONObject jSONObject) {
            String optString = jSONObject.optString(ConditionalUserProperty.NAME);
            Uri uri = null;
            if (z.aB(optString)) {
                return null;
            }
            String[] split = optString.split("\\|");
            if (split.length != 2) {
                return null;
            }
            String str = split[0];
            optString = split[1];
            if (z.aB(str) || z.aB(optString)) {
                return null;
            }
            String optString2 = jSONObject.optString("url");
            if (!z.aB(optString2)) {
                uri = Uri.parse(optString2);
            }
            return new a(str, optString, uri, e(jSONObject.optJSONArray("versions")));
        }

        private static int[] e(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int i2 = -1;
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!z.aB(optString)) {
                        try {
                            i2 = Integer.parseInt(optString);
                        } catch (NumberFormatException e) {
                            z.a("FacebookSDK", e);
                        }
                        iArr[i] = i2;
                    }
                }
                i2 = optInt;
                iArr[i] = i2;
            }
            return iArr;
        }

        private a(String str, String str2, Uri uri, int[] iArr) {
            this.yo = str;
            this.yp = str2;
            this.yq = uri;
            this.yr = iArr;
        }

        public String jU() {
            return this.yo;
        }

        public String getFeatureName() {
            return this.yp;
        }
    }

    public j(boolean z, String str, boolean z2, boolean z3, int i, EnumSet<SmartLoginOption> enumSet, Map<String, Map<String, a>> map, boolean z4, f fVar, String str2, String str3, boolean z5, boolean z6, JSONArray jSONArray, String str4, boolean z7) {
        this.xY = z;
        this.xZ = str;
        this.ya = z2;
        this.yb = z3;
        this.ye = map;
        this.yg = fVar;
        this.yc = i;
        this.yf = z4;
        this.yd = enumSet;
        this.yh = str2;
        this.yi = str3;
        this.yj = z5;
        this.yk = z6;
        this.ym = jSONArray;
        this.yl = str4;
        this.yn = z7;
    }

    public boolean jM() {
        return this.xY;
    }

    public boolean jN() {
        return this.yb;
    }

    public int iQ() {
        return this.yc;
    }

    public boolean jO() {
        return this.yf;
    }

    public EnumSet<SmartLoginOption> jP() {
        return this.yd;
    }

    public f gP() {
        return this.yg;
    }

    public boolean jQ() {
        return this.yj;
    }

    public boolean jR() {
        return this.yk;
    }

    public JSONArray jS() {
        return this.ym;
    }

    public String jT() {
        return this.yl;
    }
}
