package com.google.firebase.iid;

import com.google.firebase.a.a;
import com.google.firebase.a.b;

final /* synthetic */ class ar implements b {
    private final a aef;

    ar(a aVar) {
        this.aef = aVar;
    }

    public final void b(a aVar) {
        a aVar2 = this.aef;
        synchronized (aVar2) {
            if (aVar2.isEnabled()) {
                FirebaseInstanceId.this.zzh();
            }
        }
    }
}
