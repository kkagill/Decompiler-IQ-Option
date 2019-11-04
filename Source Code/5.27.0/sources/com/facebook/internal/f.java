package com.facebook.internal;

import com.facebook.FacebookRequestError.Category;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FacebookRequestErrorClassification */
public final class f {
    private static f xQ;
    private final Map<Integer, Set<Integer>> xK;
    private final Map<Integer, Set<Integer>> xL;
    private final Map<Integer, Set<Integer>> xM;
    private final String xN;
    private final String xO;
    private final String xP;

    /* compiled from: FacebookRequestErrorClassification */
    /* renamed from: com.facebook.internal.f$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] xR = new int[Category.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.facebook.FacebookRequestError.Category.values();
            r0 = r0.length;
            r0 = new int[r0];
            xR = r0;
            r0 = xR;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.facebook.FacebookRequestError.Category.OTHER;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = xR;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = xR;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.facebook.FacebookRequestError.Category.TRANSIENT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.f$AnonymousClass1.<clinit>():void");
        }
    }

    f(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.xK = map;
        this.xL = map2;
        this.xM = map3;
        this.xN = str;
        this.xO = str2;
        this.xP = str3;
    }

    public String a(Category category) {
        int i = AnonymousClass1.xR[category.ordinal()];
        if (i == 1) {
            return this.xN;
        }
        if (i == 2) {
            return this.xP;
        }
        if (i != 3) {
            return null;
        }
        return this.xO;
    }

    public Category a(int i, int i2, boolean z) {
        if (z) {
            return Category.TRANSIENT;
        }
        Set set;
        Map map = this.xK;
        if (map != null && map.containsKey(Integer.valueOf(i))) {
            set = (Set) this.xK.get(Integer.valueOf(i));
            if (set == null || set.contains(Integer.valueOf(i2))) {
                return Category.OTHER;
            }
        }
        map = this.xM;
        if (map != null && map.containsKey(Integer.valueOf(i))) {
            set = (Set) this.xM.get(Integer.valueOf(i));
            if (set == null || set.contains(Integer.valueOf(i2))) {
                return Category.LOGIN_RECOVERABLE;
            }
        }
        map = this.xL;
        if (map != null && map.containsKey(Integer.valueOf(i))) {
            Set set2 = (Set) this.xL.get(Integer.valueOf(i));
            if (set2 == null || set2.contains(Integer.valueOf(i2))) {
                return Category.TRANSIENT;
            }
        }
        return Category.OTHER;
    }

    public static synchronized f jI() {
        f fVar;
        synchronized (f.class) {
            if (xQ == null) {
                xQ = jJ();
            }
            fVar = xQ;
        }
        return fVar;
    }

    private static f jJ() {
        return new f(null, new FacebookRequestErrorClassification$1(), new FacebookRequestErrorClassification$2(), null, null, null);
    }

    private static Map<Integer, Set<Integer>> h(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("code");
                if (optInt != 0) {
                    Object obj;
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        obj = null;
                    } else {
                        obj = new HashSet();
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                obj.add(Integer.valueOf(optInt2));
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), obj);
                }
            }
        }
        return hashMap;
    }

    public static f d(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        Map map = null;
        Map map2 = map;
        Map map3 = map2;
        String str = map3;
        String str2 = str;
        String str3 = str2;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString(ConditionalUserProperty.NAME);
                if (optString != null) {
                    String str4 = "recovery_message";
                    if (optString.equalsIgnoreCase("other")) {
                        str = optJSONObject.optString(str4, null);
                        map = h(optJSONObject);
                    } else if (optString.equalsIgnoreCase("transient")) {
                        str2 = optJSONObject.optString(str4, null);
                        map2 = h(optJSONObject);
                    } else if (optString.equalsIgnoreCase("login_recoverable")) {
                        str3 = optJSONObject.optString(str4, null);
                        map3 = h(optJSONObject);
                    }
                }
            }
        }
        return new f(map, map2, map3, str, str2, str3);
    }
}
