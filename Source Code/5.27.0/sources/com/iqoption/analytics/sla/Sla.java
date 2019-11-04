package com.iqoption.analytics.sla;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.common.b.e;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.aj;
import com.google.common.collect.x;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.feature.c;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.config.ApiConfig;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.system.a.d;
import com.iqoption.util.Network;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class Sla implements LifecycleObserver, com.iqoption.core.analytics.a.a {
    private static final String TAG = "com.iqoption.analytics.sla.Sla";
    private static final n<Sla> ara = Suppliers.a(-$$Lambda$Sla$Q4dXXxoGUX9_vmxHFH6jZMDDta0.INSTANCE);
    private static com.google.common.cache.b<String, String> arj = CacheBuilder.qq().a(2, TimeUnit.SECONDS).qF();
    private static com.google.common.cache.b<String, com.iqoption.core.b.a> ark = CacheBuilder.qq().a(2, TimeUnit.SECONDS).a(-$$Lambda$Sla$t-qSxIoCWPAC14NbMxhiuN0_sjQ.INSTANCE).qF();
    private final b arb = new b();
    private Map<String, a> arc = Maps.uk();
    private Map<String, HashMultiset<Object>> ard = Maps.uk();
    private x<String> are = HashMultiset.sJ();
    private volatile boolean arf;
    private volatile boolean arg;
    private ScheduledFuture<?> arh;
    private ScheduledFuture<?> ari;
    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    public static final class a {
        private final com.iqoption.core.util.u.b arl;
        private final Builder arm;
        private long arn;
        private long aro;
        private boolean arp;
        private boolean arq;
        private long arr;
        private ArrayList<Pair<Long, Double>> ars = new ArrayList();
        private String type;

        public static a dr(String str) {
            return new a(Event.CATEGORY_SYSTEM, Event.MICROSERVICE_EVENT, str);
        }

        private a(String str, String str2, String str3) {
            this.arm = Event.Builder(str, str2);
            this.arm.setTechnicalLogs(Boolean.valueOf(true));
            this.type = str3;
            this.arl = com.iqoption.core.util.u.b.anq();
            this.arl.o("feature", ds(str3));
            this.arl.o("type", str3);
            this.arl.o("endpoint", Df());
            this.arl.o("front", WebSocketHandler.aTn().Xd());
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
        @androidx.annotation.Nullable
        private java.lang.String ds(java.lang.String r4) {
            /*
            r3 = this;
            r0 = r4.hashCode();
            r1 = -315056186; // 0xffffffffed389fc6 float:-3.5711498E27 double:NaN;
            r2 = 1;
            if (r0 == r1) goto L_0x001a;
        L_0x000a:
            r1 = 599063490; // 0x23b4fbc2 float:1.9622263E-17 double:2.9597669E-315;
            if (r0 == r1) goto L_0x0010;
        L_0x000f:
            goto L_0x0024;
        L_0x0010:
            r0 = "quotes-digital";
            r4 = r4.equals(r0);
            if (r4 == 0) goto L_0x0024;
        L_0x0018:
            r4 = 1;
            goto L_0x0025;
        L_0x001a:
            r0 = "pricing";
            r4 = r4.equals(r0);
            if (r4 == 0) goto L_0x0024;
        L_0x0022:
            r4 = 0;
            goto L_0x0025;
        L_0x0024:
            r4 = -1;
        L_0x0025:
            if (r4 == 0) goto L_0x002e;
        L_0x0027:
            if (r4 == r2) goto L_0x002b;
        L_0x0029:
            r4 = 0;
            return r4;
        L_0x002b:
            r4 = "option-quote";
            return r4;
        L_0x002e:
            r4 = "spot-buyback-quote-generated";
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.analytics.sla.Sla$a.ds(java.lang.String):java.lang.String");
        }

        public a S(long j) {
            if (this.arn != j) {
                long j2 = this.arr;
                this.arr = SystemClock.elapsedRealtime();
                if (this.aro != 0) {
                    long j3 = this.arr - j2;
                    this.ars.add(Pair.create(Long.valueOf(j3), Double.valueOf(T(j3))));
                    this.aro = 0;
                }
                this.arn = j;
            }
            return this;
        }

        public a aK(boolean z) {
            this.arq = z;
            return this;
        }

        public a aL(boolean z) {
            this.arp = z;
            return this;
        }

        private void Dd() {
            this.aro++;
        }

        private double T(long j) {
            long j2 = this.aro;
            if (j2 != 0) {
                long j3 = this.arn;
                if (j3 != 0) {
                    if (j < 10000) {
                        return 100.0d;
                    }
                    double d = (double) j;
                    double d2 = (double) j2;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    d /= d2;
                    d2 = (double) j3;
                    Double.isNaN(d2);
                    return Math.min((double) (Math.round((d2 / d) * 10000.0d) / 100), 100.0d);
                }
            }
            return 0.0d;
        }

        private double De() {
            double d = 100.0d;
            double d2 = 0.0d;
            if (this.arp) {
                if (!this.arq) {
                    d = 0.0d;
                }
                return d;
            } else if (this.arn == 0) {
                return 0.0d;
            } else {
                if (this.aro == 0 && this.ars.isEmpty()) {
                    return 0.0d;
                }
                if (this.ars.isEmpty()) {
                    return T(this.arm.currentDuration());
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.arr;
                this.ars.add(Pair.create(Long.valueOf(elapsedRealtime), Double.valueOf(T(elapsedRealtime))));
                elapsedRealtime = this.arm.currentDuration();
                Iterator it = this.ars.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    double longValue = (double) ((Long) pair.first).longValue();
                    double d3 = (double) elapsedRealtime;
                    Double.isNaN(longValue);
                    Double.isNaN(d3);
                    d2 += ((Double) pair.second).doubleValue() * (longValue / d3);
                }
                return Math.min((double) (Math.round(d2 * 100.0d) / 100), 100.0d);
            }
        }

        private String Df() {
            ApiConfig Ev = IQApp.Ev();
            if (!Ev.isInitialized()) {
                return "";
            }
            try {
                Ev = new URL(Ev.Vb()).getHost();
                return Ev;
            } catch (Exception unused) {
                return Ev.Vb();
            }
        }

        public void send() {
            if (this.arp || this.arn != 0) {
                this.arl.o("percent", Double.valueOf(De()));
                this.arm.setParameters(this.arl.anr());
                EventManager.BS().a(this.arm.build());
            }
        }
    }

    private class b extends d {
        private b() {
        }

        @e
        public void onNetworkStateEvent(com.iqoption.app.b.d dVar) {
            Sla.this.executor.execute(new -$$Lambda$Sla$b$GnOmgZoJpow04M8KFNU4R46JJGQ(this, dVar));
        }

        @e
        public void onAppForegroundEvent(com.iqoption.app.b.a aVar) {
            Sla.this.executor.execute(new -$$Lambda$Sla$b$zEXuiKY1C_R4a_jJl31igGMwT6A(this, aVar));
        }

        @e
        public void onInitializationCompletedEvent(TabHelper.e eVar) {
            Sla.this.executor.execute(new -$$Lambda$Sla$b$IRbb8rH4G0M2a4lsd2NN3JmE7RY(this));
        }

        private /* synthetic */ void Dg() {
            Sla.this.CY();
        }

        @e
        public void onApiCallEvent(com.iqoption.core.b.a aVar) {
            if (!aVar.bgx.contains("api/appsflyer/link") && !aVar.bgx.contains("appsflyer-initialization")) {
                com.iqoption.core.b.a aVar2 = (com.iqoption.core.b.a) Sla.ark.ar(aVar.bgx);
                if (aVar.bgy.getDuration() == null && aVar.bgz == null) {
                    if (!Sla.this.arg && aVar2 == null) {
                        Sla.ark.put(aVar.bgx, aVar);
                    }
                    return;
                }
                if (aVar.bgy.getDuration() != null && aVar.bgz == null && Sla.this.arg) {
                    Sla.this.arg = false;
                    Sla sla = Sla.this;
                    boolean z = IQApp.Eu().Ey() && IQApp.Eu().isStarted();
                    sla.aJ(z);
                }
                if (aVar2 != null) {
                    aVar2.bgA = true;
                    Sla.ark.as(aVar.bgx);
                }
                if (Sla.arj.ar(aVar.bgx) == null) {
                    if (aVar.bgz instanceof IOException) {
                        Sla.this.arg = true;
                        Sla.this.aJ(false);
                        for (com.iqoption.core.b.a aVar22 : Sla.ark.qp().values()) {
                            aVar22.bgA = true;
                        }
                        Sla.ark.invalidateAll();
                    } else if (aVar.bgz == null) {
                        a.dr(aVar.bgx).aL(true).aK(true).send();
                        Sla.arj.put(aVar.bgx, aVar.bgx);
                    }
                }
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onCreate() {
        CV().initialize();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onDestroy() {
        CV().CW();
    }

    public static Sla CV() {
        return (Sla) ara.get();
    }

    private Sla() {
    }

    private void initialize() {
        this.arb.register();
        boolean z = Network.ebO.aWS() && IQApp.Eu().isStarted();
        aJ(z);
    }

    private void CW() {
        this.arb.unregister();
        aJ(false);
    }

    private void g(String str, Object obj) {
        if (this.arf) {
            this.are.add(str);
            HashMultiset hashMultiset = (HashMultiset) this.ard.get(str);
            if (hashMultiset == null) {
                hashMultiset = HashMultiset.sJ();
                hashMultiset.add(obj);
                this.ard.put(str, hashMultiset);
            } else {
                hashMultiset.add(obj);
            }
            a aVar = (a) this.arc.get(str);
            if (aVar == null) {
                dp(str);
            } else {
                aVar.S((long) (1000 / hashMultiset.sh().size()));
            }
        }
    }

    public synchronized void a(String str, boolean z, Object obj) {
        if (this.arf) {
            this.executor.execute(new -$$Lambda$Sla$jd0ZK1Ddog5fIASwp1xMWV_Dtqk(this, z, str, obj));
        }
    }

    private /* synthetic */ void c(boolean z, String str, Object obj) {
        if (z) {
            g(str, obj);
        } else {
            h(str, obj);
        }
    }

    public synchronized void dn(@NonNull String str) {
        if (this.arf) {
            this.executor.execute(new -$$Lambda$Sla$B6mIsyCG6sUub4sN50Bt120KxLE(this, str));
        }
    }

    private /* synthetic */ void dq(String str) {
        m5do(str);
    }

    @WorkerThread
    /* renamed from: do */
    private void m5do(String str) {
        a aVar = (a) this.arc.get(str);
        if (aVar != null) {
            aVar.Dd();
        }
    }

    private void h(String str, Object obj) {
        HashMultiset hashMultiset = (HashMultiset) this.ard.get(str);
        if (hashMultiset != null) {
            hashMultiset.remove(obj);
            if (!hashMultiset.contains(obj)) {
                this.ard.remove(str);
            }
        }
        if (this.are.f(str, 1) <= 1) {
            this.arc.remove(str);
            this.ard.remove(str);
            return;
        }
        a aVar = (a) this.arc.get(str);
        if (aVar != null && hashMultiset != null && !hashMultiset.isEmpty()) {
            aVar.S((long) (1000 / hashMultiset.sh().size()));
        }
    }

    private void dp(String str) {
        a dr = a.dr(str);
        dr.S((long) (1000 / ((HashMultiset) this.ard.get(str)).sh().size()));
        this.arc.put(str, dr);
    }

    private void aJ(boolean z) {
        if (!c.Iw().ej("sla")) {
            z = false;
        }
        if (z != this.arf) {
            synchronized (this) {
                if (z) {
                    this.arf = true;
                    this.arh = this.executor.scheduleWithFixedDelay(new -$$Lambda$Sla$jVYDjt8JzDkvhORPQlV2yKRprGA(this), 1, 1, TimeUnit.MINUTES);
                } else {
                    this.arf = false;
                    this.arc.clear();
                    this.are.clear();
                    this.ard.clear();
                    if (this.arh != null) {
                        this.arh.cancel(false);
                    }
                }
            }
        }
    }

    @WorkerThread
    private void CX() {
        if (this.arf) {
            ImmutableList m;
            synchronized (this) {
                m = ImmutableList.m(this.arc.values());
            }
            if (!m.isEmpty()) {
                aj sK = m.iterator();
                while (sK.hasNext()) {
                    ((a) sK.next()).send();
                }
                synchronized (this) {
                    aj sK2 = m.iterator();
                    while (sK2.hasNext()) {
                        dp(((a) sK2.next()).type);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:18:0x003f, code skipped:
            return;
     */
    public synchronized void CY() {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r10.arf;	 Catch:{ all -> 0x0040 }
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r10);
        return;
    L_0x0007:
        r0 = com.iqoption.app.managers.tab.TabHelper.IM();	 Catch:{ all -> 0x0040 }
        r1 = r0.Jj();	 Catch:{ all -> 0x0040 }
        r0 = r0.isInitialized();	 Catch:{ all -> 0x0040 }
        if (r0 != 0) goto L_0x001f;
    L_0x0015:
        r0 = com.iqoption.app.managers.tab.TabHelper.awb;	 Catch:{ all -> 0x0040 }
        r0 = r0.equalsIgnoreCase(r1);	 Catch:{ all -> 0x0040 }
        if (r0 != 0) goto L_0x001f;
    L_0x001d:
        monitor-exit(r10);
        return;
    L_0x001f:
        r0 = r10.ari;	 Catch:{ all -> 0x0040 }
        if (r0 != 0) goto L_0x003e;
    L_0x0023:
        r0 = "history-quotes";
        r1 = 1;
        r2 = "";
        r10.a(r0, r1, r2);	 Catch:{ all -> 0x0040 }
        r3 = r10.executor;	 Catch:{ all -> 0x0040 }
        r4 = new com.iqoption.analytics.sla.-$$Lambda$Sla$ClrgKAy6LeOxEYRVh5plr0sxIG8;	 Catch:{ all -> 0x0040 }
        r4.<init>(r10);	 Catch:{ all -> 0x0040 }
        r5 = 1;
        r7 = 1;
        r9 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0040 }
        r0 = r3.scheduleWithFixedDelay(r4, r5, r7, r9);	 Catch:{ all -> 0x0040 }
        r10.ari = r0;	 Catch:{ all -> 0x0040 }
    L_0x003e:
        monitor-exit(r10);
        return;
    L_0x0040:
        r0 = move-exception;
        monitor-exit(r10);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.analytics.sla.Sla.CY():void");
    }

    public synchronized void CZ() {
        a("history-quotes", false, "");
        if (this.ari != null) {
            this.ari.cancel(true);
        }
    }

    @WorkerThread
    private void Da() {
        String Jj = TabHelper.IM().Jj();
        if (!TabHelper.awb.equals(Jj) && com.iqoption.gl.c.aIy().hasVisibleChartWithoutHoles(Jj)) {
            m5do("history-quotes");
        }
    }
}
