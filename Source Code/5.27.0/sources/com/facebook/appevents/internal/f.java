package com.facebook.appevents.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InAppPurchaseEventManager */
class f {
    private static final String PACKAGE_NAME = com.facebook.f.getApplicationContext().getPackageName();
    private static final String TAG = "com.facebook.appevents.internal.f";
    private static final HashMap<String, Method> xe = new HashMap();
    private static final HashMap<String, Class<?>> xf = new HashMap();
    private static final SharedPreferences xg = com.facebook.f.getApplicationContext().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    private static final SharedPreferences xh = com.facebook.f.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    private static final SharedPreferences xi = com.facebook.f.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE_SUBS", 0);

    f() {
    }

    @Nullable
    public static Object a(Context context, IBinder iBinder) {
        return a(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
    }

    @Nullable
    private static String a(Context context, String str, Object obj, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return (String) a(context, arrayList, obj, z).get(str);
    }

    public static Map<String, String> a(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        Map c = c(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!c.containsKey(str)) {
                arrayList2.add(str);
            }
        }
        c.putAll(b(context, arrayList2, obj, z));
        return c;
    }

    private static Map<String, String> b(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        if (!(obj == null || arrayList.isEmpty())) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object[] objArr = new Object[4];
            int i = 0;
            objArr[0] = Integer.valueOf(3);
            objArr[1] = PACKAGE_NAME;
            objArr[2] = z ? "subs" : "inapp";
            objArr[3] = bundle;
            Object a = a(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
            if (a != null) {
                Bundle bundle2 = (Bundle) a;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                        while (i < arrayList.size()) {
                            hashMap.put(arrayList.get(i), stringArrayList.get(i));
                            i++;
                        }
                    }
                    m(hashMap);
                }
            }
        }
        return hashMap;
    }

    private static Map<String, String> c(ArrayList<String> arrayList) {
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String string = xg.getString(str, null);
            if (string != null) {
                String[] split = string.split(";", 2);
                if (currentTimeMillis - Long.parseLong(split[0]) < 43200) {
                    hashMap.put(str, split[1]);
                }
            }
        }
        return hashMap;
    }

    private static void m(Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Editor edit = xg.edit();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(currentTimeMillis);
            stringBuilder.append(";");
            stringBuilder.append((String) entry.getValue());
            edit.putString(str, stringBuilder.toString());
        }
        edit.apply();
    }

    private static Boolean a(Context context, Object obj, String str) {
        boolean z = false;
        if (obj == null) {
            return Boolean.valueOf(false);
        }
        Object a = a(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{Integer.valueOf(3), PACKAGE_NAME, str});
        if (a != null && ((Integer) a).intValue() == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static ArrayList<String> b(Context context, Object obj) {
        return d(b(context, obj, "inapp"));
    }

    static ArrayList<String> a(Context context, Object obj, Set<Integer> set) {
        ArrayList arrayList = new ArrayList();
        Map all = xi.getAll();
        if (all.isEmpty()) {
            return arrayList;
        }
        String str;
        ArrayList a = a(context, obj, "subs", (Set) set);
        HashSet hashSet = new HashSet();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(new JSONObject((String) it.next()).getString("productId"));
            } catch (JSONException e) {
                Log.e(TAG, "Error parsing purchase json", e);
            }
        }
        HashSet<String> hashSet2 = new HashSet();
        for (Entry key : all.entrySet()) {
            str = (String) key.getKey();
            if (!hashSet.contains(str)) {
                hashSet2.add(str);
            }
        }
        Editor edit = xi.edit();
        for (String str2 : hashSet2) {
            String str3 = "";
            str = xi.getString(str2, str3);
            edit.remove(str2);
            if (!str.isEmpty()) {
                arrayList.add(xi.getString(str2, str3));
            }
        }
        edit.apply();
        return arrayList;
    }

    public static Map<String, SubscriptionType> c(Context context, Object obj) {
        HashMap hashMap = new HashMap();
        Iterator it = b(context, obj, "subs").iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            SubscriptionType a = a(context, str, obj);
            if (!(a == SubscriptionType.DUPLICATED || a == SubscriptionType.UNKNOWN)) {
                hashMap.put(str, a);
            }
        }
        return hashMap;
    }

    private static SubscriptionType a(Context context, String str, Object obj) {
        String str2 = "autoRenewing";
        String str3 = "purchaseToken";
        SubscriptionType subscriptionType = null;
        try {
            String a;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            JSONObject jSONObject = new JSONObject(str);
            str = jSONObject.getString("productId");
            String string = xi.getString(str, "");
            JSONObject jSONObject2 = string.isEmpty() ? new JSONObject() : new JSONObject(string);
            if (!jSONObject2.optString(str3).equals(jSONObject.get(str3))) {
                if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) < 86400) {
                    a = a(context, str, obj, true);
                    if (a != null) {
                        SubscriptionType subscriptionType2;
                        a = new JSONObject(a).optString("freeTrialPeriod");
                        if (a != null) {
                            if (!a.isEmpty()) {
                                subscriptionType2 = SubscriptionType.START_TRIAL;
                                subscriptionType = subscriptionType2;
                            }
                        }
                        subscriptionType2 = SubscriptionType.SUBSCRIBE;
                        subscriptionType = subscriptionType2;
                    }
                }
                if (subscriptionType == null) {
                    subscriptionType = SubscriptionType.HEARTBEAT;
                }
            }
            if (subscriptionType == null && !string.isEmpty()) {
                boolean z = jSONObject2.getBoolean(str2);
                boolean z2 = jSONObject.getBoolean(str2);
                if (!z2 && z) {
                    subscriptionType = SubscriptionType.CANCEL;
                } else if (!z && z2) {
                    subscriptionType = SubscriptionType.RESTORE;
                }
            }
            a = "LAST_LOGGED_TIME_SEC";
            if (subscriptionType == null) {
                if (!string.isEmpty()) {
                    if (currentTimeMillis - jSONObject2.getLong(a) > 43200) {
                        subscriptionType = SubscriptionType.HEARTBEAT;
                    } else {
                        subscriptionType = SubscriptionType.DUPLICATED;
                    }
                }
            }
            if (subscriptionType != SubscriptionType.DUPLICATED) {
                jSONObject.put(a, currentTimeMillis);
                xi.edit().putString(str, jSONObject.toString()).apply();
            }
            return subscriptionType;
        } catch (JSONException e) {
            Log.e(TAG, "parsing purchase failure: ", e);
            return SubscriptionType.UNKNOWN;
        }
    }

    private static ArrayList<String> b(Context context, Object obj, String str) {
        return a(context, obj, str, new HashSet());
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067 A:{SYNTHETIC, EDGE_INSN: B:21:0x0067->B:17:0x0067 ?: BREAK  } */
    private static java.util.ArrayList<java.lang.String> a(android.content.Context r12, java.lang.Object r13, java.lang.String r14, java.util.Set<java.lang.Integer> r15) {
        /*
        r0 = new java.util.ArrayList;
        r0.<init>();
        if (r13 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r1 = a(r12, r13, r14);
        r1 = r1.booleanValue();
        r2 = 0;
        if (r1 == 0) goto L_0x0072;
    L_0x0013:
        r1 = 0;
        r3 = r1;
        r4 = 0;
    L_0x0016:
        r5 = 4;
        r10 = new java.lang.Object[r5];
        r5 = 3;
        r6 = java.lang.Integer.valueOf(r5);
        r10[r2] = r6;
        r6 = 1;
        r7 = PACKAGE_NAME;
        r10[r6] = r7;
        r6 = 2;
        r10[r6] = r14;
        r10[r5] = r3;
        r7 = "com.android.vending.billing.IInAppBillingService";
        r8 = "getPurchases";
        r6 = r12;
        r9 = r13;
        r11 = r15;
        r3 = a(r6, r7, r8, r9, r10, r11);
        r5 = 30;
        if (r3 == 0) goto L_0x005a;
    L_0x0039:
        r3 = (android.os.Bundle) r3;
        r6 = "RESPONSE_CODE";
        r6 = r3.getInt(r6);
        if (r6 != 0) goto L_0x0062;
    L_0x0043:
        r6 = "INAPP_PURCHASE_DATA_LIST";
        r6 = r3.getStringArrayList(r6);
        if (r6 == 0) goto L_0x0067;
    L_0x004b:
        r7 = r6.size();
        r4 = r4 + r7;
        r0.addAll(r6);
        r6 = "INAPP_CONTINUATION_TOKEN";
        r3 = r3.getString(r6);
        goto L_0x0063;
    L_0x005a:
        r3 = 7;
        r3 = java.lang.Integer.valueOf(r3);
        r15.add(r3);
    L_0x0062:
        r3 = r1;
    L_0x0063:
        if (r4 >= r5) goto L_0x0067;
    L_0x0065:
        if (r3 != 0) goto L_0x0016;
    L_0x0067:
        if (r4 < r5) goto L_0x0079;
    L_0x0069:
        r12 = 6;
        r12 = java.lang.Integer.valueOf(r12);
        r15.add(r12);
        goto L_0x0079;
    L_0x0072:
        r12 = java.lang.Integer.valueOf(r2);
        r15.add(r12);
    L_0x0079:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.f.a(android.content.Context, java.lang.Object, java.lang.String, java.util.Set):java.util.ArrayList");
    }

    public static ArrayList<String> d(Context context, Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj == null) {
            return arrayList;
        }
        Class t = t(context, "com.android.vending.billing.IInAppBillingService");
        if (t == null || a(t, "getPurchaseHistory") == null) {
            return arrayList;
        }
        return d(c(context, obj, "inapp"));
    }

    private static ArrayList<String> c(Context context, Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        if (a(context, obj, str).booleanValue()) {
            int i = 0;
            Boolean valueOf = Boolean.valueOf(false);
            String str2 = null;
            int i2 = 0;
            while (true) {
                Context context2 = context;
                Object a = a(context2, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{Integer.valueOf(6), PACKAGE_NAME, str, str2, new Bundle()});
                if (a != null) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Bundle bundle = (Bundle) a;
                    if (bundle.getInt("RESPONSE_CODE") == 0) {
                        Iterator it = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST").iterator();
                        while (it.hasNext()) {
                            str2 = (String) it.next();
                            try {
                                if (currentTimeMillis - (new JSONObject(str2).getLong("purchaseTime") / 1000) > 1200) {
                                    valueOf = Boolean.valueOf(true);
                                    break;
                                }
                                arrayList.add(str2);
                                i2++;
                            } catch (JSONException e) {
                                Log.e(TAG, "parsing purchase failure: ", e);
                            }
                        }
                        str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        if (i2 >= 30 || str2 == null || valueOf.booleanValue()) {
                            break;
                        }
                        i = 0;
                    }
                }
                str2 = null;
                i = 0;
            }
        }
        return arrayList;
    }

    private static ArrayList<String> d(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Editor edit = xh.edit();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("productId");
                long j = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (currentTimeMillis - (j / 1000) <= 86400) {
                    if (!xh.getString(string, "").equals(string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                }
            } catch (JSONException e) {
                Log.e(TAG, "parsing purchase failure: ", e);
            }
        }
        edit.apply();
        return arrayList2;
    }

    @Nullable
    private static Method a(Class<?> cls, String str) {
        Method method = (Method) xe.get(str);
        if (method != null) {
            return method;
        }
        Class[] clsArr = null;
        Object obj = -1;
        try {
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        obj = 3;
                        break;
                    }
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        obj = 2;
                        break;
                    }
                    break;
                case -1123215065:
                    if (str.equals("asInterface")) {
                        obj = null;
                        break;
                    }
                    break;
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        obj = 4;
                        break;
                    }
                    break;
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        obj = 1;
                        break;
                    }
                    break;
                default:
                    break;
            }
            if (obj == null) {
                clsArr = new Class[]{IBinder.class};
            } else if (obj == 1) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, Bundle.class};
            } else if (obj == 2) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class};
            } else if (obj == 3) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class};
            } else if (obj == 4) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class, Bundle.class};
            }
            method = cls.getDeclaredMethod(str, clsArr);
            xe.put(str, method);
        } catch (NoSuchMethodException e) {
            String str2 = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(cls.getName());
            stringBuilder.append(".");
            stringBuilder.append(str);
            stringBuilder.append(" method not found");
            Log.e(str2, stringBuilder.toString(), e);
        }
        return method;
    }

    @Nullable
    private static Class<?> t(Context context, String str) {
        Class<?> cls = (Class) xf.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            cls = context.getClassLoader().loadClass(str);
            xf.put(str, cls);
        } catch (ClassNotFoundException e) {
            String str2 = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" is not available, please add ");
            stringBuilder.append(str);
            stringBuilder.append(" to the project.");
            Log.e(str2, stringBuilder.toString(), e);
        }
        return cls;
    }

    @Nullable
    private static Object a(Context context, String str, String str2, Object obj, Object[] objArr) {
        return a(context, str, str2, obj, objArr, new HashSet());
    }

    @Nullable
    private static Object a(Context context, String str, String str2, Object obj, Object[] objArr, Set<Integer> set) {
        Class t = t(context, str);
        if (t == null) {
            set.add(Integer.valueOf(1));
            return null;
        }
        Method a = a(t, str2);
        if (a == null) {
            set.add(Integer.valueOf(2));
            return null;
        } else if (obj != null) {
            try {
                return a.invoke(t.cast(obj), objArr);
            } catch (IllegalAccessException unused) {
                set.add(Integer.valueOf(4));
                return null;
            } catch (InvocationTargetException unused2) {
                set.add(Integer.valueOf(5));
                return null;
            }
        } else {
            set.add(Integer.valueOf(3));
            return null;
        }
    }

    public static void jo() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String str = "LAST_CLEARED_TIME";
        long j = xg.getLong(str, 0);
        if (j == 0) {
            xg.edit().putLong(str, currentTimeMillis).apply();
        } else if (currentTimeMillis - j > 604800) {
            xg.edit().clear().putLong(str, currentTimeMillis).apply();
        }
    }
}
