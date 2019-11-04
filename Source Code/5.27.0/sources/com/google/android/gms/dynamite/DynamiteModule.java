package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@KeepForSdk
public final class DynamiteModule {
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzd();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zze();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzf();
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzc();
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzb();
    private static Boolean zzif = null;
    private static zzi zzig = null;
    private static zzk zzih = null;
    private static String zzii = null;
    private static int zzij = -1;
    private static final ThreadLocal<zza> zzik = new ThreadLocal();
    private static final zza zzil = new zza();
    private static final VersionPolicy zzim = new zzg();
    private final Context zzin;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        private LoadingException(String str) {
            super(str);
        }

        private LoadingException(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zza zza) {
            this(str, th);
        }
    }

    public interface VersionPolicy {

        public interface zza {
            int getLocalVersion(Context context, String str);

            int zza(Context context, String str, boolean z);
        }

        public static class zzb {
            public int zzir = 0;
            public int zzis = 0;
            public int zzit = 0;
        }

        zzb zza(Context context, String str, zza zza);
    }

    private static class zza {
        public Cursor zzio;

        private zza() {
        }

        /* synthetic */ zza(zza zza) {
            this();
        }
    }

    private static class zzb implements zza {
        private final int zzip;
        private final int zziq = 0;

        public zzb(int i, int i2) {
            this.zzip = i;
        }

        public final int zza(Context context, String str, boolean z) {
            return 0;
        }

        public final int getLocalVersion(Context context, String str) {
            return this.zzip;
        }
    }

    @KeepForSdk
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) {
        String str2 = ":";
        String str3 = "DynamiteModule";
        zza zza = (zza) zzik.get();
        zza zza2 = new zza();
        zzik.set(zza2);
        zzb zza3;
        DynamiteModule zze;
        try {
            zza3 = versionPolicy.zza(context, str, zzil);
            int i = zza3.zzir;
            int i2 = zza3.zzis;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 68) + String.valueOf(str).length());
            stringBuilder.append("Considering local module ");
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append(i);
            stringBuilder.append(" and remote module ");
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append(i2);
            Log.i(str3, stringBuilder.toString());
            int i3;
            if (zza3.zzit == 0 || ((zza3.zzit == -1 && zza3.zzir == 0) || (zza3.zzit == 1 && zza3.zzis == 0))) {
                i3 = zza3.zzir;
                int i4 = zza3.zzis;
                StringBuilder stringBuilder2 = new StringBuilder(91);
                stringBuilder2.append("No acceptable module found. Local version is ");
                stringBuilder2.append(i3);
                stringBuilder2.append(" and remote version is ");
                stringBuilder2.append(i4);
                stringBuilder2.append(".");
                throw new LoadingException(stringBuilder2.toString(), null);
            } else if (zza3.zzit == -1) {
                zze = zze(context, str);
                return zze;
            } else if (zza3.zzit == 1) {
                zze = zza(context, str, zza3.zzis);
                return zze;
            } else {
                i3 = zza3.zzit;
                StringBuilder stringBuilder3 = new StringBuilder(47);
                stringBuilder3.append("VersionPolicy returned invalid code:");
                stringBuilder3.append(i3);
                throw new LoadingException(stringBuilder3.toString(), null);
            }
        } catch (LoadingException e) {
            String str4 = "Failed to load remote module: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            if (zza3.zzir == 0 || versionPolicy.zza(context, str, new zzb(zza3.zzir, 0)).zzit != -1) {
                throw new LoadingException("Remote load failed. No local fallback found.", e, null);
            }
            zze = zze(context, str);
            return zze;
        } finally {
            if (zza2.zzio != null) {
                zza2.zzio.close();
            }
            zzik.set(zza);
        }
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
        String str2 = "DynamiteModule";
        String valueOf;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 61);
            stringBuilder.append("com.google.android.gms.dynamite.descriptors.");
            stringBuilder.append(str);
            stringBuilder.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(stringBuilder.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            valueOf = String.valueOf(declaredField.get(null));
            stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(str).length());
            stringBuilder.append("Module descriptor id '");
            stringBuilder.append(valueOf);
            stringBuilder.append("' didn't match expected id '");
            stringBuilder.append(str);
            stringBuilder.append("'");
            Log.e(str2, stringBuilder.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 45);
            stringBuilder2.append("Local module descriptor class for ");
            stringBuilder2.append(str);
            stringBuilder2.append(" not found.");
            Log.w(str2, stringBuilder2.toString());
            return 0;
        } catch (Exception e) {
            str = "Failed to load module descriptor class: ";
            valueOf = String.valueOf(e.getMessage());
            Log.e(str2, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e8 A:{Catch:{ LoadingException -> 0x00c6, Throwable -> 0x00f0 }} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c1 A:{SYNTHETIC, Splitter:B:56:0x00c1} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x007e */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c1 A:{SYNTHETIC, Splitter:B:56:0x00c1} */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e8 A:{Catch:{ LoadingException -> 0x00c6, Throwable -> 0x00f0 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0035 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:40|41|42|43|51|52|53|54|(0)(0)) */
    /* JADX WARNING: Missing block: B:41:?, code skipped:
            r2.set(null, java.lang.ClassLoader.getSystemClassLoader());
            r2 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Missing block: B:43:0x0088, code skipped:
            r1 = r2;
     */
    public static int zza(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
        r0 = com.google.android.gms.dynamite.DynamiteModule.class;
        monitor-enter(r0);	 Catch:{ Throwable -> 0x00f0 }
        r1 = zzif;	 Catch:{ all -> 0x00ed }
        if (r1 != 0) goto L_0x00ba;
    L_0x0007:
        r1 = r8.getApplicationContext();	 Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        r1 = r1.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class;
        r2 = r2.getName();	 Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        r1 = r1.loadClass(r2);	 Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        r2 = "sClassLoader";
        r2 = r1.getDeclaredField(r2);	 Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        monitor-enter(r1);	 Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        r3 = 0;
        r4 = r2.get(r3);	 Catch:{ all -> 0x008a }
        r4 = (java.lang.ClassLoader) r4;	 Catch:{ all -> 0x008a }
        if (r4 == 0) goto L_0x0038;
    L_0x0029:
        r2 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ all -> 0x008a }
        if (r4 != r2) goto L_0x0032;
    L_0x002f:
        r2 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x008a }
        goto L_0x0087;
    L_0x0032:
        zza(r4);	 Catch:{ LoadingException -> 0x0035 }
    L_0x0035:
        r2 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x008a }
        goto L_0x0087;
    L_0x0038:
        r4 = "com.google.android.gms";
        r5 = r8.getApplicationContext();	 Catch:{ all -> 0x008a }
        r5 = r5.getPackageName();	 Catch:{ all -> 0x008a }
        r4 = r4.equals(r5);	 Catch:{ all -> 0x008a }
        if (r4 == 0) goto L_0x0052;
    L_0x0048:
        r4 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ all -> 0x008a }
        r2.set(r3, r4);	 Catch:{ all -> 0x008a }
        r2 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x008a }
        goto L_0x0087;
    L_0x0052:
        r4 = zzc(r8, r9, r10);	 Catch:{ LoadingException -> 0x007e }
        r5 = zzii;	 Catch:{ LoadingException -> 0x007e }
        if (r5 == 0) goto L_0x007b;
    L_0x005a:
        r5 = zzii;	 Catch:{ LoadingException -> 0x007e }
        r5 = r5.isEmpty();	 Catch:{ LoadingException -> 0x007e }
        if (r5 == 0) goto L_0x0063;
    L_0x0062:
        goto L_0x007b;
    L_0x0063:
        r5 = new com.google.android.gms.dynamite.zzh;	 Catch:{ LoadingException -> 0x007e }
        r6 = zzii;	 Catch:{ LoadingException -> 0x007e }
        r7 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ LoadingException -> 0x007e }
        r5.<init>(r6, r7);	 Catch:{ LoadingException -> 0x007e }
        zza(r5);	 Catch:{ LoadingException -> 0x007e }
        r2.set(r3, r5);	 Catch:{ LoadingException -> 0x007e }
        r5 = java.lang.Boolean.TRUE;	 Catch:{ LoadingException -> 0x007e }
        zzif = r5;	 Catch:{ LoadingException -> 0x007e }
        monitor-exit(r1);	 Catch:{ all -> 0x008a }
        monitor-exit(r0);	 Catch:{ all -> 0x00ed }
        return r4;
    L_0x007b:
        monitor-exit(r1);	 Catch:{ all -> 0x008a }
        monitor-exit(r0);	 Catch:{ all -> 0x00ed }
        return r4;
    L_0x007e:
        r4 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ all -> 0x008a }
        r2.set(r3, r4);	 Catch:{ all -> 0x008a }
        r2 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x008a }
    L_0x0087:
        monitor-exit(r1);	 Catch:{ all -> 0x008a }
        r1 = r2;
        goto L_0x00b8;
    L_0x008a:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x008a }
        throw r2;	 Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
    L_0x008d:
        r1 = move-exception;
        goto L_0x0092;
    L_0x008f:
        r1 = move-exception;
        goto L_0x0092;
    L_0x0091:
        r1 = move-exception;
    L_0x0092:
        r2 = "DynamiteModule";
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00ed }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00ed }
        r3 = r3.length();	 Catch:{ all -> 0x00ed }
        r3 = r3 + 30;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ed }
        r4.<init>(r3);	 Catch:{ all -> 0x00ed }
        r3 = "Failed to load module via V2: ";
        r4.append(r3);	 Catch:{ all -> 0x00ed }
        r4.append(r1);	 Catch:{ all -> 0x00ed }
        r1 = r4.toString();	 Catch:{ all -> 0x00ed }
        android.util.Log.w(r2, r1);	 Catch:{ all -> 0x00ed }
        r1 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x00ed }
    L_0x00b8:
        zzif = r1;	 Catch:{ all -> 0x00ed }
    L_0x00ba:
        monitor-exit(r0);	 Catch:{ all -> 0x00ed }
        r0 = r1.booleanValue();	 Catch:{ Throwable -> 0x00f0 }
        if (r0 == 0) goto L_0x00e8;
    L_0x00c1:
        r8 = zzc(r8, r9, r10);	 Catch:{ LoadingException -> 0x00c6 }
        return r8;
    L_0x00c6:
        r9 = move-exception;
        r10 = "DynamiteModule";
        r0 = "Failed to retrieve remote module version: ";
        r9 = r9.getMessage();	 Catch:{ Throwable -> 0x00f0 }
        r9 = java.lang.String.valueOf(r9);	 Catch:{ Throwable -> 0x00f0 }
        r1 = r9.length();	 Catch:{ Throwable -> 0x00f0 }
        if (r1 == 0) goto L_0x00de;
    L_0x00d9:
        r9 = r0.concat(r9);	 Catch:{ Throwable -> 0x00f0 }
        goto L_0x00e3;
    L_0x00de:
        r9 = new java.lang.String;	 Catch:{ Throwable -> 0x00f0 }
        r9.<init>(r0);	 Catch:{ Throwable -> 0x00f0 }
    L_0x00e3:
        android.util.Log.w(r10, r9);	 Catch:{ Throwable -> 0x00f0 }
        r8 = 0;
        return r8;
    L_0x00e8:
        r8 = zzb(r8, r9, r10);	 Catch:{ Throwable -> 0x00f0 }
        return r8;
    L_0x00ed:
        r9 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00ed }
        throw r9;	 Catch:{ Throwable -> 0x00f0 }
    L_0x00f0:
        r9 = move-exception;
        com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r8, r9);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    private static int zzb(Context context, String str, boolean z) {
        String str2 = "DynamiteModule";
        zzi zzj = zzj(context);
        if (zzj == null) {
            return 0;
        }
        try {
            if (zzj.zzak() >= 2) {
                return zzj.zzb(ObjectWrapper.wrap(context), str, z);
            }
            Log.w(str2, "IDynamite loader version < 2, falling back to getModuleVersion2");
            return zzj.zza(ObjectWrapper.wrap(context), str, z);
        } catch (RemoteException e) {
            str = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b0  */
    private static int zzc(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
        r0 = 0;
        r1 = r8.getContentResolver();	 Catch:{ Exception -> 0x009d, all -> 0x009b }
        if (r10 == 0) goto L_0x000a;
    L_0x0007:
        r8 = "api_force_staging";
        goto L_0x000c;
    L_0x000a:
        r8 = "api";
    L_0x000c:
        r10 = r8.length();	 Catch:{ Exception -> 0x009d, all -> 0x009b }
        r10 = r10 + 42;
        r2 = java.lang.String.valueOf(r9);	 Catch:{ Exception -> 0x009d, all -> 0x009b }
        r2 = r2.length();	 Catch:{ Exception -> 0x009d, all -> 0x009b }
        r10 = r10 + r2;
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x009d, all -> 0x009b }
        r2.<init>(r10);	 Catch:{ Exception -> 0x009d, all -> 0x009b }
        r10 = "content://com.google.android.gms.chimera/";
        r2.append(r10);	 Catch:{ Exception -> 0x009d, all -> 0x009b }
        r2.append(r8);	 Catch:{ Exception -> 0x009d, all -> 0x009b }
        r8 = "/";
        r2.append(r8);	 Catch:{ Exception -> 0x009d, all -> 0x009b }
        r2.append(r9);	 Catch:{ Exception -> 0x009d, all -> 0x009b }
        r8 = r2.toString();	 Catch:{ Exception -> 0x009d, all -> 0x009b }
        r2 = android.net.Uri.parse(r8);	 Catch:{ Exception -> 0x009d, all -> 0x009b }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r8 = r1.query(r2, r3, r4, r5, r6);	 Catch:{ Exception -> 0x009d, all -> 0x009b }
        if (r8 == 0) goto L_0x0083;
    L_0x0042:
        r9 = r8.moveToFirst();	 Catch:{ Exception -> 0x0096, all -> 0x0092 }
        if (r9 == 0) goto L_0x0083;
    L_0x0048:
        r9 = 0;
        r9 = r8.getInt(r9);	 Catch:{ Exception -> 0x0096, all -> 0x0092 }
        if (r9 <= 0) goto L_0x007d;
    L_0x004f:
        r10 = com.google.android.gms.dynamite.DynamiteModule.class;
        monitor-enter(r10);	 Catch:{ Exception -> 0x0096, all -> 0x0092 }
        r1 = 2;
        r1 = r8.getString(r1);	 Catch:{ all -> 0x007a }
        zzii = r1;	 Catch:{ all -> 0x007a }
        r1 = "loaderVersion";
        r1 = r8.getColumnIndex(r1);	 Catch:{ all -> 0x007a }
        if (r1 < 0) goto L_0x0067;
    L_0x0061:
        r1 = r8.getInt(r1);	 Catch:{ all -> 0x007a }
        zzij = r1;	 Catch:{ all -> 0x007a }
    L_0x0067:
        monitor-exit(r10);	 Catch:{ all -> 0x007a }
        r10 = zzik;	 Catch:{ Exception -> 0x0096, all -> 0x0092 }
        r10 = r10.get();	 Catch:{ Exception -> 0x0096, all -> 0x0092 }
        r10 = (com.google.android.gms.dynamite.DynamiteModule.zza) r10;	 Catch:{ Exception -> 0x0096, all -> 0x0092 }
        if (r10 == 0) goto L_0x007d;
    L_0x0072:
        r1 = r10.zzio;	 Catch:{ Exception -> 0x0096, all -> 0x0092 }
        if (r1 != 0) goto L_0x007d;
    L_0x0076:
        r10.zzio = r8;	 Catch:{ Exception -> 0x0096, all -> 0x0092 }
        r8 = r0;
        goto L_0x007d;
    L_0x007a:
        r9 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x007a }
        throw r9;	 Catch:{ Exception -> 0x0096, all -> 0x0092 }
    L_0x007d:
        if (r8 == 0) goto L_0x0082;
    L_0x007f:
        r8.close();
    L_0x0082:
        return r9;
    L_0x0083:
        r9 = "DynamiteModule";
        r10 = "Failed to retrieve remote module version.";
        android.util.Log.w(r9, r10);	 Catch:{ Exception -> 0x0096, all -> 0x0092 }
        r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException;	 Catch:{ Exception -> 0x0096, all -> 0x0092 }
        r10 = "Failed to connect to dynamite module ContentResolver.";
        r9.<init>(r10, r0);	 Catch:{ Exception -> 0x0096, all -> 0x0092 }
        throw r9;	 Catch:{ Exception -> 0x0096, all -> 0x0092 }
    L_0x0092:
        r9 = move-exception;
        r0 = r8;
        r8 = r9;
        goto L_0x00ae;
    L_0x0096:
        r9 = move-exception;
        r7 = r9;
        r9 = r8;
        r8 = r7;
        goto L_0x009f;
    L_0x009b:
        r8 = move-exception;
        goto L_0x00ae;
    L_0x009d:
        r8 = move-exception;
        r9 = r0;
    L_0x009f:
        r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException;	 Catch:{ all -> 0x00ac }
        if (r10 == 0) goto L_0x00a4;
    L_0x00a3:
        throw r8;	 Catch:{ all -> 0x00ac }
    L_0x00a4:
        r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException;	 Catch:{ all -> 0x00ac }
        r1 = "V2 version check failed";
        r10.<init>(r1, r8, r0);	 Catch:{ all -> 0x00ac }
        throw r10;	 Catch:{ all -> 0x00ac }
    L_0x00ac:
        r8 = move-exception;
        r0 = r9;
    L_0x00ae:
        if (r0 == 0) goto L_0x00b3;
    L_0x00b0:
        r0.close();
    L_0x00b3:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzc(android.content.Context, java.lang.String, boolean):int");
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    private static DynamiteModule zze(Context context, String str) {
        str = String.valueOf(str);
        String str2 = "Selected local version of ";
        Log.i("DynamiteModule", str.length() != 0 ? str2.concat(str) : new String(str2));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule zza(Context context, String str, int i) {
        LoadingException e;
        try {
            Boolean bool;
            synchronized (DynamiteModule.class) {
                bool = zzif;
            }
            if (bool == null) {
                throw new LoadingException("Failed to determine which loading route to use.", null);
            } else if (bool.booleanValue()) {
                return zzb(context, str, i);
            } else {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 51);
                stringBuilder.append("Selected remote version of ");
                stringBuilder.append(str);
                stringBuilder.append(", version >= ");
                stringBuilder.append(i);
                Log.i("DynamiteModule", stringBuilder.toString());
                zzi zzj = zzj(context);
                if (zzj != null) {
                    IObjectWrapper zzb;
                    if (zzj.zzak() >= 2) {
                        zzb = zzj.zzb(ObjectWrapper.wrap(context), str, i);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        zzb = zzj.zza(ObjectWrapper.wrap(context), str, i);
                    }
                    if (ObjectWrapper.unwrap(zzb) != null) {
                        return new DynamiteModule((Context) ObjectWrapper.unwrap(zzb));
                    }
                    throw new LoadingException("Failed to load remote module.", null);
                }
                throw new LoadingException("Failed to create IDynamiteLoader.", null);
            }
        } catch (RemoteException e2) {
            throw new LoadingException("Failed to load remote module.", e2, null);
        } catch (LoadingException e3) {
            throw e3;
        } catch (Throwable th) {
            CrashUtils.addDynamiteErrorToDropBox(context, th);
            e3 = new LoadingException("Failed to load remote module.", th, null);
        }
    }

    private static zzi zzj(Context context) {
        synchronized (DynamiteModule.class) {
            zzi zzi;
            if (zzig != null) {
                zzi = zzig;
                return zzi;
            } else if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        zzi = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        if (queryLocalInterface instanceof zzi) {
                            zzi = (zzi) queryLocalInterface;
                        } else {
                            zzi = new zzj(iBinder);
                        }
                    }
                    if (zzi != null) {
                        zzig = zzi;
                        return zzi;
                    }
                } catch (Exception e) {
                    String str = "DynamiteModule";
                    String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
        return null;
    }

    @KeepForSdk
    public final Context getModuleContext() {
        return this.zzin;
    }

    private static DynamiteModule zzb(Context context, String str, int i) {
        zzk zzk;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 51);
        stringBuilder.append("Selected remote version of ");
        stringBuilder.append(str);
        stringBuilder.append(", version >= ");
        stringBuilder.append(i);
        Log.i("DynamiteModule", stringBuilder.toString());
        synchronized (DynamiteModule.class) {
            zzk = zzih;
        }
        if (zzk != null) {
            zza zza = (zza) zzik.get();
            if (zza == null || zza.zzio == null) {
                throw new LoadingException("No result cursor", null);
            }
            IObjectWrapper zzb;
            context = context.getApplicationContext();
            Cursor cursor = zza.zzio;
            ObjectWrapper.wrap(null);
            if (zzaj().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                zzb = zzk.zzb(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                zzb = zzk.zza(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(cursor));
            }
            context = (Context) ObjectWrapper.unwrap(zzb);
            if (context != null) {
                return new DynamiteModule(context);
            }
            throw new LoadingException("Failed to get module context", null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
    }

    private static Boolean zzaj() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(zzij >= 2);
        }
        return valueOf;
    }

    private static void zza(ClassLoader classLoader) {
        try {
            zzk zzk;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzk = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzk) {
                    zzk = (zzk) queryLocalInterface;
                } else {
                    zzk = new zzl(iBinder);
                }
            }
            zzih = zzk;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    @KeepForSdk
    public final IBinder instantiate(String str) {
        try {
            return (IBinder) this.zzin.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String str2 = "Failed to instantiate module class: ";
            str = String.valueOf(str);
            throw new LoadingException(str.length() != 0 ? str2.concat(str) : new String(str2), e, null);
        }
    }

    private DynamiteModule(Context context) {
        this.zzin = (Context) Preconditions.checkNotNull(context);
    }
}
