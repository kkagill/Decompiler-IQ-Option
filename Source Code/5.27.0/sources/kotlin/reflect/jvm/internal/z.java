package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.i;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.renderer.b;
import kotlin.reflect.jvm.internal.impl.types.w;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u00020\u0019*\u00060\u001aj\u0002`\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u0019*\u00060\u001aj\u0002`\u001b2\u0006\u0010\u001f\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, bng = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "()V", "renderer", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderCallable", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "renderFunction", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "renderLambda", "invoke", "renderParameter", "parameter", "Lkotlin/reflect/jvm/internal/KParameterImpl;", "renderProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "renderType", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "renderTypeParameter", "typeParameter", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "appendReceiverType", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "appendReceivers", "callable", "kotlin-reflect-api"})
/* compiled from: ReflectionObjectRenderer.kt */
public final class z {
    private static final b eYi = b.frn;
    public static final z eYj = new z();

    private z() {
    }

    private final void a(StringBuilder stringBuilder, ah ahVar) {
        if (ahVar != null) {
            w bpT = ahVar.bpT();
            kotlin.jvm.internal.i.e(bpT, "receiver.type");
            stringBuilder.append(b(bpT));
            stringBuilder.append(".");
        }
    }

    private final void a(StringBuilder stringBuilder, a aVar) {
        ah b = ae.b(aVar);
        ah bsK = aVar.bsK();
        a(stringBuilder, b);
        Object obj = (b == null || bsK == null) ? null : 1;
        if (obj != null) {
            stringBuilder.append("(");
        }
        a(stringBuilder, bsK);
        if (obj != null) {
            stringBuilder.append(")");
        }
    }

    private final String a(a aVar) {
        if (aVar instanceof ae) {
            return e((ae) aVar);
        }
        if (aVar instanceof s) {
            return b((s) aVar);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal callable: ");
        stringBuilder.append(aVar);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public final String e(ae aeVar) {
        kotlin.jvm.internal.i.f(aeVar, "descriptor");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(aeVar.btW() ? "var " : "val ");
        eYj.a(stringBuilder, (a) aeVar);
        b bVar = eYi;
        f bsZ = aeVar.bsZ();
        kotlin.jvm.internal.i.e(bsZ, "descriptor.name");
        stringBuilder.append(bVar.b(bsZ, true));
        stringBuilder.append(": ");
        z zVar = eYj;
        w bpT = aeVar.bpT();
        kotlin.jvm.internal.i.e(bpT, "descriptor.type");
        stringBuilder.append(zVar.b(bpT));
        String stringBuilder2 = stringBuilder.toString();
        kotlin.jvm.internal.i.e(stringBuilder2, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder2;
    }

    public final String b(s sVar) {
        kotlin.jvm.internal.i.f(sVar, "descriptor");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fun ");
        eYj.a(stringBuilder, (a) sVar);
        b bVar = eYi;
        f bsZ = sVar.bsZ();
        kotlin.jvm.internal.i.e(bsZ, "descriptor.name");
        stringBuilder.append(bVar.b(bsZ, true));
        List bsP = sVar.bsP();
        kotlin.jvm.internal.i.e(bsP, "descriptor.valueParameters");
        u.a(bsP, stringBuilder, ", ", "(", ")", 0, null, ReflectionObjectRenderer$renderFunction$1$1.eYk, 48, null);
        stringBuilder.append(": ");
        z zVar = eYj;
        w bsN = sVar.bsN();
        if (bsN == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(bsN, "descriptor.returnType!!");
        stringBuilder.append(zVar.b(bsN));
        String stringBuilder2 = stringBuilder.toString();
        kotlin.jvm.internal.i.e(stringBuilder2, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder2;
    }

    public final String c(s sVar) {
        kotlin.jvm.internal.i.f(sVar, "invoke");
        StringBuilder stringBuilder = new StringBuilder();
        eYj.a(stringBuilder, (a) sVar);
        List bsP = sVar.bsP();
        kotlin.jvm.internal.i.e(bsP, "invoke.valueParameters");
        u.a(bsP, stringBuilder, ", ", "(", ")", 0, null, ReflectionObjectRenderer$renderLambda$1$1.eYl, 48, null);
        stringBuilder.append(" -> ");
        z zVar = eYj;
        w bsN = sVar.bsN();
        if (bsN == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(bsN, "invoke.returnType!!");
        stringBuilder.append(zVar.b(bsN));
        String stringBuilder2 = stringBuilder.toString();
        kotlin.jvm.internal.i.e(stringBuilder2, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder2;
    }

    public final String b(n nVar) {
        kotlin.jvm.internal.i.f(nVar, "parameter");
        StringBuilder stringBuilder = new StringBuilder();
        int i = aa.aob[nVar.bpy().ordinal()];
        if (i == 1) {
            stringBuilder.append("extension receiver");
        } else if (i == 2) {
            stringBuilder.append("instance");
        } else if (i == 3) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("parameter #");
            stringBuilder2.append(nVar.getIndex());
            stringBuilder2.append(' ');
            stringBuilder2.append(nVar.getName());
            stringBuilder.append(stringBuilder2.toString());
        }
        stringBuilder.append(" of ");
        stringBuilder.append(eYj.a((a) nVar.bpx().box()));
        String stringBuilder3 = stringBuilder.toString();
        kotlin.jvm.internal.i.e(stringBuilder3, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder3;
    }

    public final String a(ao aoVar) {
        kotlin.jvm.internal.i.f(aoVar, "typeParameter");
        StringBuilder stringBuilder = new StringBuilder();
        int i = aa.axg[aoVar.bta().ordinal()];
        if (i != 1) {
            if (i == 2) {
                stringBuilder.append("in ");
            } else if (i == 3) {
                stringBuilder.append("out ");
            }
        }
        stringBuilder.append(aoVar.bsZ());
        String stringBuilder2 = stringBuilder.toString();
        kotlin.jvm.internal.i.e(stringBuilder2, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder2;
    }

    public final String b(w wVar) {
        kotlin.jvm.internal.i.f(wVar, "type");
        return eYi.b(wVar);
    }
}
