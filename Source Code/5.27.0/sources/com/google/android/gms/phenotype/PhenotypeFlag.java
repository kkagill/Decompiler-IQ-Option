package com.google.android.gms.phenotype;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.UserManager;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.phenotype.zzf;
import com.google.android.gms.internal.phenotype.zzh;

@KeepForSdk
@Deprecated
public abstract class PhenotypeFlag<T> {
    private static final Object zzak = new Object();
    @SuppressLint({"StaticFieldLeak"})
    private static Context zzal = null;
    private static boolean zzam = false;
    private static Boolean zzan = null;
    private final Factory zzao;
    final String zzap;
    private final String zzaq;
    private final T zzar;
    private T zzas;

    @KeepForSdk
    public static class Factory {
        private final String zzax;
        private final Uri zzay;
        private final String zzaz;
        private final String zzba;
        private final boolean zzbb;
        private final boolean zzbc;

        @KeepForSdk
        public Factory(Uri uri) {
            this(null, uri, "", "", false, false);
        }

        private Factory(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
            this.zzax = str;
            this.zzay = uri;
            this.zzaz = str2;
            this.zzba = str3;
            this.zzbb = z;
            this.zzbc = z2;
        }

        @KeepForSdk
        public PhenotypeFlag<String> createFlag(String str, String str2) {
            return PhenotypeFlag.zza(this, str, str2);
        }

        @KeepForSdk
        public Factory withGservicePrefix(String str) {
            boolean z = this.zzbb;
            if (z) {
                throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
            }
            return new Factory(this.zzax, this.zzay, str, this.zzba, z, this.zzbc);
        }

        @KeepForSdk
        public Factory withPhenotypePrefix(String str) {
            return new Factory(this.zzax, this.zzay, this.zzaz, str, this.zzbb, this.zzbc);
        }
    }

    interface zza<V> {
        V zzh();
    }

    private PhenotypeFlag(Factory factory, String str, T t) {
        this.zzas = null;
        if (factory.zzax == null && factory.zzay == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (factory.zzax == null || factory.zzay == null) {
            this.zzao = factory;
            String valueOf = String.valueOf(factory.zzaz);
            String valueOf2 = String.valueOf(str);
            this.zzaq = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            String valueOf3 = String.valueOf(factory.zzba);
            str = String.valueOf(str);
            this.zzap = str.length() != 0 ? valueOf3.concat(str) : new String(valueOf3);
            this.zzar = t;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    /* synthetic */ PhenotypeFlag(Factory factory, String str, Object obj, zzr zzr) {
        this(factory, str, obj);
    }

    @KeepForSdk
    public static void maybeInit(Context context) {
        zzh.maybeInit(context);
        if (zzal == null) {
            zzh.init(context);
            synchronized (zzak) {
                if (VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                }
                if (zzal != context) {
                    zzan = null;
                }
                zzal = context;
            }
            zzam = false;
        }
    }

    private static PhenotypeFlag<String> zza(Factory factory, String str, String str2) {
        return new zzs(factory, str, str2);
    }

    private static <V> V zza(zza<V> zza) {
        long clearCallingIdentity;
        zza zza2;
        try {
            zza2 = zza2.zzh();
            return zza2;
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zzh = zza2.zzh();
            return zzh;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    static boolean zza(String str, boolean z) {
        return zzf() ? ((Boolean) zza(new zzq(str, false))).booleanValue() : false;
    }

    @TargetApi(24)
    private final T zzd() {
        String str;
        if (zza("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            str = "Bypass reading Phenotype values for flag: ";
            String valueOf = String.valueOf(this.zzap);
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } else if (this.zzao.zzay != null) {
            str = (String) zza(new zzo(this, zza.zza(zzal.getContentResolver(), this.zzao.zzay)));
            if (str != null) {
                return zza(str);
            }
        } else if (this.zzao.zzax == null || (VERSION.SDK_INT >= 24 && !zzal.isDeviceProtectedStorage() && !((UserManager) zzal.getSystemService(UserManager.class)).isUserUnlocked())) {
            return null;
        } else {
            SharedPreferences sharedPreferences = zzal.getSharedPreferences(this.zzao.zzax, 0);
            if (sharedPreferences.contains(this.zzap)) {
                return zza(sharedPreferences);
            }
        }
        return null;
    }

    private final T zze() {
        if (!this.zzao.zzbb && zzf()) {
            String str = (String) zza(new zzp(this));
            if (str != null) {
                return zza(str);
            }
        }
        return null;
    }

    private static boolean zzf() {
        if (zzan == null) {
            Context context = zzal;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (PermissionChecker.checkCallingOrSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            zzan = Boolean.valueOf(z);
        }
        return zzan.booleanValue();
    }

    @KeepForSdk
    public T get() {
        if (zzal != null) {
            Object zze;
            if (this.zzao.zzbc) {
                zze = zze();
                if (zze != null) {
                    return zze;
                }
                zze = zzd();
                if (zze != null) {
                    return zze;
                }
            }
            zze = zzd();
            if (zze != null) {
                return zze;
            }
            zze = zze();
            if (zze != null) {
                return zze;
            }
            return this.zzar;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    public abstract T zza(SharedPreferences sharedPreferences);

    public abstract T zza(String str);

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ String zzg() {
        return zzf.zza(zzal.getContentResolver(), this.zzaq, null);
    }
}
