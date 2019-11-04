package com.google.firebase.components;

import com.google.firebase.a.a;
import com.google.firebase.a.b;
import java.util.Map.Entry;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
final /* synthetic */ class p implements Runnable {
    private final Entry acl;
    private final a acm;

    private p(Entry entry, a aVar) {
        this.acl = entry;
        this.acm = aVar;
    }

    public static Runnable b(Entry entry, a aVar) {
        return new p(entry, aVar);
    }

    public void run() {
        ((b) this.acl.getKey()).b(this.acm);
    }
}
