package com.iqoption.app.managers.tab;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.google.common.collect.Sets;
import com.google.common.reflect.TypeToken;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.google.gson.annotations.SerializedName;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.data.model.chart.ChartColor;
import com.iqoption.core.gl.ChartWindow;
import com.iqoption.core.util.u;
import com.iqoption.core.util.w;
import com.iqoption.dto.ChartTimeInterval;
import com.iqoption.dto.Event;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.expiration.Expiration;
import com.iqoption.fragment.ah;
import com.iqoption.gl.NativeHandler.p;
import com.iqoption.instruments.strikes.StrikeSelectionMode;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.util.v;
import com.iqoption.x.R;
import io.reactivex.processors.BehaviorProcessor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class TabHelper implements com.iqoption.view.a.b.a {
    private static final String TAG = TabHelper.class.getName();
    public static int awa = -1;
    public static String awb = String.valueOf(awa);
    private static final n<TabHelper> awc = Suppliers.a(-$$Lambda$TabHelper$e86xhECMTp3PlwirzmDiaFEN8n4.INSTANCE);
    public static int awe = 4;
    private static final d awh = new d();
    private final b awd = new b();
    private final SparseArray<i> awf = new SparseArray();
    private volatile int awg = awa;
    private volatile boolean awi = false;
    private final com.iqoption.core.rx.d<Boolean> awj = com.iqoption.core.rx.d.bQ(Boolean.valueOf(false));
    private WeakReference<ah> awk = new WeakReference(null);
    private final com.iqoption.charttools.g awl = new com.iqoption.charttools.g(com.iqoption.gl.c.aIy());
    private final com.iqoption.core.rx.d<com.iqoption.core.microservices.tradingengine.response.active.a> awm = com.iqoption.core.rx.d.akd();
    private io.reactivex.processors.a<Integer> awn = BehaviorProcessor.bmG().bmJ();
    private Map<Integer, c> awo = new ConcurrentHashMap();
    private Map<Integer, h> awp = new ConcurrentHashMap();
    private Map<Integer, g> awq = new ConcurrentHashMap();
    private Map<Integer, f> awr = new ConcurrentHashMap();

    /* renamed from: com.iqoption.app.managers.tab.TabHelper$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] aws = new int[StrikeSelectionMode.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0072 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Missing block: B:29:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.iqoption.instruments.strikes.StrikeSelectionMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            aws = r0;
            r0 = 1;
            r1 = aws;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.iqoption.instruments.strikes.StrikeSelectionMode.MANUALLY;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = aws;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.iqoption.instruments.strikes.StrikeSelectionMode.CLOSEST;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = aws;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.iqoption.instruments.strikes.StrikeSelectionMode.SPOT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = com.iqoption.core.data.model.InstrumentType.values();
            r3 = r3.length;
            r3 = new int[r3];
            $SwitchMap$com$iqoption$core$data$model$InstrumentType = r3;
            r3 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x003d }
            r4 = com.iqoption.core.data.model.InstrumentType.MULTI_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x003d }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x003d }
            r3[r4] = r0;	 Catch:{ NoSuchFieldError -> 0x003d }
        L_0x003d:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r3 = com.iqoption.core.data.model.InstrumentType.CFD_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0047 }
            r0[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0047 }
        L_0x0047:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0051 }
            r1 = com.iqoption.core.data.model.InstrumentType.FOREX_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0051 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0051 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0051 }
        L_0x0051:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x005c }
            r1 = com.iqoption.core.data.model.InstrumentType.CRYPTO_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x005c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x005c }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x005c }
        L_0x005c:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r1 = com.iqoption.core.data.model.InstrumentType.FX_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0067 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0067 }
        L_0x0067:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0072 }
            r1 = com.iqoption.core.data.model.InstrumentType.DIGITAL_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0072 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0072 }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0072 }
        L_0x0072:
            r0 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x007d }
            r1 = com.iqoption.core.data.model.InstrumentType.BINARY_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x007d }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007d }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007d }
        L_0x007d:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.managers.tab.TabHelper$AnonymousClass2.<clinit>():void");
        }
    }

    public static class InitTabsException extends Exception {
        public InitTabsException(Exception exception) {
            super(exception);
        }
    }

    private static class d {
        private int awu;

        private d() {
        }

        /* synthetic */ d(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* Access modifiers changed, original: 0000 */
        public void eg(int i) {
            this.awu = i;
        }

        /* Access modifiers changed, original: 0000 */
        public int Jp() {
            int i = this.awu + 1;
            this.awu = i;
            return i;
        }
    }

    public static class e {
    }

    public static class i {
        @SerializedName("activeId")
        private volatile int activeId;
        @SerializedName("spotSwitcherState")
        private volatile boolean awA;
        private volatile transient boolean awB;
        private volatile transient boolean awC;
        private volatile transient boolean awD;
        public transient com.iqoption.app.managers.feature.d awE;
        private volatile Expiration awF;
        @SerializedName("multiActiveId")
        private volatile int awv;
        @SerializedName("activeExpiration")
        private volatile long aww;
        @SerializedName("digitalExpirationPeriod")
        private volatile long awx;
        @SerializedName("setting")
        private volatile j awy;
        private volatile transient SparseArray<com.iqoption.core.microservices.tradingengine.response.instrument.e> awz;
        @SerializedName("id")
        private volatile int id;
        @SerializedName("instrumentType")
        private volatile InstrumentType instrumentType;
        private volatile transient double rate;

        private static /* synthetic */ void q(Throwable th) {
        }

        public i() {
            this.activeId = 0;
            this.awv = 0;
            this.instrumentType = InstrumentType.TURBO_INSTRUMENT;
            this.aww = 0;
            this.awx = 0;
            this.awy = new j();
            this.awz = new SparseArray();
            this.awB = true;
            this.awE = com.iqoption.app.managers.feature.d.avX.IK();
        }

        public i(int i, int i2, InstrumentType instrumentType, Expiration expiration) {
            this.activeId = 0;
            this.awv = 0;
            this.instrumentType = InstrumentType.TURBO_INSTRUMENT;
            this.aww = 0;
            this.awx = 0;
            this.awy = new j();
            this.awz = new SparseArray();
            this.awB = true;
            this.awE = com.iqoption.app.managers.feature.d.avX.IK();
            this.id = TabHelper.awh.Jp();
            this.activeId = i;
            this.awv = i2;
            this.instrumentType = instrumentType;
            this.awy = new j(instrumentType);
            g(expiration);
            Jq();
        }

        public i(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            this(aVar.getActiveId(), aVar.ahM(), aVar.getInstrumentType(), Expiration.notInitilizedExpiration);
        }

        private /* synthetic */ Boolean JI() {
            return Boolean.valueOf(this.awA ^ 1);
        }

        private void Jq() {
            com.iqoption.app.managers.feature.d dVar = this.instrumentType == InstrumentType.DIGITAL_INSTRUMENT ? new com.iqoption.app.managers.feature.d("do-spot-switcher-instrument", new -$$Lambda$TabHelper$i$UuxeZT4roJm14A99QXl9HSExjQY(this)) : this.instrumentType == InstrumentType.FX_INSTRUMENT ? new com.iqoption.app.managers.feature.d("fx-spot-switcher-instrument", new -$$Lambda$TabHelper$i$T-9NOxsOmAUEjy2fS8kofGarHMo(this)) : this.instrumentType == InstrumentType.MULTI_INSTRUMENT ? com.iqoption.app.managers.feature.d.avX.IL() : com.iqoption.app.managers.feature.d.avX.IK();
            this.awE = dVar;
            JD();
        }

        private /* synthetic */ Boolean JH() {
            return Boolean.valueOf(this.awA ^ 1);
        }

        public boolean Jr() {
            return this.instrumentType == InstrumentType.MULTI_INSTRUMENT;
        }

        @Nullable
        public com.iqoption.core.microservices.tradingengine.response.active.a Js() {
            if (Jr()) {
                return com.iqoption.app.helpers.a.Gs().c(Integer.valueOf(this.awv));
            }
            return com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(this.activeId), this.instrumentType);
        }

        @Nullable
        public com.iqoption.core.microservices.tradingengine.response.active.a Jt() {
            if (!Jr()) {
                return com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(this.activeId), this.instrumentType);
            }
            com.iqoption.core.microservices.tradingengine.response.active.a c = com.iqoption.app.helpers.a.Gs().c(Integer.valueOf(this.awv));
            return c != null ? ((com.iqoption.core.microservices.tradingengine.response.active.j) c).fa(this.activeId) : null;
        }

        public void f(com.iqoption.core.microservices.tradingengine.response.active.a aVar, Expiration expiration) {
            InstrumentType instrumentType = this.instrumentType;
            this.instrumentType = aVar.getInstrumentType();
            this.activeId = aVar.getActiveId();
            this.awv = aVar.ahM();
            Object obj = this.instrumentType != instrumentType ? 1 : null;
            c(null);
            JD();
            if (obj != null) {
                Jq();
            }
            this.awy.a(this.instrumentType, instrumentType);
            g(expiration);
        }

        private void g(Expiration expiration) {
            Object obj = 1;
            if (!this.instrumentType.isOption()) {
                com.iqoption.core.microservices.tradingengine.response.active.a Js = Js();
                if (Js == null || !Js.isExpired()) {
                    obj = null;
                }
            }
            if (obj != null) {
                this.awx = expiration.getDigitalExpirationPeriod();
                this.aww = expiration.expValue.longValue();
                return;
            }
            this.aww = -1;
            this.awx = 0;
        }

        private boolean h(Expiration expiration) {
            return com.google.common.base.f.equal(Long.valueOf(this.aww), expiration.expValue) && com.google.common.base.f.equal(Long.valueOf(this.awx), Long.valueOf(expiration.getDigitalExpirationPeriod()));
        }

        public com.iqoption.mobbtech.connect.response.options.d getOptionKey() {
            return new com.iqoption.mobbtech.connect.response.options.d(Long.valueOf(Jx()), Integer.valueOf(Jv()), this.instrumentType);
        }

        public String Ju() {
            return String.valueOf(this.id);
        }

        public int getId() {
            return this.id;
        }

        public synchronized int Jv() {
            if (Jr()) {
                return this.awv;
            }
            return this.activeId;
        }

        public synchronized int getActiveId() {
            return this.activeId;
        }

        public synchronized InstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        public synchronized Expiration Jw() {
            if (this.awF == null) {
                this.awF = Expiration.createTempObj(this.aww, this.awx * 1000);
            } else {
                this.awF.expValue = Long.valueOf(this.aww);
                this.awF.expInterval = Long.valueOf(this.awx * 1000);
            }
            return this.awF;
        }

        public synchronized long getExpiration() {
            return this.aww;
        }

        public synchronized long Jx() {
            return this.aww > 0 ? this.aww / 1000 : this.aww;
        }

        public synchronized long v(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            long j;
            long c = com.iqoption.app.managers.a.e.Ig().c(aVar, Jw());
            j = 0;
            if (this.aww > 0) {
                j = (this.aww - c) / 1000;
            }
            return j;
        }

        private synchronized void i(Expiration expiration) {
            this.aww = expiration.expValue.longValue();
            this.awx = expiration.getDigitalExpirationPeriod();
            JD();
            c(null);
        }

        public synchronized long Jy() {
            return this.awx;
        }

        public synchronized com.iqoption.core.microservices.tradingengine.response.instrument.e Jz() {
            return (com.iqoption.core.microservices.tradingengine.response.instrument.e) this.awz.get(this.activeId);
        }

        public synchronized void c(com.iqoption.core.microservices.tradingengine.response.instrument.e eVar) {
            if (eVar == null) {
                int groupId = com.iqoption.app.b.aK(IQApp.Eu()).getGroupId();
                for (int i = 0; i < this.awz.size(); i++) {
                    com.iqoption.core.microservices.tradingengine.response.instrument.e eVar2 = (com.iqoption.core.microservices.tradingengine.response.instrument.e) this.awz.valueAt(i);
                    if (eVar2 != null) {
                        com.iqoption.app.managers.c.GS().a(false, eVar2.aiA().getId(), eVar2.getInstrumentType(), groupId);
                        com.iqoption.app.managers.c.GS().a(false, eVar2.aiB().getId(), eVar2.getInstrumentType(), groupId);
                    }
                }
                this.awz.clear();
            } else {
                a(eVar, this.activeId);
            }
        }

        /* JADX WARNING: Missing block: B:17:0x00cb, code skipped:
            return;
     */
        private synchronized void a(com.iqoption.core.microservices.tradingengine.response.instrument.e r7, int r8) {
            /*
            r6 = this;
            monitor-enter(r6);
            r0 = r6.awz;	 Catch:{ all -> 0x00cc }
            r0 = r0.get(r8);	 Catch:{ all -> 0x00cc }
            if (r0 != 0) goto L_0x000d;
        L_0x0009:
            if (r7 != 0) goto L_0x000d;
        L_0x000b:
            monitor-exit(r6);
            return;
        L_0x000d:
            r0 = com.iqoption.app.IQApp.Eu();	 Catch:{ all -> 0x00cc }
            r0 = com.iqoption.app.b.aK(r0);	 Catch:{ all -> 0x00cc }
            r0 = r0.getGroupId();	 Catch:{ all -> 0x00cc }
            r1 = r6.awz;	 Catch:{ all -> 0x00cc }
            r1 = r1.get(r8);	 Catch:{ all -> 0x00cc }
            r1 = (com.iqoption.core.microservices.tradingengine.response.instrument.e) r1;	 Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x004a;
        L_0x0023:
            r2 = com.iqoption.app.managers.c.GS();	 Catch:{ all -> 0x00cc }
            r3 = r1.aiA();	 Catch:{ all -> 0x00cc }
            r3 = r3.getId();	 Catch:{ all -> 0x00cc }
            r4 = r1.getInstrumentType();	 Catch:{ all -> 0x00cc }
            r5 = 0;
            r2.a(r5, r3, r4, r0);	 Catch:{ all -> 0x00cc }
            r2 = com.iqoption.app.managers.c.GS();	 Catch:{ all -> 0x00cc }
            r3 = r1.aiB();	 Catch:{ all -> 0x00cc }
            r3 = r3.getId();	 Catch:{ all -> 0x00cc }
            r4 = r1.getInstrumentType();	 Catch:{ all -> 0x00cc }
            r2.a(r5, r3, r4, r0);	 Catch:{ all -> 0x00cc }
        L_0x004a:
            if (r7 == 0) goto L_0x00ad;
        L_0x004c:
            r2 = com.iqoption.app.managers.c.GS();	 Catch:{ all -> 0x00cc }
            r3 = r7.aiA();	 Catch:{ all -> 0x00cc }
            r3 = r3.getId();	 Catch:{ all -> 0x00cc }
            r4 = r7.getInstrumentType();	 Catch:{ all -> 0x00cc }
            r5 = 1;
            r2.a(r5, r3, r4, r0);	 Catch:{ all -> 0x00cc }
            r2 = com.iqoption.app.managers.c.GS();	 Catch:{ all -> 0x00cc }
            r3 = r7.aiB();	 Catch:{ all -> 0x00cc }
            r3 = r3.getId();	 Catch:{ all -> 0x00cc }
            r4 = r7.getInstrumentType();	 Catch:{ all -> 0x00cc }
            r2.a(r5, r3, r4, r0);	 Catch:{ all -> 0x00cc }
            r0 = r7.getInstrumentType();	 Catch:{ all -> 0x00cc }
            r2 = r7.aiA();	 Catch:{ all -> 0x00cc }
            r2 = r2.getId();	 Catch:{ all -> 0x00cc }
            r3 = r7.aiB();	 Catch:{ all -> 0x00cc }
            r3 = r3.getId();	 Catch:{ all -> 0x00cc }
            r2 = com.google.common.collect.ImmutableList.l(r2, r3);	 Catch:{ all -> 0x00cc }
            r0 = com.iqoption.core.microservices.tradingengine.e.b(r0, r2);	 Catch:{ all -> 0x00cc }
            r2 = com.iqoption.core.rx.i.aki();	 Catch:{ all -> 0x00cc }
            r0 = r0.h(r2);	 Catch:{ all -> 0x00cc }
            r2 = com.iqoption.app.managers.tab.-$$Lambda$TabHelper$i$OAeLnIHd-S6AYKBE1BE3w2ERwSA.INSTANCE;	 Catch:{ all -> 0x00cc }
            r3 = com.iqoption.app.managers.tab.-$$Lambda$TabHelper$i$Fim78togUS3Pf-DBwMKKTHyAgb8.INSTANCE;	 Catch:{ all -> 0x00cc }
            r0.a(r2, r3);	 Catch:{ all -> 0x00cc }
            r0 = com.iqoption.gl.c.aIy();	 Catch:{ all -> 0x00cc }
            r2 = r6.Ju();	 Catch:{ all -> 0x00cc }
            r3 = r7.aiy();	 Catch:{ all -> 0x00cc }
            r0.tabSetSelectedStrike(r2, r3);	 Catch:{ all -> 0x00cc }
        L_0x00ad:
            r0 = r6.awz;	 Catch:{ all -> 0x00cc }
            r0.put(r8, r7);	 Catch:{ all -> 0x00cc }
            r8 = com.google.common.base.f.equal(r1, r7);	 Catch:{ all -> 0x00cc }
            if (r8 != 0) goto L_0x00ca;
        L_0x00b8:
            r8 = com.iqoption.app.IQApp.Ex();	 Catch:{ all -> 0x00cc }
            r0 = new com.iqoption.app.managers.a.e$b;	 Catch:{ all -> 0x00cc }
            r1 = r6.id;	 Catch:{ all -> 0x00cc }
            r0.<init>(r1);	 Catch:{ all -> 0x00cc }
            r7 = r0.setValue(r7);	 Catch:{ all -> 0x00cc }
            r8.bd(r7);	 Catch:{ all -> 0x00cc }
        L_0x00ca:
            monitor-exit(r6);
            return;
        L_0x00cc:
            r7 = move-exception;
            monitor-exit(r6);
            throw r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.managers.tab.TabHelper$i.a(com.iqoption.core.microservices.tradingengine.response.instrument.e, int):void");
        }

        public synchronized void JA() {
            StrikeSelectionMode strikeSelectionMode;
            if (this.awE.IH()) {
                strikeSelectionMode = StrikeSelectionMode.SPOT;
            } else if (this.awB) {
                strikeSelectionMode = StrikeSelectionMode.CLOSEST;
            } else {
                strikeSelectionMode = StrikeSelectionMode.MANUALLY;
            }
            com.iqoption.gl.c.aIy().tabSetStrikesSelectionMode(Ju(), strikeSelectionMode.ordinal());
        }

        public synchronized void a(@NonNull StrikeSelectionMode strikeSelectionMode) {
            int i = AnonymousClass2.aws[strikeSelectionMode.ordinal()];
            if (i == 1) {
                bD(false);
                bC(false);
            } else if (i == 2) {
                bD(false);
                bC(true);
            } else if (i == 3) {
                bD(true);
                bC(true);
            }
        }

        public synchronized void JB() {
            this.awB = false;
        }

        public synchronized void JC() {
            this.awC = false;
        }

        public final synchronized void JD() {
            this.awB = true;
            this.awC = this.awE.IH();
        }

        public synchronized boolean bC(boolean z) {
            if (this.awE.IH()) {
                this.awB = z;
                return bE(z);
            }
            if (this.awB != z) {
                this.awB = z;
            }
            return this.awB;
        }

        public synchronized void bD(boolean z) {
            if (this.awA == z) {
                this.awA = !z;
                if (this.awC != z) {
                    this.awC = z;
                    c(null);
                }
                this.awD = true;
            }
        }

        public synchronized boolean JE() {
            return this.awB;
        }

        public synchronized boolean isSpotStrike() {
            return this.awC;
        }

        private synchronized boolean bE(boolean z) {
            if (this.awC == z) {
                return this.awC;
            }
            this.awC = z;
            IQApp.Ex().bd(new a().setValue(Boolean.valueOf(z)));
            if (!z) {
                c(null);
            }
            return this.awC;
        }

        public j JF() {
            return this.awy;
        }

        public void bF(boolean z) {
            a(Ju(), com.iqoption.gl.c.aIy(), Jt(), z);
        }

        private void a(String str, ChartWindow chartWindow, com.iqoption.core.microservices.tradingengine.response.active.a aVar, boolean z) {
            if (aVar != null) {
                chartWindow.tabSetActiveId(str, aVar.getActiveId());
                chartWindow.tabSetFinanceInstrument(str, aVar.getInstrumentType().getOptionActiveOrInstrumentValue(), z);
                chartWindow.tabSetPrecission(str, aVar.getPrecision());
                chartWindow.tabSetStartTime(str, aVar.getStartTime());
            }
        }

        public void JG() {
            ChartWindow aIy = com.iqoption.gl.c.aIy();
            String Ju = Ju();
            aIy.tabSetHeikinashiEnabled(Ju, this.awy.awI);
            aIy.tabSetAutoScaleEnabled(Ju, this.awy.awJ);
            aIy.tabSetColorPalette(Ju, this.awy.awH ? ChartColor.mono : ChartColor.redGreen);
            aIy.setTimeScaleBarType(Ju, this.awy.awG);
            aIy.tabSetChartTypeAndTimes(Ju, this.awy.chartType, this.awy.candleSize);
        }

        public void aa(int i, int i2) {
            this.awy.chartType = i;
            this.awy.candleSize = i2;
            this.awD = true;
        }

        public void ab(int i, int i2) {
            this.awy.chartType = i;
            this.awy.candleSize = i2;
            this.awD = true;
            com.iqoption.gl.c.aIy().tabSetChartTypeAndTimes(Ju(), this.awy.chartType, this.awy.candleSize);
        }

        public void setChartType(int i) {
            this.awy.chartType = i;
            this.awD = true;
            com.iqoption.gl.c.aIy().tabSetChartTypeAndTimes(Ju(), this.awy.chartType, this.awy.candleSize);
        }

        public void eh(int i) {
            this.awy.candleSize = i;
            this.awD = true;
            com.iqoption.gl.c.aIy().tabSetChartTypeAndTimes(Ju(), this.awy.chartType, this.awy.candleSize);
        }

        public void bG(boolean z) {
            this.awy.awH = z;
            this.awD = true;
            com.iqoption.gl.c.aIy().tabSetColorPalette(Ju(), this.awy.awH ? ChartColor.mono : ChartColor.redGreen);
        }

        public void bH(boolean z) {
            this.awy.awI = z;
            this.awD = true;
            com.iqoption.gl.c.aIy().tabSetHeikinashiEnabled(Ju(), z);
        }

        public void bI(boolean z) {
            this.awy.awJ = z;
            this.awD = true;
            com.iqoption.gl.c.aIy().tabSetAutoScaleEnabled(Ju(), z);
        }

        public void a(String str, @Nullable Number number) {
            if (number != null) {
                if (this.awy.awK == null) {
                    this.awy.awK = new ArrayMap();
                }
                this.awy.awK.put(str, number);
            } else if (this.awy.awK != null) {
                this.awy.awK.remove(str);
            }
        }

        @Nullable
        public Number er(String str) {
            return this.awy.awK != null ? (Number) this.awy.awK.get(str) : null;
        }

        public boolean isUpdate() {
            boolean z = this.awD;
            this.awD = false;
            return z;
        }

        private int getMultiplier() {
            Number number = this.awy.awK != null ? (Number) this.awy.awK.get("tabSetting.multiplier") : null;
            return number != null ? number.intValue() : 1;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tab{id=");
            stringBuilder.append(this.id);
            stringBuilder.append(", activeId=");
            stringBuilder.append(this.activeId);
            stringBuilder.append(", instrumentType='");
            stringBuilder.append(this.instrumentType);
            stringBuilder.append('\'');
            stringBuilder.append(", activeExpiration=");
            stringBuilder.append(this.aww);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public static class j {
        @SerializedName("timeScleBarType")
        public int awG = 1;
        @SerializedName("isMonochromeCandle")
        public boolean awH = false;
        @SerializedName("isHeikenAshi")
        public boolean awI = false;
        @SerializedName("isAutoScaling")
        public boolean awJ = true;
        @SerializedName("numbers")
        Map<String, Number> awK;
        @SerializedName("candleSize")
        public int candleSize = 5;
        @SerializedName("chartType")
        public int chartType = 0;

        public j(InstrumentType instrumentType) {
            m(instrumentType);
            l(instrumentType);
        }

        public void a(InstrumentType instrumentType, InstrumentType instrumentType2) {
            if (instrumentType != instrumentType2) {
                if (com.iqoption.core.ext.c.b((Object) instrumentType, InstrumentType.BINARY_INSTRUMENT, InstrumentType.TURBO_INSTRUMENT)) {
                    if (com.iqoption.core.ext.c.b((Object) instrumentType2, InstrumentType.BINARY_INSTRUMENT, InstrumentType.TURBO_INSTRUMENT)) {
                        return;
                    }
                }
                m(instrumentType);
                l(instrumentType);
            }
        }

        private void l(InstrumentType instrumentType) {
            switch (instrumentType) {
                case MULTI_INSTRUMENT:
                case FX_INSTRUMENT:
                case DIGITAL_INSTRUMENT:
                case BINARY_INSTRUMENT:
                    this.candleSize = 5;
                    return;
                case CFD_INSTRUMENT:
                case FOREX_INSTRUMENT:
                    this.candleSize = 5;
                    return;
                case CRYPTO_INSTRUMENT:
                    this.candleSize = ChartTimeInterval.CANDLE_1D;
                    return;
                default:
                    this.candleSize = 1;
                    return;
            }
        }

        private void m(InstrumentType instrumentType) {
            if (instrumentType != null) {
                if (com.iqoption.core.ext.c.b((Object) instrumentType, InstrumentType.CFD_INSTRUMENT, InstrumentType.FOREX_INSTRUMENT, InstrumentType.CRYPTO_INSTRUMENT)) {
                    this.awG = 2;
                    return;
                }
            }
            this.awG = 1;
        }
    }

    public static class k {
    }

    public class b extends com.iqoption.system.a.d {
        @com.google.common.b.e
        public void onSelectStrikeFromGLEvent(p pVar) {
            com.iqoption.core.c.a.biL.execute(new -$$Lambda$TabHelper$b$VTLsEgaHEBgw1NRjzlQAKW098uI(this, pVar.id, pVar));
        }

        private /* synthetic */ void a(String str, p pVar) {
            i Jh = TabHelper.this.Jh();
            if (Jh != null) {
                int Jv = Jh.Jv();
                InstrumentType instrumentType = Jh.getInstrumentType();
                long expiration = Jh.getExpiration();
                long Jy = Jh.Jy();
                com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(Jv), instrumentType);
                com.iqoption.app.managers.a.c h = com.iqoption.app.managers.a.e.Ig().h(instrumentType);
                if (!(a == null || h == null)) {
                    com.iqoption.core.microservices.tradingengine.response.instrument.e a2 = h.a(instrumentType, a.agB(), Long.valueOf(expiration), str, Long.valueOf(Jy), pVar.bAP);
                    if (a2 != null) {
                        if (!a2.aiD()) {
                            Jh.JB();
                            Jh.JC();
                        }
                        Jh.c(a2);
                        String str2 = "instrument_type";
                        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_choose-strike-right-panel").setParameters(u.anp().o("strike_value", String.valueOf(a2.getValue())).o(str2, a2.getInstrumentType()).anr()).build());
                        str = "show_toast_first_disable_auto_select_strike";
                        if (com.iqoption.app.d.dW(str)) {
                            ah.a((int) R.drawable.local_toast_type_indicator_grey, IQApp.Eu().getString(R.string.auto_selection_is_off_until_the_end_of_expiration), 10000);
                            com.iqoption.app.d.i(str, false);
                        }
                    }
                }
            }
        }

        public void Jn() {
            com.iqoption.core.c.a.biL.execute(new -$$Lambda$TabHelper$b$G3JlsM750Nsn7MFrn8z-TfTlHk0(this));
        }

        private /* synthetic */ void Jo() {
            if (TabHelper.this.Jk()) {
                IQApp.Ex().bd(new e());
            }
        }
    }

    private class c implements o<Expiration> {
        private final com.iqoption.core.microservices.tradingengine.response.active.a anF;
        private final int awt;

        public c(int i, com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            this.awt = i;
            this.anF = aVar;
        }

        /* renamed from: f */
        public void onSuccess(Expiration expiration) {
            i eb = TabHelper.this.eb(this.awt);
            if (eb != null) {
                if (!com.iqoption.app.managers.a.e.Ig().b(this.anF, eb.Jw())) {
                    Iterator it = com.iqoption.app.managers.c.GS().l(this.anF).iterator();
                    if (it.hasNext()) {
                        com.iqoption.mobbtech.connect.response.options.c aQa = ((com.iqoption.mobbtech.connect.response.options.b) it.next()).aQa();
                        Expiration expiration2 = new Expiration(aQa.getExpired() * 1000, aQa.getExpirationPeriod() * 1000);
                        if (com.iqoption.app.managers.a.e.Ig().b(this.anF, expiration2)) {
                            eb.i(expiration2);
                        } else {
                            eb.i(expiration);
                        }
                    } else {
                        eb.i(expiration);
                    }
                }
                TabHelper.this.b(eb);
                TabHelper.this.f(eb);
            }
            TabHelper.this.awo.remove(Integer.valueOf(this.awt));
        }

        public void l(Throwable th) {
            TabHelper.this.awo.remove(Integer.valueOf(this.awt));
        }
    }

    private class f implements o<ConcurrentHashMap<String, com.iqoption.core.microservices.tradingengine.response.instrument.e>> {
        private final int activeId;
        private final int awt;

        public f(int i, int i2) {
            this.awt = i;
            this.activeId = i2;
        }

        /* renamed from: b */
        public void onSuccess(ConcurrentHashMap<String, com.iqoption.core.microservices.tradingengine.response.instrument.e> concurrentHashMap) {
            i eb = TabHelper.this.eb(this.awt);
            if (!(eb == null || w.C(concurrentHashMap) || !eb.Jr())) {
                TabHelper.this.a((ConcurrentHashMap) concurrentHashMap, eb, this.activeId);
            }
            TabHelper.this.awr.remove(Integer.valueOf(this.activeId));
        }

        public void l(Throwable th) {
            TabHelper.this.awr.remove(Integer.valueOf(this.activeId));
        }
    }

    private class g implements o<ConcurrentHashMap<String, com.iqoption.core.microservices.tradingengine.response.instrument.e>> {
        private final int awt;

        public g(int i) {
            this.awt = i;
        }

        /* renamed from: b */
        public void onSuccess(ConcurrentHashMap<String, com.iqoption.core.microservices.tradingengine.response.instrument.e> concurrentHashMap) {
            i eb = TabHelper.this.eb(this.awt);
            if (!(eb == null || w.C(concurrentHashMap) || !eb.isSpotStrike())) {
                TabHelper.this.b((ConcurrentHashMap) concurrentHashMap, eb);
            }
            TabHelper.this.awq.remove(Integer.valueOf(this.awt));
        }

        public void l(Throwable th) {
            TabHelper.this.awq.remove(Integer.valueOf(this.awt));
        }
    }

    private class h implements o<ConcurrentHashMap<String, com.iqoption.core.microservices.tradingengine.response.instrument.e>> {
        private final int awt;

        public h(int i) {
            this.awt = i;
        }

        /* renamed from: b */
        public void onSuccess(ConcurrentHashMap<String, com.iqoption.core.microservices.tradingengine.response.instrument.e> concurrentHashMap) {
            i eb = TabHelper.this.eb(this.awt);
            if (!(eb == null || w.C(concurrentHashMap))) {
                TabHelper.this.a((ConcurrentHashMap) concurrentHashMap, eb);
            }
            TabHelper.this.awp.remove(Integer.valueOf(this.awt));
        }

        public void l(Throwable th) {
            TabHelper.this.awp.remove(Integer.valueOf(this.awt));
        }
    }

    public static class a extends com.iqoption.system.a.c<Boolean> {
    }

    private TabHelper() {
    }

    public static TabHelper IM() {
        return (TabHelper) awc.get();
    }

    @Nullable
    public i eq(String str) {
        Integer bW = com.google.common.primitives.c.bW(str);
        if (bW != null) {
            i iVar = (i) this.awf.get(bW.intValue());
            if (iVar != null && iVar.Ju().equals(str)) {
                return iVar;
            }
        }
        return null;
    }

    public boolean a(i iVar) {
        return this.awg == iVar.id;
    }

    private void bB(boolean z) {
        this.awi = z;
        this.awj.onNext(Boolean.valueOf(z));
    }

    public boolean isInitialized() {
        return this.awi;
    }

    public io.reactivex.e<Boolean> IN() {
        return this.awj.c(com.iqoption.core.rx.i.aki());
    }

    private com.iqoption.core.data.d.b IO() {
        return com.iqoption.core.data.d.b.aH(com.iqoption.app.b.DG().getUserId());
    }

    public io.reactivex.e<com.iqoption.core.microservices.tradingengine.response.active.a> IP() {
        return this.awm;
    }

    public void a(ah ahVar) {
        this.awd.register();
        this.awk = new WeakReference(ahVar);
        com.iqoption.view.a.b.aYv().a((com.iqoption.view.a.b.a) this);
    }

    public b IQ() {
        return this.awd;
    }

    public void onStop() {
        bB(false);
        this.awd.unregister();
        this.awp.clear();
        this.awq.clear();
        this.awo.clear();
        this.awk.clear();
        this.awl.dispose();
        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
        com.iqoption.h.a.aIv();
        com.iqoption.gl.a.aIv();
    }

    public void IR() {
        i Jh = Jh();
        Object obj = (Jh == null || Jh.isUpdate()) ? 1 : null;
        if (obj != null) {
            aq(0);
        }
    }

    public void IS() {
        i Jh = Jh();
        Object obj = (Jh == null || Jh.isUpdate()) ? 1 : null;
        if (obj != null) {
            IT();
        }
    }

    private void IT() {
        aq(500);
    }

    private void aq(long j) {
        ar(j);
    }

    @SuppressLint({"ApplySharedPref"})
    private void ar(long j) {
        com.iqoption.core.c.a.biL.a(new -$$Lambda$TabHelper$KhoHroZfRys_JzC_DeFm4naFHTE(com.iqoption.util.c.c(this.awf)), j, TimeUnit.MILLISECONDS);
    }

    private static /* synthetic */ void F(List list) {
        try {
            IQApp.Eu().getSharedPreferences("tab_pref_name", 0).edit().putString("tab_manager", com.iqoption.util.w.aWL().toJson((Object) list)).commit();
        } catch (Exception unused) {
        }
    }

    private List<i> IU() {
        ArrayList arrayList = new ArrayList();
        try {
            String string = IQApp.Eu().getSharedPreferences("tab_pref_name", 0).getString("tab_manager", null);
            if (!TextUtils.isEmpty(string)) {
                List list = (List) com.iqoption.util.w.aWL().fromJson(string, new TypeToken<List<i>>() {
                }.getType());
                if (list != null) {
                    int i = 0;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        i iVar = (i) list.get(i2);
                        iVar.Jq();
                        if (iVar.Js() != null) {
                            com.iqoption.gl.c.aIy().addTab(iVar.Ju(), (double) iVar.id);
                            iVar.bF(false);
                            iVar.JG();
                            arrayList.add(iVar);
                            i = Math.max(iVar.id, i);
                        }
                    }
                    awh.eg(i);
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public synchronized Set<Pair<Integer, Integer>> IV() {
        HashSet uw;
        uw = Sets.uw();
        SparseArray clone = this.awf.clone();
        for (int i = 0; i < clone.size(); i++) {
            i iVar = (i) clone.valueAt(i);
            if (iVar != null) {
                uw.add(Pair.create(Integer.valueOf(iVar.activeId), Integer.valueOf(iVar.JF().candleSize)));
            }
        }
        return uw;
    }

    public synchronized Set<Pair<Integer, InstrumentType>> IW() {
        HashSet uw;
        uw = Sets.uw();
        SparseArray clone = this.awf.clone();
        for (int i = 0; i < clone.size(); i++) {
            i iVar = (i) clone.valueAt(i);
            if (iVar != null) {
                uw.add(Pair.create(Integer.valueOf(iVar.activeId), i(iVar.instrumentType)));
            }
        }
        return uw;
    }

    private InstrumentType i(InstrumentType instrumentType) {
        if (AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[instrumentType.ordinal()] != 1) {
            return instrumentType;
        }
        return InstrumentType.DIGITAL_INSTRUMENT;
    }

    public int IX() {
        i iVar = (i) this.awf.get(this.awg);
        return iVar != null ? iVar.activeId : 0;
    }

    @NonNull
    public InstrumentType IY() {
        i iVar = (i) this.awf.get(this.awg);
        if (iVar != null) {
            return iVar.instrumentType;
        }
        return InstrumentType.UNKNOWN;
    }

    public boolean a(com.iqoption.mobbtech.connect.response.options.b bVar) {
        i iVar = (i) this.awf.get(this.awg);
        if (iVar == null || bVar.activeId != iVar.Jv()) {
            return false;
        }
        return true;
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.active.a IZ() {
        i iVar = (i) this.awf.get(this.awg);
        return iVar != null ? iVar.Jt() : null;
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.active.a Ja() {
        i iVar = (i) this.awf.get(this.awg);
        return iVar != null ? iVar.Js() : null;
    }

    @Nullable
    public com.iqoption.core.microservices.tradingengine.response.instrument.e Jb() {
        i Jh = Jh();
        if (Jh == null) {
            return null;
        }
        return Jh.Jz();
    }

    public long Jc() {
        i Jh = Jh();
        if (Jh == null) {
            return 0;
        }
        return Jh.Jy();
    }

    public Expiration Jd() {
        i Jh = Jh();
        if (Jh == null) {
            return Expiration.notInitilizedDigitalExpiration;
        }
        return Jh.Jw();
    }

    public long Je() {
        i Jh = Jh();
        if (Jh == null) {
            return 0;
        }
        return Jh.getExpiration();
    }

    public long Jf() {
        i Jh = Jh();
        if (Jh == null) {
            return 0;
        }
        return Jh.Jx();
    }

    @Nullable
    public Expiration Jg() {
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = IM().IZ();
        if (IZ == null) {
            return null;
        }
        Log.d("TEST___", "switch to next expiration");
        return s(IZ);
    }

    private Expiration s(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        if (aVar == null) {
            return null;
        }
        Expiration a = com.iqoption.app.managers.a.e.Ig().a(aVar, Jd());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("current ");
        stringBuilder.append(Jd());
        stringBuilder.append(" ");
        stringBuilder.append(a);
        Log.d("TEST___", stringBuilder.toString());
        e(a);
        return a;
    }

    private void b(i iVar) {
        if (iVar != null) {
            a(iVar, true);
        }
    }

    public void e(Expiration expiration) {
        i Jh = Jh();
        if (Jh != null) {
            Jh.i(expiration);
            a(Jh, true);
            f(Jh);
        }
    }

    private void a(i iVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        if (aVar != null) {
            Expiration Jw = iVar.Jw();
            Expiration a = com.iqoption.app.managers.a.e.Ig().a(aVar, Jw);
            long j = 0;
            if (a.expValue.longValue() <= 0) {
                if (Jw.expInterval != null) {
                    j = Jw.expInterval.longValue() / 1000;
                }
                com.iqoption.core.analytics.a.b.aZL.a((long) aVar.getActiveId(), aVar.instrumentType, j);
            }
            a(iVar, a);
        }
    }

    private void a(i iVar, Expiration expiration) {
        iVar.i(expiration);
        c(iVar);
        f(iVar);
    }

    private void c(i iVar) {
        a(iVar, false);
    }

    private void a(i iVar, boolean z) {
        Log.d("TEST___", "set expiration");
        if (iVar != null && iVar.aww != 0 && iVar.aww != -1) {
            com.iqoption.core.microservices.tradingengine.response.active.a Js = iVar.Js();
            if (Js != null && com.iqoption.util.c.a.z(Js)) {
                if (Js.isExpired()) {
                    com.iqoption.gl.c.aIy().tabSetExpirationTime(iVar.Ju(), (long) ((int) iVar.Jy()), (double) iVar.Jx(), (double) iVar.v(Js));
                    if (z) {
                        com.iqoption.gl.c.aIy().applyAutoSize();
                    }
                } else {
                    com.iqoption.gl.c.aIy().tabSetExpirationTime(iVar.Ju(), 0, 0.0d, 0.0d);
                }
                IQApp.Ex().bd(new com.iqoption.app.managers.a.e.a(iVar.getOptionKey(), iVar.Jw(), iVar.id, iVar.JE()));
            }
        }
    }

    public void onTick(long j) {
        if (isInitialized()) {
            SparseArray clone = this.awf.clone();
            for (int i = 0; i < clone.size(); i++) {
                i iVar = (i) clone.valueAt(i);
                if (!(iVar == null || iVar.aww == -1)) {
                    com.iqoption.core.microservices.tradingengine.response.active.a Js = iVar.Js();
                    if (Js != null && com.iqoption.util.c.a.z(Js)) {
                        if (iVar.aww == 0) {
                            d(iVar);
                        } else {
                            long c = com.iqoption.app.managers.a.e.Ig().c(Js, iVar.Jw());
                            if (j <= iVar.aww - c || j >= iVar.aww || com.iqoption.app.managers.c.GS().b(iVar.getOptionKey())) {
                                if (j > iVar.aww - c) {
                                    a(iVar, Js);
                                }
                                com.iqoption.app.managers.a.e.Ig().q(Js);
                                if (iVar.aww == 0) {
                                    d(iVar);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void d(i iVar) {
        i iVar2 = iVar;
        if (iVar2 != null) {
            com.iqoption.core.microservices.tradingengine.response.active.a Js = iVar.Js();
            Object obj = (Js == null || !Js.isExpired()) ? null : 1;
            if (obj == null) {
                iVar2.aww = -1;
                com.iqoption.gl.c.aIy().tabSetExpirationTime(iVar.Ju(), 0, 0.0d, 0.0d);
                return;
            }
            if (iVar.getExpiration() == 0) {
                com.iqoption.gl.c.aIy().tabSetExpirationTime(iVar.Ju(), 0, 0.0d, 0.0d);
            }
            if (((c) this.awo.get(Integer.valueOf(iVar.id))) == null) {
                Map map = this.awo;
                Integer valueOf = Integer.valueOf(iVar.getId());
                c cVar = new c(iVar.getId(), Js);
                map.put(valueOf, cVar);
                t Hg = com.iqoption.app.managers.c.GS().Hg();
                v.b(com.google.common.util.concurrent.p.b(Hg, com.iqoption.app.managers.a.e.Ig().p(Js)).a(new -$$Lambda$TabHelper$8Nx79BqCwEK1PhDp3zYU1rsmddY(com.iqoption.app.managers.a.e.Ig().p(Js)), com.iqoption.core.c.a.biL), cVar);
            }
        }
    }

    @Nullable
    public i Jh() {
        return isInitialized() ? eb(this.awg) : null;
    }

    public int Ji() {
        if (isInitialized()) {
            return this.awg;
        }
        return awa;
    }

    public String Jj() {
        if (isInitialized()) {
            return String.valueOf(this.awg);
        }
        return awb;
    }

    public i eb(int i) {
        return (i) this.awf.get(i);
    }

    public void d(com.iqoption.core.microservices.tradingengine.response.active.a aVar, Expiration expiration) {
        if (aVar != null && isInitialized()) {
            a(this.awg, aVar, expiration);
        }
    }

    public void t(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        if (aVar != null && isInitialized()) {
            a(this.awg, aVar, Expiration.notInitilizedExpiration);
        }
    }

    private void a(int i, com.iqoption.core.microservices.tradingengine.response.active.a aVar, Expiration expiration) {
        i eb = eb(i);
        a(1, eb, false);
        Object obj = eb.activeId != aVar.getActiveId() ? 1 : null;
        eb.f(aVar, expiration);
        eb.JG();
        eb.bF(true);
        a(0, eb, true);
        if (obj != null) {
            ee(eb.getId());
        }
        e(eb);
        ah ahVar = (ah) this.awk.get();
        if (!(ahVar == null || ahVar.cXu == null)) {
            ahVar.cXu.efn.aYe();
        }
        IT();
        this.awn.onNext(Integer.valueOf(getTabsCount()));
    }

    public void ec(int i) {
        i Jh = Jh();
        if (Jh != null && Jh.Jr() && Jh.activeId != i) {
            Jh.activeId = i;
            Jh.bF(true);
            ee(Jh.getId());
            e(Jh);
            WebSocketHandler.a(WebSocketHandler.aTn());
            ah ahVar = (ah) this.awk.get();
            if (!(ahVar == null || ahVar.cXu == null)) {
                ahVar.cXu.efn.aYe();
            }
            IT();
            this.awn.onNext(Integer.valueOf(getTabsCount()));
        }
    }

    private void E(List<i> list) {
        for (i iVar : list) {
            a(1, iVar, false);
            a(0, iVar, false);
            this.awf.put(iVar.getId(), iVar);
        }
        this.awn.onNext(Integer.valueOf(getTabsCount()));
        WebSocketHandler.a(WebSocketHandler.aTn());
        ah ahVar = (ah) this.awk.get();
        if (ahVar != null && ahVar.cXu != null) {
            ahVar.cXu.efn.bz(list);
        }
    }

    /* JADX WARNING: Missing block: B:16:0x0065, code skipped:
            return;
     */
    public synchronized void b(com.iqoption.app.managers.tab.TabHelper.i r5, boolean r6) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.isInitialized();	 Catch:{ all -> 0x0066 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r4);
        return;
    L_0x0009:
        r0 = awe;	 Catch:{ all -> 0x0066 }
        r1 = r4.getTabsCount();	 Catch:{ all -> 0x0066 }
        if (r0 <= r1) goto L_0x0064;
    L_0x0011:
        r0 = r5.Ju();	 Catch:{ all -> 0x0066 }
        r1 = com.iqoption.gl.c.aIy();	 Catch:{ all -> 0x0066 }
        r2 = r5.id;	 Catch:{ all -> 0x0066 }
        r2 = (double) r2;	 Catch:{ all -> 0x0066 }
        r1.addTab(r0, r2);	 Catch:{ all -> 0x0066 }
        r1 = com.iqoption.gl.c.aIy();	 Catch:{ all -> 0x0066 }
        r1.setActiveTab(r0);	 Catch:{ all -> 0x0066 }
        r0 = r4.awf;	 Catch:{ all -> 0x0066 }
        r1 = r5.id;	 Catch:{ all -> 0x0066 }
        r0.put(r1, r5);	 Catch:{ all -> 0x0066 }
        r5.JG();	 Catch:{ all -> 0x0066 }
        r0 = 1;
        r5.bF(r0);	 Catch:{ all -> 0x0066 }
        r4.e(r5);	 Catch:{ all -> 0x0066 }
        r0 = 0;
        r4.a(r0, r5);	 Catch:{ all -> 0x0066 }
        r0 = r4.awk;	 Catch:{ all -> 0x0066 }
        r0 = r0.get();	 Catch:{ all -> 0x0066 }
        r0 = (com.iqoption.fragment.ah) r0;	 Catch:{ all -> 0x0066 }
        if (r0 == 0) goto L_0x0054;
    L_0x0049:
        r1 = r0.cXu;	 Catch:{ all -> 0x0066 }
        if (r1 == 0) goto L_0x0054;
    L_0x004d:
        r0 = r0.cXu;	 Catch:{ all -> 0x0066 }
        r0 = r0.efn;	 Catch:{ all -> 0x0066 }
        r0.c(r5, r6);	 Catch:{ all -> 0x0066 }
    L_0x0054:
        r5 = r4.awn;	 Catch:{ all -> 0x0066 }
        r6 = r4.getTabsCount();	 Catch:{ all -> 0x0066 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x0066 }
        r5.onNext(r6);	 Catch:{ all -> 0x0066 }
        r4.IT();	 Catch:{ all -> 0x0066 }
    L_0x0064:
        monitor-exit(r4);
        return;
    L_0x0066:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.managers.tab.TabHelper.b(com.iqoption.app.managers.tab.TabHelper$i, boolean):void");
    }

    public synchronized int j(@NonNull InstrumentType instrumentType) {
        int i;
        SparseArray clone = this.awf.clone();
        int size = clone.size();
        i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = (i) clone.valueAt(i2);
            if (iVar != null && iVar.getInstrumentType() == instrumentType) {
                i++;
            }
        }
        return i;
    }

    public synchronized int getTabsCount() {
        return this.awf.size();
    }

    /* JADX WARNING: Missing block: B:16:0x0050, code skipped:
            return;
     */
    public synchronized void ed(int r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.isInitialized();	 Catch:{ all -> 0x0051 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r4);
        return;
    L_0x0009:
        r0 = r4.eb(r5);	 Catch:{ all -> 0x0051 }
        if (r0 == 0) goto L_0x004f;
    L_0x000f:
        r1 = r0.getId();	 Catch:{ all -> 0x0051 }
        r2 = r0.Ju();	 Catch:{ all -> 0x0051 }
        r3 = r4.awf;	 Catch:{ all -> 0x0051 }
        r3.remove(r1);	 Catch:{ all -> 0x0051 }
        r3 = 1;
        r4.a(r3, r0);	 Catch:{ all -> 0x0051 }
        r4.ee(r1);	 Catch:{ all -> 0x0051 }
        r0 = com.iqoption.gl.c.aIy();	 Catch:{ all -> 0x0051 }
        r0.removeTab(r2);	 Catch:{ all -> 0x0051 }
        r0 = r4.awk;	 Catch:{ all -> 0x0051 }
        r0 = r0.get();	 Catch:{ all -> 0x0051 }
        r0 = (com.iqoption.fragment.ah) r0;	 Catch:{ all -> 0x0051 }
        if (r0 == 0) goto L_0x003f;
    L_0x0034:
        r1 = r0.cXu;	 Catch:{ all -> 0x0051 }
        if (r1 == 0) goto L_0x003f;
    L_0x0038:
        r0 = r0.cXu;	 Catch:{ all -> 0x0051 }
        r0 = r0.efn;	 Catch:{ all -> 0x0051 }
        r0.hI(r5);	 Catch:{ all -> 0x0051 }
    L_0x003f:
        r5 = r4.awn;	 Catch:{ all -> 0x0051 }
        r0 = r4.getTabsCount();	 Catch:{ all -> 0x0051 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x0051 }
        r5.onNext(r0);	 Catch:{ all -> 0x0051 }
        r4.IT();	 Catch:{ all -> 0x0051 }
    L_0x004f:
        monitor-exit(r4);
        return;
    L_0x0051:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.managers.tab.TabHelper.ed(int):void");
    }

    private void ee(int i) {
        String valueOf = String.valueOf(i);
        com.iqoption.charttools.f.aCQ.eA(valueOf).b(com.iqoption.core.rx.i.akl()).bkN();
        this.awl.removeTab(valueOf);
    }

    /* JADX WARNING: Missing block: B:15:0x0037, code skipped:
            return;
     */
    public synchronized void ef(int r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.isInitialized();	 Catch:{ all -> 0x0038 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r2);
        return;
    L_0x0009:
        r0 = r2.awf;	 Catch:{ all -> 0x0038 }
        r0 = r0.get(r3);	 Catch:{ all -> 0x0038 }
        r0 = (com.iqoption.app.managers.tab.TabHelper.i) r0;	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x0036;
    L_0x0013:
        r2.e(r0);	 Catch:{ all -> 0x0038 }
        r1 = com.iqoption.gl.c.aIy();	 Catch:{ all -> 0x0038 }
        r0 = r0.Ju();	 Catch:{ all -> 0x0038 }
        r1.setActiveTab(r0);	 Catch:{ all -> 0x0038 }
        r0 = r2.awk;	 Catch:{ all -> 0x0038 }
        r0 = r0.get();	 Catch:{ all -> 0x0038 }
        r0 = (com.iqoption.fragment.ah) r0;	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x0036;
    L_0x002b:
        r1 = r0.cXu;	 Catch:{ all -> 0x0038 }
        if (r1 == 0) goto L_0x0036;
    L_0x002f:
        r0 = r0.cXu;	 Catch:{ all -> 0x0038 }
        r0 = r0.efn;	 Catch:{ all -> 0x0038 }
        r0.hH(r3);	 Catch:{ all -> 0x0038 }
    L_0x0036:
        monitor-exit(r2);
        return;
    L_0x0038:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.managers.tab.TabHelper.ef(int):void");
    }

    private void a(int i, i iVar) {
        a(i, iVar, true);
    }

    private void a(int i, i iVar, boolean z) {
        if (iVar != null) {
            if (com.iqoption.core.ext.c.b(iVar.getInstrumentType(), InstrumentType.DIGITAL_INSTRUMENT, InstrumentType.FX_INSTRUMENT, InstrumentType.MULTI_INSTRUMENT)) {
                com.iqoption.core.microservices.tradingengine.response.active.j jVar = (com.iqoption.core.microservices.tradingengine.response.active.j) iVar.Js();
                if (jVar != null) {
                    Object obj = InstrumentType.FX_INSTRUMENT == iVar.instrumentType ? 1 : null;
                    String str = obj != null ? "instruments-quotes-fx-option" : null;
                    int groupId = com.iqoption.app.b.DG().getGroupId();
                    HashMap hashMap = new HashMap();
                    hashMap.put("user_group_id", Integer.valueOf(groupId));
                    hashMap.put("type", jVar.getInstrumentType());
                    hashMap.put("underlying", jVar.agB());
                    if (i == 0) {
                        com.iqoption.app.managers.j.a(true, hashMap, str);
                        if (obj != null) {
                            com.iqoption.app.managers.j.a(true, InstrumentType.FX_INSTRUMENT);
                        }
                    } else if (i == 1) {
                        com.iqoption.app.managers.j.a(false, hashMap, str);
                        iVar.c(null);
                        if (obj != null) {
                            com.iqoption.app.managers.j.a(false, InstrumentType.FX_INSTRUMENT);
                        }
                    }
                }
            }
            if (z) {
                WebSocketHandler.a(WebSocketHandler.aTn());
            }
        }
    }

    public i e(com.iqoption.core.microservices.tradingengine.response.active.a aVar, Expiration expiration) {
        return b(aVar, expiration, false);
    }

    public i a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, boolean z) {
        return b(aVar, Expiration.notInitilizedExpiration, z);
    }

    public i u(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return a(aVar, false);
    }

    @Nullable
    public i k(@NonNull InstrumentType instrumentType) {
        SparseArray clone = this.awf.clone();
        int size = clone.size();
        for (int i = 0; i < size; i++) {
            i iVar = (i) clone.valueAt(i);
            if (instrumentType.equals(iVar.getInstrumentType()) && com.iqoption.util.c.a.z(com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(iVar.Jv()), instrumentType))) {
                ef(iVar.id);
                return iVar;
            }
        }
        com.iqoption.core.microservices.tradingengine.response.active.a b = com.iqoption.app.helpers.a.Gs().b(instrumentType);
        return b != null ? u(b) : null;
    }

    /* JADX WARNING: Missing block: B:20:0x003b, code skipped:
            return r3;
     */
    private synchronized com.iqoption.app.managers.tab.TabHelper.i b(com.iqoption.core.microservices.tradingengine.response.active.a r13, com.iqoption.dto.entity.expiration.Expiration r14, boolean r15) {
        /*
        r12 = this;
        monitor-enter(r12);
        r0 = r12.isInitialized();	 Catch:{ all -> 0x015e }
        if (r0 != 0) goto L_0x000a;
    L_0x0007:
        r13 = 0;
        monitor-exit(r12);
        return r13;
    L_0x000a:
        r0 = r13.getActiveId();	 Catch:{ all -> 0x015e }
        r1 = r13.ahM();	 Catch:{ all -> 0x015e }
        r2 = r13.getInstrumentType();	 Catch:{ all -> 0x015e }
        r3 = r12.Jh();	 Catch:{ all -> 0x015e }
        r4 = 0;
        if (r3 == 0) goto L_0x003c;
    L_0x001e:
        r6 = r3.getActiveId();	 Catch:{ all -> 0x015e }
        if (r6 != r0) goto L_0x003c;
    L_0x0024:
        r6 = r3.getInstrumentType();	 Catch:{ all -> 0x015e }
        if (r6 != r2) goto L_0x003c;
    L_0x002a:
        r6 = r3.h(r14);	 Catch:{ all -> 0x015e }
        if (r6 != 0) goto L_0x003a;
    L_0x0030:
        r6 = r14.expValue;	 Catch:{ all -> 0x015e }
        r6 = r6.longValue();	 Catch:{ all -> 0x015e }
        r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r8 != 0) goto L_0x003c;
    L_0x003a:
        monitor-exit(r12);
        return r3;
    L_0x003c:
        r6 = 0;
        r7 = 0;
    L_0x003e:
        r8 = r12.awf;	 Catch:{ all -> 0x015e }
        r8 = r8.size();	 Catch:{ all -> 0x015e }
        if (r7 >= r8) goto L_0x0080;
    L_0x0046:
        r8 = r12.awf;	 Catch:{ all -> 0x015e }
        r8 = r8.valueAt(r7);	 Catch:{ all -> 0x015e }
        r8 = (com.iqoption.app.managers.tab.TabHelper.i) r8;	 Catch:{ all -> 0x015e }
        if (r8 == 0) goto L_0x007d;
    L_0x0050:
        r9 = r8.getId();	 Catch:{ all -> 0x015e }
        r10 = r12.awg;	 Catch:{ all -> 0x015e }
        if (r9 == r10) goto L_0x007d;
    L_0x0058:
        r9 = r8.getActiveId();	 Catch:{ all -> 0x015e }
        if (r9 != r0) goto L_0x007d;
    L_0x005e:
        r9 = r8.getInstrumentType();	 Catch:{ all -> 0x015e }
        if (r9 != r2) goto L_0x007d;
    L_0x0064:
        r9 = r8.h(r14);	 Catch:{ all -> 0x015e }
        if (r9 != 0) goto L_0x0074;
    L_0x006a:
        r9 = r14.expValue;	 Catch:{ all -> 0x015e }
        r9 = r9.longValue();	 Catch:{ all -> 0x015e }
        r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
        if (r11 != 0) goto L_0x007d;
    L_0x0074:
        r13 = r8.id;	 Catch:{ all -> 0x015e }
        r12.ef(r13);	 Catch:{ all -> 0x015e }
        monitor-exit(r12);
        return r8;
    L_0x007d:
        r7 = r7 + 1;
        goto L_0x003e;
    L_0x0080:
        if (r3 == 0) goto L_0x00a1;
    L_0x0082:
        r4 = r3.getActiveId();	 Catch:{ all -> 0x015e }
        if (r4 != r0) goto L_0x00a1;
    L_0x0088:
        r4 = r3.getInstrumentType();	 Catch:{ all -> 0x015e }
        if (r4 != r2) goto L_0x00a1;
    L_0x008e:
        r4 = com.iqoption.app.managers.c.GS();	 Catch:{ all -> 0x015e }
        r5 = r3.getOptionKey();	 Catch:{ all -> 0x015e }
        r4 = r4.b(r5);	 Catch:{ all -> 0x015e }
        if (r4 == 0) goto L_0x00a1;
    L_0x009c:
        r12.e(r14);	 Catch:{ all -> 0x015e }
        monitor-exit(r12);
        return r3;
    L_0x00a1:
        r3 = 0;
    L_0x00a2:
        r4 = r12.awf;	 Catch:{ all -> 0x015e }
        r4 = r4.size();	 Catch:{ all -> 0x015e }
        if (r3 >= r4) goto L_0x00e5;
    L_0x00aa:
        r4 = r12.awf;	 Catch:{ all -> 0x015e }
        r4 = r4.valueAt(r3);	 Catch:{ all -> 0x015e }
        r4 = (com.iqoption.app.managers.tab.TabHelper.i) r4;	 Catch:{ all -> 0x015e }
        if (r4 == 0) goto L_0x00e2;
    L_0x00b4:
        r5 = r4.getActiveId();	 Catch:{ all -> 0x015e }
        if (r5 != r0) goto L_0x00e2;
    L_0x00ba:
        r5 = r4.getInstrumentType();	 Catch:{ all -> 0x015e }
        if (r5 != r2) goto L_0x00e2;
    L_0x00c0:
        r5 = r4.getId();	 Catch:{ all -> 0x015e }
        r7 = r12.awg;	 Catch:{ all -> 0x015e }
        if (r5 == r7) goto L_0x00e2;
    L_0x00c8:
        r5 = com.iqoption.app.managers.c.GS();	 Catch:{ all -> 0x015e }
        r7 = r4.getOptionKey();	 Catch:{ all -> 0x015e }
        r5 = r5.b(r7);	 Catch:{ all -> 0x015e }
        if (r5 == 0) goto L_0x00e2;
    L_0x00d6:
        r4.i(r14);	 Catch:{ all -> 0x015e }
        r13 = r4.id;	 Catch:{ all -> 0x015e }
        r12.ef(r13);	 Catch:{ all -> 0x015e }
        monitor-exit(r12);
        return r4;
    L_0x00e2:
        r3 = r3 + 1;
        goto L_0x00a2;
    L_0x00e5:
        r3 = r12.getTabsCount();	 Catch:{ all -> 0x015e }
        r4 = awe;	 Catch:{ all -> 0x015e }
        if (r3 >= r4) goto L_0x00f7;
    L_0x00ed:
        r13 = new com.iqoption.app.managers.tab.TabHelper$i;	 Catch:{ all -> 0x015e }
        r13.<init>(r0, r1, r2, r14);	 Catch:{ all -> 0x015e }
        r12.b(r13, r15);	 Catch:{ all -> 0x015e }
        monitor-exit(r12);
        return r13;
    L_0x00f7:
        r15 = 0;
    L_0x00f8:
        r1 = r12.awf;	 Catch:{ all -> 0x015e }
        r1 = r1.size();	 Catch:{ all -> 0x015e }
        if (r15 >= r1) goto L_0x0139;
    L_0x0100:
        r1 = r12.awf;	 Catch:{ all -> 0x015e }
        r1 = r1.valueAt(r15);	 Catch:{ all -> 0x015e }
        r1 = (com.iqoption.app.managers.tab.TabHelper.i) r1;	 Catch:{ all -> 0x015e }
        if (r1 == 0) goto L_0x0136;
    L_0x010a:
        r2 = r1.getActiveId();	 Catch:{ all -> 0x015e }
        if (r2 != r0) goto L_0x0136;
    L_0x0110:
        r2 = r1.getId();	 Catch:{ all -> 0x015e }
        r3 = r12.awg;	 Catch:{ all -> 0x015e }
        if (r2 == r3) goto L_0x0136;
    L_0x0118:
        r2 = com.iqoption.app.managers.c.GS();	 Catch:{ all -> 0x015e }
        r3 = r1.getOptionKey();	 Catch:{ all -> 0x015e }
        r2 = r2.b(r3);	 Catch:{ all -> 0x015e }
        if (r2 == 0) goto L_0x0136;
    L_0x0126:
        r15 = r1.id;	 Catch:{ all -> 0x015e }
        r12.a(r15, r13, r14);	 Catch:{ all -> 0x015e }
        r13 = r1.id;	 Catch:{ all -> 0x015e }
        r12.ef(r13);	 Catch:{ all -> 0x015e }
        monitor-exit(r12);
        return r1;
    L_0x0136:
        r15 = r15 + 1;
        goto L_0x00f8;
    L_0x0139:
        r15 = r12.awg;	 Catch:{ all -> 0x015e }
        r0 = awa;	 Catch:{ all -> 0x015e }
        if (r15 != r0) goto L_0x0153;
    L_0x013f:
        r15 = r12.awf;	 Catch:{ all -> 0x015e }
        r0 = r12.awf;	 Catch:{ all -> 0x015e }
        r0 = r0.keyAt(r6);	 Catch:{ all -> 0x015e }
        r15 = r15.get(r0);	 Catch:{ all -> 0x015e }
        r15 = (com.iqoption.app.managers.tab.TabHelper.i) r15;	 Catch:{ all -> 0x015e }
        r15 = r15.id;	 Catch:{ all -> 0x015e }
        r12.awg = r15;	 Catch:{ all -> 0x015e }
    L_0x0153:
        r12.d(r13, r14);	 Catch:{ all -> 0x015e }
        r13 = r12.awg;	 Catch:{ all -> 0x015e }
        r13 = r12.eb(r13);	 Catch:{ all -> 0x015e }
        monitor-exit(r12);
        return r13;
    L_0x015e:
        r13 = move-exception;
        monitor-exit(r12);
        goto L_0x0162;
    L_0x0161:
        throw r13;
    L_0x0162:
        goto L_0x0161;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.managers.tab.TabHelper.b(com.iqoption.core.microservices.tradingengine.response.active.a, com.iqoption.dto.entity.expiration.Expiration, boolean):com.iqoption.app.managers.tab.TabHelper$i");
    }

    private void e(i iVar) {
        com.iqoption.core.microservices.tradingengine.response.active.a Jt = iVar.Jt();
        if (Jt != null) {
            this.awg = iVar.id;
            com.iqoption.core.data.d.b IO = IO();
            IO.eI(Jt.getActiveId());
            IO.D(Jt.getInstrumentType());
            this.awm.onNext(Jt);
            IQApp.Ex().bd(new k());
            this.awl.eH(String.valueOf(this.awg));
            d(iVar);
            IQApp.Ex().bd(new com.iqoption.app.managers.a.e.b(iVar.id).setValue(iVar.Jz()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cf A:{Catch:{ Exception -> 0x010a }} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ce A:{Catch:{ Exception -> 0x010a }} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0156 A:{Catch:{ Exception -> 0x017b }} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0173 A:{Catch:{ Exception -> 0x017b }} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0160 A:{Catch:{ Exception -> 0x017b }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x010e */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(1:4)|5|(3:10|11|(5:13|14|(6:16|17|(2:19|(1:21)(3:22|(2:25|61)(2:26|(2:28|62)(4:29|(1:31)|32|60))|33))|23|(0)(0)|33)|59|34))|36|37|(1:40)|(1:44)|(1:48)|(1:50)|(3:52|57|58)(2:53|54)) */
    @androidx.annotation.WorkerThread
    private boolean Jk() {
        /*
        r19 = this;
        r1 = r19;
        com.iqoption.core.gl.ChartLibrary.await();
        r0 = com.iqoption.gl.c.aIy();
        r0.removeAllTabs();
        r2 = 0;
        r1.bB(r2);
        r0 = r1.awf;
        r0.clear();
        r0 = r1.awn;
        r3 = java.lang.Integer.valueOf(r2);
        r0.onNext(r3);
        r0 = awa;
        r1.awg = r0;
        r0 = r19.IU();	 Catch:{ Exception -> 0x017b }
        r3 = com.iqoption.app.managers.feature.c.Iw();	 Catch:{ Exception -> 0x017b }
        r4 = com.iqoption.app.d.Fa();	 Catch:{ Exception -> 0x017b }
        r5 = r19.IO();	 Catch:{ Exception -> 0x017b }
        r6 = r5.Wu();	 Catch:{ Exception -> 0x017b }
        if (r6 != 0) goto L_0x003c;
    L_0x0038:
        r6 = r4.getInstrumentType();	 Catch:{ Exception -> 0x017b }
    L_0x003c:
        r4 = r5.Wt();	 Catch:{ Exception -> 0x017b }
        r5 = "default-tabs";
        r5 = r3.ei(r5);	 Catch:{ Exception -> 0x017b }
        r7 = r0.isEmpty();	 Catch:{ Exception -> 0x017b }
        if (r7 == 0) goto L_0x010e;
    L_0x004c:
        if (r5 == 0) goto L_0x010e;
    L_0x004e:
        r7 = "disabled";
        r8 = r5.getStatus();	 Catch:{ Exception -> 0x017b }
        r7 = r7.equalsIgnoreCase(r8);	 Catch:{ Exception -> 0x017b }
        if (r7 != 0) goto L_0x010e;
    L_0x005a:
        r7 = com.iqoption.util.w.aWM();	 Catch:{ Exception -> 0x010e }
        r5 = r5.ady();	 Catch:{ Exception -> 0x010e }
        r8 = com.iqoption.core.features.instrument.DefaultTabsList.class;
        r5 = r7.fromJson(r5, r8);	 Catch:{ Exception -> 0x010e }
        r10 = r5;
        r10 = (java.util.List) r10;	 Catch:{ Exception -> 0x010e }
        r5 = com.iqoption.util.g.isEmpty(r10);	 Catch:{ Exception -> 0x010e }
        if (r5 != 0) goto L_0x010e;
    L_0x0071:
        r5 = "intraday-forex";
        r11 = r3.ej(r5);	 Catch:{ Exception -> 0x010e }
        r12 = com.iqoption.app.helpers.a.Gs();	 Catch:{ Exception -> 0x010e }
        r3 = awe;	 Catch:{ Exception -> 0x010e }
        r5 = r10.size();	 Catch:{ Exception -> 0x010e }
        r13 = java.lang.Math.min(r3, r5);	 Catch:{ Exception -> 0x010e }
        r3 = com.iqoption.app.managers.l.HZ();	 Catch:{ Exception -> 0x010e }
        r14 = r3.Ib();	 Catch:{ Exception -> 0x010e }
        r17 = r4;
        r16 = r6;
        r8 = 0;
    L_0x0092:
        if (r8 >= r13) goto L_0x010a;
    L_0x0094:
        r3 = r10.get(r8);	 Catch:{ Exception -> 0x010a }
        r3 = (com.iqoption.core.features.instrument.a) r3;	 Catch:{ Exception -> 0x010a }
        r4 = r3.Bs();	 Catch:{ Exception -> 0x010a }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ Exception -> 0x010a }
        r5 = r3.getInstrumentType();	 Catch:{ Exception -> 0x010a }
        r4 = r12.a(r4, r5);	 Catch:{ Exception -> 0x010a }
        if (r4 == 0) goto L_0x00b6;
    L_0x00ac:
        r5 = r4.aX(r14);	 Catch:{ Exception -> 0x010a }
        if (r5 != 0) goto L_0x00b3;
    L_0x00b2:
        goto L_0x00b6;
    L_0x00b3:
        r18 = r8;
        goto L_0x00cc;
    L_0x00b6:
        r7 = r3.getInstrumentType();	 Catch:{ Exception -> 0x010a }
        r6 = new com.iqoption.app.managers.tab.-$$Lambda$TabHelper$wi52GPlOCg47NMg0q6UOzbI14kY;	 Catch:{ Exception -> 0x010a }
        r3 = r6;
        r4 = r14;
        r2 = r6;
        r6 = r0;
        r9 = r7;
        r7 = r10;
        r18 = r8;
        r8 = r11;
        r3.<init>(r4, r6, r7, r8);	 Catch:{ Exception -> 0x010a }
        r4 = r12.a(r9, r2);	 Catch:{ Exception -> 0x010a }
    L_0x00cc:
        if (r4 != 0) goto L_0x00cf;
    L_0x00ce:
        goto L_0x0106;
    L_0x00cf:
        r2 = r4.getInstrumentType();	 Catch:{ Exception -> 0x010a }
        r3 = com.iqoption.core.data.model.InstrumentType.MULTI_INSTRUMENT;	 Catch:{ Exception -> 0x010a }
        if (r2 != r3) goto L_0x00d8;
    L_0x00d7:
        goto L_0x0106;
    L_0x00d8:
        r2 = r0.size();	 Catch:{ Exception -> 0x010a }
        if (r2 != 0) goto L_0x00e6;
    L_0x00de:
        r16 = r4.getInstrumentType();	 Catch:{ Exception -> 0x010a }
        r17 = r4.getActiveId();	 Catch:{ Exception -> 0x010a }
    L_0x00e6:
        r2 = new com.iqoption.app.managers.tab.TabHelper$i;	 Catch:{ Exception -> 0x010a }
        r2.<init>(r4);	 Catch:{ Exception -> 0x010a }
        r3 = com.iqoption.gl.c.aIy();	 Catch:{ Exception -> 0x010a }
        r4 = r2.Ju();	 Catch:{ Exception -> 0x010a }
        r5 = r2.id;	 Catch:{ Exception -> 0x010a }
        r5 = (double) r5;	 Catch:{ Exception -> 0x010a }
        r3.addTab(r4, r5);	 Catch:{ Exception -> 0x010a }
        r3 = 1;
        r2.bF(r3);	 Catch:{ Exception -> 0x010a }
        r2.JG();	 Catch:{ Exception -> 0x010a }
        r3 = 0;
        r0.add(r3, r2);	 Catch:{ Exception -> 0x010a }
    L_0x0106:
        r8 = r18 + 1;
        r2 = 0;
        goto L_0x0092;
    L_0x010a:
        r6 = r16;
        r4 = r17;
    L_0x010e:
        r2 = com.iqoption.app.helpers.a.Gs();	 Catch:{ Exception -> 0x017b }
        r3 = java.lang.Integer.valueOf(r4);	 Catch:{ Exception -> 0x017b }
        r2 = r2.a(r3, r6);	 Catch:{ Exception -> 0x017b }
        if (r2 != 0) goto L_0x0126;
    L_0x011c:
        if (r6 == 0) goto L_0x0126;
    L_0x011e:
        r2 = com.iqoption.app.helpers.a.Gs();	 Catch:{ Exception -> 0x017b }
        r2 = r2.b(r6);	 Catch:{ Exception -> 0x017b }
    L_0x0126:
        if (r2 != 0) goto L_0x013d;
    L_0x0128:
        r3 = com.iqoption.core.features.instrument.b.Xr();	 Catch:{ Exception -> 0x017b }
        if (r3 == 0) goto L_0x013d;
    L_0x012e:
        r2 = com.iqoption.app.helpers.a.Gs();	 Catch:{ Exception -> 0x017b }
        r3 = 1;
        r4 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x017b }
        r3 = com.iqoption.core.data.model.InstrumentType.DIGITAL_INSTRUMENT;	 Catch:{ Exception -> 0x017b }
        r2 = r2.a(r4, r3);	 Catch:{ Exception -> 0x017b }
    L_0x013d:
        if (r2 != 0) goto L_0x0154;
    L_0x013f:
        r3 = com.iqoption.core.features.instrument.b.Xt();	 Catch:{ Exception -> 0x017b }
        if (r3 == 0) goto L_0x0154;
    L_0x0145:
        r2 = com.iqoption.app.helpers.a.Gs();	 Catch:{ Exception -> 0x017b }
        r3 = 1;
        r4 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x017b }
        r3 = com.iqoption.core.data.model.InstrumentType.TURBO_INSTRUMENT;	 Catch:{ Exception -> 0x017b }
        r2 = r2.a(r4, r3);	 Catch:{ Exception -> 0x017b }
    L_0x0154:
        if (r2 != 0) goto L_0x015e;
    L_0x0156:
        r2 = com.iqoption.app.helpers.a.Gs();	 Catch:{ Exception -> 0x017b }
        r2 = r2.GH();	 Catch:{ Exception -> 0x017b }
    L_0x015e:
        if (r2 == 0) goto L_0x0173;
    L_0x0160:
        r1.E(r0);	 Catch:{ Exception -> 0x017b }
        r0 = 1;
        r1.awi = r0;	 Catch:{ Exception -> 0x017b }
        r1.u(r2);	 Catch:{ Exception -> 0x017b }
        r2 = r1.awj;	 Catch:{ Exception -> 0x017b }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ Exception -> 0x017b }
        r2.onNext(r0);	 Catch:{ Exception -> 0x017b }
        goto L_0x0183;
    L_0x0173:
        r0 = new java.lang.Exception;	 Catch:{ Exception -> 0x017b }
        r2 = "not found active!";
        r0.<init>(r2);	 Catch:{ Exception -> 0x017b }
        throw r0;	 Catch:{ Exception -> 0x017b }
    L_0x017b:
        r0 = move-exception;
        r1.c(r0);
        r2 = 0;
        r1.bB(r2);
    L_0x0183:
        r0 = r19.isInitialized();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.app.managers.tab.TabHelper.Jk():boolean");
    }

    private static /* synthetic */ boolean a(long j, List list, List list2, boolean z, com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        if (aVar == null || !aVar.aX(j) || aVar.isSuspended()) {
            return false;
        }
        for (i Jv : list) {
            if (Jv.Jv() == aVar.getActiveId()) {
                return false;
            }
        }
        for (com.iqoption.core.features.instrument.a Bs : list2) {
            if (Bs.Bs() == aVar.getActiveId()) {
                return false;
            }
        }
        return ActiveType.INTRADAY_ACTIVE == aVar.getActiveType() ? z : true;
    }

    private void c(Exception exception) {
        com.iqoption.util.i.d(new InitTabsException(exception));
        ah ahVar = (ah) this.awk.get();
        if (ahVar != null) {
            ahVar.da(exception.getMessage());
        }
    }

    private void a(ConcurrentHashMap<String, com.iqoption.core.microservices.tradingengine.response.instrument.e> concurrentHashMap, i iVar) {
        if (!iVar.isSpotStrike()) {
            com.iqoption.core.microservices.tradingengine.response.instrument.e a = a((ConcurrentHashMap) concurrentHashMap, iVar.rate);
            if (!(a == null || a.equals(iVar.Jz()))) {
                iVar.c(a);
            }
        }
    }

    @Nullable
    private com.iqoption.core.microservices.tradingengine.response.instrument.e a(ConcurrentHashMap<String, com.iqoption.core.microservices.tradingengine.response.instrument.e> concurrentHashMap, double d) {
        com.iqoption.core.microservices.tradingengine.response.instrument.e eVar = null;
        double d2 = d;
        for (com.iqoption.core.microservices.tradingengine.response.instrument.e eVar2 : concurrentHashMap.values()) {
            double abs = Math.abs(eVar2.getValue() - d);
            if (abs < d2) {
                eVar = eVar2;
                d2 = abs;
            }
        }
        return eVar;
    }

    private void b(ConcurrentHashMap<String, com.iqoption.core.microservices.tradingengine.response.instrument.e> concurrentHashMap, i iVar) {
        com.iqoption.core.microservices.tradingengine.response.instrument.e eVar = concurrentHashMap.isEmpty() ? null : (com.iqoption.core.microservices.tradingengine.response.instrument.e) concurrentHashMap.values().iterator().next();
        if (!(eVar == null || eVar.equals(iVar.Jz()))) {
            iVar.c(eVar);
        }
        eVar = iVar.Jz();
        if (eVar != null && eVar.aiz() != iVar.rate) {
            eVar.o(iVar.rate);
            IQApp.Ex().bd(new com.iqoption.app.managers.a.e.b(iVar.getId()).setValue(eVar));
        }
    }

    private void a(ConcurrentHashMap<String, com.iqoption.core.microservices.tradingengine.response.instrument.e> concurrentHashMap, i iVar, int i) {
        com.iqoption.core.microservices.tradingengine.response.instrument.e eVar = concurrentHashMap.isEmpty() ? null : (com.iqoption.core.microservices.tradingengine.response.instrument.e) concurrentHashMap.values().iterator().next();
        if (eVar != null && !eVar.equals(iVar.awz.get(i))) {
            iVar.a(eVar, i);
        }
    }

    public void b(int i, double d) {
        if (isInitialized()) {
            com.iqoption.core.c.a.biL.execute(new -$$Lambda$TabHelper$_wUBV-3_Ojg6fEFp7H97S5mrSvM(this, i, d));
        }
    }

    private /* synthetic */ void c(int i, double d) {
        SparseArray clone = this.awf.clone();
        for (int i2 = 0; i2 < clone.size(); i2++) {
            i iVar = (i) clone.valueAt(i2);
            if (iVar != null && iVar.getActiveId() == i) {
                iVar.rate = d;
                int i3 = AnonymousClass2.$SwitchMap$com$iqoption$core$data$model$InstrumentType[iVar.instrumentType.ordinal()];
                if (i3 == 1) {
                    h(iVar);
                } else if (i3 == 5 || i3 == 6) {
                    g(iVar);
                }
                a(iVar.Jv(), iVar.getInstrumentType(), iVar.Ju(), iVar.getMultiplier());
            }
        }
    }

    private void a(int i, InstrumentType instrumentType, String str, int i2) {
        ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(i);
        if (dY != null) {
            com.iqoption.gl.c.aIy().setBidAsk(str, dY.getBid(instrumentType, i2), dY.getAsk(instrumentType, i2));
        }
    }

    private void f(i iVar) {
        if (iVar.Jr()) {
            h(iVar);
        } else {
            g(iVar);
        }
    }

    private void g(i iVar) {
        i iVar2 = iVar;
        int id = iVar.getId();
        long expiration = iVar.getExpiration();
        if (expiration != 0) {
            TabHelper thisR;
            boolean containsKey = this.awp.containsKey(Integer.valueOf(id));
            boolean containsKey2 = this.awq.containsKey(Integer.valueOf(id));
            if (!containsKey || !containsKey2) {
                com.iqoption.core.microservices.tradingengine.response.active.a Jt = iVar.Jt();
                com.iqoption.app.managers.a.c h = com.iqoption.app.managers.a.e.Ig().h(Jt == null ? null : Jt.instrumentType);
                if (!(h == null || Jt == null)) {
                    int Jv = iVar.Jv();
                    InstrumentType instrumentType = iVar.getInstrumentType();
                    com.iqoption.core.microservices.tradingengine.response.instrument.e Jz = iVar.Jz();
                    boolean isSpotStrike = iVar.isSpotStrike();
                    boolean JE = iVar.JE();
                    long Jy = iVar.Jy();
                    com.iqoption.core.microservices.tradingengine.response.active.a aVar;
                    ConcurrentHashMap concurrentHashMap;
                    if (Jz == null) {
                        ConcurrentHashMap concurrentHashMap2;
                        ConcurrentHashMap concurrentHashMap3;
                        com.iqoption.app.managers.a.c cVar = h;
                        InstrumentType instrumentType2 = instrumentType;
                        ConcurrentHashMap b = cVar.b(instrumentType2, Jt.agB(), Long.valueOf(expiration), Long.valueOf(Jy), false);
                        ConcurrentHashMap b2 = cVar.b(instrumentType2, Jt.agB(), Long.valueOf(expiration), Long.valueOf(Jy), true);
                        if (b != null || containsKey) {
                            concurrentHashMap2 = b;
                            concurrentHashMap3 = b2;
                            aVar = Jt;
                        } else {
                            concurrentHashMap2 = b;
                            concurrentHashMap3 = b2;
                            aVar = Jt;
                            a(id, Jv, expiration, instrumentType, Jy, Jt, h);
                        }
                        if (isSpotStrike && concurrentHashMap3 == null && !containsKey2) {
                            b(id, Jv, expiration, instrumentType, Jy, aVar, h);
                        }
                        if (!isSpotStrike || concurrentHashMap3 == null) {
                            thisR = this;
                        } else {
                            concurrentHashMap = concurrentHashMap3;
                            thisR = this;
                            thisR.b(concurrentHashMap, iVar2);
                        }
                        if (!isSpotStrike) {
                            concurrentHashMap = concurrentHashMap2;
                            if (concurrentHashMap != null) {
                                thisR.a(concurrentHashMap, iVar2);
                            }
                        }
                    } else {
                        aVar = Jt;
                        if (isSpotStrike) {
                            concurrentHashMap = h.b(instrumentType, aVar.agB(), Long.valueOf(expiration), Long.valueOf(Jy), true);
                            if (concurrentHashMap != null) {
                                b(concurrentHashMap, iVar2);
                            } else if (!containsKey2) {
                                b(id, Jv, expiration, instrumentType, Jy, aVar, h);
                            }
                        } else if (JE) {
                            ConcurrentHashMap b3 = h.b(instrumentType, aVar.agB(), Long.valueOf(expiration), Long.valueOf(Jy), false);
                            if (b3 != null) {
                                a(b3, iVar2);
                            } else if (!containsKey) {
                                a(id, Jv, expiration, instrumentType, Jy, aVar, h);
                            }
                        }
                    }
                }
            }
        }
    }

    private void h(i iVar) {
        long expiration = iVar.getExpiration();
        if (expiration != 0) {
            com.iqoption.core.microservices.tradingengine.response.active.j jVar = (com.iqoption.core.microservices.tradingengine.response.active.j) iVar.Js();
            if (jVar != null) {
                for (com.iqoption.core.microservices.tradingengine.response.active.j jVar2 : jVar.aib()) {
                    int activeId = jVar2.getActiveId();
                    InstrumentType instrumentType = jVar2.getInstrumentType();
                    if (!this.awr.containsKey(Integer.valueOf(activeId))) {
                        com.iqoption.app.managers.a.c h = com.iqoption.app.managers.a.e.Ig().h(instrumentType);
                        if (h != null) {
                            long Jy = iVar.Jy();
                            ConcurrentHashMap b = h.b(instrumentType, jVar2.agB(), Long.valueOf(expiration), Long.valueOf(Jy), true);
                            if (b == null) {
                                c(iVar.getId(), activeId, expiration, instrumentType, Jy, jVar2, h);
                                i iVar2 = iVar;
                            } else {
                                a(b, iVar, activeId);
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    private void a(int i, int i2, long j, InstrumentType instrumentType, long j2, com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.app.managers.a.c cVar) {
        int i3 = i;
        h hVar = new h(i);
        this.awp.put(Integer.valueOf(i), hVar);
        v.b(cVar.a(Integer.valueOf(i2), instrumentType, aVar.agB(), Long.valueOf(j), Long.valueOf(j2), false), hVar);
    }

    private void b(int i, int i2, long j, InstrumentType instrumentType, long j2, com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.app.managers.a.c cVar) {
        int i3 = i;
        g gVar = new g(i);
        this.awq.put(Integer.valueOf(i), gVar);
        v.b(cVar.a(Integer.valueOf(i2), instrumentType, aVar.agB(), Long.valueOf(j), Long.valueOf(j2), true), gVar);
    }

    private void c(int i, int i2, long j, InstrumentType instrumentType, long j2, com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.app.managers.a.c cVar) {
        int i3 = i;
        int i4 = i2;
        f fVar = new f(i, i2);
        this.awr.put(Integer.valueOf(i2), fVar);
        v.b(cVar.a(Integer.valueOf(i2), instrumentType, aVar.agB(), Long.valueOf(j), Long.valueOf(j2), true), fVar);
    }

    @NonNull
    public io.reactivex.e<Integer> Jl() {
        return this.awn;
    }
}
