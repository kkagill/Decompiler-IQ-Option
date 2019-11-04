package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: TypeIntersectionScope.kt */
public final class m extends a {
    public static final a fuJ = new a();
    private final b fuI;

    /* compiled from: TypeIntersectionScope.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final h a(String str, Collection<? extends w> collection) {
            i.f(str, "message");
            i.f(collection, "types");
            Iterable<w> iterable = collection;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (w bsF : iterable) {
                arrayList.add(bsF.bsF());
            }
            b bVar = new b(str, (List) arrayList);
            if (collection.size() <= 1) {
                return bVar;
            }
            return new m(bVar, null);
        }
    }

    public static final h a(String str, Collection<? extends w> collection) {
        return fuJ.a(str, collection);
    }

    private m(b bVar) {
        this.fuI = bVar;
    }

    public /* synthetic */ m(b bVar, f fVar) {
        this(bVar);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bNP */
    public b bNn() {
        return this.fuI;
    }

    public Collection<ai> b(f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        return kotlin.reflect.jvm.internal.impl.resolve.i.b(super.b(fVar, bVar), TypeIntersectionScope$getContributedFunctions$1.fuL);
    }

    public Collection<ae> a(f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        return kotlin.reflect.jvm.internal.impl.resolve.i.b(super.a(fVar, bVar), TypeIntersectionScope$getContributedVariables$1.fuM);
    }

    public Collection<k> a(d dVar, kotlin.jvm.a.b<? super f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        i.f(bVar, "nameFilter");
        Iterable a = super.a(dVar, (kotlin.jvm.a.b) bVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : a) {
            if (((k) next) instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.bnj();
        List list2 = (List) pair.bnk();
        if (list != null) {
            return u.b(kotlin.reflect.jvm.internal.impl.resolve.i.b(list, TypeIntersectionScope$getContributedDescriptors$2.fuK), (Iterable) list2);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
    }
}
