package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: SourceElement */
public interface aj {
    public static final aj fcV = new aj() {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"}));
        }

        public String toString() {
            return "NO_SOURCE";
        }

        public ak bqg() {
            ak akVar = ak.fcW;
            if (akVar == null) {
                AnonymousClass1.$$$reportNull$$$0(0);
            }
            return akVar;
        }
    };

    ak bqg();
}
