package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.LowerCapturedTypePolicy;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy;

public final /* synthetic */ class h {
    public static final /* synthetic */ int[] aFX = new int[Variance.values().length];
    public static final /* synthetic */ int[] aob = new int[LowerCapturedTypePolicy.values().length];
    public static final /* synthetic */ int[] axg = new int[SeveralSupertypesWithSameConstructorPolicy.values().length];

    static {
        aob[LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
        aob[LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
        aob[LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
        axg[SeveralSupertypesWithSameConstructorPolicy.FORCE_NOT_SUBTYPE.ordinal()] = 1;
        axg[SeveralSupertypesWithSameConstructorPolicy.TAKE_FIRST_FOR_SUBTYPING.ordinal()] = 2;
        axg[SeveralSupertypesWithSameConstructorPolicy.CHECK_ANY_OF_THEM.ordinal()] = 3;
        axg[SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN.ordinal()] = 4;
        aFX[Variance.INVARIANT.ordinal()] = 1;
        aFX[Variance.OUT_VARIANCE.ordinal()] = 2;
        aFX[Variance.IN_VARIANCE.ordinal()] = 3;
    }
}
