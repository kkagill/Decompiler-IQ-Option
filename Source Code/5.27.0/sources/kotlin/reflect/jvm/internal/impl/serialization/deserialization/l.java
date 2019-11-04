package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.d;

/* compiled from: ErrorReporter */
public interface l {
    public static final l fvt = new l() {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a(d dVar, List<String> list) {
            if (dVar == null) {
                AnonymousClass1.$$$reportNull$$$0(0);
            }
            if (list == null) {
                AnonymousClass1.$$$reportNull$$$0(1);
            }
        }

        public void d(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                AnonymousClass1.$$$reportNull$$$0(2);
            }
        }
    };

    void a(d dVar, List<String> list);

    void d(CallableMemberDescriptor callableMemberDescriptor);
}
