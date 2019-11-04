package com.iqoption.charttools.model.indicator;

import com.iqoption.charttools.n;
import com.iqoption.charttools.n.e;
import com.iqoption.dto.event.OtnEmissionExecuted;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/charttools/model/indicator/RSI;", "Lcom/iqoption/charttools/model/indicator/LocalIndicator;", "()V", "keys", "", "", "getKeys", "()[Ljava/lang/String;", "[Ljava/lang/String;", "titleKeysIndices", "", "getTitleKeysIndices", "()[I", "techtools_release"})
/* compiled from: MetaIndicator.kt */
public final class ad extends v {
    private static final String[] aIP = new String[]{OtnEmissionExecuted.COUNT, "color", "rsi_width", "topPercent", "topColor", "rsi_overbought_width", "bottomPercent", "bottomColor", "rsi_oversold_width"};
    private static final int[] aIQ = new int[]{0, 3, 6};
    public static final ad aJH = new ad();

    private ad() {
        super("RSI", "RSI", n.i.rsi, n.i.iq4_indicators_hint_rsi, e.ic_icon_instrument_rsi, null, 32, null);
    }

    /* Access modifiers changed, original: protected */
    public String[] Ob() {
        return aIP;
    }

    public int[] Oc() {
        return aIQ;
    }
}