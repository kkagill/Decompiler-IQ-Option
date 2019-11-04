package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.storage.g;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: StaticScopeForKotlinEnum.kt */
public final class k extends i {
    static final /* synthetic */ j[] anY = new j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(k.class), "functions", "getFunctions()Ljava/util/List;"))};
    private final e fuE;
    private final d fuw;

    private final List<ai> bNN() {
        return (List) g.a(this.fuE, (Object) this, anY[0]);
    }

    public Void f(f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        return null;
    }

    public /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f c(f fVar, b bVar) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.f) f(fVar, bVar);
    }

    public k(h hVar, d dVar) {
        i.f(hVar, "storageManager");
        i.f(dVar, "containingClass");
        this.fuw = dVar;
        Object obj = this.fuw.brt() == ClassKind.ENUM_CLASS ? 1 : null;
        if (m.eVC && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Class should be an enum: ");
            stringBuilder.append(this.fuw);
            throw new AssertionError(stringBuilder.toString());
        }
        this.fuE = hVar.f(new StaticScopeForKotlinEnum$functions$2(this));
    }

    /* renamed from: f */
    public List<ai> a(d dVar, kotlin.jvm.a.b<? super f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        i.f(bVar, "nameFilter");
        return bNN();
    }

    /* renamed from: g */
    public ArrayList<ai> b(f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        Collection arrayList = new ArrayList(1);
        for (Object next : bNN()) {
            if (i.y(((ai) next).bsZ(), fVar)) {
                arrayList.add(next);
            }
        }
        return (ArrayList) arrayList;
    }
}
