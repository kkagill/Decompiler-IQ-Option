package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.Pair;
import kotlin.j;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.t;

/* compiled from: annotationUtil.kt */
public final class e {
    private static final f fdv;
    private static final f fdw;
    private static final f fdx;
    private static final f fdy;
    private static final f fdz;

    public static /* synthetic */ c a(g gVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        return a(gVar, str, str2, str3);
    }

    public static final c a(g gVar, String str, String str2, String str3) {
        i.f(gVar, "$this$createDeprecatedAnnotation");
        i.f(str, "message");
        i.f(str2, "replaceWith");
        i.f(str3, "level");
        b bVar = g.eZA.fac;
        i.e(bVar, "KotlinBuiltIns.FQ_NAMES.replaceWith");
        i iVar = new i(gVar, bVar, af.a(j.x(fdy, new t(str2)), j.x(fdz, new kotlin.reflect.jvm.internal.impl.resolve.constants.b(m.emptyList(), new AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1(gVar)))));
        bVar = g.eZA.faa;
        i.e(bVar, "KotlinBuiltIns.FQ_NAMES.deprecated");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = j.x(fdv, new t(str));
        pairArr[1] = j.x(fdw, new a(iVar));
        f fVar = fdx;
        kotlin.reflect.jvm.internal.impl.name.a s = kotlin.reflect.jvm.internal.impl.name.a.s(g.eZA.fab);
        i.e(s, "ClassId.topLevel(KotlinB…Q_NAMES.deprecationLevel)");
        f ms = f.ms(str3);
        i.e(ms, "Name.identifier(level)");
        pairArr[2] = j.x(fVar, new kotlin.reflect.jvm.internal.impl.resolve.constants.j(s, ms));
        return new i(gVar, bVar, af.a(pairArr));
    }

    static {
        f ms = f.ms("message");
        i.e(ms, "Name.identifier(\"message\")");
        fdv = ms;
        ms = f.ms("replaceWith");
        i.e(ms, "Name.identifier(\"replaceWith\")");
        fdw = ms;
        ms = f.ms("level");
        i.e(ms, "Name.identifier(\"level\")");
        fdx = ms;
        ms = f.ms("expression");
        i.e(ms, "Name.identifier(\"expression\")");
        fdy = ms;
        ms = f.ms("imports");
        i.e(ms, "Name.identifier(\"imports\")");
        fdz = ms;
    }
}
