package com.iqoption.portfolio;

import androidx.collection.ArrayMap;
import com.google.common.base.f;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.collect.i;
import com.google.common.primitives.Longs;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.mobbtech.connect.response.options.b;
import com.iqoption.mobbtech.connect.response.options.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: OpenPositionGroup */
public class d {
    private static final Ordering<c> ORDERING = dLg.compound(dLh);
    private static final Ordering<c> dLg = new Ordering<c>() {
        /* renamed from: d */
        public int compare(c cVar, c cVar2) {
            return Longs.compare(cVar2.getExpired(), cVar.getExpired());
        }
    };
    private static final Ordering<c> dLh = new Ordering<c>() {
        /* renamed from: d */
        public int compare(c cVar, c cVar2) {
            return Longs.compare(cVar2.getCreated(), cVar.getCreated());
        }
    };
    private final int activeId;
    private a anF;
    private final List<c> bwQ = new ArrayList();
    private final boolean dLc;
    private a dLf;
    private long dLi;
    private ImmutableList<c> dLj;
    private boolean dLk;
    private final long id;
    private final InstrumentType instrumentType;

    /* compiled from: OpenPositionGroup */
    /* renamed from: com.iqoption.portfolio.d$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$iqoption$core$data$model$InstrumentType = new int[InstrumentType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        static {
            /*
            r0 = com.iqoption.core.data.model.InstrumentType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$iqoption$core$data$model$InstrumentType = r0;
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.core.data.model.InstrumentType.TURBO_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.core.data.model.InstrumentType.BINARY_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.core.data.model.InstrumentType.DIGITAL_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.iqoption.core.data.model.InstrumentType.FX_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = com.iqoption.core.data.model.InstrumentType.MULTI_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = com.iqoption.core.data.model.InstrumentType.CFD_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = com.iqoption.core.data.model.InstrumentType.FOREX_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = com.iqoption.core.data.model.InstrumentType.CRYPTO_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r2 = 8;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.portfolio.d$AnonymousClass3.<clinit>():void");
        }
    }

    public d(c cVar) {
        this.id = (long) f.hashCode(Integer.valueOf(cVar.getActiveId()), cVar.getInstrumentType());
        this.instrumentType = r0;
        this.activeId = cVar.getActiveId();
        this.dLc = aQv();
        u(cVar);
    }

    private boolean aQv() {
        int i = AnonymousClass3.$SwitchMap$com$iqoption$core$data$model$InstrumentType[this.instrumentType.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    /* Access modifiers changed, original: 0000 */
    public void u(c cVar) {
        this.bwQ.add(cVar);
        long createTime = cVar.getCreateTime();
        if (this.dLi < createTime) {
            this.dLi = createTime;
        }
        this.dLk = true;
    }

    public long getId() {
        return this.id;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public boolean aQw() {
        return this.dLc;
    }

    public long aQB() {
        return this.dLi;
    }

    public a aQC() {
        a aVar = this.dLf;
        if (aVar == null) {
            this.dLf = new a();
        } else {
            aVar.reset();
        }
        for (c cVar : this.bwQ) {
            this.dLf.i(cVar.getInvestSum(), cVar.getSellPnl(), cVar.getExpPnl());
        }
        return this.dLf;
    }

    public a aQA() {
        a aVar = this.dLf;
        return aVar == null ? aQC() : aVar;
    }

    public a Jt() {
        if (this.anF == null) {
            this.anF = com.iqoption.app.helpers.a.Gs().b(Integer.valueOf(this.activeId), this.instrumentType);
        }
        return this.anF;
    }

    public int size() {
        return this.bwQ.size();
    }

    public ImmutableList<c> aQy() {
        if (this.dLj == null || this.dLk) {
            Collections.sort(this.bwQ, ORDERING);
            this.dLj = ImmutableList.m(this.bwQ);
            this.dLk = false;
        }
        return this.dLj;
    }

    public static ImmutableList<d> a(Iterable<b> iterable, Ordering<d> ordering) {
        ArrayList<c> arrayList = new ArrayList();
        for (b aPX : iterable) {
            arrayList.addAll(aPX.aPX());
        }
        ArrayMap arrayMap = new ArrayMap();
        for (c cVar : arrayList) {
            Object activeType = cVar.getActiveType();
            Object instrumentType = cVar.getInstrumentType();
            if (activeType == ActiveType.TURBO_ACTIVE) {
                activeType = ActiveType.BINARY_ACTIVE;
            }
            if (instrumentType == InstrumentType.TURBO_INSTRUMENT) {
                instrumentType = InstrumentType.BINARY_INSTRUMENT;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(cVar.getActiveId());
            String str = "_";
            stringBuilder.append(str);
            stringBuilder.append(activeType);
            stringBuilder.append(str);
            stringBuilder.append(instrumentType);
            String stringBuilder2 = stringBuilder.toString();
            d dVar = (d) arrayMap.get(stringBuilder2);
            if (dVar != null) {
                dVar.u(cVar);
            } else {
                arrayMap.put(stringBuilder2, new d(cVar));
            }
        }
        return i.b(arrayMap.values()).a((Comparator) ordering);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OpenPositionGroup{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", instrumentType='");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append('\'');
        stringBuilder.append(", expirable=");
        stringBuilder.append(this.dLc);
        stringBuilder.append(", active=");
        stringBuilder.append(this.anF);
        stringBuilder.append(", lastCreateTime=");
        stringBuilder.append(this.dLi);
        stringBuilder.append(", snapshotDirty=");
        stringBuilder.append(this.dLk);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
