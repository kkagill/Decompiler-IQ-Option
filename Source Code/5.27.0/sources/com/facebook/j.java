package com.facebook;

import android.util.Log;
import com.facebook.internal.s;
import com.facebook.internal.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: GraphResponse */
public class j {
    private static final String TAG = "j";
    private final FacebookRequestError error;
    private final JSONObject tW;
    private final HttpURLConnection tu;
    private final g uk;
    private final JSONArray uw;
    private final String ux;

    j(g gVar, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(gVar, httpURLConnection, str, jSONObject, null, null);
    }

    j(g gVar, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(gVar, httpURLConnection, str, null, jSONArray, null);
    }

    j(g gVar, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(gVar, httpURLConnection, null, null, null, facebookRequestError);
    }

    j(g gVar, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.uk = gVar;
        this.tu = httpURLConnection;
        this.ux = str;
        this.tW = jSONObject;
        this.uw = jSONArray;
        this.error = facebookRequestError;
    }

    public final FacebookRequestError hG() {
        return this.error;
    }

    public final JSONObject hH() {
        return this.tW;
    }

    public String toString() {
        String format;
        try {
            Locale locale = Locale.US;
            String str = "%d";
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(this.tu != null ? this.tu.getResponseCode() : 200);
            format = String.format(locale, str, objArr);
        } catch (IOException unused) {
            format = "unknown";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{Response: ");
        stringBuilder.append(" responseCode: ");
        stringBuilder.append(format);
        stringBuilder.append(", graphObject: ");
        stringBuilder.append(this.tW);
        stringBuilder.append(", error: ");
        stringBuilder.append(this.error);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static List<j> b(HttpURLConnection httpURLConnection, i iVar) {
        String str = "Response <Error>: %s";
        String str2 = "Response";
        Closeable closeable = null;
        List<j> a;
        try {
            if (f.gQ()) {
                if (httpURLConnection.getResponseCode() >= 400) {
                    closeable = httpURLConnection.getErrorStream();
                } else {
                    closeable = httpURLConnection.getInputStream();
                }
                a = a((InputStream) closeable, httpURLConnection, iVar);
                return a;
            }
            String str3 = "GraphRequest can't be used when Facebook SDK isn't fully initialized";
            Log.e(TAG, str3);
            throw new FacebookException(str3);
        } catch (FacebookException e) {
            s.a(LoggingBehavior.REQUESTS, str2, str, e);
            a = a((List) iVar, httpURLConnection, e);
            return a;
        } catch (Exception e2) {
            s.a(LoggingBehavior.REQUESTS, str2, str, e2);
            a = a((List) iVar, httpURLConnection, new FacebookException(e2));
            return a;
        } finally {
            z.closeQuietly(closeable);
        }
    }

    static List<j> a(InputStream inputStream, HttpURLConnection httpURLConnection, i iVar) {
        String d = z.d(inputStream);
        s.a(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(d.length()), d);
        return a(d, httpURLConnection, iVar);
    }

    static List<j> a(String str, HttpURLConnection httpURLConnection, i iVar) {
        List a = a(httpURLConnection, (List) iVar, new JSONTokener(str).nextValue());
        s.a(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", iVar.getId(), Integer.valueOf(str.length()), a);
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    private static java.util.List<com.facebook.j> a(java.net.HttpURLConnection r7, java.util.List<com.facebook.g> r8, java.lang.Object r9) {
        /*
        r0 = r8.size();
        r1 = new java.util.ArrayList;
        r1.<init>(r0);
        r2 = 0;
        r3 = 1;
        if (r0 != r3) goto L_0x0051;
    L_0x000d:
        r3 = r8.get(r2);
        r3 = (com.facebook.g) r3;
        r4 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
        r4.<init>();	 Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
        r5 = "body";
        r4.put(r5, r9);	 Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
        if (r7 == 0) goto L_0x0024;
    L_0x001f:
        r5 = r7.getResponseCode();	 Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
        goto L_0x0026;
    L_0x0024:
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
    L_0x0026:
        r6 = "code";
        r4.put(r6, r5);	 Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
        r5 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
        r5.<init>();	 Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
        r5.put(r4);	 Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
        goto L_0x0052;
    L_0x0034:
        r4 = move-exception;
        r5 = new com.facebook.j;
        r6 = new com.facebook.FacebookRequestError;
        r6.<init>(r7, r4);
        r5.<init>(r3, r7, r6);
        r1.add(r5);
        goto L_0x0051;
    L_0x0043:
        r4 = move-exception;
        r5 = new com.facebook.j;
        r6 = new com.facebook.FacebookRequestError;
        r6.<init>(r7, r4);
        r5.<init>(r3, r7, r6);
        r1.add(r5);
    L_0x0051:
        r5 = r9;
    L_0x0052:
        r3 = r5 instanceof org.json.JSONArray;
        if (r3 == 0) goto L_0x0097;
    L_0x0056:
        r5 = (org.json.JSONArray) r5;
        r3 = r5.length();
        if (r3 != r0) goto L_0x0097;
    L_0x005e:
        r0 = r5.length();
        if (r2 >= r0) goto L_0x0096;
    L_0x0064:
        r0 = r8.get(r2);
        r0 = (com.facebook.g) r0;
        r3 = r5.get(r2);	 Catch:{ JSONException -> 0x0085, FacebookException -> 0x0076 }
        r3 = a(r0, r7, r3, r9);	 Catch:{ JSONException -> 0x0085, FacebookException -> 0x0076 }
        r1.add(r3);	 Catch:{ JSONException -> 0x0085, FacebookException -> 0x0076 }
        goto L_0x0093;
    L_0x0076:
        r3 = move-exception;
        r4 = new com.facebook.j;
        r6 = new com.facebook.FacebookRequestError;
        r6.<init>(r7, r3);
        r4.<init>(r0, r7, r6);
        r1.add(r4);
        goto L_0x0093;
    L_0x0085:
        r3 = move-exception;
        r4 = new com.facebook.j;
        r6 = new com.facebook.FacebookRequestError;
        r6.<init>(r7, r3);
        r4.<init>(r0, r7, r6);
        r1.add(r4);
    L_0x0093:
        r2 = r2 + 1;
        goto L_0x005e;
    L_0x0096:
        return r1;
    L_0x0097:
        r7 = new com.facebook.FacebookException;
        r8 = "Unexpected number of results";
        r7.<init>(r8);
        goto L_0x00a0;
    L_0x009f:
        throw r7;
    L_0x00a0:
        goto L_0x009f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.j.a(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
    }

    private static j a(g gVar, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            FacebookRequestError a = FacebookRequestError.a(jSONObject, obj2, httpURLConnection);
            if (a != null) {
                Log.e(TAG, a.toString());
                if (a.getErrorCode() == 190 && z.e(gVar.hl())) {
                    if (a.gM() != 493) {
                        a.a(null);
                    } else if (!a.ge().isExpired()) {
                        a.gg();
                    }
                }
                return new j(gVar, httpURLConnection, a);
            }
            obj = z.b(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (obj instanceof JSONObject) {
                return new j(gVar, httpURLConnection, obj.toString(), (JSONObject) obj);
            }
            if (obj instanceof JSONArray) {
                return new j(gVar, httpURLConnection, obj.toString(), (JSONArray) obj);
            }
            obj = JSONObject.NULL;
        }
        if (obj == JSONObject.NULL) {
            return new j(gVar, httpURLConnection, obj.toString(), (JSONObject) null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Got unexpected object type in response, class: ");
        stringBuilder.append(obj.getClass().getSimpleName());
        throw new FacebookException(stringBuilder.toString());
    }

    static List<j> a(List<g> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new j((g) list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) facebookException)));
        }
        return arrayList;
    }
}
