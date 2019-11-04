package org.yaml.snakeyaml.introspector;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PropertySubstitute */
public class f extends e {
    private static final Logger log = Logger.getLogger(f.class.getPackage().getName());
    protected Class<?> fKX;
    private final String fKY;
    private transient Method fKZ;
    protected Class<?>[] fLa;
    private e fLb;
    private boolean fLc;
    private Field field;

    public Class<?>[] bUI() {
        if (this.fLa == null) {
            e eVar = this.fLb;
            if (eVar != null) {
                return eVar.bUI();
            }
        }
        return this.fLa;
    }

    public void set(Object obj, Object obj2) {
        Method method = this.fKZ;
        if (method == null) {
            Field field = this.field;
            if (field != null) {
                field.set(obj, obj2);
                return;
            }
            e eVar = this.fLb;
            if (eVar != null) {
                eVar.set(obj, obj2);
                return;
            }
            Logger logger = log;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No setter/delegate for '");
            stringBuilder.append(getName());
            stringBuilder.append("' on object ");
            stringBuilder.append(obj);
            logger.warning(stringBuilder.toString());
        } else if (!this.fLc) {
            method.invoke(obj, new Object[]{obj2});
        } else if (obj2 == null) {
        } else {
            if (obj2 instanceof Collection) {
                for (Object next : (Collection) obj2) {
                    this.fKZ.invoke(obj, new Object[]{next});
                }
            } else if (obj2 instanceof Map) {
                for (Entry entry : ((Map) obj2).entrySet()) {
                    this.fKZ.invoke(obj, new Object[]{entry.getKey(), entry.getValue()});
                }
            } else if (obj2.getClass().isArray()) {
                int length = Array.getLength(obj2);
                for (int i = 0; i < length; i++) {
                    this.fKZ.invoke(obj, new Object[]{Array.get(obj2, i)});
                }
            }
        }
    }

    private Method c(Class<?> cls, String str, Class<?>... clsArr) {
        Class cls2;
        while (cls2 != null) {
            for (Method method : cls2.getDeclaredMethods()) {
                if (str.equals(method.getName())) {
                    Class[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length != clsArr.length) {
                        continue;
                    } else {
                        Object obj = 1;
                        for (int i = 0; i < parameterTypes.length; i++) {
                            if (!parameterTypes[i].isAssignableFrom(clsArr[i])) {
                                obj = null;
                            }
                        }
                        if (obj != null) {
                            method.setAccessible(true);
                            return method;
                        }
                    }
                }
            }
            cls2 = cls2.getSuperclass();
        }
        if (log.isLoggable(Level.FINE)) {
            log.fine(String.format("Failed to find [%s(%d args)] for %s.%s", new Object[]{str, Integer.valueOf(clsArr.length), this.fKX.getName(), getName()}));
        }
        return null;
    }

    public String getName() {
        String name = super.getName();
        if (name != null) {
            return name;
        }
        e eVar = this.fLb;
        return eVar != null ? eVar.getName() : null;
    }

    public Class<?> getType() {
        Class type = super.getType();
        if (type != null) {
            return type;
        }
        e eVar = this.fLb;
        return eVar != null ? eVar.getType() : null;
    }

    public boolean isWritable() {
        if (this.fKZ == null && this.field == null) {
            e eVar = this.fLb;
            if (eVar == null || !eVar.isWritable()) {
                return false;
            }
        }
        return true;
    }

    public void b(e eVar) {
        this.fLb = eVar;
        String str = this.fKY;
        if (str != null && this.fKZ == null && !this.fLc) {
            this.fLc = true;
            this.fKZ = c(this.fKX, str, bUI());
        }
    }
}
