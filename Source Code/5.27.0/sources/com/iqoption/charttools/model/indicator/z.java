package com.iqoption.charttools.model.indicator;

import android.os.Parcel;
import c.a.a.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, bng = {"Lcom/iqoption/charttools/model/indicator/MetaIndicatorParceler;", "Lkotlinx/android/parcel/Parceler;", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "()V", "create", "parcel", "Landroid/os/Parcel;", "write", "", "flags", "", "techtools_release"})
/* compiled from: MetaIndicator.kt */
public final class z implements a<x> {
    public static final z aJA = new z();

    private z() {
    }

    /* renamed from: T */
    public x U(Parcel parcel) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        String readString = parcel.readString();
        if (readString != null) {
            switch (readString.hashCode()) {
                case -2105129931:
                    if (readString.equals("Alligator")) {
                        return c.aIT;
                    }
                    break;
                case -1858828435:
                    if (readString.equals("WilliamsRange")) {
                        return ag.aJO;
                    }
                    break;
                case -1846191635:
                    if (readString.equals("T-Line")) {
                        return q.aJp;
                    }
                    break;
                case -1788933333:
                    if (readString.equals("V-Line")) {
                        return r.aJq;
                    }
                    break;
                case -1719515127:
                    if (readString.equals("Stochastic")) {
                        return af.aJN;
                    }
                    break;
                case -1517311537:
                    if (readString.equals("MovingAverage")) {
                        return ab.aJF;
                    }
                    break;
                case -877554489:
                    if (readString.equals("Ichimoku")) {
                        return t.aJs;
                    }
                    break;
                case -296651592:
                    if (readString.equals("Momentum")) {
                        return aa.aJC;
                    }
                    break;
                case 2112:
                    if (readString.equals("BB")) {
                        return f.aIW;
                    }
                    break;
                case 64661:
                    if (readString.equals("ADX")) {
                        return a.aIR;
                    }
                    break;
                case 65151:
                    if (readString.equals("ATR")) {
                        return b.aIS;
                    }
                    break;
                case 66537:
                    if (readString.equals("CCI")) {
                        return g.aIX;
                    }
                    break;
                case 67907:
                    if (readString.equals("DPO")) {
                        return j.aJc;
                    }
                    break;
                case 74257:
                    if (readString.equals("KDJ")) {
                        return u.aJt;
                    }
                    break;
                case 81448:
                    if (readString.equals("RSI")) {
                        return ad.aJH;
                    }
                    break;
                case 2358517:
                    if (readString.equals("MACD")) {
                        return w.aJy;
                    }
                    break;
                case 2368532:
                    if (readString.equals("Line")) {
                        return p.aJo;
                    }
                    break;
                case 702156550:
                    if (readString.equals("Fibonacci")) {
                        return m.aJl;
                    }
                    break;
                case 758524311:
                    if (readString.equals("FibonacciSpiral")) {
                        return n.aJm;
                    }
                    break;
                case 991297035:
                    if (readString.equals("ParabolicSAR")) {
                        return ac.aJG;
                    }
                    break;
                case 1057116881:
                    if (readString.equals("Fractal")) {
                        return s.aJr;
                    }
                    break;
                case 1243960643:
                    if (readString.equals("AwesomeOscillator")) {
                        return d.aIU;
                    }
                    break;
                case 1260906750:
                    if (readString.equals("BelkhayateTiming")) {
                        return e.aIV;
                    }
                    break;
                case 1455115628:
                    if (readString.equals("FibonacciArc")) {
                        return l.aJk;
                    }
                    break;
                case 2105225849:
                    if (readString.equals("H-Line")) {
                        return o.aJn;
                    }
                    break;
            }
        }
        return ae.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: a */
    public void b(x xVar, Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(xVar, "$this$write");
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(xVar.getType());
        xVar.writeToParcel(parcel, i);
    }
}
