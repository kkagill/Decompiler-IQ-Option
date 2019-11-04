package com.iqoption.portfolio.component.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.e;
import com.iqoption.app.managers.l;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.mobbtech.connect.response.options.c;

/* compiled from: OpenItem */
public abstract class j<T extends c> implements f {
    private final a anF;
    private final String bIH;
    private final com.iqoption.portfolio.a dLf = new com.iqoption.portfolio.a();
    protected final i dNf;
    protected final T dNg;

    public static <T extends c> String v(T t) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("item:");
        stringBuilder.append(t.getId());
        return stringBuilder.toString();
    }

    public j(i iVar, T t) {
        this.dNf = iVar;
        this.dNg = t;
        this.bIH = v(t);
        this.anF = iVar.Jt();
    }

    @NonNull
    public String Or() {
        return this.bIH;
    }

    public void aQH() {
        this.dLf.a(this.dNg.getInvestSum(), this.dNg.getSellPnl(), this.dNg.getExpPnl(), this.dNg.getCancelTimeLeft(l.HZ().Ib()));
    }

    public com.iqoption.portfolio.a aQA() {
        return this.dLf;
    }

    public boolean isCall() {
        return this.dNg.isCall();
    }

    public double getOpenPrice() {
        Double valueOf = Double.valueOf(this.dNg.getOpenUnderlyingPrice());
        return valueOf != null ? valueOf.doubleValue() : 0.0d;
    }

    public long abl() {
        return this.dNg.getCreateTime();
    }

    public double aRD() {
        return ((Double) e.g(this.dNg.getOptionCount(), Double.valueOf(0.0d))).doubleValue();
    }

    public double aRE() {
        return ((Double) e.g(this.dNg.getOptionOptPrice(), Double.valueOf(0.0d))).doubleValue();
    }

    public boolean aRF() {
        return com.iqoption.core.ext.c.b(this.dNg.getInstrumentType(), InstrumentType.FX_INSTRUMENT, InstrumentType.DIGITAL_INSTRUMENT);
    }

    public boolean aRG() {
        return InstrumentType.FX_INSTRUMENT == this.dNg.getInstrumentType();
    }

    public double aRH() {
        return this.dNg.getUnderlyingPrice();
    }

    public int aRI() {
        a aVar = this.anF;
        return aVar != null ? aVar.getPrecision() : 6;
    }

    public long getId() {
        return this.dNg.getId().longValue();
    }

    public T aRJ() {
        return this.dNg;
    }

    @Nullable
    public a Jt() {
        return this.anF;
    }

    @Nullable
    public String adZ() {
        a aVar = this.anF;
        return aVar != null ? com.iqoption.util.c.a.C(aVar) : null;
    }

    public long adj() {
        return this.dNf.getId();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Item{parent=");
        stringBuilder.append(this.dNf);
        stringBuilder.append(", position=");
        stringBuilder.append(this.dNg);
        stringBuilder.append(", active=");
        stringBuilder.append(this.anF);
        stringBuilder.append(", calculation=");
        stringBuilder.append(this.dLf);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
