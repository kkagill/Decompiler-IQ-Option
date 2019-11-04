package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.renderer.g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.ac;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.b.a;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import kotlin.reflect.jvm.internal.impl.types.q;

/* compiled from: RawType.kt */
public final class f extends q implements ac {
    public f(ad adVar, ad adVar2) {
        i.f(adVar, "lowerBound");
        i.f(adVar2, "upperBound");
        super(adVar, adVar2);
        boolean c = b.fxI.c(adVar, adVar2);
        if (m.eVC && !c) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Lower bound ");
            stringBuilder.append(adVar);
            stringBuilder.append(" of a flexible type must be a subtype of the upper bound ");
            stringBuilder.append(adVar2);
            throw new AssertionError(stringBuilder.toString());
        }
    }

    public ad bxe() {
        return bPr();
    }

    public h bsF() {
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = bMZ().brQ();
        if (!(brQ instanceof d)) {
            brQ = null;
        }
        d dVar = (d) brQ;
        if (dVar != null) {
            h a = dVar.a(d.fku);
            i.e(a, "classDescriptor.getMemberScope(RawSubstitution)");
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Incorrect classifier: ");
        stringBuilder.append(bMZ().brQ());
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    /* renamed from: e */
    public f f(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar) {
        i.f(fVar, "newAnnotations");
        return new f(bPr().h(fVar), bPs().h(fVar));
    }

    /* renamed from: gK */
    public f gL(boolean z) {
        return new f(bPr().gM(z), bPs().gM(z));
    }

    public String a(kotlin.reflect.jvm.internal.impl.renderer.b bVar, g gVar) {
        i.f(bVar, "renderer");
        i.f(gVar, "options");
        RawTypeImpl$render$1 rawTypeImpl$render$1 = RawTypeImpl$render$1.fkv;
        RawTypeImpl$render$2 rawTypeImpl$render$2 = new RawTypeImpl$render$2(bVar);
        RawTypeImpl$render$3 rawTypeImpl$render$3 = RawTypeImpl$render$3.fkw;
        String b = bVar.b(bPr());
        Object b2 = bVar.b(bPs());
        if (gVar.bMd()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("raw (");
            stringBuilder.append(b);
            stringBuilder.append("..");
            stringBuilder.append(b2);
            stringBuilder.append(')');
            return stringBuilder.toString();
        } else if (bPs().btD().isEmpty()) {
            return bVar.a(b, b2, a.bo(this));
        } else {
            List aa = rawTypeImpl$render$2.invoke(bPr());
            List aa2 = rawTypeImpl$render$2.invoke(bPs());
            Iterable iterable = aa;
            String a = u.a(iterable, ", ", null, null, 0, null, RawTypeImpl$render$newArgs$1.fkx, 30, null);
            Iterable<Pair> e = u.e(iterable, (Iterable) aa2);
            Object obj = 1;
            if (!(e instanceof Collection) || !((Collection) e).isEmpty()) {
                for (Pair pair : e) {
                    if (!RawTypeImpl$render$1.fkv.bb((String) pair.getFirst(), (String) pair.bni())) {
                        obj = null;
                        break;
                    }
                }
            }
            if (obj != null) {
                b2 = rawTypeImpl$render$3.w(b2, a);
            }
            String bc = rawTypeImpl$render$3.w(b, a);
            if (i.y(bc, b2)) {
                return bc;
            }
            return bVar.a(bc, b2, a.bo(this));
        }
    }
}
