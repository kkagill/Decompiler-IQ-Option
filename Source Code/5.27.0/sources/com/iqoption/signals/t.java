package com.iqoption.signals;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ext.c;
import com.iqoption.core.microservices.tradingengine.response.active.d;
import com.iqoption.signals.d.f;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B=\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b0\b¢\u0006\u0002\u0010\fB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u000fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003J\t\u0010\u001d\u001a\u00020\nHÖ\u0001J.\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00062\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b0\bJ\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006#"}, bng = {"Lcom/iqoption/signals/SignalsViewState;", "", "filter", "Lcom/iqoption/signals/SignalFilter;", "signals", "", "Lcom/iqoption/core/microservices/pricemovements/response/Signal;", "assets", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "(Lcom/iqoption/signals/SignalFilter;Ljava/util/List;Ljava/util/Map;)V", "items", "Lcom/iqoption/signals/AdapterItem;", "(Lcom/iqoption/signals/SignalFilter;Ljava/util/List;Ljava/util/List;)V", "getFilter", "()Lcom/iqoption/signals/SignalFilter;", "getItems", "()Ljava/util/List;", "getSignals", "component1", "component2", "component3", "copy", "equals", "", "other", "f", "hashCode", "merge", "newSignal", "toString", "", "Companion", "signals_release"})
/* compiled from: SignalsViewState.kt */
public final class t {
    private static final SimpleDateFormat aPk = new SimpleDateFormat("HH:mm", Locale.US);
    private static final SimpleDateFormat aQc = new SimpleDateFormat("d MMM yyyy", Locale.US);
    private static final t dUa = new t(SignalFilter.ALL, l.listOf(c.dTd), m.emptyList());
    public static final a dUb = new a();
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM", Locale.US);
    private final SignalFilter dTX;
    private final List<com.iqoption.core.microservices.pricemovements.a.a> dTY;
    private final List<a> iA;

