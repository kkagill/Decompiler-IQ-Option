package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.PropertyReference;
import kotlin.reflect.jvm.internal.components.e;
import kotlin.reflect.jvm.internal.components.l.a;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.c;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n;
import kotlin.reflect.jvm.internal.impl.load.kotlin.p;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.a.h;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.k;
import kotlin.reflect.jvm.internal.impl.resolve.constants.r;
import kotlin.reflect.jvm.internal.structure.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000°\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001an\u0010\u000e\u001a\u0004\u0018\u0001H\u000f\"\b\b\u0000\u0010\u0010*\u00020\u0011\"\b\b\u0001\u0010\u000f*\u00020\u00062\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0014\u001a\u0002H\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u001d\u0010\u001b\u001a\u0019\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u000f0\u001c¢\u0006\u0002\b\u001eH\u0000¢\u0006\u0002\u0010\u001f\u001a.\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&H\u0002\u001a(\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010%\u001a\u00020&H\u0002\u001a\"\u0010)\u001a\u0002H*\"\u0004\b\u0000\u0010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H*0,H\b¢\u0006\u0002\u0010-\u001a\u0014\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010/*\u0004\u0018\u000100H\u0000\u001a\u0010\u00101\u001a\u0004\u0018\u000102*\u0004\u0018\u000100H\u0000\u001a\u0014\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u000104*\u0004\u0018\u000100H\u0000\u001a\u0012\u00105\u001a\b\u0012\u0004\u0012\u00020706*\u000208H\u0000\u001a\u000e\u00109\u001a\u0004\u0018\u000107*\u00020:H\u0002\u001a\u0012\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u00020<H\u0000\u001a\u000e\u0010=\u001a\u0004\u0018\u00010>*\u00020?H\u0000\u001a\u001a\u0010@\u001a\u0004\u0018\u000100*\u0006\u0012\u0002\b\u00030A2\u0006\u0010!\u001a\u00020\"H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00068@X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8@X\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006B"}, bng = {"JVM_STATIC", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "instanceReceiverParameter", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "packageModuleName", "", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "getPackageModuleName", "(Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;)Ljava/lang/String;", "deserializeToDescriptor", "D", "M", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "moduleAnchor", "Ljava/lang/Class;", "proto", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "metadataVersion", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "createDescriptor", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "loadClass", "classLoader", "Ljava/lang/ClassLoader;", "packageName", "className", "arrayDimensions", "", "kotlinClassId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "reflectionCall", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "asKCallableImpl", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "asKFunctionImpl", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "asKPropertyImpl", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "computeAnnotations", "", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "toAnnotationInstance", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;", "toJavaClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "toKVisibility", "Lkotlin/reflect/KVisibility;", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "toRuntimeValue", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;", "kotlin-reflect-api"})
/* compiled from: util.kt */
public final class ae {
    private static final b eYp = new b("kotlin.jvm.JvmStatic");

    public static final b bpW() {
        return eYp;
    }

    public static final Class<?> a(d dVar) {
        Class<?> bqi;
        kotlin.jvm.internal.i.f(dVar, "$this$toJavaClass");
        aj brF = dVar.brF();
        kotlin.jvm.internal.i.e(brF, "source");
        if (brF instanceof p) {
            n byL = ((p) brF).byL();
            if (byL != null) {
                bqi = ((e) byL).bqi();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.components.ReflectKotlinClass");
            }
        } else if (brF instanceof a) {
            kotlin.reflect.jvm.internal.structure.n bqp = ((a) brF).bqq();
            if (bqp != null) {
                bqi = ((j) bqp).bQn();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.structure.ReflectJavaClass");
            }
        } else {
            kotlin.reflect.jvm.internal.impl.name.a c = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.c(dVar);
            if (c == null) {
                return null;
            }
            bqi = a(kotlin.reflect.jvm.internal.structure.b.Q(dVar.getClass()), c, 0);
        }
        return bqi;
    }

