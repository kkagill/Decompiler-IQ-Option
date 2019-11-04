package com.google.firebase.iid;

import com.google.firebase.FirebaseApp;
import com.google.firebase.a.d;
import com.google.firebase.components.e;
import com.google.firebase.components.g;

final /* synthetic */ class q implements g {
    static final g adi = new q();

    private q() {
    }

    public final Object a(e eVar) {
        return new FirebaseInstanceId((FirebaseApp) eVar.get(FirebaseApp.class), (d) eVar.get(d.class), (com.google.firebase.c.g) eVar.get(com.google.firebase.c.g.class));
    }
}
