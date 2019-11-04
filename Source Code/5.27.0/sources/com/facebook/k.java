package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.aa;
import com.facebook.internal.s;
import com.facebook.internal.z;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.dto.entity.position.Position;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LegacyTokenHelper */
final class k {
    private static final String TAG = "k";
    private String uy;
    private SharedPreferences uz;

    public k(Context context) {
        this(context, null);
    }

    public k(Context context, String str) {
        aa.b((Object) context, "context");
        if (z.aB(str)) {
            str = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
        }
        this.uy = str;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.uz = context.getSharedPreferences(this.uy, 0);
    }

    public Bundle hI() {
        Bundle bundle = new Bundle();
        for (String str : this.uz.getAll().keySet()) {
            try {
                c(str, bundle);
            } catch (JSONException e) {
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str2 = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error reading cached value for key: '");
                stringBuilder.append(str);
                stringBuilder.append("' -- ");
                stringBuilder.append(e);
                s.a(loggingBehavior, 5, str2, stringBuilder.toString());
                return null;
            }
        }
        return bundle;
    }

    public void clear() {
        this.uz.edit().clear().apply();
    }

    /* JADX WARNING: Missing block: B:12:0x0022, code skipped:
            return false;
     */
    public static boolean g(android.os.Bundle r5) {
        /*
        r0 = 0;
        if (r5 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = "com.facebook.TokenCachingStrategy.Token";
        r1 = r5.getString(r1);
        if (r1 == 0) goto L_0x0022;
    L_0x000c:
        r1 = r1.length();
        if (r1 != 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0022;
    L_0x0013:
        r1 = 0;
        r3 = "com.facebook.TokenCachingStrategy.ExpirationDate";
        r3 = r5.getLong(r3, r1);
        r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
        if (r5 != 0) goto L_0x0020;
    L_0x001f:
        return r0;
    L_0x0020:
        r5 = 1;
        return r5;
    L_0x0022:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.k.g(android.os.Bundle):boolean");
    }

    public static String h(Bundle bundle) {
        aa.b((Object) bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.Token");
    }

    public static AccessTokenSource i(Bundle bundle) {
        aa.b((Object) bundle, "bundle");
        String str = "com.facebook.TokenCachingStrategy.AccessTokenSource";
        if (bundle.containsKey(str)) {
            return (AccessTokenSource) bundle.getSerializable(str);
        }
        return bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? AccessTokenSource.FACEBOOK_APPLICATION_WEB : AccessTokenSource.WEB_VIEW;
    }

    public static String j(Bundle bundle) {
        aa.b((Object) bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
    }

    static Date b(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return new Date(j);
    }

    private void c(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject(this.uz.getString(str, "{}"));
        String string = jSONObject.getString("valueType");
        boolean equals = string.equals("bool");
        String str2 = ConditionalUserProperty.VALUE;
        if (equals) {
            bundle.putBoolean(str, jSONObject.getBoolean(str2));
            return;
        }
        int i = 0;
        JSONArray jSONArray;
        if (string.equals("bool[]")) {
            jSONArray = jSONObject.getJSONArray(str2);
            boolean[] zArr = new boolean[jSONArray.length()];
            while (i < zArr.length) {
                zArr[i] = jSONArray.getBoolean(i);
                i++;
            }
            bundle.putBooleanArray(str, zArr);
        } else if (string.equals("byte")) {
            bundle.putByte(str, (byte) jSONObject.getInt(str2));
        } else if (string.equals("byte[]")) {
            jSONArray = jSONObject.getJSONArray(str2);
            byte[] bArr = new byte[jSONArray.length()];
            while (i < bArr.length) {
                bArr[i] = (byte) jSONArray.getInt(i);
                i++;
            }
            bundle.putByteArray(str, bArr);
        } else if (string.equals(Position.TYPE_SHORT)) {
            bundle.putShort(str, (short) jSONObject.getInt(str2));
        } else if (string.equals("short[]")) {
            jSONArray = jSONObject.getJSONArray(str2);
            short[] sArr = new short[jSONArray.length()];
            while (i < sArr.length) {
                sArr[i] = (short) jSONArray.getInt(i);
                i++;
            }
            bundle.putShortArray(str, sArr);
        } else if (string.equals("int")) {
            bundle.putInt(str, jSONObject.getInt(str2));
        } else if (string.equals("int[]")) {
            jSONArray = jSONObject.getJSONArray(str2);
            int[] iArr = new int[jSONArray.length()];
            while (i < iArr.length) {
                iArr[i] = jSONArray.getInt(i);
                i++;
            }
            bundle.putIntArray(str, iArr);
        } else if (string.equals(Position.TYPE_LONG)) {
            bundle.putLong(str, jSONObject.getLong(str2));
        } else if (string.equals("long[]")) {
            jSONArray = jSONObject.getJSONArray(str2);
            long[] jArr = new long[jSONArray.length()];
            while (i < jArr.length) {
                jArr[i] = jSONArray.getLong(i);
                i++;
            }
            bundle.putLongArray(str, jArr);
        } else if (string.equals("float")) {
            bundle.putFloat(str, (float) jSONObject.getDouble(str2));
        } else if (string.equals("float[]")) {
            jSONArray = jSONObject.getJSONArray(str2);
            float[] fArr = new float[jSONArray.length()];
            while (i < fArr.length) {
                fArr[i] = (float) jSONArray.getDouble(i);
                i++;
            }
            bundle.putFloatArray(str, fArr);
        } else if (string.equals("double")) {
            bundle.putDouble(str, jSONObject.getDouble(str2));
        } else if (string.equals("double[]")) {
            jSONArray = jSONObject.getJSONArray(str2);
            double[] dArr = new double[jSONArray.length()];
            while (i < dArr.length) {
                dArr[i] = jSONArray.getDouble(i);
                i++;
            }
            bundle.putDoubleArray(str, dArr);
        } else if (string.equals("char")) {
            string = jSONObject.getString(str2);
            if (string != null && string.length() == 1) {
                bundle.putChar(str, string.charAt(0));
            }
        } else if (string.equals("char[]")) {
            jSONArray = jSONObject.getJSONArray(str2);
            char[] cArr = new char[jSONArray.length()];
            for (int i2 = 0; i2 < cArr.length; i2++) {
                str2 = jSONArray.getString(i2);
                if (str2 != null && str2.length() == 1) {
                    cArr[i2] = str2.charAt(0);
                }
            }
            bundle.putCharArray(str, cArr);
        } else if (string.equals("string")) {
            bundle.putString(str, jSONObject.getString(str2));
        } else if (string.equals("stringList")) {
            jSONArray = jSONObject.getJSONArray(str2);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            while (i < length) {
                Object obj = jSONArray.get(i);
                arrayList.add(i, obj == JSONObject.NULL ? null : (String) obj);
                i++;
            }
            bundle.putStringArrayList(str, arrayList);
        } else if (string.equals("enum")) {
            try {
                bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString(str2)));
            } catch (ClassNotFoundException | IllegalArgumentException unused) {
            }
        }
    }
}
