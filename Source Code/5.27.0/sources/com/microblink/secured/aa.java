package com.microblink.secured;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.microblink.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: line */
public class aa {
    private static int exW = 1;
    private static int exX = -1;
    private static boolean exY;
    public Map<String, u> exV;
    public Context mContext;

    public aa(Context context, boolean z) {
        this.mContext = context;
        if (z) {
            try {
                JSONObject jSONObject = new JSONObject(beo());
                JSONArray names = jSONObject.names();
                this.exV = new HashMap(names.length());
                for (int i = 0; i < names.length(); i++) {
                    String string = names.getString(i);
                    this.exV.put(string, new u(jSONObject.getJSONObject(string), string));
                }
            } catch (JSONException e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to parse /res/raw/device_list.json. Please make sure JSON syntax is correct!", e);
            }
        }
    }

    private String beo() {
        InputStream inputStream = null;
        try {
            inputStream = this.mContext.getAssets().open("microblink/device_list.json");
            StringWriter stringWriter = new StringWriter();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                stringWriter.write(readLine);
            }
            String obj = stringWriter.toString();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return obj;
        } catch (IOException e) {
            throw new RuntimeException("Cannot load asset microblink/device_list.json. Please make sure that this asset exists!", e);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    public final u bep() {
        u ber = ber();
        Map map = this.exV;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ber.exc);
        stringBuilder.append("::");
        stringBuilder.append(ber.exd);
        return (u) map.get(stringBuilder.toString());
    }

    public final boolean beq() {
        u bep = bep();
        if (bep == null) {
            return false;
        }
        return a(bep.exq);
    }

    public final float aj(float f) {
        u bep = bep();
        if (bep != null) {
            float f2 = (float) bep.exj;
            Log.f(this, "Adjusting zoom level from {} to {}", Float.valueOf(f), Float.valueOf(f2 + ((((float) bep.exk) - f2) * f)));
            return f2 + ((((float) bep.exk) - f2) * f);
        }
        Log.f(this, "Keeping zoom level at {}", Float.valueOf(f));
        return f;
    }

