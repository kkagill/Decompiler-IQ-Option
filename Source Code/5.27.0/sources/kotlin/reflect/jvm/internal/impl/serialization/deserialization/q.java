package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.metadata.a.c;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: NameResolverUtil.kt */
public final class q {
    public static final a a(c cVar, int i) {
        i.f(cVar, "$this$getClassId");
        a B = a.B(cVar.lD(i), cVar.lE(i));
        i.e(B, "ClassId.fromString(getQu… isLocalClassName(index))");
        return B;
    }

    public static final f b(c cVar, int i) {
        i.f(cVar, "$this$getName");
        f mv = f.mv(cVar.getString(i));
        i.e(mv, "Name.guessByFirstCharacter(getString(index))");
        return mv;
    }
}
