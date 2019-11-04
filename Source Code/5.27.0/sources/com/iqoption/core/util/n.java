package com.iqoption.core.util;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.BackStackEntry;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, bng = {"Lcom/iqoption/core/util/FragmentUtils;", "", "()V", "isFragmentOnTop", "", "fm", "Landroidx/fragment/app/FragmentManager;", "tag", "", "core_release"})
/* compiled from: FragmentUtils.kt */
public final class n {
    public static final n bQH = new n();

    private n() {
    }

    public final boolean a(FragmentManager fragmentManager, String str) {
        if (fragmentManager != null && str != null && fragmentManager.getBackStackEntryCount() == 0 && fragmentManager.findFragmentByTag(str) != null) {
            return true;
        }
        if (!(fragmentManager == null || fragmentManager.getBackStackEntryCount() <= 0 || str == null)) {
            BackStackEntry backStackEntryAt = fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount() - 1);
            kotlin.jvm.internal.i.e(backStackEntryAt, "fm.getBackStackEntryAt(fm.backStackEntryCount - 1)");
            if (kotlin.jvm.internal.i.y(str, backStackEntryAt.getName())) {
                return true;
            }
        }
        return false;
    }
}
