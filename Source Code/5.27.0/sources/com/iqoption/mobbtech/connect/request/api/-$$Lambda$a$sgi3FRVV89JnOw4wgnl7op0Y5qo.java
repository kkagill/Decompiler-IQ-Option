package com.iqoption.mobbtech.connect.request.api;

import android.content.Context;
import com.google.common.util.concurrent.h;
import com.google.common.util.concurrent.t;
import com.iqoption.app.b;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$a$sgi3FRVV89JnOw4wgnl7op0Y5qo implements h {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ -$$Lambda$a$sgi3FRVV89JnOw4wgnl7op0Y5qo(Context context, String str) {
        this.f$0 = context;
        this.f$1 = str;
    }

    public final t apply(Object obj) {
        return a.c(this.f$0, this.f$1, b.aK(this.f$0).getUserId());
    }
}
