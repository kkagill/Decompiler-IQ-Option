package com.iqoption.feed.fetching;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.util.DisplayMetrics;
import androidx.collection.LruCache;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.ad;
import com.iqoption.core.microservices.feed.MediaType;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.l;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000«\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014*\u0001!\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007QRSTUVWB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\nH\u0002J\u001a\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020\n2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0013JP\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020-2\u0006\u00102\u001a\u00020-2\u0006\u00103\u001a\u00020-2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0002J\u001c\u00107\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\n2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J*\u00108\u001a\u00020\u00162\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u00132\f\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010:\u001a\u00020\u001aH\u0002J@\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020-2\u0006\u00102\u001a\u00020-2\u0006\u00101\u001a\u00020-H\u0002J \u0010>\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f2\u0006\u0010:\u001a\u00020\u001aH\u0002J\u0018\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020A2\u0006\u0010:\u001a\u00020\u001aH\u0002J\u000e\u0010B\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\nJ\b\u0010C\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u00020&2\u0006\u0010'\u001a\u00020\nH\u0002J \u0010F\u001a\u00020&2\u0006\u0010'\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u0004H\u0002J\u0018\u0010H\u001a\u00020&2\u0006\u0010'\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u001aH\u0002J\u000e\u0010I\u001a\u00020&2\u0006\u0010'\u001a\u00020\nJ\b\u0010J\u001a\u00020&H\u0002J8\u0010K\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020-2\u0006\u00102\u001a\u00020-2\u0006\u00101\u001a\u00020-2\u0006\u00104\u001a\u000205H\u0002J\u0012\u0010L\u001a\u00020&2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0013J\u001e\u0010L\u001a\u00020&2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010M\u001a\u0004\u0018\u00010\u0014H\u0002J\u0018\u0010N\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u001aH\u0002J\u0016\u0010O\u001a\u00020&2\u0006\u0010'\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u001aJ\b\u0010P\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000RN\u0010\u0007\u001aB\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \t*\u0004\u0018\u00010\n0\n \t* \u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \t*\u0004\u0018\u00010\n0\n\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\fX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \t*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001cX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u00020!X\u0004¢\u0006\u0004\n\u0002\u0010\"R\u0018\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130$X\u0004¢\u0006\u0002\n\u0000¨\u0006X"}, bng = {"Lcom/iqoption/feed/fetching/CacheLoader;", "", "()V", "NULL_RESULT", "Lcom/iqoption/feed/fetching/CacheLoader$Result;", "TAG", "", "cacheObjectsByKey", "Lcom/google/common/collect/SetMultimap;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/microservices/feed/Previewable;", "cacheOriginal", "Landroidx/collection/LruCache;", "Lcom/iqoption/feed/fetching/CacheLoader$ResultWrapper;", "cacheThumbnail", "executor", "Ljava/util/concurrent/ExecutorService;", "handlersToHandlerInfo", "Ljava/util/WeakHashMap;", "Lcom/iqoption/feed/fetching/CacheLoader$LoadingHandler;", "Lcom/iqoption/feed/fetching/CacheLoader$HandlerInfo;", "isRunning", "", "loading", "Ljava/util/LinkedHashMap;", "Ljava/util/EnumSet;", "Lcom/iqoption/core/microservices/feed/MediaType;", "previewableToLoadingInfo", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/iqoption/feed/fetching/CacheLoader$LoadingInfo;", "queue", "Ljava/lang/ref/ReferenceQueue;", "stubHandler", "com/iqoption/feed/fetching/CacheLoader$stubHandler$1", "Lcom/iqoption/feed/fetching/CacheLoader$stubHandler$1;", "tmpIterationList", "Ljava/util/ArrayList;", "accessCacheObject", "", "previewable", "bind", "handler", "calcPreviewScale", "", "maxWidth", "", "maxHeight", "minWidth", "minHeight", "srcHeight", "srcWidth", "orientation", "outXOffset", "", "outYOffset", "checkCaches", "checkResult", "result", "type", "createScaledBitmap", "Landroid/graphics/Bitmap;", "srcBitmap", "getCache", "getResult", "inputStream", "Ljava/io/FileInputStream;", "isBound", "newPurgeableBitmapOptions", "Landroid/graphics/BitmapFactory$Options;", "notifyError", "notifyLoaded", "bitmapResult", "ping", "preload", "processQueue", "scaleParams", "unbind", "oldInfo", "uncache", "updated", "workingLoop", "HandlerInfo", "ImageResult", "LoadingHandler", "LoadingInfo", "PreviewableWeakReference", "Result", "ResultWrapper", "feed_release"})
/* compiled from: CacheLoader.kt */
public final class a {
    private static boolean AB;
    private static final ReferenceQueue<Object> cRA = new ReferenceQueue();
    private static final ConcurrentHashMap<com.iqoption.core.microservices.feed.d, d> cRB = new ConcurrentHashMap();
    private static final WeakHashMap<c<?>, a> cRC = new WeakHashMap();
    private static final ArrayList<c<?>> cRD = new ArrayList();
    private static final LruCache<com.iqoption.core.microservices.feed.d, g<?>> cRE = new LruCache(32);
    private static final LruCache<com.iqoption.core.microservices.feed.d, g<?>> cRF = new LruCache(16);
    private static final ExecutorService cRG = Executors.newSingleThreadExecutor();
    private static final LinkedHashMap<com.iqoption.core.microservices.feed.d, EnumSet<MediaType>> cRH = new LinkedHashMap(32, 0.75f, true);
    private static final ad<String, com.iqoption.core.microservices.feed.d> cRI = MultimapBuilder.um().up().uq();
    public static final a cRJ = new a();
    private static final f cRy = new f();
    private static final k cRz = new k();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, bng = {"Lcom/iqoption/feed/fetching/CacheLoader$HandlerInfo;", "", "lastRequestedPreviewable", "Lcom/iqoption/core/microservices/feed/Previewable;", "lastLoadedType", "Lcom/iqoption/core/microservices/feed/MediaType;", "(Lcom/iqoption/core/microservices/feed/Previewable;Lcom/iqoption/core/microservices/feed/MediaType;)V", "getLastLoadedType", "()Lcom/iqoption/core/microservices/feed/MediaType;", "setLastLoadedType", "(Lcom/iqoption/core/microservices/feed/MediaType;)V", "getLastRequestedPreviewable", "()Lcom/iqoption/core/microservices/feed/Previewable;", "setLastRequestedPreviewable", "(Lcom/iqoption/core/microservices/feed/Previewable;)V", "feed_release"})
    /* compiled from: CacheLoader.kt */
    private static final class a {
        private com.iqoption.core.microservices.feed.d cRK;
        private MediaType cRL;

        public a() {
            this(null, null, 3, null);
        }

        public a(com.iqoption.core.microservices.feed.d dVar, MediaType mediaType) {
            this.cRK = dVar;
            this.cRL = mediaType;
        }

        public /* synthetic */ a(com.iqoption.core.microservices.feed.d dVar, MediaType mediaType, int i, f fVar) {
            if ((i & 1) != 0) {
                dVar = (com.iqoption.core.microservices.feed.d) null;
            }
            if ((i & 2) != 0) {
                mediaType = (MediaType) null;
            }
            this(dVar, mediaType);
        }

        public final com.iqoption.core.microservices.feed.d awl() {
            return this.cRK;
        }

        public final MediaType awm() {
            return this.cRL;
        }

        public final void c(MediaType mediaType) {
            this.cRL = mediaType;
        }

        public final void e(com.iqoption.core.microservices.feed.d dVar) {
            this.cRK = dVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0005H&¨\u0006\f"}, bng = {"Lcom/iqoption/feed/fetching/CacheLoader$LoadingHandler;", "R", "Lcom/iqoption/feed/fetching/CacheLoader$Result;", "", "onError", "", "onLoaded", "result", "mediaType", "Lcom/iqoption/core/microservices/feed/MediaType;", "(Lcom/iqoption/feed/fetching/CacheLoader$Result;Lcom/iqoption/core/microservices/feed/MediaType;)V", "onStart", "feed_release"})
    /* compiled from: CacheLoader.kt */
    public interface c<R extends f> {
        void a(R r, MediaType mediaType);

        void onError();

        void onStart();
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\nJ\b\u0010\u0011\u001a\u00020\u000fH\u0002J$\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\nH\u0002J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u000fJ\u0012\u0010\u0019\u001a\u00020\u001a2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R5\u0010\u0007\u001a&\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t0\bj\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, bng = {"Lcom/iqoption/feed/fetching/CacheLoader$LoadingInfo;", "", "previewable", "Lcom/iqoption/core/microservices/feed/Previewable;", "(Lcom/iqoption/core/microservices/feed/Previewable;)V", "getPreviewable", "()Lcom/iqoption/core/microservices/feed/Previewable;", "weakHandlers", "Ljava/util/HashSet;", "Lcom/iqoption/feed/fetching/CacheLoader$PreviewableWeakReference;", "Lcom/iqoption/feed/fetching/CacheLoader$LoadingHandler;", "Lkotlin/collections/HashSet;", "getWeakHandlers", "()Ljava/util/HashSet;", "add", "", "handler", "copyHandlers", "notifyHandler", "result", "Lcom/iqoption/feed/fetching/CacheLoader$Result;", "type", "Lcom/iqoption/core/microservices/feed/MediaType;", "notifyHandlers", "notifyHandlersError", "remove", "", "feed_release"})
    /* compiled from: CacheLoader.kt */
    private static final class d {
        private final HashSet<e<c<?>>> cRM = new HashSet();
        private final com.iqoption.core.microservices.feed.d cRN;

        public d(com.iqoption.core.microservices.feed.d dVar) {
            kotlin.jvm.internal.i.f(dVar, "previewable");
            this.cRN = dVar;
        }

        public final HashSet<e<c<?>>> awn() {
            return this.cRM;
        }

        public final void b(c<?> cVar) {
            kotlin.jvm.internal.i.f(cVar, "handler");
            Iterator it = this.cRM.iterator();
            kotlin.jvm.internal.i.e(it, "weakHandlers.iterator()");
            while (it.hasNext()) {
                Object next = it.next();
                kotlin.jvm.internal.i.e(next, "it.next()");
                c<?> cVar2 = (c) ((e) next).get();
                if (cVar2 == null) {
                    it.remove();
                } else if (cVar2 == cVar) {
                    return;
                }
            }
            this.cRM.add(new e(cVar, this.cRN, a.cRA));
        }

        public final boolean c(c<?> cVar) {
            kotlin.jvm.internal.i.f(cVar, "handler");
            Iterator it = this.cRM.iterator();
            kotlin.jvm.internal.i.e(it, "weakHandlers.iterator()");
            while (it.hasNext()) {
                Object next = it.next();
                kotlin.jvm.internal.i.e(next, "it.next()");
                c<?> cVar2 = (c) ((e) next).get();
                if (cVar2 == null) {
                    it.remove();
                } else if (cVar2 == cVar) {
                    it.remove();
                }
            }
            return this.cRM.isEmpty();
        }

        public final void b(f fVar, MediaType mediaType) {
            kotlin.jvm.internal.i.f(fVar, "result");
            kotlin.jvm.internal.i.f(mediaType, "type");
            awp();
            try {
                Iterator it = a.cRD.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    kotlin.jvm.internal.i.e(cVar, "handler");
                    a(fVar, mediaType, cVar);
                }
            } finally {
                a.cRD.clear();
            }
        }

        public final void awo() {
            awp();
            try {
                Iterator it = a.cRD.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).onError();
                }
            } finally {
                a.cRD.clear();
            }
        }

        private final void awp() {
            Iterator it = this.cRM.iterator();
            kotlin.jvm.internal.i.e(it, "weakHandlers.iterator()");
            while (it.hasNext()) {
                Object next = it.next();
                kotlin.jvm.internal.i.e(next, "it.next()");
                c cVar = (c) ((e) next).get();
                if (cVar == null) {
                    it.remove();
                } else {
                    a.cRD.add(cVar);
                }
            }
        }

        private final void a(f fVar, MediaType mediaType, c<?> cVar) {
            a aVar = (a) a.cRC.get(cVar);
            if (aVar != null) {
                kotlin.jvm.internal.i.e(aVar, "handlersToHandlerInfo[ha…ption(\"No handler info?\")");
                MediaType awm = aVar.awm();
                if (awm == null || awm.ordinal() <= mediaType.ordinal()) {
                    aVar.c(mediaType);
                    if (cVar != null) {
                        cVar.a(fVar, mediaType);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.iqoption.feed.fetching.CacheLoader.LoadingHandler<com.iqoption.feed.fetching.CacheLoader.Result>");
                }
                return;
            }
            throw new IllegalStateException("No handler info?");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B%\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/feed/fetching/CacheLoader$PreviewableWeakReference;", "T", "Ljava/lang/ref/WeakReference;", "reference", "previewable", "Lcom/iqoption/core/microservices/feed/Previewable;", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "(Ljava/lang/Object;Lcom/iqoption/core/microservices/feed/Previewable;Ljava/lang/ref/ReferenceQueue;)V", "getPreviewable", "()Lcom/iqoption/core/microservices/feed/Previewable;", "feed_release"})
    /* compiled from: CacheLoader.kt */
    private static final class e<T> extends WeakReference<T> {
        private final com.iqoption.core.microservices.feed.d cRN;

        public final com.iqoption.core.microservices.feed.d awq() {
            return this.cRN;
        }

        public e(T t, com.iqoption.core.microservices.feed.d dVar, ReferenceQueue<? super T> referenceQueue) {
            kotlin.jvm.internal.i.f(dVar, "previewable");
            kotlin.jvm.internal.i.f(referenceQueue, "referenceQueue");
            super(t, referenceQueue);
            this.cRN = dVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, bng = {"Lcom/iqoption/feed/fetching/CacheLoader$Result;", "", "()V", "feed_release"})
    /* compiled from: CacheLoader.kt */
    public static class f {
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, bng = {"Lcom/iqoption/feed/fetching/CacheLoader$ResultWrapper;", "R", "Lcom/iqoption/feed/fetching/CacheLoader$Result;", "", "result", "key", "", "invalid", "", "(Lcom/iqoption/feed/fetching/CacheLoader$Result;Ljava/lang/String;Z)V", "getInvalid", "()Z", "setInvalid", "(Z)V", "getKey", "()Ljava/lang/String;", "getResult", "()Lcom/iqoption/feed/fetching/CacheLoader$Result;", "Lcom/iqoption/feed/fetching/CacheLoader$Result;", "feed_release"})
    /* compiled from: CacheLoader.kt */
    private static final class g<R extends f> {
        private final R cRO;
        private boolean cRP;
        private final String key;

        public g(R r, String str, boolean z) {
            kotlin.jvm.internal.i.f(r, "result");
            kotlin.jvm.internal.i.f(str, "key");
            this.cRO = r;
            this.key = str;
            this.cRP = z;
        }

        public /* synthetic */ g(f fVar, String str, boolean z, int i, f fVar2) {
            if ((i & 4) != 0) {
                z = false;
            }
            this(fVar, str, z);
        }

        public final R awr() {
            return this.cRO;
        }

        public final boolean aws() {
            return this.cRP;
        }

        public final void dk(boolean z) {
            this.cRP = z;
        }

        public final String getKey() {
            return this.key;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: CacheLoader.kt */
    static final class h implements Runnable {
        final /* synthetic */ com.iqoption.core.microservices.feed.d $previewable;

        h(com.iqoption.core.microservices.feed.d dVar) {
            this.$previewable = dVar;
        }

        public final void run() {
            d dVar = (d) a.cRB.get(this.$previewable);
            if (dVar != null) {
                dVar.awo();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: CacheLoader.kt */
    static final class i implements Runnable {
        final /* synthetic */ com.iqoption.core.microservices.feed.d $previewable;
        final /* synthetic */ f cRQ;
        final /* synthetic */ MediaType cRR;

        i(com.iqoption.core.microservices.feed.d dVar, f fVar, MediaType mediaType) {
            this.$previewable = dVar;
            this.cRQ = fVar;
            this.cRR = mediaType;
        }

        public final void run() {
            d dVar = (d) a.cRB.get(this.$previewable);
            if (dVar != null) {
                dVar.b(this.cRQ, this.cRR);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: CacheLoader.kt */
    static final class j implements Runnable {
        public static final j cRS = new j();

        j() {
        }

        public final void run() {
            a.cRJ.awi();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/feed/fetching/CacheLoader$ImageResult;", "Lcom/iqoption/feed/fetching/CacheLoader$Result;", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "feed_release"})
    /* compiled from: CacheLoader.kt */
    public static final class b extends f {
        private final Bitmap bitmap;

        public b(Bitmap bitmap) {
            kotlin.jvm.internal.i.f(bitmap, "bitmap");
            this.bitmap = bitmap;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, bng = {"com/iqoption/feed/fetching/CacheLoader$stubHandler$1", "Lcom/iqoption/feed/fetching/CacheLoader$LoadingHandler;", "Lcom/iqoption/feed/fetching/CacheLoader$ImageResult;", "onError", "", "onLoaded", "result", "mediaType", "Lcom/iqoption/core/microservices/feed/MediaType;", "onStart", "feed_release"})
    /* compiled from: CacheLoader.kt */
    public static final class k implements c<b> {
        public void onStart() {
        }

        k() {
        }

        public void a(b bVar, MediaType mediaType) {
            kotlin.jvm.internal.i.f(bVar, "result");
            kotlin.jvm.internal.i.f(mediaType, "mediaType");
            a.cRJ.a((c) this);
        }

        public void onError() {
            a.cRJ.a((c) this);
        }
    }

    private a() {
    }

    public final void a(com.iqoption.core.microservices.feed.d dVar, c<?> cVar) {
        kotlin.jvm.internal.i.f(dVar, "previewable");
        kotlin.jvm.internal.i.f(cVar, "handler");
        awk();
        a aVar = (a) cRC.get(cVar);
        if (aVar == null) {
            aVar = new a(null, null, 3, null);
            cRC.put(cVar, aVar);
        } else if (aVar.awl() != dVar) {
            aVar.c((MediaType) null);
            a((c) cVar, aVar);
        } else {
            return;
        }
        aVar.e(dVar);
        d(dVar);
        d dVar2 = (d) cRB.get(dVar);
        if (dVar2 == null) {
            dVar2 = new d(dVar);
            cRB.put(dVar, dVar2);
        }
        dVar2.b(cVar);
        FeedFetcher.cSh.f(dVar);
        if (!b(dVar, (c) cVar)) {
            b(dVar, MediaType.ORIGINAL);
        }
    }

    public final void a(com.iqoption.core.microservices.feed.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "previewable");
        a(dVar, (c) cRz);
    }

    public final void a(c<?> cVar) {
        kotlin.jvm.internal.i.f(cVar, "handler");
        a((c) cVar, (a) cRC.remove(cVar));
    }

    public final boolean b(com.iqoption.core.microservices.feed.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "previewable");
        return cRB.get(dVar) != null;
    }

    public final void a(com.iqoption.core.microservices.feed.d dVar, MediaType mediaType) {
        kotlin.jvm.internal.i.f(dVar, "previewable");
        kotlin.jvm.internal.i.f(mediaType, "type");
        LruCache b = b(mediaType);
        g gVar = (g) b.get(dVar);
        if (gVar != null) {
            String key = gVar.getKey();
            synchronized (this) {
                for (com.iqoption.core.microservices.feed.d dVar2 : cRI.aE(key)) {
                    g gVar2 = (g) b.get(dVar2);
                    if (gVar2 != null) {
                        if (gVar2 == null) {
                            kotlin.jvm.internal.i.bnJ();
                        }
                        if (gVar2.awr() == cRy) {
                            b.remove(dVar2);
                        } else {
                            if (gVar2 == null) {
                                kotlin.jvm.internal.i.bnJ();
                            }
                            gVar2.dk(true);
                        }
                    }
                    a aVar = cRJ;
                    kotlin.jvm.internal.i.e(dVar2, "m");
                    aVar.b(dVar2, mediaType);
                }
                l lVar = l.eVB;
            }
        }
    }

    private final boolean b(com.iqoption.core.microservices.feed.d dVar, c<?> cVar) {
        g gVar = (g) cRF.get(dVar);
        boolean z = true;
        if (a((c) cVar, gVar, MediaType.ORIGINAL)) {
            return true;
        }
        if (gVar == null || !kotlin.jvm.internal.i.y(gVar.awr(), cRy)) {
            z = false;
        }
        if (a((c) cVar, (g) cRE.get(dVar), MediaType.THUMBNAIL)) {
            return false;
        }
        return z;
    }

    private final boolean a(c<?> cVar, g<?> gVar, MediaType mediaType) {
        if (gVar == null || gVar.awr() == cRy) {
            return false;
        }
        a aVar = (a) cRC.get(cVar);
        if (aVar != null) {
            aVar.c(mediaType);
        }
        if (cVar != null) {
            cVar.a(gVar.awr(), mediaType);
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.feed.fetching.CacheLoader.LoadingHandler<com.iqoption.feed.fetching.CacheLoader.Result>");
    }

    private final void b(com.iqoption.core.microservices.feed.d dVar, MediaType mediaType) {
        synchronized (this) {
            EnumSet enumSet = (EnumSet) cRH.get(dVar);
            if (enumSet == null) {
                Map map = cRH;
                EnumSet of = EnumSet.of(mediaType);
                kotlin.jvm.internal.i.e(of, "EnumSet.of(type)");
                map.put(dVar, of);
            } else {
                enumSet.add(mediaType);
            }
            if (!AB) {
                AB = true;
                cRG.execute(j.cRS);
            }
            l lVar = l.eVB;
        }
    }

    /* JADX WARNING: Missing block: B:11:0x003d, code skipped:
            if (r1 != null) goto L_0x0042;
     */
    /* JADX WARNING: Missing block: B:12:0x003f, code skipped:
            kotlin.jvm.internal.i.bnJ();
     */
    /* JADX WARNING: Missing block: B:14:0x0048, code skipped:
            if (r1.contains(com.iqoption.core.microservices.feed.MediaType.ORIGINAL) == false) goto L_0x006d;
     */
    /* JADX WARNING: Missing block: B:15:0x004a, code skipped:
            if (r2 != null) goto L_0x004f;
     */
    /* JADX WARNING: Missing block: B:16:0x004c, code skipped:
            kotlin.jvm.internal.i.bnJ();
     */
    /* JADX WARNING: Missing block: B:18:0x0055, code skipped:
            if (c(r2, com.iqoption.core.microservices.feed.MediaType.ORIGINAL) == false) goto L_0x006d;
     */
    /* JADX WARNING: Missing block: B:19:0x0057, code skipped:
            if (r1 != null) goto L_0x005c;
     */
    /* JADX WARNING: Missing block: B:20:0x0059, code skipped:
            kotlin.jvm.internal.i.bnJ();
     */
    /* JADX WARNING: Missing block: B:21:0x005c, code skipped:
            r1.remove(com.iqoption.core.microservices.feed.MediaType.ORIGINAL);
     */
    /* JADX WARNING: Missing block: B:22:0x0061, code skipped:
            if (r1 != null) goto L_0x0066;
     */
    /* JADX WARNING: Missing block: B:23:0x0063, code skipped:
            kotlin.jvm.internal.i.bnJ();
     */
    /* JADX WARNING: Missing block: B:25:0x006a, code skipped:
            if (r1.isEmpty() == false) goto L_0x006d;
     */
    /* JADX WARNING: Missing block: B:27:0x006d, code skipped:
            if (r1 != null) goto L_0x0072;
     */
    /* JADX WARNING: Missing block: B:28:0x006f, code skipped:
            kotlin.jvm.internal.i.bnJ();
     */
    /* JADX WARNING: Missing block: B:30:0x0078, code skipped:
            if (r1.contains(com.iqoption.core.microservices.feed.MediaType.ORIGINAL) != false) goto L_0x0087;
     */
    /* JADX WARNING: Missing block: B:31:0x007a, code skipped:
            if (r1 != null) goto L_0x007f;
     */
    /* JADX WARNING: Missing block: B:32:0x007c, code skipped:
            kotlin.jvm.internal.i.bnJ();
     */
    /* JADX WARNING: Missing block: B:34:0x0085, code skipped:
            if (r1.contains(com.iqoption.core.microservices.feed.MediaType.THUMBNAIL) == false) goto L_0x0000;
     */
    /* JADX WARNING: Missing block: B:35:0x0087, code skipped:
            if (r2 != null) goto L_0x008c;
     */
    /* JADX WARNING: Missing block: B:36:0x0089, code skipped:
            kotlin.jvm.internal.i.bnJ();
     */
    /* JADX WARNING: Missing block: B:38:0x0092, code skipped:
            if (c(r2, com.iqoption.core.microservices.feed.MediaType.THUMBNAIL) == false) goto L_0x0000;
     */
    /* JADX WARNING: Missing block: B:39:0x0094, code skipped:
            if (r1 != null) goto L_0x0099;
     */
    /* JADX WARNING: Missing block: B:40:0x0096, code skipped:
            kotlin.jvm.internal.i.bnJ();
     */
    /* JADX WARNING: Missing block: B:41:0x0099, code skipped:
            r1.remove(com.iqoption.core.microservices.feed.MediaType.THUMBNAIL);
     */
    private final void awi() {
        /*
        r3 = this;
    L_0x0000:
        r0 = 0;
        r1 = r0;
        r1 = (com.iqoption.core.microservices.feed.d) r1;
        r0 = (java.util.EnumSet) r0;
        monitor-enter(r3);
        r0 = cRH;	 Catch:{ all -> 0x00a0 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x00a0 }
        r0 = r0.iterator();	 Catch:{ all -> 0x00a0 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x00a0 }
        if (r1 != 0) goto L_0x001c;
    L_0x0017:
        r0 = 0;
        AB = r0;	 Catch:{ all -> 0x00a0 }
        monitor-exit(r3);
        return;
    L_0x001c:
        r1 = r0.next();	 Catch:{ all -> 0x00a0 }
        r2 = "iterator.next()";
        kotlin.jvm.internal.i.e(r1, r2);	 Catch:{ all -> 0x00a0 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ all -> 0x00a0 }
        r2 = r1.getKey();	 Catch:{ all -> 0x00a0 }
        r2 = (com.iqoption.core.microservices.feed.d) r2;	 Catch:{ all -> 0x00a0 }
        r1 = r1.getValue();	 Catch:{ all -> 0x00a0 }
        r1 = (java.util.EnumSet) r1;	 Catch:{ all -> 0x00a0 }
        r1 = java.util.EnumSet.copyOf(r1);	 Catch:{ all -> 0x00a0 }
        r0.remove();	 Catch:{ all -> 0x00a0 }
        r0 = kotlin.l.eVB;	 Catch:{ all -> 0x00a0 }
        monitor-exit(r3);
        if (r1 != 0) goto L_0x0042;
    L_0x003f:
        kotlin.jvm.internal.i.bnJ();
    L_0x0042:
        r0 = com.iqoption.core.microservices.feed.MediaType.ORIGINAL;
        r0 = r1.contains(r0);
        if (r0 == 0) goto L_0x006d;
    L_0x004a:
        if (r2 != 0) goto L_0x004f;
    L_0x004c:
        kotlin.jvm.internal.i.bnJ();
    L_0x004f:
        r0 = com.iqoption.core.microservices.feed.MediaType.ORIGINAL;
        r0 = r3.c(r2, r0);
        if (r0 == 0) goto L_0x006d;
    L_0x0057:
        if (r1 != 0) goto L_0x005c;
    L_0x0059:
        kotlin.jvm.internal.i.bnJ();
    L_0x005c:
        r0 = com.iqoption.core.microservices.feed.MediaType.ORIGINAL;
        r1.remove(r0);
        if (r1 != 0) goto L_0x0066;
    L_0x0063:
        kotlin.jvm.internal.i.bnJ();
    L_0x0066:
        r0 = r1.isEmpty();
        if (r0 == 0) goto L_0x006d;
    L_0x006c:
        goto L_0x0000;
    L_0x006d:
        if (r1 != 0) goto L_0x0072;
    L_0x006f:
        kotlin.jvm.internal.i.bnJ();
    L_0x0072:
        r0 = com.iqoption.core.microservices.feed.MediaType.ORIGINAL;
        r0 = r1.contains(r0);
        if (r0 != 0) goto L_0x0087;
    L_0x007a:
        if (r1 != 0) goto L_0x007f;
    L_0x007c:
        kotlin.jvm.internal.i.bnJ();
    L_0x007f:
        r0 = com.iqoption.core.microservices.feed.MediaType.THUMBNAIL;
        r0 = r1.contains(r0);
        if (r0 == 0) goto L_0x0000;
    L_0x0087:
        if (r2 != 0) goto L_0x008c;
    L_0x0089:
        kotlin.jvm.internal.i.bnJ();
    L_0x008c:
        r0 = com.iqoption.core.microservices.feed.MediaType.THUMBNAIL;
        r0 = r3.c(r2, r0);
        if (r0 == 0) goto L_0x0000;
    L_0x0094:
        if (r1 != 0) goto L_0x0099;
    L_0x0096:
        kotlin.jvm.internal.i.bnJ();
    L_0x0099:
        r0 = com.iqoption.core.microservices.feed.MediaType.THUMBNAIL;
        r1.remove(r0);
        goto L_0x0000;
    L_0x00a0:
        r0 = move-exception;
        monitor-exit(r3);
        goto L_0x00a4;
    L_0x00a3:
        throw r0;
    L_0x00a4:
        goto L_0x00a3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.feed.fetching.a.awi():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0075 */
    private final boolean c(com.iqoption.core.microservices.feed.d r13, com.iqoption.core.microservices.feed.MediaType r14) {
        /*
        r12 = this;
        r0 = r12.b(r14);
        r1 = r0.get(r13);
        r1 = (com.iqoption.feed.fetching.a.g) r1;
        r2 = 1;
        if (r1 == 0) goto L_0x0013;
    L_0x000d:
        r3 = r1.aws();
        if (r3 == 0) goto L_0x0081;
    L_0x0013:
        r3 = 0;
        r3 = (java.io.FileInputStream) r3;
        r4 = com.iqoption.feed.fetching.h.cSs;	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        r5 = r13;
        r5 = (com.iqoption.core.microservices.feed.a) r5;	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        r8 = r4.d(r5, r14);	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        r4 = com.iqoption.feed.fetching.h.cSs;	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        r5 = r13;
        r5 = (com.iqoption.core.microservices.feed.a) r5;	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        r3 = r4.b(r5, r14);	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        if (r8 == 0) goto L_0x0037;
    L_0x002a:
        r4 = cRJ;	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        monitor-enter(r4);	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        r5 = cRI;	 Catch:{ all -> 0x0034 }
        r5.i(r8, r13);	 Catch:{ all -> 0x0034 }
        monitor-exit(r4);	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        goto L_0x0037;
    L_0x0034:
        r14 = move-exception;
        monitor-exit(r4);	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        throw r14;	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
    L_0x0037:
        if (r3 == 0) goto L_0x0058;
    L_0x0039:
        r4 = r12.a(r3, r14);	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        r5 = new com.iqoption.feed.fetching.a$g;	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        if (r8 != 0) goto L_0x0044;
    L_0x0041:
        kotlin.jvm.internal.i.bnJ();	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
    L_0x0044:
        r9 = 0;
        r10 = 4;
        r11 = 0;
        r6 = r5;
        r7 = r4;
        r6.<init>(r7, r8, r9, r10, r11);	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        r0.put(r13, r5);	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        r12.a(r13, r14, r4);	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        r3 = (java.io.Closeable) r3;
        com.iqoption.core.util.l.b(r3);
        return r2;
    L_0x0058:
        r14 = r13.adF();	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        if (r14 != 0) goto L_0x0062;
    L_0x005e:
        r12.c(r13);	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        goto L_0x007c;
    L_0x0062:
        if (r8 == 0) goto L_0x007c;
    L_0x0064:
        r14 = new com.iqoption.feed.fetching.a$g;	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        r7 = cRy;	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        r9 = 0;
        r10 = 4;
        r11 = 0;
        r6 = r14;
        r6.<init>(r7, r8, r9, r10, r11);	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        r0.put(r13, r14);	 Catch:{ IOException -> 0x0079, RuntimeException -> 0x0075 }
        goto L_0x007c;
    L_0x0073:
        r13 = move-exception;
        goto L_0x0086;
    L_0x0075:
        r12.c(r13);	 Catch:{ all -> 0x0073 }
        goto L_0x007c;
    L_0x0079:
        r12.c(r13);	 Catch:{ all -> 0x0073 }
    L_0x007c:
        r3 = (java.io.Closeable) r3;
        com.iqoption.core.util.l.b(r3);
    L_0x0081:
        if (r1 == 0) goto L_0x0084;
    L_0x0083:
        goto L_0x0085;
    L_0x0084:
        r2 = 0;
    L_0x0085:
        return r2;
    L_0x0086:
        r3 = (java.io.Closeable) r3;
        com.iqoption.core.util.l.b(r3);
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.feed.fetching.a.c(com.iqoption.core.microservices.feed.d, com.iqoption.core.microservices.feed.MediaType):boolean");
    }

    private final void c(com.iqoption.core.microservices.feed.d dVar) {
        com.iqoption.core.c.a.biN.post(new h(dVar));
    }

    private final void a(com.iqoption.core.microservices.feed.d dVar, MediaType mediaType, f fVar) {
        com.iqoption.core.c.a.biN.post(new i(dVar, fVar, mediaType));
    }

    private final f a(FileInputStream fileInputStream, MediaType mediaType) {
        try {
            Bitmap a;
            if (mediaType == MediaType.ORIGINAL) {
                Resources resources = com.iqoption.core.d.Um().getContext().getResources();
                kotlin.jvm.internal.i.e(resources, "core.context.resources");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                Options awj = awj();
                awj.inJustDecodeBounds = true;
                fileInputStream.getChannel().position(0);
                BitmapFactory.decodeStream(fileInputStream, null, awj);
                awj.inSampleSize = Math.min(awj.outHeight / i2, awj.outWidth / i);
                awj.inJustDecodeBounds = false;
                awj.inMutable = true;
                fileInputStream.getChannel().position(0);
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, awj);
                kotlin.jvm.internal.i.e(decodeStream, "src");
                a = a(decodeStream, i, i2, 1, 1, decodeStream.getWidth(), decodeStream.getHeight());
            } else {
                a = BitmapFactory.decodeStream(fileInputStream);
            }
            if (a != null) {
                return new b(a);
            }
            throw new IOException("file is corrupted");
        } catch (OutOfMemoryError e) {
            throw new IOException(e);
        }
    }

    private final Bitmap a(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        float a = a(i, i2, i3, i4, i6, i5, 0, iArr, iArr2);
        Matrix matrix = new Matrix();
        matrix.postScale(a, a);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, iArr[0], iArr2[0], i5 - (iArr[0] * 2), i6 - (iArr2[0] * 2), matrix, false);
        kotlin.jvm.internal.i.e(createBitmap, "Bitmap.createBitmap(srcB… 2 * y[0], matrix, false)");
        return createBitmap;
    }

    private final float a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2) {
        int i8 = i7;
        if ((i5 * i > i2 * i6 ? 1 : null) != null) {
            if (i8 == 90 || i8 == 270) {
                return a(i, i3, i4, i5, i6, iArr2);
            }
            return a(i2, i4, i3, i5, i6, iArr2);
        } else if (i8 == 90 || i8 == 270) {
            return a(i2, i4, i3, i6, i5, iArr);
        } else {
            return a(i, i3, i4, i6, i5, iArr);
        }
    }

    private final float a(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        float f;
        float f2;
        float f3;
        if (i4 > i2) {
            f = (float) i;
            f2 = (float) i4;
            float f4 = f / f2;
            float f5 = (float) i5;
            f3 = (float) i3;
            if (f4 * f5 >= f3) {
                return f4;
            }
            f4 = f3 / f5;
            iArr[0] = (int) ((f2 - (f / f4)) / ((float) 2));
            return f4;
        }
        f2 = ((float) i3) / ((float) i5);
        f3 = ((float) i4) * f2;
        f = (float) i;
        if (f3 > f) {
            iArr[0] = (int) ((f3 - f) / (((float) 2) * f2));
        }
        return f2;
    }

    private final Options awj() {
        Options options = new Options();
        options.inTempStorage = new byte[16384];
        return options;
    }

    private final LruCache<com.iqoption.core.microservices.feed.d, g<?>> b(MediaType mediaType) {
        int i = b.aob[mediaType.ordinal()];
        if (i == 1) {
            return cRF;
        }
        if (i == 2) {
            return cRE;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void d(com.iqoption.core.microservices.feed.d dVar) {
        synchronized (this) {
            EnumSet enumSet = (EnumSet) cRH.get(dVar);
        }
    }

    private final void awk() {
        for (Reference poll = cRA.poll(); poll != null; poll = cRA.poll()) {
            e eVar = (e) poll;
            d dVar = (d) cRB.get(eVar.awq());
            if (dVar != null) {
                HashSet awn = dVar.awn();
                if (awn != null) {
                    Collection collection = awn;
                    if (collection != null) {
                        o.dj(collection).remove(eVar);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                    }
                }
                continue;
            }
        }
    }

    private final void a(c<?> cVar, a aVar) {
        if (aVar != null) {
            com.iqoption.core.microservices.feed.d awl = aVar.awl();
            d dVar = (d) cRB.get(awl);
            if (dVar != null && dVar.c(cVar)) {
                Map map = cRB;
                if (map != null) {
                    o.dp(map).remove(awl);
                    synchronized (this) {
                        map = cRH;
                        if (map != null) {
                            EnumSet enumSet = (EnumSet) o.dp(map).remove(awl);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                        }
                    }
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
        }
    }
}
