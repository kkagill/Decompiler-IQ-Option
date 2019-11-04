package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

final /* synthetic */ class al implements ThreadFactory {
    static final ThreadFactory aea = new al();

    private al() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
