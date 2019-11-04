package com.iqoption.core.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.gson.stream.JsonReader;
import com.iqoption.core.data.d.a;
import com.iqoption.core.data.d.d;
import com.iqoption.core.data.d.e;
import com.iqoption.i.b;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LocalizationUtil {
    private static final String TAG = "com.iqoption.core.util.LocalizationUtil";
    private static Map<String, String> bRc;
    private static final Set<String> bRd = al.setOf("front.SIN-FAKE", "front.TEST1", "front.TEST2", "front.TEST3", "front.TEST4");

    public static class LocalizationException extends Exception {
        public LocalizationException(String str) {
            super(str);
        }
    }

    @Nullable
    public static String hq(String str) {
        Map map = bRc;
        if (map == null || map.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("LocalizationUtil not initilized: ");
            stringBuilder.append(str);
            d.d(new LocalizationException(stringBuilder.toString()));
            return str;
        }
        String str2 = (String) bRc.get(str);
        if (str2 == null && !bRd.contains(str)) {
            d.d(new LocalizationException(str));
        }
        return str2;
    }

    public static String hr(String str) {
        String hq = hq(str);
        return hq == null ? str : hq;
    }

    @WorkerThread
    public static void ae(String str, String str2) {
        new d("localized_pref_name").put("localization_json", str2);
        a.bdi.fK(str);
        e.bdq.WC();
    }

    public static String Wb() {
        String Wb = a.bdi.Wb();
        return Wb != null ? Wb : "0";
    }

    @WorkerThread
    public static void init() {
        String string = new d("localized_pref_name").getString("localization_json", "");
        if (!TextUtils.isEmpty(string)) {
            bRc = new HashMap(9000);
            try {
                JsonReader jsonReader = new JsonReader(new StringReader(string));
                jsonReader.setLenient(true);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    bRc.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
                jsonReader.close();
            } catch (IOException e) {
                b.iW("localization json parse Exception");
                b.N(e);
            }
        }
        if (bRc == null) {
            bRc = new HashMap();
        }
    }
}
