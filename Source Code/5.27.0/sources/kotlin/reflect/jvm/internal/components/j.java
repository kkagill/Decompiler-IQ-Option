package kotlin.reflect.jvm.internal.components;

import kotlin.i;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.e;
import kotlin.reflect.jvm.internal.impl.descriptors.am;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.v;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.incremental.components.c;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.a.b;
import kotlin.reflect.jvm.internal.impl.load.java.components.g;
import kotlin.reflect.jvm.internal.impl.load.java.components.k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.h;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, bng = {"Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "", "deserialization", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/DeserializationComponents;", "packagePartProvider", "Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;", "(Lorg/jetbrains/kotlin/serialization/deserialization/DeserializationComponents;Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;)V", "getDeserialization", "()Lorg/jetbrains/kotlin/serialization/deserialization/DeserializationComponents;", "module", "Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;", "getModule", "()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "getPackagePartProvider", "()Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;", "Companion", "descriptors.runtime"})
/* compiled from: RuntimeModuleData.kt */
public final class j {
    public static final a eYY = new a();
    private final h eYW;
    private final k eYX;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lkotlin/reflect/jvm/internal/components/RuntimeModuleData$Companion;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "classLoader", "Ljava/lang/ClassLoader;", "descriptors.runtime"})
    /* compiled from: RuntimeModuleData.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final j b(ClassLoader classLoader) {
            ClassLoader classLoader2 = classLoader;
            kotlin.jvm.internal.i.f(classLoader2, "classLoader");
            kotlin.reflect.jvm.internal.impl.storage.h lockBasedStorageManager = new LockBasedStorageManager("RuntimeModuleData");
            kotlin.reflect.jvm.internal.impl.storage.h hVar = lockBasedStorageManager;
            e eVar = new e(lockBasedStorageManager, false, 2, null);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<runtime module for ");
            stringBuilder.append(classLoader2);
            stringBuilder.append('>');
            f mu = f.mu(stringBuilder.toString());
            kotlin.jvm.internal.i.e(mu, "Name.special(\"<runtime module for $classLoader>\")");
            e eVar2 = eVar;
            v vVar = r3;
            v vVar2 = new v(mu, lockBasedStorageManager, eVar, null, null, null, 56, null);
            f fVar = new f(classLoader2);
            d dVar = r11;
            d dVar2 = new d();
            l lVar = new l();
            k kVar = new k(classLoader2);
            g gVar = g.fil;
            g gVar2 = gVar;
            kotlin.reflect.jvm.internal.impl.descriptors.v vVar3 = vVar;
            kotlin.reflect.jvm.internal.impl.descriptors.v vVar4 = vVar3;
            x xVar = new x(lockBasedStorageManager, vVar3);
            AnnotationTypeQualifierResolver annotationTypeQualifierResolver = r6;
            AnnotationTypeQualifierResolver annotationTypeQualifierResolver2 = new AnnotationTypeQualifierResolver(lockBasedStorageManager, kotlin.reflect.jvm.internal.impl.utils.e.fzW);
            kotlin.reflect.jvm.internal.impl.load.java.h cVar = new c(classLoader2);
            kotlin.reflect.jvm.internal.impl.load.kotlin.l lVar2 = fVar;
            kotlin.reflect.jvm.internal.impl.load.kotlin.l lVar3 = lVar2;
            k kVar2 = k.fin;
            k kVar3 = kVar2;
            v vVar5 = vVar;
            kotlin.jvm.internal.i.e(kVar2, "SignaturePropagator.DO_NOTHING");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.l lVar4 = i.eYV;
            kotlin.jvm.internal.i.e(gVar, "javaResolverCache");
            kotlin.reflect.jvm.internal.impl.load.java.components.f fVar2 = kotlin.reflect.jvm.internal.impl.load.java.components.f.a.fik;
            kotlin.reflect.jvm.internal.impl.load.java.components.j jVar = kotlin.reflect.jvm.internal.impl.load.java.components.j.a.fim;
            b bVar = l.eZd;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.j jVar2 = lVar;
            t tVar = kVar;
            am amVar = kotlin.reflect.jvm.internal.impl.descriptors.am.a.fcX;
            c cVar2 = kotlin.reflect.jvm.internal.impl.incremental.components.c.a.fgp;
            kotlin.reflect.jvm.internal.impl.builtins.h hVar2 = r0;
            kotlin.reflect.jvm.internal.impl.builtins.h hVar3 = new kotlin.reflect.jvm.internal.impl.builtins.h(vVar3, xVar);
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j jVar3 = r0;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j jVar4 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j(annotationTypeQualifierResolver2, kotlin.reflect.jvm.internal.impl.utils.e.fzW);
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.g(new kotlin.reflect.jvm.internal.impl.load.java.lazy.b(hVar, cVar, lVar3, dVar, kVar3, lVar4, gVar2, fVar2, jVar, bVar, jVar2, tVar, amVar, cVar2, vVar4, hVar2, annotationTypeQualifierResolver, jVar3, kotlin.reflect.jvm.internal.impl.load.java.i.a.fhd, kotlin.reflect.jvm.internal.impl.load.java.lazy.c.b.fiS));
            e eVar3 = eVar2;
            eVar3.a(vVar3, true);
            kotlin.reflect.jvm.internal.impl.resolve.jvm.b bVar2 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.b(gVar3, gVar);
            kotlin.reflect.jvm.internal.impl.load.kotlin.e eVar4 = new kotlin.reflect.jvm.internal.impl.load.kotlin.e(lVar2, dVar2);
            kotlin.reflect.jvm.internal.impl.load.kotlin.b bVar3 = new kotlin.reflect.jvm.internal.impl.load.kotlin.b(vVar3, xVar, lockBasedStorageManager, lVar2);
            kotlin.reflect.jvm.internal.impl.storage.h hVar4 = lockBasedStorageManager;
            x xVar2 = xVar;
            kotlin.reflect.jvm.internal.impl.load.kotlin.b bVar4 = bVar3;
            k kVar4 = kVar;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar4 = gVar3;
            l lVar5 = lVar;
            x xVar3 = xVar2;
            d dVar3 = dVar2;
            k kVar5 = kVar4;
            kotlin.reflect.jvm.internal.impl.load.kotlin.c cVar3 = r3;
            kotlin.reflect.jvm.internal.impl.load.kotlin.c cVar4 = new kotlin.reflect.jvm.internal.impl.load.kotlin.c(hVar4, vVar3, kotlin.reflect.jvm.internal.impl.serialization.deserialization.i.a.fvo, eVar4, bVar4, gVar4, xVar3, i.eYV, kotlin.reflect.jvm.internal.impl.incremental.components.c.a.fgp, kotlin.reflect.jvm.internal.impl.serialization.deserialization.g.fuZ.bNW());
            lVar5.a(bVar2);
            dVar3.a(cVar3);
            v[] vVarArr = new v[2];
            vVarArr[0] = vVar5;
            v bqA = eVar3.bqA();
            kotlin.jvm.internal.i.e(bqA, "builtIns.builtInsModule");
            vVarArr[1] = bqA;
            bqA = vVar5;
            bqA.a(vVarArr);
            bqA.a((z) bVar2.bNl());
            return new j(cVar3.bys(), kVar5, null);
        }
    }

    private j(h hVar, k kVar) {
        this.eYW = hVar;
        this.eYX = kVar;
    }

    public /* synthetic */ j(h hVar, k kVar, f fVar) {
        this(hVar, kVar);
    }

    public final h bqm() {
        return this.eYW;
    }

    public final k bqn() {
        return this.eYX;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.v bql() {
        return this.eYW.bNY();
    }
}
