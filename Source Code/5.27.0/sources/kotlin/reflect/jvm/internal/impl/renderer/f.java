package kotlin.reflect.jvm.internal.impl.renderer;

public final /* synthetic */ class f {
    public static final /* synthetic */ int[] aFX = new int[RenderingFormat.values().length];
    public static final /* synthetic */ int[] aFY = new int[RenderingFormat.values().length];
    public static final /* synthetic */ int[] aob = new int[RenderingFormat.values().length];
    public static final /* synthetic */ int[] axg = new int[RenderingFormat.values().length];
    public static final /* synthetic */ int[] bjZ = new int[ParameterNameRenderingPolicy.values().length];

    static {
        aob[RenderingFormat.PLAIN.ordinal()] = 1;
        aob[RenderingFormat.HTML.ordinal()] = 2;
        axg[RenderingFormat.PLAIN.ordinal()] = 1;
        axg[RenderingFormat.HTML.ordinal()] = 2;
        aFX[RenderingFormat.PLAIN.ordinal()] = 1;
        aFX[RenderingFormat.HTML.ordinal()] = 2;
        aFY[RenderingFormat.PLAIN.ordinal()] = 1;
        aFY[RenderingFormat.HTML.ordinal()] = 2;
        bjZ[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
        bjZ[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
        bjZ[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
    }
}
