package com.neovisionaries.ws.client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.Map;

/* compiled from: WebSocket */
public class af {
    private final ab eAL;
    private final StateManager eAM;
    private l eAN;
    private final o eAO;
    private final v eAP;
    private final w eAQ;
    private final Object eAR = new Object();
    private ak eAS;
    private am eAT;
    private z eAU;
    private ao eAV;
    private Map<String, List<String>> eAW;
    private List<ah> eAX;
    private String eAY;
    private boolean eAZ;
    private final ai eAj;
    private boolean eBa = true;
    private boolean eBb = true;
    private boolean eBc;
    private int eBd;
    private int eBe;
    private boolean eBf;
    private Object eBg = new Object();
    private boolean eBh;
    private boolean eBi;
    private boolean eBj;
    private boolean eBk;
    private aj eBl;
    private aj eBm;
    private s eBn;

    /* compiled from: WebSocket */
    /* renamed from: com.neovisionaries.ws.client.af$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] eBo = new int[WebSocketState.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.neovisionaries.ws.client.WebSocketState.values();
            r0 = r0.length;
            r0 = new int[r0];
            eBo = r0;
            r0 = eBo;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.neovisionaries.ws.client.WebSocketState.CREATED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = eBo;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.neovisionaries.ws.client.WebSocketState.OPEN;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.neovisionaries.ws.client.af$AnonymousClass1.<clinit>():void");
        }
    }

    af(ai aiVar, boolean z, String str, String str2, String str3, ab abVar) {
        this.eAj = aiVar;
        this.eAL = abVar;
        this.eAM = new StateManager();
        this.eAN = new l(z, str, str2, str3);
        this.eAO = new o(this);
        this.eAP = new v(this, new d());
        this.eAQ = new w(this, new d());
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        if (c(WebSocketState.CREATED)) {
            finish();
        }
        super.finalize();
    }

    public boolean isOpen() {
        return c(WebSocketState.OPEN);
    }

    private boolean c(WebSocketState webSocketState) {
        boolean z;
        synchronized (this.eAM) {
            z = this.eAM.bfu() == webSocketState;
        }
        return z;
    }

    public af kD(String str) {
        this.eAN.ku(str);
        return this;
    }

    public af aO(String str, String str2) {
        this.eAN.addHeader(str, str2);
        return this;
    }

    public boolean bfw() {
        return this.eAZ;
    }

    public boolean bfx() {
        return this.eBa;
    }

    public boolean bfy() {
        return this.eBb;
    }

    public boolean bfz() {
        return this.eBc;
    }

    public int bfA() {
        return this.eBd;
    }

    public af b(al alVar) {
        this.eAO.a(alVar);
        return this;
    }

    public Socket getSocket() {
        return this.eAL.getSocket();
    }

    public af bfB() {
        bfC();
        try {
            this.eAL.connect();
            this.eAW = bfD();
            this.eBn = bfR();
            this.eAM.b(WebSocketState.OPEN);
            this.eAO.a(WebSocketState.OPEN);
            bfF();
            return this;
        } catch (WebSocketException e) {
            this.eAL.bft();
            this.eAM.b(WebSocketState.CLOSED);
            this.eAO.a(WebSocketState.CLOSED);
            throw e;
        }
    }

    public af e(int i, String str) {
        return a(i, str, 10000);
    }

    /* JADX WARNING: Missing block: B:11:0x0028, code skipped:
            r3.eAO.a(com.neovisionaries.ws.client.WebSocketState.CLOSING);
     */
    /* JADX WARNING: Missing block: B:12:0x0033, code skipped:
            if (r6 >= 0) goto L_0x0037;
     */
    /* JADX WARNING: Missing block: B:13:0x0035, code skipped:
            r6 = 10000;
     */
    /* JADX WARNING: Missing block: B:14:0x0037, code skipped:
            cG(r6);
     */
    /* JADX WARNING: Missing block: B:15:0x003a, code skipped:
            return r3;
     */
    public com.neovisionaries.ws.client.af a(int r4, java.lang.String r5, long r6) {
        /*
        r3 = this;
        r0 = r3.eAM;
        monitor-enter(r0);
        r1 = com.neovisionaries.ws.client.af.AnonymousClass1.eBo;	 Catch:{ all -> 0x0040 }
        r2 = r3.eAM;	 Catch:{ all -> 0x0040 }
        r2 = r2.bfu();	 Catch:{ all -> 0x0040 }
        r2 = r2.ordinal();	 Catch:{ all -> 0x0040 }
        r1 = r1[r2];	 Catch:{ all -> 0x0040 }
        r2 = 1;
        if (r1 == r2) goto L_0x003b;
    L_0x0014:
        r2 = 2;
        if (r1 == r2) goto L_0x0019;
    L_0x0017:
        monitor-exit(r0);	 Catch:{ all -> 0x0040 }
        return r3;
    L_0x0019:
        r1 = r3.eAM;	 Catch:{ all -> 0x0040 }
        r2 = com.neovisionaries.ws.client.StateManager.CloseInitiator.CLIENT;	 Catch:{ all -> 0x0040 }
        r1.a(r2);	 Catch:{ all -> 0x0040 }
        r4 = com.neovisionaries.ws.client.aj.g(r4, r5);	 Catch:{ all -> 0x0040 }
        r3.C(r4);	 Catch:{ all -> 0x0040 }
        monitor-exit(r0);	 Catch:{ all -> 0x0040 }
        r4 = r3.eAO;
        r5 = com.neovisionaries.ws.client.WebSocketState.CLOSING;
        r4.a(r5);
        r4 = 0;
        r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x0037;
    L_0x0035:
        r6 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
    L_0x0037:
        r3.cG(r6);
        return r3;
    L_0x003b:
        r3.bfQ();	 Catch:{ all -> 0x0040 }
        monitor-exit(r0);	 Catch:{ all -> 0x0040 }
        return r3;
    L_0x0040:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0040 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neovisionaries.ws.client.af.a(int, java.lang.String, long):com.neovisionaries.ws.client.af");
    }

    /* JADX WARNING: Missing block: B:12:0x0017, code skipped:
            r0 = r3.eAV;
     */
    /* JADX WARNING: Missing block: B:13:0x0019, code skipped:
            if (r0 != null) goto L_0x001c;
     */
    /* JADX WARNING: Missing block: B:14:0x001b, code skipped:
            return r3;
     */
    /* JADX WARNING: Missing block: B:15:0x001c, code skipped:
            r1 = D(r4);
     */
    /* JADX WARNING: Missing block: B:16:0x0020, code skipped:
            if (r1 != null) goto L_0x0026;
     */
    /* JADX WARNING: Missing block: B:17:0x0022, code skipped:
            r0.K(r4);
     */
    /* JADX WARNING: Missing block: B:18:0x0026, code skipped:
            r4 = r1.iterator();
     */
    /* JADX WARNING: Missing block: B:20:0x002e, code skipped:
            if (r4.hasNext() == false) goto L_0x003a;
     */
    /* JADX WARNING: Missing block: B:21:0x0030, code skipped:
            r0.K((com.neovisionaries.ws.client.aj) r4.next());
     */
    /* JADX WARNING: Missing block: B:22:0x003a, code skipped:
            return r3;
     */
    public com.neovisionaries.ws.client.af C(com.neovisionaries.ws.client.aj r4) {
        /*
        r3 = this;
        if (r4 != 0) goto L_0x0003;
    L_0x0002:
        return r3;
    L_0x0003:
        r0 = r3.eAM;
        monitor-enter(r0);
        r1 = r3.eAM;	 Catch:{ all -> 0x003b }
        r1 = r1.bfu();	 Catch:{ all -> 0x003b }
        r2 = com.neovisionaries.ws.client.WebSocketState.OPEN;	 Catch:{ all -> 0x003b }
        if (r1 == r2) goto L_0x0016;
    L_0x0010:
        r2 = com.neovisionaries.ws.client.WebSocketState.CLOSING;	 Catch:{ all -> 0x003b }
        if (r1 == r2) goto L_0x0016;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        return r3;
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        r0 = r3.eAV;
        if (r0 != 0) goto L_0x001c;
    L_0x001b:
        return r3;
    L_0x001c:
        r1 = r3.D(r4);
        if (r1 != 0) goto L_0x0026;
    L_0x0022:
        r0.K(r4);
        goto L_0x003a;
    L_0x0026:
        r4 = r1.iterator();
    L_0x002a:
        r1 = r4.hasNext();
        if (r1 == 0) goto L_0x003a;
    L_0x0030:
        r1 = r4.next();
        r1 = (com.neovisionaries.ws.client.aj) r1;
        r0.K(r1);
        goto L_0x002a;
    L_0x003a:
        return r3;
    L_0x003b:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        goto L_0x003f;
    L_0x003e:
        throw r4;
    L_0x003f:
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neovisionaries.ws.client.af.C(com.neovisionaries.ws.client.aj):com.neovisionaries.ws.client.af");
    }

    private List<aj> D(aj ajVar) {
        return aj.a(ajVar, this.eBe, this.eBn);
    }

    public af kE(String str) {
        return C(aj.kM(str));
    }

    private void bfC() {
        synchronized (this.eAM) {
            if (this.eAM.bfu() == WebSocketState.CREATED) {
                this.eAM.b(WebSocketState.CONNECTING);
            } else {
                throw new WebSocketException(WebSocketError.NOT_IN_CREATED_STATE, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.eAO.a(WebSocketState.CONNECTING);
    }

    private Map<String, List<String>> bfD() {
        Socket socket = this.eAL.getSocket();
        ak b = b(socket);
        am c = c(socket);
        String bfE = bfE();
        a(c, bfE);
        Map a = a(b, bfE);
        this.eAS = b;
        this.eAT = c;
        return a;
    }

    private ak b(Socket socket) {
        try {
            return new ak(new BufferedInputStream(socket.getInputStream()));
        } catch (IOException e) {
            WebSocketError webSocketError = WebSocketError.SOCKET_INPUT_STREAM_FAILURE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to get the input stream of the raw socket: ");
            stringBuilder.append(e.getMessage());
            throw new WebSocketException(webSocketError, stringBuilder.toString(), e);
        }
    }

    private am c(Socket socket) {
        try {
            return new am(new BufferedOutputStream(socket.getOutputStream()));
        } catch (IOException e) {
            WebSocketError webSocketError = WebSocketError.SOCKET_OUTPUT_STREAM_FAILURE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to get the output stream from the raw socket: ");
            stringBuilder.append(e.getMessage());
            throw new WebSocketException(webSocketError, stringBuilder.toString(), e);
        }
    }

    private static String bfE() {
        byte[] bArr = new byte[16];
        p.t(bArr);
        return b.encode(bArr);
    }

    private void a(am amVar, String str) {
        this.eAN.setKey(str);
        str = this.eAN.beV();
        List beW = this.eAN.beW();
        String e = l.e(str, beW);
        this.eAO.f(str, beW);
        try {
            amVar.write(e);
            amVar.flush();
        } catch (IOException e2) {
            WebSocketError webSocketError = WebSocketError.OPENING_HAHDSHAKE_REQUEST_FAILURE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to send an opening handshake request to the server: ");
            stringBuilder.append(e2.getMessage());
            throw new WebSocketException(webSocketError, stringBuilder.toString(), e2);
        }
    }

    private Map<String, List<String>> a(ak akVar, String str) {
        return new m(this).a(akVar, str);
    }

    private void bfF() {
        z zVar = new z(this);
        ao aoVar = new ao(this);
        synchronized (this.eAR) {
            this.eAU = zVar;
            this.eAV = aoVar;
        }
        zVar.bgo();
        aoVar.bgo();
        zVar.start();
        aoVar.start();
    }

    private void cG(long j) {
        z zVar;
        ao aoVar;
        synchronized (this.eAR) {
            zVar = this.eAU;
            aoVar = this.eAV;
            this.eAU = null;
            this.eAV = null;
        }
        if (zVar != null) {
            zVar.cF(j);
        }
        if (aoVar != null) {
            aoVar.requestStop();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ak bfG() {
        return this.eAS;
    }

    /* Access modifiers changed, original: 0000 */
    public am bfH() {
        return this.eAT;
    }

    /* Access modifiers changed, original: 0000 */
    public StateManager bfI() {
        return this.eAM;
    }

    /* Access modifiers changed, original: 0000 */
    public o bfJ() {
        return this.eAO;
    }

    /* Access modifiers changed, original: 0000 */
    public l bfK() {
        return this.eAN;
    }

    /* Access modifiers changed, original: 0000 */
    public void bJ(List<ah> list) {
        this.eAX = list;
    }

    /* Access modifiers changed, original: 0000 */
    public void kF(String str) {
        this.eAY = str;
    }

    /* Access modifiers changed, original: 0000 */
    public void bfL() {
        boolean z;
        synchronized (this.eAR) {
            this.eBh = true;
            z = this.eBi;
        }
        bfN();
        if (z) {
            bfO();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bfM() {
        boolean z;
        synchronized (this.eAR) {
            this.eBi = true;
            z = this.eBh;
        }
        bfN();
        if (z) {
            bfO();
        }
    }

    private void bfN() {
        synchronized (this.eBg) {
            if (this.eBf) {
                return;
            }
            this.eBf = true;
            this.eAO.R(this.eAW);
        }
    }

    private void bfO() {
        this.eAP.start();
        this.eAQ.start();
    }

    /* Access modifiers changed, original: 0000 */
    public void E(aj ajVar) {
        synchronized (this.eAR) {
            this.eBj = true;
            this.eBl = ajVar;
            if (this.eBk) {
                bfP();
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void F(aj ajVar) {
        synchronized (this.eAR) {
            this.eBk = true;
            this.eBm = ajVar;
            if (this.eBj) {
                bfP();
                return;
            }
        }
    }

    private void bfP() {
        finish();
    }

    /* Access modifiers changed, original: 0000 */
    public void finish() {
        this.eAP.stop();
        this.eAQ.stop();
        try {
            this.eAL.getSocket().close();
        } catch (Throwable unused) {
        }
        synchronized (this.eAM) {
            this.eAM.b(WebSocketState.CLOSED);
        }
        this.eAO.a(WebSocketState.CLOSED);
        this.eAO.a(this.eBl, this.eBm, this.eAM.bfv());
    }

    private void bfQ() {
        i iVar = new i(this);
        iVar.bgo();
        iVar.start();
    }

    private s bfR() {
        List<ah> list = this.eAX;
        if (list == null) {
            return null;
        }
        for (ah ahVar : list) {
            if (ahVar instanceof s) {
                return (s) ahVar;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public s bfS() {
        return this.eBn;
    }
}
