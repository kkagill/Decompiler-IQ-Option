package com.iqoption.util.fragmentstack;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.x.R;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\fH\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, bng = {"Lcom/iqoption/util/fragmentstack/ActiveFragmentStackChangeListener;", "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "fragmentListenerMap", "Ljava/util/WeakHashMap;", "Landroidx/fragment/app/Fragment;", "Lcom/iqoption/util/fragmentstack/FragmentVisibilityChangeListener;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "addFragmentVisibilityChangeListener", "", "fragment", "listener", "notifyInvisible", "notifyVisible", "onBackStackChanged", "app_optionXRelease"})
/* compiled from: ActiveFragmentStackChangeListener.kt */
public final class a implements OnBackStackChangedListener {
    private final FragmentManager dtP;
    private final WeakHashMap<Fragment, c> ebY = new WeakHashMap();

    public a(FragmentManager fragmentManager) {
        kotlin.jvm.internal.i.f(fragmentManager, "fragmentManager");
        this.dtP = fragmentManager;
    }

    public void onBackStackChanged() {
        Fragment findFragmentById = this.dtP.findFragmentById(R.id.fragmentContainer);
        if (findFragmentById != null) {
            List<Fragment> fragments = this.dtP.getFragments();
            kotlin.jvm.internal.i.e(fragments, "fragmentManager.fragments");
            fragments.remove(findFragmentById);
            for (Fragment fragment : fragments) {
                kotlin.jvm.internal.i.e(fragment, "it");
                bk(fragment);
            }
            bj(findFragmentById);
        }
    }

    public final void a(Fragment fragment, c cVar) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        kotlin.jvm.internal.i.f(cVar, CastExtraArgs.LISTENER);
        this.ebY.put(fragment, cVar);
    }

    private final void bj(Fragment fragment) {
        if (fragment instanceof c) {
            ((c) fragment).aXa();
        }
        c cVar = (c) this.ebY.get(fragment);
        if (cVar != null) {
            cVar.aXa();
        }
    }

    private final void bk(Fragment fragment) {
        if (fragment instanceof c) {
            ((c) fragment).aXb();
        }
        c cVar = (c) this.ebY.get(fragment);
        if (cVar != null) {
            cVar.aXb();
        }
    }
}
