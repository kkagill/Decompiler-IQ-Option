package com.google.firebase.components;

import com.google.firebase.b.a;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
final /* synthetic */ class k implements a {
    private final Set acb;

    private k(Set set) {
        this.acb = set;
    }

    public static a f(Set set) {
        return new k(set);
    }

    public Object get() {
        return i.e(this.acb);
    }
}
