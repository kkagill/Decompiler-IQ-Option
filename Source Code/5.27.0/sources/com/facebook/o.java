package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProgressNoopOutputStream */
class o extends OutputStream implements q {
    private final Map<g, r> uE = new HashMap();
    private g uF;
    private r uG;
    private int uH;
    private final Handler us;

    o(Handler handler) {
        this.us = handler;
    }

    public void d(g gVar) {
        this.uF = gVar;
        this.uG = gVar != null ? (r) this.uE.get(gVar) : null;
    }

    /* Access modifiers changed, original: 0000 */
    public int hP() {
        return this.uH;
    }

    /* Access modifiers changed, original: 0000 */
    public Map<g, r> hQ() {
        return this.uE;
    }

    /* Access modifiers changed, original: 0000 */
    public void o(long j) {
        if (this.uG == null) {
            this.uG = new r(this.us, this.uF);
            this.uE.put(this.uF, this.uG);
        }
        this.uG.p(j);
        this.uH = (int) (((long) this.uH) + j);
    }

    public void write(byte[] bArr) {
        o((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        o((long) i2);
    }

    public void write(int i) {
        o(1);
    }
}
