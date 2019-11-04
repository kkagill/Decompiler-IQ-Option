package kotlin.reflect.jvm.internal.components;

import kotlin.i;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.l.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.l.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClassFinder;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinClassFinder;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "findBuiltInsData", "Ljava/io/InputStream;", "packageFqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "findKotlinClass", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinClassFinder$Result;", "fqName", "", "findKotlinClassOrContent", "javaClass", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "findMetadata", "hasMetadataPackage", "", "descriptors.runtime"})
/* compiled from: ReflectKotlinClassFinder.kt */
public final class f implements l {
    private final ClassLoader eYQ;

    public f(ClassLoader classLoader) {
        kotlin.jvm.internal.i.f(classLoader, "classLoader");
        this.eYQ = classLoader;
    }

    private final a lN(String str) {
        b bVar;
        Class a = d.a(this.eYQ, str);
        if (a != null) {
            e O = e.eYT.O(a);
            if (O != null) {
                bVar = new b(O);
                return bVar;
            }
        }
        bVar = null;
        return bVar;
    }

    public a a(kotlin.reflect.jvm.internal.impl.name.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "classId");
        return lN(g.b(aVar));
    }

    public a a(g gVar) {
        kotlin.jvm.internal.i.f(gVar, "javaClass");
        kotlin.reflect.jvm.internal.impl.name.b btB = gVar.btB();
        if (btB != null) {
            String boi = btB.boi();
            if (boi != null) {
                return lN(boi);
            }
        }
        return null;
    }
}
