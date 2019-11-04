package kotlin.reflect.jvm.internal.impl.metadata.a;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level;

public final /* synthetic */ class j {
    public static final /* synthetic */ int[] aob = new int[Level.values().length];

    static {
        aob[Level.WARNING.ordinal()] = 1;
        aob[Level.ERROR.ordinal()] = 2;
        aob[Level.HIDDEN.ordinal()] = 3;
    }
}
