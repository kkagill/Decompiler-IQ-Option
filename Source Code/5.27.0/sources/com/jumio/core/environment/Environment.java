package com.jumio.core.environment;

import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;

public class Environment {
    private static boolean ALE_LIB_IS_LOADED = false;
    public static final String ALE_VERSION = "1.5.0";
    public static final String BUILD_VERSION = "JMSDK 2.14.0 (0-69)";
    private static boolean CPU_INFO_LIB_IS_LOADED = false;
    protected static String DATA_DIRECTORY = "/jumio/";
    private static boolean JNI_IMAGE_QUALITY_LIB_IS_LOADED = false;
    private static boolean JNI_INTERFACE_LIB_IS_LOADED = false;
    public static final String OCR_VERSION = "1.124.0";
    public static final String PHOTOPAY_VERSION = "6.4.0";

    public static File getDataDirectory(Context context) {
        File file = new File(context.getFilesDir(), DATA_DIRECTORY);
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }

    protected static void deleteDirectory(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteDirectory(file2);
                        file2.delete();
                    } else {
                        file2.delete();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A:{Catch:{ Exception -> 0x003d }} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041 A:{Catch:{ Exception -> 0x003d }} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A:{Catch:{ Exception -> 0x003d }} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041 A:{Catch:{ Exception -> 0x003d }} */
    protected static java.lang.String readFile(java.io.File r5) {
        /*
        r0 = new java.lang.StringBuffer;
        r1 = "";
        r0.<init>(r1);
        if (r5 == 0) goto L_0x0051;
    L_0x0009:
        r2 = r5.isFile();
        if (r2 != 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0051;
    L_0x0010:
        r1 = 0;
        r2 = new java.io.FileInputStream;	 Catch:{ all -> 0x0035 }
        r2.<init>(r5);	 Catch:{ all -> 0x0035 }
        r5 = new java.io.BufferedReader;	 Catch:{ all -> 0x0033 }
        r3 = new java.io.InputStreamReader;	 Catch:{ all -> 0x0033 }
        r3.<init>(r2);	 Catch:{ all -> 0x0033 }
        r5.<init>(r3);	 Catch:{ all -> 0x0033 }
        r1 = r5.readLine();	 Catch:{ all -> 0x002e }
        r0.append(r1);	 Catch:{ all -> 0x002e }
        r2.close();	 Catch:{ Exception -> 0x003d }
        r5.close();	 Catch:{ Exception -> 0x003d }
        goto L_0x0048;
    L_0x002e:
        r1 = move-exception;
        r4 = r1;
        r1 = r5;
        r5 = r4;
        goto L_0x0037;
    L_0x0033:
        r5 = move-exception;
        goto L_0x0037;
    L_0x0035:
        r5 = move-exception;
        r2 = r1;
    L_0x0037:
        if (r2 == 0) goto L_0x003f;
    L_0x0039:
        r2.close();	 Catch:{ Exception -> 0x003d }
        goto L_0x003f;
    L_0x003d:
        r5 = move-exception;
        goto L_0x0045;
    L_0x003f:
        if (r1 == 0) goto L_0x0044;
    L_0x0041:
        r1.close();	 Catch:{ Exception -> 0x003d }
    L_0x0044:
        throw r5;	 Catch:{ Exception -> 0x003d }
    L_0x0045:
        com.jumio.commons.log.Log.printStackTrace(r5);
    L_0x0048:
        r5 = r0.toString();
        r5 = r5.trim();
        return r5;
    L_0x0051:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.core.environment.Environment.readFile(java.io.File):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b A:{Catch:{ Exception -> 0x0022 }} */
    protected static void writeFile(java.lang.String r2, java.io.File r3) {
        /*
        r0 = 0;
        r1 = new java.io.FileOutputStream;	 Catch:{ all -> 0x0018 }
        r1.<init>(r3);	 Catch:{ all -> 0x0018 }
        r3 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x0018 }
        r3.<init>(r1);	 Catch:{ all -> 0x0018 }
        r3.write(r2);	 Catch:{ all -> 0x0015 }
        r3.flush();	 Catch:{ Exception -> 0x0022 }
        r3.close();	 Catch:{ Exception -> 0x0022 }
        goto L_0x0026;
    L_0x0015:
        r2 = move-exception;
        r0 = r3;
        goto L_0x0019;
    L_0x0018:
        r2 = move-exception;
    L_0x0019:
        if (r0 == 0) goto L_0x0021;
    L_0x001b:
        r0.flush();	 Catch:{ Exception -> 0x0022 }
        r0.close();	 Catch:{ Exception -> 0x0022 }
    L_0x0021:
        throw r2;	 Catch:{ Exception -> 0x0022 }
    L_0x0022:
        r2 = move-exception;
        com.jumio.commons.log.Log.printStackTrace(r2);
    L_0x0026:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.core.environment.Environment.writeFile(java.lang.String, java.io.File):void");
    }

    public static void checkOcrVersion(Context context) {
        File dataDirectory = getDataDirectory(context);
        File file = new File(dataDirectory, "cv");
        String str = "1.124.0";
        if (!str.equals(readFile(file))) {
            deleteDirectory(dataDirectory);
            writeFile(str, file);
        }
    }

    @Deprecated
    public static String extractFile(Context context, String str, String str2, String str3) {
        return extractFile(context, Environment.class, str, str2, str3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093 A:{SYNTHETIC, Splitter:B:41:0x0093} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009f A:{SYNTHETIC, Splitter:B:48:0x009f} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093 A:{SYNTHETIC, Splitter:B:41:0x0093} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009f A:{SYNTHETIC, Splitter:B:48:0x009f} */
    public static java.lang.String extractFile(android.content.Context r2, java.lang.Class<?> r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
        r0 = new java.io.File;
        r2 = getDataDirectory(r2);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r4);
        r1.append(r6);
        r6 = r1.toString();
        r0.<init>(r2, r6);
        r2 = r0.getName();
        r6 = "_";
        r2 = r2.startsWith(r6);
        if (r2 == 0) goto L_0x0037;
    L_0x0024:
        r2 = r0.getName();
        r6 = 1;
        r2 = r2.substring(r6);
        r6 = new java.io.File;
        r0 = r0.getParentFile();
        r6.<init>(r0, r2);
        goto L_0x0038;
    L_0x0037:
        r6 = r0;
    L_0x0038:
        r2 = calculateHash(r6);
        r0 = r6.isFile();
        if (r0 == 0) goto L_0x0048;
    L_0x0042:
        r2 = r5.equals(r2);
        if (r2 != 0) goto L_0x0084;
    L_0x0048:
        r2 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r2 = new byte[r2];
        r5 = r6.isFile();
        if (r5 == 0) goto L_0x0056;
    L_0x0052:
        r6.delete();
        goto L_0x005d;
    L_0x0056:
        r5 = r6.getParentFile();
        r5.mkdirs();
    L_0x005d:
        r5 = 0;
        r3 = r3.getResourceAsStream(r4);	 Catch:{ all -> 0x008e }
        r4 = new java.io.FileOutputStream;	 Catch:{ all -> 0x008b }
        r4.<init>(r6);	 Catch:{ all -> 0x008b }
    L_0x0067:
        r0 = r3.read(r2);	 Catch:{ all -> 0x0089 }
        if (r0 <= 0) goto L_0x0072;
    L_0x006d:
        r1 = 0;
        r4.write(r2, r1, r0);	 Catch:{ all -> 0x0089 }
        goto L_0x0067;
    L_0x0072:
        if (r3 == 0) goto L_0x007c;
    L_0x0074:
        r3.close();	 Catch:{ IOException -> 0x0078 }
        goto L_0x007c;
    L_0x0078:
        r2 = move-exception;
        com.jumio.commons.log.Log.printStackTrace(r2);	 Catch:{ Exception -> 0x0097 }
    L_0x007c:
        r4.close();	 Catch:{ IOException -> 0x0080 }
        goto L_0x0084;
    L_0x0080:
        r2 = move-exception;
        com.jumio.commons.log.Log.printStackTrace(r2);	 Catch:{ Exception -> 0x0097 }
    L_0x0084:
        r2 = r6.getAbsolutePath();
        return r2;
    L_0x0089:
        r2 = move-exception;
        goto L_0x0091;
    L_0x008b:
        r2 = move-exception;
        r4 = r5;
        goto L_0x0091;
    L_0x008e:
        r2 = move-exception;
        r3 = r5;
        r4 = r3;
    L_0x0091:
        if (r3 == 0) goto L_0x009d;
    L_0x0093:
        r3.close();	 Catch:{ IOException -> 0x0099 }
        goto L_0x009d;
    L_0x0097:
        r2 = move-exception;
        goto L_0x00a8;
    L_0x0099:
        r3 = move-exception;
        com.jumio.commons.log.Log.printStackTrace(r3);	 Catch:{ Exception -> 0x0097 }
    L_0x009d:
        if (r4 == 0) goto L_0x00a7;
    L_0x009f:
        r4.close();	 Catch:{ IOException -> 0x00a3 }
        goto L_0x00a7;
    L_0x00a3:
        r3 = move-exception;
        com.jumio.commons.log.Log.printStackTrace(r3);	 Catch:{ Exception -> 0x0097 }
    L_0x00a7:
        throw r2;	 Catch:{ Exception -> 0x0097 }
    L_0x00a8:
        com.jumio.commons.log.Log.printStackTrace(r2);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.core.environment.Environment.extractFile(android.content.Context, java.lang.Class, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static synchronized boolean loadCpuInfoLib() {
        synchronized (Environment.class) {
            if (!CPU_INFO_LIB_IS_LOADED) {
                System.loadLibrary("cpuinfo");
                CPU_INFO_LIB_IS_LOADED = true;
            }
        }
        return true;
    }

    public static synchronized boolean loadAleLib() {
        synchronized (Environment.class) {
            if (!ALE_LIB_IS_LOADED) {
                System.loadLibrary("aleJwtInterface");
                ALE_LIB_IS_LOADED = true;
            }
        }
        return true;
    }

    public static synchronized boolean loadJniInterfaceLib() {
        synchronized (Environment.class) {
            if (!JNI_INTERFACE_LIB_IS_LOADED) {
                System.loadLibrary("jniInterface");
                JNI_INTERFACE_LIB_IS_LOADED = true;
            }
        }
        return true;
    }

    public static synchronized boolean loadJniImageQualityLib() {
        synchronized (Environment.class) {
            if (!JNI_IMAGE_QUALITY_LIB_IS_LOADED) {
                System.loadLibrary("jniImageQualityAcquisition");
                JNI_IMAGE_QUALITY_LIB_IS_LOADED = true;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A:{SYNTHETIC, Splitter:B:27:0x0061} */
    protected static java.lang.String calculateHash(java.io.File r6) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r6.isFile();
        r2 = 0;
        if (r1 != 0) goto L_0x000d;
    L_0x000c:
        return r2;
    L_0x000d:
        r1 = "SHA-256";
        r1 = java.security.MessageDigest.getInstance(r1);	 Catch:{ Exception -> 0x006a }
        r3 = new java.io.BufferedInputStream;	 Catch:{ all -> 0x005e }
        r4 = new java.io.FileInputStream;	 Catch:{ all -> 0x005e }
        r6 = r6.getPath();	 Catch:{ all -> 0x005e }
        r4.<init>(r6);	 Catch:{ all -> 0x005e }
        r3.<init>(r4);	 Catch:{ all -> 0x005e }
        r6 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r6 = new byte[r6];	 Catch:{ all -> 0x005b }
    L_0x0025:
        r2 = r3.read(r6);	 Catch:{ all -> 0x005b }
        r4 = -1;
        r5 = 0;
        if (r2 == r4) goto L_0x0031;
    L_0x002d:
        r1.update(r6, r5, r2);	 Catch:{ all -> 0x005b }
        goto L_0x0025;
    L_0x0031:
        r3.close();	 Catch:{ IOException -> 0x0035 }
        goto L_0x0039;
    L_0x0035:
        r6 = move-exception;
        com.jumio.commons.log.Log.printStackTrace(r6);	 Catch:{ Exception -> 0x006a }
    L_0x0039:
        r6 = r1.digest();	 Catch:{ Exception -> 0x006a }
        r1 = r6.length;	 Catch:{ Exception -> 0x006a }
    L_0x003e:
        if (r5 >= r1) goto L_0x006e;
    L_0x0040:
        r2 = r6[r5];	 Catch:{ Exception -> 0x006a }
        r3 = r2 & 240;
        r3 = r3 >> 4;
        r4 = 16;
        r3 = java.lang.Character.forDigit(r3, r4);	 Catch:{ Exception -> 0x006a }
        r0.append(r3);	 Catch:{ Exception -> 0x006a }
        r2 = r2 & 15;
        r2 = java.lang.Character.forDigit(r2, r4);	 Catch:{ Exception -> 0x006a }
        r0.append(r2);	 Catch:{ Exception -> 0x006a }
        r5 = r5 + 1;
        goto L_0x003e;
    L_0x005b:
        r6 = move-exception;
        r2 = r3;
        goto L_0x005f;
    L_0x005e:
        r6 = move-exception;
    L_0x005f:
        if (r2 == 0) goto L_0x0069;
    L_0x0061:
        r2.close();	 Catch:{ IOException -> 0x0065 }
        goto L_0x0069;
    L_0x0065:
        r1 = move-exception;
        com.jumio.commons.log.Log.printStackTrace(r1);	 Catch:{ Exception -> 0x006a }
    L_0x0069:
        throw r6;	 Catch:{ Exception -> 0x006a }
    L_0x006a:
        r6 = move-exception;
        com.jumio.commons.log.Log.printStackTrace(r6);
    L_0x006e:
        r6 = r0.toString();
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.core.environment.Environment.calculateHash(java.io.File):java.lang.String");
    }

    public static boolean isLollipop() {
        return VERSION.SDK_INT == 21;
    }

    public static boolean isPieOrAbove() {
        return VERSION.SDK_INT >= 28;
    }
}
