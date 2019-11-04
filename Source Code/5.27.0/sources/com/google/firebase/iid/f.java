package com.google.firebase.iid;

import android.os.Handler.Callback;
import android.os.Message;

final /* synthetic */ class f implements Callback {
    private final g acT;

    f(g gVar) {
        this.acT = gVar;
    }

    public final boolean handleMessage(Message message) {
        return this.acT.a(message);
    }
}
