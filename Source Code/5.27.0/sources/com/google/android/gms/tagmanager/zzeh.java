package com.google.android.gms.tagmanager;

import android.net.Uri;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@ShowFirstParty
@VisibleForTesting
class zzeh {
    private static zzeh zzaip;
    private volatile String zzaec = null;
    private volatile zza zzaiq = zza.NONE;
    private volatile String zzair = null;
    private volatile String zzais = null;

    enum zza {
        NONE,
        CONTAINER,
        CONTAINER_DEBUG
    }

    zzeh() {
    }

    @ShowFirstParty
    static zzeh zziy() {
        zzeh zzeh;
        synchronized (zzeh.class) {
            if (zzaip == null) {
                zzaip = new zzeh();
            }
            zzeh = zzaip;
        }
        return zzeh;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean zza(Uri uri) {
        try {
            String decode = URLDecoder.decode(uri.toString(), "UTF-8");
            String str;
            String str2;
            if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                str = "Container preview url: ";
                String valueOf = String.valueOf(decode);
                zzdi.zzab(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                if (decode.matches(".*?&gtm_debug=x$")) {
                    this.zzaiq = zza.CONTAINER_DEBUG;
                } else {
                    this.zzaiq = zza.CONTAINER;
                }
                this.zzais = uri.getQuery().replace("&gtm_debug=x", "");
                if (this.zzaiq == zza.CONTAINER || this.zzaiq == zza.CONTAINER_DEBUG) {
                    str2 = "/r?";
                    str = String.valueOf(this.zzais);
                    this.zzair = str.length() != 0 ? str2.concat(str) : new String(str2);
                }
                this.zzaec = zzbh(this.zzais);
                return true;
            } else if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                str2 = "Invalid preview uri: ";
                decode = String.valueOf(decode);
                zzdi.zzac(decode.length() != 0 ? str2.concat(decode) : new String(str2));
                return false;
            } else if (!zzbh(uri.getQuery()).equals(this.zzaec)) {
                return false;
            } else {
                str2 = "Exit preview mode for container: ";
                str = String.valueOf(this.zzaec);
                zzdi.zzab(str.length() != 0 ? str2.concat(str) : new String(str2));
                this.zzaiq = zza.NONE;
                this.zzair = null;
                return true;
            }
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    public final zza zziz() {
        return this.zzaiq;
    }

    /* Access modifiers changed, original: final */
    public final String zzja() {
        return this.zzair;
    }

    /* Access modifiers changed, original: final */
    public final String getContainerId() {
        return this.zzaec;
    }

    private static String zzbh(String str) {
        return str.split("&")[0].split("=")[1];
    }
}
