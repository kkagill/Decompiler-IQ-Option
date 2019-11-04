package io.fabric.sdk.android.services.common;

import android.content.Context;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.lang.reflect.Method;

/* compiled from: FirebaseAppImpl */
final class o implements n {
    private final Method eNk;
    private final Object eNl;

    public static n cD(Context context) {
        String str = "Fabric";
        try {
            Class loadClass = context.getClassLoader().loadClass("com.google.firebase.FirebaseApp");
            return new o(loadClass, loadClass.getDeclaredMethod("getInstance", new Class[0]).invoke(loadClass, new Object[0]));
        } catch (ClassNotFoundException unused) {
            c.biX().d(str, "Could not find class: com.google.firebase.FirebaseApp");
            return null;
        } catch (NoSuchMethodException e) {
            k biX = c.biX();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not find method: ");
            stringBuilder.append(e.getMessage());
            biX.d(str, stringBuilder.toString());
            return null;
        } catch (Exception e2) {
            c.biX().d(str, "Unexpected error loading FirebaseApp instance.", e2);
            return null;
        }
    }

    private o(Class cls, Object obj) {
        this.eNl = obj;
        this.eNk = cls.getDeclaredMethod("isDataCollectionDefaultEnabled", new Class[0]);
    }

    public boolean isDataCollectionDefaultEnabled() {
        boolean z = false;
        try {
            z = ((Boolean) this.eNk.invoke(this.eNl, new Object[0])).booleanValue();
            return z;
        } catch (Exception e) {
            c.biX().d("Fabric", "Cannot check isDataCollectionDefaultEnabled on FirebaseApp.", e);
            return z;
        }
    }
}
