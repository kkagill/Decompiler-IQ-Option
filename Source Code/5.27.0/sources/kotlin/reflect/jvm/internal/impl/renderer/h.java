package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.f.d;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.m;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.renderer.a.c;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: DescriptorRendererOptionsImpl.kt */
public final class h implements g {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(h.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "withDefinedIn", "getWithDefinedIn()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "modifiers", "getModifiers()Ljava/util/Set;")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "startFromName", "getStartFromName()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "debugMode", "getDebugMode()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "verbose", "getVerbose()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "unitReturnType", "getUnitReturnType()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "withoutReturnType", "getWithoutReturnType()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "enhancedTypes", "getEnhancedTypes()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "renderDefaultModality", "getRenderDefaultModality()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "receiverAfterName", "getReceiverAfterName()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), k.a(new MutablePropertyReference1Impl(k.G(h.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z"))};
    private boolean cGi;
    private final d frI = dP(c.frh);
    private final d frJ;
    private final d frK;
    private final d frL;
    private final d frM;
    private final d frN;
    private final d frO;
    private final d frP;
    private final d frQ;
    private final d frR;
    private final d frS;
    private final d frT;
    private final d frU;
    private final d frV;
    private final d frW;
    private final d frX;
    private final d frY;
    private final d frZ;
    private final d fsA;
    private final d fsB;
    private final d fsC;
    private final d fsa;
    private final d fsb;
    private final d fsc;
    private final d fsd;
    private final d fse;
    private final d fsf;
    private final d fsg;
    private final d fsh;
    private final d fsi;
    private final d fsj;
    private final d fsk;
    private final d fsl;
    private final d fsm;
    private final d fsn;
    private final d fso;
    private final d fsp;
    private final d fsq;
    private final d fsr;
    private final d fss;
    private final d fst;
    private final d fsu;
    private final d fsv;
    private final d fsw;
    private final d fsx;
    private final d fsy;
    private final d fsz;

    /* compiled from: Delegates.kt */
    public static final class a extends kotlin.f.c<T> {
        final /* synthetic */ Object app;
        final /* synthetic */ h fsE;

        public a(Object obj, Object obj2, h hVar) {
            this.app = obj;
            this.fsE = hVar;
            super(obj2);
        }

        /* Access modifiers changed, original: protected */
        public boolean b(j<?> jVar, T t, T t2) {
            i.f(jVar, "property");
            if (!this.fsE.isLocked()) {
                return true;
            }
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
    }

    public void a(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        i.f(annotationArgumentsRenderingPolicy, "<set-?>");
        this.fst.a(this, anY[37], annotationArgumentsRenderingPolicy);
    }

    public void a(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        i.f(parameterNameRenderingPolicy, "<set-?>");
        this.fsk.a(this, anY[28], parameterNameRenderingPolicy);
    }

    public void a(RenderingFormat renderingFormat) {
        i.f(renderingFormat, "<set-?>");
        this.fsj.a(this, anY[27], renderingFormat);
    }

    public void a(a aVar) {
        i.f(aVar, "<set-?>");
        this.frI.a(this, anY[0], aVar);
    }

    public boolean bLW() {
        return ((Boolean) this.frZ.b(this, anY[17])).booleanValue();
    }

    public boolean bLX() {
        return ((Boolean) this.fsu.b(this, anY[38])).booleanValue();
    }

    public AnnotationArgumentsRenderingPolicy bLY() {
        return (AnnotationArgumentsRenderingPolicy) this.fst.b(this, anY[37]);
    }

    public b<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> bLZ() {
        return (b) this.fss.b(this, anY[36]);
    }

    public boolean bMA() {
        return ((Boolean) this.fsx.b(this, anY[41])).booleanValue();
    }

    public boolean bMB() {
        return ((Boolean) this.fsw.b(this, anY[40])).booleanValue();
    }

    public boolean bMC() {
        return ((Boolean) this.fsg.b(this, anY[24])).booleanValue();
    }

    public boolean bMD() {
        return ((Boolean) this.frN.b(this, anY[5])).booleanValue();
    }

    public boolean bME() {
        return ((Boolean) this.frM.b(this, anY[4])).booleanValue();
    }

    public RenderingFormat bMF() {
        return (RenderingFormat) this.fsj.b(this, anY[27]);
    }

    public b<w, w> bMG() {
        return (b) this.fse.b(this, anY[22]);
    }

    public boolean bMH() {
        return ((Boolean) this.fsa.b(this, anY[18])).booleanValue();
    }

    public boolean bMI() {
        return ((Boolean) this.frR.b(this, anY[9])).booleanValue();
    }

    public b.b bMJ() {
        return (b.b) this.fsi.b(this, anY[26]);
    }

    public boolean bMK() {
        return ((Boolean) this.frQ.b(this, anY[8])).booleanValue();
    }

    public boolean bML() {
        return ((Boolean) this.frJ.b(this, anY[1])).booleanValue();
    }

    public boolean bMM() {
        return ((Boolean) this.frK.b(this, anY[2])).booleanValue();
    }

    public boolean bMN() {
        return ((Boolean) this.frS.b(this, anY[10])).booleanValue();
    }

    public boolean bMO() {
        return ((Boolean) this.fsd.b(this, anY[21])).booleanValue();
    }

    public boolean bMP() {
        return ((Boolean) this.fsc.b(this, anY[20])).booleanValue();
    }

    public boolean bMa() {
        return ((Boolean) this.fsC.b(this, anY[46])).booleanValue();
    }

    public boolean bMb() {
        return ((Boolean) this.frP.b(this, anY[7])).booleanValue();
    }

    public a bMc() {
        return (a) this.frI.b(this, anY[0]);
    }

    public boolean bMd() {
        return ((Boolean) this.frO.b(this, anY[6])).booleanValue();
    }

    public b<ar, String> bMe() {
        return (b) this.fsf.b(this, anY[23]);
    }

    public boolean bMf() {
        return ((Boolean) this.fsp.b(this, anY[33])).booleanValue();
    }

    public boolean bMg() {
        return ((Boolean) this.frT.b(this, anY[11])).booleanValue();
    }

    public Set<kotlin.reflect.jvm.internal.impl.name.b> bMh() {
        return (Set) this.fsq.b(this, anY[34]);
    }

    public Set<kotlin.reflect.jvm.internal.impl.name.b> bMi() {
        return (Set) this.fsr.b(this, anY[35]);
    }

    public boolean bMj() {
        return ((Boolean) this.fsy.b(this, anY[42])).booleanValue();
    }

    public boolean bMk() {
        return ((Boolean) this.fsb.b(this, anY[19])).booleanValue();
    }

    public Set<DescriptorRendererModifier> bMl() {
        return (Set) this.frL.b(this, anY[3]);
    }

    public boolean bMm() {
        return ((Boolean) this.frU.b(this, anY[12])).booleanValue();
    }

    public OverrideRenderingPolicy bMn() {
        return (OverrideRenderingPolicy) this.fsh.b(this, anY[25]);
    }

    public ParameterNameRenderingPolicy bMo() {
        return (ParameterNameRenderingPolicy) this.fsk.b(this, anY[28]);
    }

    public boolean bMp() {
        return ((Boolean) this.fsz.b(this, anY[43])).booleanValue();
    }

    public boolean bMq() {
        return ((Boolean) this.fsB.b(this, anY[45])).booleanValue();
    }

    public PropertyAccessorRenderingPolicy bMr() {
        return (PropertyAccessorRenderingPolicy) this.fsn.b(this, anY[31]);
    }

    public boolean bMs() {
        return ((Boolean) this.fsl.b(this, anY[29])).booleanValue();
    }

    public boolean bMt() {
        return ((Boolean) this.fsm.b(this, anY[30])).booleanValue();
    }

    public boolean bMu() {
        return ((Boolean) this.frX.b(this, anY[15])).booleanValue();
    }

    public boolean bMv() {
        return ((Boolean) this.fsv.b(this, anY[39])).booleanValue();
    }

    public boolean bMw() {
        return ((Boolean) this.fso.b(this, anY[32])).booleanValue();
    }

    public boolean bMx() {
        return ((Boolean) this.frW.b(this, anY[14])).booleanValue();
    }

    public boolean bMy() {
        return ((Boolean) this.frV.b(this, anY[13])).booleanValue();
    }

    public boolean bMz() {
        return ((Boolean) this.frY.b(this, anY[16])).booleanValue();
    }

    public void gR(boolean z) {
        this.frO.a(this, anY[6], Boolean.valueOf(z));
    }

    public void gS(boolean z) {
        this.fsl.a(this, anY[29], Boolean.valueOf(z));
    }

    public void gT(boolean z) {
        this.fsm.a(this, anY[30], Boolean.valueOf(z));
    }

    public void gU(boolean z) {
        this.frM.a(this, anY[4], Boolean.valueOf(z));
    }

    public void gV(boolean z) {
        this.frQ.a(this, anY[8], Boolean.valueOf(z));
    }

    public void gW(boolean z) {
        this.frJ.a(this, anY[1], Boolean.valueOf(z));
    }

    public void gX(boolean z) {
        this.fsd.a(this, anY[21], Boolean.valueOf(z));
    }

    public void gY(boolean z) {
        this.fsc.a(this, anY[20], Boolean.valueOf(z));
    }

    public void o(Set<kotlin.reflect.jvm.internal.impl.name.b> set) {
        i.f(set, "<set-?>");
        this.fsr.a(this, anY[35], set);
    }

    public void p(Set<? extends DescriptorRendererModifier> set) {
        i.f(set, "<set-?>");
        this.frL.a(this, anY[3], set);
    }

    public h() {
        Boolean valueOf = Boolean.valueOf(true);
        this.frJ = dP(valueOf);
        this.frK = dP(valueOf);
        this.frL = dP(DescriptorRendererModifier.DEFAULTS);
        Boolean valueOf2 = Boolean.valueOf(false);
        this.frM = dP(valueOf2);
        this.frN = dP(valueOf2);
        this.frO = dP(valueOf2);
        this.frP = dP(valueOf2);
        this.frQ = dP(valueOf2);
        this.frR = dP(valueOf);
        this.frS = dP(valueOf2);
        this.frT = dP(valueOf2);
        this.frU = dP(valueOf2);
        this.frV = dP(valueOf);
        this.frW = dP(valueOf);
        this.frX = dP(valueOf2);
        this.frY = dP(valueOf2);
        this.frZ = dP(valueOf2);
        this.fsa = dP(valueOf2);
        this.fsb = dP(valueOf2);
        this.fsc = dP(valueOf2);
        this.fsd = dP(valueOf2);
        this.fse = dP(DescriptorRendererOptionsImpl$typeNormalizer$2.fsF);
        this.fsf = dP(DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2.fsD);
        this.fsg = dP(valueOf);
        this.fsh = dP(OverrideRenderingPolicy.RENDER_OPEN);
        this.fsi = dP(kotlin.reflect.jvm.internal.impl.renderer.b.b.a.frB);
        this.fsj = dP(RenderingFormat.PLAIN);
        this.fsk = dP(ParameterNameRenderingPolicy.ALL);
        this.fsl = dP(valueOf2);
        this.fsm = dP(valueOf2);
        this.fsn = dP(PropertyAccessorRenderingPolicy.DEBUG);
        this.fso = dP(valueOf2);
        this.fsp = dP(valueOf2);
        this.fsq = dP(al.emptySet());
        this.fsr = dP(i.fsH.bMT());
        this.fss = dP(null);
        this.fst = dP(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS);
        this.fsu = dP(valueOf2);
        this.fsv = dP(valueOf);
        this.fsw = dP(valueOf);
        this.fsx = dP(valueOf2);
        this.fsy = dP(valueOf);
        this.fsz = dP(valueOf);
        this.fsA = dP(valueOf2);
        this.fsB = dP(valueOf2);
        this.fsC = dP(valueOf2);
    }

    public boolean getIncludeAnnotationArguments() {
        return kotlin.reflect.jvm.internal.impl.renderer.g.a.b(this);
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return kotlin.reflect.jvm.internal.impl.renderer.g.a.c(this);
    }

    public final boolean isLocked() {
        return this.cGi;
    }

    public final void lock() {
        int i = this.cGi ^ 1;
        if (m.eVC && i == 0) {
            throw new AssertionError("Assertion failed");
        }
        this.cGi = true;
    }

    public final h bMS() {
        h hVar = new h();
        for (Object obj : getClass().getDeclaredFields()) {
            i.e(obj, "field");
            if ((obj.getModifiers() & 8) == 0) {
                obj.setAccessible(true);
                Object obj2 = obj.get(this);
                if (!(obj2 instanceof kotlin.f.c)) {
                    obj2 = null;
                }
                kotlin.f.c cVar = (kotlin.f.c) obj2;
                if (cVar != null) {
                    String name = obj.getName();
                    String str = "field.name";
                    i.e(name, str);
                    int a = 1 ^ u.a(name, "is", false, 2, null);
                    if (m.eVC && a == 0) {
                        throw new AssertionError("Fields named is* are not supported here yet");
                    }
                    kotlin.reflect.d G = k.G(h.class);
                    String name2 = obj.getName();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("get");
                    String name3 = obj.getName();
                    i.e(name3, str);
                    stringBuilder.append(u.mY(name3));
                    obj.set(hVar, hVar.dP(cVar.b(this, new PropertyReference1Impl(G, name2, stringBuilder.toString()))));
                } else {
                    continue;
                }
            }
        }
        return hVar;
    }

    private final <T> d<h, T> dP(T t) {
        kotlin.f.a aVar = kotlin.f.a.eWg;
        return new a(t, t, this);
    }
}
