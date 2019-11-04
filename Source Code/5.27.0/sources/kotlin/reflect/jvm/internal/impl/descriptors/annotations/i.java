package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: BuiltInAnnotationDescriptor.kt */
public final class i implements c {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(i.class), "type", "getType()Lorg/jetbrains/kotlin/types/KotlinType;"))};
    private final d dxA = g.a(LazyThreadSafetyMode.PUBLICATION, new BuiltInAnnotationDescriptor$type$2(this));
    private final g fdE;
    private final b fdF;
    private final Map<f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> fdG;

    public w bpT() {
        d dVar = this.dxA;
        j jVar = anY[0];
        return (w) dVar.getValue();
    }

    public i(g gVar, b bVar, Map<f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map) {
        kotlin.jvm.internal.i.f(gVar, "builtIns");
        kotlin.jvm.internal.i.f(bVar, "fqName");
        kotlin.jvm.internal.i.f(map, "allValueArguments");
        this.fdE = gVar;
        this.fdF = bVar;
        this.fdG = map;
    }

    public b btB() {
        return this.fdF;
    }

    public Map<f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> buf() {
        return this.fdG;
    }

    public aj brF() {
        aj ajVar = aj.fcV;
        kotlin.jvm.internal.i.e(ajVar, "SourceElement.NO_SOURCE");
        return ajVar;
    }
}
