package org.yaml.snakeyaml.constructor;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.introspector.g;
import org.yaml.snakeyaml.nodes.NodeId;
import org.yaml.snakeyaml.nodes.c;
import org.yaml.snakeyaml.nodes.d;
import org.yaml.snakeyaml.nodes.e;
import org.yaml.snakeyaml.nodes.f;
import org.yaml.snakeyaml.nodes.h;

/* compiled from: BaseConstructor */
public abstract class b {
    private boolean fJR = true;
    private boolean fJS = false;
    private g fJV;
    protected final Map<NodeId, c> fKj = new EnumMap(NodeId.class);
    protected final Map<h, c> fKk = new HashMap();
    protected final Map<String, c> fKl = new HashMap();
    protected org.yaml.snakeyaml.composer.a fKm;
    final Map<d, Object> fKn = new HashMap();
    private final Set<d> fKo = new HashSet();
    private final ArrayList<a<Map<Object, Object>, a<Object, Object>>> fKp = new ArrayList();
    private final ArrayList<a<Set<Object>, Object>> fKq = new ArrayList();
    protected h fKr = null;
    private boolean fKs = false;
    protected final Map<Class<? extends Object>, org.yaml.snakeyaml.b> fKt = new HashMap();
    protected final Map<h, Class<? extends Object>> fKu = new HashMap();

    /* compiled from: BaseConstructor */
    private static class a<T, K> {
        private final T fKv;
        private final K fKw;

        public a(T t, K k) {
            this.fKv = t;
            this.fKw = k;
        }

        public K bUs() {
            return this.fKw;
        }

        public T bUt() {
            return this.fKv;
        }
    }

    public b() {
        this.fKt.put(SortedMap.class, new org.yaml.snakeyaml.b(SortedMap.class, h.fLu, TreeMap.class));
        this.fKt.put(SortedSet.class, new org.yaml.snakeyaml.b(SortedSet.class, h.fLs, TreeSet.class));
    }

    public void a(org.yaml.snakeyaml.composer.a aVar) {
        this.fKm = aVar;
    }

