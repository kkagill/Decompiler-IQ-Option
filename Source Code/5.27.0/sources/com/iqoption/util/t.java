package com.iqoption.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.BackStackEntry;
import androidx.fragment.app.FragmentTransaction;
import com.google.common.base.j;
import com.iqoption.core.c.a;
import java.util.ArrayList;

/* compiled from: FragmentUtils */
public final class t {
    public static final j<Fragment> ebc = -$$Lambda$t$Vznit6hwhER1Ou5ToTo2LvgMzuw.INSTANCE;

    private static /* synthetic */ boolean bi(Fragment fragment) {
        return fragment != null && fragment.isAdded();
    }

    public static boolean a(FragmentManager fragmentManager, String str) {
        if (fragmentManager != null && str != null && fragmentManager.getBackStackEntryCount() == 0 && fragmentManager.findFragmentByTag(str) != null) {
            return true;
        }
        if (fragmentManager == null || fragmentManager.getBackStackEntryCount() <= 0 || str == null || !str.equals(fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount() - 1).getName())) {
            return false;
        }
        return true;
    }

    @Nullable
    public static Fragment n(FragmentManager fragmentManager) {
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        return backStackEntryCount > 0 ? fragmentManager.findFragmentByTag(fragmentManager.getBackStackEntryAt(backStackEntryCount - 1).getName()) : null;
    }

    @Nullable
    public static Fragment o(FragmentManager fragmentManager) {
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        return backStackEntryCount > 1 ? fragmentManager.findFragmentByTag(fragmentManager.getBackStackEntryAt(backStackEntryCount - 2).getName()) : null;
    }

    @NonNull
    public static <T> Iterable<T> a(FragmentManager fragmentManager, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (cls.isInstance(fragment)) {
                arrayList.add(cls.cast(fragment));
            }
        }
        return arrayList;
    }

    public static boolean c(FragmentManager fragmentManager, String str) {
        fragmentManager.executePendingTransactions();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
        return findFragmentByTag == null || findFragmentByTag.isRemoving();
    }

    public static void p(FragmentManager fragmentManager) {
        d(fragmentManager, null);
    }

    public static void d(FragmentManager fragmentManager, @Nullable String str) {
        if (fragmentManager.getBackStackEntryCount() != 0) {
            int i = 0;
            while (i < fragmentManager.getBackStackEntryCount()) {
                BackStackEntry backStackEntryAt = fragmentManager.getBackStackEntryAt(i);
                if (backStackEntryAt.getName() == null || str == null || !str.equals(backStackEntryAt.getName()) || !a(fragmentManager, str, 0)) {
                    i++;
                } else {
                    return;
                }
            }
            a(fragmentManager, null, 1);
        }
    }

    public static boolean q(@NonNull FragmentManager fragmentManager) {
        return a(fragmentManager, null, 0);
    }

    private static boolean a(@NonNull FragmentManager fragmentManager, String str, int i) {
        try {
            fragmentManager = fragmentManager.popBackStackImmediate(str, i);
            return fragmentManager;
        } catch (IllegalStateException unused) {
            if (!r(fragmentManager)) {
                return false;
            }
            try {
                fragmentManager.executePendingTransactions();
            } catch (IllegalStateException unused2) {
                a.biN.postDelayed(new -$$Lambda$t$aHnNo6pyPXfqwB3mLreR2bNh9eY(fragmentManager, str, i), 0);
            }
            return true;
        }
    }

    private static /* synthetic */ void b(FragmentManager fragmentManager, String str, int i) {
        try {
            fragmentManager.popBackStackImmediate(str, i);
        } catch (IllegalStateException unused) {
        }
    }

    private static boolean r(@NonNull FragmentManager fragmentManager) {
        if (fragmentManager.getBackStackEntryCount() == 0) {
            return false;
        }
        BackStackEntry backStackEntryAt = fragmentManager.getBackStackEntryAt(0);
        if (backStackEntryAt != null) {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(backStackEntryAt.getName());
            if (findFragmentByTag != null) {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.remove(findFragmentByTag);
                beginTransaction.commitAllowingStateLoss();
                return true;
            }
        }
        return false;
    }
}
