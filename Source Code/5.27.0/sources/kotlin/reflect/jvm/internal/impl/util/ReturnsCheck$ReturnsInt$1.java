package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: modifierChecks.kt */
final class ReturnsCheck$ReturnsInt$1 extends Lambda implements b<g, ad> {
    public static final ReturnsCheck$ReturnsInt$1 fzx = new ReturnsCheck$ReturnsInt$1();

    ReturnsCheck$ReturnsInt$1() {
        super(1);
    }

    /* renamed from: b */
    public final ad invoke(g gVar) {
        i.f(gVar, "$receiver");
        ad bqR = gVar.bqR();
        i.e(bqR, "intType");
        return bqR;
    }
}
