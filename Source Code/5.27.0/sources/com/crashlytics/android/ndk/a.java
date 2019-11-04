package com.crashlytics.android.ndk;

import android.content.Context;
import com.crashlytics.android.core.o;
import io.fabric.sdk.android.c;
import java.io.File;
import java.io.IOException;
import java.util.TreeSet;

/* compiled from: BreakpadController */
class a implements f {
    private final Context context;
    private final d sl;
    private final b sm;

    a(Context context, d dVar, b bVar) {
        this.context = context;
        this.sl = dVar;
        this.sm = bVar;
    }

    public boolean fY() {
        File ga = this.sm.ga();
        if (ga == null) {
            return false;
        }
        try {
            return this.sl.a(ga.getCanonicalPath(), this.context.getAssets());
        } catch (IOException e) {
            c.biX().e("CrashlyticsNdk", "Error initializing CrashlyticsNdk", e);
            return false;
        }
    }

    public o fZ() {
        TreeSet gb = this.sm.gb();
        if (!gb.isEmpty()) {
            gb.pollFirst();
        }
        return new o(gb);
    }
}
