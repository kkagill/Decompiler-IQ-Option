package com.iqoption.system;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.a;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$IQFirebaseMessagingService$-44d7r1qlrnG0LteEQdp7wmZfSA implements OnSuccessListener {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ -$$Lambda$IQFirebaseMessagingService$-44d7r1qlrnG0LteEQdp7wmZfSA(Context context) {
        this.f$0 = context;
    }

    public final void onSuccess(Object obj) {
        IQFirebaseMessagingService.b(this.f$0, (a) obj);
    }
}
