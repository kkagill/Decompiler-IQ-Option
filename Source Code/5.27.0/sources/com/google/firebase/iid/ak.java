package com.google.firebase.iid;

import java.util.concurrent.Executor;

final /* synthetic */ class ak implements Executor {
    static final Executor adZ = new ak();

    private ak() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
