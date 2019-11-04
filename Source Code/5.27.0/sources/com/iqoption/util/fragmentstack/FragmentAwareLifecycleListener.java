package com.iqoption.util.fragmentstack;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\nH\u0007J\b\u0010\u0010\u001a\u00020\nH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, bng = {"Lcom/iqoption/util/fragmentstack/FragmentAwareLifecycleListener;", "Landroidx/lifecycle/LifecycleObserver;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "activeFragmentListener", "Lcom/iqoption/util/fragmentstack/ActiveFragmentStackChangeListener;", "getFm", "()Landroidx/fragment/app/FragmentManager;", "addFragmentVisibilityChangeListener", "", "fragment", "Landroidx/fragment/app/Fragment;", "listener", "Lcom/iqoption/util/fragmentstack/FragmentVisibilityChangeListener;", "start", "stop", "app_optionXRelease"})
/* compiled from: FragmentAwareLifecycleListener.kt */
public final class FragmentAwareLifecycleListener implements LifecycleObserver {
    private final FragmentManager bJl;
    private a ebZ;

    public FragmentAwareLifecycleListener(FragmentManager fragmentManager) {
        kotlin.jvm.internal.i.f(fragmentManager, "fm");
        this.bJl = fragmentManager;
    }

    @OnLifecycleEvent(Event.ON_CREATE)
    public final void start() {
        this.ebZ = new a(this.bJl);
        FragmentManager fragmentManager = this.bJl;
        a aVar = this.ebZ;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("activeFragmentListener");
        }
        fragmentManager.addOnBackStackChangedListener(aVar);
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void stop() {
        FragmentManager fragmentManager = this.bJl;
        a aVar = this.ebZ;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("activeFragmentListener");
        }
        fragmentManager.removeOnBackStackChangedListener(aVar);
    }

    public final void a(Fragment fragment, c cVar) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        kotlin.jvm.internal.i.f(cVar, CastExtraArgs.LISTENER);
        a aVar = this.ebZ;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("activeFragmentListener");
        }
        if (aVar != null) {
            aVar.a(fragment, cVar);
        }
    }
}
