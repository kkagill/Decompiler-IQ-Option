package com.iqoption.app.managers;

import java.util.HashSet;
import java.util.Set;

/* compiled from: Starter */
public final class g {
    private final a auG;
    private final Set<Runnable> auH;
    private final Runnable auI = new Runnable() {
        public void run() {
            if (g.a(g.this) == 0 && g.this.auG != null) {
                g.this.auG.Hk();
            }
            g.this.auH.remove(this);
        }
    };
    private int count;

    /* compiled from: Starter */
    public interface a {
        void Hj();

        void Hk();
    }

    static /* synthetic */ int a(g gVar) {
        int i = gVar.count - 1;
        gVar.count = i;
        return i;
    }

    public g(a aVar) {
        this.auG = aVar;
        this.auH = new HashSet();
    }

    public void start() {
        if (this.auH.remove(this.auI)) {
            com.iqoption.core.c.a.biN.removeCallbacks(this.auI);
            return;
        }
        int i = this.count;
        this.count = i + 1;
        if (i == 0) {
            a aVar = this.auG;
            if (aVar != null) {
                aVar.Hj();
            }
        }
    }

    public void stop() {
        this.auH.add(this.auI);
        com.iqoption.core.c.a.biN.execute(this.auI);
    }

    public boolean isStarted() {
        return this.count > 0 && this.auH.isEmpty();
    }
}
