package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.ws.WebSocketReader.FrameCallback;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

public final class RealWebSocket implements WebSocket, FrameCallback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final String key;
    final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque();
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<ByteString> pongQueue = new ArrayDeque();
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode = -1;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;

    public static abstract class Streams implements Closeable {
        public final boolean client;
        public final BufferedSink sink;
        public final BufferedSource source;

        public Streams(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.client = z;
            this.source = bufferedSource;
            this.sink = bufferedSink;
        }
    }

    final class CancelRunnable implements Runnable {
        CancelRunnable() {
        }

        public void run() {
            RealWebSocket.this.cancel();
        }
    }

    static final class Close {
        final long cancelAfterCloseMillis;
        final int code;
        final ByteString reason;

        Close(int i, ByteString byteString, long j) {
            this.code = i;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j;
        }
    }

    static final class Message {
        final ByteString data;
        final int formatOpcode;

        Message(int i, ByteString byteString) {
            this.formatOpcode = i;
            this.data = byteString;
        }
    }

    private final class PingRunnable implements Runnable {
        PingRunnable() {
        }

        public void run() {
            RealWebSocket.this.writePingFrame();
        }
    }

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random, long j) {
        if ("GET".equals(request.method())) {
            this.originalRequest = request;
            this.listener = webSocketListener;
            this.random = random;
            this.pingIntervalMillis = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.key = ByteString.of(bArr).base64();
            this.writerRunnable = new Runnable() {
                public void run() {
                    while (RealWebSocket.this.writeOneFrame()) {
                        try {
                        } catch (IOException e) {
                            RealWebSocket.this.failWebSocket(e, null);
                            return;
                        }
                    }
                }
            };
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request must be GET: ");
        stringBuilder.append(request.method());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public Request request() {
        return this.originalRequest;
    }

    public synchronized long queueSize() {
        return this.queueSize;
    }

    public void cancel() {
        this.call.cancel();
    }

    public void connect(OkHttpClient okHttpClient) {
        okHttpClient = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        String str = "Upgrade";
        final Request build = this.originalRequest.newBuilder().header(str, "websocket").header("Connection", str).header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        this.call = Internal.instance.newWebSocketCall(okHttpClient, build);
        this.call.timeout().clearTimeout();
        this.call.enqueue(new Callback() {
            public void onResponse(Call call, Response response) {
                try {
                    RealWebSocket.this.checkResponse(response);
                    StreamAllocation streamAllocation = Internal.instance.streamAllocation(call);
                    streamAllocation.noNewStreams();
                    Streams newWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                    try {
                        RealWebSocket.this.listener.onOpen(RealWebSocket.this, response);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("OkHttp WebSocket ");
                        stringBuilder.append(build.url().redact());
                        RealWebSocket.this.initReaderAndWriter(stringBuilder.toString(), newWebSocketStreams);
                        streamAllocation.connection().socket().setSoTimeout(0);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e) {
                        RealWebSocket.this.failWebSocket(e, null);
                    }
                } catch (ProtocolException e2) {
                    RealWebSocket.this.failWebSocket(e2, response);
                    Util.closeQuietly((Closeable) response);
                }
            }

            public void onFailure(Call call, IOException iOException) {
                RealWebSocket.this.failWebSocket(iOException, null);
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void checkResponse(Response response) {
        String str = "'";
        StringBuilder stringBuilder;
        if (response.code() == 101) {
            String header = response.header("Connection");
            String str2 = "Upgrade";
            if (str2.equalsIgnoreCase(header)) {
                header = response.header(str2);
                if ("websocket".equalsIgnoreCase(header)) {
                    String header2 = response.header("Sec-WebSocket-Accept");
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(this.key);
                    stringBuilder2.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                    header = ByteString.encodeUtf8(stringBuilder2.toString()).sha1().base64();
                    if (!header.equals(header2)) {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("Expected 'Sec-WebSocket-Accept' header value '");
                        stringBuilder3.append(header);
                        stringBuilder3.append("' but was '");
                        stringBuilder3.append(header2);
                        stringBuilder3.append(str);
                        throw new ProtocolException(stringBuilder3.toString());
                    }
                    return;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Expected 'Upgrade' header value 'websocket' but was '");
                stringBuilder.append(header);
                stringBuilder.append(str);
                throw new ProtocolException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Expected 'Connection' header value 'Upgrade' but was '");
            stringBuilder.append(header);
            stringBuilder.append(str);
            throw new ProtocolException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Expected HTTP 101 response but was '");
        stringBuilder.append(response.code());
        stringBuilder.append(" ");
        stringBuilder.append(response.message());
        stringBuilder.append(str);
        throw new ProtocolException(stringBuilder.toString());
    }

    public void initReaderAndWriter(String str, Streams streams) {
        synchronized (this) {
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.client, streams.sink, this.random);
            this.executor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
            if (this.pingIntervalMillis != 0) {
                this.executor.scheduleAtFixedRate(new PingRunnable(), this.pingIntervalMillis, this.pingIntervalMillis, TimeUnit.MILLISECONDS);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
        }
        this.reader = new WebSocketReader(streams.client, streams.source, this);
    }

    public void loopReader() {
        while (this.receivedCloseCode == -1) {
            this.reader.processNextFrame();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean processNextFrame() {
        boolean z = false;
        try {
            this.reader.processNextFrame();
            if (this.receivedCloseCode == -1) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            failWebSocket(e, null);
            return false;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void awaitTermination(int i, TimeUnit timeUnit) {
        this.executor.awaitTermination((long) i, timeUnit);
    }

    /* Access modifiers changed, original: 0000 */
    public void tearDown() {
        ScheduledFuture scheduledFuture = this.cancelFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.executor.shutdown();
        this.executor.awaitTermination(10, TimeUnit.SECONDS);
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    public void onReadMessage(String str) {
        this.listener.onMessage((WebSocket) this, str);
    }

    public void onReadMessage(ByteString byteString) {
        this.listener.onMessage((WebSocket) this, byteString);
    }

    /* JADX WARNING: Missing block: B:13:0x0023, code skipped:
            return;
     */
    public synchronized void onReadPing(okio.ByteString r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.failed;	 Catch:{ all -> 0x0024 }
        if (r0 != 0) goto L_0x0022;
    L_0x0005:
        r0 = r1.enqueuedClose;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x0012;
    L_0x0009:
        r0 = r1.messageAndCloseQueue;	 Catch:{ all -> 0x0024 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0022;
    L_0x0012:
        r0 = r1.pongQueue;	 Catch:{ all -> 0x0024 }
        r0.add(r2);	 Catch:{ all -> 0x0024 }
        r1.runWriter();	 Catch:{ all -> 0x0024 }
        r2 = r1.receivedPingCount;	 Catch:{ all -> 0x0024 }
        r2 = r2 + 1;
        r1.receivedPingCount = r2;	 Catch:{ all -> 0x0024 }
        monitor-exit(r1);
        return;
    L_0x0022:
        monitor-exit(r1);
        return;
    L_0x0024:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.onReadPing(okio.ByteString):void");
    }

    public synchronized void onReadPong(ByteString byteString) {
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public void onReadClose(int i, String str) {
        if (i != -1) {
            Closeable closeable;
            synchronized (this) {
                if (this.receivedCloseCode == -1) {
                    this.receivedCloseCode = i;
                    this.receivedCloseReason = str;
                    if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                        closeable = this.streams;
                        this.streams = null;
                        if (this.cancelFuture != null) {
                            this.cancelFuture.cancel(false);
                        }
                        this.executor.shutdown();
                    } else {
                        closeable = null;
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                this.listener.onClosing(this, i, str);
                if (closeable != null) {
                    this.listener.onClosed(this, i, str);
                }
                Util.closeQuietly(closeable);
            } catch (Throwable th) {
                Util.closeQuietly(closeable);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean send(String str) {
        if (str != null) {
            return send(ByteString.encodeUtf8(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    public boolean send(ByteString byteString) {
        if (byteString != null) {
            return send(byteString, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    /* JADX WARNING: Missing block: B:18:0x003d, code skipped:
            return false;
     */
    private synchronized boolean send(okio.ByteString r7, int r8) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.failed;	 Catch:{ all -> 0x003e }
        r1 = 0;
        if (r0 != 0) goto L_0x003c;
    L_0x0006:
        r0 = r6.enqueuedClose;	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        goto L_0x003c;
    L_0x000b:
        r2 = r6.queueSize;	 Catch:{ all -> 0x003e }
        r0 = r7.size();	 Catch:{ all -> 0x003e }
        r4 = (long) r0;	 Catch:{ all -> 0x003e }
        r2 = r2 + r4;
        r4 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0022;
    L_0x001a:
        r7 = 1001; // 0x3e9 float:1.403E-42 double:4.946E-321;
        r8 = 0;
        r6.close(r7, r8);	 Catch:{ all -> 0x003e }
        monitor-exit(r6);
        return r1;
    L_0x0022:
        r0 = r6.queueSize;	 Catch:{ all -> 0x003e }
        r2 = r7.size();	 Catch:{ all -> 0x003e }
        r2 = (long) r2;	 Catch:{ all -> 0x003e }
        r0 = r0 + r2;
        r6.queueSize = r0;	 Catch:{ all -> 0x003e }
        r0 = r6.messageAndCloseQueue;	 Catch:{ all -> 0x003e }
        r1 = new okhttp3.internal.ws.RealWebSocket$Message;	 Catch:{ all -> 0x003e }
        r1.<init>(r8, r7);	 Catch:{ all -> 0x003e }
        r0.add(r1);	 Catch:{ all -> 0x003e }
        r6.runWriter();	 Catch:{ all -> 0x003e }
        r7 = 1;
        monitor-exit(r6);
        return r7;
    L_0x003c:
        monitor-exit(r6);
        return r1;
    L_0x003e:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.send(okio.ByteString, int):boolean");
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized boolean pong(ByteString byteString) {
        if (!this.failed) {
            if (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                this.pongQueue.add(byteString);
                runWriter();
                return true;
            }
        }
        return false;
    }

    public boolean close(int i, String str) {
        return close(i, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized boolean close(int i, String str, long j) {
        WebSocketProtocol.validateCloseCode(i);
        ByteString byteString = null;
        if (str != null) {
            byteString = ByteString.encodeUtf8(str);
            if (((long) byteString.size()) > 123) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("reason.size() > 123: ");
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (!this.failed) {
            if (!this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i, byteString, j));
                runWriter();
                return true;
            }
        }
        return false;
    }

    private void runWriter() {
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.writerRunnable);
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:21:0x0050, code skipped:
            if (r2 == null) goto L_0x0056;
     */
    /* JADX WARNING: Missing block: B:23:?, code skipped:
            r0.writePong(r2);
     */
    /* JADX WARNING: Missing block: B:25:0x0058, code skipped:
            if ((r5 instanceof okhttp3.internal.ws.RealWebSocket.Message) == false) goto L_0x0086;
     */
    /* JADX WARNING: Missing block: B:26:0x005a, code skipped:
            r1 = ((okhttp3.internal.ws.RealWebSocket.Message) r5).data;
            r0 = okio.Okio.buffer(r0.newMessageSink(((okhttp3.internal.ws.RealWebSocket.Message) r5).formatOpcode, (long) r1.size()));
            r0.write(r1);
            r0.close();
     */
    /* JADX WARNING: Missing block: B:27:0x0076, code skipped:
            monitor-enter(r11);
     */
    /* JADX WARNING: Missing block: B:29:?, code skipped:
            r11.queueSize -= (long) r1.size();
     */
    /* JADX WARNING: Missing block: B:30:0x0081, code skipped:
            monitor-exit(r11);
     */
    /* JADX WARNING: Missing block: B:37:0x0088, code skipped:
            if ((r5 instanceof okhttp3.internal.ws.RealWebSocket.Close) == false) goto L_0x009f;
     */
    /* JADX WARNING: Missing block: B:38:0x008a, code skipped:
            r5 = (okhttp3.internal.ws.RealWebSocket.Close) r5;
            r0.writeClose(r5.code, r5.reason);
     */
    /* JADX WARNING: Missing block: B:39:0x0093, code skipped:
            if (r4 == null) goto L_0x009a;
     */
    /* JADX WARNING: Missing block: B:40:0x0095, code skipped:
            r11.listener.onClosed(r11, r1, r6);
     */
    /* JADX WARNING: Missing block: B:41:0x009a, code skipped:
            okhttp3.internal.Util.closeQuietly(r4);
     */
    /* JADX WARNING: Missing block: B:42:0x009e, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:45:0x00a4, code skipped:
            throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Missing block: B:47:0x00a6, code skipped:
            okhttp3.internal.Util.closeQuietly(r4);
     */
    public boolean writeOneFrame() {
        /*
        r11 = this;
        monitor-enter(r11);
        r0 = r11.failed;	 Catch:{ all -> 0x00aa }
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0006:
        monitor-exit(r11);	 Catch:{ all -> 0x00aa }
        return r1;
    L_0x0008:
        r0 = r11.writer;	 Catch:{ all -> 0x00aa }
        r2 = r11.pongQueue;	 Catch:{ all -> 0x00aa }
        r2 = r2.poll();	 Catch:{ all -> 0x00aa }
        r2 = (okio.ByteString) r2;	 Catch:{ all -> 0x00aa }
        r3 = -1;
        r4 = 0;
        if (r2 != 0) goto L_0x004c;
    L_0x0016:
        r5 = r11.messageAndCloseQueue;	 Catch:{ all -> 0x00aa }
        r5 = r5.poll();	 Catch:{ all -> 0x00aa }
        r6 = r5 instanceof okhttp3.internal.ws.RealWebSocket.Close;	 Catch:{ all -> 0x00aa }
        if (r6 == 0) goto L_0x0046;
    L_0x0020:
        r1 = r11.receivedCloseCode;	 Catch:{ all -> 0x00aa }
        r6 = r11.receivedCloseReason;	 Catch:{ all -> 0x00aa }
        if (r1 == r3) goto L_0x0031;
    L_0x0026:
        r3 = r11.streams;	 Catch:{ all -> 0x00aa }
        r11.streams = r4;	 Catch:{ all -> 0x00aa }
        r4 = r11.executor;	 Catch:{ all -> 0x00aa }
        r4.shutdown();	 Catch:{ all -> 0x00aa }
        r4 = r3;
        goto L_0x004f;
    L_0x0031:
        r3 = r11.executor;	 Catch:{ all -> 0x00aa }
        r7 = new okhttp3.internal.ws.RealWebSocket$CancelRunnable;	 Catch:{ all -> 0x00aa }
        r7.<init>();	 Catch:{ all -> 0x00aa }
        r8 = r5;
        r8 = (okhttp3.internal.ws.RealWebSocket.Close) r8;	 Catch:{ all -> 0x00aa }
        r8 = r8.cancelAfterCloseMillis;	 Catch:{ all -> 0x00aa }
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x00aa }
        r3 = r3.schedule(r7, r8, r10);	 Catch:{ all -> 0x00aa }
        r11.cancelFuture = r3;	 Catch:{ all -> 0x00aa }
        goto L_0x004f;
    L_0x0046:
        if (r5 != 0) goto L_0x004a;
    L_0x0048:
        monitor-exit(r11);	 Catch:{ all -> 0x00aa }
        return r1;
    L_0x004a:
        r6 = r4;
        goto L_0x004e;
    L_0x004c:
        r5 = r4;
        r6 = r5;
    L_0x004e:
        r1 = -1;
    L_0x004f:
        monitor-exit(r11);	 Catch:{ all -> 0x00aa }
        if (r2 == 0) goto L_0x0056;
    L_0x0052:
        r0.writePong(r2);	 Catch:{ all -> 0x00a5 }
        goto L_0x009a;
    L_0x0056:
        r2 = r5 instanceof okhttp3.internal.ws.RealWebSocket.Message;	 Catch:{ all -> 0x00a5 }
        if (r2 == 0) goto L_0x0086;
    L_0x005a:
        r1 = r5;
        r1 = (okhttp3.internal.ws.RealWebSocket.Message) r1;	 Catch:{ all -> 0x00a5 }
        r1 = r1.data;	 Catch:{ all -> 0x00a5 }
        r5 = (okhttp3.internal.ws.RealWebSocket.Message) r5;	 Catch:{ all -> 0x00a5 }
        r2 = r5.formatOpcode;	 Catch:{ all -> 0x00a5 }
        r3 = r1.size();	 Catch:{ all -> 0x00a5 }
        r5 = (long) r3;	 Catch:{ all -> 0x00a5 }
        r0 = r0.newMessageSink(r2, r5);	 Catch:{ all -> 0x00a5 }
        r0 = okio.Okio.buffer(r0);	 Catch:{ all -> 0x00a5 }
        r0.write(r1);	 Catch:{ all -> 0x00a5 }
        r0.close();	 Catch:{ all -> 0x00a5 }
        monitor-enter(r11);	 Catch:{ all -> 0x00a5 }
        r2 = r11.queueSize;	 Catch:{ all -> 0x0083 }
        r0 = r1.size();	 Catch:{ all -> 0x0083 }
        r0 = (long) r0;	 Catch:{ all -> 0x0083 }
        r2 = r2 - r0;
        r11.queueSize = r2;	 Catch:{ all -> 0x0083 }
        monitor-exit(r11);	 Catch:{ all -> 0x0083 }
        goto L_0x009a;
    L_0x0083:
        r0 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x0083 }
        throw r0;	 Catch:{ all -> 0x00a5 }
    L_0x0086:
        r2 = r5 instanceof okhttp3.internal.ws.RealWebSocket.Close;	 Catch:{ all -> 0x00a5 }
        if (r2 == 0) goto L_0x009f;
    L_0x008a:
        r5 = (okhttp3.internal.ws.RealWebSocket.Close) r5;	 Catch:{ all -> 0x00a5 }
        r2 = r5.code;	 Catch:{ all -> 0x00a5 }
        r3 = r5.reason;	 Catch:{ all -> 0x00a5 }
        r0.writeClose(r2, r3);	 Catch:{ all -> 0x00a5 }
        if (r4 == 0) goto L_0x009a;
    L_0x0095:
        r0 = r11.listener;	 Catch:{ all -> 0x00a5 }
        r0.onClosed(r11, r1, r6);	 Catch:{ all -> 0x00a5 }
    L_0x009a:
        r0 = 1;
        okhttp3.internal.Util.closeQuietly(r4);
        return r0;
    L_0x009f:
        r0 = new java.lang.AssertionError;	 Catch:{ all -> 0x00a5 }
        r0.<init>();	 Catch:{ all -> 0x00a5 }
        throw r0;	 Catch:{ all -> 0x00a5 }
    L_0x00a5:
        r0 = move-exception;
        okhttp3.internal.Util.closeQuietly(r4);
        throw r0;
    L_0x00aa:
        r0 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x00aa }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.writeOneFrame():boolean");
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:13:0x001c, code skipped:
            if (r1 == -1) goto L_0x0048;
     */
    /* JADX WARNING: Missing block: B:14:0x001e, code skipped:
            r2 = new java.lang.StringBuilder();
            r2.append("sent ping but didn't receive pong within ");
            r2.append(r7.pingIntervalMillis);
            r2.append("ms (after ");
            r2.append(r1 - 1);
            r2.append(" successful ping/pongs)");
            failWebSocket(new java.net.SocketTimeoutException(r2.toString()), null);
     */
    /* JADX WARNING: Missing block: B:15:0x0047, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:17:?, code skipped:
            r0.writePing(okio.ByteString.EMPTY);
     */
    /* JADX WARNING: Missing block: B:18:0x004e, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:19:0x004f, code skipped:
            failWebSocket(r0, null);
     */
    public void writePingFrame() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.failed;	 Catch:{ all -> 0x0053 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r7);	 Catch:{ all -> 0x0053 }
        return;
    L_0x0007:
        r0 = r7.writer;	 Catch:{ all -> 0x0053 }
        r1 = r7.awaitingPong;	 Catch:{ all -> 0x0053 }
        r2 = -1;
        if (r1 == 0) goto L_0x0011;
    L_0x000e:
        r1 = r7.sentPingCount;	 Catch:{ all -> 0x0053 }
        goto L_0x0012;
    L_0x0011:
        r1 = -1;
    L_0x0012:
        r3 = r7.sentPingCount;	 Catch:{ all -> 0x0053 }
        r4 = 1;
        r3 = r3 + r4;
        r7.sentPingCount = r3;	 Catch:{ all -> 0x0053 }
        r7.awaitingPong = r4;	 Catch:{ all -> 0x0053 }
        monitor-exit(r7);	 Catch:{ all -> 0x0053 }
        r3 = 0;
        if (r1 == r2) goto L_0x0048;
    L_0x001e:
        r0 = new java.net.SocketTimeoutException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r5 = "sent ping but didn't receive pong within ";
        r2.append(r5);
        r5 = r7.pingIntervalMillis;
        r2.append(r5);
        r5 = "ms (after ";
        r2.append(r5);
        r1 = r1 - r4;
        r2.append(r1);
        r1 = " successful ping/pongs)";
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        r7.failWebSocket(r0, r3);
        return;
    L_0x0048:
        r1 = okio.ByteString.EMPTY;	 Catch:{ IOException -> 0x004e }
        r0.writePing(r1);	 Catch:{ IOException -> 0x004e }
        goto L_0x0052;
    L_0x004e:
        r0 = move-exception;
        r7.failWebSocket(r0, r3);
    L_0x0052:
        return;
    L_0x0053:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0053 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.writePingFrame():void");
    }

    /* JADX WARNING: Missing block: B:14:?, code skipped:
            r3.listener.onFailure(r3, r4, r5);
     */
    /* JADX WARNING: Missing block: B:17:0x002d, code skipped:
            okhttp3.internal.Util.closeQuietly(r0);
     */
    public void failWebSocket(java.lang.Exception r4, okhttp3.Response r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.failed;	 Catch:{ all -> 0x0031 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r3);	 Catch:{ all -> 0x0031 }
        return;
    L_0x0007:
        r0 = 1;
        r3.failed = r0;	 Catch:{ all -> 0x0031 }
        r0 = r3.streams;	 Catch:{ all -> 0x0031 }
        r1 = 0;
        r3.streams = r1;	 Catch:{ all -> 0x0031 }
        r1 = r3.cancelFuture;	 Catch:{ all -> 0x0031 }
        if (r1 == 0) goto L_0x0019;
    L_0x0013:
        r1 = r3.cancelFuture;	 Catch:{ all -> 0x0031 }
        r2 = 0;
        r1.cancel(r2);	 Catch:{ all -> 0x0031 }
    L_0x0019:
        r1 = r3.executor;	 Catch:{ all -> 0x0031 }
        if (r1 == 0) goto L_0x0022;
    L_0x001d:
        r1 = r3.executor;	 Catch:{ all -> 0x0031 }
        r1.shutdown();	 Catch:{ all -> 0x0031 }
    L_0x0022:
        monitor-exit(r3);	 Catch:{ all -> 0x0031 }
        r1 = r3.listener;	 Catch:{ all -> 0x002c }
        r1.onFailure(r3, r4, r5);	 Catch:{ all -> 0x002c }
        okhttp3.internal.Util.closeQuietly(r0);
        return;
    L_0x002c:
        r4 = move-exception;
        okhttp3.internal.Util.closeQuietly(r0);
        throw r4;
    L_0x0031:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0031 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.failWebSocket(java.lang.Exception, okhttp3.Response):void");
    }
}
