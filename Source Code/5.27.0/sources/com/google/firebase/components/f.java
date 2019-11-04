package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public final class f<T> {
    private final T abS;
    private final b<T> abT;

    @VisibleForTesting
    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    interface b<T> {
        List<String> bq(T t);
    }

    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    private static class a implements b<Context> {
        private a() {
        }

        /* renamed from: aB */
        public List<String> bq(Context context) {
            Bundle aC = aC(context);
            if (aC == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : aC.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(aC.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private static Bundle aC(Context context) {
            String str = "ComponentDiscovery";
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(str, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w(str, "ComponentDiscoveryService has no service info.");
                return null;
            } catch (NameNotFoundException unused) {
                Log.w(str, "Application info not found.");
                return null;
            }
        }
    }

    public static f<Context> aA(Context context) {
        return new f(context, new a());
    }

    @VisibleForTesting
    f(T t, b<T> bVar) {
        this.abS = t;
        this.abT = bVar;
    }

    public List<h> wg() {
        return o(this.abT.bq(this.abS));
    }

    private static List<h> o(List<String> list) {
        String str = "Could not instantiate %s";
        String str2 = "Could not instantiate %s.";
        String str3 = "ComponentDiscovery";
        ArrayList arrayList = new ArrayList();
        for (String cls : list) {
            try {
                Class cls2 = Class.forName(cls);
                if (h.class.isAssignableFrom(cls2)) {
                    arrayList.add((h) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } else {
                    Log.w(str3, String.format("Class %s is not an instance of %s", new Object[]{cls, "com.google.firebase.components.ComponentRegistrar"}));
                }
            } catch (ClassNotFoundException e) {
                Log.w(str3, String.format("Class %s is not an found.", new Object[]{cls}), e);
            } catch (IllegalAccessException e2) {
                Log.w(str3, String.format(str2, new Object[]{cls}), e2);
            } catch (InstantiationException e3) {
                Log.w(str3, String.format(str2, new Object[]{cls}), e3);
            } catch (NoSuchMethodException e4) {
                Log.w(str3, String.format(str, new Object[]{cls}), e4);
            } catch (InvocationTargetException e5) {
                Log.w(str3, String.format(str, new Object[]{cls}), e5);
            }
        }
        return arrayList;
    }
}
