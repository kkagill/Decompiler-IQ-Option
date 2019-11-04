package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation;

public final /* synthetic */ class i {
    public static final /* synthetic */ int[] aob = new int[Operation.values().length];

    static {
        aob[Operation.NONE.ordinal()] = 1;
        aob[Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
        aob[Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
    }
}
