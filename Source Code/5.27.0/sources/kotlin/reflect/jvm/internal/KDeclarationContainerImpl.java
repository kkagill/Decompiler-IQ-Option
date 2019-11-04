package kotlin.reflect.jvm.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.l;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.text.Regex;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\b\b \u0018\u0000 =2\u00020\u0001:\u0003=>?B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0013J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011J\u0018\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010#\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00042\u0006\u0010\u001d\u001a\u00020%H&J\u0012\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010'\u001a\u00020(H&J\"\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0\u00042\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0004J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u001d\u001a\u00020%H&J\u001a\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t012\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u00102\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u00103\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020(H\u0002J=\u00106\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t082\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0002\u0010:J8\u00106\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t012\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J(\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\t2\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t01H\u0002J=\u0010<\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t082\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0002\u0010:R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8TX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006@"}, bng = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "()V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "addParametersAndMasks", "", "result", "", "desc", "", "isConstructor", "", "createProperty", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "findConstructorBySignature", "Ljava/lang/reflect/Constructor;", "findDefaultConstructor", "findDefaultMethod", "Ljava/lang/reflect/Method;", "name", "isMember", "findFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "signature", "findMethodBySignature", "findPropertyDescriptor", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "index", "", "getMembers", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "belonginess", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "getProperties", "loadParameterTypes", "", "loadReturnType", "parseType", "begin", "end", "lookupMethod", "parameterTypes", "", "returnType", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "tryGetConstructor", "tryGetMethod", "Companion", "Data", "MemberBelonginess", "kotlin-reflect-api"})
/* compiled from: KDeclarationContainerImpl.kt */
public abstract class KDeclarationContainerImpl implements kotlin.jvm.internal.c {
    private static final Class<?> eXr = Class.forName("kotlin.jvm.internal.f");
    private static final Regex eXs = new Regex("<v#(\\d+)>");
    public static final a eXt = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, bng = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "(Ljava/lang/String;I)V", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflect-api"})
    /* compiled from: KDeclarationContainerImpl.kt */
    protected enum MemberBelonginess {
        DECLARED,
        INHERITED;

