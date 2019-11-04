package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;

public final class Http2Stream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    final Http2Connection connection;
    ErrorCode errorCode = null;
    private boolean hasResponseHeaders;
    private Listener headersListener;
    private final Deque<Headers> headersQueue = new ArrayDeque();
    final int id;
    final StreamTimeout readTimeout = new StreamTimeout();
    final FramingSink sink;
    private final FramingSource source;
    long unacknowledgedBytesRead = 0;
    final StreamTimeout writeTimeout = new StreamTimeout();

    final class FramingSink implements Sink {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long EMIT_BUFFER_SIZE = 16384;
        boolean closed;
        boolean finished;
        private final Buffer sendBuffer = new Buffer();

        static {
            Class cls = Http2Stream.class;
        }

        FramingSink() {
        }

        public void write(Buffer buffer, long j) {
            this.sendBuffer.write(buffer, j);
            while (this.sendBuffer.size() >= EMIT_BUFFER_SIZE) {
                emitFrame(false);
            }
        }

        private void emitFrame(boolean z) {
            long min;
            synchronized (Http2Stream.this) {
                Http2Stream.this.writeTimeout.enter();
                while (Http2Stream.this.bytesLeftInWriteWindow <= 0 && !this.finished && !this.closed && Http2Stream.this.errorCode == null) {
                    try {
                        Http2Stream.this.waitForIo();
                    } finally {
                        Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                    }
                }
                Http2Stream.this.checkOutNotClosed();
                min = Math.min(Http2Stream.this.bytesLeftInWriteWindow, this.sendBuffer.size());
                Http2Stream http2Stream = Http2Stream.this;
                http2Stream.bytesLeftInWriteWindow -= min;
            }
            Http2Stream.this.writeTimeout.enter();
            try {
                Http2Connection http2Connection = Http2Stream.this.connection;
                int i = Http2Stream.this.id;
                boolean z2 = z && min == this.sendBuffer.size();
                http2Connection.writeData(i, z2, this.sendBuffer, min);
            } finally {
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
            }
        }

        public void flush() {
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.size() > 0) {
                emitFrame(false);
                Http2Stream.this.connection.flush();
            }
        }

        public Timeout timeout() {
            return Http2Stream.this.writeTimeout;
        }

        /* JADX WARNING: Missing block: B:9:0x0011, code skipped:
            if (r8.this$0.sink.finished != false) goto L_0x003c;
     */
        /* JADX WARNING: Missing block: B:11:0x001d, code skipped:
            if (r8.sendBuffer.size() <= 0) goto L_0x002d;
     */
        /* JADX WARNING: Missing block: B:13:0x0027, code skipped:
            if (r8.sendBuffer.size() <= 0) goto L_0x003c;
     */
        /* JADX WARNING: Missing block: B:14:0x0029, code skipped:
            emitFrame(true);
     */
        /* JADX WARNING: Missing block: B:15:0x002d, code skipped:
            r8.this$0.connection.writeData(r8.this$0.id, true, null, 0);
     */
        /* JADX WARNING: Missing block: B:16:0x003c, code skipped:
            r2 = r8.this$0;
     */
        /* JADX WARNING: Missing block: B:17:0x003e, code skipped:
            monitor-enter(r2);
     */
        /* JADX WARNING: Missing block: B:19:?, code skipped:
            r8.closed = true;
     */
        /* JADX WARNING: Missing block: B:20:0x0041, code skipped:
            monitor-exit(r2);
     */
        /* JADX WARNING: Missing block: B:21:0x0042, code skipped:
            r8.this$0.connection.flush();
            r8.this$0.cancelStreamIfNecessary();
     */
        /* JADX WARNING: Missing block: B:22:0x004e, code skipped:
            return;
     */
        public void close() {
            /*
            r8 = this;
            r0 = okhttp3.internal.http2.Http2Stream.this;
            monitor-enter(r0);
            r1 = r8.closed;	 Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0009;
        L_0x0007:
            monitor-exit(r0);	 Catch:{ all -> 0x0052 }
            return;
        L_0x0009:
            monitor-exit(r0);	 Catch:{ all -> 0x0052 }
            r0 = okhttp3.internal.http2.Http2Stream.this;
            r0 = r0.sink;
            r0 = r0.finished;
            r1 = 1;
            if (r0 != 0) goto L_0x003c;
        L_0x0013:
            r0 = r8.sendBuffer;
            r2 = r0.size();
            r4 = 0;
            r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r0 <= 0) goto L_0x002d;
        L_0x001f:
            r0 = r8.sendBuffer;
            r2 = r0.size();
            r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r0 <= 0) goto L_0x003c;
        L_0x0029:
            r8.emitFrame(r1);
            goto L_0x001f;
        L_0x002d:
            r0 = okhttp3.internal.http2.Http2Stream.this;
            r2 = r0.connection;
            r0 = okhttp3.internal.http2.Http2Stream.this;
            r3 = r0.id;
            r4 = 1;
            r5 = 0;
            r6 = 0;
            r2.writeData(r3, r4, r5, r6);
        L_0x003c:
            r2 = okhttp3.internal.http2.Http2Stream.this;
            monitor-enter(r2);
            r8.closed = r1;	 Catch:{ all -> 0x004f }
            monitor-exit(r2);	 Catch:{ all -> 0x004f }
            r0 = okhttp3.internal.http2.Http2Stream.this;
            r0 = r0.connection;
            r0.flush();
            r0 = okhttp3.internal.http2.Http2Stream.this;
            r0.cancelStreamIfNecessary();
            return;
        L_0x004f:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x004f }
            throw r0;
        L_0x0052:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0052 }
            goto L_0x0056;
        L_0x0055:
            throw r1;
        L_0x0056:
            goto L_0x0055;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream$FramingSink.close():void");
        }
    }

    private final class FramingSource implements Source {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean closed;
        boolean finished;
        private final long maxByteCount;
        private final Buffer readBuffer = new Buffer();
        private final Buffer receiveBuffer = new Buffer();

        static {
            Class cls = Http2Stream.class;
        }

        FramingSource(long j) {
            this.maxByteCount = j;
        }

        public long read(Buffer buffer, long j) {
            long j2 = j;
            if (j2 >= 0) {
                ErrorCode errorCode;
                long read;
                while (true) {
                    synchronized (Http2Stream.this) {
                        Http2Stream.this.readTimeout.enter();
                        try {
                            errorCode = Http2Stream.this.errorCode != null ? Http2Stream.this.errorCode : null;
                            if (this.closed) {
                                throw new IOException("stream closed");
                            }
                            Headers headers;
                            Listener listener;
                            Buffer buffer2;
                            if (Http2Stream.this.headersQueue.isEmpty() || Http2Stream.this.headersListener == null) {
                                if (this.readBuffer.size() > 0) {
                                    read = this.readBuffer.read(buffer, Math.min(j2, this.readBuffer.size()));
                                    Http2Stream http2Stream = Http2Stream.this;
                                    http2Stream.unacknowledgedBytesRead += read;
                                    if (errorCode == null && Http2Stream.this.unacknowledgedBytesRead >= ((long) (Http2Stream.this.connection.okHttpSettings.getInitialWindowSize() / 2))) {
                                        Http2Stream.this.connection.writeWindowUpdateLater(Http2Stream.this.id, Http2Stream.this.unacknowledgedBytesRead);
                                        Http2Stream.this.unacknowledgedBytesRead = 0;
                                    }
                                } else {
                                    buffer2 = buffer;
                                    if (this.finished || errorCode != null) {
                                        read = -1;
                                    } else {
                                        Http2Stream.this.waitForIo();
                                        Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                                    }
                                }
                                headers = null;
                                listener = null;
                            } else {
                                headers = (Headers) Http2Stream.this.headersQueue.removeFirst();
                                listener = Http2Stream.this.headersListener;
                                buffer2 = buffer;
                                read = -1;
                            }
                            Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                            if (headers != null && listener != null) {
                                listener.onHeaders(headers);
                            }
                        } catch (Throwable th) {
                            Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                        }
                    }
                }
                if (read != -1) {
                    updateConnectionFlowControl(read);
                    return read;
                } else if (errorCode == null) {
                    return -1;
                } else {
                    throw new StreamResetException(errorCode);
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(j2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        private void updateConnectionFlowControl(long j) {
            Http2Stream.this.connection.updateConnectionFlowControl(j);
        }

        /* Access modifiers changed, original: 0000 */
        public void receive(BufferedSource bufferedSource, long j) {
            while (j > 0) {
                boolean z;
                Object obj;
                Object obj2;
                synchronized (Http2Stream.this) {
                    z = this.finished;
                    obj = 1;
                    obj2 = this.readBuffer.size() + j > this.maxByteCount ? 1 : null;
                }
                if (obj2 != null) {
                    bufferedSource.skip(j);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    bufferedSource.skip(j);
                    return;
                } else {
                    long read = bufferedSource.read(this.receiveBuffer, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (Http2Stream.this) {
                            if (this.readBuffer.size() != 0) {
                                obj = null;
                            }
                            this.readBuffer.writeAll(this.receiveBuffer);
                            if (obj != null) {
                                Http2Stream.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public Timeout timeout() {
            return Http2Stream.this.readTimeout;
        }

        public void close() {
            long size;
            Listener listener;
            synchronized (Http2Stream.this) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.clear();
                List list = null;
                if (Http2Stream.this.headersQueue.isEmpty() || Http2Stream.this.headersListener == null) {
                    listener = null;
                } else {
                    list = new ArrayList(Http2Stream.this.headersQueue);
                    Http2Stream.this.headersQueue.clear();
                    listener = Http2Stream.this.headersListener;
                }
                Http2Stream.this.notifyAll();
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            Http2Stream.this.cancelStreamIfNecessary();
            if (listener != null) {
                for (Headers onHeaders : list) {
                    listener.onHeaders(onHeaders);
                }
            }
        }
    }

    class StreamTimeout extends AsyncTimeout {
        StreamTimeout() {
        }

        /* Access modifiers changed, original: protected */
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
        }

        /* Access modifiers changed, original: protected */
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void exitAndThrowIfTimedOut() {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }
    }

    Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        if (http2Connection != null) {
            this.id = i;
            this.connection = http2Connection;
            this.bytesLeftInWriteWindow = (long) http2Connection.peerSettings.getInitialWindowSize();
            this.source = new FramingSource((long) http2Connection.okHttpSettings.getInitialWindowSize());
            this.sink = new FramingSink();
            this.source.finished = z2;
            this.sink.finished = z;
            if (headers != null) {
                this.headersQueue.add(headers);
            }
            if (isLocallyInitiated() && headers != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!isLocallyInitiated() && headers == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            } else {
                return;
            }
        }
        throw new NullPointerException("connection == null");
    }

    public int getId() {
        return this.id;
    }

    public synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.finished || this.source.closed) && ((this.sink.finished || this.sink.closed) && this.hasResponseHeaders)) {
            return false;
        }
        return true;
    }

    public boolean isLocallyInitiated() {
        if (this.connection.client == ((this.id & 1) == 1)) {
            return true;
        }
        return false;
    }

    public Http2Connection getConnection() {
        return this.connection;
    }

    public synchronized Headers takeHeaders() {
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo();
            } finally {
                this.readTimeout.exitAndThrowIfTimedOut();
            }
        }
        if (this.headersQueue.isEmpty()) {
            throw new StreamResetException(this.errorCode);
        }
        return (Headers) this.headersQueue.removeFirst();
    }

    public synchronized ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public void writeHeaders(List<Header> list, boolean z) {
        if (list != null) {
            Object obj;
            boolean z2;
            synchronized (this) {
                this.hasResponseHeaders = true;
                if (z) {
                    obj = null;
                    z2 = false;
                } else {
                    this.sink.finished = true;
                    obj = 1;
                    z2 = true;
                }
            }
            if (obj == null) {
                synchronized (this.connection) {
                    obj = this.connection.bytesLeftInWriteWindow == 0 ? 1 : null;
                }
            }
            this.connection.writeSynReply(this.id, z2, list);
            if (obj != null) {
                this.connection.flush();
                return;
            }
            return;
        }
        throw new NullPointerException("headers == null");
    }

    public Timeout readTimeout() {
        return this.readTimeout;
    }

    public Timeout writeTimeout() {
        return this.writeTimeout;
    }

    public Source getSource() {
        return this.source;
    }

    public Sink getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders) {
                if (!isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.sink;
    }

    public void close(ErrorCode errorCode) {
        if (closeInternal(errorCode)) {
            this.connection.writeSynReset(this.id, errorCode);
        }
    }

    public void closeLater(ErrorCode errorCode) {
        if (closeInternal(errorCode)) {
            this.connection.writeSynResetLater(this.id, errorCode);
        }
    }

    private boolean closeInternal(ErrorCode errorCode) {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            } else if (this.source.finished && this.sink.finished) {
                return false;
            } else {
                this.errorCode = errorCode;
                notifyAll();
                this.connection.removeStream(this.id);
                return true;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void receiveHeaders(List<Header> list) {
        boolean isOpen;
        synchronized (this) {
            this.hasResponseHeaders = true;
            this.headersQueue.add(Util.toHeaders(list));
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.connection.removeStream(this.id);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void receiveData(BufferedSource bufferedSource, int i) {
        this.source.receive(bufferedSource, (long) i);
    }

    /* Access modifiers changed, original: 0000 */
    public void receiveFin() {
        boolean isOpen;
        synchronized (this) {
            this.source.finished = true;
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.connection.removeStream(this.id);
        }
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void receiveRstStream(ErrorCode errorCode) {
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public synchronized void setHeadersListener(Listener listener) {
        this.headersListener = listener;
        if (!(this.headersQueue.isEmpty() || listener == null)) {
            notifyAll();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cancelStreamIfNecessary() {
        Object obj;
        boolean isOpen;
        synchronized (this) {
            obj = (!this.source.finished && this.source.closed && (this.sink.finished || this.sink.closed)) ? 1 : null;
            isOpen = isOpen();
        }
        if (obj != null) {
            close(ErrorCode.CANCEL);
        } else if (!isOpen) {
            this.connection.removeStream(this.id);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void addBytesToWriteWindow(long j) {
        this.bytesLeftInWriteWindow += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void checkOutNotClosed() {
        if (this.sink.closed) {
            throw new IOException("stream closed");
        } else if (this.sink.finished) {
            throw new IOException("stream finished");
        } else {
            ErrorCode errorCode = this.errorCode;
            if (errorCode != null) {
                throw new StreamResetException(errorCode);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void waitForIo() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
