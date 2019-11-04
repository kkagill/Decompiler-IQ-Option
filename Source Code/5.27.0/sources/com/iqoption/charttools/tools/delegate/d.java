package com.iqoption.charttools.tools.delegate;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.viewpager.widget.PagerAdapter;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.charttools.model.indicator.x;
import com.iqoption.charttools.tools.data.n;
import com.iqoption.charttools.tools.h;
import com.iqoption.core.util.v;
import com.iqoption.e.zt;
import com.iqoption.e.zv;
import com.iqoption.e.zx;
import com.iqoption.x.R;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, bng = {"Lcom/iqoption/charttools/tools/delegate/IndicatorsDelegate;", "Lcom/iqoption/charttools/tools/delegate/ContentDelegate;", "Lcom/iqoption/databinding/ToolsContentIndicatorsBinding;", "context", "Lcom/iqoption/charttools/tools/delegate/DelegateContext;", "(Lcom/iqoption/charttools/tools/delegate/DelegateContext;)V", "commonBinding", "Lcom/iqoption/databinding/ToolsContentIndicatorsCommonBinding;", "getCommonBinding", "()Lcom/iqoption/databinding/ToolsContentIndicatorsCommonBinding;", "commonBinding$delegate", "Lkotlin/Lazy;", "searchBinding", "Lcom/iqoption/databinding/ToolsContentIndicatorsSearchBinding;", "getSearchBinding", "()Lcom/iqoption/databinding/ToolsContentIndicatorsSearchBinding;", "searchBinding$delegate", "transition", "Landroidx/transition/Transition;", "getTransition", "()Landroidx/transition/Transition;", "transition$delegate", "Callback", "CategoryAdapterCallbacks", "ViewPagerAdapter", "app_optionXRelease"})
/* compiled from: IndicatorsDelegate.kt */
public final class d extends b<zt> {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(d.class), "transition", "getTransition()Landroidx/transition/Transition;")), k.a(new PropertyReference1Impl(k.G(d.class), "commonBinding", "getCommonBinding()Lcom/iqoption/databinding/ToolsContentIndicatorsCommonBinding;")), k.a(new PropertyReference1Impl(k.G(d.class), "searchBinding", "getSearchBinding()Lcom/iqoption/databinding/ToolsContentIndicatorsSearchBinding;"))};
    private final kotlin.d aNm = g.c(IndicatorsDelegate$transition$2.aNz);
    private final kotlin.d aNn;
    private final kotlin.d aNo;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, bng = {"Lcom/iqoption/charttools/tools/delegate/IndicatorsDelegate$Callback;", "", "onOpenIndicatorSettings", "", "meta", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "onOpenVideoPlayer", "videoUrl", "", "app_optionXRelease"})
    /* compiled from: IndicatorsDelegate.kt */
    public interface a {
        void d(x xVar);

        void eU(String str);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001$B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, bng = {"Lcom/iqoption/charttools/tools/delegate/IndicatorsDelegate$ViewPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "callbacks", "Lcom/iqoption/charttools/tools/delegate/DelegateContext$Callbacks;", "viewModel", "Lcom/iqoption/charttools/tools/ToolsViewModel;", "items", "", "Lcom/iqoption/charttools/tools/data/CategoryAdapterItem;", "(Landroidx/lifecycle/LifecycleOwner;Lcom/iqoption/charttools/tools/delegate/DelegateContext$Callbacks;Lcom/iqoption/charttools/tools/ToolsViewModel;Ljava/util/List;)V", "getCallbacks", "()Lcom/iqoption/charttools/tools/delegate/DelegateContext$Callbacks;", "getItems", "()Ljava/util/List;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getViewModel", "()Lcom/iqoption/charttools/tools/ToolsViewModel;", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "getPageTitle", "", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "Entry", "app_optionXRelease"})
    /* compiled from: IndicatorsDelegate.kt */
    private static final class c extends PagerAdapter {
        private final h aLB;
        private final com.iqoption.charttools.tools.delegate.c.a aLF;
        private final LifecycleOwner aNp;
        private final List<com.iqoption.charttools.tools.data.c> iA;

        @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, bng = {"Lcom/iqoption/charttools/tools/delegate/IndicatorsDelegate$ViewPagerAdapter$Entry;", "", "item", "Lcom/iqoption/charttools/tools/data/CategoryAdapterItem;", "observer", "Landroidx/lifecycle/Observer;", "", "Lcom/iqoption/charttools/tools/data/IndicatorAdapterItem;", "view", "Landroid/view/View;", "(Lcom/iqoption/charttools/tools/data/CategoryAdapterItem;Landroidx/lifecycle/Observer;Landroid/view/View;)V", "getItem", "()Lcom/iqoption/charttools/tools/data/CategoryAdapterItem;", "getObserver", "()Landroidx/lifecycle/Observer;", "getView", "()Landroid/view/View;", "app_optionXRelease"})
        /* compiled from: IndicatorsDelegate.kt */
        private static final class a {
            private final com.iqoption.charttools.tools.data.c aNq;
            private final Observer<List<com.iqoption.charttools.tools.data.h>> aNr;
            private final View view;

            public a(com.iqoption.charttools.tools.data.c cVar, Observer<List<com.iqoption.charttools.tools.data.h>> observer, View view) {
                kotlin.jvm.internal.i.f(cVar, "item");
                kotlin.jvm.internal.i.f(observer, "observer");
                kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
                this.aNq = cVar;
                this.aNr = observer;
                this.view = view;
            }

            public final com.iqoption.charttools.tools.data.c QJ() {
                return this.aNq;
            }

            public final Observer<List<com.iqoption.charttools.tools.data.h>> QK() {
                return this.aNr;
            }

            public final View getView() {
                return this.view;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/charttools/tools/data/IndicatorAdapterItem;", "kotlin.jvm.PlatformType", "onChanged"})
        /* compiled from: IndicatorsDelegate.kt */
        static final class b<T> implements Observer<List<? extends com.iqoption.charttools.tools.data.h>> {
            final /* synthetic */ com.iqoption.charttools.tools.a.b aNs;

            b(com.iqoption.charttools.tools.a.b bVar) {
                this.aNs = bVar;
            }

            /* renamed from: u */
            public final void onChanged(List<? extends com.iqoption.charttools.tools.data.h> list) {
                if (list != null) {
                    com.iqoption.core.ui.widget.recyclerview.adapter.a.a(this.aNs, list, null, 2, null);
                }
            }
        }

        public c(LifecycleOwner lifecycleOwner, com.iqoption.charttools.tools.delegate.c.a aVar, h hVar, List<? extends com.iqoption.charttools.tools.data.c> list) {
            kotlin.jvm.internal.i.f(lifecycleOwner, "lifecycleOwner");
            kotlin.jvm.internal.i.f(aVar, "callbacks");
            kotlin.jvm.internal.i.f(hVar, "viewModel");
            kotlin.jvm.internal.i.f(list, "items");
            this.aNp = lifecycleOwner;
            this.aLF = aVar;
            this.aLB = hVar;
            this.iA = list;
        }

        public boolean isViewFromObject(View view, Object obj) {
            kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
            kotlin.jvm.internal.i.f(obj, "object");
            Object obj2 = null;
            if (!(obj instanceof a)) {
                obj = null;
            }
            a aVar = (a) obj;
            if (aVar != null) {
                obj2 = aVar.getView();
            }
            return kotlin.jvm.internal.i.y(view, obj2);
        }

        public int getCount() {
            return this.iA.size();
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            kotlin.jvm.internal.i.f(viewGroup, "container");
            com.iqoption.charttools.tools.data.c cVar = (com.iqoption.charttools.tools.data.c) this.iA.get(i);
            com.iqoption.charttools.tools.a.b bVar = new com.iqoption.charttools.tools.a.b(new b(this.aLF, this.aLB, cVar));
            Observer bVar2 = new b(bVar);
            this.aLB.a(cVar).observe(this.aNp, bVar2);
            RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
            recyclerView.setHasFixedSize(true);
            recyclerView.setClipToPadding(false);
            recyclerView.setOverScrollMode(2);
            View view = recyclerView;
            recyclerView.setPadding(0, com.iqoption.core.ext.a.i(view, (int) R.dimen.dp8), 0, com.iqoption.core.ext.a.i(view, (int) R.dimen.dp8));
            recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup.getContext()));
            com.iqoption.core.ext.a.b(recyclerView);
            recyclerView.setAdapter(bVar);
            viewGroup.addView(view);
            return new a(cVar, bVar2, view);
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            kotlin.jvm.internal.i.f(viewGroup, "container");
            kotlin.jvm.internal.i.f(obj, "object");
            a aVar = (a) obj;
            this.aLB.a(aVar.QJ()).removeObserver(aVar.QK());
            viewGroup.removeView(aVar.getView());
        }

        public CharSequence getPageTitle(int i) {
            return ((com.iqoption.charttools.tools.data.c) this.iA.get(i)).getTitle();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/charttools/tools/delegate/IndicatorsDelegate$CategoryAdapterCallbacks;", "Lcom/iqoption/charttools/tools/adapters/IndicatorsAdapter$Callbacks;", "callbacks", "Lcom/iqoption/charttools/tools/delegate/DelegateContext$Callbacks;", "viewModel", "Lcom/iqoption/charttools/tools/ToolsViewModel;", "categoryAdapterItem", "Lcom/iqoption/charttools/tools/data/CategoryAdapterItem;", "(Lcom/iqoption/charttools/tools/delegate/DelegateContext$Callbacks;Lcom/iqoption/charttools/tools/ToolsViewModel;Lcom/iqoption/charttools/tools/data/CategoryAdapterItem;)V", "onItemClick", "", "item", "Lcom/iqoption/charttools/tools/data/TitleIndicatorItem;", "onItemFavoriteButtonClick", "onItemInfoButtonClick", "onItemVideoLinkClick", "Lcom/iqoption/charttools/tools/data/InfoIndicatorItem;", "app_optionXRelease"})
    /* compiled from: IndicatorsDelegate.kt */
    private static final class b implements com.iqoption.charttools.tools.a.b.a {
        private final h aLB;
        private final com.iqoption.charttools.tools.delegate.c.a aLF;
        private final com.iqoption.charttools.tools.data.c aMA;

        public b(com.iqoption.charttools.tools.delegate.c.a aVar, h hVar, com.iqoption.charttools.tools.data.c cVar) {
            kotlin.jvm.internal.i.f(aVar, "callbacks");
            kotlin.jvm.internal.i.f(hVar, "viewModel");
            kotlin.jvm.internal.i.f(cVar, "categoryAdapterItem");
            this.aLF = aVar;
            this.aLB = hVar;
            this.aMA = cVar;
        }

        public void c(n nVar) {
            kotlin.jvm.internal.i.f(nVar, "item");
            this.aLF.d(nVar.MH());
        }

        public void d(n nVar) {
            kotlin.jvm.internal.i.f(nVar, "item");
            this.aLB.a(this.aMA, nVar);
        }

        public void e(n nVar) {
            kotlin.jvm.internal.i.f(nVar, "item");
            this.aLB.a(nVar);
        }

        public void a(com.iqoption.charttools.tools.data.i iVar) {
            kotlin.jvm.internal.i.f(iVar, "item");
            String Oq = iVar.Oq();
            if (Oq != null) {
                this.aLF.eU(Oq);
            }
        }
    }

    private final Transition QG() {
        kotlin.d dVar = this.aNm;
        j jVar = anY[0];
        return (Transition) dVar.getValue();
    }

    private final zv QH() {
        kotlin.d dVar = this.aNn;
        j jVar = anY[1];
        return (zv) dVar.getValue();
    }

    private final zx QI() {
        kotlin.d dVar = this.aNo;
        j jVar = anY[2];
        return (zx) dVar.getValue();
    }

    public d(final c cVar) {
        kotlin.jvm.internal.i.f(cVar, "context");
        super(R.layout.tools_content_indicators, cVar);
        this.aNn = g.c(new IndicatorsDelegate$commonBinding$2(this, cVar));
        this.aNo = g.c(new IndicatorsDelegate$searchBinding$2(this, cVar));
        PL().Qf().observe(this, new Observer<Boolean>(this) {
            final /* synthetic */ d this$0;

            /* renamed from: f */
            public final void onChanged(Boolean bool) {
                if (bool != null) {
                    bool.booleanValue();
                    FrameLayout frameLayout = ((zt) this.this$0.getBinding()).cuo;
                    View childAt = frameLayout.getChildAt(0);
                    View root = (bool.booleanValue() ? this.this$0.QI() : this.this$0.QH()).getRoot();
                    kotlin.jvm.internal.i.e(root, "(if (isSearchEnabled) se… else commonBinding).root");
                    if ((kotlin.jvm.internal.i.y(childAt, root) ^ 1) != 0) {
                        if (childAt != null) {
                            TransitionManager.beginDelayedTransition(frameLayout, this.this$0.QG());
                            frameLayout.removeAllViews();
                        }
                        frameLayout.addView(root);
                        if (bool.booleanValue()) {
                            this.this$0.QI().cfF.requestFocus();
                            v.ad(this.this$0.QI().cfF);
                            return;
                        }
                        v.j(cVar.getActivity());
                    }
                }
            }
        });
    }
}
