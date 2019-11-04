package com.iqoption.fragment.assets;

import com.iqoption.core.d;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: AssetsFragment.kt */
final class AssetsFragment$isAlertsEnabled$2 extends Lambda implements a<Boolean> {
    public static final AssetsFragment$isAlertsEnabled$2 daR = new AssetsFragment$isAlertsEnabled$2();

    AssetsFragment$isAlertsEnabled$2() {
        super(0);
    }

    public final boolean invoke() {
        return d.EH().ej("price-alerts");
    }
}
