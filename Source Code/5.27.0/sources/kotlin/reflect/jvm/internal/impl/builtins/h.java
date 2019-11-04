package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.types.ah;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: ReflectionTypes.kt */
public final class h {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(h.class), "kotlinReflectScope", "getKotlinReflectScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), k.a(new PropertyReference1Impl(k.G(h.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k.a(new PropertyReference1Impl(k.G(h.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k.a(new PropertyReference1Impl(k.G(h.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k.a(new PropertyReference1Impl(k.G(h.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k.a(new PropertyReference1Impl(k.G(h.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k.a(new PropertyReference1Impl(k.G(h.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k.a(new PropertyReference1Impl(k.G(h.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    public static final b fbn = new b();
    private final d fbe;
    private final a fbf = new a(1);
    private final a fbg = new a(1);
    private final a fbh = new a(2);
    private final a fbi = new a(3);
    private final a fbj = new a(1);
    private final a fbk = new a(2);
    private final a fbl = new a(3);
    private final x fbm;

    /* compiled from: ReflectionTypes.kt */
    private static final class a {
        private final int fbo;

        public a(int i) {
            this.fbo = i;
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.d a(h hVar, j<?> jVar) {
            i.f(hVar, "types");
            i.f(jVar, "property");
            return hVar.S(u.mY(jVar.getName()), this.fbo);
        }
    }

    /* compiled from: ReflectionTypes.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final w a(v vVar) {
            i.f(vVar, "module");
            kotlin.reflect.jvm.internal.impl.name.a aVar = g.eZA.faO;
            i.e(aVar, "KotlinBuiltIns.FQ_NAMES.kProperty");
            kotlin.reflect.jvm.internal.impl.descriptors.d a = r.a(vVar, aVar);
            if (a == null) {
                return null;
            }
            f bug = f.fdA.bug();
            an brm = a.brm();
            i.e(brm, "kPropertyClass.typeConstructor");
            List parameters = brm.getParameters();
            i.e(parameters, "kPropertyClass.typeConstructor.parameters");
            Object bY = u.bY(parameters);
            i.e(bY, "kPropertyClass.typeConstructor.parameters.single()");
            return kotlin.reflect.jvm.internal.impl.types.x.a(bug, a, l.listOf(new ah((ao) bY)));
        }
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h brb() {
        d dVar = this.fbe;
        j jVar = anY[0];
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h) dVar.getValue();
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.d bqI() {
        return this.fbf.a(this, anY[1]);
    }

    public h(v vVar, x xVar) {
        i.f(vVar, "module");
        i.f(xVar, "notFoundClasses");
        this.fbm = xVar;
        this.fbe = g.a(LazyThreadSafetyMode.PUBLICATION, new ReflectionTypes$kotlinReflectScope$2(vVar));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d S(String str, int i) {
        kotlin.reflect.jvm.internal.impl.name.f ms = kotlin.reflect.jvm.internal.impl.name.f.ms(str);
        i.e(ms, "Name.identifier(className)");
        kotlin.reflect.jvm.internal.impl.descriptors.f c = brb().c(ms, NoLookupLocation.FROM_REFLECTION);
        if (!(c instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
            c = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) c;
        return dVar != null ? dVar : this.fbm.a(new kotlin.reflect.jvm.internal.impl.name.a(i.brd(), ms), l.listOf(Integer.valueOf(i)));
    }
}
