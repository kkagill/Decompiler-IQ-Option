package com.iqoption.app.managers.a;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.common.base.Suppliers;
import com.google.common.base.j;
import com.google.common.base.n;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.i;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.x.R;
import java.util.Objects;

/* compiled from: ExpirationHelper */
public class e implements i {
    public static final Ordering<Expiration> ORDERING = new Ordering<Expiration>() {
        public int compare(Expiration expiration, Expiration expiration2) {
            return expiration.expValue.compareTo(expiration2.expValue);
        }
    };
    private static volatile transient e avy;
    private final n<c> avA = Suppliers.a(-$$Lambda$ND7nY561Q_RV37nqUKZNKCQIdcY.INSTANCE);
    private final n<a> avB = Suppliers.a(-$$Lambda$-Kp2FBqn8I6nsZyJDypmzU4gkF0.INSTANCE);
    private final n<h> avC = Suppliers.a(-$$Lambda$m_zorybvvk1V70-qoKrjs9lI5Dk.INSTANCE);
    private final n<b> avD = Suppliers.a(-$$Lambda$Y0S0ACfrTZhjIuxlWzxCgIvad_w.INSTANCE);
    private final n<d> avE = Suppliers.a(-$$Lambda$pBv6BFxJMvt1Nc2XYvOIS6ffLrk.INSTANCE);
    private final n<f> avz = Suppliers.a(-$$Lambda$wYGY7rE695u8_8WcTmZIvhCxv00.INSTANCE);

