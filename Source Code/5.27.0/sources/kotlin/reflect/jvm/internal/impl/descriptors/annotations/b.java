package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* compiled from: AnnotatedImpl */
public class b implements a {
    private final f fdr;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 1 ? 3 : 2)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = str2;
        }
        if (i != 1) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        str = String.format(str, objArr);
        throw (i != 1 ? new IllegalArgumentException(str) : new IllegalStateException(str));
    }

    public b(f fVar) {
        if (fVar == null) {
            $$$reportNull$$$0(0);
        }
        this.fdr = fVar;
    }

    public f brE() {
        f fVar = this.fdr;
        if (fVar == null) {
            $$$reportNull$$$0(1);
        }
        return fVar;
    }
}
