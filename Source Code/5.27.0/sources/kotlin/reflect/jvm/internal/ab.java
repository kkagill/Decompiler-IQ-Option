package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.i;
import kotlin.reflect.jvm.internal.c.e;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.af;
import kotlin.reflect.jvm.internal.impl.descriptors.ag;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.j;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.n;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h;
import kotlin.reflect.jvm.internal.structure.m;
import kotlin.reflect.jvm.internal.structure.p;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0006\u0012\u0002\b\u00030\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, bng = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", "", "()V", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "primitiveType", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "Ljava/lang/Class;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "mapJvmClassToKotlinClassId", "klass", "mapJvmFunctionSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "mapName", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "mapPropertySignature", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "mapSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "possiblySubstitutedFunction", "kotlin-reflect-api"})
/* compiled from: RuntimeTypeMapper.kt */
public final class ab {
    private static final a eYm;
    public static final ab eYn = new ab();

    static {
        a s = a.s(new b("java.lang.Void"));
        kotlin.jvm.internal.i.e(s, "ClassId.topLevel(FqName(\"java.lang.Void\"))");
        eYm = s;
    }

    private ab() {
    }

    public final c d(s sVar) {
        kotlin.jvm.internal.i.f(sVar, "possiblySubstitutedFunction");
        CallableMemberDescriptor z = c.z((CallableMemberDescriptor) sVar);
        kotlin.jvm.internal.i.e(z, "DescriptorUtils.unwrapFa…siblySubstitutedFunction)");
        s bti = ((s) z).bti();
        kotlin.jvm.internal.i.e(bti, "DescriptorUtils.unwrapFa…titutedFunction).original");
        c eVar;
        if (bti instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b bVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b) bti;
            n bOz = bVar.bOz();
            if (bOz instanceof Function) {
                f.b a = j.foZ.a((Function) bOz, bVar.bot(), bVar.bou());
                if (a != null) {
                    return new e(a);
                }
            }
            if (bOz instanceof Constructor) {
                f.b a2 = j.foZ.a((Constructor) bOz, bVar.bot(), bVar.bou());
                if (a2 != null) {
                    k brj = sVar.brj();
                    kotlin.jvm.internal.i.e(brj, "possiblySubstitutedFunction.containingDeclaration");
                    if (d.N(brj)) {
                        eVar = new e(a2);
                    } else {
                        eVar = new c.d(a2);
                    }
                    return eVar;
                }
            }
            return e(bti);
        }
        Object obj = null;
        aj brF;
        kotlin.reflect.jvm.internal.impl.load.java.a.a aVar;
        StringBuilder stringBuilder;
        if (bti instanceof JavaMethodDescriptor) {
            brF = ((JavaMethodDescriptor) bti).brF();
            if (!(brF instanceof kotlin.reflect.jvm.internal.impl.load.java.a.a)) {
                brF = null;
            }
            aVar = (kotlin.reflect.jvm.internal.impl.load.java.a.a) brF;
            l bqq = aVar != null ? aVar.bqq() : null;
            if (!(bqq instanceof kotlin.reflect.jvm.internal.structure.s)) {
                bqq = null;
            }
            kotlin.reflect.jvm.internal.structure.s sVar2 = (kotlin.reflect.jvm.internal.structure.s) bqq;
            if (sVar2 != null) {
                Method bqf = sVar2.bpY();
                if (bqf != null) {
                    return new c.c(bqf);
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Incorrect resolution sequence for Java method ");
            stringBuilder.append(bti);
            throw new KotlinReflectionInternalError(stringBuilder.toString());
        }
        String str = " (";
        if (bti instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c) {
            brF = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.c) bti).brF();
            if (!(brF instanceof kotlin.reflect.jvm.internal.impl.load.java.a.a)) {
                brF = null;
            }
            aVar = (kotlin.reflect.jvm.internal.impl.load.java.a.a) brF;
            if (aVar != null) {
                obj = aVar.bqq();
            }
            if (obj instanceof m) {
                eVar = new c.b(((m) obj).bpY());
            } else {
                if (obj instanceof kotlin.reflect.jvm.internal.structure.j) {
                    kotlin.reflect.jvm.internal.structure.j jVar = (kotlin.reflect.jvm.internal.structure.j) obj;
                    if (jVar.bxn()) {
                        eVar = new c.a(jVar.bQn());
                    }
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Incorrect resolution sequence for Java constructor ");
                stringBuilder2.append(bti);
                stringBuilder2.append(str);
                stringBuilder2.append(obj);
                stringBuilder2.append(')');
                throw new KotlinReflectionInternalError(stringBuilder2.toString());
            }
            return eVar;
        } else if (kotlin.reflect.jvm.internal.impl.resolve.b.k(bti) || kotlin.reflect.jvm.internal.impl.resolve.b.j(bti)) {
            return e(bti);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown origin of ");
            stringBuilder.append(bti);
            stringBuilder.append(str);
            stringBuilder.append(bti.getClass());
            stringBuilder.append(')');
            throw new KotlinReflectionInternalError(stringBuilder.toString());
        }
    }

