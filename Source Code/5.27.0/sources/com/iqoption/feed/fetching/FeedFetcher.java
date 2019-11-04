package com.iqoption.feed.fetching;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.iqoption.core.microservices.feed.MediaType;
import com.iqoption.core.microservices.feed.d;
import com.iqoption.core.microservices.feed.response.FeedItem;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.i;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002*\u0001\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0007J\b\u0010\u001f\u001a\u00020\u001cH\u0007J\u0016\u0010 \u001a\u00020\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u000eJ\u0014\u0010#\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0%J\b\u0010&\u001a\u00020\u001cH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0017¨\u0006'"}, bng = {"Lcom/iqoption/feed/fetching/FeedFetcher;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "THREAD_COUNT", "", "executor", "Ljava/util/concurrent/ExecutorService;", "imageLoader", "Lcom/iqoption/feed/fetching/FeedImageLoader;", "justBound", "", "Lcom/iqoption/core/microservices/feed/Previewable;", "justReceived", "monitor", "Ljava/lang/Object;", "receivedIsInProcess", "", "shutdown", "stubPreviewable", "com/iqoption/feed/fetching/FeedFetcher$stubPreviewable$1", "Lcom/iqoption/feed/fetching/FeedFetcher$stubPreviewable$1;", "asPreviewable", "item", "Lcom/iqoption/core/microservices/feed/response/FeedItem;", "endlessWorkingLoop", "", "isBound", "onStart", "onStop", "process", "tempArray", "putJustBound", "putJustReceived", "items", "", "startLoop", "feed_release"})
/* compiled from: FeedFetcher.kt */
public final class FeedFetcher implements LifecycleObserver {
    private static final String TAG = FeedFetcher.class.getName();
    private static final ExecutorService cRG = Executors.newFixedThreadPool(4);
    private static final e cSb = new e();
    private static final List<d> cSc = new ArrayList();
    private static final List<d> cSd = new ArrayList();
    private static final Object cSe = new Object();
    private static boolean cSf;
    private static final b cSg = new b();
    public static final FeedFetcher cSh = new FeedFetcher();
    private static volatile boolean shutdown;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: FeedFetcher.kt */
    static final class a implements Runnable {
        public static final a cSi = new a();

        a() {
        }

        public final void run() {
            FeedFetcher.cSh.aww();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\f"}, bng = {"com/iqoption/feed/fetching/FeedFetcher$stubPreviewable$1", "Lcom/iqoption/core/microservices/feed/Previewable;", "getKeyBase", "", "type", "Lcom/iqoption/core/microservices/feed/MediaType;", "isContentValid", "", "originalPreviewUrl", "setContentInvalid", "", "thumbnailPreviewUrl", "feed_release"})
    /* compiled from: FeedFetcher.kt */
    public static final class b implements d {
        public String a(MediaType mediaType) {
            kotlin.jvm.internal.i.f(mediaType, "type");
            return null;
        }

        public String adC() {
            return null;
        }

        public String adD() {
            return null;
        }

        public void adE() {
        }

        public boolean adF() {
            return true;
        }

        b() {
        }
    }

    private FeedFetcher() {
    }

    public final void aR(List<? extends d> list) {
        kotlin.jvm.internal.i.f(list, "items");
        synchronized (cSe) {
            cSd.addAll(list);
            cSe.notifyAll();
            l lVar = l.eVB;
        }
    }

    public final void f(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "item");
        synchronized (cSe) {
            cSc.add(dVar);
            cSe.notifyAll();
            l lVar = l.eVB;
        }
    }

    @OnLifecycleEvent(Event.ON_START)
    public final void onStart() {
        shutdown = false;
        awv();
    }

    @OnLifecycleEvent(Event.ON_STOP)
    public final void onStop() {
        shutdown = true;
        synchronized (cSe) {
            cSe.notifyAll();
            l lVar = l.eVB;
        }
    }

    public final d a(FeedItem feedItem) {
        kotlin.jvm.internal.i.f(feedItem, "item");
        if (feedItem instanceof com.iqoption.core.microservices.feed.response.a) {
            return (d) feedItem;
        }
        return cSg;
    }

    private final boolean b(d dVar) {
        return a.cRJ.b(dVar);
    }

