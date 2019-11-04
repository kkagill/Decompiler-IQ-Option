package org.yaml.snakeyaml.constructor;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.yaml.snakeyaml.constructor.e.m;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.nodes.NodeId;
import org.yaml.snakeyaml.nodes.e;
import org.yaml.snakeyaml.nodes.f;
import org.yaml.snakeyaml.nodes.g;
import org.yaml.snakeyaml.nodes.h;

/* compiled from: Constructor */
public class d extends e {

    /* compiled from: Constructor */
    protected class a implements c {
        protected a() {
        }

        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            org.yaml.snakeyaml.nodes.c cVar = (org.yaml.snakeyaml.nodes.c) dVar;
            if (Map.class.isAssignableFrom(dVar.getType())) {
                if (dVar.bUM()) {
                    return d.this.c(cVar);
                }
                return d.this.e(cVar);
            } else if (!Collection.class.isAssignableFrom(dVar.getType())) {
                Object a = d.this.a((org.yaml.snakeyaml.nodes.d) cVar);
                if (dVar.bUM()) {
                    return a;
                }
                return a(cVar, a);
            } else if (dVar.bUM()) {
                return d.this.a((org.yaml.snakeyaml.nodes.b) cVar);
            } else {
                return d.this.d(cVar);
            }
        }

        public void a(org.yaml.snakeyaml.nodes.d dVar, Object obj) {
            if (Map.class.isAssignableFrom(dVar.getType())) {
                d.this.a((org.yaml.snakeyaml.nodes.c) dVar, (Map) obj);
            } else if (Set.class.isAssignableFrom(dVar.getType())) {
                d.this.a((org.yaml.snakeyaml.nodes.c) dVar, (Set) obj);
            } else {
                a((org.yaml.snakeyaml.nodes.c) dVar, obj);
            }
        }

        /* Access modifiers changed, original: protected */
        public Object a(org.yaml.snakeyaml.nodes.c cVar, Object obj) {
            d.this.f(cVar);
            Class type = cVar.getType();
            for (e eVar : cVar.bUK()) {
                if (eVar.bUO() instanceof f) {
                    f fVar = (f) eVar.bUO();
                    org.yaml.snakeyaml.nodes.d bUP = eVar.bUP();
                    fVar.ah(String.class);
                    String str = (String) d.this.d((org.yaml.snakeyaml.nodes.d) fVar);
                    try {
                        org.yaml.snakeyaml.b bVar = (org.yaml.snakeyaml.b) d.this.fKt.get(type);
                        org.yaml.snakeyaml.introspector.e f = bVar == null ? f(type, str) : bVar.nR(str);
                        if (f.isWritable()) {
                            bUP.ah(f.getType());
                            if (!((bVar != null ? bVar.a(str, bUP) : false) || bUP.bUJ() == NodeId.scalar)) {
                                Class[] bUI = f.bUI();
                                if (bUI != null && bUI.length > 0) {
                                    if (bUP.bUJ() == NodeId.sequence) {
                                        ((g) bUP).ai(bUI[0]);
                                    } else if (Set.class.isAssignableFrom(bUP.getType())) {
                                        Class cls = bUI[0];
                                        org.yaml.snakeyaml.nodes.c cVar2 = (org.yaml.snakeyaml.nodes.c) bUP;
                                        cVar2.ag(cls);
                                        cVar2.A(Boolean.valueOf(true));
                                    } else if (Map.class.isAssignableFrom(bUP.getType())) {
                                        org.yaml.snakeyaml.nodes.c cVar3 = (org.yaml.snakeyaml.nodes.c) bUP;
                                        cVar3.b(bUI[0], bUI[1]);
                                        cVar3.A(Boolean.valueOf(true));
                                    }
                                }
                            }
                            Object a = bVar != null ? a(bVar, str, bUP) : d.this.d(bUP);
                            if ((f.getType() == Float.TYPE || f.getType() == Float.class) && (a instanceof Double)) {
                                a = Float.valueOf(((Double) a).floatValue());
                            }
                            if (f.getType() == String.class && h.fLv.equals(bUP.bUl()) && (a instanceof byte[])) {
                                a = new String((byte[]) a);
                            }
                            if (bVar == null || !bVar.b(obj, str, a)) {
                                f.set(obj, a);
                            }
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("No writable property '");
                            stringBuilder.append(str);
                            stringBuilder.append("' on class: ");
                            stringBuilder.append(type.getName());
                            throw new YAMLException(stringBuilder.toString());
                        }
                    } catch (DuplicateKeyException e) {
                        throw e;
                    } catch (Exception e2) {
                        Exception exception = e2;
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Cannot create property=");
                        stringBuilder2.append(str);
                        stringBuilder2.append(" for JavaBean=");
                        stringBuilder2.append(obj);
                        throw new ConstructorException(stringBuilder2.toString(), cVar.bUC(), exception.getMessage(), bUP.bUC(), exception);
                    }
                }
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Keys must be scalars but found: ");
                stringBuilder3.append(eVar.bUO());
                throw new YAMLException(stringBuilder3.toString());
            }
            return obj;
        }

