package com.iqoption.vip;

import android.content.Context;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.analytics.r;
import com.iqoption.e.nz;
import com.iqoption.fragment.b.g;
import com.iqoption.microservice.vip.d;
import com.iqoption.util.Status;
import com.iqoption.util.ah;
import com.iqoption.x.R;
import java.util.HashMap;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Lcom/iqoption/vip/VipEducationFragment;", "Lcom/iqoption/fragment/base/IQSmartFragment;", "()V", "binding", "Lcom/iqoption/databinding/FragmentVipEducationBinding;", "showEvent", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "viewModel", "Lcom/iqoption/vip/VipManagerViewModel;", "getContentView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "getEventName", "", "getRequiredWidth", "", "onClose", "", "onCreateView", "onDestroyView", "", "Companion", "app_optionXRelease"})
/* compiled from: VipEducationFragment.kt */
public final class i extends g {
    private static final String TAG = "javaClass";
    public static final a ejV = new a();
    private HashMap apm;
    private com.iqoption.core.analytics.c dfd;
    private nz ejU;
    private j ejm;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\f"}, bng = {"Lcom/iqoption/vip/VipEducationFragment$Companion;", "", "()V", "TAG", "", "TAG$annotations", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "app_optionXRelease"})
    /* compiled from: VipEducationFragment.kt */
    public static final class a {

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: VipEducationFragment.kt */
        static final class a implements Runnable {
            final /* synthetic */ FragmentManager deH;

            a(FragmentManager fragmentManager) {
                this.deH = fragmentManager;
            }

            public final void run() {
                a aVar = i.ejV;
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
            com.iqoption.popup.c.dKG.A(fragmentActivity).a((Runnable) new a(fragmentActivity.getSupportFragmentManager()), i.TAG);
        }

        private final void d(FragmentManager fragmentManager) {
            fragmentManager.beginTransaction().add(R.id.fragment, new i(), i.TAG).addToBackStack(i.TAG).commitAllowingStateLoss();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: VipEducationFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ i ejW;

        b(i iVar) {
            this.ejW = iVar;
        }

        public final void onClick(View view) {
            r.aqZ.CR();
            this.ejW.onClose();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/util/Resource;", "Lcom/iqoption/microservice/vip/VipManager;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: VipEducationFragment.kt */
    static final class c<T> implements Observer<ah<d>> {
        final /* synthetic */ i ejW;

        c(i iVar) {
            this.ejW = iVar;
        }

        /* renamed from: a */
        public final void onChanged(ah<d> ahVar) {
            if ((ahVar != null ? ahVar.aWW() : null) == Status.SUCCESS) {
                d dVar = (d) ahVar.getData();
                if (dVar != null) {
                    RecyclerView recyclerView = i.a(this.ejW).ckF;
                    kotlin.jvm.internal.i.e(recyclerView, "binding.contentList");
                    recyclerView.setAdapter(new h(dVar));
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
        return "vip-education-opened";
    }

    public static final /* synthetic */ nz a(i iVar) {
        nz nzVar = iVar.ejU;
        if (nzVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return nzVar;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_vip_education, viewGroup, false);
        kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…cation, container, false)");
        this.ejU = (nz) inflate;
        nz nzVar = this.ejU;
        String str = "binding";
        if (nzVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        nzVar.bYq.setOnClickListener(new b(this));
        nzVar = this.ejU;
        if (nzVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = nzVar.ckF;
        kotlin.jvm.internal.i.e(recyclerView, "binding.contentList");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        nzVar = this.ejU;
        if (nzVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        nzVar.ckF.setHasFixedSize(true);
        nzVar = this.ejU;
        if (nzVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        recyclerView = nzVar.ckF;
        Context context = getContext();
        if (context == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(context, "context!!");
        recyclerView.addItemDecoration(new com.iqoption.widget.c(context.getResources().getDimensionPixelOffset(R.dimen.dp20), true, true));
        nzVar = this.ejU;
        if (nzVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        nzVar.ckF.addItemDecoration(new d());
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
        jVar.aZn().observe(this, new c(this));
        nzVar = this.ejU;
        if (nzVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View root = nzVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root;
    }

    /* Access modifiers changed, original: protected */
    public int aBO() {
        return getResources().getDimensionPixelSize(R.dimen.dp450);
    }

    public boolean onClose() {
        com.iqoption.core.ext.a.t(this).popBackStack();
        com.iqoption.popup.c.dKG.A(com.iqoption.core.ext.a.r(this)).jr(TAG);
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dfd = r.aqZ.CG();
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
