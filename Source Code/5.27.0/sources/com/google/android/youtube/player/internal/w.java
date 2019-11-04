package com.google.android.youtube.player.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;

public final class w {

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    private static IBinder a(Class<?> cls, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) {
        String str;
        String valueOf;
        try {
            return (IBinder) cls.getConstructor(new Class[]{IBinder.class, IBinder.class, IBinder.class, Boolean.TYPE}).newInstance(new Object[]{iBinder, iBinder2, iBinder3, Boolean.valueOf(z)});
        } catch (NoSuchMethodException e) {
            str = "Could not find the right constructor for ";
            valueOf = String.valueOf(cls.getName());
            throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
        } catch (InvocationTargetException e2) {
            str = "Exception thrown by invoked constructor in ";
            valueOf = String.valueOf(cls.getName());
            throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e2);
        } catch (InstantiationException e3) {
            str = "Unable to instantiate the dynamic class ";
            valueOf = String.valueOf(cls.getName());
            throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e3);
        } catch (IllegalAccessException e4) {
            str = "Unable to call the default constructor of ";
            valueOf = String.valueOf(cls.getName());
            throw new a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e4);
        }
    }

    private static IBinder a(ClassLoader classLoader, String str, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) {
        try {
            return a(classLoader.loadClass(str), iBinder, iBinder2, iBinder3, z);
        } catch (ClassNotFoundException e) {
            String str2 = "Unable to find dynamic class ";
            str = String.valueOf(str);
            throw new a(str.length() != 0 ? str2.concat(str) : new String(str2), e);
        }
    }

    public static f a(Activity activity, IBinder iBinder, boolean z) {
        b.ac(activity);
        b.ac(iBinder);
        Context ar = aa.ar(activity);
        if (ar != null) {
            return com.google.android.youtube.player.internal.f.a.e(a(ar.getClassLoader(), "com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer", x.ad(ar).asBinder(), x.ad(activity).asBinder(), iBinder, z));
        }
        throw new a("Could not create remote context");
    }
}
