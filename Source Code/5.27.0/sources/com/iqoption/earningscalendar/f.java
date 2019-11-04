package com.iqoption.earningscalendar;

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
import com.google.gson.JsonObject;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.behavior.ScrollAwareBehavior;
import com.iqoption.core.ui.behavior.ScrollAwareType;
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

@i(bne = {1, 1, 15}, bnf = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0013\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\fH\u0002J\u0018\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\fH\u0002J\u0012\u0010*\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000¨\u0006."}, bng = {"Lcom/iqoption/earningscalendar/EarningsCalendarFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/earningscalendar/EarningsCalendarAdapter$Callbacks;", "()V", "binding", "Lcom/iqoption/earningscalendar/databinding/FragmentEarningsCalendarBinding;", "centerItemIndex", "", "Ljava/lang/Integer;", "earningLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "filterByCurrentActive", "", "getFilterByCurrentActive", "()Z", "filterByCurrentActive$delegate", "Lkotlin/Lazy;", "initialScrollingNeeded", "listener", "com/iqoption/earningscalendar/EarningsCalendarFragment$listener$1", "Lcom/iqoption/earningscalendar/EarningsCalendarFragment$listener$1;", "scrollAwareBehavior", "Lcom/iqoption/core/ui/behavior/ScrollAwareBehavior;", "viewModel", "Lcom/iqoption/earningscalendar/EarningsCalendarViewModel;", "onClickItem", "", "item", "Lcom/iqoption/earningscalendar/EarningsCalendarItem;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "scrollToCentralItem", "smooth", "setButtonVisibility", "visible", "animate", "updateScrollAwareType", "scrollAwareType", "Lcom/iqoption/core/ui/behavior/ScrollAwareType;", "Companion", "earningscalendar_release"})
/* compiled from: EarningsCalendarFragment.kt */
public final class f extends com.iqoption.core.ui.fragment.d implements com.iqoption.earningscalendar.d.a {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(f.class), "filterByCurrentActive", "getFilterByCurrentActive()Z"))};
    public static final a cNk = new a();
    private HashMap apm;
    private com.iqoption.earningscalendar.a.a cNc;
    private LinearLayoutManager cNd;
    private k cNe;
    private boolean cNf = true;
    private final kotlin.d cNg = g.c(new EarningsCalendarFragment$filterByCurrentActive$2(this));
    private ScrollAwareBehavior cNh;
    private Integer cNi;
    private final b cNj = new b(this);

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/earningscalendar/EarningsCalendarFragment$Companion;", "", "()V", "ARG_BY_CURRENT_ACTIVE", "", "ITEMS_FROM_CENTER_TO_SCROLL", "", "TAG", "getTAG", "()Ljava/lang/String;", "VISIBLE_THRESHOLD", "newInstance", "Lcom/iqoption/earningscalendar/EarningsCalendarFragment;", "filterByCurrentActive", "", "earningscalendar_release"})
    /* compiled from: EarningsCalendarFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final f de(boolean z) {
            f fVar = new f();
            Bundle bundle = new Bundle();
            bundle.putBoolean("ARG_BY_CURRENT_ACTIVE", z);
            fVar.setArguments(bundle);
            return fVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, bng = {"com/iqoption/earningscalendar/EarningsCalendarFragment$listener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "earningscalendar_release"})
    /* compiled from: EarningsCalendarFragment.kt */
    public static final class b extends OnScrollListener {
        final /* synthetic */ f this$0;

        b(f fVar) {
            this.this$0 = fVar;
        }

        /* JADX WARNING: Missing block: B:18:0x005e, code skipped:
            if (r8 > (r7.getItemCount() - 15)) goto L_0x0069;
     */
        /* JADX WARNING: Missing block: B:21:0x0067, code skipped:
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
            if (r9 >= 0) goto L_0x001a;
        L_0x0017:
            r9 = com.iqoption.core.marketanalysis.LoadingDirection.UP;
            goto L_0x001c;
        L_0x001a:
            r9 = com.iqoption.core.marketanalysis.LoadingDirection.DOWN;
        L_0x001c:
            r0 = r6.this$0;
            r0 = com.iqoption.earningscalendar.f.c(r0);
            r0 = r0.d(r9);
            if (r0 != 0) goto L_0x0029;
        L_0x0028:
            return;
        L_0x0029:
            r0 = 0;
            r1 = r7.getChildAt(r0);
            r1 = r7.getChildAdapterPosition(r1);
            r2 = 1;
            r8 = r8 - r2;
            r8 = r7.getChildAt(r8);
            r8 = r7.getChildAdapterPosition(r8);
            r3 = com.iqoption.earningscalendar.g.aob;
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
            r7 = com.iqoption.earningscalendar.f.c(r7);
            r7 = r7.c(r9);
            if (r7 != 0) goto L_0x0081;
        L_0x0076:
            if (r0 == 0) goto L_0x0081;
        L_0x0078:
            r7 = r6.this$0;
            r7 = com.iqoption.earningscalendar.f.c(r7);
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
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.earningscalendar.f$b.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/earningscalendar/EarningsCalendarFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends g {
        final /* synthetic */ d cNl;
        final /* synthetic */ f this$0;

        public c(f fVar, d dVar) {
            this.this$0 = fVar;
            this.cNl = dVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.dd(true);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "data", "Lcom/iqoption/earningscalendar/EarningsAdapterData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: EarningsCalendarFragment.kt */
    static final class d<T> implements Observer<c> {
        final /* synthetic */ d cNm;
        final /* synthetic */ f this$0;

        d(f fVar, d dVar) {
            this.this$0 = fVar;
            this.cNm = dVar;
        }

        /* renamed from: a */
        public final void onChanged(c cVar) {
            if (cVar != null) {
                List component1 = cVar.component1();
                com.iqoption.core.microservices.a.a.b auU = cVar.auU();
                if (auU != null || !cVar.auT()) {
                    this.cNm.aG(component1);
                    if (auU != null) {
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
                            e eVar = (e) ((Pair) obj2).bni();
                            if ((eVar instanceof h) && ((h) eVar).auW().ado() == auU.ado()) {
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

    public static final /* synthetic */ k c(f fVar) {
        k kVar = fVar.cNe;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return kVar;
    }

    static {
        String name = f.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.cNc = (com.iqoption.earningscalendar.a.a) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.earningscalendar.o.c.fragment_earnings_calendar, viewGroup, false, 4, null);
        d dVar = new d(this, com.iqoption.core.ext.a.p(this));
        this.cNe = k.cNz.c(this, auV());
        k kVar = this.cNe;
        String str = "viewModel";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        kVar.auZ();
        if (bundle != null) {
            this.cNf = false;
        }
        k kVar2 = this.cNe;
        if (kVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        kVar2.auY().observe(this, new d(this, dVar));
        this.cNd = new LinearLayoutManager(com.iqoption.core.ext.a.q(this));
        com.iqoption.earningscalendar.a.a aVar = this.cNc;
        str = "binding";
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = aVar.cNM;
        recyclerView.setHasFixedSize(true);
        kotlin.jvm.internal.i.e(recyclerView, "this");
        recyclerView.setAdapter(dVar);
        recyclerView.setItemAnimator((ItemAnimator) null);
        LinearLayoutManager linearLayoutManager = this.cNd;
        if (linearLayoutManager == null) {
            kotlin.jvm.internal.i.lG("earningLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addOnScrollListener(this.cNj);
        aVar = this.cNc;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        com.iqoption.core.a.a aVar2 = aVar.cNN;
        kotlin.jvm.internal.i.e(aVar2, "binding.earningListScrollButton");
        View root = aVar2.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.earningListScrollButton.root");
        LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
            this.cNh = new ScrollAwareBehavior(com.iqoption.core.ext.a.q(this), null, 2, null);
            ScrollAwareBehavior scrollAwareBehavior = this.cNh;
            String str2 = "scrollAwareBehavior";
            if (scrollAwareBehavior == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            scrollAwareBehavior.setEnabled(false);
            scrollAwareBehavior = this.cNh;
            if (scrollAwareBehavior == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            scrollAwareBehavior.a(ScrollAwareType.UP_SCROLL_HIDE);
            g(false, false);
            ScrollAwareBehavior scrollAwareBehavior2 = this.cNh;
            if (scrollAwareBehavior2 == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            layoutParams2.setBehavior(scrollAwareBehavior2);
            root.setLayoutParams(layoutParams2);
            root.setOnTouchListener(new com.iqoption.core.ui.widget.h.a(0.95f, 0.95f));
            root.setOnClickListener(new c(this, dVar));
            com.iqoption.earningscalendar.a.a aVar3 = this.cNc;
            if (aVar3 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            return aVar3.getRoot();
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
    }

    private final void g(boolean z, boolean z2) {
        com.iqoption.earningscalendar.a.a aVar = this.cNc;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        com.iqoption.core.a.a aVar2 = aVar.cNN;
        kotlin.jvm.internal.i.e(aVar2, "binding.earningListScrollButton");
        View root = aVar2.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.earningListScrollButton.root");
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
                com.iqoption.earningscalendar.a.a aVar = this.cNc;
                if (aVar == null) {
                    kotlin.jvm.internal.i.lG("binding");
                }
                aVar.cNM.smoothScrollToPosition(intValue);
            } else {
                LinearLayoutManager linearLayoutManager = this.cNd;
                if (linearLayoutManager == null) {
                    kotlin.jvm.internal.i.lG("earningLayoutManager");
                }
                linearLayoutManager.scrollToPositionWithOffset(intValue, 0);
            }
            g(false, true);
        }
    }

    public void a(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "item");
        com.iqoption.asset.mediators.a auX = hVar.auX();
        if (auX != null) {
            double d = com.iqoption.core.ext.a.p(this) ? 0.0d : 1.0d;
            com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
            JsonObject a = com.iqoption.core.marketanalysis.a.a(hVar.auW());
            a.addProperty("asset_id", (Number) Integer.valueOf(auX.Jt().getActiveId()));
            EC.a("earnings-calendar_click-event", d, a);
            k kVar = this.cNe;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            kVar.b(auX.Jt().ahU());
        }
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
                com.iqoption.earningscalendar.a.a aVar = this.cNc;
                if (aVar == null) {
                    kotlin.jvm.internal.i.lG("binding");
                }
                ImageView imageView = aVar.cNN.bfj;
                kotlin.jvm.internal.i.e(imageView, "binding.earningListScrol…ndarListScrollButtonImage");
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
