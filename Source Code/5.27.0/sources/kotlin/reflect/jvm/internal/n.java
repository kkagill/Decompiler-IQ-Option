package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.KParameter;
import kotlin.reflect.KParameter.Kind;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.ab;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.x.a;

@i(bne = {1, 1, 15}, bnf = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0013\u0010)\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\"H\u0016R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\"8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006."}, bng = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "callable", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "index", "", "kind", "Lkotlin/reflect/KParameter$Kind;", "computeDescriptor", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "(Lkotlin/reflect/jvm/internal/KCallableImpl;ILkotlin/reflect/KParameter$Kind;Lkotlin/jvm/functions/Function0;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getCallable", "()Lkotlin/reflect/jvm/internal/KCallableImpl;", "descriptor", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor$delegate", "getIndex", "()I", "isOptional", "", "()Z", "isVararg", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "name", "", "getName", "()Ljava/lang/String;", "type", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "equals", "other", "", "hashCode", "toString", "kotlin-reflect-api"})
/* compiled from: KParameterImpl.kt */
public final class n implements KParameter {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(n.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), k.a(new PropertyReference1Impl(k.G(n.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    private final a eWX;
    private final a eWY = x.e(new KParameterImpl$annotations$2(this));
    private final e<?> eXN;
    private final Kind eXO;
    private final int index;

    private final ab bpw() {
        return (ab) this.eWX.B(this, anY[0]);
    }

    public n(e<?> eVar, int i, Kind kind, kotlin.jvm.a.a<? extends ab> aVar) {
        kotlin.jvm.internal.i.f(eVar, "callable");
        kotlin.jvm.internal.i.f(kind, "kind");
        kotlin.jvm.internal.i.f(aVar, "computeDescriptor");
        this.eXN = eVar;
        this.index = i;
        this.eXO = kind;
        this.eWX = x.e(aVar);
    }

    public final e<?> bpx() {
        return this.eXN;
    }

    public int getIndex() {
        return this.index;
    }

    public Kind bpy() {
        return this.eXO;
    }

    public String getName() {
        ab bpw = bpw();
        String str = null;
        if (!(bpw instanceof ar)) {
            bpw = null;
        }
        ar arVar = (ar) bpw;
        if (arVar != null) {
            if (arVar.btQ().bsQ()) {
                return null;
            }
            f bsZ = arVar.bsZ();
            kotlin.jvm.internal.i.e(bsZ, "valueParameter.name");
            if (!bsZ.bKh()) {
                str = bsZ.boi();
            }
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (kotlin.jvm.internal.i.y(this.eXN, nVar.eXN) && kotlin.jvm.internal.i.y(bpw(), nVar.bpw())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.eXN.hashCode() * 31) + bpw().hashCode();
    }

    public String toString() {
        return z.eYj.b(this);
    }
}
