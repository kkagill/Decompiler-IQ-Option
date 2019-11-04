package com.iqoption.util;

import androidx.annotation.IntRange;
import androidx.annotation.StringRes;
import com.iqoption.core.microservices.risks.response.overnightfee.OvernightDay;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, bng = {"getTranslateDay", "", "day", "Lcom/iqoption/core/microservices/risks/response/overnightfee/OvernightDay;", "app_optionXRelease"})
/* compiled from: DayUtil.kt */
public final class k {
    @StringRes
    public static final int hv(@IntRange(from = 1, to = 7) int i) {
        switch (i) {
            case 1:
                return R.string.short_week_day_sun;
            case 2:
                return R.string.short_week_day_mon;
            case 3:
                return R.string.short_week_day_tue;
            case 4:
                return R.string.short_week_day_wed;
            case 5:
                return R.string.short_week_day_thu;
            case 6:
                return R.string.short_week_day_fri;
            case 7:
                return R.string.short_week_day_sat;
            default:
                return R.string.n_a;
        }
    }

    @StringRes
    public static final int a(OvernightDay overnightDay) {
        kotlin.jvm.internal.i.f(overnightDay, "$this$getTranslateDay");
        switch (l.aob[overnightDay.ordinal()]) {
            case 1:
                return R.string.short_week_day_mon;
            case 2:
                return R.string.short_week_day_tue;
            case 3:
                return R.string.short_week_day_wed;
            case 4:
                return R.string.short_week_day_thu;
            case 5:
                return R.string.short_week_day_fri;
            case 6:
                return R.string.short_week_day_sat;
            case 7:
                return R.string.short_week_day_sun;
            default:
                return R.string.n_a;
        }
    }
}
