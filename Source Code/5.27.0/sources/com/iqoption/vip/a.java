package com.iqoption.vip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.analytics.r;
import com.iqoption.e.nv;
import com.iqoption.fragment.b.g;
import com.iqoption.util.Status;
import com.iqoption.util.ah;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Lcom/iqoption/vip/AboutVipFragment;", "Lcom/iqoption/fragment/base/IQSmartFragment;", "()V", "binding", "Lcom/iqoption/databinding/FragmentVipAboutBinding;", "showEvent", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "viewModel", "Lcom/iqoption/vip/VipManagerViewModel;", "getContentView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "getEventName", "", "getRequiredWidth", "", "onClose", "", "onCreateView", "onDestroyView", "", "Companion", "app_optionXRelease"})
/* compiled from: AboutVipFragment.kt */
public final class a extends g {
    private static final String TAG = "javaClass";
    public static final a ejn = new a();
    private HashMap apm;
    private com.iqoption.core.analytics.c dfd;
    private nv ejl;
    private j ejm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00068\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002¨\u0006\u000e"}, bng = {"Lcom/iqoption/vip/AboutVipFragment$Companion;", "", "()V", "DEFAULT_SPAN_COUNT", "", "TAG", "", "TAG$annotations", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "app_optionXRelease"})
    /* compiled from: AboutVipFragment.kt */
    public static final class a {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: AboutVipFragment.kt */
        static final class a implements Runnable {
            final /* synthetic */ FragmentManager deH;

            a(FragmentManager fragmentManager) {
                this.deH = fragmentManager;
            }

            public final void run() {
                a aVar = a.ejn;
                FragmentManager fragmentManager = this.deH;
                kotlin.jvm.internal.i.e(fragmentManager, "fm");
                aVar.d(fragmentManager);
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void C(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            com.iqoption.popup.c.dKG.A(fragmentActivity).a((Runnable) new a(fragmentActivity.getSupportFragmentManager()), a.TAG);
        }

        private final void d(FragmentManager fragmentManager) {
            fragmentManager.beginTransaction().add(R.id.fragment, new a(), a.TAG).addToBackStack(a.TAG).commitAllowingStateLoss();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: AboutVipFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ a ejo;

        b(a aVar) {
            this.ejo = aVar;
        }

        public final void onClick(View view) {
            this.ejo.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: AboutVipFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ a ejo;

        c(a aVar) {
            this.ejo = aVar;
        }

        public final void onClick(View view) {
            r.aqZ.CJ();
            com.iqoption.vip.e.a aVar = e.ejC;
            FragmentActivity activity = this.ejo.getActivity();
            if (activity == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(activity, "activity!!");
            com.iqoption.vip.e.a.a(aVar, activity, 0, false, 6, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, bng = {"com/iqoption/vip/AboutVipFragment$getContentView$3$1$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", "position", "app_optionXRelease"})
    /* compiled from: AboutVipFragment.kt */
    public static final class d extends SpanSizeLookup {
        public int getSpanSize(int i) {
            return i == 0 ? 3 : 1;
        }

        d() {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/util/Resource;", "Lcom/iqoption/microservice/vip/VipManager;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: AboutVipFragment.kt */
    static final class e<T> implements Observer<ah<com.iqoption.microservice.vip.d>> {
        final /* synthetic */ a ejo;

        e(a aVar) {
            this.ejo = aVar;
        }

        /* renamed from: a */
        public final void onChanged(ah<com.iqoption.microservice.vip.d> ahVar) {
            if ((ahVar != null ? ahVar.aWW() : null) == Status.SUCCESS) {
                com.iqoption.microservice.vip.d dVar = (com.iqoption.microservice.vip.d) ahVar.getData();
                if (dVar != null) {
                    RecyclerView recyclerView = a.a(this.ejo).ckF;
                    kotlin.jvm.internal.i.e(recyclerView, "binding.contentList");
                    recyclerView.setAdapter(new g(dVar));
                }
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public String getEventName() {
        return "vip-about-opened";
    }

    public static final /* synthetic */ nv a(a aVar) {
        nv nvVar = aVar.ejl;
        if (nvVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return nvVar;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_vip_about, viewGroup, false);
        kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…_about, container, false)");
        this.ejl = (nv) inflate;
        nv nvVar = this.ejl;
        String str = "binding";
        if (nvVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        nvVar.bYq.setOnClickListener(new b(this));
        nvVar = this.ejl;
        if (nvVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        nvVar.ckE.setOnClickListener(new c(this));
        nvVar = this.ejl;
        if (nvVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = nvVar.ckF;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 3);
        gridLayoutManager.setSpanSizeLookup(new d());
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        com.iqoption.vip.j.b bVar = j.ejY;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(activity, "activity!!");
        this.ejm = bVar.K(activity);
        j jVar = this.ejm;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        jVar.aZn().observe(this, new e(this));
        nvVar = this.ejl;
        if (nvVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = nvVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root;
    }

    /* Access modifiers changed, original: protected */
    public int aBO() {
        return getResources().getDimensionPixelSize(R.dimen.dp450);
    }

    public boolean onClose() {
        r.aqZ.CI();
        com.iqoption.core.ext.a.t(this).popBackStack();
        com.iqoption.popup.c.dKG.A(com.iqoption.core.ext.a.r(this)).jr(TAG);
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dfd = r.aqZ.CD();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroyView() {
        com.iqoption.core.analytics.c cVar = this.dfd;
        if (cVar != null) {
            cVar.Cc();
        }
        super.onDestroyView();
        Bj();
    }
}
