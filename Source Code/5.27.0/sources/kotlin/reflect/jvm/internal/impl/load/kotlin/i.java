package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: methodSignatureMapping.kt */
public abstract class i {

    /* compiled from: methodSignatureMapping.kt */
    public static final class a extends i {
        private final i flY;

        public a(i iVar) {
            kotlin.jvm.internal.i.f(iVar, "elementType");
            super();
            this.flY = iVar;
        }

        public final i byD() {
            return this.flY;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class b extends i {
        private final String flZ;

        public b(String str) {
            kotlin.jvm.internal.i.f(str, "internalName");
            super();
            this.flZ = str;
        }

        public final String byE() {
            return this.flZ;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class c extends i {
        private final JvmPrimitiveType fma;

        public c(JvmPrimitiveType jvmPrimitiveType) {
            super();
            this.fma = jvmPrimitiveType;
        }

        public final JvmPrimitiveType byF() {
            return this.fma;
        }
    }

    private i() {
    }

    public /* synthetic */ i(f fVar) {
        this();
    }

    public String toString() {
        return k.fmb.toString(this);
    }
}
