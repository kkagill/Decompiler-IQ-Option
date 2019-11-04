package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;

/* compiled from: Annotations.kt */
public interface f extends Iterable<c>, kotlin.jvm.internal.a.a {
    public static final a fdA = a.fdC;

    /* compiled from: Annotations.kt */
    public static final class a {
        private static final f fdB = new a();
        static final /* synthetic */ a fdC = new a();

        /* compiled from: Annotations.kt */
        public static final class a implements f {
            public boolean isEmpty() {
                return true;
            }

            public Void k(kotlin.reflect.jvm.internal.impl.name.b bVar) {
                i.f(bVar, "fqName");
                return null;
            }

            public String toString() {
                return "EMPTY";
            }

            a() {
            }

            public /* synthetic */ c i(kotlin.reflect.jvm.internal.impl.name.b bVar) {
                return (c) k(bVar);
            }

            public boolean j(kotlin.reflect.jvm.internal.impl.name.b bVar) {
                i.f(bVar, "fqName");
                return b.b(this, bVar);
            }

            public Iterator<c> iterator() {
                return m.emptyList().iterator();
            }
        }

        private a() {
        }

        public final f bug() {
            return fdB;
        }

        public final f cc(List<? extends c> list) {
            i.f(list, "annotations");
            return list.isEmpty() ? fdB : new g(list);
        }
    }

    /* compiled from: Annotations.kt */
    public static final class b {
        public static c a(f fVar, kotlin.reflect.jvm.internal.impl.name.b bVar) {
            i.f(bVar, "fqName");
            for (Object next : fVar) {
                if (i.y(((c) next).btB(), bVar)) {
                    break;
                }
            }
            Object next2 = null;
            return (c) next2;
        }

        public static boolean b(f fVar, kotlin.reflect.jvm.internal.impl.name.b bVar) {
            i.f(bVar, "fqName");
            return fVar.i(bVar) != null;
        }
    }

    c i(kotlin.reflect.jvm.internal.impl.name.b bVar);

    boolean isEmpty();

    boolean j(kotlin.reflect.jvm.internal.impl.name.b bVar);
}
