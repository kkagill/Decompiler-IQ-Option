package com.neovisionaries.ws.client;

import java.net.InetSocketAddress;

/* compiled from: Address */
class a {
    private final String ezt;
    private final int ezu;
    private transient String ezv;

    a(String str, int i) {
        this.ezt = str;
        this.ezu = i;
    }

    /* Access modifiers changed, original: 0000 */
    public InetSocketAddress beN() {
        return new InetSocketAddress(this.ezt, this.ezu);
    }

    /* Access modifiers changed, original: 0000 */
    public String getHostname() {
        return this.ezt;
    }

    public String toString() {
        if (this.ezv == null) {
            this.ezv = String.format("%s:%d", new Object[]{this.ezt, Integer.valueOf(this.ezu)});
        }
        return this.ezv;
    }
}
