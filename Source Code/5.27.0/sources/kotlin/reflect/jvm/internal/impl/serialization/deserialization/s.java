package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: ProtoEnumFlags.kt */
public final class s {
    public static final s fvC = new s();

    private s() {
    }

    public final Kind a(MemberKind memberKind) {
        if (memberKind != null) {
            int i = t.aob[memberKind.ordinal()];
            if (i == 1) {
                return Kind.DECLARATION;
            }
            if (i == 2) {
                return Kind.FAKE_OVERRIDE;
            }
            if (i == 3) {
                return Kind.DELEGATION;
            }
            if (i == 4) {
                return Kind.SYNTHESIZED;
            }
        }
        return Kind.DECLARATION;
    }

    public final Modality a(ProtoBuf.Modality modality) {
        if (modality != null) {
            int i = t.aFX[modality.ordinal()];
            if (i == 1) {
                return Modality.FINAL;
            }
            if (i == 2) {
                return Modality.OPEN;
            }
            if (i == 3) {
                return Modality.ABSTRACT;
            }
            if (i == 4) {
                return Modality.SEALED;
            }
        }
        return Modality.FINAL;
    }

    public final aw a(Visibility visibility) {
        Object obj;
        if (visibility != null) {
            switch (t.bjZ[visibility.ordinal()]) {
                case 1:
                    obj = av.fdd;
                    break;
                case 2:
                    obj = av.fda;
                    break;
                case 3:
                    obj = av.fdb;
                    break;
                case 4:
                    obj = av.fdc;
                    break;
                case 5:
                    obj = av.fde;
                    break;
                case 6:
                    obj = av.fdf;
                    break;
            }
        }
        obj = av.fda;
        i.e(obj, "when (visibility) {\n    …isibilities.PRIVATE\n    }");
        return obj;
    }

    public final ClassKind a(Class.Kind kind) {
        if (kind != null) {
            switch (t.fvD[kind.ordinal()]) {
                case 1:
                    return ClassKind.CLASS;
                case 2:
                    return ClassKind.INTERFACE;
                case 3:
                    return ClassKind.ENUM_CLASS;
                case 4:
                    return ClassKind.ENUM_ENTRY;
                case 5:
                    return ClassKind.ANNOTATION_CLASS;
                case 6:
                case 7:
                    return ClassKind.OBJECT;
            }
        }
        return ClassKind.CLASS;
    }

    public final Variance b(TypeParameter.Variance variance) {
        i.f(variance, "variance");
        int i = t.fvF[variance.ordinal()];
        if (i == 1) {
            return Variance.IN_VARIANCE;
        }
        if (i == 2) {
            return Variance.OUT_VARIANCE;
        }
        if (i == 3) {
            return Variance.INVARIANT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Variance b(Projection projection) {
        i.f(projection, "projection");
        int i = t.fvG[projection.ordinal()];
        if (i == 1) {
            return Variance.IN_VARIANCE;
        }
        if (i == 2) {
            return Variance.OUT_VARIANCE;
        }
        if (i == 3) {
            return Variance.INVARIANT;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Only IN, OUT and INV are supported. Actual argument: ");
        stringBuilder.append(projection);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
