package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.ag;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.a.a;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.a.c;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.a.d;
import kotlin.reflect.jvm.internal.impl.types.t;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: NewKotlinTypeChecker.kt */
public final class k {
    public static final k fxQ = new k();

    private k() {
    }

    public final boolean c(TypeCheckerContext typeCheckerContext, ad adVar, ad adVar2) {
        i.f(typeCheckerContext, "context");
        i.f(adVar, "subType");
        i.f(adVar2, "superType");
        return d(typeCheckerContext, adVar, adVar2);
    }

    public final boolean f(ay ayVar) {
        i.f(ayVar, "type");
        return a(new TypeCheckerContext(false, false, 2, null), t.aG(ayVar), a.fxZ);
    }

    private final boolean d(TypeCheckerContext typeCheckerContext, ad adVar, ad adVar2) {
        Object obj = (i.f(adVar) || i.e(adVar) || typeCheckerContext.g(adVar)) ? 1 : null;
        String str = "Not singleClassifierType superType: ";
        StringBuilder stringBuilder;
        if (m.eVC && obj == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(adVar2);
            throw new AssertionError(stringBuilder.toString());
        }
        obj = (i.e(adVar2) || typeCheckerContext.g(adVar2)) ? 1 : null;
        if (m.eVC && obj == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(adVar2);
            throw new AssertionError(stringBuilder.toString());
        } else if (adVar2.boc() || ag.aM(adVar) || a(typeCheckerContext, adVar, a.fxZ)) {
            return true;
        } else {
            if (ag.aM(adVar2) || a(typeCheckerContext, adVar2, d.fyb) || i.d(adVar)) {
                return false;
            }
            return d(typeCheckerContext, adVar, adVar2.bMZ());
        }
    }

    private final boolean a(TypeCheckerContext typeCheckerContext, ad adVar, TypeCheckerContext.a aVar) {
        ad adVar2 = adVar;
        Object obj = ((!i.d(adVar) || adVar.boc()) && !ag.aM(adVar2)) ? null : 1;
        if (obj != null) {
            return true;
        }
        typeCheckerContext.initialize();
        ArrayDeque c = typeCheckerContext.fxV;
        if (c == null) {
            i.bnJ();
        }
        Set d = typeCheckerContext.fxW;
        if (d == null) {
            i.bnJ();
        }
        c.push(adVar2);
        while ((c.isEmpty() ^ 1) != 0) {
            if (d.size() <= 1000) {
                ad adVar3 = (ad) c.pop();
                i.e(adVar3, "current");
                if (d.add(adVar3)) {
                    TypeCheckerContext.a aVar2 = adVar3.boc() ? c.fya : aVar;
                    if ((i.y(aVar2, c.fya) ^ 1) == 0) {
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        for (w wVar : adVar3.bMZ().bup()) {
                            i.e(wVar, "supertype");
                            ad bl = aVar2.bl(wVar);
                            Object obj2 = ((!i.d(bl) || bl.boc()) && !ag.aM(bl)) ? null : 1;
                            if (obj2 != null) {
                                typeCheckerContext.clear();
                                return true;
                            }
                            c.add(bl);
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Too many supertypes for type: ");
                stringBuilder.append(adVar2);
                stringBuilder.append(". Supertypes = ");
                stringBuilder.append(u.a(d, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
        }
        typeCheckerContext.clear();
        return false;
    }

    private final boolean d(TypeCheckerContext typeCheckerContext, ad adVar, an anVar) {
        ad adVar2 = adVar;
        an anVar2 = anVar;
        Object obj = (adVar.boc() || !i.y(adVar.bMZ(), anVar2)) ? null : 1;
        if (obj != null) {
            return true;
        }
        typeCheckerContext.initialize();
        ArrayDeque c = typeCheckerContext.fxV;
        if (c == null) {
            i.bnJ();
        }
        Set d = typeCheckerContext.fxW;
        if (d == null) {
            i.bnJ();
        }
        c.push(adVar2);
        while ((c.isEmpty() ^ 1) != 0) {
            if (d.size() <= 1000) {
                ad adVar3 = (ad) c.pop();
                i.e(adVar3, "current");
                if (d.add(adVar3)) {
                    TypeCheckerContext.a aVar = adVar3.boc() ? c.fya : a.fxZ;
                    if ((i.y(aVar, c.fya) ^ 1) == 0) {
                        aVar = null;
                    }
                    if (aVar != null) {
                        for (w wVar : adVar3.bMZ().bup()) {
                            i.e(wVar, "supertype");
                            ad bl = aVar.bl(wVar);
                            Object obj2 = (bl.boc() || !i.y(bl.bMZ(), anVar2)) ? null : 1;
                            if (obj2 != null) {
                                typeCheckerContext.clear();
                                return true;
                            }
                            c.add(bl);
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Too many supertypes for type: ");
                stringBuilder.append(adVar2);
                stringBuilder.append(". Supertypes = ");
                stringBuilder.append(u.a(d, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
        }
        typeCheckerContext.clear();
        return false;
    }
}
