package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@i(bne = {1, 1, 15})
public final /* synthetic */ class u {
    public static final /* synthetic */ int[] aob = new int[Variance.values().length];

    static {
        aob[Variance.INVARIANT.ordinal()] = 1;
        aob[Variance.IN_VARIANCE.ordinal()] = 2;
        aob[Variance.OUT_VARIANCE.ordinal()] = 3;
    }
}
