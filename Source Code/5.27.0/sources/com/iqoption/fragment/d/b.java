package com.iqoption.fragment.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.PeriodicWorkRequest;
import com.google.common.b.e;
import com.google.common.base.d;
import com.google.common.base.j;
import com.google.common.base.n;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import com.google.common.collect.ad;
import com.google.common.collect.s;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.l;
import com.iqoption.dto.entity.iqbus.SignalLegacy;
import com.iqoption.dto.entity.iqbus.SignalLegacy.SignalCreatedEvent;
import com.iqoption.dto.entity.iqbus.SignalLegacy.SignalsEvent;
import com.iqoption.system.a.f;
import com.iqoption.util.v;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Deprecated
/* compiled from: SignalManager */
public class b {
    private static final String TAG = "com.iqoption.fragment.d.b";
    public static final ImmutableSet<Integer> dqn = ImmutableSet.a(Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9));
    public static final String[] dqo = new String[]{"Daily Rise/Fall", "Sharp Jump", "52-Week Max Update", "52-Week Min Update", "52-Week Max Breaking", "52-Week Min Breaking", "4-Week Max Update", "4-Week Min Update", "4-Week Max Breaking", "4-Week Min Breaking", "Price movement"};
    @SuppressLint({"StaticFieldLeak"})
    private static volatile b dqv;
    private volatile boolean awi;
    private volatile boolean diP;
    private a dqp = new a(this, null);
    private Set<SignalLegacy> dqq = aHY();
    private Set<SignalLegacy> dqr = aHY();
    private ad<Integer, SignalLegacy> dqs = aHZ();
    private final d<SignalLegacy, com.iqoption.a.e.b> dqt = new d<SignalLegacy, com.iqoption.a.e.b>() {
        /* renamed from: d */
        public com.iqoption.a.e.b apply(SignalLegacy signalLegacy) {
            return new com.iqoption.a.e.b(IQApp.Eu().getApplicationContext(), signalLegacy);
        }
    };
    private com.google.common.cache.b<Long, Long> dqu = CacheBuilder.qq().x(1000).a(1, TimeUnit.MINUTES).qF();
    private volatile boolean dqw;
    @Nullable
    private ScheduledExecutorService singleThreadExecutor;

    /* compiled from: SignalManager */
    private class a extends f {
        private a() {
        }

        /* synthetic */ a(b bVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @e
        public void onOpenWebSocket(com.iqoption.service.e.f fVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    b.this.reconnect();
                }
            });
        }

        @e
        public void onSignalsEvent(SignalsEvent signalsEvent) {
            if (b.this.diP && b.this.singleThreadExecutor != null) {
                final SignalLegacy[] signalLegacyArr = (SignalLegacy[]) signalsEvent.getValue();
                b.this.singleThreadExecutor.execute(new Runnable() {
                    public void run() {
                        b.this.a(signalLegacyArr);
                    }
                });
            }
        }

        @e
        public void onSignalCreatedEvent(SignalCreatedEvent signalCreatedEvent) {
            if (b.this.diP && b.this.singleThreadExecutor != null) {
                final SignalLegacy signalLegacy = (SignalLegacy) signalCreatedEvent.getValue();
                b.this.singleThreadExecutor.execute(new Runnable() {
                    public void run() {
                        b.this.a(new SignalLegacy[]{signalLegacy});
                    }
                });
            }
        }
    }

    /* compiled from: SignalManager */
    private class b implements o<SignalLegacy[]> {
        public void l(Throwable th) {
        }

        private b() {
        }

        /* synthetic */ b(b bVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: c */
        public void onSuccess(SignalLegacy[] signalLegacyArr) {
            if (b.this.diP) {
                b.this.a(signalLegacyArr);
            }
        }
    }

    public void bx(Context context) {
    }

    public void onStop() {
    }

    private Set<SignalLegacy> aHY() {
        return Sets.ux();
    }

    @NonNull
    private ad<Integer, SignalLegacy> aHZ() {
        return Multimaps.a(HashMultimap.sI());
    }

    public static b aIa() {
        if (dqv == null) {
            synchronized (b.class) {
                if (dqv == null) {
                    dqv = new b();
                }
            }
        }
        return dqv;
    }

    private b() {
    }

    public ImmutableList<SignalLegacy> b(boolean z, int i) {
        Collection sortedCopy;
        if (i == 10) {
            if (this.dqq.isEmpty()) {
                if (this.diP && !this.awi) {
                    ee(false);
                }
                return ImmutableList.sQ();
            }
            if (z) {
                sortedCopy = SignalLegacy.ORDERING_BY_TIME_CREATED.reverse().sortedCopy(s.a(this.dqq, SignalLegacy.isAvailable));
            } else {
                sortedCopy = SignalLegacy.ORDERING_BY_TIME_CREATED.reverse().sortedCopy(this.dqq);
            }
            return ImmutableList.m(sortedCopy);
        } else if (this.dqs.isEmpty()) {
            if (!this.awi) {
                bP(-1);
            }
            return ImmutableList.sQ();
        } else {
            Iterable aE = this.dqs.aE(Integer.valueOf(i));
            if (aE == null) {
                return ImmutableList.sQ();
            }
            if (z) {
                sortedCopy = SignalLegacy.ORDERING_BY_TIME_CREATED.reverse().sortedCopy(s.a(aE, SignalLegacy.isAvailable));
            } else {
                sortedCopy = SignalLegacy.ORDERING_BY_TIME_CREATED.reverse().sortedCopy(aE);
            }
            return ImmutableList.m(sortedCopy);
        }
    }

    private void aIb() {
        com.iqoption.mobbtech.connect.request.api.e.aPy();
        int GK = com.iqoption.app.helpers.b.GK();
        if (GK > 0) {
            com.iqoption.mobbtech.connect.request.api.e.gp(GK);
        }
    }

    private void ee(boolean z) {
        if (!this.dqw || z) {
            this.awi = false;
            this.dqw = true;
            t a = v.a(new n<t<SignalLegacy[]>>() {
                /* renamed from: aId */
                public t<SignalLegacy[]> get() {
                    if (com.iqoption.app.helpers.b.isEnabled()) {
                        return com.iqoption.mobbtech.connect.request.api.e.a(-1, true, com.iqoption.app.helpers.b.GK());
                    }
                    return p.bo(new SignalLegacy[0]);
                }
            }, "GET_HF_SIGNALS");
            p.a(a, new b(this, null), this.singleThreadExecutor);
            a = v.a(a, -$$Lambda$b$BR0C34gYbQHahpOSg_zwIXhsEWY.INSTANCE);
            v.b(a, new o<SignalLegacy[]>() {
                /* renamed from: c */
                public void onSuccess(SignalLegacy[] signalLegacyArr) {
                    b.this.awi = true;
                    b.this.dqw = false;
                }

                public void l(Throwable th) {
                    b.this.awi = false;
                    b.this.dqw = false;
                }
            });
            p.a(a, new b(this, null), this.singleThreadExecutor);
        }
    }

    private boolean bP(long j) {
        if (!this.diP || this.singleThreadExecutor == null || this.dqu.ar(Long.valueOf(j)) != null) {
            return false;
        }
        this.dqu.put(Long.valueOf(j), Long.valueOf(j));
        p.a(com.iqoption.mobbtech.connect.request.api.e.c(j, false), new b(this, null), this.singleThreadExecutor);
        return true;
    }

    /* JADX WARNING: Missing block: B:5:0x0022, code skipped:
            if ("push-auto-subscribe".equals(r2.getStatus()) != false) goto L_0x0024;
     */
    public static boolean by(android.content.Context r2) {
        /*
        r2 = com.iqoption.app.managers.feature.c.Iw();
        r0 = "price-movements";
        r2 = r2.ei(r0);
        if (r2 == 0) goto L_0x0026;
    L_0x000c:
        r0 = r2.getStatus();
        r1 = "enabled";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0024;
    L_0x0018:
        r2 = r2.getStatus();
        r0 = "push-auto-subscribe";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0026;
    L_0x0024:
        r2 = 1;
        goto L_0x0027;
    L_0x0026:
        r2 = 0;
    L_0x0027:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.d.b.by(android.content.Context):boolean");
    }

    public static boolean c(SignalLegacy signalLegacy) {
        boolean z = true;
        if (SystemClock.elapsedRealtime() > PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            return true;
        }
        long Ib = (l.HZ().Ib() - 1800000) / 1000;
        if (signalLegacy.finish_time == null || signalLegacy.finish_time.longValue() < Ib) {
            z = false;
        }
        return z;
    }

    private void reconnect() {
        Context applicationContext = IQApp.Eu().getApplicationContext();
        if (by(applicationContext)) {
            if (this.diP) {
                aIb();
                ee(true);
            } else {
                bx(applicationContext);
            }
            return;
        }
        if (this.diP) {
            onStop();
        }
    }

    private void a(SignalLegacy[] signalLegacyArr) {
        if (this.diP) {
            SignalLegacy signalLegacy;
            List leastOf;
            com.google.common.collect.ImmutableSet.a tp = ImmutableSet.tp();
            for (int length = signalLegacyArr.length - 1; length >= 0; length--) {
                signalLegacy = signalLegacyArr[length];
                if (signalLegacy.type != null) {
                    tp.aI(signalLegacy.type);
                    if (signalLegacy.type.intValue() != 10) {
                        if (!this.dqr.add(signalLegacy)) {
                            this.dqr.remove(signalLegacy);
                            this.dqr.add(signalLegacy);
                        }
                        if (!this.dqs.i(signalLegacy.type, signalLegacy)) {
                            this.dqs.remove(signalLegacy.type, signalLegacy);
                            this.dqs.i(signalLegacy.type, signalLegacy);
                        }
                    } else if (!this.dqq.add(signalLegacy)) {
                        this.dqq.remove(signalLegacy);
                        this.dqq.add(signalLegacy);
                    }
                }
            }
            ImmutableSet tq = tp.tq();
            if (this.dqr.size() > 10000) {
                leastOf = SignalLegacy.ORDERING_BY_TIME_CREATED.reverse().leastOf(this.dqr, 5000);
                Set aHY = aHY();
                aHY.addAll(leastOf);
                this.dqr = aHY;
            }
            for (SignalLegacy signalLegacy2 : this.dqr) {
                ad aHZ = aHZ();
                aHZ.i(signalLegacy2.type, signalLegacy2);
                this.dqs = aHZ;
            }
            if (tq.contains(Integer.valueOf(10))) {
                final long Ib = (l.HZ().Ib() - 1200000) / 1000;
                leastOf = SignalLegacy.ORDERING_BY_TIME_CREATED.reverse().leastOf(s.a(this.dqq, new j<SignalLegacy>() {
                    public boolean apply(SignalLegacy signalLegacy) {
                        return signalLegacy.created.longValue() >= Ib;
                    }
                }), 10);
                this.dqq.clear();
                this.dqq.addAll(leastOf);
            }
            if (signalLegacyArr.length > 0 && (tq.contains(Integer.valueOf(0)) || tq.contains(Integer.valueOf(1)) || tq.contains(Integer.valueOf(10)))) {
                IQApp.Ex().bd(new com.iqoption.fragment.d.c.b(tq, signalLegacyArr));
            }
        }
    }
}
