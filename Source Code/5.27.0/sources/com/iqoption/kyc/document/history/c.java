package com.iqoption.kyc.document.history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.kyc.b.g;
import com.iqoption.kyc.o.e;
import java.util.HashMap;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0002J\b\u0010\u001f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006!"}, bng = {"Lcom/iqoption/kyc/document/history/KycDocumentsHistoryFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "adapter", "Lcom/iqoption/kyc/document/history/DocumentsHistoryAdapter;", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycDecumentsHistoryBinding;", "type", "Lcom/iqoption/core/microservices/kyc/response/VerificationType;", "getType", "()Lcom/iqoption/core/microservices/kyc/response/VerificationType;", "type$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/iqoption/kyc/document/history/KycDocumentsHistoryViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setUiStateContent", "setUiStateNoItems", "setUiStateProgress", "Companion", "kyc_release"})
/* compiled from: KycDocumentsHistoryFragment.kt */
public final class c extends d {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(c.class), "type", "getType()Lcom/iqoption/core/microservices/kyc/response/VerificationType;"))};
    public static final a dxB = new a();
    private HashMap apm;
    private final kotlin.d dxA = g.c(new KycDocumentsHistoryFragment$type$2(this));
    private d dxx;
    private g dxy;
    private b dxz;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/kyc/document/history/KycDocumentsHistoryFragment$Companion;", "", "()V", "ARG_TYPE", "", "TAG", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "type", "Lcom/iqoption/core/microservices/kyc/response/VerificationType;", "kyc_release"})
    /* compiled from: KycDocumentsHistoryFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c m(VerificationType verificationType) {
            VerificationType verificationType2 = verificationType;
            kotlin.jvm.internal.i.f(verificationType2, "type");
            Bundle bundle = new Bundle();
            bundle.putSerializable("ARG_TYPE", verificationType2);
            return new com.iqoption.core.ui.d.c(c.TAG, c.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends com.iqoption.core.ext.g {
        final /* synthetic */ c this$0;

        public b(c cVar) {
            this.this$0 = cVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.ext.a.t(this.this$0).popBackStack();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocumentHistory;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycDocumentsHistoryFragment.kt */
    static final class c<T> implements Observer<List<? extends com.iqoption.core.microservices.kyc.response.document.c>> {
        final /* synthetic */ c this$0;

        c(c cVar) {
            this.this$0 = cVar;
        }

        /* renamed from: u */
        public final void onChanged(List<com.iqoption.core.microservices.kyc.response.document.c> list) {
            if (list.isEmpty()) {
                this.this$0.aKX();
                return;
            }
            this.this$0.aKW();
            b c = c.c(this.this$0);
            kotlin.jvm.internal.i.e(list, "it");
            c.aG(list);
        }
    }

    private final VerificationType aKU() {
        kotlin.d dVar = this.dxA;
        j jVar = anY[0];
        return (VerificationType) dVar.getValue();
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

    public static final /* synthetic */ b c(c cVar) {
        b bVar = cVar.dxz;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        return bVar;
    }

    static {
        String name = c.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dxx = d.dxC.aq(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dxy = (g) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_kyc_decuments_history, viewGroup, false, 4, null);
        g gVar = this.dxy;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return gVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        g gVar = this.dxy;
        String str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = gVar.duG;
        String str2 = "binding.kycDocumentsList";
        kotlin.jvm.internal.i.e(recyclerView, str2);
        recyclerView.setLayoutManager(new LinearLayoutManager(com.iqoption.core.ext.a.q(this)));
        this.dxz = new b();
        gVar = this.dxy;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        recyclerView = gVar.duG;
        kotlin.jvm.internal.i.e(recyclerView, str2);
        b bVar = this.dxz;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        recyclerView.setAdapter(bVar);
        gVar = this.dxy;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = gVar.duE;
        kotlin.jvm.internal.i.e(imageView, "binding.kycDocumentsBack");
        imageView.setOnClickListener(new b(this));
        aKV();
        d dVar = this.dxx;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        dVar.n(aKU()).observe(this, new c(this));
    }

    private final void aKV() {
        g gVar = this.dxy;
        String str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = gVar.duG;
        kotlin.jvm.internal.i.e(recyclerView, "binding.kycDocumentsList");
        com.iqoption.core.ext.a.al(recyclerView);
        gVar = this.dxy;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = gVar.duH;
        kotlin.jvm.internal.i.e(frameLayout, "binding.kycDocumentsProgress");
        com.iqoption.core.ext.a.ak(frameLayout);
        gVar = this.dxy;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = gVar.duF;
        kotlin.jvm.internal.i.e(textView, "binding.kycDocumentsEmpty");
        com.iqoption.core.ext.a.al(textView);
    }

    private final void aKW() {
        g gVar = this.dxy;
        String str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = gVar.duG;
        kotlin.jvm.internal.i.e(recyclerView, "binding.kycDocumentsList");
        com.iqoption.core.ext.a.ak(recyclerView);
        gVar = this.dxy;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = gVar.duH;
        kotlin.jvm.internal.i.e(frameLayout, "binding.kycDocumentsProgress");
        com.iqoption.core.ext.a.al(frameLayout);
        gVar = this.dxy;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = gVar.duF;
        kotlin.jvm.internal.i.e(textView, "binding.kycDocumentsEmpty");
        com.iqoption.core.ext.a.al(textView);
    }

    private final void aKX() {
        g gVar = this.dxy;
        String str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = gVar.duG;
        kotlin.jvm.internal.i.e(recyclerView, "binding.kycDocumentsList");
        com.iqoption.core.ext.a.al(recyclerView);
        gVar = this.dxy;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = gVar.duH;
        kotlin.jvm.internal.i.e(frameLayout, "binding.kycDocumentsProgress");
        com.iqoption.core.ext.a.al(frameLayout);
        gVar = this.dxy;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = gVar.duF;
        kotlin.jvm.internal.i.e(textView, "binding.kycDocumentsEmpty");
        com.iqoption.core.ext.a.ak(textView);
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return com.iqoption.core.ui.animation.transitions.c.bHB.e(this);
    }
}
