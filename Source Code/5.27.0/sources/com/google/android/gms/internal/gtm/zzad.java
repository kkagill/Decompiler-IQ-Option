package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Locale;

@VisibleForTesting
public final class zzad extends zzan {
    private static boolean zzvo;
    private Info zzvp;
    private final zzcv zzvq;
    private String zzvr;
    private boolean zzvs = false;
    private final Object zzvt = new Object();

    zzad(zzap zzap) {
        super(zzap);
        this.zzvq = new zzcv(zzap.zzcn());
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
    }

    public final boolean zzbw() {
        zzdb();
        Info zzce = zzce();
        if (zzce == null || zzce.isLimitAdTrackingEnabled()) {
            return false;
        }
        return true;
    }

    public final String zzcd() {
        zzdb();
        Info zzce = zzce();
        CharSequence id = zzce != null ? zzce.getId() : null;
        if (TextUtils.isEmpty(id)) {
            return null;
        }
        return id;
    }

    private final synchronized Info zzce() {
        if (this.zzvq.zzj(1000)) {
            this.zzvq.start();
            Info zzcf = zzcf();
            if (zza(this.zzvp, zzcf)) {
                this.zzvp = zzcf;
            } else {
                zzu("Failed to reset client id on adid change. Not using adid");
                this.zzvp = new Info("", false);
            }
        }
        return this.zzvp;
    }

    private final boolean zza(Info info, Info info2) {
        Object obj = null;
        CharSequence id = info2 == null ? null : info2.getId();
        if (TextUtils.isEmpty(id)) {
            return true;
        }
        Object zzeh = zzcw().zzeh();
        synchronized (this.zzvt) {
            String valueOf;
            String valueOf2;
            boolean zzp;
            String valueOf3;
            if (!this.zzvs) {
                this.zzvr = zzcg();
                this.zzvs = true;
            } else if (TextUtils.isEmpty(this.zzvr)) {
                if (info != null) {
                    obj = info.getId();
                }
                if (obj == null) {
                    valueOf = String.valueOf(id);
                    valueOf2 = String.valueOf(zzeh);
                    zzp = zzp(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                    return zzp;
                }
                valueOf = String.valueOf(obj);
                valueOf3 = String.valueOf(zzeh);
                this.zzvr = zzo(valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf));
            }
            valueOf = String.valueOf(id);
            valueOf3 = String.valueOf(zzeh);
            valueOf = zzo(valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf));
            if (TextUtils.isEmpty(valueOf)) {
                return false;
            } else if (valueOf.equals(this.zzvr)) {
                return true;
            } else {
                if (!TextUtils.isEmpty(this.zzvr)) {
                    zzq("Resetting the client id because Advertising Id changed.");
                    zzeh = zzcw().zzei();
                    zza("New client Id", zzeh);
                }
                valueOf = String.valueOf(id);
                valueOf2 = String.valueOf(zzeh);
                zzp = zzp(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                return zzp;
            }
        }
    }

    private final Info zzcf() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(getContext());
        } catch (IllegalStateException unused) {
            zzt("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
        } catch (Exception e) {
            if (!zzvo) {
                zzvo = true;
                zzd("Error getting advertiser id", e);
            }
        }
        return null;
    }

    private static String zzo(String str) {
        if (zzcz.zzai("MD5") == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, r0.digest(str.getBytes()))});
    }

    private final boolean zzp(String str) {
        try {
            str = zzo(str);
            zzq("Storing hashed adid.");
            FileOutputStream openFileOutput = getContext().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(str.getBytes());
            openFileOutput.close();
            this.zzvr = str;
            return true;
        } catch (IOException e) {
            zze("Error creating hash file", e);
            return false;
        }
    }

    private final String zzcg() {
        Object e;
        String str = "gaClientIdData";
        String str2 = null;
        try {
            FileInputStream openFileInput = getContext().openFileInput(str);
            byte[] bArr = new byte[128];
            int read = openFileInput.read(bArr, 0, 128);
            if (openFileInput.available() > 0) {
                zzt("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                getContext().deleteFile(str);
                return null;
            } else if (read <= 0) {
                zzq("Hash file is empty.");
                openFileInput.close();
                return null;
            } else {
                String str3 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                } catch (FileNotFoundException unused) {
                } catch (IOException e2) {
                    e = e2;
                    str2 = str3;
                    zzd("Error reading Hash file, deleting it", e);
                    getContext().deleteFile(str);
                    return str2;
                }
                return str3;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        } catch (IOException e3) {
            e = e3;
            zzd("Error reading Hash file, deleting it", e);
            getContext().deleteFile(str);
            return str2;
        }
    }
}
