package com.facebook.share.a;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Pair;
import com.facebook.FacebookException;
import com.facebook.HttpMethod;
import com.facebook.g.b;
import com.facebook.g.f;
import com.facebook.internal.z;
import com.facebook.share.a.b.a;
import com.facebook.share.b.g;
import com.facebook.share.b.j;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ShareInternalUtility */
public final class c {
    public static JSONObject a(g gVar) {
        return b.a(gVar.ms(), new a() {
            public JSONObject a(j jVar) {
                Uri mt = jVar.mt();
                if (z.f(mt)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("url", mt.toString());
                        return jSONObject;
                    } catch (JSONException e) {
                        throw new FacebookException("Unable to attach images", e);
                    }
                }
                throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
            }
        });
    }

    public static JSONArray a(JSONArray jSONArray, boolean z) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    public static JSONObject a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = a((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = a((JSONArray) obj, true);
                }
                Pair bF = bF(string);
                String str = (String) bF.first;
                String str2 = (String) bF.second;
                if (z) {
                    if (str == null || !str.equals("fbsdk")) {
                        if (str != null) {
                            if (!str.equals("og")) {
                                jSONObject3.put(str2, obj);
                            }
                        }
                        jSONObject2.put(str2, obj);
                    } else {
                        jSONObject2.put(string, obj);
                    }
                } else if (str == null || !str.equals("fb")) {
                    jSONObject2.put(str2, obj);
                } else {
                    jSONObject2.put(string, obj);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new FacebookException("Failed to create json object from share content");
        }
    }

    public static Pair<String, String> bF(String str) {
        Object substring;
        Object str2;
        int indexOf = str2.indexOf(58);
        if (indexOf != -1) {
            int i = indexOf + 1;
            if (str2.length() > i) {
                substring = str2.substring(0, indexOf);
                str2 = str2.substring(i);
                return new Pair(substring, str2);
            }
        }
        substring = null;
        return new Pair(substring, str2);
    }

    public static com.facebook.g a(com.facebook.a aVar, File file, b bVar) {
        f fVar = new f(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", fVar);
        return new com.facebook.g(aVar, "me/staging_resources", bundle, HttpMethod.POST, bVar);
    }

    public static com.facebook.g a(com.facebook.a aVar, Uri uri, b bVar) {
        if (z.h(uri)) {
            return a(aVar, new File(uri.getPath()), bVar);
        }
        if (z.g(uri)) {
            f fVar = new f((Parcelable) uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", fVar);
            return new com.facebook.g(aVar, "me/staging_resources", bundle, HttpMethod.POST, bVar);
        }
        throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
    }
}
