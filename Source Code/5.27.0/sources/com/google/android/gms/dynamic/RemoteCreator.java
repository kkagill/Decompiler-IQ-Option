package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public abstract class RemoteCreator<T> {
    private final String zzic;
    private T zzid;

    @KeepForSdk
    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    @KeepForSdk
    protected RemoteCreator(String str) {
        this.zzic = str;
    }

    @KeepForSdk
    public abstract T getRemoteCreator(IBinder iBinder);

    /* Access modifiers changed, original: protected|final */
    @KeepForSdk
    public final T getRemoteCreatorInstance(Context context) {
        if (this.zzid == null) {
            Preconditions.checkNotNull(context);
            context = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (context != null) {
                try {
                    this.zzid = getRemoteCreator((IBinder) context.getClassLoader().loadClass(this.zzic).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new RemoteCreatorException("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new RemoteCreatorException("Could not access creator.", e3);
                }
            }
            throw new RemoteCreatorException("Could not get remote context.");
        }
        return this.zzid;
    }
}
