package com.iqoption.kyc.finish;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.g;
import com.iqoption.kyc.KycCaller;
import com.iqoption.kyc.b.bs;
import com.iqoption.kyc.o.f;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, bng = {"Lcom/iqoption/kyc/finish/KycFinishFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycFinishBinding;", "kycCaller", "Lcom/iqoption/kyc/KycCaller;", "getKycCaller", "()Lcom/iqoption/kyc/KycCaller;", "kycCaller$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/iqoption/kyc/finish/KycFinishViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "kyc_release"})
/* compiled from: KycFinishFragment.kt */
public final class a extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "kycCaller", "getKycCaller()Lcom/iqoption/kyc/KycCaller;"))};
    public static final a dxH = new a();
    private HashMap apm;
    private final kotlin.d dxE = g.c(new KycFinishFragment$kycCaller$2(this));
    private com.iqoption.kyc.b.k dxF;
    private c dxG;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, bng = {"Lcom/iqoption/kyc/finish/KycFinishFragment$Companion;", "", "()V", "ARG_KYC_CALLER", "", "TAG", "getTAG", "()Ljava/lang/String;", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "kycCaller", "Lcom/iqoption/kyc/KycCaller;", "kyc_release"})
    /* compiled from: KycFinishFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final com.iqoption.core.ui.d.c b(KycCaller kycCaller) {
            KycCaller kycCaller2 = kycCaller;
            kotlin.jvm.internal.i.f(kycCaller2, "kycCaller");
            Bundle bundle = new Bundle();
            bundle.putSerializable("ARG_KYC_CALLER", kycCaller2);
            return new com.iqoption.core.ui.d.c(Bx(), a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ a this$0;

        public b(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            String str = "";
            com.iqoption.kyc.a.a.dtL.i("kyc_start-trading", str, str, a.a(this.this$0).Er());
            com.iqoption.kyc.navigator.a.dAF.az(this.this$0);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends g {
        final /* synthetic */ a this$0;

        public c(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.kyc.navigator.a.dAF.aw(this.this$0);
            String str = "";
            com.iqoption.kyc.a.a.dtL.i("kyc_deposit", str, str, a.a(this.this$0).Er());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends g {
        final /* synthetic */ a this$0;

        public d(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.kyc.navigator.a.dAF.aw(this.this$0);
            String str = "";
            com.iqoption.kyc.a.a.dtL.i("kyc_withdraw", str, str, a.a(this.this$0).Er());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class e extends g {
        final /* synthetic */ a this$0;

        public e(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.kyc.navigator.a.dAF.ay(this.this$0);
            String str = "";
            com.iqoption.kyc.a.a.dtL.i("kyc_deposit", str, str, a.a(this.this$0).Er());
        }
    }

    private final KycCaller aIG() {
        kotlin.d dVar = this.dxE;
        j jVar = anY[0];
        return (KycCaller) dVar.getValue();
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

    public static final /* synthetic */ c a(a aVar) {
        c cVar = aVar.dxG;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return cVar;
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dxG = c.dxI.ar(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dxF = (com.iqoption.kyc.b.k) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.kyc.o.e.fragment_kyc_finish, viewGroup, false, 4, null);
        com.iqoption.kyc.b.k kVar = this.dxF;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return kVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        c cVar = this.dxG;
        String str = "viewModel";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        String string = getString(f.thank_you);
        kotlin.jvm.internal.i.e(string, "getString(R.string.thank_you)");
        cVar.setTitle(string);
        cVar = this.dxG;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aLa();
        cVar = this.dxG;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aLb();
        com.iqoption.kyc.b.k kVar = this.dxF;
        str = "binding";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = kVar.duV;
        string = "binding.kycFinishLeft";
        kotlin.jvm.internal.i.e(textView, string);
        textView.setOnClickListener(new b(this));
        int i = b.aob[aIG().ordinal()];
        String str2 = "binding.kycFinishRight.kycButton";
        String str3 = "binding.kycFinishRight.root";
        String str4 = "binding.kycFinishRight";
        bs bsVar;
        FrameLayout frameLayout;
        if (i == 1) {
            kVar = this.dxF;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = kVar.duV;
            kotlin.jvm.internal.i.e(textView, string);
            com.iqoption.core.ext.a.al(textView);
            kVar = this.dxF;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            bsVar = kVar.duW;
            kotlin.jvm.internal.i.e(bsVar, str4);
            view = bsVar.getRoot();
            kotlin.jvm.internal.i.e(view, str3);
            com.iqoption.core.ext.a.ak(view);
            kVar = this.dxF;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            kVar.duW.dwE.setText(f.deposit);
            kVar = this.dxF;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            frameLayout = kVar.duW.dwC;
            kotlin.jvm.internal.i.e(frameLayout, str2);
            frameLayout.setOnClickListener(new c(this));
        } else if (i != 2) {
            kVar = this.dxF;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = kVar.duV;
            kotlin.jvm.internal.i.e(textView, string);
            com.iqoption.core.ext.a.ak(textView);
            kVar = this.dxF;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            bsVar = kVar.duW;
            kotlin.jvm.internal.i.e(bsVar, str4);
            view = bsVar.getRoot();
            kotlin.jvm.internal.i.e(view, str3);
            com.iqoption.core.ext.a.ak(view);
            kVar = this.dxF;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            kVar.duW.dwE.setText(f.deposit);
            kVar = this.dxF;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            frameLayout = kVar.duW.dwC;
            kotlin.jvm.internal.i.e(frameLayout, str2);
            frameLayout.setOnClickListener(new e(this));
        } else {
            kVar = this.dxF;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = kVar.duV;
            kotlin.jvm.internal.i.e(textView, string);
            com.iqoption.core.ext.a.al(textView);
            kVar = this.dxF;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            bsVar = kVar.duW;
            kotlin.jvm.internal.i.e(bsVar, str4);
            view = bsVar.getRoot();
            kotlin.jvm.internal.i.e(view, str3);
            com.iqoption.core.ext.a.ak(view);
            kVar = this.dxF;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            kVar.duW.dwE.setText(f.withdrawals);
            kVar = this.dxF;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            frameLayout = kVar.duW.dwC;
            kotlin.jvm.internal.i.e(frameLayout, str2);
            frameLayout.setOnClickListener(new d(this));
        }
    }
}
