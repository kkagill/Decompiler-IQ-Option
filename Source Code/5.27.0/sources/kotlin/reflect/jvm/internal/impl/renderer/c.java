package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;

public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[ClassKind.values().length];

    static {
        aob[ClassKind.CLASS.ordinal()] = 1;
        aob[ClassKind.INTERFACE.ordinal()] = 2;
        aob[ClassKind.ENUM_CLASS.ordinal()] = 3;
        aob[ClassKind.OBJECT.ordinal()] = 4;
        aob[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
        aob[ClassKind.ENUM_ENTRY.ordinal()] = 6;
    }
}