    static /* synthetic */ Class a(ClassLoader classLoader, kotlin.reflect.jvm.internal.impl.name.a aVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return a(classLoader, aVar, i);
    }

    private static final Class<?> a(ClassLoader classLoader, kotlin.reflect.jvm.internal.impl.name.a aVar, int i) {
        c cVar = c.fca;
        kotlin.reflect.jvm.internal.impl.name.c bKa = aVar.bJZ().bKa();
        kotlin.jvm.internal.i.e(bKa, "kotlinClassId.asSingleFqName().toUnsafe()");
        kotlin.reflect.jvm.internal.impl.name.a c = cVar.c(bKa);
        if (c != null) {
            aVar = c;
        }
        String boi = aVar.getPackageFqName().boi();
        kotlin.jvm.internal.i.e(boi, "javaClassId.packageFqName.asString()");
        String boi2 = aVar.bJU().boi();
        kotlin.jvm.internal.i.e(boi2, "javaClassId.relativeClassName.asString()");
        return a(classLoader, boi, boi2, i);
    }

    private static final Class<?> a(ClassLoader classLoader, String str, String str2, int i) {
        if (kotlin.jvm.internal.i.y(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append('.');
        stringBuilder.append(u.a(str2, '.', '$', false, 4, null));
        str = stringBuilder.toString();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder = new StringBuilder();
            stringBuilder.append('[');
            stringBuilder.append(str);
            str = stringBuilder.toString();
        }
        return kotlin.reflect.jvm.internal.components.d.a(classLoader, str);
    }

    public static final List<Annotation> a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$computeAnnotations");
        Collection arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : aVar.brE()) {
            aj brF = cVar.brF();
            Object obj = null;
            if (brF instanceof kotlin.reflect.jvm.internal.components.a) {
                obj = ((kotlin.reflect.jvm.internal.components.a) brF).bqh();
            } else if (brF instanceof a) {
                kotlin.reflect.jvm.internal.structure.n bqp = ((a) brF).bqq();
                if (!(bqp instanceof kotlin.reflect.jvm.internal.structure.c)) {
                    bqp = null;
                }
                kotlin.reflect.jvm.internal.structure.c cVar2 = (kotlin.reflect.jvm.internal.structure.c) bqp;
                if (cVar2 != null) {
                    obj = cVar2.bqh();
                }
            } else {
                obj = a(cVar);
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return (List) arrayList;
    }

    private static final Annotation a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        d m = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.m(cVar);
        Class a = m != null ? a(m) : null;
        if (!(a instanceof Class)) {
            a = null;
        }
        if (a == null) {
            return null;
        }
        Collection arrayList = new ArrayList();
        for (Entry entry : cVar.buf().entrySet()) {
            f fVar = (f) entry.getKey();
            g gVar = (g) entry.getValue();
            ClassLoader classLoader = a.getClassLoader();
            kotlin.jvm.internal.i.e(classLoader, "annotationClass.classLoader");
            Object a2 = a(gVar, classLoader);
            a2 = a2 != null ? kotlin.j.x(fVar.boi(), a2) : null;
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return (Annotation) kotlin.reflect.jvm.internal.calls.a.a(a, af.ac((List) arrayList), null, 4, null);
    }

    private static final Object a(g<?> gVar, ClassLoader classLoader) {
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a) {
            return a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) ((kotlin.reflect.jvm.internal.impl.resolve.constants.a) gVar).getValue());
        }
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b) {
            Iterable<g> iterable = (Iterable) ((kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar).getValue();
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (g a : iterable) {
                arrayList.add(a(a, classLoader));
            }
            Object toArray = ((List) arrayList).toArray(new Object[0]);
            if (toArray != null) {
                return toArray;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        } else if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.j) {
            Pair pair = (Pair) ((kotlin.reflect.jvm.internal.impl.resolve.constants.j) gVar).getValue();
            kotlin.reflect.jvm.internal.impl.name.a aVar = (kotlin.reflect.jvm.internal.impl.name.a) pair.bnj();
            f fVar = (f) pair.bnk();
            Class a2 = a(classLoader, aVar, 0, 4, null);
            if (a2 == null) {
                return null;
            }
            if (a2 != null) {
                return ad.e(a2, fVar.boi());
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<out kotlin.Enum<*>>");
        } else if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.p) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.p.b bVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.p.b) ((kotlin.reflect.jvm.internal.impl.resolve.constants.p) gVar).getValue();
            if (bVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.b) {
                kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.b bVar2 = (kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.b) bVar;
                return a(classLoader, bVar2.getClassId(), bVar2.bNh());
            } else if (bVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.a) {
                kotlin.reflect.jvm.internal.impl.descriptors.f brQ = ((kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.a) bVar).bpT().bMZ().brQ();
                if (!(brQ instanceof d)) {
                    brQ = null;
                }
                d dVar = (d) brQ;
                if (dVar != null) {
                    return a(dVar);
                }
                return null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if ((gVar instanceof k) || (gVar instanceof r)) {
            return null;
        } else {
            return gVar.getValue();
        }
    }

    public static final i du(Object obj) {
        i iVar = (i) (!(obj instanceof i) ? null : obj);
        if (iVar != null) {
            return iVar;
        }
        if (!(obj instanceof FunctionReference)) {
            obj = null;
        }
        FunctionReference functionReference = (FunctionReference) obj;
        kotlin.reflect.a bny = functionReference != null ? functionReference.bny() : null;
        if (!(bny instanceof i)) {
            bny = null;
        }
        return (i) bny;
    }

    public static final r<?> dv(Object obj) {
        r<?> rVar = (r) (!(obj instanceof r) ? null : obj);
        if (rVar != null) {
            return rVar;
        }
        if (!(obj instanceof PropertyReference)) {
            obj = null;
        }
        PropertyReference propertyReference = (PropertyReference) obj;
        kotlin.reflect.a bny = propertyReference != null ? propertyReference.bny() : null;
        if (!(bny instanceof r)) {
            bny = null;
        }
        return (r) bny;
    }

    public static final e<?> dw(Object obj) {
        e<?> eVar = (e) (!(obj instanceof e) ? null : obj);
        if (eVar == null) {
            eVar = du(obj);
        }
        return eVar != null ? eVar : dv(obj);
    }

    /* JADX WARNING: Missing block: B:24:0x00a0, code skipped:
            if (r2 != null) goto L_0x00a5;
     */
    public static final java.lang.String a(kotlin.reflect.jvm.internal.components.e r9) {
        /*
        r0 = "$this$packageModuleName";
        kotlin.jvm.internal.i.f(r9, r0);
        r0 = r9.bqj();
        r1 = r0.byW();
        r1 = r1.bJQ();
        r2 = 0;
        if (r1 != 0) goto L_0x0015;
    L_0x0014:
        return r2;
    L_0x0015:
        r1 = r0.byV();
        r3 = kotlin.reflect.jvm.internal.af.aob;
        r1 = r1.ordinal();
        r1 = r3[r1];
        r3 = 1;
        if (r1 == r3) goto L_0x0063;
    L_0x0024:
        r3 = 2;
        if (r1 == r3) goto L_0x0063;
    L_0x0027:
        r3 = 3;
        if (r1 == r3) goto L_0x002c;
    L_0x002a:
        goto L_0x00a5;
    L_0x002c:
        r0 = r0.byT();
        r0 = kotlin.collections.u.bV(r0);
        r3 = r0;
        r3 = (java.lang.String) r3;
        if (r3 == 0) goto L_0x0062;
    L_0x0039:
        r0 = kotlin.reflect.jvm.internal.components.e.eYT;
        r9 = r9.bqi();
        r9 = r9.getClassLoader();
        r4 = 47;
        r5 = 46;
        r6 = 0;
        r7 = 4;
        r8 = 0;
        r1 = kotlin.text.u.a(r3, r4, r5, r6, r7, r8);
        r9 = r9.loadClass(r1);
        r1 = "klass.classLoader.loadCl…rtName.replace('/', '.'))";
        kotlin.jvm.internal.i.e(r9, r1);
        r9 = r0.O(r9);
        if (r9 == 0) goto L_0x00a5;
    L_0x005d:
        r2 = a(r9);
        goto L_0x00a5;
    L_0x0062:
        return r2;
    L_0x0063:
        r9 = r0.byX();
        if (r9 != 0) goto L_0x006c;
    L_0x0069:
        kotlin.jvm.internal.i.bnJ();
    L_0x006c:
        r0 = r0.byZ();
        if (r0 != 0) goto L_0x0075;
    L_0x0072:
        kotlin.jvm.internal.i.bnJ();
    L_0x0075:
        r9 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.j.b(r9, r0);
        r0 = r9.bnj();
        r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h) r0;
        r9 = r9.bnk();
        r9 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) r9;
        r9 = (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage) r9;
        r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.foB;
        r2 = "JvmProtoBuf.packageModuleName";
        kotlin.jvm.internal.i.e(r1, r2);
        r9 = kotlin.reflect.jvm.internal.impl.metadata.a.f.a(r9, r1);
        r9 = (java.lang.Integer) r9;
        if (r9 == 0) goto L_0x00a3;
    L_0x0096:
        r9 = (java.lang.Number) r9;
        r9 = r9.intValue();
        r2 = r0.getString(r9);
        if (r2 == 0) goto L_0x00a3;
    L_0x00a2:
        goto L_0x00a5;
    L_0x00a3:
        r2 = "main";
    L_0x00a5:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.ae.a(kotlin.reflect.jvm.internal.components.e):java.lang.String");
    }

    public static final ah b(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$instanceReceiverParameter");
        if (aVar.bsL() == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.k brj = aVar.brj();
        if (brj != null) {
            return ((d) brj).bte();
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.n, D extends kotlin.reflect.jvm.internal.impl.descriptors.a> D a(Class<?> cls, M m, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar, h hVar, kotlin.reflect.jvm.internal.impl.metadata.a.a aVar, m<? super kotlin.reflect.jvm.internal.impl.serialization.deserialization.p, ? super M, ? extends D> mVar) {
        List bAx;
        M m2 = m;
        m<? super kotlin.reflect.jvm.internal.impl.serialization.deserialization.p, ? super M, ? extends D> mVar2 = mVar;
        Class<?> cls2 = cls;
        kotlin.jvm.internal.i.f(cls, "moduleAnchor");
        kotlin.jvm.internal.i.f(m, "proto");
        kotlin.jvm.internal.i.f(cVar, "nameResolver");
        kotlin.jvm.internal.i.f(hVar, "typeTable");
        kotlin.jvm.internal.i.f(aVar, "metadataVersion");
        kotlin.jvm.internal.i.f(mVar2, "createDescriptor");
        kotlin.reflect.jvm.internal.components.j K = w.K(cls);
        if (m2 instanceof Function) {
            bAx = ((Function) m2).bAx();
        } else if (m2 instanceof Property) {
            bAx = ((Property) m2).bAx();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported message: ");
            stringBuilder.append(m);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
        List list = bAx;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.h bqm = K.bqm();
        kotlin.reflect.jvm.internal.impl.descriptors.k bql = K.bql();
        kotlin.reflect.jvm.internal.impl.metadata.a.k bHs = kotlin.reflect.jvm.internal.impl.metadata.a.k.fon.bHs();
        kotlin.jvm.internal.i.e(list, "typeParameters");
        return (kotlin.reflect.jvm.internal.impl.descriptors.a) mVar2.w(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.p(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.j(bqm, cVar, bql, hVar, bHs, aVar, null, null, list)), m);
    }
}