    private final void awv() {
        for (int i = 1; i <= 4; i++) {
            cRG.execute(a.cSi);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0025 */
    private final void aww() {
        /*
        r3 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.List) r0;
    L_0x0007:
        r1 = shutdown;
        if (r1 != 0) goto L_0x0066;
    L_0x000b:
        r1 = 0;
        r3.aS(r0);	 Catch:{ RuntimeException -> 0x0053, InterruptedException -> 0x0025 }
        r0.clear();
        r2 = cSe;
        monitor-enter(r2);
        cSf = r1;	 Catch:{ all -> 0x0020 }
        r1 = cSe;	 Catch:{ all -> 0x0020 }
        r1.notifyAll();	 Catch:{ all -> 0x0020 }
        r1 = kotlin.l.eVB;	 Catch:{ all -> 0x0020 }
    L_0x001e:
        monitor-exit(r2);
        goto L_0x0007;
    L_0x0020:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x0023:
        r2 = move-exception;
        goto L_0x003f;
    L_0x0025:
        r2 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0023 }
        r2.interrupt();	 Catch:{ all -> 0x0023 }
        r0.clear();
        r2 = cSe;
        monitor-enter(r2);
        cSf = r1;	 Catch:{ all -> 0x003c }
        r1 = cSe;	 Catch:{ all -> 0x003c }
        r1.notifyAll();	 Catch:{ all -> 0x003c }
        r1 = kotlin.l.eVB;	 Catch:{ all -> 0x003c }
        goto L_0x001e;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x003f:
        r0.clear();
        r0 = cSe;
        monitor-enter(r0);
        cSf = r1;	 Catch:{ all -> 0x0050 }
        r1 = cSe;	 Catch:{ all -> 0x0050 }
        r1.notifyAll();	 Catch:{ all -> 0x0050 }
        r1 = kotlin.l.eVB;	 Catch:{ all -> 0x0050 }
        monitor-exit(r0);
        throw r2;
    L_0x0050:
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
    L_0x0053:
        r0.clear();
        r2 = cSe;
        monitor-enter(r2);
        cSf = r1;	 Catch:{ all -> 0x0063 }
        r1 = cSe;	 Catch:{ all -> 0x0063 }
        r1.notifyAll();	 Catch:{ all -> 0x0063 }
        r1 = kotlin.l.eVB;	 Catch:{ all -> 0x0063 }
        goto L_0x001e;
    L_0x0063:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x0066:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.feed.fetching.FeedFetcher.aww():void");
    }

    /* JADX WARNING: Missing block: B:23:0x0050, code skipped:
            r0 = (com.iqoption.core.microservices.feed.d) null;
            r6 = r6.iterator();
     */
    /* JADX WARNING: Missing block: B:25:0x005d, code skipped:
            if (r6.hasNext() == false) goto L_0x008c;
     */
    /* JADX WARNING: Missing block: B:26:0x005f, code skipped:
            r1 = (com.iqoption.core.microservices.feed.d) r6.next();
     */
    /* JADX WARNING: Missing block: B:27:0x0065, code skipped:
            if (r2 == false) goto L_0x0088;
     */
    /* JADX WARNING: Missing block: B:29:0x006d, code skipped:
            if (cSh.b(r1) != false) goto L_0x0088;
     */
    /* JADX WARNING: Missing block: B:30:0x006f, code skipped:
            r3 = cSe;
     */
    /* JADX WARNING: Missing block: B:31:0x0071, code skipped:
            monitor-enter(r3);
     */
    /* JADX WARNING: Missing block: B:34:0x0078, code skipped:
            if (cSh.b(r1) == false) goto L_0x0081;
     */
    /* JADX WARNING: Missing block: B:35:0x007a, code skipped:
            cSc.remove(r1);
     */
    /* JADX WARNING: Missing block: B:36:0x007f, code skipped:
            monitor-exit(r3);
     */
    /* JADX WARNING: Missing block: B:39:?, code skipped:
            r4 = kotlin.l.eVB;
     */
    /* JADX WARNING: Missing block: B:40:0x0083, code skipped:
            monitor-exit(r3);
     */
    /* JADX WARNING: Missing block: B:44:0x0088, code skipped:
            if (r0 != null) goto L_0x0059;
     */
    /* JADX WARNING: Missing block: B:45:0x008a, code skipped:
            r0 = r1;
     */
    /* JADX WARNING: Missing block: B:46:0x008c, code skipped:
            if (r0 != null) goto L_0x008f;
     */
    /* JADX WARNING: Missing block: B:47:0x008e, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:48:0x008f, code skipped:
            r6 = cSe;
     */
    /* JADX WARNING: Missing block: B:49:0x0091, code skipped:
            monitor-enter(r6);
     */
    /* JADX WARNING: Missing block: B:50:0x0092, code skipped:
            if (r2 == false) goto L_0x00a3;
     */
    /* JADX WARNING: Missing block: B:52:?, code skipped:
            r1 = cSc;
     */
    /* JADX WARNING: Missing block: B:53:0x0096, code skipped:
            if (r0 != null) goto L_0x009b;
     */
    /* JADX WARNING: Missing block: B:54:0x0098, code skipped:
            kotlin.jvm.internal.i.bnJ();
     */
    /* JADX WARNING: Missing block: B:56:0x009f, code skipped:
            if (r1.remove(r0) != false) goto L_0x00b2;
     */
    /* JADX WARNING: Missing block: B:57:0x00a1, code skipped:
            monitor-exit(r6);
     */
    /* JADX WARNING: Missing block: B:58:0x00a2, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:60:?, code skipped:
            r1 = cSd;
     */
    /* JADX WARNING: Missing block: B:61:0x00a5, code skipped:
            if (r0 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Missing block: B:62:0x00a7, code skipped:
            kotlin.jvm.internal.i.bnJ();
     */
    /* JADX WARNING: Missing block: B:64:0x00ae, code skipped:
            if (r1.remove(r0) != false) goto L_0x00b2;
     */
    /* JADX WARNING: Missing block: B:65:0x00b0, code skipped:
            monitor-exit(r6);
     */
    /* JADX WARNING: Missing block: B:66:0x00b1, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:68:?, code skipped:
            r1 = kotlin.l.eVB;
     */
    /* JADX WARNING: Missing block: B:69:0x00b4, code skipped:
            monitor-exit(r6);
     */
    /* JADX WARNING: Missing block: B:71:?, code skipped:
            r6 = cSb;
     */
    /* JADX WARNING: Missing block: B:72:0x00b7, code skipped:
            if (r0 != null) goto L_0x00bc;
     */
    /* JADX WARNING: Missing block: B:73:0x00b9, code skipped:
            kotlin.jvm.internal.i.bnJ();
     */
    /* JADX WARNING: Missing block: B:74:0x00bc, code skipped:
            r6.g(r0);
     */
    private final void aS(java.util.List<com.iqoption.core.microservices.feed.d> r6) {
        /*
        r5 = this;
        r0 = cSe;
        monitor-enter(r0);
    L_0x0003:
        r1 = cSc;	 Catch:{ all -> 0x00c3 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x00c3 }
        if (r1 == 0) goto L_0x0021;
    L_0x000b:
        r1 = cSf;	 Catch:{ all -> 0x00c3 }
        if (r1 != 0) goto L_0x0017;
    L_0x000f:
        r1 = cSd;	 Catch:{ all -> 0x00c3 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x00c3 }
        if (r1 == 0) goto L_0x0021;
    L_0x0017:
        r1 = shutdown;	 Catch:{ all -> 0x00c3 }
        if (r1 != 0) goto L_0x0021;
    L_0x001b:
        r1 = cSe;	 Catch:{ all -> 0x00c3 }
        r1.wait();	 Catch:{ all -> 0x00c3 }
        goto L_0x0003;
    L_0x0021:
        r1 = shutdown;	 Catch:{ all -> 0x00c3 }
        if (r1 == 0) goto L_0x002e;
    L_0x0025:
        r6 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x00c3 }
        r6.interrupt();	 Catch:{ all -> 0x00c3 }
        monitor-exit(r0);
        return;
    L_0x002e:
        r1 = cSc;	 Catch:{ all -> 0x00c3 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x00c3 }
        r2 = 1;
        if (r1 == 0) goto L_0x0044;
    L_0x0037:
        r1 = cSd;	 Catch:{ all -> 0x00c3 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x00c3 }
        r6.addAll(r1);	 Catch:{ all -> 0x00c3 }
        cSf = r2;	 Catch:{ all -> 0x00c3 }
        r2 = 0;
        r1 = kotlin.l.eVB;	 Catch:{ all -> 0x00c3 }
        goto L_0x004f;
    L_0x0044:
        r1 = cSc;	 Catch:{ all -> 0x00c3 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x00c3 }
        r1 = r6.addAll(r1);	 Catch:{ all -> 0x00c3 }
        java.lang.Boolean.valueOf(r1);	 Catch:{ all -> 0x00c3 }
    L_0x004f:
        monitor-exit(r0);
        r0 = 0;
        r0 = (com.iqoption.core.microservices.feed.d) r0;
        r6 = (java.lang.Iterable) r6;
        r6 = r6.iterator();
    L_0x0059:
        r1 = r6.hasNext();
        if (r1 == 0) goto L_0x008c;
    L_0x005f:
        r1 = r6.next();
        r1 = (com.iqoption.core.microservices.feed.d) r1;
        if (r2 == 0) goto L_0x0088;
    L_0x0067:
        r3 = cSh;
        r3 = r3.b(r1);
        if (r3 != 0) goto L_0x0088;
    L_0x006f:
        r3 = cSe;
        monitor-enter(r3);
        r4 = cSh;	 Catch:{ all -> 0x0085 }
        r4 = r4.b(r1);	 Catch:{ all -> 0x0085 }
        if (r4 == 0) goto L_0x0081;
    L_0x007a:
        r4 = cSc;	 Catch:{ all -> 0x0085 }
        r4.remove(r1);	 Catch:{ all -> 0x0085 }
        monitor-exit(r3);
        goto L_0x0059;
    L_0x0081:
        r4 = kotlin.l.eVB;	 Catch:{ all -> 0x0085 }
        monitor-exit(r3);
        goto L_0x0088;
    L_0x0085:
        r6 = move-exception;
        monitor-exit(r3);
        throw r6;
    L_0x0088:
        if (r0 != 0) goto L_0x0059;
    L_0x008a:
        r0 = r1;
        goto L_0x0059;
    L_0x008c:
        if (r0 != 0) goto L_0x008f;
    L_0x008e:
        return;
    L_0x008f:
        r6 = cSe;
        monitor-enter(r6);
        if (r2 == 0) goto L_0x00a3;
    L_0x0094:
        r1 = cSc;	 Catch:{ all -> 0x00c0 }
        if (r0 != 0) goto L_0x009b;
    L_0x0098:
        kotlin.jvm.internal.i.bnJ();	 Catch:{ all -> 0x00c0 }
    L_0x009b:
        r1 = r1.remove(r0);	 Catch:{ all -> 0x00c0 }
        if (r1 != 0) goto L_0x00b2;
    L_0x00a1:
        monitor-exit(r6);
        return;
    L_0x00a3:
        r1 = cSd;	 Catch:{ all -> 0x00c0 }
        if (r0 != 0) goto L_0x00aa;
    L_0x00a7:
        kotlin.jvm.internal.i.bnJ();	 Catch:{ all -> 0x00c0 }
    L_0x00aa:
        r1 = r1.remove(r0);	 Catch:{ all -> 0x00c0 }
        if (r1 != 0) goto L_0x00b2;
    L_0x00b0:
        monitor-exit(r6);
        return;
    L_0x00b2:
        r1 = kotlin.l.eVB;	 Catch:{ all -> 0x00c0 }
        monitor-exit(r6);
        r6 = cSb;	 Catch:{ IOException -> 0x00bf }
        if (r0 != 0) goto L_0x00bc;
    L_0x00b9:
        kotlin.jvm.internal.i.bnJ();	 Catch:{ IOException -> 0x00bf }
    L_0x00bc:
        r6.g(r0);	 Catch:{ IOException -> 0x00bf }
    L_0x00bf:
        return;
    L_0x00c0:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x00c3:
        r6 = move-exception;
        monitor-exit(r0);
        goto L_0x00c7;
    L_0x00c6:
        throw r6;
    L_0x00c7:
        goto L_0x00c6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.feed.fetching.FeedFetcher.aS(java.util.List):void");
    }
}
