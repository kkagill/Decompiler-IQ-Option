package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.firebase_messaging.zze;

final class u extends zze {
    private final /* synthetic */ v adm;

    u(v vVar, Looper looper) {
        this.adm = vVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        this.adm.b(message);
    }
}
