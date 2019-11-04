package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.v;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
final class JvmBuiltInClassDescriptorFactory$1 extends Lambda implements b<v, kotlin.reflect.jvm.internal.impl.builtins.b> {
    public static final JvmBuiltInClassDescriptorFactory$1 fcl = new JvmBuiltInClassDescriptorFactory$1();

    JvmBuiltInClassDescriptorFactory$1() {
        super(1);
    }

    /* renamed from: b */
    public final kotlin.reflect.jvm.internal.impl.builtins.b invoke(v vVar) {
        i.f(vVar, "module");
        kotlin.reflect.jvm.internal.impl.name.b bsj = d.fch;
        i.e(bsj, "KOTLIN_FQ_NAME");
        Iterable fragments = vVar.f(bsj).getFragments();
        Collection arrayList = new ArrayList();
        for (Object next : fragments) {
            if (next instanceof kotlin.reflect.jvm.internal.impl.builtins.b) {
                arrayList.add(next);
            }
        }
        return (kotlin.reflect.jvm.internal.impl.builtins.b) u.bU((List) arrayList);
    }
}
