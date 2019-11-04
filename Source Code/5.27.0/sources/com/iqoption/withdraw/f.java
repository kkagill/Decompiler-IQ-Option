package com.iqoption.withdraw;

import androidx.fragment.app.Fragment;
import com.iqoption.core.ext.a;
import com.iqoption.withdraw.d.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, bng = {"Lcom/iqoption/withdraw/WithdrawCommonViewModelsHostUtils;", "", "()V", "getHost", "Landroidx/fragment/app/Fragment;", "fragment", "withdraw_release"})
/* compiled from: WithdrawCommonViewModelsHostUtils.kt */
public final class f {
    public static final f epg = new f();

    private f() {
    }

    public final Fragment aj(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        return fragment instanceof b ? fragment : a.a(fragment, b.class);
    }
}