    public Object ad(Class<?> cls) {
        d bUo = this.fKm.bUo();
        if (bUo == null || h.fLA.equals(bUo.bUl())) {
            return ((c) this.fKk.get(h.fLA)).g(bUo);
        }
        if (Object.class != cls) {
            bUo.a(new h((Class) cls));
        } else {
            h hVar = this.fKr;
            if (hVar != null) {
                bUo.a(hVar);
            }
        }
        return c(bUo);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object c(d dVar) {
        try {
            Object d = d(dVar);
            bUp();
            this.fKn.clear();
            this.fKo.clear();
            return d;
        } catch (RuntimeException e) {
            if (!this.fJS || (e instanceof YAMLException)) {
                throw e;
            }
            throw new YAMLException(e);
        }
    }

    private void bUp() {
        Iterator it;
        a aVar;
        if (!this.fKp.isEmpty()) {
            it = this.fKp.iterator();
            while (it.hasNext()) {
                aVar = (a) it.next();
                a aVar2 = (a) aVar.bUs();
                ((Map) aVar.bUt()).put(aVar2.bUt(), aVar2.bUs());
            }
            this.fKp.clear();
        }
        if (!this.fKq.isEmpty()) {
            it = this.fKq.iterator();
            while (it.hasNext()) {
                aVar = (a) it.next();
                ((Set) aVar.bUt()).add(aVar.bUs());
            }
            this.fKq.clear();
        }
    }

    /* Access modifiers changed, original: protected */
    public Object d(d dVar) {
        if (this.fKn.containsKey(dVar)) {
            return this.fKn.get(dVar);
        }
        return e(dVar);
    }

    /* Access modifiers changed, original: protected */
    public Object e(d dVar) {
        if (this.fKo.contains(dVar)) {
            throw new ConstructorException(null, null, "found unconstructable recursive node", dVar.bUC());
        }
        this.fKo.add(dVar);
        c f = f(dVar);
        Object g = this.fKn.containsKey(dVar) ? this.fKn.get(dVar) : f.g(dVar);
        b(dVar, g);
        this.fKn.put(dVar, g);
        this.fKo.remove(dVar);
        if (dVar.bUM()) {
            f.a(dVar, g);
        }
        return g;
    }

    /* Access modifiers changed, original: protected */
    public c f(d dVar) {
        if (dVar.bUN()) {
            return (c) this.fKj.get(dVar.bUJ());
        }
        c cVar = (c) this.fKk.get(dVar.bUl());
        if (cVar != null) {
            return cVar;
        }
        for (String str : this.fKl.keySet()) {
            if (dVar.bUl().startsWith(str)) {
                return (c) this.fKl.get(str);
            }
        }
        return (c) this.fKk.get(null);
    }

    /* Access modifiers changed, original: protected */
    public String a(f fVar) {
        return fVar.getValue();
    }

    /* Access modifiers changed, original: protected */
    public List<Object> nO(int i) {
        return new ArrayList(i);
    }

    /* Access modifiers changed, original: protected */
    public Set<Object> nP(int i) {
        return new LinkedHashSet(i);
    }

    /* Access modifiers changed, original: protected */
    public Map<Object, Object> nQ(int i) {
        return new LinkedHashMap(i);
    }

    /* Access modifiers changed, original: protected */
    public Object b(Class<?> cls, int i) {
        return Array.newInstance(cls.getComponentType(), i);
    }

    /* Access modifiers changed, original: protected */
    public Object b(d dVar, Object obj) {
        Class type = dVar.getType();
        return this.fKt.containsKey(type) ? ((org.yaml.snakeyaml.b) this.fKt.get(type)).eh(obj) : obj;
    }

    /* Access modifiers changed, original: protected */
    public Object a(d dVar) {
        try {
            return a(Object.class, dVar);
        } catch (InstantiationException e) {
            throw new YAMLException(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(Class<?> cls, d dVar) {
        return a((Class) cls, dVar, true);
    }

    /* Access modifiers changed, original: protected */
    public Object a(Class<?> cls, d dVar, boolean z) {
        Class type = dVar.getType();
        if (this.fKt.containsKey(type)) {
            Object a = ((org.yaml.snakeyaml.b) this.fKt.get(type)).a(dVar);
            if (a != null) {
                return a;
            }
        }
        if (z && cls.isAssignableFrom(type) && !Modifier.isAbstract(type.getModifiers())) {
            try {
                Constructor declaredConstructor = type.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(new Object[0]);
            } catch (NoSuchMethodException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("NoSuchMethodException:");
                stringBuilder.append(e.getLocalizedMessage());
                throw new InstantiationException(stringBuilder.toString());
            } catch (Exception e2) {
                throw new YAMLException(e2);
            }
        }
        throw new InstantiationException();
    }

    /* Access modifiers changed, original: protected */
    public Set<Object> a(org.yaml.snakeyaml.nodes.b<?> bVar) {
        try {
            return (Set) a(Set.class, (d) bVar);
        } catch (InstantiationException unused) {
            return nP(bVar.bUK().size());
        }
    }

    /* Access modifiers changed, original: protected */
    public List<Object> a(org.yaml.snakeyaml.nodes.g gVar) {
        try {
            return (List) a(List.class, (d) gVar);
        } catch (InstantiationException unused) {
            return nO(gVar.bUK().size());
        }
    }

    /* Access modifiers changed, original: protected */
    public Map<Object, Object> c(c cVar) {
        try {
            return (Map) a(Map.class, (d) cVar);
        } catch (InstantiationException unused) {
            return nQ(cVar.bUK().size());
        }
    }

    /* Access modifiers changed, original: protected */
    public List<? extends Object> b(org.yaml.snakeyaml.nodes.g gVar) {
        Collection a = a(gVar);
        a(gVar, a);
        return a;
    }

    /* Access modifiers changed, original: protected */
    public Set<? extends Object> c(org.yaml.snakeyaml.nodes.g gVar) {
        Collection a = a((org.yaml.snakeyaml.nodes.b) gVar);
        a(gVar, a);
        return a;
    }

    /* Access modifiers changed, original: protected */
    public Object d(org.yaml.snakeyaml.nodes.g gVar) {
        return a(gVar, b(gVar.getType(), gVar.bUK().size()));
    }

    /* Access modifiers changed, original: protected */
    public void a(org.yaml.snakeyaml.nodes.g gVar, Collection<Object> collection) {
        for (d d : gVar.bUK()) {
            collection.add(d(d));
        }
    }

    /* Access modifiers changed, original: protected */
    public Object a(org.yaml.snakeyaml.nodes.g gVar, Object obj) {
        Class componentType = gVar.getType().getComponentType();
        int i = 0;
        for (d dVar : gVar.bUK()) {
            if (dVar.getType() == Object.class) {
                dVar.ah(componentType);
            }
            Object d = d(dVar);
            if (!componentType.isPrimitive()) {
                Array.set(obj, i, d);
            } else if (d == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to construct element value for ");
                stringBuilder.append(dVar);
                throw new NullPointerException(stringBuilder.toString());
            } else if (Byte.TYPE.equals(componentType)) {
                Array.setByte(obj, i, ((Number) d).byteValue());
            } else if (Short.TYPE.equals(componentType)) {
                Array.setShort(obj, i, ((Number) d).shortValue());
            } else if (Integer.TYPE.equals(componentType)) {
                Array.setInt(obj, i, ((Number) d).intValue());
            } else if (Long.TYPE.equals(componentType)) {
                Array.setLong(obj, i, ((Number) d).longValue());
            } else if (Float.TYPE.equals(componentType)) {
                Array.setFloat(obj, i, ((Number) d).floatValue());
            } else if (Double.TYPE.equals(componentType)) {
                Array.setDouble(obj, i, ((Number) d).doubleValue());
            } else if (Character.TYPE.equals(componentType)) {
                Array.setChar(obj, i, ((Character) d).charValue());
            } else if (Boolean.TYPE.equals(componentType)) {
                Array.setBoolean(obj, i, ((Boolean) d).booleanValue());
            } else {
                throw new YAMLException("unexpected primitive type");
            }
            i++;
        }
        return obj;
    }

    /* Access modifiers changed, original: protected */
    public Set<Object> d(c cVar) {
        Set a = a((org.yaml.snakeyaml.nodes.b) cVar);
        a(cVar, a);
        return a;
    }

    /* Access modifiers changed, original: protected */
    public Map<Object, Object> e(c cVar) {
        Map c = c(cVar);
        a(cVar, c);
        return c;
    }

    /* Access modifiers changed, original: protected */
    public void a(c cVar, Map<Object, Object> map) {
        for (e eVar : cVar.bUK()) {
            d bUO = eVar.bUO();
            d bUP = eVar.bUP();
            Object d = d(bUO);
            if (d != null) {
                try {
                    d.hashCode();
                } catch (Exception e) {
                    Mark bUC = cVar.bUC();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("found unacceptable key ");
                    stringBuilder.append(d);
                    throw new ConstructorException("while constructing a mapping", bUC, stringBuilder.toString(), eVar.bUO().bUC(), e);
                }
            }
            Object d2 = d(bUP);
            if (bUO.bUM()) {
                a((Map) map, d, d2);
            } else {
                map.put(d, d2);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(Map<Object, Object> map, Object obj, Object obj2) {
        this.fKp.add(0, new a(map, new a(obj, obj2)));
    }

    /* Access modifiers changed, original: protected */
    public void a(c cVar, Set<Object> set) {
        for (e eVar : cVar.bUK()) {
            d bUO = eVar.bUO();
            Object d = d(bUO);
            if (d != null) {
                try {
                    d.hashCode();
                } catch (Exception e) {
                    Mark bUC = cVar.bUC();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("found unacceptable key ");
                    stringBuilder.append(d);
                    throw new ConstructorException("while constructing a Set", bUC, stringBuilder.toString(), eVar.bUO().bUC(), e);
                }
            }
            if (bUO.bUM()) {
                e(set, d);
            } else {
                set.add(d);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void e(Set<Object> set, Object obj) {
        this.fKq.add(0, new a(set, obj));
    }

    public void a(g gVar) {
        this.fJV = gVar;
        this.fKs = true;
        for (org.yaml.snakeyaml.b a : this.fKt.values()) {
            a.a(gVar);
        }
    }

    public final g bUq() {
        if (this.fJV == null) {
            this.fJV = new g();
        }
        return this.fJV;
    }

    public org.yaml.snakeyaml.b a(org.yaml.snakeyaml.b bVar) {
        if (bVar != null) {
            this.fKu.put(bVar.bUl(), bVar.getType());
            bVar.a(bUq());
            return (org.yaml.snakeyaml.b) this.fKt.put(bVar.getType(), bVar);
        }
        throw new NullPointerException("TypeDescription is required.");
    }

    public final boolean bUr() {
        return this.fKs;
    }

    public boolean bUj() {
        return this.fJR;
    }

    public void hs(boolean z) {
        this.fJR = z;
    }

    public void ht(boolean z) {
        this.fJS = z;
    }
}
