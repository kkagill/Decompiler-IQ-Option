package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.NotImplementedError;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.c;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.an;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.structure.b;
import kotlin.reflect.jvm.internal.x.a;
import kotlin.reflect.n;

@i(bne = {1, 1, 15}, bnf = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0013\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8VX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u00068@X\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006(²\u0006\u0010\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0002"}, bng = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "computeJavaType", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "arguments", "Lkotlin/reflect/KTypeProjection;", "getArguments", "arguments$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "classifier", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier$delegate", "isMarkedNullable", "", "()Z", "javaType", "getJavaType$kotlin_reflect_api", "()Ljava/lang/reflect/Type;", "javaType$delegate", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "convert", "equals", "other", "", "hashCode", "", "toString", "", "kotlin-reflect-api", "parameterizedTypeArguments"})
/* compiled from: KTypeImpl.kt */
public final class t implements n {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(t.class), "javaType", "getJavaType$kotlin_reflect_api()Ljava/lang/reflect/Type;")), k.a(new PropertyReference1Impl(k.G(t.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), k.a(new PropertyReference1Impl(k.G(t.class), "arguments", "getArguments()Ljava/util/List;")), k.a(new PropertyReference0Impl(k.G(t.class), "parameterizedTypeArguments", "<v#0>"))};
    private final a eXZ;
    private final a eYa = x.e(new KTypeImpl$classifier$2(this));
    private final a eYb = x.e(new KTypeImpl$arguments$2(this));
    private final w eYc;

    public c bob() {
        return (c) this.eYa.B(this, anY[1]);
    }

    public final Type bpS() {
        return (Type) this.eXZ.B(this, anY[0]);
    }

    public t(w wVar, kotlin.jvm.a.a<? extends Type> aVar) {
        kotlin.jvm.internal.i.f(wVar, "type");
        kotlin.jvm.internal.i.f(aVar, "computeJavaType");
        this.eYc = wVar;
        this.eXZ = x.e(aVar);
    }

    public final w bpT() {
        return this.eYc;
    }

    private final c a(w wVar) {
        f brQ = wVar.bMZ().brQ();
        StringBuilder stringBuilder;
        if (brQ instanceof d) {
            Class a = ae.a((d) brQ);
            if (a == null) {
                return null;
            }
            if (a.isArray()) {
                ap apVar = (ap) u.bZ(wVar.btD());
                if (apVar != null) {
                    wVar = apVar.bpT();
                    if (wVar != null) {
                        kotlin.jvm.internal.i.e(wVar, "type.arguments.singleOrN…return KClassImpl(jClass)");
                        c a2 = a(wVar);
                        if (a2 != null) {
                            return new g(b.W(kotlin.jvm.a.a(kotlin.reflect.jvm.b.a(a2))));
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Cannot determine classifier for array element type: ");
                        stringBuilder.append(this);
                        throw new KotlinReflectionInternalError(stringBuilder.toString());
                    }
                }
                return new g(a);
            } else if (au.bb(wVar)) {
                return new g(a);
            } else {
                Class S = b.S(a);
                if (S != null) {
                    a = S;
                }
                return new g(a);
            }
        } else if (brQ instanceof ao) {
            return new v((ao) brQ);
        } else {
            if (!(brQ instanceof an)) {
                return null;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("An operation is not implemented: ");
            stringBuilder.append("Type alias classifiers are not yet supported");
            throw new NotImplementedError(stringBuilder.toString());
        }
    }

    public boolean boc() {
        return this.eYc.boc();
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && kotlin.jvm.internal.i.y(this.eYc, ((t) obj).eYc);
    }

    public int hashCode() {
        return this.eYc.hashCode();
    }

    public String toString() {
        return z.eYj.b(this.eYc);
    }
}
