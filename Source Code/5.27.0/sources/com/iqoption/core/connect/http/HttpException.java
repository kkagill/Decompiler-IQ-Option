package com.iqoption.core.connect.http;

import com.iqoption.core.connect.b;
import com.iqoption.core.connect.g;
import kotlin.i;
import okhttp3.HttpUrl;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/connect/http/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "error", "Lcom/iqoption/core/connect/Error;", "url", "Lokhttp3/HttpUrl;", "message", "", "cause", "", "(Lcom/iqoption/core/connect/Error;Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/lang/Throwable;)V", "getError", "()Lcom/iqoption/core/connect/Error;", "host", "getHost", "()Ljava/lang/String;", "getMessage", "path", "getPath", "toString", "core_release"})
/* compiled from: HttpException.kt */
public final class HttpException extends RuntimeException {
    private final b error;
    private final String host;
    private final String path;

    public /* synthetic */ HttpException(b bVar, HttpUrl httpUrl, String str, Throwable th, int i, f fVar) {
        if ((i & 1) != 0) {
            bVar = g.aZW;
        }
        if ((i & 4) != 0) {
            str = (String) null;
        }
        if ((i & 8) != 0) {
            th = (Throwable) null;
        }
        this(bVar, httpUrl, str, th);
    }

    public HttpException(b bVar, HttpUrl httpUrl, String str, Throwable th) {
        kotlin.jvm.internal.i.f(bVar, "error");
        kotlin.jvm.internal.i.f(httpUrl, "url");
        super(str, th);
        this.error = bVar;
        String host = httpUrl.host();
        kotlin.jvm.internal.i.e(host, "url.host()");
        this.host = host;
        host = httpUrl.encodedPath();
        kotlin.jvm.internal.i.e(host, "url.encodedPath()");
        this.path = host;
    }

    public String getMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("error: ");
        stringBuilder.append(this.error);
        stringBuilder.append("host: ");
        stringBuilder.append(this.host);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append("path: ");
        stringBuilder.append(this.path);
        stringBuilder.append(str);
        str = super.getMessage();
        if (str != null) {
            stringBuilder.append(", message: ");
            stringBuilder.append(str);
        }
        String stringBuilder2 = stringBuilder.toString();
        kotlin.jvm.internal.i.e(stringBuilder2, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append(getLocalizedMessage());
        return stringBuilder.toString();
    }
}
