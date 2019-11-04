package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.EnumMap;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f;

/* compiled from: context.kt */
public final class d {
    private final EnumMap<QualifierApplicabilityType, f> fiT;

    public d(EnumMap<QualifierApplicabilityType, f> enumMap) {
        i.f(enumMap, "nullabilityQualifiers");
        this.fiT = enumMap;
    }

    public final EnumMap<QualifierApplicabilityType, f> bwh() {
        return this.fiT;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d c(QualifierApplicabilityType qualifierApplicabilityType) {
        f fVar = (f) this.fiT.get(qualifierApplicabilityType);
        if (fVar == null) {
            return null;
        }
        i.e(fVar, "nullabilityQualifiers[ap…ilityType] ?: return null");
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d(fVar.bxX(), null, false, fVar.bxY());
    }
}
