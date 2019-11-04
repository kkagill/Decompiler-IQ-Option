package com.iqoption.core.features.instrument;

import com.iqoption.core.d;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ext.h;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\bJ\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007J\b\u0010\u000f\u001a\u00020\rH\u0007J\b\u0010\u0010\u001a\u00020\rH\u0007J\b\u0010\u0011\u001a\u00020\rH\u0007J\b\u0010\u0012\u001a\u00020\rH\u0007J\b\u0010\u0013\u001a\u00020\rH\u0007J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/features/instrument/InstrumentFeatureHelper;", "", "()V", "getFeatureName", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "getInstrumentsState", "Lio/reactivex/Flowable;", "", "getState", "", "isFeatureBinaryInstrumentEnabled", "", "isFeatureCFDInstrumentEnabled", "isFeatureCryptoInstrumentEnabled", "isFeatureDigitalInstrumentEnabled", "isFeatureForexInstrumentEnabled", "isFeatureFxOptionEnabled", "isFeatureMultiInstrumentEnabled", "isInstrumentEnabled", "core_release"})
/* compiled from: InstrumentFeatureHelper.kt */
public final class b {
    public static final b bhs = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/features/response/Feature;", "apply"})
    /* compiled from: InstrumentFeatureHelper.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a bht = new a();

        a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Integer.valueOf(ax((List) obj));
        }

        public final int ax(List<com.iqoption.core.microservices.features.a.a> list) {
            kotlin.jvm.internal.i.f(list, "it");
            return b.bhs.getState();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/data/model/InstrumentType;", "it", "", "apply", "(Ljava/lang/Integer;)Ljava/util/List;"})
    /* compiled from: InstrumentFeatureHelper.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b bhu = new b();

        b() {
        }

        /* renamed from: f */
        public final List<InstrumentType> apply(Integer num) {
            kotlin.jvm.internal.i.f(num, "it");
            List arrayList = new ArrayList();
            if (b.Xt()) {
                arrayList.add(InstrumentType.TURBO_INSTRUMENT);
                arrayList.add(InstrumentType.BINARY_INSTRUMENT);
            }
            if (b.Xq()) {
                arrayList.add(InstrumentType.MULTI_INSTRUMENT);
            }
            if (b.Xr()) {
                arrayList.add(InstrumentType.DIGITAL_INSTRUMENT);
            }
            if (b.Xs()) {
                arrayList.add(InstrumentType.FX_INSTRUMENT);
            }
            if (b.Xv()) {
                arrayList.add(InstrumentType.FOREX_INSTRUMENT);
            }
            if (b.Xu()) {
                arrayList.add(InstrumentType.CFD_INSTRUMENT);
            }
            if (b.Xw()) {
                arrayList.add(InstrumentType.CRYPTO_INSTRUMENT);
            }
            return u.T(arrayList);
        }
    }

    private b() {
    }

    public static final boolean Xq() {
        return bhs.I(InstrumentType.MULTI_INSTRUMENT);
    }

    public static final boolean Xr() {
        return bhs.I(InstrumentType.DIGITAL_INSTRUMENT);
    }

    public static final boolean Xs() {
        return bhs.I(InstrumentType.FX_INSTRUMENT);
    }

    public static final boolean Xt() {
        return bhs.I(InstrumentType.BINARY_INSTRUMENT);
    }

    public static final boolean Xu() {
        return bhs.I(InstrumentType.CFD_INSTRUMENT);
    }

    public static final boolean Xv() {
        return bhs.I(InstrumentType.FOREX_INSTRUMENT);
    }

    public static final boolean Xw() {
        return bhs.I(InstrumentType.CRYPTO_INSTRUMENT);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A:{RETURN} */
    public final boolean I(com.iqoption.core.data.model.InstrumentType r8) {
        /*
        r7 = this;
        r0 = "instrumentType";
        kotlin.jvm.internal.i.f(r8, r0);
        r0 = com.iqoption.core.d.Un();
        r0 = r0.Do();
        r1 = r0.length;
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x0014;
    L_0x0012:
        r1 = 1;
        goto L_0x0015;
    L_0x0014:
        r1 = 0;
    L_0x0015:
        if (r1 != 0) goto L_0x0031;
    L_0x0017:
        r1 = r0.length;
        r4 = 0;
    L_0x0019:
        if (r4 >= r1) goto L_0x002b;
    L_0x001b:
        r5 = r0[r4];
        r6 = r8.getServerValue();
        r6 = kotlin.jvm.internal.i.y(r5, r6);
        if (r6 == 0) goto L_0x0028;
    L_0x0027:
        goto L_0x002c;
    L_0x0028:
        r4 = r4 + 1;
        goto L_0x0019;
    L_0x002b:
        r5 = 0;
    L_0x002c:
        if (r5 == 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0031;
    L_0x002f:
        r0 = 0;
        goto L_0x0032;
    L_0x0031:
        r0 = 1;
    L_0x0032:
        if (r0 != 0) goto L_0x0035;
    L_0x0034:
        return r3;
    L_0x0035:
        r8 = r7.J(r8);
        if (r8 == 0) goto L_0x004d;
    L_0x003b:
        r0 = com.iqoption.core.d.EH();
        r8 = r0.ek(r8);
        r0 = "disabled";
        r8 = kotlin.jvm.internal.i.y(r8, r0);
        r8 = r8 ^ r2;
        if (r8 == 0) goto L_0x004d;
    L_0x004c:
        goto L_0x004e;
    L_0x004d:
        r2 = 0;
    L_0x004e:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.features.instrument.b.I(com.iqoption.core.data.model.InstrumentType):boolean");
    }

    private final String J(InstrumentType instrumentType) {
        switch (c.aob[instrumentType.ordinal()]) {
            case 1:
            case 2:
                return "binary-instrument";
            case 3:
                return "digital-instrument";
            case 4:
                return "multioptions-instrument";
            case 5:
                return "fx-options-instrument";
            case 6:
                return "forex-instrument";
            case 7:
                return "cfd-instrument";
            case 8:
                return "crypto-instrument";
            default:
                return null;
        }
    }

    private final int getState() {
        return ((((((((((Xt() | 0) | Xr()) << 1) | Xs()) << 2) | Xv()) << 3) | Xu()) << 4) | Xw()) << 5;
    }

    public final e<List<InstrumentType>> Xx() {
        e g = d.EH().Ip().g(a.bht).bkT().g(b.bhu);
        kotlin.jvm.internal.i.e(g, "features.observeFeatures…oList()\n                }");
        return h.d(g);
    }
}
