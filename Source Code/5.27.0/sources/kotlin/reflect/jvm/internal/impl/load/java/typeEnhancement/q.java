package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

public final /* synthetic */ class q {
    public static final /* synthetic */ int[] aob = new int[MutabilityQualifier.values().length];
    public static final /* synthetic */ int[] axg = new int[NullabilityQualifier.values().length];

    static {
        aob[MutabilityQualifier.READ_ONLY.ordinal()] = 1;
        aob[MutabilityQualifier.MUTABLE.ordinal()] = 2;
        axg[NullabilityQualifier.NULLABLE.ordinal()] = 1;
        axg[NullabilityQualifier.NOT_NULL.ordinal()] = 2;
    }
}
