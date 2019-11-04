package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.renderer.g;
import kotlin.reflect.jvm.internal.impl.types.checker.b;

/* compiled from: flexibleTypes.kt */
public final class r extends q implements f {
    public static boolean fxg;
    public static final a fxh = new a();
    private boolean fxf;

    /* compiled from: flexibleTypes.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public r(ad adVar, ad adVar2) {
        i.f(adVar, "lowerBound");
        i.f(adVar2, "upperBound");
        super(adVar, adVar2);
    }

    private final void bPt() {
        if (fxg && !this.fxf) {
            this.fxf = true;
            int aE = t.aE(bPr()) ^ 1;
            StringBuilder stringBuilder;
            if (m.eVC && aE == 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Lower bound of a flexible type can not be flexible: ");
                stringBuilder.append(bPr());
                throw new AssertionError(stringBuilder.toString());
            }
            aE = t.aE(bPs()) ^ 1;
            if (m.eVC && aE == 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Upper bound of a flexible type can not be flexible: ");
                stringBuilder.append(bPs());
                throw new AssertionError(stringBuilder.toString());
            }
            int y = 1 ^ i.y(bPr(), bPs());
            if (m.eVC && y == 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Lower and upper bounds are equal: ");
                stringBuilder.append(bPr());
                stringBuilder.append(" == ");
                stringBuilder.append(bPs());
                throw new AssertionError(stringBuilder.toString());
            }
            boolean c = b.fxI.c(bPr(), bPs());
            if (m.eVC && !c) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Lower bound ");
                stringBuilder.append(bPr());
                stringBuilder.append(" of a flexible type must be a subtype of the upper bound ");
                stringBuilder.append(bPs());
                throw new AssertionError(stringBuilder.toString());
            }
        }
    }

    public ad bxe() {
        bPt();
        return bPr();
    }

    public boolean bxW() {
        return (bPr().bMZ().brQ() instanceof ao) && i.y(bPr().bMZ(), bPs().bMZ());
    }

    public w ab(w wVar) {
        ay ayVar;
        i.f(wVar, "replacement");
        ay bPA = wVar.bPA();
        if (bPA instanceof q) {
            ayVar = bPA;
        } else if (bPA instanceof ad) {
            ad adVar = (ad) bPA;
            ayVar = x.a(adVar, adVar.gM(true));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return aw.a(ayVar, bPA);
    }

    public ay f(f fVar) {
        i.f(fVar, "newAnnotations");
        return x.a(bPr().h(fVar), bPs().h(fVar));
    }

    public String a(kotlin.reflect.jvm.internal.impl.renderer.b bVar, g gVar) {
        i.f(bVar, "renderer");
        i.f(gVar, "options");
        if (!gVar.bMd()) {
            return bVar.a(bVar.b(bPr()), bVar.b(bPs()), kotlin.reflect.jvm.internal.impl.types.b.a.bo(this));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(bVar.b(bPr()));
        stringBuilder.append("..");
        stringBuilder.append(bVar.b(bPs()));
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public ay gL(boolean z) {
        return x.a(bPr().gM(z), bPs().gM(z));
    }
}
