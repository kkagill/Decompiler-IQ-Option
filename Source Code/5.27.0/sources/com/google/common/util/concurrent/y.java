package com.google.common.util.concurrent;

/* compiled from: Platform */
final class y {
    static boolean e(Throwable th, Class<? extends Throwable> cls) {
        return cls.isInstance(th);
    }
}
