package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;

@i(bne = {1, 1, 15})
public final /* synthetic */ class h {
    public static final /* synthetic */ int[] aob = new int[Kind.values().length];

    static {
        aob[Kind.FILE_FACADE.ordinal()] = 1;
        aob[Kind.MULTIFILE_CLASS.ordinal()] = 2;
        aob[Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
        aob[Kind.SYNTHETIC_CLASS.ordinal()] = 4;
        aob[Kind.UNKNOWN.ordinal()] = 5;
        aob[Kind.CLASS.ordinal()] = 6;
    }
}
