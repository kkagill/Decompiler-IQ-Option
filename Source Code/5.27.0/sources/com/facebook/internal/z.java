package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.facebook.FacebookException;
import com.facebook.HttpMethod;
import com.facebook.f;
import com.facebook.g;
import com.facebook.j;
import com.iqoption.dto.entity.position.Position;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: Utility */
public final class z {
    private static int zL = 0;
    private static long zM = -1;
    private static long zN = -1;
    private static long zO = -1;
    private static String zP = "";
    private static String zQ = "";
    private static String zR = "NoCarrier";

    /* compiled from: Utility */
    public interface a {
        void c(FacebookException facebookException);

        void e(JSONObject jSONObject);
    }

    /* compiled from: Utility */
    public static class b {
        List<String> zU;
        List<String> zV;
        List<String> zW;

        public b(List<String> list, List<String> list2, List<String> list3) {
            this.zU = list;
            this.zV = list2;
            this.zW = list3;
        }

        public List<String> kS() {
            return this.zU;
        }

        public List<String> kT() {
            return this.zV;
        }

        public List<String> kU() {
            return this.zW;
        }
    }

    public static <T> boolean c(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean aB(String str) {
        return str == null || str.length() == 0;
    }

    public static String E(String str, String str2) {
        return aB(str) ? str2 : str;
    }

    public static <T> Collection<T> b(T... tArr) {
        return Collections.unmodifiableCollection(Arrays.asList(tArr));
    }

    public static String bo(String str) {
        return F("MD5", str);
    }

    public static String g(byte[] bArr) {
        return c("SHA-1", bArr);
    }

    @Nullable
    public static String bp(@Nullable String str) {
        return str == null ? null : F("SHA-256", str);
    }

    private static String F(String str, String str2) {
        return c(str, str2.getBytes());
    }

    private static String c(String str, byte[] bArr) {
        try {
            return a(MessageDigest.getInstance(str), bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static String a(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : digest) {
            stringBuilder.append(Integer.toHexString((b >> 4) & 15));
            stringBuilder.append(Integer.toHexString((b >> 0) & 15));
        }
        return stringBuilder.toString();
    }

    public static Uri a(String str, String str2, Bundle bundle) {
        Builder builder = new Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str22 : bundle.keySet()) {
                Object obj = bundle.get(str22);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str22, (String) obj);
                }
            }
        }
        return builder.build();
    }

    public static Bundle bq(String str) {
        Bundle bundle = new Bundle();
        if (!aB(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    String str2 = "UTF-8";
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], str2), URLDecoder.decode(split2[1], str2));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], str2), "");
                    }
                } catch (UnsupportedEncodingException e) {
                    a("FacebookSDK", e);
                }
            }
        }
        return bundle;
    }

    public static void b(Bundle bundle, String str, String str2) {
        if (!aB(str2)) {
            bundle.putString(str, str2);
        }
    }

    public static void a(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            b(bundle, str, uri.toString());
        }
    }

    public static boolean b(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, obj.toString());
        }
        return true;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static String Z(Context context) {
        aa.b((Object) context, "context");
        f.L(context);
        return f.go();
    }

    public static Object b(JSONObject jSONObject, String str, String str2) {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    public static String d(InputStream inputStream) {
        Throwable th;
        Closeable bufferedInputStream;
        Closeable inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            stringBuilder.append(cArr, 0, read);
                        } else {
                            String stringBuilder2 = stringBuilder.toString();
                            closeQuietly(bufferedInputStream);
                            closeQuietly(inputStreamReader);
                            return stringBuilder2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeQuietly(bufferedInputStream);
                    closeQuietly(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                closeQuietly(bufferedInputStream);
                closeQuietly(inputStreamReader);
                throw th;
            }
        } catch (Throwable th32) {
            bufferedInputStream = null;
            th = th32;
            inputStreamReader = bufferedInputStream;
            closeQuietly(bufferedInputStream);
            closeQuietly(inputStreamReader);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    public static int a(java.io.InputStream r6, java.io.OutputStream r7) {
        /*
        r0 = 0;
        r1 = new java.io.BufferedInputStream;	 Catch:{ all -> 0x0023 }
        r1.<init>(r6);	 Catch:{ all -> 0x0023 }
        r0 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r0 = new byte[r0];	 Catch:{ all -> 0x0021 }
        r2 = 0;
        r3 = 0;
    L_0x000c:
        r4 = r1.read(r0);	 Catch:{ all -> 0x0021 }
        r5 = -1;
        if (r4 == r5) goto L_0x0018;
    L_0x0013:
        r7.write(r0, r2, r4);	 Catch:{ all -> 0x0021 }
        r3 = r3 + r4;
        goto L_0x000c;
    L_0x0018:
        r1.close();
        if (r6 == 0) goto L_0x0020;
    L_0x001d:
        r6.close();
    L_0x0020:
        return r3;
    L_0x0021:
        r7 = move-exception;
        goto L_0x0025;
    L_0x0023:
        r7 = move-exception;
        r1 = r0;
    L_0x0025:
        if (r1 == 0) goto L_0x002a;
    L_0x0027:
        r1.close();
    L_0x002a:
        if (r6 == 0) goto L_0x002f;
    L_0x002c:
        r6.close();
    L_0x002f:
        goto L_0x0031;
    L_0x0030:
        throw r7;
    L_0x0031:
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.z.a(java.io.InputStream, java.io.OutputStream):int");
    }

    private static void v(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(split2[0].trim());
                    stringBuilder.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    instance.setCookie(str, stringBuilder.toString());
                }
            }
            instance.removeExpiredCookie();
        }
    }

    public static void aa(Context context) {
        v(context, "facebook.com");
        v(context, ".facebook.com");
        v(context, "https://facebook.com");
        v(context, "https://.facebook.com");
    }

    public static void a(String str, Exception exception) {
        if (f.isDebugEnabled() && str != null && exception != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getSimpleName());
            stringBuilder.append(": ");
            stringBuilder.append(exception.getMessage());
            Log.d(str, stringBuilder.toString());
        }
    }

    public static void G(String str, String str2) {
        if (f.isDebugEnabled() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (f.isDebugEnabled() && !aB(str)) {
            Log.d(str, str2, th);
        }
    }

    public static <T> boolean c(T t, T t2) {
        if (t != null) {
            return t.equals(t2);
        }
        return t2 == null;
    }

    public static <T> List<T> c(T... tArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : tArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List<String> f(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static void a(JSONObject jSONObject, a aVar, String str, boolean z) {
        if (!(aVar == null || aVar.jD() == null)) {
            jSONObject.put("attribution", aVar.jD());
        }
        if (!(aVar == null || aVar.jE() == null)) {
            jSONObject.put("advertiser_id", aVar.jE());
            jSONObject.put("advertiser_tracking_enabled", aVar.jG() ^ 1);
        }
        if (!(aVar == null || aVar.jF() == null)) {
            jSONObject.put("installer_package", aVar.jF());
        }
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", z ^ 1);
    }

    public static void a(JSONObject jSONObject, Context context) {
        Object obj;
        Locale locale;
        int i;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        ac(context);
        String packageName = context.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i3 = packageInfo.versionCode;
            obj = packageInfo.versionName;
        } catch (NameNotFoundException unused) {
            obj = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(obj);
        jSONArray.put(VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(locale.getLanguage());
        stringBuilder.append("_");
        stringBuilder.append(locale.getCountry());
        jSONArray.put(stringBuilder.toString());
        jSONArray.put(zP);
        jSONArray.put(zR);
        double d = 0.0d;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
                try {
                    i2 = displayMetrics.heightPixels;
                    d = (double) displayMetrics.density;
                } catch (Exception unused3) {
                }
                jSONArray.put(i);
                jSONArray.put(i2);
                jSONArray.put(new DecimalFormat("#.##").format(d));
                jSONArray.put(kM());
                jSONArray.put(zN);
                jSONArray.put(zO);
                jSONArray.put(zQ);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (Exception unused4) {
        }
        i = 0;
        jSONArray.put(i);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d));
        jSONArray.put(kM());
        jSONArray.put(zN);
        jSONArray.put(zO);
        jSONArray.put(zQ);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method a(String str, String str2, Class<?>... clsArr) {
        try {
            return a(Class.forName(str), str2, (Class[]) clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Object a(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static String ab(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        return context.getClass().getSimpleName();
    }

    /* JADX WARNING: Missing block: B:6:0x0024, code skipped:
            if ("fbstaging".equalsIgnoreCase(r2.getScheme()) != false) goto L_0x0026;
     */
    public static boolean f(android.net.Uri r2) {
        /*
        if (r2 == 0) goto L_0x0028;
    L_0x0002:
        r0 = r2.getScheme();
        r1 = "http";
        r0 = r1.equalsIgnoreCase(r0);
        if (r0 != 0) goto L_0x0026;
    L_0x000e:
        r0 = r2.getScheme();
        r1 = "https";
        r0 = r1.equalsIgnoreCase(r0);
        if (r0 != 0) goto L_0x0026;
    L_0x001a:
        r2 = r2.getScheme();
        r0 = "fbstaging";
        r2 = r0.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x0028;
    L_0x0026:
        r2 = 1;
        goto L_0x0029;
    L_0x0028:
        r2 = 0;
    L_0x0029:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.z.f(android.net.Uri):boolean");
    }

    public static boolean g(Uri uri) {
        if (uri != null) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(Uri uri) {
        if (uri != null) {
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    public static long i(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = f.getApplicationContext().getContentResolver().query(uri, null, null, null, null);
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j = cursor.getLong(columnIndex);
            return j;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static Date a(Bundle bundle, String str, Date date) {
        Date date2 = null;
        if (bundle == null) {
            return null;
        }
        long longValue;
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            longValue = ((Long) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    longValue = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return date2;
        }
        if (longValue == 0) {
            return new Date(Long.MAX_VALUE);
        }
        date2 = new Date(date.getTime() + (longValue * 1000));
        return date2;
    }

    public static void a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public static Map<String, String> s(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    public static boolean e(com.facebook.a aVar) {
        return aVar != null && aVar.equals(com.facebook.a.ge());
    }

    public static void a(final String str, final a aVar) {
        JSONObject bn = w.bn(str);
        if (bn != null) {
            aVar.e(bn);
            return;
        }
        com.facebook.g.b anonymousClass1 = new com.facebook.g.b() {
            public void a(j jVar) {
                if (jVar.hG() != null) {
                    aVar.c(jVar.hG().gO());
                    return;
                }
                w.e(str, jVar.hH());
                aVar.e(jVar.hH());
            }
        };
        g bs = bs(str);
        bs.a(anonymousClass1);
        bs.ho();
    }

    public static JSONObject br(String str) {
        JSONObject bn = w.bn(str);
        if (bn != null) {
            return bn;
        }
        j hn = bs(str).hn();
        if (hn.hG() != null) {
            return null;
        }
        return hn.hH();
    }

    private static g bs(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", str);
        return new g(null, "me", bundle, HttpMethod.GET, null);
    }

    private static int kM() {
        int i = zL;
        if (i > 0) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() {
                public boolean accept(File file, String str) {
                    return Pattern.matches("cpu[0-9]+", str);
                }
            });
            if (listFiles != null) {
                zL = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (zL <= 0) {
            zL = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return zL;
    }

    private static void ac(Context context) {
        if (zM == -1 || System.currentTimeMillis() - zM >= 1800000) {
            zM = System.currentTimeMillis();
            kN();
            ad(context);
            kQ();
            kP();
        }
    }

    private static void kN() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            zP = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            zQ = timeZone.getID();
        } catch (AssertionError | Exception unused) {
        }
    }

    private static void ad(Context context) {
        if (zR.equals("NoCarrier")) {
            try {
                zR = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }

    private static boolean kO() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    private static void kP() {
        try {
            if (kO()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                zO = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            zO = b((double) zO);
        } catch (Exception unused) {
        }
    }

    private static void kQ() {
        try {
            if (kO()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                zN = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            zN = b((double) zN);
        } catch (Exception unused) {
        }
    }

    private static long b(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    public static b k(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("permission");
            if (!(optString == null || optString.equals("installed"))) {
                String optString2 = optJSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                if (optString2 != null) {
                    if (optString2.equals("granted")) {
                        arrayList.add(optString);
                    } else if (optString2.equals("declined")) {
                        arrayList2.add(optString);
                    } else if (optString2.equals(Position.CLOSE_REASON_EXPIRED)) {
                        arrayList3.add(optString);
                    }
                }
            }
        }
        return new b(arrayList, arrayList2, arrayList3);
    }

    public static String Y(int i) {
        return new BigInteger(i * 5, new Random()).toString(32);
    }

    public static boolean ae(Context context) {
        return af(context);
    }

    public static boolean af(Context context) {
        boolean z = false;
        if (VERSION.SDK_INT < 26) {
            return false;
        }
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
            z = true;
        }
        return z;
    }

    public static boolean ag(Context context) {
        if (VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        return Build.DEVICE != null && Build.DEVICE.matches(".+_cheets|cheets_.+");
    }

    public static Locale kR() {
        try {
            return f.getApplicationContext().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return Locale.getDefault();
        }
    }
}
