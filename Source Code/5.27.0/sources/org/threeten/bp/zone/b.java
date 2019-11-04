package org.threeten.bp.zone;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ZoneRulesInitializer */
public abstract class b {
    public static final b fJw = new a();
    private static final AtomicBoolean fJx = new AtomicBoolean(false);
    private static final AtomicReference<b> fJy = new AtomicReference();

    /* compiled from: ZoneRulesInitializer */
    static class a extends b {
        /* Access modifiers changed, original: protected */
        public void bdk() {
        }

        a() {
        }
    }

    /* compiled from: ZoneRulesInitializer */
    static class b extends b {
        b() {
        }

        /* Access modifiers changed, original: protected */
        public void bdk() {
            Iterator it = ServiceLoader.load(c.class, c.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    c.a((c) it.next());
                } catch (ServiceConfigurationError e) {
                    if (!(e.getCause() instanceof SecurityException)) {
                        throw e;
                    }
                }
            }
        }
    }

    public abstract void bdk();

    public static void a(b bVar) {
        if (fJx.get()) {
            throw new IllegalStateException("Already initialized");
        } else if (!fJy.compareAndSet(null, bVar)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    static void initialize() {
        if (fJx.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        fJy.compareAndSet(null, new b());
        ((b) fJy.get()).bdk();
    }
}
