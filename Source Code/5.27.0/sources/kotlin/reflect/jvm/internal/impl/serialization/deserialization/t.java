package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility;

public final /* synthetic */ class t {
    public static final /* synthetic */ int[] aFX = new int[Modality.values().length];
    public static final /* synthetic */ int[] aFY = new int[kotlin.reflect.jvm.internal.impl.descriptors.Modality.values().length];
    public static final /* synthetic */ int[] aob = new int[MemberKind.values().length];
    public static final /* synthetic */ int[] axg = new int[Kind.values().length];
    public static final /* synthetic */ int[] bjZ = new int[Visibility.values().length];
    public static final /* synthetic */ int[] fvD = new int[Class.Kind.values().length];
    public static final /* synthetic */ int[] fvE = new int[ClassKind.values().length];
    public static final /* synthetic */ int[] fvF = new int[Variance.values().length];
    public static final /* synthetic */ int[] fvG = new int[Projection.values().length];

    static {
        aob[MemberKind.DECLARATION.ordinal()] = 1;
        aob[MemberKind.FAKE_OVERRIDE.ordinal()] = 2;
        aob[MemberKind.DELEGATION.ordinal()] = 3;
        aob[MemberKind.SYNTHESIZED.ordinal()] = 4;
        axg[Kind.DECLARATION.ordinal()] = 1;
        axg[Kind.FAKE_OVERRIDE.ordinal()] = 2;
        axg[Kind.DELEGATION.ordinal()] = 3;
        axg[Kind.SYNTHESIZED.ordinal()] = 4;
        aFX[Modality.FINAL.ordinal()] = 1;
        aFX[Modality.OPEN.ordinal()] = 2;
        aFX[Modality.ABSTRACT.ordinal()] = 3;
        aFX[Modality.SEALED.ordinal()] = 4;
        aFY[kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL.ordinal()] = 1;
        aFY[kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN.ordinal()] = 2;
        aFY[kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT.ordinal()] = 3;
        aFY[kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED.ordinal()] = 4;
        bjZ[Visibility.INTERNAL.ordinal()] = 1;
        bjZ[Visibility.PRIVATE.ordinal()] = 2;
        bjZ[Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
        bjZ[Visibility.PROTECTED.ordinal()] = 4;
        bjZ[Visibility.PUBLIC.ordinal()] = 5;
        bjZ[Visibility.LOCAL.ordinal()] = 6;
        fvD[Class.Kind.CLASS.ordinal()] = 1;
        fvD[Class.Kind.INTERFACE.ordinal()] = 2;
        fvD[Class.Kind.ENUM_CLASS.ordinal()] = 3;
        fvD[Class.Kind.ENUM_ENTRY.ordinal()] = 4;
        fvD[Class.Kind.ANNOTATION_CLASS.ordinal()] = 5;
        fvD[Class.Kind.OBJECT.ordinal()] = 6;
        fvD[Class.Kind.COMPANION_OBJECT.ordinal()] = 7;
        fvE[ClassKind.CLASS.ordinal()] = 1;
        fvE[ClassKind.INTERFACE.ordinal()] = 2;
        fvE[ClassKind.ENUM_CLASS.ordinal()] = 3;
        fvE[ClassKind.ENUM_ENTRY.ordinal()] = 4;
        fvE[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
        fvE[ClassKind.OBJECT.ordinal()] = 6;
        fvF[Variance.IN.ordinal()] = 1;
        fvF[Variance.OUT.ordinal()] = 2;
        fvF[Variance.INV.ordinal()] = 3;
        fvG[Projection.IN.ordinal()] = 1;
        fvG[Projection.OUT.ordinal()] = 2;
        fvG[Projection.INV.ordinal()] = 3;
        fvG[Projection.STAR.ordinal()] = 4;
    }
}
