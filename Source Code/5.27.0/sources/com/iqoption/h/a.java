package com.iqoption.h;

import android.content.Context;
import android.graphics.Bitmap;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.gl.ChartWindow;
import com.iqoption.core.microservices.livedeals.ExpirationType;
import com.iqoption.core.util.m;
import com.squareup.picasso.Picasso;
import io.reactivex.p;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0007J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0007J \u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007J(\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u000e2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010$H\u0002J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0006H\u0007J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0006H\u0007J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u001dH\u0007J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, bng = {"Lcom/iqoption/livedeals/LiveDealsHelper;", "", "()V", "LIVE_DEALS_REQUEST_COUNT", "", "TAG", "", "kotlin.jvm.PlatformType", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "supportedInstrumentType", "", "Lcom/iqoption/core/data/model/InstrumentType;", "disposeSubscriptions", "", "getBitmap", "Lio/reactivex/Maybe;", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "url", "isLiveDealsFeatureEnabled", "", "onLiveDealsRequestedForExpiration", "activeId", "finInstrument", "expirationPeriodSec", "onLiveDealsRequestedForInterval", "fromInSec", "", "toInSec", "onLiveDealsUpdateReceived", "liveDeal", "Lcom/iqoption/core/microservices/livedeals/response/LiveDeal;", "onTopDealsLoaded", "liveDeals", "", "performFlagImageLoading", "country", "performImageLoading", "performUserWeekPlaceAndProfitLoading", "userId", "requestTopDeals", "Lio/reactivex/disposables/Disposable;", "params", "Lcom/iqoption/core/microservices/livedeals/params/LiveDealsParams;", "subscribeOnUpdates", "app_optionXRelease"})
/* compiled from: LiveDealsHelper.kt */
public final class a {
    private static final String TAG = a.class.getName();
    private static io.reactivex.disposables.a cyj = new io.reactivex.disposables.a();
    private static final Set<InstrumentType> dEI = al.setOf(InstrumentType.TURBO_INSTRUMENT, InstrumentType.BINARY_INSTRUMENT, InstrumentType.DIGITAL_INSTRUMENT, InstrumentType.FX_INSTRUMENT, InstrumentType.FOREX_INSTRUMENT, InstrumentType.CFD_INSTRUMENT, InstrumentType.CRYPTO_INSTRUMENT);
    public static final a dEJ = new a();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Landroid/graphics/Bitmap;", "call"})
    /* compiled from: LiveDealsHelper.kt */
    static final class a<V> implements Callable<T> {
        final /* synthetic */ Context aOk;
        final /* synthetic */ String bEG;

        a(String str, Context context) {
            this.bEG = str;
            this.aOk = context;
        }

        /* renamed from: aIw */
        public final Bitmap call() {
            return this.bEG != null ? Picasso.with(this.aOk).load(this.bEG).get() : null;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "accept", "com/iqoption/livedeals/LiveDealsHelper$performFlagImageLoading$1$disposable$1"})
    /* compiled from: LiveDealsHelper.kt */
    static final class b<T> implements io.reactivex.b.f<Bitmap> {
        final /* synthetic */ String dEK;

        b(String str) {
            this.dEK = str;
        }

