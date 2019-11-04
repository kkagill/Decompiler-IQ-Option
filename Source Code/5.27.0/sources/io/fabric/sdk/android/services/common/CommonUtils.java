package io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.iqoption.dto.entity.ActiveQuote;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CommonUtils {
    private static Boolean eMS;
    private static final char[] eMT = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static long eMU = -1;
    public static final Comparator<File> eMV = new Comparator<File>() {
        /* renamed from: a */
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    };

    enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, Architecture> matcher = null;

        static {
            matcher = new HashMap(4);
            matcher.put("armeabi-v7a", ARMV7);
            matcher.put("armeabi", ARMV6);
            matcher.put("arm64-v8a", ARM64);
            matcher.put("x86", X86_32);
        }

        static Architecture getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                c.biX().d("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            Architecture architecture = (Architecture) matcher.get(str.toLowerCase(Locale.US));
            if (architecture == null) {
                architecture = UNKNOWN;
            }
            return architecture;
        }
    }

    public static String jm(int i) {
        switch (i) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return ActiveQuote.PHASE_INTRADAY_AUCTION;
            case 5:
                return "W";
            case 6:
                return "E";
            case 7:
                return ActiveQuote.PHASE_CLOSING_AUCTION;
            default:
                return "?";
        }
    }

    public static SharedPreferences co(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static String e(File file, String str) {
        Throwable e;
        StringBuilder stringBuilder;
        Throwable th;
        String str2 = "Failed to close system file reader.";
        String str3 = null;
        if (file.exists()) {
            Closeable bufferedReader;
            try {
                bufferedReader = new BufferedReader(new FileReader(file), 1024);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                        if (split.length > 1 && split[0].equals(str)) {
                            str3 = split[1];
                            break;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Error parsing ");
                            stringBuilder.append(file);
                            c.biX().e("Fabric", stringBuilder.toString(), e);
                            a(bufferedReader, str2);
                            return str3;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
                bufferedReader = null;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error parsing ");
                stringBuilder.append(file);
                c.biX().e("Fabric", stringBuilder.toString(), e);
                a(bufferedReader, str2);
                return str3;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                a(bufferedReader, str2);
                throw th;
            }
            a(bufferedReader, str2);
        }
        return str3;
    }

    public static int bjs() {
        return Architecture.getValue().ordinal();
    }

    public static synchronized long bjt() {
        long j;
        synchronized (CommonUtils.class) {
            if (eMU == -1) {
                j = 0;
                String e = e(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(e)) {
                    e = e.toUpperCase(Locale.US);
                    try {
                        if (e.endsWith("KB")) {
                            j = c(e, "KB", 1024);
                        } else if (e.endsWith("MB")) {
                            j = c(e, "MB", 1048576);
                        } else if (e.endsWith("GB")) {
                            j = c(e, "GB", 1073741824);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unexpected meminfo format while computing RAM: ");
                            stringBuilder.append(e);
                            c.biX().d("Fabric", stringBuilder.toString());
                        }
                    } catch (NumberFormatException e2) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Unexpected meminfo format while computing RAM: ");
                        stringBuilder2.append(e);
                        c.biX().e("Fabric", stringBuilder2.toString(), e2);
                    }
                }
                eMU = j;
            }
            j = eMU;
        }
        return j;
    }

    static long c(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    public static RunningAppProcessInfo f(String str, Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static String i(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static String ll(String str) {
        return aR(str, "SHA-1");
    }

    public static String lm(String str) {
        return aR(str, "SHA-256");
    }

    public static String j(InputStream inputStream) {
        return d(inputStream, "SHA-1");
    }

    private static String aR(String str, String str2) {
        return b(str.getBytes(), str2);
    }

    private static String d(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return V(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception e) {
            c.biX().e("Fabric", "Could not calculate hash for app icon.", e);
            return "";
        }
    }

    private static String b(byte[] bArr, String str) {
        try {
            str = MessageDigest.getInstance(str);
            str.update(bArr);
            return V(str.digest());
        } catch (NoSuchAlgorithmException e) {
            k biX = c.biX();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not create hashing algorithm: ");
            stringBuilder.append(str);
            stringBuilder.append(", returning empty string.");
            biX.e("Fabric", stringBuilder.toString(), e);
            return "";
        }
    }

    public static String g(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder stringBuilder = new StringBuilder();
        for (String append : arrayList) {
            stringBuilder.append(append);
        }
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.length() > 0) {
            return ll(stringBuilder2);
        }
        return null;
    }

    public static long cp(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long ln(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static Float cq(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    public static boolean cr(Context context) {
        boolean z = false;
        if (ct(context)) {
            return false;
        }
        if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        return z;
    }

    public static void K(Context context, String str) {
        if (cs(context)) {
            c.biX().d("Fabric", str);
        }
    }

    public static void a(Context context, String str, Throwable th) {
        if (cs(context)) {
            c.biX().e("Fabric", str);
        }
    }

    public static void a(Context context, int i, String str, String str2) {
        if (cs(context)) {
            c.biX().e(i, "Fabric", str2);
        }
    }

    public static boolean cs(Context context) {
        if (eMS == null) {
            eMS = Boolean.valueOf(a(context, "com.crashlytics.Trace", false));
        }
        return eMS.booleanValue();
    }

    public static boolean a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int f = f(context, str, "bool");
                if (f > 0) {
                    return resources.getBoolean(f);
                }
                int f2 = f(context, str, "string");
                if (f2 > 0) {
                    return Boolean.parseBoolean(context.getString(f2));
                }
            }
        }
        return z;
    }

    public static int f(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, cw(context));
    }

    public static boolean ct(Context context) {
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (!"sdk".equals(Build.PRODUCT)) {
            if (!("google_sdk".equals(Build.PRODUCT) || string == null)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRooted(Context context) {
        boolean ct = ct(context);
        String str = Build.TAGS;
        if ((!ct && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (ct || !file.exists()) {
            return false;
        }
        return true;
    }

    public static boolean bju() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static int cu(Context context) {
        int i = ct(context) ? 1 : 0;
        if (isRooted(context)) {
            i |= 2;
        }
        return bju() ? i | 4 : i;
    }

    public static int d(Context context, boolean z) {
        Float cq = cq(context);
        if (!z || cq == null) {
            return 1;
        }
        if (((double) cq.floatValue()) >= 99.0d) {
            return 3;
        }
        return ((double) cq.floatValue()) < 99.0d ? 2 : 0;
    }

    public static String V(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = eMT;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static boolean cv(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static String L(Context context, String str) {
        int f = f(context, str, "string");
        return f > 0 ? context.getString(f) : "";
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                c.biX().e("Fabric", str, e);
            }
        }
    }

    public static void a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                c.biX().e("Fabric", str, e);
            }
        }
    }

    public static boolean aB(String str) {
        return str == null || str.length() == 0;
    }

    public static String jl(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i)}).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    public static String cw(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i <= 0) {
            return context.getPackageName();
        }
        try {
            context = context.getResources().getResourcePackageName(i);
            return context;
        } catch (NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static String cx(Context context) {
        Exception e;
        StringBuilder stringBuilder;
        Throwable th;
        String str = "Failed to close icon input stream.";
        String str2 = null;
        Closeable openRawResource;
        try {
            openRawResource = context.getResources().openRawResource(cy(context));
            try {
                String j = j(openRawResource);
                if (!aB(j)) {
                    str2 = j;
                }
                a(openRawResource, str);
                return str2;
            } catch (Exception e2) {
                e = e2;
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not calculate hash for app icon:");
                    stringBuilder.append(e.getMessage());
                    c.biX().w("Fabric", stringBuilder.toString());
                    a(openRawResource, str);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    a(openRawResource, str);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            openRawResource = null;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Could not calculate hash for app icon:");
            stringBuilder.append(e.getMessage());
            c.biX().w("Fabric", stringBuilder.toString());
            a(openRawResource, str);
            return null;
        } catch (Throwable th3) {
            th = th3;
            openRawResource = null;
            a(openRawResource, str);
            throw th;
        }
    }

    public static int cy(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static String cz(Context context) {
        String str = "string";
        int f = f(context, "io.fabric.android.build_id", str);
        if (f == 0) {
            f = f(context, "com.crashlytics.android.build_id", str);
        }
        if (f == 0) {
            return null;
        }
        String string = context.getResources().getString(f);
        k biX = c.biX();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Build ID is: ");
        stringBuilder.append(string);
        biX.d("Fabric", stringBuilder.toString());
        return string;
    }

    public static String cA(Context context) {
        int f = f(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (f == 0) {
            return null;
        }
        String string = context.getResources().getString(f);
        k biX = c.biX();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unity Editor version is: ");
        stringBuilder.append(string);
        biX.d("Fabric", stringBuilder.toString());
        return string;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean M(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean cB(Context context) {
        if (!M(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }
}
