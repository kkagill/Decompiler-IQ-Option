package kotlin.reflect.jvm.internal.impl.builtins.jvm;

public final /* synthetic */ class f {
    public static final /* synthetic */ int[] aob = new int[JDKMemberStatus.values().length];

    static {
        aob[JDKMemberStatus.BLACK_LIST.ordinal()] = 1;
        aob[JDKMemberStatus.NOT_CONSIDERED.ordinal()] = 2;
        aob[JDKMemberStatus.DROP.ordinal()] = 3;
        aob[JDKMemberStatus.WHITE_LIST.ordinal()] = 4;
    }
}