    public static u ber() {
        return new u(Build.DEVICE, Build.MODEL);
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String bes() {
        return Build.DEVICE;
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String bet() {
        return VERSION.RELEASE;
    }

    public static int beu() {
        return exW;
    }

    public static int bev() {
        return exX;
    }

    public static boolean bew() {
        return exY;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0019 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0033 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0040 A:{SYNTHETIC, Splitter:B:28:0x0040} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0046 A:{SYNTHETIC, Splitter:B:33:0x0046} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:23|22|25|26|(0)|30) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|(2:14|15)|16) */
    /* JADX WARNING: Missing block: B:13:?, code skipped:
            com.microblink.util.Log.b(com.microblink.secured.aa.class, "Failed to parse CPU frequency: '{}'", r3);
     */
    /* JADX WARNING: Missing block: B:15:?, code skipped:
            r4.close();
     */
    /* JADX WARNING: Missing block: B:16:0x0027, code skipped:
            return -1;
     */
    /* JADX WARNING: Missing block: B:24:0x0031, code skipped:
            r8 = th;
     */
    /* JADX WARNING: Missing block: B:29:?, code skipped:
            r3.close();
     */
    /* JADX WARNING: Missing block: B:34:?, code skipped:
            r3.close();
     */
    private static int ks(java.lang.String r8) {
        /*
        r0 = -1;
        r1 = 0;
        r2 = 1;
        r3 = 0;
        r4 = new java.io.RandomAccessFile;	 Catch:{ IOException -> 0x0033 }
        r5 = "r";
        r4.<init>(r8, r5);	 Catch:{ IOException -> 0x0033 }
        r3 = r4.readLine();	 Catch:{ IOException -> 0x002f, all -> 0x002c }
        if (r3 == 0) goto L_0x0028;
    L_0x0011:
        r8 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x0019 }
        r4.close();	 Catch:{ IOException -> 0x0018 }
    L_0x0018:
        return r8;
    L_0x0019:
        r5 = com.microblink.secured.aa.class;
        r6 = "Failed to parse CPU frequency: '{}'";
        r7 = new java.lang.Object[r2];	 Catch:{ IOException -> 0x002f, all -> 0x002c }
        r7[r1] = r3;	 Catch:{ IOException -> 0x002f, all -> 0x002c }
        com.microblink.util.Log.b(r5, r6, r7);	 Catch:{ IOException -> 0x002f, all -> 0x002c }
        r4.close();	 Catch:{ IOException -> 0x0027 }
    L_0x0027:
        return r0;
    L_0x0028:
        r4.close();	 Catch:{ IOException -> 0x0043 }
        goto L_0x0043;
    L_0x002c:
        r8 = move-exception;
        r3 = r4;
        goto L_0x0044;
    L_0x002f:
        r3 = r4;
        goto L_0x0033;
    L_0x0031:
        r8 = move-exception;
        goto L_0x0044;
    L_0x0033:
        r4 = com.microblink.secured.aa.class;
        r5 = "Failed to open {} for reading";
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0031 }
        r2[r1] = r8;	 Catch:{ all -> 0x0031 }
        com.microblink.util.Log.f(r4, r5, r2);	 Catch:{ all -> 0x0031 }
        if (r3 == 0) goto L_0x0043;
    L_0x0040:
        r3.close();	 Catch:{ IOException -> 0x0043 }
    L_0x0043:
        return r0;
    L_0x0044:
        if (r3 == 0) goto L_0x0049;
    L_0x0046:
        r3.close();	 Catch:{ IOException -> 0x0049 }
    L_0x0049:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microblink.secured.aa.ks(java.lang.String):int");
    }

    private static boolean bex() {
        String str = "/proc/cpuinfo";
        if (new File(str).exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(str)));
                do {
                    str = bufferedReader.readLine();
                    if (str == null) {
                        bufferedReader.close();
                        return false;
                    }
                } while (!str.contains("neon"));
                bufferedReader.close();
                return true;
            } catch (IOException e) {
                Log.a(aa.class, e, "Cannot read /proc/cpuinfo to obtain whether NEON is supported. Will assume it is (and risk crash).", new Object[0]);
                return true;
            }
        }
        Log.b(aa.class, "File /proc/cpuinfo seems to be missing. Cannot determine whether NEON is supported. Will assume it is (and risk crash).", new Object[0]);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0031 A:{Catch:{ Exception -> 0x004d }} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A:{RETURN, Catch:{ Exception -> 0x004d }} */
    public final boolean a(com.microblink.secured.h r5) {
        /*
        r4 = this;
        r0 = 0;
        if (r5 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = new com.microblink.secured.ae;	 Catch:{ Exception -> 0x004d }
        r2 = android.os.Build.VERSION.RELEASE;	 Catch:{ Exception -> 0x004d }
        r1.<init>(r2);	 Catch:{ Exception -> 0x004d }
        r2 = r5.ewc;	 Catch:{ Exception -> 0x004d }
        r3 = 1;
        if (r2 == 0) goto L_0x0011;
    L_0x0010:
        return r3;
    L_0x0011:
        r2 = r5.ewa;	 Catch:{ Exception -> 0x004d }
        if (r2 == 0) goto L_0x002d;
    L_0x0015:
        r2 = r5.ewd;	 Catch:{ Exception -> 0x004d }
        if (r2 == 0) goto L_0x0022;
    L_0x0019:
        r2 = r5.ewa;	 Catch:{ Exception -> 0x004d }
        r2 = r1.b(r2);	 Catch:{ Exception -> 0x004d }
        if (r2 == 0) goto L_0x002b;
    L_0x0021:
        goto L_0x002d;
    L_0x0022:
        r2 = r5.ewa;	 Catch:{ Exception -> 0x004d }
        r2 = r1.a(r2);	 Catch:{ Exception -> 0x004d }
        if (r2 == 0) goto L_0x002b;
    L_0x002a:
        goto L_0x002d;
    L_0x002b:
        r2 = 0;
        goto L_0x002e;
    L_0x002d:
        r2 = 1;
    L_0x002e:
        if (r2 != 0) goto L_0x0031;
    L_0x0030:
        return r0;
    L_0x0031:
        r2 = r5.ewb;	 Catch:{ Exception -> 0x004d }
        if (r2 == 0) goto L_0x004c;
    L_0x0035:
        r2 = r5.ewe;	 Catch:{ Exception -> 0x004d }
        if (r2 == 0) goto L_0x0042;
    L_0x0039:
        r5 = r5.ewb;	 Catch:{ Exception -> 0x004d }
        r5 = r5.b(r1);	 Catch:{ Exception -> 0x004d }
        if (r5 == 0) goto L_0x004b;
    L_0x0041:
        goto L_0x004c;
    L_0x0042:
        r5 = r5.ewb;	 Catch:{ Exception -> 0x004d }
        r5 = r5.a(r1);	 Catch:{ Exception -> 0x004d }
        if (r5 == 0) goto L_0x004b;
    L_0x004a:
        goto L_0x004c;
    L_0x004b:
        return r0;
    L_0x004c:
        return r3;
    L_0x004d:
        r5 = move-exception;
        r1 = new java.lang.Object[r0];
        r2 = "Failed to extract android version number!";
        com.microblink.util.Log.b(r4, r5, r2, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microblink.secured.aa.a(com.microblink.secured.h):boolean");
    }

    static {
        boolean bex;
        if (Build.CPU_ABI.equals("armeabi-v7a")) {
            bex = bex();
        } else {
            bex = true;
        }
        exY = bex;
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FileFilter() {
                public final boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]", file.getName());
                }
            });
            exW = listFiles.length;
            exX = -1;
            for (File absolutePath : listFiles) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(absolutePath.getAbsolutePath());
                stringBuilder.append("/cpufreq/cpuinfo_max_freq");
                Log.a(aa.class, "Examining file {}", stringBuilder.toString());
                int ks = ks(r5);
                if (ks > exX) {
                    exX = ks;
                }
            }
            if (exX != -1) {
                exX = Math.round(((float) exX) / 1000.0f);
            }
            Log.f(aa.class, "Calculated max CPU frequency: {} MHz", Integer.valueOf(exX));
        } catch (Exception unused) {
            exW = Runtime.getRuntime().availableProcessors();
            exX = -1;
        }
    }
}
