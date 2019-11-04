package com.neovisionaries.ws.client;

import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: SocketFactorySettings */
class ac {
    private SSLSocketFactory eAD;
    private SocketFactory eAF;
    private SSLContext eAG;

    ac() {
    }

    public SocketFactory fM(boolean z) {
        if (z) {
            SSLContext sSLContext = this.eAG;
            if (sSLContext != null) {
                return sSLContext.getSocketFactory();
            }
            SSLSocketFactory sSLSocketFactory = this.eAD;
            if (sSLSocketFactory != null) {
                return sSLSocketFactory;
            }
            return SSLSocketFactory.getDefault();
        }
        SocketFactory socketFactory = this.eAF;
        if (socketFactory != null) {
            return socketFactory;
        }
        return SocketFactory.getDefault();
    }
}
