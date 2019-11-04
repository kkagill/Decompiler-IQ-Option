package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Codec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Connection.Builder;
import okhttp3.internal.http2.Http2Connection.Listener;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket.Streams;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

public final class RealConnection extends Listener implements Connection {
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    public int allocationLimit = 1;
    public final List<Reference<StreamAllocation>> allocations = new ArrayList();
    private final ConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    public long idleAtNanos = Long.MAX_VALUE;
    public boolean noNewStreams;
    private Protocol protocol;
    private Socket rawSocket;
    private final Route route;
    private BufferedSink sink;
    private Socket socket;
    private BufferedSource source;
    public int successCount;

    public RealConnection(ConnectionPool connectionPool, Route route) {
        this.connectionPool = connectionPool;
        this.route = route;
    }

    public static RealConnection testConnection(ConnectionPool connectionPool, Route route, Socket socket, long j) {
        RealConnection realConnection = new RealConnection(connectionPool, route);
        realConnection.socket = socket;
        realConnection.idleAtNanos = j;
        return realConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Missing block: B:28:0x00cc, code skipped:
            if (r7.route.requiresTunnel() == false) goto L_0x00e0;
     */
    /* JADX WARNING: Missing block: B:30:0x00d0, code skipped:
            if (r7.rawSocket == null) goto L_0x00d3;
     */
    /* JADX WARNING: Missing block: B:32:0x00df, code skipped:
            throw new okhttp3.internal.connection.RouteException(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARNING: Missing block: B:34:0x00e2, code skipped:
            if (r7.http2Connection == null) goto L_?;
     */
    /* JADX WARNING: Missing block: B:35:0x00e4, code skipped:
            r1 = r7.connectionPool;
     */
    /* JADX WARNING: Missing block: B:36:0x00e6, code skipped:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:38:?, code skipped:
            r7.allocationLimit = r7.http2Connection.maxConcurrentStreams();
     */
    /* JADX WARNING: Missing block: B:39:0x00ef, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:66:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:67:?, code skipped:
            return;
     */
    public void connect(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
        /*
        r16 = this;
        r7 = r16;
        r8 = r22;
        r9 = r23;
        r0 = r7.protocol;
        if (r0 != 0) goto L_0x0151;
    L_0x000a:
        r0 = r7.route;
        r0 = r0.address();
        r0 = r0.connectionSpecs();
        r10 = new okhttp3.internal.connection.ConnectionSpecSelector;
        r10.<init>(r0);
        r1 = r7.route;
        r1 = r1.address();
        r1 = r1.sslSocketFactory();
        if (r1 != 0) goto L_0x0074;
    L_0x0025:
        r1 = okhttp3.ConnectionSpec.CLEARTEXT;
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x0067;
    L_0x002d:
        r0 = r7.route;
        r0 = r0.address();
        r0 = r0.url();
        r0 = r0.host();
        r1 = okhttp3.internal.platform.Platform.get();
        r1 = r1.isCleartextTrafficPermitted(r0);
        if (r1 == 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0086;
    L_0x0046:
        r1 = new okhttp3.internal.connection.RouteException;
        r2 = new java.net.UnknownServiceException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "CLEARTEXT communication to ";
        r3.append(r4);
        r3.append(r0);
        r0 = " not permitted by network security policy";
        r3.append(r0);
        r0 = r3.toString();
        r2.<init>(r0);
        r1.<init>(r2);
        throw r1;
    L_0x0067:
        r0 = new okhttp3.internal.connection.RouteException;
        r1 = new java.net.UnknownServiceException;
        r2 = "CLEARTEXT communication not enabled for client";
        r1.<init>(r2);
        r0.<init>(r1);
        throw r0;
    L_0x0074:
        r0 = r7.route;
        r0 = r0.address();
        r0 = r0.protocols();
        r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE;
        r0 = r0.contains(r1);
        if (r0 != 0) goto L_0x0144;
    L_0x0086:
        r11 = 0;
        r12 = r11;
    L_0x0088:
        r0 = r7.route;	 Catch:{ IOException -> 0x00f9 }
        r0 = r0.requiresTunnel();	 Catch:{ IOException -> 0x00f9 }
        if (r0 == 0) goto L_0x00a9;
    L_0x0090:
        r1 = r16;
        r2 = r17;
        r3 = r18;
        r4 = r19;
        r5 = r22;
        r6 = r23;
        r1.connectTunnel(r2, r3, r4, r5, r6);	 Catch:{ IOException -> 0x00f9 }
        r0 = r7.rawSocket;	 Catch:{ IOException -> 0x00f9 }
        if (r0 != 0) goto L_0x00a4;
    L_0x00a3:
        goto L_0x00c6;
    L_0x00a4:
        r13 = r17;
        r14 = r18;
        goto L_0x00b0;
    L_0x00a9:
        r13 = r17;
        r14 = r18;
        r7.connectSocket(r13, r14, r8, r9);	 Catch:{ IOException -> 0x00f7 }
    L_0x00b0:
        r15 = r20;
        r7.establishProtocol(r10, r15, r8, r9);	 Catch:{ IOException -> 0x00f5 }
        r0 = r7.route;	 Catch:{ IOException -> 0x00f5 }
        r0 = r0.socketAddress();	 Catch:{ IOException -> 0x00f5 }
        r1 = r7.route;	 Catch:{ IOException -> 0x00f5 }
        r1 = r1.proxy();	 Catch:{ IOException -> 0x00f5 }
        r2 = r7.protocol;	 Catch:{ IOException -> 0x00f5 }
        r9.connectEnd(r8, r0, r1, r2);	 Catch:{ IOException -> 0x00f5 }
    L_0x00c6:
        r0 = r7.route;
        r0 = r0.requiresTunnel();
        if (r0 == 0) goto L_0x00e0;
    L_0x00ce:
        r0 = r7.rawSocket;
        if (r0 == 0) goto L_0x00d3;
    L_0x00d2:
        goto L_0x00e0;
    L_0x00d3:
        r0 = new java.net.ProtocolException;
        r1 = "Too many tunnel connections attempted: 21";
        r0.<init>(r1);
        r1 = new okhttp3.internal.connection.RouteException;
        r1.<init>(r0);
        throw r1;
    L_0x00e0:
        r0 = r7.http2Connection;
        if (r0 == 0) goto L_0x00f4;
    L_0x00e4:
        r1 = r7.connectionPool;
        monitor-enter(r1);
        r0 = r7.http2Connection;	 Catch:{ all -> 0x00f1 }
        r0 = r0.maxConcurrentStreams();	 Catch:{ all -> 0x00f1 }
        r7.allocationLimit = r0;	 Catch:{ all -> 0x00f1 }
        monitor-exit(r1);	 Catch:{ all -> 0x00f1 }
        goto L_0x00f4;
    L_0x00f1:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00f1 }
        throw r0;
    L_0x00f4:
        return;
    L_0x00f5:
        r0 = move-exception;
        goto L_0x0100;
    L_0x00f7:
        r0 = move-exception;
        goto L_0x00fe;
    L_0x00f9:
        r0 = move-exception;
        r13 = r17;
        r14 = r18;
    L_0x00fe:
        r15 = r20;
    L_0x0100:
        r1 = r7.socket;
        okhttp3.internal.Util.closeQuietly(r1);
        r1 = r7.rawSocket;
        okhttp3.internal.Util.closeQuietly(r1);
        r7.socket = r11;
        r7.rawSocket = r11;
        r7.source = r11;
        r7.sink = r11;
        r7.handshake = r11;
        r7.protocol = r11;
        r7.http2Connection = r11;
        r1 = r7.route;
        r3 = r1.socketAddress();
        r1 = r7.route;
        r4 = r1.proxy();
        r5 = 0;
        r1 = r23;
        r2 = r22;
        r6 = r0;
        r1.connectFailed(r2, r3, r4, r5, r6);
        if (r12 != 0) goto L_0x0136;
    L_0x012f:
        r1 = new okhttp3.internal.connection.RouteException;
        r1.<init>(r0);
        r12 = r1;
        goto L_0x0139;
    L_0x0136:
        r12.addConnectException(r0);
    L_0x0139:
        if (r21 == 0) goto L_0x0143;
    L_0x013b:
        r0 = r10.connectionFailed(r0);
        if (r0 == 0) goto L_0x0143;
    L_0x0141:
        goto L_0x0088;
    L_0x0143:
        throw r12;
    L_0x0144:
        r0 = new okhttp3.internal.connection.RouteException;
        r1 = new java.net.UnknownServiceException;
        r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS";
        r1.<init>(r2);
        r0.<init>(r1);
        throw r0;
    L_0x0151:
        r0 = new java.lang.IllegalStateException;
        r1 = "already connected";
        r0.<init>(r1);
        goto L_0x015a;
    L_0x0159:
        throw r0;
    L_0x015a:
        goto L_0x0159;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    private void connectTunnel(int i, int i2, int i3, Call call, EventListener eventListener) {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        int i4 = 0;
        while (i4 < 21) {
            connectSocket(i, i2, call, eventListener);
            createTunnelRequest = createTunnel(i2, i3, createTunnelRequest, url);
            if (createTunnelRequest != null) {
                Util.closeQuietly(this.rawSocket);
                this.rawSocket = null;
                this.sink = null;
                this.source = null;
                eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
                i4++;
            } else {
                return;
            }
        }
    }

    private void connectSocket(int i, int i2, Call call, EventListener eventListener) {
        Socket createSocket;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        if (proxy.type() == Type.DIRECT || proxy.type() == Type.HTTP) {
            createSocket = address.socketFactory().createSocket();
        } else {
            createSocket = new Socket(proxy);
        }
        this.rawSocket = createSocket;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        this.rawSocket.setSoTimeout(i2);
        try {
            Platform.get().connectSocket(this.rawSocket, this.route.socketAddress(), i);
            try {
                this.source = Okio.buffer(Okio.source(this.rawSocket));
                this.sink = Okio.buffer(Okio.sink(this.rawSocket));
            } catch (NullPointerException e) {
                if (NPE_THROW_WITH_NULL.equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to connect to ");
            stringBuilder.append(this.route.socketAddress());
            ConnectException connectException = new ConnectException(stringBuilder.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) {
        if (this.route.address().sslSocketFactory() != null) {
            eventListener.secureConnectStart(call);
            connectTls(connectionSpecSelector);
            eventListener.secureConnectEnd(call, this.handshake);
            if (this.protocol == Protocol.HTTP_2) {
                startHttp2(i);
            }
        } else if (this.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            this.socket = this.rawSocket;
            this.protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            startHttp2(i);
        } else {
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
        }
    }

    private void startHttp2(int i) {
        this.socket.setSoTimeout(0);
        this.http2Connection = new Builder(true).socket(this.socket, this.route.address().url().host(), this.source, this.sink).listener(this).pingIntervalMillis(i).build();
        this.http2Connection.start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x013f A:{Catch:{ all -> 0x012f }} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0139 A:{Catch:{ all -> 0x012f }} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0142  */
    private void connectTls(okhttp3.internal.connection.ConnectionSpecSelector r8) {
        /*
        r7 = this;
        r0 = r7.route;
        r0 = r0.address();
        r1 = r0.sslSocketFactory();
        r2 = 0;
        r3 = r7.rawSocket;	 Catch:{ AssertionError -> 0x0132 }
        r4 = r0.url();	 Catch:{ AssertionError -> 0x0132 }
        r4 = r4.host();	 Catch:{ AssertionError -> 0x0132 }
        r5 = r0.url();	 Catch:{ AssertionError -> 0x0132 }
        r5 = r5.port();	 Catch:{ AssertionError -> 0x0132 }
        r6 = 1;
        r1 = r1.createSocket(r3, r4, r5, r6);	 Catch:{ AssertionError -> 0x0132 }
        r1 = (javax.net.ssl.SSLSocket) r1;	 Catch:{ AssertionError -> 0x0132 }
        r8 = r8.configureSecureSocket(r1);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r3 = r8.supportsTlsExtensions();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        if (r3 == 0) goto L_0x0041;
    L_0x002e:
        r3 = okhttp3.internal.platform.Platform.get();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r4 = r0.url();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r4 = r4.host();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r5 = r0.protocols();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r3.configureTlsExtensions(r1, r4, r5);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
    L_0x0041:
        r1.startHandshake();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r3 = r1.getSession();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r4 = okhttp3.Handshake.get(r3);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r5 = r0.hostnameVerifier();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r6 = r0.url();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r6 = r6.host();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r3 = r5.verify(r6, r3);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        if (r3 != 0) goto L_0x00d8;
    L_0x005e:
        r8 = r4.peerCertificates();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r2 = r8.isEmpty();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r3 = "Hostname ";
        if (r2 != 0) goto L_0x00b6;
    L_0x006a:
        r2 = 0;
        r8 = r8.get(r2);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r8 = (java.security.cert.X509Certificate) r8;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r2 = new javax.net.ssl.SSLPeerUnverifiedException;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r4 = new java.lang.StringBuilder;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r4.<init>();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r4.append(r3);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r0 = r0.url();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r0 = r0.host();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r4.append(r0);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r0 = " not verified:\n    certificate: ";
        r4.append(r0);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r0 = okhttp3.CertificatePinner.pin(r8);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r4.append(r0);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r0 = "\n    DN: ";
        r4.append(r0);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r0 = r8.getSubjectDN();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r0 = r0.getName();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r4.append(r0);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r0 = "\n    subjectAltNames: ";
        r4.append(r0);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r8 = okhttp3.internal.tls.OkHostnameVerifier.allSubjectAltNames(r8);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r4.append(r8);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r8 = r4.toString();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r2.<init>(r8);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        throw r2;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
    L_0x00b6:
        r8 = new javax.net.ssl.SSLPeerUnverifiedException;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r2 = new java.lang.StringBuilder;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r2.<init>();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r2.append(r3);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r0 = r0.url();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r0 = r0.host();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r2.append(r0);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r0 = " not verified (no certificates)";
        r2.append(r0);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r0 = r2.toString();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r8.<init>(r0);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        throw r8;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
    L_0x00d8:
        r3 = r0.certificatePinner();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r0 = r0.url();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r0 = r0.host();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r5 = r4.peerCertificates();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r3.check(r0, r5);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r8 = r8.supportsTlsExtensions();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        if (r8 == 0) goto L_0x00f9;
    L_0x00f1:
        r8 = okhttp3.internal.platform.Platform.get();	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r2 = r8.getSelectedProtocol(r1);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
    L_0x00f9:
        r7.socket = r1;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r8 = r7.socket;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r8 = okio.Okio.source(r8);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r8 = okio.Okio.buffer(r8);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r7.source = r8;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r8 = r7.socket;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r8 = okio.Okio.sink(r8);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r8 = okio.Okio.buffer(r8);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r7.sink = r8;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        r7.handshake = r4;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        if (r2 == 0) goto L_0x011c;
    L_0x0117:
        r8 = okhttp3.Protocol.get(r2);	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        goto L_0x011e;
    L_0x011c:
        r8 = okhttp3.Protocol.HTTP_1_1;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
    L_0x011e:
        r7.protocol = r8;	 Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        if (r1 == 0) goto L_0x0129;
    L_0x0122:
        r8 = okhttp3.internal.platform.Platform.get();
        r8.afterHandshake(r1);
    L_0x0129:
        return;
    L_0x012a:
        r8 = move-exception;
        goto L_0x0140;
    L_0x012c:
        r8 = move-exception;
        r2 = r1;
        goto L_0x0133;
    L_0x012f:
        r8 = move-exception;
        r1 = r2;
        goto L_0x0140;
    L_0x0132:
        r8 = move-exception;
    L_0x0133:
        r0 = okhttp3.internal.Util.isAndroidGetsocknameError(r8);	 Catch:{ all -> 0x012f }
        if (r0 == 0) goto L_0x013f;
    L_0x0139:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x012f }
        r0.<init>(r8);	 Catch:{ all -> 0x012f }
        throw r0;	 Catch:{ all -> 0x012f }
    L_0x013f:
        throw r8;	 Catch:{ all -> 0x012f }
    L_0x0140:
        if (r1 == 0) goto L_0x0149;
    L_0x0142:
        r0 = okhttp3.internal.platform.Platform.get();
        r0.afterHandshake(r1);
    L_0x0149:
        okhttp3.internal.Util.closeQuietly(r1);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connectTls(okhttp3.internal.connection.ConnectionSpecSelector):void");
    }

    private Request createTunnel(int i, int i2, Request request, HttpUrl httpUrl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CONNECT ");
        stringBuilder.append(Util.hostHeader(httpUrl, true));
        stringBuilder.append(" HTTP/1.1");
        String stringBuilder2 = stringBuilder.toString();
        while (true) {
            Http1Codec http1Codec = new Http1Codec(null, null, this.source, this.sink);
            this.source.timeout().timeout((long) i, TimeUnit.MILLISECONDS);
            this.sink.timeout().timeout((long) i2, TimeUnit.MILLISECONDS);
            http1Codec.writeRequest(request.headers(), stringBuilder2);
            http1Codec.finishRequest();
            Response build = http1Codec.readResponseHeaders(false).request(request).build();
            long contentLength = HttpHeaders.contentLength(build);
            if (contentLength == -1) {
                contentLength = 0;
            }
            Source newFixedLengthSource = http1Codec.newFixedLengthSource(contentLength);
            Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            newFixedLengthSource.close();
            int code = build.code();
            if (code != 200) {
                if (code == 407) {
                    Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                    if (authenticate != null) {
                        if ("close".equalsIgnoreCase(build.header("Connection"))) {
                            return authenticate;
                        }
                        request = authenticate;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                }
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Unexpected response code for CONNECT: ");
                stringBuilder3.append(build.code());
                throw new IOException(stringBuilder3.toString());
            } else if (this.source.buffer().exhausted() && this.sink.buffer().exhausted()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private Request createTunnelRequest() {
        Request build = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.hostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent()).build();
        Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1).receivedResponseAtMillis(-1).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return authenticate != null ? authenticate : build;
    }

    public boolean isEligible(Address address, Route route) {
        if (this.allocations.size() >= this.allocationLimit || this.noNewStreams || !Internal.instance.equalsNonHost(this.route.address(), address)) {
            return false;
        }
        if (address.url().host().equals(route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || route == null || route.proxy().type() != Type.DIRECT || this.route.proxy().type() != Type.DIRECT || !this.route.socketAddress().equals(route.socketAddress()) || route.address().hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            address.certificatePinner().check(address.url().host(), handshake().peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean supportsUrl(HttpUrl httpUrl) {
        if (httpUrl.port() != this.route.address().url().port()) {
            return false;
        }
        boolean z = true;
        if (!httpUrl.host().equals(this.route.address().url().host()) && (this.handshake == null || !OkHostnameVerifier.INSTANCE.verify(httpUrl.host(), (X509Certificate) this.handshake.peerCertificates().get(0)))) {
            z = false;
        }
        return z;
    }

    public HttpCodec newCodec(OkHttpClient okHttpClient, Chain chain, StreamAllocation streamAllocation) {
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2Codec(okHttpClient, chain, streamAllocation, http2Connection);
        }
        this.socket.setSoTimeout(chain.readTimeoutMillis());
        this.source.timeout().timeout((long) chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.sink.timeout().timeout((long) chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        return new Http1Codec(okHttpClient, streamAllocation, this.source, this.sink);
    }

    public Streams newWebSocketStreams(StreamAllocation streamAllocation) {
        final StreamAllocation streamAllocation2 = streamAllocation;
        return new Streams(true, this.source, this.sink) {
            public void close() {
                StreamAllocation streamAllocation = streamAllocation2;
                streamAllocation.streamFinished(true, streamAllocation.codec(), -1, null);
            }
        };
    }

    public Route route() {
        return this.route;
    }

    public void cancel() {
        Util.closeQuietly(this.rawSocket);
    }

    public Socket socket() {
        return this.socket;
    }

    public boolean isHealthy(boolean z) {
        if (this.socket.isClosed() || this.socket.isInputShutdown() || this.socket.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return http2Connection.isShutdown() ^ 1;
        }
        if (z) {
            int soTimeout;
            try {
                soTimeout = this.socket.getSoTimeout();
                this.socket.setSoTimeout(1);
                if (this.source.exhausted()) {
                    this.socket.setSoTimeout(soTimeout);
                    return false;
                }
                this.socket.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.socket.setSoTimeout(soTimeout);
            }
        }
        return true;
    }

    public void onStream(Http2Stream http2Stream) {
        http2Stream.close(ErrorCode.REFUSED_STREAM);
    }

    public void onSettings(Http2Connection http2Connection) {
        synchronized (this.connectionPool) {
            this.allocationLimit = http2Connection.maxConcurrentStreams();
        }
    }

    public Handshake handshake() {
        return this.handshake;
    }

    public boolean isMultiplexed() {
        return this.http2Connection != null;
    }

    public Protocol protocol() {
        return this.protocol;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Connection{");
        stringBuilder.append(this.route.address().url().host());
        stringBuilder.append(":");
        stringBuilder.append(this.route.address().url().port());
        stringBuilder.append(", proxy=");
        stringBuilder.append(this.route.proxy());
        stringBuilder.append(" hostAddress=");
        stringBuilder.append(this.route.socketAddress());
        stringBuilder.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        stringBuilder.append(handshake != null ? handshake.cipherSuite() : "none");
        stringBuilder.append(" protocol=");
        stringBuilder.append(this.protocol);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