        public final boolean accept(CallableMemberDescriptor callableMemberDescriptor) {
            kotlin.jvm.internal.i.f(callableMemberDescriptor, "member");
            Kind bsT = callableMemberDescriptor.bsT();
            kotlin.jvm.internal.i.e(bsT, "member.kind");
            return bsT.isReal() == (((MemberBelonginess) this) == DECLARED);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, bng = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "()V", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflect_api", "()Lkotlin/text/Regex;", "kotlin-reflect-api"})
    /* compiled from: KDeclarationContainerImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final Regex boY() {
            return KDeclarationContainerImpl.eXs;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b¦\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "moduleData", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "getModuleData", "()Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "moduleData$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin-reflect-api"})
    /* compiled from: KDeclarationContainerImpl.kt */
    public abstract class b {
        static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), "moduleData", "getModuleData()Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;"))};
        private final kotlin.reflect.jvm.internal.x.a eXu = x.e(new KDeclarationContainerImpl$Data$moduleData$2(this));

        public final kotlin.reflect.jvm.internal.components.j boZ() {
            return (kotlin.reflect.jvm.internal.components.j) this.eXu.B(this, anY[0]);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "first", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "kotlin.jvm.PlatformType", "second", "compare"})
    /* compiled from: KDeclarationContainerImpl.kt */
    static final class c<T> implements Comparator<aw> {
        public static final c eXy = new c();

        c() {
        }

        /* renamed from: a */
        public final int compare(aw awVar, aw awVar2) {
            Integer c = av.c(awVar, awVar2);
            return c != null ? c.intValue() : 0;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001J!\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, bng = {"kotlin/reflect/jvm/internal/KDeclarationContainerImpl$getMembers$visitor$1", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorVisitorEmptyBodies;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "visitConstructorDescriptor", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "data", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "visitFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "visitPropertyDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin-reflect-api"})
    /* compiled from: KDeclarationContainerImpl.kt */
    public static final class d extends l<e<?>, kotlin.l> {
        final /* synthetic */ KDeclarationContainerImpl eXv;

        d(KDeclarationContainerImpl kDeclarationContainerImpl) {
            this.eXv = kDeclarationContainerImpl;
        }

        public e<?> a(ae aeVar, kotlin.l lVar) {
            kotlin.jvm.internal.i.f(aeVar, "descriptor");
            kotlin.jvm.internal.i.f(lVar, "data");
            return this.eXv.a(aeVar);
        }

        public e<?> a(s sVar, kotlin.l lVar) {
            kotlin.jvm.internal.i.f(sVar, "descriptor");
            kotlin.jvm.internal.i.f(lVar, "data");
            return new i(this.eXv, sVar);
        }

        public e<?> a(kotlin.reflect.jvm.internal.impl.descriptors.j jVar, kotlin.l lVar) {
            kotlin.jvm.internal.i.f(jVar, "descriptor");
            kotlin.jvm.internal.i.f(lVar, "data");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No constructors should appear in this scope: ");
            stringBuilder.append(jVar);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public abstract Collection<ae> a(f fVar);

    public abstract Collection<s> b(f fVar);

    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.j> bog();

    public abstract ae jM(int i);

    /* Access modifiers changed, original: protected */
    public Class<?> boW() {
        Class<?> T = kotlin.reflect.jvm.internal.structure.b.T(bnC());
        return T != null ? T : bnC();
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0022 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    public final java.util.Collection<kotlin.reflect.jvm.internal.e<?>> a(kotlin.reflect.jvm.internal.impl.resolve.scopes.h r8, kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess r9) {
        /*
        r7 = this;
        r0 = "scope";
        kotlin.jvm.internal.i.f(r8, r0);
        r0 = "belonginess";
        kotlin.jvm.internal.i.f(r9, r0);
        r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$d;
        r0.<init>(r7);
        r1 = 0;
        r2 = 3;
        r8 = kotlin.reflect.jvm.internal.impl.resolve.scopes.j.a.a(r8, r1, r1, r2, r1);
        r8 = (java.lang.Iterable) r8;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r2 = (java.util.Collection) r2;
        r8 = r8.iterator();
    L_0x0022:
        r3 = r8.hasNext();
        if (r3 == 0) goto L_0x005c;
    L_0x0028:
        r3 = r8.next();
        r3 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r3;
        r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
        if (r4 == 0) goto L_0x0055;
    L_0x0032:
        r4 = r3;
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4;
        r5 = r4.brx();
        r6 = kotlin.reflect.jvm.internal.impl.descriptors.av.fdh;
        r5 = kotlin.jvm.internal.i.y(r5, r6);
        r5 = r5 ^ 1;
        if (r5 == 0) goto L_0x0055;
    L_0x0043:
        r4 = r9.accept(r4);
        if (r4 == 0) goto L_0x0055;
    L_0x0049:
        r4 = r0;
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.m) r4;
        r5 = kotlin.l.eVB;
        r3 = r3.a(r4, r5);
        r3 = (kotlin.reflect.jvm.internal.e) r3;
        goto L_0x0056;
    L_0x0055:
        r3 = r1;
    L_0x0056:
        if (r3 == 0) goto L_0x0022;
    L_0x0058:
        r2.add(r3);
        goto L_0x0022;
    L_0x005c:
        r2 = (java.util.List) r2;
        r2 = (java.lang.Iterable) r2;
        r8 = kotlin.collections.u.T(r2);
        r8 = (java.util.Collection) r8;
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess):java.util.Collection");
    }

    private final r<?> a(ae aeVar) {
        int i = 0;
        int i2 = aeVar.bsL() != null ? 1 : 0;
        if (aeVar.bsK() != null) {
            i = 1;
        }
        i2 += i;
        if (aeVar.btW()) {
            if (i2 == 0) {
                return new j(this, aeVar);
            }
            if (i2 == 1) {
                return new k(this, aeVar);
            }
            if (i2 == 2) {
                return new l(this, aeVar);
            }
        } else if (i2 == 0) {
            return new o(this, aeVar);
        } else {
            if (i2 == 1) {
                return new p(this, aeVar);
            }
            if (i2 == 2) {
                return new q(this, aeVar);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported property: ");
        stringBuilder.append(aeVar);
        throw new KotlinReflectionInternalError(stringBuilder.toString());
    }

    public final ae aY(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        kotlin.jvm.internal.i.f(str3, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str4, "signature");
        kotlin.text.i X = eXs.X(str4);
        int i = 1;
        if (X != null) {
            str3 = (String) X.bQG().bQH().bQF().get(1);
            ae jM = jM(Integer.parseInt(str3));
            if (jM != null) {
                return jM;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Local property #");
            stringBuilder.append(str3);
            stringBuilder.append(" not found in ");
            stringBuilder.append(bnC());
            throw new KotlinReflectionInternalError(stringBuilder.toString());
        }
        f ms = f.ms(str);
        String str5 = "Name.identifier(name)";
        kotlin.jvm.internal.i.e(ms, str5);
        Collection arrayList = new ArrayList();
        for (Object next : a(ms)) {
            if (kotlin.jvm.internal.i.y(ab.eYn.f((ae) next).boi(), str4)) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        String str6 = ") not resolved in ";
        String str7 = "' (JVM signature: ";
        String str8 = "Property '";
        if (list.isEmpty()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str8);
            stringBuilder2.append(str3);
            stringBuilder2.append(str7);
            stringBuilder2.append(str4);
            stringBuilder2.append(str6);
            stringBuilder2.append(this);
            throw new KotlinReflectionInternalError(stringBuilder2.toString());
        } else if (list.size() == 1) {
            return (ae) u.bY(list);
        } else {
            Map linkedHashMap = new LinkedHashMap();
            for (Object next2 : list) {
                aw brx = ((ae) next2).brx();
                ArrayList arrayList2 = linkedHashMap.get(brx);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(brx, arrayList2);
                }
                arrayList2.add(next2);
            }
            Collection values = ae.b(linkedHashMap, c.eXy).values();
            kotlin.jvm.internal.i.e(values, "properties\n             …                }).values");
            List list2 = (List) u.L(values);
            if (list2.size() == 1) {
                kotlin.jvm.internal.i.e(list2, "mostVisibleProperties");
                return (ae) u.bU(list2);
            }
            ms = f.ms(str);
            kotlin.jvm.internal.i.e(ms, str5);
            String a = u.a(a(ms), "\n", null, null, 0, null, KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1.eXx, 30, null);
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str8);
            stringBuilder3.append(str3);
            stringBuilder3.append(str7);
            stringBuilder3.append(str4);
            stringBuilder3.append(str6);
            stringBuilder3.append(this);
            stringBuilder3.append(':');
            if (a.length() != 0) {
                i = 0;
            }
            if (i != 0) {
                str3 = " no members found";
            } else {
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append(10);
                stringBuilder4.append(a);
                str3 = stringBuilder4.toString();
            }
            stringBuilder3.append(str3);
            throw new KotlinReflectionInternalError(stringBuilder3.toString());
        }
    }

    public final s aZ(String str, String str2) {
        Collection T;
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str2, "signature");
        if (kotlin.jvm.internal.i.y(str, "<init>")) {
            T = u.T(bog());
        } else {
            f ms = f.ms(str);
            kotlin.jvm.internal.i.e(ms, "Name.identifier(name)");
            T = b(ms);
        }
        Iterable iterable = T;
        T = new ArrayList();
        for (Object next : iterable) {
            if (kotlin.jvm.internal.i.y(ab.eYn.d((s) next).boi(), str2)) {
                T.add(next);
            }
        }
        List list = (List) T;
        Object obj = 1;
        if (list.size() == 1) {
            return (s) u.bY(list);
        }
        String a = u.a(iterable, "\n", null, null, 0, null, KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1.eXw, 30, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Function '");
        stringBuilder.append(str);
        stringBuilder.append("' (JVM signature: ");
        stringBuilder.append(str2);
        stringBuilder.append(") not resolved in ");
        stringBuilder.append(this);
        stringBuilder.append(':');
        if (a.length() != 0) {
            obj = null;
        }
        if (obj != null) {
            str = " no members found";
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(10);
            stringBuilder2.append(a);
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        throw new KotlinReflectionInternalError(stringBuilder.toString());
    }

    private final Method a(Class<?> cls, String str, List<? extends Class<?>> list, Class<?> cls2) {
        Collection collection = list;
        String str2 = "null cannot be cast to non-null type java.util.Collection<T>";
        if (collection != null) {
            Object[] toArray = collection.toArray(new Class[0]);
            String str3 = "null cannot be cast to non-null type kotlin.Array<T>";
            if (toArray != null) {
                Method a = a((Class) cls, str, (Class[]) toArray, (Class) cls2);
                if (a != null) {
                    return a;
                }
                if (cls.isInterface()) {
                    Class cls3 = Object.class;
                    if (collection != null) {
                        Object[] toArray2 = collection.toArray(new Class[0]);
                        if (toArray2 != null) {
                            Method a2 = a(cls3, str, (Class[]) toArray2, (Class) cls2);
                            if (a2 != null) {
                                return a2;
                            }
                        }
                        throw new TypeCastException(str3);
                    }
                    throw new TypeCastException(str2);
                }
                return null;
            }
            throw new TypeCastException(str3);
        }
        throw new TypeCastException(str2);
    }

    private final Method a(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        Method b = b(cls, str, clsArr, cls2);
        if (b != null) {
            return b;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            b = a(superclass, str, (Class[]) clsArr, (Class) cls2);
            if (b != null) {
                return b;
            }
        }
        for (Class cls3 : cls.getInterfaces()) {
            kotlin.jvm.internal.i.e(cls3, "superInterface");
            Method a = a(cls3, str, (Class[]) clsArr, (Class) cls2);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A:{LOOP_END, LOOP:0: B:6:0x0029->B:20:0x005c} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a A:{SYNTHETIC} */
    private final java.lang.reflect.Method b(java.lang.Class<?> r7, java.lang.String r8, java.lang.Class<?>[] r9, java.lang.Class<?> r10) {
        /*
        r6 = this;
        r0 = 0;
        r1 = r9.length;	 Catch:{ NoSuchMethodException -> 0x005f }
        r1 = java.util.Arrays.copyOf(r9, r1);	 Catch:{ NoSuchMethodException -> 0x005f }
        r1 = (java.lang.Class[]) r1;	 Catch:{ NoSuchMethodException -> 0x005f }
        r1 = r7.getDeclaredMethod(r8, r1);	 Catch:{ NoSuchMethodException -> 0x005f }
        r2 = "result";
        kotlin.jvm.internal.i.e(r1, r2);	 Catch:{ NoSuchMethodException -> 0x005f }
        r2 = r1.getReturnType();	 Catch:{ NoSuchMethodException -> 0x005f }
        r2 = kotlin.jvm.internal.i.y(r2, r10);	 Catch:{ NoSuchMethodException -> 0x005f }
        if (r2 == 0) goto L_0x001d;
    L_0x001b:
        r0 = r1;
        goto L_0x005f;
    L_0x001d:
        r7 = r7.getDeclaredMethods();	 Catch:{ NoSuchMethodException -> 0x005f }
        r1 = "declaredMethods";
        kotlin.jvm.internal.i.e(r7, r1);	 Catch:{ NoSuchMethodException -> 0x005f }
        r1 = r7.length;	 Catch:{ NoSuchMethodException -> 0x005f }
        r2 = 0;
        r3 = 0;
    L_0x0029:
        if (r3 >= r1) goto L_0x005f;
    L_0x002b:
        r4 = r7[r3];	 Catch:{ NoSuchMethodException -> 0x005f }
        r5 = "method";
        kotlin.jvm.internal.i.e(r4, r5);	 Catch:{ NoSuchMethodException -> 0x005f }
        r5 = r4.getName();	 Catch:{ NoSuchMethodException -> 0x005f }
        r5 = kotlin.jvm.internal.i.y(r5, r8);	 Catch:{ NoSuchMethodException -> 0x005f }
        if (r5 == 0) goto L_0x0057;
    L_0x003c:
        r5 = r4.getReturnType();	 Catch:{ NoSuchMethodException -> 0x005f }
        r5 = kotlin.jvm.internal.i.y(r5, r10);	 Catch:{ NoSuchMethodException -> 0x005f }
        if (r5 == 0) goto L_0x0057;
    L_0x0046:
        r5 = r4.getParameterTypes();	 Catch:{ NoSuchMethodException -> 0x005f }
        if (r5 != 0) goto L_0x004f;
    L_0x004c:
        kotlin.jvm.internal.i.bnJ();	 Catch:{ NoSuchMethodException -> 0x005f }
    L_0x004f:
        r5 = java.util.Arrays.equals(r5, r9);	 Catch:{ NoSuchMethodException -> 0x005f }
        if (r5 == 0) goto L_0x0057;
    L_0x0055:
        r5 = 1;
        goto L_0x0058;
    L_0x0057:
        r5 = 0;
    L_0x0058:
        if (r5 == 0) goto L_0x005c;
    L_0x005a:
        r0 = r4;
        goto L_0x005f;
    L_0x005c:
        r3 = r3 + 1;
        goto L_0x0029;
    L_0x005f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.b(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Class):java.lang.reflect.Method");
    }

    private final Constructor<?> a(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Collection collection = list;
            if (collection != null) {
                Object[] toArray = collection.toArray(new Class[0]);
                if (toArray != null) {
                    Class[] clsArr = (Class[]) toArray;
                    return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method ba(String str, String str2) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str2, "desc");
        if (kotlin.jvm.internal.i.y(str, "<init>")) {
            return null;
        }
        return a(boW(), str, lL(str2), lM(str2));
    }

    public final Method u(String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str2, "desc");
        if (kotlin.jvm.internal.i.y(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(bnC());
        }
        List list = arrayList;
        a(list, str2, false);
        Class boW = boW();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("$default");
        return a(boW, stringBuilder.toString(), list, lM(str2));
    }

    public final Constructor<?> lJ(String str) {
        kotlin.jvm.internal.i.f(str, "desc");
        return a(bnC(), lL(str));
    }

    public final Constructor<?> lK(String str) {
        kotlin.jvm.internal.i.f(str, "desc");
        Class bnC = bnC();
        List arrayList = new ArrayList();
        a(arrayList, str, true);
        return a(bnC, arrayList);
    }

    private final void a(List<Class<?>> list, String str, boolean z) {
        List lL = lL(str);
        list.addAll(lL);
        int size = ((lL.size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            kotlin.jvm.internal.i.e(cls, "Integer.TYPE");
            list.add(cls);
        }
        Object obj = z ? eXr : Object.class;
        kotlin.jvm.internal.i.e(obj, "if (isConstructor) DEFAU…RKER else Any::class.java");
        list.add(obj);
    }

    private final List<Class<?>> lL(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char charAt = str.charAt(i2);
            if (v.c((CharSequence) "VZCBSIFJD", charAt, false, 2, null)) {
                i2++;
            } else if (charAt == 'L') {
                i2 = v.a((CharSequence) str, ';', i, false, 4, null) + 1;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown type prefix in the method signature: ");
                stringBuilder.append(str);
                throw new KotlinReflectionInternalError(stringBuilder.toString());
            }
            arrayList.add(h(str, i, i2));
            i = i2;
        }
        return arrayList;
    }

    private final Class<?> h(String str, int i, int i2) {
        char charAt = str.charAt(i);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        Class<?> loadClass;
        if (charAt == 'L') {
            ClassLoader Q = kotlin.reflect.jvm.internal.structure.b.Q(bnC());
            i++;
            i2--;
            if (str != null) {
                String substring = str.substring(i, i2);
                kotlin.jvm.internal.i.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                loadClass = Q.loadClass(u.a(substring, '/', '.', false, 4, null));
                kotlin.jvm.internal.i.e(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
                return loadClass;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } else if (charAt == 'S') {
            return Short.TYPE;
        } else {
            if (charAt == 'V') {
                loadClass = Void.TYPE;
                kotlin.jvm.internal.i.e(loadClass, "Void.TYPE");
                return loadClass;
            } else if (charAt == 'I') {
                return Integer.TYPE;
            } else {
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (charAt == '[') {
                    return kotlin.reflect.jvm.internal.structure.b.W(h(str, i + 1, i2));
                }
                switch (charAt) {
                    case 'B':
                        return Byte.TYPE;
                    case 'C':
                        return Character.TYPE;
                    case 'D':
                        return Double.TYPE;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown type prefix in the method signature: ");
                        stringBuilder.append(str);
                        throw new KotlinReflectionInternalError(stringBuilder.toString());
                }
            }
        }
    }

    private final Class<?> lM(String str) {
        return h(str, v.a((CharSequence) str, ')', 0, false, 6, null) + 1, str.length());
    }
}
