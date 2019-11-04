package com.neovisionaries.ws.client;

/* compiled from: StatusLine */
public class ad {
    private final String eAJ;
    private final String eAK;
    private final String ezv;
    private final int mStatusCode;

    ad(String str) {
        String[] split = str.split(" +", 3);
        if (split.length >= 2) {
            this.eAJ = split[0];
            this.mStatusCode = Integer.parseInt(split[1]);
            this.eAK = split.length == 3 ? split[2] : null;
            this.ezv = str;
            return;
        }
        throw new IllegalArgumentException();
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public String toString() {
        return this.ezv;
    }
}
