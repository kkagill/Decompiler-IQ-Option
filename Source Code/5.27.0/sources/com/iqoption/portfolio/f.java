package com.iqoption.portfolio;

import com.google.common.base.j;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.google.common.collect.aj;
import com.google.common.collect.i;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ext.c;
import java.util.concurrent.TimeUnit;

/* compiled from: Portfolio */
public final class f {
    public static final long dLm = TimeUnit.MINUTES.toMillis(30);
    private final j<d> dLn = new j<d>() {
        /* renamed from: a */
        public boolean apply(d dVar) {
            boolean z = false;
            switch (f.this.filter) {
                case 1:
                    return dVar.aQw();
                case 2:
                    return dVar.aQw() ^ 1;
                case 3:
                    return c.b(dVar.getInstrumentType(), InstrumentType.BINARY_INSTRUMENT, InstrumentType.TURBO_INSTRUMENT);
                case 4:
                    if (dVar.getInstrumentType() == InstrumentType.CFD_INSTRUMENT) {
                        z = true;
                    }
                    return z;
                case 5:
                    if (dVar.getInstrumentType() == InstrumentType.FOREX_INSTRUMENT) {
                        z = true;
                    }
                    return z;
                case 6:
                    if (dVar.getInstrumentType() == InstrumentType.CRYPTO_INSTRUMENT) {
                        z = true;
                    }
                    return z;
                case 7:
                    if (dVar.getInstrumentType() == InstrumentType.DIGITAL_INSTRUMENT) {
                        z = true;
                    }
                    return z;
                case 8:
                    if (dVar.getInstrumentType() == InstrumentType.FX_INSTRUMENT) {
                        z = true;
                    }
                    return z;
                case 9:
                    if (dVar.getInstrumentType() == InstrumentType.MULTI_INSTRUMENT) {
                        z = true;
                    }
                    return z;
                default:
                    return true;
            }
        }
    };
    private final j<b> dLo = new j<b>() {
        /* renamed from: b */
        public boolean apply(b bVar) {
            boolean z = false;
            switch (f.this.filter) {
                case 1:
                    return bVar.aQw();
                case 2:
                    return bVar.aQw() ^ 1;
                case 3:
                    return c.b(bVar.getInstrumentType(), InstrumentType.BINARY_INSTRUMENT, InstrumentType.TURBO_INSTRUMENT);
                case 4:
                    if (bVar.getInstrumentType() == InstrumentType.CFD_INSTRUMENT) {
                        z = true;
                    }
                    return z;
                case 5:
                    if (bVar.getInstrumentType() == InstrumentType.FOREX_INSTRUMENT) {
                        z = true;
                    }
                    return z;
                case 6:
                    if (bVar.getInstrumentType() == InstrumentType.CRYPTO_INSTRUMENT) {
                        z = true;
                    }
                    return z;
                case 7:
                    if (bVar.getInstrumentType() == InstrumentType.DIGITAL_INSTRUMENT) {
                        z = true;
                    }
                    return z;
                case 8:
                    if (bVar.getInstrumentType() == InstrumentType.FOREX_INSTRUMENT) {
                        z = true;
                    }
                    return z;
                case 9:
                    if (bVar.getInstrumentType() == InstrumentType.MULTI_INSTRUMENT) {
                        z = true;
                    }
                    return z;
                default:
                    return true;
            }
        }
    };
    private final j<e> dLp = new j<e>() {
        /* renamed from: a */
        public boolean apply(e eVar) {
            boolean z = false;
            switch (f.this.filter) {
                case 1:
                case 3:
                case 7:
                case 8:
                case 9:
                    break;
                case 4:
                    if (eVar.getActiveType().toInstrumentType() == InstrumentType.CFD_INSTRUMENT) {
                        z = true;
                        break;
                    }
                    break;
                case 5:
                    if (eVar.getActiveType() == ActiveType.FOREX_ACTIVE) {
                        z = true;
                    }
                    return z;
                case 6:
                    if (eVar.getActiveType() == ActiveType.CRYPTO_ACTIVE) {
                        z = true;
                    }
                    return z;
                default:
                    return true;
            }
            return z;
        }
    };
    private ImmutableList<d> dLq = ImmutableList.sQ();
    private ImmutableList<d> dLr;
    private ImmutableMap<Integer, a> dLs = new a().m(Integer.valueOf(0), new a()).m(Integer.valueOf(1), new a()).m(Integer.valueOf(3), new a()).m(Integer.valueOf(7), new a()).m(Integer.valueOf(8), new a()).m(Integer.valueOf(9), new a()).m(Integer.valueOf(2), new a()).m(Integer.valueOf(4), new a()).m(Integer.valueOf(6), new a()).m(Integer.valueOf(5), new a()).tf();
    private ImmutableList<b> dLt = ImmutableList.sQ();
    private ImmutableList<b> dLu;
    private ImmutableList<e> dLv = ImmutableList.sQ();
    private ImmutableList<e> dLw;
    private volatile int dLx;
    private int filter = 0;

