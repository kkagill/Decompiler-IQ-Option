package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzdf;
import com.google.android.gms.internal.gtm.zzdi;
import com.google.android.gms.internal.gtm.zzi;
import com.google.android.gms.internal.gtm.zzop;
import com.google.android.gms.internal.gtm.zzor;
import com.google.android.gms.internal.gtm.zzov;
import com.google.android.gms.internal.gtm.zzoz;
import com.google.android.gms.internal.gtm.zzuv;
import com.google.android.gms.internal.gtm.zzuw;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;

final class zzex implements zzah {
    private final String zzaec;
    private zzdh<zzop> zzajf;
    private final ExecutorService zzajm = zzdf.zzgp().zzr(zzdi.zzadg);
    private final Context zzrm;

    zzex(Context context, String str) {
        this.zzrm = context;
        this.zzaec = str;
    }

    public final void zza(zzdh<zzop> zzdh) {
        this.zzajf = zzdh;
    }

    public final void zzhk() {
        this.zzajm.execute(new zzey(this));
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0092 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x007e */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:26:0x007e, B:29:0x0092] */
    /* JADX WARNING: Missing block: B:27:?, code skipped:
            r4.zzajf.zzs(com.google.android.gms.tagmanager.zzcz.zzahu);
            com.google.android.gms.tagmanager.zzdi.zzac("Failed to read the resource from disk. The resource is inconsistent");
     */
    /* JADX WARNING: Missing block: B:30:?, code skipped:
            r4.zzajf.zzs(com.google.android.gms.tagmanager.zzcz.zzahu);
            com.google.android.gms.tagmanager.zzdi.zzac("Failed to read the resource from disk");
     */
    /* JADX WARNING: Missing block: B:32:?, code skipped:
            r1.close();
     */
    /* JADX WARNING: Missing block: B:33:0x00a2, code skipped:
            com.google.android.gms.tagmanager.zzdi.zzac(r0);
     */
    /* JADX WARNING: Missing block: B:38:?, code skipped:
            r1.close();
     */
    /* JADX WARNING: Missing block: B:39:0x00af, code skipped:
            com.google.android.gms.tagmanager.zzdi.zzac(r0);
     */
    @com.google.android.gms.common.util.VisibleForTesting
    public final void zzjd() {
        /*
        r4 = this;
        r0 = "Error closing stream for reading resource from disk";
        r1 = r4.zzajf;
        if (r1 == 0) goto L_0x00c0;
    L_0x0006:
        r1.zzhj();
        r1 = "Attempting to load resource from disk";
        com.google.android.gms.tagmanager.zzdi.zzab(r1);
        r1 = com.google.android.gms.tagmanager.zzeh.zziy();
        r1 = r1.zziz();
        r2 = com.google.android.gms.tagmanager.zzeh.zza.CONTAINER;
        if (r1 == r2) goto L_0x0026;
    L_0x001a:
        r1 = com.google.android.gms.tagmanager.zzeh.zziy();
        r1 = r1.zziz();
        r2 = com.google.android.gms.tagmanager.zzeh.zza.CONTAINER_DEBUG;
        if (r1 != r2) goto L_0x003e;
    L_0x0026:
        r1 = r4.zzaec;
        r2 = com.google.android.gms.tagmanager.zzeh.zziy();
        r2 = r2.getContainerId();
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x003e;
    L_0x0036:
        r0 = r4.zzajf;
        r1 = com.google.android.gms.tagmanager.zzcz.zzaht;
        r0.zzs(r1);
        return;
    L_0x003e:
        r1 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x00b3 }
        r2 = r4.zzje();	 Catch:{ FileNotFoundException -> 0x00b3 }
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x00b3 }
        r2 = new java.io.ByteArrayOutputStream;	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
        r2.<init>();	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
        com.google.android.gms.internal.gtm.zzor.zza(r1, r2);	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
        r2 = r2.toByteArray();	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
        r3 = new com.google.android.gms.internal.gtm.zzop;	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
        r3.<init>();	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
        r2 = com.google.android.gms.internal.gtm.zzuw.zza(r3, r2);	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
        r2 = (com.google.android.gms.internal.gtm.zzop) r2;	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
        r3 = r2.zzqk;	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
        if (r3 != 0) goto L_0x006f;
    L_0x0062:
        r3 = r2.zzauy;	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
        if (r3 == 0) goto L_0x0067;
    L_0x0066:
        goto L_0x006f;
    L_0x0067:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
        r3 = "Resource and SupplementedResource are NULL.";
        r2.<init>(r3);	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
        throw r2;	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
    L_0x006f:
        r3 = r4.zzajf;	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
        r3.zze(r2);	 Catch:{ IOException -> 0x0092, IllegalArgumentException -> 0x007e }
        r1.close();	 Catch:{ IOException -> 0x0078 }
        goto L_0x00a5;
    L_0x0078:
        com.google.android.gms.tagmanager.zzdi.zzac(r0);
        goto L_0x00a5;
    L_0x007c:
        r2 = move-exception;
        goto L_0x00ab;
    L_0x007e:
        r2 = r4.zzajf;	 Catch:{ all -> 0x007c }
        r3 = com.google.android.gms.tagmanager.zzcz.zzahu;	 Catch:{ all -> 0x007c }
        r2.zzs(r3);	 Catch:{ all -> 0x007c }
        r2 = "Failed to read the resource from disk. The resource is inconsistent";
        com.google.android.gms.tagmanager.zzdi.zzac(r2);	 Catch:{ all -> 0x007c }
        r1.close();	 Catch:{ IOException -> 0x008e }
        goto L_0x00a5;
    L_0x008e:
        com.google.android.gms.tagmanager.zzdi.zzac(r0);
        goto L_0x00a5;
    L_0x0092:
        r2 = r4.zzajf;	 Catch:{ all -> 0x007c }
        r3 = com.google.android.gms.tagmanager.zzcz.zzahu;	 Catch:{ all -> 0x007c }
        r2.zzs(r3);	 Catch:{ all -> 0x007c }
        r2 = "Failed to read the resource from disk";
        com.google.android.gms.tagmanager.zzdi.zzac(r2);	 Catch:{ all -> 0x007c }
        r1.close();	 Catch:{ IOException -> 0x00a2 }
        goto L_0x00a5;
    L_0x00a2:
        com.google.android.gms.tagmanager.zzdi.zzac(r0);
    L_0x00a5:
        r0 = "The Disk resource was successfully read.";
        com.google.android.gms.tagmanager.zzdi.zzab(r0);
        return;
    L_0x00ab:
        r1.close();	 Catch:{ IOException -> 0x00af }
        goto L_0x00b2;
    L_0x00af:
        com.google.android.gms.tagmanager.zzdi.zzac(r0);
    L_0x00b2:
        throw r2;
    L_0x00b3:
        r0 = "Failed to find the resource in the disk";
        com.google.android.gms.tagmanager.zzdi.zzax(r0);
        r0 = r4.zzajf;
        r1 = com.google.android.gms.tagmanager.zzcz.zzaht;
        r0.zzs(r1);
        return;
    L_0x00c0:
        r0 = new java.lang.IllegalStateException;
        r1 = "Callback must be set before execute";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzex.zzjd():void");
    }

    public final void zza(zzop zzop) {
        this.zzajm.execute(new zzez(this, zzop));
    }

    public final zzov zzt(int i) {
        try {
            InputStream openRawResource = this.zzrm.getResources().openRawResource(i);
            String resourceName = this.zzrm.getResources().getResourceName(i);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(resourceName).length() + 66);
            stringBuilder.append("Attempting to load a container from the resource ID ");
            stringBuilder.append(i);
            String str = " (";
            stringBuilder.append(str);
            stringBuilder.append(resourceName);
            resourceName = ")";
            stringBuilder.append(resourceName);
            zzdi.zzab(stringBuilder.toString());
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzor.zza(openRawResource, byteArrayOutputStream);
                zzov zza = zza(byteArrayOutputStream);
                if (zza == null) {
                    return zzb(byteArrayOutputStream.toByteArray());
                }
                zzdi.zzab("The container was successfully loaded from the resource (using JSON file format)");
                return zza;
            } catch (IOException unused) {
                String resourceName2 = this.zzrm.getResources().getResourceName(i);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(resourceName2).length() + 67);
                stringBuilder2.append("Error reading the default container with resource ID ");
                stringBuilder2.append(i);
                stringBuilder2.append(str);
                stringBuilder2.append(resourceName2);
                stringBuilder2.append(resourceName);
                zzdi.zzac(stringBuilder2.toString());
                return null;
            }
        } catch (NotFoundException unused2) {
            StringBuilder stringBuilder3 = new StringBuilder(98);
            stringBuilder3.append("Failed to load the container. No default container resource found with the resource ID ");
            stringBuilder3.append(i);
            zzdi.zzac(stringBuilder3.toString());
            return null;
        }
    }

    private static zzov zza(ByteArrayOutputStream byteArrayOutputStream) {
        try {
            return zzda.zzbf(byteArrayOutputStream.toString("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            zzdi.zzax("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
            return null;
        } catch (JSONException unused2) {
            zzdi.zzac("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
            return null;
        }
    }

    private static zzov zzb(byte[] bArr) {
        try {
            zzov zza = zzor.zza((zzi) zzuw.zza(new zzi(), bArr));
            if (zza != null) {
                zzdi.zzab("The container was successfully loaded from the resource (using binary file)");
            }
            return zza;
        } catch (zzuv unused) {
            zzdi.zzav("The resource file is corrupted. The container cannot be extracted from the binary file");
            return null;
        } catch (zzoz unused2) {
            zzdi.zzac("The resource file is invalid. The container from the binary file is invalid");
            return null;
        }
    }

    public final synchronized void release() {
        this.zzajm.shutdown();
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0024 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:12|13|14|24|15) */
    /* JADX WARNING: Missing block: B:13:?, code skipped:
            com.google.android.gms.tagmanager.zzdi.zzac("Error writing resource to disk. Removing resource from disk.");
            r1.delete();
     */
    /* JADX WARNING: Missing block: B:15:0x0033, code skipped:
            return false;
     */
    /* JADX WARNING: Missing block: B:17:?, code skipped:
            r3.close();
     */
    /* JADX WARNING: Missing block: B:18:0x0038, code skipped:
            com.google.android.gms.tagmanager.zzdi.zzac(r0);
     */
    @com.google.android.gms.common.util.VisibleForTesting
    public final boolean zzb(com.google.android.gms.internal.gtm.zzop r7) {
        /*
        r6 = this;
        r0 = "error closing stream for writing resource to disk";
        r1 = r6.zzje();
        r2 = 0;
        r3 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x003c }
        r3.<init>(r1);	 Catch:{ FileNotFoundException -> 0x003c }
        r4 = r7.zzpe();	 Catch:{ IOException -> 0x0024 }
        r4 = new byte[r4];	 Catch:{ IOException -> 0x0024 }
        r5 = r4.length;	 Catch:{ IOException -> 0x0024 }
        com.google.android.gms.internal.gtm.zzuw.zza(r7, r4, r2, r5);	 Catch:{ IOException -> 0x0024 }
        r3.write(r4);	 Catch:{ IOException -> 0x0024 }
        r3.close();	 Catch:{ IOException -> 0x001d }
        goto L_0x0020;
    L_0x001d:
        com.google.android.gms.tagmanager.zzdi.zzac(r0);
    L_0x0020:
        r7 = 1;
        return r7;
    L_0x0022:
        r7 = move-exception;
        goto L_0x0034;
    L_0x0024:
        r7 = "Error writing resource to disk. Removing resource from disk.";
        com.google.android.gms.tagmanager.zzdi.zzac(r7);	 Catch:{ all -> 0x0022 }
        r1.delete();	 Catch:{ all -> 0x0022 }
        r3.close();	 Catch:{ IOException -> 0x0030 }
        goto L_0x0033;
    L_0x0030:
        com.google.android.gms.tagmanager.zzdi.zzac(r0);
    L_0x0033:
        return r2;
    L_0x0034:
        r3.close();	 Catch:{ IOException -> 0x0038 }
        goto L_0x003b;
    L_0x0038:
        com.google.android.gms.tagmanager.zzdi.zzac(r0);
    L_0x003b:
        throw r7;
    L_0x003c:
        r7 = "Error opening resource file for writing";
        com.google.android.gms.tagmanager.zzdi.zzav(r7);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzex.zzb(com.google.android.gms.internal.gtm.zzop):boolean");
    }

    @VisibleForTesting
    private final File zzje() {
        String valueOf = String.valueOf(this.zzaec);
        String str = "resource_";
        return new File(this.zzrm.getDir("google_tagmanager", 0), valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
