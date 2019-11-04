package com.google.firebase.components;

import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
abstract class a implements e {
    a() {
    }

    public <T> T get(Class<T> cls) {
        com.google.firebase.b.a t = t(cls);
        if (t == null) {
            return null;
        }
        return t.get();
    }

    public <T> Set<T> p(Class<T> cls) {
        return (Set) u(cls).get();
    }
}