    /* compiled from: ExpirationHelper */
    /* renamed from: com.iqoption.app.managers.a.e$2 */
    static /* synthetic */ class AnonymousClass2 {
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
            r1 = com.iqoption.core.data.model.InstrumentType.MULTI_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = com.iqoption.core.data.model.InstrumentType.FX_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0040 }
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
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.managers.a.e$AnonymousClass2.<clinit>():void");
        }
    }

    /* compiled from: ExpirationHelper */
    public static class a {
        public final Expiration anH;
        public final int avF;
        public final boolean avG;
        public final com.iqoption.mobbtech.connect.response.options.d optionKey;

        public a(com.iqoption.mobbtech.connect.response.options.d dVar, Expiration expiration, int i, boolean z) {
            this.optionKey = dVar;
            this.anH = expiration;
            this.avF = i;
            this.avG = z;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!(this.avF == aVar.avF && this.avG == aVar.avG && Objects.equals(this.optionKey, aVar.optionKey) && Objects.equals(this.anH, aVar.anH))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.optionKey, this.anH, Integer.valueOf(this.avF), Boolean.valueOf(this.avG)});
        }
    }

    /* compiled from: ExpirationHelper */
    public static class d {
        public boolean ajQ;

        public d(boolean z) {
            this.ajQ = z;
        }
    }

    /* compiled from: ExpirationHelper */
    public static class e {
    }

    /* compiled from: ExpirationHelper */
    public static class f {
    }

    /* compiled from: ExpirationHelper */
    public static class c implements j<Expiration> {
        private final Integer activeId;
        private long akN;
        private final InstrumentType type;

        public c(Integer num, InstrumentType instrumentType, long j) {
            this.activeId = num;
            this.type = instrumentType;
            this.akN = j;
        }

        public void ao(long j) {
            this.akN = j;
        }

        /* renamed from: d */
        public boolean apply(Expiration expiration) {
            com.iqoption.mobbtech.connect.response.options.d dVar = new com.iqoption.mobbtech.connect.response.options.d(Long.valueOf(expiration.expValue.longValue() / 1000), this.activeId, this.type);
            boolean z = true;
            if (this.akN > expiration.expValue.longValue() - expiration.deadTime.longValue() && !com.iqoption.app.managers.c.GS().b(dVar)) {
                return true;
            }
            if (this.akN >= expiration.expValue.longValue() - expiration.deadTime.longValue()) {
                z = false;
            }
            return z;
        }
    }

    /* compiled from: ExpirationHelper */
    public static class b extends com.iqoption.system.a.c<com.iqoption.core.microservices.tradingengine.response.instrument.e> {
        public int avF;

        public b(int i) {
            this.avF = i;
        }
    }

    public static long a(long j, long j2, long j3, long j4) {
        while (j2 - j4 < j) {
            j2 += j3;
        }
        return j2;
    }

    public static synchronized e Ig() {
        e eVar;
        synchronized (e.class) {
            if (avy == null) {
                synchronized (e.class) {
                    if (avy == null) {
                        avy = new e();
                    }
                }
            }
            eVar = avy;
        }
        return eVar;
    }

    private i g(InstrumentType instrumentType) {
        int i = AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[instrumentType.ordinal()];
        if (i == 1) {
            return (i) this.avC.get();
        }
        if (i == 2) {
            return (i) this.avB.get();
        }
        if (i == 3) {
            return (i) this.avA.get();
        }
        if (i != 4) {
            return i != 5 ? (i) this.avD.get() : (i) this.avE.get();
        } else {
            return (i) this.avz.get();
        }
    }

    public c h(InstrumentType instrumentType) {
        int i = AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[instrumentType.ordinal()];
        if (i == 3) {
            return (c) this.avA.get();
        }
        if (i == 4) {
            return (c) this.avz.get();
        }
        if (i != 5) {
            return null;
        }
        return (c) this.avE.get();
    }

    public void clear() {
        ((c) this.avA.get()).clear();
    }

    public static long a(int i, InstrumentType instrumentType, long j, long j2, long j3, long j4) {
        while (j2 - j4 < j) {
            if (!com.iqoption.app.managers.c.GS().b(new com.iqoption.mobbtech.connect.response.options.d(Long.valueOf(j2 / 1000), Integer.valueOf(i), instrumentType)) && j2 > j) {
                break;
            }
            j2 += j3;
        }
        return j2;
    }

    public static String ap(long j) {
        if (j == 0) {
            return IQApp.Eu().getString(R.string.n_a);
        }
        if (i.aP(j)) {
            return TimeUtil.bRq.format(Long.valueOf(j));
        }
        return TimeUtil.bRC.format(Long.valueOf(j));
    }

    public t<ImmutableList<Expiration>> m(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return g(aVar.getInstrumentType()).m(aVar);
    }

    public t<Expiration> p(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return g(aVar.getInstrumentType()).p(aVar);
    }

    public Expiration a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, Expiration expiration) {
        return g(aVar.getInstrumentType()).a(aVar, expiration);
    }

    public boolean b(com.iqoption.core.microservices.tradingengine.response.active.a aVar, Expiration expiration) {
        return g(aVar.getInstrumentType()).b(aVar, expiration);
    }

    public String a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, long j) {
        return g(aVar.getInstrumentType()).a(aVar, j);
    }

    @NonNull
    public static String a(@NonNull Context context, long j, long j2) {
        if (j2 == 0) {
            return IQApp.Eu().getString(R.string.n_a);
        }
        String stringBuilder;
        j2 = (j2 - j) / 1000;
        long j3 = j2 / 60;
        j = j3 / 60;
        String str = ":";
        StringBuilder stringBuilder2;
        if (j > 0) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append(j);
            stringBuilder3.append(context.getString(R.string.hour_one_char));
            stringBuilder = stringBuilder3.toString();
        } else if (j3 > 0) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(j3);
            stringBuilder2.append(context.getString(R.string.minutes_one_char));
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(j2);
            stringBuilder2.append(context.getString(R.string.seconds_one_char));
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    public void q(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        g(aVar.getInstrumentType()).q(aVar);
    }

    public long c(com.iqoption.core.microservices.tradingengine.response.active.a aVar, Expiration expiration) {
        return g(aVar.getInstrumentType()).c(aVar, expiration);
    }

    public long n(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return g(aVar.getInstrumentType()).n(aVar);
    }
}
