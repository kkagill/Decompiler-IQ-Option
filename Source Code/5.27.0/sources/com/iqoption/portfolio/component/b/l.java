package com.iqoption.portfolio.component.b;

import androidx.annotation.NonNull;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.aj;
import com.google.common.collect.s;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.portfolio.e;

/* compiled from: PendingGroupItem */
public class l implements k {
    private final a anF;
    private final String bIH;
    private ImmutableList<m> dNc;
    private double dNe = -1.0d;
    private final e dNh;
    private double dNi = -1.0d;

    public static String b(e eVar) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("pendingGroup:");
        stringBuilder.append(eVar.getId());
        return stringBuilder.toString();
    }

    public l(e eVar) {
        this.dNh = eVar;
        this.anF = eVar.Jt();
        this.bIH = aRz() ? aRL().Or() : b(eVar);
    }

    @NonNull
    public String Or() {
        return this.bIH;
    }

    public int asd() {
        int i = 1;
        if (Order.ON_MKT_OPEN.equals(aRL().aRP().getType())) {
            if (aRz()) {
                i = 5;
            }
            return i;
        }
        if (aRz()) {
            i = 2;
        }
        return i;
    }

    @NonNull
    public a Jt() {
        return this.anF;
    }

    public ImmutableList<m> aRB() {
        if (this.dNc == null) {
            ImmutableList.a aVar = new ImmutableList.a();
            aj sK = this.dNh.GR().iterator();
            while (sK.hasNext()) {
                aVar.aI(new m(this, (Order) sK.next()));
            }
            this.dNc = aVar.sU();
        }
        return this.dNc;
    }

    public boolean aRz() {
        return this.dNh.size() == 1;
    }

    public double aRD() {
        if (this.dNe == -1.0d) {
            this.dNe = 0.0d;
            aj sK = aRB().iterator();
            while (sK.hasNext()) {
                m mVar = (m) sK.next();
                if (!mVar.isCall()) {
                    this.dNe = 0.0d;
                    break;
                }
                this.dNe += mVar.aRD();
            }
        }
        return this.dNe;
    }

    public int aRK() {
        return this.dNh.size();
    }

    public m aRL() {
        return (m) s.a(aRB(), null);
    }

    public boolean aRs() {
        return this.anF.getInstrumentType() == InstrumentType.CRYPTO_INSTRUMENT;
    }

    public boolean aRM() {
        aj sK = aRB().iterator();
        while (sK.hasNext()) {
            if (!((m) sK.next()).isCall()) {
                return false;
            }
        }
        return true;
    }

    public String adZ() {
        return com.iqoption.util.c.a.C(this.anF);
    }

    public double getInvestment() {
        if (this.dNi == -1.0d) {
            this.dNi = 0.0d;
            aj sK = aRB().iterator();
            while (sK.hasNext()) {
                this.dNi += ((m) sK.next()).getInvestment();
            }
        }
        return this.dNi;
    }
}
