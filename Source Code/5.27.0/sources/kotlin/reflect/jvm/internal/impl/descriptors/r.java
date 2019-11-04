package kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: findClassInModule.kt */
public final class r {
    public static final d a(v vVar, a aVar) {
        i.f(vVar, "$this$findClassAcrossModuleDependencies");
        i.f(aVar, "classId");
        b packageFqName = aVar.getPackageFqName();
        i.e(packageFqName, "classId.packageFqName");
        aa f = vVar.f(packageFqName);
        List pathSegments = aVar.bJU().pathSegments();
        i.e(pathSegments, "classId.relativeClassName.pathSegments()");
        h bsF = f.bsF();
        Object bU = u.bU(pathSegments);
        i.e(bU, "segments.first()");
        f c = bsF.c((f) bU, NoLookupLocation.FROM_DESERIALIZATION);
        if (!(c instanceof d)) {
            c = null;
        }
        d dVar = (d) c;
        if (dVar == null) {
            return null;
        }
        for (f fVar : pathSegments.subList(1, pathSegments.size())) {
            bsF = dVar.btd();
            i.e(fVar, ConditionalUserProperty.NAME);
            c = bsF.c(fVar, NoLookupLocation.FROM_DESERIALIZATION);
            if (!(c instanceof d)) {
                c = null;
            }
            dVar = (d) c;
            if (dVar == null) {
                return null;
            }
        }
        return dVar;
    }

    public static final d a(v vVar, a aVar, x xVar) {
        i.f(vVar, "$this$findNonGenericClassAcrossDependencies");
        i.f(aVar, "classId");
        i.f(xVar, "notFoundClasses");
        d a = a(vVar, aVar);
        if (a != null) {
            return a;
        }
        return xVar.a(aVar, n.f(n.f(l.a((Object) aVar, (kotlin.jvm.a.b) FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1.fcK), FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2.fcL)));
    }

    public static final an b(v vVar, a aVar) {
        i.f(vVar, "$this$findTypeAliasAcrossModuleDependencies");
        i.f(aVar, "classId");
        b packageFqName = aVar.getPackageFqName();
        i.e(packageFqName, "classId.packageFqName");
        aa f = vVar.f(packageFqName);
        List pathSegments = aVar.bJU().pathSegments();
        i.e(pathSegments, "classId.relativeClassName.pathSegments()");
        int size = pathSegments.size() - 1;
        h bsF = f.bsF();
        Object bU = u.bU(pathSegments);
        i.e(bU, "segments.first()");
        f c = bsF.c((f) bU, NoLookupLocation.FROM_DESERIALIZATION);
        if (size == 0) {
            if (!(c instanceof an)) {
                c = null;
            }
            return (an) c;
        }
        if (!(c instanceof d)) {
            c = null;
        }
        d dVar = (d) c;
        if (dVar == null) {
            return null;
        }
        for (f fVar : pathSegments.subList(1, size)) {
            bsF = dVar.btd();
            i.e(fVar, ConditionalUserProperty.NAME);
            c = bsF.c(fVar, NoLookupLocation.FROM_DESERIALIZATION);
            if (!(c instanceof d)) {
                c = null;
            }
            dVar = (d) c;
            if (dVar == null) {
                return null;
            }
        }
        f fVar2 = (f) pathSegments.get(size);
        bsF = dVar.bro();
        i.e(fVar2, "lastName");
        c = bsF.c(fVar2, NoLookupLocation.FROM_DESERIALIZATION);
        if (!(c instanceof an)) {
            c = null;
        }
        return (an) c;
    }
}
