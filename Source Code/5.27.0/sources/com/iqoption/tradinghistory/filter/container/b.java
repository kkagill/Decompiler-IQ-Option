package com.iqoption.tradinghistory.filter.container;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.microservices.tradingengine.response.active.d;
import com.iqoption.tradinghistory.f;
import com.iqoption.tradinghistory.h;
import io.reactivex.b.g;
import java.util.List;
import java.util.Map;
import kotlin.i;
import kotlin.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\bJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/tradinghistory/filter/container/TradingHistoryFiltersViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "selectionViewModel", "Lcom/iqoption/tradinghistory/TradingHistorySelectionViewModel;", "filterValues", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/tradinghistory/filter/container/TradingHistoryFilterType;", "", "formatActiveFilter", "filter", "Lcom/iqoption/tradinghistory/ActiveFilter;", "formatDateFilter", "Lcom/iqoption/tradinghistory/DateFilter;", "formatInstrumentFilter", "Lcom/iqoption/tradinghistory/InstrumentFilter;", "Companion", "tradinghistory_release"})
/* compiled from: TradingHistoryFiltersViewModel.kt */
public final class b extends AndroidViewModel {
    public static final a dXY = new a();
    private com.iqoption.tradinghistory.i dXw;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/tradinghistory/filter/container/TradingHistoryFiltersViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/tradinghistory/filter/container/TradingHistoryFiltersViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "tradinghistory_release"})
    /* compiled from: TradingHistoryFiltersViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b aY(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ersViewModel::class.java]");
            b bVar = (b) viewModel;
            bVar.dXw = com.iqoption.tradinghistory.i.dVq.aV(fragment);
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "Lcom/iqoption/tradinghistory/filter/container/TradingHistoryFilterType;", "", "filters", "Lcom/iqoption/tradinghistory/TradingHistoryFilters;", "apply"})
    /* compiled from: TradingHistoryFiltersViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        final /* synthetic */ b dXZ;

        b(b bVar) {
            this.dXZ = bVar;
        }

        /* renamed from: c */
        public final Map<TradingHistoryFilterType, String> apply(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "filters");
            return af.a(j.x(TradingHistoryFilterType.INSTRUMENT, this.dXZ.b(hVar.aVm())), j.x(TradingHistoryFilterType.BALANCE, com.iqoption.tradinghistory.filter.b.a.e(hVar.VL())), j.x(TradingHistoryFilterType.ACTIVE, this.dXZ.b(hVar.aVn())), j.x(TradingHistoryFilterType.DATE, this.dXZ.b(hVar.aVo())));
        }
    }

    public b(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
    }

    public final LiveData<Map<TradingHistoryFilterType, String>> aVV() {
        com.iqoption.tradinghistory.i iVar = this.dXw;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(iVar.aVp().c(com.iqoption.core.rx.i.akj()).g(new b(this)));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…              }\n        )");
        return fromPublisher;
    }

    private final String b(f fVar) {
        Application a = com.iqoption.core.ext.a.a((AndroidViewModel) this);
        if (fVar.aVe()) {
            String string = a.getString(com.iqoption.tradinghistory.g.f.all_instruments);
            kotlin.jvm.internal.i.e(string, "context.getString(R.string.all_instruments)");
            return string;
        }
        List aVg = fVar.aVg();
        if (aVg == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return u.a(aVg, ", ", null, null, 0, null, new TradingHistoryFiltersViewModel$formatInstrumentFilter$1(a), 30, null);
    }

    private final String b(com.iqoption.tradinghistory.a aVar) {
        Application a = com.iqoption.core.ext.a.a((AndroidViewModel) this);
        StringBuilder stringBuilder = new StringBuilder();
        if (aVar.aVe()) {
            stringBuilder.append(a.getString(com.iqoption.tradinghistory.g.f.all_assets));
        } else {
            List aVg = aVar.aVg();
            if (aVg == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            int size = aVg.size();
            for (int i = 0; i < size; i++) {
                if (i == 3) {
                    stringBuilder.append(' ');
                    stringBuilder.append('&');
                    stringBuilder.append(' ');
                    stringBuilder.append(size - 3);
                    stringBuilder.append(' ');
                    stringBuilder.append(a.getString(com.iqoption.tradinghistory.g.f.more));
                    break;
                }
                com.iqoption.core.microservices.tradingengine.response.active.a Jt = ((com.iqoption.tradinghistory.filter.a.a) aVar.aVg().get(i)).Jt();
                if (Jt != null) {
                    if ((((CharSequence) stringBuilder).length() > 0 ? 1 : null) != null) {
                        stringBuilder.append(',');
                        stringBuilder.append(' ');
                    }
                    stringBuilder.append(d.B(Jt));
                }
            }
        }
        String stringBuilder2 = stringBuilder.toString();
        kotlin.jvm.internal.i.e(stringBuilder2, "builder.toString()");
        return stringBuilder2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A:{SYNTHETIC, RETURN} */
    private final java.lang.String b(com.iqoption.tradinghistory.d r6) {
        /*
        r5 = this;
        r0 = com.iqoption.tradinghistory.filter.c.b.dYj;
        r0 = r0.aVY();
        r0 = r0.entrySet();
        r0 = r0.iterator();
    L_0x000e:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0031;
    L_0x0014:
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        r2 = r1.getValue();
        r2 = (com.iqoption.tradinghistory.d) r2;
        r2 = kotlin.jvm.internal.i.y(r2, r6);
        if (r2 == 0) goto L_0x000e;
    L_0x0026:
        r0 = r1.getKey();
        r0 = (java.lang.Number) r0;
        r0 = r0.intValue();
        goto L_0x0032;
    L_0x0031:
        r0 = -1;
    L_0x0032:
        r1 = com.iqoption.core.ext.a.a(r5);
        r2 = r6.aVj();
        r6 = r6.aVk();
        r3 = com.iqoption.tradinghistory.g.d.today;
        if (r0 != r3) goto L_0x004f;
    L_0x0042:
        r6 = com.iqoption.tradinghistory.g.f.today;
        r6 = r1.getString(r6);
        r0 = "context.getString(R.string.today)";
        kotlin.jvm.internal.i.e(r6, r0);
        goto L_0x00fd;
    L_0x004f:
        r3 = com.iqoption.tradinghistory.g.d.yestarday;
        if (r0 != r3) goto L_0x0060;
    L_0x0053:
        r6 = com.iqoption.tradinghistory.g.f.yesterday;
        r6 = r1.getString(r6);
        r0 = "context.getString(R.string.yesterday)";
        kotlin.jvm.internal.i.e(r6, r0);
        goto L_0x00fd;
    L_0x0060:
        r3 = com.iqoption.tradinghistory.g.d.lastSevenDay;
        if (r0 != r3) goto L_0x0071;
    L_0x0064:
        r6 = com.iqoption.tradinghistory.g.f.last_7_days;
        r6 = r1.getString(r6);
        r0 = "context.getString(R.string.last_7_days)";
        kotlin.jvm.internal.i.e(r6, r0);
        goto L_0x00fd;
    L_0x0071:
        r3 = com.iqoption.tradinghistory.g.d.last30days;
        if (r0 != r3) goto L_0x0082;
    L_0x0075:
        r6 = com.iqoption.tradinghistory.g.f.last_30_days;
        r6 = r1.getString(r6);
        r0 = "context.getString(R.string.last_30_days)";
        kotlin.jvm.internal.i.e(r6, r0);
        goto L_0x00fd;
    L_0x0082:
        r3 = com.iqoption.tradinghistory.g.d.threeMonths;
        if (r0 != r3) goto L_0x0093;
    L_0x0086:
        r6 = com.iqoption.tradinghistory.g.f.month_3;
        r6 = r1.getString(r6);
        r0 = "context.getString(R.string.month_3)";
        kotlin.jvm.internal.i.e(r6, r0);
        goto L_0x00fd;
    L_0x0093:
        r3 = com.iqoption.tradinghistory.g.d.allTime;
        r4 = "context.getString(R.string.all_time)";
        if (r0 != r3) goto L_0x00a3;
    L_0x0099:
        r6 = com.iqoption.tradinghistory.g.f.all_time;
        r6 = r1.getString(r6);
        kotlin.jvm.internal.i.e(r6, r4);
        goto L_0x00fd;
    L_0x00a3:
        if (r2 != 0) goto L_0x00b1;
    L_0x00a5:
        if (r6 != 0) goto L_0x00b1;
    L_0x00a7:
        r6 = com.iqoption.tradinghistory.g.f.all_time;
        r6 = r1.getString(r6);
        kotlin.jvm.internal.i.e(r6, r4);
        goto L_0x00fd;
    L_0x00b1:
        r0 = kotlin.jvm.internal.i.y(r2, r6);
        if (r0 == 0) goto L_0x00c9;
    L_0x00b7:
        if (r2 == 0) goto L_0x00c9;
    L_0x00b9:
        r6 = com.iqoption.core.util.TimeUtil.bRz;
        r0 = r2.getDate();
        r6 = r6.format(r0);
        r0 = "TimeUtil.date.format(from.date)";
        kotlin.jvm.internal.i.e(r6, r0);
        goto L_0x00fd;
    L_0x00c9:
        if (r2 == 0) goto L_0x00d9;
    L_0x00cb:
        r0 = com.iqoption.core.util.TimeUtil.bRz;
        r1 = r2.getDate();
        r0 = r0.format(r1);
        if (r0 == 0) goto L_0x00d9;
    L_0x00d7:
        r6 = r0;
        goto L_0x00f8;
    L_0x00d9:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = " - ";
        r0.append(r1);
        if (r6 == 0) goto L_0x00f0;
    L_0x00e5:
        r1 = com.iqoption.core.util.TimeUtil.bRz;
        r6 = r6.getDate();
        r6 = r1.format(r6);
        goto L_0x00f1;
    L_0x00f0:
        r6 = 0;
    L_0x00f1:
        r0.append(r6);
        r6 = r0.toString();
    L_0x00f8:
        if (r6 == 0) goto L_0x00fb;
    L_0x00fa:
        goto L_0x00fd;
    L_0x00fb:
        r6 = "";
    L_0x00fd:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.filter.container.b.b(com.iqoption.tradinghistory.d):java.lang.String");
    }
}
