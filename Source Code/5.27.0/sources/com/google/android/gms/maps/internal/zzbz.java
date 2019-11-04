package com.google.android.gms.maps.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class zzbz {
    private static final String TAG = "zzbz";
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static Context zzcj;
    private static zze zzck;

    public static zze zza(Context context) {
        Preconditions.checkNotNull(context);
        zze zze = zzck;
        if (zze != null) {
            return zze;
        }
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        if (isGooglePlayServicesAvailable == 0) {
            Log.i(TAG, "Making Creator dynamically");
            IBinder iBinder = (IBinder) zza(zzb(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
            if (iBinder == null) {
                zze = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                zze = queryLocalInterface instanceof zze ? (zze) queryLocalInterface : new zzf(iBinder);
            }
            zzck = zze;
            try {
                zzck.zza(ObjectWrapper.wrap(zzb(context).getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                return zzck;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
    }

    private static <T> T zza(Class<?> cls) {
        String str;
        String valueOf;
        Class cls2;
        try {
            cls2 = cls2.newInstance();
            return cls2;
        } catch (InstantiationException unused) {
            str = "Unable to instantiate the dynamic class ";
            valueOf = String.valueOf(cls2.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } catch (IllegalAccessException unused2) {
            str = "Unable to call the default constructor of ";
            valueOf = String.valueOf(cls2.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    private static <T> T zza(ClassLoader classLoader, String str) {
        try {
            return zza(((ClassLoader) Preconditions.checkNotNull(classLoader)).loadClass(str));
        } catch (ClassNotFoundException unused) {
            String str2 = "Unable to find dynamic class ";
            str = String.valueOf(str);
            throw new IllegalStateException(str.length() != 0 ? str2.concat(str) : new String(str2));
        }
    }

    @Nullable
    private static Context zzb(Context context) {
        Context context2 = zzcj;
        if (context2 != null) {
            return context2;
        }
        context = zzc(context);
        zzcj = context;
        return context;
    }

    @Nullable
    private static Context zzc(Context context) {
        try {
            context = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
            return context;
        } catch (Throwable th) {
            Log.e(TAG, "Failed to load maps module, use legacy", th);
            return GooglePlayServicesUtil.getRemoteContext(context);
        }
    }
}
