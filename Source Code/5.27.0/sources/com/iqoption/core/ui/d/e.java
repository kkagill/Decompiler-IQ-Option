package com.iqoption.core.ui.d;

import android.content.Context;
import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.Transition;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, bng = {"Lcom/iqoption/core/ui/navigation/SlotNavigator;", "", "context", "Landroid/content/Context;", "fm", "Landroidx/fragment/app/FragmentManager;", "container", "", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", "getContainer", "()I", "getContext", "()Landroid/content/Context;", "getFm", "()Landroidx/fragment/app/FragmentManager;", "swap", "", "entry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "core_release"})
/* compiled from: SlotNavigator.kt */
public final class e {
    private final FragmentManager bJl;
    private final int container;
    private final Context context;

    public e(Context context, FragmentManager fragmentManager, @IdRes int i) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(fragmentManager, "fm");
        this.context = context;
        this.bJl = fragmentManager;
        this.container = i;
    }

    public final void a(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "entry");
        Fragment findFragmentById = this.bJl.findFragmentById(this.container);
        if (findFragmentById == null || !findFragmentById.isAdded() || !kotlin.jvm.internal.i.y(findFragmentById.getTag(), cVar.getName())) {
            FragmentManager fragmentManager = this.bJl;
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
            Fragment bh = cVar.bh(this.context);
            Transition RY = cVar.RY();
            if (RY != null) {
                bh.setEnterTransition(RY);
            }
            RY = cVar.RZ();
            if (RY != null) {
                bh.setReenterTransition(RY);
            }
            RY = cVar.Sb();
            if (RY != null) {
                bh.setExitTransition(RY);
            }
            RY = cVar.Sa();
            if (RY != null) {
                bh.setReturnTransition(RY);
            }
            beginTransaction.replace(this.container, bh, cVar.getName());
            beginTransaction.commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
    }
}
