package com.iqoption.withdraw.c;

import android.app.Application;
import androidx.annotation.StringRes;
import androidx.arch.core.util.Function;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.microservices.withdraw.response.PayoutFieldType;
import com.iqoption.core.microservices.withdraw.response.WithdrawMethodType;
import com.iqoption.core.microservices.withdraw.response.l;
import com.iqoption.core.util.z;
import com.iqoption.withdraw.fields.g;
import com.iqoption.withdraw.h;
import com.iqoption.withdraw.j;
import io.card.payment.CardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u0000 52\u00020\u0001:\u00015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\"\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010 \u001a\n !*\u0004\u0018\u00010\u001b0\u001b2\b\b\u0001\u0010\"\u001a\u00020#H\u0002J3\u0010 \u001a\n !*\u0004\u0018\u00010\u001b0\u001b2\b\b\u0001\u0010\"\u001a\u00020#2\u0012\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0%\"\u00020&H\u0002¢\u0006\u0002\u0010'J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*J\u0014\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0002J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0.2\u0006\u0010/\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dJ \u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00103\u001a\u000204H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u00066"}, bng = {"Lcom/iqoption/withdraw/methods/WithdrawMethodsViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableAndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "fieldsViewModel", "Lcom/iqoption/withdraw/fields/WithdrawFieldsViewModel;", "prevMethodsLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/withdraw/WithdrawRepositoryMethodsData;", "selectionViewModel", "Lcom/iqoption/withdraw/WithdrawSelectionViewModel;", "compose", "Lcom/iqoption/withdraw/methods/WithdrawMethodsData;", "methodsData", "createCardAmountField", "Lcom/iqoption/core/microservices/withdraw/response/PayoutField;", "createCardWithdrawMethod", "Lcom/iqoption/core/microservices/withdraw/response/CardWithdrawMethod;", "card", "Lcom/iqoption/core/microservices/withdraw/response/Card;", "bankCardServerMethod", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethod;", "balanceHolder", "Lcom/iqoption/withdraw/methods/BalanceHolder;", "getMethodWarningMessage", "", "method", "Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "availableType", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethodType;", "getString", "kotlin.jvm.PlatformType", "id", "", "arguments", "", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getWithdrawData", "useCache", "", "refresh", "networkRequest", "prepareMethods", "", "cardsAndMethods", "selectMethod", "", "data", "maxAmount", "", "Companion", "withdraw_release"})
/* compiled from: WithdrawMethodsViewModel.kt */
public final class f extends com.iqoption.core.ui.f.c {
    public static final a etn = new a();
    private j erP;
    private LiveData<z<com.iqoption.withdraw.i>> etl;
    private g etm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/withdraw/methods/WithdrawMethodsViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/withdraw/methods/WithdrawMethodsViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "withdraw_release"})
    /* compiled from: WithdrawMethodsViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final f bD(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(f.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…odsViewModel::class.java]");
            f fVar = (f) viewModel;
            fVar.etm = g.erT.bB(com.iqoption.withdraw.f.epg.aj(fragment));
            fVar.erP = j.epC.bz(fragment);
            return fVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"})
    /* compiled from: Comparisons.kt */
    public static final class e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            com.iqoption.core.microservices.withdraw.response.a ajF = ((com.iqoption.core.microservices.withdraw.response.c) t2).ajF();
            Double d = null;
            Comparable valueOf = ajF != null ? Double.valueOf(ajF.getValue()) : null;
            com.iqoption.core.microservices.withdraw.response.a ajF2 = ((com.iqoption.core.microservices.withdraw.response.c) t).ajF();
            if (ajF2 != null) {
                d = Double.valueOf(ajF2.getValue());
            }
            return b.c(valueOf, d);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/withdraw/WithdrawRepositoryMethodsData;", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/withdraw/methods/WithdrawMethodsViewModel$getWithdrawData$liveData$1$2"})
    /* compiled from: WithdrawMethodsViewModel.kt */
    static final class b<T> implements Observer<S> {
        final /* synthetic */ MediatorLiveData eto;
        final /* synthetic */ f etp;
        final /* synthetic */ boolean etq;
        final /* synthetic */ boolean etr;
        final /* synthetic */ boolean ets;

        b(MediatorLiveData mediatorLiveData, f fVar, boolean z, boolean z2, boolean z3) {
            this.eto = mediatorLiveData;
            this.etp = fVar;
            this.etq = z;
            this.etr = z2;
            this.ets = z3;
        }

        /* renamed from: f */
        public final void onChanged(z<com.iqoption.withdraw.i> zVar) {
            if (zVar != null || !this.ets) {
                this.eto.postValue(zVar);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/withdraw/methods/WithdrawMethodsData;", "methods", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/withdraw/WithdrawRepositoryMethodsData;", "kotlin.jvm.PlatformType", "apply"})
    /* compiled from: WithdrawMethodsViewModel.kt */
    static final class c<I, O> implements Function<X, Y> {
        final /* synthetic */ f etp;

        c(f fVar) {
            this.etp = fVar;
        }

        /* renamed from: h */
        public final d apply(z<com.iqoption.withdraw.i> zVar) {
            com.iqoption.withdraw.i iVar = (com.iqoption.withdraw.i) zVar.anw();
            if (iVar != null) {
                com.iqoption.core.microservices.withdraw.response.i bbS = iVar.bbS();
                if (bbS != null) {
                    f.a(this.etp).a(bbS);
                }
            }
            return this.etp.b(zVar != null ? (com.iqoption.withdraw.i) zVar.anw() : null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/withdraw/WithdrawRepositoryMethodsData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawMethodsViewModel.kt */
    static final class d<T> implements Observer<S> {
        final /* synthetic */ MediatorLiveData eto;

        d(MediatorLiveData mediatorLiveData) {
            this.eto = mediatorLiveData;
        }

        /* renamed from: f */
        public final void onChanged(z<com.iqoption.withdraw.i> zVar) {
            this.eto.postValue(zVar);
        }
    }

    public f(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
    }

    public static final /* synthetic */ j a(f fVar) {
        j jVar = fVar.erP;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar;
    }

    public final void a(d dVar, com.iqoption.core.microservices.withdraw.response.c cVar) {
        double min;
        kotlin.jvm.internal.i.f(dVar, "data");
        kotlin.jvm.internal.i.f(cVar, "method");
        double doubleValue = dVar.VL().aeo().doubleValue();
        com.iqoption.core.microservices.withdraw.response.e eVar = (com.iqoption.core.microservices.withdraw.response.e) (!(cVar instanceof com.iqoption.core.microservices.withdraw.response.e) ? null : cVar);
        Double valueOf = eVar != null ? Double.valueOf(eVar.ajG()) : null;
        Double d = (Double) dVar.bbV().get(Long.valueOf(cVar.getId()));
        com.iqoption.core.microservices.withdraw.response.a a = com.iqoption.core.microservices.withdraw.response.b.a(doubleValue, d, cVar.ajB(), valueOf, cVar.ajE());
        if (d != null) {
            min = Math.min(d.doubleValue(), a.getValue());
        } else {
            min = a.getValue();
        }
        a(dVar, cVar, min);
    }

    private final void a(d dVar, com.iqoption.core.microservices.withdraw.response.c cVar, double d) {
        g gVar = this.etm;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("fieldsViewModel");
        }
        gVar.d(new com.iqoption.withdraw.fields.c(cVar, dVar.bbS(), dVar.VL(), d, dVar.VM(), dVar.bch()));
    }

    public final LiveData<d> o(boolean z, boolean z2) {
        LiveData liveData = this.etl;
        boolean z3 = (liveData != null ? (z) liveData.getValue() : null) != null;
        if (z3) {
            MediatorLiveData mediatorLiveData = new MediatorLiveData();
            if (z) {
                LiveData liveData2 = this.etl;
                if (liveData2 == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                mediatorLiveData.addSource(liveData2, new d(mediatorLiveData));
            }
            if (z2) {
                mediatorLiveData.addSource(bda(), new b(mediatorLiveData, this, z, z2, z3));
            }
            liveData = mediatorLiveData;
        } else {
            liveData = bda();
        }
        this.etl = liveData;
        LiveData map = Transformations.map(liveData, new c(this));
        kotlin.jvm.internal.i.e(map, "Transformations.map(live…s?.getOrNull())\n        }");
        return map;
    }

    private final LiveData<z<com.iqoption.withdraw.i>> bda() {
        return h.epl.bbT();
    }

    private final d b(com.iqoption.withdraw.i iVar) {
        com.iqoption.withdraw.i iVar2 = iVar;
        if (iVar2 == null) {
            return null;
        }
        Object obj;
        Iterable<com.iqoption.core.microservices.withdraw.response.d> bbR = iVar.bbR();
        Collection arrayList = new ArrayList(n.e(bbR, 10));
        for (com.iqoption.core.microservices.withdraw.response.d ajG : bbR) {
            arrayList.add(Double.valueOf(ajG.ajG()));
        }
        Collection arrayList2 = new ArrayList();
        Iterator it = ((List) arrayList).iterator();
        while (true) {
            obj = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) next).doubleValue() <= ((double) null)) {
                obj = null;
            }
            if (obj != null) {
                arrayList2.add(next);
            }
        }
        double ab = u.ab((List) arrayList2);
        if (ab <= ((double) null)) {
            obj = null;
        }
        WithdrawMethodType withdrawMethodType = obj != null ? WithdrawMethodType.CARD : WithdrawMethodType.COMMON;
        com.iqoption.core.microservices.internalbilling.a.b VL = iVar.VL();
        com.iqoption.core.microservices.configuration.a.d VM = iVar.VM();
        a aVar = new a(getContext(), VL, VM, iVar.bbV(), ab);
        List<com.iqoption.core.microservices.withdraw.response.c> a = a(iVar2, aVar);
        Map linkedHashMap = new LinkedHashMap();
        for (com.iqoption.core.microservices.withdraw.response.c cVar : a) {
            String a2 = a(cVar, withdrawMethodType, aVar);
            if (a2 != null) {
                String str = (String) linkedHashMap.put(cVar, a2);
            }
        }
        return new d(a, iVar.bbS(), VL, VM, withdrawMethodType, linkedHashMap, ab, iVar.bbV());
    }

    private final List<com.iqoption.core.microservices.withdraw.response.c> a(com.iqoption.withdraw.i iVar, a aVar) {
        a aVar2 = aVar;
        List arrayList = new ArrayList();
        for (l lVar : iVar.ajQ()) {
            if (kotlin.jvm.internal.i.y(lVar.aaG(), "bank_card")) {
                for (com.iqoption.core.microservices.withdraw.response.d dVar : iVar.bbR()) {
                    if (dVar.ajG() > ((double) 0)) {
                        arrayList.add(a(dVar, lVar, aVar2));
                    }
                }
            } else {
                arrayList.add(l.a(lVar, 0, null, 0.0d, null, u.a((Iterable) lVar.ajD(), g.ett), null, null, null, aVar2.a(lVar), 239, null));
            }
        }
        return u.a((Iterable) arrayList, (Comparator) new e());
    }

    private final com.iqoption.core.microservices.withdraw.response.e a(com.iqoption.core.microservices.withdraw.response.d dVar, l lVar, a aVar) {
        String number = dVar.getNumber();
        CardType hm = com.iqoption.core.util.c.hm(number);
        if (hm == null) {
            hm = CardType.UNKNOWN;
        }
        CardType cardType = hm;
        int length = number.length() - 4;
        if (number != null) {
            kotlin.jvm.internal.i.e(number.substring(length), "(this as java.lang.String).substring(startIndex)");
            double ajG = dVar.ajG();
            long id = lVar.getId();
            long id2 = dVar.getId();
            String string = getString(com.iqoption.withdraw.d.f.card_n1, number);
            kotlin.jvm.internal.i.e(string, "getString(R.string.card_n1, cardEndDigits)");
            return new com.iqoption.core.microservices.withdraw.response.e(id, string, 0.0d, lVar.ajC(), l.listOf(bdb()), id2, ajG, dVar.ajH(), cardType, lVar.ajE(), aVar.a(lVar.getId(), 0.0d, Double.valueOf(ajG), lVar.ajE()));
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    private final com.iqoption.core.microservices.withdraw.response.h bdb() {
        String string = getString(com.iqoption.withdraw.d.f.amount);
        kotlin.jvm.internal.i.e(string, "getString(R.string.amount)");
        return new com.iqoption.core.microservices.withdraw.response.h("amount", string, "front.amount", PayoutFieldType.TEXT, "\\d+|\\d+\\.\\d{1,2}", 255, true, "");
    }

    private final String a(com.iqoption.core.microservices.withdraw.response.c cVar, WithdrawMethodType withdrawMethodType, a aVar) {
        WithdrawMethodType ajz = cVar.ajz();
        if (withdrawMethodType == ajz) {
            return (!(cVar instanceof com.iqoption.core.microservices.withdraw.response.e) || ((com.iqoption.core.microservices.withdraw.response.e) cVar).ajG() > ((double) null)) ? null : getString(com.iqoption.withdraw.d.f.amount_cannot_exeed);
        } else {
            if (ajz == WithdrawMethodType.CARD) {
                return getString(com.iqoption.withdraw.d.f.remaining_refund_hint_2);
            }
            return getString(com.iqoption.withdraw.d.f.you_need_first_withdraw_refund_n1, aVar.bcV());
        }
    }

    private final String getString(@StringRes int i) {
        return getApplication().getString(i);
    }

    private final String getString(@StringRes int i, Object... objArr) {
        return getApplication().getString(i, Arrays.copyOf(objArr, objArr.length));
    }
}
