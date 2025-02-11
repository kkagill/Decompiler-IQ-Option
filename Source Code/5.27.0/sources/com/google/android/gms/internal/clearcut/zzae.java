package com.google.android.gms.internal.clearcut;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.UserManager;
import android.util.Log;
import androidx.core.content.PermissionChecker;

public abstract class zzae<T> {
    private static final Object zzdn = new Object();
    private static boolean zzdo = false;
    private static volatile Boolean zzdp = null;
    private static volatile Boolean zzdq = null;
    @SuppressLint({"StaticFieldLeak"})
    private static Context zzh = null;
    private final zzao zzdr;
    final String zzds;
    private final String zzdt;
    private final T zzdu;
    private T zzdv;
    private volatile zzab zzdw;
    private volatile SharedPreferences zzdx;

    private zzae(zzao zzao, String str, T t) {
        this.zzdv = null;
        this.zzdw = null;
        this.zzdx = null;
        if (zzao.zzef == null && zzao.zzeg == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (zzao.zzef == null || zzao.zzeg == null) {
            this.zzdr = zzao;
            String valueOf = String.valueOf(zzao.zzeh);
            String valueOf2 = String.valueOf(str);
            this.zzdt = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            String valueOf3 = String.valueOf(zzao.zzei);
            str = String.valueOf(str);
            this.zzds = str.length() != 0 ? valueOf3.concat(str) : new String(valueOf3);
            this.zzdu = t;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    /* synthetic */ zzae(zzao zzao, String str, Object obj, zzai zzai) {
        this(zzao, str, obj);
    }

    public static void maybeInit(Context context) {
        if (zzh == null) {
            synchronized (zzdn) {
                if (VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                }
                if (zzh != context) {
                    zzdp = null;
                }
                zzh = context;
            }
            zzdo = false;
        }
    }

    private static <T> zzae<T> zza(zzao zzao, String str, T t, zzan<T> zzan) {
        return new zzal(zzao, str, t, zzan);
    }

    private static zzae<String> zza(zzao zzao, String str, String str2) {
        return new zzak(zzao, str, str2);
    }

    private static zzae<Boolean> zza(zzao zzao, String str, boolean z) {
        return new zzaj(zzao, str, Boolean.valueOf(z));
    }

    private static <V> V zza(zzam<V> zzam) {
        long clearCallingIdentity;
        zzam zzam2;
        try {
            zzam2 = zzam2.zzp();
            return zzam2;
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zzp = zzam2.zzp();
            return zzp;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    static boolean zza(String str, boolean z) {
        return zzn() ? ((Boolean) zza(new zzah(str, false))).booleanValue() : false;
    }

    @TargetApi(24)
    private final T zzl() {
        String str;
        if (zza("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            str = "Bypass reading Phenotype values for flag: ";
            String valueOf = String.valueOf(this.zzds);
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } else if (this.zzdr.zzeg != null) {
            if (this.zzdw == null) {
                this.zzdw = zzab.zza(zzh.getContentResolver(), this.zzdr.zzeg);
            }
            str = (String) zza(new zzaf(this, this.zzdw));
            if (str != null) {
                return zzb(str);
            }
        } else if (this.zzdr.zzef != null) {
            boolean z;
            if (VERSION.SDK_INT < 24 || zzh.isDeviceProtectedStorage()) {
                z = true;
            } else {
                if (zzdq == null || !zzdq.booleanValue()) {
                    zzdq = Boolean.valueOf(((UserManager) zzh.getSystemService(UserManager.class)).isUserUnlocked());
                }
                z = zzdq.booleanValue();
            }
            if (!z) {
                return null;
            }
            if (this.zzdx == null) {
                this.zzdx = zzh.getSharedPreferences(this.zzdr.zzef, 0);
            }
            SharedPreferences sharedPreferences = this.zzdx;
            if (sharedPreferences.contains(this.zzds)) {
                return zza(sharedPreferences);
            }
        }
        return null;
    }

    private final T zzm() {
        if (!this.zzdr.zzej && zzn()) {
            String str = (String) zza(new zzag(this));
            if (str != null) {
                return zzb(str);
            }
        }
        return null;
    }

    private static boolean zzn() {
        if (zzdp == null) {
            Context context = zzh;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (PermissionChecker.checkCallingOrSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            zzdp = Boolean.valueOf(z);
        }
        return zzdp.booleanValue();
    }

    public final T get() {
        if (zzh != null) {
            Object zzm;
            if (this.zzdr.zzek) {
                zzm = zzm();
                if (zzm != null) {
                    return zzm;
                }
                zzm = zzl();
                if (zzm != null) {
                    return zzm;
                }
            }
            zzm = zzl();
            if (zzm != null) {
                return zzm;
            }
            zzm = zzm();
            if (zzm != null) {
                return zzm;
            }
            return this.zzdu;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    public abstract T zza(SharedPreferences sharedPreferences);

    public abstract T zzb(String str);

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ String zzo() {
        return zzy.zza(zzh.getContentResolver(), this.zzdt, null);
    }
}
