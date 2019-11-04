package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.at;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.jvm.internal.impl.types.t;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: TypeCheckerContext.kt */
public class TypeCheckerContext {
    private int fxT;
    private boolean fxU;
    private ArrayDeque<ad> fxV;
    private Set<ad> fxW;
    private final boolean fxX;
    private final boolean fxY;

    /* compiled from: TypeCheckerContext.kt */
    public enum LowerCapturedTypePolicy {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* compiled from: TypeCheckerContext.kt */
    public enum SeveralSupertypesWithSameConstructorPolicy {
        TAKE_FIRST_FOR_SUBTYPING,
        FORCE_NOT_SUBTYPE,
        CHECK_ANY_OF_THEM,
        INTERSECT_ARGUMENTS_AND_CHECK_AGAIN
    }

    /* compiled from: TypeCheckerContext.kt */
    public static abstract class a {

        /* compiled from: TypeCheckerContext.kt */
        public static final class a extends a {
            public static final a fxZ = new a();

            private a() {
                super();
            }

            public ad bl(w wVar) {
                i.f(wVar, "type");
                return t.aG(wVar);
            }
        }

        /* compiled from: TypeCheckerContext.kt */
        public static final class b extends a {
            private final TypeSubstitutor fuF;

            public b(TypeSubstitutor typeSubstitutor) {
                i.f(typeSubstitutor, "substitutor");
                super();
                this.fuF = typeSubstitutor;
            }

            public ad bl(w wVar) {
                i.f(wVar, "type");
                wVar = this.fuF.b((w) t.aG(wVar), Variance.INVARIANT);
                i.e(wVar, "substitutor.safeSubstitu…le(), Variance.INVARIANT)");
                return at.aU(wVar);
            }
        }

        /* compiled from: TypeCheckerContext.kt */
        public static final class c extends a {
            public static final c fya = new c();

            private c() {
                super();
            }

            public /* synthetic */ ad bl(w wVar) {
                return (ad) bm(wVar);
            }

            public Void bm(w wVar) {
                i.f(wVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* compiled from: TypeCheckerContext.kt */
        public static final class d extends a {
            public static final d fyb = new d();

            private d() {
                super();
            }

            public ad bl(w wVar) {
                i.f(wVar, "type");
                return t.aH(wVar);
            }
        }

        public abstract ad bl(w wVar);

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public Boolean b(ay ayVar, ay ayVar2) {
        i.f(ayVar, "subType");
        i.f(ayVar2, "superType");
        return null;
    }

    public TypeCheckerContext(boolean z, boolean z2) {
        this.fxX = z;
        this.fxY = z2;
    }

    public /* synthetic */ TypeCheckerContext(boolean z, boolean z2, int i, f fVar) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        this(z, z2);
    }

    public final boolean bPM() {
        return this.fxX;
    }

    public boolean d(an anVar, an anVar2) {
        i.f(anVar, "a");
        i.f(anVar2, "b");
        return i.y(anVar, anVar2);
    }

    public LowerCapturedTypePolicy a(ad adVar, d dVar) {
        i.f(adVar, "subType");
        i.f(dVar, "superType");
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    public SeveralSupertypesWithSameConstructorPolicy bPL() {
        return SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN;
    }

    private final void initialize() {
        int i = this.fxU ^ 1;
        if (m.eVC && i == 0) {
            throw new AssertionError("Assertion failed");
        }
        this.fxU = true;
        if (this.fxV == null) {
            this.fxV = new ArrayDeque(4);
        }
        if (this.fxW == null) {
            this.fxW = kotlin.reflect.jvm.internal.impl.utils.i.fAh.bQf();
        }
    }

    private final void clear() {
        ArrayDeque arrayDeque = this.fxV;
        if (arrayDeque == null) {
            i.bnJ();
        }
        arrayDeque.clear();
        Set set = this.fxW;
        if (set == null) {
            i.bnJ();
        }
        set.clear();
        this.fxU = false;
    }

    public final boolean g(ay ayVar) {
        i.f(ayVar, "$this$isAllowedTypeVariable");
        return this.fxY && (ayVar.bMZ() instanceof j);
    }
}
