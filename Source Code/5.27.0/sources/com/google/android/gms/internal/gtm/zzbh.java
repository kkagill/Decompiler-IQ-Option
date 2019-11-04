package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class zzbh extends zzan {
    private volatile String zzut;
    private Future<String> zzyh;

    protected zzbh(zzap zzap) {
        super(zzap);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
    }

    public final String zzeh() {
        String str;
        zzdb();
        synchronized (this) {
            if (this.zzut == null) {
                this.zzyh = zzcq().zza(new zzbi(this));
            }
            if (this.zzyh != null) {
                try {
                    this.zzut = (String) this.zzyh.get();
                } catch (InterruptedException e) {
                    zzd("ClientId loading or generation was interrupted", e);
                    this.zzut = "0";
                } catch (ExecutionException e2) {
                    zze("Failed to load or generate client id", e2);
                    this.zzut = "0";
                }
                if (this.zzut == null) {
                    this.zzut = "0";
                }
                zza("Loaded clientId", this.zzut);
                this.zzyh = null;
            }
            str = this.zzut;
        }
        return str;
    }

    /* Access modifiers changed, original: final */
    public final String zzei() {
        synchronized (this) {
            this.zzut = null;
            this.zzyh = zzcq().zza(new zzbj(this));
        }
        return zzeh();
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final String zzej() {
        String zzd = zzd(zzcq().getContext());
        return zzd == null ? zzek() : zzd;
    }

    @VisibleForTesting
    private final String zzek() {
        String str = "0";
        String toLowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            return !zzb(zzcq().getContext(), toLowerCase) ? str : toLowerCase;
        } catch (Exception e) {
            zze("Error saving clientId file", e);
            return str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x008e A:{SYNTHETIC, Splitter:B:56:0x008e} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0076 A:{SYNTHETIC, Splitter:B:40:0x0076} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0082 A:{SYNTHETIC, Splitter:B:47:0x0082} */
    private final java.lang.String zzd(android.content.Context r9) {
        /*
        r8 = this;
        r0 = "gaClientId";
        r1 = "Failed to close client id reading stream";
        r2 = "ClientId should be loaded from worker thread";
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r2);
        r2 = 0;
        r3 = r9.openFileInput(r0);	 Catch:{ FileNotFoundException -> 0x008b, IOException -> 0x006a, all -> 0x0067 }
        r4 = 36;
        r5 = new byte[r4];	 Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
        r6 = 0;
        r4 = r3.read(r5, r6, r4);	 Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
        r7 = r3.available();	 Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
        if (r7 <= 0) goto L_0x0033;
    L_0x001d:
        r4 = "clientId file seems corrupted, deleting it.";
        r8.zzt(r4);	 Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
        r3.close();	 Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
        r9.deleteFile(r0);	 Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
        if (r3 == 0) goto L_0x0032;
    L_0x002a:
        r3.close();	 Catch:{ IOException -> 0x002e }
        goto L_0x0032;
    L_0x002e:
        r9 = move-exception;
        r8.zze(r1, r9);
    L_0x0032:
        return r2;
    L_0x0033:
        r7 = 14;
        if (r4 >= r7) goto L_0x004d;
    L_0x0037:
        r4 = "clientId file is empty, deleting it.";
        r8.zzt(r4);	 Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
        r3.close();	 Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
        r9.deleteFile(r0);	 Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
        if (r3 == 0) goto L_0x004c;
    L_0x0044:
        r3.close();	 Catch:{ IOException -> 0x0048 }
        goto L_0x004c;
    L_0x0048:
        r9 = move-exception;
        r8.zze(r1, r9);
    L_0x004c:
        return r2;
    L_0x004d:
        r3.close();	 Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
        r7 = new java.lang.String;	 Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
        r7.<init>(r5, r6, r4);	 Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
        r4 = "Read client id from disk";
        r8.zza(r4, r7);	 Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
        if (r3 == 0) goto L_0x0064;
    L_0x005c:
        r3.close();	 Catch:{ IOException -> 0x0060 }
        goto L_0x0064;
    L_0x0060:
        r9 = move-exception;
        r8.zze(r1, r9);
    L_0x0064:
        return r7;
    L_0x0065:
        r4 = move-exception;
        goto L_0x006c;
    L_0x0067:
        r9 = move-exception;
        r3 = r2;
        goto L_0x0080;
    L_0x006a:
        r4 = move-exception;
        r3 = r2;
    L_0x006c:
        r5 = "Error reading client id file, deleting it";
        r8.zze(r5, r4);	 Catch:{ all -> 0x007f }
        r9.deleteFile(r0);	 Catch:{ all -> 0x007f }
        if (r3 == 0) goto L_0x007e;
    L_0x0076:
        r3.close();	 Catch:{ IOException -> 0x007a }
        goto L_0x007e;
    L_0x007a:
        r9 = move-exception;
        r8.zze(r1, r9);
    L_0x007e:
        return r2;
    L_0x007f:
        r9 = move-exception;
    L_0x0080:
        if (r3 == 0) goto L_0x008a;
    L_0x0082:
        r3.close();	 Catch:{ IOException -> 0x0086 }
        goto L_0x008a;
    L_0x0086:
        r0 = move-exception;
        r8.zze(r1, r0);
    L_0x008a:
        throw r9;
    L_0x008b:
        r3 = r2;
    L_0x008c:
        if (r3 == 0) goto L_0x0096;
    L_0x008e:
        r3.close();	 Catch:{ IOException -> 0x0092 }
        goto L_0x0096;
    L_0x0092:
        r9 = move-exception;
        r8.zze(r1, r9);
    L_0x0096:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbh.zzd(android.content.Context):java.lang.String");
    }

    private final boolean zzb(Context context, String str) {
        String str2 = "Failed to close clientId writing stream";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotMainThread("ClientId should be saved from worker thread");
        FileOutputStream fileOutputStream = null;
        try {
            zza("Storing clientId", str);
            fileOutputStream = context.openFileOutput("gaClientId", 0);
            fileOutputStream.write(str.getBytes());
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    zze(str2, e);
                }
            }
            return true;
        } catch (FileNotFoundException e2) {
            zze("Error creating clientId file", e2);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e3) {
                    zze(str2, e3);
                }
            }
            return false;
        } catch (IOException e32) {
            zze("Error writing to clientId file", e32);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e322) {
                    zze(str2, e322);
                }
            }
            return false;
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e4) {
                    zze(str2, e4);
                }
            }
        }
    }
}
