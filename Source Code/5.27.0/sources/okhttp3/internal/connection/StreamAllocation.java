package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector.Selection;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

public final class StreamAllocation {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public final Address address;
    public final Call call;
    private final Object callStackTrace;
    private boolean canceled;
    private HttpCodec codec;
    private RealConnection connection;
    private final ConnectionPool connectionPool;
    public final EventListener eventListener;
    private int refusedStreamCount;
    private boolean released;
    private boolean reportedAcquired;
    private Route route;
    private Selection routeSelection;
    private final RouteSelector routeSelector;

    public static final class StreamAllocationReference extends WeakReference<StreamAllocation> {
        public final Object callStackTrace;

        StreamAllocationReference(StreamAllocation streamAllocation, Object obj) {
            super(streamAllocation);
            this.callStackTrace = obj;
        }
    }

    public StreamAllocation(ConnectionPool connectionPool, Address address, Call call, EventListener eventListener, Object obj) {
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
        this.routeSelector = new RouteSelector(address, routeDatabase(), call, eventListener);
        this.callStackTrace = obj;
    }

    public HttpCodec newStream(OkHttpClient okHttpClient, Chain chain, boolean z) {
        try {
            HttpCodec newCodec = findHealthyConnection(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), z).newCodec(okHttpClient, chain, this);
            synchronized (this.connectionPool) {
                this.codec = newCodec;
            }
            return newCodec;
        } catch (IOException e) {
            throw new RouteException(e);
        }
    }

    /* JADX WARNING: Missing block: B:9:0x0012, code skipped:
            if (r0.isHealthy(r9) != false) goto L_0x0018;
     */
    /* JADX WARNING: Missing block: B:11:0x0018, code skipped:
            return r0;
     */
    private okhttp3.internal.connection.RealConnection findHealthyConnection(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
        r3 = this;
    L_0x0000:
        r0 = r3.findConnection(r4, r5, r6, r7, r8);
        r1 = r3.connectionPool;
        monitor-enter(r1);
        r2 = r0.successCount;	 Catch:{ all -> 0x0019 }
        if (r2 != 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        return r0;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        r1 = r0.isHealthy(r9);
        if (r1 != 0) goto L_0x0018;
    L_0x0014:
        r3.noNewStreams();
        goto L_0x0000;
    L_0x0018:
        return r0;
    L_0x0019:
        r4 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        goto L_0x001d;
    L_0x001c:
        throw r4;
    L_0x001d:
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.findHealthyConnection(int, int, int, int, boolean, boolean):okhttp3.internal.connection.RealConnection");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0081 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cb  */
    private okhttp3.internal.connection.RealConnection findConnection(int r19, int r20, int r21, int r22, boolean r23) {
        /*
        r18 = this;
        r1 = r18;
        r2 = r1.connectionPool;
        monitor-enter(r2);
        r0 = r1.released;	 Catch:{ all -> 0x0144 }
        if (r0 != 0) goto L_0x013c;
    L_0x0009:
        r0 = r1.codec;	 Catch:{ all -> 0x0144 }
        if (r0 != 0) goto L_0x0134;
    L_0x000d:
        r0 = r1.canceled;	 Catch:{ all -> 0x0144 }
        if (r0 != 0) goto L_0x012c;
    L_0x0011:
        r0 = r1.connection;	 Catch:{ all -> 0x0144 }
        r3 = r18.releaseIfNoNewStreams();	 Catch:{ all -> 0x0144 }
        r4 = r1.connection;	 Catch:{ all -> 0x0144 }
        r5 = 0;
        if (r4 == 0) goto L_0x0020;
    L_0x001c:
        r0 = r1.connection;	 Catch:{ all -> 0x0144 }
        r4 = r5;
        goto L_0x0022;
    L_0x0020:
        r4 = r0;
        r0 = r5;
    L_0x0022:
        r6 = r1.reportedAcquired;	 Catch:{ all -> 0x0144 }
        if (r6 != 0) goto L_0x0027;
    L_0x0026:
        r4 = r5;
    L_0x0027:
        r6 = 1;
        r7 = 0;
        if (r0 != 0) goto L_0x0043;
    L_0x002b:
        r8 = okhttp3.internal.Internal.instance;	 Catch:{ all -> 0x0144 }
        r9 = r1.connectionPool;	 Catch:{ all -> 0x0144 }
        r10 = r1.address;	 Catch:{ all -> 0x0144 }
        r8.get(r9, r10, r1, r5);	 Catch:{ all -> 0x0144 }
        r8 = r1.connection;	 Catch:{ all -> 0x0144 }
        if (r8 == 0) goto L_0x003e;
    L_0x0038:
        r0 = r1.connection;	 Catch:{ all -> 0x0144 }
        r8 = r0;
        r9 = r5;
        r0 = 1;
        goto L_0x0046;
    L_0x003e:
        r8 = r1.route;	 Catch:{ all -> 0x0144 }
        r9 = r8;
        r8 = r0;
        goto L_0x0045;
    L_0x0043:
        r8 = r0;
        r9 = r5;
    L_0x0045:
        r0 = 0;
    L_0x0046:
        monitor-exit(r2);	 Catch:{ all -> 0x0144 }
        okhttp3.internal.Util.closeQuietly(r3);
        if (r4 == 0) goto L_0x0053;
    L_0x004c:
        r2 = r1.eventListener;
        r3 = r1.call;
        r2.connectionReleased(r3, r4);
    L_0x0053:
        if (r0 == 0) goto L_0x005c;
    L_0x0055:
        r2 = r1.eventListener;
        r3 = r1.call;
        r2.connectionAcquired(r3, r8);
    L_0x005c:
        if (r8 == 0) goto L_0x0067;
    L_0x005e:
        r0 = r1.connection;
        r0 = r0.route();
        r1.route = r0;
        return r8;
    L_0x0067:
        if (r9 != 0) goto L_0x007d;
    L_0x0069:
        r2 = r1.routeSelection;
        if (r2 == 0) goto L_0x0073;
    L_0x006d:
        r2 = r2.hasNext();
        if (r2 != 0) goto L_0x007d;
    L_0x0073:
        r2 = r1.routeSelector;
        r2 = r2.next();
        r1.routeSelection = r2;
        r2 = 1;
        goto L_0x007e;
    L_0x007d:
        r2 = 0;
    L_0x007e:
        r3 = r1.connectionPool;
        monitor-enter(r3);
        r4 = r1.canceled;	 Catch:{ all -> 0x0129 }
        if (r4 != 0) goto L_0x0121;
    L_0x0085:
        if (r2 == 0) goto L_0x00b0;
    L_0x0087:
        r2 = r1.routeSelection;	 Catch:{ all -> 0x0129 }
        r2 = r2.getAll();	 Catch:{ all -> 0x0129 }
        r4 = r2.size();	 Catch:{ all -> 0x0129 }
        r10 = 0;
    L_0x0092:
        if (r10 >= r4) goto L_0x00b0;
    L_0x0094:
        r11 = r2.get(r10);	 Catch:{ all -> 0x0129 }
        r11 = (okhttp3.Route) r11;	 Catch:{ all -> 0x0129 }
        r12 = okhttp3.internal.Internal.instance;	 Catch:{ all -> 0x0129 }
        r13 = r1.connectionPool;	 Catch:{ all -> 0x0129 }
        r14 = r1.address;	 Catch:{ all -> 0x0129 }
        r12.get(r13, r14, r1, r11);	 Catch:{ all -> 0x0129 }
        r12 = r1.connection;	 Catch:{ all -> 0x0129 }
        if (r12 == 0) goto L_0x00ad;
    L_0x00a7:
        r8 = r1.connection;	 Catch:{ all -> 0x0129 }
        r1.route = r11;	 Catch:{ all -> 0x0129 }
        r0 = 1;
        goto L_0x00b0;
    L_0x00ad:
        r10 = r10 + 1;
        goto L_0x0092;
    L_0x00b0:
        if (r0 != 0) goto L_0x00c8;
    L_0x00b2:
        if (r9 != 0) goto L_0x00ba;
    L_0x00b4:
        r2 = r1.routeSelection;	 Catch:{ all -> 0x0129 }
        r9 = r2.next();	 Catch:{ all -> 0x0129 }
    L_0x00ba:
        r1.route = r9;	 Catch:{ all -> 0x0129 }
        r1.refusedStreamCount = r7;	 Catch:{ all -> 0x0129 }
        r8 = new okhttp3.internal.connection.RealConnection;	 Catch:{ all -> 0x0129 }
        r2 = r1.connectionPool;	 Catch:{ all -> 0x0129 }
        r8.<init>(r2, r9);	 Catch:{ all -> 0x0129 }
        r1.acquire(r8, r7);	 Catch:{ all -> 0x0129 }
    L_0x00c8:
        monitor-exit(r3);	 Catch:{ all -> 0x0129 }
        if (r0 == 0) goto L_0x00d3;
    L_0x00cb:
        r0 = r1.eventListener;
        r2 = r1.call;
        r0.connectionAcquired(r2, r8);
        return r8;
    L_0x00d3:
        r0 = r1.call;
        r2 = r1.eventListener;
        r10 = r8;
        r11 = r19;
        r12 = r20;
        r13 = r21;
        r14 = r22;
        r15 = r23;
        r16 = r0;
        r17 = r2;
        r10.connect(r11, r12, r13, r14, r15, r16, r17);
        r0 = r18.routeDatabase();
        r2 = r8.route();
        r0.connected(r2);
        r2 = r1.connectionPool;
        monitor-enter(r2);
        r1.reportedAcquired = r6;	 Catch:{ all -> 0x011e }
        r0 = okhttp3.internal.Internal.instance;	 Catch:{ all -> 0x011e }
        r3 = r1.connectionPool;	 Catch:{ all -> 0x011e }
        r0.put(r3, r8);	 Catch:{ all -> 0x011e }
        r0 = r8.isMultiplexed();	 Catch:{ all -> 0x011e }
        if (r0 == 0) goto L_0x0112;
    L_0x0106:
        r0 = okhttp3.internal.Internal.instance;	 Catch:{ all -> 0x011e }
        r3 = r1.connectionPool;	 Catch:{ all -> 0x011e }
        r4 = r1.address;	 Catch:{ all -> 0x011e }
        r5 = r0.deduplicate(r3, r4, r1);	 Catch:{ all -> 0x011e }
        r8 = r1.connection;	 Catch:{ all -> 0x011e }
    L_0x0112:
        monitor-exit(r2);	 Catch:{ all -> 0x011e }
        okhttp3.internal.Util.closeQuietly(r5);
        r0 = r1.eventListener;
        r2 = r1.call;
        r0.connectionAcquired(r2, r8);
        return r8;
    L_0x011e:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x011e }
        throw r0;
    L_0x0121:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0129 }
        r2 = "Canceled";
        r0.<init>(r2);	 Catch:{ all -> 0x0129 }
        throw r0;	 Catch:{ all -> 0x0129 }
    L_0x0129:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0129 }
        throw r0;
    L_0x012c:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0144 }
        r3 = "Canceled";
        r0.<init>(r3);	 Catch:{ all -> 0x0144 }
        throw r0;	 Catch:{ all -> 0x0144 }
    L_0x0134:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0144 }
        r3 = "codec != null";
        r0.<init>(r3);	 Catch:{ all -> 0x0144 }
        throw r0;	 Catch:{ all -> 0x0144 }
    L_0x013c:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0144 }
        r3 = "released";
        r0.<init>(r3);	 Catch:{ all -> 0x0144 }
        throw r0;	 Catch:{ all -> 0x0144 }
    L_0x0144:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0144 }
        goto L_0x0148;
    L_0x0147:
        throw r0;
    L_0x0148:
        goto L_0x0147;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.findConnection(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    private Socket releaseIfNoNewStreams() {
        RealConnection realConnection = this.connection;
        return (realConnection == null || !realConnection.noNewStreams) ? null : deallocate(false, false, true);
    }

    public void streamFinished(boolean z, HttpCodec httpCodec, long j, IOException iOException) {
        Connection connection;
        Socket deallocate;
        boolean z2;
        this.eventListener.responseBodyEnd(this.call, j);
        synchronized (this.connectionPool) {
            if (httpCodec != null) {
                if (httpCodec == this.codec) {
                    if (!z) {
                        RealConnection realConnection = this.connection;
                        realConnection.successCount++;
                    }
                    connection = this.connection;
                    deallocate = deallocate(z, false, true);
                    if (this.connection != null) {
                        connection = null;
                    }
                    z2 = this.released;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected ");
            stringBuilder.append(this.codec);
            stringBuilder.append(" but was ");
            stringBuilder.append(httpCodec);
            throw new IllegalStateException(stringBuilder.toString());
        }
        Util.closeQuietly(deallocate);
        if (connection != null) {
            this.eventListener.connectionReleased(this.call, connection);
        }
        if (iOException != null) {
            this.eventListener.callFailed(this.call, Internal.instance.timeoutExit(this.call, iOException));
        } else if (z2) {
            Internal.instance.timeoutExit(this.call, null);
            this.eventListener.callEnd(this.call);
        }
    }

    public HttpCodec codec() {
        HttpCodec httpCodec;
        synchronized (this.connectionPool) {
            httpCodec = this.codec;
        }
        return httpCodec;
    }

    private RouteDatabase routeDatabase() {
        return Internal.instance.routeDatabase(this.connectionPool);
    }

    public Route route() {
        return this.route;
    }

    public synchronized RealConnection connection() {
        return this.connection;
    }

    public void release() {
        Connection connection;
        Socket deallocate;
        synchronized (this.connectionPool) {
            connection = this.connection;
            deallocate = deallocate(false, true, false);
            if (this.connection != null) {
                connection = null;
            }
        }
        Util.closeQuietly(deallocate);
        if (connection != null) {
            Internal.instance.timeoutExit(this.call, null);
            this.eventListener.connectionReleased(this.call, connection);
            this.eventListener.callEnd(this.call);
        }
    }

    public void noNewStreams() {
        Connection connection;
        Socket deallocate;
        synchronized (this.connectionPool) {
            connection = this.connection;
            deallocate = deallocate(true, false, false);
            if (this.connection != null) {
                connection = null;
            }
        }
        Util.closeQuietly(deallocate);
        if (connection != null) {
            this.eventListener.connectionReleased(this.call, connection);
        }
    }

    private Socket deallocate(boolean z, boolean z2, boolean z3) {
        if (z3) {
            this.codec = null;
        }
        if (z2) {
            this.released = true;
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (z) {
                realConnection.noNewStreams = true;
            }
            if (this.codec == null && (this.released || this.connection.noNewStreams)) {
                Socket socket;
                release(this.connection);
                if (this.connection.allocations.isEmpty()) {
                    this.connection.idleAtNanos = System.nanoTime();
                    if (Internal.instance.connectionBecameIdle(this.connectionPool, this.connection)) {
                        socket = this.connection.socket();
                        this.connection = null;
                        return socket;
                    }
                }
                socket = null;
                this.connection = null;
                return socket;
            }
        }
        return null;
    }

    public void cancel() {
        HttpCodec httpCodec;
        RealConnection realConnection;
        synchronized (this.connectionPool) {
            this.canceled = true;
            httpCodec = this.codec;
            realConnection = this.connection;
        }
        if (httpCodec != null) {
            httpCodec.cancel();
        } else if (realConnection != null) {
            realConnection.cancel();
        }
    }

    public void streamFailed(IOException iOException) {
        Connection connection;
        Socket deallocate;
        synchronized (this.connectionPool) {
            boolean z;
            if (iOException instanceof StreamResetException) {
                ErrorCode errorCode = ((StreamResetException) iOException).errorCode;
                if (errorCode == ErrorCode.REFUSED_STREAM) {
                    this.refusedStreamCount++;
                    if (this.refusedStreamCount > 1) {
                        this.route = null;
                    }
                    z = false;
                    connection = this.connection;
                    deallocate = deallocate(z, false, true);
                    if (!(this.connection == null && this.reportedAcquired)) {
                        connection = null;
                    }
                } else {
                    if (errorCode != ErrorCode.CANCEL) {
                        this.route = null;
                    }
                    z = false;
                    connection = this.connection;
                    deallocate = deallocate(z, false, true);
                    connection = null;
                }
            } else {
                if (this.connection != null && (!this.connection.isMultiplexed() || (iOException instanceof ConnectionShutdownException))) {
                    if (this.connection.successCount == 0) {
                        if (!(this.route == null || iOException == null)) {
                            this.routeSelector.connectFailed(this.route, iOException);
                        }
                        this.route = null;
                    }
                }
                z = false;
                connection = this.connection;
                deallocate = deallocate(z, false, true);
                connection = null;
            }
            z = true;
            connection = this.connection;
            deallocate = deallocate(z, false, true);
            connection = null;
        }
        Util.closeQuietly(deallocate);
        if (connection != null) {
            this.eventListener.connectionReleased(this.call, connection);
        }
    }

    public void acquire(RealConnection realConnection, boolean z) {
        if (this.connection == null) {
            this.connection = realConnection;
            this.reportedAcquired = z;
            realConnection.allocations.add(new StreamAllocationReference(this, this.callStackTrace));
            return;
        }
        throw new IllegalStateException();
    }

    private void release(RealConnection realConnection) {
        int size = realConnection.allocations.size();
        for (int i = 0; i < size; i++) {
            if (((Reference) realConnection.allocations.get(i)).get() == this) {
                realConnection.allocations.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public Socket releaseAndAcquire(RealConnection realConnection) {
        if (this.codec == null && this.connection.allocations.size() == 1) {
            Reference reference = (Reference) this.connection.allocations.get(0);
            Socket deallocate = deallocate(true, false, false);
            this.connection = realConnection;
            realConnection.allocations.add(reference);
            return deallocate;
        }
        throw new IllegalStateException();
    }

    public boolean hasMoreRoutes() {
        if (this.route == null) {
            Selection selection = this.routeSelection;
            if ((selection == null || !selection.hasNext()) && !this.routeSelector.hasNext()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        RealConnection connection = connection();
        return connection != null ? connection.toString() : this.address.toString();
    }
}
