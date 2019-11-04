package com.iqoption.asset.c;

import kotlin.i;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J \u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u001e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006J\u001e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006J\u001e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, bng = {"Lcom/iqoption/asset/markup/MarkupCalculator;", "", "precision", "", "(I)V", "askFinal", "", "askOld", "bidFinal", "bidOld", "isCalculated", "", "markup", "<set-?>", "getPrecision", "()I", "tmp", "", "calc", "", "bid", "ask", "markupNew", "check", "getAsk", "getBid", "getSpread", "init", "reset", "Companion", "asset_release"})
/* compiled from: MarkupCalculator.kt */
public final class a {
    public static final a axy = new a();
    private int akR;
    private final double[] axr;
    private double axs;
    private double axt;
    private double axu;
    private double axv;
    private double axw;
    private boolean axx;

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0007J(\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007J(\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¨\u0006\u0011"}, bng = {"Lcom/iqoption/asset/markup/MarkupCalculator$Companion;", "", "()V", "calculateBidAsk", "", "precision", "", "bid", "", "ask", "markup", "bidAsk", "", "calculateSpread", "spread", "quote", "calculateSpreadPercent", "asset_release"})
    /* compiled from: MarkupCalculator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void a(int i, double d, double d2, double d3, double[] dArr) {
            kotlin.jvm.internal.i.f(dArr, "bidAsk");
            if (d3 != 0.0d) {
                double d4 = (d + d2) / 2.0d;
                d3 = (d3 * d4) / 200.0d;
                d -= d3;
                d2 += d3;
                if (d > d2) {
                    d = d4;
                    d2 = d;
                }
                d3 = Math.pow(10.0d, (double) Math.max(0, i - 1));
                dArr[0] = Math.floor((d * d3) + 1.0E-6d) / d3;
                dArr[1] = Math.ceil((d2 * d3) - 1.0E-6d) / d3;
            }
        }

        public final double a(int i, double d, double d2, double d3) {
            return (b(i, d, d2, d3) / d2) * 100.0d;
        }

        public final double b(int i, double d, double d2, double d3) {
            if (d3 == 0.0d) {
                return d;
            }
            d += (d2 * d3) / 100.0d;
            if (d < 0.0d) {
                return 0.0d;
            }
            d2 = Math.pow(10.0d, (double) Math.max(0, i - 1));
            return (d * d2) / d2;
        }
    }

    public a() {
        this(0, 1, null);
    }

    public static final double a(int i, double d, double d2, double d3) {
        return axy.a(i, d, d2, d3);
    }

    public a(int i) {
        this.axr = new double[2];
        init(i);
    }

    public /* synthetic */ a(int i, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        this(i);
    }

    public final int getPrecision() {
        return this.akR;
    }

    public final void init(int i) {
        if (this.akR != i) {
            this.akR = i;
            this.axx = false;
        }
    }

    public final double d(double d, double d2, double d3) {
        if (f(d, d2, d3)) {
            g(d, d2, d3);
        }
        return this.axu;
    }

    public final double e(double d, double d2, double d3) {
        if (f(d, d2, d3)) {
            g(d, d2, d3);
        }
        return this.axv;
    }

    public final void reset() {
        this.axx = false;
    }

    private final boolean f(double d, double d2, double d3) {
        return (this.axx && this.axs == d && this.axt == d2 && this.axw == d3) ? false : true;
    }

    private final void g(double d, double d2, double d3) {
        this.axs = d;
        this.axt = d2;
        this.axw = d3;
        if (this.axw == 0.0d) {
            this.axu = d;
            this.axv = d2;
            return;
        }
        synchronized (this.axr) {
            axy.a(this.akR, d, d2, this.axw, this.axr);
            this.axu = this.axr[0];
            this.axv = this.axr[1];
            l lVar = l.eVB;
        }
        this.axx = true;
    }
}
