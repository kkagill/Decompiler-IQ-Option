package kotlin.reflect.jvm.internal.components;

import java.util.Set;
import kotlin.i;
import kotlin.reflect.jvm.internal.impl.load.java.h;
import kotlin.reflect.jvm.internal.impl.load.java.h.a;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.t;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.structure.j;
import kotlin.reflect.jvm.internal.structure.u;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lkotlin/reflect/jvm/internal/components/ReflectJavaClassFinder;", "Lkotlin/reflect/jvm/internal/impl/load/java/JavaClassFinder;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "findClass", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "request", "Lkotlin/reflect/jvm/internal/impl/load/java/JavaClassFinder$Request;", "findPackage", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaPackage;", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "knownClassNamesInPackage", "", "", "packageFqName", "descriptors.runtime"})
/* compiled from: ReflectJavaClassFinder.kt */
public final class c implements h {
    private final ClassLoader eYQ;

    public Set<String> b(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "packageFqName");
        return null;
    }

    public c(ClassLoader classLoader) {
        kotlin.jvm.internal.i.f(classLoader, "classLoader");
        this.eYQ = classLoader;
    }

    public g a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "request");
        kotlin.reflect.jvm.internal.impl.name.a classId = aVar.getClassId();
        b packageFqName = classId.getPackageFqName();
        kotlin.jvm.internal.i.e(packageFqName, "classId.packageFqName");
        String boi = classId.bJU().boi();
        kotlin.jvm.internal.i.e(boi, "classId.relativeClassName.asString()");
        String a = u.a(boi, '.', '$', false, 4, null);
        if (!packageFqName.isRoot()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(packageFqName.boi());
            stringBuilder.append(".");
            stringBuilder.append(a);
            a = stringBuilder.toString();
        }
        Class a2 = d.a(this.eYQ, a);
        return a2 != null ? new j(a2) : null;
    }

    public t a(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "fqName");
        return new u(bVar);
    }
}
