package com.iqoption.signals;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.f;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.signals.a.c;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/signals/SignalsFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/signals/databinding/FragmentSignalsBinding;", "filtersWindow", "Lcom/iqoption/core/ui/widget/window/OptionsWindow;", "getFiltersWindow", "()Lcom/iqoption/core/ui/widget/window/OptionsWindow;", "filtersWindow$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/iqoption/signals/SignalsViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_optionXRelease"})
/* compiled from: SignalsFragment.kt */
public final class q extends d {
    private static final String TAG = q.class.getName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(q.class), "filtersWindow", "getFiltersWindow()Lcom/iqoption/core/ui/widget/window/OptionsWindow;"))};
    public static final a dTF = new a();
    private HashMap apm;
    private c dTC;
    private r dTD;
    private final kotlin.d dTE = g.c(new SignalsFragment$filtersWindow$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, bng = {"Lcom/iqoption/signals/SignalsFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/signals/SignalsFragment;", "showSignal", "", "signalItem", "Lcom/iqoption/signals/SignalItem;", "app_optionXRelease"})
    /* compiled from: SignalsFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final q aUo() {
            return new q();
        }

        public final void b(f fVar) {
            kotlin.jvm.internal.i.f(fVar, "signalItem");
            com.iqoption.core.microservices.pricemovements.a.a aUd = fVar.aUd();
            com.iqoption.core.microservices.tradingengine.response.active.a Jt = fVar.Jt();
            TabHelper.IM().u(Jt);
            String B = com.iqoption.core.microservices.tradingengine.response.active.d.B(Jt);
            String type = fVar.getType();
            String value = fVar.getValue();
            String str = "active_id";
            str = "start_time";
            str = "finish_time";
            str = "start_value";
            str = "finish_value";
            str = "isHigh";
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, f.equal(Integer.valueOf(aUd.getType()), Integer.valueOf(10)) ? "signals_show-signal-move-now" : "signals_show-signal-today").setValue(Double.valueOf((double) aUd.getId())).setParameters(u.anp().o("type", Integer.valueOf(aUd.getType())).o("created", Long.valueOf(aUd.getCreated())).o(str, Integer.valueOf(aUd.getActiveId())).o(str, Long.valueOf(aUd.getStartTime())).o(str, Long.valueOf(aUd.agu())).o(str, Double.valueOf(aUd.agv())).o(str, Double.valueOf(aUd.agw())).o(str, Boolean.valueOf(aUd.agy())).anr()).build());
            com.iqoption.gl.c.aIy().tabShowSignal(0, aUd.getActiveId(), aUd.getStartTime(), aUd.agu(), aUd.agv(), aUd.agw(), B, type, value, true, aUd.getId(), Jt.getInstrumentType().getOptionActiveOrInstrumentValue());
            EventManager BS = EventManager.BS();
            Builder Builder = Event.Builder(Event.CATEGORY_POPUP_SERVED, "left-bar_new-tab-signals-history");
            TabHelper IM = TabHelper.IM();
            kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
            BS.a(Builder.setValue(Double.valueOf((double) IM.getTabsCount())).setParameters(u.anp().o("instrument_type", Jt.getInstrumentType().getServerValue()).anr()).build());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, bng = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Object;)V", "com/iqoption/util/LiveDatasKt$observe$1", "com/iqoption/signals/SignalsFragment$$special$$inlined$observe$1"})
    /* compiled from: LiveDatas.kt */
    public static final class b<T> implements Observer<T> {
        final /* synthetic */ q $fragment$inlined;
        final /* synthetic */ m dTI;
        final /* synthetic */ q this$0;

        @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/signals/SignalsViewState;", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/signals/SignalsFragment$onCreateView$1$1$1", "com/iqoption/signals/SignalsFragment$$special$$inlined$observe$1$lambda$1"})
        /* compiled from: SignalsFragment.kt */
        /* renamed from: com.iqoption.signals.q$b$1 */
        static final class AnonymousClass1<T> implements Observer<t> {
            final /* synthetic */ b dTJ;

            AnonymousClass1(b bVar) {
                this.dTJ = bVar;
            }

            /* renamed from: a */
            public final void onChanged(t tVar) {
                if (tVar != null) {
                    this.dTJ.dTI.w(tVar.getItems());
                }
            }
        }

        public b(m mVar, q qVar, q qVar2) {
            this.dTI = mVar;
            this.this$0 = qVar;
            this.$fragment$inlined = qVar2;
        }

        public final void onChanged(T t) {
            if (t != null && !((Boolean) t).booleanValue()) {
                q.a(this.this$0).getState().observe(this.$fragment$inlined, new AnonymousClass1(this));
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final com.iqoption.core.ui.widget.i.a aUn() {
        kotlin.d dVar = this.dTE;
        j jVar = anY[0];
        return (com.iqoption.core.ui.widget.i.a) dVar.getValue();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ r a(q qVar) {
        r rVar = qVar.dTD;
        if (rVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return rVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dTC = (c) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_signals, viewGroup, false, 4, null);
        this.dTD = r.dTN.E(com.iqoption.core.ext.a.r(this));
        q qVar = this;
        c cVar = this.dTC;
        String str = "binding";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        m mVar = new m(new SignalsFragment$onCreateView$$inlined$apply$lambda$1(this, qVar));
        cVar.dUc.setHasFixedSize(true);
        RecyclerView recyclerView = cVar.dUc;
        kotlin.jvm.internal.i.e(recyclerView, "signalList");
        recyclerView.setAdapter(mVar);
        com.iqoption.core.ui.f.a.bJH.B(com.iqoption.core.ext.a.v(this)).alI().observe(qVar, new b(mVar, this, qVar));
        r rVar = this.dTD;
        if (rVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        rVar.reload();
        c cVar2 = this.dTC;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return cVar2.getRoot();
    }
}
