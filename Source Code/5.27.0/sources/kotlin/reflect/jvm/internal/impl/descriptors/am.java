package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.i;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: SupertypeLoopChecker.kt */
public interface am {

    /* compiled from: SupertypeLoopChecker.kt */
    public static final class a implements am {
        public static final a fcX = new a();

        public Collection<w> a(an anVar, Collection<? extends w> collection, b<? super an, ? extends Iterable<? extends w>> bVar, b<? super w, l> bVar2) {
            i.f(anVar, "currentTypeConstructor");
            i.f(collection, "superTypes");
            i.f(bVar, "neighbors");
            i.f(bVar2, "reportLoop");
            return collection;
        }

        private a() {
        }
    }

    Collection<w> a(an anVar, Collection<? extends w> collection, b<? super an, ? extends Iterable<? extends w>> bVar, b<? super w, l> bVar2);
}
