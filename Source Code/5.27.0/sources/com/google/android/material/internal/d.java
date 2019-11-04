package com.google.android.material.internal;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.lang.reflect.Method;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: DrawableUtils */
public class d {
    private static Method Kx;
    private static boolean Ky;

    public static boolean a(DrawableContainer drawableContainer, ConstantState constantState) {
        return b(drawableContainer, constantState);
    }

    private static boolean b(DrawableContainer drawableContainer, ConstantState constantState) {
        String str = "DrawableUtils";
        if (!Ky) {
            try {
                Kx = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[]{DrawableContainerState.class});
                Kx.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.e(str, "Could not fetch setConstantState(). Oh well.");
            }
            Ky = true;
        }
        Method method = Kx;
        if (method != null) {
            try {
                method.invoke(drawableContainer, new Object[]{constantState});
                return true;
            } catch (Exception unused2) {
                Log.e(str, "Could not invoke setConstantState(). Oh well.");
            }
        }
        return false;
    }
}
