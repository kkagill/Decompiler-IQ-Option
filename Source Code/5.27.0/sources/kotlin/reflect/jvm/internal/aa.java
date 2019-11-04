package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.reflect.KParameter.Kind;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@i(bne = {1, 1, 15})
public final /* synthetic */ class aa {
    public static final /* synthetic */ int[] aob = new int[Kind.values().length];
    public static final /* synthetic */ int[] axg = new int[Variance.values().length];

    static {
        aob[Kind.EXTENSION_RECEIVER.ordinal()] = 1;
        aob[Kind.INSTANCE.ordinal()] = 2;
        aob[Kind.VALUE.ordinal()] = 3;
        axg[Variance.INVARIANT.ordinal()] = 1;
        axg[Variance.IN_VARIANCE.ordinal()] = 2;
        axg[Variance.OUT_VARIANCE.ordinal()] = 3;
    }
}
