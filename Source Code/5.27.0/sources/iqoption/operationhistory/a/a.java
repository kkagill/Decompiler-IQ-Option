package iqoption.operationhistory.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.iqoption.core.ui.d.b;
import com.iqoption.core.ui.d.c;
import com.iqoption.core.ui.d.g;
import com.iqoption.j.a.e;
import com.iqoption.j.c.d;
import iqoption.operationhistory.OperationViewModel.FilterType;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J&\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0010"}, bng = {"Liqoption/operationhistory/navigator/OperationsNavigatorFragment;", "Lcom/iqoption/core/ui/navigation/BaseStackNavigatorFragment;", "()V", "getContainerId", "", "getInitialEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "operationhistory_release"})
/* compiled from: OperationsNavigatorFragment.kt */
public final class a extends b {
    private static final String TAG;
    public static final a eVh = new a();
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Liqoption/operationhistory/navigator/OperationsNavigatorFragment$Companion;", "", "()V", "TAG", "", "getNavigator", "Liqoption/operationhistory/navigator/OperationsNavigatorFragment;", "current", "Landroidx/fragment/app/Fragment;", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "showSearchResult", "", "showSelectOptions", "filterType", "Liqoption/operationhistory/OperationViewModel$FilterType;", "operationhistory_release"})
    /* compiled from: OperationsNavigatorFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c Lj() {
            return new c(a.TAG, a.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }

        public final void bH(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "current");
            g.a(bI(fragment).alE(), iqoption.operationhistory.b.b.eVl.Lj(), false, 2, null);
        }

        public final void a(Fragment fragment, FilterType filterType) {
            kotlin.jvm.internal.i.f(fragment, "current");
            kotlin.jvm.internal.i.f(filterType, "filterType");
            g.a(bI(fragment).alE(), iqoption.operationhistory.select.b.eVx.g(filterType), false, 2, null);
        }

        private final a bI(Fragment fragment) {
            return (a) com.iqoption.core.ext.a.a(fragment, a.class);
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
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        return ((e) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.j.c.e.fragment_operation_navigator, viewGroup, false, 4, null)).getRoot();
    }

    public int KW() {
        return d.operationNavigatorContainer;
    }

    public c KX() {
        return iqoption.operationhistory.a.eUN.Lj();
    }
}
