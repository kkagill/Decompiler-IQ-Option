package com.iqoption.gdpr;

import android.content.Context;
import com.iqoption.app.b;
import com.iqoption.app.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, bng = {"isGdprSupportEnabled", "", "context", "Landroid/content/Context;", "app_optionXRelease"})
/* compiled from: GdprUtils.kt */
public final class a {
    public static final boolean bz(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        if (com.iqoption.app.managers.feature.a.ef("gdpr-support")) {
            d Fa = d.Fa();
            kotlin.jvm.internal.i.e(Fa, "Preferences.instance()");
            if (Fa.Er() && !b.aK(context).Ej()) {
                return true;
            }
        }
        return false;
    }
}
