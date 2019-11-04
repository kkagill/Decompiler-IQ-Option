package com.iqoption.fragment.leftpanel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.k;
import com.iqoption.e.li;
import com.iqoption.fragment.ag;
import com.iqoption.signals.n;
import com.iqoption.util.ak;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.List;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u0003:\u00014B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0010H\u0016J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0018H\u0002J\u0018\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u000203H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u00065"}, bng = {"Lcom/iqoption/fragment/leftpanel/LeftPanelFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/fragment/leftpanel/LeftPanelAdapter$Callbacks;", "Lcom/iqoption/view/helper/draganddrop/DragAndDropItemTouchHelperCallback$Callback;", "()V", "binding", "Lcom/iqoption/databinding/FragmentLeftPanelBinding;", "icons", "Landroid/util/SparseArray;", "Landroid/graphics/drawable/Drawable;", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "viewModel", "Lcom/iqoption/fragment/leftpanel/LeftPanelViewModel;", "getDrawable", "res", "", "getIcon", "resId", "onBackPressed", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onClickExpanded", "", "onClickItem", "item", "Lcom/iqoption/fragment/leftpanel/LeftPanelItem;", "onClickVisibleItem", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemMove", "fromPosition", "toPosition", "onStartDrag", "viewHolder", "Lcom/iqoption/fragment/leftpanel/LeftPanelItemViewHolder;", "removeFragment", "replace", "fragment", "Landroidx/fragment/app/Fragment;", "tag", "", "replaceFragment", "section", "Lcom/iqoption/fragment/leftpanel/LeftPanelSection;", "Companion", "app_optionXRelease"})
/* compiled from: LeftPanelFragment.kt */
public final class LeftPanelFragment extends com.iqoption.core.ui.fragment.d implements com.iqoption.fragment.leftpanel.b.a, com.iqoption.view.c.a.a.a {
    private static final String TAG;
    public static final f djT = new f();
    private HashMap apm;
    private final SparseArray<Drawable> djP = new SparseArray();
    private ItemTouchHelper djQ;
    private li djR;
    private i djS;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/fragment/leftpanel/LeftPanelFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/fragment/leftpanel/LeftPanelFragment;", "app_optionXRelease"})
    /* compiled from: LeftPanelFragment.kt */
    public static final class f {
        private f() {
        }

        public /* synthetic */ f(f fVar) {
            this();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Object;)V", "com/iqoption/util/LiveDatasKt$observe$1"})
    /* compiled from: LiveDatas.kt */
    public static final class a<T> implements Observer<T> {
        final /* synthetic */ li djU;

        public a(li liVar) {
            this.djU = liVar;
        }

