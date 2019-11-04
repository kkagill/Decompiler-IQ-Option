package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import kotlin.i;
import kotlin.reflect.jvm.internal.pcollections.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0005\u001a\u00020\u0006H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bH\u0000\"*\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0001X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/pcollections/HashPMap;", "", "kotlin.jvm.PlatformType", "", "clearKClassCache", "", "getOrCreateKotlinClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "jClass", "Ljava/lang/Class;", "kotlin-reflect-api"})
/* compiled from: kClassCache.kt */
public final class f {
    private static b<String, Object> eWV;

    static {
        b bQi = b.bQi();
        kotlin.jvm.internal.i.e(bQi, "HashPMap.empty<String, Any>()");
        eWV = bQi;
    }

    public static final <T> g<T> I(Class<T> cls) {
        g gVar;
        b D;
        kotlin.jvm.internal.i.f(cls, "jClass");
        String name = cls.getName();
        Object obj = eWV.get(name);
        Object obj2 = null;
        if (obj instanceof WeakReference) {
            gVar = (g) ((WeakReference) obj).get();
            if (gVar != null) {
                obj2 = gVar.bnC();
            }
            if (kotlin.jvm.internal.i.y(obj2, cls)) {
                return gVar;
            }
        } else if (obj != null) {
            for (WeakReference weakReference : (WeakReference[]) obj) {
                g gVar2 = (g) weakReference.get();
                if (kotlin.jvm.internal.i.y(gVar2 != null ? gVar2.bnC() : null, cls)) {
                    return gVar2;
                }
            }
            int length = ((Object[]) obj).length;
            WeakReference[] weakReferenceArr = new WeakReference[(length + 1)];
            System.arraycopy(obj, 0, weakReferenceArr, 0, length);
            gVar = new g(cls);
            weakReferenceArr[length] = new WeakReference(gVar);
            D = eWV.D(name, weakReferenceArr);
            kotlin.jvm.internal.i.e(D, "K_CLASS_CACHE.plus(name, newArray)");
            eWV = D;
            return gVar;
        }
        gVar = new g(cls);
        D = eWV.D(name, new WeakReference(gVar));
        kotlin.jvm.internal.i.e(D, "K_CLASS_CACHE.plus(name, WeakReference(newKClass))");
        eWV = D;
        return gVar;
    }
}
