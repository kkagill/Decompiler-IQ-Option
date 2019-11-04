package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.types.checker.j;
import kotlin.reflect.jvm.internal.impl.types.checker.k;

/* compiled from: SpecialTypes.kt */
public final class g extends i implements f {
    public static final a fwO = new a();
    private final ad fwN;

    /* compiled from: SpecialTypes.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final g b(ay ayVar) {
            i.f(ayVar, "type");
            if (ayVar instanceof g) {
                return (g) ayVar;
            }
            if (!c(ayVar)) {
                return null;
            }
            if (ayVar instanceof q) {
                q qVar = (q) ayVar;
                boolean y = i.y(qVar.bPr().bMZ(), qVar.bPs().bMZ());
                if (m.eVC && !y) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("DefinitelyNotNullType for flexible type (");
                    stringBuilder.append(ayVar);
                    stringBuilder.append(") can be created only from type variable with the same constructor for bounds");
                    throw new AssertionError(stringBuilder.toString());
                }
            }
            return new g(t.aG(ayVar), null);
        }

        private final boolean c(ay ayVar) {
            return kotlin.reflect.jvm.internal.impl.types.b.a.h(ayVar) && !k.fxQ.f(ayVar);
        }
    }

    public boolean boc() {
        return false;
    }

    private g(ad adVar) {
        this.fwN = adVar;
    }

    public /* synthetic */ g(ad adVar, f fVar) {
        this(adVar);
    }

    public final ad bPl() {
        return this.fwN;
    }

    /* Access modifiers changed, original: protected */
    public ad bxe() {
        return this.fwN;
    }

    public boolean bxW() {
        return (bxe().bMZ() instanceof j) || (bxe().bMZ().brQ() instanceof ao);
    }

    public w ab(w wVar) {
        i.f(wVar, "replacement");
        return ag.d(wVar.bPA());
    }

    /* renamed from: l */
    public g h(f fVar) {
        i.f(fVar, "newAnnotations");
        return new g(bxe().h(fVar));
    }

    /* renamed from: gM */
    public ad gL(boolean z) {
        return z ? bxe().gM(z) : this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bxe());
        stringBuilder.append("!!");
        return stringBuilder.toString();
    }
}
