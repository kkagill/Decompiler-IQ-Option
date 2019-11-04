package com.iqoption.core.ui.d;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.a;
import com.iqoption.core.ui.fragment.d;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, bng = {"Lcom/iqoption/core/ui/navigation/BaseStackNavigatorFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/core/ui/navigation/StackNavigatorOwner;", "()V", "_stackNavigator", "Lcom/iqoption/core/ui/navigation/StackNavigator;", "stackNavigator", "getStackNavigator", "()Lcom/iqoption/core/ui/navigation/StackNavigator;", "getContainerId", "", "getInitialEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "core_release"})
/* compiled from: BaseStackNavigatorFragment.kt */
public abstract class b extends d implements h {
    private HashMap apm;
    private g bJe;

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract int KW();

    public abstract c KX();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public g alE() {
        g gVar = this.bJe;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("_stackNavigator");
        }
        return gVar;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.bJe = new g(a.q(this), a.u(this), KW());
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            c KX = KX();
            if (KX != null && !alE().b(KX)) {
                alE().a(KX, true);
            }
        }
    }
}
