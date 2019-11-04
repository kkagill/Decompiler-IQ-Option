package com.neovisionaries.ws.client;

import androidx.core.view.PointerIconCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: ReadingThread */
class z extends an {
    private boolean eAn;
    private aj eAo;
    private List<aj> eAp = new ArrayList();
    private final s eAq;
    private Object eAr = new Object();
    private Timer eAs;
    private a eAt;
    private long eAu;
    private boolean eAv;

    /* compiled from: ReadingThread */
    private class a extends TimerTask {
        private a() {
        }

        public void run() {
            try {
                z.this.dRF.getSocket().close();
            } catch (Throwable unused) {
            }
        }
    }

    public z(af afVar) {
        super("ReadingThread", afVar, ThreadType.READING_THREAD);
        this.eAq = afVar.bfS();
    }

    public void beR() {
        try {
            bfj();
        } catch (Throwable th) {
            WebSocketError webSocketError = WebSocketError.UNEXPECTED_ERROR_IN_READING_THREAD;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("An uncaught throwable was detected in the reading thread: ");
            stringBuilder.append(th.getMessage());
            WebSocketException webSocketException = new WebSocketException(webSocketError, stringBuilder.toString(), th);
            o bfJ = this.dRF.bfJ();
            bfJ.a(webSocketException);
            bfJ.b(webSocketException);
        }
        bfm();
    }

    private void bfj() {
        this.dRF.bfL();
        aj bfk;
        do {
            synchronized (this) {
                if (this.eAn) {
                    break;
                }
                bfk = bfk();
                if (bfk == null) {
                    break;
                }
            }
        } while (u(bfk));
        bfl();
        bfp();
    }

    /* Access modifiers changed, original: 0000 */
    public void cF(long j) {
        synchronized (this) {
            if (this.eAn) {
                return;
            }
            this.eAn = true;
            interrupt();
            this.eAu = j;
            bfn();
        }
    }

    private void a(aj ajVar) {
        this.dRF.bfJ().a(ajVar);
    }

    private void b(aj ajVar) {
        this.dRF.bfJ().b(ajVar);
    }

    private void c(aj ajVar) {
        this.dRF.bfJ().c(ajVar);
    }

    private void d(aj ajVar) {
        this.dRF.bfJ().d(ajVar);
    }

    private void e(aj ajVar) {
        this.dRF.bfJ().e(ajVar);
    }

    private void f(aj ajVar) {
        this.dRF.bfJ().f(ajVar);
    }

    private void g(aj ajVar) {
        this.dRF.bfJ().g(ajVar);
    }

    private void q(byte[] bArr) {
        if (this.dRF.bfz()) {
            this.dRF.bfJ().q(bArr);
            return;
        }
        try {
            kw(p.s(bArr));
        } catch (Throwable th) {
            WebSocketError webSocketError = WebSocketError.TEXT_MESSAGE_CONSTRUCTION_ERROR;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to convert payload data into a string: ");
            stringBuilder.append(th.getMessage());
            WebSocketException webSocketException = new WebSocketException(webSocketError, stringBuilder.toString(), th);
            a(webSocketException);
            b(webSocketException, bArr);
        }
    }

    private void kw(String str) {
        this.dRF.bfJ().kw(str);
    }

    private void r(byte[] bArr) {
        this.dRF.bfJ().r(bArr);
    }

    private void a(WebSocketException webSocketException) {
        this.dRF.bfJ().a(webSocketException);
    }

    private void a(WebSocketException webSocketException, aj ajVar) {
        this.dRF.bfJ().a(webSocketException, ajVar);
    }

    private void a(WebSocketException webSocketException, List<aj> list) {
        this.dRF.bfJ().a(webSocketException, (List) list);
    }

    private void a(WebSocketException webSocketException, byte[] bArr) {
        this.dRF.bfJ().a(webSocketException, bArr);
    }

