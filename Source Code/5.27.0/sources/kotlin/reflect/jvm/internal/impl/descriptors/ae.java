package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* compiled from: PropertyDescriptor */
public interface ae extends CallableMemberDescriptor, au {
    Collection<? extends ae> bsR();

    af btG();

    ag btH();

    List<ad> btI();

    ae btJ();

    q btK();

    q btL();

    ae d(TypeSubstitutor typeSubstitutor);
}
