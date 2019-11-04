package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.reflect.jvm.internal.impl.types.Variance;

public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[Variance.values().length];
    public static final /* synthetic */ int[] axg = new int[Variance.values().length];

    static {
        aob[Variance.INVARIANT.ordinal()] = 1;
        aob[Variance.IN_VARIANCE.ordinal()] = 2;
        aob[Variance.OUT_VARIANCE.ordinal()] = 3;
        axg[Variance.IN_VARIANCE.ordinal()] = 1;
        axg[Variance.OUT_VARIANCE.ordinal()] = 2;
    }
}
