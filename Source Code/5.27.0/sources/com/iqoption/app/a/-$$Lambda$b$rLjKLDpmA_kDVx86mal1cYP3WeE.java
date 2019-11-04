package com.iqoption.app.a;

import android.content.Context;
import android.widget.Toast;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$b$rLjKLDpmA_kDVx86mal1cYP3WeE implements Runnable {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ int f$2;

    public /* synthetic */ -$$Lambda$b$rLjKLDpmA_kDVx86mal1cYP3WeE(Context context, String str, int i) {
        this.f$0 = context;
        this.f$1 = str;
        this.f$2 = i;
    }

    public final void run() {
        Toast.makeText(this.f$0, this.f$1, this.f$2).show();
    }
}
