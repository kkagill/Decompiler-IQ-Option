package com.google.firebase.c;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public class d {
    private static volatile d aeO;
    private final Set<e> aeN = new HashSet();

    d() {
    }

    /* Access modifiers changed, original: 0000 */
    public Set<e> xd() {
        Set unmodifiableSet;
        synchronized (this.aeN) {
            unmodifiableSet = Collections.unmodifiableSet(this.aeN);
        }
        return unmodifiableSet;
    }

    public static d xe() {
        d dVar = aeO;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = aeO;
                if (dVar == null) {
                    dVar = new d();
                    aeO = dVar;
                }
            }
        }
        return dVar;
    }
}
