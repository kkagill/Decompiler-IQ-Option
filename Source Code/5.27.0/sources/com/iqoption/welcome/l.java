package com.iqoption.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.welcome.a.k;
import com.iqoption.welcome.b.c;
import com.iqoption.welcome.slide.e;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J'\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010#R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006%"}, bng = {"Lcom/iqoption/welcome/WelcomeFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "viewModel", "Lcom/iqoption/welcome/WelcomeViewModel;", "getCurrentScreenFragment", "Landroidx/fragment/app/Fragment;", "getOnboardingSlide", "Lcom/iqoption/welcome/slide/WelcomeSlideFragment;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "replace", "f", "tag", "", "isForward", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/Boolean;)V", "Companion", "welcome_release"})
/* compiled from: WelcomeFragment.kt */
public class l extends d {
    public static final String TAG;
    public static final a ekl = new a();
    private HashMap apm;
    private p ekk;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/welcome/WelcomeFragment$Companion;", "", "()V", "TAG", "", "welcome_release"})
    /* compiled from: WelcomeFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/welcome/WelcomeViewModel$Transition;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: WelcomeFragment.kt */
    static final class b<T> implements Observer<com.iqoption.welcome.p.b> {
        final /* synthetic */ l ekm;

        b(l lVar) {
            this.ekm = lVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.welcome.p.b bVar) {
            if (bVar != null) {
                n aZH = bVar.aZH();
                if (aZH instanceof j) {
                    this.ekm.a(new e(), e.emV.Bx(), bVar.aZI() ? null : Boolean.valueOf(false));
                } else if (aZH instanceof d) {
                    l lVar = this.ekm;
                    Fragment cVar = new c();
                    String str = c.TAG;
                    kotlin.jvm.internal.i.e(str, "LoginFragment.TAG");
                    lVar.a(cVar, str, Boolean.valueOf(bVar.aZI()));
                } else if (aZH instanceof h) {
                    if (((h) aZH).aZs()) {
                        this.ekm.a(new com.iqoption.welcome.register.a.a(), com.iqoption.welcome.register.a.a.emD.Bx(), Boolean.valueOf(bVar.aZI()));
                        return;
                    }
                    com.iqoption.core.ui.d.c fz = com.iqoption.welcome.register.email.e.emx.fz(false);
                    l lVar2 = this.ekm;
                    lVar2.a(fz.bh(com.iqoption.core.ext.a.q(lVar2)), fz.getName(), Boolean.valueOf(bVar.aZI()));
                } else if (aZH instanceof i) {
                    this.ekm.a(com.iqoption.welcome.register.social.d.emA.b(((i) aZH).aZt()), com.iqoption.welcome.register.social.d.TAG, Boolean.valueOf(bVar.aZI()));
                } else if (aZH instanceof f) {
                    this.ekm.a(new com.iqoption.welcome.c.b(), com.iqoption.welcome.c.b.elX.Bx(), Boolean.valueOf(bVar.aZI()));
                } else if (aZH instanceof e) {
                    this.ekm.a(com.iqoption.welcome.changepassword.b.ekD.c(((e) aZH).aZr()), com.iqoption.welcome.changepassword.b.ekD.Bx(), Boolean.valueOf(bVar.aZI()));
                } else if (aZH instanceof k) {
                    this.ekm.a(com.iqoption.welcome.twostepauth.a.enz.d(((k) aZH).aZr()), com.iqoption.welcome.twostepauth.a.enz.Bx(), Boolean.valueOf(bVar.aZI()));
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

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = l.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        return ((k) com.iqoption.core.ext.a.a(layoutInflater, g.e.fragment_welcome, viewGroup, false, 4, null)).getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            FragmentManager u = com.iqoption.core.ext.a.u(this);
            FragmentTransaction beginTransaction = u.beginTransaction();
            kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
            beginTransaction.setTransition(0);
            beginTransaction.add(g.d.content, new e(), e.emV.Bx());
            beginTransaction.commitAllowingStateLoss();
            u.executePendingTransactions();
        }
        this.ekk = p.ekx.bo(this);
        p pVar = this.ekk;
        if (pVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        pVar.aZF().observe(this, new b(this));
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        p pVar = this.ekk;
        if (pVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return pVar.aZG();
    }

    private final void a(Fragment fragment, String str, Boolean bool) {
        FragmentTransaction beginTransaction = com.iqoption.core.ext.a.u(this).beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true))) {
            kotlin.jvm.internal.i.e(beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN), "setTransition(FragmentTr…on.TRANSIT_FRAGMENT_OPEN)");
        } else if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(false))) {
            kotlin.jvm.internal.i.e(beginTransaction.setTransition(8194), "setTransition(FragmentTr…n.TRANSIT_FRAGMENT_CLOSE)");
        }
        beginTransaction.replace(g.d.content, fragment, str);
        beginTransaction.commitAllowingStateLoss();
    }

    public final com.iqoption.welcome.slide.d aZu() {
        Fragment aZv = aZv();
        if (!(aZv instanceof e)) {
            aZv = null;
        }
        e eVar = (e) aZv;
        return eVar != null ? eVar.aZu() : null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment aZv = aZv();
        if (!(aZv instanceof com.iqoption.welcome.b.e)) {
            aZv = null;
        }
        com.iqoption.welcome.b.e eVar = (com.iqoption.welcome.b.e) aZv;
        if (eVar != null) {
            eVar.c(i, i2, intent);
        }
    }

    private final Fragment aZv() {
        return com.iqoption.core.ext.a.u(this).findFragmentById(g.d.content);
    }
}
