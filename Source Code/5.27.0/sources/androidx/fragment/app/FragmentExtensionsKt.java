package androidx.fragment.app;

import android.view.ViewGroup;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002¨\u0006\u0005"}, bng = {"clearFragmentView", "", "Landroidx/fragment/app/Fragment;", "peekChildFragmentManager", "Landroidx/fragment/app/FragmentManager;", "core_release"})
/* compiled from: FragmentExtensions.kt */
public final class FragmentExtensionsKt {
    public static final void clearFragmentView(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "$this$clearFragmentView");
        fragment.mContainer = (ViewGroup) null;
    }

    public static final FragmentManager peekChildFragmentManager(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "$this$peekChildFragmentManager");
        return fragment.peekChildFragmentManager();
    }
}
