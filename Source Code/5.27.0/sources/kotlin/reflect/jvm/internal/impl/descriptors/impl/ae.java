package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.aa;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.i;
import kotlin.reflect.jvm.internal.impl.utils.a;

/* compiled from: SubpackagesScope.kt */
public class ae extends i {
    private final v fcf;
    private final b fdF;

    public ae(v vVar, b bVar) {
        kotlin.jvm.internal.i.f(vVar, "moduleDescriptor");
        kotlin.jvm.internal.i.f(bVar, "fqName");
        this.fcf = vVar;
        this.fdF = bVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final aa j(f fVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        if (fVar.bKh()) {
            return null;
        }
        v vVar = this.fcf;
        b C = this.fdF.C(fVar);
        kotlin.jvm.internal.i.e(C, "fqName.child(name)");
        aa f = vVar.f(C);
        if (f.isEmpty()) {
            return null;
        }
        return f;
    }

    public Collection<k> a(d dVar, kotlin.jvm.a.b<? super f, Boolean> bVar) {
        kotlin.jvm.internal.i.f(dVar, "kindFilter");
        kotlin.jvm.internal.i.f(bVar, "nameFilter");
        if (!dVar.mr(d.fuu.bNE())) {
            return m.emptyList();
        }
        if (this.fdF.isRoot() && dVar.bNq().contains(c.b.ftU)) {
            return m.emptyList();
        }
        Collection<b> a = this.fcf.a(this.fdF, bVar);
        ArrayList arrayList = new ArrayList(a.size());
        for (b bKc : a) {
            f bKc2 = bKc.bKc();
            kotlin.jvm.internal.i.e(bKc2, "subFqName.shortName()");
            if (((Boolean) bVar.invoke(bKc2)).booleanValue()) {
                a.j(arrayList, j(bKc2));
            }
        }
        return arrayList;
    }
}
