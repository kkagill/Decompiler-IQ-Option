package com.google.firebase.components;

import com.google.firebase.b.a;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
class q<T> implements a<T> {
    private static final Object acn = new Object();
    private volatile a<T> aco;
    private volatile Object instance = acn;

    q(a<T> aVar) {
        this.aco = aVar;
    }

    public T get() {
        T t = this.instance;
        if (t == acn) {
            synchronized (this) {
                t = this.instance;
                if (t == acn) {
                    t = this.aco.get();
                    this.instance = t;
                    this.aco = null;
                }
            }
        }
        return t;
    }
}
