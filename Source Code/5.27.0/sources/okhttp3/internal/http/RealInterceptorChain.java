package okhttp3.internal.http;

import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;

public final class RealInterceptorChain implements Chain {
    private final Call call;
    private int calls;
    private final int connectTimeout;
    private final RealConnection connection;
    private final EventListener eventListener;
    private final HttpCodec httpCodec;
    private final int index;
    private final List<Interceptor> interceptors;
    private final int readTimeout;
    private final Request request;
    private final StreamAllocation streamAllocation;
    private final int writeTimeout;

    public RealInterceptorChain(List<Interceptor> list, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection, int i, Request request, Call call, EventListener eventListener, int i2, int i3, int i4) {
        this.interceptors = list;
        this.connection = realConnection;
        this.streamAllocation = streamAllocation;
        this.httpCodec = httpCodec;
        this.index = i;
        this.request = request;
        this.call = call;
        this.eventListener = eventListener;
        this.connectTimeout = i2;
        this.readTimeout = i3;
        this.writeTimeout = i4;
    }

    public Connection connection() {
        return this.connection;
    }

    public int connectTimeoutMillis() {
        return this.connectTimeout;
    }

    public Chain withConnectTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.streamAllocation, this.httpCodec, this.connection, this.index, this.request, this.call, this.eventListener, Util.checkDuration("timeout", (long) i, timeUnit), this.readTimeout, this.writeTimeout);
    }

    public int readTimeoutMillis() {
        return this.readTimeout;
    }

    public Chain withReadTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.streamAllocation, this.httpCodec, this.connection, this.index, this.request, this.call, this.eventListener, this.connectTimeout, Util.checkDuration("timeout", (long) i, timeUnit), this.writeTimeout);
    }

    public int writeTimeoutMillis() {
        return this.writeTimeout;
    }

    public Chain withWriteTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.streamAllocation, this.httpCodec, this.connection, this.index, this.request, this.call, this.eventListener, this.connectTimeout, this.readTimeout, Util.checkDuration("timeout", (long) i, timeUnit));
    }

    public StreamAllocation streamAllocation() {
        return this.streamAllocation;
    }

    public HttpCodec httpStream() {
        return this.httpCodec;
    }

    public Call call() {
        return this.call;
    }

    public EventListener eventListener() {
        return this.eventListener;
    }

    public Request request() {
        return this.request;
    }

    public Response proceed(Request request) {
        return proceed(request, this.streamAllocation, this.httpCodec, this.connection);
    }

    public Response proceed(Request request, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection) {
        if (this.index < this.interceptors.size()) {
            this.calls++;
            String str = "network interceptor ";
            if (this.httpCodec == null || this.connection.supportsUrl(request.url())) {
                String str2 = " must call proceed() exactly once";
                if (this.httpCodec == null || this.calls <= 1) {
                    RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.interceptors, streamAllocation, httpCodec, realConnection, this.index + 1, request, this.call, this.eventListener, this.connectTimeout, this.readTimeout, this.writeTimeout);
                    Interceptor interceptor = (Interceptor) this.interceptors.get(this.index);
                    Response intercept = interceptor.intercept(realInterceptorChain);
                    if (httpCodec == null || this.index + 1 >= this.interceptors.size() || realInterceptorChain.calls == 1) {
                        String str3 = "interceptor ";
                        StringBuilder stringBuilder;
                        if (intercept == null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str3);
                            stringBuilder.append(interceptor);
                            stringBuilder.append(" returned null");
                            throw new NullPointerException(stringBuilder.toString());
                        } else if (intercept.body() != null) {
                            return intercept;
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str3);
                            stringBuilder.append(interceptor);
                            stringBuilder.append(" returned a response with no body");
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    }
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str);
                    stringBuilder2.append(interceptor);
                    stringBuilder2.append(str2);
                    throw new IllegalStateException(stringBuilder2.toString());
                }
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(str);
                stringBuilder3.append(this.interceptors.get(this.index - 1));
                stringBuilder3.append(str2);
                throw new IllegalStateException(stringBuilder3.toString());
            }
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(str);
            stringBuilder4.append(this.interceptors.get(this.index - 1));
            stringBuilder4.append(" must retain the same host and port");
            throw new IllegalStateException(stringBuilder4.toString());
        }
        throw new AssertionError();
    }
}
