package com.iqoption.fragment.dialog.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.plus.PlusShare;
import com.google.common.collect.ImmutableList;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.d;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.manager.ad;
import com.iqoption.e.fw;
import com.iqoption.fragment.b.g;
import com.iqoption.popup.c;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, bng = {"Lcom/iqoption/fragment/dialog/etfbroker/ETFsDialogFragment;", "Lcom/iqoption/fragment/base/IQSmartFragment;", "()V", "countETFs", "", "getCountETFs", "()I", "getContentView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "getEventName", "", "onClose", "", "tryNow", "", "Companion", "app_optionXRelease"})
/* compiled from: ETFsDialogFragment.kt */
public final class a extends g {
    private static final String TAG = TAG;
    private static final String deF = deF;
    public static final a deG = new a();
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/fragment/dialog/etfbroker/ETFsDialogFragment$Companion;", "", "()V", "ARG_COUNT_ETFS", "", "TAG", "show", "", "fm", "Landroidx/fragment/app/FragmentManager;", "countETFs", "", "tryShow", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: ETFsDialogFragment.kt */
    public static final class a {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: ETFsDialogFragment.kt */
        static final class a implements Runnable {
            final /* synthetic */ FragmentManager deH;
            final /* synthetic */ int deI;

            a(FragmentManager fragmentManager, int i) {
                this.deH = fragmentManager;
                this.deI = i;
            }

            public final void run() {
                a aVar = a.deG;
                FragmentManager fragmentManager = this.deH;
                kotlin.jvm.internal.i.e(fragmentManager, "fm");
                aVar.a(fragmentManager, this.deI);
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void p(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            int size = com.iqoption.app.helpers.a.Gs().a(ActiveType.ETF_ACTIVE, false).size();
            if (d.Un().Di() && size > 0 && com.iqoption.app.d.dW(a.TAG)) {
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                c A = c.dKG.A(fragmentActivity);
                if (!A.js(a.TAG)) {
                    A.a((Runnable) new a(supportFragmentManager, size), a.TAG);
                }
            }
        }

        private final void a(FragmentManager fragmentManager, int i) {
            if (fragmentManager.findFragmentByTag(a.TAG) == null) {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                a aVar = new a();
                Bundle bundle = new Bundle();
                bundle.putInt(a.deF, i);
                aVar.setArguments(bundle);
                beginTransaction.add(R.id.fragment, aVar, a.TAG).addToBackStack(a.TAG).commitAllowingStateLoss();
                com.iqoption.app.d.i(a.TAG, false);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/fragment/dialog/etfbroker/ETFsDialogFragment$getContentView$1$listener$1", "Lcom/iqoption/view/viewinterface/OnClickDelayView;", "onDelayClick", "", "view", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: ETFsDialogFragment.kt */
    public static final class b extends com.iqoption.view.d.b {
        final /* synthetic */ a deJ;

        b(a aVar) {
            this.deJ = aVar;
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
            int id = view.getId();
            if (id == R.id.close) {
                this.deJ.onClose();
            } else if (id == R.id.tryNow) {
                this.deJ.aCg();
            }
        }
    }

    public static final void p(FragmentActivity fragmentActivity) {
        deG.p(fragmentActivity);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public String getEventName() {
        return "etf_info-popup";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    private final int aCf() {
        return com.iqoption.core.ext.a.s(this).getInt(deF);
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, R.layout.dialog_fragment_etfs, viewGroup, false);
        fw fwVar = (fw) inflate;
        b bVar = new b(this);
        TextView textView = fwVar.alH;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(aCf());
        stringBuilder.append(" ETFs");
        textView.setText(stringBuilder.toString());
        OnClickListener onClickListener = bVar;
        fwVar.cbk.setOnClickListener(onClickListener);
        fwVar.cbl.setOnClickListener(onClickListener);
        kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate<…tener(listener)\n        }");
        View root = fwVar.getRoot();
        kotlin.jvm.internal.i.e(root, "DataBindingUtil.inflate<…(listener)\n        }.root");
        return root;
    }

    private final void aCg() {
        long If = ad.bkC.If();
        ImmutableList a = com.iqoption.app.helpers.a.Gs().a(ActiveType.ETF_ACTIVE, false);
        kotlin.jvm.internal.i.e(a, "assetList");
        for (Object next : a) {
            if (((com.iqoption.core.microservices.tradingengine.response.active.a) next).aX(If)) {
                break;
            }
        }
        Object next2 = null;
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) next2;
        if (aVar == null) {
            aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) u.bU(a);
        }
        TabHelper.IM().u(aVar);
        onClose();
    }

    public boolean onClose() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.popBackStack();
        }
        c.dKG.A(com.iqoption.core.ext.a.r(this)).jr(TAG);
        return true;
    }
}
