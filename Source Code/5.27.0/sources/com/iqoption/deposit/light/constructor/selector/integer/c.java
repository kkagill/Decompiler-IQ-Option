package com.iqoption.deposit.light.constructor.selector.integer;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.d.g;
import com.iqoption.deposit.a.a.a.b;
import com.iqoption.deposit.o.f;
import com.iqoption.dialogs.b.aa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006 "}, bng = {"Lcom/iqoption/deposit/light/constructor/selector/integer/SelectorIntegerMenuLightFragment;", "Lcom/iqoption/bottomsheet/BindingBottomSheetFragment;", "Lcom/iqoption/dialogs/databinding/FragmentMenuListLightBinding;", "Lcom/iqoption/deposit/constructor/selector/integer/OnIntegerItemSelectListener;", "()V", "navigator", "Lcom/iqoption/core/ui/navigation/StackNavigator;", "getNavigator", "()Lcom/iqoption/core/ui/navigation/StackNavigator;", "navigator$delegate", "Lkotlin/Lazy;", "params", "Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerMenuParams;", "getParams", "()Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerMenuParams;", "params$delegate", "viewModel", "Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerMenuViewModel;", "onBottomSheetClosed", "", "onIntegerItemSelected", "item", "Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerAdapterItem;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "provideViewBinding", "container", "Landroid/view/ViewGroup;", "Companion", "deposit_release"})
/* compiled from: SelectorIntegerMenuLightFragment.kt */
public final class c extends com.iqoption.bottomsheet.a<aa> implements com.iqoption.deposit.a.a.a.a {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(c.class), "navigator", "getNavigator()Lcom/iqoption/core/ui/navigation/StackNavigator;")), k.a(new PropertyReference1Impl(k.G(c.class), "params", "getParams()Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerMenuParams;"))};
    public static final a cEO = new a();
    private HashMap apm;
    private final d cEM = g.c(new SelectorIntegerMenuLightFragment$params$2(this));
    private com.iqoption.deposit.a.a.a.d cEN;
    private final d cxQ = g.c(new SelectorIntegerMenuLightFragment$navigator$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, bng = {"Lcom/iqoption/deposit/light/constructor/selector/integer/SelectorIntegerMenuLightFragment$Companion;", "", "()V", "ARG_PARAMS", "", "TAG", "getTAG", "()Ljava/lang/String;", "getNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "params", "Lcom/iqoption/deposit/constructor/selector/integer/SelectorIntegerMenuParams;", "deposit_release"})
    /* compiled from: SelectorIntegerMenuLightFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return c.TAG;
        }

        public final com.iqoption.core.ui.d.c b(com.iqoption.deposit.a.a.a.c cVar) {
            com.iqoption.deposit.a.a.a.c cVar2 = cVar;
            kotlin.jvm.internal.i.f(cVar2, "params");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_PARAMS", cVar2);
            return new com.iqoption.core.ui.d.c(Bx(), c.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    private final g apw() {
        d dVar = this.cxQ;
        j jVar = anY[0];
        return (g) dVar.getValue();
    }

    private final com.iqoption.deposit.a.a.a.c arR() {
        d dVar = this.cEM;
        j jVar = anY[1];
        return (com.iqoption.deposit.a.a.a.c) dVar.getValue();
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
        String name = c.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    /* renamed from: p */
    public aa j(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "container");
        return (aa) com.iqoption.core.ext.a.a(viewGroup, f.fragment_menu_list_light, null, false, 6, null);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.cEN = com.iqoption.deposit.a.a.a.d.cyU.H(this);
        RecyclerView recyclerView = ((aa) getBinding()).cMF;
        kotlin.jvm.internal.i.e(recyclerView, "binding.menuList");
        recyclerView.setLayoutManager(new LinearLayoutManager(com.iqoption.core.ext.a.q(this)));
        a aVar = new a(this);
        recyclerView.setAdapter(aVar);
        Iterable<Number> aqt = arR().aqt();
        Collection arrayList = new ArrayList(n.e(aqt, 10));
        for (Number intValue : aqt) {
            int intValue2 = intValue.intValue();
            String aqs = arR().aqs();
            Integer aqu = arR().aqu();
            boolean z = aqu != null && intValue2 == aqu.intValue();
            arrayList.add(new b(aqs, intValue2, z));
        }
        aVar.aG((List) arrayList);
    }

    public void KR() {
        apw().alG();
    }

    public void c(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "item");
        KN();
        com.iqoption.deposit.a.a.a.d dVar = this.cEN;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        dVar.a(bVar);
    }
}
