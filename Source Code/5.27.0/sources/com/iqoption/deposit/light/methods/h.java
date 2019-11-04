package com.iqoption.deposit.light.methods;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.ext.g;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.CashboxItemType;
import com.iqoption.core.util.v;
import com.iqoption.deposit.b.p;
import com.iqoption.deposit.l;
import com.iqoption.deposit.m;
import com.iqoption.deposit.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 >2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001>B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010 \u001a\u00020!J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u001dH\u0002J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u001bH\u0016J\u0010\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)H\u0002J\u0012\u0010*\u001a\u00020!2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00103\u001a\u00020!H\u0016J\u0010\u00104\u001a\u00020!2\u0006\u0010&\u001a\u00020\u001bH\u0016J\u0010\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020,H\u0016J\u001a\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00109\u001a\u00020!H\u0002J\b\u0010:\u001a\u00020!H\u0002J\b\u0010;\u001a\u00020!H\u0002J\b\u0010<\u001a\u00020\u0019H\u0002J\b\u0010=\u001a\u00020!H\u0002R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068B@BX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000¨\u0006?"}, bng = {"Lcom/iqoption/deposit/light/methods/MethodsLightFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/deposit/light/methods/OnMethodCallbackLight;", "Lcom/iqoption/deposit/light/methods/OnExpandCryptoCallback;", "()V", "<set-?>", "Lcom/iqoption/deposit/light/methods/MethodsLightAdapter;", "adapter", "getAdapter", "()Lcom/iqoption/deposit/light/methods/MethodsLightAdapter;", "setAdapter", "(Lcom/iqoption/deposit/light/methods/MethodsLightAdapter;)V", "adapter$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lcom/iqoption/deposit/databinding/FragmentDepositMethodsLightBinding;", "binding", "getBinding", "()Lcom/iqoption/deposit/databinding/FragmentDepositMethodsLightBinding;", "setBinding", "(Lcom/iqoption/deposit/databinding/FragmentDepositMethodsLightBinding;)V", "binding$delegate", "cryptoDeposits", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "cryptoPaymentsExpanded", "", "methods", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "selectedItemId", "", "viewModel", "Lcom/iqoption/deposit/light/methods/MethodsLightViewModel;", "clearSelection", "", "findViewHolder", "Lcom/iqoption/deposit/light/methods/MethodLightViewHolder;", "uniqueId", "isSelected", "cashboxItem", "onCashboxLoaded", "cashboxDisplayData", "Lcom/iqoption/billing/CashboxDisplayData;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onExpandCryptoClicked", "onMethodClicked", "onSaveInstanceState", "outState", "onViewCreated", "view", "setUIStateContent", "setUIStateLoading", "setUIStateNoMethods", "shouldSelectFirstMethod", "updateItems", "Companion", "deposit_release"})
/* compiled from: MethodsLightFragment.kt */
public final class h extends com.iqoption.core.ui.fragment.d implements k, l {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(h.class), "binding", "getBinding()Lcom/iqoption/deposit/databinding/FragmentDepositMethodsLightBinding;")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "adapter", "getAdapter()Lcom/iqoption/deposit/light/methods/MethodsLightAdapter;"))};
    public static final Comparator<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> cFt = new b(new a());
    public static final c cFu = new c();
    private HashMap apm;
    private List<com.iqoption.core.microservices.billing.response.crypto.a> ayM;
    private List<? extends com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> bEh;
    private final kotlin.f.d bIb = kotlin.f.a.eWg.bnQ();
    private final kotlin.f.d bIc = kotlin.f.a.eWg.bnQ();
    private i cFq;
    private String cFr;
    private boolean cFs;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"})
    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            boolean z = true;
            Comparable valueOf = Boolean.valueOf(((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) t2).ZL() == CashboxItemType.HOLD_PAYMENT);
            if (((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) t).ZL() != CashboxItemType.HOLD_PAYMENT) {
                z = false;
            }
            return b.c(valueOf, Boolean.valueOf(z));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1"})
    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator<T> {
        final /* synthetic */ Comparator cFv;

        public b(Comparator comparator) {
            this.cFv = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.cFv.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            boolean z = true;
            Comparable valueOf = Boolean.valueOf(((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) t2).ZL() == CashboxItemType.USER_CARD);
            if (((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) t).ZL() != CashboxItemType.USER_CARD) {
                z = false;
            }
            return b.c(valueOf, Boolean.valueOf(z));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, bng = {"Lcom/iqoption/deposit/light/methods/MethodsLightFragment$Companion;", "", "()V", "CASHBOX_ITEM_COMPARATOR", "Ljava/util/Comparator;", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "Lkotlin/Comparator;", "MAX_COLLAPSED_CRYPTO_DEPOSITS", "", "STATE_CRYPTO_PAYMENTS_EXPANDED", "", "STATE_SELECTED_METHOD_ID", "TAG", "getTAG", "()Ljava/lang/String;", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "deposit_release"})
    /* compiled from: MethodsLightFragment.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(f fVar) {
            this();
        }

        public final String Bx() {
            return h.TAG;
        }

        public final com.iqoption.core.ui.d.c apA() {
            return new com.iqoption.core.ui.d.c(Bx(), h.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends g {
        final /* synthetic */ h cFw;

        public d(h hVar) {
            this.cFw = hVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.deposit.navigator.b.a aVar = com.iqoption.deposit.navigator.b.cGp;
            h hVar = this.cFw;
            aVar.b(hVar, h.a(hVar).asn());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "cashboxDisplayData", "Lcom/iqoption/billing/CashboxDisplayData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: MethodsLightFragment.kt */
    static final class e<T> implements Observer<com.iqoption.billing.f> {
        final /* synthetic */ h cFw;

        e(h hVar) {
            this.cFw = hVar;
        }

        /* renamed from: c */
        public final void onChanged(com.iqoption.billing.f fVar) {
            if (fVar != null) {
                this.cFw.asm();
                this.cFw.b(fVar);
                return;
            }
            this.cFw.asl();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "payMethod", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "onChanged"})
    /* compiled from: MethodsLightFragment.kt */
    static final class f<T> implements Observer<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> {
        final /* synthetic */ h cFw;

        f(h hVar) {
            this.cFw = hVar;
        }

        /* renamed from: k */
        public final void onChanged(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
            this.cFw.cFr = aVar != null ? aVar.ZK() : null;
            this.cFw.ash();
            if (aVar != null && com.iqoption.core.microservices.billing.response.deposit.c.a(aVar)) {
                com.iqoption.core.d.Um().EC().a("deposit-page_new-card", com.iqoption.deposit.d.a.cGB.atf());
            } else if (aVar instanceof com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) {
                com.iqoption.core.d.Um().EC().a("deposit-page_choose-method", (double) ((com.iqoption.core.microservices.billing.response.deposit.cashboxitem.d) aVar).getId(), com.iqoption.deposit.d.a.cGB.atf());
            }
        }
    }

    private final void a(p pVar) {
        this.bIb.a(this, anY[0], pVar);
    }

    private final void a(g gVar) {
        this.bIc.a(this, anY[1], gVar);
    }

    private final p asf() {
        return (p) this.bIb.b(this, anY[0]);
    }

    private final g asg() {
        return (g) this.bIc.b(this, anY[1]);
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
        String name = h.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cFr = bundle != null ? bundle.getString("STATE_SELECTED_METHOD_ID") : null;
        this.cFs = bundle != null ? bundle.getBoolean("STATE_CRYPTO_PAYMENTS_EXPANDED") : false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        a((p) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.deposit.o.f.fragment_deposit_methods_light, viewGroup, false, 4, null));
        return asf().getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ImageView imageView = asf().cBX;
        kotlin.jvm.internal.i.e(imageView, "binding.toolbarClose");
        imageView.setOnClickListener(new d(this));
        this.cFq = i.cFx.M(this);
        RecyclerView recyclerView = asf().cBU;
        kotlin.jvm.internal.i.e(recyclerView, "binding.depositMethodsList");
        recyclerView.setLayoutManager(new LinearLayoutManager(com.iqoption.core.ext.a.q(this)));
        ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            com.iqoption.core.ui.a.a(recyclerView, getResources().getDimension(com.iqoption.deposit.o.c.dp1), false);
            a(new g(this, this));
            recyclerView.setAdapter(asg());
            ask();
            i iVar = this.cFq;
            String str = "viewModel";
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            LifecycleOwner lifecycleOwner = this;
            iVar.aox().observe(lifecycleOwner, new e(this));
            iVar = this.cFq;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            iVar.aoy().observe(lifecycleOwner, new f(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
    }

    private final void b(com.iqoption.billing.f fVar) {
        this.ayM = fVar.Kq();
        com.iqoption.core.microservices.billing.response.deposit.b Km = fVar.Kp().Km();
        int i = 0;
        Object obj = this.bEh == null ? 1 : null;
        ArrayList aap = Km.aap();
        kotlin.sequences.h Z = u.Z(aap != null ? aap : m.emptyList());
        ArrayList aao = Km.aao();
        if (aao == null) {
            aao = m.emptyList();
        }
        this.bEh = n.f(n.a(n.a(Z, (Iterable) aao), (Iterable) fVar.Ko()));
        l S = com.iqoption.deposit.navigator.b.cGp.S(this);
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a a = m.a(Km, this.cFr, S, asj(), fVar.Kr());
        if (a != null) {
            i iVar = this.cFq;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            iVar.i(a);
            this.cFr = a.ZK();
        }
        ash();
        if (S != null && obj != null) {
            for (com.iqoption.deposit.c.b.a id : asg().getItems()) {
                if (kotlin.jvm.internal.i.y((String) id.getId(), this.cFr)) {
                    break;
                }
                i++;
            }
            i = -1;
            asf().cBU.scrollToPosition(i);
        }
    }

    private final void ash() {
        List list = this.bEh;
        if (list != null) {
            String str;
            List arrayList = new ArrayList();
            List list2 = this.ayM;
            if (list2 == null) {
                list2 = m.emptyList();
            }
            int i = 0;
            if (!(this.cFs || list2.size() <= 2 || list2.size() == 3)) {
                list2 = u.i((Collection) list2.subList(0, 2), (Object) b.cFk);
            }
            Iterator it = list2.iterator();
            int i2 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                str = PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION;
                if (!hasNext) {
                    break;
                }
                a aVar;
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    m.bno();
                }
                com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar2 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) next;
                if (i2 == 0) {
                    String string = com.iqoption.core.ext.a.q(this).getString(o.g.payment_status);
                    kotlin.jvm.internal.i.e(string, str);
                    arrayList.add(new e(string));
                }
                if (aVar2 instanceof b) {
                    aVar = new a((b) aVar2);
                } else {
                    aVar = new com.iqoption.deposit.c.b.b(aVar2, kotlin.jvm.internal.i.y(this.cFr, aVar2.ZK()), aVar2.ZY(), com.iqoption.deposit.light.methods.i.a.a(i.cFx, aVar2, null, 2, null));
                }
                arrayList.add(aVar);
                i2 = i3;
            }
            for (Object next2 : n.a(u.Z(list), cFt)) {
                i2 = i + 1;
                if (i < 0) {
                    m.bno();
                }
                com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar3 = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) next2;
                if (i == 0) {
                    String string2 = com.iqoption.core.ext.a.q(this).getString(o.g.payment_methods);
                    kotlin.jvm.internal.i.e(string2, str);
                    arrayList.add(new e(string2));
                }
                arrayList.add(new com.iqoption.deposit.c.b.b(aVar3, kotlin.jvm.internal.i.y(this.cFr, aVar3.ZK()), aVar3.ZY(), com.iqoption.deposit.light.methods.i.a.a(i.cFx, aVar3, null, 2, null)));
                i = i2;
            }
            asg().aG(arrayList);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        String str = this.cFr;
        if (str != null) {
            bundle.putString("STATE_SELECTED_METHOD_ID", str);
        }
        bundle.putBoolean("STATE_CRYPTO_PAYMENTS_EXPANDED", this.cFs);
        super.onSaveInstanceState(bundle);
    }

    public void l(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "cashboxItem");
        String str = this.cFr;
        if (str != null) {
            d hL = hL(str);
            if (hL != null) {
                hL.cO(false);
            }
        }
        str = aVar.ZK();
        d hL2 = hL(str);
        if (hL2 != null) {
            hL2.cO(true);
        }
        this.cFr = str;
        v.j(getActivity());
        i iVar = this.cFq;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        iVar.i(aVar);
    }

    public void asi() {
        this.cFs = true;
        ash();
    }

    public final void clearSelection() {
        this.cFr = (String) null;
    }

    private final d hL(String str) {
        int i = 0;
        for (com.iqoption.deposit.c.b.a aVar : asg().getItems()) {
            Object obj = ((aVar instanceof com.iqoption.deposit.c.b.b) && kotlin.jvm.internal.i.y(((com.iqoption.deposit.c.b.b) aVar).aoU().ZK(), str)) ? 1 : null;
            if (obj != null) {
                break;
            }
            i++;
        }
        i = -1;
        ViewHolder findViewHolderForLayoutPosition = asf().cBU.findViewHolderForLayoutPosition(i);
        if (!(findViewHolderForLayoutPosition instanceof d)) {
            findViewHolderForLayoutPosition = null;
        }
        return (d) findViewHolderForLayoutPosition;
    }

    public boolean m(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "cashboxItem");
        return kotlin.jvm.internal.i.y(this.cFr, aVar.ZK());
    }

    private final boolean asj() {
        return com.iqoption.deposit.navigator.b.cGp.R(this);
    }

    private final void ask() {
        FrameLayout frameLayout = asf().cBW;
        kotlin.jvm.internal.i.e(frameLayout, "binding.depositProgress");
        frameLayout.setVisibility(0);
        TextView textView = asf().cBS;
        kotlin.jvm.internal.i.e(textView, "binding.depositError");
        com.iqoption.core.ext.a.al(textView);
        RecyclerView recyclerView = asf().cBU;
        kotlin.jvm.internal.i.e(recyclerView, "binding.depositMethodsList");
        com.iqoption.core.ext.a.al(recyclerView);
    }

    private final void asl() {
        FrameLayout frameLayout = asf().cBW;
        kotlin.jvm.internal.i.e(frameLayout, "binding.depositProgress");
        frameLayout.setVisibility(8);
        TextView textView = asf().cBS;
        kotlin.jvm.internal.i.e(textView, "binding.depositError");
        com.iqoption.core.ext.a.ak(textView);
        RecyclerView recyclerView = asf().cBU;
        kotlin.jvm.internal.i.e(recyclerView, "binding.depositMethodsList");
        com.iqoption.core.ext.a.al(recyclerView);
    }

    private final void asm() {
        FrameLayout frameLayout = asf().cBW;
        kotlin.jvm.internal.i.e(frameLayout, "binding.depositProgress");
        frameLayout.setVisibility(8);
        TextView textView = asf().cBS;
        kotlin.jvm.internal.i.e(textView, "binding.depositError");
        com.iqoption.core.ext.a.al(textView);
        RecyclerView recyclerView = asf().cBU;
        kotlin.jvm.internal.i.e(recyclerView, "binding.depositMethodsList");
        com.iqoption.core.ext.a.ak(recyclerView);
    }
}
