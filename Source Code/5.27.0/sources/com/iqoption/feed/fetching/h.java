package com.iqoption.feed.fetching;

import android.annotation.SuppressLint;
import com.iqoption.core.d;
import com.iqoption.core.microservices.feed.MediaType;
import com.iqoption.core.util.l;
import java.io.FileInputStream;
import java.io.OutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;
import kotlin.jvm.a.b;
import okio.ByteString;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J*\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00130\u0018R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, bng = {"Lcom/iqoption/feed/fetching/MediaDiskCache;", "", "()V", "ORIGINALS_CACHE_SIZE", "", "THUMBNAIL_CACHE_SIZE", "originalCache", "Lcom/iqoption/feed/fetching/CacheWrapper;", "thumbnailCache", "get", "Ljava/io/FileInputStream;", "cacheableObject", "Lcom/iqoption/core/microservices/feed/CachableObject;", "type", "Lcom/iqoption/core/microservices/feed/MediaType;", "getCache", "getKey", "", "isCached", "", "notifyPreviewable", "", "write", "writer", "Lkotlin/Function1;", "Ljava/io/OutputStream;", "feed_release"})
/* compiled from: MediaDiskCache.kt */
public final class h {
    @SuppressLint({"StaticFieldLeak"})
    private static final c cSq = new c(d.Um().getContext(), "thumbnails", 33554432);
    @SuppressLint({"StaticFieldLeak"})
    private static final c cSr = new c(d.Um().getContext(), "originals", 67108864);
    public static final h cSs = new h();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: MediaDiskCache.kt */
    static final class a implements Runnable {
        final /* synthetic */ MediaType cRR;
        final /* synthetic */ com.iqoption.core.microservices.feed.a cSt;

        a(com.iqoption.core.microservices.feed.a aVar, MediaType mediaType) {
            this.cSt = aVar;
            this.cRR = mediaType;
        }

        public final void run() {
            a.cRJ.a((com.iqoption.core.microservices.feed.d) this.cSt, this.cRR);
        }
    }

    private h() {
    }

    public final boolean a(com.iqoption.core.microservices.feed.a aVar, MediaType mediaType) {
        kotlin.jvm.internal.i.f(aVar, "cacheableObject");
        kotlin.jvm.internal.i.f(mediaType, "type");
        FileInputStream b = b(aVar, mediaType);
        boolean z = b != null;
        l.b(b);
        return z;
    }

    public final FileInputStream b(com.iqoption.core.microservices.feed.a aVar, MediaType mediaType) {
        kotlin.jvm.internal.i.f(aVar, "cacheableObject");
        kotlin.jvm.internal.i.f(mediaType, "type");
        String d = d(aVar, mediaType);
        return d != null ? d(mediaType).ib(d) : null;
    }

    public final void a(com.iqoption.core.microservices.feed.a aVar, MediaType mediaType, b<? super OutputStream, Boolean> bVar) {
        kotlin.jvm.internal.i.f(aVar, "cacheableObject");
        kotlin.jvm.internal.i.f(mediaType, "type");
        kotlin.jvm.internal.i.f(bVar, "writer");
        String d = d(aVar, mediaType);
        if (d != null) {
            d(mediaType).e(d, bVar);
            c(aVar, mediaType);
        }
    }

    private final void c(com.iqoption.core.microservices.feed.a aVar, MediaType mediaType) {
        if (aVar instanceof com.iqoption.core.microservices.feed.d) {
            com.iqoption.core.c.a.biN.post(new a(aVar, mediaType));
        }
    }

    public final String d(com.iqoption.core.microservices.feed.a aVar, MediaType mediaType) {
        kotlin.jvm.internal.i.f(aVar, "cacheableObject");
        kotlin.jvm.internal.i.f(mediaType, "type");
        String a = aVar.a(mediaType);
        return a != null ? ByteString.encodeUtf8(a).md5().hex() : null;
    }

    private final c d(MediaType mediaType) {
        int i = i.aob[mediaType.ordinal()];
        if (i == 1) {
            return cSr;
        }
        if (i == 2) {
            return cSq;
        }
        throw new NoWhenBranchMatchedException();
    }
}
