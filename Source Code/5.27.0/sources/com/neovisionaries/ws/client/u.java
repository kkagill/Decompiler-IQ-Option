package com.neovisionaries.ws.client;

import java.util.Timer;
import java.util.TimerTask;

/* compiled from: PeriodicalFrameSender */
abstract class u {
    private final af dRF;
    private String eAb;
    private Timer eAc;
    private boolean eAd;
    private long eAe;
    private r eAf;

    /* compiled from: PeriodicalFrameSender */
    private final class a extends TimerTask {
        private a() {
        }

        public void run() {
            u.this.beZ();
        }
    }

    public abstract aj x(byte[] bArr);

    public u(af afVar, String str, r rVar) {
        this.dRF = afVar;
        this.eAb = str;
        this.eAf = rVar;
    }

    public void start() {
        r(lt());
    }

    public void stop() {
        synchronized (this) {
            if (this.eAc == null) {
                return;
            }
            this.eAd = false;
            this.eAc.cancel();
        }
    }

    public long lt() {
        long j;
        synchronized (this) {
            j = this.eAe;
        }
        return j;
    }

    public void r(long j) {
        if (j < 0) {
            j = 0;
        }
        synchronized (this) {
            this.eAe = j;
        }
        if (j != 0 && this.dRF.isOpen()) {
            synchronized (this) {
                if (this.eAc == null) {
                    if (this.eAb == null) {
                        this.eAc = new Timer();
                    } else {
                        this.eAc = new Timer(this.eAb);
                    }
                }
                if (!this.eAd) {
                    this.eAd = a(this.eAc, new a(), j);
                }
            }
        }
    }

    private void beZ() {
        synchronized (this) {
            if (this.eAe != 0) {
                if (this.dRF.isOpen()) {
                    this.dRF.C(bfa());
                    this.eAd = a(this.eAc, new a(), this.eAe);
                    return;
                }
            }
            this.eAd = false;
        }
    }

    private aj bfa() {
        return x(bfb());
    }

    private byte[] bfb() {
        r rVar = this.eAf;
        if (rVar == null) {
            return null;
        }
        try {
            return rVar.beO();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean a(Timer timer, a aVar, long j) {
        try {
            timer.schedule(aVar, j);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
