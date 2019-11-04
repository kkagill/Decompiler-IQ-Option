package kotlin.reflect.jvm.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.b;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

@i(bne = {1, 1, 15}, bnf = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0001`B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010O\u001a\u00020%2\b\u0010P\u001a\u0004\u0018\u00010\u0002H\u0002J\u0016\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00132\u0006\u0010S\u001a\u00020TH\u0016J\u0012\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010W\u001a\u00020XH\u0016J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0\u00132\u0006\u0010S\u001a\u00020TH\u0016J\b\u0010Z\u001a\u00020XH\u0016J\u0012\u0010[\u001a\u00020%2\b\u0010\\\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010]\u001a\u00020^H\u0002J\b\u0010_\u001a\u00020<H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R3\u0010\u001a\u001a$\u0012 \u0012\u001e \u001d*\u000e\u0018\u00010\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&R\u0014\u0010'\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008@X\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001e\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0016R\u001e\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0016R\u0016\u00108\u001a\u0004\u0018\u00018\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010;\u001a\u0004\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\"\u0010?\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040\n8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\rR\u0016\u0010A\u001a\u0004\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010>R\u0014\u0010C\u001a\u0002008@X\u0004¢\u0006\u0006\u001a\u0004\bD\u00102R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\n8VX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\rR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\n8VX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\rR\u0016\u0010K\u001a\u0004\u0018\u00010L8VX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006a"}, bng = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "kotlin.jvm.PlatformType", "getData", "()Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "isAbstract", "", "()Z", "isCompanion", "isData", "isFinal", "isInner", "isOpen", "isSealed", "getJClass", "()Ljava/lang/Class;", "memberScope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflect_api", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "getSealedSubclasses", "simpleName", "getSimpleName", "staticScope", "getStaticScope$kotlin_reflect_api", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", "", "getProperties", "hashCode", "isInstance", "value", "reportUnresolvedClass", "", "toString", "Data", "kotlin-reflect-api"})
/* compiled from: KClassImpl.kt */
public final class g<T> extends KDeclarationContainerImpl implements b<T> {
    private final Class<T> eVY;
    private final x.b<a> eWW;

    @i(bne = {1, 1, 15}, bnf = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010N\u001a\u00020<2\n\u0010O\u001a\u0006\u0012\u0002\b\u00030PH\u0002R%\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR%\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR%\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R-\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00058FX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\bR%\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\bR%\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b!\u0010\bR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\bR\u001b\u0010&\u001a\u00020'8FX\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010)R%\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b,\u0010\bR%\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0002¢\u0006\f\n\u0004\b0\u0010\n\u001a\u0004\b/\u0010\bR%\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003020\u00058FX\u0002¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b3\u0010\bR#\u00105\u001a\u0004\u0018\u00018\u00008FX\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u00108R\u001d\u0010;\u001a\u0004\u0018\u00010<8FX\u0002¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b=\u0010>R)\u0010@\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u0000020\u00128FX\u0002¢\u0006\f\n\u0004\bB\u0010\n\u001a\u0004\bA\u0010\u0015R\u001d\u0010C\u001a\u0004\u0018\u00010<8FX\u0002¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bD\u0010>R!\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00128FX\u0002¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bH\u0010\u0015R!\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00128FX\u0002¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bL\u0010\u0015¨\u0006Q"}, bng = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "allMembers", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getAllMembers", "()Ljava/util/Collection;", "allMembers$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "allNonStaticMembers", "getAllNonStaticMembers", "allNonStaticMembers$delegate", "allStaticMembers", "getAllStaticMembers", "allStaticMembers$delegate", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "constructors", "Lkotlin/reflect/KFunction;", "constructors$annotations", "()V", "getConstructors", "constructors$delegate", "declaredMembers", "getDeclaredMembers", "declaredMembers$delegate", "declaredNonStaticMembers", "getDeclaredNonStaticMembers", "declaredNonStaticMembers$delegate", "declaredStaticMembers", "getDeclaredStaticMembers", "declaredStaticMembers$delegate", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor$delegate", "inheritedNonStaticMembers", "getInheritedNonStaticMembers", "inheritedNonStaticMembers$delegate", "inheritedStaticMembers", "getInheritedStaticMembers", "inheritedStaticMembers$delegate", "nestedClasses", "Lkotlin/reflect/KClass;", "getNestedClasses", "nestedClasses$delegate", "objectInstance", "objectInstance$annotations", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "qualifiedName$delegate", "sealedSubclasses", "getSealedSubclasses", "sealedSubclasses$delegate", "simpleName", "getSimpleName", "simpleName$delegate", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "supertypes$delegate", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters$delegate", "calculateLocalClassName", "jClass", "Ljava/lang/Class;", "kotlin-reflect-api"})
    /* compiled from: KClassImpl.kt */
    public final class a extends KDeclarationContainerImpl.b {
        static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k.a(new PropertyReference1Impl(k.G(a.class), "annotations", "getAnnotations()Ljava/util/List;")), k.a(new PropertyReference1Impl(k.G(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), k.a(new PropertyReference1Impl(k.G(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), k.a(new PropertyReference1Impl(k.G(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), k.a(new PropertyReference1Impl(k.G(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), k.a(new PropertyReference1Impl(k.G(a.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), k.a(new PropertyReference1Impl(k.G(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), k.a(new PropertyReference1Impl(k.G(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), k.a(new PropertyReference1Impl(k.G(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), k.a(new PropertyReference1Impl(k.G(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), k.a(new PropertyReference1Impl(k.G(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), k.a(new PropertyReference1Impl(k.G(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), k.a(new PropertyReference1Impl(k.G(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), k.a(new PropertyReference1Impl(k.G(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), k.a(new PropertyReference1Impl(k.G(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), k.a(new PropertyReference1Impl(k.G(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), k.a(new PropertyReference1Impl(k.G(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        private final kotlin.reflect.jvm.internal.x.a eWX = x.e(new KClassImpl$Data$descriptor$2(this));
        private final kotlin.reflect.jvm.internal.x.a eWY = x.e(new KClassImpl$Data$annotations$2(this));
        private final kotlin.reflect.jvm.internal.x.a eWZ = x.e(new KClassImpl$Data$simpleName$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXa = x.e(new KClassImpl$Data$qualifiedName$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXb = x.e(new KClassImpl$Data$constructors$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXc = x.e(new KClassImpl$Data$nestedClasses$2(this));
        private final x.b eXd = x.d(new KClassImpl$Data$objectInstance$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXe = x.e(new KClassImpl$Data$typeParameters$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXf = x.e(new KClassImpl$Data$supertypes$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXg = x.e(new KClassImpl$Data$sealedSubclasses$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXh = x.e(new KClassImpl$Data$declaredNonStaticMembers$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXi = x.e(new KClassImpl$Data$declaredStaticMembers$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXj = x.e(new KClassImpl$Data$inheritedNonStaticMembers$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXk = x.e(new KClassImpl$Data$inheritedStaticMembers$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXl = x.e(new KClassImpl$Data$allNonStaticMembers$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXm = x.e(new KClassImpl$Data$allStaticMembers$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXn = x.e(new KClassImpl$Data$declaredMembers$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXo = x.e(new KClassImpl$Data$allMembers$2(this));

        private final Collection<e<?>> boN() {
            return (Collection) this.eXi.B(this, anY[11]);
        }

        private final Collection<e<?>> boO() {
            return (Collection) this.eXj.B(this, anY[12]);
        }

        private final Collection<e<?>> boP() {
            return (Collection) this.eXk.B(this, anY[13]);
        }

        public final String bnD() {
            return (String) this.eXa.B(this, anY[3]);
        }

        public final d boI() {
            return (d) this.eWX.B(this, anY[0]);
        }

        public final Collection<e<?>> boM() {
            return (Collection) this.eXh.B(this, anY[10]);
        }

        public final Collection<e<?>> boQ() {
            return (Collection) this.eXl.B(this, anY[14]);
        }

        public final Collection<e<?>> boR() {
            return (Collection) this.eXm.B(this, anY[15]);
        }

        public final String getSimpleName() {
            return (String) this.eWZ.B(this, anY[2]);
        }

        public a() {
            super();
        }

        private final String J(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            String str = "$";
            String str2 = ConditionalUserProperty.NAME;
            if (enclosingMethod != null) {
                kotlin.jvm.internal.i.e(simpleName, str2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(enclosingMethod.getName());
                stringBuilder.append(str);
                return v.b(simpleName, stringBuilder.toString(), null, 2, null);
            }
            Constructor enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                kotlin.jvm.internal.i.e(simpleName, str2);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(enclosingConstructor.getName());
                stringBuilder2.append(str);
                return v.b(simpleName, stringBuilder2.toString(), null, 2, null);
            }
            kotlin.jvm.internal.i.e(simpleName, str2);
            return v.b(simpleName, '$', null, 2, null);
        }
    }

    public g(Class<T> cls) {
        kotlin.jvm.internal.i.f(cls, "jClass");
        this.eVY = cls;
        x.b d = x.d(new KClassImpl$data$1(this));
        kotlin.jvm.internal.i.e(d, "ReflectProperties.lazy { Data() }");
        this.eWW = d;
    }

    public Class<T> bnC() {
        return this.eVY;
    }

    public final x.b<a> boH() {
        return this.eWW;
    }

    public d boI() {
        return ((a) this.eWW.invoke()).boI();
    }

    private final kotlin.reflect.jvm.internal.impl.name.a getClassId() {
        return ab.eYn.L(bnC());
    }

    public final h boJ() {
        return boI().bsY().bsF();
    }

    public final h boK() {
        h brl = boI().brl();
        kotlin.jvm.internal.i.e(brl, "descriptor.staticScope");
        return brl;
    }

    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.j> bog() {
        d boI = boI();
        if (boI.brt() == ClassKind.INTERFACE || boI.brt() == ClassKind.OBJECT) {
            return m.emptyList();
        }
        Collection brs = boI.brs();
        kotlin.jvm.internal.i.e(brs, "descriptor.constructors");
        return brs;
    }

    public Collection<ae> a(f fVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        return u.b(boJ().a(fVar, NoLookupLocation.FROM_REFLECTION), (Iterable) boK().a(fVar, NoLookupLocation.FROM_REFLECTION));
    }

    public Collection<s> b(f fVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        return u.b(boJ().b(fVar, NoLookupLocation.FROM_REFLECTION), (Iterable) boK().b(fVar, NoLookupLocation.FROM_REFLECTION));
    }

    public ae jM(int i) {
        if (kotlin.jvm.internal.i.y(bnC().getSimpleName(), "DefaultImpls")) {
            Class declaringClass = bnC().getDeclaringClass();
            if (declaringClass != null && declaringClass.isInterface()) {
                b F = kotlin.jvm.a.F(declaringClass);
                if (F != null) {
                    return ((g) F).jM(i);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            }
        }
        d boI = boI();
        ae aeVar = null;
        if (!(boI instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d)) {
            boI = null;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d) boI;
        if (dVar != null) {
            ExtendableMessage bOJ = dVar.bOJ();
            e eVar = JvmProtoBuf.foz;
            kotlin.jvm.internal.i.e(eVar, "JvmProtoBuf.classLocalVariable");
            Property property = (Property) kotlin.reflect.jvm.internal.impl.metadata.a.f.a(bOJ, eVar, i);
            if (property != null) {
                aeVar = (ae) ae.a(bnC(), property, dVar.bOB().bot(), dVar.bOB().bou(), dVar.bOK(), KClassImpl$getLocalProperty$2$1$1.eXq);
            }
        }
        return aeVar;
    }

    public String getSimpleName() {
        return ((a) this.eWW.invoke()).getSimpleName();
    }

    public String bnD() {
        return ((a) this.eWW.invoke()).bnD();
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && kotlin.jvm.internal.i.y(kotlin.jvm.a.c(this), kotlin.jvm.a.c((b) obj));
    }

    public int hashCode() {
        return kotlin.jvm.a.c(this).hashCode();
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("class ");
        kotlin.reflect.jvm.internal.impl.name.a classId = getClassId();
        kotlin.reflect.jvm.internal.impl.name.b packageFqName = classId.getPackageFqName();
        kotlin.jvm.internal.i.e(packageFqName, "classId.packageFqName");
        if (packageFqName.isRoot()) {
            str = "";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(packageFqName.boi());
            stringBuilder.append(".");
            str = stringBuilder.toString();
        }
        String boi = classId.bJU().boi();
        kotlin.jvm.internal.i.e(boi, "classId.relativeClassName.asString()");
        String a = u.a(boi, '.', '$', false, 4, null);
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(a);
        stringBuilder2.append(stringBuilder.toString());
        return stringBuilder2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    private final java.lang.Void boL() {
        /*
        r4 = this;
        r0 = kotlin.reflect.jvm.internal.components.e.eYT;
        r1 = r4.bnC();
        r0 = r0.O(r1);
        if (r0 == 0) goto L_0x0017;
    L_0x000c:
        r0 = r0.bqj();
        if (r0 == 0) goto L_0x0017;
    L_0x0012:
        r0 = r0.byV();
        goto L_0x0018;
    L_0x0017:
        r0 = 0;
    L_0x0018:
        if (r0 == 0) goto L_0x0099;
    L_0x001a:
        r1 = kotlin.reflect.jvm.internal.h.aob;
        r2 = r0.ordinal();
        r1 = r1[r2];
        switch(r1) {
            case 1: goto L_0x0077;
            case 2: goto L_0x0077;
            case 3: goto L_0x0077;
            case 4: goto L_0x0055;
            case 5: goto L_0x002b;
            case 6: goto L_0x0099;
            default: goto L_0x0025;
        };
    L_0x0025:
        r0 = new kotlin.NoWhenBranchMatchedException;
        r0.<init>();
        throw r0;
    L_0x002b:
        r1 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Unknown class: ";
        r2.append(r3);
        r3 = r4.bnC();
        r2.append(r3);
        r3 = " (kind = ";
        r2.append(r3);
        r2.append(r0);
        r0 = 41;
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        r1 = (java.lang.Throwable) r1;
        throw r1;
    L_0x0055:
        r0 = new java.lang.UnsupportedOperationException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection ";
        r1.append(r2);
        r2 = "library has no idea what declarations does it have. Please use Java reflection to inspect this class: ";
        r1.append(r2);
        r2 = r4.bnC();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r0 = (java.lang.Throwable) r0;
        throw r0;
    L_0x0077:
        r0 = new java.lang.UnsupportedOperationException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Packages and file facades are not yet supported in Kotlin reflection. ";
        r1.append(r2);
        r2 = "Meanwhile please use Java reflection to inspect this class: ";
        r1.append(r2);
        r2 = r4.bnC();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r0 = (java.lang.Throwable) r0;
        throw r0;
    L_0x0099:
        r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unresolved class: ";
        r1.append(r2);
        r2 = r4.bnC();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r0 = (java.lang.Throwable) r0;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.g.boL():java.lang.Void");
    }
}
