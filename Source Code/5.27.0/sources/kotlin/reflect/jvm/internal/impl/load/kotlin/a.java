package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;

public final /* synthetic */ class a {
    public static final /* synthetic */ int[] aob = new int[AnnotatedCallableKind.values().length];

    static {
        aob[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
        aob[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
        aob[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
    }
}
