package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.l;

/* compiled from: AbstractTypeConstructor.kt */
final class AbstractTypeConstructor$supertypes$3 extends Lambda implements b<a, l> {
    final /* synthetic */ c this$0;

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$2 */
    static final class AnonymousClass2 extends Lambda implements b<an, Collection<? extends w>> {
        final /* synthetic */ AbstractTypeConstructor$supertypes$3 this$0;

        AnonymousClass2(AbstractTypeConstructor$supertypes$3 abstractTypeConstructor$supertypes$3) {
            this.this$0 = abstractTypeConstructor$supertypes$3;
            super(1);
        }

        /* renamed from: c */
        public final Collection<w> invoke(an anVar) {
            i.f(anVar, "it");
            return this.this$0.this$0.a(anVar, true);
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$3 */
    static final class AnonymousClass3 extends Lambda implements b<w, l> {
        final /* synthetic */ AbstractTypeConstructor$supertypes$3 this$0;

        AnonymousClass3(AbstractTypeConstructor$supertypes$3 abstractTypeConstructor$supertypes$3) {
            this.this$0 = abstractTypeConstructor$supertypes$3;
            super(1);
        }

        public /* synthetic */ Object invoke(Object obj) {
            aB((w) obj);
            return l.eVB;
        }

        public final void aB(w wVar) {
            i.f(wVar, "it");
            this.this$0.this$0.aA(wVar);
        }
    }

    AbstractTypeConstructor$supertypes$3(c cVar) {
        this.this$0 = cVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        a((a) obj);
        return l.eVB;
    }

    public final void a(a aVar) {
        i.f(aVar, "supertypes");
        Collection a = this.this$0.brT().a(this.this$0, aVar.bPj(), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(this), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2(this));
        Collection collection = null;
        if (a.isEmpty()) {
            w bus = this.this$0.bus();
            List listOf = bus != null ? l.listOf(bus) : null;
            if (listOf == null) {
                listOf = m.emptyList();
            }
            a = listOf;
        }
        this.this$0.brT().a(this.this$0, a, new AnonymousClass2(this), new AnonymousClass3(this));
        if (a instanceof List) {
            collection = a;
        }
        List list = (List) collection;
        if (list == null) {
            list = u.T(a);
        }
        aVar.cm(list);
    }
}
