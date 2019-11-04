package kotlin;

@i(bne = {1, 1, 15})
public final /* synthetic */ class f {
    public static final /* synthetic */ int[] aob = new int[LazyThreadSafetyMode.values().length];

    static {
        aob[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
        aob[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
        aob[LazyThreadSafetyMode.NONE.ordinal()] = 3;
    }
}
