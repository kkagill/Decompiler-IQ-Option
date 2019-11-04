package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;

/* compiled from: JavaAnnotationMapper.kt */
public final class e extends b {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    private final kotlin.reflect.jvm.internal.impl.storage.e fii;

    public Map<f, g<?>> buf() {
        return (Map) kotlin.reflect.jvm.internal.impl.storage.g.a(this.fii, (Object) this, anY[0]);
    }

    public e(a aVar, h hVar) {
        i.f(hVar, "c");
        b bVar = kotlin.reflect.jvm.internal.impl.builtins.g.eZA.faa;
        i.e(bVar, "KotlinBuiltIns.FQ_NAMES.deprecated");
        super(hVar, aVar, bVar);
        this.fii = hVar.bqz().f(JavaDeprecatedAnnotationDescriptor$allValueArguments$2.fij);
    }
}