    private void b(WebSocketException webSocketException, byte[] bArr) {
        this.dRF.bfJ().b(webSocketException, bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    private com.neovisionaries.ws.client.aj bfk() {
        /*
        r7 = this;
        r0 = 0;
        r1 = r7.dRF;	 Catch:{ InterruptedIOException -> 0x0043, IOException -> 0x0019, WebSocketException -> 0x0015 }
        r1 = r1.bfG();	 Catch:{ InterruptedIOException -> 0x0043, IOException -> 0x0019, WebSocketException -> 0x0015 }
        r1 = r1.bfk();	 Catch:{ InterruptedIOException -> 0x0043, IOException -> 0x0019, WebSocketException -> 0x0015 }
        r7.k(r1);	 Catch:{ InterruptedIOException -> 0x0013, IOException -> 0x0011, WebSocketException -> 0x000f }
        return r1;
    L_0x000f:
        r2 = move-exception;
        goto L_0x0017;
    L_0x0011:
        r2 = move-exception;
        goto L_0x001b;
    L_0x0013:
        r2 = move-exception;
        goto L_0x0045;
    L_0x0015:
        r2 = move-exception;
        r1 = r0;
    L_0x0017:
        r3 = r2;
        goto L_0x0066;
    L_0x0019:
        r2 = move-exception;
        r1 = r0;
    L_0x001b:
        r3 = r7.eAn;
        if (r3 == 0) goto L_0x0026;
    L_0x001f:
        r3 = r7.isInterrupted();
        if (r3 == 0) goto L_0x0026;
    L_0x0025:
        return r0;
    L_0x0026:
        r3 = new com.neovisionaries.ws.client.WebSocketException;
        r4 = com.neovisionaries.ws.client.WebSocketError.IO_ERROR_IN_READING;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "An I/O error occurred while a frame was being read from the web socket: ";
        r5.append(r6);
        r6 = r2.getMessage();
        r5.append(r6);
        r5 = r5.toString();
        r3.<init>(r4, r5, r2);
        goto L_0x0066;
    L_0x0043:
        r2 = move-exception;
        r1 = r0;
    L_0x0045:
        r3 = r7.eAn;
        if (r3 == 0) goto L_0x004a;
    L_0x0049:
        return r0;
    L_0x004a:
        r3 = new com.neovisionaries.ws.client.WebSocketException;
        r4 = com.neovisionaries.ws.client.WebSocketError.INTERRUPTED_IN_READING;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "Interruption occurred while a frame was being read from the web socket: ";
        r5.append(r6);
        r6 = r2.getMessage();
        r5.append(r6);
        r5 = r5.toString();
        r3.<init>(r4, r5, r2);
    L_0x0066:
        r2 = r3 instanceof com.neovisionaries.ws.client.NoMoreFrameException;
        r4 = 1;
        if (r2 == 0) goto L_0x0076;
    L_0x006b:
        r7.eAv = r4;
        r2 = r7.dRF;
        r2 = r2.bfy();
        if (r2 == 0) goto L_0x0076;
    L_0x0075:
        r4 = 0;
    L_0x0076:
        if (r4 == 0) goto L_0x007e;
    L_0x0078:
        r7.a(r3);
        r7.a(r3, r1);
    L_0x007e:
        r1 = r7.c(r3);
        r2 = r7.dRF;
        r2.C(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neovisionaries.ws.client.z.bfk():com.neovisionaries.ws.client.aj");
    }

    private void k(aj ajVar) {
        l(ajVar);
        q(ajVar);
        r(ajVar);
        s(ajVar);
        t(ajVar);
    }

    private void l(aj ajVar) {
        if (!this.dRF.bfw()) {
            m(ajVar);
            o(ajVar);
            p(ajVar);
        }
    }

    private void m(aj ajVar) {
        if ((this.eAq == null || !n(ajVar)) && ajVar.bfW()) {
            throw new WebSocketException(WebSocketError.UNEXPECTED_RESERVED_BIT, "The RSV1 bit of a frame is set unexpectedly.");
        }
    }

    private boolean n(aj ajVar) {
        return ajVar.bgb() || ajVar.bgc();
    }

    private void o(aj ajVar) {
        if (ajVar.bfX()) {
            throw new WebSocketException(WebSocketError.UNEXPECTED_RESERVED_BIT, "The RSV2 bit of a frame is set unexpectedly.");
        }
    }

    private void p(aj ajVar) {
        if (ajVar.bfY()) {
            throw new WebSocketException(WebSocketError.UNEXPECTED_RESERVED_BIT, "The RSV3 bit of a frame is set unexpectedly.");
        }
    }

    private void q(aj ajVar) {
        int bfZ = ajVar.bfZ();
        if (!(bfZ == 0 || bfZ == 1 || bfZ == 2)) {
            switch (bfZ) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    if (!this.dRF.bfw()) {
                        WebSocketError webSocketError = WebSocketError.UNKNOWN_OPCODE;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("A frame has an unknown opcode: 0x");
                        stringBuilder.append(Integer.toHexString(ajVar.bfZ()));
                        throw new WebSocketException(webSocketError, stringBuilder.toString());
                    }
                    return;
            }
        }
    }

    private void r(aj ajVar) {
        if (ajVar.bgh()) {
            throw new WebSocketException(WebSocketError.FRAME_MASKED, "A frame from the server is masked.");
        }
    }

    private void s(aj ajVar) {
        if (!ajVar.bgg()) {
            Object obj = this.eAp.size() != 0 ? 1 : null;
            if (ajVar.bga()) {
                if (obj == null) {
                    throw new WebSocketException(WebSocketError.UNEXPECTED_CONTINUATION_FRAME, "A continuation frame was detected although a continuation had not started.");
                }
            } else if (obj != null) {
                throw new WebSocketException(WebSocketError.CONTINUATION_NOT_CLOSED, "A non-control frame was detected although the existing continuation had not been closed.");
            }
        } else if (!ajVar.bfV()) {
            throw new WebSocketException(WebSocketError.FRAGMENTED_CONTROL_FRAME, "A control frame is fragmented.");
        }
    }

    private void t(aj ajVar) {
        if (ajVar.bgg()) {
            byte[] payload = ajVar.getPayload();
            if (payload != null && 125 < payload.length) {
                WebSocketError webSocketError = WebSocketError.TOO_LONG_CONTROL_FRAME_PAYLOAD;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The payload size of a control frame exceeds the maximum size (125 bytes): ");
                stringBuilder.append(payload.length);
                throw new WebSocketException(webSocketError, stringBuilder.toString());
            }
        }
    }

    private aj c(WebSocketException webSocketException) {
        int i = 1002;
        switch (webSocketException.bfT()) {
            case INSUFFICENT_DATA:
            case INVALID_PAYLOAD_LENGTH:
            case NO_MORE_FRAME:
            case NON_ZERO_RESERVED_BITS:
            case UNEXPECTED_RESERVED_BIT:
            case UNKNOWN_OPCODE:
            case FRAME_MASKED:
            case FRAGMENTED_CONTROL_FRAME:
            case UNEXPECTED_CONTINUATION_FRAME:
            case CONTINUATION_NOT_CLOSED:
            case TOO_LONG_CONTROL_FRAME_PAYLOAD:
                break;
            case TOO_LONG_PAYLOAD:
            case INSUFFICIENT_MEMORY_FOR_PAYLOAD:
                i = PointerIconCompat.TYPE_VERTICAL_TEXT;
                break;
            default:
                i = PointerIconCompat.TYPE_TEXT;
                break;
        }
        return aj.g(i, webSocketException.getMessage());
    }

    private boolean u(aj ajVar) {
        a(ajVar);
        int bfZ = ajVar.bfZ();
        if (bfZ == 0) {
            return v(ajVar);
        }
        if (bfZ == 1) {
            return x(ajVar);
        }
        if (bfZ == 2) {
            return y(ajVar);
        }
        switch (bfZ) {
            case 8:
                return z(ajVar);
            case 9:
                return A(ajVar);
            case 10:
                return B(ajVar);
            default:
                return true;
        }
    }

    private boolean v(aj ajVar) {
        b(ajVar);
        this.eAp.add(ajVar);
        if (!ajVar.bfV()) {
            return true;
        }
        byte[] bH = bH(this.eAp);
        if (bH == null) {
            return false;
        }
        if (((aj) this.eAp.get(0)).bgb()) {
            q(bH);
        } else {
            r(bH);
        }
        this.eAp.clear();
        return true;
    }

    private byte[] bH(List<aj> list) {
        byte[] bI = bI(this.eAp);
        if (bI == null) {
            return null;
        }
        if (this.eAq != null && ((aj) list.get(0)).bfW()) {
            bI = u(bI);
        }
        return bI;
    }

    private byte[] bI(List<aj> list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (aj payload : list) {
                byte[] payload2 = payload.getPayload();
                if (payload2 != null) {
                    if (payload2.length != 0) {
                        byteArrayOutputStream.write(payload2);
                    }
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException | OutOfMemoryError e) {
            WebSocketError webSocketError = WebSocketError.MESSAGE_CONSTRUCTION_ERROR;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to concatenate payloads of multiple frames to construct a message: ");
            stringBuilder.append(e.getMessage());
            WebSocketException webSocketException = new WebSocketException(webSocketError, stringBuilder.toString(), e);
            a(webSocketException);
            a(webSocketException, (List) list);
            this.dRF.C(aj.g(PointerIconCompat.TYPE_VERTICAL_TEXT, webSocketException.getMessage()));
            return null;
        }
    }

    private byte[] w(aj ajVar) {
        byte[] payload = ajVar.getPayload();
        return (this.eAq == null || !ajVar.bfW()) ? payload : u(payload);
    }

    private byte[] u(byte[] bArr) {
        try {
            bArr = this.eAq.u(bArr);
            return bArr;
        } catch (WebSocketException e) {
            a(e);
            a(e, bArr);
            this.dRF.C(aj.g(PointerIconCompat.TYPE_HELP, e.getMessage()));
            return null;
        }
    }

    private boolean x(aj ajVar) {
        c(ajVar);
        if (ajVar.bfV()) {
            q(w(ajVar));
            return true;
        }
        this.eAp.add(ajVar);
        return true;
    }

    private boolean y(aj ajVar) {
        d(ajVar);
        if (ajVar.bfV()) {
            r(w(ajVar));
            return true;
        }
        this.eAp.add(ajVar);
        return true;
    }

    private boolean z(aj ajVar) {
        Object obj;
        StateManager bfI = this.dRF.bfI();
        this.eAo = ajVar;
        synchronized (bfI) {
            WebSocketState bfu = bfI.bfu();
            if (bfu == WebSocketState.CLOSING || bfu == WebSocketState.CLOSED) {
                obj = null;
            } else {
                bfI.a(CloseInitiator.SERVER);
                this.dRF.C(ajVar);
                obj = 1;
            }
        }
        if (obj != null) {
            this.dRF.bfJ().a(WebSocketState.CLOSING);
        }
        e(ajVar);
        return false;
    }

    private boolean A(aj ajVar) {
        f(ajVar);
        this.dRF.C(aj.B(ajVar.getPayload()));
        return true;
    }

    private boolean B(aj ajVar) {
        g(ajVar);
        return true;
    }

    private void bfl() {
        if (!this.eAv && this.eAo == null) {
            bfn();
            do {
                try {
                    aj bfk = this.dRF.bfG().bfk();
                    if (bfk.bgd()) {
                        this.eAo = bfk;
                        break;
                    }
                } catch (Throwable unused) {
                }
            } while (!isInterrupted());
        }
    }

    private void bfm() {
        this.dRF.E(this.eAo);
    }

    private void bfn() {
        synchronized (this.eAr) {
            bfq();
            bfo();
        }
    }

    private void bfo() {
        this.eAt = new a();
        this.eAs = new Timer("ReadingThreadCloseTimer");
        this.eAs.schedule(this.eAt, this.eAu);
    }

    private void bfp() {
        synchronized (this.eAr) {
            bfq();
        }
    }

    private void bfq() {
        Timer timer = this.eAs;
        if (timer != null) {
            timer.cancel();
            this.eAs = null;
        }
        a aVar = this.eAt;
        if (aVar != null) {
            aVar.cancel();
            this.eAt = null;
        }
    }
}
