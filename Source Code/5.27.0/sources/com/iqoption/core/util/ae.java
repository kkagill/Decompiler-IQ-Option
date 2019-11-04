package com.iqoption.core.util;

import androidx.annotation.StringRes;
import com.iqoption.config.Platform;
import com.iqoption.core.d;
import com.iqoption.core.i.k;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u00048GX\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00048GX\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00048GX\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u00048GX\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u00048GX\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00048GX\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/util/StringReferences;", "", "()V", "binary", "", "binary$annotations", "getBinary", "()I", "buyInOneClick", "buyInOneClick$annotations", "getBuyInOneClick", "byChoosingOneClick", "byChoosingOneClick$annotations", "getByChoosingOneClick", "optPrice", "optPrice$annotations", "getOptPrice", "option", "option$annotations", "getOption", "showSmallDealsOnChartForExpirable", "showSmallDealsOnChartForExpirable$annotations", "getShowSmallDealsOnChartForExpirable", "core_release"})
/* compiled from: StringReferences.kt */
public final class ae {
    public static final ae bRm = new ae();

    private ae() {
    }

    @StringRes
    public static final int anB() {
        if (d.Un().Dq()) {
            return k.show_small_deals_on_chart_for_expirable_wl;
        }
        return k.show_small_deals_on_chart_for_expirable;
    }

    @StringRes
    public static final int anC() {
        if (d.Un().Dq()) {
            return k.by_choosing_one_click_wl;
        }
        return k.by_choosing_one_click;
    }

    @StringRes
    public static final int anD() {
        if (d.Un().Dq()) {
            return k.buy_in_one_click_pure;
        }
        return k.buy_in_one_click;
    }

    @StringRes
    public static final int anE() {
        if (d.Un().Dx() == Platform.ANDROID_X) {
            return k.binary;
        }
        if (d.Un().Dq()) {
            return k.turbo;
        }
        return k.binary;
    }

    @StringRes
    public static final int anF() {
        if (d.Un().Dq()) {
            return k.price;
        }
        return k.opt_price;
    }

    @StringRes
    public static final int anG() {
        if (d.Un().Dq()) {
            return k.assets;
        }
        return k.option;
    }
}
