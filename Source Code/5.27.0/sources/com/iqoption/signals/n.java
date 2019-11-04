package com.iqoption.signals;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.google.android.gms.plus.PlusShare;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.f;
import com.iqoption.core.ext.g;
import com.iqoption.e.nf;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002$%B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u0016J \u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u0012\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010#\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006&"}, bng = {"Lcom/iqoption/signals/SignalsAndAlertsFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "()V", "viewModel", "Lcom/iqoption/signals/SignalsAndAlertsViewModel;", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "", "enter", "", "nextAnim", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPageScrollStateChanged", "", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "onTabReselected", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "Companion", "PagerAdapter", "app_optionXRelease"})
/* compiled from: SignalsAndAlertsFragment.kt */
public final class n extends com.iqoption.core.ui.fragment.d implements OnPageChangeListener, com.google.android.material.tabs.TabLayout.c {
    private static final String TAG;
    public static final a dTq = new a();
    private HashMap apm;
    private o dTp;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/signals/SignalsAndAlertsFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/signals/SignalsAndAlertsFragment;", "app_optionXRelease"})
    /* compiled from: SignalsAndAlertsFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return n.TAG;
        }

        public final n aUi() {
            return new n();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "state", "Lcom/iqoption/signals/SignalsViewState;", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/signals/SignalsAndAlertsFragment$onCreateView$1$1"})
    /* compiled from: SignalsAndAlertsFragment.kt */
    static final class c<T> implements Observer<t> {
        final /* synthetic */ n dTs;
        final /* synthetic */ r dTt;

        c(n nVar, r rVar) {
            this.dTs = nVar;
            this.dTt = rVar;
        }

        /* renamed from: a */
        public final void onChanged(t tVar) {
            if (tVar != null) {
                n.a(this.dTs).a(tVar.aUr());
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "filterText", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: SignalsAndAlertsFragment.kt */
    static final class d<T> implements Observer<String> {
        final /* synthetic */ nf dTu;

        d(nf nfVar) {
            this.dTu = nfVar;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                TextView textView = this.dTu.ciF;
                String str2 = "filter";
                kotlin.jvm.internal.i.e(textView, str2);
                CharSequence charSequence = str;
                textView.setText(charSequence);
                TextView textView2;
                if ((charSequence.length() == 0 ? 1 : null) != null) {
                    textView2 = this.dTu.ciF;
                    kotlin.jvm.internal.i.e(textView2, str2);
                    com.iqoption.core.ext.a.al(textView2);
                    return;
                }
                textView2 = this.dTu.ciF;
                kotlin.jvm.internal.i.e(textView2, str2);
                com.iqoption.core.ext.a.ak(textView2);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/signals/SignalsAndAlertsFragment$onCreateView$1$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: SignalsAndAlertsFragment.kt */
    public static final class e extends g {
        final /* synthetic */ nf dTu;
        final /* synthetic */ b dTv;

        e(nf nfVar, b bVar) {
            this.dTu = nfVar;
            this.dTv = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            int id = view.getId();
            if (id == R.id.filter || id == R.id.title) {
                b bVar = this.dTv;
                ViewPager viewPager = this.dTu.aRy;
                kotlin.jvm.internal.i.e(viewPager, "pager");
                Fragment item = bVar.getItem(viewPager.getCurrentItem());
                if (item instanceof q) {
                    com.iqoption.core.ui.widget.i.a aUn = ((q) item).aUn();
                    if ((aUn.isShowing() ^ 1) == 0) {
                        aUn = null;
                    }
                    if (aUn != null) {
                        TextView textView = this.dTu.alH;
                        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
                        aUn.ak(textView);
                    }
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/signals/SignalsAndAlertsFragment$PagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "count", "", "(Lcom/iqoption/signals/SignalsAndAlertsFragment;I)V", "fragments", "Landroid/util/SparseArray;", "Landroidx/fragment/app/Fragment;", "getCount", "getItem", "position", "getPageTitle", "", "app_optionXRelease"})
    /* compiled from: SignalsAndAlertsFragment.kt */
    private final class b extends FragmentPagerAdapter {
        private final int count;
        private final SparseArray<Fragment> dTr = new SparseArray();

        public b(int i) {
            super(com.iqoption.core.ext.a.u(n.this));
            this.count = i;
        }

        public int getCount() {
            return this.count;
        }

        public Fragment getItem(int i) {
            Fragment fragment = (Fragment) this.dTr.get(i);
            if (fragment != null) {
                return fragment;
            }
            Object aUo;
            if (i == 0) {
                aUo = q.dTF.aUo();
            } else {
                aUo = com.iqoption.alerts.ui.list.e.apl.Bk();
            }
            this.dTr.put(i, aUo);
            return (Fragment) aUo;
        }

        public CharSequence getPageTitle(int i) {
            return n.this.getString(i == 0 ? R.string.moves : R.string.alerts);
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void j(f fVar) {
    }

    public void k(f fVar) {
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public static final /* synthetic */ o a(n nVar) {
        o oVar = nVar.dTp;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return oVar;
    }

    public void onPageSelected(int i) {
        o oVar = this.dTp;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        oVar.hc(i);
    }

    public void i(f fVar) {
        if (fVar != null && fVar.getPosition() == 1) {
            o oVar = this.dTp;
            if (oVar == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            oVar.aUm();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dTp = o.dTB.aU(this);
        r E = r.dTN.E(com.iqoption.core.ext.a.r(this));
        nf nfVar = (nf) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_signals_and_alerts, viewGroup, false, 4, null);
        boolean ej = com.iqoption.core.d.EH().ej("price-alerts");
        b bVar = new b(ej ? 2 : 1);
        ViewPager viewPager = nfVar.aRy;
        kotlin.jvm.internal.i.e(viewPager, "pager");
        viewPager.setAdapter(bVar);
        nfVar.aRy.addOnPageChangeListener(this);
        nfVar.cfQ.setupWithViewPager(nfVar.aRy);
        nfVar.cfQ.a((com.google.android.material.tabs.TabLayout.b) this);
        if (!ej) {
            TextView textView = nfVar.alH;
            kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
            textView.setText(getString(R.string.signals_untranslatable));
            TabLayout tabLayout = nfVar.cfQ;
            kotlin.jvm.internal.i.e(tabLayout, "tabs");
            com.iqoption.core.ext.a.al(tabLayout);
        }
        OnClickListener eVar = new e(nfVar, bVar);
        nfVar.alH.setOnClickListener(eVar);
        nfVar.ciF.setOnClickListener(eVar);
        a(E.getState(), new c(this, E));
        o oVar = this.dTp;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        a(oVar.aUj(), new d(nfVar));
        return nfVar.getRoot();
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        Animation loadAnimation = i2 == 0 ? null : AnimationUtils.loadAnimation(com.iqoption.core.ext.a.q(this), i2);
        if (loadAnimation != null && z) {
            com.iqoption.core.ui.f.a.bJH.B(this).a(loadAnimation);
        }
        return loadAnimation;
    }

    static {
        String name = n.class.getName();
        kotlin.jvm.internal.i.e(name, "SignalsAndAlertsFragment::class.java.name");
        TAG = name;
    }
}
