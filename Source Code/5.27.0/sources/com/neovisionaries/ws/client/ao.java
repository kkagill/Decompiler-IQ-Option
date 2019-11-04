package com.neovisionaries.ws.client;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: WritingThread */
class ao extends an {
    private boolean eAn;
    private aj eAo;
    private final s eAq;
    private boolean eBA;
    private final LinkedList<aj> eBz = new LinkedList();
    private boolean mStopped;

    public ao(af afVar) {
        super("WritingThread", afVar, ThreadType.WRITING_THREAD);
        this.eAq = afVar.bfS();
    }

    public void beR() {
        try {
            bfj();
        } catch (Throwable th) {
            WebSocketError webSocketError = WebSocketError.UNEXPECTED_ERROR_IN_WRITING_THREAD;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("An uncaught throwable was detected in the writing thread: ");
            stringBuilder.append(th.getMessage());
            WebSocketException webSocketException = new WebSocketException(webSocketError, stringBuilder.toString(), th);
            o bfJ = this.dRF.bfJ();
            bfJ.a(webSocketException);
            bfJ.b(webSocketException);
        }
        synchronized (this) {
            this.mStopped = true;
            notifyAll();
        }
        bfm();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
    /* JADX WARNING: Failed to process nested try/catch */
    private void bfj() {
        /*
        r3 = this;
        r0 = r3.dRF;
        r0.bfM();
    L_0x0005:
        r0 = r3.bgq();
        r1 = 1;
        if (r0 != r1) goto L_0x000d;
    L_0x000c:
        goto L_0x001d;
    L_0x000d:
        r2 = 3;
        if (r0 != r2) goto L_0x0014;
    L_0x0010:
        r3.bgp();
        goto L_0x0005;
    L_0x0014:
        r2 = 2;
        if (r0 != r2) goto L_0x0018;
    L_0x0017:
        goto L_0x0005;
    L_0x0018:
        r0 = 0;
        r3.fT(r0);	 Catch:{ WebSocketException -> 0x001d }
        goto L_0x0005;
    L_0x001d:
        r3.fT(r1);	 Catch:{ WebSocketException -> 0x0020 }
    L_0x0020:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neovisionaries.ws.client.ao.bfj():void");
    }

    public void requestStop() {
        synchronized (this) {
            this.eAn = true;
            notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A:{LOOP_START, SYNTHETIC, LOOP:0: B:1:0x0001->B:35:0x0001} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public boolean K(com.neovisionaries.ws.client.aj r3) {
        /*
        r2 = this;
        monitor-enter(r2);
    L_0x0001:
        r0 = r2.mStopped;	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0008;
    L_0x0005:
        r3 = 0;
        monitor-exit(r2);	 Catch:{ all -> 0x0043 }
        return r3;
    L_0x0008:
        r0 = r2.eAn;	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x002e;
    L_0x000c:
        r0 = r2.eAo;	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0011;
    L_0x0010:
        goto L_0x002e;
    L_0x0011:
        r0 = r3.bgg();	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0018;
    L_0x0017:
        goto L_0x002e;
    L_0x0018:
        r0 = r2.dRF;	 Catch:{ all -> 0x0043 }
        r0 = r0.bfA();	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x0021;
    L_0x0020:
        goto L_0x002e;
    L_0x0021:
        r1 = r2.eBz;	 Catch:{ all -> 0x0043 }
        r1 = r1.size();	 Catch:{ all -> 0x0043 }
        if (r1 >= r0) goto L_0x002a;
    L_0x0029:
        goto L_0x002e;
    L_0x002a:
        r2.wait();	 Catch:{ InterruptedException -> 0x0001 }
        goto L_0x0001;
    L_0x002e:
        r0 = L(r3);	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0038;
    L_0x0034:
        r2.M(r3);	 Catch:{ all -> 0x0043 }
        goto L_0x003d;
    L_0x0038:
        r0 = r2.eBz;	 Catch:{ all -> 0x0043 }
        r0.addLast(r3);	 Catch:{ all -> 0x0043 }
    L_0x003d:
        r2.notifyAll();	 Catch:{ all -> 0x0043 }
        monitor-exit(r2);	 Catch:{ all -> 0x0043 }
        r3 = 1;
        return r3;
    L_0x0043:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0043 }
        goto L_0x0047;
    L_0x0046:
        throw r3;
    L_0x0047:
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neovisionaries.ws.client.ao.K(com.neovisionaries.ws.client.aj):boolean");
    }

    private static boolean L(aj ajVar) {
        return ajVar.bge() || ajVar.bgf();
    }

    private void M(aj ajVar) {
        Iterator it = this.eBz.iterator();
        int i = 0;
        while (it.hasNext() && L((aj) it.next())) {
            i++;
        }
        this.eBz.add(i, ajVar);
    }

    private void bgp() {
        try {
            flush();
        } catch (IOException unused) {
        }
    }

    private void flush() {
        this.dRF.bfH().flush();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0027 A:{SKIP} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0023 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|(2:12|(3:14|15|16)(2:17|18))|19|20|(2:22|23)(2:24|(2:26|(3:28|29|30)(3:31|32|33))(2:34|35))) */
    private int bgq() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.eAn;	 Catch:{ all -> 0x003e }
        r1 = 1;
        if (r0 == 0) goto L_0x0008;
    L_0x0006:
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        return r1;
    L_0x0008:
        r0 = r4.eAo;	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        return r1;
    L_0x000e:
        r0 = r4.eBz;	 Catch:{ all -> 0x003e }
        r0 = r0.size();	 Catch:{ all -> 0x003e }
        r2 = 3;
        r3 = 0;
        if (r0 != 0) goto L_0x0023;
    L_0x0018:
        r0 = r4.eBA;	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x0020;
    L_0x001c:
        r4.eBA = r3;	 Catch:{ all -> 0x003e }
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        return r2;
    L_0x0020:
        r4.wait();	 Catch:{ InterruptedException -> 0x0023 }
    L_0x0023:
        r0 = r4.eAn;	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x0029;
    L_0x0027:
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        return r1;
    L_0x0029:
        r0 = r4.eBz;	 Catch:{ all -> 0x003e }
        r0 = r0.size();	 Catch:{ all -> 0x003e }
        if (r0 != 0) goto L_0x003c;
    L_0x0031:
        r0 = r4.eBA;	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x0039;
    L_0x0035:
        r4.eBA = r3;	 Catch:{ all -> 0x003e }
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        return r2;
    L_0x0039:
        r0 = 2;
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        return r0;
    L_0x003c:
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        return r3;
    L_0x003e:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neovisionaries.ws.client.ao.bgq():int");
    }

    /* JADX WARNING: Missing block: B:7:0x0017, code skipped:
            if (fU(r5) == false) goto L_?;
     */
    /* JADX WARNING: Missing block: B:8:0x0019, code skipped:
            doFlush();
     */
    /* JADX WARNING: Missing block: B:11:0x001e, code skipped:
            N(r2);
     */
    /* JADX WARNING: Missing block: B:12:0x0025, code skipped:
            if (r2.bge() != false) goto L_0x003a;
     */
    /* JADX WARNING: Missing block: B:14:0x002b, code skipped:
            if (r2.bgf() == false) goto L_0x002e;
     */
    /* JADX WARNING: Missing block: B:16:0x0032, code skipped:
            if (fU(r5) != false) goto L_0x0035;
     */
    /* JADX WARNING: Missing block: B:18:0x0035, code skipped:
            r0 = cI(r0);
     */
    /* JADX WARNING: Missing block: B:19:0x003a, code skipped:
            doFlush();
            r0 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Missing block: B:32:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:33:?, code skipped:
            return;
     */
    private void fT(boolean r5) {
        /*
        r4 = this;
        r0 = java.lang.System.currentTimeMillis();
    L_0x0004:
        monitor-enter(r4);
        r2 = r4.eBz;	 Catch:{ all -> 0x0042 }
        r2 = r2.poll();	 Catch:{ all -> 0x0042 }
        r2 = (com.neovisionaries.ws.client.aj) r2;	 Catch:{ all -> 0x0042 }
        r4.notifyAll();	 Catch:{ all -> 0x0042 }
        if (r2 != 0) goto L_0x001d;
    L_0x0012:
        monitor-exit(r4);	 Catch:{ all -> 0x0042 }
        r5 = r4.fU(r5);
        if (r5 == 0) goto L_0x001c;
    L_0x0019:
        r4.doFlush();
    L_0x001c:
        return;
    L_0x001d:
        monitor-exit(r4);	 Catch:{ all -> 0x0042 }
        r4.N(r2);
        r3 = r2.bge();
        if (r3 != 0) goto L_0x003a;
    L_0x0027:
        r2 = r2.bgf();
        if (r2 == 0) goto L_0x002e;
    L_0x002d:
        goto L_0x003a;
    L_0x002e:
        r2 = r4.fU(r5);
        if (r2 != 0) goto L_0x0035;
    L_0x0034:
        goto L_0x0004;
    L_0x0035:
        r0 = r4.cI(r0);
        goto L_0x0004;
    L_0x003a:
        r4.doFlush();
        r0 = java.lang.System.currentTimeMillis();
        goto L_0x0004;
    L_0x0042:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0042 }
        goto L_0x0046;
    L_0x0045:
        throw r5;
    L_0x0046:
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neovisionaries.ws.client.ao.fT(boolean):void");
    }

    private boolean fU(boolean z) {
        return z || this.dRF.bfx() || this.eBA || this.eAo != null;
    }

    private long cI(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (1000 >= currentTimeMillis - j) {
            return j;
        }
        doFlush();
        return currentTimeMillis;
    }

    private void doFlush() {
        try {
            flush();
            synchronized (this) {
                this.eBA = false;
            }
        } catch (IOException e) {
            WebSocketError webSocketError = WebSocketError.FLUSH_ERROR;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Flushing frames to the server failed: ");
            stringBuilder.append(e.getMessage());
            WebSocketException webSocketException = new WebSocketException(webSocketError, stringBuilder.toString(), e);
            o bfJ = this.dRF.bfJ();
            bfJ.a(webSocketException);
            bfJ.b(webSocketException, null);
            throw webSocketException;
        }
    }

    private void N(aj ajVar) {
        Object obj;
        ajVar = aj.a(ajVar, this.eAq);
        this.dRF.bfJ().h(ajVar);
        if (this.eAo != null) {
            obj = 1;
        } else {
            if (ajVar.bgd()) {
                this.eAo = ajVar;
            }
            obj = null;
        }
        if (obj != null) {
            this.dRF.bfJ().j(ajVar);
            return;
        }
        if (ajVar.bgd()) {
            bgr();
        }
        try {
            this.dRF.bfH().G(ajVar);
            this.dRF.bfJ().i(ajVar);
        } catch (IOException e) {
            WebSocketError webSocketError = WebSocketError.IO_ERROR_IN_WRITING;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("An I/O error occurred when a frame was tried to be sent: ");
            stringBuilder.append(e.getMessage());
            WebSocketException webSocketException = new WebSocketException(webSocketError, stringBuilder.toString(), e);
            o bfJ = this.dRF.bfJ();
            bfJ.a(webSocketException);
            bfJ.b(webSocketException, ajVar);
            throw webSocketException;
        }
    }

    private void bgr() {
        Object obj;
        StateManager bfI = this.dRF.bfI();
        synchronized (bfI) {
            WebSocketState bfu = bfI.bfu();
            if (bfu == WebSocketState.CLOSING || bfu == WebSocketState.CLOSED) {
                obj = null;
            } else {
                bfI.a(CloseInitiator.CLIENT);
                obj = 1;
            }
        }
        if (obj != null) {
            this.dRF.bfJ().a(WebSocketState.CLOSING);
        }
    }

    private void bfm() {
        this.dRF.F(this.eAo);
    }
}
