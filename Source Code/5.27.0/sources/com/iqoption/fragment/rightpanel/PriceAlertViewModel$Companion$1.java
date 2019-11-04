package com.iqoption.fragment.rightpanel;

import androidx.fragment.app.FragmentActivity;
import com.iqoption.alerts.ui.list.e;
import com.iqoption.fragment.rightpanel.n.a;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/fragment/rightpanel/PriceAlertViewModel;", "f", "Lcom/iqoption/alerts/ui/list/AlertsListFragment;", "invoke"})
/* compiled from: PriceAlertViewModel.kt */
final class PriceAlertViewModel$Companion$1 extends Lambda implements b<e, n> {
    public static final PriceAlertViewModel$Companion$1 doX = new PriceAlertViewModel$Companion$1();

    PriceAlertViewModel$Companion$1() {
        super(1);
    }

    /* renamed from: c */
    public final n invoke(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "f");
        a aVar = n.doT;
        FragmentActivity requireActivity = eVar.requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "f.requireActivity()");
        return aVar.s(requireActivity);
    }
}
