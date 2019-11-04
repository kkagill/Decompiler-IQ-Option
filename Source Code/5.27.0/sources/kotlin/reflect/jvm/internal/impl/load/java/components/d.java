package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.j;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.structure.b;
import kotlin.reflect.jvm.internal.impl.load.java.structure.m;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;

/* compiled from: JavaAnnotationMapper.kt */
public final class d {
    private static final Map<String, EnumSet<KotlinTarget>> fie;
    private static final Map<String, KotlinRetention> fif;
    public static final d fig = new d();

    static {
        r0 = new Pair[10];
        r0[0] = j.x("PACKAGE", EnumSet.noneOf(KotlinTarget.class));
        r0[1] = j.x("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE));
        r0[2] = j.x("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS));
        r0[3] = j.x("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER));
        r0[4] = j.x("FIELD", EnumSet.of(KotlinTarget.FIELD));
        r0[5] = j.x("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE));
        r0[6] = j.x("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER));
        r0[7] = j.x("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR));
        r0[8] = j.x("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER));
        r0[9] = j.x("TYPE_USE", EnumSet.of(KotlinTarget.TYPE));
        fie = af.a(r0);
        r0 = new Pair[3];
        r0[0] = j.x("RUNTIME", KotlinRetention.RUNTIME);
        r0[1] = j.x("CLASS", KotlinRetention.BINARY);
        r0[2] = j.x("SOURCE", KotlinRetention.SOURCE);
        fif = af.a(r0);
    }

    private d() {
    }

    public final Set<KotlinTarget> me(String str) {
        EnumSet enumSet = (EnumSet) fie.get(str);
        return enumSet != null ? enumSet : al.emptySet();
    }

    public final g<?> ch(List<? extends b> list) {
        f bxy;
        i.f(list, "arguments");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof m) {
                arrayList.add(next);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (m mVar : (List) arrayList) {
            d dVar = fig;
            bxy = mVar.bxy();
            r.a(arrayList2, (Iterable) dVar.me(bxy != null ? bxy.boi() : null));
        }
        Iterable<KotlinTarget> iterable = (List) arrayList2;
        arrayList = new ArrayList(n.e(iterable, 10));
        for (KotlinTarget kotlinTarget : iterable) {
            a s = a.s(kotlin.reflect.jvm.internal.impl.builtins.g.eZA.fah);
            i.e(s, "ClassId.topLevel(KotlinB…Q_NAMES.annotationTarget)");
            bxy = f.ms(kotlinTarget.name());
            i.e(bxy, "Name.identifier(kotlinTarget.name)");
            arrayList.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.j(s, bxy));
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.b((List) arrayList, JavaAnnotationTargetMapper$mapJavaTargetArguments$1.fih);
    }

    public final g<?> a(b bVar) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.j jVar = null;
        if (!(bVar instanceof m)) {
            bVar = null;
        }
        m mVar = (m) bVar;
        if (mVar != null) {
            Map map = fif;
            f bxy = mVar.bxy();
            KotlinRetention kotlinRetention = (KotlinRetention) map.get(bxy != null ? bxy.boi() : null);
            if (kotlinRetention != null) {
                a s = a.s(kotlin.reflect.jvm.internal.impl.builtins.g.eZA.fai);
                i.e(s, "ClassId.topLevel(KotlinB…AMES.annotationRetention)");
                bxy = f.ms(kotlinRetention.name());
                i.e(bxy, "Name.identifier(retention.name)");
                jVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.j(s, bxy);
            }
        }
        return jVar;
    }
}
