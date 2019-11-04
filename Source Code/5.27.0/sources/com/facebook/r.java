package com.facebook;

import android.os.Handler;
import com.facebook.g.b;
import com.facebook.g.e;

/* compiled from: RequestProgress */
class r {
    private final long threshold = f.gW();
    private long uJ;
    private long uK;
    private long uN;
    private final g uk;
    private final Handler us;

    r(Handler handler, g gVar) {
        this.uk = gVar;
        this.us = handler;
    }

    /* Access modifiers changed, original: 0000 */
    public void o(long j) {
        this.uN += j;
        j = this.uN;
        if (j >= this.uJ + this.threshold || j >= this.uK) {
            hS();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void p(long j) {
        this.uK += j;
    }

    /* Access modifiers changed, original: 0000 */
    public void hS() {
        if (this.uN > this.uJ) {
            b hm = this.uk.hm();
            final long j = this.uK;
            if (j > 0 && (hm instanceof e)) {
                final long j2 = this.uN;
                final e eVar = (e) hm;
                Handler handler = this.us;
                if (handler == null) {
                    eVar.b(j2, j);
                } else {
                    handler.post(new Runnable() {
                        public void run() {
                            eVar.b(j2, j);
                        }
                    });
                }
                this.uJ = this.uN;
            }
        }
    }
}
