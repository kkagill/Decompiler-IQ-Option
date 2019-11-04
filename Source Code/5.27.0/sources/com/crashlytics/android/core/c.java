package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import io.fabric.sdk.android.k;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BinaryImagesConverter */
class c {
    private final Context context;
    private final a pl;

    /* compiled from: BinaryImagesConverter */
    interface a {
        String d(File file);
    }

    c(Context context, a aVar) {
        this.context = context;
        this.pl = aVar;
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] an(String str) {
        return a(ao(str));
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] a(BufferedReader bufferedReader) {
        return a(b(bufferedReader));
    }

    private JSONArray b(BufferedReader bufferedReader) {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return jSONArray;
            }
            JSONObject ap = ap(readLine);
            if (ap != null) {
                jSONArray.put(ap);
            }
        }
    }

    private JSONArray ao(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            String[] split = b(new JSONObject(str).getJSONArray("maps")).split("\\|");
            for (String ap : split) {
                JSONObject ap2 = ap(ap);
                if (ap2 != null) {
                    jSONArray.put(ap2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            io.fabric.sdk.android.c.biX().w("CrashlyticsCore", "Unable to parse proc maps string", e);
            return jSONArray;
        }
    }

    private JSONObject ap(String str) {
        String str2 = "CrashlyticsCore";
        ak aI = al.aI(str);
        if (aI != null && a(aI)) {
            try {
                try {
                    return a(this.pl.d(aq(aI.path)), aI);
                } catch (JSONException e) {
                    io.fabric.sdk.android.c.biX().d(str2, "Could not create a binary image json string", e);
                    return null;
                }
            } catch (IOException e2) {
                k biX = io.fabric.sdk.android.c.biX();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not generate ID for file ");
                stringBuilder.append(aI.path);
                biX.d(str2, stringBuilder.toString(), e2);
            }
        }
        return null;
    }

    private File aq(String str) {
        File file = new File(str);
        return !file.exists() ? c(file) : file;
    }

    private File c(File file) {
        if (VERSION.SDK_INT < 9) {
            return file;
        }
        if (file.getAbsolutePath().startsWith("/data")) {
            try {
                file = new File(this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 0).nativeLibraryDir, file.getName());
            } catch (NameNotFoundException e) {
                io.fabric.sdk.android.c.biX().e("CrashlyticsCore", "Error getting ApplicationInfo", e);
            }
        }
        return file;
    }

    private static byte[] a(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes();
        } catch (JSONException e) {
            io.fabric.sdk.android.c.biX().w("CrashlyticsCore", "Binary images string is null", e);
            return new byte[0];
        }
    }

    private static JSONObject a(String str, ak akVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", akVar.rG);
        jSONObject.put("size", akVar.size);
        jSONObject.put(ConditionalUserProperty.NAME, akVar.path);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    private static String b(JSONArray jSONArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            stringBuilder.append(jSONArray.getString(i));
        }
        return stringBuilder.toString();
    }

    private static boolean a(ak akVar) {
        return (akVar.rH.indexOf(120) == -1 || akVar.path.indexOf(47) == -1) ? false : true;
    }
}
