package com.facebook.internal;

import com.facebook.f;
import java.util.concurrent.Executor;

/* compiled from: WorkQueue */
public class ac {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Object Ar;
    private b As;
    private final int At;
    private b Au;
    private int Av;
    private final Executor executor;

    /* compiled from: WorkQueue */
    public interface a {
        boolean cancel();

        void moveToFront();
    }

    /* compiled from: WorkQueue */
    private class b implements a {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private b AA;
        private boolean AB;
        private final Runnable Ay;
        private b Az;

        static {
            Class cls = ac.class;
        }

        b(Runnable runnable) {
            this.Ay = runnable;
        }

        public boolean cancel() {
            synchronized (ac.this.Ar) {
                if (isRunning()) {
                    return false;
                }
                ac.this.As = c(ac.this.As);
                return true;
            }
        }

        public void moveToFront() {
            synchronized (ac.this.Ar) {
                if (!isRunning()) {
                    ac.this.As = c(ac.this.As);
                    ac.this.As = a(ac.this.As, true);
                }
            }
        }

        public boolean isRunning() {
            return this.AB;
        }

        /* Access modifiers changed, original: 0000 */
        public Runnable getCallback() {
            return this.Ay;
        }

        /* Access modifiers changed, original: 0000 */
        public void H(boolean z) {
            this.AB = z;
        }

        /* Access modifiers changed, original: 0000 */
        public b a(b this_, boolean z) {
            if (this_ == null) {
                this.AA = this;
                this.Az = this;
                this_ = this;
            } else {
                this.Az = this_;
                this.AA = this_.AA;
                b bVar = this.Az;
                this.AA.Az = this;
                bVar.AA = this;
            }
            return z ? this : this_;
        }

        /* Access modifiers changed, original: 0000 */
        public b c(b bVar) {
            if (bVar == this) {
                bVar = this.Az;
                if (bVar == this) {
                    bVar = null;
                }
            }
            b bVar2 = this.Az;
            bVar2.AA = this.AA;
            this.AA.Az = bVar2;
            this.AA = null;
            this.Az = null;
            return bVar;
        }
    }

    public ac() {
        this(8);
    }

    public ac(int i) {
        this(i, f.getExecutor());
    }

    public ac(int i, Executor executor) {
        this.Ar = new Object();
        this.Au = null;
        this.Av = 0;
        this.At = i;
        this.executor = executor;
    }

    public a c(Runnable runnable) {
        return a(runnable, true);
    }

    public a a(Runnable runnable, boolean z) {
        b bVar = new b(runnable);
        synchronized (this.Ar) {
            this.As = bVar.a(this.As, z);
        }
        lf();
        return bVar;
    }

    private void lf() {
        a(null);
    }

    private void a(b bVar) {
        synchronized (this.Ar) {
            if (bVar != null) {
                this.Au = bVar.c(this.Au);
                this.Av--;
            }
            if (this.Av < this.At) {
                bVar = this.As;
                if (bVar != null) {
                    this.As = bVar.c(this.As);
                    this.Au = bVar.a(this.Au, false);
                    this.Av++;
                    bVar.H(true);
                }
            } else {
                bVar = null;
            }
        }
        if (bVar != null) {
            b(bVar);
        }
    }

    private void b(final b bVar) {
        this.executor.execute(new Runnable() {
            public void run() {
                try {
                    bVar.getCallback().run();
                } finally {
                    ac.this.a(bVar);
                }
            }
        });
    }
}
