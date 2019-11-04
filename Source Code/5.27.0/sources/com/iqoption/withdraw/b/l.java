package com.iqoption.withdraw.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.microservices.withdraw.response.o;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.withdraw.a.e;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u001a\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, bng = {"Lcom/iqoption/withdraw/history/WithdrawHistoryFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/withdraw/history/CancelClickListener;", "()V", "binding", "Lcom/iqoption/withdraw/databinding/FragmentWithdrawHistoryBinding;", "cancellationIds", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "historyAdapter", "Lcom/iqoption/withdraw/history/WithdrawHistoryAdapter;", "viewModel", "Lcom/iqoption/withdraw/history/WithdrawHistoryViewModel;", "withdrawalHistoryData", "Lcom/iqoption/withdraw/WithdrawalHistoryData;", "onCancelClick", "", "payout", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawPayout;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onViewCreated", "view", "Companion", "withdraw_release"})
/* compiled from: WithdrawHistoryFragment.kt */
public final class l extends d implements b {
    public static final String TAG;
    public static final a esQ = new a();
    private HashMap apm;
    private e esL;
    private o esM;
    private j esN;
    private HashSet<Long> esO;
    private com.iqoption.withdraw.l esP;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/withdraw/history/WithdrawHistoryFragment$Companion;", "", "()V", "STATE_CANCELLATION_IDS", "", "TAG", "newInstance", "Lcom/iqoption/withdraw/history/WithdrawHistoryFragment;", "withdraw_release"})
    /* compiled from: WithdrawHistoryFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final l bcQ() {
            return new l();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawHistoryFragment.kt */
    static final class b<T> implements Observer<Void> {
        final /* synthetic */ o esJ;
        final /* synthetic */ l esR;

        b(l lVar, o oVar) {
            this.esR = lVar;
            this.esJ = oVar;
        }

        /* renamed from: c */
        public final void onChanged(Void voidR) {
            l.b(this.esR).remove(Long.valueOf(this.esJ.getId()));
            l.c(this.esR).bcU();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "value", "Lcom/iqoption/withdraw/WithdrawalHistoryData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WithdrawHistoryFragment.kt */
    static final class c<T> implements Observer<com.iqoption.withdraw.l> {
        final /* synthetic */ l esR;

        c(l lVar) {
            this.esR = lVar;
        }

        /* renamed from: b */
        public final void onChanged(com.iqoption.withdraw.l lVar) {
            this.esR.esP = lVar;
            if (lVar != null) {
                l.a(this.esR).a(new a(lVar.bbY(), l.b(this.esR), lVar.bbZ()));
            } else {
                l.a(this.esR).Lg();
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

    public static final /* synthetic */ HashSet b(l lVar) {
        HashSet hashSet = lVar.esO;
        if (hashSet == null) {
            kotlin.jvm.internal.i.lG("cancellationIds");
        }
        return hashSet;
    }

    public static final /* synthetic */ o c(l lVar) {
        o oVar = lVar.esM;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return oVar;
    }

    static {
        String name = l.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Serializable serializable = bundle != null ? bundle.getSerializable("STATE_CANCELLATION_IDS") : null;
        if (!(serializable instanceof HashSet)) {
            serializable = null;
        }
        HashSet hashSet = (HashSet) serializable;
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        this.esO = hashSet;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.esL = (e) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.withdraw.d.e.fragment_withdraw_history, viewGroup, false, 4, null);
        e eVar = this.esL;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return eVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.esN = new j(com.iqoption.core.ext.a.q(this), this);
        e eVar = this.esL;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        RecyclerView recyclerView = eVar.eqa;
        kotlin.jvm.internal.i.e(recyclerView, "binding.withdrawHistoryRecyclerView");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setAutoMeasureEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        j jVar = this.esN;
        String str = "historyAdapter";
        if (jVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        recyclerView.setAdapter(jVar);
        recyclerView.setNestedScrollingEnabled(false);
        j jVar2 = this.esN;
        if (jVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        jVar2.Lf();
        this.esM = o.esV.bC(this);
        o oVar = this.esM;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        oVar.bcT().observe(this, new c(this));
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        HashSet hashSet = this.esO;
        if (hashSet == null) {
            kotlin.jvm.internal.i.lG("cancellationIds");
        }
        bundle.putSerializable("STATE_CANCELLATION_IDS", hashSet);
        super.onSaveInstanceState(bundle);
    }

    public void a(o oVar) {
        kotlin.jvm.internal.i.f(oVar, "payout");
        HashSet hashSet = this.esO;
        String str = "cancellationIds";
        if (hashSet == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        hashSet.add(Long.valueOf(oVar.getId()));
        com.iqoption.withdraw.l lVar = this.esP;
        if (lVar != null) {
            j jVar = this.esN;
            if (jVar == null) {
                kotlin.jvm.internal.i.lG("historyAdapter");
            }
            List bbY = lVar.bbY();
            HashSet hashSet2 = this.esO;
            if (hashSet2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            jVar.a(new a(bbY, hashSet2, lVar.bbZ()));
        }
        o oVar2 = this.esM;
        if (oVar2 == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        oVar2.d(oVar).observe(this, new b(this, oVar));
    }
}
