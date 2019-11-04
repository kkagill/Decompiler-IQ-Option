package kotlin.reflect.jvm.internal.components;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.l;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\f"}, bng = {"Lkotlin/reflect/jvm/internal/components/RuntimeErrorReporter;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter;", "()V", "reportCannotInferVisibility", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "reportIncompleteHierarchy", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "unresolvedSuperClasses", "", "", "descriptors.runtime"})
/* compiled from: RuntimeErrorReporter.kt */
public final class i implements l {
    public static final i eYV = new i();

    private i() {
    }

    public void a(d dVar, List<String> list) {
        kotlin.jvm.internal.i.f(dVar, "descriptor");
        kotlin.jvm.internal.i.f(list, "unresolvedSuperClasses");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Incomplete hierarchy for class ");
        stringBuilder.append(dVar.bsZ());
        stringBuilder.append(", unresolved classes ");
        stringBuilder.append(list);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void d(CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.i.f(callableMemberDescriptor, "descriptor");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot infer visibility for ");
        stringBuilder.append(callableMemberDescriptor);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
