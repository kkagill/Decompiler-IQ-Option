package com.iqoption.charttools.model.indicator.constructor.a;

import com.iqoption.charttools.model.indicator.aa;
import com.iqoption.charttools.model.indicator.ab;
import com.iqoption.charttools.model.indicator.constructor.f;
import com.iqoption.charttools.model.indicator.constructor.g;
import com.iqoption.charttools.model.indicator.constructor.h;
import com.iqoption.charttools.n;
import com.iqoption.core.d;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¨\u0006\u0015"}, bng = {"buildADXInputs", "Lcom/iqoption/charttools/model/indicator/constructor/Inputs;", "values", "Lcom/iqoption/charttools/model/indicator/constructor/ValuesIterator;", "buildATRInputs", "buildAlligatorInputs", "buildAwesomeOscillatorInputs", "buildBelkhayateTimingInputs", "buildBollingerBandsInputs", "buildCCIInputs", "buildDPOInputs", "buildFractalInputs", "buildIchimokuInputs", "buildKDJInputs", "buildMACDInputs", "buildMomentumInputs", "buildMovingAverageInputs", "buildParabolicSARInputs", "buildRSIInputs", "buildStochasticOscillator", "buildWilliamsPercentRangeInputs", "techtools_release"})
/* compiled from: LocalInputs.kt */
public final class b {
    public static final f h(h hVar) {
        h hVar2 = hVar;
        kotlin.jvm.internal.i.f(hVar2, "values");
        g gVar = new g();
        int i = n.i.main;
        int i2 = n.i.williams_percent_range_value_desc;
        String str = null;
        String str2 = null;
        String str3 = "";
        String string = i != 0 ? d.getString(i) : str3;
        String string2 = i2 != 0 ? d.getString(i2) : null;
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar.setName(string);
        dVar.setDescription(string2);
        dVar.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d dVar2 = dVar;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar2.nextInt(14), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d dVar3 = dVar2;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar3, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[3]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar3, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar2);
        i = n.i.overbought;
        i2 = n.i.williams_percent_range_overbought_desc;
        string = i != 0 ? d.getString(i) : str3;
        string2 = i2 != 0 ? d.getString(i2) : null;
        OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar4 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar4.setName(string);
        dVar4.setDescription(string2);
        dVar4.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar4, "%", hVar2.nextInt(-20), Integer.valueOf(-100), Integer.valueOf(-1), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d dVar5 = dVar4;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar4, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[4]), false, 4, null);
        dVar3 = dVar5;
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar3, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar3);
        int i3 = n.i.oversold;
        int i4 = n.i.williams_percent_range_oversold_desc;
        if (i3 != 0) {
            str3 = d.getString(i3);
        }
        if (i4 != 0) {
            str = d.getString(i4);
        }
        OS = gVar.OS();
        dVar4 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar4.setName(str3);
        dVar4.setDescription(str);
        dVar4.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar4, "%", hVar2.nextInt(-80), Integer.valueOf(-100), Integer.valueOf(-1), null, false, 48, null);
        dVar2 = dVar4;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar4, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar2, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar2);
        return gVar.OT();
    }

    public static final f i(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.type, hVar.nextInt(0), aa.aJC.Ou(), false, 8, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar.nextInt(14), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f j(h hVar) {
        h hVar2 = hVar;
        kotlin.jvm.internal.i.f(hVar2, "values");
        g gVar = new g();
        int i = n.i.tenkan_sen;
        int i2 = n.i.ichimoku_tenkan_sen_desc;
        String str = null;
        String str2 = null;
        String str3 = "";
        String string = i != 0 ? d.getString(i) : str3;
        String string2 = i2 != 0 ? d.getString(i2) : null;
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar.setName(string);
        dVar.setDescription(string2);
        dVar.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d dVar2 = dVar;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar2.nextInt(9), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar2, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[3]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d dVar3 = dVar2;
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar3, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar3);
        int i3 = n.i.kijun_sen;
        int i4 = n.i.ichimoku_kijun_sen_desc;
        String string3 = i3 != 0 ? d.getString(i3) : str3;
        String string4 = i4 != 0 ? d.getString(i4) : null;
        List OS2 = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar4 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar4.setName(string3);
        dVar4.setDescription(string4);
        dVar4.eQ(str2);
        dVar = dVar4;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar2.nextInt(26), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS2.add(dVar4);
        i4 = n.i.senkou_span_a;
        int i5 = n.i.ichimoku_senkou_span_a_desc;
        string4 = i4 != 0 ? d.getString(i4) : str3;
        String string5 = i5 != 0 ? d.getString(i5) : null;
        List OS3 = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar5 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar5.setName(string4);
        dVar5.setDescription(string5);
        dVar5.eQ(str2);
        dVar = dVar5;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[4]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS3.add(dVar5);
        i4 = n.i.senkou_span_b;
        int i6 = n.i.ichimoku_senkou_span_b_desc;
        string4 = i4 != 0 ? d.getString(i4) : str3;
        String string6 = i6 != 0 ? d.getString(i6) : null;
        List OS4 = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar6 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar6.setName(string4);
        dVar6.setDescription(string6);
        dVar6.eQ(str2);
        dVar = dVar6;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar2.nextInt(52), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS4.add(dVar6);
        i4 = n.i.chikou_span;
        i6 = n.i.ichimoku_chikou_span_desc;
        if (i4 != 0) {
            str3 = d.getString(i4);
        }
        if (i6 != 0) {
            str = d.getString(i6);
        }
        List OS5 = gVar.OS();
        dVar4 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar4.setName(str3);
        dVar4.setDescription(str);
        dVar4.eQ(str2);
        dVar = dVar4;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.offset, hVar2.nextInt(26), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[4]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS5.add(dVar4);
        return gVar.OT();
    }

    public static final f k(h hVar) {
        h hVar2 = hVar;
        kotlin.jvm.internal.i.f(hVar2, "values");
        g gVar = new g();
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        int i = n.i.smooth;
        int nextInt = hVar2.nextInt(3);
        Integer valueOf = Integer.valueOf(1);
        Integer valueOf2 = Integer.valueOf(100);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, i, nextInt, valueOf, valueOf2, null, false, 48, null);
        OS.add(dVar);
        String string = d.getString(n.i.kdj_pj_desc);
        String str = null;
        String str2 = null;
        List OS2 = gVar.OS();
        dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar.setName("%J");
        dVar.setDescription(string);
        dVar.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d dVar2 = dVar;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar2, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[4]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar2, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS2.add(dVar);
        string = d.getString(n.i.kdj_pk_desc);
        OS2 = gVar.OS();
        dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar.setName("%K");
        dVar.setDescription(string);
        dVar.eQ(str2);
        int i2 = n.i.period;
        int nextInt2 = hVar2.nextInt(13);
        Integer valueOf3 = Integer.valueOf(2);
        Integer num = valueOf2;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, i2, nextInt2, valueOf3, num, null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[3]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS2.add(dVar);
        String string2 = d.getString(n.i.kdj_pd_desc);
        List OS3 = gVar.OS();
        dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar.setName("%D");
        dVar.setDescription(string2);
        dVar.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar2.nextInt(3), valueOf3, num, null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d dVar3 = dVar;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar3, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS3.add(dVar3);
        int i3 = n.i.overbought;
        nextInt = n.i.kdj_overbought_desc;
        String str3 = "";
        string = i3 != 0 ? d.getString(i3) : str3;
        string2 = nextInt != 0 ? d.getString(nextInt) : null;
        List OS4 = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar4 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar4.setName(string);
        dVar4.setDescription(string2);
        dVar4.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar4, "%", hVar2.nextInt(80), valueOf, valueOf2, null, false, 48, null);
        dVar3 = dVar4;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar4, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[9]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar3, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS4.add(dVar3);
        i3 = n.i.oversold;
        nextInt = n.i.kdj_oversold_desc;
        if (i3 != 0) {
            str3 = d.getString(i3);
        }
        if (nextInt != 0) {
            str = d.getString(nextInt);
        }
        OS = gVar.OS();
        dVar3 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar3.setName(str3);
        dVar3.setDescription(str);
        dVar3.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar3, "%", hVar2.nextInt(20), valueOf, valueOf2, null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d dVar5 = dVar3;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar5, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[14]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar5, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar3);
        return gVar.OT();
    }

    public static final f l(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar.nextInt(14), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[3]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f m(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar.nextInt(34), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f n(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.type, hVar.nextInt(0), ab.aJF.Ov(), false, 8, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.apply_to, hVar.nextInt(0), ab.aJF.Ow(), false, 8, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar.nextInt(14), Integer.valueOf(2), Integer.valueOf(200), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f o(h hVar) {
        h hVar2 = hVar;
        kotlin.jvm.internal.i.f(hVar2, "values");
        g gVar = new g();
        int i = n.i.jaws;
        int i2 = n.i.alligator_jaws_desc;
        String str = (String) null;
        String str2 = "";
        String string = i != 0 ? d.getString(i) : str2;
        String string2 = i2 != 0 ? d.getString(i2) : null;
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar.setName(string);
        dVar.setDescription(string2);
        dVar.eQ(str);
        com.iqoption.charttools.model.indicator.constructor.d dVar2 = dVar;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar2.nextInt(13), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar2, n.i.shift, hVar2.nextInt(8), Integer.valueOf(-100), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar2, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[4]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d dVar3 = dVar2;
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar3, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar3);
        int i3 = n.i.teeth;
        int i4 = n.i.alligator_teeth_desc;
        String string3 = i3 != 0 ? d.getString(i3) : str2;
        String string4 = i4 != 0 ? d.getString(i4) : null;
        List OS2 = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar4 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar4.setName(string3);
        dVar4.setDescription(string4);
        dVar4.eQ(str);
        com.iqoption.charttools.model.indicator.constructor.d dVar5 = dVar4;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar5, n.i.period, hVar2.nextInt(8), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar5, n.i.shift, hVar2.nextInt(5), Integer.valueOf(-100), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar5, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[7]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar5, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS2.add(dVar4);
        i3 = n.i.lips;
        i4 = n.i.alligator_lips_desc;
        if (i3 != 0) {
            str2 = d.getString(i3);
        }
        string3 = i4 != 0 ? d.getString(i4) : null;
        List OS3 = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar6 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar6.setName(str2);
        dVar6.setDescription(string3);
        dVar6.eQ(str);
        dVar2 = dVar6;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar2, n.i.period, hVar2.nextInt(5), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar2, n.i.shift, hVar2.nextInt(3), Integer.valueOf(-100), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar2, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[5]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar2, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS3.add(dVar6);
        return gVar.OT();
    }

    public static final f p(h hVar) {
        h hVar2 = hVar;
        kotlin.jvm.internal.i.f(hVar2, "values");
        g gVar = new g();
        int i = n.i.main_settings;
        int i2 = n.i.bollinger_bands_main_settings_desc;
        String str = null;
        String str2 = null;
        String str3 = "";
        String string = i != 0 ? d.getString(i) : str3;
        String string2 = i2 != 0 ? d.getString(i2) : null;
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar.setName(string);
        dVar.setDescription(string2);
        dVar.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d dVar2 = dVar;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar2.nextInt(14), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar2, n.i.deviation, hVar2.nextDouble(2.0d), Double.valueOf(0.1d), Double.valueOf(10.0d), null, false, 48, null);
        OS.add(dVar2);
        i = n.i.top_line;
        i2 = n.i.bollinger_bands_upper_line_desc;
        string = i != 0 ? d.getString(i) : str3;
        string2 = i2 != 0 ? d.getString(i2) : null;
        OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar3 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar3.setName(string);
        dVar3.setDescription(string2);
        dVar3.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d dVar4 = dVar3;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar4, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[3]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar4, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar3);
        i = n.i.middle_line;
        int i3 = n.i.bollinger_bands_middle_line_desc;
        string = i != 0 ? d.getString(i) : str3;
        String string3 = i3 != 0 ? d.getString(i3) : null;
        List OS2 = gVar.OS();
        dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar.setName(string);
        dVar.setDescription(string3);
        dVar.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d dVar5 = dVar;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar5, n.i.color, hVar2.nextInt(hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[4])), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar5, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS2.add(dVar);
        i = n.i.bottom_line;
        i3 = n.i.bollinger_bands_lower_line_desc;
        if (i != 0) {
            str3 = d.getString(i);
        }
        if (i3 != 0) {
            str = d.getString(i3);
        }
        List OS3 = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar6 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar6.setName(str3);
        dVar6.setDescription(str);
        dVar6.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d dVar7 = dVar6;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar7, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[7]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar7, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS3.add(dVar6);
        return gVar.OT();
    }

    public static final f q(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        int i = n.i.period;
        int nextInt = hVar.nextInt(14);
        Integer valueOf = Integer.valueOf(2);
        Integer valueOf2 = Integer.valueOf(100);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, i, nextInt, valueOf, valueOf2, null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[9]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        i = n.i.overbought;
        nextInt = hVar.nextInt(70);
        Integer valueOf3 = Integer.valueOf(1);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, i, nextInt, valueOf3, valueOf2, null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[4]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.oversold, hVar.nextInt(30), valueOf3, valueOf2, null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f r(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        int i = n.i.main_settings;
        String str = null;
        String string = i != 0 ? d.getString(i) : "";
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar.setName(string);
        dVar.setDescription(null);
        dVar.eQ(str);
        com.iqoption.charttools.model.indicator.constructor.d dVar2 = dVar;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar2, n.i.period, hVar.nextInt(14), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar2, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[3]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar2, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar);
        List OS2 = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar3 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar3.setName("+Di");
        dVar3.setDescription(str);
        dVar3.eQ(str);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar3, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[4]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar3, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS2.add(dVar3);
        OS2 = gVar.OS();
        dVar3 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar3.setName("-Di");
        dVar3.setDescription(str);
        dVar3.eQ(str);
        com.iqoption.charttools.model.indicator.constructor.d dVar4 = dVar3;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar4, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar4, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS2.add(dVar3);
        return gVar.OT();
    }

    public static final f s(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar.nextInt(14), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[3]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f t(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        int i = n.i.slow_period;
        int nextInt = hVar.nextInt(34);
        Integer valueOf = Integer.valueOf(2);
        Integer valueOf2 = Integer.valueOf(100);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, i, nextInt, valueOf, valueOf2, null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.fast_period, hVar.nextInt(5), valueOf, valueOf2, null, false, 48, null);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f u(h hVar) {
        h hVar2 = hVar;
        kotlin.jvm.internal.i.f(hVar2, "values");
        g gVar = new g();
        int i = n.i.main_settings;
        String str = null;
        String str2 = "";
        String string = i != 0 ? d.getString(i) : str2;
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar.setName(string);
        dVar.setDescription(null);
        dVar.eQ(str);
        com.iqoption.charttools.model.indicator.constructor.d dVar2 = dVar;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar2.nextInt(14), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d dVar3 = dVar2;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar3, n.i.overbought, hVar2.nextInt(100), Integer.valueOf(2), Integer.valueOf(1000), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar3, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[3]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar3, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar2);
        i = n.i.overbought;
        string = i != 0 ? d.getString(i) : str2;
        OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar4 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar4.setName(string);
        dVar4.setDescription(null);
        dVar4.eQ(str);
        dVar3 = dVar4;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar3, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[4]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar3, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar4);
        i = n.i.oversold;
        if (i != 0) {
            str2 = d.getString(i);
        }
        List OS2 = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar5 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar5.setName(str2);
        dVar5.setDescription(null);
        dVar5.eQ(str);
        com.iqoption.charttools.model.indicator.constructor.d dVar6 = dVar5;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar6, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar6, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS2.add(dVar5);
        return gVar.OT();
    }

    public static final f v(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar.nextInt(5), Integer.valueOf(3), Integer.valueOf(50), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[4]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f w(h hVar) {
        h hVar2 = hVar;
        kotlin.jvm.internal.i.f(hVar2, "values");
        g gVar = new g();
        int i = n.i.macd_line;
        int i2 = n.i.macd_line_desc;
        String str = null;
        String str2 = "";
        String string = i != 0 ? d.getString(i) : str2;
        String string2 = i2 != 0 ? d.getString(i2) : null;
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar.setName(string);
        dVar.setDescription(string2);
        dVar.eQ(str);
        com.iqoption.charttools.model.indicator.constructor.d dVar2 = dVar;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.fast_period, hVar2.nextInt(12), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar2, n.i.slow_period, hVar2.nextInt(26), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar2, n.i.signal_period, hVar2.nextInt(9), Integer.valueOf(2), Integer.valueOf(100), null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d dVar3 = dVar2;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar3, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[1]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar3, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS.add(dVar2);
        i2 = n.i.signal_line;
        int i3 = n.i.macd_signal_line_desc;
        string2 = i2 != 0 ? d.getString(i2) : str2;
        String string3 = i3 != 0 ? d.getString(i3) : null;
        List OS2 = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar4 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar4.setName(string2);
        dVar4.setDescription(string3);
        dVar4.eQ(str);
        dVar = dVar4;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[2]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS2.add(dVar4);
        i = n.i.baseline;
        if (i != 0) {
            str2 = d.getString(i);
        }
        List OS3 = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar5 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar5.setName(str2);
        dVar5.setDescription(null);
        dVar5.eQ(str);
        com.iqoption.charttools.model.indicator.constructor.d dVar6 = dVar5;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar6, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[11]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar6, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS3.add(dVar5);
        return gVar.OT();
    }

    public static final f x(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        int i = n.i.acceleration;
        double nextDouble = hVar.nextDouble(0.02d);
        com.iqoption.charttools.model.indicator.constructor.d dVar2 = dVar;
        Double valueOf = Double.valueOf(0.0d);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar2, i, nextDouble, valueOf, null, null, false, 56, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar2, n.i.acceleration_max, hVar.nextDouble(0.2d), valueOf, null, null, false, 56, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[3]), false, 4, null);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f y(h hVar) {
        h hVar2 = hVar;
        kotlin.jvm.internal.i.f(hVar2, "values");
        g gVar = new g();
        List OS = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        int i = n.i.smooth;
        int nextInt = hVar2.nextInt(3);
        Integer valueOf = Integer.valueOf(0);
        Integer valueOf2 = Integer.valueOf(100);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, i, nextInt, valueOf, valueOf2, null, false, 48, null);
        OS.add(dVar);
        String string = d.getString(n.i.stochastic_pk_desc);
        String str = null;
        String str2 = null;
        List OS2 = gVar.OS();
        dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar.setName("%K");
        dVar.setDescription(string);
        dVar.eQ(str2);
        int i2 = n.i.period;
        int nextInt2 = hVar2.nextInt(13);
        Integer valueOf3 = Integer.valueOf(2);
        Integer num = valueOf2;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, i2, nextInt2, valueOf3, num, null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[3]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS2.add(dVar);
        String string2 = d.getString(n.i.stochastic_pd_desc);
        List OS3 = gVar.OS();
        dVar = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar.setName("%D");
        dVar.setDescription(string2);
        dVar.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.period, hVar2.nextInt(3), valueOf3, num, null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d dVar2 = dVar;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar2, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS3.add(dVar2);
        int i3 = n.i.overbought;
        nextInt = n.i.stochastic_overbought_desc;
        String str3 = "";
        string = i3 != 0 ? d.getString(i3) : str3;
        string2 = nextInt != 0 ? d.getString(nextInt) : null;
        List OS4 = gVar.OS();
        com.iqoption.charttools.model.indicator.constructor.d dVar3 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar3.setName(string);
        dVar3.setDescription(string2);
        dVar3.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d dVar4 = dVar3;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar4, "%", hVar2.nextInt(80), Integer.valueOf(1), valueOf2, null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar3, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[4]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar4, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS4.add(dVar4);
        nextInt = n.i.oversold;
        int i4 = n.i.stochastic_oversold_desc;
        if (nextInt != 0) {
            str3 = d.getString(nextInt);
        }
        if (i4 != 0) {
            str = d.getString(i4);
        }
        OS2 = gVar.OS();
        dVar3 = new com.iqoption.charttools.model.indicator.constructor.d();
        dVar3.setName(str3);
        dVar3.setDescription(str);
        dVar3.eQ(str2);
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar3, "%", hVar2.nextInt(20), Integer.valueOf(1), valueOf2, null, false, 48, null);
        com.iqoption.charttools.model.indicator.constructor.d dVar5 = dVar3;
        com.iqoption.charttools.model.indicator.constructor.d.a(dVar5, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        com.iqoption.charttools.model.indicator.constructor.d.b(dVar5, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        OS2.add(dVar3);
        return gVar.OT();
    }
}
