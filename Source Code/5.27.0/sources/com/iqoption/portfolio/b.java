package com.iqoption.portfolio;

import com.google.common.base.d;
import com.google.common.base.f;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.collect.i;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.mobbtech.connect.response.options.a;
import com.iqoption.mobbtech.connect.response.options.c;
import java.util.Comparator;

/* compiled from: ClosedPositionGroup */
public final class b {
    private static final d<a, b> dLb = new d<a, b>() {
        /* renamed from: f */
        public b apply(a aVar) {
            return new b(aVar);
        }
    };
    private final int activeId;
    private final com.iqoption.core.microservices.tradingengine.response.active.a anF = com.iqoption.app.helpers.a.Gs().b(Integer.valueOf(this.activeId), getInstrumentType());
    private final long bxc;
    private final boolean dLc;
    private final ImmutableList<Long> dLd;
    private final ImmutableList<? extends c> dLe;
    private a dLf;
    private final long id;
    private final InstrumentType instrumentType;

    /* compiled from: ClosedPositionGroup */
    /* renamed from: com.iqoption.portfolio.b$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$iqoption$core$data$model$InstrumentType = new int[InstrumentType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
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
            r1 = com.iqoption.core.data.model.InstrumentType.MULTI_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = com.iqoption.core.data.model.InstrumentType.CFD_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = com.iqoption.core.data.model.InstrumentType.FOREX_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = com.iqoption.core.data.model.InstrumentType.CRYPTO_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.portfolio.b$AnonymousClass2.<clinit>():void");
        }
    }

    public static ImmutableList<b> a(Iterable<a> iterable, Ordering<b> ordering) {
        return i.b((Iterable) iterable).a(dLb).a((Comparator) ordering);
    }

    public b(a aVar) {
        this.activeId = aVar.aiq().intValue();
        this.instrumentType = aVar.getInstrumentType();
        this.bxc = aVar.aPT().longValue() * 1000;
        this.dLd = aVar.aPU();
        this.dLe = aVar.aPX();
        this.dLc = aQv();
        this.id = (long) e(aVar);
        this.dLf = new a();
        this.dLf.a(aVar.aPS().doubleValue(), aVar.getWinAmount().doubleValue() - aVar.aPS().doubleValue(), this.dLc ? aVar.getWinAmount().doubleValue() : 0.0d, 0);
    }

    private int e(a aVar) {
        if (this.dLc) {
            return f.hashCode(aVar.aiq(), aVar.getActiveType(), aVar.aPT());
        }
        return f.hashCode(aVar.aiq(), aVar.getActiveType(), aVar.aPW());
    }

    private boolean aQv() {
        InstrumentType instrumentType = getInstrumentType();
        if (instrumentType == null) {
            return false;
        }
        int i = AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[instrumentType.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return true;
        }
        return false;
    }

    public long getId() {
        return this.id;
    }

    public boolean aQw() {
        return this.dLc;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public com.iqoption.core.microservices.tradingengine.response.active.a Jt() {
        return this.anF;
    }

    public long getCloseTime() {
        return this.bxc;
    }

    public ImmutableList<Long> aQx() {
        return this.dLd;
    }

    public ImmutableList<? extends c> aQy() {
        return this.dLe;
    }

    public int aQz() {
        return this.dLd.size();
    }

    public a aQA() {
        return this.dLf;
    }
}
