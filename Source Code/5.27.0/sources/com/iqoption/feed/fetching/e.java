package com.iqoption.feed.fetching;

import android.text.TextUtils;
import com.iqoption.core.microservices.feed.d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.i;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.i.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u00060\u0006R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0005R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0006R\u00020\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/feed/fetching/FeedImageLoader;", "", "()V", "currentLoads", "", "Lcom/iqoption/core/microservices/feed/Previewable;", "Lcom/iqoption/feed/fetching/FeedImageLoader$LoadDescriptor;", "downloader", "Lcom/iqoption/feed/fetching/ImageDownloader;", "acquireLoadDescriptor", "previewable", "loadOriginal", "", "loadThumbnail", "performLoad", "LoadDescriptor", "feed_release"})
/* compiled from: FeedImageLoader.kt */
public final class e {
    private final Map<d, a> cSj = new LinkedHashMap();
    private final f cSk = new f();

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/feed/fetching/FeedImageLoader$LoadDescriptor;", "", "previewable", "Lcom/iqoption/core/microservices/feed/Previewable;", "(Lcom/iqoption/feed/fetching/FeedImageLoader;Lcom/iqoption/core/microservices/feed/Previewable;)V", "originalMonitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/JvmType$Object;", "referenceCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "thumbnailMonitor", "acquire", "", "loadOriginal", "loadThumbnail", "release", "feed_release"})
    /* compiled from: FeedImageLoader.kt */
    private final class a {
        private final d cRN;
        private final b cSl = new b("thumbnail");
        private final b cSm = new b("original");
        private final AtomicInteger cSn = new AtomicInteger(0);
        final /* synthetic */ e cSo;

        public a(e eVar, d dVar) {
            kotlin.jvm.internal.i.f(dVar, "previewable");
            this.cSo = eVar;
            this.cRN = dVar;
        }

        public final void awx() {
            acquire();
            try {
                synchronized (this.cSl) {
                    this.cSo.j(this.cRN);
                    l lVar = l.eVB;
                }
                release();
            } catch (Throwable th) {
                release();
            }
        }

        public final void awy() {
            acquire();
            try {
                synchronized (this.cSm) {
                    this.cSo.i(this.cRN);
                    l lVar = l.eVB;
                }
                release();
            } catch (Throwable th) {
                release();
            }
        }

        public final void acquire() {
            this.cSn.incrementAndGet();
        }

        public final void release() {
            if (this.cSn.decrementAndGet() == 0) {
                synchronized (this.cSo) {
                    a aVar = (a) this.cSo.cSj.remove(this.cRN);
                }
            }
        }
    }

    public final void g(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "previewable");
        a h = h(dVar);
        try {
            h.awx();
            h.awy();
        } finally {
            h.release();
        }
    }

    private final a h(d dVar) {
        a aVar;
        synchronized (this) {
            aVar = (a) this.cSj.get(dVar);
            if (aVar == null) {
                aVar = new a(this, dVar);
                this.cSj.put(dVar, aVar);
            }
            aVar.acquire();
        }
        return aVar;
    }

    private final void i(d dVar) {
        if (!TextUtils.isEmpty(dVar.adD())) {
            this.cSk.i(dVar);
        }
    }

    private final void j(d dVar) {
        if (!TextUtils.isEmpty(dVar.adC())) {
            this.cSk.j(dVar);
        }
    }
}
