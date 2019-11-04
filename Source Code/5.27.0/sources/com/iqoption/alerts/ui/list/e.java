package com.iqoption.alerts.ui.list;

import android.animation.Animator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.g;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0003J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/alerts/ui/list/AlertsListFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/alerts/ui/list/AlertItemViewHolder$Callback;", "()V", "adapter", "Lcom/iqoption/alerts/ui/list/AlertItemsAdapter;", "listView", "Landroidx/recyclerview/widget/RecyclerView;", "viewModel", "Lcom/iqoption/alerts/ui/list/AlertsListViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "", "item", "Lcom/iqoption/alerts/ui/list/AlertItem;", "position", "", "onItemConfigureClick", "onItemDeleteClick", "scrollOnExpand", "AddButtonController", "Companion", "alerts_release"})
/* compiled from: AlertsListFragment.kt */
public final class e extends com.iqoption.core.ui.fragment.d implements com.iqoption.alerts.ui.list.c.a {
    public static final b apl = new b();
    private g api;
    private RecyclerView apj;
    private d apk;
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, bng = {"Lcom/iqoption/alerts/ui/list/AlertsListFragment$Companion;", "", "()V", "newInstance", "Lcom/iqoption/alerts/ui/list/AlertsListFragment;", "alerts_release"})
    /* compiled from: AlertsListFragment.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final e Bk() {
            return new e();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: AlertsListFragment.kt */
    static final class f implements Runnable {
        final /* synthetic */ e apr;
        final /* synthetic */ int apx;

        f(e eVar, int i) {
            this.apr = eVar;
            this.apx = i;
        }

        public final void run() {
            this.apr.dC(this.apx);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/alerts/ui/list/AlertsListFragment$AddButtonController;", "Lcom/iqoption/core/graphics/animation/CancelCompleteAnimatorListener;", "view", "Landroid/view/View;", "translation", "", "(Landroid/view/View;F)V", "<set-?>", "", "isShown", "()Z", "setShown", "(Z)V", "isShown$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCompleted", "", "animation", "Landroid/animation/Animator;", "alerts_release"})
    /* compiled from: AlertsListFragment.kt */
    private static final class a extends com.iqoption.core.graphics.animation.b {
        static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(a.class), "isShown", "isShown()Z"))};
        private final kotlin.f.d apn;
        private final float apo;
        private final View view;

        @i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, bng = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"})
        /* compiled from: Delegates.kt */
        public static final class a extends kotlin.f.c<Boolean> {
            final /* synthetic */ Object app;
            final /* synthetic */ a apq;

            public a(Object obj, Object obj2, a aVar) {
                this.app = obj;
                this.apq = aVar;
                super(obj2);
            }

            /* Access modifiers changed, original: protected */
            public void a(j<?> jVar, Boolean bool, Boolean bool2) {
                kotlin.jvm.internal.i.f(jVar, "property");
                boolean booleanValue = bool2.booleanValue();
                if (bool.booleanValue() == booleanValue) {
                    return;
                }
                if (booleanValue) {
                    if (com.iqoption.core.ext.a.am(this.apq.view)) {
                        com.iqoption.core.ext.a.ak(this.apq.view);
                        this.apq.view.setAlpha(0.0f);
                        this.apq.view.setTranslationY(this.apq.apo);
                    }
                    this.apq.view.animate().translationY(0.0f).alpha(1.0f).setInterpolator(com.iqoption.core.graphics.animation.j.XJ()).setListener(null).start();
                    return;
                }
                this.apq.view.animate().translationY(this.apq.apo).alpha(0.0f).setInterpolator(com.iqoption.core.graphics.animation.j.XJ()).setListener(this.apq).start();
            }
        }

        public final void aw(boolean z) {
            this.apn.a(this, anY[0], Boolean.valueOf(z));
        }

        public a(View view, float f) {
            kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
            this.view = view;
            this.apo = f;
            kotlin.f.a aVar = kotlin.f.a.eWg;
            Boolean valueOf = Boolean.valueOf(false);
            this.apn = new a(valueOf, valueOf, this);
        }

        public void b(Animator animator) {
            super.b(animator);
            com.iqoption.core.ext.a.al(this.view);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/alerts/ui/list/AlertsListFragment$onCreateView$1$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "alerts_release"})
    /* compiled from: AlertsListFragment.kt */
    public static final class c extends g {
        final /* synthetic */ e apr;

        c(e eVar) {
            this.apr = eVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            if (view.getId() == com.iqoption.alerts.b.d.btnAddAlert) {
                g.a(e.a(this.apr), null, 1, null);
                FragmentActivity activity = this.apr.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/iqoption/alerts/ui/list/AlertsListFragment$onCreateView$1$1"})
    /* compiled from: AlertsListFragment.kt */
    static final class d<T> implements Observer<Boolean> {
        final /* synthetic */ e apr;
        final /* synthetic */ com.iqoption.alerts.a.e aps;

        @i(bne = {1, 1, 15}, bnf = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010¸\u0006\u0000"}, bng = {"com/iqoption/alerts/ui/list/AlertsListFragment$onCreateView$1$1$1", "Landroidx/lifecycle/Observer;", "", "Lcom/iqoption/alerts/ui/list/AlertAdapterItem;", "isFirstTime", "", "()Z", "setFirstTime", "(Z)V", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "onChanged", "", "items", "alerts_release"})
        /* compiled from: AlertsListFragment.kt */
        /* renamed from: com.iqoption.alerts.ui.list.e$d$1 */
        public static final class AnonymousClass1 implements Observer<List<? extends a>> {
            private final LinearLayoutManager apt;
            private boolean apu;
            final /* synthetic */ d apv;

            AnonymousClass1(d dVar) {
                this.apv = dVar;
                RecyclerView recyclerView = this.apv.aps.aou;
                kotlin.jvm.internal.i.e(recyclerView, "alertsList");
                LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    this.apt = (LinearLayoutManager) layoutManager;
                    this.apu = true;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            }

            public final LinearLayoutManager Bl() {
                return this.apt;
            }

            /* renamed from: u */
            public void onChanged(List<? extends a> list) {
                if (list != null) {
                    Object obj;
                    Iterable<a> iterable = list;
                    int i = 0;
                    if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                        for (a AZ : iterable) {
                            if (AZ.AZ()) {
                                obj = 1;
                                break;
                            }
                        }
                    }
                    obj = null;
                    if (obj == null || !this.apu) {
                        com.iqoption.core.ui.widget.recyclerview.adapter.a.a(e.b(this.apv.apr), list, null, 2, null);
                        return;
                    }
                    this.apu = false;
                    IntRef intRef = new IntRef();
                    intRef.element = list.size() - 1;
                    IntRef intRef2 = new IntRef();
                    intRef2.element = 0;
                    for (a aVar : list) {
                        if (aVar instanceof l) {
                            break;
                        }
                        i++;
                    }
                    i = -1;
                    if (i != -1) {
                        intRef.element = i;
                        intRef2.element = com.iqoption.core.ext.a.c((ViewDataBinding) this.apv.aps, com.iqoption.alerts.b.b.dp64);
                    }
                    e.b(this.apv.apr).a((List) list, (m) new AlertsListFragment$onCreateView$$inlined$apply$lambda$2$1$1(this, intRef, intRef2));
                }
            }
        }

        d(com.iqoption.alerts.a.e eVar, e eVar2) {
            this.aps = eVar;
            this.apr = eVar2;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(false))) {
                e eVar = this.apr;
                eVar.a(e.a(eVar).Bo(), new AnonymousClass1(this));
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"com/iqoption/alerts/ui/list/AlertsListFragment$onCreateView$1$2", "Landroidx/lifecycle/Observer;", "", "controller", "Lcom/iqoption/alerts/ui/list/AlertsListFragment$AddButtonController;", "onChanged", "", "isShow", "(Ljava/lang/Boolean;)V", "alerts_release"})
    /* compiled from: AlertsListFragment.kt */
    public static final class e implements Observer<Boolean> {
        final /* synthetic */ com.iqoption.alerts.a.e aps;
        private final a apw;

        e(com.iqoption.alerts.a.e eVar) {
            this.aps = eVar;
            ImageView imageView = this.aps.aov;
            kotlin.jvm.internal.i.e(imageView, "btnAddAlert");
            this.apw = new a(imageView, com.iqoption.core.ext.a.b((ViewDataBinding) this.aps, com.iqoption.alerts.b.b.dp60));
        }

        /* renamed from: f */
        public void onChanged(Boolean bool) {
            this.apw.aw(kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true)));
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

    public void a(b bVar, int i) {
        kotlin.jvm.internal.i.f(bVar, "item");
        g gVar = this.api;
        String str = "viewModel";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        long Bq = gVar.Bq();
        String str2 = "adapter";
        d dVar;
        if (Bq == bVar.AY()) {
            bVar.setExpanded(false);
            if (i != -1) {
                dVar = this.apk;
                if (dVar == null) {
                    kotlin.jvm.internal.i.lG(str2);
                }
                dVar.notifyItemChanged(i);
            }
        } else {
            if (Bq != -1) {
                d dVar2 = this.apk;
                if (dVar2 == null) {
                    kotlin.jvm.internal.i.lG(str2);
                }
                List<a> items = dVar2.getItems();
                int i2 = 0;
                for (a AY : items) {
                    if ((AY.AY() == Bq ? 1 : null) != null) {
                        break;
                    }
                    i2++;
                }
                i2 = -1;
                if (i2 != -1) {
                    Object obj = items.get(i2);
                    if (!(obj instanceof b)) {
                        obj = null;
                    }
                    b bVar2 = (b) obj;
                    if (bVar2 != null) {
                        bVar2.setExpanded(false);
                    }
                    dVar = this.apk;
                    if (dVar == null) {
                        kotlin.jvm.internal.i.lG(str2);
                    }
                    dVar.notifyItemChanged(i2);
                }
            }
            bVar.setExpanded(true);
            if (i != -1) {
                dVar = this.apk;
                if (dVar == null) {
                    kotlin.jvm.internal.i.lG(str2);
                }
                dVar.notifyItemChanged(i);
                RecyclerView recyclerView = this.apj;
                String str3 = "listView";
                if (recyclerView == null) {
                    kotlin.jvm.internal.i.lG(str3);
                }
                Runnable fVar = new f(this, i);
                RecyclerView recyclerView2 = this.apj;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.i.lG(str3);
                }
                ItemAnimator itemAnimator = recyclerView2.getItemAnimator();
                if (itemAnimator == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                kotlin.jvm.internal.i.e(itemAnimator, "listView.itemAnimator!!");
                recyclerView.postDelayed(fVar, itemAnimator.getChangeDuration());
            }
        }
        g gVar2 = this.api;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar2.c(bVar);
    }

    private final void dC(int i) {
        RecyclerView recyclerView = this.apj;
        String str = "listView";
        if (recyclerView == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerView2 = this.apj;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            ViewHolder b = com.iqoption.core.ext.a.b(recyclerView2, i2);
            if (b != null) {
                View view = b.itemView;
                kotlin.jvm.internal.i.e(view, "holder.itemView");
                RecyclerView recyclerView3;
                if (b.getAdapterPosition() != i) {
                    continue;
                } else if (view.getTop() < 0) {
                    recyclerView3 = this.apj;
                    if (recyclerView3 == null) {
                        kotlin.jvm.internal.i.lG(str);
                    }
                    recyclerView3.smoothScrollBy(0, view.getTop());
                    return;
                } else {
                    int bottom = view.getBottom();
                    RecyclerView recyclerView4 = this.apj;
                    if (recyclerView4 == null) {
                        kotlin.jvm.internal.i.lG(str);
                    }
                    if (bottom > recyclerView4.getHeight()) {
                        recyclerView3 = this.apj;
                        if (recyclerView3 == null) {
                            kotlin.jvm.internal.i.lG(str);
                        }
                        childCount = view.getBottom();
                        RecyclerView recyclerView5 = this.apj;
                        if (recyclerView5 == null) {
                            kotlin.jvm.internal.i.lG(str);
                        }
                        recyclerView3.smoothScrollBy(0, childCount - recyclerView5.getHeight());
                        return;
                    }
                }
            }
        }
    }

    public void a(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "item");
        g gVar = this.api;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        gVar.a(bVar);
    }

    public void b(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "item");
        g gVar = this.api;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        gVar.b(bVar);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.api = g.apI.a(com.iqoption.core.ext.a.r(this));
        g gVar = this.api;
        String str = "viewModel";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        kotlin.jvm.a.b Bn = f.apy.Bn();
        gVar.a(Bn != null ? (f) Bn.invoke(this) : null);
        com.iqoption.alerts.a.e eVar = (com.iqoption.alerts.a.e) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.alerts.b.e.alerts_list_fragment, viewGroup, false, 4, null);
        eVar.aov.setOnClickListener(new c(this));
        eVar.aou.setHasFixedSize(true);
        this.apk = new d(this);
        RecyclerView recyclerView = eVar.aou;
        String str2 = "alertsList";
        kotlin.jvm.internal.i.e(recyclerView, str2);
        d dVar = this.apk;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        recyclerView.setAdapter(dVar);
        recyclerView = eVar.aou;
        kotlin.jvm.internal.i.e(recyclerView, str2);
        this.apj = recyclerView;
        com.iqoption.core.ui.f.a.bJH.B(com.iqoption.core.ext.a.v(this)).alI().observe(com.iqoption.core.ext.a.v(this), new d(eVar, this));
        g gVar2 = this.api;
        if (gVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(gVar2.Bp(), new e(eVar));
        return eVar.getRoot();
    }
}
