package com.google.android.gms.internal.gtm;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class zzra<T extends zzqp> {
    private static final Logger logger = Logger.getLogger(zzqj.class.getName());
    private static String zzbai = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    zzra() {
    }

    public abstract T zzpb();

    static <T extends zzqp> T zzd(Class<T> cls) {
        String str;
        ClassLoader classLoader = zzra.class.getClassLoader();
        if (cls.equals(zzqp.class)) {
            str = zzbai;
        } else if (cls.getPackage().equals(zzra.class.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (zzqp) cls.cast(((zzra) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zzpb());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzra.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzqp) cls.cast(((zzra) it.next()).zzpb()));
                } catch (ServiceConfigurationError e5) {
                    Throwable th = e5;
                    Logger logger = logger;
                    Level level = Level.SEVERE;
                    String str2 = "Unable to load ";
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
                }
            }
            if (arrayList.size() == 1) {
                return (zzqp) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzqp) cls.getMethod("combine", new Class[]{Collection.class}).invoke(null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }
}
