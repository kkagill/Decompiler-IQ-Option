package com.google.firebase.analytics.connector;

import java.util.concurrent.Executor;

final /* synthetic */ class d implements Executor {
    static final Executor abK = new d();

    private d() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
