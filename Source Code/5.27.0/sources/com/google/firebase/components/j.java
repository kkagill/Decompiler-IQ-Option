package com.google.firebase.components;

import com.google.firebase.b.a;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
final /* synthetic */ class j implements a {
    private final i abZ;
    private final b aca;

    private j(i iVar, b bVar) {
        this.abZ = iVar;
        this.aca = bVar;
    }

    public static a b(i iVar, b bVar) {
        return new j(iVar, bVar);
    }

    public Object get() {
        return this.aca.vX().a(new r(this.aca, this.abZ));
    }
}