        private Object a(org.yaml.snakeyaml.b bVar, String str, org.yaml.snakeyaml.nodes.d dVar) {
            Object b = bVar.b(str, dVar);
            if (b == null) {
                return d.this.d(dVar);
            }
            d.this.fKn.put(dVar, b);
            return d.this.e(dVar);
        }

        /* Access modifiers changed, original: protected */
        public org.yaml.snakeyaml.introspector.e f(Class<? extends Object> cls, String str) {
            return d.this.bUq().f(cls, str);
        }
    }

    /* compiled from: Constructor */
    protected class c implements c {
        protected c() {
        }

        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            g gVar = (g) dVar;
            if (Set.class.isAssignableFrom(dVar.getType())) {
                if (!dVar.bUM()) {
                    return d.this.c(gVar);
                }
                throw new YAMLException("Set cannot be recursive.");
            } else if (Collection.class.isAssignableFrom(dVar.getType())) {
                if (dVar.bUM()) {
                    return d.this.a(gVar);
                }
                return d.this.b(gVar);
            } else if (!dVar.getType().isArray()) {
                int i;
                ArrayList<Constructor> arrayList = new ArrayList(gVar.bUK().size());
                int i2 = 0;
                for (Constructor constructor : dVar.getType().getDeclaredConstructors()) {
                    if (gVar.bUK().size() == constructor.getParameterTypes().length) {
                        arrayList.add(constructor);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (arrayList.size() == 1) {
                        Object[] objArr = new Object[gVar.bUK().size()];
                        Constructor constructor2 = (Constructor) arrayList.get(0);
                        for (org.yaml.snakeyaml.nodes.d dVar2 : gVar.bUK()) {
                            dVar2.ah(constructor2.getParameterTypes()[i2]);
                            i = i2 + 1;
                            objArr[i2] = d.this.d(dVar2);
                            i2 = i;
                        }
                        try {
                            constructor2.setAccessible(true);
                            return constructor2.newInstance(objArr);
                        } catch (Exception e) {
                            throw new YAMLException(e);
                        }
                    }
                    List<Object> b = d.this.b(gVar);
                    Class[] clsArr = new Class[b.size()];
                    int i3 = 0;
                    for (Object obj : b) {
                        clsArr[i3] = obj.getClass();
                        i3++;
                    }
                    for (Constructor constructor3 : arrayList) {
                        Object obj2;
                        Class[] parameterTypes = constructor3.getParameterTypes();
                        for (int i4 = 0; i4 < parameterTypes.length; i4++) {
                            if (!af(parameterTypes[i4]).isAssignableFrom(clsArr[i4])) {
                                obj2 = null;
                                continue;
                                break;
                            }
                        }
                        obj2 = 1;
                        continue;
                        if (obj2 != null) {
                            try {
                                constructor3.setAccessible(true);
                                return constructor3.newInstance(b.toArray());
                            } catch (Exception e2) {
                                throw new YAMLException(e2);
                            }
                        }
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No suitable constructor with ");
                stringBuilder.append(String.valueOf(gVar.bUK().size()));
                stringBuilder.append(" arguments found for ");
                stringBuilder.append(dVar.getType());
                throw new YAMLException(stringBuilder.toString());
            } else if (dVar.bUM()) {
                return d.this.b(dVar.getType(), gVar.bUK().size());
            } else {
                return d.this.d(gVar);
            }
        }

        private final Class<? extends Object> af(Class<?> cls) {
            if (!cls.isPrimitive()) {
                return cls;
            }
            if (cls == Integer.TYPE) {
                return Integer.class;
            }
            if (cls == Float.TYPE) {
                return Float.class;
            }
            if (cls == Double.TYPE) {
                return Double.class;
            }
            if (cls == Boolean.TYPE) {
                return Boolean.class;
            }
            if (cls == Long.TYPE) {
                return Long.class;
            }
            if (cls == Character.TYPE) {
                return Character.class;
            }
            if (cls == Short.TYPE) {
                return Short.class;
            }
            if (cls == Byte.TYPE) {
                return Byte.class;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected primitive ");
            stringBuilder.append(cls);
            throw new YAMLException(stringBuilder.toString());
        }

        public void a(org.yaml.snakeyaml.nodes.d dVar, Object obj) {
            g gVar = (g) dVar;
            if (List.class.isAssignableFrom(dVar.getType())) {
                d.this.a(gVar, (Collection) (List) obj);
            } else if (dVar.getType().isArray()) {
                d.this.a(gVar, obj);
            } else {
                throw new YAMLException("Immutable objects cannot be recursive.");
            }
        }
    }

    /* compiled from: Constructor */
    protected class d implements c {
        protected d() {
        }

        private c f(org.yaml.snakeyaml.nodes.d dVar) {
            dVar.ah(d.this.h(dVar));
            return (c) d.this.fKj.get(dVar.bUJ());
        }

        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            try {
                dVar = f(dVar).g(dVar);
                return dVar;
            } catch (ConstructorException e) {
                throw e;
            } catch (Exception e2) {
                Exception exception = e2;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can't construct a java object for ");
                stringBuilder.append(dVar.bUl());
                stringBuilder.append("; exception=");
                stringBuilder.append(exception.getMessage());
                throw new ConstructorException(null, null, stringBuilder.toString(), dVar.bUC(), exception);
            }
        }

        public void a(org.yaml.snakeyaml.nodes.d dVar, Object obj) {
            try {
                f(dVar).a(dVar, obj);
            } catch (Exception e) {
                Exception exception = e;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can't construct a second step for a java object for ");
                stringBuilder.append(dVar.bUl());
                stringBuilder.append("; exception=");
                stringBuilder.append(exception.getMessage());
                throw new ConstructorException(null, null, stringBuilder.toString(), dVar.bUC(), exception);
            }
        }
    }

    /* compiled from: Constructor */
    protected class b extends a {
        protected b() {
        }

        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            f fVar = (f) dVar;
            Class type = fVar.getType();
            try {
                fVar = d.this.a(type, (org.yaml.snakeyaml.nodes.d) fVar, false);
                return fVar;
            } catch (InstantiationException unused) {
                Object a;
                if (type.isPrimitive() || type == String.class || Number.class.isAssignableFrom(type) || type == Boolean.class || Date.class.isAssignableFrom(type) || type == Character.class || type == BigInteger.class || type == BigDecimal.class || Enum.class.isAssignableFrom(type) || h.fLv.equals(fVar.bUl()) || Calendar.class.isAssignableFrom(type) || type == UUID.class) {
                    a = a(type, fVar);
                } else {
                    Constructor constructor = null;
                    int i = 0;
                    for (Constructor constructor2 : type.getDeclaredConstructors()) {
                        if (constructor2.getParameterTypes().length == 1) {
                            i++;
                            constructor = constructor2;
                        }
                    }
                    if (constructor == null) {
                        try {
                            return d.this.a(type, (org.yaml.snakeyaml.nodes.d) fVar, false);
                        } catch (InstantiationException e) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("No single argument constructor found for ");
                            stringBuilder.append(type);
                            stringBuilder.append(" : ");
                            stringBuilder.append(e.getMessage());
                            throw new YAMLException(stringBuilder.toString());
                        }
                    }
                    Object a2;
                    String str = "Can't construct a java object for scalar ";
                    if (i == 1) {
                        a2 = a(constructor.getParameterTypes()[0], fVar);
                    } else {
                        String a3 = d.this.a(fVar);
                        try {
                            constructor = type.getDeclaredConstructor(new Class[]{String.class});
                            a2 = a3;
                        } catch (Exception e2) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(str);
                            stringBuilder2.append(fVar.bUl());
                            stringBuilder2.append("; No String constructor found. Exception=");
                            stringBuilder2.append(e2.getMessage());
                            throw new YAMLException(stringBuilder2.toString(), e2);
                        }
                    }
                    try {
                        constructor.setAccessible(true);
                        a = constructor.newInstance(new Object[]{a2});
                    } catch (Exception e22) {
                        Exception exception = e22;
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(str);
                        stringBuilder3.append(fVar.bUl());
                        stringBuilder3.append("; exception=");
                        stringBuilder3.append(exception.getMessage());
                        throw new ConstructorException(null, null, stringBuilder3.toString(), fVar.bUC(), exception);
                    }
                }
                return a;
            }
        }

        private Object a(Class cls, f fVar) {
            if (cls == String.class) {
                return ((c) d.this.fKk.get(h.fLB)).g(fVar);
            }
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                return ((c) d.this.fKk.get(h.fLz)).g(fVar);
            }
            StringBuilder stringBuilder;
            if (cls == Character.class || cls == Character.TYPE) {
                String str = (String) ((c) d.this.fKk.get(h.fLB)).g(fVar);
                if (str.length() == 0) {
                    return null;
                }
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid node Character: '");
                stringBuilder.append(str);
                stringBuilder.append("'; length: ");
                stringBuilder.append(str.length());
                throw new YAMLException(stringBuilder.toString());
            }
            Date date;
            if (Date.class.isAssignableFrom(cls)) {
                date = (Date) ((c) d.this.fKk.get(h.fLy)).g(fVar);
                if (cls != Date.class) {
                    Object newInstance;
                    try {
                        newInstance = cls.getConstructor(new Class[]{Long.TYPE}).newInstance(new Object[]{Long.valueOf(date.getTime())});
                        return newInstance;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Cannot construct: '");
                        stringBuilder.append(newInstance);
                        stringBuilder.append("'");
                        throw new YAMLException(stringBuilder.toString());
                    }
                }
            } else if (cls == Float.class || cls == Double.class || cls == Float.TYPE || cls == Double.TYPE || cls == BigDecimal.class) {
                if (cls == BigDecimal.class) {
                    return new BigDecimal(fVar.getValue());
                }
                date = ((c) d.this.fKk.get(h.fLx)).g(fVar);
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(((Double) date).floatValue());
                }
            } else if (cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == BigInteger.class || cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Long.TYPE) {
                Object g = ((c) d.this.fKk.get(h.fLw)).g(fVar);
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(g.toString());
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(g.toString());
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(Integer.parseInt(g.toString()));
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(g.toString());
                }
                return new BigInteger(g.toString());
            } else if (Enum.class.isAssignableFrom(cls)) {
                String value = fVar.getValue();
                try {
                    cls = Enum.valueOf(cls, value);
                    return cls;
                } catch (Exception unused2) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Unable to find enum value '");
                    stringBuilder2.append(value);
                    stringBuilder2.append("' for enum class: ");
                    stringBuilder2.append(cls.getName());
                    throw new YAMLException(stringBuilder2.toString());
                }
            } else if (Calendar.class.isAssignableFrom(cls)) {
                m mVar = new m();
                mVar.g(fVar);
                return mVar.getCalendar();
            } else if (Number.class.isAssignableFrom(cls)) {
                return new org.yaml.snakeyaml.constructor.e.d().g(fVar);
            } else {
                if (UUID.class == cls) {
                    return UUID.fromString(fVar.getValue());
                }
                if (d.this.fKk.containsKey(fVar.bUl())) {
                    return ((c) d.this.fKk.get(fVar.bUl())).g(fVar);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported class: ");
                stringBuilder.append(cls);
                throw new YAMLException(stringBuilder.toString());
            }
            return date;
        }
    }

    public d() {
        this(Object.class);
    }

    public d(Class<? extends Object> cls) {
        this(new org.yaml.snakeyaml.b(ae(cls)));
    }

    private static Class<? extends Object> ae(Class<? extends Object> cls) {
        if (cls != null) {
            return cls;
        }
        throw new NullPointerException("Root class must be provided.");
    }

    public d(org.yaml.snakeyaml.b bVar) {
        this(bVar, null);
    }

    public d(org.yaml.snakeyaml.b bVar, Collection<org.yaml.snakeyaml.b> collection) {
        if (bVar != null) {
            this.fKk.put(null, new d());
            if (!Object.class.equals(bVar.getType())) {
                this.fKr = new h(bVar.getType());
            }
            this.fKj.put(NodeId.scalar, new b());
            this.fKj.put(NodeId.mapping, new a());
            this.fKj.put(NodeId.sequence, new c());
            a(bVar);
            if (collection != null) {
                for (org.yaml.snakeyaml.b a : collection) {
                    a(a);
                }
                return;
            }
            return;
        }
        throw new NullPointerException("Root type must be provided.");
    }

    /* Access modifiers changed, original: protected */
    public Class<?> h(org.yaml.snakeyaml.nodes.d dVar) {
        Class cls = (Class) this.fKu.get(dVar.bUl());
        if (cls != null) {
            return cls;
        }
        String className = dVar.bUl().getClassName();
        try {
            className = nV(className);
            this.fKu.put(dVar.bUl(), className);
            return className;
        } catch (ClassNotFoundException unused) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Class not found: ");
            stringBuilder.append(className);
            throw new YAMLException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public Class<?> nV(String str) {
        try {
            str = Class.forName(str, true, Thread.currentThread().getContextClassLoader());
            return str;
        } catch (ClassNotFoundException unused) {
            return Class.forName(str);
        }
    }
}
