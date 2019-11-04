package com.iqoption.asset.mediators;

import com.iqoption.core.microservices.f.a.a.a.c;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, bng = {"<anonymous>", "", "invoke", "()Ljava/lang/Double;"})
/* compiled from: AssetDisplayData.kt */
final class AssetDisplayData$spreadPercent$2 extends Lambda implements a<Double> {
    final /* synthetic */ a this$0;

    AssetDisplayData$spreadPercent$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: JT */
    public final Double invoke() {
        com.iqoption.core.microservices.f.a.a.a JS = this.this$0.JS();
        if (JS == null) {
            return null;
        }
        c ahw = JS.ahw();
        if (ahw == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        Double ahD = ahw.ahD();
        c ahz = JS.ahz();
        if (ahz == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        Double ahD2 = ahz.ahD();
        if (ahD == null || ahD2 == null) {
            return null;
        }
        return Double.valueOf((ahD.doubleValue() * 100.0d) / ahD2.doubleValue());
    }
}
