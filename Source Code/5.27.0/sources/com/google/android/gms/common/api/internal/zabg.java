package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zal;

final class zabg extends zal {
    private final /* synthetic */ zabe zahu;

    zabg(zabe zabe, Looper looper) {
        this.zahu = zabe;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((zabf) message.obj).zac(this.zahu);
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder stringBuilder = new StringBuilder(31);
            stringBuilder.append("Unknown message id: ");
            stringBuilder.append(i2);
            Log.w("GACStateManager", stringBuilder.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
