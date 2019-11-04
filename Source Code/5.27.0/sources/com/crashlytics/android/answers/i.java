package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.b.f;
import io.fabric.sdk.android.services.concurrency.a.b;
import io.fabric.sdk.android.services.concurrency.a.c;
import io.fabric.sdk.android.services.concurrency.a.e;
import java.io.File;
import java.util.List;

/* compiled from: AnswersRetryFilesSender */
class i implements f {
    private final y od;
    private final v oe;

    public static i a(y yVar) {
        return new i(yVar, new v(new e(new u(new c(1000, 8), 0.1d), new b(5))));
    }

    i(y yVar, v vVar) {
        this.od = yVar;
        this.oe = vVar;
    }

    public boolean f(List<File> list) {
        long nanoTime = System.nanoTime();
        if (this.oe.d(nanoTime)) {
            if (this.od.f(list)) {
                this.oe.reset();
                return true;
            }
            this.oe.e(nanoTime);
        }
        return false;
    }
}
