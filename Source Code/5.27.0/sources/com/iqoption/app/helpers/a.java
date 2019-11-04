package com.iqoption.app.helpers;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Suppliers;
import com.google.common.base.j;
import com.google.common.base.n;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.i;
import com.iqoption.core.util.w;
import com.iqoption.util.ae;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ActiveSettingHelper */
public class a {
    private static final String TAG = "com.iqoption.app.helpers.a";
    public static final j<com.iqoption.core.microservices.tradingengine.response.active.a> asV = -$$Lambda$9Hq5XmiN5b7k6ASPsAVEFQYHODY.INSTANCE;
    public static final com.google.common.base.d<com.iqoption.core.microservices.tradingengine.response.active.a, Integer> asW = -$$Lambda$a$-C223mWn_CuTaybig0HiguRHelM.INSTANCE;
    public static final com.google.common.base.d<com.iqoption.core.microservices.tradingengine.response.active.a, ActiveType> asX = -$$Lambda$a$chQu1fwLumq6E1UOhCUol10jOvw.INSTANCE;
    private static final n<a> asY = Suppliers.a(-$$Lambda$a$BG__zsaPUwXb59wDppt9tQP-ZPk.INSTANCE);
    private final SharedPreferences asQ = IQApp.Eu().getSharedPreferences("as_pref_name", 0);
    private HashMap<InstrumentType, ConcurrentHashMap<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>> asZ = Gt();
    private HashMap<InstrumentType, Map<Integer, com.iqoption.core.microservices.tradingengine.response.b.a>> ata = Gu();
    public HashMap<InstrumentType, ConcurrentHashMap<Integer, com.iqoption.core.microservices.tradingengine.response.a.a>> atb = Gv();
    private HashMap<InstrumentType, Map<Integer, com.iqoption.core.microservices.f.a.a.a>> atc = Gw();
    private ImmutableList<i> atd = ImmutableList.sQ();
    public com.iqoption.core.util.w.a ate = -$$Lambda$a$9-8LbX74XPUj2kj7aj8Lbst-AXM.INSTANCE;
    private ImmutableList<com.iqoption.core.microservices.tradingengine.response.active.a> atf;
    private volatile boolean atg = false;
    private volatile boolean ath = false;
    private volatile boolean ati = false;
    private volatile boolean atj = false;
    private volatile boolean atk = false;
    private volatile boolean atl = false;
    private volatile boolean atm = false;
    private volatile boolean atn = true;
    private volatile boolean ato = false;
    private volatile boolean atp = false;
    private volatile boolean atq = true;
    private volatile boolean atr = false;
    private volatile boolean ats = false;
    private volatile boolean att = true;
    private com.iqoption.core.util.w.a atu = -$$Lambda$a$SeBt_ax0b7Q7f8L-uXz8oJYA0SA.INSTANCE;

    /* compiled from: ActiveSettingHelper */
    /* renamed from: com.iqoption.app.helpers.a$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$iqoption$core$data$model$InstrumentType = new int[InstrumentType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.iqoption.core.data.model.InstrumentType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$iqoption$core$data$model$InstrumentType = r0;
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.core.data.model.InstrumentType.CFD_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.core.data.model.InstrumentType.FOREX_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.core.data.model.InstrumentType.CRYPTO_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.helpers.a$AnonymousClass1.<clinit>():void");
        }
    }

    /* compiled from: ActiveSettingHelper */
    public static class a {
        public final ArrayList<com.iqoption.core.microservices.tradingengine.response.a.a> atv;
        public final InstrumentType instrumentType;

        public a(InstrumentType instrumentType, ArrayList<com.iqoption.core.microservices.tradingengine.response.a.a> arrayList) {
            this.instrumentType = instrumentType;
            this.atv = arrayList;
        }
    }

    /* compiled from: ActiveSettingHelper */
    public static class b {
        public final ActiveType activeType;

        public b(ActiveType activeType) {
            this.activeType = activeType;
        }
    }

    /* compiled from: ActiveSettingHelper */
    public static class c {
    }

    /* compiled from: ActiveSettingHelper */
    public static class d extends com.iqoption.system.a.c<InstrumentType> {
    }

    /* compiled from: ActiveSettingHelper */
    public static class e extends com.iqoption.system.a.c<InstrumentType> {
    }

    private static /* synthetic */ Integer k(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return Integer.valueOf(aVar == null ? -1 : aVar.ahS().intValue());
    }

