package com.neovisionaries.ws.client;

import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: SocketConnector */
class ab {
    private final a eAA;
    private final int eAB;
    private final x eAC;
    private final SSLSocketFactory eAD;
    private boolean eAE;
    private Socket eAh;
    private final String ezt;
    private final int ezu;

    ab(Socket socket, a aVar, int i) {
        this(socket, aVar, i, null, null, null, 0);
    }

    ab(Socket socket, a aVar, int i, x xVar, SSLSocketFactory sSLSocketFactory, String str, int i2) {
        this.eAh = socket;
        this.eAA = aVar;
        this.eAB = i;
        this.eAC = xVar;
        this.eAD = sSLSocketFactory;
        this.ezt = str;
        this.ezu = i2;
    }

    public Socket getSocket() {
        return this.eAh;
    }

    public void connect() {
        try {
            bfr();
        } catch (WebSocketException e) {
            try {
                this.eAh.close();
            } catch (IOException unused) {
            }
            throw e;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ab fL(boolean z) {
        this.eAE = z;
        return this;
    }

    private void bfr() {
        Object obj = this.eAC != null ? 1 : null;
        try {
            this.eAh.connect(this.eAA.beN(), this.eAB);
            if (this.eAh instanceof SSLSocket) {
                a((SSLSocket) this.eAh, this.eAA.getHostname());
            }
            if (obj != null) {
                bfs();
            }
        } catch (IOException e) {
            Object[] objArr = new Object[3];
            objArr[0] = obj != null ? "the proxy " : "";
            objArr[1] = this.eAA;
            objArr[2] = e.getMessage();
            throw new WebSocketException(WebSocketError.SOCKET_CONNECT_ERROR, String.format("Failed to connect to %s'%s': %s", objArr), e);
        }
    }

    private void a(SSLSocket sSLSocket, String str) {
        if (this.eAE && !q.ezT.verify(str, sSLSocket.getSession())) {
            throw new HostnameUnverifiedException(sSLSocket, str);
        }
    }

    private void bfs() {
        try {
            this.eAC.amK();
            SSLSocketFactory sSLSocketFactory = this.eAD;
            if (sSLSocketFactory != null) {
                try {
                    this.eAh = sSLSocketFactory.createSocket(this.eAh, this.ezt, this.ezu, true);
                    try {
                        ((SSLSocket) this.eAh).startHandshake();
                        if (this.eAh instanceof SSLSocket) {
                            a((SSLSocket) this.eAh, this.eAC.bff());
                        }
                    } catch (IOException e) {
                        throw new WebSocketException(WebSocketError.SSL_HANDSHAKE_ERROR, String.format("SSL handshake with the WebSocket endpoint (%s) failed: %s", new Object[]{this.eAA, e.getMessage()}), e);
                    }
                } catch (IOException e2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to overlay an existing socket: ");
                    stringBuilder.append(e2.getMessage());
                    throw new WebSocketException(WebSocketError.SOCKET_OVERLAY_ERROR, stringBuilder.toString(), e2);
                }
            }
        } catch (IOException e3) {
            throw new WebSocketException(WebSocketError.PROXY_HANDSHAKE_ERROR, String.format("Handshake with the proxy server (%s) failed: %s", new Object[]{this.eAA, e3.getMessage()}), e3);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bft() {
        try {
            this.eAh.close();
        } catch (Throwable unused) {
        }
    }
}
