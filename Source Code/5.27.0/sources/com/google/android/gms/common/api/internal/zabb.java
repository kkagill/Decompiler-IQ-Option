package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zal;

final class zabb extends zal {
    private final /* synthetic */ zaaw zahg;

    zabb(zaaw zaaw, Looper looper) {
        this.zahg = zaaw;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.zahg.zaav();
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder stringBuilder = new StringBuilder(31);
            stringBuilder.append("Unknown message id: ");
            stringBuilder.append(i2);
            Log.w("GoogleApiClientImpl", stringBuilder.toString());
        } else {
            this.zahg.resume();
        }
    }
}
