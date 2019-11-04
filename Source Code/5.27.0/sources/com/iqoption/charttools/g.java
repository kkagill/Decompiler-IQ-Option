package com.iqoption.charttools;

import com.google.gson.JsonObject;
import com.iqoption.charttools.model.indicator.h;
import com.iqoption.charttools.model.indicator.k;
import com.iqoption.core.gl.ChartWindow;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.i;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ(\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\"\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0002J*\u0010 \u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0002J\f\u0010\"\u001a\u00020\u000b*\u00020\u0010H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, bng = {"Lcom/iqoption/charttools/ChartIndicatorsBridge;", "Lio/reactivex/disposables/Disposable;", "chart", "Lcom/iqoption/core/gl/ChartWindow;", "(Lcom/iqoption/core/gl/ChartWindow;)V", "getChart", "()Lcom/iqoption/core/gl/ChartWindow;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "initializedTabs", "", "", "addIndicator", "", "tabId", "indicator", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "animate", "", "clearAllIndicators", "dispose", "isDisposed", "removeIndicator", "indexOfRemoved", "", "removeTab", "replaceIndicators", "indicators", "", "selectTab", "setVolumeShown", "shown", "updateIndicator", "isValueChanged", "serialize", "Companion", "techtools_release"})
/* compiled from: ChartIndicatorsBridge.kt */
public final class g implements io.reactivex.disposables.b {
    private static final String TAG = g.class.getSimpleName();
    public static final a aDl = new a();
    private final Set<String> aDj = new LinkedHashSet();
    private final ChartWindow aDk;
    private final io.reactivex.disposables.a aqB = new io.reactivex.disposables.a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/charttools/ChartIndicatorsBridge$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "VOLUME_ID", "", "VOLUME_JSON", "techtools_release"})
    /* compiled from: ChartIndicatorsBridge.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "indicators", "", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ChartIndicatorsBridge.kt */
    static final class b<T> implements io.reactivex.b.f<List<? extends h>> {
        final /* synthetic */ g aDm;
        final /* synthetic */ String aDn;

        b(g gVar, String str) {
            this.aDm = gVar;
            this.aDn = str;
        }

        /* renamed from: v */
        public final void accept(List<h> list) {
            synchronized (this.aDm.aDj) {
                if (this.aDm.aDj.add(this.aDn) || f.aCQ.Me()) {
                    g gVar = this.aDm;
                    String str = this.aDn;
                    kotlin.jvm.internal.i.e(list, "indicators");
                    gVar.a(str, (List) list, false);
                }
                l lVar = l.eVB;
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ChartIndicatorsBridge.kt */
    static final class c<T> implements io.reactivex.b.f<Throwable> {
        public static final c aDo = new c();

        c() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "event", "Lcom/iqoption/charttools/ActiveIndicatorEvent;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ChartIndicatorsBridge.kt */
    static final class d<T> implements io.reactivex.b.f<b> {
        final /* synthetic */ g aDm;

        d(g gVar) {
            this.aDm = gVar;
        }

        /* renamed from: c */
        public final void accept(b bVar) {
            if (bVar instanceof a) {
                g.a(this.aDm, bVar.getKey(), ((a) bVar).LU(), false, 4, null);
            } else if (bVar instanceof e) {
                e eVar = (e) bVar;
                if (!eVar.LX()) {
                    g.a(this.aDm, bVar.getKey(), eVar.LU(), eVar.LY(), false, 8, null);
                }
            } else if (bVar instanceof c) {
                this.aDm.x(bVar.getKey(), ((c) bVar).LW());
            } else if (bVar instanceof d) {
                g.a(this.aDm, bVar.getKey(), bVar.LV(), false, 4, null);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ChartIndicatorsBridge.kt */
    static final class e<T> implements io.reactivex.b.f<Throwable> {
        public static final e aDp = new e();

        e() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "isVolumeEnabled", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"})
    /* compiled from: ChartIndicatorsBridge.kt */
    static final class f<T> implements io.reactivex.b.f<Boolean> {
        final /* synthetic */ g aDm;
        final /* synthetic */ String aDn;

        f(g gVar, String str) {
            this.aDm = gVar;
            this.aDn = str;
        }

        /* renamed from: j */
        public final void accept(Boolean bool) {
            g gVar = this.aDm;
            String str = this.aDn;
            kotlin.jvm.internal.i.e(bool, "isVolumeEnabled");
            g.a(gVar, str, bool.booleanValue(), false, 4, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ChartIndicatorsBridge.kt */
    static final class g<T> implements io.reactivex.b.f<Throwable> {
        public static final g aDq = new g();

        g() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public g(ChartWindow chartWindow) {
        kotlin.jvm.internal.i.f(chartWindow, "chart");
        this.aDk = chartWindow;
    }

    public boolean isDisposed() {
        return this.aqB.isDisposed();
    }

    public void dispose() {
        this.aqB.clear();
        this.aDj.clear();
    }

    public final void eH(String str) {
        kotlin.jvm.internal.i.f(str, "tabId");
        this.aqB.clear();
        this.aqB.e(f.aCQ.ey(str).h(com.iqoption.core.rx.i.akl()).a((io.reactivex.b.f) new b(this, str), (io.reactivex.b.f) c.aDo));
        this.aqB.e(f.aCQ.ex(str).d(com.iqoption.core.rx.i.akl()).a((io.reactivex.b.f) new d(this), (io.reactivex.b.f) e.aDp));
        this.aqB.e(f.aCQ.Mc().d(com.iqoption.core.rx.i.akl()).a((io.reactivex.b.f) new f(this, str), (io.reactivex.b.f) g.aDq));
    }

    public final void removeTab(String str) {
        kotlin.jvm.internal.i.f(str, "tabId");
        synchronized (this.aDj) {
            this.aDj.remove(str);
        }
    }

    private final void a(String str, h hVar, boolean z) {
        this.aDk.instrumentAdd(str, hVar.getIndex(), a(hVar), z);
        if (hVar.MH() instanceof k) {
            this.aDk.instrumentSelect(str, hVar.getIndex());
        }
    }

    static /* synthetic */ void a(g gVar, String str, h hVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        gVar.a(str, hVar, z, z2);
    }

    private final void a(String str, h hVar, boolean z, boolean z2) {
        if (!this.aDk.containsInstrument(str, hVar.getIndex())) {
            this.aDk.instrumentAdd(str, hVar.getIndex(), a(hVar), z2);
        } else if (z) {
            this.aDk.instrumentUpdate(str, hVar.getIndex(), a(hVar));
        } else {
            this.aDk.instrumentHide(str, hVar.getIndex(), hVar.isHidden());
        }
    }

    private final void x(String str, int i) {
        if (this.aDk.containsInstrument(str, i)) {
            this.aDk.instrumentRemove(str, i);
        }
    }

    private final void a(String str, List<h> list, boolean z) {
        eI(str);
        for (h hVar : list) {
            if (!hVar.isHidden()) {
                this.aDk.instrumentAdd(str, hVar.getIndex(), a(hVar), z);
            }
        }
    }

    private final void eI(String str) {
        boolean containsInstrument = this.aDk.containsInstrument(str, -2);
        this.aDk.instrumentRemoveAll(str);
        if (containsInstrument) {
            this.aDk.instrumentAdd(str, -2, "{\"title\": \"\", \"type\": \"Volume\", \"id\": -2}", false);
        }
    }

    private final String a(h hVar) {
        JsonObject jsonObject = new JsonObject();
        k.aDB.b(jsonObject, hVar);
        String jsonObject2 = jsonObject.toString();
        kotlin.jvm.internal.i.e(jsonObject2, "JsonObject().also { json…his)\n        }.toString()");
        return jsonObject2;
    }

    private final void b(String str, boolean z, boolean z2) {
        if (z) {
            if (!this.aDk.containsInstrument(str, -2)) {
                this.aDk.instrumentAdd(str, -2, "{\"title\": \"\", \"type\": \"Volume\", \"id\": -2}", z2);
            }
        } else if (this.aDk.containsInstrument(str, -2)) {
            this.aDk.instrumentRemove(str, -2);
        }
    }
}
