package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Headers.Builder;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.DiskLruCache.Editor;
import okhttp3.internal.cache.DiskLruCache.Snapshot;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

public final class Cache implements Closeable, Flushable {
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    final DiskLruCache cache;
    private int hitCount;
    final InternalCache internalCache;
    private int networkCount;
    private int requestCount;
    int writeAbortCount;
    int writeSuccessCount;

    private static final class Entry {
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;

        static {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Platform.get().getPrefix());
            stringBuilder.append("-Sent-Millis");
            SENT_MILLIS = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(Platform.get().getPrefix());
            stringBuilder.append("-Received-Millis");
            RECEIVED_MILLIS = stringBuilder.toString();
        }

        Entry(Source source) {
            try {
                BufferedSource buffer = Okio.buffer(source);
                this.url = buffer.readUtf8LineStrict();
                this.requestMethod = buffer.readUtf8LineStrict();
                Builder builder = new Builder();
                int readInt = Cache.readInt(buffer);
                for (int i = 0; i < readInt; i++) {
                    builder.addLenient(buffer.readUtf8LineStrict());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.parse(buffer.readUtf8LineStrict());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                builder = new Builder();
                readInt = Cache.readInt(buffer);
                for (int i2 = 0; i2 < readInt; i2++) {
                    builder.addLenient(buffer.readUtf8LineStrict());
                }
                String str = builder.get(SENT_MILLIS);
                String str2 = builder.get(RECEIVED_MILLIS);
                builder.removeAll(SENT_MILLIS);
                builder.removeAll(RECEIVED_MILLIS);
                long j = 0;
                this.sentRequestMillis = str != null ? Long.parseLong(str) : 0;
                if (str2 != null) {
                    j = Long.parseLong(str2);
                }
                this.receivedResponseMillis = j;
                this.responseHeaders = builder.build();
                if (isHttps()) {
                    String readUtf8LineStrict = buffer.readUtf8LineStrict();
                    if (readUtf8LineStrict.length() <= 0) {
                        TlsVersion tlsVersion;
                        CipherSuite forJavaName = CipherSuite.forJavaName(buffer.readUtf8LineStrict());
                        List readCertificateList = readCertificateList(buffer);
                        List readCertificateList2 = readCertificateList(buffer);
                        if (buffer.exhausted()) {
                            tlsVersion = TlsVersion.SSL_3_0;
                        } else {
                            tlsVersion = TlsVersion.forJavaName(buffer.readUtf8LineStrict());
                        }
                        this.handshake = Handshake.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("expected \"\" but was \"");
                        stringBuilder.append(readUtf8LineStrict);
                        stringBuilder.append("\"");
                        throw new IOException(stringBuilder.toString());
                    }
                }
                this.handshake = null;
                source.close();
            } catch (Throwable th) {
                source.close();
            }
        }

        Entry(Response response) {
            this.url = response.request().url().toString();
            this.varyHeaders = HttpHeaders.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        public void writeTo(Editor editor) {
            String str;
            int i = 0;
            BufferedSink buffer = Okio.buffer(editor.newSink(0));
            buffer.writeUtf8(this.url).writeByte(10);
            buffer.writeUtf8(this.requestMethod).writeByte(10);
            buffer.writeDecimalLong((long) this.varyHeaders.size()).writeByte(10);
            int size = this.varyHeaders.size();
            int i2 = 0;
            while (true) {
                str = ": ";
                if (i2 >= size) {
                    break;
                }
                buffer.writeUtf8(this.varyHeaders.name(i2)).writeUtf8(str).writeUtf8(this.varyHeaders.value(i2)).writeByte(10);
                i2++;
            }
            buffer.writeUtf8(new StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
            buffer.writeDecimalLong((long) (this.responseHeaders.size() + 2)).writeByte(10);
            size = this.responseHeaders.size();
            while (i < size) {
                buffer.writeUtf8(this.responseHeaders.name(i)).writeUtf8(str).writeUtf8(this.responseHeaders.value(i)).writeByte(10);
                i++;
            }
            buffer.writeUtf8(SENT_MILLIS).writeUtf8(str).writeDecimalLong(this.sentRequestMillis).writeByte(10);
            buffer.writeUtf8(RECEIVED_MILLIS).writeUtf8(str).writeDecimalLong(this.receivedResponseMillis).writeByte(10);
            if (isHttps()) {
                buffer.writeByte(10);
                buffer.writeUtf8(this.handshake.cipherSuite().javaName()).writeByte(10);
                writeCertList(buffer, this.handshake.peerCertificates());
                writeCertList(buffer, this.handshake.localCertificates());
                buffer.writeUtf8(this.handshake.tlsVersion().javaName()).writeByte(10);
            }
            buffer.close();
        }

        private boolean isHttps() {
            return this.url.startsWith("https://");
        }

        private List<Certificate> readCertificateList(BufferedSource bufferedSource) {
            int readInt = Cache.readInt(bufferedSource);
            if (readInt == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i < readInt; i++) {
                    String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
                    Buffer buffer = new Buffer();
                    buffer.write(ByteString.decodeBase64(readUtf8LineStrict));
                    arrayList.add(instance.generateCertificate(buffer.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private void writeCertList(BufferedSink bufferedSink, List<Certificate> list) {
            try {
                bufferedSink.writeDecimalLong((long) list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bufferedSink.writeUtf8(ByteString.of(((Certificate) list.get(i)).getEncoded()).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public boolean matches(Request request, Response response) {
            return this.url.equals(request.url().toString()) && this.requestMethod.equals(request.method()) && HttpHeaders.varyMatches(response, this.varyHeaders, request);
        }

        public Response response(Snapshot snapshot) {
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }
    }

    private final class CacheRequestImpl implements CacheRequest {
        private Sink body;
        private Sink cacheOut;
        boolean done;
        private final Editor editor;

        CacheRequestImpl(final Editor editor) {
            this.editor = editor;
            this.cacheOut = editor.newSink(1);
            this.body = new ForwardingSink(this.cacheOut, Cache.this) {
                public void close() {
                    synchronized (Cache.this) {
                        if (CacheRequestImpl.this.done) {
                            return;
                        }
                        CacheRequestImpl.this.done = true;
                        Cache cache = Cache.this;
                        cache.writeSuccessCount++;
                        super.close();
                        editor.commit();
                    }
                }
            };
        }

        /* JADX WARNING: Missing block: B:9:0x0014, code skipped:
            okhttp3.internal.Util.closeQuietly(r4.cacheOut);
     */
        /* JADX WARNING: Missing block: B:11:?, code skipped:
            r4.editor.abort();
     */
        public void abort() {
            /*
            r4 = this;
            r0 = okhttp3.Cache.this;
            monitor-enter(r0);
            r1 = r4.done;	 Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x0009;
        L_0x0007:
            monitor-exit(r0);	 Catch:{ all -> 0x001f }
            return;
        L_0x0009:
            r1 = 1;
            r4.done = r1;	 Catch:{ all -> 0x001f }
            r2 = okhttp3.Cache.this;	 Catch:{ all -> 0x001f }
            r3 = r2.writeAbortCount;	 Catch:{ all -> 0x001f }
            r3 = r3 + r1;
            r2.writeAbortCount = r3;	 Catch:{ all -> 0x001f }
            monitor-exit(r0);	 Catch:{ all -> 0x001f }
            r0 = r4.cacheOut;
            okhttp3.internal.Util.closeQuietly(r0);
            r0 = r4.editor;	 Catch:{ IOException -> 0x001e }
            r0.abort();	 Catch:{ IOException -> 0x001e }
        L_0x001e:
            return;
        L_0x001f:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x001f }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache$CacheRequestImpl.abort():void");
        }

        public Sink body() {
            return this.body;
        }
    }

    private static class CacheResponseBody extends ResponseBody {
        private final BufferedSource bodySource;
        private final String contentLength;
        private final String contentType;
        final Snapshot snapshot;

        CacheResponseBody(final Snapshot snapshot, String str, String str2) {
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = Okio.buffer(new ForwardingSource(snapshot.getSource(1)) {
                public void close() {
                    snapshot.close();
                    super.close();
                }
            });
        }

        public MediaType contentType() {
            String str = this.contentType;
            return str != null ? MediaType.parse(str) : null;
        }

        public long contentLength() {
            try {
                return this.contentLength != null ? Long.parseLong(this.contentLength) : -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public BufferedSource source() {
            return this.bodySource;
        }
    }

    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
    }

    Cache(File file, long j, FileSystem fileSystem) {
        this.internalCache = new InternalCache() {
            public Response get(Request request) {
                return Cache.this.get(request);
            }

            public CacheRequest put(Response response) {
                return Cache.this.put(response);
            }

            public void remove(Request request) {
                Cache.this.remove(request);
            }

            public void update(Response response, Response response2) {
                Cache.this.update(response, response2);
            }

            public void trackConditionalCacheHit() {
                Cache.this.trackConditionalCacheHit();
            }

            public void trackResponse(CacheStrategy cacheStrategy) {
                Cache.this.trackResponse(cacheStrategy);
            }
        };
        this.cache = DiskLruCache.create(fileSystem, file, VERSION, 2, j);
    }

    public static String key(HttpUrl httpUrl) {
        return ByteString.encodeUtf8(httpUrl.toString()).md5().hex();
    }

    /* Access modifiers changed, original: 0000 */
    public Response get(Request request) {
        try {
            Closeable closeable = this.cache.get(key(request.url()));
            if (closeable == null) {
                return null;
            }
            try {
                Entry entry = new Entry(closeable.getSource(0));
                Response response = entry.response(closeable);
                if (entry.matches(request, response)) {
                    return response;
                }
                Util.closeQuietly(response.body());
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(closeable);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public CacheRequest put(Response response) {
        String method = response.request().method();
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!method.equals("GET") || HttpHeaders.hasVaryAll(response)) {
            return null;
        } else {
            Entry entry = new Entry(response);
            Editor edit;
            try {
                edit = this.cache.edit(key(response.request().url()));
                if (edit == null) {
                    return null;
                }
                try {
                    entry.writeTo(edit);
                    return new CacheRequestImpl(edit);
                } catch (IOException unused2) {
                    abortQuietly(edit);
                    return null;
                }
            } catch (IOException unused3) {
                edit = null;
                abortQuietly(edit);
                return null;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void remove(Request request) {
        this.cache.remove(key(request.url()));
    }

    /* Access modifiers changed, original: 0000 */
    public void update(Response response, Response response2) {
        Entry entry = new Entry(response2);
        Editor edit;
        try {
            edit = ((CacheResponseBody) response.body()).snapshot.edit();
            if (edit != null) {
                try {
                    entry.writeTo(edit);
                    edit.commit();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            edit = null;
            abortQuietly(edit);
        }
    }

    private void abortQuietly(Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public void initialize() {
        this.cache.initialize();
    }

    public void delete() {
        this.cache.delete();
    }

    public void evictAll() {
        this.cache.evictAll();
    }

    public Iterator<String> urls() {
        return new Iterator<String>() {
            boolean canRemove;
            final Iterator<Snapshot> delegate = Cache.this.cache.snapshots();
            String nextUrl;

            public boolean hasNext() {
                if (this.nextUrl != null) {
                    return true;
                }
                this.canRemove = false;
                while (this.delegate.hasNext()) {
                    Snapshot snapshot = (Snapshot) this.delegate.next();
                    try {
                        this.nextUrl = Okio.buffer(snapshot.getSource(0)).readUtf8LineStrict();
                        snapshot.close();
                        return true;
                    } catch (IOException unused) {
                        snapshot.close();
                    } catch (Throwable th) {
                        snapshot.close();
                        throw th;
                    }
                }
                return false;
            }

            public String next() {
                if (hasNext()) {
                    String str = this.nextUrl;
                    this.nextUrl = null;
                    this.canRemove = true;
                    return str;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                if (this.canRemove) {
                    this.delegate.remove();
                    return;
                }
                throw new IllegalStateException("remove() before next()");
            }
        };
    }

    public synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    public long size() {
        return this.cache.size();
    }

    public long maxSize() {
        return this.cache.getMaxSize();
    }

    public void flush() {
        this.cache.flush();
    }

    public void close() {
        this.cache.close();
    }

    public File directory() {
        return this.cache.getDirectory();
    }

    public boolean isClosed() {
        return this.cache.isClosed();
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void trackResponse(CacheStrategy cacheStrategy) {
        this.requestCount++;
        if (cacheStrategy.networkRequest != null) {
            this.networkCount++;
        } else if (cacheStrategy.cacheResponse != null) {
            this.hitCount++;
        }
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void trackConditionalCacheHit() {
        this.hitCount++;
    }

    public synchronized int networkCount() {
        return this.networkCount;
    }

    public synchronized int hitCount() {
        return this.hitCount;
    }

    public synchronized int requestCount() {
        return this.requestCount;
    }

    static int readInt(BufferedSource bufferedSource) {
        try {
            long readDecimalLong = bufferedSource.readDecimalLong();
            String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
            if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L && readUtf8LineStrict.isEmpty()) {
                return (int) readDecimalLong;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected an int but was \"");
            stringBuilder.append(readDecimalLong);
            stringBuilder.append(readUtf8LineStrict);
            stringBuilder.append("\"");
            throw new IOException(stringBuilder.toString());
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }
}
