package com.iqoption.deposit.hold;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.kyc.response.VerificationLevel;
import io.reactivex.b.j;
import io.reactivex.p;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.t;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0012J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\n0\n0\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\f0\f0\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/deposit/hold/DepositHoldWarningManager;", "", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "monthProcessor", "Lio/reactivex/processors/BehaviorProcessor;", "Lcom/iqoption/deposit/hold/IntCardFieldValue;", "kotlin.jvm.PlatformType", "panProcessor", "Lcom/iqoption/deposit/hold/StringCardFieldValue;", "warningProcessor", "Lcom/iqoption/deposit/hold/HoldWarningState;", "yearProcessor", "getBinStatus", "Lio/reactivex/Flowable;", "isCardAndAccountVerified", "onMonthChange", "", "month", "onPanChange", "pan", "onYearChange", "year", "start", "stop", "warningStream", "Landroidx/lifecycle/LiveData;", "Companion", "deposit_release"})
/* compiled from: DepositHoldWarningManager.kt */
public final class g {
    public static final j cEi = new j(false, -1);
    public static final a cEj = new a();
    private final BehaviorProcessor<k> cEe;
    private final BehaviorProcessor<j> cEf;
    private final BehaviorProcessor<j> cEg;
    private final BehaviorProcessor<HoldWarningState> cEh;
    private final io.reactivex.disposables.a cyj = new io.reactivex.disposables.a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/hold/DepositHoldWarningManager$Companion;", "", "()V", "BID_LENGTH", "", "NO_VALID_INT_CARD_VALUE", "Lcom/iqoption/deposit/hold/IntCardFieldValue;", "deposit_release"})
    /* compiled from: DepositHoldWarningManager.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/deposit/hold/HoldWarningState;", "kotlin.jvm.PlatformType", "pan", "Lcom/iqoption/deposit/hold/StringCardFieldValue;", "apply"})
    /* compiled from: DepositHoldWarningManager.kt */
    static final class b<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        public static final b cEk = new b();

        b() {
        }

        /* renamed from: b */
        public final p<HoldWarningState> apply(k kVar) {
            kotlin.jvm.internal.i.f(kVar, "pan");
            String value = kVar.getValue();
            if (value.length() < 6) {
                return p.cI(HoldWarningState.UNDEFINED);
            }
            com.iqoption.core.microservices.billing.verification.a aVar = com.iqoption.core.microservices.billing.verification.a.boJ;
            int min = Math.min(value.length(), 6);
            if (value != null) {
                value = value.substring(0, min);
                kotlin.jvm.internal.i.e(value, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return aVar.gi(value).t(AnonymousClass1.cEl).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj());
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\n¢\u0006\u0002\b\f"}, bng = {"<anonymous>", "Lcom/iqoption/deposit/hold/HoldWarningState;", "kycData", "Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "cards", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "pan", "Lcom/iqoption/deposit/hold/StringCardFieldValue;", "month", "Lcom/iqoption/deposit/hold/IntCardFieldValue;", "year", "apply"})
    /* compiled from: DepositHoldWarningManager.kt */
    static final class c<T1, T2, T3, T4, T5, R> implements j<com.iqoption.core.microservices.kyc.response.j, List<? extends com.iqoption.core.microservices.billing.verification.response.c>, k, j, j, HoldWarningState> {
        public static final c cEm = new c();

        c() {
        }

