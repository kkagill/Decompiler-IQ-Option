package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* compiled from: ClassConstructorDescriptor.kt */
public interface c extends j {
    c a(TypeSubstitutor typeSubstitutor);

    c b(k kVar, Modality modality, aw awVar, Kind kind, boolean z);

    c btc();
}
