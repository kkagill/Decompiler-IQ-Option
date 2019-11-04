package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.reflect.jvm.internal.impl.load.java.structure.d;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.storage.c;
import kotlin.sequences.h;

/* compiled from: LazyJavaAnnotations.kt */
public final class e implements f {
    private final c<a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> fiU = this.fiV.bwl().bqz().r(new LazyJavaAnnotations$annotationDescriptors$1(this));
    private final h fiV;
    private final d fiW;

    public e(h hVar, d dVar) {
        i.f(hVar, "c");
        i.f(dVar, "annotationOwner");
        this.fiV = hVar;
        this.fiW = dVar;
    }

    public boolean j(b bVar) {
        i.f(bVar, "fqName");
        return f.b.b(this, bVar);
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c i(b bVar) {
        i.f(bVar, "fqName");
        a q = this.fiW.q(bVar);
        if (q != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) this.fiU.invoke(q);
            if (cVar != null) {
                return cVar;
            }
        }
        return kotlin.reflect.jvm.internal.impl.load.java.components.c.fic.a(bVar, this.fiW, this.fiV);
    }

    public Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        h f = n.f(u.Z(this.fiW.getAnnotations()), this.fiU);
        kotlin.reflect.jvm.internal.impl.load.java.components.c cVar = kotlin.reflect.jvm.internal.impl.load.java.components.c.fic;
        b bVar = g.eZA.faa;
        i.e(bVar, "KotlinBuiltIns.FQ_NAMES.deprecated");
        return n.e(n.a(f, (Object) cVar.a(bVar, this.fiW, this.fiV))).iterator();
    }

    public boolean isEmpty() {
        return this.fiW.getAnnotations().isEmpty() && !this.fiW.bxi();
    }
}
