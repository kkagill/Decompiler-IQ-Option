package kotlin.reflect.jvm.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import kotlin.Triple;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.components.e;
import kotlin.reflect.jvm.internal.impl.descriptors.aa;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.a.c;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.n;
import kotlin.reflect.jvm.internal.x.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001,B\u001d\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\b2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012 \u000f*\b\u0018\u00010\u000eR\u00020\u00000\u000eR\u00020\u00000\rX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00038TX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, bng = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "jClass", "Ljava/lang/Class;", "usageModuleName", "", "(Ljava/lang/Class;Ljava/lang/String;)V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "kotlin.jvm.PlatformType", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "methodOwner", "getMethodOwner", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "getUsageModuleName", "()Ljava/lang/String;", "equals", "", "other", "", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", "", "getProperties", "hashCode", "toString", "Data", "kotlin-reflect-api"})
/* compiled from: KPackageImpl.kt */
public final class m extends KDeclarationContainerImpl {
    private final Class<?> eVY;
    private final b<a> eWW;
    private final String eXH;

    @i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR%\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00108FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R/\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00168FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f8FX\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010!¨\u0006#"}, bng = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PackageViewDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PackageViewDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlinClass", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "getKotlinClass", "()Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "kotlinClass$delegate", "members", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getMembers", "()Ljava/util/Collection;", "members$delegate", "metadata", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "getMetadata", "()Lkotlin/Triple;", "metadata$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "methodOwner$delegate", "kotlin-reflect-api"})
    /* compiled from: KPackageImpl.kt */
    private final class a extends KDeclarationContainerImpl.b {
        static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "kotlinClass", "getKotlinClass()Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;")), k.a(new PropertyReference1Impl(k.G(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PackageViewDescriptor;")), k.a(new PropertyReference1Impl(k.G(a.class), "methodOwner", "getMethodOwner()Ljava/lang/Class;")), k.a(new PropertyReference1Impl(k.G(a.class), "metadata", "getMetadata()Lkotlin/Triple;")), k.a(new PropertyReference1Impl(k.G(a.class), "members", "getMembers()Ljava/util/Collection;"))};
        private final kotlin.reflect.jvm.internal.x.a eWX = x.e(new KPackageImpl$Data$descriptor$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXI = x.e(new KPackageImpl$Data$kotlinClass$2(this));
        private final b eXJ = x.d(new KPackageImpl$Data$methodOwner$2(this));
        private final b eXK = x.d(new KPackageImpl$Data$metadata$2(this));
        private final kotlin.reflect.jvm.internal.x.a eXL = x.e(new KPackageImpl$Data$members$2(this));

        private final e bpp() {
            return (e) this.eXI.B(this, anY[0]);
        }

        public final Class<?> boW() {
            return (Class) this.eXJ.B(this, anY[2]);
        }

        public final aa bpq() {
            return (aa) this.eWX.B(this, anY[1]);
        }

        public final Triple<h, Package, g> bpr() {
            return (Triple) this.eXK.B(this, anY[3]);
        }

        public a() {
            super();
        }
    }

    public Class<?> bnC() {
        return this.eVY;
    }

    public m(Class<?> cls, String str) {
        kotlin.jvm.internal.i.f(cls, "jClass");
        this.eVY = cls;
        this.eXH = str;
        b d = x.d(new KPackageImpl$data$1(this));
        kotlin.jvm.internal.i.e(d, "ReflectProperties.lazy { Data() }");
        this.eWW = d;
    }

    /* Access modifiers changed, original: protected */
    public Class<?> boW() {
        return ((a) this.eWW.invoke()).boW();
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h bpo() {
        return ((a) this.eWW.invoke()).bpq().bsF();
    }

    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.j> bog() {
        return m.emptyList();
    }

    public Collection<ae> a(f fVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        return bpo().a(fVar, NoLookupLocation.FROM_REFLECTION);
    }

    public Collection<s> b(f fVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        return bpo().b(fVar, NoLookupLocation.FROM_REFLECTION);
    }

    public ae jM(int i) {
        Triple bpr = ((a) this.eWW.invoke()).bpr();
        if (bpr == null) {
            return null;
        }
        h hVar = (h) bpr.bnj();
        Package packageR = (Package) bpr.bnk();
        g gVar = (g) bpr.bnm();
        ExtendableMessage extendableMessage = packageR;
        GeneratedMessageLite.e eVar = JvmProtoBuf.foC;
        kotlin.jvm.internal.i.e(eVar, "JvmProtoBuf.packageLocalVariable");
        Property property = (Property) kotlin.reflect.jvm.internal.impl.metadata.a.f.a(extendableMessage, eVar, i);
        if (property == null) {
            return null;
        }
        Class bnC = bnC();
        n nVar = property;
        c cVar = hVar;
        TypeTable bAP = packageR.bAP();
        kotlin.jvm.internal.i.e(bAP, "packageProto.typeTable");
        return (ae) ae.a(bnC, nVar, cVar, new kotlin.reflect.jvm.internal.impl.metadata.a.h(bAP), gVar, KPackageImpl$getLocalProperty$1$1$1.eXM);
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && kotlin.jvm.internal.i.y(bnC(), ((m) obj).bnC());
    }

    public int hashCode() {
        return bnC().hashCode();
    }

    public String toString() {
        String str;
        kotlin.reflect.jvm.internal.impl.name.b packageFqName = kotlin.reflect.jvm.internal.structure.b.U(bnC()).getPackageFqName();
        kotlin.jvm.internal.i.e(packageFqName, "jClass.classId.packageFqName");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("package ");
        if (packageFqName.isRoot()) {
            str = "<default>";
        } else {
            str = packageFqName.boi();
            kotlin.jvm.internal.i.e(str, "fqName.asString()");
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