        public final void onChanged(T t) {
            if (t != null) {
                ViewDataBinding viewDataBinding;
                int i;
                boolean booleanValue = ((Boolean) t).booleanValue();
                FrameLayout frameLayout = this.djU.bYl;
                kotlin.jvm.internal.i.e(frameLayout, "baseContainer");
                frameLayout.setClickable(booleanValue);
                if (booleanValue) {
                    viewDataBinding = this.djU;
                    i = R.dimen.dp259;
                } else {
                    viewDataBinding = this.djU;
                    i = R.dimen.dp50;
                }
                int c = com.iqoption.core.ext.a.c(viewDataBinding, i);
                frameLayout = this.djU.chf;
                String str = "menuContainer";
                kotlin.jvm.internal.i.e(frameLayout, str);
                LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.width = c;
                FrameLayout frameLayout2 = this.djU.chf;
                kotlin.jvm.internal.i.e(frameLayout2, str);
                frameLayout2.setLayoutParams(layoutParams);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Object;)V", "com/iqoption/util/LiveDatasKt$observe$1"})
    /* compiled from: LiveDatas.kt */
    public static final class b<T> implements Observer<T> {
        final /* synthetic */ b djV;

        public b(b bVar) {
            this.djV = bVar;
        }

        public final void onChanged(T t) {
            if (t != null) {
                com.iqoption.core.ui.widget.recyclerview.adapter.a.a(this.djV, (List) t, null, 2, null);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Object;)V", "com/iqoption/util/LiveDatasKt$observe$1"})
    /* compiled from: LiveDatas.kt */
    public static final class c<T> implements Observer<T> {
        final /* synthetic */ a djW;

        public c(a aVar) {
            this.djW = aVar;
        }

        public final void onChanged(T t) {
            if (t != null) {
                this.djW.aw(((Boolean) t).booleanValue());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Object;)V", "com/iqoption/util/LiveDatasKt$observe$1"})
    /* compiled from: LiveDatas.kt */
    public static final class d<T> implements Observer<T> {
        final /* synthetic */ a djX;

        public d(a aVar) {
            this.djX = aVar;
        }

        public final void onChanged(T t) {
            if (t != null) {
                this.djX.aw(((Boolean) t).booleanValue());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Object;)V", "com/iqoption/util/LiveDatasKt$observe$1"})
    /* compiled from: LiveDatas.kt */
    public static final class e<T> implements Observer<T> {
        final /* synthetic */ a djY;

        public e(a aVar) {
            this.djY = aVar;
        }

        public final void onChanged(T t) {
            if (t != null) {
                this.djY.aw(((Number) t).intValue() != 0);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, bng = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Object;)V", "com/iqoption/util/LiveDatasKt$observeNullable$1", "com/iqoption/fragment/leftpanel/LeftPanelFragment$$special$$inlined$observeNullable$1"})
    /* compiled from: LiveDatas.kt */
    public static final class g<T> implements Observer<T> {
        final /* synthetic */ LeftPanelFragment djZ;

        public g(LeftPanelFragment leftPanelFragment) {
            this.djZ = leftPanelFragment;
        }

        public final void onChanged(T t) {
            LeftPanelSection leftPanelSection = (LeftPanelSection) t;
            if (leftPanelSection == null) {
                this.djZ.aEI();
            } else {
                this.djZ.a(leftPanelSection);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/fragment/leftpanel/LeftPanelFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class h extends com.iqoption.core.ext.g {
        final /* synthetic */ LeftPanelFragment djZ;

        public h(LeftPanelFragment leftPanelFragment) {
            this.djZ = leftPanelFragment;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.fragment.leftmenu.f.diW.q(com.iqoption.core.ext.a.r(this.djZ)).toggle();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/fragment/leftpanel/LeftPanelFragment$$special$$inlined$setOnDelayedClickListener$2"})
    /* compiled from: AndroidExtensions.kt */
    public static final class i extends com.iqoption.core.ext.g {
        final /* synthetic */ LeftPanelFragment djZ;

        public i(LeftPanelFragment leftPanelFragment) {
            this.djZ = leftPanelFragment;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            if (LeftPanelFragment.b(this.djZ).nq()) {
                LeftPanelFragment.b(this.djZ).aEQ();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveIdentifier;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: LeftPanelFragment.kt */
    static final class j<T> implements Observer<com.iqoption.core.microservices.tradingengine.response.active.f> {
        final /* synthetic */ LeftPanelFragment djZ;

        j(LeftPanelFragment leftPanelFragment) {
            this.djZ = leftPanelFragment;
        }

        /* renamed from: c */
        public final void onChanged(com.iqoption.core.microservices.tradingengine.response.active.f fVar) {
            this.djZ.aly();
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
        String simpleName = LeftPanelFragment.class.getSimpleName();
        kotlin.jvm.internal.i.e(simpleName, "LeftPanelFragment::class.java.simpleName");
        TAG = simpleName;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a aVar;
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.djR = (li) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_left_panel, viewGroup, false, 4, null);
        this.djS = i.dkm.r(com.iqoption.core.ext.a.r(this));
        li liVar = this.djR;
        String str = "binding";
        if (liVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = liVar.chf;
        kotlin.jvm.internal.i.e(frameLayout, "menuContainer");
        frameLayout.setLayoutTransition(ak.anP());
        i iVar = this.djS;
        String str2 = "viewModel";
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        LifecycleOwner lifecycleOwner = this;
        iVar.aEL().observe(lifecycleOwner, new a(liVar));
        b bVar = new b(this);
        RecyclerView recyclerView = liVar.aIq;
        String str3 = "list";
        kotlin.jvm.internal.i.e(recyclerView, str3);
        recyclerView.setLayoutManager(new LinearLayoutManager(com.iqoption.core.ext.a.q(this)));
        recyclerView = liVar.aIq;
        kotlin.jvm.internal.i.e(recyclerView, str3);
        recyclerView.setAdapter(bVar);
        this.djQ = new ItemTouchHelper(new com.iqoption.view.c.a.a(this));
        ItemTouchHelper itemTouchHelper = this.djQ;
        if (itemTouchHelper == null) {
            kotlin.jvm.internal.i.lG("itemTouchHelper");
        }
        itemTouchHelper.attachToRecyclerView(liVar.aIq);
        i iVar2 = this.djS;
        if (iVar2 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        iVar2.aEO().observe(lifecycleOwner, new b(bVar));
        iVar = this.djS;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        iVar.aEP().observe(lifecycleOwner, new g(this));
        Drawable icon = getIcon(LeftPanelSection.PORTFOIO.getIcon());
        if (!(icon instanceof com.iqoption.core.graphics.a.a)) {
            icon = null;
        }
        com.iqoption.core.graphics.a.a aVar2 = (com.iqoption.core.graphics.a.a) icon;
        if (aVar2 != null) {
            aVar = new a(aVar2);
            iVar = this.djS;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            iVar.aEM().observe(lifecycleOwner, new c(aVar));
        }
        icon = getIcon(LeftPanelSection.VIDEO_EDUCATION.getIcon());
        if (!(icon instanceof com.iqoption.core.graphics.a.a)) {
            icon = null;
        }
        aVar2 = (com.iqoption.core.graphics.a.a) icon;
        if (aVar2 != null) {
            aVar = new a(aVar2);
            iVar = this.djS;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            iVar.aEN().observe(lifecycleOwner, new d(aVar));
        }
        icon = getIcon(LeftPanelSection.CHATS.getIcon());
        if (!(icon instanceof com.iqoption.core.graphics.a.a)) {
            icon = null;
        }
        aVar2 = (com.iqoption.core.graphics.a.a) icon;
        if (aVar2 != null) {
            aVar = new a(aVar2);
            if (!com.iqoption.core.d.Un().Dq()) {
                new com.iqoption.fragment.leftmenu.h().aEx().observe(lifecycleOwner, new e(aVar));
            }
        }
        ImageView imageView = liVar.che;
        kotlin.jvm.internal.i.e(imageView, "menu");
        imageView.setOnClickListener(new h(this));
        FrameLayout frameLayout2 = liVar.bYl;
        kotlin.jvm.internal.i.e(frameLayout2, "baseContainer");
        frameLayout2.setOnClickListener(new i(this));
        i iVar3 = this.djS;
        if (iVar3 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        iVar3.aEK().observe(lifecycleOwner, new j(this));
        liVar = this.djR;
        if (liVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return liVar.getRoot();
    }

    public void aEH() {
        i iVar = this.djS;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        iVar.aEQ();
    }

    public void a(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "item");
        i iVar = this.djS;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        iVar.d(fVar.aEJ());
    }

    public void b(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "item");
        i iVar = this.djS;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        iVar.c(fVar);
    }

    public void a(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "viewHolder");
        i iVar = this.djS;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        if (iVar.nq()) {
            ItemTouchHelper itemTouchHelper = this.djQ;
            if (itemTouchHelper == null) {
                kotlin.jvm.internal.i.lG("itemTouchHelper");
            }
            itemTouchHelper.startDrag(hVar);
        }
    }

    public void aA(int i, int i2) {
        i iVar = this.djS;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        iVar.aA(i, i2);
    }

    public Drawable getIcon(int i) {
        Drawable drawable = (Drawable) this.djP.get(i);
        if (drawable != null) {
            return drawable;
        }
        drawable = getDrawable(i);
        if (drawable == null) {
            return null;
        }
        this.djP.put(i, drawable);
        return drawable;
    }

    private final Drawable getDrawable(@DrawableRes int i) {
        Context context = getContext();
        if (context == null) {
            return (Drawable) null;
        }
        Drawable a;
        kotlin.jvm.internal.i.e(context, "context");
        k kVar = new k(context);
        if (i == R.drawable.ic_chat) {
            a = d.a(kVar, i, kVar.getColor(R.color.green), R.dimen.dp2, R.dimen.dp2);
        } else if (i == R.drawable.ic_portfolio) {
            a = d.a(kVar, i, -1, R.dimen.dp0, R.dimen.dp5);
        } else if (i != R.drawable.ic_video_education) {
            a = kVar.getDrawable(i);
        } else {
            a = d.a(kVar, i, kVar.getColor(R.color.green), R.dimen.dp2, R.dimen.dp2);
        }
        return a;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            if (supportFragmentManager != null && supportFragmentManager.getBackStackEntryCount() == 0 && fragmentManager != null && fragmentManager.getBackStackEntryCount() == 0) {
                i iVar = this.djS;
                String str = "viewModel";
                if (iVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                LeftPanelSection leftPanelSection = (LeftPanelSection) iVar.aEP().getValue();
                if (leftPanelSection != null) {
                    i iVar2 = this.djS;
                    if (iVar2 == null) {
                        kotlin.jvm.internal.i.lG(str);
                    }
                    iVar2.b(leftPanelSection);
                    return true;
                }
            }
        }
        return false;
    }

    private final void a(LeftPanelSection leftPanelSection) {
        Fragment fragment;
        String str;
        switch (leftPanelSection) {
            case PORTFOIO:
                com.iqoption.portfolio.fragment.k gV = com.iqoption.portfolio.fragment.k.gV(1);
                kotlin.jvm.internal.i.e(gV, "PortfolioFragment.newIns…(PortfolioFragment.MICRO)");
                c(gV, "PortfolioFragment");
                return;
            case MARKET_ANALYSIS:
                c(com.iqoption.marketanalysis.b.dFj.eU(false), com.iqoption.marketanalysis.b.dFj.Bx());
                return;
            case PRICE_MOVEMENTS:
                c(n.dTq.aUi(), n.dTq.Bx());
                return;
            case VIDEO_EDUCATION:
                com.iqoption.videoeducation.b.a aXy = com.iqoption.videoeducation.b.a.aXy();
                kotlin.jvm.internal.i.e(aXy, "VideoCatalogsFragment.newInstance()");
                fragment = aXy;
                str = com.iqoption.videoeducation.b.a.TAG;
                kotlin.jvm.internal.i.e(str, "VideoCatalogsFragment.TAG");
                c(fragment, str);
                return;
            case CHATS:
                fragment = com.iqoption.chat.c.aOc.QP();
                str = com.iqoption.chat.c.aOc.Bx();
                kotlin.jvm.internal.i.e(str, "MicroRoomListFragment.TAG");
                c(fragment, str);
                return;
            case OTN:
                ag ayl = ag.ayl();
                kotlin.jvm.internal.i.e(ayl, "TokenBalanceFragment.newInstance()");
                c(ayl, "TokenBalanceFragment");
                return;
            case ASSET_INFO:
                c(com.iqoption.fragment.c.b.dgv.aDi(), com.iqoption.fragment.c.b.dgv.Bx());
                return;
            case MORE:
                aEI();
                return;
            default:
                return;
        }
    }

    private final void c(Fragment fragment, String str) {
        FragmentManager u = com.iqoption.core.ext.a.u(this);
        FragmentTransaction beginTransaction = u.beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        beginTransaction.setCustomAnimations(R.anim.appear_from_left_to_rigth_with_alpha, R.anim.disappear_from_right_to_left_with_alpha);
        beginTransaction.replace(R.id.fragmentContainer, fragment, str);
        beginTransaction.commitAllowingStateLoss();
        u.executePendingTransactions();
    }

    private final void aEI() {
        Fragment findFragmentById = com.iqoption.core.ext.a.u(this).findFragmentById(R.id.fragmentContainer);
        if (findFragmentById != null) {
            kotlin.jvm.internal.i.e(findFragmentById, "fmChild.findFragmentById…gmentContainer) ?: return");
            FragmentManager u = com.iqoption.core.ext.a.u(this);
            FragmentTransaction beginTransaction = u.beginTransaction();
            kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
            beginTransaction.setCustomAnimations(0, R.anim.disappear_from_right_to_left_with_alpha);
            beginTransaction.remove(findFragmentById);
            beginTransaction.commitAllowingStateLoss();
            u.executePendingTransactions();
        }
    }
}
