package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.services.b.d;
import io.fabric.sdk.android.services.network.c;
import io.fabric.sdk.android.services.settings.b;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: AnswersEventsHandler */
class e implements d {
    private final Context context;
    final ScheduledExecutorService executor;
    private final h nP;
    private final f nQ;
    private final ad nR;
    private final c nS;
    private final p nT;
    aa nU = new l();

    public e(h hVar, Context context, f fVar, ad adVar, c cVar, ScheduledExecutorService scheduledExecutorService, p pVar) {
        this.nP = hVar;
        this.context = context;
        this.nQ = fVar;
        this.nR = adVar;
        this.nS = cVar;
        this.executor = scheduledExecutorService;
        this.nT = pVar;
    }

    public void a(a aVar) {
        a(aVar, false, false);
    }

    public void b(a aVar) {
        a(aVar, false, true);
    }

    public void c(a aVar) {
        a(aVar, true, false);
    }

    public void a(final b bVar, final String str) {
        b(new Runnable() {
            public void run() {
                try {
                    e.this.nU.a(bVar, str);
                } catch (Exception e) {
                    io.fabric.sdk.android.c.biX().e("Answers", "Failed to set analytics settings data", e);
                }
            }
        });
    }

    public void disable() {
        b(new Runnable() {
            public void run() {
                try {
                    aa aaVar = e.this.nU;
                    e.this.nU = new l();
                    aaVar.eq();
                } catch (Exception e) {
                    io.fabric.sdk.android.c.biX().e("Answers", "Failed to disable events", e);
                }
            }
        });
    }

    public void ai(String str) {
        b(new Runnable() {
            public void run() {
                try {
                    e.this.nU.ep();
                } catch (Exception e) {
                    io.fabric.sdk.android.c.biX().e("Answers", "Failed to send events files", e);
                }
            }
        });
    }

    public void enable() {
        b(new Runnable() {
            public void run() {
                try {
                    ab eB = e.this.nR.eB();
                    x ei = e.this.nQ.ei();
                    ei.a(e.this);
                    e.this.nU = new m(e.this.nP, e.this.context, e.this.executor, ei, e.this.nS, eB, e.this.nT);
                } catch (Exception e) {
                    io.fabric.sdk.android.c.biX().e("Answers", "Failed to enable events", e);
                }
            }
        });
    }

    public void eh() {
        b(new Runnable() {
            public void run() {
                try {
                    e.this.nU.er();
                } catch (Exception e) {
                    io.fabric.sdk.android.c.biX().e("Answers", "Failed to flush events", e);
                }
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void a(final a aVar, boolean z, final boolean z2) {
        Runnable anonymousClass6 = new Runnable() {
            public void run() {
                try {
                    e.this.nU.d(aVar);
                    if (z2) {
                        e.this.nU.er();
                    }
                } catch (Exception e) {
                    io.fabric.sdk.android.c.biX().e("Answers", "Failed to process event", e);
                }
            }
        };
        if (z) {
            a(anonymousClass6);
        } else {
            b(anonymousClass6);
        }
    }

    private void a(Runnable runnable) {
        try {
            this.executor.submit(runnable).get();
        } catch (Exception e) {
            io.fabric.sdk.android.c.biX().e("Answers", "Failed to run events task", e);
        }
    }

    private void b(Runnable runnable) {
        try {
            this.executor.submit(runnable);
        } catch (Exception e) {
            io.fabric.sdk.android.c.biX().e("Answers", "Failed to submit events task", e);
        }
    }
}