    private static /* synthetic */ ActiveType j(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return aVar == null ? ActiveType.UNKNOWN : aVar.getActiveType();
    }

    public static a Gs() {
        return (a) asY.get();
    }

    private a() {
    }

    private void Y(String str, String str2) {
        this.asQ.edit().putString(str, str2).apply();
    }

    private String ea(String str) {
        return this.asQ.getString(str, "");
    }

    private boolean eb(String str) {
        return this.asQ.contains(str);
    }

    private static HashMap<InstrumentType, ConcurrentHashMap<Integer, com.iqoption.core.microservices.tradingengine.response.active.a>> Gt() {
        HashMap hashMap = new HashMap();
        hashMap.put(InstrumentType.CRYPTO_INSTRUMENT, new ConcurrentHashMap(com.iqoption.core.microservices.tradingengine.response.active.c.T(InstrumentType.CRYPTO_INSTRUMENT)));
        hashMap.put(InstrumentType.CFD_INSTRUMENT, new ConcurrentHashMap(com.iqoption.core.microservices.tradingengine.response.active.c.T(InstrumentType.CFD_INSTRUMENT)));
        hashMap.put(InstrumentType.FOREX_INSTRUMENT, new ConcurrentHashMap(com.iqoption.core.microservices.tradingengine.response.active.c.T(InstrumentType.FOREX_INSTRUMENT)));
        hashMap.put(InstrumentType.MULTI_INSTRUMENT, new ConcurrentHashMap(com.iqoption.core.microservices.tradingengine.response.active.c.T(InstrumentType.MULTI_INSTRUMENT)));
        hashMap.put(InstrumentType.DIGITAL_INSTRUMENT, new ConcurrentHashMap(com.iqoption.core.microservices.tradingengine.response.active.c.T(InstrumentType.DIGITAL_INSTRUMENT)));
        hashMap.put(InstrumentType.BINARY_INSTRUMENT, new ConcurrentHashMap(com.iqoption.core.microservices.tradingengine.response.active.c.T(InstrumentType.BINARY_INSTRUMENT)));
        hashMap.put(InstrumentType.TURBO_INSTRUMENT, new ConcurrentHashMap(com.iqoption.core.microservices.tradingengine.response.active.c.T(InstrumentType.TURBO_INSTRUMENT)));
        hashMap.put(InstrumentType.FX_INSTRUMENT, new ConcurrentHashMap(com.iqoption.core.microservices.tradingengine.response.active.c.T(InstrumentType.FX_INSTRUMENT)));
        return hashMap;
    }

    private static HashMap<InstrumentType, Map<Integer, com.iqoption.core.microservices.tradingengine.response.b.a>> Gu() {
        HashMap hashMap = new HashMap();
        hashMap.put(InstrumentType.CFD_INSTRUMENT, new HashMap());
        hashMap.put(InstrumentType.FOREX_INSTRUMENT, new HashMap());
        hashMap.put(InstrumentType.CRYPTO_INSTRUMENT, new HashMap());
        return hashMap;
    }

    private static HashMap<InstrumentType, ConcurrentHashMap<Integer, com.iqoption.core.microservices.tradingengine.response.a.a>> Gv() {
        HashMap hashMap = new HashMap();
        hashMap.put(InstrumentType.CFD_INSTRUMENT, new ConcurrentHashMap(com.iqoption.core.microservices.tradingengine.response.active.c.T(InstrumentType.CFD_INSTRUMENT)));
        hashMap.put(InstrumentType.FOREX_INSTRUMENT, new ConcurrentHashMap(com.iqoption.core.microservices.tradingengine.response.active.c.T(InstrumentType.FOREX_INSTRUMENT)));
        hashMap.put(InstrumentType.CRYPTO_INSTRUMENT, new ConcurrentHashMap(com.iqoption.core.microservices.tradingengine.response.active.c.T(InstrumentType.CRYPTO_INSTRUMENT)));
        return hashMap;
    }

    private static HashMap<InstrumentType, Map<Integer, com.iqoption.core.microservices.f.a.a.a>> Gw() {
        HashMap hashMap = new HashMap();
        hashMap.put(InstrumentType.CRYPTO_INSTRUMENT, ImmutableMap.sW());
        hashMap.put(InstrumentType.CFD_INSTRUMENT, ImmutableMap.sW());
        hashMap.put(InstrumentType.FOREX_INSTRUMENT, ImmutableMap.sW());
        hashMap.put(InstrumentType.MULTI_INSTRUMENT, ImmutableMap.sW());
        hashMap.put(InstrumentType.DIGITAL_INSTRUMENT, ImmutableMap.sW());
        hashMap.put(InstrumentType.BINARY_INSTRUMENT, ImmutableMap.sW());
        hashMap.put(InstrumentType.TURBO_INSTRUMENT, ImmutableMap.sW());
        hashMap.put(InstrumentType.FX_INSTRUMENT, ImmutableMap.sW());
        return hashMap;
    }