        /* renamed from: c */
        public final void accept(Bitmap bitmap) {
            com.iqoption.gl.c.aIy().setRawImageByUrl(this.dEK, bitmap);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LiveDealsHelper.kt */
    static final class c<T> implements io.reactivex.b.f<Throwable> {
        public static final c dEL = new c();

        c() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LiveDealsHelper.kt */
    static final class d<T> implements io.reactivex.b.f<Bitmap> {
        final /* synthetic */ String bEG;

        d(String str) {
            this.bEG = str;
        }

        /* renamed from: c */
        public final void accept(Bitmap bitmap) {
            com.iqoption.gl.c.aIy().setRawImageByUrl(this.bEG, bitmap);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LiveDealsHelper.kt */
    static final class e<T> implements io.reactivex.b.f<Throwable> {
        public static final e dEM = new e();

        e() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "userInfo", "Lcom/iqoption/core/microservices/leaderboard/response/LeaderBoardUserInfo;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LiveDealsHelper.kt */
    static final class f<T> implements io.reactivex.b.f<com.iqoption.core.microservices.c.a.a> {
        public static final f dEN = new f();

        f() {
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.c.a.a aVar) {
            com.iqoption.gl.c.aIy().setUserWeekPlace(aVar.getUserId(), aVar.getPosition());
            com.iqoption.gl.c.aIy().setUserWeekProfit(aVar.getUserId(), (int) aVar.afR());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LiveDealsHelper.kt */
    static final class g<T> implements io.reactivex.b.f<Throwable> {
        public static final g dEO = new g();

        g() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "liveDeals", "", "Lcom/iqoption/core/microservices/livedeals/response/LiveDeal;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LiveDealsHelper.kt */
    static final class h<T> implements io.reactivex.b.f<List<? extends com.iqoption.core.microservices.livedeals.response.a>> {
        public static final h dEP = new h();

        h() {
        }

        /* renamed from: v */
        public final void accept(List<? extends com.iqoption.core.microservices.livedeals.response.a> list) {
            a.dEJ.bi(list);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LiveDealsHelper.kt */
    static final class i<T> implements io.reactivex.b.f<Throwable> {
        public static final i dEQ = new i();

        i() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "liveDeal", "Lcom/iqoption/core/microservices/livedeals/response/LiveDeal;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LiveDealsHelper.kt */
    static final class j<T> implements io.reactivex.b.f<com.iqoption.core.microservices.livedeals.response.a> {
        public static final j dER = new j();

        j() {
        }

        /* renamed from: b */
        public final void accept(com.iqoption.core.microservices.livedeals.response.a aVar) {
            a aVar2 = a.dEJ;
            kotlin.jvm.internal.i.e(aVar, "liveDeal");
            aVar2.a(aVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LiveDealsHelper.kt */
    static final class k<T> implements io.reactivex.b.f<Throwable> {
        public static final k dES = new k();

        k() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    private a() {
    }

    public static final boolean aNv() {
        return com.iqoption.core.d.EH().ej("live-deals");
    }

    public static final void onLiveDealsRequestedForInterval(int i, String str, long j, long j2) {
        kotlin.jvm.internal.i.f(str, "finInstrument");
        InstrumentType fromServerValue = InstrumentType.Companion.fromServerValue(str);
        if (dEI.contains(fromServerValue)) {
            cyj.clear();
            com.iqoption.core.microservices.livedeals.a.c bVar = new com.iqoption.core.microservices.livedeals.a.b(i, fromServerValue, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(300));
            cyj.e(dEJ.i(bVar));
            cyj.e(dEJ.j(bVar));
        }
    }

    public static final void onLiveDealsRequestedForExpiration(int i, String str, int i2) {
        kotlin.jvm.internal.i.f(str, "finInstrument");
        Object fromServerValue = InstrumentType.Companion.fromServerValue(str);
        if (dEI.contains(fromServerValue)) {
            ExpirationType expirationType;
            cyj.clear();
            if (!com.iqoption.core.ext.c.b(fromServerValue, InstrumentType.BINARY_INSTRUMENT, InstrumentType.TURBO_INSTRUMENT, InstrumentType.DIGITAL_INSTRUMENT, InstrumentType.FX_INSTRUMENT)) {
                expirationType = null;
            } else if (((long) i2) <= TimeUnit.MINUTES.toSeconds(1)) {
                expirationType = ExpirationType.PT1M;
            } else {
                expirationType = ExpirationType.PT5M;
            }
            com.iqoption.core.microservices.livedeals.a.c aVar = new com.iqoption.core.microservices.livedeals.a.a(i, fromServerValue, expirationType);
            cyj.e(dEJ.i(aVar));
            cyj.e(dEJ.j(aVar));
        }
    }

    public static final void iU(String str) {
        kotlin.jvm.internal.i.f(str, "country");
        String Y = m.bQG.Y(str);
        if (Y != null) {
            cyj.e(dEJ.F(com.iqoption.core.d.Uo(), Y).f(com.iqoption.core.rx.i.aki()).e(com.iqoption.core.rx.i.akl()).a(new b(str), c.dEL));
        }
    }

    public static final void iV(String str) {
        kotlin.jvm.internal.i.f(str, "url");
        cyj.e(dEJ.F(com.iqoption.core.d.Uo(), str).f(com.iqoption.core.rx.i.aki()).e(com.iqoption.core.rx.i.akl()).a(new d(str), e.dEM));
    }

    public static final void bT(long j) {
        io.reactivex.disposables.b a = com.iqoption.core.microservices.c.a.bwi.aU(j).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akl()).a((io.reactivex.b.f) f.dEN, (io.reactivex.b.f) g.dEO);
        kotlin.jvm.internal.i.e(a, "LeaderBoardRequests.getL…r ->  }\n                )");
        cyj.e(a);
    }

    public static final void aIv() {
        cyj.clear();
    }

    private final io.reactivex.disposables.b i(com.iqoption.core.microservices.livedeals.a.c cVar) {
        p c;
        int i = b.aob[cVar.getInstrumentType().ordinal()];
        if (i == 1 || i == 2) {
            c = com.iqoption.core.microservices.livedeals.a.bwp.c(cVar);
        } else if (i == 3) {
            c = com.iqoption.core.microservices.livedeals.a.bwp.e(cVar);
        } else if (i != 4) {
            c = com.iqoption.core.microservices.livedeals.a.bwp.a(cVar);
        } else {
            c = com.iqoption.core.microservices.livedeals.a.bwp.g(cVar);
        }
        io.reactivex.disposables.b a = c.h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akl()).a((io.reactivex.b.f) h.dEP, (io.reactivex.b.f) i.dEQ);
        kotlin.jvm.internal.i.e(a, "command\n                …r ->  }\n                )");
        return a;
    }

    private final void bi(List<? extends com.iqoption.core.microservices.livedeals.response.a> list) {
        List list2 = list;
        if (list2 != null && (list2.isEmpty() ^ 1) == 1) {
            String str;
            int i;
            int i2;
            ChartWindow aIy = com.iqoption.gl.c.aIy();
            int size = list.size();
            long[] jArr = new long[size];
            double[] dArr = new double[size];
            long[] jArr2 = new long[size];
            double[] dArr2 = new double[size];
            int[] iArr = new int[size];
            String[] strArr = new String[size];
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                str = "";
                if (i3 >= length) {
                    break;
                }
                strArr[i3] = str;
                i3++;
            }
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            String[] strArr2 = new String[size];
            int length2 = strArr2.length;
            for (i = 0; i < length2; i++) {
                strArr2[i] = str;
            }
            String[] strArr3 = new String[size];
            i = strArr3.length;
            for (int i4 = 0; i4 < i; i4++) {
                strArr3[i4] = str;
            }
            String[] strArr4 = new String[size];
            i = strArr4.length;
            double[] dArr3 = dArr2;
            for (i2 = 0; i2 < i; i2++) {
                strArr4[i2] = str;
            }
            int[] iArr4 = new int[size];
            i2 = 0;
            while (i2 < size) {
                com.iqoption.core.microservices.livedeals.response.a aVar = (com.iqoption.core.microservices.livedeals.response.a) list2.get(i2);
                jArr[i2] = aVar.getUserId();
                dArr[i2] = aVar.ZC();
                jArr2[i2] = aVar.ZU();
                iArr[i2] = aVar.getActiveId();
                strArr[i2] = aVar.getInstrumentType().getOptionActiveOrInstrumentValue();
                int i5 = size;
                iArr2[i2] = kotlin.jvm.internal.i.y(aVar.agb(), Boolean.valueOf(true));
                iArr3[i2] = aVar.isCall();
                String name = aVar.getName();
                if (name == null) {
                    name = str;
                }
                strArr2[i2] = name;
                name = aVar.aga();
                if (name == null) {
                    name = str;
                }
                strArr3[i2] = name;
                strArr4[i2] = aVar.afZ();
                iArr4[i2] = aVar.afY();
                i2++;
                List<? extends com.iqoption.core.microservices.livedeals.response.a> list22 = list;
                size = i5;
            }
            aIy.addLiveDeals(jArr, dArr, jArr2, dArr3, iArr, strArr, iArr2, iArr3, strArr2, strArr3, strArr4, iArr4);
        }
    }

    private final io.reactivex.disposables.b j(com.iqoption.core.microservices.livedeals.a.c cVar) {
        io.reactivex.e d;
        int i = b.axg[cVar.getInstrumentType().ordinal()];
        if (i == 1 || i == 2) {
            d = com.iqoption.core.microservices.livedeals.a.bwp.d(cVar);
        } else if (i == 3) {
            d = com.iqoption.core.microservices.livedeals.a.bwp.f(cVar);
        } else if (i != 4) {
            d = com.iqoption.core.microservices.livedeals.a.bwp.b(cVar);
        } else {
            d = com.iqoption.core.microservices.livedeals.a.bwp.h(cVar);
        }
        io.reactivex.disposables.b a = d.d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akl()).a((io.reactivex.b.f) j.dER, (io.reactivex.b.f) k.dES);
        kotlin.jvm.internal.i.e(a, "updates\n                …r ->  }\n                )");
        return a;
    }

    private final void a(com.iqoption.core.microservices.livedeals.response.a aVar) {
        ChartWindow aIy = com.iqoption.gl.c.aIy();
        kotlin.jvm.internal.i.e(aIy, "Charts.regular");
        aIy.addNewLiveDeal(aVar.getUserId(), aVar.ZC(), aVar.ZU(), 0.0d, aVar.getActiveId(), aVar.getInstrumentType().getOptionActiveOrInstrumentValue(), kotlin.jvm.internal.i.y(aVar.agb(), Boolean.valueOf(true)), aVar.isCall());
        String name = aVar.getName();
        String str = "";
        String str2 = name != null ? name : str;
        name = aVar.aga();
        aIy.setUserMainInfo(aVar.getUserId(), aVar.afZ(), aVar.afY(), str2, name != null ? name : str);
    }

    private final io.reactivex.i<Bitmap> F(Context context, String str) {
        io.reactivex.i g = io.reactivex.i.g(new a(str, context));
        kotlin.jvm.internal.i.e(g, "Maybe.fromCallable<Bitma…)\n            }\n        }");
        return g;
    }
}
