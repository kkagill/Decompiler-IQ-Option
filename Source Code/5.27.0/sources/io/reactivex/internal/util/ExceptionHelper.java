package io.reactivex.internal.util;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ExceptionHelper {
    public static final Throwable eTR = new Termination();

    static final class Termination extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public Throwable fillInStackTrace() {
            return this;
        }

        Termination() {
            super("No further exceptions");
        }
    }

    public static RuntimeException aj(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    public static <T> boolean a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Object obj;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == eTR) {
                return false;
            }
            if (th2 == null) {
                obj = th;
            } else {
                obj = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, obj));
        return true;
    }

    public static <T> Throwable a(AtomicReference<Throwable> atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = eTR;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    public static <E extends Throwable> Exception ak(Throwable th) {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    public static String o(long j, TimeUnit timeUnit) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The source did not signal an event for ");
        stringBuilder.append(j);
        stringBuilder.append(" ");
        stringBuilder.append(timeUnit.toString().toLowerCase());
        stringBuilder.append(" and has been terminated.");
        return stringBuilder.toString();
    }
}
