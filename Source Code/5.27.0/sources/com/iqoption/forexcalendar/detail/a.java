package com.iqoption.forexcalendar.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener;
import com.google.android.gms.plus.PlusShare;
import com.google.gson.JsonObject;
import com.iqoption.core.ext.g;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006 "}, bng = {"Lcom/iqoption/forexcalendar/detail/ForexCalendarDetailFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedAdapter$Callbacks;", "()V", "binding", "Lcom/iqoption/forexcalendar/databinding/FragmentForexCalendarDetailBinding;", "calendarEvent", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "getCalendarEvent", "()Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "calendarEvent$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/iqoption/forexcalendar/detail/ForexCalendarDetailViewModel;", "back", "", "formatRate", "", "value", "onClickItem", "item", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItem;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "reportBack", "Companion", "forexcalendar_release"})
/* compiled from: ForexCalendarDetailFragment.kt */
public class a extends com.iqoption.core.ui.fragment.d implements com.iqoption.forexcalendar.detail.a.a.a {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "calendarEvent", "getCalendarEvent()Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;"))};
    public static final a cTp = new a();
    private HashMap apm;
    private final kotlin.d cTm = g.c(new ForexCalendarDetailFragment$calendarEvent$2(this));
    private com.iqoption.forexcalendar.a.i cTn;
    private b cTo;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, bng = {"Lcom/iqoption/forexcalendar/detail/ForexCalendarDetailFragment$Companion;", "", "()V", "CALENDAR_EVENT_ARG", "", "TAG", "getTAG", "()Ljava/lang/String;", "createArguments", "Landroid/os/Bundle;", "calendarEvent", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "newInstance", "Lcom/iqoption/forexcalendar/detail/ForexCalendarDetailFragment;", "forexcalendar_release"})
    /* compiled from: ForexCalendarDetailFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final a e(com.iqoption.core.microservices.b.a.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "calendarEvent");
            a aVar2 = new a();
            aVar2.setArguments(a.cTp.f(aVar));
            return aVar2;
        }

        public final Bundle f(com.iqoption.core.microservices.b.a.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "calendarEvent");
            Bundle bundle = new Bundle();
            bundle.putParcelable("CALENDAR_EVENT_ARG", aVar);
            return bundle;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/forexcalendar/detail/ForexCalendarDetailFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ com.iqoption.forexcalendar.a.c cTq;
        final /* synthetic */ com.iqoption.forexcalendar.a.e cTr;
        final /* synthetic */ a this$0;

        public b(a aVar, com.iqoption.forexcalendar.a.c cVar, com.iqoption.forexcalendar.a.e eVar) {
            this.this$0 = aVar;
            this.cTq = cVar;
            this.cTr = eVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.awK();
            com.iqoption.core.ext.a.t(this.this$0).popBackStack();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "items", "", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedAdapterItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: ForexCalendarDetailFragment.kt */
    static final class d<T> implements Observer<List<? extends com.iqoption.forexcalendar.detail.a.b>> {
        final /* synthetic */ com.iqoption.forexcalendar.detail.a.a cTt;

        d(com.iqoption.forexcalendar.detail.a.a aVar) {
            this.cTt = aVar;
        }

        /* renamed from: u */
        public final void onChanged(List<? extends com.iqoption.forexcalendar.detail.a.b> list) {
            if (list != null) {
                com.iqoption.core.ui.widget.recyclerview.adapter.a.a(this.cTt, list, null, 2, null);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "items", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: ForexCalendarDetailFragment.kt */
    static final class e<T> implements Observer<String> {
        final /* synthetic */ com.iqoption.forexcalendar.a.e cTu;

        e(com.iqoption.forexcalendar.a.e eVar) {
            this.cTu = eVar;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                com.iqoption.forexcalendar.a.e eVar = this.cTu;
                if (eVar != null) {
                    TextView textView = eVar.cTc;
                    if (textView != null) {
                        textView.setText(str);
                    }
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "items", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: ForexCalendarDetailFragment.kt */
    static final class f<T> implements Observer<String> {
        final /* synthetic */ com.iqoption.forexcalendar.a.e cTu;

        f(com.iqoption.forexcalendar.a.e eVar) {
            this.cTu = eVar;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                com.iqoption.forexcalendar.a.e eVar = this.cTu;
                if (eVar != null) {
                    TextView textView = eVar.cTd;
                    if (textView != null) {
                        textView.setText(str);
                        com.iqoption.core.ext.a.ak(textView);
                    }
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/forexcalendar/detail/ForexCalendarDetailFragment$onCreateView$4$3", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", "position", "", "forexcalendar_release"})
    /* compiled from: ForexCalendarDetailFragment.kt */
    public static final class c extends SimpleOnPageChangeListener {
        final /* synthetic */ com.iqoption.forexcalendar.a.c cTq;
        final /* synthetic */ com.iqoption.forexcalendar.a.e cTr;
        final /* synthetic */ List cTs;
        final /* synthetic */ a this$0;

        c(List list, a aVar, com.iqoption.forexcalendar.a.c cVar, com.iqoption.forexcalendar.a.e eVar) {
            this.cTs = list;
            this.this$0 = aVar;
            this.cTq = cVar;
            this.cTr = eVar;
        }

        public void onPageSelected(int i) {
            i = ((Number) this.cTs.get(i)).intValue();
            String str = i == com.iqoption.forexcalendar.r.f.assets_affected ? "economic-calendar_ext-assets-affected" : i == com.iqoption.forexcalendar.r.f.info_history ? "economic-calendar_ext-info-history" : null;
            if (str != null) {
                com.iqoption.core.d.EC().a(str, com.iqoption.core.marketanalysis.a.a(this.this$0.awB()));
            }
        }
    }

    private final com.iqoption.core.microservices.b.a.a awB() {
        kotlin.d dVar = this.cTm;
        j jVar = anY[0];
        return (com.iqoption.core.microservices.b.a.a) dVar.getValue();
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CharSequence string;
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.cTn = (com.iqoption.forexcalendar.a.i) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.forexcalendar.r.e.fragment_forex_calendar_detail, viewGroup, false, 4, null);
        this.cTo = b.cTC.b(this, awB().getId());
        com.iqoption.forexcalendar.detail.a.a aVar = new com.iqoption.forexcalendar.detail.a.a(this);
        Object g = com.iqoption.forexcalendar.a.c.g(layoutInflater);
        if (g != null) {
            g.aIq.setHasFixedSize(true);
            RecyclerView recyclerView = g.aIq;
            kotlin.jvm.internal.i.e(recyclerView, "list");
            recyclerView.setAdapter(aVar);
            g.aIq.addItemDecoration(new com.iqoption.core.ui.widget.e(com.iqoption.core.ext.a.c((ViewDataBinding) g, com.iqoption.forexcalendar.r.c.dp1)));
        } else {
            g = null;
        }
        kotlin.jvm.internal.i.e(g, "ForexCalendarAssetsAffec…(R.dimen.dp1)))\n        }");
        b bVar = this.cTo;
        String str = "viewModel";
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LifecycleOwner lifecycleOwner = this;
        bVar.awM().observe(lifecycleOwner, new d(aVar));
        com.iqoption.forexcalendar.a.e h = com.iqoption.forexcalendar.a.e.h(layoutInflater);
        kotlin.jvm.internal.i.e(h, "ForexCalendarInfoHistory…Binding.inflate(inflater)");
        b bVar2 = this.cTo;
        if (bVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bVar2.awO().observe(lifecycleOwner, new e(h));
        bVar2 = this.cTo;
        if (bVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bVar2.awN().observe(lifecycleOwner, new f(h));
        com.iqoption.forexcalendar.a.i iVar = this.cTn;
        String str2 = "binding";
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        ImageView imageView = iVar.aHK;
        kotlin.jvm.internal.i.e(imageView, "btnBack");
        imageView.setOnClickListener(new b(this, g, h));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d, HH:mm", Locale.getDefault());
        TextView textView = iVar.anC;
        kotlin.jvm.internal.i.e(textView, "date");
        textView.setText(simpleDateFormat.format(Long.valueOf(awB().adv() * 1000)));
        TextView textView2 = iVar.alH;
        kotlin.jvm.internal.i.e(textView2, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        textView2.setText(awB().getName());
        ViewDataBinding viewDataBinding = iVar;
        com.iqoption.core.ui.widget.b.a aVar2 = new com.iqoption.core.ui.widget.b.a(com.iqoption.core.ext.a.b(viewDataBinding, com.iqoption.forexcalendar.r.c.dp1), com.iqoption.core.ext.a.b(viewDataBinding, com.iqoption.forexcalendar.r.c.dp6) / 2.0f, com.iqoption.core.ext.a.b(viewDataBinding, com.iqoption.forexcalendar.r.c.dp5), 3);
        aVar2.setColor(com.iqoption.core.ext.a.a(viewDataBinding, com.iqoption.forexcalendar.r.b.grey_blue_70));
        aVar2.fk(awB().getImportance());
        iVar.cTh.setImageDrawable(aVar2);
        textView2 = iVar.cTi;
        kotlin.jvm.internal.i.e(textView2, "levelInfo");
        int importance = awB().getImportance();
        if (importance == 0 || importance == 1) {
            string = getString(com.iqoption.forexcalendar.r.f.low_importance);
        } else if (importance != 2) {
            string = getString(com.iqoption.forexcalendar.r.f.high_importance);
        } else {
            string = getString(com.iqoption.forexcalendar.r.f.medium_importance);
        }
        textView2.setText(string);
        textView2 = iVar.cNO;
        kotlin.jvm.internal.i.e(textView2, "currently");
        textView2.setText(m7if(awB().getActual()));
        textView2 = iVar.cNV;
        kotlin.jvm.internal.i.e(textView2, "forecast");
        textView2.setText(m7if(awB().adu()));
        textView2 = iVar.cNX;
        kotlin.jvm.internal.i.e(textView2, "previous");
        textView2.setText(m7if(awB().adt()));
        ViewPager viewPager = iVar.aRy;
        String str3 = "pager";
        kotlin.jvm.internal.i.e(viewPager, str3);
        viewPager.setOffscreenPageLimit(2);
        List listOf = m.listOf(Integer.valueOf(com.iqoption.forexcalendar.r.f.assets_affected), Integer.valueOf(com.iqoption.forexcalendar.r.f.info_history));
        ViewPager viewPager2 = iVar.aRy;
        kotlin.jvm.internal.i.e(viewPager2, str3);
        Iterable<Number> iterable = listOf;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (Number intValue : iterable) {
            arrayList.add(getString(intValue.intValue()));
        }
        viewPager2.setAdapter(new com.iqoption.forexcalendar.b((List) arrayList, m.listOf((ViewDataBinding) g, h)));
        iVar.cfQ.setupWithViewPager(iVar.aRy);
        iVar.aRy.addOnPageChangeListener(new c(listOf, this, g, h));
        com.iqoption.forexcalendar.a.i iVar2 = this.cTn;
        if (iVar2 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        return iVar2.getRoot();
    }

    /* renamed from: if */
    private final String m7if(String str) {
        if (str != null) {
            if ((((CharSequence) str).length() > 0 ? 1 : 0) == 1) {
                return str;
            }
        }
        return "-";
    }

    public void back() {
        awK();
        super.back();
    }

    private final void awK() {
        com.iqoption.core.d.EC().a("economic-calendar_ext-event-back", com.iqoption.core.marketanalysis.a.a(awB()));
    }

    public void a(com.iqoption.forexcalendar.detail.a.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "item");
        com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
        JsonObject a = com.iqoption.core.marketanalysis.a.a(awB());
        a.addProperty("asset_id", (Number) Integer.valueOf(cVar.Jt().getActiveId()));
        EC.a("economic-calendar_ext-click-asset", a);
        b bVar = this.cTo;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bVar.b(cVar.Jt().ahU());
    }
}
