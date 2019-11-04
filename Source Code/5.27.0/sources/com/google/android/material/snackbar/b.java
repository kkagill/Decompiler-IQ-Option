package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager */
class b {
    private static b Nu;
    private b Nv;
    private b Nw;
    private final Handler handler = new Handler(Looper.getMainLooper(), new Callback() {
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.b((b) message.obj);
            return true;
        }
    });
    private final Object lock = new Object();

    /* compiled from: SnackbarManager */
    interface a {
        void aV(int i);

        void show();
    }

    /* compiled from: SnackbarManager */
    private static class b {
        final WeakReference<a> Ny;
        boolean Nz;
        int duration;

        b(int i, a aVar) {
            this.Ny = new WeakReference(aVar);
            this.duration = i;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean h(a aVar) {
            return aVar != null && this.Ny.get() == aVar;
        }
    }

    static b ou() {
        if (Nu == null) {
            Nu = new b();
        }
        return Nu;
    }

    private b() {
    }

    public void a(int i, a aVar) {
        synchronized (this.lock) {
            if (f(aVar)) {
                this.Nv.duration = i;
                this.handler.removeCallbacksAndMessages(this.Nv);
                a(this.Nv);
                return;
            }
            if (g(aVar)) {
                this.Nw.duration = i;
            } else {
                this.Nw = new b(i, aVar);
            }
            if (this.Nv == null || !a(this.Nv, 4)) {
                this.Nv = null;
                ov();
                return;
            }
        }
    }

    public void a(a aVar, int i) {
        synchronized (this.lock) {
            if (f(aVar)) {
                a(this.Nv, i);
            } else if (g(aVar)) {
                a(this.Nw, i);
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.lock) {
            if (f(aVar)) {
                this.Nv = null;
                if (this.Nw != null) {
                    ov();
                }
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.lock) {
            if (f(aVar)) {
                a(this.Nv);
            }
        }
    }

    public void c(a aVar) {
        synchronized (this.lock) {
            if (f(aVar) && !this.Nv.Nz) {
                this.Nv.Nz = true;
                this.handler.removeCallbacksAndMessages(this.Nv);
            }
        }
    }

    public void d(a aVar) {
        synchronized (this.lock) {
            if (f(aVar) && this.Nv.Nz) {
                this.Nv.Nz = false;
                a(this.Nv);
            }
        }
    }

    public boolean e(a aVar) {
        boolean z;
        synchronized (this.lock) {
            if (!f(aVar)) {
                if (!g(aVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    private void ov() {
        b bVar = this.Nw;
        if (bVar != null) {
            this.Nv = bVar;
            this.Nw = null;
            a aVar = (a) this.Nv.Ny.get();
            if (aVar != null) {
                aVar.show();
            } else {
                this.Nv = null;
            }
        }
    }

    private boolean a(b bVar, int i) {
        a aVar = (a) bVar.Ny.get();
        if (aVar == null) {
            return false;
        }
        this.handler.removeCallbacksAndMessages(bVar);
        aVar.aV(i);
        return true;
    }

    private boolean f(a aVar) {
        b bVar = this.Nv;
        return bVar != null && bVar.h(aVar);
    }

    private boolean g(a aVar) {
        b bVar = this.Nw;
        return bVar != null && bVar.h(aVar);
    }

    private void a(b bVar) {
        if (bVar.duration != -2) {
            int i = 2750;
            if (bVar.duration > 0) {
                i = bVar.duration;
            } else if (bVar.duration == -1) {
                i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            }
            this.handler.removeCallbacksAndMessages(bVar);
            Handler handler = this.handler;
            handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), (long) i);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void b(b bVar) {
        synchronized (this.lock) {
            if (this.Nv == bVar || this.Nw == bVar) {
                a(bVar, 2);
            }
        }
    }
}
