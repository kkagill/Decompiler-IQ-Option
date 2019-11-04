package com.iqoption.core.util;

import android.util.SparseArray;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u001c\u0010\u001c\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0016\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, bng = {"Lcom/iqoption/core/util/DecimalUtils;", "", "()V", "PREFIX_ARRAY", "", "SYMBOL_HARD", "", "getSYMBOL_HARD", "()Ljava/lang/String;", "SYMBOL_SOFT", "getSYMBOL_SOFT", "formatSymbols", "Ljava/text/DecimalFormatSymbols;", "getFormatSymbols", "()Ljava/text/DecimalFormatSymbols;", "formatSymbols$delegate", "Lkotlin/Lazy;", "hardDecimalFormats", "Landroid/util/SparseArray;", "Ljava/text/DecimalFormat;", "softDecimalFormats", "ceil", "", "value", "precision", "", "createFormatter", "symbol", "createFormatterAmount", "createPattern", "createPatternAmount", "floor", "formatWithLetter", "n", "iteration", "getHardDecimalFormat", "getSoftDecimalFormat", "core_release"})
/* compiled from: DecimalUtils.kt */
public final class j {
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{k.a(new PropertyReference1Impl(k.G(j.class), "formatSymbols", "getFormatSymbols()Ljava/text/DecimalFormatSymbols;"))};
    private static final SparseArray<DecimalFormat> bQA = new SparseArray();
    public static final j bQB = new j();
    private static final String bQv = bQv;
    private static final String bQw = bQw;
    private static final d bQx = g.c(DecimalUtils$formatSymbols$2.bQC);
    private static final char[] bQy = new char[]{'k', 'm', 'b', 't'};
    private static final SparseArray<DecimalFormat> bQz = new SparseArray();

    private final DecimalFormatSymbols anm() {
        d dVar = bQx;
        kotlin.reflect.j jVar = anY[0];
        return (DecimalFormatSymbols) dVar.getValue();
    }

    private j() {
    }

    public final String ank() {
        return bQv;
    }

    public final String anl() {
        return bQw;
    }

    public static final DecimalFormat I(String str, int i) {
        kotlin.jvm.internal.i.f(str, "symbol");
        if (i != 0) {
            return new DecimalFormat(bQB.K(str, i), bQB.anm());
        }
        return new DecimalFormat(bQv, bQB.anm());
    }

    public static /* synthetic */ DecimalFormat b(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bQv;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return J(str, i);
    }

    public static final DecimalFormat J(String str, int i) {
        kotlin.jvm.internal.i.f(str, "symbol");
        if (i != 0) {
            return new DecimalFormat(bQB.L(str, i), bQB.anm());
        }
        return new DecimalFormat("#,###,###", bQB.anm());
    }

    private final String K(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder("0.");
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append(str);
        }
        str = stringBuilder.toString();
        kotlin.jvm.internal.i.e(str, "sb.toString()");
        return str;
    }

    private final String L(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder("#,###,##0.");
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append(str);
        }
        str = stringBuilder.toString();
        kotlin.jvm.internal.i.e(str, "sb.toString()");
        return str;
    }

    public static final DecimalFormat fq(int i) {
        DecimalFormat decimalFormat = (DecimalFormat) bQz.get(i);
        if (decimalFormat != null) {
            return decimalFormat;
        }
        decimalFormat = I(bQv, i);
        bQz.put(i, decimalFormat);
        return decimalFormat;
    }

    public static final DecimalFormat fr(int i) {
        DecimalFormat decimalFormat = (DecimalFormat) bQA.get(i);
        if (decimalFormat != null) {
            return decimalFormat;
        }
        decimalFormat = I(bQw, i);
        bQA.put(i, decimalFormat);
        return decimalFormat;
    }
}
