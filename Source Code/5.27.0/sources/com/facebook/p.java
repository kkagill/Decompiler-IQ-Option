package com.facebook;

import android.os.Handler;
import com.facebook.i.a;
import com.facebook.i.b;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;

/* compiled from: ProgressOutputStream */
class p extends FilterOutputStream implements q {
    private final long threshold = f.gW();
    private final Map<g, r> uE;
    private r uG;
    private long uI;
    private long uJ;
    private long uK;
    private final i uq;

    p(OutputStream outputStream, i iVar, Map<g, r> map, long j) {
        super(outputStream);
        this.uq = iVar;
        this.uE = map;
        this.uK = j;
    }

    private void o(long j) {
        r rVar = this.uG;
        if (rVar != null) {
            rVar.o(j);
        }
        this.uI += j;
        j = this.uI;
        if (j >= this.uJ + this.threshold || j >= this.uK) {
            hR();
        }
    }

    private void hR() {
        if (this.uI > this.uJ) {
            for (a aVar : this.uq.u()) {
                if (aVar instanceof b) {
                    Handler hA = this.uq.hA();
                    final b bVar = (b) aVar;
                    if (hA == null) {
                        bVar.a(this.uq, this.uI, this.uK);
                    } else {
                        hA.post(new Runnable() {
                            public void run() {
                                bVar.a(p.this.uq, p.this.uI, p.this.uK);
                            }
                        });
                    }
                }
            }
            this.uJ = this.uI;
        }
    }

    public void d(g gVar) {
        this.uG = gVar != null ? (r) this.uE.get(gVar) : null;
    }

    public void write(byte[] bArr) {
        this.out.write(bArr);
        o((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        o((long) i2);
    }

    public void write(int i) {
        this.out.write(i);
        o(1);
    }

    public void close() {
        super.close();
        for (r hS : this.uE.values()) {
            hS.hS();
        }
        hR();
    }
}
