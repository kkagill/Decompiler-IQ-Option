package com.iqoption.feed.fetching;

import android.text.TextUtils;
import com.iqoption.core.connect.http.c;
import com.iqoption.core.microservices.feed.MediaType;
import com.iqoption.core.microservices.feed.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;

@i(bne = {1, 1, 15}, bnf = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0015"}, bng = {"Lcom/iqoption/feed/fetching/ImageDownloader;", "", "()V", "byteBuffers", "com/iqoption/feed/fetching/ImageDownloader$byteBuffers$1", "Lcom/iqoption/feed/fetching/ImageDownloader$byteBuffers$1;", "copyStream", "", "input", "Ljava/io/InputStream;", "out", "Ljava/io/OutputStream;", "loadImage", "previewable", "Lcom/iqoption/core/microservices/feed/Previewable;", "mediaType", "Lcom/iqoption/core/microservices/feed/MediaType;", "loadOriginal", "loadThumbnail", "readImageContent", "byteStream", "feed_release"})
/* compiled from: ImageDownloader.kt */
public final class f {
    private final a cSp = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, bng = {"com/iqoption/feed/fetching/ImageDownloader$byteBuffers$1", "Ljava/lang/ThreadLocal;", "", "initialValue", "feed_release"})
    /* compiled from: ImageDownloader.kt */
    public static final class a extends ThreadLocal<byte[]> {
        a() {
        }

        /* Access modifiers changed, original: protected */
        /* renamed from: awz */
        public byte[] initialValue() {
            return new byte[8092];
        }
    }

    public final void j(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "previewable");
        if (dVar.adF() && !h.cSs.a(dVar, MediaType.THUMBNAIL)) {
            d(dVar, MediaType.THUMBNAIL);
        }
    }

    public final void i(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "previewable");
        if (dVar.adF() && !h.cSs.a(dVar, MediaType.ORIGINAL)) {
            d(dVar, MediaType.ORIGINAL);
        }
    }

    private final void d(d dVar, MediaType mediaType) {
        String adD;
        int i = g.aob[mediaType.ordinal()];
        if (i == 1) {
            adD = dVar.adD();
        } else if (i == 2) {
            adD = dVar.adC();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (TextUtils.isEmpty(adD)) {
            throw new IOException("empty url");
        }
        OkHttpClient UJ = c.UJ();
        Builder builder = new Builder();
        if (adD == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        Response execute = UJ.newCall(builder.url(adD).build()).execute();
        try {
            StringBuilder stringBuilder;
            if (execute.body() != null) {
                int code = execute.code();
                if (200 > code || 300 < code) {
                    dVar.adE();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Bad response code for url ");
                    stringBuilder.append(adD);
                    throw new IOException(stringBuilder.toString());
                }
                ResponseBody body = execute.body();
                if (body == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                InputStream byteStream = body.byteStream();
                kotlin.jvm.internal.i.e(byteStream, "response.body()!!.byteStream()");
                a(dVar, byteStream, mediaType);
                return;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Empty body for ");
            stringBuilder.append(adD);
            throw new IOException(stringBuilder.toString());
        } finally {
            ResponseBody body2 = execute.body();
            if (body2 != null) {
                body2.close();
            }
        }
    }

    private final void a(d dVar, InputStream inputStream, MediaType mediaType) {
        h.cSs.a(dVar, mediaType, new ImageDownloader$readImageContent$1(this, inputStream, dVar));
    }

    private final void b(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = (byte[]) this.cSp.get();
        int read = inputStream.read(bArr);
        while (read != -1) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        outputStream.flush();
    }
}
