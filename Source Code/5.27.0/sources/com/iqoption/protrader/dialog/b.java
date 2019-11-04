package com.iqoption.protrader.dialog;

import androidx.fragment.app.FragmentActivity;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/protrader/dialog/ProTraderDialogFactory;", "", "()V", "showDialog", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "type", "Lcom/iqoption/protrader/dialog/ProTraderDialogType;", "app_optionXRelease"})
/* compiled from: ProTraderDialogFactory.kt */
public final class b {
    public static final b dQF = new b();

    private b() {
    }

    public static final void a(FragmentActivity fragmentActivity, ProTraderDialogType proTraderDialogType) {
        kotlin.jvm.internal.i.f(fragmentActivity, "activity");
        kotlin.jvm.internal.i.f(proTraderDialogType, "type");
        int i = c.aob[proTraderDialogType.ordinal()];
        if (i == 1) {
            a.dQD.C(fragmentActivity);
        } else if (i == 2) {
            d.dQH.C(fragmentActivity);
        }
    }
}
