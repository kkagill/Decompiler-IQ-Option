package com.iqoption.sessions;

import com.iqoption.core.d;
import com.iqoption.x.R;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: ActiveSessionsAdapter.kt */
final class ActiveSessionsAdapter$Companion$appName$2 extends Lambda implements a<String> {
    public static final ActiveSessionsAdapter$Companion$appName$2 dSG = new ActiveSessionsAdapter$Companion$appName$2();

    ActiveSessionsAdapter$Companion$appName$2() {
        super(0);
    }

    /* renamed from: Ot */
    public final String invoke() {
        return d.Uo().getString(R.string.app_name);
    }
}
