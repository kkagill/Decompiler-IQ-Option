package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import java.util.Locale;

public final class zzda extends zzan {
    private String zzaau;
    private String zzaav;
    protected int zzaax;
    private int zzacu;
    protected boolean zzacv;
    private boolean zzacw;
    private boolean zzacx;

    public zzda(zzap zzap) {
        super(zzap);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        ApplicationInfo applicationInfo;
        Context context = getContext();
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (NameNotFoundException e) {
            zzd("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            zzt("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            int i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource");
            if (i > 0) {
                zzcc zzcc = (zzcc) new zzca(zzcm()).zzq(i);
                if (zzcc != null) {
                    String str;
                    int i2;
                    zzq("Loading global XML config values");
                    boolean z = false;
                    if ((zzcc.zzaau != null ? 1 : null) != null) {
                        str = zzcc.zzaau;
                        this.zzaau = str;
                        zzb("XML config - app name", str);
                    }
                    if ((zzcc.zzaav != null ? 1 : null) != null) {
                        str = zzcc.zzaav;
                        this.zzaav = str;
                        zzb("XML config - app version", str);
                    }
                    if ((zzcc.zzaaw != null ? 1 : null) != null) {
                        str = zzcc.zzaaw.toLowerCase(Locale.US);
                        i2 = "verbose".equals(str) ? 0 : "info".equals(str) ? 1 : "warning".equals(str) ? 2 : "error".equals(str) ? 3 : -1;
                        if (i2 >= 0) {
                            this.zzacu = i2;
                            zza("XML config - log level", Integer.valueOf(i2));
                        }
                    }
                    if ((zzcc.zzaax >= 0 ? 1 : null) != null) {
                        i2 = zzcc.zzaax;
                        this.zzaax = i2;
                        this.zzacv = true;
                        zzb("XML config - dispatch period (sec)", Integer.valueOf(i2));
                    }
                    if (zzcc.zzaay != -1) {
                        if (zzcc.zzaay == 1) {
                            z = true;
                        }
                        this.zzacx = z;
                        this.zzacw = true;
                        zzb("XML config - dry run", Boolean.valueOf(z));
                    }
                }
            }
        }
    }

    public final String zzba() {
        zzdb();
        return this.zzaav;
    }

    public final String zzaz() {
        zzdb();
        return this.zzaau;
    }

    public final boolean zzgh() {
        zzdb();
        return false;
    }

    public final boolean zzgi() {
        zzdb();
        return this.zzacw;
    }

    public final boolean zzgj() {
        zzdb();
        return this.zzacx;
    }
}
