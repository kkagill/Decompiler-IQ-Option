package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.am;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: AbstractTypeConstructor.kt */
public abstract class c implements an {
    private final e<a> fwJ;

    /* compiled from: AbstractTypeConstructor.kt */
    private static final class a {
        private List<? extends w> fwK = l.listOf(p.fwV);
        private final Collection<w> fwL;

        public a(Collection<? extends w> collection) {
            i.f(collection, "allSupertypes");
            this.fwL = collection;
        }

        public final Collection<w> bPj() {
            return this.fwL;
        }

        public final List<w> bPi() {
            return this.fwK;
        }

        public final void cm(List<? extends w> list) {
            i.f(list, "<set-?>");
            this.fwK = list;
        }
    }

    /* Access modifiers changed, original: protected */
    public void P(w wVar) {
        i.f(wVar, "type");
    }

    /* Access modifiers changed, original: protected */
    public void aA(w wVar) {
        i.f(wVar, "type");
    }

    public abstract Collection<w> brO();

    public abstract am brT();

    /* Access modifiers changed, original: protected */
    public w bus() {
        return null;
    }

    public c(h hVar) {
        i.f(hVar, "storageManager");
        this.fwJ = hVar.a(new AbstractTypeConstructor$supertypes$1(this), AbstractTypeConstructor$supertypes$2.fwM, new AbstractTypeConstructor$supertypes$3(this));
    }

    /* renamed from: bPh */
    public List<w> bup() {
        return ((a) this.fwJ.invoke()).bPi();
    }

    private final Collection<w> a(an anVar, boolean z) {
        c cVar = (c) (!(anVar instanceof c) ? null : anVar);
        if (cVar != null) {
            List b = u.b(((a) cVar.fwJ.invoke()).bPj(), (Iterable) cVar.hc(z));
            if (b != null) {
                return b;
            }
        }
        Collection bup = anVar.bup();
        i.e(bup, "supertypes");
        return bup;
    }

    /* Access modifiers changed, original: protected */
    public Collection<w> hc(boolean z) {
        return m.emptyList();
    }
}
