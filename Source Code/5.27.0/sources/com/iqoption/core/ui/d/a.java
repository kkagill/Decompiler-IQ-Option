package com.iqoption.core.ui.d;

import android.content.Context;
import com.iqoption.core.ui.fragment.d;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/ui/navigation/BaseSlotNavigatorFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/core/ui/navigation/SlotNavigatorOwner;", "()V", "_slotNavigator", "Lcom/iqoption/core/ui/navigation/SlotNavigator;", "slotNavigator", "getSlotNavigator", "()Lcom/iqoption/core/ui/navigation/SlotNavigator;", "getContainerId", "", "onAttach", "", "context", "Landroid/content/Context;", "core_release"})
/* compiled from: BaseSlotNavigatorFragment.kt */
public abstract class a extends d implements f {
    private HashMap apm;
    private e bJd;

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract int KW();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public e alD() {
        e eVar = this.bJd;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("_slotNavigator");
        }
        return eVar;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.bJd = new e(com.iqoption.core.ext.a.q(this), com.iqoption.core.ext.a.u(this), KW());
    }
}
