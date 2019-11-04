package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.storage.e;

/* compiled from: JavaAnnotationMapper.kt */
public final class h extends b {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    private final e fii;

    public Map<f, g<?>> buf() {
        return (Map) kotlin.reflect.jvm.internal.impl.storage.g.a(this.fii, (Object) this, anY[0]);
    }

    public h(a aVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar) {
        i.f(aVar, "annotation");
        i.f(hVar, "c");
        b bVar = kotlin.reflect.jvm.internal.impl.builtins.g.eZA.faj;
        i.e(bVar, "KotlinBuiltIns.FQ_NAMES.retention");
        super(hVar, aVar, bVar);
        this.fii = hVar.bqz().f(new JavaRetentionAnnotationDescriptor$allValueArguments$2(this));
    }
}
