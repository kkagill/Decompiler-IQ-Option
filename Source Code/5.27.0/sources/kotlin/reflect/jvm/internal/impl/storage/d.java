package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: NoLock */
class d implements Lock {
    public static final Lock fwH = new d();

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"unit", "kotlin/reflect/jvm/internal/impl/storage/NoLock", "tryLock"}));
    }

    public void lock() {
    }

    public void unlock() {
    }

    private d() {
    }

    public void lockInterruptibly() {
        throw new UnsupportedOperationException("Should not be called");
    }

    public boolean tryLock() {
        throw new UnsupportedOperationException("Should not be called");
    }

    public boolean tryLock(long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            $$$reportNull$$$0(0);
        }
        throw new UnsupportedOperationException("Should not be called");
    }

    public Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }
}
