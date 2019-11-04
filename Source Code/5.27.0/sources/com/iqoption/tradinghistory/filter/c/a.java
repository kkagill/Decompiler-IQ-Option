package com.iqoption.tradinghistory.filter.c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.g;
import com.iqoption.tradinghistory.a.m;
import com.iqoption.tradinghistory.materialcalendar.MaterialCalendarView;
import com.iqoption.tradinghistory.materialcalendar.o;
import com.iqoption.tradinghistory.materialcalendar.q;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0012\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0010H\u0002J\u001a\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u0006'"}, bng = {"Lcom/iqoption/tradinghistory/filter/date/DateFilterFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/tradinghistory/databinding/FragmentTradingHistorySetDateBinding;", "dateRangeListener", "Lcom/iqoption/tradinghistory/materialcalendar/OnRangeSelectedListener;", "dateSelectedListener", "Lcom/iqoption/tradinghistory/materialcalendar/OnDateSelectedListener;", "from", "Lcom/iqoption/tradinghistory/materialcalendar/CalendarDay;", "isPresetSet", "", "presets", "", "", "Lcom/iqoption/tradinghistory/DateFilter;", "presetsCheckListener", "com/iqoption/tradinghistory/filter/date/DateFilterFragment$presetsCheckListener$1", "Lcom/iqoption/tradinghistory/filter/date/DateFilterFragment$presetsCheckListener$1;", "to", "viewModel", "Lcom/iqoption/tradinghistory/filter/date/DateFilterViewModel;", "checkPresets", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onUserChangedDate", "filter", "onViewCreated", "view", "Companion", "tradinghistory_release"})
/* compiled from: DateFilterFragment.kt */
public final class a extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final a dYh = new a();
    private HashMap apm;
    private com.iqoption.tradinghistory.materialcalendar.b dVi;
    private com.iqoption.tradinghistory.materialcalendar.b dVj;
    private boolean dYa;
    private final Map<Integer, com.iqoption.tradinghistory.d> dYb = b.dYj.aVY();
    private m dYc;
    private b dYd;
    private final q dYe = new b(this);
    private final o dYf = new c(this);
    private final f dYg = new f(this);

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/tradinghistory/filter/date/DateFilterFragment$Companion;", "", "()V", "TAG", "", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "tradinghistory_release"})
    /* compiled from: DateFilterFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c Lj() {
            return new com.iqoption.core.ui.d.c(a.TAG, a.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, bng = {"com/iqoption/tradinghistory/filter/date/DateFilterFragment$presetsCheckListener$1", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Landroid/widget/RadioGroup;", "checkedId", "", "tradinghistory_release"})
    /* compiled from: DateFilterFragment.kt */
    public static final class f implements OnCheckedChangeListener {
        final /* synthetic */ a dYi;

        f(a aVar) {
            this.dYi = aVar;
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i != -1) {
                com.iqoption.tradinghistory.d dVar = (com.iqoption.tradinghistory.d) this.dYi.dYb.get(Integer.valueOf(i));
                if (dVar != null) {
                    com.iqoption.tradinghistory.materialcalendar.b b;
                    com.iqoption.tradinghistory.materialcalendar.b aWk;
                    this.dYi.c(new com.iqoption.tradinghistory.d(dVar.aVh(), dVar.aVi()));
                    this.dYi.dYa = true;
                    if (dVar.aVh() == null && dVar.aVi() == null) {
                        Calendar instance = Calendar.getInstance();
                        instance.add(1, -10);
                        b = com.iqoption.tradinghistory.materialcalendar.b.b(instance);
                        aWk = com.iqoption.tradinghistory.materialcalendar.b.aWk();
                    } else {
                        com.iqoption.tradinghistory.materialcalendar.b aVh = dVar.aVh();
                        aWk = dVar.aVi();
                        b = aVh;
                    }
                    a.c(this.dYi).dWl.setOnDateChangedListener(null);
                    a.c(this.dYi).dWl.e(b, aWk);
                    a.c(this.dYi).dWl.setOnDateChangedListener(this.dYi.dYf);
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032(\u0010\u0004\u001a$\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\b0\u0005H\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/iqoption/tradinghistory/materialcalendar/MaterialCalendarView;", "dates", "", "Lcom/iqoption/tradinghistory/materialcalendar/CalendarDay;", "kotlin.jvm.PlatformType", "", "onRangeSelected"})
    /* compiled from: DateFilterFragment.kt */
    static final class b implements q {
        final /* synthetic */ a dYi;

        b(a aVar) {
            this.dYi = aVar;
        }

        public final void a(MaterialCalendarView materialCalendarView, List<com.iqoption.tradinghistory.materialcalendar.b> list) {
            kotlin.jvm.internal.i.f(materialCalendarView, "<anonymous parameter 0>");
            kotlin.jvm.internal.i.f(list, "dates");
            com.iqoption.tradinghistory.materialcalendar.b bVar = (com.iqoption.tradinghistory.materialcalendar.b) list.get(0);
            com.iqoption.tradinghistory.materialcalendar.b bVar2 = (com.iqoption.tradinghistory.materialcalendar.b) list.get(list.size() - 1);
            if (!this.dYi.dYa) {
                if ((kotlin.jvm.internal.i.y(this.dYi.dVi, bVar) ^ 1) != 0 || (kotlin.jvm.internal.i.y(this.dYi.dVj, bVar2) ^ 1) != 0) {
                    this.dYi.c(new com.iqoption.tradinghistory.d(bVar, bVar2));
                    this.dYi.aVW();
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/iqoption/tradinghistory/materialcalendar/MaterialCalendarView;", "date", "Lcom/iqoption/tradinghistory/materialcalendar/CalendarDay;", "selected", "", "onDateSelected"})
    /* compiled from: DateFilterFragment.kt */
    static final class c implements o {
        final /* synthetic */ a dYi;

        c(a aVar) {
            this.dYi = aVar;
        }

        public final void a(MaterialCalendarView materialCalendarView, com.iqoption.tradinghistory.materialcalendar.b bVar, boolean z) {
            kotlin.jvm.internal.i.f(materialCalendarView, "<anonymous parameter 0>");
            kotlin.jvm.internal.i.f(bVar, "date");
            this.dYi.dYa = false;
            if (z) {
                this.dYi.c(new com.iqoption.tradinghistory.d(bVar, bVar));
                this.dYi.aVW();
                return;
            }
            this.dYi.c(null);
            a.c(this.dYi).dWo.clearCheck();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends g {
        final /* synthetic */ a dYi;

        public d(a aVar) {
            this.dYi = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            FragmentActivity activity = this.dYi.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lcom/iqoption/tradinghistory/DateFilter;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DateFilterFragment.kt */
    static final class e<T> implements Observer<com.iqoption.tradinghistory.d> {
        final /* synthetic */ a dYi;

        e(a aVar) {
            this.dYi = aVar;
        }

        /* renamed from: d */
        public final void onChanged(com.iqoption.tradinghistory.d dVar) {
            com.iqoption.tradinghistory.materialcalendar.b aVj = dVar.aVj();
            com.iqoption.tradinghistory.materialcalendar.b aVk = dVar.aVk();
            if ((kotlin.jvm.internal.i.y(this.dYi.dVi, aVj) ^ 1) != 0 || (kotlin.jvm.internal.i.y(this.dYi.dVj, aVk) ^ 1) != 0) {
                this.dYi.dVi = aVj;
                this.dYi.dVj = aVk;
                a.c(this.dYi).dWl.setOnDateChangedListener(null);
                a.c(this.dYi).dWl.e(aVj, aVk);
                a.c(this.dYi).dWl.setOnDateChangedListener(this.dYi.dYf);
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dYd = b.dYj.aZ(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dYc = (m) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.tradinghistory.g.e.fragment_trading_history_set_date, viewGroup, false, 4, null);
        m mVar = this.dYc;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return mVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        m mVar = this.dYc;
        String str = "binding";
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = mVar.dWr.cCu;
        kotlin.jvm.internal.i.e(imageView, "binding.tradingHistoryDateToolbar.toolbarBack");
        imageView.setOnClickListener(new d(this));
        mVar = this.dYc;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        mVar.dWr.dWz.setText(com.iqoption.tradinghistory.g.f.period);
        mVar = this.dYc;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        MaterialCalendarView materialCalendarView = mVar.dWl;
        kotlin.jvm.internal.i.e(materialCalendarView, "binding.calendarView");
        materialCalendarView.setSelectionMode(3);
        mVar = this.dYc;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        mVar.dWl.aWC().aWE().k(com.iqoption.tradinghistory.materialcalendar.b.aWk()).commit();
        mVar = this.dYc;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        mVar.dWl.setOnRangeSelectedListener(this.dYe);
        mVar = this.dYc;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        mVar.dWl.setOnDateChangedListener(this.dYf);
        mVar = this.dYc;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        mVar.dWo.setOnCheckedChangeListener(this.dYg);
        aVW();
        b bVar = this.dYd;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bVar.aVX().observe(this, new e(this));
    }

    private final void aVW() {
        com.iqoption.tradinghistory.d dVar = new com.iqoption.tradinghistory.d(this.dVi, this.dVj);
        for (Entry entry : this.dYb.entrySet()) {
            if (kotlin.jvm.internal.i.y((com.iqoption.tradinghistory.d) entry.getValue(), dVar)) {
                m mVar = this.dYc;
                if (mVar == null) {
                    kotlin.jvm.internal.i.lG("binding");
                }
                mVar.dWo.check(((Number) entry.getKey()).intValue());
                this.dYa = false;
                return;
            }
        }
    }

    private final void c(com.iqoption.tradinghistory.d dVar) {
        com.iqoption.tradinghistory.materialcalendar.b bVar = null;
        this.dVi = dVar != null ? dVar.aVh() : null;
        if (dVar != null) {
            bVar = dVar.aVi();
        }
        this.dVj = bVar;
        if (dVar != null) {
            b bVar2 = this.dYd;
            if (bVar2 == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            bVar2.e(dVar);
        }
    }
}