    public f(int i) {
        gx(i);
    }

    /* Access modifiers changed, original: 0000 */
    public void gx(int i) {
        Object obj;
        if (this.filter != i) {
            this.filter = i;
            obj = 1;
        } else {
            obj = null;
        }
        if (this.dLr == null || obj != null) {
            this.dLr = i.b(this.dLq).b(this.dLn).sC();
        }
        if (this.dLu == null || obj != null) {
            this.dLu = i.b(this.dLt).b(this.dLo).sC();
        }
        if (this.dLw == null || obj != null) {
            this.dLw = i.b(this.dLv).b(this.dLp).sC();
        }
    }

    public int aQD() {
        return this.filter;
    }

    public ImmutableList<d> aQE() {
        return gy(this.filter);
    }

    public ImmutableList<d> gy(int i) {
        gx(i);
        ImmutableList<d> immutableList = this.dLr;
        return immutableList != null ? immutableList : ImmutableList.sQ();
    }

    /* Access modifiers changed, original: 0000 */
    public void n(ImmutableList<d> immutableList) {
        this.dLq = immutableList;
        this.dLr = null;
        gx(this.filter);
    }

    public ImmutableList<b> aQF() {
        return gz(this.filter);
    }

    public ImmutableList<b> gz(int i) {
        gx(i);
        return this.dLu;
    }

    public ImmutableList<e> aQG() {
        return gA(this.filter);
    }

    public ImmutableList<e> gA(int i) {
        gx(i);
        return this.dLw;
    }

    /* Access modifiers changed, original: 0000 */
    public void o(ImmutableList<b> immutableList) {
        this.dLt = immutableList;
        this.dLu = null;
        gx(this.filter);
    }

    /* Access modifiers changed, original: 0000 */
    public void p(ImmutableList<e> immutableList) {
        this.dLv = immutableList;
        this.dLw = null;
        gx(this.filter);
    }

    /* Access modifiers changed, original: 0000 */
    public void aQH() {
        aj sK = this.dLs.values().iterator();
        while (sK.hasNext()) {
            ((a) sK.next()).reset();
        }
        ImmutableList immutableList = this.dLq;
        if (immutableList != null) {
            sK = immutableList.iterator();
            while (sK.hasNext()) {
                d dVar = (d) sK.next();
                a aQC = dVar.aQC();
                ((a) this.dLs.get(Integer.valueOf(0))).a(aQC);
                if (dVar.aQw()) {
                    ((a) this.dLs.get(Integer.valueOf(1))).a(aQC);
                } else {
                    ((a) this.dLs.get(Integer.valueOf(2))).a(aQC);
                }
                switch (dVar.getInstrumentType()) {
                    case TURBO_INSTRUMENT:
                    case BINARY_INSTRUMENT:
                        ((a) this.dLs.get(Integer.valueOf(3))).a(aQC);
                        break;
                    case DIGITAL_INSTRUMENT:
                        ((a) this.dLs.get(Integer.valueOf(7))).a(aQC);
                        break;
                    case FX_INSTRUMENT:
                        ((a) this.dLs.get(Integer.valueOf(8))).a(aQC);
                        break;
                    case MULTI_INSTRUMENT:
                        ((a) this.dLs.get(Integer.valueOf(9))).a(aQC);
                        break;
                    case CFD_INSTRUMENT:
                        ((a) this.dLs.get(Integer.valueOf(4))).a(aQC);
                        break;
                    case FOREX_INSTRUMENT:
                        ((a) this.dLs.get(Integer.valueOf(5))).a(aQC);
                        break;
                    case CRYPTO_INSTRUMENT:
                        ((a) this.dLs.get(Integer.valueOf(6))).a(aQC);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public a aQI() {
        return gB(this.filter);
    }

    public a gB(int i) {
        return (a) this.dLs.get(Integer.valueOf(i));
    }

    public int getDataState() {
        return this.dLx;
    }

    /* Access modifiers changed, original: 0000 */
    public void gC(int i) {
        this.dLx = i;
    }

    public com.iqoption.mobbtech.connect.response.options.c w(long j, long j2) {
        aj sK = this.dLq.iterator();
        while (sK.hasNext()) {
            d dVar = (d) sK.next();
            if (dVar.getId() == j2) {
                aj sK2 = dVar.aQy().iterator();
                while (sK2.hasNext()) {
                    com.iqoption.mobbtech.connect.response.options.c cVar = (com.iqoption.mobbtech.connect.response.options.c) sK2.next();
                    if (cVar.getId().longValue() == j) {
                        return cVar;
                    }
                }
                continue;
            }
        }
        return null;
    }
}
