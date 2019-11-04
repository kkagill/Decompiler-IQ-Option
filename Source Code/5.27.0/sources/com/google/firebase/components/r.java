package com.google.firebase.components;

import com.google.firebase.a.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
final class r extends a {
    private final Set<Class<?>> acp;
    private final Set<Class<?>> acq;
    private final Set<Class<?>> acr;
    private final Set<Class<?>> acs;
    private final Set<Class<?>> act;
    private final e acu;

    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    private static class a implements c {
        private final Set<Class<?>> act;
        private final c acv;

        public a(Set<Class<?>> set, c cVar) {
            this.act = set;
            this.acv = cVar;
        }
    }

    r(b<?> bVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (n nVar : bVar.vW()) {
            if (nVar.wq()) {
                if (nVar.wp()) {
                    hashSet3.add(nVar.wn());
                } else {
                    hashSet.add(nVar.wn());
                }
            } else if (nVar.wp()) {
                hashSet4.add(nVar.wn());
            } else {
                hashSet2.add(nVar.wn());
            }
        }
        if (!bVar.vY().isEmpty()) {
            hashSet.add(c.class);
        }
        this.acp = Collections.unmodifiableSet(hashSet);
        this.acq = Collections.unmodifiableSet(hashSet2);
        this.acr = Collections.unmodifiableSet(hashSet3);
        this.acs = Collections.unmodifiableSet(hashSet4);
        this.act = bVar.vY();
        this.acu = eVar;
    }

    public <T> T get(Class<T> cls) {
        if (this.acp.contains(cls)) {
            Object obj = this.acu.get(cls);
            if (cls.equals(c.class)) {
                return new a(this.act, (c) obj);
            }
            return obj;
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public <T> com.google.firebase.b.a<T> t(Class<T> cls) {
        if (this.acq.contains(cls)) {
            return this.acu.t(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public <T> com.google.firebase.b.a<Set<T>> u(Class<T> cls) {
        if (this.acs.contains(cls)) {
            return this.acu.u(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    public <T> Set<T> p(Class<T> cls) {
        if (this.acr.contains(cls)) {
            return this.acu.p(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }
}
