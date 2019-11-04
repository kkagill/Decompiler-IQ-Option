package com.iqoption.bottomsheet;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.iqoption.core.ui.animation.transitions.e;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.core.ui.widget.coordinatorlayout.behavior.BottomSheetBehavior;
import com.iqoption.core.util.v;
import com.iqoption.dialogs.b.s;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010 \u001a\u00020\u001dJ\b\u0010!\u001a\u00020\u001dH\u0016J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020\u001f2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020\u001dH\u0016J\b\u0010-\u001a\u00020.H\u0014J&\u0010/\u001a\u0004\u0018\u00010(2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\nH\u0016J \u00108\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\u001d0:H\u0016J\u0012\u0010;\u001a\u0004\u0018\u00010(2\u0006\u00102\u001a\u000203H\u0016J\u0010\u0010<\u001a\u00020(2\u0006\u00102\u001a\u000203H&J\b\u0010=\u001a\u00020\u001fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8TX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8TX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\b8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138TX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138TX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138TX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, bng = {"Lcom/iqoption/bottomsheet/BottomSheetFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/bottomsheet/BottomSheetCloseListener;", "()V", "behavior", "Lcom/iqoption/core/ui/widget/coordinatorlayout/behavior/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "binding", "Lcom/iqoption/dialogs/databinding/FragmentBottomSheetBinding;", "bottomContentHeight", "", "getBottomContentHeight", "()F", "bottomContentOverlay", "getBottomContentOverlay", "bottomSheetBinding", "getBottomSheetBinding", "()Lcom/iqoption/dialogs/databinding/FragmentBottomSheetBinding;", "bottomSheetInitialState", "", "getBottomSheetInitialState", "()I", "bottomSheetPeekHeight", "getBottomSheetPeekHeight", "bottomSheetTopMargin", "getBottomSheetTopMargin", "bottomsSheetCallback", "Lcom/iqoption/core/ui/widget/coordinatorlayout/behavior/BottomSheetBehavior$BottomSheetCallback;", "closeBottomSheet", "", "closeIfPresent", "", "disableDragging", "expandBottomSheet", "getBottomSheetTransition", "Landroidx/transition/TransitionSet;", "getTranslationTransition", "Landroidx/transition/Transition;", "hideBottomContent", "contentView", "Landroid/view/View;", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onBottomSheetClosed", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOffsetChanged", "slideOffset", "openBottomContent", "doOnAnimationEnd", "Lkotlin/Function0;", "provideBottomView", "provideView", "shouldHideKeyboard", "dialogs_release"})
/* compiled from: BottomSheetFragment.kt */
public abstract class c extends d implements b {
    private HashMap apm;
    private BottomSheetBehavior<FrameLayout> azO;
    private s azP;
    private final com.iqoption.core.ui.widget.coordinatorlayout.behavior.BottomSheetBehavior.a azQ = new a(this);

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: BottomSheetFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ c this$0;

        b(c cVar) {
            this.this$0 = cVar;
        }

        public final void onClick(View view) {
            this.this$0.KS();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0017¨\u0006\u000b"}, bng = {"com/iqoption/bottomsheet/BottomSheetFragment$bottomsSheetCallback$1", "Lcom/iqoption/core/ui/widget/coordinatorlayout/behavior/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "dialogs_release"})
    /* compiled from: BottomSheetFragment.kt */
    public static final class a extends com.iqoption.core.ui.widget.coordinatorlayout.behavior.BottomSheetBehavior.a {
        final /* synthetic */ c this$0;

        a(c cVar) {
            this.this$0 = cVar;
        }

        public void d(View view, float f) {
            kotlin.jvm.internal.i.f(view, "bottomSheet");
            float f2 = (float) 1;
            f = Math.min(f + f2, 1.0f);
            String str = "binding.veil";
            if (f > ((float) null) && f < f2) {
                view = c.a(this.this$0).cMC;
                kotlin.jvm.internal.i.e(view, str);
                view.setAlpha(f);
                this.this$0.F(f);
            }
            view = c.a(this.this$0).cMC;
            kotlin.jvm.internal.i.e(view, str);
            view.setVisibility(0);
        }

        @SuppressLint({"SwitchIntDef"})
        public void b(View view, int i) {
            kotlin.jvm.internal.i.f(view, "bottomSheet");
            String str = "binding.veil";
            if (i == 3) {
                view = c.a(this.this$0).cMC;
                kotlin.jvm.internal.i.e(view, str);
                view.setVisibility(0);
                view = c.a(this.this$0).cMC;
                kotlin.jvm.internal.i.e(view, str);
                view.setAlpha(1.0f);
                this.this$0.F(1.0f);
            } else if (i == 5) {
                view = c.a(this.this$0).cMC;
                kotlin.jvm.internal.i.e(view, str);
                view.setVisibility(8);
                view = c.a(this.this$0).cMC;
                kotlin.jvm.internal.i.e(view, str);
                view.setAlpha(0.0f);
                this.this$0.F(0.0f);
                if (this.this$0.isAdded()) {
                    this.this$0.KR();
                }
            }
            if (this.this$0.KT()) {
                v.j(this.this$0.getActivity());
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void F(float f) {
    }

    /* Access modifiers changed, original: protected */
    public int KQ() {
        return 4;
    }

    public void KR() {
    }

    public boolean KT() {
        return true;
    }

    public abstract View i(ViewGroup viewGroup);

    public View k(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "container");
        return null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ BottomSheetBehavior b(c cVar) {
        BottomSheetBehavior bottomSheetBehavior = cVar.azO;
        if (bottomSheetBehavior == null) {
            kotlin.jvm.internal.i.lG("behavior");
        }
        return bottomSheetBehavior;
    }

    /* Access modifiers changed, original: protected */
    public int KO() {
        return com.iqoption.core.ext.a.c((Fragment) this, com.iqoption.dialogs.d.b.dp64);
    }

    /* Access modifiers changed, original: protected */
    public int KP() {
        return com.iqoption.core.ext.a.c((Fragment) this, com.iqoption.dialogs.d.b.dp420);
    }

    /* Access modifiers changed, original: protected */
    public e Bv() {
        return new com.iqoption.core.ui.animation.transitions.c(this, new BottomSheetFragment$onCreateTransitionProvider$1(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.azP = (s) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.dialogs.d.e.fragment_bottom_sheet, viewGroup, false, 4, null);
        s sVar = this.azP;
        String str = "binding";
        if (sVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = sVar.cMA;
        kotlin.jvm.internal.i.e(frameLayout, "binding.contentViewContainer");
        View i = i(frameLayout);
        s sVar2 = this.azP;
        if (sVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        BottomSheetBehavior ax = BottomSheetBehavior.ax(sVar2.cMA);
        ax.W(true);
        ax.X(true);
        ax.aE(KP());
        ax.setState(KQ());
        ax.a(this.azQ);
        kotlin.jvm.internal.i.e(ax, "from<FrameLayout>(bindin…sSheetCallback)\n        }");
        this.azO = ax;
        sVar2 = this.azP;
        if (sVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        CoordinatorLayout coordinatorLayout = sVar2.cMB;
        kotlin.jvm.internal.i.e(coordinatorLayout, "binding.coordinatorLayout");
        LayoutParams layoutParams = coordinatorLayout.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, KO(), layoutParams2.rightMargin, layoutParams2.bottomMargin);
            sVar2 = this.azP;
            if (sVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            sVar2.cMA.addView(i);
            sVar = this.azP;
            if (sVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            frameLayout = sVar.cMz;
            String str2 = "binding.bottomContent";
            kotlin.jvm.internal.i.e(frameLayout, str2);
            i = k(frameLayout);
            if (i != null) {
                s sVar3 = this.azP;
                if (sVar3 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                sVar3.cMz.addView(i);
                sVar = this.azP;
                if (sVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                frameLayout = sVar.cMz;
                kotlin.jvm.internal.i.e(frameLayout, str2);
                com.iqoption.core.ext.a.al(frameLayout);
            }
            sVar = this.azP;
            if (sVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            sVar.cMC.setOnClickListener(new b(this));
            if (KT()) {
                v.j(getActivity());
            }
            sVar = this.azP;
            if (sVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            return sVar.getRoot();
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public void KN() {
        KS();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        return KS();
    }

    private final boolean KS() {
        BottomSheetBehavior bottomSheetBehavior = this.azO;
        String str = "behavior";
        if (bottomSheetBehavior == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        int state = bottomSheetBehavior.getState();
        if (state != 3 && state != 4) {
            return false;
        }
        bottomSheetBehavior = this.azO;
        if (bottomSheetBehavior == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bottomSheetBehavior.W(true);
        bottomSheetBehavior = this.azO;
        if (bottomSheetBehavior == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bottomSheetBehavior.setState(5);
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof b)) {
            parentFragment = null;
        }
        b bVar = (b) parentFragment;
        if (bVar == null) {
            return true;
        }
        bVar.KN();
        return true;
    }
}
