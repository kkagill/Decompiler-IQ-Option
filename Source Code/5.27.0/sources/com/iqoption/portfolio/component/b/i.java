package com.iqoption.portfolio.component.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.aj;
import com.google.common.collect.s;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.mobbtech.connect.response.options.c;
import com.iqoption.portfolio.d;

/* compiled from: OpenGroupItem */
public class i implements f {
    private final a anF;
    private final String bIH;
    private final d dNa;
    private final boolean dNb;
    private ImmutableList<j> dNc;
    private ImmutableList<f> dNd;
    private double dNe = -1.0d;

    public static String b(d dVar) {
        a Jt = dVar.Jt();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("group:");
        stringBuilder.append(dVar.getInstrumentType());
        stringBuilder.append(":");
        stringBuilder.append(Jt != null ? Jt.getActiveId() : 0);
        return stringBuilder.toString();
    }

    public i(d dVar) {
        this.dNa = dVar;
        this.anF = dVar.Jt();
        this.dNb = dVar.getInstrumentType() == InstrumentType.CRYPTO_INSTRUMENT;
        this.bIH = aRz() ? aRC().Or() : b(dVar);
    }

    @NonNull
    public String Or() {
        return this.bIH;
    }

    public int asd() {
        if (aRw()) {
            return 7;
        }
        if (aQw()) {
            return aRz() ? 5 : 4;
        }
        return aRz() ? 2 : 1;
    }

    private boolean aRw() {
        return this.dNa.getInstrumentType() == InstrumentType.MULTI_INSTRUMENT;
    }

    private boolean aQw() {
        return this.dNa.aQw();
    }

    @Nullable
    public a Jt() {
        return this.anF;
    }

    @Nullable
    public String aHO() {
        a aVar = this.anF;
        return aVar != null ? aVar.getImage() : null;
    }

    @Nullable
    public String ahP() {
        a aVar = this.anF;
        return aVar != null ? com.iqoption.core.microservices.tradingengine.response.active.d.B(aVar) : null;
    }

    @Nullable
    public String aRx() {
        a aVar = this.anF;
        return aVar != null ? com.iqoption.util.c.a.C(aVar) : null;
    }

    public int aQz() {
        return this.dNa.size();
    }

    @NonNull
    public String aRy() {
        return com.iqoption.util.c.a.ai(this.dNa.Jt());
    }

    public com.iqoption.portfolio.a aQA() {
        return this.dNa.aQA();
    }

    public boolean isCall() {
        aj sK = aRB().iterator();
        while (sK.hasNext()) {
            if (!((j) sK.next()).isCall()) {
                return false;
            }
        }
        return true;
    }

    public boolean aRz() {
        return this.dNa.size() == 1;
    }

    public ImmutableList<f> aRA() {
        if (this.dNd == null) {
            ImmutableList aRB = aRB();
            ImmutableList.a aVar = new ImmutableList.a();
            long j = -1;
            aj sK = aRB.iterator();
            while (sK.hasNext()) {
                j jVar = (j) sK.next();
                if (jVar.asd() == 6) {
                    long aim = ((h) jVar).aim();
                    if (j != aim) {
                        aVar.aI(new c(aim));
                        j = aim;
                    }
                }
                aVar.aI(jVar);
            }
            this.dNd = aVar.sU();
        }
        return this.dNd;
    }

    public ImmutableList<j> aRB() {
        if (this.dNc == null) {
            ImmutableList.a aVar = new ImmutableList.a();
            aj sK = this.dNa.aQy().iterator();
            while (sK.hasNext()) {
                c cVar = (c) sK.next();
                switch (cVar.getInstrumentType()) {
                    case BINARY_INSTRUMENT:
                    case TURBO_INSTRUMENT:
                    case DIGITAL_INSTRUMENT:
                    case FX_INSTRUMENT:
                    case MULTI_INSTRUMENT:
                        aVar.aI(new h(this, cVar));
                        break;
                    case CFD_INSTRUMENT:
                    case FOREX_INSTRUMENT:
                    case CRYPTO_INSTRUMENT:
                        aVar.aI(new g(this, (Position) cVar));
                        break;
                    default:
                        break;
                }
            }
            this.dNc = aVar.sU();
        }
        return this.dNc;
    }

    public j aRC() {
        return (j) s.a(aRB(), null);
    }

    public boolean aRs() {
        return this.dNb;
    }

    public long getId() {
        return this.dNa.getId();
    }

    public String toString() {
        int i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GroupItem{, group=");
        stringBuilder.append(this.dNa);
        stringBuilder.append(", active=");
        stringBuilder.append(this.anF);
        stringBuilder.append(", crypto=");
        stringBuilder.append(this.dNb);
        stringBuilder.append(", size=");
        ImmutableList immutableList = this.dNc;
        if (immutableList == null) {
            i = 0;
        } else {
            i = immutableList.size();
        }
        stringBuilder.append(i);
        stringBuilder.append(", quantity=");
        stringBuilder.append(this.dNe);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
