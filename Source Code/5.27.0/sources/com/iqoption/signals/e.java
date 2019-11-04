package com.iqoption.signals;

import com.iqoption.core.d;
import com.iqoption.core.ext.c;
import com.iqoption.core.microservices.pricemovements.a.a;
import com.iqoption.signals.d.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\n¨\u0006\u000b"}, bng = {"formatDuration", "", "seconds", "", "formatPercent", "percent", "", "isPositive", "", "formatValue", "Lcom/iqoption/core/microservices/pricemovements/response/Signal;", "signals_release"})
/* compiled from: SignalExtensions.kt */
public final class e {
    public static final String a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$formatValue");
        boolean z = aVar.agw() - aVar.agv() > ((double) null);
        return d.getString(f.n1_in_n2, a(aVar.agx(), z), cf(aVar.agu() - aVar.getStartTime()));
    }

    private static final String a(double d, boolean z) {
        StringBuilder stringBuilder;
        if (z) {
            stringBuilder = new StringBuilder();
            stringBuilder.append('+');
            stringBuilder.append(c.d(d, 2));
            stringBuilder.append('%');
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append('-');
        stringBuilder.append(c.d(d, 2));
        stringBuilder.append('%');
        return stringBuilder.toString();
    }

    private static final String cf(long j) {
        long j2 = (long) 60;
        StringBuilder stringBuilder;
        if (j < j2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(j);
            stringBuilder.append(" s");
            return stringBuilder.toString();
        }
        j /= j2;
        if (j < j2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(j);
            stringBuilder.append(" m");
            return stringBuilder.toString();
        }
        j /= j2;
        j2 = (long) 24;
        if (j < j2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(j);
            stringBuilder.append(" h");
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(j / j2);
        stringBuilder2.append(" d");
        return stringBuilder2.toString();
    }
}
