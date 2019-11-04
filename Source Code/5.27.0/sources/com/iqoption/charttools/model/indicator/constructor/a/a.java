package com.iqoption.charttools.model.indicator.constructor.a;

import com.iqoption.charttools.model.indicator.constructor.d;
import com.iqoption.charttools.model.indicator.constructor.f;
import com.iqoption.charttools.model.indicator.constructor.g;
import com.iqoption.charttools.model.indicator.constructor.h;
import com.iqoption.charttools.n;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a*\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\b\u001a\u000e\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0010"}, bng = {"buildFibonacciArcLineInputs", "Lcom/iqoption/charttools/model/indicator/constructor/Inputs;", "values", "Lcom/iqoption/charttools/model/indicator/constructor/ValuesIterator;", "buildFibonacciLineInputs", "buildFibonacciSpiralInputs", "buildHorizontalLineInputs", "buildIntervalInputs", "buildLineInputs", "block", "Lkotlin/Function1;", "Lcom/iqoption/charttools/model/indicator/constructor/InputGroupBuilder;", "", "Lkotlin/ExtensionFunctionType;", "buildRayInputs", "buildVerticalLineInputs", "techtools_release"})
/* compiled from: FigureInputs.kt */
public final class a {
    public static final f a(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        d dVar = new d();
        dVar.d(0, hVar.nextInt(-1), true);
        d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        d dVar2 = dVar;
        d.b(dVar2, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        d.c(dVar2, n.i.apply_to, hVar.nextInt(-1), false, 4, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f b(h hVar) {
        h hVar2 = hVar;
        kotlin.jvm.internal.i.f(hVar2, "values");
        g gVar = new g();
        List OS = gVar.OS();
        d dVar = new d();
        dVar.d(0, hVar2.nextInt(-1), true);
        d.a(dVar, n.i.color, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        d dVar2 = dVar;
        d.b(dVar2, n.i.width, hVar2.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        d.c(dVar2, n.i.apply_to, hVar2.nextInt(-1), false, 4, null);
        double d = -1.0d;
        d.a(dVar2, 0, hVar2.nextDouble(-1.0d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar2.nextDouble(d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar2.nextDouble(d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar2.nextDouble(d), null, null, null, true, 28, null);
        dVar.a(0, true, true);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f c(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        d dVar = new d();
        dVar.d(0, hVar.nextInt(-1), true);
        d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        d dVar2 = dVar;
        d.b(dVar2, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        d.c(dVar2, n.i.apply_to, hVar.nextInt(-1), false, 4, null);
        d.a(dVar, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f d(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        d dVar = new d();
        dVar.d(0, hVar.nextInt(-1), true);
        d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        d dVar2 = dVar;
        d.b(dVar2, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        d.c(dVar2, n.i.apply_to, hVar.nextInt(-1), false, 4, null);
        d.a(dVar, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f e(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        d dVar = new d();
        dVar.d(0, hVar.nextInt(-1), true);
        d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        d dVar2 = dVar;
        d.b(dVar2, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        d.c(dVar2, n.i.apply_to, hVar.nextInt(-1), false, 4, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f f(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        d dVar = new d();
        dVar.d(0, hVar.nextInt(-1), true);
        d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        d dVar2 = dVar;
        d.b(dVar2, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        d.c(dVar2, n.i.apply_to, hVar.nextInt(-1), false, 4, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        OS.add(dVar);
        return gVar.OT();
    }

    public static final f g(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "values");
        g gVar = new g();
        List OS = gVar.OS();
        d dVar = new d();
        dVar.d(0, hVar.nextInt(-1), true);
        d.a(dVar, n.i.color, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJa[0]), false, 4, null);
        d dVar2 = dVar;
        d.b(dVar2, n.i.width, hVar.nextInt(com.iqoption.charttools.model.indicator.i.aJb[0]), false, 4, null);
        d.c(dVar2, n.i.apply_to, hVar.nextInt(-1), false, 4, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        d.a(dVar2, 0, hVar.nextDouble(-1.0d), null, null, null, true, 28, null);
        OS.add(dVar);
        return gVar.OT();
    }
}