        public final HoldWarningState a(com.iqoption.core.microservices.kyc.response.j jVar, List<com.iqoption.core.microservices.billing.verification.response.c> list, k kVar, j jVar2, j jVar3) {
            kotlin.jvm.internal.i.f(jVar, "kycData");
            kotlin.jvm.internal.i.f(list, "cards");
            kotlin.jvm.internal.i.f(kVar, "pan");
            kotlin.jvm.internal.i.f(jVar2, "month");
            kotlin.jvm.internal.i.f(jVar3, "year");
            if (!(jVar2.isCompleted() && jVar3.isCompleted())) {
                for (Object next : list) {
                    Object obj;
                    if (((com.iqoption.core.microservices.billing.verification.response.c) next).Lq() == CardStatus.VERIFIED) {
                        obj = 1;
                        continue;
                    } else {
                        obj = null;
                        continue;
                    }
                    if (obj != null) {
                        break;
                    }
                }
                Object next2 = null;
                if (next2 != null) {
                    return HoldWarningState.UNDEFINED;
                }
            }
            if (jVar.aeH().aeK() != VerificationLevel.ENHANCED) {
                return HoldWarningState.SHOW;
            }
            if (kVar.isCompleted() && e.cDV.a((List) list, kVar.getValue(), jVar2.ahd().intValue(), jVar3.ahd().intValue())) {
                return HoldWarningState.HIDE;
            }
            return HoldWarningState.SHOW;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/deposit/hold/HoldWarningState;", "binStatus", "apply"})
    /* compiled from: DepositHoldWarningManager.kt */
    static final class d<T, R> implements io.reactivex.b.g<T, org.a.b<? extends R>> {
        final /* synthetic */ g cEn;

        d(g gVar) {
            this.cEn = gVar;
        }

        /* renamed from: a */
        public final io.reactivex.e<HoldWarningState> apply(HoldWarningState holdWarningState) {
            kotlin.jvm.internal.i.f(holdWarningState, "binStatus");
            if (h.aob[holdWarningState.ordinal()] == 1) {
                return this.cEn.ary();
            }
            io.reactivex.e<HoldWarningState> cD = io.reactivex.e.cD(holdWarningState);
            kotlin.jvm.internal.i.e(cD, "Flowable.just(binStatus)");
            return cD;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "shouldShowWaring", "Lcom/iqoption/deposit/hold/HoldWarningState;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: DepositHoldWarningManager.kt */
    static final class e<T> implements io.reactivex.b.f<HoldWarningState> {
        final /* synthetic */ g cEn;

        e(g gVar) {
            this.cEn = gVar;
        }

        /* renamed from: b */
        public final void accept(HoldWarningState holdWarningState) {
            this.cEn.cEh.onNext(holdWarningState);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: DepositHoldWarningManager.kt */
    static final class f<T> implements io.reactivex.b.f<Throwable> {
        public static final f cEo = new f();

        f() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public g() {
        BehaviorProcessor bmG = BehaviorProcessor.bmG();
        kotlin.jvm.internal.i.e(bmG, "BehaviorProcessor.create<StringCardFieldValue>()");
        this.cEe = bmG;
        bmG = BehaviorProcessor.bmG();
        String str = "BehaviorProcessor.create<IntCardFieldValue>()";
        kotlin.jvm.internal.i.e(bmG, str);
        this.cEf = bmG;
        bmG = BehaviorProcessor.bmG();
        kotlin.jvm.internal.i.e(bmG, str);
        this.cEg = bmG;
        bmG = BehaviorProcessor.bmG();
        kotlin.jvm.internal.i.e(bmG, "BehaviorProcessor.create<HoldWarningState>()");
        this.cEh = bmG;
    }

    public final LiveData<HoldWarningState> arw() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(this.cEh);
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…blisher(warningProcessor)");
        return fromPublisher;
    }

    public final void start() {
        this.cyj.e(arx().bkT().k(new d(this)).a((io.reactivex.b.f) new e(this), (io.reactivex.b.f) f.cEo));
    }

    public final void stop() {
        this.cyj.clear();
    }

    private final io.reactivex.e<HoldWarningState> arx() {
        io.reactivex.e l = this.cEe.k(1, TimeUnit.SECONDS).l(b.cEk);
        kotlin.jvm.internal.i.e(l, "panProcessor\n           …      }\n                }");
        return l;
    }

    private final io.reactivex.e<HoldWarningState> ary() {
        io.reactivex.e c = com.iqoption.core.data.repository.d.bdF.WT().d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj());
        kotlin.jvm.internal.i.e(c, "KycRepository.observeVer…           .observeOn(ui)");
        io.reactivex.e c2 = com.iqoption.cardsverification.repository.a.aBI.Lo().d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj());
        kotlin.jvm.internal.i.e(c2, "VerifyCardsRepository.ob…           .observeOn(ui)");
        return com.iqoption.core.rx.g.a(c, c2, this.cEe, this.cEf, this.cEg, c.cEm);
    }

    public final void a(k kVar) {
        kotlin.jvm.internal.i.f(kVar, "pan");
        this.cEe.onNext(kVar);
    }

    public final void a(j jVar) {
        kotlin.jvm.internal.i.f(jVar, "month");
        this.cEf.onNext(jVar);
    }

    public final void b(j jVar) {
        kotlin.jvm.internal.i.f(jVar, "year");
        this.cEg.onNext(jVar);
    }
}
