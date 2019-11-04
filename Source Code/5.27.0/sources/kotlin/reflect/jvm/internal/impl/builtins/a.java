package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.a.b;
import kotlin.reflect.jvm.internal.impl.descriptors.a.c;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: BuiltInsLoader.kt */
public interface a {
    public static final a eZg = a.eZi;

    /* compiled from: BuiltInsLoader.kt */
    public static final class a {
        static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "Instance", "getInstance()Lorg/jetbrains/kotlin/builtins/BuiltInsLoader;"))};
        private static final d eZh = g.a(LazyThreadSafetyMode.PUBLICATION, BuiltInsLoader$Companion$Instance$2.eZj);
        static final /* synthetic */ a eZi = new a();

        public final a bqr() {
            d dVar = eZh;
            j jVar = anY[0];
            return (a) dVar.getValue();
        }

        private a() {
        }
    }

    z a(h hVar, v vVar, Iterable<? extends b> iterable, c cVar, kotlin.reflect.jvm.internal.impl.descriptors.a.a aVar);
}
