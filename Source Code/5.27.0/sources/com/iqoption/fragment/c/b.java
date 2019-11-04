package com.iqoption.fragment.c;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.a.l;
import com.iqoption.core.ext.g;
import com.iqoption.core.marketanalysis.MarketAnalysisTab;
import com.iqoption.e.iu;
import com.iqoption.earningscalendar.f;
import com.iqoption.forexcalendar.h;
import com.iqoption.fragment.leftpanel.LeftPanelSection;
import com.iqoption.util.EventSenderLifecycleObserver;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\"\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001bH\u0002J\u0010\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001bH\u0002J\u001a\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006!"}, bng = {"Lcom/iqoption/fragment/infoasset/InfoAssetFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/databinding/FragmentInfoAssetBinding;", "viewModel", "Lcom/iqoption/fragment/infoasset/InfoAssetViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "", "enter", "", "nextAnim", "onCreateAnimator", "Landroid/animation/Animator;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onHideAnimation", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "onShowAnimation", "onViewCreated", "view", "Companion", "app_optionXRelease"})
/* compiled from: InfoAssetFragment.kt */
public final class b extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final a dgv = new a();
    private HashMap apm;
    private iu dgt;
    private d dgu;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/fragment/infoasset/InfoAssetFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/fragment/infoasset/InfoAssetFragment;", "app_optionXRelease"})
    /* compiled from: InfoAssetFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return b.TAG;
        }

        public final b aDi() {
            return new b();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/fragment/infoasset/InfoAssetFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ b dgw;
        final /* synthetic */ l dgx;

        public b(b bVar, l lVar) {
            this.dgw = bVar;
            this.dgx = lVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.fragment.leftpanel.i.dkm.r(com.iqoption.core.ext.a.r(this.dgw)).b(LeftPanelSection.ASSET_INFO);
            a.dgs.aDb();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f¸\u0006\u0000"}, bng = {"com/iqoption/fragment/infoasset/InfoAssetFragment$onViewCreated$1$2", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_optionXRelease"})
    /* compiled from: InfoAssetFragment.kt */
    public static final class c implements OnPageChangeListener {
        final /* synthetic */ b dgw;
        final /* synthetic */ l dgx;

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        c(b bVar, l lVar) {
            this.dgw = bVar;
            this.dgx = lVar;
        }

        public void onPageSelected(int i) {
            a aVar = a.dgs;
            Fragment item = this.dgx.getItem(i);
            String str = item instanceof com.iqoption.fragment.c.c.a ? "information" : item instanceof com.iqoption.fragment.c.b.c ? "trading-conditions" : item instanceof h ? "economic-events" : item instanceof f ? "earnings-calendar" : "";
            aVar.iu(str);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "page", "Lcom/iqoption/core/marketanalysis/MarketAnalysisTab;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: InfoAssetFragment.kt */
    static final class d<T> implements Observer<MarketAnalysisTab> {
        final /* synthetic */ b dgw;
        final /* synthetic */ l dgy;
        final /* synthetic */ List dgz;

        d(b bVar, l lVar, List list) {
            this.dgw = bVar;
            this.dgy = lVar;
            this.dgz = list;
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x0050  */
        /* JADX WARNING: Missing block: B:10:0x0054, code skipped:
            if (r4 != null) goto L_0x005b;
     */
        /* renamed from: b */
        public final void onChanged(com.iqoption.core.marketanalysis.MarketAnalysisTab r4) {
            /*
            r3 = this;
            if (r4 != 0) goto L_0x0003;
        L_0x0002:
            goto L_0x0011;
        L_0x0003:
            r0 = com.iqoption.fragment.c.c.aob;
            r4 = r4.ordinal();
            r4 = r0[r4];
            r0 = 1;
            if (r4 == r0) goto L_0x0031;
        L_0x000e:
            r1 = 2;
            if (r4 == r1) goto L_0x0013;
        L_0x0011:
            r4 = 0;
            goto L_0x004e;
        L_0x0013:
            r4 = new com.iqoption.a.a;
            r1 = r3.dgw;
            r2 = 2131886833; // 0x7f1202f1 float:1.9408256E38 double:1.053292045E-314;
            r1 = r1.getString(r2);
            r2 = "getString(R.string.earnings)";
            kotlin.jvm.internal.i.e(r1, r2);
            r1 = (java.lang.CharSequence) r1;
            r2 = com.iqoption.earningscalendar.f.cNk;
            r0 = r2.de(r0);
            r0 = (androidx.fragment.app.Fragment) r0;
            r4.<init>(r1, r0);
            goto L_0x004e;
        L_0x0031:
            r4 = new com.iqoption.a.a;
            r1 = r3.dgw;
            r2 = 2131886962; // 0x7f120372 float:1.9408518E38 double:1.0532921087E-314;
            r1 = r1.getString(r2);
            r2 = "getString(R.string.forex)";
            kotlin.jvm.internal.i.e(r1, r2);
            r1 = (java.lang.CharSequence) r1;
            r2 = com.iqoption.forexcalendar.h.cSE;
            r0 = r2.dl(r0);
            r0 = (androidx.fragment.app.Fragment) r0;
            r4.<init>(r1, r0);
        L_0x004e:
            if (r4 == 0) goto L_0x0057;
        L_0x0050:
            r4 = kotlin.collections.l.listOf(r4);
            if (r4 == 0) goto L_0x0057;
        L_0x0056:
            goto L_0x005b;
        L_0x0057:
            r4 = kotlin.collections.m.emptyList();
        L_0x005b:
            r0 = r3.dgy;
            r1 = r3.dgz;
            r1 = (java.util.Collection) r1;
            r4 = (java.lang.Iterable) r4;
            r4 = kotlin.collections.u.b(r1, r4);
            r0.s(r4);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.c.b$d.onChanged(com.iqoption.core.marketanalysis.MarketAnalysisTab):void");
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = b.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dgu = d.dgD.ab(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dgt = (iu) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_info_asset, viewGroup, false, 4, null);
        iu iuVar = this.dgt;
        if (iuVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return iuVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        l lVar = new l(com.iqoption.core.ext.a.u(this));
        iu iuVar = this.dgt;
        if (iuVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ImageView imageView = iuVar.cbk;
        kotlin.jvm.internal.i.e(imageView, "close");
        imageView.setOnClickListener(new b(this, lVar));
        iuVar.aRy.addOnPageChangeListener(new c(this, lVar));
        ViewPager viewPager = iuVar.aRy;
        String str = "pager";
        kotlin.jvm.internal.i.e(viewPager, str);
        viewPager.setOffscreenPageLimit(2);
        viewPager = iuVar.aRy;
        kotlin.jvm.internal.i.e(viewPager, str);
        viewPager.setAdapter(lVar);
        iuVar.cfQ.setupWithViewPager(iuVar.aRy);
        com.iqoption.a.a[] aVarArr = new com.iqoption.a.a[2];
        String string = getString(R.string.info);
        kotlin.jvm.internal.i.e(string, "getString(R.string.info)");
        aVarArr[0] = new com.iqoption.a.a(string, com.iqoption.fragment.c.c.a.dhI.aDT());
        string = getString(R.string.conditions);
        kotlin.jvm.internal.i.e(string, "getString(R.string.conditions)");
        aVarArr[1] = new com.iqoption.a.a(string, com.iqoption.fragment.c.b.c.dhE.aDS());
        List listOf = m.listOf(aVarArr);
        d dVar = this.dgu;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        dVar.aDj().observe(this, new d(this, lVar, listOf));
        getLifecycle().addObserver(new EventSenderLifecycleObserver(a.dgs.aDa(), null, 2, null));
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        Object aDg;
        String str;
        if (z) {
            aDg = aDg();
            str = "onShowAnimation()";
        } else {
            aDg = aDh();
            str = "onHideAnimation()";
        }
        kotlin.jvm.internal.i.e(aDg, str);
        return (Animator) aDg;
    }

    private final ObjectAnimator aDg() {
        iu iuVar = this.dgt;
        if (iuVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ConstraintLayout constraintLayout = iuVar.cfP;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{com.iqoption.core.ext.a.b((Fragment) this, (int) R.dimen.dp450), 0.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(constraintLayout, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(350);
        ofPropertyValuesHolder.setInterpolator(com.iqoption.view.a.a.c.bhT);
        return ofPropertyValuesHolder;
    }

    private final ObjectAnimator aDh() {
        iu iuVar = this.dgt;
        if (iuVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ConstraintLayout constraintLayout = iuVar.cfP;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{com.iqoption.core.ext.a.b((Fragment) this, (int) R.dimen.dp450)});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(constraintLayout, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(350);
        ofPropertyValuesHolder.setInterpolator(com.iqoption.view.a.a.c.bhU);
        return ofPropertyValuesHolder;
    }
}
