package io.reactivex.internal.util;

import io.reactivex.c.a;
import io.reactivex.internal.schedulers.g;

/* compiled from: BlockingHelper */
public final class c {
    public static void bmC() {
        if (!a.bmE()) {
            return;
        }
        if ((Thread.currentThread() instanceof g) || a.bmF()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Attempt to block on a Scheduler ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" that doesn't support blocking operators as they may lead to deadlock");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
