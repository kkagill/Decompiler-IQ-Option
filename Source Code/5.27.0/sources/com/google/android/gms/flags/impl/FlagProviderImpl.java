package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.flags.zzd;

@DynamiteApi
public class FlagProviderImpl extends zzd {
    private boolean zzu = false;
    private SharedPreferences zzv;

    public void init(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (!this.zzu) {
            try {
                this.zzv = zzj.zza(context.createPackageContext("com.google.android.gms", 0));
                this.zzu = true;
            } catch (NameNotFoundException unused) {
            } catch (Exception e) {
                String str = "Could not retrieve sdk flags, continuing with defaults: ";
                String valueOf = String.valueOf(e.getMessage());
                Log.w("FlagProviderImpl", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
    }

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (this.zzu) {
            return zzb.zza(this.zzv, str, Boolean.valueOf(z)).booleanValue();
        }
        return z;
    }

    public int getIntFlagValue(String str, int i, int i2) {
        if (this.zzu) {
            return zzd.zza(this.zzv, str, Integer.valueOf(i)).intValue();
        }
        return i;
    }

    public long getLongFlagValue(String str, long j, int i) {
        if (this.zzu) {
            return zzf.zza(this.zzv, str, Long.valueOf(j)).longValue();
        }
        return j;
    }

    public String getStringFlagValue(String str, String str2, int i) {
        if (this.zzu) {
            return zzh.zza(this.zzv, str, str2);
        }
        return str2;
    }
}
