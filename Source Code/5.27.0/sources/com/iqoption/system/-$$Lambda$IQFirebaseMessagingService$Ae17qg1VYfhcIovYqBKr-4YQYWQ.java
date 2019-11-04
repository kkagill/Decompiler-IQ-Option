package com.iqoption.system;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.a;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$IQFirebaseMessagingService$Ae17qg1VYfhcIovYqBKr-4YQYWQ implements OnSuccessListener {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ -$$Lambda$IQFirebaseMessagingService$Ae17qg1VYfhcIovYqBKr-4YQYWQ(Context context) {
        this.f$0 = context;
    }

    public final void onSuccess(Object obj) {
        IQFirebaseMessagingService.a(this.f$0, (a) obj);
    }
}
