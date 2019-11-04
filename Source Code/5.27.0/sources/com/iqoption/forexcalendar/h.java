package com.iqoption.forexcalendar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import com.iqoption.core.ui.behavior.ScrollAwareBehavior;
import com.iqoption.core.ui.behavior.ScrollAwareType;
import com.iqoption.forexcalendar.a.g;
import com.iqoption.forexcalendar.r.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0013\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0017J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\nH\u0002J\u0018\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002J\u0012\u0010*\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000¨\u0006."}, bng = {"Lcom/iqoption/forexcalendar/ForexCalendarFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/forexcalendar/ForexCalendarAdapter$Callbacks;", "()V", "binding", "Lcom/iqoption/forexcalendar/databinding/FragmentForexCalendarBinding;", "centerItemIndex", "", "Ljava/lang/Integer;", "filterByCurrentActive", "", "getFilterByCurrentActive", "()Z", "filterByCurrentActive$delegate", "Lkotlin/Lazy;", "initialScrollingNeeded", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "listener", "com/iqoption/forexcalendar/ForexCalendarFragment$listener$1", "Lcom/iqoption/forexcalendar/ForexCalendarFragment$listener$1;", "scrollAwareBehavior", "Lcom/iqoption/core/ui/behavior/ScrollAwareBehavior;", "viewModel", "Lcom/iqoption/forexcalendar/ForexCalendarViewModel;", "onClickItem", "", "item", "Lcom/iqoption/forexcalendar/ForexCalendarItem;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "scrollToCentralItem", "smooth", "setButtonVisibility", "visible", "animate", "updateScrollAwareType", "scrollAwareType", "Lcom/iqoption/core/ui/behavior/ScrollAwareType;", "Companion", "forexcalendar_release"})
/* compiled from: ForexCalendarFragment.kt */
public final class h extends com.iqoption.core.ui.fragment.d implements com.iqoption.forexcalendar.f.a {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(h.class), "filterByCurrentActive", "getFilterByCurrentActive()Z"))};
    public static final a cSE = new a();
    private HashMap apm;
    private LinearLayoutManager apt;
    private boolean cNf = true;
    private final kotlin.d cNg = g.c(new ForexCalendarFragment$filterByCurrentActive$2(this));
    private ScrollAwareBehavior cNh;
    private Integer cNi;
    private g cSB;
    private n cSC;
    private final b cSD = new b(this);

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/forexcalendar/ForexCalendarFragment$Companion;", "", "()V", "ARG_BY_CURRENT_ACTIVE", "", "ITEMS_FROM_CENTER_TO_SCROLL", "", "TAG", "getTAG", "()Ljava/lang/String;", "VISIBLE_THREAD_HOLD", "newInstance", "Lcom/iqoption/forexcalendar/ForexCalendarFragment;", "filterByCurrentActive", "", "forexcalendar_release"})
    /* compiled from: ForexCalendarFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final h dl(boolean z) {
            h hVar = new h();
            Bundle bundle = new Bundle();
            bundle.putBoolean("ARG_BY_CURRENT_ACTIVE", z);
            hVar.setArguments(bundle);
            return hVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, bng = {"com/iqoption/forexcalendar/ForexCalendarFragment$listener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "forexcalendar_release"})
    /* compiled from: ForexCalendarFragment.kt */
    public static final class b extends OnScrollListener {
        final /* synthetic */ h this$0;

        b(h hVar) {
            this.this$0 = hVar;
        }

        /* JADX WARNING: Missing block: B:19:0x005e, code skipped:
            if (r8 > (r7.getItemCount() - 15)) goto L_0x0069;
     */
        /* JADX WARNING: Missing block: B:22:0x0067, code skipped:
            if (r1 < 15) goto L_0x0069;
     */
        public void onScrolled(androidx.recyclerview.widget.RecyclerView r7, int r8, int r9) {
            /*
            r6 = this;
            r8 = "recyclerView";
            kotlin.jvm.internal.i.f(r7, r8);
            r8 = r7.getChildCount();
            if (r8 == 0) goto L_0x00a7;
        L_0x000b:
            r0 = r7.getAdapter();
            if (r0 == 0) goto L_0x00a7;
        L_0x0011:
            if (r9 != 0) goto L_0x0015;
        L_0x0013:
            goto L_0x00a7;
        L_0x0015:
            r0 = 0;
            r1 = r7.getChildAt(r0);
            r1 = r7.getChildAdapterPosition(r1);
            r2 = 1;
            r8 = r8 - r2;
            r8 = r7.getChildAt(r8);
            r8 = r7.getChildAdapterPosition(r8);
            if (r9 >= 0) goto L_0x002d;
        L_0x002a:
            r9 = com.iqoption.core.marketanalysis.LoadingDirection.UP;
            goto L_0x002f;
        L_0x002d:
            r9 = com.iqoption.core.marketanalysis.LoadingDirection.DOWN;
        L_0x002f:
            r3 = r6.this$0;
            r3 = com.iqoption.forexcalendar.h.c(r3);
            r3 = r3.d(r9);
            if (r3 != 0) goto L_0x003c;
        L_0x003b:
            return;
        L_0x003c:
            r3 = com.iqoption.forexcalendar.i.aob;
            r4 = r9.ordinal();
            r3 = r3[r4];
            r4 = 15;
            r5 = 2;
            if (r3 == r2) goto L_0x0067;
        L_0x0049:
            if (r3 != r5) goto L_0x0061;
        L_0x004b:
            r7 = r7.getAdapter();
            if (r7 != 0) goto L_0x0054;
        L_0x0051:
            kotlin.jvm.internal.i.bnJ();
        L_0x0054:
            r3 = "recyclerView.adapter!!";
            kotlin.jvm.internal.i.e(r7, r3);
            r7 = r7.getItemCount();
            r7 = r7 - r4;
            if (r8 <= r7) goto L_0x006a;
        L_0x0060:
            goto L_0x0069;
        L_0x0061:
            r7 = new kotlin.NoWhenBranchMatchedException;
            r7.<init>();
            throw r7;
        L_0x0067:
            if (r1 >= r4) goto L_0x006a;
        L_0x0069:
            r0 = 1;
        L_0x006a:
            r7 = r6.this$0;
            r7 = com.iqoption.forexcalendar.h.c(r7);
            r7 = r7.c(r9);
            if (r7 != 0) goto L_0x0081;
        L_0x0076:
            if (r0 == 0) goto L_0x0081;
        L_0x0078:
            r7 = r6.this$0;
            r7 = com.iqoption.forexcalendar.h.c(r7);
            r7.a(r9);
        L_0x0081:
            r7 = r6.this$0;
            r7 = r7.cNi;
            if (r7 == 0) goto L_0x00a7;
        L_0x0089:
            r1 = r1 + r8;
            r1 = r1 / r5;
            r8 = r7.intValue();
            r8 = r8 + 5;
            if (r1 <= r8) goto L_0x0096;
        L_0x0093:
            r7 = com.iqoption.core.ui.behavior.ScrollAwareType.UP_SCROLL_HIDE;
            goto L_0x00a2;
        L_0x0096:
            r7 = r7.intValue();
            r7 = r7 + -5;
            if (r1 >= r7) goto L_0x00a1;
        L_0x009e:
            r7 = com.iqoption.core.ui.behavior.ScrollAwareType.DOWN_SCROLL_HIDE;
            goto L_0x00a2;
        L_0x00a1:
            r7 = 0;
        L_0x00a2:
            r8 = r6.this$0;
            r8.b(r7);
        L_0x00a7:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.forexcalendar.h$b.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/forexcalendar/ForexCalendarFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends com.iqoption.core.ext.g {
        final /* synthetic */ f cSF;
        final /* synthetic */ h this$0;

        public c(h hVar, f fVar) {
            this.this$0 = hVar;
            this.cSF = fVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.dd(true);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "data", "Lcom/iqoption/forexcalendar/ForexAdapterData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: ForexCalendarFragment.kt */
    static final class d<T> implements Observer<e> {
        final /* synthetic */ f cSG;
        final /* synthetic */ h this$0;

        d(h hVar, f fVar) {
            this.this$0 = hVar;
            this.cSG = fVar;
        }

        /* renamed from: a */
        public final void onChanged(e eVar) {
            if (eVar != null) {
                List component1 = eVar.component1();
                com.iqoption.core.microservices.b.a.a awA = eVar.awA();
                if (awA != null || !eVar.auT()) {
                    this.cSG.aG(component1);
                    if (awA != null) {
                        Object obj;
                        Integer num;
                        Object obj2;
                        Iterable iterable = component1;
                        Collection arrayList = new ArrayList(n.e(iterable, 10));
                        int i = 0;
                        for (Object obj3 : iterable) {
                            int i2 = i + 1;
                            if (i < 0) {
                                m.bno();
                            }
                            arrayList.add(new Pair(Integer.valueOf(i), obj3));
                            i = i2;
                        }
                        Iterator it = ((List) arrayList).iterator();
                        do {
                            num = null;
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            g gVar = (g) ((Pair) obj2).bni();
                            if ((gVar instanceof j) && ((j) gVar).awB().getId() == awA.getId()) {
                                obj3 = 1;
                                continue;
                            } else {
                                obj3 = null;
                                continue;
                            }
                        } while (obj3 == null);
                        Pair pair = (Pair) obj2;
                        if (pair != null) {
                            num = (Integer) pair.getFirst();
                        }
                        this.this$0.cNi = num;
                        if (this.this$0.cNf && num != null) {
                            this.this$0.dd(false);
                            this.this$0.cNf = false;
                        }
                    }
                }
            }
        }
    }

    private final boolean auV() {
        kotlin.d dVar = this.cNg;
        j jVar = anY[0];
        return ((Boolean) dVar.getValue()).booleanValue();
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

    public static final /* synthetic */ n c(h hVar) {
        n nVar = hVar.cSC;
        if (nVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return nVar;
    }

    static {
        String name = h.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.cSB = (g) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_forex_calendar, viewGroup, false, 4, null);
        f fVar = new f(this, com.iqoption.core.ext.a.p(this));
        this.cSC = n.cSQ.d(this, auV());
        n nVar = this.cSC;
        String str = "viewModel";
        if (nVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        nVar.auZ();
        if (bundle != null) {
            this.cNf = false;
        }
        n nVar2 = this.cSC;
        if (nVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        nVar2.awC().observe(this, new d(this, fVar));
        this.apt = new LinearLayoutManager(com.iqoption.core.ext.a.q(this));
        g gVar = this.cSB;
        str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        gVar.cTe.setHasFixedSize(true);
        RecyclerView recyclerView = gVar.cTe;
        String str2 = "forexList";
        kotlin.jvm.internal.i.e(recyclerView, str2);
        LinearLayoutManager linearLayoutManager = this.apt;
        if (linearLayoutManager == null) {
            kotlin.jvm.internal.i.lG("layoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView = gVar.cTe;
        kotlin.jvm.internal.i.e(recyclerView, str2);
        recyclerView.setAdapter(fVar);
        gVar.cTe.addOnScrollListener(this.cSD);
        recyclerView = gVar.cTe;
        kotlin.jvm.internal.i.e(recyclerView, str2);
        recyclerView.setItemAnimator((ItemAnimator) null);
        com.iqoption.core.a.a aVar = gVar.cTf;
        kotlin.jvm.internal.i.e(aVar, "forexListScrollButton");
        View root = aVar.getRoot();
        kotlin.jvm.internal.i.e(root, "forexListScrollButton.root");
        LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
            this.cNh = new ScrollAwareBehavior(com.iqoption.core.ext.a.q(this), null, 2, null);
            ScrollAwareBehavior scrollAwareBehavior = this.cNh;
            String str3 = "scrollAwareBehavior";
            if (scrollAwareBehavior == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            scrollAwareBehavior.setEnabled(false);
            scrollAwareBehavior = this.cNh;
            if (scrollAwareBehavior == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            scrollAwareBehavior.a(ScrollAwareType.UP_SCROLL_HIDE);
            g(false, false);
            ScrollAwareBehavior scrollAwareBehavior2 = this.cNh;
            if (scrollAwareBehavior2 == null) {
                kotlin.jvm.internal.i.lG(str3);
            }
            layoutParams2.setBehavior(scrollAwareBehavior2);
            root.setLayoutParams(layoutParams2);
            root.setOnTouchListener(new com.iqoption.core.ui.widget.h.a(0.95f, 0.95f));
            root.setOnClickListener(new c(this, fVar));
            g gVar2 = this.cSB;
            if (gVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            return gVar2.getRoot();
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
    }

    private final void g(boolean z, boolean z2) {
        g gVar = this.cSB;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        com.iqoption.core.a.a aVar = gVar.cTf;
        kotlin.jvm.internal.i.e(aVar, "binding.forexListScrollButton");
        View root = aVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.forexListScrollButton.root");
        String str = "scrollAwareBehavior";
        ScrollAwareBehavior scrollAwareBehavior;
        if (z2) {
            scrollAwareBehavior = this.cNh;
            if (scrollAwareBehavior == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            scrollAwareBehavior.e(root, z);
            return;
        }
        scrollAwareBehavior = this.cNh;
        if (scrollAwareBehavior == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        scrollAwareBehavior.f(root, z);
    }

    private final void dd(boolean z) {
        Integer num = this.cNi;
        if (num != null) {
            int intValue = num.intValue();
            if (z) {
                g gVar = this.cSB;
                if (gVar == null) {
                    kotlin.jvm.internal.i.lG("binding");
                }
                gVar.cTe.smoothScrollToPosition(intValue);
            } else {
                LinearLayoutManager linearLayoutManager = this.apt;
                if (linearLayoutManager == null) {
                    kotlin.jvm.internal.i.lG("layoutManager");
                }
                linearLayoutManager.scrollToPositionWithOffset(intValue, 0);
            }
            g(false, true);
        }
    }

    public void a(j jVar) {
        kotlin.jvm.internal.i.f(jVar, "item");
        com.iqoption.core.d.EC().a("economic-calendar_click-event", com.iqoption.core.marketanalysis.a.a(jVar.awB()));
        n nVar = this.cSC;
        if (nVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        nVar.b(jVar.awB());
    }

    private final void b(ScrollAwareType scrollAwareType) {
        ScrollAwareBehavior scrollAwareBehavior = this.cNh;
        String str = "scrollAwareBehavior";
        if (scrollAwareBehavior == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        boolean isShown = scrollAwareBehavior.isShown();
        if (scrollAwareType != null) {
            ScrollAwareBehavior scrollAwareBehavior2 = this.cNh;
            if (scrollAwareBehavior2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            if (scrollAwareBehavior2.a(scrollAwareType)) {
                float f = scrollAwareType == ScrollAwareType.DOWN_SCROLL_HIDE ? 180.0f : 0.0f;
                g gVar = this.cSB;
                if (gVar == null) {
                    kotlin.jvm.internal.i.lG("binding");
                }
                ImageView imageView = gVar.cTf.bfj;
                kotlin.jvm.internal.i.e(imageView, "binding.forexListScrollB…ndarListScrollButtonImage");
                imageView.setRotation(f);
            }
            if (!isShown) {
                g(true, true);
            }
        } else if (isShown) {
            g(false, true);
        }
    }
}
