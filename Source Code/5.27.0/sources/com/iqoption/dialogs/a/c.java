package com.iqoption.dialogs.a;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStores;
import com.google.common.util.concurrent.AtomicDouble;
import com.iqoption.core.data.repository.f;
import com.iqoption.core.ui.f.d;
import com.iqoption.core.util.TimeUtil;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.i;
import org.a.b;
import org.threeten.bp.Instant;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.h;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/dialogs/custodial/CustodialFeeViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "input", "Lcom/iqoption/dialogs/custodial/CustodialFeeInput;", "(Lcom/iqoption/dialogs/custodial/CustodialFeeInput;)V", "positionCreatedDateTime", "Lorg/threeten/bp/Instant;", "kotlin.jvm.PlatformType", "schedule", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/dialogs/custodial/ScheduleItem;", "getSchedule", "()Landroidx/lifecycle/LiveData;", "scheduleData", "Landroidx/lifecycle/MutableLiveData;", "createScheduleItem", "from", "Lcom/iqoption/core/microservices/risks/response/custodialfee/CustodialPeriod;", "to", "currency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "investment", "Lcom/google/common/util/concurrent/AtomicDouble;", "Companion", "dialogs_release"})
/* compiled from: CustodialFeeViewModel.kt */
public final class c extends d {
    private static final String TAG = c.class.getSimpleName();
    public static final a cLQ = new a();
    private final Instant cLM = Instant.dt(this.cLP.auN());
    private final MutableLiveData<List<d>> cLN = new MutableLiveData();
    private final LiveData<List<d>> cLO = this.cLN;
    private final b cLP;

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\u00020\u0004*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/dialogs/custodial/CustodialFeeViewModel$Companion;", "", "()V", "AGE_UNITS_IN_MONTH", "", "TAG", "", "kotlin.jvm.PlatformType", "get", "Lcom/iqoption/dialogs/custodial/CustodialFeeViewModel;", "f", "Landroidx/fragment/app/Fragment;", "input", "Lcom/iqoption/dialogs/custodial/CustodialFeeInput;", "asMonths", "dialogs_release"})
    /* compiled from: CustodialFeeViewModel.kt */
    public static final class a {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, bng = {"com/iqoption/dialogs/custodial/CustodialFeeViewModel$Companion$get$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "dialogs_release"})
        /* compiled from: CustodialFeeViewModel.kt */
        public static final class a implements Factory {
            final /* synthetic */ b cLV;

            a(b bVar) {
                this.cLV = bVar;
            }

