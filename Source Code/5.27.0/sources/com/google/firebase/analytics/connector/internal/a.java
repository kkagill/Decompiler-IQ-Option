package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.a.d;
import com.google.firebase.analytics.connector.b;
import com.google.firebase.components.e;
import com.google.firebase.components.g;

final /* synthetic */ class a implements g {
    static final g abC = new a();

    private a() {
    }

    public final Object a(e eVar) {
        return b.a((FirebaseApp) eVar.get(FirebaseApp.class), (Context) eVar.get(Context.class), (d) eVar.get(d.class));
    }
}
