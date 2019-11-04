package com.neovisionaries.ws.client;

/* compiled from: CounterPayloadGenerator */
class d implements r {
    private long ezy;

    d() {
    }

    public byte[] beO() {
        return p.kx(String.valueOf(beP()));
    }

    private long beP() {
        this.ezy = Math.max(this.ezy + 1, 1);
        return this.ezy;
    }
}