    public ImmutableList<com.iqoption.core.microservices.tradingengine.response.active.a> a(InstrumentType instrumentType, boolean z) {
        Map map = (Map) this.asZ.get(instrumentType);
        if (map == null) {
            return ImmutableList.sQ();
        }
        if (z) {
            return ImmutableList.m(map.values());
        }
        return com.google.common.collect.i.b(map.values()).b(-$$Lambda$a$LF9QiFR_udep8Q9qxk-Wne-mnos.INSTANCE).sC();
    }

    private static /* synthetic */ boolean i(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return aVar == null ? false : aVar.isSuspended() ^ 1;
    }

    public ImmutableList<com.iqoption.core.microservices.tradingengine.response.active.a> bw(boolean z) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.asZ.get(InstrumentType.TURBO_INSTRUMENT);
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.asZ.get(InstrumentType.BINARY_INSTRUMENT);
        HashMap hashMap = new HashMap(com.iqoption.core.microservices.tradingengine.response.active.c.T(null));
        hashMap.putAll(concurrentHashMap2);
        w.a(hashMap, concurrentHashMap, this.ate);
        if (z) {
            return ImmutableList.m(hashMap.values());
        }
        return com.google.common.collect.i.b(hashMap.values()).b(-$$Lambda$a$SCTp_xfJrZqJ6YlsDel97Tm8gIM.INSTANCE).sC();
    }

    private static /* synthetic */ boolean h(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return aVar == null ? false : aVar.isSuspended() ^ 1;
    }

    public ImmutableList<com.iqoption.core.microservices.tradingengine.response.active.a> Gx() {
        if (this.atf == null) {
            this.atf = com.google.common.collect.i.b(this.asZ.keySet()).b(new -$$Lambda$a$US7O8KIzFnKxhzsISeLJI9M4QlI(this)).sC();
        }
        return this.atf;
    }

    private /* synthetic */ Collection f(InstrumentType instrumentType) {
        return ((ConcurrentHashMap) this.asZ.get(instrumentType)).values();
    }

    public ImmutableList<com.iqoption.core.microservices.tradingengine.response.active.a> a(ActiveType activeType, boolean z) {
        return com.google.common.collect.i.b(((ConcurrentHashMap) this.asZ.get(activeType.toInstrumentType())).values()).b(new -$$Lambda$a$34gu33VkjGJoHmifgNlqXRnmLlU(activeType, z)).sC();
    }

    public void a(com.iqoption.core.microservices.tradingengine.response.active.g.a aVar) {
        if (aVar != null) {
            HashMap ahZ = aVar.ahW().ahZ();
            if (ahZ != null) {
                this.asZ.put(InstrumentType.BINARY_INSTRUMENT, new ConcurrentHashMap(ahZ));
            }
            HashMap ahZ2 = aVar.ahV().ahZ();
            if (ahZ != null) {
                this.asZ.put(InstrumentType.TURBO_INSTRUMENT, new ConcurrentHashMap(ahZ2));
            }
            if (aVar.ahX() != null) {
                com.google.common.collect.ImmutableList.a sT = ImmutableList.sT();
                for (Entry entry : aVar.ahX().entrySet()) {
                    sT.aI(new i(((Integer) entry.getKey()).intValue(), (String) entry.getValue()));
                }
                this.atd = sT.sU();
            }
        }
        this.ath = true;
        GF();
    }

    public void a(InstrumentType instrumentType, Map<Integer, com.iqoption.core.microservices.tradingengine.response.active.a> map) {
        this.atf = null;
        ((ConcurrentHashMap) this.asZ.get(instrumentType)).clear();
        if (map != null) {
            ((ConcurrentHashMap) this.asZ.get(instrumentType)).putAll(map);
        }
        if (InstrumentType.MULTI_INSTRUMENT.equals(instrumentType)) {
            this.ati = true;
        } else if (InstrumentType.DIGITAL_INSTRUMENT.equals(instrumentType)) {
            this.atj = true;
        } else if (InstrumentType.CFD_INSTRUMENT.equals(instrumentType)) {
            this.atl = true;
        } else if (InstrumentType.FOREX_INSTRUMENT.equals(instrumentType)) {
            this.ato = true;
        } else if (InstrumentType.CRYPTO_INSTRUMENT.equals(instrumentType)) {
            this.atr = true;
        } else if (InstrumentType.FX_INSTRUMENT.equals(instrumentType)) {
            this.atk = true;
        }
        GF();
    }

    private boolean Gy() {
        return !com.iqoption.core.features.instrument.b.Xu() || (this.atl && this.atm && this.atn);
    }

    private boolean Gz() {
        return !com.iqoption.core.features.instrument.b.Xv() || (this.ato && this.atp && this.atq);
    }

    private boolean GA() {
        return !com.iqoption.core.features.instrument.b.Xw() || (this.atr && this.ats && this.att);
    }

    private boolean GB() {
        return !com.iqoption.core.features.instrument.b.Xq() || this.ati;
    }

    private boolean GC() {
        return !com.iqoption.core.features.instrument.b.Xr() || this.atj;
    }

    private boolean GD() {
        return !com.iqoption.core.features.instrument.b.Xt() || this.ath;
    }

    private boolean GE() {
        return !com.iqoption.core.features.instrument.b.Xs() || this.atk;
    }

    public void GF() {
        if (!this.atg && GD() && GB() && GC() && Gy() && GA() && Gz() && GE()) {
            this.atg = true;
            TabHelper.IM().IQ().Jn();
        }
    }

    public boolean GG() {
        return this.atg;
    }

    public void clear() {
        this.atg = false;
        this.ath = false;
        this.ati = false;
        this.atj = false;
        this.atk = false;
        this.atl = false;
        this.atm = false;
        this.atn = true;
        this.ato = false;
        this.atp = false;
        this.atq = true;
        this.atr = false;
        this.ats = false;
        this.att = true;
        this.asZ = Gt();
        this.atd = ImmutableList.sQ();
        this.ata = Gu();
        this.atb = Gv();
        this.atc = Gw();
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.active.a a(InstrumentType instrumentType, String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.asZ.get(instrumentType);
        if (concurrentHashMap == null) {
            return null;
        }
        for (com.iqoption.core.microservices.tradingengine.response.active.a aVar : concurrentHashMap.values()) {
            if (aVar.agB().equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.active.a a(Integer num, InstrumentType instrumentType) {
        if (!(instrumentType == null || num == null)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.asZ.get(instrumentType);
            if (concurrentHashMap != null) {
                if (InstrumentType.MULTI_INSTRUMENT != instrumentType) {
                    return (com.iqoption.core.microservices.tradingengine.response.active.a) concurrentHashMap.get(num);
                }
                for (com.iqoption.core.microservices.tradingengine.response.active.a aVar : concurrentHashMap.values()) {
                    com.iqoption.core.microservices.tradingengine.response.active.j fa = ((com.iqoption.core.microservices.tradingengine.response.active.j) aVar).fa(num.intValue());
                    if (fa != null) {
                        return fa;
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.active.a c(Integer num) {
        return b(num, InstrumentType.MULTI_INSTRUMENT);
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.active.a b(Integer num, InstrumentType instrumentType) {
        if (!(num == null || instrumentType == null)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.asZ.get(instrumentType);
            if (concurrentHashMap != null) {
                return (com.iqoption.core.microservices.tradingengine.response.active.a) concurrentHashMap.get(num);
            }
        }
        return null;
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.active.a a(String str, InstrumentType instrumentType) {
        if (instrumentType == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.asZ.get(instrumentType);
        if (concurrentHashMap != null) {
            for (com.iqoption.core.microservices.tradingengine.response.active.a aVar : concurrentHashMap.values()) {
                if (ae.equals(str, com.iqoption.core.microservices.tradingengine.response.active.d.B(aVar))) {
                    return aVar;
                }
            }
        }
        return null;
    }

    @Nullable
    public String dU(int i) {
        com.iqoption.core.microservices.tradingengine.response.active.a dX = dX(i);
        return dX != null ? com.iqoption.core.microservices.tradingengine.response.active.d.B(dX) : null;
    }

    public int dV(int i) {
        com.iqoption.core.microservices.tradingengine.response.active.a dX = dX(i);
        return dX != null ? dX.getPrecision() : 6;
    }

    public void a(InstrumentType instrumentType, HashMap<Integer, com.iqoption.core.microservices.tradingengine.response.active.a> hashMap) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.asZ.get(instrumentType);
        if (concurrentHashMap != null) {
            w.a(concurrentHashMap, hashMap, this.atu);
            IQApp.Ex().bd(new d().setValue(instrumentType));
        }
    }

    public void a(InstrumentType instrumentType, int i, int i2) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.asZ.get(instrumentType);
        if (concurrentHashMap != null) {
            com.iqoption.core.microservices.tradingengine.response.active.a aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) concurrentHashMap.get(Integer.valueOf(i));
            if (aVar instanceof com.iqoption.core.microservices.tradingengine.response.active.n) {
                ((com.iqoption.core.microservices.tradingengine.response.active.n) aVar).fb(i2);
            }
            TabHelper.i Jh = TabHelper.IM().Jh();
            if (Jh != null && Jh.Jv() == i && Jh.getInstrumentType() == instrumentType) {
                IQApp.Ex().bd(new c());
            }
            IQApp.Ex().bd(new b(instrumentType.toOptionActiveType()));
        }
    }

    public void a(InstrumentType instrumentType, List<com.iqoption.core.microservices.risks.response.a.a> list) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.asZ.get(instrumentType);
        if (concurrentHashMap != null) {
            TabHelper.i Jh = TabHelper.IM().Jh();
            for (com.iqoption.core.microservices.risks.response.a.a aVar : list) {
                int activeId = aVar.getActiveId();
                if (aVar.ahd() != null) {
                    int intValue = aVar.ahd().intValue();
                    com.iqoption.core.microservices.tradingengine.response.active.a aVar2 = (com.iqoption.core.microservices.tradingengine.response.active.a) concurrentHashMap.get(Integer.valueOf(activeId));
                    if (aVar2 instanceof com.iqoption.core.microservices.tradingengine.response.active.n) {
                        ((com.iqoption.core.microservices.tradingengine.response.active.n) aVar2).fb(intValue);
                    }
                    if (Jh != null && Jh.Jv() == activeId && Jh.getInstrumentType() == instrumentType) {
                        IQApp.Ex().bd(new c());
                    }
                }
            }
            IQApp.Ex().bd(new b(instrumentType.toOptionActiveType()));
        }
    }

    @Nullable
    public InstrumentType dW(int i) {
        com.iqoption.core.microservices.tradingengine.response.active.a dX = dX(i);
        return dX != null ? dX.getInstrumentType() : null;
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.active.a dX(int i) {
        for (Entry value : this.asZ.entrySet()) {
            com.iqoption.core.microservices.tradingengine.response.active.a aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) ((ConcurrentHashMap) value.getValue()).get(Integer.valueOf(i));
            if (aVar != null) {
                return aVar;
            }
        }
        return null;
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.active.a b(@NonNull InstrumentType instrumentType) {
        return (com.iqoption.core.microservices.tradingengine.response.active.a) com.google.common.collect.i.b(((ConcurrentHashMap) this.asZ.get(instrumentType)).values()).d(asV).pN();
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.active.a a(InstrumentType instrumentType, j<com.iqoption.core.microservices.tradingengine.response.active.a> jVar) {
        return (com.iqoption.core.microservices.tradingengine.response.active.a) com.google.common.collect.i.b(((ConcurrentHashMap) this.asZ.get(instrumentType)).values()).d((j) jVar).pN();
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.active.a GH() {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) com.google.common.collect.i.b(((ConcurrentHashMap) this.asZ.get(InstrumentType.CRYPTO_INSTRUMENT)).values()).d(asV).pN();
        if (aVar == null) {
            aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) com.google.common.collect.i.b(((ConcurrentHashMap) this.asZ.get(InstrumentType.FOREX_INSTRUMENT)).values()).d(asV).pN();
        }
        if (aVar == null) {
            aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) com.google.common.collect.i.b(((ConcurrentHashMap) this.asZ.get(InstrumentType.TURBO_INSTRUMENT)).values()).d(asV).pN();
        }
        if (aVar == null) {
            aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) com.google.common.collect.i.b(((ConcurrentHashMap) this.asZ.get(InstrumentType.BINARY_INSTRUMENT)).values()).d(asV).pN();
        }
        if (aVar == null) {
            aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) com.google.common.collect.i.b(((ConcurrentHashMap) this.asZ.get(InstrumentType.DIGITAL_INSTRUMENT)).values()).d(asV).pN();
        }
        if (aVar == null) {
            aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) com.google.common.collect.i.b(((ConcurrentHashMap) this.asZ.get(InstrumentType.CFD_INSTRUMENT)).values()).d(asV).pN();
        }
        if (aVar == null) {
            aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) com.google.common.collect.i.b(((ConcurrentHashMap) this.asZ.get(InstrumentType.FX_INSTRUMENT)).values()).d(asV).pN();
        }
        return aVar == null ? (com.iqoption.core.microservices.tradingengine.response.active.a) com.google.common.collect.i.b(((ConcurrentHashMap) this.asZ.get(InstrumentType.MULTI_INSTRUMENT)).values()).d(asV).pN() : aVar;
    }

    public t<Void> GI() {
        return com.iqoption.core.c.a.biL.c(new -$$Lambda$a$AZ5lzUTmWwgLXzBXMl6rQa2sbDM(this));
    }

    private /* synthetic */ Void GJ() {
        c(InstrumentType.CRYPTO_INSTRUMENT);
        c(InstrumentType.FOREX_INSTRUMENT);
        c(InstrumentType.CFD_INSTRUMENT);
        return null;
    }

    private void c(InstrumentType instrumentType) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("COMMISSION_STORED_");
        stringBuilder.append(instrumentType.getServerValue());
        String ea = ea(stringBuilder.toString());
        if (!TextUtils.isEmpty(ea)) {
            HashMap hashMap = (HashMap) com.iqoption.util.w.aWM().fromJson(ea, new ActiveSettingHelper$1(this).getType());
            if (hashMap != null) {
                ((ConcurrentHashMap) this.atb.get(instrumentType)).putAll(hashMap);
            }
        }
    }

    public boolean d(InstrumentType instrumentType) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("COMMISSION_STORED_");
        stringBuilder.append(instrumentType);
        return eb(stringBuilder.toString());
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.a.a a(InstrumentType instrumentType, Integer num) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.atb.get(instrumentType);
        if (concurrentHashMap == null) {
            return null;
        }
        com.iqoption.core.microservices.tradingengine.response.a.a aVar = (com.iqoption.core.microservices.tradingengine.response.a.a) concurrentHashMap.get(num);
        if (!(aVar == null || aVar.aip())) {
            aVar = null;
        }
        return aVar;
    }

    public void b(InstrumentType instrumentType, HashMap<Integer, com.iqoption.core.microservices.tradingengine.response.a.a> hashMap) {
        if (hashMap != null && instrumentType != null) {
            ((ConcurrentHashMap) this.atb.get(instrumentType)).putAll(hashMap);
            IQApp.Ex().bd(new e().setValue(instrumentType));
            com.iqoption.core.c.a.biL.execute(new -$$Lambda$a$LaIwPDcwfvzb2nK6wPzttnA1bLo(this, instrumentType, hashMap));
        }
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.b.a a(InstrumentType instrumentType, int i) {
        Map map = (Map) this.ata.get(instrumentType);
        if (map == null) {
            return null;
        }
        return (com.iqoption.core.microservices.tradingengine.response.b.a) map.get(Integer.valueOf(i));
    }

    public void b(InstrumentType instrumentType, @Nullable Map<Integer, com.iqoption.core.microservices.tradingengine.response.b.a> map) {
        if (map != null) {
            this.ata.put(instrumentType, map);
        }
        int i = AnonymousClass1.$SwitchMap$com$iqoption$core$data$model$InstrumentType[instrumentType.ordinal()];
        if (i == 1) {
            this.atm = true;
            GF();
        } else if (i == 2) {
            this.atp = true;
            GF();
        } else if (i == 3) {
            this.ats = true;
            GF();
        }
    }

    @Nullable
    public com.iqoption.core.microservices.f.a.a.a a(int i, InstrumentType instrumentType) {
        return (com.iqoption.core.microservices.f.a.a.a) ((Map) this.atc.get(instrumentType)).get(Integer.valueOf(i));
    }

    public Map<Integer, com.iqoption.core.microservices.f.a.a.a> e(InstrumentType instrumentType) {
        return (Map) this.atc.get(instrumentType);
    }

    public void c(InstrumentType instrumentType, @NonNull Map<Integer, com.iqoption.core.microservices.f.a.a.a> map) {
        if (instrumentType != null && instrumentType != InstrumentType.UNKNOWN && map.size() != 0) {
            this.atc.put(instrumentType, map);
        }
    }
}
