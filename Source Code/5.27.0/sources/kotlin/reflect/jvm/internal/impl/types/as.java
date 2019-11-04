package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;

/* compiled from: TypeSubstitution.kt */
public abstract class as {
    public static final a fxA = new a();
    public static final as fxz = new b();

    /* compiled from: TypeSubstitution.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    /* compiled from: TypeSubstitution.kt */
    public static final class b extends as {
        public Void aT(w wVar) {
            i.f(wVar, "key");
            return null;
        }

        public boolean isEmpty() {
            return true;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }

        b() {
        }

        public /* synthetic */ ap Y(w wVar) {
            return (ap) aT(wVar);
        }
    }

    public abstract ap Y(w wVar);

    public w a(w wVar, Variance variance) {
        i.f(wVar, "topLevelType");
        i.f(variance, "position");
        return wVar;
    }

    public boolean bNd() {
        return false;
    }

    public boolean bPm() {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public f m(f fVar) {
        i.f(fVar, "annotations");
        return fVar;
    }

    public final TypeSubstitutor bPF() {
        TypeSubstitutor e = TypeSubstitutor.e(this);
        i.e(e, "TypeSubstitutor.create(this)");
        return e;
    }
}
