package com.iqoption.protrader;

import android.content.Context;
import com.iqoption.app.b;
import com.iqoption.app.d;
import com.iqoption.app.managers.feature.a;
import com.iqoption.core.ext.c;
import com.iqoption.microservice.regulators.response.StatusType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\u001c\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"MAX_LEVERAGE_AVAILABLE_FOR_PRO", "", "PRO_BADGE_ANCHOR", "", "canBeInvitedToBecomePro", "", "context", "Landroid/content/Context;", "statusType", "Lcom/iqoption/microservice/regulators/response/StatusType;", "canBeInvitedToBecomeProAndInviteFeatureEnabled", "getLocalApplicationStatus", "app_optionXRelease"})
/* compiled from: ProTraderUtils.kt */
public final class f {
    public static final boolean bH(Context context) {
        return a(context, null, 2, null);
    }

    public static /* synthetic */ boolean a(Context context, StatusType statusType, int i, Object obj) {
        if ((i & 2) != 0) {
            statusType = bI(context);
        }
        return a(context, statusType);
    }

    public static final boolean a(Context context, StatusType statusType) {
        kotlin.jvm.internal.i.f(context, "context");
        return a.ef("pro-benefits-invites") && b(context, statusType);
    }

    public static /* synthetic */ boolean b(Context context, StatusType statusType, int i, Object obj) {
        if ((i & 2) != 0) {
            statusType = bI(context);
        }
        return b(context, statusType);
    }

    public static final boolean b(Context context, StatusType statusType) {
        kotlin.jvm.internal.i.f(context, "context");
        b aK = b.aK(context);
        if (!aK.Ef() && aK.asd == 3) {
            if (!c.b((Object) statusType, StatusType.APPROVED, StatusType.PENDING, StatusType.DECLINED)) {
                return true;
            }
        }
        return false;
    }

    private static final StatusType bI(Context context) {
        return d.aP(context).af(b.aK(context).getUserId());
    }
}