            public <T extends ViewModel> T create(Class<T> cls) {
                kotlin.jvm.internal.i.f(cls, "modelClass");
                return new c(this.cLV);
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final int fI(int i) {
            double d = (double) i;
            double d2 = (double) 30;
            Double.isNaN(d);
            Double.isNaN(d2);
            return c.S(d / d2);
        }

        public final c a(Fragment fragment, b bVar) {
            kotlin.jvm.internal.i.f(fragment, "f");
            kotlin.jvm.internal.i.f(bVar, "input");
            ViewModel viewModel = new ViewModelProvider(ViewModelStores.of(fragment), (Factory) new a(bVar)).get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(f)\n    }[T::class.java]");
            return (c) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/dialogs/custodial/ScheduleItem;", "kotlin.jvm.PlatformType", "balanceData", "Lcom/iqoption/core/data/mediators/BalanceData;", "apply"})
    /* compiled from: CustodialFeeViewModel.kt */
    /* renamed from: com.iqoption.dialogs.a.c$1 */
    static final class AnonymousClass1<T, R> implements g<T, b<? extends R>> {
        final /* synthetic */ c cLR;

        AnonymousClass1(c cVar) {
            this.cLR = cVar;
        }

        /* renamed from: c */
        public final e<List<d>> apply(com.iqoption.core.data.c.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "balanceData");
            final com.iqoption.core.microservices.configuration.a.d VM = aVar.VM();
            return f.bdW.F(this.cLR.cLP.getInstrumentType()).g(new g<T, R>(this) {
                final /* synthetic */ AnonymousClass1 cLS;

                /* renamed from: w */
                public final List<d> apply(Map<Integer, com.iqoption.core.microservices.risks.response.b.b> map) {
                    kotlin.jvm.internal.i.f(map, "custodialFee");
                    List arrayList = new ArrayList();
                    com.iqoption.core.microservices.risks.response.b.b bVar = (com.iqoption.core.microservices.risks.response.b.b) map.get(Integer.valueOf(this.cLS.cLR.cLP.getActiveId()));
                    if (bVar != null) {
                        com.iqoption.core.microservices.risks.response.b.c cVar = (com.iqoption.core.microservices.risks.response.b.c) null;
                        int size = bVar.ahf().size() + 1;
                        AtomicDouble atomicDouble = new AtomicDouble(this.cLS.cLR.cLP.auM());
                        int i = 0;
                        while (i < size) {
                            com.iqoption.core.microservices.risks.response.b.c cVar2 = (com.iqoption.core.microservices.risks.response.b.c) u.h(bVar.ahf(), i);
                            arrayList.add(this.cLS.cLR.a(cVar, cVar2, VM, atomicDouble));
                            i++;
                            cVar = cVar2;
                        }
                    }
                    return arrayList;
                }
            });
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "schedule", "", "Lcom/iqoption/dialogs/custodial/ScheduleItem;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: CustodialFeeViewModel.kt */
    /* renamed from: com.iqoption.dialogs.a.c$2 */
    static final class AnonymousClass2<T> implements io.reactivex.b.f<List<d>> {
        final /* synthetic */ c cLR;

        AnonymousClass2(c cVar) {
            this.cLR = cVar;
        }

        /* renamed from: v */
        public final void accept(List<d> list) {
            this.cLR.cLN.postValue(list);
        }
    }

    public c(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "input");
        this.cLP = bVar;
        io.reactivex.disposables.b a = com.iqoption.core.data.c.b.bcS.VS().bkV().s(new AnonymousClass1(this)).d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass2(this), (io.reactivex.b.f) AnonymousClass3.cLU);
        kotlin.jvm.internal.i.e(a, "BalanceMediator.observeS…      \n                })");
        b(a);
    }

    public final LiveData<List<d>> auO() {
        return this.cLO;
    }

    private final d a(com.iqoption.core.microservices.risks.response.b.c cVar, com.iqoption.core.microservices.risks.response.b.c cVar2, com.iqoption.core.microservices.configuration.a.d dVar, AtomicDouble atomicDouble) {
        boolean z;
        String str;
        String str2;
        boolean z2 = false;
        int ahg = cVar != null ? cVar.ahg() : 0;
        String str3 = (String) null;
        String str4 = " M";
        String str5 = "";
        String a;
        if (cVar != null) {
            StringBuilder stringBuilder;
            if (cVar2 != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(cLQ.fI(cVar.ahg()));
                stringBuilder.append('-');
                stringBuilder.append(cLQ.fI(cVar2.ahg()));
                stringBuilder.append(str4);
                str3 = stringBuilder.toString();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append('>');
                stringBuilder.append(cLQ.fI(cVar.ahg()));
                stringBuilder.append(str4);
                str3 = stringBuilder.toString();
            }
            str4 = TimeUtil.bRM.ay(this.cLM.d((long) cVar.ahg(), (h) ChronoUnit.DAYS).toEpochMilli());
            a = com.iqoption.core.util.e.a(cVar.agx(), null, 1, null);
            double agx = (cVar.agx() / 100.0d) * atomicDouble.get();
            atomicDouble.d(-agx);
            str5 = com.iqoption.core.util.e.a(agx, dVar, false, 2, null);
            if (this.cLP.getCustodialLastAge() == cVar.ahg()) {
                z2 = true;
            }
            z = z2;
            str = str3;
            str2 = str5;
            str5 = a;
        } else if (cVar2 != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append('<');
            stringBuilder2.append(cLQ.fI(cVar2.ahg()));
            stringBuilder2.append(str4);
            a = stringBuilder2.toString();
            str3 = com.iqoption.core.d.getString(com.iqoption.dialogs.d.f.no_fee);
            if (this.cLP.getCustodialLastAge() == 0) {
                z2 = true;
            }
            z = z2;
            str = a;
            str4 = str3;
            str2 = str5;
        } else {
            str4 = str3;
            str = str5;
            str2 = str;
            z = false;
        }
        return new d(ahg, str, str4, str5, str2, z);
    }
}
