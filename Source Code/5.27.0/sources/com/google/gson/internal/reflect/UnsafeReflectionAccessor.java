package com.google.gson.internal.reflect;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

final class UnsafeReflectionAccessor extends ReflectionAccessor {
    private static Class unsafeClass;
    private final Field overrideField = getOverrideField();
    private final Object theUnsafe = getUnsafeInstance();

    UnsafeReflectionAccessor() {
    }

    public void makeAccessible(AccessibleObject accessibleObject) {
        if (!makeAccessibleWithUnsafe(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Gson couldn't modify fields for ");
                stringBuilder.append(accessibleObject);
                stringBuilder.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
                throw new JsonIOException(stringBuilder.toString(), e);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean makeAccessibleWithUnsafe(AccessibleObject accessibleObject) {
        if (!(this.theUnsafe == null || this.overrideField == null)) {
            try {
                long longValue = ((Long) unsafeClass.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.theUnsafe, new Object[]{this.overrideField})).longValue();
                unsafeClass.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.theUnsafe, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.valueOf(true)});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static Object getUnsafeInstance() {
        Object obj = null;
        try {
            unsafeClass = Class.forName("sun.misc.Unsafe");
            Field declaredField = unsafeClass.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
            return obj;
        } catch (Exception unused) {
            return obj;
        }
    }

    private static Field getOverrideField() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }
}
