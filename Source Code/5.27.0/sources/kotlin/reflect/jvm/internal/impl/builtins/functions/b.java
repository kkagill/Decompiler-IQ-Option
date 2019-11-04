package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind;

public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[Kind.values().length];
    public static final /* synthetic */ int[] axg = new int[Kind.values().length];

    static {
        aob[Kind.SuspendFunction.ordinal()] = 1;
        aob[Kind.KSuspendFunction.ordinal()] = 2;
        aob[Kind.Function.ordinal()] = 3;
        aob[Kind.KFunction.ordinal()] = 4;
        axg[Kind.KFunction.ordinal()] = 1;
        axg[Kind.KSuspendFunction.ordinal()] = 2;
    }
}
