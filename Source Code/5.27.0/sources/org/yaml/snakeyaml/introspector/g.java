package org.yaml.snakeyaml.introspector;

import java.beans.FeatureDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.yaml.snakeyaml.d.b;
import org.yaml.snakeyaml.error.YAMLException;

/* compiled from: PropertyUtils */
public class g {
    private boolean fJE;
    private BeanAccess fKa;
    private final Map<Class<?>, Map<String, e>> fLd;
    private final Map<Class<?>, Set<e>> fLe;
    private boolean fLf;
    private b fLg;

    /* compiled from: PropertyUtils */
    /* renamed from: org.yaml.snakeyaml.introspector.g$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fLh = new int[BeanAccess.values().length];

        static {
            try {
                fLh[BeanAccess.FIELD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public g() {
        this(new b());
    }

    g(b bVar) {
        this.fLd = new HashMap();
        this.fLe = new HashMap();
        this.fKa = BeanAccess.DEFAULT;
        this.fJE = false;
        this.fLf = false;
        this.fLg = bVar;
        if (bVar.bWf()) {
            this.fKa = BeanAccess.FIELD;
        }
    }

    /* Access modifiers changed, original: protected */
    public Map<String, e> a(Class<?> cls, BeanAccess beanAccess) {
        if (this.fLd.containsKey(cls)) {
            return (Map) this.fLd.get(cls);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = null;
        Class cls2;
        if (AnonymousClass1.fLh[beanAccess.ordinal()] != 1) {
            try {
                for (PropertyDescriptor propertyDescriptor : Introspector.getBeanInfo(cls).getPropertyDescriptors()) {
                    Method readMethod = propertyDescriptor.getReadMethod();
                    if ((readMethod == null || !readMethod.getName().equals("getClass")) && !a(propertyDescriptor)) {
                        linkedHashMap.put(propertyDescriptor.getName(), new c(propertyDescriptor));
                    }
                }
                cls2 = cls;
                Object obj2 = null;
                while (cls2 != null) {
                    Object obj3 = obj2;
                    for (Field field : cls2.getDeclaredFields()) {
                        int modifiers = field.getModifiers();
                        if (!(Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers))) {
                            if (Modifier.isPublic(modifiers)) {
                                linkedHashMap.put(field.getName(), new a(field));
                            } else {
                                obj3 = 1;
                            }
                        }
                    }
                    cls2 = cls2.getSuperclass();
                    obj2 = obj3;
                }
                obj = obj2;
            } catch (IntrospectionException e) {
                throw new YAMLException(e);
            }
        }
        for (cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            for (Field field2 : cls2.getDeclaredFields()) {
                int modifiers2 = field2.getModifiers();
                if (!(Modifier.isStatic(modifiers2) || Modifier.isTransient(modifiers2) || linkedHashMap.containsKey(field2.getName()))) {
                    linkedHashMap.put(field2.getName(), new a(field2));
                }
            }
        }
        if (!linkedHashMap.isEmpty() || obj == null) {
            this.fLd.put(cls, linkedHashMap);
            return linkedHashMap;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No JavaBean properties found in ");
        stringBuilder.append(cls.getName());
        throw new YAMLException(stringBuilder.toString());
    }

    private boolean a(FeatureDescriptor featureDescriptor) {
        return Boolean.TRUE.equals(featureDescriptor.getValue("transient"));
    }

    public e f(Class<? extends Object> cls, String str) {
        return a(cls, str, this.fKa);
    }

    public e a(Class<? extends Object> cls, String str, BeanAccess beanAccess) {
        e eVar = (e) a(cls, beanAccess).get(str);
        if (eVar == null && this.fLf) {
            eVar = new d(str);
        }
        if (eVar != null) {
            return eVar;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to find property '");
        stringBuilder.append(str);
        stringBuilder.append("' on class: ");
        stringBuilder.append(cls.getName());
        throw new YAMLException(stringBuilder.toString());
    }

    public void hr(boolean z) {
        if (this.fJE != z) {
            this.fJE = z;
            this.fLe.clear();
        }
    }

    public boolean bUi() {
        return this.fJE;
    }
}
