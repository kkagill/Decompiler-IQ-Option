package com.iqoption.deposit.light.menu.scan;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.d.c;
import com.iqoption.core.ui.d.g;
import com.iqoption.deposit.card.ScanViewModel.ScanItem;
import com.iqoption.deposit.o.f;
import com.iqoption.dialogs.b.aa;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u001a\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/deposit/light/menu/scan/ScanCardMenuLightFragment;", "Lcom/iqoption/bottomsheet/BindingBottomSheetFragment;", "Lcom/iqoption/dialogs/databinding/FragmentMenuListLightBinding;", "Lcom/iqoption/deposit/menu/scan/ScanCardClickListener;", "()V", "navigator", "Lcom/iqoption/core/ui/navigation/StackNavigator;", "getNavigator", "()Lcom/iqoption/core/ui/navigation/StackNavigator;", "navigator$delegate", "Lkotlin/Lazy;", "scanItemToSendOnCollapse", "Lcom/iqoption/deposit/card/ScanViewModel$ScanItem;", "viewModel", "Lcom/iqoption/deposit/DepositSelectionViewModel;", "onBottomSheetClosed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onScanCardClick", "scanItem", "onViewCreated", "view", "Landroid/view/View;", "provideViewBinding", "container", "Landroid/view/ViewGroup;", "Companion", "deposit_release"})
/* compiled from: ScanCardMenuLightFragment.kt */
public final class d extends com.iqoption.bottomsheet.a<aa> implements com.iqoption.deposit.c.c.a {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(d.class), "navigator", "getNavigator()Lcom/iqoption/core/ui/navigation/StackNavigator;"))};
    public static final a cFi = new a();
    private HashMap apm;
    private com.iqoption.deposit.k cFg;
    private ScanItem cFh;
    private final kotlin.d cxQ = g.c(new ScanCardMenuLightFragment$navigator$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/deposit/light/menu/scan/ScanCardMenuLightFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "deposit_release"})
    /* compiled from: ScanCardMenuLightFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return d.TAG;
        }

        public final c asc() {
            return new c(Bx(), d.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    private final g apw() {
        kotlin.d dVar = this.cxQ;
        j jVar = anY[0];
        return (g) dVar.getValue();
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
        String name = d.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cFg = com.iqoption.deposit.k.cxn.C(this);
    }

    /* renamed from: p */
    public aa j(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "container");
        return (aa) com.iqoption.core.ext.a.a(viewGroup, f.fragment_menu_list_light, null, false, 6, null);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = ((aa) getBinding()).cMF;
        kotlin.jvm.internal.i.e(recyclerView, "binding.menuList");
        recyclerView.setLayoutManager(new LinearLayoutManager(com.iqoption.core.ext.a.q(this)));
        recyclerView.setAdapter(new a(this));
    }

    public void KR() {
        apw().alG();
        ScanItem scanItem = this.cFh;
        if (scanItem != null) {
            com.iqoption.deposit.k kVar = this.cFg;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            kVar.a(scanItem);
            this.cFh = (ScanItem) null;
        }
    }

    public void d(ScanItem scanItem) {
        String str;
        kotlin.jvm.internal.i.f(scanItem, "scanItem");
        KN();
        this.cFh = scanItem;
        int i = e.aob[scanItem.ordinal()];
        if (i == 1) {
            str = "deposit-page_scan-card-number-camera";
        } else if (i == 2) {
            str = "deposit-page_scan-card-number-nfc";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        com.iqoption.core.d.Um().EC().a(str, 0.0d, com.iqoption.deposit.d.a.cGB.atf());
    }
}