    @i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00110\u0011J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0014J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/signals/SignalsViewState$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/signals/SignalsViewState;", "getEMPTY", "()Lcom/iqoption/signals/SignalsViewState;", "dateFormat", "Ljava/text/SimpleDateFormat;", "dateYearFormat", "timeFormat", "convertSignals", "", "Lcom/iqoption/signals/AdapterItem;", "signals", "Lcom/iqoption/core/microservices/pricemovements/response/Signal;", "assets", "", "Lcom/iqoption/core/data/model/InstrumentType;", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "convertToSignalItem", "Lcom/iqoption/signals/SignalItem;", "signal", "active", "formatTitle", "", "time", "", "signals_release"})
    /* compiled from: SignalsViewState.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final t aUx() {
            return t.dUa;
        }

        public final List<a> d(List<com.iqoption.core.microservices.pricemovements.a.a> list, Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>> map) {
            kotlin.jvm.internal.i.f(list, "signals");
            kotlin.jvm.internal.i.f(map, "assets");
            List arrayList = new ArrayList();
            com.iqoption.core.microservices.pricemovements.a.a aVar = (com.iqoption.core.microservices.pricemovements.a.a) null;
            for (com.iqoption.core.microservices.pricemovements.a.a aVar2 : list) {
                for (Object next : map.values()) {
                    if (((Map) next).containsKey(Integer.valueOf(aVar2.getActiveId()))) {
                        break;
                    }
                }
                Object next2 = null;
                Map map2 = (Map) next2;
                com.iqoption.core.microservices.tradingengine.response.active.a aVar3 = map2 != null ? (com.iqoption.core.microservices.tradingengine.response.active.a) map2.get(Integer.valueOf(aVar2.getActiveId())) : null;
                if (aVar3 != null) {
                    if (aVar == null || !c.n(aVar.getCreateTime(), aVar2.getCreateTime())) {
                        arrayList.add(new j(cg(aVar2.getCreateTime())));
                    }
                    arrayList.add(a(aVar2, aVar3));
                    aVar = aVar2;
                }
            }
            return arrayList;
        }

        public final f a(com.iqoption.core.microservices.pricemovements.a.a aVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar2) {
            String string;
            kotlin.jvm.internal.i.f(aVar, "signal");
            kotlin.jvm.internal.i.f(aVar2, ConditionalUserProperty.ACTIVE);
            boolean z = false;
            if (aVar.agw() - aVar.agv() > ((double) null)) {
                z = true;
            }
            String format = t.aPk.format(Long.valueOf(aVar.getCreateTime()));
            kotlin.jvm.internal.i.e(format, "timeFormat.format(signal.createTime)");
            String B = d.B(aVar2);
            int type = aVar.getType();
            if (type == 1) {
                string = com.iqoption.core.d.getString(f.sharp_jump_drop);
            } else if (type != 2) {
                string = "";
            } else {
                string = com.iqoption.core.d.getString(f.gap);
            }
            return new f(z, format, B, string, e.a(aVar), aVar.agy() ? 2 : 1, aVar2, aVar);
        }

        private final String cg(long j) {
            if (c.aP(j)) {
                return com.iqoption.core.d.getString(f.today);
            }
            if (c.aA(j)) {
                return com.iqoption.core.d.getString(f.yesterday);
            }
            String format;
            if (c.aB(j)) {
                format = t.dateFormat.format(Long.valueOf(j));
                kotlin.jvm.internal.i.e(format, "dateFormat.format(time)");
                return format;
            }
            format = t.aQc.format(Long.valueOf(j));
            kotlin.jvm.internal.i.e(format, "dateYearFormat.format(time)");
            return format;
        }
    }

    public static /* synthetic */ t a(t tVar, SignalFilter signalFilter, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            signalFilter = tVar.dTX;
        }
        if ((i & 2) != 0) {
            list = tVar.iA;
        }
        if ((i & 4) != 0) {
            list2 = tVar.dTY;
        }
        return tVar.a(signalFilter, list, list2);
    }

    public final t a(SignalFilter signalFilter, List<? extends a> list, List<com.iqoption.core.microservices.pricemovements.a.a> list2) {
        kotlin.jvm.internal.i.f(signalFilter, "filter");
        kotlin.jvm.internal.i.f(list, "items");
        kotlin.jvm.internal.i.f(list2, "signals");
        return new t(signalFilter, (List) list, (List) list2);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.dTY, r3.dTY) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.signals.t;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.signals.t) r3;
        r0 = r2.dTX;
        r1 = r3.dTX;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.iA;
        r1 = r3.iA;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.dTY;
        r3 = r3.dTY;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.signals.t.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        SignalFilter signalFilter = this.dTX;
        int i = 0;
        int hashCode = (signalFilter != null ? signalFilter.hashCode() : 0) * 31;
        List list = this.iA;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.dTY;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SignalsViewState(filter=");
        stringBuilder.append(this.dTX);
        stringBuilder.append(", items=");
        stringBuilder.append(this.iA);
        stringBuilder.append(", signals=");
        stringBuilder.append(this.dTY);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public t(SignalFilter signalFilter, List<? extends a> list, List<com.iqoption.core.microservices.pricemovements.a.a> list2) {
        kotlin.jvm.internal.i.f(signalFilter, "filter");
        kotlin.jvm.internal.i.f(list, "items");
        kotlin.jvm.internal.i.f(list2, "signals");
        this.dTX = signalFilter;
        this.iA = list;
        this.dTY = list2;
    }

    public final SignalFilter aUr() {
        return this.dTX;
    }

    public final List<a> getItems() {
        return this.iA;
    }

    public t(SignalFilter signalFilter, List<com.iqoption.core.microservices.pricemovements.a.a> list, Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>> map) {
        kotlin.jvm.internal.i.f(signalFilter, "filter");
        kotlin.jvm.internal.i.f(list, "signals");
        kotlin.jvm.internal.i.f(map, "assets");
        this(signalFilter, dUb.d(list, map), (List) list);
    }

    public final t d(SignalFilter signalFilter) {
        kotlin.jvm.internal.i.f(signalFilter, "f");
        return new t(signalFilter, l.listOf(c.dTd), m.emptyList());
    }

    public final t a(com.iqoption.core.microservices.pricemovements.a.a aVar, Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>> map) {
        kotlin.jvm.internal.i.f(aVar, "newSignal");
        kotlin.jvm.internal.i.f(map, "assets");
        int i = u.aob[this.dTX.ordinal()];
        int i2 = 2;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            if (i == 3) {
                i2 = 1;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (i2 != 0 && aVar.getType() != i2) {
            return this;
        }
        List arrayList = new ArrayList();
        arrayList.add(aVar);
        arrayList.addAll(this.dTY);
        return a(this, null, dUb.d(arrayList, map), arrayList, 1, null);
    }
}
