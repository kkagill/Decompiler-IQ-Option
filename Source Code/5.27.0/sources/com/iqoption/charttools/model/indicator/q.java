package com.iqoption.charttools.model.indicator;

import com.iqoption.charttools.n;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, bng = {"Lcom/iqoption/charttools/model/indicator/FigureRay;", "Lcom/iqoption/charttools/model/indicator/Figure;", "()V", "dataKeys", "", "", "getDataKeys", "()[Ljava/lang/String;", "[Ljava/lang/String;", "dataValues", "", "getDataValues", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "techtools_release"})
/* compiled from: MetaIndicator.kt */
public final class q extends k {
    private static final String[] aJi = new String[]{"v1", "t1", "v2", "t2", "infinite2"};
    private static final Object[] aJj;
    public static final q aJp = new q();

    static {
        r0 = new Object[5];
        Integer valueOf = Integer.valueOf(-1);
        r0[0] = valueOf;
        r0[1] = valueOf;
        r0[2] = valueOf;
        r0[3] = valueOf;
        r0[4] = Integer.valueOf(1);
        aJj = r0;
    }

    private q() {
        super("T-Line", n.i.trend_line, null);
    }

    /* Access modifiers changed, original: protected */
    public String[] Oi() {
        return aJi;
    }

    /* Access modifiers changed, original: protected */
    public Object[] Oj() {
        return aJj;
    }
}