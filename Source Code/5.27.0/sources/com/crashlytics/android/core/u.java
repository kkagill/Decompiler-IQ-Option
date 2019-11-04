package com.crashlytics.android.core;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DefaultAppMeasurementEventListenerRegistrar */
class u implements b {
    private static final List<Class<?>> rh = Collections.unmodifiableList(Arrays.asList(new Class[]{String.class, String.class, Bundle.class, Long.class}));
    private final k pO;
    private Object ri;

    public u(k kVar) {
        this.pO = kVar;
    }

    public boolean eD() {
        Class cls = getClass("com.google.android.gms.measurement.AppMeasurement");
        String str = "CrashlyticsCore";
        if (cls == null) {
            c.biX().d(str, "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
            return false;
        }
        Object a = a(cls);
        if (a == null) {
            c.biX().w(str, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not create an instance of Firebase Analytics.");
            return false;
        }
        if (getClass("com.google.android.gms.measurement.AppMeasurement$OnEventListener") == null) {
            c.biX().w(str, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not get class com.google.android.gms.measurement.AppMeasurement$OnEventListener");
            return false;
        }
        try {
            cls.getDeclaredMethod("registerOnMeasurementEventListener", new Class[]{getClass("com.google.android.gms.measurement.AppMeasurement$OnEventListener")}).invoke(a, new Object[]{b(r4)});
        } catch (NoSuchMethodException e) {
            c.biX().w(str, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Method registerOnMeasurementEventListener not found.", e);
            return false;
        } catch (Exception e2) {
            k biX = c.biX();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: ");
            stringBuilder.append(e2.getMessage());
            biX.w(str, stringBuilder.toString(), e2);
        }
        return true;
    }

    private Class<?> getClass(String str) {
        try {
            return this.pO.getContext().getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private Object a(Class<?> cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{this.pO.getContext()});
        } catch (Exception unused) {
            return null;
        }
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized Object b(Class cls) {
        if (this.ri == null) {
            this.ri = Proxy.newProxyInstance(this.pO.getContext().getClassLoader(), new Class[]{cls}, new InvocationHandler() {
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    String name = method.getName();
                    int i = 0;
                    if (objArr == null) {
                        objArr = new Object[0];
                    }
                    if (objArr.length == 1 && name.equals("equals")) {
                        return Boolean.valueOf(b(obj, objArr[0]));
                    }
                    if (objArr.length == 0 && name.equals("hashCode")) {
                        return Integer.valueOf(super.hashCode());
                    }
                    if (objArr.length == 0 && name.equals("toString")) {
                        return super.toString();
                    }
                    if (objArr.length == 4 && name.equals("onEvent") && u.a(objArr)) {
                        String str = (String) objArr[0];
                        String str2 = (String) objArr[1];
                        Bundle bundle = (Bundle) objArr[2];
                        if (!(str == null || str.equals("crash"))) {
                            u.a(u.this.pO, str2, bundle);
                            return null;
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected method invoked on AppMeasurement.EventListener: ");
                    stringBuilder.append(name);
                    stringBuilder.append("(");
                    StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
                    while (i < objArr.length) {
                        if (i > 0) {
                            stringBuilder2.append(", ");
                        }
                        stringBuilder2.append(objArr[i].getClass().getName());
                        i++;
                    }
                    stringBuilder2.append("); returning null");
                    c.biX().e("CrashlyticsCore", stringBuilder2.toString());
                    return null;
                }

                public boolean b(Object obj, Object obj2) {
                    boolean z = true;
                    if (obj == obj2) {
                        return true;
                    }
                    if (!(obj2 != null && Proxy.isProxyClass(obj2.getClass()) && super.equals(Proxy.getInvocationHandler(obj2)))) {
                        z = false;
                    }
                    return z;
                }
            });
        }
        return this.ri;
    }

    static boolean a(Object[] objArr) {
        if (objArr.length != rh.size()) {
            return false;
        }
        Iterator it = rh.iterator();
        for (Object obj : objArr) {
            if (!obj.getClass().equals(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static void a(k kVar, String str, Bundle bundle) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("$A$:");
            stringBuilder.append(b(str, bundle));
            kVar.ag(stringBuilder.toString());
        } catch (JSONException unused) {
            k biX = c.biX();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Unable to serialize Firebase Analytics event; ");
            stringBuilder2.append(str);
            biX.w("CrashlyticsCore", stringBuilder2.toString());
        }
    }

    private static String b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(ConditionalUserProperty.NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }
}
