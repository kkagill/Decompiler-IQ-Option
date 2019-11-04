package com.iqoption.mobbtech.connect.response;

import androidx.core.util.Pools.SynchronizedPool;
import com.google.common.base.f;
import com.google.gson.annotations.SerializedName;
import com.iqoption.app.managers.l;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.ChartTimeInterval;
import com.iqoption.util.g;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: BuyBackQuote */
public class d extends b {
    private static final String TAG = "com.iqoption.mobbtech.connect.response.d";
    private static final SynchronizedPool<a> bzJ = new SynchronizedPool(50);
    @SerializedName("active")
    public Integer activeId;
    @SerializedName("expiration")
    public Long akW;
    @SerializedName("instant")
    public Long dIO;
    @SerializedName("periods")
    public ArrayList<b> dIP;

    /* compiled from: BuyBackQuote */
    public static class a {
        public Integer activeId;
        public Long akW;

        public a(Integer num, Long l) {
            this.activeId = num;
            this.akW = l;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (com.google.common.base.f.equal(r2.akW, r3.akW) != false) goto L_0x001f;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r3 == r2) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.mobbtech.connect.response.d.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r0 = r2.activeId;
            r3 = (com.iqoption.mobbtech.connect.response.d.a) r3;
            r1 = r3.activeId;
            r0 = com.google.common.base.f.equal(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.akW;
            r3 = r3.akW;
            r3 = com.google.common.base.f.equal(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            goto L_0x0020;
        L_0x001f:
            r3 = 1;
        L_0x0020:
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.mobbtech.connect.response.d$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return f.hashCode(this.akW, this.activeId);
        }

        public void recycle() {
            d.bzJ.release(this);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Key{activeId=");
            stringBuilder.append(this.activeId);
            stringBuilder.append(", expiration=");
            stringBuilder.append(this.akW);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    /* compiled from: BuyBackQuote */
    /* renamed from: com.iqoption.mobbtech.connect.response.d$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$iqoption$core$data$model$InstrumentType = new int[InstrumentType.values().length];
        static final /* synthetic */ int[] akL = new int[ActiveType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(2:5|6)|7|9|10|11|12|14) */
        /* JADX WARNING: Missing block: B:15:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.iqoption.core.data.model.InstrumentType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$iqoption$core$data$model$InstrumentType = r0;
            r0 = 1;
            r1 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.iqoption.core.data.model.InstrumentType.TURBO_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.iqoption.core.data.model.InstrumentType.BINARY_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = com.iqoption.core.data.model.ActiveType.values();
            r2 = r2.length;
            r2 = new int[r2];
            akL = r2;
            r2 = akL;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = com.iqoption.core.data.model.ActiveType.TURBO_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0032 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0032 }
        L_0x0032:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = com.iqoption.core.data.model.ActiveType.BINARY_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x003c }
            r0[r2] = r1;	 Catch:{ NoSuchFieldError -> 0x003c }
        L_0x003c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.mobbtech.connect.response.d$AnonymousClass1.<clinit>():void");
        }
    }

    /* compiled from: BuyBackQuote */
    public static class b {
        @SerializedName("period")
        public Integer dIQ;
        @SerializedName("values")
        public d dIR;
    }

    /* compiled from: BuyBackQuote */
    public static class c {
        @SerializedName("levels")
        public ArrayList<Double> dIS;
        @SerializedName("percents")
        public ArrayList<Double> dIT;
    }

    /* compiled from: BuyBackQuote */
    public static class d {
        @SerializedName("put")
        public c dIU;
        @SerializedName("call")
        public c dIV;
    }

    private int aB(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        if (i >= i2) {
            i--;
        }
        return i;
    }

    private int c(ActiveType activeType) {
        if (activeType == null) {
            return -1;
        }
        int i = AnonymousClass1.akL[activeType.ordinal()];
        if (i != 1) {
            return i != 2 ? -1 : ChartTimeInterval.CANDLE_15m;
        } else {
            return 60;
        }
    }

    private b p(com.iqoption.mobbtech.connect.response.options.c cVar) {
        int c = c(cVar.getActiveType());
        Iterator it = this.dIP.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (c == bVar.dIQ.intValue()) {
                return bVar;
            }
        }
        return null;
    }

    private int a(Double d, ArrayList<Double> arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (d.doubleValue() < ((Double) arrayList.get(i)).doubleValue()) {
                return i - 1;
            }
        }
        return size - 1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BuyBackQuote{activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", expiration=");
        stringBuilder.append(this.akW);
        stringBuilder.append(", instant=");
        stringBuilder.append(this.dIO);
        stringBuilder.append(", periods=");
        stringBuilder.append(this.dIP);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public Double a(com.iqoption.mobbtech.connect.response.options.c cVar, double d, double d2) {
        if (g.isEmpty(this.dIP)) {
            return null;
        }
        b p = p(cVar);
        if (!(p == null || p.dIR == null)) {
            Double valueOf = Double.valueOf(cVar.getValue());
            c cVar2 = cVar.isCall() ? p.dIR.dIV : p.dIR.dIU;
            if (!(cVar2 == null || g.isEmpty(cVar2.dIS) || g.isEmpty(cVar2.dIT))) {
                Double d3 = (Double) cVar2.dIT.get(aB(a(valueOf, cVar2.dIS), cVar2.dIT.size()));
                if (d3 == null) {
                    return null;
                }
                return Double.valueOf((d2 * d3.doubleValue()) / 100.0d);
            }
        }
        return null;
    }

    public boolean d(long j, InstrumentType instrumentType) {
        long Ib = l.HZ().Ib();
        return (j * 1000) - Ib > ad(instrumentType) && Ib - (this.dIO.longValue() * 1000) < 3000;
    }

    private long ad(InstrumentType instrumentType) {
        int i = AnonymousClass1.$SwitchMap$com$iqoption$core$data$model$InstrumentType[instrumentType.ordinal()];
        if (i != 1) {
            return i != 2 ? 0 : 120000;
        } else {
            return 15000;
        }
    }

    public static a b(d dVar) {
        return new a(dVar.activeId, dVar.akW);
    }

    public static a e(com.iqoption.mobbtech.connect.response.options.d dVar) {
        return b(dVar.aiq(), dVar.aQd());
    }

    public static a c(d dVar) {
        return b(dVar.activeId, dVar.akW);
    }

    public static a b(Integer num, Long l) {
        a aVar = (a) bzJ.acquire();
        if (aVar == null) {
            return new a(num, l);
        }
        aVar.activeId = num;
        aVar.akW = l;
        return aVar;
    }
}
