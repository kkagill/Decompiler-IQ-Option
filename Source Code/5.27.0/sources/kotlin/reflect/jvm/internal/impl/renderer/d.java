package kotlin.reflect.jvm.internal.impl.renderer;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.l;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.aa;
import kotlin.reflect.jvm.internal.impl.descriptors.ac;
import kotlin.reflect.jvm.internal.impl.descriptors.ad;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.af;
import kotlin.reflect.jvm.internal.impl.descriptors.ag;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.ak;
import kotlin.reflect.jvm.internal.impl.descriptors.an;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.at;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.name.h;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.ax;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.jvm.internal.impl.types.az;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.q;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: DescriptorRendererImpl.kt */
public final class d extends b implements g {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(d.class), "functionTypeAnnotationsRenderer", "getFunctionTypeAnnotationsRenderer()Lorg/jetbrains/kotlin/renderer/DescriptorRendererImpl;")), k.a(new PropertyReference1Impl(k.G(d.class), "functionTypeParameterTypesRenderer", "getFunctionTypeParameterTypesRenderer()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer;"))};
    private final kotlin.d frC;
    private final kotlin.d frD;
    private final h frE;

    /* compiled from: DescriptorRendererImpl.kt */
    private final class a implements m<l, StringBuilder> {
        public void a(ar arVar, StringBuilder stringBuilder) {
            i.f(arVar, "descriptor");
            i.f(stringBuilder, "builder");
            d.this.a(arVar, true, stringBuilder, true);
        }

        public void c(ae aeVar, StringBuilder stringBuilder) {
            i.f(aeVar, "descriptor");
            i.f(stringBuilder, "builder");
            d.this.a(aeVar, stringBuilder);
        }

        public void a(af afVar, StringBuilder stringBuilder) {
            i.f(afVar, "descriptor");
            i.f(stringBuilder, "builder");
            a(afVar, stringBuilder, "getter");
        }

        public void a(ag agVar, StringBuilder stringBuilder) {
            i.f(agVar, "descriptor");
            i.f(stringBuilder, "builder");
            a(agVar, stringBuilder, "setter");
        }

        private final void a(ad adVar, StringBuilder stringBuilder, String str) {
            int i = e.aob[d.this.bMr().ordinal()];
            if (i == 1) {
                d.this.a(adVar, stringBuilder);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str);
                stringBuilder2.append(" for ");
                stringBuilder.append(stringBuilder2.toString());
                d dVar = d.this;
                ae btF = adVar.btF();
                i.e(btF, "descriptor.correspondingProperty");
                dVar.a(btF, stringBuilder);
            } else if (i == 2) {
                d((s) adVar, stringBuilder);
            }
        }

        public void d(s sVar, StringBuilder stringBuilder) {
            i.f(sVar, "descriptor");
            i.f(stringBuilder, "builder");
            d.this.c(sVar, stringBuilder);
        }

        public void a(ah ahVar, StringBuilder stringBuilder) {
            i.f(ahVar, "descriptor");
            i.f(stringBuilder, "builder");
            stringBuilder.append(ahVar.bsZ());
        }

        public void b(kotlin.reflect.jvm.internal.impl.descriptors.j jVar, StringBuilder stringBuilder) {
            i.f(jVar, "constructorDescriptor");
            i.f(stringBuilder, "builder");
            d.this.a(jVar, stringBuilder);
        }

        public void a(ao aoVar, StringBuilder stringBuilder) {
            i.f(aoVar, "descriptor");
            i.f(stringBuilder, "builder");
            d.this.a(aoVar, stringBuilder, true);
        }

        public void b(y yVar, StringBuilder stringBuilder) {
            i.f(yVar, "descriptor");
            i.f(stringBuilder, "builder");
            d.this.a(yVar, stringBuilder);
        }

        public void b(aa aaVar, StringBuilder stringBuilder) {
            i.f(aaVar, "descriptor");
            i.f(stringBuilder, "builder");
            d.this.a(aaVar, stringBuilder);
        }

        public void a(v vVar, StringBuilder stringBuilder) {
            i.f(vVar, "descriptor");
            i.f(stringBuilder, "builder");
            d.this.a((kotlin.reflect.jvm.internal.impl.descriptors.k) vVar, stringBuilder, true);
        }

        public void d(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, StringBuilder stringBuilder) {
            i.f(dVar, "descriptor");
            i.f(stringBuilder, "builder");
            d.this.a(dVar, stringBuilder);
        }

        public void b(an anVar, StringBuilder stringBuilder) {
            i.f(anVar, "descriptor");
            i.f(stringBuilder, "builder");
            d.this.a(anVar, stringBuilder);
        }
    }

    private final d bLQ() {
        kotlin.d dVar = this.frC;
        j jVar = anY[0];
        return (d) dVar.getValue();
    }

    private final b bLR() {
        kotlin.d dVar = this.frD;
        j jVar = anY[1];
        return (b) dVar.getValue();
    }

    public void a(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        i.f(annotationArgumentsRenderingPolicy, "<set-?>");
        this.frE.a(annotationArgumentsRenderingPolicy);
    }

    public void a(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        i.f(parameterNameRenderingPolicy, "<set-?>");
        this.frE.a(parameterNameRenderingPolicy);
    }

    public void a(RenderingFormat renderingFormat) {
        i.f(renderingFormat, "<set-?>");
        this.frE.a(renderingFormat);
    }

    public void a(a aVar) {
        i.f(aVar, "<set-?>");
        this.frE.a(aVar);
    }

    public boolean bLW() {
        return this.frE.bLW();
    }

    public boolean bLX() {
        return this.frE.bLX();
    }

    public AnnotationArgumentsRenderingPolicy bLY() {
        return this.frE.bLY();
    }

    public b<c, Boolean> bLZ() {
        return this.frE.bLZ();
    }

    public boolean bMA() {
        return this.frE.bMA();
    }

    public boolean bMB() {
        return this.frE.bMB();
    }

    public boolean bMC() {
        return this.frE.bMC();
    }

    public boolean bMD() {
        return this.frE.bMD();
    }

    public boolean bME() {
        return this.frE.bME();
    }

    public RenderingFormat bMF() {
        return this.frE.bMF();
    }

    public b<w, w> bMG() {
        return this.frE.bMG();
    }

    public boolean bMH() {
        return this.frE.bMH();
    }

    public boolean bMI() {
        return this.frE.bMI();
    }

    public b.b bMJ() {
        return this.frE.bMJ();
    }

    public boolean bMK() {
        return this.frE.bMK();
    }

    public boolean bML() {
        return this.frE.bML();
    }

    public boolean bMM() {
        return this.frE.bMM();
    }

    public boolean bMN() {
        return this.frE.bMN();
    }

    public boolean bMO() {
        return this.frE.bMO();
    }

    public boolean bMP() {
        return this.frE.bMP();
    }

    public boolean bMa() {
        return this.frE.bMa();
    }

    public boolean bMb() {
        return this.frE.bMb();
    }

    public a bMc() {
        return this.frE.bMc();
    }

    public boolean bMd() {
        return this.frE.bMd();
    }

    public b<ar, String> bMe() {
        return this.frE.bMe();
    }

    public boolean bMf() {
        return this.frE.bMf();
    }

    public boolean bMg() {
        return this.frE.bMg();
    }

    public Set<kotlin.reflect.jvm.internal.impl.name.b> bMh() {
        return this.frE.bMh();
    }

    public Set<kotlin.reflect.jvm.internal.impl.name.b> bMi() {
        return this.frE.bMi();
    }

    public boolean bMj() {
        return this.frE.bMj();
    }

    public boolean bMk() {
        return this.frE.bMk();
    }

    public Set<DescriptorRendererModifier> bMl() {
        return this.frE.bMl();
    }

    public boolean bMm() {
        return this.frE.bMm();
    }

    public OverrideRenderingPolicy bMn() {
        return this.frE.bMn();
    }

    public ParameterNameRenderingPolicy bMo() {
        return this.frE.bMo();
    }

    public boolean bMp() {
        return this.frE.bMp();
    }

    public boolean bMq() {
        return this.frE.bMq();
    }

    public PropertyAccessorRenderingPolicy bMr() {
        return this.frE.bMr();
    }

    public boolean bMs() {
        return this.frE.bMs();
    }

    public boolean bMt() {
        return this.frE.bMt();
    }

    public boolean bMu() {
        return this.frE.bMu();
    }

    public boolean bMv() {
        return this.frE.bMv();
    }

    public boolean bMw() {
        return this.frE.bMw();
    }

    public boolean bMx() {
        return this.frE.bMx();
    }

    public boolean bMy() {
        return this.frE.bMy();
    }

    public boolean bMz() {
        return this.frE.bMz();
    }

    public void gR(boolean z) {
        this.frE.gR(z);
    }

    public void gS(boolean z) {
        this.frE.gS(z);
    }

    public void gT(boolean z) {
        this.frE.gT(z);
    }

    public void gU(boolean z) {
        this.frE.gU(z);
    }

    public void gV(boolean z) {
        this.frE.gV(z);
    }

    public void gW(boolean z) {
        this.frE.gW(z);
    }

    public void gX(boolean z) {
        this.frE.gX(z);
    }

    public void gY(boolean z) {
        this.frE.gY(z);
    }

    public boolean getIncludeAnnotationArguments() {
        return this.frE.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.frE.getIncludeEmptyAnnotationArguments();
    }

    public void o(Set<kotlin.reflect.jvm.internal.impl.name.b> set) {
        i.f(set, "<set-?>");
        this.frE.o(set);
    }

    public void p(Set<? extends DescriptorRendererModifier> set) {
        i.f(set, "<set-?>");
        this.frE.p(set);
    }

    public final h bLV() {
        return this.frE;
    }

    public d(h hVar) {
        i.f(hVar, "options");
        this.frE = hVar;
        boolean isLocked = this.frE.isLocked();
        if (!kotlin.m.eVC || isLocked) {
            this.frC = g.c(new DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(this));
            this.frD = g.c(new DescriptorRendererImpl$functionTypeParameterTypesRenderer$2(this));
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    private final String mB(String str) {
        int i = f.aob[bMF().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            if (!bMa()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("<b>");
                stringBuilder.append(str);
                stringBuilder.append("</b>");
                str = stringBuilder.toString();
            }
            return str;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String mC(String str) {
        int i = f.axg[bMF().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<font color=red><b>");
            stringBuilder.append(str);
            stringBuilder.append("</b></font>");
            return stringBuilder.toString();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String escape(String str) {
        return bMF().escape(str);
    }

    private final String bLS() {
        return escape("<");
    }

    private final String bLT() {
        return escape(">");
    }

    private final String bLU() {
        int i = f.aFX[bMF().ordinal()];
        if (i == 1) {
            return escape("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        throw new NoWhenBranchMatchedException();
    }

    public String mD(String str) {
        i.f(str, "message");
        int i = f.aFY[bMF().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<i>");
            stringBuilder.append(str);
            stringBuilder.append("</i>");
            return stringBuilder.toString();
        }
        throw new NoWhenBranchMatchedException();
    }

    public String b(f fVar, boolean z) {
        i.f(fVar, ConditionalUserProperty.NAME);
        String escape = escape(k.K(fVar));
        if (!bMa() || bMF() != RenderingFormat.HTML || !z) {
            return escape;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<b>");
        stringBuilder.append(escape);
        stringBuilder.append("</b>");
        return stringBuilder.toString();
    }

    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, StringBuilder stringBuilder, boolean z) {
        f bsZ = kVar.bsZ();
        i.e(bsZ, "descriptor.name");
        stringBuilder.append(b(bsZ, z));
    }

    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, StringBuilder stringBuilder) {
        if (bMt()) {
            if (bME()) {
                stringBuilder.append("companion object");
            }
            r(stringBuilder);
            kotlin.reflect.jvm.internal.impl.descriptors.k brj = kVar.brj();
            if (brj != null) {
                stringBuilder.append("of ");
                f bsZ = brj.bsZ();
                i.e(bsZ, "containingDeclaration.name");
                stringBuilder.append(b(bsZ, false));
            }
        }
        if (bMK() || (i.y(kVar.bsZ(), h.fpA) ^ 1) != 0) {
            if (!bME()) {
                r(stringBuilder);
            }
            f bsZ2 = kVar.bsZ();
            i.e(bsZ2, "descriptor.name");
            stringBuilder.append(b(bsZ2, true));
        }
    }

    public String f(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        i.f(cVar, "fqName");
        List pathSegments = cVar.pathSegments();
        i.e(pathSegments, "fqName.pathSegments()");
        return cj(pathSegments);
    }

    private final String cj(List<f> list) {
        return escape(k.cj(list));
    }

    public String b(kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
        i.f(fVar, "klass");
        if (p.Y(fVar)) {
            return fVar.brm().toString();
        }
        return bMc().a(fVar, this);
    }

    public String b(w wVar) {
        i.f(wVar, "type");
        StringBuilder stringBuilder = new StringBuilder();
        b(stringBuilder, (w) bMG().invoke(wVar));
        String stringBuilder2 = stringBuilder.toString();
        i.e(stringBuilder2, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder2;
    }

    private final void b(StringBuilder stringBuilder, w wVar) {
        ay bPA = wVar.bPA();
        if (!(bPA instanceof kotlin.reflect.jvm.internal.impl.types.a)) {
            bPA = null;
        }
        kotlin.reflect.jvm.internal.impl.types.a aVar = (kotlin.reflect.jvm.internal.impl.types.a) bPA;
        if (aVar != null) {
            if (bMA()) {
                c(stringBuilder, (w) aVar.btO());
            } else {
                c(stringBuilder, (w) aVar.bPg());
                if (bMB()) {
                    a(stringBuilder, aVar);
                }
            }
            return;
        }
        c(stringBuilder, wVar);
    }

    private final void a(StringBuilder stringBuilder, kotlin.reflect.jvm.internal.impl.types.a aVar) {
        if (bMF() == RenderingFormat.HTML) {
            stringBuilder.append("<font color=\"808080\"><i>");
        }
        stringBuilder.append(" /* = ");
        c(stringBuilder, (w) aVar.btO());
        stringBuilder.append(" */");
        if (bMF() == RenderingFormat.HTML) {
            stringBuilder.append("</i></font>");
        }
    }

    private final void c(StringBuilder stringBuilder, w wVar) {
        if ((wVar instanceof az) && bMd() && !((az) wVar).bPc()) {
            stringBuilder.append("<Not computed yet>");
            return;
        }
        ay bPA = wVar.bPA();
        if (bPA instanceof q) {
            stringBuilder.append(((q) bPA).a(this, this));
        } else if (bPA instanceof kotlin.reflect.jvm.internal.impl.types.ad) {
            a(stringBuilder, (kotlin.reflect.jvm.internal.impl.types.ad) bPA);
        }
    }

    private final void a(StringBuilder stringBuilder, kotlin.reflect.jvm.internal.impl.types.ad adVar) {
        String str = "???";
        if (!i.y(adVar, au.fxE)) {
            w wVar = adVar;
            if (!au.aX(wVar)) {
                if (p.aD(wVar)) {
                    if (bMH()) {
                        kotlin.reflect.jvm.internal.impl.types.an bMZ = adVar.bMZ();
                        if (bMZ != null) {
                            ao bPq = ((kotlin.reflect.jvm.internal.impl.types.p.d) bMZ).bPq();
                            i.e(bPq, "(type.constructor as Uni…).typeParameterDescriptor");
                            String fVar = bPq.bsZ().toString();
                            i.e(fVar, "(type.constructor as Uni…escriptor.name.toString()");
                            stringBuilder.append(mC(fVar));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.ErrorUtils.UninferredParameterTypeConstructor");
                        }
                    }
                    stringBuilder.append(str);
                    return;
                } else if (kotlin.reflect.jvm.internal.impl.types.y.aJ(wVar)) {
                    d(stringBuilder, wVar);
                    return;
                } else {
                    if (ai(wVar)) {
                        e(stringBuilder, wVar);
                    } else {
                        d(stringBuilder, wVar);
                    }
                    return;
                }
            }
        }
        stringBuilder.append(str);
    }

    private final boolean ai(w wVar) {
        if (!kotlin.reflect.jvm.internal.impl.builtins.f.f(wVar)) {
            return false;
        }
        Object obj;
        Iterable<ap> btD = wVar.btD();
        if (!((btD instanceof Collection) && ((Collection) btD).isEmpty())) {
            for (ap bPC : btD) {
                if (bPC.bPC()) {
                    obj = null;
                    break;
                }
            }
        }
        obj = 1;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public String a(String str, String str2, g gVar) {
        String str3 = str;
        String str4 = str2;
        i.f(str3, "lowerRendered");
        i.f(str4, "upperRendered");
        i.f(gVar, "builtIns");
        StringBuilder stringBuilder;
        if (!bk(str, str2)) {
            a bMc = bMc();
            kotlin.reflect.jvm.internal.impl.descriptors.d bqJ = gVar.bqJ();
            i.e(bqJ, "builtIns.collection");
            b bVar = this;
            String a = v.a(bMc.a(bqJ, bVar), "Collection", null, 2, null);
            String str5 = "Mutable";
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(a);
            stringBuilder2.append(str5);
            String stringBuilder3 = stringBuilder2.toString();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(a);
            stringBuilder2.append('(');
            stringBuilder2.append(str5);
            stringBuilder2.append(')');
            str5 = b(str, stringBuilder3, str2, a, stringBuilder2.toString());
            if (str5 != null) {
                return str5;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("MutableMap.MutableEntry");
            stringBuilder3 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("Map.Entry");
            String stringBuilder4 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("(Mutable)Map.(Mutable)Entry");
            str5 = b(str, stringBuilder3, str2, stringBuilder4, stringBuilder.toString());
            if (str5 != null) {
                return str5;
            }
            bMc = bMc();
            bqJ = gVar.bqE();
            i.e(bqJ, "builtIns.array");
            str5 = v.a(bMc.a(bqJ, bVar), "Array", null, 2, null);
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str5);
            stringBuilder2.append(escape("Array<"));
            stringBuilder3 = stringBuilder2.toString();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str5);
            stringBuilder2.append(escape("Array<out "));
            stringBuilder4 = stringBuilder2.toString();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str5);
            stringBuilder2.append(escape("Array<(out) "));
            str5 = b(str, stringBuilder3, str2, stringBuilder4, stringBuilder2.toString());
            if (str5 != null) {
                return str5;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append('(');
            stringBuilder.append(str3);
            stringBuilder.append("..");
            stringBuilder.append(str4);
            stringBuilder.append(')');
            return stringBuilder.toString();
        } else if (u.a(str4, "(", false, 2, null)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append('(');
            stringBuilder.append(str3);
            stringBuilder.append(")!");
            return stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str3);
            stringBuilder.append("!");
            return stringBuilder.toString();
        }
    }

    public String ck(List<? extends ap> list) {
        i.f(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bLS());
        a(stringBuilder, (List) list);
        stringBuilder.append(bLT());
        String stringBuilder2 = stringBuilder.toString();
        i.e(stringBuilder2, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder2;
    }

    private final void d(StringBuilder stringBuilder, w wVar) {
        a(this, stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) wVar, null, 2, null);
        if (kotlin.reflect.jvm.internal.impl.types.y.aJ(wVar)) {
            if ((wVar instanceof ax) && bMq()) {
                stringBuilder.append(((ax) wVar).bPH());
            } else {
                stringBuilder.append(wVar.bMZ().toString());
            }
            stringBuilder.append(ck(wVar.btD()));
        } else {
            a(this, stringBuilder, wVar, null, 2, null);
        }
        if (wVar.boc()) {
            stringBuilder.append("?");
        }
        if (kotlin.reflect.jvm.internal.impl.types.ag.aM(wVar)) {
            stringBuilder.append("!!");
        }
    }

    private final void a(StringBuilder stringBuilder, w wVar, kotlin.reflect.jvm.internal.impl.types.an anVar) {
        ac O = kotlin.reflect.jvm.internal.impl.descriptors.ap.O(wVar);
        if (O == null) {
            stringBuilder.append(a(anVar));
            stringBuilder.append(ck(wVar.btD()));
            return;
        }
        a(stringBuilder, O);
    }

    /* JADX WARNING: Missing block: B:3:0x0023, code skipped:
            if (r3 != null) goto L_0x003a;
     */
    private final void a(java.lang.StringBuilder r3, kotlin.reflect.jvm.internal.impl.descriptors.ac r4) {
        /*
        r2 = this;
        r0 = r4.btE();
        if (r0 == 0) goto L_0x0026;
    L_0x0006:
        r2.a(r3, r0);
        r0 = 46;
        r3.append(r0);
        r0 = r4.btC();
        r0 = r0.bsZ();
        r1 = "possiblyInnerType.classifierDescriptor.name";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = 0;
        r0 = r2.b(r0, r1);
        r3.append(r0);
        if (r3 == 0) goto L_0x0026;
    L_0x0025:
        goto L_0x003a;
    L_0x0026:
        r0 = r4.btC();
        r0 = r0.brm();
        r1 = "possiblyInnerType.classi…escriptor.typeConstructor";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r2.a(r0);
        r3.append(r0);
    L_0x003a:
        r4 = r4.btD();
        r4 = r2.ck(r4);
        r3.append(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.d.a(java.lang.StringBuilder, kotlin.reflect.jvm.internal.impl.descriptors.ac):void");
    }

    public String a(kotlin.reflect.jvm.internal.impl.types.an anVar) {
        i.f(anVar, "typeConstructor");
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = anVar.brQ();
        if ((brQ instanceof ao) || (brQ instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) || (brQ instanceof an)) {
            return b(brQ);
        }
        if (brQ == null) {
            return anVar.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected classifier: ");
        stringBuilder.append(brQ.getClass());
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public String a(ap apVar) {
        i.f(apVar, "typeProjection");
        StringBuilder stringBuilder = new StringBuilder();
        a(stringBuilder, l.listOf(apVar));
        String stringBuilder2 = stringBuilder.toString();
        i.e(stringBuilder2, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder2;
    }

    private final void a(StringBuilder stringBuilder, List<? extends ap> list) {
        u.a(list, stringBuilder, ", ", null, null, 0, null, new DescriptorRendererImpl$appendTypeProjections$1(this), 60, null);
    }

    private final void e(StringBuilder stringBuilder, w wVar) {
        int length = stringBuilder.length();
        a(bLQ(), stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) wVar, null, 2, null);
        int i = 1;
        Object obj = stringBuilder.length() != length ? 1 : null;
        boolean e = kotlin.reflect.jvm.internal.impl.builtins.f.e(wVar);
        boolean boc = wVar.boc();
        w i2 = kotlin.reflect.jvm.internal.impl.builtins.f.i(wVar);
        Object obj2 = (boc || !(obj == null || i2 == null)) ? 1 : null;
        String str = "(";
        if (obj2 != null) {
            if (e) {
                stringBuilder.insert(length, '(');
            } else {
                if (obj != null) {
                    CharSequence charSequence = stringBuilder;
                    obj = x.af(charSequence) == ' ' ? 1 : null;
                    if (kotlin.m.eVC && obj == null) {
                        throw new AssertionError("Assertion failed");
                    } else if (stringBuilder.charAt(v.aa(charSequence) - 1) != ')') {
                        stringBuilder.insert(v.aa(charSequence), "()");
                    }
                }
                stringBuilder.append(str);
            }
        }
        a(stringBuilder, e, "suspend");
        String str2 = ")";
        if (i2 != null) {
            if ((!ai(i2) || i2.boc()) && !aj(i2)) {
                i = 0;
            }
            if (i != 0) {
                stringBuilder.append(str);
            }
            b(stringBuilder, i2);
            if (i != 0) {
                stringBuilder.append(str2);
            }
            stringBuilder.append(".");
        }
        stringBuilder.append(str);
        i = 0;
        for (ap apVar : kotlin.reflect.jvm.internal.impl.builtins.f.k(wVar)) {
            f l;
            if (i > 0) {
                stringBuilder.append(", ");
            }
            if (bMp()) {
                i2 = apVar.bpT();
                i.e(i2, "typeProjection.type");
                l = kotlin.reflect.jvm.internal.impl.builtins.f.l(i2);
            } else {
                l = null;
            }
            if (l != null) {
                stringBuilder.append(b(l, false));
                stringBuilder.append(": ");
            }
            stringBuilder.append(bLR().a(apVar));
            i++;
        }
        stringBuilder.append(") ");
        stringBuilder.append(bLU());
        stringBuilder.append(" ");
        b(stringBuilder, kotlin.reflect.jvm.internal.impl.builtins.f.j(wVar));
        if (obj2 != null) {
            stringBuilder.append(str2);
        }
        if (boc) {
            stringBuilder.append("?");
        }
    }

    private final boolean aj(w wVar) {
        return kotlin.reflect.jvm.internal.impl.builtins.f.e(wVar) || !wVar.brE().isEmpty();
    }

    private final void a(StringBuilder stringBuilder, kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (!((kVar instanceof y) || (kVar instanceof aa))) {
            if (kVar instanceof v) {
                stringBuilder.append(" is a module");
                return;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.k brj = kVar.brj();
            if (!(brj == null || (brj instanceof v))) {
                String str = " ";
                stringBuilder.append(str);
                stringBuilder.append(mD("defined in"));
                stringBuilder.append(str);
                kotlin.reflect.jvm.internal.impl.name.c w = kotlin.reflect.jvm.internal.impl.resolve.c.w(brj);
                i.e(w, "DescriptorUtils.getFqName(containingDeclaration)");
                stringBuilder.append(w.isRoot() ? "root package" : f(w));
                if (bMM() && (brj instanceof y) && (kVar instanceof n)) {
                    aj brF = ((n) kVar).brF();
                    i.e(brF, "descriptor.source");
                    ak bqg = brF.bqg();
                    i.e(bqg, "descriptor.source.containingFile");
                    String name = bqg.getName();
                    if (name != null) {
                        stringBuilder.append(str);
                        stringBuilder.append(mD("in file"));
                        stringBuilder.append(str);
                        stringBuilder.append(name);
                    }
                }
            }
        }
    }

    private final void a(StringBuilder stringBuilder, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (bMl().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set bMi = aVar instanceof w ? bMi() : bMh();
            b bLZ = bLZ();
            for (c cVar : aVar.brE()) {
                if (!u.b((Iterable) bMi, (Object) cVar.btB()) && (bLZ == null || ((Boolean) bLZ.invoke(cVar)).booleanValue())) {
                    stringBuilder.append(a(cVar, annotationUseSiteTarget));
                    if (bMf()) {
                        q.s(stringBuilder);
                    } else {
                        stringBuilder.append(" ");
                    }
                }
            }
        }
    }

    public String a(c cVar, AnnotationUseSiteTarget annotationUseSiteTarget) {
        i.f(cVar, "annotation");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('@');
        if (annotationUseSiteTarget != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(annotationUseSiteTarget.getRenderName());
            stringBuilder2.append(":");
            stringBuilder.append(stringBuilder2.toString());
        }
        w bpT = cVar.bpT();
        stringBuilder.append(b(bpT));
        if (getIncludeAnnotationArguments()) {
            List l = l(cVar);
            if (getIncludeEmptyAnnotationArguments() || (l.isEmpty() ^ 1) != 0) {
                u.a(l, stringBuilder, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (bMK() && (kotlin.reflect.jvm.internal.impl.types.y.aJ(bpT) || (bpT.bMZ().brQ() instanceof x.b))) {
            stringBuilder.append(" /* annotation class not found */");
        }
        String stringBuilder3 = stringBuilder.toString();
        i.e(stringBuilder3, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder3;
    }

    private final List<String> l(c cVar) {
        List bsP;
        Collection arrayList;
        StringBuilder stringBuilder;
        f fVar;
        Map buf = cVar.buf();
        List list = null;
        kotlin.reflect.jvm.internal.impl.descriptors.d m = bMw() ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.m(cVar) : null;
        if (m != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.c brw = m.brw();
            if (brw != null) {
                bsP = brw.bsP();
                if (bsP != null) {
                    Collection arrayList2 = new ArrayList();
                    for (Object next : bsP) {
                        if (((ar) next).btR()) {
                            arrayList2.add(next);
                        }
                    }
                    Iterable<ar> iterable = (List) arrayList2;
                    arrayList = new ArrayList(n.e(iterable, 10));
                    for (ar arVar : iterable) {
                        i.e(arVar, "it");
                        arrayList.add(arVar.bsZ());
                    }
                    list = (List) arrayList;
                }
            }
        }
        if (list == null) {
            list = m.emptyList();
        }
        Collection arrayList3 = new ArrayList();
        for (Object next2 : list) {
            if ((buf.containsKey((f) next2) ^ 1) != 0) {
                arrayList3.add(next2);
            }
        }
        Iterable<f> iterable2 = (List) arrayList3;
        arrayList = new ArrayList(n.e(iterable2, 10));
        for (f fVar2 : iterable2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(fVar2.boi());
            stringBuilder.append(" = ...");
            arrayList.add(stringBuilder.toString());
        }
        bsP = (List) arrayList;
        Iterable<Entry> entrySet = buf.entrySet();
        arrayList3 = new ArrayList(n.e(entrySet, 10));
        for (Entry entry : entrySet) {
            fVar2 = (f) entry.getKey();
            kotlin.reflect.jvm.internal.impl.resolve.constants.g gVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) entry.getValue();
            stringBuilder = new StringBuilder();
            stringBuilder.append(fVar2.boi());
            stringBuilder.append(" = ");
            stringBuilder.append(!list.contains(fVar2) ? c(gVar) : "...");
            arrayList3.add(stringBuilder.toString());
        }
        return u.R(u.b((Collection) bsP, (Iterable) (List) arrayList3));
    }

    private final String c(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar) {
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b) {
            return u.a((Iterable) ((kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar).getValue(), ", ", "{", "}", 0, null, new DescriptorRendererImpl$renderConstant$1(this), 24, null);
        }
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a) {
            return v.a(b.a(this, (c) ((kotlin.reflect.jvm.internal.impl.resolve.constants.a) gVar).getValue(), null, 2, null), (CharSequence) "@");
        }
        if (!(gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.p)) {
            return gVar.toString();
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.p.b bVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.p.b) ((kotlin.reflect.jvm.internal.impl.resolve.constants.p) gVar).getValue();
        String str = "::class";
        if (bVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.a) bVar).bpT());
            stringBuilder.append(str);
            return stringBuilder.toString();
        } else if (bVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.b) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.b bVar2 = (kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.b) bVar;
            String boi = bVar2.getClassId().bJZ().boi();
            i.e(boi, "classValue.classId.asSingleFqName().asString()");
            int bNh = bVar2.bNh();
            for (int i = 0; i < bNh; i++) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("kotlin.Array<");
                stringBuilder2.append(boi);
                stringBuilder2.append('>');
                boi = stringBuilder2.toString();
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(boi);
            stringBuilder3.append(str);
            return stringBuilder3.toString();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final boolean a(aw awVar, StringBuilder stringBuilder) {
        if (!bMl().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        Object awVar2;
        if (bMm()) {
            awVar2 = awVar2.bud();
        }
        if (!bMy() && i.y(awVar2, av.fdl)) {
            return false;
        }
        stringBuilder.append(mB(awVar2.getDisplayName()));
        stringBuilder.append(" ");
        return true;
    }

    private final void a(Modality modality, StringBuilder stringBuilder, Modality modality2) {
        if (bMx() || modality != modality2) {
            boolean contains = bMl().contains(DescriptorRendererModifier.MODALITY);
            String name = modality.name();
            if (name != null) {
                name = name.toLowerCase();
                i.e(name, "(this as java.lang.String).toLowerCase()");
                a(stringBuilder, contains, name);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    private final Modality a(t tVar) {
        if (tVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.d) tVar).brt() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.k brj = tVar.brj();
        if (!(brj instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
            brj = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) brj;
        if (dVar == null) {
            return Modality.FINAL;
        }
        if (!(tVar instanceof CallableMemberDescriptor)) {
            return Modality.FINAL;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) tVar;
        Collection bsR = callableMemberDescriptor.bsR();
        i.e(bsR, "this.overriddenDescriptors");
        if ((bsR.isEmpty() ^ 1) != 0 && dVar.bru() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (dVar.brt() != ClassKind.INTERFACE || (i.y(callableMemberDescriptor.brx(), av.fda) ^ 1) == 0) {
            return Modality.FINAL;
        }
        return callableMemberDescriptor.bru() == Modality.ABSTRACT ? Modality.ABSTRACT : Modality.OPEN;
    }

    private final void a(CallableMemberDescriptor callableMemberDescriptor, StringBuilder stringBuilder) {
        if ((!kotlin.reflect.jvm.internal.impl.resolve.c.A(callableMemberDescriptor) || callableMemberDescriptor.bru() != Modality.FINAL) && (bMn() != OverrideRenderingPolicy.RENDER_OVERRIDE || callableMemberDescriptor.bru() != Modality.OPEN || !y(callableMemberDescriptor))) {
            Modality bru = callableMemberDescriptor.bru();
            i.e(bru, "callable.modality");
            a(bru, stringBuilder, a((t) callableMemberDescriptor));
        }
    }

    private final void b(CallableMemberDescriptor callableMemberDescriptor, StringBuilder stringBuilder) {
        if (bMl().contains(DescriptorRendererModifier.OVERRIDE) && y(callableMemberDescriptor) && bMn() != OverrideRenderingPolicy.RENDER_OPEN) {
            a(stringBuilder, true, "override");
            if (bMK()) {
                stringBuilder.append("/*");
                stringBuilder.append(callableMemberDescriptor.bsR().size());
                stringBuilder.append("*/ ");
            }
        }
    }

    private final void c(CallableMemberDescriptor callableMemberDescriptor, StringBuilder stringBuilder) {
        if (bMl().contains(DescriptorRendererModifier.MEMBER_KIND) && bMK() && callableMemberDescriptor.bsT() != Kind.DECLARATION) {
            stringBuilder.append("/*");
            String name = callableMemberDescriptor.bsT().name();
            if (name != null) {
                name = name.toLowerCase();
                i.e(name, "(this as java.lang.String).toLowerCase()");
                stringBuilder.append(name);
                stringBuilder.append("*/ ");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }

    private final void a(StringBuilder stringBuilder, boolean z, String str) {
        if (z) {
            stringBuilder.append(mB(str));
            stringBuilder.append(" ");
        }
    }

    private final void a(t tVar, StringBuilder stringBuilder) {
        a(stringBuilder, tVar.brD(), "external");
        boolean z = true;
        boolean z2 = bMl().contains(DescriptorRendererModifier.EXPECT) && tVar.brB();
        a(stringBuilder, z2, "expect");
        if (!(bMl().contains(DescriptorRendererModifier.ACTUAL) && tVar.brC())) {
            z = false;
        }
        a(stringBuilder, z, "actual");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.s r7, java.lang.StringBuilder r8) {
        /*
        r6 = this;
        r0 = r7.btl();
        r1 = "it";
        r2 = "functionDescriptor.overriddenDescriptors";
        r3 = 0;
        r4 = 1;
        if (r0 == 0) goto L_0x0048;
    L_0x000c:
        r0 = r7.bsR();
        kotlin.jvm.internal.i.e(r0, r2);
        r0 = (java.lang.Iterable) r0;
        r5 = r0 instanceof java.util.Collection;
        if (r5 == 0) goto L_0x0024;
    L_0x0019:
        r5 = r0;
        r5 = (java.util.Collection) r5;
        r5 = r5.isEmpty();
        if (r5 == 0) goto L_0x0024;
    L_0x0022:
        r0 = 1;
        goto L_0x003e;
    L_0x0024:
        r0 = r0.iterator();
    L_0x0028:
        r5 = r0.hasNext();
        if (r5 == 0) goto L_0x0022;
    L_0x002e:
        r5 = r0.next();
        r5 = (kotlin.reflect.jvm.internal.impl.descriptors.s) r5;
        kotlin.jvm.internal.i.e(r5, r1);
        r5 = r5.btl();
        if (r5 == 0) goto L_0x0028;
    L_0x003d:
        r0 = 0;
    L_0x003e:
        if (r0 != 0) goto L_0x0046;
    L_0x0040:
        r0 = r6.bLX();
        if (r0 == 0) goto L_0x0048;
    L_0x0046:
        r0 = 1;
        goto L_0x0049;
    L_0x0048:
        r0 = 0;
    L_0x0049:
        r5 = r7.btm();
        if (r5 == 0) goto L_0x008a;
    L_0x004f:
        r5 = r7.bsR();
        kotlin.jvm.internal.i.e(r5, r2);
        r5 = (java.lang.Iterable) r5;
        r2 = r5 instanceof java.util.Collection;
        if (r2 == 0) goto L_0x0067;
    L_0x005c:
        r2 = r5;
        r2 = (java.util.Collection) r2;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x0067;
    L_0x0065:
        r1 = 1;
        goto L_0x0081;
    L_0x0067:
        r2 = r5.iterator();
    L_0x006b:
        r5 = r2.hasNext();
        if (r5 == 0) goto L_0x0065;
    L_0x0071:
        r5 = r2.next();
        r5 = (kotlin.reflect.jvm.internal.impl.descriptors.s) r5;
        kotlin.jvm.internal.i.e(r5, r1);
        r5 = r5.btm();
        if (r5 == 0) goto L_0x006b;
    L_0x0080:
        r1 = 0;
    L_0x0081:
        if (r1 != 0) goto L_0x0089;
    L_0x0083:
        r1 = r6.bLX();
        if (r1 == 0) goto L_0x008a;
    L_0x0089:
        r3 = 1;
    L_0x008a:
        r1 = r7.brV();
        r2 = "tailrec";
        r6.a(r8, r1, r2);
        r6.b(r7, r8);
        r7 = r7.brA();
        r1 = "inline";
        r6.a(r8, r7, r1);
        r7 = "infix";
        r6.a(r8, r3, r7);
        r7 = "operator";
        r6.a(r8, r0, r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.d.a(kotlin.reflect.jvm.internal.impl.descriptors.s, java.lang.StringBuilder):void");
    }

    private final void b(s sVar, StringBuilder stringBuilder) {
        a(stringBuilder, sVar.bto(), "suspend");
    }

    public String s(kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        i.f(kVar, "declarationDescriptor");
        StringBuilder stringBuilder = new StringBuilder();
        kVar.a(new a(), stringBuilder);
        if (bML()) {
            a(stringBuilder, kVar);
        }
        String stringBuilder2 = stringBuilder.toString();
        i.e(stringBuilder2, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder2;
    }

    private final void a(ao aoVar, StringBuilder stringBuilder, boolean z) {
        if (z) {
            stringBuilder.append(bLS());
        }
        if (bMK()) {
            stringBuilder.append("/*");
            stringBuilder.append(aoVar.getIndex());
            stringBuilder.append("*/ ");
        }
        a(stringBuilder, aoVar.btb(), "reified");
        String label = aoVar.bta().getLabel();
        Object obj = 1;
        a(stringBuilder, ((CharSequence) label).length() > 0, label);
        a(this, stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) aoVar, null, 2, null);
        a((kotlin.reflect.jvm.internal.impl.descriptors.k) aoVar, stringBuilder, z);
        int size = aoVar.bod().size();
        String str = "upperBound";
        String str2 = " : ";
        if ((size > 1 && !z) || size == 1) {
            w wVar = (w) aoVar.bod().iterator().next();
            if (!g.G(wVar)) {
                stringBuilder.append(str2);
                i.e(wVar, str);
                stringBuilder.append(b(wVar));
            }
        } else if (z) {
            for (w wVar2 : aoVar.bod()) {
                if (!g.G(wVar2)) {
                    if (obj != null) {
                        stringBuilder.append(str2);
                    } else {
                        stringBuilder.append(" & ");
                    }
                    i.e(wVar2, str);
                    stringBuilder.append(b(wVar2));
                    obj = null;
                }
            }
        }
        if (z) {
            stringBuilder.append(bLT());
        }
    }

    private final void a(List<? extends ao> list, StringBuilder stringBuilder, boolean z) {
        if (!(bMP() || list.isEmpty())) {
            stringBuilder.append(bLS());
            b(stringBuilder, (List) list);
            stringBuilder.append(bLT());
            if (z) {
                stringBuilder.append(" ");
            }
        }
    }

    private final void b(StringBuilder stringBuilder, List<? extends ao> list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((ao) it.next(), stringBuilder, false);
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
    }

    private final void c(s sVar, StringBuilder stringBuilder) {
        List bsM;
        String str = "function.typeParameters";
        if (!bME()) {
            if (!bMD()) {
                a(this, stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) sVar, null, 2, null);
                aw brx = sVar.brx();
                i.e(brx, "function.visibility");
                a(brx, stringBuilder);
                CallableMemberDescriptor callableMemberDescriptor = sVar;
                a(callableMemberDescriptor, stringBuilder);
                if (bMj()) {
                    a((t) sVar, stringBuilder);
                }
                b(callableMemberDescriptor, stringBuilder);
                if (bMj()) {
                    a(sVar, stringBuilder);
                } else {
                    b(sVar, stringBuilder);
                }
                c(callableMemberDescriptor, stringBuilder);
                if (bMK()) {
                    if (sVar.btk()) {
                        stringBuilder.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (sVar.btn()) {
                        stringBuilder.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            stringBuilder.append(mB("fun"));
            stringBuilder.append(" ");
            bsM = sVar.bsM();
            i.e(bsM, str);
            a(bsM, stringBuilder, true);
            b((kotlin.reflect.jvm.internal.impl.descriptors.a) sVar, stringBuilder);
        }
        a((kotlin.reflect.jvm.internal.impl.descriptors.k) sVar, stringBuilder, true);
        bsM = sVar.bsP();
        i.e(bsM, "function.valueParameters");
        a((Collection) bsM, sVar.bsQ(), stringBuilder);
        a((kotlin.reflect.jvm.internal.impl.descriptors.a) sVar, stringBuilder);
        w bsN = sVar.bsN();
        if (!bMN() && (bMI() || bsN == null || !g.H(bsN))) {
            stringBuilder.append(": ");
            stringBuilder.append(bsN == null ? "[NULL]" : b(bsN));
        }
        List bsM2 = sVar.bsM();
        i.e(bsM2, str);
        a(bsM2, stringBuilder);
    }

    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, StringBuilder stringBuilder) {
        if (bMs()) {
            ah bsK = aVar.bsK();
            if (bsK != null) {
                stringBuilder.append(" on ");
                w bpT = bsK.bpT();
                i.e(bpT, "receiver.type");
                stringBuilder.append(b(bpT));
            }
        }
    }

    private final void b(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, StringBuilder stringBuilder) {
        ah bsK = aVar.bsK();
        if (bsK != null) {
            a(stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) bsK, AnnotationUseSiteTarget.RECEIVER);
            w bpT = bsK.bpT();
            i.e(bpT, "receiver.type");
            String b = b(bpT);
            if (ai(bpT) && !au.bb(bpT)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append('(');
                stringBuilder2.append(b);
                stringBuilder2.append(')');
                b = stringBuilder2.toString();
            }
            stringBuilder.append(b);
            stringBuilder.append(".");
        }
    }

    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.j jVar, StringBuilder stringBuilder) {
        List bsM;
        StringBuilder stringBuilder2 = stringBuilder;
        a(this, stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) jVar, null, 2, null);
        aw brx = jVar.brx();
        i.e(brx, "constructor.visibility");
        boolean a = a(brx, stringBuilder2);
        c((CallableMemberDescriptor) jVar, stringBuilder2);
        Object obj = (bMv() || !jVar.isPrimary() || a) ? 1 : null;
        if (obj != null) {
            stringBuilder2.append(mB("constructor"));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.g btg = jVar.btg();
        i.e(btg, "constructor.containingDeclaration");
        String str = "constructor.typeParameters";
        if (bMC()) {
            if (obj != null) {
                stringBuilder2.append(" ");
            }
            a((kotlin.reflect.jvm.internal.impl.descriptors.k) btg, stringBuilder2, true);
            bsM = jVar.bsM();
            i.e(bsM, str);
            a(bsM, stringBuilder2, false);
        }
        bsM = jVar.bsP();
        i.e(bsM, "constructor.valueParameters");
        a((Collection) bsM, jVar.bsQ(), stringBuilder2);
        if (bMu() && !jVar.isPrimary() && (btg instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
            kotlin.reflect.jvm.internal.impl.descriptors.c brw = ((kotlin.reflect.jvm.internal.impl.descriptors.d) btg).brw();
            if (brw != null) {
                bsM = brw.bsP();
                i.e(bsM, "primaryConstructor.valueParameters");
                Collection arrayList = new ArrayList();
                for (Object next : bsM) {
                    ar arVar = (ar) next;
                    Object obj2 = (arVar.btR() || arVar.btS() != null) ? null : 1;
                    if (obj2 != null) {
                        arrayList.add(next);
                    }
                }
                List list = (List) arrayList;
                if ((list.isEmpty() ^ 1) != 0) {
                    stringBuilder2.append(" : ");
                    stringBuilder2.append(mB("this"));
                    stringBuilder2.append(u.a(list, ", ", "(", ")", 0, null, DescriptorRendererImpl$renderConstructor$1.frH, 24, null));
                }
            }
        }
        if (bMC()) {
            bsM = jVar.bsM();
            i.e(bsM, str);
            a(bsM, stringBuilder2);
        }
    }

    private final void a(List<? extends ao> list, StringBuilder stringBuilder) {
        if (!bMP()) {
            ArrayList arrayList = new ArrayList(0);
            for (ao aoVar : list) {
                List bod = aoVar.bod();
                i.e(bod, "typeParameter.upperBounds");
                for (w wVar : u.f(bod, 1)) {
                    Collection collection = arrayList;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    f bsZ = aoVar.bsZ();
                    i.e(bsZ, "typeParameter.name");
                    stringBuilder2.append(b(bsZ, false));
                    stringBuilder2.append(" : ");
                    i.e(wVar, "it");
                    stringBuilder2.append(b(wVar));
                    collection.add(stringBuilder2.toString());
                }
                Collection collection2 = arrayList;
            }
            if (!arrayList.isEmpty()) {
                String str = " ";
                stringBuilder.append(str);
                stringBuilder.append(mB("where"));
                stringBuilder.append(str);
                u.a(arrayList, stringBuilder, ", ", null, null, 0, null, null, 124, null);
            }
        }
    }

    private final void a(Collection<? extends ar> collection, boolean z, StringBuilder stringBuilder) {
        z = gQ(z);
        int size = collection.size();
        bMJ().b(size, stringBuilder);
        int i = 0;
        for (ar arVar : collection) {
            bMJ().a(arVar, i, size, stringBuilder);
            a(arVar, z, stringBuilder, false);
            bMJ().b(arVar, i, size, stringBuilder);
            i++;
        }
        bMJ().c(size, stringBuilder);
    }

    private final boolean gQ(boolean z) {
        int i = f.bjZ[bMo().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return z ^ 1;
        }
        if (i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Missing block: B:21:0x0089, code skipped:
            if ((bMd() ? r8.btR() : kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.e(r8)) != false) goto L_0x008d;
     */
    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.ar r8, boolean r9, java.lang.StringBuilder r10, boolean r11) {
        /*
        r7 = this;
        if (r11 == 0) goto L_0x0011;
    L_0x0002:
        r0 = "value-parameter";
        r0 = r7.mB(r0);
        r10.append(r0);
        r0 = " ";
        r10.append(r0);
    L_0x0011:
        r0 = r7.bMK();
        if (r0 == 0) goto L_0x0028;
    L_0x0017:
        r0 = "/*";
        r10.append(r0);
        r0 = r8.getIndex();
        r10.append(r0);
        r0 = "*/ ";
        r10.append(r0);
    L_0x0028:
        r3 = r8;
        r3 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) r3;
        r4 = 0;
        r5 = 2;
        r6 = 0;
        r1 = r7;
        r2 = r10;
        a(r1, r2, r3, r4, r5, r6);
        r0 = r8.btU();
        r1 = "crossinline";
        r7.a(r10, r0, r1);
        r0 = r8.btV();
        r1 = "noinline";
        r7.a(r10, r0, r1);
        r0 = r7.bMz();
        r1 = 1;
        if (r0 == 0) goto L_0x006e;
    L_0x004c:
        r0 = r8.btQ();
        r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.c;
        if (r2 != 0) goto L_0x0055;
    L_0x0054:
        r0 = 0;
    L_0x0055:
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r0;
        if (r0 == 0) goto L_0x006e;
    L_0x0059:
        r0 = r0.isPrimary();
        if (r0 != r1) goto L_0x006e;
    L_0x005f:
        r0 = r7.bLW();
        r2 = "actual";
        r7.a(r10, r0, r2);
        r0 = "val";
        r7.a(r10, r1, r0);
    L_0x006e:
        r0 = r8;
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.at) r0;
        r7.a(r0, r9, r10, r11);
        r9 = r7.bMe();
        if (r9 == 0) goto L_0x008c;
    L_0x007a:
        r9 = r7.bMd();
        if (r9 == 0) goto L_0x0085;
    L_0x0080:
        r9 = r8.btR();
        goto L_0x0089;
    L_0x0085:
        r9 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.e(r8);
    L_0x0089:
        if (r9 == 0) goto L_0x008c;
    L_0x008b:
        goto L_0x008d;
    L_0x008c:
        r1 = 0;
    L_0x008d:
        if (r1 == 0) goto L_0x00b2;
    L_0x008f:
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r11 = " = ";
        r9.append(r11);
        r11 = r7.bMe();
        if (r11 != 0) goto L_0x00a2;
    L_0x009f:
        kotlin.jvm.internal.i.bnJ();
    L_0x00a2:
        r8 = r11.invoke(r8);
        r8 = (java.lang.String) r8;
        r9.append(r8);
        r8 = r9.toString();
        r10.append(r8);
    L_0x00b2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.d.a(kotlin.reflect.jvm.internal.impl.descriptors.ar, boolean, java.lang.StringBuilder, boolean):void");
    }

    private final void a(at atVar, StringBuilder stringBuilder) {
        if (!(atVar instanceof ar)) {
            stringBuilder.append(mB(atVar.btW() ? "var" : "val"));
            stringBuilder.append(" ");
        }
    }

    private final void a(at atVar, boolean z, StringBuilder stringBuilder, boolean z2) {
        w bpT = atVar.bpT();
        i.e(bpT, "variable.type");
        ar arVar = (ar) (!(atVar instanceof ar) ? null : atVar);
        w btS = arVar != null ? arVar.btS() : null;
        w wVar = btS != null ? btS : bpT;
        a(stringBuilder, btS != null, "vararg");
        if (z2 && !bME()) {
            a(atVar, stringBuilder);
        }
        if (z) {
            a((kotlin.reflect.jvm.internal.impl.descriptors.k) atVar, stringBuilder, z2);
            stringBuilder.append(": ");
        }
        stringBuilder.append(b(wVar));
        b(atVar, stringBuilder);
        if (bMK() && btS != null) {
            stringBuilder.append(" /*");
            stringBuilder.append(b(bpT));
            stringBuilder.append("*/");
        }
    }

    private final void a(ae aeVar, StringBuilder stringBuilder) {
        String str = "property.typeParameters";
        if (!bME()) {
            if (!bMD()) {
                b(aeVar, stringBuilder);
                aw brx = aeVar.brx();
                i.e(brx, "property.visibility");
                a(brx, stringBuilder);
                boolean z = false;
                boolean z2 = bMl().contains(DescriptorRendererModifier.CONST) && aeVar.btY();
                a(stringBuilder, z2, "const");
                a((t) aeVar, stringBuilder);
                CallableMemberDescriptor callableMemberDescriptor = aeVar;
                a(callableMemberDescriptor, stringBuilder);
                b(callableMemberDescriptor, stringBuilder);
                if (bMl().contains(DescriptorRendererModifier.LATEINIT) && aeVar.btZ()) {
                    z = true;
                }
                a(stringBuilder, z, "lateinit");
                c(callableMemberDescriptor, stringBuilder);
            }
            a((at) aeVar, stringBuilder);
            List bsM = aeVar.bsM();
            i.e(bsM, str);
            a(bsM, stringBuilder, true);
            b((kotlin.reflect.jvm.internal.impl.descriptors.a) aeVar, stringBuilder);
        }
        a((kotlin.reflect.jvm.internal.impl.descriptors.k) aeVar, stringBuilder, true);
        stringBuilder.append(": ");
        w bpT = aeVar.bpT();
        i.e(bpT, "property.type");
        stringBuilder.append(b(bpT));
        a((kotlin.reflect.jvm.internal.impl.descriptors.a) aeVar, stringBuilder);
        b((at) aeVar, stringBuilder);
        List bsM2 = aeVar.bsM();
        i.e(bsM2, str);
        a(bsM2, stringBuilder);
    }

    private final void b(ae aeVar, StringBuilder stringBuilder) {
        if (bMl().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            a(this, stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) aeVar, null, 2, null);
            kotlin.reflect.jvm.internal.impl.descriptors.q btK = aeVar.btK();
            String str = "it";
            if (btK != null) {
                i.e(btK, str);
                a(stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) btK, AnnotationUseSiteTarget.FIELD);
            }
            btK = aeVar.btL();
            if (btK != null) {
                i.e(btK, str);
                a(stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) btK, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (bMr() == PropertyAccessorRenderingPolicy.NONE) {
                af btG = aeVar.btG();
                if (btG != null) {
                    i.e(btG, str);
                    a(stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) btG, AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                ag btH = aeVar.btH();
                if (btH != null) {
                    i.e(btH, str);
                    a(stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) btH, AnnotationUseSiteTarget.PROPERTY_SETTER);
                    i.e(btH, "setter");
                    List bsP = btH.bsP();
                    i.e(bsP, "setter.valueParameters");
                    ar arVar = (ar) u.bY(bsP);
                    i.e(arVar, str);
                    a(stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) arVar, AnnotationUseSiteTarget.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void b(at atVar, StringBuilder stringBuilder) {
        if (bMk()) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.g btX = atVar.btX();
            if (btX != null) {
                stringBuilder.append(" = ");
                i.e(btX, "constant");
                stringBuilder.append(escape(c(btX)));
            }
        }
    }

    private final void a(an anVar, StringBuilder stringBuilder) {
        a(this, stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) anVar, null, 2, null);
        aw brx = anVar.brx();
        i.e(brx, "typeAlias.visibility");
        a(brx, stringBuilder);
        a((t) anVar, stringBuilder);
        stringBuilder.append(mB("typealias"));
        stringBuilder.append(" ");
        a((kotlin.reflect.jvm.internal.impl.descriptors.k) anVar, stringBuilder, true);
        List brI = anVar.brI();
        i.e(brI, "typeAlias.declaredTypeParameters");
        a(brI, stringBuilder, false);
        a((kotlin.reflect.jvm.internal.impl.descriptors.g) anVar, stringBuilder);
        stringBuilder.append(" = ");
        stringBuilder.append(b((w) anVar.btN()));
    }

    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, StringBuilder stringBuilder) {
        List brI = gVar.brI();
        i.e(brI, "classifier.declaredTypeParameters");
        kotlin.reflect.jvm.internal.impl.types.an brm = gVar.brm();
        i.e(brm, "classifier.typeConstructor");
        List parameters = brm.getParameters();
        i.e(parameters, "classifier.typeConstructor.parameters");
        if (bMK() && gVar.brz() && parameters.size() > brI.size()) {
            stringBuilder.append(" /*captured type parameters: ");
            b(stringBuilder, parameters.subList(brI.size(), parameters.size()));
            stringBuilder.append("*/");
        }
    }

    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, StringBuilder stringBuilder) {
        ClassKind brt;
        Object obj = dVar.brt() == ClassKind.ENUM_ENTRY ? 1 : null;
        String str = "klass.kind";
        if (!bME()) {
            a(this, stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) dVar, null, 2, null);
            if (obj == null) {
                aw brx = dVar.brx();
                i.e(brx, "klass.visibility");
                a(brx, stringBuilder);
            }
            if (!(dVar.brt() == ClassKind.INTERFACE && dVar.bru() == Modality.ABSTRACT)) {
                brt = dVar.brt();
                i.e(brt, str);
                if (!(brt.isSingleton() && dVar.bru() == Modality.FINAL)) {
                    Modality bru = dVar.bru();
                    i.e(bru, "klass.modality");
                    a(bru, stringBuilder, a((t) dVar));
                }
            }
            a((t) dVar, stringBuilder);
            boolean z = bMl().contains(DescriptorRendererModifier.INNER) && dVar.brz();
            a(stringBuilder, z, "inner");
            z = bMl().contains(DescriptorRendererModifier.DATA) && dVar.AZ();
            a(stringBuilder, z, "data");
            z = bMl().contains(DescriptorRendererModifier.INLINE) && dVar.brA();
            a(stringBuilder, z, "inline");
            c(dVar, stringBuilder);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar = dVar;
        if (kotlin.reflect.jvm.internal.impl.resolve.c.D(kVar)) {
            a(kVar, stringBuilder);
        } else {
            if (!bME()) {
                r(stringBuilder);
            }
            a(kVar, stringBuilder, true);
        }
        if (obj == null) {
            List brI = dVar.brI();
            i.e(brI, "klass.declaredTypeParameters");
            a(brI, stringBuilder, false);
            a((kotlin.reflect.jvm.internal.impl.descriptors.g) dVar, stringBuilder);
            brt = dVar.brt();
            i.e(brt, str);
            if (!brt.isSingleton() && bMb()) {
                kotlin.reflect.jvm.internal.impl.descriptors.c brw = dVar.brw();
                if (brw != null) {
                    stringBuilder.append(" ");
                    a(this, stringBuilder, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a) brw, null, 2, null);
                    aw brx2 = brw.brx();
                    i.e(brx2, "primaryConstructor.visibility");
                    a(brx2, stringBuilder);
                    stringBuilder.append(mB("constructor"));
                    List bsP = brw.bsP();
                    i.e(bsP, "primaryConstructor.valueParameters");
                    a((Collection) bsP, brw.bsQ(), stringBuilder);
                }
            }
            b(dVar, stringBuilder);
            a(brI, stringBuilder);
        }
    }

    private final void b(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, StringBuilder stringBuilder) {
        if (!bMO() && !g.C(dVar.bsY())) {
            kotlin.reflect.jvm.internal.impl.types.an brm = dVar.brm();
            i.e(brm, "klass.typeConstructor");
            Collection bup = brm.bup();
            i.e(bup, "klass.typeConstructor.supertypes");
            if (!(bup.isEmpty() || (bup.size() == 1 && g.E((w) bup.iterator().next())))) {
                r(stringBuilder);
                stringBuilder.append(": ");
                u.a(bup, stringBuilder, ", ", null, null, 0, null, new DescriptorRendererImpl$renderSuperTypes$1(this), 60, null);
            }
        }
    }

    private final void c(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, StringBuilder stringBuilder) {
        stringBuilder.append(mB(b.frr.b(dVar)));
    }

    private final void a(aa aaVar, StringBuilder stringBuilder) {
        a(aaVar.btB(), "package", stringBuilder);
        if (bMd()) {
            stringBuilder.append(" in context of ");
            a((kotlin.reflect.jvm.internal.impl.descriptors.k) aaVar.bql(), stringBuilder, false);
        }
    }

    private final void a(y yVar, StringBuilder stringBuilder) {
        a(yVar.btB(), "package-fragment", stringBuilder);
        if (bMd()) {
            stringBuilder.append(" in ");
            a((kotlin.reflect.jvm.internal.impl.descriptors.k) yVar.btA(), stringBuilder, false);
        }
    }

    private final void a(kotlin.reflect.jvm.internal.impl.name.b bVar, String str, StringBuilder stringBuilder) {
        stringBuilder.append(mB(str));
        kotlin.reflect.jvm.internal.impl.name.c bKa = bVar.bKa();
        i.e(bKa, "fqName.toUnsafe()");
        String f = f(bKa);
        if ((((CharSequence) f).length() > 0 ? 1 : null) != null) {
            stringBuilder.append(" ");
            stringBuilder.append(f);
        }
    }

    private final void a(ad adVar, StringBuilder stringBuilder) {
        a((t) adVar, stringBuilder);
    }

    private final void r(StringBuilder stringBuilder) {
        int length = stringBuilder.length();
        if (length == 0 || stringBuilder.charAt(length - 1) != ' ') {
            stringBuilder.append(' ');
        }
    }

    private final String b(String str, String str2, String str3, String str4, String str5) {
        if (u.a(str, str2, false, 2, null) && u.a(str3, str4, false, 2, null)) {
            int length = str2.length();
            String str6 = "null cannot be cast to non-null type java.lang.String";
            if (str != null) {
                str = str.substring(length);
                str2 = "(this as java.lang.String).substring(startIndex)";
                i.e(str, str2);
                int length2 = str4.length();
                if (str3 != null) {
                    str3 = str3.substring(length2);
                    i.e(str3, str2);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str5);
                    stringBuilder.append(str);
                    str2 = stringBuilder.toString();
                    if (i.y(str, str3)) {
                        return str2;
                    }
                    if (bk(str, str3)) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(str2);
                        stringBuilder2.append("!");
                        return stringBuilder2.toString();
                    }
                }
                throw new TypeCastException(str6);
            }
            throw new TypeCastException(str6);
        }
        return null;
    }

    /* JADX WARNING: Missing block: B:5:0x0032, code skipped:
            if (kotlin.jvm.internal.i.y(r0.toString(), r8) == false) goto L_0x0034;
     */
    private final boolean bk(java.lang.String r7, java.lang.String r8) {
        /*
        r6 = this;
        r1 = "?";
        r2 = "";
        r3 = 0;
        r4 = 4;
        r5 = 0;
        r0 = r8;
        r0 = kotlin.text.u.a(r0, r1, r2, r3, r4, r5);
        r0 = kotlin.jvm.internal.i.y(r7, r0);
        r1 = 0;
        if (r0 != 0) goto L_0x0050;
    L_0x0013:
        r0 = 2;
        r2 = 0;
        r3 = "?";
        r0 = kotlin.text.u.b(r8, r3, r1, r0, r2);
        if (r0 == 0) goto L_0x0034;
    L_0x001d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r7);
        r2 = 63;
        r0.append(r2);
        r0 = r0.toString();
        r0 = kotlin.jvm.internal.i.y(r0, r8);
        if (r0 != 0) goto L_0x0050;
    L_0x0034:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = 40;
        r0.append(r2);
        r0.append(r7);
        r7 = ")?";
        r0.append(r7);
        r7 = r0.toString();
        r7 = kotlin.jvm.internal.i.y(r7, r8);
        if (r7 == 0) goto L_0x0051;
    L_0x0050:
        r1 = 1;
    L_0x0051:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.d.bk(java.lang.String, java.lang.String):boolean");
    }

    private final boolean y(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.bsR().isEmpty() ^ 1;
    }
}
