package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class l<T> {
    final int adc;
    final TaskCompletionSource<T> ade = new TaskCompletionSource();
    final Bundle adf;
    final int what;

    l(int i, int i2, Bundle bundle) {
        this.adc = i;
        this.what = i2;
        this.adf = bundle;
    }

    public abstract boolean wE();

    public abstract void zzb(Bundle bundle);

    /* Access modifiers changed, original: final */
    public final void finish(T t) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 16) + String.valueOf(valueOf2).length());
            stringBuilder.append("Finishing ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with ");
            stringBuilder.append(valueOf2);
            Log.d(str, stringBuilder.toString());
        }
        this.ade.setResult(t);
    }

    /* Access modifiers changed, original: final */
    public final void a(zzam zzam) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzam);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 14) + String.valueOf(valueOf2).length());
            stringBuilder.append("Failing ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with ");
            stringBuilder.append(valueOf2);
            Log.d(str, stringBuilder.toString());
        }
        this.ade.setException(zzam);
    }

    public String toString() {
        int i = this.what;
        int i2 = this.adc;
        boolean wE = wE();
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Request { what=");
        stringBuilder.append(i);
        stringBuilder.append(" id=");
        stringBuilder.append(i2);
        stringBuilder.append(" oneWay=");
        stringBuilder.append(wE);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
