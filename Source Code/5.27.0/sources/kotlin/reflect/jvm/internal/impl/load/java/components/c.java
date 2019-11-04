package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Map;
import kotlin.j;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.reflect.jvm.internal.impl.load.java.structure.d;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: JavaAnnotationMapper.kt */
public final class c {
    private static final b fhS = new b(Target.class.getCanonicalName());
    private static final b fhT = new b(Retention.class.getCanonicalName());
    private static final b fhU = new b(Deprecated.class.getCanonicalName());
    private static final b fhV = new b(Documented.class.getCanonicalName());
    private static final b fhW = new b("java.lang.annotation.Repeatable");
    private static final f fhX;
    private static final f fhY;
    private static final f fhZ;
    private static final Map<b, b> fia = af.a(j.x(g.eZA.fag, fhS), j.x(g.eZA.faj, fhT), j.x(g.eZA.fak, fhW), j.x(g.eZA.fal, fhV));
    private static final Map<b, b> fib = af.a(j.x(fhS, g.eZA.fag), j.x(fhT, g.eZA.faj), j.x(fhU, g.eZA.faa), j.x(fhW, g.eZA.fak), j.x(fhV, g.eZA.fal));
    public static final c fic = new c();

    static {
        f ms = f.ms("message");
        i.e(ms, "Name.identifier(\"message\")");
        fhX = ms;
        ms = f.ms("allowedTargets");
        i.e(ms, "Name.identifier(\"allowedTargets\")");
        fhY = ms;
        ms = f.ms(ConditionalUserProperty.VALUE);
        i.e(ms, "Name.identifier(\"value\")");
        fhZ = ms;
    }

    private c() {
    }

    public final f bvK() {
        return fhX;
    }

    public final f bvL() {
        return fhY;
    }

    public final f bvM() {
        return fhZ;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(a aVar, h hVar) {
        i.f(aVar, "annotation");
        i.f(hVar, "c");
        kotlin.reflect.jvm.internal.impl.name.a classId = aVar.getClassId();
        if (i.y(classId, kotlin.reflect.jvm.internal.impl.name.a.s(fhS))) {
            return new i(aVar, hVar);
        }
        if (i.y(classId, kotlin.reflect.jvm.internal.impl.name.a.s(fhT))) {
            return new h(aVar, hVar);
        }
        b bVar;
        if (i.y(classId, kotlin.reflect.jvm.internal.impl.name.a.s(fhW))) {
            bVar = g.eZA.fak;
            i.e(bVar, "KotlinBuiltIns.FQ_NAMES.repeatable");
            return new b(hVar, aVar, bVar);
        } else if (i.y(classId, kotlin.reflect.jvm.internal.impl.name.a.s(fhV))) {
            bVar = g.eZA.fal;
            i.e(bVar, "KotlinBuiltIns.FQ_NAMES.mustBeDocumented");
            return new b(hVar, aVar, bVar);
        } else if (i.y(classId, kotlin.reflect.jvm.internal.impl.name.a.s(fhU))) {
            return null;
        } else {
            return new e(hVar, aVar);
        }
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(b bVar, d dVar, h hVar) {
        i.f(bVar, "kotlinName");
        i.f(dVar, "annotationOwner");
        i.f(hVar, "c");
        if (i.y(bVar, g.eZA.faa)) {
            a q = dVar.q(fhU);
            if (q != null || dVar.bxi()) {
                return new e(q, hVar);
            }
        }
        bVar = (b) fia.get(bVar);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar = null;
        if (bVar != null) {
            a q2 = dVar.q(bVar);
            if (q2 != null) {
                cVar = fic.a(q2, hVar);
            }
        }
        return cVar;
    }
}
