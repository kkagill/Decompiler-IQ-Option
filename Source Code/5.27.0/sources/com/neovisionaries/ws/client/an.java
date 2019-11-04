package com.neovisionaries.ws.client;

/* compiled from: WebSocketThread */
abstract class an extends Thread {
    protected final af dRF;
    private final ThreadType eBy;

    public abstract void beR();

    an(String str, af afVar, ThreadType threadType) {
        super(str);
        this.dRF = afVar;
        this.eBy = threadType;
    }

    public void run() {
        o bfJ = this.dRF.bfJ();
        if (bfJ != null) {
            bfJ.b(this.eBy, (Thread) this);
        }
        beR();
        if (bfJ != null) {
            bfJ.c(this.eBy, this);
        }
    }

    public void bgo() {
        o bfJ = this.dRF.bfJ();
        if (bfJ != null) {
            bfJ.a(this.eBy, (Thread) this);
        }
    }
}
