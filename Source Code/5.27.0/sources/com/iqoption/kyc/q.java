package com.iqoption.kyc;

import com.iqoption.core.d;
import com.iqoption.core.ui.widget.d.a;
import com.iqoption.kyc.o.f;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.i;
import kotlin.jvm.internal.n;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\f\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b\u001a\n\u0010\f\u001a\u00020\n*\u00020\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"MIN_AGE_FOR_TRADING", "", "getAge", "day", "month", "year", "isAgeAllowedForTrading", "", "isInPast", "getError", "", "Lcom/iqoption/core/ui/widget/edittext/TextDateValidator;", "getFormattedDate", "kyc_release"})
/* compiled from: TextDateValidatorExtensions.kt */
public final class q {
    public static final String a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$getFormattedDate");
        n nVar = n.eWf;
        Locale locale = Locale.US;
        kotlin.jvm.internal.i.e(locale, "Locale.US");
        Object[] objArr = new Object[]{Integer.valueOf(aVar.getDay()), Integer.valueOf(aVar.getMonth()), Integer.valueOf(aVar.getYear())};
        String format = String.format(locale, "%02d.%02d.%d", Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final String b(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$getError");
        Integer valueOf = (!aVar.amF() || aVar.amC()) ? (!aVar.amG() || aVar.amD()) ? (!aVar.amH() || aVar.amE()) ? !aVar.isValid() ? Integer.valueOf(f.incorrect_value) : !r(aVar.getDay(), aVar.getMonth(), aVar.getYear()) ? Integer.valueOf(f.incorrect_value) : !p(aVar.getDay(), aVar.getMonth(), aVar.getYear()) ? Integer.valueOf(f.unconfirmed_age) : null : Integer.valueOf(f.incorrect_year) : Integer.valueOf(f.incorrect_month) : Integer.valueOf(f.incorrect_day);
        if (valueOf != null) {
            return d.getString(valueOf.intValue());
        }
        return null;
    }

    private static final boolean p(int i, int i2, int i3) {
        return q(i, i2, i3) >= 18;
    }

    private static final int q(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.set(i3, i2 - 1, i);
        i = instance.get(1) - instance2.get(1);
        return instance.get(6) < instance2.get(6) ? i - 1 : i;
    }

    private static final boolean r(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.set(i3, i2 - 1, i);
        if (instance.get(1) < instance2.get(1)) {
            return false;
        }
        if (instance.get(1) != instance2.get(1) || instance.get(6) >= instance2.get(6)) {
            return true;
        }
        return false;
    }
}
