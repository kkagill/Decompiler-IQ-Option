package com.google.common.b;

import com.google.common.base.f;
import com.google.common.base.o;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.e;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.aj;
import com.google.common.collect.t;
import com.google.common.collect.w;
import com.google.common.reflect.TypeToken;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: SubscriberRegistry */
final class i {
    private static final e<Class<?>, ImmutableList<Method>> Yo = CacheBuilder.qq().qx().a(new CacheLoader<Class<?>, ImmutableList<Method>>() {
        /* renamed from: h */
        public ImmutableList<Method> at(Class<?> cls) {
            return i.e(cls);
        }
    });
    private static final e<Class<?>, ImmutableSet<Class<?>>> Yp = CacheBuilder.qq().qx().a(new CacheLoader<Class<?>, ImmutableSet<Class<?>>>() {
        /* renamed from: i */
        public ImmutableSet<Class<?>> at(Class<?> cls) {
            return ImmutableSet.n(TypeToken.k(cls).vk().vn());
        }
    });
    private final d Yg;
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<f>> Yn = Maps.ul();

    /* compiled from: SubscriberRegistry */
    private static final class a {
        private final List<Class<?>> Yq;
        private final String name;

        a(Method method) {
            this.name = method.getName();
            this.Yq = Arrays.asList(method.getParameterTypes());
        }

        public int hashCode() {
            return f.hashCode(this.name, this.Yq);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.name.equals(aVar.name) && this.Yq.equals(aVar.Yq)) {
                return true;
            }
            return false;
        }
    }

    i(d dVar) {
        this.Yg = (d) com.google.common.base.i.checkNotNull(dVar);
    }

    /* Access modifiers changed, original: 0000 */
    public void bb(Object obj) {
        for (Entry entry : bi(obj).sg().entrySet()) {
            Class cls = (Class) entry.getKey();
            Collection collection = (Collection) entry.getValue();
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.Yn.get(cls);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                copyOnWriteArraySet = (CopyOnWriteArraySet) com.google.common.base.e.g(this.Yn.putIfAbsent(cls, copyOnWriteArraySet), copyOnWriteArraySet);
            }
            copyOnWriteArraySet.addAll(collection);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bc(Object obj) {
        for (Entry entry : bi(obj).sg().entrySet()) {
            Class cls = (Class) entry.getKey();
            Collection collection = (Collection) entry.getValue();
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.Yn.get(cls);
            if (copyOnWriteArraySet == null || !copyOnWriteArraySet.removeAll(collection)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("missing event subscriber for an annotated method. Is ");
                stringBuilder.append(obj);
                stringBuilder.append(" registered?");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Iterator<f> bh(Object obj) {
        ImmutableSet f = f(obj.getClass());
        ArrayList ca = Lists.ca(f.size());
        aj sK = f.iterator();
        while (sK.hasNext()) {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.Yn.get((Class) sK.next());
            if (copyOnWriteArraySet != null) {
                ca.add(copyOnWriteArraySet.iterator());
            }
        }
        return t.k(ca.iterator());
    }

    private w<Class<?>, f> bi(Object obj) {
        HashMultimap sI = HashMultimap.sI();
        aj sK = d(obj.getClass()).iterator();
        while (sK.hasNext()) {
            Method method = (Method) sK.next();
            sI.i(method.getParameterTypes()[0], f.a(this.Yg, obj, method));
        }
        return sI;
    }

    private static ImmutableList<Method> d(Class<?> cls) {
        return (ImmutableList) Yo.au(cls);
    }

    private static ImmutableList<Method> e(Class<?> cls) {
        Set<Class> vn = TypeToken.k(cls).vk().vn();
        HashMap uk = Maps.uk();
        for (Class declaredMethods : vn) {
            for (Object obj : declaredMethods.getDeclaredMethods()) {
                if (obj.isAnnotationPresent(e.class) && !obj.isSynthetic()) {
                    Class[] parameterTypes = obj.getParameterTypes();
                    boolean z = true;
                    if (parameterTypes.length != 1) {
                        z = false;
                    }
                    com.google.common.base.i.a(z, "Method %s has @Subscribe annotation but has %s parameters.Subscriber methods must have exactly 1 parameter.", obj, parameterTypes.length);
                    a aVar = new a(obj);
                    if (!uk.containsKey(aVar)) {
                        uk.put(aVar, obj);
                    }
                }
            }
        }
        return ImmutableList.m(uk.values());
    }

    static ImmutableSet<Class<?>> f(Class<?> cls) {
        try {
            return (ImmutableSet) Yp.au(cls);
        } catch (UncheckedExecutionException e) {
            throw o.h(e.getCause());
        }
    }
}
