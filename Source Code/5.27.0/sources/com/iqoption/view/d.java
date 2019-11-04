package com.iqoption.view;

import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, bng = {"Lcom/iqoption/view/FxExpirationProgressHelper;", "", "()V", "shouldShowFxExpirationProgress", "", "app_optionXRelease"})
/* compiled from: FxExpirationProgressHelper.kt */
public final class d {
    public static final d efb = new d();

    private d() {
    }

    public static final boolean aXZ() {
        return TabHelper.IM().j(InstrumentType.FX_INSTRUMENT) >= 2;
    }
}
