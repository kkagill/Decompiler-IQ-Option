package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* compiled from: ReflectionToStringBuilder */
public class a extends b {
    private boolean fDQ = false;
    private boolean fDR = false;
    protected String[] fDS;
    private Class<?> fDT = null;

    public static String toString(Object obj) {
        return a(obj, null, false, false, null);
    }

    public static <T> String a(T t, ToStringStyle toStringStyle, boolean z, boolean z2, Class<? super T> cls) {
        return new a(t, toStringStyle, null, cls, z, z2).toString();
    }

    public <T> a(T t, ToStringStyle toStringStyle, StringBuffer stringBuffer, Class<? super T> cls, boolean z, boolean z2) {
        super(t, toStringStyle, stringBuffer);
        ab(cls);
        hh(z);
        hg(z2);
    }

    /* Access modifiers changed, original: protected */
    public boolean f(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !bQL()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !bQK()) {
            return false;
        }
        String[] strArr = this.fDS;
        if (strArr == null || Arrays.binarySearch(strArr, field.getName()) < 0) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void aa(Class<?> cls) {
        if (cls.isArray()) {
            ee(getObject());
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            String name = field.getName();
            if (f(field)) {
                try {
                    u(name, g(field));
                } catch (IllegalAccessException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected IllegalAccessException: ");
                    stringBuilder.append(e.getMessage());
                    throw new InternalError(stringBuilder.toString());
                }
            }
        }
    }

    public Class<?> bQJ() {
        return this.fDT;
    }

    /* Access modifiers changed, original: protected */
    public Object g(Field field) {
        return field.get(getObject());
    }

    public boolean bQK() {
        return this.fDQ;
    }

    public boolean bQL() {
        return this.fDR;
    }

    public a ee(Object obj) {
        bQO().d(bQN(), null, obj);
        return this;
    }

    public void hg(boolean z) {
        this.fDQ = z;
    }

    public void hh(boolean z) {
        this.fDR = z;
    }

    public void ab(Class<?> cls) {
        if (cls != null) {
            Object object = getObject();
            if (!(object == null || cls.isInstance(object))) {
                throw new IllegalArgumentException("Specified class is not a superclass of the object");
            }
        }
        this.fDT = cls;
    }

    public String toString() {
        if (getObject() == null) {
            return bQO().bQR();
        }
        Class cls = getObject().getClass();
        aa(cls);
        while (cls.getSuperclass() != null && cls != bQJ()) {
            cls = cls.getSuperclass();
            aa(cls);
        }
        return super.toString();
    }
}
