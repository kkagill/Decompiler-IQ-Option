package com.iqoption.newsandupdates;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.lx;
import com.iqoption.fragment.b.e;
import com.iqoption.util.u;
import com.iqoption.util.z;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J\u001a\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J!\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J\u0016\u0010'\u001a\u00020\u00192\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0)H\u0002J\b\u0010*\u001a\u00020\u0019H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006,"}, bng = {"Lcom/iqoption/newsandupdates/NewsAndUpdatesFragment;", "Lcom/iqoption/fragment/base/IQMenuFragment;", "Lcom/iqoption/newsandupdates/Listener;", "Lcom/iqoption/view/BackController$OnBackListener;", "()V", "adapter", "Lcom/iqoption/newsandupdates/NewsAndUpdatesAdapter;", "binding", "Lcom/iqoption/databinding/FragmentNewsAndUpdatesBinding;", "viewModel", "Lcom/iqoption/newsandupdates/NewsAndUpdatesViewModel;", "getContentView", "Landroid/view/View;", "getEventName", "", "onClose", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSettingCheckChanged", "", "item", "Lcom/iqoption/newsandupdates/NewsAndUpdatesItem;", "checked", "onViewCreated", "view", "reportAnalyticsButtonPressed", "eventName", "value", "", "(Ljava/lang/String;Ljava/lang/Double;)V", "savePolicy", "policy", "Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "setData", "data", "", "showError", "Companion", "app_optionXRelease"})
/* compiled from: NewsAndUpdatesFragment.kt */
public final class d extends e implements b, com.iqoption.view.b.a {
    private static final String TAG;
    public static final a dJL = new a();
    private HashMap apm;
    private lx dJI;
    private c dJJ;
    private g dJK;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, bng = {"Lcom/iqoption/newsandupdates/NewsAndUpdatesFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "show", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "containerId", "", "app_optionXRelease"})
    /* compiled from: NewsAndUpdatesFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return d.TAG;
        }

        public final void a(FragmentManager fragmentManager, int i) {
            kotlin.jvm.internal.i.f(fragmentManager, "fragmentManager");
            d dVar = new d();
            a aVar = this;
            if (fragmentManager.findFragmentByTag(aVar.Bx()) == null) {
                fragmentManager.beginTransaction().add(i, dVar, aVar.Bx()).addToBackStack(aVar.Bx()).commit();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: NewsAndUpdatesFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ d dJM;

        c(d dVar) {
            this.dJM = dVar;
        }

        public final void onClick(View view) {
            d.a(this.dJM, "news-updates_back", null, 2, null);
            this.dJM.onClose();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "settings", "", "Lcom/iqoption/newsandupdates/NewsAndUpdatesItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: NewsAndUpdatesFragment.kt */
    static final class b<T> implements Observer<List<? extends f>> {
        final /* synthetic */ d dJM;

        b(d dVar) {
            this.dJM = dVar;
        }

        /* renamed from: u */
        public final void onChanged(List<f> list) {
            if (list != null) {
                this.dJM.L(list);
            } else {
                this.dJM.Lg();
            }
        }
    }

    public static final void a(FragmentManager fragmentManager, int i) {
        dJL.a(fragmentManager, i);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public String getEventName() {
        return "news-updates_show";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = d.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dJI = (lx) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_news_and_updates, viewGroup, false, 4, null);
        lx lxVar = this.dJI;
        if (lxVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        RecyclerView recyclerView = lxVar.chq;
        kotlin.jvm.internal.i.e(recyclerView, "binding.newsAndUpdatesList");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.dJJ = new c(com.iqoption.core.ext.a.q(this), this);
        c cVar = this.dJJ;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        recyclerView.setAdapter(cVar);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.dJK = g.dJQ.z(com.iqoption.core.ext.a.r(this));
        g gVar = this.dJK;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        z.a(gVar.aQi(), (Fragment) this, (Observer) new b(this));
        lx lxVar = this.dJI;
        if (lxVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ImageView imageView = lxVar.ceM;
        kotlin.jvm.internal.i.e(imageView, "binding.exitButton");
        imageView.setOnClickListener(new c(this));
    }

    public void a(f fVar, boolean z) {
        String str;
        kotlin.jvm.internal.i.f(fVar, "item");
        int i = e.aob[fVar.aQe().ordinal()];
        com.iqoption.core.microservices.busapi.response.b bVar;
        if (i == 1) {
            bVar = new com.iqoption.core.microservices.busapi.response.b(null, Boolean.valueOf(z), null, null, null, 29, null);
        } else if (i == 2) {
            com.iqoption.core.microservices.busapi.response.b bVar2 = new com.iqoption.core.microservices.busapi.response.b(null, null, Boolean.valueOf(z), null, null, 27, null);
        } else if (i == 3) {
            bVar = new com.iqoption.core.microservices.busapi.response.b(null, null, null, Boolean.valueOf(z), null, 23, null);
        } else if (i == 4) {
            bVar = new com.iqoption.core.microservices.busapi.response.b(null, null, null, null, Boolean.valueOf(z), 15, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        d(r1);
        i = e.axg[fVar.aQe().ordinal()];
        if (i == 1) {
            str = "news-updates_email-notifications";
        } else if (i == 2) {
            str = "news-updates_push-notifications";
        } else if (i == 3) {
            str = "news-updates_phone-calls-notifications";
        } else if (i == 4) {
            str = "news-updates_thirdparty-notifications";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        a(str, Double.valueOf(z ? 1.0d : 0.0d));
    }

    private final void d(com.iqoption.core.microservices.busapi.response.b bVar) {
        g gVar = this.dJK;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        u.a(gVar.b(bVar), NewsAndUpdatesFragment$savePolicy$1.dJN, NewsAndUpdatesFragment$savePolicy$2.dJO, null, 4, null);
    }

    public View getContentView() {
        lx lxVar = this.dJI;
        if (lxVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        View root = lxVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root;
    }

    private final void Lg() {
        com.iqoption.app.a.b.Gq();
    }

    private final void L(List<f> list) {
        c cVar = this.dJJ;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        cVar.L(list);
    }

    public boolean onClose() {
        com.iqoption.core.ext.a.t(this).popBackStack();
        return true;
    }

    static /* synthetic */ void a(d dVar, String str, Double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = (Double) null;
        }
        dVar.a(str, d);
    }

    private final void a(String str, Double d) {
        Builder Builder = Event.Builder(Event.CATEGORY_BUTTON_PRESSED, str);
        if (d != null) {
            Builder.setValue(Double.valueOf(d.doubleValue()));
        }
        EventManager.BS().a(Builder.build());
    }
}