    public final d f(ae aeVar) {
        ag btH;
        kotlin.jvm.internal.i.f(aeVar, "possiblyOverriddenProperty");
        CallableMemberDescriptor z = c.z((CallableMemberDescriptor) aeVar);
        kotlin.jvm.internal.i.e(z, "DescriptorUtils.unwrapFa…ssiblyOverriddenProperty)");
        ae btJ = ((ae) z).btJ();
        kotlin.jvm.internal.i.e(btJ, "DescriptorUtils.unwrapFa…rriddenProperty).original");
        e eVar = null;
        if (btJ instanceof h) {
            h hVar = (h) btJ;
            Property bor = hVar.bOz();
            ExtendableMessage extendableMessage = bor;
            GeneratedMessageLite.e eVar2 = JvmProtoBuf.fot;
            kotlin.jvm.internal.i.e(eVar2, "JvmProtoBuf.propertySignature");
            JvmPropertySignature jvmPropertySignature = (JvmPropertySignature) kotlin.reflect.jvm.internal.impl.metadata.a.f.a(extendableMessage, eVar2);
            if (jvmPropertySignature != null) {
                return new d.c(btJ, bor, jvmPropertySignature, hVar.bot(), hVar.bou());
            }
        } else if (btJ instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) {
            d aVar;
            aj brF = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) btJ).brF();
            if (!(brF instanceof kotlin.reflect.jvm.internal.impl.load.java.a.a)) {
                brF = null;
            }
            kotlin.reflect.jvm.internal.impl.load.java.a.a aVar2 = (kotlin.reflect.jvm.internal.impl.load.java.a.a) brF;
            Object bqq = aVar2 != null ? aVar2.bqq() : null;
            if (bqq instanceof p) {
                aVar = new d.a(((p) bqq).bpY());
            } else if (bqq instanceof kotlin.reflect.jvm.internal.structure.s) {
                Method bqf;
                Method bqf2 = ((kotlin.reflect.jvm.internal.structure.s) bqq).bpY();
                btH = btJ.btH();
                aj brF2 = btH != null ? btH.brF() : null;
                if (!(brF2 instanceof kotlin.reflect.jvm.internal.impl.load.java.a.a)) {
                    brF2 = null;
                }
                kotlin.reflect.jvm.internal.impl.load.java.a.a aVar3 = (kotlin.reflect.jvm.internal.impl.load.java.a.a) brF2;
                l bqq2 = aVar3 != null ? aVar3.bqq() : null;
                if (!(bqq2 instanceof kotlin.reflect.jvm.internal.structure.s)) {
                    bqq2 = null;
                }
                kotlin.reflect.jvm.internal.structure.s sVar = (kotlin.reflect.jvm.internal.structure.s) bqq2;
                if (sVar != null) {
                    bqf = sVar.bpY();
                }
                aVar = new d.b(bqf2, bqf);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Incorrect resolution sequence for Java field ");
                stringBuilder.append(btJ);
                stringBuilder.append(" (source = ");
                stringBuilder.append(bqq);
                stringBuilder.append(')');
                throw new KotlinReflectionInternalError(stringBuilder.toString());
            }
            return aVar;
        }
        af btG = btJ.btG();
        if (btG == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        ab abVar = this;
        e e = abVar.e(btG);
        btH = btJ.btH();
        if (btH != null) {
            eVar = abVar.e(btH);
        }
        return new d.d(e, eVar);
    }

    private final e e(s sVar) {
        return new e(new f.b(a(sVar), r.a(sVar, false, false, 1, null)));
    }

    private final String a(CallableMemberDescriptor callableMemberDescriptor) {
        String s = kotlin.reflect.jvm.internal.impl.load.java.r.s(callableMemberDescriptor);
        if (s == null) {
            String mb;
            if (callableMemberDescriptor instanceof af) {
                mb = kotlin.reflect.jvm.internal.impl.load.java.m.mb(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.F(callableMemberDescriptor).bsZ().boi());
            } else if (callableMemberDescriptor instanceof ag) {
                mb = kotlin.reflect.jvm.internal.impl.load.java.m.mc(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.F(callableMemberDescriptor).bsZ().boi());
            } else {
                mb = callableMemberDescriptor.bsZ().boi();
            }
            s = mb;
            kotlin.jvm.internal.i.e(s, "when (descriptor) {\n    …name.asString()\n        }");
        }
        return s;
    }

    public final a L(Class<?> cls) {
        kotlin.jvm.internal.i.f(cls, "klass");
        a s;
        if (cls.isArray()) {
            Class componentType = cls.getComponentType();
            kotlin.jvm.internal.i.e(componentType, "klass.componentType");
            PrimitiveType M = M(componentType);
            if (M != null) {
                return new a(g.eZp, M.getArrayTypeName());
            }
            s = a.s(g.eZA.eZK.bKf());
            kotlin.jvm.internal.i.e(s, "ClassId.topLevel(KotlinB….FQ_NAMES.array.toSafe())");
            return s;
        } else if (kotlin.jvm.internal.i.y(cls, Void.TYPE)) {
            return eYm;
        } else {
            PrimitiveType M2 = M(cls);
            if (M2 != null) {
                return new a(g.eZp, M2.getTypeName());
            }
            s = kotlin.reflect.jvm.internal.structure.b.U(cls);
            if (!s.bJW()) {
                kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.fca;
                b bJZ = s.bJZ();
                kotlin.jvm.internal.i.e(bJZ, "classId.asSingleFqName()");
                a e = cVar.e(bJZ);
                if (e != null) {
                    return e;
                }
            }
            return s;
        }
    }

    private final PrimitiveType M(Class<?> cls) {
        if (!cls.isPrimitive()) {
            return null;
        }
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.get(cls.getSimpleName());
        kotlin.jvm.internal.i.e(jvmPrimitiveType, "JvmPrimitiveType.get(simpleName)");
        return jvmPrimitiveType.getPrimitiveType();
    }
}
