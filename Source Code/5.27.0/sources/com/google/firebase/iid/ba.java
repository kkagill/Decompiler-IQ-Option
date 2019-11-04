package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

final class ba {
    ba() {
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final az y(Context context, String str) {
        az A = A(context, str);
        if (A != null) {
            return A;
        }
        return z(context, str);
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final az z(Context context, String str) {
        az azVar = new az(c.wz(), System.currentTimeMillis());
        az a = a(context, str, azVar, true);
        String str2 = "FirebaseInstanceId";
        if (a == null || a.equals(azVar)) {
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Generated new key");
            }
            a(context, str, azVar);
            return azVar;
        }
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, "Loaded key after generating new one, using loaded one");
        }
        return a;
    }

    static void zza(Context context) {
        for (File file : aF(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    @Nullable
    private final az A(Context context, String str) {
        zzaa e;
        try {
            az B = B(context, str);
            if (B != null) {
                a(context, str, B);
                return B;
            }
            e = null;
            try {
                az a = a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    a(context, str, a, false);
                    return a;
                }
            } catch (zzaa e2) {
                e = e2;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (zzaa e3) {
            e = e3;
        }
    }

    private static KeyPair Q(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                str2 = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 19);
                stringBuilder.append("Invalid key stored ");
                stringBuilder.append(str2);
                Log.w("FirebaseInstanceId", stringBuilder.toString());
                throw new zzaa(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new zzaa(e2);
        }
    }

    @Nullable
    private final az B(Context context, String str) {
        StringBuilder stringBuilder;
        File C = C(context, str);
        if (!C.exists()) {
            return null;
        }
        try {
            C = p(C);
            return C;
        } catch (zzaa | IOException e) {
            String str2 = "FirebaseInstanceId";
            if (Log.isLoggable(str2, 3)) {
                str = String.valueOf(e);
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 40);
                stringBuilder.append("Failed to read key from file, retrying: ");
                stringBuilder.append(str);
                Log.d(str2, stringBuilder.toString());
            }
            try {
                return p(C);
            } catch (IOException e2) {
                str = String.valueOf(e2);
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 45);
                stringBuilder.append("IID file exists, but failed to read from it: ");
                stringBuilder.append(str);
                Log.w(str2, stringBuilder.toString());
                throw new zzaa(e2);
            }
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0060=Splitter:B:19:0x0060, B:52:0x00ba=Splitter:B:52:0x00ba, B:31:0x009e=Splitter:B:31:0x009e} */
    @androidx.annotation.Nullable
    private final com.google.firebase.iid.az a(android.content.Context r10, java.lang.String r11, com.google.firebase.iid.az r12, boolean r13) {
        /*
        r9 = this;
        r0 = 3;
        r1 = "FirebaseInstanceId";
        r2 = android.util.Log.isLoggable(r1, r0);
        if (r2 == 0) goto L_0x000e;
    L_0x0009:
        r2 = "Writing key to properties file";
        android.util.Log.d(r1, r2);
    L_0x000e:
        r2 = new java.util.Properties;
        r2.<init>();
        r3 = r12.zzv();
        r4 = "pub";
        r2.setProperty(r4, r3);
        r3 = r12.wR();
        r4 = "pri";
        r2.setProperty(r4, r3);
        r3 = r12.aen;
        r3 = java.lang.String.valueOf(r3);
        r4 = "cre";
        r2.setProperty(r4, r3);
        r10 = C(r10, r11);
        r11 = 0;
        r10.createNewFile();	 Catch:{ IOException -> 0x00be }
        r3 = new java.io.RandomAccessFile;	 Catch:{ IOException -> 0x00be }
        r4 = "rw";
        r3.<init>(r10, r4);	 Catch:{ IOException -> 0x00be }
        r10 = r3.getChannel();	 Catch:{ Throwable -> 0x00b4, all -> 0x00b1 }
        r10.lock();	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
        r4 = 0;
        if (r13 == 0) goto L_0x008f;
    L_0x004c:
        r6 = r10.size();	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
        r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r13 <= 0) goto L_0x008f;
    L_0x0054:
        r10.position(r4);	 Catch:{ IOException -> 0x0066, zzaa | IOException -> 0x0064 }
        r12 = a(r10);	 Catch:{ IOException -> 0x0066, zzaa | IOException -> 0x0064 }
        if (r10 == 0) goto L_0x0060;
    L_0x005d:
        a(r11, r10);	 Catch:{ Throwable -> 0x00b4, all -> 0x00b1 }
    L_0x0060:
        a(r11, r3);	 Catch:{ IOException -> 0x00be }
        return r12;
    L_0x0064:
        r13 = move-exception;
        goto L_0x0067;
    L_0x0066:
        r13 = move-exception;
    L_0x0067:
        r0 = android.util.Log.isLoggable(r1, r0);	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
        if (r0 == 0) goto L_0x008f;
    L_0x006d:
        r13 = java.lang.String.valueOf(r13);	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
        r0 = java.lang.String.valueOf(r13);	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
        r0 = r0.length();	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
        r0 = r0 + 64;
        r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
        r6.<init>(r0);	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
        r0 = "Tried reading key pair before writing new one, but failed with: ";
        r6.append(r0);	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
        r6.append(r13);	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
        r13 = r6.toString();	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
        android.util.Log.d(r1, r13);	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
    L_0x008f:
        r10.position(r4);	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
        r13 = java.nio.channels.Channels.newOutputStream(r10);	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
        r2.store(r13, r11);	 Catch:{ Throwable -> 0x00a5, all -> 0x00a2 }
        if (r10 == 0) goto L_0x009e;
    L_0x009b:
        a(r11, r10);	 Catch:{ Throwable -> 0x00b4, all -> 0x00b1 }
    L_0x009e:
        a(r11, r3);	 Catch:{ IOException -> 0x00be }
        return r12;
    L_0x00a2:
        r12 = move-exception;
        r13 = r11;
        goto L_0x00ab;
    L_0x00a5:
        r12 = move-exception;
        throw r12;	 Catch:{ all -> 0x00a7 }
    L_0x00a7:
        r13 = move-exception;
        r8 = r13;
        r13 = r12;
        r12 = r8;
    L_0x00ab:
        if (r10 == 0) goto L_0x00b0;
    L_0x00ad:
        a(r13, r10);	 Catch:{ Throwable -> 0x00b4, all -> 0x00b1 }
    L_0x00b0:
        throw r12;	 Catch:{ Throwable -> 0x00b4, all -> 0x00b1 }
    L_0x00b1:
        r10 = move-exception;
        r12 = r11;
        goto L_0x00ba;
    L_0x00b4:
        r10 = move-exception;
        throw r10;	 Catch:{ all -> 0x00b6 }
    L_0x00b6:
        r12 = move-exception;
        r8 = r12;
        r12 = r10;
        r10 = r8;
    L_0x00ba:
        a(r12, r3);	 Catch:{ IOException -> 0x00be }
        throw r10;	 Catch:{ IOException -> 0x00be }
    L_0x00be:
        r10 = move-exception;
        r10 = java.lang.String.valueOf(r10);
        r12 = java.lang.String.valueOf(r10);
        r12 = r12.length();
        r12 = r12 + 21;
        r13 = new java.lang.StringBuilder;
        r13.<init>(r12);
        r12 = "Failed to write key: ";
        r13.append(r12);
        r13.append(r10);
        r10 = r13.toString();
        android.util.Log.w(r1, r10);
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.ba.a(android.content.Context, java.lang.String, com.google.firebase.iid.az, boolean):com.google.firebase.iid.az");
    }

    private static File aF(Context context) {
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(context);
        if (noBackupFilesDir != null && noBackupFilesDir.isDirectory()) {
            return noBackupFilesDir;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    private static File C(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "com.google.InstanceId.properties";
        } else {
            try {
                str = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 33);
                stringBuilder.append("com.google.InstanceId_");
                stringBuilder.append(str);
                stringBuilder.append(".properties");
                str = stringBuilder.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(aF(context), str);
    }

    /* JADX WARNING: Missing block: B:26:0x0036, code skipped:
            a(r10, r0);
     */
    private final com.google.firebase.iid.az p(java.io.File r10) {
        /*
        r9 = this;
        r0 = new java.io.FileInputStream;
        r0.<init>(r10);
        r10 = 0;
        r7 = r0.getChannel();	 Catch:{ Throwable -> 0x0034 }
        r2 = 0;
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r6 = 1;
        r1 = r7;
        r1.lock(r2, r4, r6);	 Catch:{ Throwable -> 0x0026, all -> 0x0023 }
        r1 = a(r7);	 Catch:{ Throwable -> 0x0026, all -> 0x0023 }
        if (r7 == 0) goto L_0x001f;
    L_0x001c:
        a(r10, r7);	 Catch:{ Throwable -> 0x0034 }
    L_0x001f:
        a(r10, r0);
        return r1;
    L_0x0023:
        r1 = move-exception;
        r2 = r10;
        goto L_0x002c;
    L_0x0026:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0028 }
    L_0x0028:
        r2 = move-exception;
        r8 = r2;
        r2 = r1;
        r1 = r8;
    L_0x002c:
        if (r7 == 0) goto L_0x0031;
    L_0x002e:
        a(r2, r7);	 Catch:{ Throwable -> 0x0034 }
    L_0x0031:
        throw r1;	 Catch:{ Throwable -> 0x0034 }
    L_0x0032:
        r1 = move-exception;
        goto L_0x0036;
    L_0x0034:
        r10 = move-exception;
        throw r10;	 Catch:{ all -> 0x0032 }
    L_0x0036:
        a(r10, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.ba.p(java.io.File):com.google.firebase.iid.az");
    }

    private static az a(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new zzaa("Invalid properties file");
        }
        try {
            return new az(Q(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new zzaa(e);
        }
    }

    @Nullable
    private static az a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(w.zzd(str, "|P|"), null);
        String string2 = sharedPreferences.getString(w.zzd(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new az(Q(string, string2), b(sharedPreferences, str));
    }

    private final void a(Context context, String str, az azVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (azVar.equals(a(sharedPreferences, str))) {
                return;
            }
        } catch (zzaa unused) {
        }
        String str2 = "FirebaseInstanceId";
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, "Writing key to shared preferences");
        }
        Editor edit = sharedPreferences.edit();
        edit.putString(w.zzd(str, "|P|"), azVar.zzv());
        edit.putString(w.zzd(str, "|K|"), azVar.wR());
        edit.putString(w.zzd(str, "cre"), String.valueOf(azVar.aen));
        edit.commit();
    }

    private static long b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(w.zzd(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }
}
