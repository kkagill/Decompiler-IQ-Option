package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind;

public final /* synthetic */ class d {
    public static final /* synthetic */ int[] aob = new int[Kind.values().length];

    static {
        aob[Kind.Function.ordinal()] = 1;
        aob[Kind.SuspendFunction.ordinal()] = 2;
    }
}
