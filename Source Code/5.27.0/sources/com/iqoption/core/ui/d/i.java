package com.iqoption.core.ui.d;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.iqoption.core.util.p;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\b¢\u0006\u0002\u0010\u0006\u001a\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0018\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¨\u0006\u000b"}, bng = {"lookupInstanceOf", "T", "Lcom/iqoption/core/util/HasUid;", "Landroidx/fragment/app/Fragment;", "uid", "", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lcom/iqoption/core/util/HasUid;", "lookupSlotNavigator", "Lcom/iqoption/core/ui/navigation/SlotNavigator;", "lookupStackNavigator", "Lcom/iqoption/core/ui/navigation/StackNavigator;", "core_release"})
/* compiled from: utils.kt */
public final class i {
    public static final e a(Fragment fragment, String str) {
        p pVar;
        kotlin.jvm.internal.i.f(fragment, "$this$lookupSlotNavigator");
        Fragment parentFragment = fragment.getParentFragment();
        while (parentFragment != null) {
            if ((parentFragment instanceof f) && (str == null || kotlin.jvm.internal.i.y(str, ((p) parentFragment).Or()))) {
                pVar = (p) parentFragment;
                break;
            }
            parentFragment = parentFragment.getParentFragment();
        }
        FragmentActivity activity = fragment.getActivity();
        pVar = (activity != null && (activity instanceof f) && (str == null || kotlin.jvm.internal.i.y(str, ((p) activity).Or()))) ? (p) activity : null;
        f fVar = (f) pVar;
        if (fVar != null) {
            return fVar.alD();
        }
        return null;
    }

    public static final g b(Fragment fragment, String str) {
        p pVar;
        kotlin.jvm.internal.i.f(fragment, "$this$lookupStackNavigator");
        Fragment parentFragment = fragment.getParentFragment();
        while (parentFragment != null) {
            if ((parentFragment instanceof h) && (str == null || kotlin.jvm.internal.i.y(str, ((p) parentFragment).Or()))) {
                pVar = (p) parentFragment;
                break;
            }
            parentFragment = parentFragment.getParentFragment();
        }
        FragmentActivity activity = fragment.getActivity();
        pVar = (activity != null && (activity instanceof h) && (str == null || kotlin.jvm.internal.i.y(str, ((p) activity).Or()))) ? (p) activity : null;
        h hVar = (h) pVar;
        if (hVar != null) {
            return hVar.alE();
        }
        return null;
    }
}
