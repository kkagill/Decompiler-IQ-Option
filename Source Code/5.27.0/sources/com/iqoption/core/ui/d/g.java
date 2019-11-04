package com.iqoption.core.ui.d;

import android.content.Context;
import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.Transition;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0011\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0014J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0014J\u0006\u0010\u001b\u001a\u00020\u0014J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J$\u0010\u001d\u001a\u00020\u0010*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0014H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, bng = {"Lcom/iqoption/core/ui/navigation/StackNavigator;", "", "context", "Landroid/content/Context;", "fm", "Landroidx/fragment/app/FragmentManager;", "container", "", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", "getContainer", "()I", "getContext", "()Landroid/content/Context;", "getFm", "()Landroidx/fragment/app/FragmentManager;", "add", "", "entry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "isRoot", "", "contains", "exists", "pop", "tag", "", "isInclusive", "popToRoot", "replace", "setupNavAction", "Landroidx/fragment/app/FragmentTransaction;", "f", "Landroidx/fragment/app/Fragment;", "addToBackStack", "core_release"})
/* compiled from: StackNavigator.kt */
public final class g {
    private final FragmentManager bJl;
    private final int container;
    private final Context context;

    public g(Context context, FragmentManager fragmentManager, @IdRes int i) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(fragmentManager, "fm");
        this.context = context;
        this.bJl = fragmentManager;
        this.container = i;
    }

    public final FragmentManager alH() {
        return this.bJl;
    }

    public static /* synthetic */ void a(g gVar, c cVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        gVar.a(cVar, z);
    }

    public final void a(c cVar, boolean z) {
        kotlin.jvm.internal.i.f(cVar, "entry");
        FragmentManager fragmentManager = this.bJl;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        Fragment bh = cVar.bh(this.context);
        a(beginTransaction, bh, cVar, z ^ 1);
        beginTransaction.replace(this.container, bh, cVar.getName());
        beginTransaction.commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
    }

    public static /* synthetic */ void b(g gVar, c cVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        gVar.b(cVar, z);
    }

    public final void b(c cVar, boolean z) {
        kotlin.jvm.internal.i.f(cVar, "entry");
        FragmentManager fragmentManager = this.bJl;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
        Fragment bh = cVar.bh(this.context);
        a(beginTransaction, bh, cVar, z ^ 1);
        beginTransaction.add(this.container, bh, cVar.getName());
        beginTransaction.commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
    }

    public final boolean alG() {
        return (this.bJl.isStateSaved() || this.bJl.isDestroyed()) ? false : this.bJl.popBackStackImmediate();
    }

    public final boolean q(String str, boolean z) {
        kotlin.jvm.internal.i.f(str, "tag");
        return (this.bJl.isStateSaved() || this.bJl.isDestroyed()) ? false : this.bJl.popBackStackImmediate(str, (int) z);
    }

    private final void a(FragmentTransaction fragmentTransaction, Fragment fragment, c cVar, boolean z) {
        if (z) {
            fragmentTransaction.addToBackStack(cVar.getName());
        }
        Transition RY = cVar.RY();
        if (RY != null) {
            fragment.setEnterTransition(RY);
        }
        RY = cVar.RZ();
        if (RY != null) {
            fragment.setReenterTransition(RY);
        }
        RY = cVar.Sb();
        if (RY != null) {
            fragment.setExitTransition(RY);
        }
        RY = cVar.Sa();
        if (RY != null) {
            fragment.setReturnTransition(RY);
        }
    }

    public final boolean b(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "entry");
        Fragment findFragmentByTag = this.bJl.findFragmentByTag(cVar.getName());
        return findFragmentByTag != null && findFragmentByTag.isAdded();
    }
}
